package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qdq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("domains")
    private List<String> f46026a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("cardId")
    private int f46027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("cardErrorCode")
    private int f46028c;

    @SerializedName("cardType")
    private String d;

    @SerializedName("data")
    private qdr e;

    @SerializedName("timeScope")
    private String g;

    @SerializedName("featureName")
    private String h;

    @SerializedName("generationTime")
    private long i;

    public int b() {
        return this.f46027b;
    }

    public String e() {
        return this.g;
    }

    public String a() {
        return this.d;
    }

    public qdr c() {
        return this.e;
    }

    public String toString() {
        return "DomainCard{mCardErrorCode=" + this.f46028c + ", mCardId=" + this.f46027b + ", mGenerationTime=" + this.i + ", mFeatureName=" + this.h + ", mTimeScope=" + this.g + ", mCardType=" + this.d + ", mDomainsList=" + this.f46026a + ", mData=" + this.e + '}';
    }
}
