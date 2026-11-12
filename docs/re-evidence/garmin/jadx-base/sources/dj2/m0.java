package dj2;

import com.garmin.customermanagementlib.CustomerManagementException;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository$updateAddressWithPhoneNumber$2", f = "CustomerManagementRepository.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f60079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<l1> f60080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<fj2.h> f60081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gj2.d f60082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dj2.a f60083e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository$updateAddressWithPhoneNumber$2$1", f = "CustomerManagementRepository.kt", l = {282}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p005kotlin.jvm.internal.r0 f60084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f60085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<fj2.h> f60086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ gj2.d f60087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ dj2.a f60088e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p005kotlin.jvm.internal.r0<fj2.h> r0Var, gj2.d dVar, dj2.a aVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f60086c = r0Var;
            this.f60087d = dVar;
            this.f60088e = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f60086c, this.f60087d, this.f60088e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws CustomerManagementException {
            p005kotlin.jvm.internal.r0<fj2.h> r0Var;
            T t7;
            p005kotlin.jvm.internal.r0<fj2.h> r0Var2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f60085b;
            if (i14 == 0) {
                o13.r.b(obj);
                String phoneNumberId = this.f60087d.getPhoneNumberId();
                r0Var = this.f60086c;
                if (phoneNumberId != null) {
                    this.f60084a = r0Var;
                    this.f60085b = 1;
                    obj = this.f60088e.n(phoneNumberId, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    r0Var2 = r0Var;
                } else {
                    t7 = 0;
                }
                r0Var.f105810a = t7;
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var2 = this.f60084a;
            o13.r.b(obj);
            r0Var = r0Var2;
            t7 = (fj2.h) obj;
            r0Var.f105810a = t7;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p005kotlin.jvm.internal.r0<l1> r0Var, p005kotlin.jvm.internal.r0<fj2.h> r0Var2, gj2.d dVar, dj2.a aVar, t13.d<? super m0> dVar2) {
        super(2, dVar2);
        this.f60080b = r0Var;
        this.f60081c = r0Var2;
        this.f60082d = dVar;
        this.f60083e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m0 m0Var = new m0(this.f60080b, this.f60081c, this.f60082d, this.f60083e, dVar);
        m0Var.f60079a = obj;
        return m0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, o53.c2] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f60079a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f60080b.f105810a = ge1.b.T(b0Var, null, null, new a(this.f60081c, this.f60082d, this.f60083e, null), 3);
        return Unit.INSTANCE;
    }
}
