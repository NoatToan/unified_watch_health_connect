package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes33.dex */
public class isb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("promotionEndTime")
    private long f38031a;

    @SerializedName("microOriginPrice")
    private long e;

    public long c() {
        return this.e;
    }

    public long a() {
        return this.f38031a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("PromotionInfo{microOriginPrice=");
        sb.append(this.e);
        sb.append(", promotionEndTime=");
        sb.append(this.f38031a);
        sb.append('}');
        return sb.toString();
    }
}
