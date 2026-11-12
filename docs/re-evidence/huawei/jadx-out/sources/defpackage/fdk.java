package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.db.bean.ContentResource;

/* JADX INFO: loaded from: classes7.dex */
public class fdk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(ContentResource.FILE_NAME)
    protected String f33896a;

    @SerializedName("version")
    protected int d;

    public int a() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }

    public String c() {
        return this.f33896a;
    }

    public void e(String str) {
        this.f33896a = str;
    }
}
