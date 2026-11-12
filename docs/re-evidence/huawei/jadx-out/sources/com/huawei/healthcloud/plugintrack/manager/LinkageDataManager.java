package com.huawei.healthcloud.plugintrack.manager;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.huawei.haf.handler.BaseHandlerCallback;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import defpackage.qqt;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public abstract class LinkageDataManager<T> {
    private static final int INVALID_INTERVAL = 10;
    private static final int MSG_READ_DATA_CYCLICALLY = 1;
    protected static final int REFRESH_INTERVAL = 1000;
    protected static final int SAVE_INTERVAL_FIVE = 5;
    protected Context mContext;
    private ExtendHandler mExtendHandler;
    protected long mLastUpdateTime;
    private List<Integer> mSuccessList;
    private T tempData;
    protected static final String SP_MODULE_ID = String.valueOf(20002);
    private static final Object LOCK = new Object();
    protected CopyOnWriteArrayList<T> mRealTimeLinkDataBuffer = new CopyOnWriteArrayList<>();
    protected CopyOnWriteArrayList<T> mPointDataBuffer = new CopyOnWriteArrayList<>();
    protected CopyOnWriteArrayList<T> mTempPointDataBuffer = new CopyOnWriteArrayList<>();
    protected int mCurrentIndex = 0;
    private final HiSubscribeListener mHiSubscribeListener = new HiSubscribeListener() { // from class: com.huawei.healthcloud.plugintrack.manager.LinkageDataManager.2
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            LogUtil.a(LinkageDataManager.this.getTAG(), "registerLinkageData success");
            if (LinkageDataManager.this.mSuccessList == null) {
                LinkageDataManager.this.mSuccessList = new CopyOnWriteArrayList();
            }
            if (list != null) {
                LinkageDataManager.this.mSuccessList.addAll(list);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            Object objConvertLinkData = LinkageDataManager.this.convertLinkData(i, hiHealthClient, str, hiHealthData, j);
            if (objConvertLinkData != null) {
                LinkageDataManager.this.tempData = objConvertLinkData;
            }
        }
    };
    private final HiUnSubscribeListener mHiUnSubscribeListener = new HiUnSubscribeListener() { // from class: iwo
        @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
        public final void onResult(boolean z) {
            this.e.lambda$new$0(z);
        }
    };

    protected boolean checkOverInvalidTime(long j, long j2) {
        return j - j2 >= 10000;
    }

    protected abstract T convertLinkData(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j);

    protected abstract List<Integer> getDataType();

    protected abstract long getRefreshInterval();

    protected abstract String getSpKey();

    protected abstract String getTAG();

    protected abstract void putLatestLinkData(Bundle bundle);

    protected abstract List<T> recoverPointData(MotionData motionData);

    protected abstract CopyOnWriteArrayList<T> recoverRealTimeData(String str);

    public abstract void saveDataToSimplify(MotionPathSimplify motionPathSimplify);

    public abstract void saveLinkDataToMotionPath(MotionPath motionPath, boolean z, boolean z2);

    protected abstract void updateLinkData(T t);

    public LinkageDataManager(Context context) {
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(boolean z) {
        LogUtil.a(getTAG(), "unregisterLinkageData isSuccess ", Boolean.valueOf(z));
    }

    public final void registerLinkageData() {
        startHandlerThread();
        HiHealthManager.d(this.mContext).subscribeHiHealthData(getDataType(), this.mHiSubscribeListener);
        this.mExtendHandler.removeMessages(1);
        this.mExtendHandler.sendEmptyMessage(1);
    }

    public final void unregisterLinkageData() {
        HiHealthManager.d(this.mContext).unSubscribeHiHealthData(this.mSuccessList, this.mHiUnSubscribeListener);
        stopHandlerThread();
    }

    private void startHandlerThread() {
        ReleaseLogUtil.d(getTAG(), "startHandlerThread enter");
        if (this.mExtendHandler == null) {
            this.mExtendHandler = HandlerCenter.b(new a(this), getTAG());
        }
    }

    private void stopHandlerThread() {
        ReleaseLogUtil.d(getTAG(), "stopHandlerThread enter");
        ExtendHandler extendHandler = this.mExtendHandler;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
            this.mExtendHandler.quit(false);
            this.mExtendHandler = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processLinkData() {
        if (this.tempData != null) {
            this.mLastUpdateTime = System.currentTimeMillis();
            updateLinkData(this.tempData);
            this.tempData = null;
        }
        ExtendHandler extendHandler = this.mExtendHandler;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(1, getRefreshInterval());
        } else {
            ReleaseLogUtil.a(getTAG(), "mExtendHandler is null");
        }
    }

    protected final List<T> getCacheLinkDataList(boolean z) {
        ArrayList arrayList;
        synchronized (LOCK) {
            arrayList = new ArrayList(16);
            if (njy.b(this.mTempPointDataBuffer)) {
                arrayList.addAll(this.mTempPointDataBuffer);
                if (z) {
                    this.mTempPointDataBuffer.clear();
                }
            }
        }
        return arrayList;
    }

    public final void saveRealTimeLinkData() {
        SharedPreferenceManager.c(SP_MODULE_ID, getSpKey(), qqt.b(this.mRealTimeLinkDataBuffer));
    }

    public void recoverLinkData(MotionData motionData) {
        LogUtil.a(getTAG(), "recoverSaveLinkData");
        this.mRealTimeLinkDataBuffer.clear();
        CopyOnWriteArrayList<T> copyOnWriteArrayListRecoverRealTimeData = recoverRealTimeData(SharedPreferenceManager.b(SP_MODULE_ID, getSpKey(), ""));
        if (njy.b(copyOnWriteArrayListRecoverRealTimeData)) {
            this.mRealTimeLinkDataBuffer = copyOnWriteArrayListRecoverRealTimeData;
            this.mCurrentIndex = copyOnWriteArrayListRecoverRealTimeData.size();
        }
        this.mPointDataBuffer.clear();
        if (motionData != null) {
            List<T> listRecoverPointData = recoverPointData(motionData);
            if (njy.b(listRecoverPointData)) {
                this.mPointDataBuffer.addAll(listRecoverPointData);
            }
        }
    }

    public void clearCache() {
        LogUtil.a(getTAG(), "clearCache by stop sport");
        SharedPreferenceManager.b(SP_MODULE_ID, getSpKey());
    }

    static class a extends BaseHandlerCallback<LinkageDataManager> {
        public a(LinkageDataManager linkageDataManager) {
            super(linkageDataManager);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandlerCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean handleMessageWhenReferenceNotNull(LinkageDataManager linkageDataManager, Message message) {
            if (message.what == 1) {
                linkageDataManager.processLinkData();
            }
            return true;
        }
    }
}
