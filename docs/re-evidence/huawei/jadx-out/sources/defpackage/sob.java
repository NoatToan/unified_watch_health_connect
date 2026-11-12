package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class sob {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("resultCode")
    private String f48450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("resultDesc")
    private String f48451c;

    @SerializedName("audioWorkoutList")
    private List<snk> d;

    @SerializedName("audioTopicList")
    private List<snf> e;

    public String e() {
        return this.f48450b;
    }

    public String a() {
        return this.f48451c;
    }

    public List<snk> b() {
        return this.d;
    }

    public String toString() {
        return "UserBehaviorListRsp{resultCode='" + this.f48450b + "', resultDesc='" + this.f48451c + "', audioWorkoutList=" + this.d + ", audioTopicList=" + this.e + '}';
    }
}
