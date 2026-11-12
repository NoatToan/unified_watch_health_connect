package com.garmin.android.apps.connectmobile.onboarding.data.local;

import androidx.room.b0;
import androidx.room.g;
import b31.l;
import b63.u;
import bp.h;
import c2.o3;
import c31.i;
import c31.j;
import c31.k;
import d31.d;
import d31.e;
import d31.f;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ud.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/data/local/b;", "Lc31/j;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0713b f39667d = new C0713b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f39668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f39669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c31.a f39670c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/onboarding/data/local/b$a", "Landroidx/room/g;", "Ld31/f;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends g<f> {
        public a() {
        }

        @Override // androidx.room.g
        public final void a(c cVar, f fVar) {
            f fVar2 = fVar;
            cVar.getClass();
            fVar2.getClass();
            b bVar = b.this;
            c31.a aVar = bVar.f39670c;
            d dVar = fVar2.f57383a;
            aVar.getClass();
            cVar.q3(1, c31.a.f(dVar));
            c31.a aVar2 = bVar.f39670c;
            d31.c cVar2 = fVar2.f57384b;
            aVar2.getClass();
            cVar.q3(2, c31.a.e(cVar2));
            u uVar = fVar2.f57385c;
            String string = uVar != null ? uVar.toString() : null;
            if (string == null) {
                cVar.u(3);
            } else {
                cVar.q3(3, string);
            }
            e eVar = fVar2.f57386d;
            if (eVar == null) {
                cVar.u(4);
                cVar.u(5);
                cVar.u(6);
                cVar.u(7);
                cVar.u(8);
                return;
            }
            String str = eVar.f57378a;
            if (str == null) {
                cVar.u(4);
            } else {
                cVar.q3(4, str);
            }
            Long l14 = eVar.f57379b;
            if (l14 == null) {
                cVar.u(5);
            } else {
                cVar.h(5, l14.longValue());
            }
            String str2 = eVar.f57380c;
            if (str2 == null) {
                cVar.u(6);
            } else {
                cVar.q3(6, str2);
            }
            Integer num = eVar.f57381d;
            if (num == null) {
                cVar.u(7);
            } else {
                cVar.h(7, num.intValue());
            }
            Integer num2 = eVar.f57382e;
            if (num2 == null) {
                cVar.u(8);
            } else {
                cVar.h(8, num2.intValue());
            }
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `prompt_onboarding_items` (`type`,`status`,`reminderDate`,`badgeKey`,`badgePk`,`badgeUUID`,`challengeCategory`,`sharedImagePk`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    public b(b0 b0Var) {
        b0Var.getClass();
        this.f39670c = new c31.a();
        this.f39668a = b0Var;
        this.f39669b = new a();
    }

    @Override // c31.j
    public final Object a(v13.c cVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f39668a, false, true, new o3(7), cVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // c31.j
    public final Object c(d dVar, d31.c cVar, l lVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f39668a, false, true, new a4.a(this, 22, cVar, dVar), lVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // c31.j
    public final Object d(List list, i iVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f39668a, false, true, new h(11, this, list), iVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // c31.j
    public final Object e(ArrayList arrayList, b31.j jVar) throws Throwable {
        Object objP = gl1.d.P(this.f39668a, new k(this, arrayList, null), jVar);
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    @Override // c31.j
    public final Object f(d dVar, u uVar, b31.k kVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f39668a, false, true, new a4.a(this, 23, uVar, dVar), kVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // c31.j
    public final Object g(d31.c cVar, zo0.d.c cVar2) {
        return gl1.d.Q(this.f39668a, true, false, new h(10, this, cVar), cVar2);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.onboarding.data.local.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/data/local/b$b;", "", "<init>", "()V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0713b {
        public /* synthetic */ C0713b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0713b() {
        }
    }
}
