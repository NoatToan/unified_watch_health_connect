package defpackage;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mck {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41420c;
    private String[] e;

    public int e() {
        return this.f41419b;
    }

    public String d() {
        return this.f41420c;
    }

    public String[] b() {
        String[] strArr = this.e;
        if (strArr != null) {
            return (String[]) strArr.clone();
        }
        LogUtil.d("ApduCardBean", "swInfos is null");
        return null;
    }
}
