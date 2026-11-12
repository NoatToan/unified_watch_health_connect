package m82;

import e23.p;
import e23.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.k2;
import p3.p0;
import r53.r1;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp3/k2;", "Lq82/b$a;", "", "<anonymous>", "(Lp3/k2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.ui.patterns.pager.PagerStateRangeControlState$observePageChangesAsState$1$1", f = "PagerStateRangeControlState.kt", l = {39}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<k2<q82.b.a>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f117202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f117203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f117204c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "currentPageIndex", "", "canScrollBackward", "canScrollForward", "Lq82/b$a;", "<anonymous>", "(IZZ)Lq82/b$a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.patterns.pager.PagerStateRangeControlState$observePageChangesAsState$1$1$4", f = "PagerStateRangeControlState.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements r<Integer, Boolean, Boolean, t13.d<? super q82.b.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ int f117205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f117206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f117207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f117208d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, t13.d<? super a> dVar) {
            super(4, dVar);
            this.f117208d = jVar;
        }

        @Override // e23.r
        public final Object invoke(Integer num, Boolean bool, Boolean bool2, t13.d<? super q82.b.a> dVar) {
            int iIntValue = num.intValue();
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            a aVar = new a(this.f117208d, dVar);
            aVar.f117205a = iIntValue;
            aVar.f117206b = zBooleanValue;
            aVar.f117207c = zBooleanValue2;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            int i14 = this.f117205a;
            boolean z14 = this.f117206b;
            boolean z15 = this.f117207c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return new q82.b.a(this.f117208d.f117211b.a(new Integer(i14)), !z14, !z15);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k2<q82.b.a> f117209a;

        public b(k2<q82.b.a> k2Var) {
            this.f117209a = k2Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            this.f117209a.setValue((q82.b.a) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f117204c = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f117204c, dVar);
        iVar.f117203b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(k2<q82.b.a> k2Var, t13.d<? super Unit> dVar) {
        return ((i) create(k2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        k2 k2Var = (k2) this.f117203b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f117202a;
        if (i14 == 0) {
            o13.r.b(obj);
            final int i15 = 0;
            final j jVar = this.f117204c;
            final int i16 = 1;
            final int i17 = 2;
            r1 r1VarL = s.l(p0.s(new e23.a() { // from class: m82.h
                @Override // e23.a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            return Integer.valueOf(jVar.f117210a.f117196a.l());
                        case 1:
                            return Boolean.valueOf(jVar.f117210a.f117196a.e());
                        default:
                            return Boolean.valueOf(jVar.f117210a.f117196a.c());
                    }
                }
            }), p0.s(new e23.a() { // from class: m82.h
                @Override // e23.a
                public final Object invoke() {
                    switch (i16) {
                        case 0:
                            return Integer.valueOf(jVar.f117210a.f117196a.l());
                        case 1:
                            return Boolean.valueOf(jVar.f117210a.f117196a.e());
                        default:
                            return Boolean.valueOf(jVar.f117210a.f117196a.c());
                    }
                }
            }), p0.s(new e23.a() { // from class: m82.h
                @Override // e23.a
                public final Object invoke() {
                    switch (i17) {
                        case 0:
                            return Integer.valueOf(jVar.f117210a.f117196a.l());
                        case 1:
                            return Boolean.valueOf(jVar.f117210a.f117196a.e());
                        default:
                            return Boolean.valueOf(jVar.f117210a.f117196a.c());
                    }
                }
            }), new a(jVar, null));
            b bVar = new b(k2Var);
            this.f117203b = null;
            this.f117202a = 1;
            if (r1VarL.collect(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
