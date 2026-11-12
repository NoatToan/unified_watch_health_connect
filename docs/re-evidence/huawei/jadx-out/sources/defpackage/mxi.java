package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mxi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mSysTick")
    long f42644c;

    @SerializedName("mAccDataList")
    List<Integer> d;

    @SerializedName("mPpgDataList")
    List<Integer> e;

    public void d(long j) {
        this.f42644c = j;
    }

    public void b(List<Integer> list) {
        this.d = list;
    }

    public void d(List<Integer> list) {
        this.e = list;
    }
}
