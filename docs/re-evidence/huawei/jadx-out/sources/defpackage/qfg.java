package defpackage;

import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;

/* JADX INFO: loaded from: classes15.dex */
public class qfg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("equivalentRule")
    private String f46105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("goalValueMax")
    private String f46106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("condition")
    private qfe f46107c;

    @SerializedName("goalValue")
    private String d;

    @SerializedName(SocialConstants.PARAM_APP_DESC)
    private String e;

    @SerializedName("item")
    private String f;

    @SerializedName("goalValueType")
    private String g;

    @SerializedName("index")
    private int h;

    @SerializedName("goalValueMin")
    private String i;

    @SerializedName("metadata")
    private String j;

    @SerializedName("objectiveType")
    private int k;

    @SerializedName("units")
    private String n;

    public String d() {
        return this.j;
    }

    public void c(String str) {
        this.j = str;
    }

    public String e() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    public String a() {
        return this.f;
    }

    public qfe b() {
        return this.f46107c;
    }

    public String toString() {
        return "ObjectiveInfo{mIndex=" + this.h + ", mObjectiveType=" + this.k + ", mEquivalentRule='" + this.f46105a + ", mMetadata='" + this.j + ", mDesc='" + this.e + ", mGoalValue='" + this.d + ", mGoalValueType='" + this.g + ", mGoalValueMin='" + this.i + ", mGoalValueMax='" + this.f46106b + ", mUnits='" + this.n + ", mItem='" + this.f + ", mCondition=" + this.f46107c + '}';
    }
}
