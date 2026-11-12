package zb0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzb0/j1;", "Lzb0/i1;", "Lbc1/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lbc1/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bc1.b f203542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f203543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f203544c;

    public j1(bc1.b bVar) {
        bVar.getClass();
        this.f203542a = bVar;
        this.f203543b = -1L;
    }

    @Override // zb0.i1
    public final void a() {
    }

    @Override // zb0.i1
    public final void b(p1.z<sd2.f> zVar) {
        zVar.getClass();
        if (zVar.h() > 0) {
            f12.l.f68084a.getClass();
            long jS4 = f12.l.a.a().s4();
            int iH = zVar.h();
            for (int i14 = 0; i14 < iH; i14++) {
                if (jS4 == zVar.e(i14)) {
                    this.f203543b = jS4;
                    break;
                }
            }
            if (this.f203543b == -1) {
                this.f203543b = zVar.e(0);
            }
            sd2.f fVarB = zVar.b(this.f203543b);
            this.f203544c = fVarB != null ? fVarB.getProductDisplayName() : null;
            this.f203542a.a(new hc1.b(this.f203543b, this.f203544c, fVarB != null ? fVarB.getProductNumber() : null));
        }
    }
}
