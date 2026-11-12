package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.db.bean.ContentResource;

/* JADX INFO: loaded from: classes37.dex */
public class lot {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(ContentResource.FILE_NAME)
    private String f40571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bizType")
    private int f40572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("bizSubType")
    private int f40573c;

    @SerializedName("fileSha256")
    private String d;

    @SerializedName("fileSize")
    private int e;

    @SerializedName("fileType")
    private int g;

    public void b(int i) {
        this.f40572b = i;
    }

    public void d(int i) {
        this.f40573c = i;
    }

    public void a(String str) {
        this.f40571a = str;
    }

    public void c(int i) {
        this.g = i;
    }

    public void d(String str) {
        this.d = str;
    }

    public void e(int i) {
        this.e = i;
    }

    public String toString() {
        return "FileInfo{bizType=" + this.f40572b + ", bizSubType=" + this.f40573c + ", fileName='" + this.f40571a + "', fileType=" + this.g + ", fileSha256='" + this.d + "', fileSize=" + this.e + '}';
    }
}
