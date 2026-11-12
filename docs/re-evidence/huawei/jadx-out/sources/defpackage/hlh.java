package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes9.dex */
public class hlh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("beautyScore")
    private int f36874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("coordinatingScore")
    private int f36875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("balanceScore")
    private int f36876c;

    @SerializedName("softScore")
    private int d;

    @SerializedName("completionScore")
    private int e;

    @SerializedName("trickScore")
    private int j;

    public int b() {
        return this.f36876c;
    }

    public int d() {
        return this.f36875b;
    }

    public int h() {
        return this.j;
    }

    public int e() {
        return this.d;
    }

    public int c() {
        return this.f36874a;
    }

    public int a() {
        return this.e;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("CompletedActionScoreBean{balanceScore=");
        stringBuffer.append(this.f36876c);
        stringBuffer.append(", coordinatingScore=").append(this.f36875b);
        stringBuffer.append(", trickScore=").append(this.j);
        stringBuffer.append(", softScore=").append(this.d);
        stringBuffer.append(", beautyScore=").append(this.f36874a);
        stringBuffer.append(", completionScore=").append(this.e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
