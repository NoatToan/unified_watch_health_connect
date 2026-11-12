package defpackage;

import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class nji implements Serializable, TimeSequence {
    private static final long serialVersionUID = -6708196578480318759L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f43087b;
    private float d;

    public nji() {
    }

    public nji(long j, float f) {
        this.f43087b = j;
        this.d = f;
    }

    public void d(long j) {
        this.f43087b = j;
    }

    public void c(float f) {
        this.d = f;
    }

    public float c() {
        return this.d;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.f43087b;
    }
}
