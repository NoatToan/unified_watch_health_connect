package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hms.network.embedded.u3;
import com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes17.dex */
public class ssv extends QrCodeDataBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f48651c;
    private String d;
    private String e;
    private String j;

    public ssv(String str) {
        super(str);
        PluginSuggestion pluginSuggestion = PluginSuggestion.getInstance();
        if (pluginSuggestion == null) {
            return;
        }
        pluginSuggestion.init(BaseApplication.getContext());
        ive.c().setAdapter(PluginHealthTrackAdapterImpl.getInstance(BaseApplication.getContext()));
        ive.c().init(BaseApplication.getContext());
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase
    public int parser(Object obj) {
        if (!(obj instanceof String)) {
            LogUtil.j("IndoorEquipQrCodeData", "parser() data is null or not string type");
            return -3;
        }
        String str = (String) obj;
        this.e = sty.d(FitRunPlayAudio.OPPORTUNITY_M, str);
        this.f48651c = sty.d("p", str);
        this.d = sty.d("n", str);
        this.j = sty.d(FitRunPlayAudio.PLAY_TYPE_T, str);
        this.f48650b = sty.d(u3.m, str);
        this.f48649a = sty.d("ble", str);
        boolean zEquals = "1".equals(this.f48651c);
        if (!TextUtils.isEmpty(this.j) && this.j.equals("262")) {
            return 0;
        }
        boolean zEquals2 = "28L1".equals(this.f48650b);
        if ("261".equals(this.j) && zEquals2 && !TextUtils.isEmpty(this.f48649a)) {
            return 0;
        }
        boolean z = true;
        boolean z2 = sty.c(this.j) && !TextUtils.isEmpty(this.f48651c);
        if (TextUtils.isEmpty(this.e) && TextUtils.isEmpty(this.d)) {
            z = false;
        }
        if (!z2 || !z) {
            return -2;
        }
        if (!CommonUtil.bi()) {
            LogUtil.a("IndoorEquipQrCodeData", "not support this phone, return");
            return -2;
        }
        if (!CommonUtil.bg()) {
            LogUtil.a("IndoorEquipQrCodeData", "not huawei phone! API level:", Integer.valueOf(Build.VERSION.SDK_INT));
            if (!zEquals) {
                LogUtil.a("IndoorEquipQrCodeData", "is DFH and larger than android6, allowed use");
            } else {
                LogUtil.a("IndoorEquipQrCodeData", "not DFH, not allowed use!");
                return -2;
            }
        }
        LogUtil.a("IndoorEquipQrCodeData", "Parsing succeeded");
        return 0;
    }

    public String c() {
        return this.j;
    }

    public String j() {
        return this.f48651c;
    }

    public String a() {
        return this.e;
    }

    public String b() {
        return this.d;
    }

    public String e() {
        return this.f48650b;
    }

    public String d() {
        return this.f48649a;
    }
}
