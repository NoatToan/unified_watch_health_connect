/***********************************************************************
 * Module:  IXmPlayerEventDispather.aidl
 * Author:  chadwii
 * Purpose: Defines the Interface IXmPlayerEventDispather
 ***********************************************************************/
package com.ximalaya.ting.android.opensdk.player.service;

import com.ximalaya.ting.android.opensdk.model.track.Track;

interface IXmCommonBusinessDispatcher
{
	
	String getDownloadPlayPath(in Track track);
    void isOldTrackDownload(in Track track);
    void closeApp();

    String oaid();

    String imei();

    String macAddress();

    String serial();
}