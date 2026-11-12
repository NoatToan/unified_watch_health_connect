package o91;

import ba1.k;
import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import qr.d0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo91/g;", "Lo91/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lm91/a;", "personalRecordsAPI", "<init>", "(Lm91/a;)V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements o91.a, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m91.a f130989a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ln91/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.data.repo.PersonalRecordsRepositoryImpl$getPersonalRecordTypes$2", f = "PersonalRecordsRepositoryImpl.kt", l = {16}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements l<t13.d<? super a0<List<? extends n91.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130990a;

        public a(t13.d<? super a> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return g.this.new a(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<List<? extends n91.b>>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130990a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            m91.a aVar2 = g.this.f130989a;
            this.f130990a = 1;
            Object objA = aVar2.a(this);
            return objA == aVar ? aVar : objA;
        }
    }

    public g(m91.a aVar) {
        aVar.getClass();
        this.f130989a = aVar;
    }

    @Override // o91.a
    public final Object a(t13.d<? super v2<? extends List<n91.b>>> dVar) {
        return f0.J(this, new a(null), dVar);
    }

    @Override // o91.a
    public final Object b(n91.a aVar, r91.b bVar) {
        return f0.J(this, new b(this, aVar, null), bVar);
    }

    @Override // o91.a
    public final Object c(long j8, v13.i iVar) {
        return f0.J(this, new c(this, j8, null), iVar);
    }

    @Override // o91.a
    public final Object d(n91.a aVar, v13.i iVar) {
        return f0.J(this, new i(this, aVar, null), iVar);
    }

    @Override // o91.a
    public final Object f(long j8, r91.h hVar) {
        return f0.J(this, new d(this, j8, null), hVar);
    }

    @Override // o91.a
    public final Object g(long j8, r91.i iVar) {
        return f0.J(this, new f(this, j8, null), iVar);
    }

    @Override // o91.a
    public final Object h(long j8, boolean z14, d0.a.b bVar) {
        return f0.J(this, new e(this, j8, z14, null), bVar);
    }

    @Override // o91.a
    public final Object i(v13.c cVar) {
        return f0.J(this, new h(this, false, true, null), cVar);
    }

    @Override // o91.a
    public final Object j(n91.b bVar, k kVar) {
        return f0.J(this, new j(this, bVar, null), kVar);
    }
}
