package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class tth extends ttm {

    @SerializedName("newAdd")
    private int e;

    public int b() {
        return this.e;
    }

    @Override // defpackage.ttm
    public String toString() {
        return "ThreeCircleNewPointsResponse{resultCode=" + a() + ", resultDesc=" + c() + ", newAdd=" + this.e + '}';
    }
}
