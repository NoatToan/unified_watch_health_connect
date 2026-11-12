package com.ximalaya.ting.android.opensdk.player.service;

interface IXmMainDataSupportDataCallback
{
	void onSuccess(String content ,int type ,long randomkey);
	void onError(String errorMessage,long randomkey);
}