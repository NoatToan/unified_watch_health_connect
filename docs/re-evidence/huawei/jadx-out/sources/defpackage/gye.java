package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gye extends gyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("name")
    private String f36223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("status")
    private int f36224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(UpdateKey.MARKET_DLD_STATUS)
    private int f36225c;

    @SerializedName("index")
    private int d = -1;

    @SerializedName("templateTypeList")
    private List<String> e;

    @SerializedName("thumbnail")
    private String g;

    @SerializedName("thumbnailPath")
    private String h;

    @SerializedName("thumbnailSize")
    private int i;

    public String d() {
        return this.f36223a;
    }

    public String a() {
        return this.g;
    }

    public int i() {
        return this.i;
    }

    public String h() {
        return this.h;
    }

    public void c(String str) {
        this.h = str;
    }

    public int b() {
        return this.f36225c;
    }

    public void b(int i) {
        this.f36225c = i;
    }

    public int c() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public List<String> e() {
        return this.e;
    }
}
