/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component, useEffect, useState} from 'react';
import {
  View,
  StyleSheet,
  Button,
  Text
} from 'react-native';
import { NativeModules } from 'react-native';

const App = () => {
	const [first, setfirst] = useState('sss')
	const onPress = () => {
		const {LoadingOverlay} = NativeModules;
		console.log('test')
		LoadingOverlay.toggle();
		
	  };


	return ( 
		<View>
	<View><Button onPress={onPress} title='ttedsfsdf'/></View>
	<Text>{first}</Text>
	</View>
	)

}


const styles = StyleSheet.create({
  background: {
	backgroundColor: '#6ce6cb',
	flex: 1,
  },
});

export default App