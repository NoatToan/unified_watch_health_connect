package com.garmin.android.apps.connectmobile.webtranslation;

import androidx.room.b0;
import androidx.room.g;
import i3.bf;
import i42.d;
import i42.e;
import i42.f;
import i42.h;
import i42.i;
import i42.j;
import i42.k;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/webtranslation/b;", "Li42/h;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "c", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f47973e = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f47974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f47975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0936b f47976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.webtranslation.c.b f47977d;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/webtranslation/b$a", "Landroidx/room/g;", "Li42/e;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends g<e> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, e eVar) {
            e eVar2 = eVar;
            cVar.getClass();
            eVar2.getClass();
            cVar.h(1, eVar2.f90991a);
            cVar.q3(2, eVar2.f90992b);
            cVar.q3(3, eVar2.f90993c);
            cVar.q3(4, eVar2.f90994d);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR ABORT INTO `translation` (`record_id`,`handle`,`text`,`hash`) VALUES (?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.webtranslation.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/webtranslation/b$b", "Landroidx/room/g;", "Li42/d;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0936b extends g<d> {
        public C0936b() {
        }

        @Override // androidx.room.g
        public final void a(ud.c cVar, d dVar) {
            d dVar2 = dVar;
            cVar.getClass();
            dVar2.getClass();
            cVar.h(1, dVar2.f90987a);
            com.garmin.android.apps.connectmobile.webtranslation.c.b bVar = b.this.f47977d;
            String str = dVar2.f90988b;
            bVar.getClass();
            str.getClass();
            cVar.q3(2, str);
            cVar.q3(3, dVar2.f90989c);
            cVar.q3(4, dVar2.f90990d);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR ABORT INTO `installation_record` (`id`,`locale`,`version_name`,`tag`) VALUES (nullif(?, 0),?,?,?)";
        }
    }

    public b(b0 b0Var) {
        b0Var.getClass();
        this.f47977d = new com.garmin.android.apps.connectmobile.webtranslation.c.b();
        this.f47974a = b0Var;
        this.f47975b = new a();
        this.f47976c = new C0936b();
    }

    @Override // i42.h
    public final Object a(String str, i42.c cVar) {
        return gl1.d.Q(this.f47974a, true, false, new i(this, str, 1), cVar);
    }

    @Override // i42.h
    public final Object b(String str, String str2, String str3, i42.b bVar) {
        return gl1.d.P(this.f47974a, new k(this, str, str2, str3, null), bVar);
    }

    @Override // i42.h
    public final Object c(String str, i42.c cVar) {
        return gl1.d.Q(this.f47974a, true, false, new i(this, str, 0), cVar);
    }

    @Override // i42.h
    public final Object e(long j8, i42.g gVar) {
        return gl1.d.Q(this.f47974a, true, false, new a02.a(j8, 22), gVar);
    }

    @Override // i42.h
    public final Object f(String str, f fVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f47974a, false, true, new i11.g(str, 17), fVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // i42.h
    public final Object g(ArrayList arrayList, f fVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f47974a, false, true, new hy.h(9, this, arrayList), fVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // i42.h
    public final Object h(String str, String str2, String str3, i42.g gVar) {
        return gl1.d.Q(this.f47974a, true, false, new ev2.f(str, this, str2, str3, 11), gVar);
    }

    @Override // i42.h
    public final Object i(t13.d<? super Unit> dVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f47974a, false, true, new bf(12), dVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // i42.h
    public final Object k(String str, String str2, String str3, ArrayList arrayList, i42.a aVar) throws Throwable {
        Object objP = gl1.d.P(this.f47974a, new j(this, str, str2, str3, arrayList, null), aVar);
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    @Override // i42.h
    public final Object l(d dVar, f fVar) {
        return gl1.d.Q(this.f47974a, false, true, new hy.h(10, this, dVar), fVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/webtranslation/b$c;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
