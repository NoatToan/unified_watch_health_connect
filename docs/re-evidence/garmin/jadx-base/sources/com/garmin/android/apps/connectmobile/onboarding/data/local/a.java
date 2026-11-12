package com.garmin.android.apps.connectmobile.onboarding.data.local;

import androidx.room.b0;
import androidx.room.g;
import b31.e;
import b63.u;
import bn0.h;
import c2.o3;
import c31.c;
import c31.f;
import d31.d;
import java.util.ArrayList;
import java.util.List;
import kd0.g1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/data/local/a;", "Lc31/c;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f39662d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f39663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0712a f39664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c31.a f39665c;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.onboarding.data.local.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/onboarding/data/local/a$a", "Landroidx/room/g;", "Ld31/a;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0712a extends g<d31.a> {
        public C0712a() {
        }

        @Override // androidx.room.g
        public final void a(ud.c cVar, d31.a aVar) {
            String str;
            d31.a aVar2 = aVar;
            cVar.getClass();
            aVar2.getClass();
            cVar.h(1, aVar2.f57321a);
            cVar.h(2, aVar2.f57322b);
            String str2 = aVar2.f57323c;
            if (str2 == null) {
                cVar.u(3);
            } else {
                cVar.q3(3, str2);
            }
            String str3 = aVar2.f57324d;
            if (str3 == null) {
                cVar.u(4);
            } else {
                cVar.q3(4, str3);
            }
            cVar.h(5, aVar2.f57325e);
            c31.a aVar3 = a.this.f39665c;
            d dVar = aVar2.f57326f;
            aVar3.getClass();
            cVar.q3(6, c31.a.f(dVar));
            d31.b bVar = aVar2.f57327g;
            aVar3.getClass();
            if (bVar == null || (str = bVar.f57339a) == null) {
                str = d31.b.UNKNOWN.f57339a;
            }
            cVar.q3(7, str);
            cVar.q3(8, c31.a.e(aVar2.f57328h));
            cVar.h(9, aVar2.f57329i ? 1L : 0L);
            u uVar = aVar2.f57330j;
            String string = uVar != null ? uVar.toString() : null;
            if (string == null) {
                cVar.u(10);
            } else {
                cVar.q3(10, string);
            }
            String str4 = aVar2.f57331k;
            if (str4 == null) {
                cVar.u(11);
            } else {
                cVar.q3(11, str4);
            }
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `device_onboarding_items` (`deviceId`,`deviceRegistrationSortOrder`,`deviceName`,`deviceProductNumber`,`sortOrder`,`type`,`associationType`,`status`,`coreItem`,`reminderDate`,`deviceImageUrl`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public a(b0 b0Var) {
        b0Var.getClass();
        this.f39665c = new c31.a();
        this.f39663a = b0Var;
        this.f39664b = new C0712a();
    }

    @Override // c31.c
    public final jd.g a(d31.c cVar) {
        cVar.getClass();
        c31.d dVar = new c31.d(this, cVar, 1);
        return gl.b.n(this.f39663a, false, new String[]{"device_onboarding_items"}, dVar);
    }

    @Override // c31.c
    public final Object c(long j8, d dVar, d31.c cVar, e eVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f39663a, false, true, new h(this, cVar, j8, dVar, 1), eVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // c31.c
    public final Object d(g1 g1Var) {
        return gl1.d.Q(this.f39663a, true, false, new b41.a(this, 13), g1Var);
    }

    @Override // c31.c
    public final Object e(i31.a aVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f39663a, false, true, new o3(6), aVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // c31.c
    public final Object f(long j8, ArrayList arrayList, b31.d dVar) throws Throwable {
        Object objP = gl1.d.P(this.f39663a, new f(this, j8, arrayList, null), dVar);
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    @Override // c31.c
    public final Object g(long j8, d31.c cVar, v13.c cVar2) {
        return gl1.d.Q(this.f39663a, true, false, new c31.e(j8, this, cVar, 1), cVar2);
    }

    @Override // c31.c
    public final jd.g h(long j8) {
        bb2.b bVar = new bb2.b(j8, this, 1);
        return gl.b.n(this.f39663a, false, new String[]{"device_onboarding_items"}, bVar);
    }

    @Override // c31.c
    public final Object i(long j8, v13.c cVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f39663a, false, true, new a02.a(j8, 5), cVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // c31.c
    public final Object j(List list, c31.b bVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f39663a, false, true, new bp.h(9, this, list), bVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // c31.c
    public final Object k(long j8, d dVar, v13.c cVar) {
        return gl1.d.Q(this.f39663a, true, false, new c31.e(j8, this, dVar, 0), cVar);
    }

    @Override // c31.c
    public final Object l(d31.c cVar, i iVar) {
        return gl1.d.Q(this.f39663a, true, false, new c31.d(this, cVar, 0), iVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/data/local/a$b;", "", "<init>", "()V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
