package db2;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;
import r53.s;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.framework.datamanagement.provider.util.EmergencyContactAlertsCache$observeCardAllowedToShow$1", f = "EmergencyContactAlertsCache.kt", l = {41, 42}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<t<? super Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f59094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f59095b;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @e(c = "com.garmin.android.framework.datamanagement.provider.util.EmergencyContactAlertsCache$observeCardAllowedToShow$1$1", f = "EmergencyContactAlertsCache.kt", l = {43}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<Unit, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f59096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t<Boolean> f59097b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(t<? super Boolean> tVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f59097b = tVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f59097b, dVar);
        }

        @Override // e23.p
        public final Object invoke(Unit unit, t13.d<? super Unit> dVar) {
            return ((a) create(unit, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f59096a;
            if (i14 == 0) {
                r.b(obj);
                d.f59098a.getClass();
                Boolean boolValueOf = Boolean.valueOf(d.a());
                this.f59096a = 1;
                if (this.f59097b.h(boolValueOf, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public c(t13.d<? super c> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(dVar);
        cVar.f59095b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super Boolean> tVar, t13.d<? super Unit> dVar) {
        return ((c) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (r53.s.k(r6, r4, r5) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t tVar = (t) this.f59095b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f59094a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        d.f59098a.getClass();
        Boolean boolValueOf = Boolean.valueOf(d.a());
        this.f59095b = tVar;
        this.f59094a = 1;
        if (tVar.h(boolValueOf, this) != aVar) {
        }
        return aVar;
        d.f59099b.getClass();
        r53.b bVarF = s.f(new b(null));
        a aVar2 = new a(tVar, null);
        this.f59095b = null;
        this.f59094a = 2;
    }
}
