package dj2;

import ch.qos.logback.classic.Logger;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository$addAddressWithPhoneNumber$2", f = "CustomerManagementRepository.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f60010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<l1> f60011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<fj2.h> f60012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj2.a f60013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gj2.d f60014e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository$addAddressWithPhoneNumber$2$1", f = "CustomerManagementRepository.kt", l = {258}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p005kotlin.jvm.internal.r0 f60015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f60016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<fj2.h> f60017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ dj2.a f60018d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ gj2.d f60019e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p005kotlin.jvm.internal.r0<fj2.h> r0Var, dj2.a aVar, gj2.d dVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f60017c = r0Var;
            this.f60018d = aVar;
            this.f60019e = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f60017c, this.f60018d, this.f60019e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            p005kotlin.jvm.internal.r0<fj2.h> r0Var;
            T t7;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f60016b;
            dj2.a aVar2 = this.f60018d;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    p005kotlin.jvm.internal.r0<fj2.h> r0Var2 = this.f60017c;
                    gj2.d dVar = this.f60019e;
                    this.f60015a = r0Var2;
                    this.f60016b = 1;
                    Object objD = aVar2.d(dVar, this);
                    if (objD == aVar) {
                        return aVar;
                    }
                    r0Var = r0Var2;
                    t7 = objD;
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r0Var = this.f60015a;
                    o13.r.b(obj);
                    t7 = obj;
                }
                r0Var.f105810a = t7;
                return Unit.INSTANCE;
            } catch (Exception e4) {
                ((Logger) aVar2.f59960d.getValue()).error("Error adding phone number: " + e4);
                throw e4;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p005kotlin.jvm.internal.r0<l1> r0Var, p005kotlin.jvm.internal.r0<fj2.h> r0Var2, dj2.a aVar, gj2.d dVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f60011b = r0Var;
        this.f60012c = r0Var2;
        this.f60013d = aVar;
        this.f60014e = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f60011b, this.f60012c, this.f60013d, this.f60014e, dVar);
        eVar.f60010a = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, o53.c2] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f60010a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f60011b.f105810a = ge1.b.T(b0Var, null, null, new a(this.f60012c, this.f60013d, this.f60014e, null), 3);
        return Unit.INSTANCE;
    }
}
