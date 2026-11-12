package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.device.activity.adddevice.OneKeyScanActivity;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler;
import com.huawei.ui.thirdpartservice.activity.healthkit.HealthKitActivity;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class sty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f48692a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static sty f48693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private QrCodeBaseHandler f48694c;
    private c d;
    private NoTitleCustomAlertDialog e;

    public static sty e() {
        sty styVar;
        synchronized (f48692a) {
            if (f48693b == null) {
                f48693b = new sty();
            }
            styVar = f48693b;
        }
        return styVar;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    public static final boolean a(String str) {
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
            case "activeEcgService":
            case "activeEcgWatch":
            case "c":
            case "d":
            case "f":
            case "s":
            case "dl":
            case "deeplink":
                return true;
            default:
                return "connect".equalsIgnoreCase(str);
        }
    }

    public static void a(Activity activity) {
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: sty.5
            @Override // java.lang.Runnable
            public void run() {
                qpx.e(BaseApplication.getContext(), R.string.IDS_not_support_qrcode);
            }
        });
        activity.finish();
    }

    public static void e(Bundle bundle, String str, String str2) {
        HashMap map = new HashMap(3);
        if (bundle == null) {
            map.put("src", "app");
        } else {
            map.put("src", bundle.getString("src", "app"));
        }
        map.put("action", str);
        map.put("type", str2);
        LogUtil.a("QrCodeHandleManager", "reportQrEvent: ", map.toString());
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_QRCODE_2060054.value(), map, 0);
    }

    public void e(Activity activity, String str, Bundle bundle) {
        if (activity == null || TextUtils.isEmpty(str)) {
            LogUtil.j("R_QrCode_QrCodeHandleManager", "activity is null or content is empty");
            return;
        }
        e(bundle, "gl", "");
        SharedPreferenceManager.e(activity, String.valueOf(10000), "key_sn_sino_blood_sugar", str, null);
        if (new wzw().e(402)) {
            if (!NetworkUtil.h()) {
                c(activity);
                return;
            } else {
                era.a(activity);
                return;
            }
        }
        LogUtil.a("QrCodeHandleManager", "showHealthKit enter");
        Intent intent = new Intent(activity, (Class<?>) HealthKitActivity.class);
        intent.putExtra("key_health_kit_authorization_to_bind_device", true);
        activity.startActivity(intent);
        activity.finish();
    }

    private void c(final Activity activity) {
        LogUtil.a("QrCodeHandleManager", "showNetworkOpenDialog()");
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).a(activity.getString(R.string.IDS_network_connect_error)).a(R.string.IDS_dialog_checkbox_cancel, new View.OnClickListener() { // from class: stz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48696b.c(view);
            }
        }).c(R.string.IDS_network_set, new View.OnClickListener() { // from class: sua
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sty.d(activity, view);
            }
        }).c();
        this.e = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: stx
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f48690a.d(activity, dialogInterface);
            }
        });
        this.e.setCanceledOnTouchOutside(false);
        this.e.show();
        d();
    }

    /* synthetic */ void c(View view) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.e;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
        }
    }

    static /* synthetic */ void d(Activity activity, View view) {
        LogUtil.a("QrCodeHandleManager", "showNetworkOpenDialog() onDialogButtonClick Yes");
        ecj.e(activity, new Intent("android.settings.SETTINGS"));
    }

    /* synthetic */ void d(Activity activity, DialogInterface dialogInterface) {
        LogUtil.a("QrCodeHandleManager", "showNetworkOpenDialog() onDismiss");
        if (NetworkUtil.h()) {
            era.a(activity);
        } else {
            activity.finish();
        }
        b();
    }

    private void d() {
        if (this.d == null) {
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.d = new c(this);
            BaseApplication.getContext().registerReceiver(this.d, intentFilter);
        }
    }

    private void b() {
        if (this.d != null) {
            BaseApplication.getContext().unregisterReceiver(this.d);
            this.d = null;
        }
    }

    public void c(Activity activity, String str, String str2, Bundle bundle, CommBaseCallbackInterface commBaseCallbackInterface) {
        LogUtil.a("QrCodeHandleManager", "handleQrCode in");
        if (!a(activity, str, str2, commBaseCallbackInterface)) {
            if (commBaseCallbackInterface != null) {
                commBaseCallbackInterface.onResult(-3, "handleQrCode verify fail", null);
            }
            LogUtil.j("QrCodeHandleManager", "handleQrCode verify fail");
            activity.finish();
            return;
        }
        QrCodeBaseHandler qrCodeBaseHandlerC = c(str, str2, bundle, activity, commBaseCallbackInterface);
        this.f48694c = qrCodeBaseHandlerC;
        if (qrCodeBaseHandlerC != null) {
            if (this.f48694c.verify(qrCodeBaseHandlerC.parser(str, str2))) {
                this.f48694c.execute();
                return;
            }
            LogUtil.e("R_QrCode_QrCodeHandleManager", "Data validation failed");
        }
        activity.finish();
    }

    public QrCodeBaseHandler c() {
        return this.f48694c;
    }

    public void e(String str, String str2, Bundle bundle, Activity activity) {
        if ("scanDevice".equals(str) && TextUtils.isEmpty(str2)) {
            activity.startActivity(new Intent(activity, (Class<?>) OneKeyScanActivity.class));
            activity.finish();
        } else if (!a(str)) {
            LogUtil.j("QrCodeHandleManager", "other action");
            b(bundle, activity);
        } else {
            c(activity, str, str2, bundle, new CommBaseCallbackInterface() { // from class: sty.2
                @Override // com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface
                public void onResult(int i, String str3, Object obj) {
                    LogUtil.a("QrCodeHandleManager", "handleQrByAction callback: ", Integer.valueOf(i), " msg: ", str3);
                }
            });
        }
    }

    public void b(Bundle bundle, Activity activity) {
        e(bundle, "unknown", "");
        sub.a(activity);
    }

    public static boolean e(String str) {
        return "c".equals(str) || "connect".equalsIgnoreCase(str);
    }

    private boolean g(String str) {
        return "d".equals(str);
    }

    private boolean i(String str) {
        return "deeplink".equals(str);
    }

    private boolean a(Activity activity, String str, String str2, CommBaseCallbackInterface commBaseCallbackInterface) {
        if (activity == null) {
            LogUtil.e("R_QrCode_QrCodeHandleManager", "verify activity is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("R_QrCode_QrCodeHandleManager", "verify action is null");
            return false;
        }
        if (TextUtils.isEmpty(str2) && !"activeEcgService".equals(str) && !"activeEcgWatch".equals(str)) {
            LogUtil.e("R_QrCode_QrCodeHandleManager", "verify data is null and not Ecg action");
            return false;
        }
        if (commBaseCallbackInterface != null) {
            return true;
        }
        LogUtil.e("R_QrCode_QrCodeHandleManager", "verify callback is null");
        return false;
    }

    private boolean f(String str) {
        return "f".equals(str);
    }

    private QrCodeBaseHandler c(String str, String str2, Bundle bundle, Activity activity, CommBaseCallbackInterface commBaseCallbackInterface) {
        if ("s".equals(str) || "sschemeQrCode".equals(str)) {
            e(bundle, "s", "");
            return new stm(activity, commBaseCallbackInterface, bundle);
        }
        if (f(str)) {
            e(bundle, "f", "");
            return new sss(activity, commBaseCallbackInterface);
        }
        if ("activeEcgService".equals(str) || "activeEcgWatch".equals(str)) {
            e(bundle, str, "");
            return new ssm(activity, commBaseCallbackInterface);
        }
        return d(str, str2, bundle, activity, commBaseCallbackInterface);
    }

    private QrCodeBaseHandler d(String str, String str2, Bundle bundle, Activity activity, CommBaseCallbackInterface commBaseCallbackInterface) {
        String strD = d(FitRunPlayAudio.PLAY_TYPE_T, str2);
        if (h(strD) && Utils.o()) {
            LogUtil.a("QrCodeHandleManager", "is oversea not support this device");
            qpx.e(activity, R.string.ie_device_unsupported);
            if (activity != null) {
                LogUtil.a("QrCodeHandleManager", "getQrCodeOtherHandler activity != null");
                activity.finish();
            }
            return null;
        }
        if (e(str)) {
            e(bundle, "c", strD);
            if ((!TextUtils.isEmpty(strD) && c(strD)) || strD.equals("262")) {
                return new ssw(activity, commBaseCallbackInterface, bundle);
            }
            if (!TextUtils.isEmpty(strD) && (d(strD) || b(strD))) {
                return new stc(activity, commBaseCallbackInterface);
            }
            LogUtil.j("QrCodeHandleManager", "getQrCodeHandler is other type");
            if ("54".equals(strD)) {
                return new ste(activity, commBaseCallbackInterface);
            }
            if ("275".equals(strD)) {
                return new sst(activity, commBaseCallbackInterface);
            }
            if (!TextUtils.isEmpty(strD)) {
                return a(bundle, activity, commBaseCallbackInterface);
            }
            LogUtil.j("R_QrCode_QrCodeHandleManager", "getQrCodeHandler unknown connect type");
            sub.a(activity);
        }
        if (g(str)) {
            e(bundle, "d", strD);
            if ("70".equals(strD)) {
                return new stg(activity, commBaseCallbackInterface);
            }
            if (j(strD)) {
                return new sso(activity, commBaseCallbackInterface);
            }
            LogUtil.j("R_QrCode_QrCodeHandleManager", "getQrCodeHandler unknown disConnect type");
            sub.a(activity);
        }
        if (b(str, str2, bundle)) {
            return new stf(activity, commBaseCallbackInterface);
        }
        return null;
    }

    private QrCodeBaseHandler a(Bundle bundle, Activity activity, CommBaseCallbackInterface commBaseCallbackInterface) {
        return new ssj(activity, commBaseCallbackInterface, bundle != null ? bundle.getBoolean("isFromOut", false) : false);
    }

    private boolean j(String str) {
        return "274".equals(str);
    }

    private boolean b(String str, String str2, Bundle bundle) {
        if (!i(str)) {
            return false;
        }
        String strD = d(BleConstants.KEY_PATH, str2);
        String strD2 = d("type", str2);
        e(bundle, str, "");
        if (!"openwith".equals(strD) || !"aar".equals(strD2)) {
            return false;
        }
        LogUtil.a("QrCodeHandleManager", "return WatchFaceQrCodeHandler");
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    public static boolean c(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "31":
                b2 = 0;
                break;
            case "259":
                b2 = 1;
                break;
            case "260":
                b2 = 2;
                break;
            case "261":
                b2 = 3;
                break;
            case "264":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        return b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4;
    }

    public static boolean d(String str) {
        str.hashCode();
        return str.equals("68") || str.equals("69");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 2, list:
      (r0v0 int) from 0x000f: IF  (r0v0 int) != (49778 int)  -> B:4:0x0011 A[HIDDEN]
      (r0v0 int) from 0x0014: IF  (r0v0 int) != (49780 int)  -> B:6:0x0016 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    public static boolean b(String str) {
        byte b2;
        str.hashCode();
        if (iHashCode != 49778) {
            if (iHashCode != 49780) {
                switch (str) {
                    case "271":
                        b2 = 2;
                        break;
                    case "272":
                        b2 = 3;
                        break;
                    case "273":
                        b2 = 4;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
            } else if (str.equals(BleConstants.TYPE_FASCIA_GUN_INDEX)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("266")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        return b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4;
    }

    private static boolean h(String str) {
        if (c(str) || str.equals("262") || d(str) || b(str) || "70".equals(str) || "274".equals(str)) {
            return true;
        }
        LogUtil.a("QrCodeHandleManager", "isEcologyDeviceByType return false");
        return false;
    }

    public static String d(String str, String str2) {
        int length;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return "";
        }
        String str3 = "&" + str + "=";
        int iIndexOf = str2.indexOf(str3);
        if (iIndexOf == -1 || (length = iIndexOf + str3.length()) >= str2.length()) {
            return "";
        }
        String strSubstring = str2.substring(length);
        if (strSubstring.startsWith("&")) {
            return "";
        }
        int iIndexOf2 = strSubstring.indexOf("&");
        return (iIndexOf2 == -1 || "address".equals(str)) ? strSubstring : strSubstring.substring(0, iIndexOf2);
    }

    static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<sty> f48695a;

        c(sty styVar) {
            this.f48695a = new WeakReference<>(styVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            sty styVar;
            LogUtil.a("QrCodeHandleManager", "NetWorkChangeBroadcastReceiver onReceive Action...", intent.getAction(), ", is connect:", Boolean.valueOf(NetworkUtil.h()));
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && NetworkUtil.h() && (styVar = this.f48695a.get()) != null && styVar.e != null && styVar.e.isShowing()) {
                styVar.e.dismiss();
            }
        }
    }
}
