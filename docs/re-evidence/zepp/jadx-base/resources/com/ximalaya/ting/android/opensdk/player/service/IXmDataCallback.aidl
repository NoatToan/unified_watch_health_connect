package com.ximalaya.ting.android.opensdk.player.service;

import com.ximalaya.ting.android.opensdk.model.track.Track;

interface IXmDataCallback
{
	void onDataReady(in List<Track> list,boolean hasMorePage,boolean isNextPage);
	void onError(int code, String message,boolean isNextPage);
}
