package com.huawei.hwarkuix.oHBrigdePlugin.health;

import android.content.Context;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import defpackage.nql;
import defpackage.nrl;
import defpackage.nrn;
import defpackage.nrt;
import defpackage.nry;
import defpackage.nsa;
import defpackage.nsc;
import defpackage.nse;
import defpackage.nsh;
import defpackage.nsi;
import defpackage.nsl;
import health.compact.a.util.LogUtil;
import ohos.ace.adapter.capability.bridge.BridgeManager;

/* JADX INFO: loaded from: classes10.dex */
public class OneSdk extends OHProBridgePlugin {
    private static final String R_TAG = "R_ArkUIX_OneSdk";
    private static final String TAG = "ArkUIX_OneSdk";
    private final nrl mAggregateDataProcess;
    private final nrn mAggregateHealthDataProcess;
    private final nrt mDeleteDataProcess;
    private final nsa mReadConfigDataProcess;
    private final nry mReadDataProcess;
    private final nsc mReadDataSourceProcess;
    private final nse mSaveDataProcess;
    private final nsi mSubscribeDataProcess;
    private final nsh mSyncCloudProcess;
    private final nsl mUnSubscribeDataProcess;

    public OneSdk(Context context, String str, int i) {
        super(context, str, i);
        this.mAggregateDataProcess = new nrl();
        this.mAggregateHealthDataProcess = new nrn();
        this.mReadDataProcess = new nry();
        this.mReadConfigDataProcess = new nsa();
        this.mReadDataSourceProcess = new nsc();
        this.mSaveDataProcess = new nse();
        this.mDeleteDataProcess = new nrt();
        this.mSyncCloudProcess = new nsh();
        this.mSubscribeDataProcess = new nsi();
        this.mUnSubscribeDataProcess = new nsl();
    }

    public OneSdk(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
        this.mAggregateDataProcess = new nrl();
        this.mAggregateHealthDataProcess = new nrn();
        this.mReadDataProcess = new nry();
        this.mReadConfigDataProcess = new nsa();
        this.mReadDataSourceProcess = new nsc();
        this.mSaveDataProcess = new nse();
        this.mDeleteDataProcess = new nrt();
        this.mSyncCloudProcess = new nsh();
        this.mSubscribeDataProcess = new nsi();
        this.mUnSubscribeDataProcess = new nsl();
    }

    public void readData(long j, String str) {
        LogUtil.a(TAG, "callbackId ", Long.valueOf(j), " readData origin request = ", str);
        if (str.contains("sampleConfigDataType")) {
            nql.d(str, this.mReadConfigDataProcess, getCallback(j));
        } else {
            nql.d(str, this.mReadDataProcess, getCallback(j));
        }
    }

    public void aggregateHealthData(long j, String str) {
        LogUtil.a(TAG, "callbackId ", Long.valueOf(j), " aggregateHealthData origin request = ", str);
        nql.d(str, this.mAggregateHealthDataProcess, getCallback(j));
    }

    public void aggregateData(long j, String str) {
        LogUtil.a(TAG, "callbackId ", Long.valueOf(j), " aggregateData origin request = ", str);
        nql.d(str, this.mAggregateDataProcess, getCallback(j));
    }

    public void readDataSource(long j, String str) {
        LogUtil.a(TAG, "callbackId ", Long.valueOf(j), " readDataSource origin request = ", str);
        nql.d(str, this.mReadDataSourceProcess, getCallback(j));
    }

    public void saveData(long j, String str) {
        LogUtil.a(TAG, "callbackId ", Long.valueOf(j), " saveData origin request = ", str);
        nql.d(str, this.mSaveDataProcess, getCallback(j));
    }

    public void deleteData(long j, String str) {
        LogUtil.a(TAG, "callbackId ", Long.valueOf(j), " deleteData origin request = ", str);
        nql.d(str, this.mDeleteDataProcess, getCallback(j));
    }

    public void syncCloud(long j, String str) {
        LogUtil.a(TAG, "callbackId ", Long.valueOf(j), " syncCloud origin request = ", str);
        nql.d(str, this.mSyncCloudProcess, getCallback(j));
    }

    public void subscribeHealthData(long j, String str) {
        LogUtil.a(TAG, "subscribeHealthData origin request = ", str);
        nql.d(str, this.mSubscribeDataProcess, getCallback(j));
    }

    public void unsubscribeHealthData(long j, String str) {
        LogUtil.a(TAG, "unsubscribeHealthData origin request = ", str);
        nql.d(str, this.mUnSubscribeDataProcess, getCallback(j));
    }

    private IBaseResponseCallback getCallback(final long j) {
        return new IBaseResponseCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.OneSdk$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1406x553f0e47(j, i, obj);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$getCallback$0$com-huawei-hwarkuix-oHBrigdePlugin-health-OneSdk, reason: not valid java name */
    /* synthetic */ void m1406x553f0e47(long j, int i, Object obj) {
        if (i == 0) {
            ohProOnSuccess(j, obj);
        } else {
            ohProOnFailure(j, "");
        }
    }
}
