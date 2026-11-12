package com.milink.sdk.client;

import android.content.Context;
import com.milink.sdk.cast.MiLinkDevice;

/* JADX INFO: loaded from: classes5.dex */
public interface IMiLinkCastClient {
    MiLinkDevice getConnectMiLinkDevice();

    long getDuration();

    long getProgress();

    float getRate();

    int getVolume();

    int init(MiLinkCastCallback miLinkCastCallback);

    boolean isAgreePrivacy(Context context);

    boolean isAuthDevice(String str);

    boolean isAuthDeviceConnecting();

    boolean isPrivateProtectMode(Context context);

    boolean isSmallWindowMode(Context context);

    boolean isVerifyCodeInputShown();

    int operatePhoto(String str, int i, int i2, int i3, int i4, int i5, int i6, float f);

    void release();

    int send(byte[] bArr);

    int setAgreePrivacy(Context context, boolean z);

    boolean setClickSource(int i);

    int setDataCallback(MiLinkDataCallback miLinkDataCallback);

    int setMediaCallback(MiLinkMediaCallback miLinkMediaCallback);

    int setPhotoSource(MiLinkPhotoSource miLinkPhotoSource);

    int setProgress(long j);

    int setRate(float f);

    int setVolume(int i);

    int showPhoto(String str);

    int showSlide(int i);

    int startConnect(MiLinkDevice miLinkDevice, int i);

    int startDiscovery(int i, MiLinkDeviceListener miLinkDeviceListener);

    int startPhotoShow();

    int startPlayAudio(String str, String str2, String str3, int i, double d);

    int startPlayVideo(String str, String str2, String str3, int i, double d);

    int startWithUI(int i);

    int stopConnect(int i);

    int stopDiscovery(int i);

    int stopPhotoShow();

    int stopPlay();

    boolean support(String str);
}
