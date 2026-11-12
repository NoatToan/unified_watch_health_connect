package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class njc implements Serializable, TimeSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mTime")
    private long f43078a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mAnalogCadence")
    private int f43079c;

    public njc() {
    }

    public njc(long j, int i) {
        this.f43078a = j;
        this.f43079c = i;
    }

    public int a() {
        return this.f43079c;
    }

    public void c(int i) {
        this.f43079c = i;
    }

    public void e(long j) {
        this.f43078a = j;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.f43078a;
    }

    public String toString() {
        return "mAnalogCadence=" + this.f43079c + ", mTime=" + this.f43078a;
    }
}
