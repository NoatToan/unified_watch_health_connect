package defpackage;

import com.huawei.health.trusport_ee.Sex;
import com.huawei.operation.utils.Constants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes32.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/huawei/health/trusport_ee/Profile;", "", "age", "", "height", "", "weight", "sex", "Lcom/huawei/health/trusport_ee/Sex;", "<init>", "(IFFLcom/huawei/health/trusport_ee/Sex;)V", "getAge", "()I", "getHeight", "()F", "getWeight", "getSex", "()Lcom/huawei/health/trusport_ee/Sex;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", WatchFaceConstant.HASHCODE, "toString", "", "trusport_ee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ima {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Sex f37809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f37810c;
    private final int d;
    private final float e;

    public ima(int i, float f, float f2, Sex sex) {
        zcp.c(sex, "");
        this.d = i;
        this.f37810c = f;
        this.e = f2;
        this.f37809b = sex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getF37810c() {
        return this.f37810c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Sex getF37809b() {
        return this.f37809b;
    }

    public String toString() {
        return "Profile(age=" + this.d + ", height=" + this.f37810c + ", weight=" + this.e + ", sex=" + this.f37809b + Constants.RIGHT_BRACKET_ONLY;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.d) * 31) + Float.hashCode(this.f37810c)) * 31) + Float.hashCode(this.e)) * 31) + this.f37809b.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ima)) {
            return false;
        }
        ima imaVar = (ima) other;
        return this.d == imaVar.d && Float.compare(this.f37810c, imaVar.f37810c) == 0 && Float.compare(this.e, imaVar.e) == 0 && this.f37809b == imaVar.f37809b;
    }
}
