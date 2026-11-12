package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class qfi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("monthList")
    private List<Integer> f46111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("weekDayList")
    private List<Integer> f46112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("weekList")
    private List<Integer> f46113c;

    @SerializedName("monthDayList")
    private List<Integer> d;

    @SerializedName(TypedValues.CycleType.S_WAVE_PERIOD)
    private String e;

    public qfi(String str) {
        this.e = str;
    }

    public String toString() {
        return "CyclePeriod{period='" + this.e + ", weekDayList=" + this.f46112b + ", monthDayList=" + this.d + ", weekList=" + this.f46113c + ", monthList=" + this.f46111a + '}';
    }
}
