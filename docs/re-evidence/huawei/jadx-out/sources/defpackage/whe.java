package defpackage;

import android.text.TextUtils;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.hihealthservice.hihealthkit.cpcheck.BaseRequest;

/* JADX INFO: loaded from: classes19.dex */
public class whe<T> extends BaseRequest<T> {
    private static final String e = lcy.f39930b + "/healthkit/v1/accessRecords";

    public whe(boolean z, String str, String str2) {
        this.mUrl = e;
        this.mParams.put(Wpt.MODE, z ? "read" : "write");
        if (!TextUtils.isEmpty(str)) {
            this.mParams.put("clientId", str);
        }
        this.mParams.put("lang", str2);
    }
}
