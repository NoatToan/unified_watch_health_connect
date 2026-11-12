/***********************************************************************
 * Module:  IXmAdsEventDispatcher.aidl
 * Author:  chadwii
 * Purpose: Defines the Interface IXmAdsEventDispatcher
 ***********************************************************************/
package com.ximalaya.ting.android.opensdk.player.service;

import com.ximalaya.ting.android.opensdk.model.advertis.Advertis;
import com.ximalaya.ting.android.opensdk.model.advertis.AdvertisList;

interface IXmAdsEventDispatcher
{
	void onStartGetAdsInfo();
	
	void onGetAdsInfo(in AdvertisList ads);
	
	void onAdsStartBuffering();
	
	void onAdsStopBuffering();
	
	void onStartPlayAds(in Advertis ad, int position);
	
	void onCompletePlayAds();
	
	void onError(int what, int extra);
}