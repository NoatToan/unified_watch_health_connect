package com.huawei.hwversionmgr.utils.handler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.nuf;
import defpackage.num;
import defpackage.nuw;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AppCheckNewVersionHandler extends Handler {
    private static final String TAG = "AppCheckNewVersionHandler";
    private boolean mIsAw70;
    private boolean mIsScale;

    public abstract void handleCheckFailed(int i);

    public abstract void handleCheckSuccess(nuf nufVar);

    public void setIsAw70(boolean z) {
        this.mIsAw70 = z;
    }

    public boolean getIsAw70() {
        return this.mIsAw70;
    }

    public void setIsScale(boolean z) {
        this.mIsScale = z;
    }

    public AppCheckNewVersionHandler() {
        this.mIsAw70 = false;
        this.mIsScale = false;
    }

    public AppCheckNewVersionHandler(Looper looper) {
        super(looper);
        this.mIsAw70 = false;
        this.mIsScale = false;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i = message.what;
        if (i == 0) {
            LogUtil.d(TAG, "handleMessage check new version failed,FAILED_REASON_NETWORK");
            try {
                handleCheckFailed(1);
                return;
            } catch (Exception unused) {
                LogUtil.e(TAG, "handleMessage handleCheckFailed");
                return;
            }
        }
        if (i == 1) {
            LogUtil.d(TAG, "handleMessage check app new version success");
            checkAppStatusSuccess(message.obj);
        } else if (i == 2) {
            LogUtil.d(TAG, "handleMessage check band new version success");
            checkBandStatusSuccess(message.obj);
        } else {
            LogUtil.d(TAG, "handleMessage default");
        }
    }

    private void checkAppStatusSuccess(Object obj) {
        try {
            LogUtil.d(TAG, "checkAppStatusSuccess status", Integer.valueOf(nuw.b().p()));
            if (nuw.b().p() == 1) {
                handleCheckFailed(0);
                return;
            }
            if (nuw.b().p() == -1) {
                handleCheckFailed(2);
                return;
            }
            if (nuw.b().p() == 0) {
                if (obj != null && !(obj instanceof nuf)) {
                    LogUtil.e(TAG, "checkAppStatusSuccess object instance error");
                    return;
                } else {
                    handleCheckSuccess((nuf) obj);
                    return;
                }
            }
            handleCheckFailed(3);
        } catch (Exception unused) {
            LogUtil.e(TAG, "checkAppStatusSuccess error");
        }
    }

    private void checkBandStatusSuccess(Object obj) {
        if (obj != null) {
            try {
                if (!(obj instanceof nuf)) {
                    LogUtil.e(TAG, "checkBandStatusSuccess object instance error");
                    return;
                }
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
                LogUtil.e(TAG, "checkBandStatusSuccess Exception");
                return;
            }
        }
        nuf nufVar = (nuf) obj;
        if (this.mIsAw70) {
            checkDeviceStatus(nuw.c().p(), nufVar);
            return;
        }
        if (this.mIsScale) {
            num numVarO = nuw.o();
            if (numVarO != null) {
                checkDeviceStatus(numVarO.p(), nufVar);
                return;
            }
            return;
        }
        checkBandDeviceStatus(nufVar);
    }

    private void checkBandDeviceStatus(nuf nufVar) {
        num numVarA = nuw.a();
        if (numVarA != null) {
            checkDeviceStatus(numVarA.p(), nufVar);
        }
    }

    private void checkDeviceStatus(int i, nuf nufVar) {
        try {
            LogUtil.d(TAG, "checkDeviceStatus status", Integer.valueOf(i));
            if (i == 1) {
                handleCheckFailed(0);
                return;
            }
            if (i == -1) {
                handleCheckFailed(2);
            } else if (i == 0) {
                handleCheckSuccess(nufVar);
            } else {
                handleCheckFailed(3);
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
            LogUtil.e(TAG, "checkDeviceStatus Exception");
        }
    }
}
