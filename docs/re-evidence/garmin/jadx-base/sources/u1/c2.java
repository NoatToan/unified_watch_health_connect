package u1;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lu1/c2;", "Lh5/c0;", "Lh5/y1;", "Lh4/r$c;", "Lu1/d2;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "reverseScrolling", "isVertical", "<init>", "(Lu1/d2;ZZ)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c2 extends h4.r.c implements h5.c0, h5.y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d2 f167421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f167422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f167423c;

    public c2(d2 d2Var, boolean z14, boolean z15) {
        this.f167421a = d2Var;
        this.f167422b = z14;
        this.f167423c = z15;
    }

    @Override // h5.y1
    public final void D1(p5.k0 k0Var) {
        p5.h0.D(k0Var);
        final int i14 = 0;
        final int i15 = 1;
        p5.n nVar = new p5.n(new e23.a(this) { // from class: u1.b2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c2 f167412b;

            {
                this.f167412b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int intValue;
                switch (i14) {
                    case 0:
                        intValue = this.f167412b.f167421a.f167433a.getIntValue();
                        break;
                    default:
                        intValue = this.f167412b.f167421a.f167437e.getIntValue();
                        break;
                }
                return Float.valueOf(intValue);
            }
        }, new e23.a(this) { // from class: u1.b2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c2 f167412b;

            {
                this.f167412b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int intValue;
                switch (i15) {
                    case 0:
                        intValue = this.f167412b.f167421a.f167433a.getIntValue();
                        break;
                    default:
                        intValue = this.f167412b.f167421a.f167437e.getIntValue();
                        break;
                }
                return Float.valueOf(intValue);
            }
        }, this.f167422b);
        if (this.f167423c) {
            p5.h0.F(k0Var, nVar);
        } else {
            p5.h0.r(k0Var, nVar);
        }
    }

    @Override // h5.c0
    public final int maxIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        if (!this.f167423c) {
            i14 = Integer.MAX_VALUE;
        }
        return wVar.a0(i14);
    }

    @Override // h5.c0
    public final int maxIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        if (this.f167423c) {
            i14 = Integer.MAX_VALUE;
        }
        return wVar.l0(i14);
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        n.g(this.f167423c ? p008y1.b2.Vertical : p008y1.b2.Horizontal, j8);
        f5.v1 v1VarQ = y0Var.Q(g6.a.c(0, this.f167423c ? g6.a.j(j8) : Integer.MAX_VALUE, 0, this.f167423c ? Integer.MAX_VALUE : g6.a.i(j8), 5, j8));
        int i14 = v1VarQ.f69144a;
        int iJ = g6.a.j(j8);
        if (i14 > iJ) {
            i14 = iJ;
        }
        int i15 = v1VarQ.f69145b;
        int i16 = g6.a.i(j8);
        if (i15 > i16) {
            i15 = i16;
        }
        int i17 = v1VarQ.f69145b - i15;
        int i18 = v1VarQ.f69144a - i14;
        if (!this.f167423c) {
            i17 = i18;
        }
        this.f167421a.f(i17);
        this.f167421a.f167434b.t(this.f167423c ? i15 : i14);
        this.f167421a.f167435c.t(this.f167423c ? v1VarQ.f69145b : v1VarQ.f69144a);
        return f5.b1.h0(b1Var, i14, i15, new ct2.e(this, i17, v1VarQ, 8));
    }

    @Override // h5.c0
    public final int minIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        if (!this.f167423c) {
            i14 = Integer.MAX_VALUE;
        }
        return wVar.e0(i14);
    }

    @Override // h5.c0
    public final int minIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        if (this.f167423c) {
            i14 = Integer.MAX_VALUE;
        }
        return wVar.O(i14);
    }
}
