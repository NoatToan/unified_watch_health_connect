package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;

/* JADX INFO: loaded from: classes28.dex */
public class ffa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(SocialConstants.PARAM_APP_DESC)
    private String f33976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("id")
    private String f33977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("extend")
    private String f33978c;

    @SerializedName("effect")
    private String d;

    @SerializedName("comment")
    private String e;

    @SerializedName(TypedValues.CycleType.S_WAVE_PERIOD)
    private String f;

    @SerializedName("name")
    private String g;

    @SerializedName("target")
    private String h;

    @SerializedName("targetDataType")
    private String i;

    @SerializedName("targetDataExp")
    private String j;

    public String toString() {
        return "HealthInterventionDimension{mId=" + this.f33977b + ", mName=" + this.g + ", mTarget=" + this.h + ", mDesc=" + this.f33976a + ", mEffect=" + this.d + ", mComment=" + this.e + ", mTargetDataType=" + this.i + ", mTargetDataExp=" + this.j + ", mPeriod=" + this.f + ", mExtend=" + this.f33978c + "}";
    }
}
