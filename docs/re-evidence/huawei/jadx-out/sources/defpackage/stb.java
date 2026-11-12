package defpackage;

import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hms.network.embedded.u3;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes17.dex */
public class stb extends QrCodeDataBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f48665c;
    private String d;
    private String e;
    private String h;

    public stb(String str) {
        super(str);
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase
    public int parser(Object obj) {
        if (!(obj instanceof String)) {
            LogUtil.j("MeasureQrCodeData", "parser() data is null or not string type");
            return -3;
        }
        String str = (String) obj;
        String strD = sty.d(FitRunPlayAudio.OPPORTUNITY_M, str);
        String strD2 = sty.d("ble", str);
        if (TextUtils.isEmpty(strD)) {
            strD = strD2;
        }
        this.d = strD;
        this.e = sty.d("brd", str);
        this.f48663a = sty.d(u3.m, str);
        this.f48664b = sty.d(CmcdData.Factory.STREAM_TYPE_LIVE, str);
        this.f48665c = sty.d("n", str);
        this.h = sty.d(FitRunPlayAudio.PLAY_TYPE_T, str);
        boolean z = (TextUtils.isEmpty(this.d) && TextUtils.isEmpty(this.f48665c)) ? false : true;
        boolean zIsEmpty = TextUtils.isEmpty(this.f48663a);
        if (sty.d(this.h)) {
            if ("68".equals(this.h)) {
                if (TextUtils.isEmpty(this.e) || !z) {
                    return -2;
                }
                return h();
            }
            if ("69".equals(this.h)) {
                if (zIsEmpty || !z) {
                    return -2;
                }
                return h();
            }
            LogUtil.j("MeasureQrCodeData", "type is error");
        } else {
            if (!TextUtils.isEmpty(this.h) && sty.b(this.h)) {
                if (zIsEmpty || !z) {
                    return -2;
                }
                return h();
            }
            LogUtil.j("MeasureQrCodeData", "type is error");
        }
        return -2;
    }

    private int h() {
        if (f()) {
            LogUtil.a("MeasureQrCodeData", "isOversea, not allowed use!");
            return -2;
        }
        if (!CommonUtil.bi()) {
            LogUtil.a("MeasureQrCodeData", "not support this phone, return");
            return -2;
        }
        LogUtil.a("MeasureQrCodeData", "Parsing succeeded");
        return 0;
    }

    private boolean f() {
        if (LanguageUtil.al(BaseApplication.getContext()) && !Utils.o()) {
            return false;
        }
        LogUtil.a("MeasureQrCodeData", "isOverseaForIndoorEquip!");
        return true;
    }

    public String e() {
        return this.h;
    }

    public String b() {
        return this.e;
    }

    public String d() {
        return this.d;
    }

    public String c() {
        return this.f48665c;
    }

    public String a() {
        return this.f48663a;
    }

    public String g() {
        return this.f48664b;
    }
}
