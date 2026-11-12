package defpackage;

import android.text.TextUtils;
import com.huawei.hms.network.embedded.u3;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;

/* JADX INFO: loaded from: classes17.dex */
public class ssr extends QrCodeDataBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48643b;
    private String e;

    public ssr(String str) {
        super(str);
        this.e = "";
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase
    public int parser(Object obj) {
        if (!(obj instanceof String)) {
            LogUtil.e("ThirdVentilatorQrCodeData", "mQrCodeDataBase is null.");
            return -3;
        }
        String str = (String) obj;
        this.f48643b = sty.d("sn", str);
        this.e = sty.d("ex", str);
        this.f48642a = sty.d(u3.m, str);
        if (!TextUtils.isEmpty(this.f48643b) && !TextUtils.isEmpty(this.f48642a)) {
            return 0;
        }
        LogUtil.e("ThirdVentilatorQrCodeData", "sn or ex or pid is null");
        return -2;
    }

    public String c() {
        return this.f48643b;
    }

    public String b() {
        return this.f48642a;
    }

    public String a() {
        return this.e;
    }
}
