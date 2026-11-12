package com.garmin.android.apps.ui.catalog.library.help;

import android.os.Build;
import android.os.Bundle;
import b.g;
import c.j;
import i3.kb;
import i82.b;
import i82.d;
import i82.e;
import java.util.ArrayList;
import java.util.List;
import ku1.l;
import lc.u0;
import oe.c;
import ot1.i;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import rx1.u;
import t72.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/ui/catalog/library/help/HelpActivity;", "Lb/g;", "<init>", "()V", "a", "", "title", "titleContentDescription", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HelpActivity extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49800a = new a(null);

    public static Unit K9(HelpActivity helpActivity) {
        super.onBackPressed();
        return Unit.INSTANCE;
    }

    public final void L9(f fVar, Bundle bundle, b bVar, m mVar, int i14) {
        Object obj;
        o0 o0Var;
        i82.a aVar;
        o0 o0VarE = mVar.E(1326159456);
        int i15 = (i14 & 6) == 0 ? ((i14 & 8) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            obj = bundle;
            i15 |= o0VarE.r(obj) ? 32 : 16;
        } else {
            obj = bundle;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(this) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n("Help");
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(null);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("navigateIconDescription", "Navigate Back");
            b92.a aVarB = c0235a.b();
            o3.b bVar2 = bVar.f92266a;
            List<oe.a> list = bVar.f92267b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof c) {
                    arrayList.add(obj2);
                }
            }
            c cVar = (c) h0.d0(arrayList);
            Object cVar2 = (s.g(cVar != null ? cVar.getState() : null, c.C2494c.f131205c) && s.g(cVar.getOrientation(), c.b.f131201b)) ? new i82.c(cVar.getBounds()) : (s.g(cVar != null ? cVar.getState() : null, c.C2494c.f131204b) && cVar.a()) ? new e(cVar.getBounds(), cVar.getOrientation()) : d.f92269a;
            int i16 = bVar2.f128751a;
            o3.c.f128753b.getClass();
            if (i16 == 0) {
                aVar = i82.a.SINGLE_PANE;
            } else if (i16 == o3.c.f128754c) {
                aVar = (!s.g(cVar2, d.f92269a) || cVar == null) ? i82.a.DUAL_PANE : i82.a.SINGLE_PANE;
            } else {
                aVar = i16 == o3.c.f128755d ? i82.a.DUAL_PANE : i82.a.SINGLE_PANE;
            }
            o0Var = o0VarE;
            kb.a(null, z3.f.c(593157412, new u(aVarB, 7, this, p1Var), o0VarE), null, null, null, 0, 0L, 0L, null, z3.f.c(1600580975, new l(fVar, obj, aVar, p1Var, p1Var2, 18), o0VarE), o0Var, 805306416, 509);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, fVar, bundle, bVar, i14, 16);
        }
    }

    @Override // b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializable;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            serializable = extras.getSerializable("TYPE", s72.d.class);
        } else {
            Object serializable2 = extras.getSerializable("TYPE");
            if (!(serializable2 instanceof s72.d)) {
                serializable2 = null;
            }
            serializable = (s72.d) serializable2;
        }
        s72.d dVar = (s72.d) serializable;
        if (dVar == null) {
            finish();
            return;
        }
        s72.c.f157863a.getClass();
        int i14 = s72.c.a.f157864a[dVar.ordinal()];
        if (i14 != 1 && i14 != 2) {
            u0.r();
        } else {
            f fVar = new f();
            j.a(this, new z3.e(-847409829, true, new s72.a(this, fVar, extras, 0)));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/ui/catalog/library/help/HelpActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_TYPE", "EXTRA_ACTION", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
