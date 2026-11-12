package androidx.work.impl;

import android.content.Context;
import androidx.room.b0;
import androidx.room.x;
import com.garmin.android.apps.connectmobile.R;
import df.r;
import ef.c;
import ue.b;
import ve.f;
import ve.g;
import ve.h;
import ve.i;
import ve.j;
import ve.k;
import ve.l;
import ve.m;
import ve.n;
import ve.o;
import ve.p;
import ve.q;
import ve.t0;
import ve.u0;
import ve.v0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static final t0 a(Context context, androidx.work.a aVar) {
        b0.a aVarA;
        context.getClass();
        aVar.getClass();
        c cVar = new c(aVar.f11437c);
        WorkDatabase.a aVar2 = WorkDatabase.f11475a;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        r rVar = cVar.f63931a;
        rVar.getClass();
        b bVar = aVar.f11438d;
        boolean z14 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        aVar2.getClass();
        bVar.getClass();
        if (z14) {
            int i14 = x.f10972a;
            aVarA = new b0.a(applicationContext, WorkDatabase.class, null);
            aVarA.f10732j = true;
        } else {
            aVarA = x.a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            aVarA.f10731i = new n00.b(applicationContext);
        }
        aVarA.f10729g = rVar;
        aVarA.f10727e.add(new ve.c(bVar));
        aVarA.a(j.f177571a);
        aVarA.a(new q(applicationContext, 2, 3));
        aVarA.a(k.f177572a);
        aVarA.a(l.f177574a);
        aVarA.a(new q(applicationContext, 5, 6));
        aVarA.a(m.f177575a);
        aVarA.a(n.f177576a);
        aVarA.a(o.f177577a);
        aVarA.a(new v0(applicationContext));
        aVarA.a(new q(applicationContext, 10, 11));
        aVarA.a(f.f177566a);
        aVarA.a(g.f177567a);
        aVarA.a(h.f177569a);
        aVarA.a(i.f177570a);
        aVarA.a(new q(applicationContext, 21, 22));
        aVarA.f10739q = false;
        aVarA.f10740r = true;
        aVarA.f10741s = true;
        WorkDatabase workDatabase = (WorkDatabase) aVarA.b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        af.m mVar = new af.m(applicationContext2, cVar, null, null, null, null, 60, null);
        p pVar = new p(context.getApplicationContext(), aVar, cVar, workDatabase);
        u0 u0Var = u0.f177615a;
        u0Var.getClass();
        return new t0(context.getApplicationContext(), aVar, cVar, workDatabase, u0Var.invoke(context, aVar, cVar, workDatabase, mVar, pVar), pVar, mVar);
    }
}
