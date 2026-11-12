package defpackage;

import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import com.huawei.hwfoundationmodel.trackmodel.ValueSequence;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class njh implements Serializable, TimeSequence, ValueSequence {
    private static final long serialVersionUID = 4068195580731601439L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f43086c;
    private int e;

    public njh() {
    }

    public njh(long j, int i) {
        this.e = i;
        this.f43086c = j;
    }

    public int e() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public void b(long j) {
        this.f43086c = j;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.f43086c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof njh) && this.f43086c == ((njh) obj).f43086c;
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.ValueSequence
    public int acquireValue() {
        return this.e;
    }
}
