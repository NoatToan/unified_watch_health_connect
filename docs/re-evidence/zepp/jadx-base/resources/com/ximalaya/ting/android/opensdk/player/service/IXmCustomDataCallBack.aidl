package com.ximalaya.ting.android.opensdk.player.service;

interface IXmCustomDataCallBack
{
	void onSuccess(String content ,int type);
	void onError(String errorMessage);
}