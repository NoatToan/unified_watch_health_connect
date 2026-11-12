/***********************************************************************
 * Module:  IXmPlayerEventDispather.aidl
 * Author:  chadwii
 * Purpose: Defines the Interface IXmPlayerEventDispather
 ***********************************************************************/
package com.ximalaya.ting.android.opensdk.player.service;
import com.ximalaya.ting.android.opensdk.model.token.AccessToken;

interface IXmTokenInvalidForSDKCallBack
{
    AccessToken getTokenByRefreshSync();
    boolean getTokenByRefreshAsync();
    void tokenInvalid();
}