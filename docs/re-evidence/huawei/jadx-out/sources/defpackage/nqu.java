package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nqu extends nqp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("sortOrder")
    private int f43487b;

    @SerializedName(TypedValues.CycleType.S_WAVE_OFFSET)
    private int d;

    @SerializedName("count")
    private int e;

    public int f() {
        return this.e;
    }

    public int g() {
        return this.f43487b;
    }

    public Map h() {
        return new HashMap();
    }

    @Override // defpackage.nqp
    public String toString() {
        return "ReadDataRequest{mCount=" + this.e + ", mOffset=" + this.d + ", mSortOrder=" + this.f43487b + '}';
    }
}
