package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import com.huawei.hwfoundationmodel.trackmodel.ValueSequence;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class njb implements Serializable, TimeSequence, ValueSequence {
    private static final long serialVersionUID = -9166703442296514462L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mAnalogPower")
    private int f43076a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mTime")
    private long f43077c;

    public njb() {
    }

    public njb(long j, int i) {
        this.f43077c = j;
        this.f43076a = i;
    }

    public int a() {
        return this.f43076a;
    }

    public void b(int i) {
        this.f43076a = i;
    }

    public void b(long j) {
        this.f43077c = j;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.f43077c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof njb) && ((njb) obj).f43077c == this.f43077c;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.ValueSequence
    public int acquireValue() {
        return this.f43076a;
    }
}
