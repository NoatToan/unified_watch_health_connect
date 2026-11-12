package f5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf5/m;", "Lf5/l2;", "", "maxSlotsToRetainForReuse", "<init>", "(I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f69006a;

    public m(int i14) {
        this.f69006a = i14;
    }

    @Override // f5.l2
    public final void a(l2.a aVar) {
        int i14;
        p1.r0<Object> r0Var = aVar.f69005a;
        int i15 = r0Var.f134689g;
        int i16 = this.f69006a;
        if (i15 > i16) {
            long[] jArr = r0Var.f134685c;
            int i17 = r0Var.f134686d;
            while (i17 != Integer.MAX_VALUE && (i14 = r0Var.f134689g) > i16 && i14 != 0) {
                int i18 = (int) (jArr[i17] & 2147483647L);
                r0Var.h(i17);
                i17 = i18;
            }
        }
    }

    @Override // f5.l2
    public final boolean b(Object obj, Object obj2) {
        return true;
    }
}
