package defpackage;

import com.huawei.operation.utils.Constants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes32.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/huawei/health/trusport_ee/Result;", "", "total", "", "active", "resting", "<init>", "(FFF)V", "getTotal", "()F", "getActive", "getResting", "component1", "component2", "component3", "copy", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "", "trusport_ee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class imc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f37814a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f37815c;
    private final float d;

    public imc(float f, float f2, float f3) {
        this.d = f;
        this.f37814a = f2;
        this.f37815c = f3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getF37814a() {
        return this.f37814a;
    }

    public String toString() {
        return "Result(total=" + this.d + ", active=" + this.f37814a + ", resting=" + this.f37815c + Constants.RIGHT_BRACKET_ONLY;
    }

    public int hashCode() {
        return (((Float.hashCode(this.d) * 31) + Float.hashCode(this.f37814a)) * 31) + Float.hashCode(this.f37815c);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof imc)) {
            return false;
        }
        imc imcVar = (imc) other;
        return Float.compare(this.d, imcVar.d) == 0 && Float.compare(this.f37814a, imcVar.f37814a) == 0 && Float.compare(this.f37815c, imcVar.f37815c) == 0;
    }
}
