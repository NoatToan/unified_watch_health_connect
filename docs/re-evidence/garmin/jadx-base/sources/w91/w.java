package w91;

import i3.fe;
import i3.se;
import l72.d3;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.l1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsNavHostKt$PersonalRecordsNavHost$2$1", f = "PersonalRecordsNavHost.kt", l = {284}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f183601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ba1.d f183602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe f183603c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp22/a;", "snackbarDataState", "", "<anonymous>", "(Lp22/a;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.navigation.PersonalRecordsNavHostKt$PersonalRecordsNavHost$2$1$1", f = "PersonalRecordsNavHost.kt", l = {287}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<p22.a, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f183604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f183605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fe f183606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ba1.d f183607d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fe feVar, ba1.d dVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f183606c = feVar;
            this.f183607d = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f183606c, this.f183607d, dVar);
            aVar.f183605b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(p22.a aVar, t13.d<? super Unit> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            e23.a<Unit> aVar;
            p22.a aVar2 = (p22.a) this.f183605b;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f183604a;
            if (i14 == 0) {
                o13.r.b(obj);
                String str = aVar2.f135022a;
                if (str != null && str.length() != 0) {
                    String str2 = aVar2.f135023b;
                    this.f183605b = aVar2;
                    this.f183604a = 1;
                    obj = d3.c(this.f183606c, str, str2, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            if (((se) obj) == se.ActionPerformed && (aVar = aVar2.f135024c) != null) {
                aVar.invoke();
            }
            o22.b bVar = this.f183607d.f16983i;
            ge1.b.T(bVar.f128680b, null, null, new o22.a(bVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ba1.d dVar, fe feVar, t13.d<? super w> dVar2) {
        super(2, dVar2);
        this.f183602b = dVar;
        this.f183603c = feVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f183602b, this.f183603c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f183601a;
        if (i14 == 0) {
            o13.r.b(obj);
            ba1.d dVar = this.f183602b;
            l1 l1Var = new l1(dVar.f16996x);
            a aVar2 = new a(this.f183603c, dVar, null);
            this.f183601a = 1;
            if (r53.s.k(l1Var, aVar2, this) == aVar) {
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
