package kn0;

import b63.o;
import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lin0/d;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.healthstatus.data.repository.HealthStatusRepositoryImpl$getSummaries$2", f = "HealthStatusRepositoryImpl.kt", l = {29}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super v2<? extends List<? extends in0.d>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f105634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f105635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f105636d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lin0/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.healthstatus.data.repository.HealthStatusRepositoryImpl$getSummaries$2$1", f = "HealthStatusRepositoryImpl.kt", l = {32}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements l<t13.d<? super a0<List<? extends in0.d>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f105637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f105638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f105639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f105640d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, o oVar2, d dVar, t13.d<? super a> dVar2) {
            super(1, dVar2);
            this.f105638b = oVar;
            this.f105639c = oVar2;
            this.f105640d = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f105638b, this.f105639c, this.f105640d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<List<? extends in0.d>>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f105637a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            fz0.c cVarA = fz0.d.a(this.f105638b);
            fz0.c cVarA2 = fz0.d.a(this.f105639c);
            hn0.a aVar2 = this.f105640d.f105641a;
            this.f105637a = 1;
            Object objA = aVar2.a(cVarA, cVarA2, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, o oVar, o oVar2, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f105634b = dVar;
        this.f105635c = oVar;
        this.f105636d = oVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f105634b, this.f105635c, this.f105636d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends in0.d>>> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105633a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        o oVar = this.f105636d;
        o oVar2 = this.f105635c;
        d dVar = this.f105634b;
        a aVar2 = new a(oVar2, oVar, dVar, null);
        this.f105633a = 1;
        dVar.getClass();
        Object objJ = f0.J(dVar, aVar2, this);
        return objJ == aVar ? aVar : objJ;
    }
}
