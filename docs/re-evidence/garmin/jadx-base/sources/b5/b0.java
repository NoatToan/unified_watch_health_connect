package b5;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lb5/b0;", "", "<init>", "()V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.z<a> f15766a = new p1.z<>(0, 1, null);

    public final k a(c0 c0Var, kotlin.m mVar) {
        long jO;
        long j8;
        boolean z14;
        List<d0> list = c0Var.f15770a;
        p1.z zVar = new p1.z(list.size());
        int size = list.size();
        int i14 = 0;
        while (i14 < size) {
            d0 d0Var = list.get(i14);
            long j14 = d0Var.f15775a;
            p1.z<a> zVar2 = this.f15766a;
            a aVarB = zVar2.b(j14);
            if (aVarB == null) {
                j8 = d0Var.f15776b;
                jO = d0Var.f15778d;
                z14 = false;
            } else {
                long j15 = aVarB.f15767a;
                boolean z15 = aVarB.f15769c;
                jO = mVar.o(aVarB.f15768b);
                j8 = j15;
                z14 = z15;
            }
            long j16 = d0Var.f15775a;
            List<d0> list2 = list;
            int i15 = size;
            zVar.f(j16, new a0(j16, d0Var.f15776b, d0Var.f15778d, d0Var.f15779e, d0Var.f15780f, j8, jO, z14, false, d0Var.f15781g, d0Var.f15783i, d0Var.f15784j, d0Var.f15785k, d0Var.f15786l, d0Var.f15787m, null));
            boolean z16 = d0Var.f15779e;
            if (z16) {
                zVar2.f(j14, new a(d0Var.f15776b, d0Var.f15777c, z16, null));
            } else {
                zVar2.g(j14);
            }
            i14++;
            list = list2;
            size = i15;
        }
        return new k(zVar, c0Var);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lb5/b0$a;", "", "", "uptime", "Ln4/c;", "positionOnScreen", "", "down", "<init>", "(JJZLkotlin/jvm/internal/j;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f15767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f15769c;

        private a(long j8, long j14, boolean z14) {
            this.f15767a = j8;
            this.f15768b = j14;
            this.f15769c = z14;
        }

        public /* synthetic */ a(long j8, long j14, boolean z14, p005kotlin.jvm.internal.j jVar) {
            this(j8, j14, z14);
        }
    }
}
