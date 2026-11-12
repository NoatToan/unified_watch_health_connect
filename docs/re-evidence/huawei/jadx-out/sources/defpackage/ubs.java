package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes43.dex */
public class ubs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("audioType")
    private int f49907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("detailJumpUrl")
    private String f49908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("heatCount")
    private int f49909c;

    @SerializedName("audioUrl")
    private String d;

    @SerializedName("backGroundImg")
    private String e;

    @SerializedName("id")
    private int f;

    @SerializedName("labelType")
    private int g;

    @SerializedName("infoType")
    private String h;

    @SerializedName("imgIcon")
    private String i;

    @SerializedName(ParsedFieldTag.TASK_MODIFY_TIME)
    private long j;

    @SerializedName(Constants.SHARE_TITLE)
    private String k;

    @SerializedName("shareDescription")
    private String l;

    @SerializedName("name")
    private String m;

    @SerializedName("shareIcon")
    private String n;

    @SerializedName("status")
    private int o;

    @SerializedName("isVip")
    private int p;

    @SerializedName("weight")
    private int t;

    public String b() {
        return this.f49908b;
    }

    public int e() {
        return this.f49909c;
    }

    public String a() {
        return this.i;
    }

    public int f() {
        return this.g;
    }

    public String g() {
        return this.m;
    }

    public int i() {
        return this.p;
    }

    public String c() {
        return this.h;
    }

    public int d() {
        return this.f;
    }

    public String toString() {
        return "SleepAudiosModel{mAudioType=" + this.f49907a + ", mAudioUrl='" + this.d + "', mBackGroundImg='" + this.e + "', mHeatCount=" + this.f49909c + ", mId=" + this.f + ", mImgIcon='" + this.i + "', mLabelType=" + this.g + ", mModifyTime=" + this.j + ", mName='" + this.m + "', mShareDescription='" + this.l + "', mShareIcon='" + this.n + "', mShareTitle='" + this.k + "', mStatus=" + this.o + ", mWeight=" + this.t + ", mDetailJumpUrl='" + this.f49908b + "', mInfoType='" + this.h + "'}";
    }
}
