package no2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.executor.BeijingTUnionCardOperationExecutor$checkIfIsTransporting$2", f = "BeijingTUnionCardOperationExecutor.kt", l = {41}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ no2.a f126750b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul2/c;", "transfer", "", "<anonymous>", "(Lul2/c;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.executor.BeijingTUnionCardOperationExecutor$checkIfIsTransporting$2$1", f = "BeijingTUnionCardOperationExecutor.kt", l = {42, 44, 50}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<ul2.c, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f126751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f126752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ no2.a f126753c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(no2.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f126753c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f126753c, dVar);
            aVar.f126752b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(ul2.c cVar, t13.d<? super Boolean> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0058  */
        /* JADX WARN: Code duplicated, block: B:22:0x005b  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
        
            if (r9 == r1) goto L24;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ul2.c cVar = (ul2.c) this.f126752b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f126751a;
            no2.a aVar2 = this.f126753c;
            if (i14 == 0) {
                r.b(obj);
                byte[] bArr = no2.a.f126726c;
                bArr.getClass();
                this.f126752b = cVar;
                this.f126751a = 1;
                if (no2.a.g(aVar2, cVar, bArr, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else if (i14 == 2) {
                r.b(obj);
                if (((byte[]) obj)[14] == 1) {
                    return Boolean.TRUE;
                }
                no2.a.f126725b.getClass();
                byte[] bArr2 = no2.a.f126729f;
                bArr2.getClass();
                this.f126752b = null;
                this.f126751a = 3;
                obj = no2.a.f(aVar2, cVar, bArr2, this);
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return ((byte[]) obj)[14] == 1 ? Boolean.TRUE : Boolean.FALSE;
            no2.a.f126725b.getClass();
            byte[] bArr3 = no2.a.f126730g;
            bArr3.getClass();
            this.f126752b = cVar;
            this.f126751a = 2;
            obj = no2.a.f(aVar2, cVar, bArr3, this);
            if (obj != aVar) {
                if (((byte[]) obj)[14] == 1) {
                    return Boolean.TRUE;
                }
                no2.a.f126725b.getClass();
                byte[] bArr4 = no2.a.f126729f;
                bArr4.getClass();
                this.f126752b = null;
                this.f126751a = 3;
                obj = no2.a.f(aVar2, cVar, bArr4, this);
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(no2.a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f126750b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f126750b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126749a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        no2.a aVar2 = this.f126750b;
        hs2.d dVar = aVar2.f126736a;
        a aVar3 = new a(aVar2, null);
        this.f126749a = 1;
        Object objC = ks2.e.c(dVar, aVar3, this);
        return objC == aVar ? aVar : objC;
    }
}
