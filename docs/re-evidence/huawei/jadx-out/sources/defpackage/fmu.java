package defpackage;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.huawei.health.device.api.DeviceMainActivityApi;
import com.huawei.health.device.constants.WeightConstants;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceBindGuidFragment;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment;
import com.huawei.health.device.ui.measure.fragment.HonourDeviceFragment;
import com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment;
import com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment;
import com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingUniversalFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = DeviceMainActivityApi.class)
public class fmu implements DeviceMainActivityApi {
    @Override // com.huawei.health.device.api.DeviceMainActivityApi
    public void popupFragment(Activity activity, Class<?> cls) {
        if (activity instanceof DeviceMainActivity) {
            ((DeviceMainActivity) activity).a(cls);
        }
    }

    @Override // com.huawei.health.device.api.DeviceMainActivityApi
    public void popupMyDeviceFragment(Activity activity) {
        popupFragment(activity, MyDeviceFragment.class);
    }

    @Override // com.huawei.health.device.api.DeviceMainActivityApi
    public void setCurrentFragment(Activity activity, Fragment fragment) {
        if (activity instanceof DeviceMainActivity) {
            ((DeviceMainActivity) activity).b(fragment);
        }
    }

    @Override // com.huawei.health.device.api.DeviceMainActivityApi
    public void switchFragment(Activity activity, Fragment fragment, Fragment fragment2, String str) {
        if (fragment2 == null) {
            LogUtil.e("DeviceMainActivityImpl", "switchFragment target is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("root_in_me", str);
        fragment2.setArguments(bundle);
        if (activity instanceof DeviceMainActivity) {
            ((DeviceMainActivity) activity).c(fragment, fragment2);
        } else {
            LogUtil.e("DeviceMainActivityImpl", "switchFragment activity is not DeviceMainActivity, targetName is ", fragment2.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.health.device.api.DeviceMainActivityApi
    public void switchFragment(Activity activity, Fragment fragment, Fragment fragment2) {
        if (activity instanceof DeviceMainActivity) {
            ((DeviceMainActivity) activity).c(fragment, fragment2);
        } else {
            LogUtil.e("DeviceMainActivityImpl", "switchFragment activity is not DeviceMainActivity, targetName is ", fragment2.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.health.device.api.DeviceMainActivityApi
    public void addFragment(Activity activity, Fragment fragment, Fragment fragment2) {
        if (activity instanceof DeviceMainActivity) {
            ((DeviceMainActivity) activity).d(fragment, fragment2);
        } else {
            LogUtil.e("DeviceMainActivityImpl", "addFragment activity is not DeviceMainActivity, targetName is ", fragment2.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.health.device.api.DeviceMainActivityApi
    public void onBackPressed(Activity activity) {
        if (activity instanceof DeviceMainActivity) {
            ((DeviceMainActivity) activity).onBackPressed();
        } else {
            LogUtil.e("DeviceMainActivityImpl", "onBackPressed activity is not DeviceMainActivity");
        }
    }

    /* JADX INFO: renamed from: fmu$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[WeightConstants.FragmentType.values().length];
            e = iArr;
            try {
                iArr[WeightConstants.FragmentType.DEVICE_BIND_WAITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[WeightConstants.FragmentType.DEVICE_BIND_WAITING_UNIVERSAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[WeightConstants.FragmentType.WIFI_PRODUCT_INTRODUCTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[WeightConstants.FragmentType.HAGRID_DEVICE_MANAGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[WeightConstants.FragmentType.HAGRID_DEVICE_BIND_GUID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[WeightConstants.FragmentType.HONOUR_DEVICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.huawei.health.device.api.DeviceMainActivityApi
    public Fragment getPluginDeviceFragment(WeightConstants.FragmentType fragmentType) {
        switch (AnonymousClass2.e[fragmentType.ordinal()]) {
            case 1:
                return new DeviceBindWaitingFragment();
            case 2:
                return new DeviceBindWaitingUniversalFragment();
            case 3:
                return new WiFiProductIntroductionFragment();
            case 4:
                return new HagridDeviceManagerFragment();
            case 5:
                return new HagridDeviceBindGuidFragment();
            case 6:
                return new HonourDeviceFragment();
            default:
                LogUtil.j("DeviceMainActivityImpl", "getPluginDeviceFragment is bad fragmentType");
                return null;
        }
    }

    @Override // com.huawei.health.device.api.DeviceMainActivityApi
    public Fragment getSelectFragment(Activity activity, Class<?> cls) {
        if (activity instanceof DeviceMainActivity) {
            return ((DeviceMainActivity) activity).c(cls);
        }
        LogUtil.e("DeviceMainActivityImpl", "getSelectFragment DeviceMainActivity is NULL or activity is not DeviceMainActivity");
        return null;
    }

    @Override // com.huawei.health.device.api.DeviceMainActivityApi
    public Bundle getBundleFromDeviceMainActivity(Activity activity) {
        if (activity instanceof DeviceMainActivity) {
            return ((DeviceMainActivity) activity).d();
        }
        return null;
    }

    @Override // com.huawei.health.device.api.DeviceMainActivityApi
    public Class<?> getMeasureBackClass(Activity activity) {
        if (activity instanceof DeviceMainActivity) {
            return ((DeviceMainActivity) activity).e();
        }
        return null;
    }

    @Override // com.huawei.health.device.api.DeviceMainActivityApi
    public void setMeasureBackClass(Activity activity, Class<?> cls) {
        if (activity instanceof DeviceMainActivity) {
            ((DeviceMainActivity) activity).e(cls);
        }
    }

    @Override // com.huawei.health.device.api.DeviceMainActivityApi
    public boolean isFromHealthModel(Activity activity) {
        if (activity instanceof DeviceMainActivity) {
            return ((DeviceMainActivity) activity).g();
        }
        return false;
    }
}
