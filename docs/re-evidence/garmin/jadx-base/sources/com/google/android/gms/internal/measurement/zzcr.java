package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface zzcr extends IInterface {
    void beginAdUnitExposure(String str, long j8);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j8);

    void endAdUnitExposure(String str, long j8);

    void generateEventId(zzcu zzcuVar);

    void getAppInstanceId(zzcu zzcuVar);

    void getCachedAppInstanceId(zzcu zzcuVar);

    void getConditionalUserProperties(String str, String str2, zzcu zzcuVar);

    void getCurrentScreenClass(zzcu zzcuVar);

    void getCurrentScreenName(zzcu zzcuVar);

    void getGmpAppId(zzcu zzcuVar);

    void getMaxUserProperties(String str, zzcu zzcuVar);

    void getSessionId(zzcu zzcuVar);

    void getTestFlag(zzcu zzcuVar, int i14);

    void getUserProperties(String str, String str2, boolean z14, zzcu zzcuVar);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, zzdd zzddVar, long j8);

    void isDataCollectionEnabled(zzcu zzcuVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z14, boolean z15, long j8);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j8);

    void logHealthData(int i14, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j8);

    void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j8);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j8);

    void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j8);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j8);

    void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j8);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j8);

    void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j8);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcu zzcuVar, long j8);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j8);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j8);

    void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j8);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j8);

    void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j8);

    void performAction(Bundle bundle, zzcu zzcuVar, long j8);

    void registerOnMeasurementEventListener(zzda zzdaVar);

    void resetAnalyticsData(long j8);

    void retrieveAndUploadBatches(zzcx zzcxVar);

    void setConditionalUserProperty(Bundle bundle, long j8);

    void setConsent(Bundle bundle, long j8);

    void setConsentThirdParty(Bundle bundle, long j8);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j8);

    void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j8);

    void setDataCollectionEnabled(boolean z14);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzda zzdaVar);

    void setInstanceIdProvider(zzdc zzdcVar);

    void setMeasurementEnabled(boolean z14, long j8);

    void setMinimumSessionDuration(long j8);

    void setSessionTimeoutDuration(long j8);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j8);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z14, long j8);

    void unregisterOnMeasurementEventListener(zzda zzdaVar);
}
