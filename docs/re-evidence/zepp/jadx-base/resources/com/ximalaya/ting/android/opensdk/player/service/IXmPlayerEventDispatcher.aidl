/***********************************************************************
 * Module:  IXmPlayerEventDispather.aidl
 * Author:  chadwii
 * Purpose: Defines the Interface IXmPlayerEventDispather
 ***********************************************************************/
package com.ximalaya.ting.android.opensdk.player.service;

import com.ximalaya.ting.android.opensdk.player.service.XmPlayerException;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.model.live.radio.Radio;

interface IXmPlayerEventDispatcher
{
	
	void onPlayStart();

	void onPlayPause();

	void onPlayStop();

	void onSoundPlayComplete();

	void onSoundPrepared();
	void onSoundSwitch(inout Track lastTrack, inout Track curTrack);
	//void onTrack2TrackSwitch(inout Track lastTrack, inout Track curTrack);
	//void onTrack2RadioSwitch(inout Track lastTrack, inout Radio curRadio);
	//void on2TrackSwitch(inout Track curTrack);
	//void onRadio2RadioSwitch(inout Radio lastRadio, inout Radio curRadio);
	//void onRadio2TrackSwitch(inout Radio lastRadio, inout Track curTrack);
	//void on2RadioSwitch(inout Radio curRadio);
	void onBufferingStart();
	
	void onBufferingStop();

	void onBufferProgress(int percent);

	void onPlayProgress(int currPos, int duration);

	void onError(inout XmPlayerException exception);

    void popAdTipDialog(inout Track curTrack,long unlockNums);
}