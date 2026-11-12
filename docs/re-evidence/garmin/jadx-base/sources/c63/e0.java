package c63;

import com.roomorama.caldroid.CaldroidFragment;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc63/e0;", "Lc63/l1;", "Lg63/c;", "", CaldroidFragment.YEAR, "monthNumber", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 implements l1, g63.c<e0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f24963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f24964b;

    public /* synthetic */ e0(Integer num, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2);
    }

    @Override // g63.c
    public final e0 copy() {
        return new e0(this.f24963a, this.f24964b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return p005kotlin.jvm.internal.s.g(this.f24963a, e0Var.f24963a) && p005kotlin.jvm.internal.s.g(this.f24964b, e0Var.f24964b);
    }

    @Override // c63.l1
    /* JADX INFO: renamed from: getYear, reason: from getter */
    public final Integer getF24963a() {
        return this.f24963a;
    }

    public final int hashCode() {
        Integer num = this.f24963a;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f24964b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // c63.l1
    public final void m(Integer num) {
        this.f24964b = num;
    }

    @Override // c63.l1
    public final void o(Integer num) {
        this.f24963a = num;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        Object obj = this.f24963a;
        if (obj == null) {
            obj = "??";
        }
        sb3.append(obj);
        sb3.append('-');
        Integer num = this.f24964b;
        sb3.append(num != null ? num : "??");
        return sb3.toString();
    }

    @Override // c63.l1
    /* JADX INFO: renamed from: x, reason: from getter */
    public final Integer getF24964b() {
        return this.f24964b;
    }

    public e0(Integer num, Integer num2) {
        this.f24963a = num;
        this.f24964b = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
