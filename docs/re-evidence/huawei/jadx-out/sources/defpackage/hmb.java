package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes9.dex */
public class hmb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("actionName")
    private String f36892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("goodCount")
    private int f36893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("cheerCount")
    private int f36894c;

    @SerializedName("finishedAct")
    private int d;

    @SerializedName("actType")
    private String e;

    @SerializedName("greatCount")
    private int f;

    @SerializedName("perfectCount")
    private int g;

    @SerializedName("missCount")
    private int i;

    @SerializedName("theoryAct")
    private int j;

    public String e() {
        return this.f36892a;
    }

    public int a() {
        return this.d;
    }

    public int j() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.f36893b;
    }

    public int b() {
        return this.f36894c;
    }

    public int h() {
        return this.i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("SingleActionSummaryBean{actionName=");
        stringBuffer.append(this.f36892a);
        stringBuffer.append(", actType=").append(this.e);
        stringBuffer.append(", finishedAct=").append(this.d);
        stringBuffer.append(", theoryAct=").append(this.j);
        stringBuffer.append(", perfectCount=").append(this.g);
        stringBuffer.append(", greatCount=").append(this.f);
        stringBuffer.append(", goodCount=").append(this.f36893b);
        stringBuffer.append(", cheerCount=").append(this.f36894c);
        stringBuffer.append(", missCount=").append(this.i);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
