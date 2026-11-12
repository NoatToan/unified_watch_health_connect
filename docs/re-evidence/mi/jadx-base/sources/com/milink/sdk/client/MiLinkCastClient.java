package com.milink.sdk.client;

import android.content.Context;
import android.os.Process;
import com.milink.sdk.cast.MiLinkDevice;
import com.milink.sdk.cast.v1.MiLinkCastClientV1;
import com.milink.sdk.cast.v2.MiLinkCastClientV2;
import com.milink.sdk.util.ApiUtils;

/* JADX INFO: loaded from: classes5.dex */
public class MiLinkCastClient implements IMiLinkCastClient {
    private static final String TAG = "MLC::MiLinkCastClient";
    public static int VERSION_CODE;
    private IMiLinkCastClient mClientImpl;

    public MiLinkCastClient(Context context) {
        this(context, true, "");
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public MiLinkDevice getConnectMiLinkDevice() {
        return this.mClientImpl.getConnectMiLinkDevice();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public long getDuration() {
        return this.mClientImpl.getDuration();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public long getProgress() {
        return this.mClientImpl.getProgress();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public float getRate() {
        return this.mClientImpl.getRate();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int getVolume() {
        return this.mClientImpl.getVolume();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int init(MiLinkCastCallback miLinkCastCallback) {
        return this.mClientImpl.init(miLinkCastCallback);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isAgreePrivacy(Context context) {
        return this.mClientImpl.isAgreePrivacy(context);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isAuthDevice(String str) {
        return this.mClientImpl.isAuthDevice(str);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isAuthDeviceConnecting() {
        return this.mClientImpl.isAuthDeviceConnecting();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isPrivateProtectMode(Context context) {
        return this.mClientImpl.isPrivateProtectMode(context);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isSmallWindowMode(Context context) {
        return this.mClientImpl.isSmallWindowMode(context);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isVerifyCodeInputShown() {
        return this.mClientImpl.isVerifyCodeInputShown();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int operatePhoto(String str, int i, int i2, int i3, int i4, int i5, int i6, float f) {
        return this.mClientImpl.operatePhoto(str, i, i2, i3, i4, i5, i6, f);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public void release() {
        this.mClientImpl.release();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int send(byte[] bArr) {
        return this.mClientImpl.send(bArr);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setAgreePrivacy(Context context, boolean z) {
        return this.mClientImpl.setAgreePrivacy(context, z);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean setClickSource(int i) {
        return this.mClientImpl.setClickSource(i);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setDataCallback(MiLinkDataCallback miLinkDataCallback) {
        return this.mClientImpl.setDataCallback(miLinkDataCallback);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setMediaCallback(MiLinkMediaCallback miLinkMediaCallback) {
        return this.mClientImpl.setMediaCallback(miLinkMediaCallback);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setPhotoSource(MiLinkPhotoSource miLinkPhotoSource) {
        return this.mClientImpl.setPhotoSource(miLinkPhotoSource);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setProgress(long j) {
        return this.mClientImpl.setProgress(j);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setRate(float f) {
        return this.mClientImpl.setRate(f);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setVolume(int i) {
        return this.mClientImpl.setVolume(i);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int showPhoto(String str) {
        return this.mClientImpl.showPhoto(str);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int showSlide(int i) {
        return this.mClientImpl.showSlide(i);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startConnect(MiLinkDevice miLinkDevice, int i) {
        return this.mClientImpl.startConnect(miLinkDevice, i);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startDiscovery(int i, MiLinkDeviceListener miLinkDeviceListener) {
        return this.mClientImpl.startDiscovery(i, miLinkDeviceListener);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startPhotoShow() {
        return this.mClientImpl.startPhotoShow();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startPlayAudio(String str, String str2, String str3, int i, double d) {
        return this.mClientImpl.startPlayAudio(str, str2, str3, i, d);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startPlayVideo(String str, String str2, String str3, int i, double d) {
        return this.mClientImpl.startPlayVideo(str, str2, str3, i, d);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startWithUI(int i) {
        return this.mClientImpl.startWithUI(i);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int stopConnect(int i) {
        return this.mClientImpl.stopConnect(i);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int stopDiscovery(int i) {
        return this.mClientImpl.stopDiscovery(i);
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int stopPhotoShow() {
        return this.mClientImpl.stopPhotoShow();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int stopPlay() {
        return this.mClientImpl.stopPlay();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean support(String str) {
        return this.mClientImpl.support(str);
    }

    public MiLinkCastClient(Context context, boolean z) {
        this(context, z, "");
    }

    public MiLinkCastClient(Context context, String str) {
        this(context, true, str);
    }

    public MiLinkCastClient(Context context, boolean z, String str) {
        String str2 = context.getPackageName() + str;
        int versionCode = ApiUtils.getVersionCode(context, "com.milink.service");
        VERSION_CODE = versionCode;
        if (versionCode >= 12040501) {
            this.mClientImpl = new MiLinkCastClientV2(context, z, str2);
            StringBuilder sb = new StringBuilder();
            sb.append("MiLinkCastClientV2 ");
            sb.append(this.mClientImpl.hashCode());
            sb.append(", caller= ");
            sb.append(str2);
            sb.append(", pid= ");
            sb.append(Process.myPid());
            return;
        }
        this.mClientImpl = new MiLinkCastClientV1(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MiLinkCastClientV1 ");
        sb2.append(this.mClientImpl.hashCode());
        sb2.append(", caller= ");
        sb2.append(str2);
        sb2.append(", pid= ");
        sb2.append(Process.myPid());
    }
}
