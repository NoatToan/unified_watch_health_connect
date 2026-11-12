package defpackage;

import android.text.TextUtils;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hms.network.embedded.u3;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;

/* JADX INFO: loaded from: classes17.dex */
public class sth extends QrCodeDataBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48671b;
    private String d;

    public sth(String str) {
        super(str);
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase
    public int parser(Object obj) {
        if (!(obj instanceof String)) {
            LogUtil.e("ThirdEcgQrCodeData", "mQrCodeDataBase is null.");
            return -3;
        }
        String str = (String) obj;
        this.f48671b = sty.d(FitRunPlayAudio.OPPORTUNITY_M, str);
        this.d = sty.d(u3.m, str);
        if (!TextUtils.isEmpty(this.f48671b) && !TextUtils.isEmpty(this.d)) {
            return 0;
        }
        LogUtil.e("ThirdEcgQrCodeData", "mMac or mSmartProductId is null");
        return -2;
    }

    public String b() {
        return this.f48671b;
    }

    public String a() {
        return this.d;
    }
}
