package defpackage;

import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;

/* JADX INFO: loaded from: classes15.dex */
public class qfh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("equivalentInfo")
    private String f46108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(SocialConstants.PARAM_APP_DESC)
    private String f46109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("status")
    private int f46110c;

    @SerializedName("index")
    private int d;

    @SerializedName("objectiveType")
    private int e;

    @SerializedName("value")
    private String h;

    public qfh() {
    }

    public qfh(int i, int i2, String str) {
        this.d = i;
        this.f46110c = i2;
        this.h = str;
    }

    public int a() {
        return this.d;
    }

    public int e() {
        return this.f46110c;
    }

    public void d(int i) {
        this.f46110c = i;
    }

    public String d() {
        return this.h;
    }

    public void a(String str) {
        this.h = str;
    }

    public String toString() {
        return "ObjectiveResult{mIndex=" + this.d + ", status=" + this.f46110c + ", objectiveType=" + this.e + ", mDesc='" + this.f46109b + "', value='" + this.h + "', equivalentInfo='" + this.f46108a + "'}";
    }
}
