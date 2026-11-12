package vi2;

import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;
import sc2.m;
import ui2.f;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lui2/f;", "Lri2/a;", "<anonymous>", "(Lo53/b0;)Lui2/f;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.auth.cmc.domain.ChildRegistrationUseCase$invoke$2", f = "ChildRegistrationUseCase.android.kt", l = {36}, m = "invokeSuspend")
public final class a extends i implements p<b0, t13.d<? super f<? extends ri2.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f178431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qi2.c f178432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f178433c;

    /* JADX INFO: renamed from: vi2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lui2/f;", "Lri2/a;", "<anonymous>", "()Lui2/f;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.auth.cmc.domain.ChildRegistrationUseCase$invoke$2$1", f = "ChildRegistrationUseCase.android.kt", l = {37}, m = "invokeSuspend")
    public static final class C3333a extends i implements l<t13.d<? super f<? extends ri2.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f178434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qi2.c f178435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f178436c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3333a(qi2.c cVar, String str, t13.d<? super C3333a> dVar) {
            super(1, dVar);
            this.f178435b = cVar;
            this.f178436c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new C3333a(this.f178435b, this.f178436c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super f<? extends ri2.a>> dVar) {
            return ((C3333a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f178434a;
            if (i14 == 0) {
                r.b(obj);
                re2.b bVar = re2.b.f152215a;
                this.f178434a = 1;
                obj = re2.b.o(bVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            m mVar = (m) obj;
            if (mVar == null || (str = mVar.f158528b) == null) {
                q2.u("failed to get DI access token");
                return null;
            }
            ve2.e eVarValueOf = ve2.e.valueOf(this.f178435b.f144948a.name());
            re2.b.f152215a.getClass();
            return (f) ge1.b.W(t13.h.f161748a, new ui2.b(new ui2.c(this.f178436c, eVarValueOf, str, re2.b.m().f177764e), null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qi2.c cVar, String str, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f178432b = cVar;
        this.f178433c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f178432b, this.f178433c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super f<? extends ri2.a>> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178431a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        C3333a c3333a = new C3333a(this.f178432b, this.f178433c, null);
        this.f178431a = 1;
        Object objA = ui2.e.a(c3333a, this);
        return objA == aVar ? aVar : objA;
    }
}
