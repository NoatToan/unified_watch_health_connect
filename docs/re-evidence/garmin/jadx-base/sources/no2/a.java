package no2;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.InvalidAppletException;
import com.garmin.feature.garminpay.util.InvalidApduResponseException;
import d53.w;
import e23.p;
import j23.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n23.j;
import o13.m;
import o13.r;
import o13.t;
import o53.s0;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u;
import po2.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lno2/a;", "Lno2/i;", "Lhs2/d;", "payDevice", "<init>", "(Lhs2/d;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2438a f126725b = new C2438a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f126726c = hb2.d.a("A00000063201010510009156000014A1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f126727d = hb2.d.a("01011000FFFFFFFF");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f126728e = hb2.d.a("805c000204");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f126729f = hb2.d.a("00B201D400");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f126730g = hb2.d.a("00B202D400");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f126731h = hb2.d.a("00B0950008");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f126732i = hb2.d.a("00B0951408");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f126733j = hb2.d.a("00B0950901");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t f126734k = m.b(new n61.h(24));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f126735l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hs2.d f126736a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.executor.BeijingTUnionCardOperationExecutor", f = "BeijingTUnionCardOperationExecutor.kt", l = {62}, m = "getTransactionHistory", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f126737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f126738b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f126740d;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f126738b = obj;
            this.f126740d |= Integer.MIN_VALUE;
            return a.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul2/c;", "transfer", "", "<anonymous>", "(Lul2/c;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.executor.BeijingTUnionCardOperationExecutor$getTransactionHistory$2", f = "BeijingTUnionCardOperationExecutor.kt", l = {63, 67}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<ul2.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f126741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f126742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f126743c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<h0> f126745e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<h0> list, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f126745e = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = a.this.new c(this.f126745e, dVar);
            cVar.f126743c = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(ul2.c cVar, t13.d<? super Unit> dVar) {
            return ((c) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x009c  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a5 A[LOOP:0: B:20:0x009a->B:24:0x00a5, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:41:0x00a8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:42:0x00a0 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0087 -> B:19:0x008a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 333
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: no2.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul2/c;", "transfer", "", "<anonymous>", "(Lul2/c;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.executor.BeijingTUnionCardOperationExecutor$validateApplet$2", f = "BeijingTUnionCardOperationExecutor.kt", l = {126, 137, 142, 147}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<ul2.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f126746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f126747b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = a.this.new d(dVar);
            dVar2.f126747b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(ul2.c cVar, t13.d<? super Unit> dVar) {
            return ((d) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00b2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:39:0x00cd A[PHI: r13
          0x00cd: PHI (r13v22 java.lang.Object) = (r13v21 java.lang.Object), (r13v0 java.lang.Object) binds: [B:37:0x00ca, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:52:0x0134  */
        /* JADX WARN: Code duplicated, block: B:54:0x013c  */
        /* JADX WARN: Code duplicated, block: B:56:0x0142  */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0114, code lost:
        
            if (r13 == r1) goto L43;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            byte[] bArr;
            int length;
            ul2.c cVar = (ul2.c) this.f126747b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f126746a;
            int i15 = 18;
            a aVar2 = a.this;
            if (i14 == 0) {
                r.b(obj);
                byte[] bArr2 = a.f126726c;
                bArr2.getClass();
                this.f126747b = cVar;
                this.f126746a = 1;
                aVar2.getClass();
                obj = aVar2.h(cVar, wq2.a.b(bArr2), this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 == 2) {
                    r.b(obj);
                    bArr = (byte[]) obj;
                    bArr.getClass();
                    length = bArr.length;
                    if (length != 0) {
                        j.s("Array is empty.");
                        return null;
                    }
                    if (length == 1) {
                        vb.h.s("Array has more than one element.");
                        return null;
                    }
                    if (bArr[0] == 1) {
                        throw new InvalidAppletException(InvalidAppletException.a.INACTIVATED);
                    }
                    a.f126725b.getClass();
                    byte[] bArr3 = a.f126732i;
                    bArr3.getClass();
                    this.f126747b = cVar;
                    this.f126746a = 3;
                    obj = a.f(aVar2, cVar, bArr3, this);
                    if (obj != aVar) {
                        C2438a c2438a = a.f126725b;
                        aVar2.getClass();
                        String strB = hb2.d.b((byte[]) obj);
                        strB.getClass();
                        String strB0 = w.b0(strB, new l(0, 7));
                        String strB1 = w.b0(strB, new l(8, 15));
                        C2438a c2438a2 = a.f126725b;
                        C2438a.a(c2438a2).parseLocalDate(strB0);
                        C2438a.a(c2438a2).parseLocalDate(strB1);
                        byte[] bArr4 = a.f126731h;
                        bArr4.getClass();
                        this.f126747b = null;
                        this.f126746a = 4;
                        obj = aVar2.i(cVar, bArr4, new ne2.t(i15), this);
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    r.b(obj);
                    C2438a c2438a3 = a.f126725b;
                    aVar2.getClass();
                    String strB2 = hb2.d.b((byte[]) obj);
                    strB2.getClass();
                    String strB3 = w.b0(strB2, new l(0, 7));
                    String strB4 = w.b0(strB2, new l(8, 15));
                    try {
                        C2438a c2438a4 = a.f126725b;
                        C2438a.a(c2438a4).parseLocalDate(strB3);
                        C2438a.a(c2438a4).parseLocalDate(strB4);
                        byte[] bArr5 = a.f126731h;
                        bArr5.getClass();
                        this.f126747b = null;
                        this.f126746a = 4;
                        obj = aVar2.i(cVar, bArr5, new ne2.t(i15), this);
                    } catch (Throwable unused) {
                        throw new InvalidAppletException(InvalidAppletException.a.INVALID_EXPIRATION);
                    }
                } else {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            }
            if (Arrays.equals((byte[]) obj, a.f126727d)) {
                return Unit.INSTANCE;
            }
            throw new InvalidAppletException(InvalidAppletException.a.UNEXPECTED_ISSUER);
            wr2.c cVar2 = (wr2.c) obj;
            byte[] bArr6 = cVar2.f186835b;
            C2438a c2438a5 = a.f126725b;
            aVar2.getClass();
            if (Arrays.equals(bArr6, hb2.d.a("6283")) || Arrays.equals(bArr6, hb2.d.a("6284"))) {
                throw new InvalidAppletException(InvalidAppletException.a.BLACKLISTED);
            }
            if (!((Boolean) cVar2.f186836c.getValue()).booleanValue() && cVar2.f186835b[0] != 97) {
                throw new InvalidAppletException(InvalidAppletException.a.CARD_ERROR);
            }
            a.f126725b.getClass();
            byte[] bArr7 = a.f126733j;
            bArr7.getClass();
            this.f126747b = cVar;
            this.f126746a = 2;
            obj = aVar2.i(cVar, bArr7, new ne2.t(i15), this);
            if (obj != aVar) {
                bArr = (byte[]) obj;
                bArr.getClass();
                length = bArr.length;
                if (length != 0) {
                    j.s("Array is empty.");
                    return null;
                }
                if (length == 1) {
                    vb.h.s("Array has more than one element.");
                    return null;
                }
                if (bArr[0] == 1) {
                    throw new InvalidAppletException(InvalidAppletException.a.INACTIVATED);
                }
                a.f126725b.getClass();
                byte[] bArr8 = a.f126732i;
                bArr8.getClass();
                this.f126747b = cVar;
                this.f126746a = 3;
                obj = a.f(aVar2, cVar, bArr8, this);
                if (obj != aVar) {
                    C2438a c2438a6 = a.f126725b;
                    aVar2.getClass();
                    String strB5 = hb2.d.b((byte[]) obj);
                    strB5.getClass();
                    String strB6 = w.b0(strB5, new l(0, 7));
                    String strB7 = w.b0(strB5, new l(8, 15));
                    C2438a c2438a7 = a.f126725b;
                    C2438a.a(c2438a7).parseLocalDate(strB6);
                    C2438a.a(c2438a7).parseLocalDate(strB7);
                    byte[] bArr9 = a.f126731h;
                    bArr9.getClass();
                    this.f126747b = null;
                    this.f126746a = 4;
                    obj = aVar2.i(cVar, bArr9, new ne2.t(i15), this);
                }
            }
            return aVar;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f126735l = gt2.b.f79005a.h("PAY#SB#BTUCOperationProvider");
    }

    public a(hs2.d dVar) {
        dVar.getClass();
        this.f126736a = dVar;
    }

    public static final Object f(a aVar, ul2.c cVar, byte[] bArr, v13.i iVar) {
        return aVar.i(cVar, bArr, new ne2.t(18), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object g(a aVar, ul2.c cVar, byte[] bArr, v13.c cVar2) throws InvalidApduResponseException {
        g gVar;
        aVar.getClass();
        if (cVar2 instanceof g) {
            gVar = (g) cVar2;
            int i14 = gVar.f126771c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f126771c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(aVar, cVar2);
            }
        } else {
            gVar = new g(aVar, cVar2);
        }
        Object objH = gVar.f126769a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f126771c;
        if (i15 == 0) {
            r.b(objH);
            gVar.f126771c = 1;
            objH = aVar.h(cVar, wq2.a.b(bArr), gVar);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objH);
        }
        wr2.c cVar3 = (wr2.c) objH;
        if (((Boolean) cVar3.f186836c.getValue()).booleanValue() || cVar3.f186835b[0] == 97) {
            return objH;
        }
        throw new InvalidApduResponseException("Failed to select the applet");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // no2.i
    public final Object a(t13.d<? super List<h0>> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f126740d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f126740d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f126738b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f126740d;
        if (i15 == 0) {
            ArrayList arrayListX = v.h.x(obj);
            c cVar = new c(arrayListX, null);
            bVar.f126737a = arrayListX;
            bVar.f126740d = 1;
            return ks2.e.c(this.f126736a, cVar, bVar) == aVar ? aVar : arrayListX;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList arrayList = bVar.f126737a;
        r.b(obj);
        return arrayList;
    }

    @Override // no2.i
    public final Object b(po2.w.e eVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new no2.b(this, null), eVar);
    }

    @Override // no2.i
    public final Object c(t13.d<? super Unit> dVar) {
        Object objC = ks2.e.c(this.f126736a, new d(null), dVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    @Override // no2.i
    public final Object d(v13.c cVar) {
        return ks2.e.c(this.f126736a, new f(this, null), cVar);
    }

    @Override // no2.i
    public final Object e(zn2.w wVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new e(this, null), wVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ul2.c cVar, byte[] bArr, v13.c cVar2) {
        no2.c cVar3;
        if (cVar2 instanceof no2.c) {
            cVar3 = (no2.c) cVar2;
            int i14 = cVar3.f126756c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar3.f126756c = i14 - Integer.MIN_VALUE;
            } else {
                cVar3 = new no2.c(this, cVar2);
            }
        } else {
            cVar3 = new no2.c(this, cVar2);
        }
        Object objA = cVar3.f126754a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar3.f126756c;
        if (i15 == 0) {
            r.b(objA);
            cVar3.f126756c = 1;
            t13.i iVar = new t13.i(u13.f.b(cVar3));
            cVar.l(bArr, new yr2.b(iVar), AbstractComponentTracker.LINGERING_TIMEOUT);
            objA = iVar.a();
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        byte[] bArr2 = (byte[]) objA;
        if (bArr2 == null) {
            throw new InvalidApduResponseException("Null response");
        }
        wr2.c.f186833d.getClass();
        if (bArr2.length >= 2) {
            return new wr2.c(p13.h0.V0(u.B(bArr2)), p13.h0.V0(u.b0(2, bArr2)));
        }
        throw new InvalidApduResponseException("APDU response is too short to be parsed");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(ul2.c cVar, byte[] bArr, e23.l lVar, v13.c cVar2) {
        no2.d dVar;
        if (cVar2 instanceof no2.d) {
            dVar = (no2.d) cVar2;
            int i14 = dVar.f126760d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f126760d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new no2.d(this, cVar2);
            }
        } else {
            dVar = new no2.d(this, cVar2);
        }
        Object objH = dVar.f126758b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f126760d;
        if (i15 == 0) {
            r.b(objH);
            dVar.f126757a = lVar;
            dVar.f126760d = 1;
            objH = h(cVar, bArr, dVar);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar = dVar.f126757a;
            r.b(objH);
        }
        wr2.c cVar3 = (wr2.c) objH;
        boolean zBooleanValue = ((Boolean) cVar3.f186836c.getValue()).booleanValue();
        byte[] bArr2 = cVar3.f186834a;
        if (!zBooleanValue) {
            throw new InvalidApduResponseException(fb1.c.n("Unsuccessful response, status = ", hb2.d.b(cVar3.f186835b)));
        }
        try {
            return lVar.invoke(bArr2);
        } catch (Throwable unused) {
            throw new InvalidApduResponseException(fb1.c.n("Failed to transform the payload ", hb2.d.b(bArr2)));
        }
    }

    /* JADX INFO: renamed from: no2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lno2/a$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "AID", "[B", "ISSUER", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2438a {
        public /* synthetic */ C2438a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final DateTimeFormatter a(C2438a c2438a) {
            c2438a.getClass();
            return (DateTimeFormatter) a.f126734k.getValue();
        }

        private C2438a() {
        }
    }
}
