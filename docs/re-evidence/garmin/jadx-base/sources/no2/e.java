package no2;

import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import e23.l;
import e23.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.executor.BeijingTUnionCardOperationExecutor$getBalance$2", f = "BeijingTUnionCardOperationExecutor.kt", l = {31}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super CurrencyValue>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ no2.a f126762b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul2/c;", "transfer", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "<anonymous>", "(Lul2/c;)Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.executor.BeijingTUnionCardOperationExecutor$getBalance$2$1", f = "BeijingTUnionCardOperationExecutor.kt", l = {32, 33}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<ul2.c, t13.d<? super CurrencyValue>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f126763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f126764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ no2.a f126765c;

        /* JADX INFO: renamed from: no2.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class C2439a extends q implements l<byte[], CurrencyValue> {
            public C2439a(Object obj) {
                super(1, obj, no2.a.class, "convertToAmount", "convertToAmount([B)Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", 0);
            }

            @Override // e23.l
            public final CurrencyValue invoke(byte[] bArr) {
                byte[] bArr2 = bArr;
                bArr2.getClass();
                no2.a aVar = (no2.a) this.receiver;
                no2.a.C2438a c2438a = no2.a.f126725b;
                aVar.getClass();
                return new CurrencyValue(ByteBuffer.wrap(bArr2).order(ByteOrder.BIG_ENDIAN).getInt(), ko2.a.f105769b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(no2.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f126765c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f126765c, dVar);
            aVar.f126764b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(ul2.c cVar, t13.d<? super CurrencyValue> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ul2.c cVar = (ul2.c) this.f126764b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f126763a;
            no2.a aVar2 = this.f126765c;
            if (i14 == 0) {
                r.b(obj);
                byte[] bArr = no2.a.f126726c;
                bArr.getClass();
                this.f126764b = cVar;
                this.f126763a = 1;
                if (no2.a.g(aVar2, cVar, bArr, this) != aVar) {
                }
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            no2.a.f126725b.getClass();
            byte[] bArr2 = no2.a.f126728e;
            bArr2.getClass();
            C2439a c2439a = new C2439a(aVar2);
            this.f126764b = null;
            this.f126763a = 2;
            Object objI = aVar2.i(cVar, bArr2, c2439a, this);
            return objI == aVar ? aVar : objI;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(no2.a aVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f126762b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f126762b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super CurrencyValue> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126761a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        no2.a aVar2 = this.f126762b;
        hs2.d dVar = aVar2.f126736a;
        a aVar3 = new a(aVar2, null);
        this.f126761a = 1;
        Object objC = ks2.e.c(dVar, aVar3, this);
        return objC == aVar ? aVar : objC;
    }
}
