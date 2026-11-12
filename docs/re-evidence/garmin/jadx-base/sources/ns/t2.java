package ns;

import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lns/t2;", "Lu00/b;", "Lps/k1;", "Ll22/b;", "resourceResolver", "", "isUsingMetric", "Lu00/c;", "validator", "<init>", "(Ll22/b;ZLu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t2 extends u00.b<ps.k1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f127764d;

    public /* synthetic */ t2(l22.b bVar, boolean z14, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() : z14, (i14 & 4) != 0 ? new ms.e0() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        ps.k1 k1Var = (ps.k1) obj;
        k1Var.getClass();
        c22.o3 o3Var = k1Var.f139898b;
        Double d14 = k1Var.f139897a;
        if (d14 == null || o3Var == null) {
            return d(i14);
        }
        boolean z14 = !oe2.f.H(i14, 16);
        c22.o3 o3Var2 = c22.o3.BAR;
        boolean z15 = o3Var2 == o3Var;
        if (!z15) {
            o3Var2 = c22.o3.PSI;
        }
        c22.l3.a aVar = c22.l3.f23124b;
        int iB = MathKt.b(d14.doubleValue());
        aVar.getClass();
        l22.b bVar = this.f127763c;
        String strJ0 = c22.l3.a.J0(bVar, iB, o3Var2, z15, z14);
        if (!oe2.f.H(i14, 4)) {
            return strJ0;
        }
        oi0.b bVar2 = new oi0.b(bVar, strJ0);
        bVar2.S();
        bVar2.M();
        return bVar2.f132238b;
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127763c.getString(R.string.no_value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(l22.b bVar, boolean z14, u00.c<ps.k1> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127763c = bVar;
        this.f127764d = z14;
    }
}
