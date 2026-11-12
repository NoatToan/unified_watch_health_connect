package ks2;

import com.garmin.garminpay.wallet.exception.NfcTransferCoroutineException;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.l;
import e23.p;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o53.b0;
import o53.c0;
import o53.e2;
import o53.l1;
import o53.s;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import tl2.c;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004:\u0006\u000f\u0010\u0011\u0012\u0013\u0014B]\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0005\u00120\u0010\f\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lks2/g;", "R", "Ltl2/c;", "TransferType", "", "Lkotlin/Function2;", "Lt13/d;", "block", "Lkotlin/Function1;", "", "Ltl2/c$b;", "", "requestTransfer", "<init>", "(Le23/p;Le23/p;)V", "f", "c", JWKParameterNames.RSA_EXPONENT, "d", "b", "a", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g<R, TransferType extends tl2.c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f106402d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<g<R, TransferType>.f> f106403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u53.d f106404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f106405c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00120\u0001R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lks2/g$b;", "Lks2/g$f;", "Lks2/g;", "<init>", "(Lks2/g;)V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends g<R, TransferType>.f {
        public b(g gVar) {
            super();
        }

        public final String toString() {
            return "Finished";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00120\u0001R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002B]\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u00120\u0010\u000b\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lks2/g$c;", "Lks2/g$f;", "Lks2/g;", "Lkotlin/Function2;", "Lt13/d;", "", "block", "Lkotlin/Function1;", "", "Ltl2/c$b;", "", "requestTransfer", "<init>", "(Lks2/g;Le23/p;Le23/p;)V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends g<R, TransferType>.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p<TransferType, t13.d<? super R>, Object> f106406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p<l<? super TransferType, Unit>, l<? super tl2.c.b, Unit>, Integer> f106407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g<R, TransferType> f106408d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class a extends q implements l<TransferType, Unit> {
            public a(Object obj) {
                super(1, obj, g.class, "onStart", "onStart(Lcom/garmin/device/nfc/transfer/NfcTransfer;)V", 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Unit invoke(Object obj) {
                tl2.c cVar = (tl2.c) obj;
                cVar.getClass();
                g gVar = (g) this.receiver;
                g<R, TransferType>.f fVar = gVar.f106403a.get();
                try {
                    fVar.getClass();
                    fVar.b(cVar);
                } catch (Throwable th3) {
                    g.f106402d.warn("Immature finish in " + fVar + " state", th3);
                    gVar.a(th3);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class b extends q implements l<tl2.c.b, Unit> {
            public b(Object obj) {
                super(1, obj, g.class, "onEnd", "onEnd(Lcom/garmin/device/nfc/transfer/NfcTransfer$TransferStatus;)V", 0);
            }

            @Override // e23.l
            public final Unit invoke(tl2.c.b bVar) {
                tl2.c.b bVar2 = bVar;
                bVar2.getClass();
                g gVar = (g) this.receiver;
                g<R, TransferType>.f fVar = gVar.f106403a.get();
                try {
                    fVar.getClass();
                    fVar.a(bVar2);
                } catch (Throwable th3) {
                    g.f106402d.warn("Immature finish in " + fVar + " state", th3);
                    gVar.a(th3);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(g gVar, p<? super TransferType, ? super t13.d<? super R>, ? extends Object> pVar, p<? super l<? super TransferType, Unit>, ? super l<? super tl2.c.b, Unit>, Integer> pVar2) {
            super();
            pVar.getClass();
            pVar2.getClass();
            this.f106408d = gVar;
            this.f106406b = pVar;
            this.f106407c = pVar2;
        }

        @Override // ks2.g.f
        public final void c() throws NfcTransferCoroutineException {
            p<TransferType, t13.d<? super R>, Object> pVar = this.f106406b;
            g<R, TransferType> gVar = this.f106408d;
            d(new e(gVar, pVar));
            if (this.f106407c.invoke(new a(gVar), new b(gVar)).intValue() == -1) {
                throw new NfcTransferCoroutineException(NfcTransferCoroutineException.a.NO_NFC_SERVICE, "Failed to start a transfer");
            }
        }

        public final String toString() {
            return "NotStarted";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00120\u0001R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lks2/g$d;", "Lks2/g$f;", "Lks2/g;", "<init>", "(Lks2/g;)V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class d extends g<R, TransferType>.f {
        public d() {
            super();
        }

        @Override // ks2.g.f
        public final void a(tl2.c.b bVar) throws NfcTransferCoroutineException {
            bVar.getClass();
            if (bVar == tl2.c.b.SUCCESS) {
                d(new b(g.this));
            } else {
                NfcTransferCoroutineException.a.f52328a.getClass();
                throw new NfcTransferCoroutineException(NfcTransferCoroutineException.a.C1113a.a(bVar));
            }
        }

        public final String toString() {
            return "Started";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00120\u0001R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002B+\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lks2/g$e;", "Lks2/g$f;", "Lks2/g;", "Lkotlin/Function2;", "Lt13/d;", "", "block", "<init>", "(Lks2/g;Le23/p;)V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class e extends g<R, TransferType>.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p<TransferType, t13.d<? super R>, Object> f106410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g<R, TransferType> f106411c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.garminpay.extensions.NfcTransferCoroutine$Starting$onTransferStart$1", f = "IPayDeviceExtensions.kt", l = {147}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f106412a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f106413b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g<R, TransferType> f106414c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g<R, TransferType>.e f106415d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ TransferType f106416e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g<R, TransferType> gVar, g<R, TransferType>.e eVar, TransferType transfertype, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f106414c = gVar;
                this.f106415d = eVar;
                this.f106416e = transfertype;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f106414c, this.f106415d, this.f106416e, dVar);
                aVar.f106413b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f106412a;
                TransferType transfertype = this.f106416e;
                try {
                    if (i14 == 0) {
                        r.b(obj);
                        g<R, TransferType>.e eVar = this.f106415d;
                        int i15 = o13.q.f128596b;
                        p<TransferType, t13.d<? super R>, Object> pVar = eVar.f106410b;
                        this.f106413b = null;
                        this.f106412a = 1;
                        obj = pVar.invoke(transfertype, this);
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
                    int i16 = o13.q.f128596b;
                } catch (Throwable th3) {
                    int i17 = o13.q.f128596b;
                    obj = new o13.q.b(th3);
                }
                s sVar = this.f106414c.f106405c;
                Throwable thB = o13.q.b(obj);
                if (thB == null) {
                    sVar.p(obj);
                } else {
                    sVar.O(thB);
                }
                transfertype.e();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(g gVar, p<? super TransferType, ? super t13.d<? super R>, ? extends Object> pVar) {
            super();
            pVar.getClass();
            this.f106411c = gVar;
            this.f106410b = pVar;
        }

        @Override // ks2.g.f
        public final void a(tl2.c.b bVar) throws NfcTransferCoroutineException {
            bVar.getClass();
            NfcTransferCoroutineException.a.f52328a.getClass();
            throw new NfcTransferCoroutineException(NfcTransferCoroutineException.a.C1113a.a(bVar));
        }

        @Override // ks2.g.f
        public final void b(TransferType transfertype) {
            transfertype.getClass();
            g<R, TransferType> gVar = this.f106411c;
            d(gVar.new d());
            u53.d dVar = gVar.f106404b;
            if (dVar == null) {
                o2.c.m("scope not initialized yet");
            } else {
                if (ge1.b.T(dVar, null, null, new a(gVar, this, transfertype, null), 3).isActive()) {
                    return;
                }
                transfertype.e();
                o2.c.m("CoroutineScope is not active, cannot process for a transfer");
            }
        }

        public final String toString() {
            return "Starting";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lks2/g$f;", "", "<init>", "(Lks2/g;)V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public abstract class f {
        public f() {
        }

        public void a(tl2.c.b bVar) {
            bVar.getClass();
            throw new ns2.d("Unexpected call to onTransferEnd() in " + this + " state");
        }

        public void b(TransferType transfertype) {
            transfertype.getClass();
            throw new ns2.d("Unexpected call to onTransferStart() in " + this + " state");
        }

        public void c() {
            throw new ns2.d("Unexpected call to start() in " + this + " state");
        }

        public final void d(g<R, TransferType>.f fVar) {
            while (true) {
                g<R, TransferType> gVar = g.this;
                g<R, TransferType>.f fVar2 = gVar.f106403a.get();
                fVar2.getClass();
                g<R, TransferType>.f fVar3 = fVar2;
                if (fVar3 != this) {
                    throw new ns2.d("Unexpected state transition: " + fVar3 + ", expected: " + this);
                }
                AtomicReference<g<R, TransferType>.f> atomicReference = gVar.f106403a;
                do {
                    if (atomicReference.compareAndSet(fVar3, fVar)) {
                        g.f106402d.trace("{} -> {}", fVar3, fVar);
                        return;
                    }
                } while (atomicReference.get() == fVar3);
            }
        }
    }

    /* JADX INFO: renamed from: ks2.g$g, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.garminpay.extensions.NfcTransferCoroutine", f = "IPayDeviceExtensions.kt", l = {PsExtractor.PRIVATE_STREAM_1, 192, 192}, m = TtmlNode.START, v = 2)
    public static final class C2055g extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e2 f106418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f106419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f106420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g<R, TransferType> f106421d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f106422e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2055g(g<R, TransferType> gVar, t13.d<? super C2055g> dVar) {
            super(dVar);
            this.f106421d = gVar;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f106420c = obj;
            this.f106422e |= Integer.MIN_VALUE;
            return this.f106421d.b(this);
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f106402d = gt2.b.f79005a.h("NfcTransferCoroutine");
    }

    public g(p<? super TransferType, ? super t13.d<? super R>, ? extends Object> pVar, p<? super l<? super TransferType, Unit>, ? super l<? super tl2.c.b, Unit>, Integer> pVar2) {
        pVar.getClass();
        pVar2.getClass();
        this.f106403a = new AtomicReference<>(new c(this, pVar, pVar2));
        this.f106405c = gl.b.b();
    }

    public final void a(Throwable th3) {
        this.f106403a.set(new b(this));
        u53.d dVar = this.f106404b;
        if (dVar != null) {
            c0.c(dVar, null);
        }
        this.f106405c.O(th3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [ks2.g$g, t13.d] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ks2.g$g, t13.d] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v15, types: [o53.p1, o53.s] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [o53.l1, o53.t] */
    /* JADX WARN: Type inference failed for: r2v4, types: [o53.l1, o53.t] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object b(t13.d<? super R> dVar) throws Throwable {
        ?? P;
        if (dVar instanceof C2055g) {
            C2055g c2055g = (C2055g) dVar;
            int i14 = c2055g.f106422e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c2055g.f106422e = i14 - Integer.MIN_VALUE;
                P = c2055g;
            } else {
                P = new C2055g(this, dVar);
            }
        } else {
            P = new C2055g(this, dVar);
        }
        Object objC = P.f106420c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ?? r14 = P.f106422e;
        ?? r15 = 3;
        r15 = 3;
        try {
            if (r14 == 0) {
                r.b(objC);
                e2 e2Var = new e2((l1) P.getF157466b().get(l1.f129368i0));
                x53.c cVar = s0.f129406a;
                this.f106404b = c0.a(t13.g.a.C3052a.d(x53.b.f189152a, e2Var));
                g<R, TransferType>.f fVar = this.f106403a.get();
                try {
                    fVar.getClass();
                    fVar.c();
                } catch (Throwable th3) {
                    f106402d.warn("Immature finish in " + fVar + " state", th3);
                    a(th3);
                }
                ?? r16 = this.f106405c;
                P.f106418a = e2Var;
                P.f106422e = 1;
                objC = r16.C(P);
                r14 = e2Var;
                r15 = u13.a.COROUTINE_SUSPENDED;
                if (objC != aVar) {
                }
            }
            if (r14 != 1) {
                if (r14 == 2) {
                    Object obj = P.f106419b;
                    r.b(objC);
                    return obj;
                }
                if (r14 != 3) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th4 = (Throwable) P.f106419b;
                r.b(objC);
                throw th4;
            }
            e2 e2Var2 = P.f106418a;
            r.b(objC);
            r14 = e2Var2;
            r14.complete();
            P.f106418a = null;
            P.f106419b = objC;
            P.f106422e = 2;
            P = r14.P(P);
            return P == aVar ? aVar : objC;
        } catch (Throwable th5) {
            r14.complete();
            P.f106418a = null;
            P.f106419b = th5;
            P.f106422e = r15;
            if (r14.P(P) != aVar) {
                throw th5;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lks2/g$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
