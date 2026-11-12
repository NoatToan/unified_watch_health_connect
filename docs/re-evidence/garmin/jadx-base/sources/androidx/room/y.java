package androidx.room;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0011\u0012BW\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012<\u0010\u000b\u001a8\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006j\u0006\u0012\u0002\b\u0003`\n¢\u0006\u0004\b\f\u0010\rBc\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u0007\u0012<\u0010\u000b\u001a8\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006j\u0006\u0012\u0002\b\u0003`\n¢\u0006\u0004\b\f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/room/y;", "Landroidx/room/a;", "Landroidx/room/c;", "config", "Landroidx/room/i0;", "openDelegate", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lt13/d;", "", "Landroidx/room/coroutines/TransactionWrapper;", "transactionWrapper", "<init>", "(Landroidx/room/c;Landroidx/room/i0;Le23/p;)V", "Lvd/d;", "supportOpenHelperFactory", "(Landroidx/room/c;Le23/l;Le23/p;)V", "b", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y extends androidx.room.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f10989i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f10990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f10991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b0.b> f10992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jd.c f10993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vd.d f10994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public vd.c f10995h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/y$a;", "Landroidx/room/i0;", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends i0 {
        public a() {
            super(-1, "", "");
        }

        @Override // androidx.room.i0
        public final void a(ud.a aVar) {
            aVar.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.i0
        public final void b(ud.a aVar) {
            aVar.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.i0
        public final void c(ud.a aVar) {
            aVar.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.i0
        public final void d(ud.a aVar) {
            aVar.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.i0
        public final void e(ud.a aVar) {
            aVar.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.i0
        public final void f(ud.a aVar) {
            aVar.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.i0
        public final i0.a g(ud.a aVar) {
            aVar.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/y$b;", "Lvd/d$a;", "", "version", "<init>", "(Landroidx/room/y;I)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends vd.d.a {
        public b(int i14) {
            super(i14);
        }

        @Override // vd.d.a
        public final void c(wd.b bVar) {
            y.this.f(new xd.a(bVar));
        }

        @Override // vd.d.a
        public final void d(wd.b bVar, int i14, int i15) {
            f(bVar, i14, i15);
        }

        @Override // vd.d.a
        public final void e(wd.b bVar) {
            xd.a aVar = new xd.a(bVar);
            y yVar = y.this;
            yVar.h(aVar);
            yVar.f10995h = bVar;
        }

        @Override // vd.d.a
        public final void f(wd.b bVar, int i14, int i15) {
            y.this.g(new xd.a(bVar), i14, i15);
        }
    }

    public y(c cVar, i0 i0Var, e23.p<? super e23.l<? super t13.d<Object>, ? extends Object>, ? super t13.d<Object>, ? extends Object> pVar) {
        int i14;
        jd.c eVar;
        cVar.getClass();
        b0.d dVar = cVar.f10776g;
        vd.d.c cVar2 = cVar.f10772c;
        ud.b bVar = cVar.f10790u;
        String str = cVar.f10771b;
        i0Var.getClass();
        pVar.getClass();
        this.f10990c = cVar;
        this.f10991d = i0Var;
        List<b0.b> list = cVar.f10774e;
        this.f10992e = list == null ? p13.j0.f134944a : list;
        if (bVar != null) {
            this.f10994g = null;
            if (bVar.b()) {
                eVar = new jd.m(new androidx.room.a.b(this, bVar), str == null ? ":memory:" : str, pVar);
            } else if (str == null) {
                eVar = new jd.e(new androidx.room.a.b(this, bVar), ":memory:", cVar.f10794y);
            } else {
                androidx.room.a.b bVar2 = new androidx.room.a.b(this, bVar);
                dVar.getClass();
                int[] iArr = androidx.room.a.c.f10716a;
                int i15 = iArr[dVar.ordinal()];
                if (i15 == 1) {
                    i14 = 1;
                } else {
                    if (i15 != 2) {
                        androidx.core.view.j.A(dVar, "Can't get max number of reader for journal mode '");
                        throw null;
                    }
                    i14 = 4;
                }
                int i16 = iArr[dVar.ordinal()];
                if (i16 != 1 && i16 != 2) {
                    androidx.core.view.j.A(dVar, "Can't get max number of writers for journal mode '");
                    throw null;
                }
                eVar = new jd.e(bVar2, str, i14, 1, cVar.f10794y);
            }
            this.f10993f = eVar;
        } else {
            if (cVar2 == null) {
                vb.h.s("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            vd.d.b.C3315b c3315b = vd.d.b.f177135f;
            Context context = cVar.f10770a;
            c3315b.getClass();
            vd.d.b.a aVarA = vd.d.b.C3315b.a(context);
            aVarA.f177142b = str;
            aVarA.f177143c = new b(i0Var.f10849a);
            vd.d dVarB = cVar2.b(aVarA.a());
            this.f10994g = dVarB;
            this.f10993f = new jd.m(new xd.b(dVarB), str == null ? ":memory:" : str, pVar);
        }
        boolean z14 = dVar == b0.d.WRITE_AHEAD_LOGGING;
        vd.d dVar2 = this.f10994g;
        if (dVar2 != null) {
            dVar2.setWriteAheadLoggingEnabled(z14);
        }
    }

    @Override // androidx.room.a
    public final List<b0.b> c() {
        return this.f10992e;
    }

    @Override // androidx.room.a
    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getF10990c() {
        return this.f10990c;
    }

    @Override // androidx.room.a
    /* JADX INFO: renamed from: e, reason: from getter */
    public final i0 getF10991d() {
        return this.f10991d;
    }

    @Override // androidx.room.a
    public final String i(String str) {
        str.getClass();
        if (str.equals(":memory:")) {
            return str;
        }
        String absolutePath = this.f10990c.f10770a.getDatabasePath(str).getAbsolutePath();
        absolutePath.getClass();
        return absolutePath;
    }

    public y(c cVar, e23.l<? super c, ? extends vd.d> lVar, e23.p<? super e23.l<? super t13.d<Object>, ? extends Object>, ? super t13.d<Object>, ? extends Object> pVar) {
        cVar.getClass();
        b0.d dVar = cVar.f10776g;
        lVar.getClass();
        pVar.getClass();
        this.f10990c = cVar;
        this.f10991d = new a();
        List<b0.b> list = cVar.f10774e;
        this.f10992e = list == null ? p13.j0.f134944a : list;
        ArrayList arrayListD0 = p13.h0.D0(list == null ? p13.j0.f134944a : list, new z(new a03.f(this, 14)));
        Context context = cVar.f10770a;
        String str = cVar.f10771b;
        vd.d.c cVar2 = cVar.f10772c;
        b0.e eVar = cVar.f10773d;
        boolean z14 = cVar.f10775f;
        Executor executor = cVar.f10777h;
        Executor executor2 = cVar.f10778i;
        Intent intent = cVar.f10779j;
        boolean z15 = cVar.f10780k;
        boolean z16 = cVar.f10781l;
        Set<Integer> set = cVar.f10782m;
        String str2 = cVar.f10783n;
        File file = cVar.f10784o;
        Callable<InputStream> callable = cVar.f10785p;
        b0.f fVar = cVar.f10786q;
        List<Object> list2 = cVar.f10787r;
        List<Object> list3 = cVar.f10788s;
        boolean z17 = cVar.f10789t;
        ud.b bVar = cVar.f10790u;
        t13.g gVar = cVar.f10791v;
        context.getClass();
        eVar.getClass();
        dVar.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        c cVar3 = new c(context, str, cVar2, eVar, arrayListD0, z14, dVar, executor, executor2, intent, z15, z16, set, str2, file, callable, fVar, list2, list3, z17, bVar, gVar);
        cVar3.f10793x = cVar.f10793x;
        cVar3.f10794y = cVar.f10794y;
        vd.d dVarInvoke = lVar.invoke(cVar3);
        this.f10994g = dVarInvoke;
        xd.b bVar2 = new xd.b(dVarInvoke);
        String str3 = cVar.f10771b;
        this.f10993f = new jd.m(bVar2, str3 == null ? ":memory:" : str3, pVar);
        boolean z18 = dVar == b0.d.WRITE_AHEAD_LOGGING;
        if (dVarInvoke != null) {
            dVarInvoke.setWriteAheadLoggingEnabled(z18);
        }
    }
}
