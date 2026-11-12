package wk2;

import com.google.android.material.internal.ViewUtils;
import java.util.UUID;
import ok2.g0;
import p005kotlin.Metadata;
import pk2.x;

/* JADX INFO: loaded from: classes11.dex */
public interface i extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f185855a = a.f185856a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwk2/i$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f185856a = new a();

        private a() {
        }

        public static zk2.k a(a aVar, f fVar, d dVar, g0 g0Var, m mVar, zy2.e eVar, al2.m mVar2, g0 g0Var2, xk2.e eVar2, int i14) {
            zy2.e fVar2 = (i14 & 16) != 0 ? new zy2.f() : eVar;
            al2.m mVar3 = (i14 & 64) != 0 ? null : mVar2;
            g0 g0Var3 = (i14 & 128) != 0 ? g0Var : g0Var2;
            xk2.e eVar3 = (i14 & 256) != 0 ? null : eVar2;
            aVar.getClass();
            dVar.getClass();
            g0Var.getClass();
            mVar.getClass();
            fVar2.getClass();
            g0Var3.getClass();
            return new zk2.k(fVar, null, dVar, g0Var, mVar, fVar2.millis(), null, mVar3, null, 0, g0Var3, eVar3, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        }

        public static zk2.k b(a aVar, f fVar, e eVar, g0 g0Var, m mVar, zy2.e eVar2, qk2.b.C2737b c2737b, g0 g0Var2, int i14) {
            qk2.b.C2737b c2737b2 = (i14 & 64) != 0 ? null : c2737b;
            g0 g0Var3 = (i14 & 128) != 0 ? g0Var : g0Var2;
            aVar.getClass();
            fVar.getClass();
            eVar.getClass();
            g0Var.getClass();
            mVar.getClass();
            eVar2.getClass();
            g0Var3.getClass();
            return new zk2.k(fVar, eVar, null, g0Var, mVar, eVar2.millis(), null, c2737b2, null, 0, g0Var3, null, 2816, null);
        }
    }

    /* JADX INFO: renamed from: b */
    e getF205153c();

    /* JADX INFO: renamed from: c */
    d getF205154d();

    long d();

    Integer e(zy2.e eVar);

    /* JADX INFO: renamed from: f */
    xk2.d getF205163m();

    /* JADX INFO: renamed from: g */
    g0 getF205155e();

    String getDataType();

    h getDirection();

    UUID getId();

    /* JADX INFO: renamed from: getProgress */
    al2.m getF205159i();

    /* JADX INFO: renamed from: getResult */
    x getF205158h();

    long getTotalSize();

    /* JADX INFO: renamed from: h */
    int getF205166p();

    void i(int i14);
}
