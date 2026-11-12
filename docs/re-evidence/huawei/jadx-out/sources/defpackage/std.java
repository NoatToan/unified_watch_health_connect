package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;

/* JADX INFO: loaded from: classes17.dex */
public class std extends QrCodeDataBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48668b;

    public std(String str) {
        super(str);
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase
    public int parser(Object obj) {
        if (!(obj instanceof String)) {
            LogUtil.j("WatchFaceQrCodeData", "mQrCodeDataBase is null.");
            return -3;
        }
        String strD = sty.d("address", (String) obj);
        this.f48668b = strD;
        if (!TextUtils.isEmpty(strD)) {
            return 0;
        }
        LogUtil.j("WatchFaceQrCodeData", "mAddress is null");
        return -2;
    }

    public String c() {
        return this.f48668b;
    }
}
