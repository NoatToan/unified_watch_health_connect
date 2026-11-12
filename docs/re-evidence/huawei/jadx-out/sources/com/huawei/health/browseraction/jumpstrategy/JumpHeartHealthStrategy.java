package com.huawei.health.browseraction.jumpstrategy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.health.browseraction.jumpstrategy.JumpHeartHealthStrategy;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.marketing.utils.EcgFilterManager;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import defpackage.ddv;
import defpackage.efe;
import defpackage.pfi;
import defpackage.prf;
import defpackage.rpq;

/* JADX INFO: loaded from: classes7.dex */
public abstract class JumpHeartHealthStrategy extends JumpDeviceStrategy {
    public static final String TAG = "JumpHeartHealthStrategy";

    /* JADX INFO: renamed from: com.huawei.health.browseraction.jumpstrategy.JumpHeartHealthStrategy$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f6249c;

        static {
            int[] iArr = new int[FeatureType.values().length];
            f6249c = iArr;
            try {
                iArr[FeatureType.ECG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6249c[FeatureType.ECG_ANALYSIS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6249c[FeatureType.ARRHYTHMIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    protected boolean isShowEntry(FeatureType featureType, DeviceInfo deviceInfo) {
        int i = AnonymousClass3.f6249c[featureType.ordinal()];
        if (i == 1) {
            return checkSupportCapability(deviceInfo) || efe.c(new int[]{31002});
        }
        if (i == 2) {
            return EcgFilterManager.c() && (checkSupportCapability(deviceInfo) || efe.c(new int[]{DicDataTypeUtil.DataType.ELECTROCARDIOGRAM.value()}));
        }
        if (i == 3) {
            return (EcgFilterManager.d() && checkSupportCapability(deviceInfo)) || efe.c(new int[]{DicDataTypeUtil.DataType.ARRHYTHMIA_PPG_TYPE.value()});
        }
        LogUtil.j(TAG, "unknown type: ", featureType);
        return false;
    }

    protected void jump(FeatureType featureType, final String str, DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            rpq.c(featureType).jumpToFeaturePage(deviceInfo, new SimpleChain.Emitter() { // from class: dhm
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public final void onSuccess(Object[] objArr) {
                    LogUtil.a(JumpHeartHealthStrategy.TAG, "jump To " + str + " onSuccess");
                }
            });
            return;
        }
        if (featureType == FeatureType.ECG || featureType == FeatureType.ECG_ANALYSIS) {
            prf.d(BaseApplication.b(), str, 3, (String) null);
            return;
        }
        final Activity activityJ = BaseApplication.j();
        if (activityJ != null) {
            activityJ.runOnUiThread(new Runnable() { // from class: dhl
                @Override // java.lang.Runnable
                public final void run() {
                    JumpHeartHealthStrategy.lambda$jump$2(activityJ);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$jump$2(final Activity activity) {
        LogUtil.a(TAG, "enter Arrhythmia");
        final H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/?from=2");
        pfi.c().launchActivity(activity, new Intent(), new AppBundleLauncher.InstallCallback() { // from class: dhs
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return JumpHeartHealthStrategy.lambda$jump$1(activity, builder, context, intent);
            }
        });
    }

    public static /* synthetic */ boolean lambda$jump$1(Activity activity, H5ProLaunchOption.Builder builder, Context context, Intent intent) {
        ddv.b().loadH5ProApp(activity, "com.huawei.health.h5.ppg", builder);
        return false;
    }
}
