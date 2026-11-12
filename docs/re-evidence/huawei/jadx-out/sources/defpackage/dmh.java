package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.HelpCustomerOperate;
import com.huawei.operation.utils.OnlineImUtil;
import com.huawei.plugindevice.R;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class dmh implements GrsQueryCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<HagridDeviceManagerFragment> f32002c;

    public dmh(HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        this.f32002c = new WeakReference<>(hagridDeviceManagerFragment);
    }

    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
    public void onCallBackSuccess(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("R_HelpCustomerGrsQueryCallback", "obtainTipsUrlDomain url is empty");
        } else {
            c(str);
        }
    }

    private void c(String str) {
        int i;
        HagridDeviceManagerFragment hagridDeviceManagerFragment = this.f32002c.get();
        if (hagridDeviceManagerFragment == null) {
            ReleaseLogUtil.e("R_HelpCustomerGrsQueryCallback", "fragment is null");
            return;
        }
        Activity mainActivity = hagridDeviceManagerFragment.getMainActivity();
        if (mainActivity == null) {
            ReleaseLogUtil.e("R_HelpCustomerGrsQueryCallback", "activity is null");
            return;
        }
        StringBuilder sb = new StringBuilder(HelpCustomerOperate.getHelpCustomerUrl(str, "#/help?cid=11069"));
        sb.append("&isDevice=4");
        if (a() && lli.e().b()) {
            sb.append("&unitId=");
            sb.append(hagridDeviceManagerFragment.getUniqueId());
            sb.append("&isEnhancementMode=false");
        }
        try {
            Intent intent = new Intent(mainActivity, (Class<?>) WebViewActivity.class);
            boolean zIsShowOnlineEntry = OnlineImUtil.isShowOnlineEntry();
            intent.putExtra("url", sb.toString());
            if (zIsShowOnlineEntry) {
                i = R.string.IDS_hw_personal_cetenr_help_customer_service;
            } else {
                i = R.string.IDS_hwh_health_vo2max_help;
            }
            intent.putExtra("title", mainActivity.getString(i));
            mainActivity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            ReleaseLogUtil.a("R_HelpCustomerGrsQueryCallback", "startWebViewActivity ActivityNotFoundException");
        }
    }

    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
    public void onCallBackFail(int i) {
        ReleaseLogUtil.e("R_HelpCustomerGrsQueryCallback", "obtainTipsUrlDomain onCallBackFail ", Integer.valueOf(i));
    }

    public static boolean a() {
        boolean zBu = CommonUtil.bu();
        boolean zH = Utils.h();
        boolean zC = lli.c();
        boolean zO = Utils.o();
        boolean z = zBu && !dxx.c();
        boolean z2 = (zO || !z || lli.a()) ? false : true;
        boolean z3 = zO && z && zC && zH;
        ReleaseLogUtil.d("R_HelpCustomerGrsQueryCallback", "isOverSea: ", Boolean.valueOf(zO), ", isSupport: ", Boolean.valueOf(z), ", isOpen: ", Boolean.valueOf(zC), ", isAllowLogin: ", Boolean.valueOf(zH));
        return z2 || z3;
    }
}
