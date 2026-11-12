package defpackage;

import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class sta extends QrCodeDataBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f48661b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48662a;

    static {
        HashMap map = new HashMap(2);
        f48661b = map;
        map.put("1", "25c6df38-ca23-11e9-a32f-2a2ae2dbcce4");
        map.put("2", "8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4");
        map.put("3", "e835d102-af95-48a6-ae13-2983bc06f5c0");
        map.put("4", "b29df4e3-b1f7-4e40-960d-4cfb63ccca05");
        map.put("5", "c943c933-442e-4c34-bcd0-66597f24aaed");
    }

    public sta(String str) {
        super(str);
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase
    public int parser(Object obj) {
        if (!(obj instanceof String)) {
            LogUtil.e("R_QrCode_ScaleQrCodeData", "mQrCodeDataBase is null.");
            return -3;
        }
        String strD = sub.d(CmcdConfiguration.KEY_STREAM_TYPE, (String) obj);
        Map<String, String> map = f48661b;
        if (!map.containsKey(strD)) {
            LogUtil.e("ScaleQrCodeData", "subType not in list: ", strD);
            return -2;
        }
        String str = map.get(strD);
        this.f48662a = str;
        if (!TextUtils.isEmpty(str)) {
            return 0;
        }
        LogUtil.e("ScaleQrCodeData", "type from PRODUCT_ID_MAP return null, type is ", strD);
        return -2;
    }

    public String b() {
        return this.f48662a;
    }
}
