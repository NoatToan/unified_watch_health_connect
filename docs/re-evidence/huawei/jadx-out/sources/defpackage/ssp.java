package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;

/* JADX INFO: loaded from: classes17.dex */
public class ssp extends QrCodeDataBase {
    private String e;

    public ssp(String str) {
        super(str);
    }

    public String b() {
        return this.e;
    }

    public void d(String str) {
        this.e = str;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase
    public int parser(Object obj) {
        if (!(obj instanceof String)) {
            LogUtil.e("R_QrCode_FamilyQrCodeData", "QrCodeBase is null");
            return -3;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("R_QrCode_FamilyQrCodeData", "parser dataByte is null");
            return -3;
        }
        d(str);
        return 0;
    }
}
