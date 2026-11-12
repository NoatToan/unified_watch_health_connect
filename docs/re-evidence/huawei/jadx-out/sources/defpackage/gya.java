package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class gya extends ShareDataInfo implements Serializable {
    private static final long serialVersionUID = -3011399402555708073L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("backgroundImage")
    private int f36215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("dataWatermark")
    private int f36216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("thumbnailSize")
    private int f36217c;

    @SerializedName("sticker")
    private int d;

    @SerializedName("thumbnailUrl")
    private String e;

    public int e() {
        return this.f36215a;
    }

    public int b() {
        return this.f36216b;
    }

    public int c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public int a() {
        return this.f36217c;
    }
}
