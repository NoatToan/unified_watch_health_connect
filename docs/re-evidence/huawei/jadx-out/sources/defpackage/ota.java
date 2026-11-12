package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ucd.helper.android.Medal3DLogApi;

/* JADX INFO: loaded from: classes41.dex */
public class ota implements Medal3DLogApi {
    @Override // com.huawei.ucd.helper.android.Medal3DLogApi
    public void medalLogShow(String str, String str2) {
        LogUtil.a(str, str2);
    }
}
