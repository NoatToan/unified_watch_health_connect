package q92;

import java.util.Iterator;
import java.util.List;
import o53.b0;
import o53.j0;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.data.ConsentRepository$fetchConsents$2", f = "ConsentRepository.kt", l = {625}, m = "invokeSuspend")
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f143641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f143642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f143643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<x> f143644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f143645e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.ConsentRepository$fetchConsents$2$consentCall$1", f = "ConsentRepository.kt", l = {610}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f143647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x f143648c;

        /* JADX INFO: renamed from: q92.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "com.garmin.android.consent.data.ConsentRepository$fetchConsents$2$consentCall$1$1", f = "ConsentRepository.kt", l = {611}, m = "invokeSuspend")
        public static final class C2710a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f143649a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f143650b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f143651c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ x f143652d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2710a(f fVar, x xVar, t13.d<? super C2710a> dVar) {
                super(2, dVar);
                this.f143651c = fVar;
                this.f143652d = xVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C2710a c2710a = new C2710a(this.f143651c, this.f143652d, dVar);
                c2710a.f143650b = obj;
                return c2710a;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2710a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f143649a;
                x xVar = this.f143652d;
                if (i14 == 0) {
                    o13.r.b(obj);
                    b0 b0Var = (b0) this.f143650b;
                    r92.a aVar2 = this.f143651c.f143628a;
                    String str = xVar.f143819a;
                    this.f143650b = b0Var;
                    this.f143649a = 1;
                    obj = aVar2.d(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                c83.a0 a0Var = (c83.a0) obj;
                Response response = a0Var.f25745a;
                if (response.isSuccessful()) {
                    s92.c cVar = (s92.c) a0Var.f25746b;
                    if (cVar != null) {
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentRepository", "fetchConsents(" + xVar + ") successfully " + cVar);
                        p92.o.f136619a.getClass();
                        p92.o.m().e(xVar, cVar, null);
                    }
                } else {
                    String str2 = "Error fetching consent " + xVar + " code[" + response.code() + "] " + response.message();
                    p92.y.f136664a.getClass();
                    p92.y.a.c("ConsentRepository", str2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, x xVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f143647b = fVar;
            this.f143648c = xVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f143647b, this.f143648c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143646a;
            if (i14 == 0) {
                o13.r.b(obj);
                f fVar = this.f143647b;
                o53.z zVar = fVar.f143631d.f143828c;
                C2710a c2710a = new C2710a(fVar, this.f143648c, null);
                this.f143646a = 1;
                if (ge1.b.e0(zVar, c2710a, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(List<? extends x> list, f fVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f143644d = list;
        this.f143645e = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f143644d, this.f143645e, dVar);
        hVar.f143643c = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:13:0x002a). Please report as a decompilation issue!!! */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Iterator<x> it;
        b0 b0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143642b;
        if (i14 == 0) {
            o13.r.b(obj);
            b0 b0Var2 = (b0) this.f143643c;
            it = this.f143644d.iterator();
            b0Var = b0Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = this.f143641a;
            b0Var = (b0) this.f143643c;
            try {
                o13.r.b(obj);
            } catch (Exception e4) {
                String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Error fetching consent ");
                p92.y.f136664a.getClass();
                p92.y.a.c("ConsentRepository", strD);
            }
        }
        while (it.hasNext()) {
            j0 j0VarJ = ge1.b.j(b0Var, null, null, new a(this.f143645e, it.next(), null), 3);
            this.f143643c = b0Var;
            this.f143641a = it;
            this.f143642b = 1;
            Object objC = j0VarJ.C(this);
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            if (objC == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
