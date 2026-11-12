package com.huawei.health.ecologydevice.ui.measure.fragment.utils;

import android.text.TextUtils;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.ProductIntroductionFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.RopeDeviceIntroductionFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.SecondRopeIntroductionFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.SportIntroductionContentFragment;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.elh;
import defpackage.era;
import defpackage.njy;
import defpackage.piq;
import defpackage.pjc;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ProductCreateFactory {
    private static final int KIND_OTHER = 0;
    public static final int KIND_ROPE = 2;
    public static final int KIND_SPORT = 1;
    private static final String TAG = "ProductCreateFactory";

    public static ProductFragment createProductFragment(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ProductIntroductionFragment();
        }
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null || elhVarD.m() == null) {
            return new ProductIntroductionFragment();
        }
        int productKind = getProductKind(elhVarD.m());
        if (productKind == 1) {
            return createSportProductFragment(str);
        }
        if (productKind == 2) {
            return createRopeProductFragment(str);
        }
        return new ProductIntroductionFragment();
    }

    private static ProductFragment createRopeProductFragment(String str) {
        return "1".equals(era.a("pageVersion", str)) ? new SecondRopeIntroductionFragment() : new RopeDeviceIntroductionFragment();
    }

    /* JADX INFO: renamed from: com.huawei.health.ecologydevice.ui.measure.fragment.utils.ProductCreateFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$huawei$health$device$model$HealthDevice$HealthDeviceKind;

        static {
            int[] iArr = new int[HealthDevice.HealthDeviceKind.values().length];
            $SwitchMap$com$huawei$health$device$model$HealthDevice$HealthDeviceKind = iArr;
            try {
                iArr[HealthDevice.HealthDeviceKind.HDK_TREADMILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$huawei$health$device$model$HealthDevice$HealthDeviceKind[HealthDevice.HealthDeviceKind.HDK_EXERCISE_BIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$huawei$health$device$model$HealthDevice$HealthDeviceKind[HealthDevice.HealthDeviceKind.HDK_ROWING_MACHINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$huawei$health$device$model$HealthDevice$HealthDeviceKind[HealthDevice.HealthDeviceKind.HDK_ELLIPTICAL_MACHINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$huawei$health$device$model$HealthDevice$HealthDeviceKind[HealthDevice.HealthDeviceKind.HDK_WALKING_MACHINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$huawei$health$device$model$HealthDevice$HealthDeviceKind[HealthDevice.HealthDeviceKind.HDK_ROPE_SKIPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static int getProductKind(HealthDevice.HealthDeviceKind healthDeviceKind) {
        switch (AnonymousClass1.$SwitchMap$com$huawei$health$device$model$HealthDevice$HealthDeviceKind[healthDeviceKind.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 1;
            case 6:
                return 2;
            default:
                return 0;
        }
    }

    private static ProductFragment createSportProductFragment(String str) {
        List<pjc> listC = piq.e().c(str);
        if (njy.e(listC)) {
            LogUtil.a(TAG, "createProductFragment", "CollectionUtils.isEmpty");
            return new SportDeviceIntroductionFragment();
        }
        LogUtil.a(TAG, "getProductPage:", Integer.valueOf(listC.get(0).m()));
        return listC.get(0).m() == 1 ? new SportIntroductionContentFragment() : new SportDeviceIntroductionFragment();
    }
}
