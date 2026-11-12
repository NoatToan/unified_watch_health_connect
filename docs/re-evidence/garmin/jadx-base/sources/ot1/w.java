package ot1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import et1.w0;
import i3.fe;
import java.util.List;
import lc.m0;
import lc.q0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import yc.v2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lot1/w;", "Lot1/a;", "<init>", "()V", "Lpt1/o;", "detailsScreenState", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends ot1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f133841a = new w();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, b.u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((b.u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"ot1/w$b", "Lg/a;", "Landroid/net/Uri;", "", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends g.a<Uri, Unit> {
        @Override // g.a
        public final Intent a(Context context, Uri uri) {
            Uri uri2 = uri;
            context.getClass();
            uri2.getClass();
            return new Intent("android.intent.action.VIEW", uri2);
        }

        @Override // g.a
        public final /* bridge */ /* synthetic */ Unit c(int i14, Intent intent) {
            return Unit.INSTANCE;
        }
    }

    private w() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ot1.a
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, -828637621);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.r(vVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarQ.r(m0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.B(feVar) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (feVar == null) {
                vb.h.s("Snackbar host state must be passed to trail images fullscreen route");
                return;
            }
            qt1.k kVarF0 = gl1.d.f0(m0Var, o0VarQ);
            Bundle bundleA = vVar.f111888h.a();
            int i16 = bundleA != null ? bundleA.getInt("imageIndex") : 0;
            p1 p1VarC = s9.c.c(kVarF0.A, o0VarQ);
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            b bVar = new b();
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new t(8);
                o0VarQ.K(objQ);
            }
            c.q qVarC = c.w.c(bVar, (e23.l) objQ, o0VarQ, 48);
            r53.i<v2<kt1.b>> iVar = ((pt1.o) p1VarC.getF182175a()).f140914l;
            i53.d<Long, pt1.r> dVar = ((pt1.o) p1VarC.getF182175a()).f140916n;
            int i17 = ((pt1.o) p1VarC.getF182175a()).f140913k;
            boolean z14 = ((pt1.o) p1VarC.getF182175a()).f140903a;
            boolean z15 = ((pt1.o) p1VarC.getF182175a()).f140915m;
            boolean z16 = ((pt1.o) p1VarC.getF182175a()).f140910h;
            boolean z17 = ((pt1.o) p1VarC.getF182175a()).f140911i;
            pt1.n nVar = ((pt1.o) p1VarC.getF182175a()).f140922t;
            b.u uVar = (b.u) o0VarQ.A(g02.d.f74342a);
            boolean zR = o0VarQ.r(uVar);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new a(uVar);
                o0VarQ.K(objQ2);
            }
            k23.g gVar = (k23.g) objQ2;
            boolean zR2 = o0VarQ.r(kVarF0);
            Object objQ3 = o0VarQ.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new j(kVarF0, 10);
                o0VarQ.K(objQ3);
            }
            e23.l lVar = (e23.l) objQ3;
            boolean zR3 = o0VarQ.r(kVarF0);
            Object objQ4 = o0VarQ.q();
            if (zR3 || objQ4 == c2565a) {
                objQ4 = new j(kVarF0, 11);
                o0VarQ.K(objQ4);
            }
            e23.l lVar2 = (e23.l) objQ4;
            boolean zR4 = o0VarQ.r(kVarF0);
            Object objQ5 = o0VarQ.q();
            if (zR4 || objQ5 == c2565a) {
                objQ5 = new j(kVarF0, 12);
                o0VarQ.K(objQ5);
            }
            e23.l lVar3 = (e23.l) objQ5;
            boolean zR5 = o0VarQ.r(kVarF0);
            Object objQ6 = o0VarQ.q();
            if (zR5 || objQ6 == c2565a) {
                objQ6 = new j(kVarF0, 13);
                o0VarQ.K(objQ6);
            }
            e23.l lVar4 = (e23.l) objQ6;
            boolean zR6 = o0VarQ.r(qVarC);
            Object objQ7 = o0VarQ.q();
            if (zR6 || objQ7 == c2565a) {
                objQ7 = new d(qVarC, 6);
                o0VarQ.K(objQ7);
            }
            e23.l lVar5 = (e23.l) objQ7;
            boolean zR7 = o0VarQ.r(kVarF0) | o0VarQ.r(context);
            Object objQ8 = o0VarQ.q();
            if (zR7 || objQ8 == c2565a) {
                objQ8 = new k(kVarF0, context, 4);
                o0VarQ.K(objQ8);
            }
            e23.p pVar = (e23.p) objQ8;
            boolean zR8 = o0VarQ.r(kVarF0);
            Object objQ9 = o0VarQ.q();
            if (zR8 || objQ9 == c2565a) {
                objQ9 = new h(kVarF0, 18);
                o0VarQ.K(objQ9);
            }
            e23.a aVar = (e23.a) objQ9;
            boolean zR9 = o0VarQ.r(kVarF0);
            Object objQ10 = o0VarQ.q();
            if (zR9 || objQ10 == c2565a) {
                objQ10 = new h(kVarF0, 19);
                o0VarQ.K(objQ10);
            }
            e23.a aVar2 = (e23.a) objQ10;
            boolean zR10 = o0VarQ.r(kVarF0);
            Object objQ11 = o0VarQ.q();
            if (zR10 || objQ11 == c2565a) {
                objQ11 = new h(kVarF0, 17);
                o0VarQ.K(objQ11);
            }
            o0Var = o0VarQ;
            w0.b(iVar, dVar, i16, i17, false, z15, z16, z17, z14, feVar, nVar, lVar, lVar2, lVar3, lVar4, lVar5, pVar, aVar, aVar2, (e23.a) objQ11, (e23.a) gVar, o0Var, (i15 << 21) & 1879048192, 0, 16);
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, vVar, m0Var, feVar, i14, 5);
        }
    }

    @Override // ot1.a
    public final List<lc.r> b() {
        lc.u uVar = new lc.u();
        uVar.b(q0.f111838c);
        lc.t.a aVar = uVar.f111877a;
        aVar.f111872b = false;
        uVar.a(-1L);
        Unit unit = Unit.INSTANCE;
        return p13.w.c(new lc.r("imageIndex", aVar.a()));
    }
}
