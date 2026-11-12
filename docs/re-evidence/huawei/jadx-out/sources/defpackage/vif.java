package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class vif {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mWeightBean")
    private dnb f51148b;

    @SerializedName("mTypeList")
    private List<Integer> d;

    @SerializedName("mUserBirthDay")
    private int e;

    public List<Integer> d() {
        return this.d;
    }

    public dnb b() {
        return this.f51148b;
    }

    public int e() {
        return this.e;
    }

    public String toString() {
        return "PeerComparisionParam{mWeightBean=" + this.f51148b + ", userBirthDay=" + this.e + '}';
    }
}
