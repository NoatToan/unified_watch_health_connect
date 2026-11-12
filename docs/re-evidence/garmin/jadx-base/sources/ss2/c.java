package ss2;

import android.os.SystemClock;
import com.garmin.gfdi.GfdiException;
import com.garmin.gfdi.ResponseStatusException;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o53.b0;
import o53.c0;
import o53.l1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.l0;
import r1.q2;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lss2/c;", "Lss2/q;", "Lrs2/w;", "", "connectionId", "Lrs2/v;", "messenger", "Lss2/b;", "authDelegate", "Lo53/b0;", "coroutineScope", "<init>", "(Ljava/lang/String;Lrs2/v;Lss2/b;Lo53/b0;)V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements q, rs2.w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f160782o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final SecureRandom f160783p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rs2.v f160785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ss2.b f160786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Logger f160787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f160788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f160789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f160790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f160791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f160792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f160793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f160794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f160795m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o53.s f160796n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.auth.AuthHandler$setPasskey$1", f = "AuthHandler.kt", l = {297}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160797a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f160799c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte[] bArr, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f160799c = bArr;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new b(this.f160799c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160797a;
            c cVar = c.this;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    byte[] bArr = this.f160799c;
                    this.f160797a = 1;
                    if (c.a(cVar, bArr, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            } catch (GfdiException e4) {
                cVar.f160796n.O(e4);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        byte[] bArr = new byte[16];
        for (int i14 = 0; i14 < 16; i14++) {
            bArr[i14] = 0;
        }
        f160782o = bArr;
        f160783p = new SecureRandom();
    }

    public c(String str, rs2.v vVar, ss2.b bVar, b0 b0Var) {
        str.getClass();
        vVar.getClass();
        bVar.getClass();
        this.f160784b = str;
        this.f160785c = vVar;
        this.f160786d = bVar;
        rs2.d.f154380a.getClass();
        this.f160787e = LoggerFactory.getLogger(rs2.d.a("AuthManager", -1L, this, str));
        b0Var = b0Var == null ? q2.l("AuthManager") : b0Var;
        this.f160788f = b0Var;
        this.f160789g = new AtomicBoolean(false);
        this.f160793k = new byte[0];
        this.f160795m = 30000L;
        this.f160796n = new o53.s((l1) b0Var.getF183565a().get(l1.f129368i0));
        vVar.d(5101, this);
        vVar.d(5103, this);
        vVar.d(5107, this);
        vVar.d(5108, this);
        vVar.d(5109, this);
        vVar.d(5111, this);
        vVar.d(5112, this);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9 A[Catch: Exception -> 0x0044, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0044, blocks: (B:19:0x003f, B:43:0x00b9), top: B:59:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        if (r13.g(r2) == r3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        if (r13 == r3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fd, code lost:
    
        if (r15 == r3) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, byte[] bArr, v13.c cVar2) throws GfdiException {
        d dVar;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        Object objB;
        rs2.v vVar = cVar.f160785c;
        String str = cVar.f160784b;
        if (cVar2 instanceof d) {
            dVar = (d) cVar2;
            int i14 = dVar.f160805f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f160805f = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar, cVar2);
            }
        } else {
            dVar = new d(cVar, cVar2);
        }
        Object objB2 = dVar.f160803d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f160805f;
        try {
            try {
                if (i15 == 0) {
                    o13.r.b(objB2);
                    byte[] bArrB = ss2.a.b();
                    byte[] bArrA = ss2.a.a(str, bArr, bArrB);
                    dVar.f160800a = bArr;
                    dVar.f160801b = bArrB;
                    dVar.f160805f = 1;
                    Serializable serializableF = cVar.f(bArrA, dVar);
                    if (serializableF != aVar) {
                        bArr2 = bArrB;
                        objB2 = serializableF;
                    }
                    cVar = objB;
                    return aVar;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 == 3) {
                            o13.r.b(objB2);
                            return Unit.INSTANCE;
                        }
                        if (i15 == 4) {
                            o13.r.b(objB2);
                            cVar = cVar;
                            cVar = objB;
                            throw new GfdiException("Slave confirm did not match", null, 2, null);
                        }
                        if (i15 != 5) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(objB2);
                        return Unit.INSTANCE;
                    }
                    bArr4 = dVar.f160802c;
                    bArr2 = dVar.f160801b;
                    bArr3 = dVar.f160800a;
                    o13.r.b(objB2);
                    bArr5 = (byte[]) objB2;
                    if (bArr5 == null) {
                        dVar.f160800a = null;
                        dVar.f160801b = null;
                        dVar.f160802c = null;
                        dVar.f160805f = 3;
                    } else if (Arrays.equals(bArr4, ss2.a.a(str, bArr3, bArr5))) {
                        byte[] bArr6 = new byte[16];
                        System.arraycopy(bArr2, 0, bArr6, 0, 8);
                        System.arraycopy(bArr5, 0, bArr6, 8, 8);
                        cVar.f160790h = n.c(16, false, bArr6, bArr3);
                        dVar.f160800a = null;
                        dVar.f160801b = null;
                        dVar.f160802c = null;
                        dVar.f160805f = 5;
                        objB2 = vVar.b(5106, new byte[]{0}, dVar);
                    } else {
                        dVar.f160800a = null;
                        dVar.f160801b = null;
                        dVar.f160802c = null;
                        dVar.f160805f = 4;
                        objB = vVar.b(5106, new byte[]{1}, dVar);
                    }
                    cVar = objB;
                    return aVar;
                }
                byte[] bArr7 = dVar.f160801b;
                byte[] bArr8 = dVar.f160800a;
                o13.r.b(objB2);
                bArr2 = bArr7;
                bArr = bArr8;
                byte[] bArr9 = (byte[]) objB2;
                bArr2.getClass();
                dVar.f160800a = bArr;
                dVar.f160801b = bArr2;
                dVar.f160802c = bArr9;
                dVar.f160805f = 2;
                Serializable serializableE = cVar.e(bArr2, dVar);
                if (serializableE != aVar) {
                    bArr3 = bArr;
                    bArr4 = bArr9;
                    objB2 = serializableE;
                    bArr5 = (byte[]) objB2;
                    if (bArr5 == null) {
                        dVar.f160800a = null;
                        dVar.f160801b = null;
                        dVar.f160802c = null;
                        dVar.f160805f = 3;
                    } else if (Arrays.equals(bArr4, ss2.a.a(str, bArr3, bArr5))) {
                        dVar.f160800a = null;
                        dVar.f160801b = null;
                        dVar.f160802c = null;
                        dVar.f160805f = 4;
                        objB = vVar.b(5106, new byte[]{1}, dVar);
                    } else {
                        byte[] bArr10 = new byte[16];
                        System.arraycopy(bArr2, 0, bArr10, 0, 8);
                        System.arraycopy(bArr5, 0, bArr10, 8, 8);
                        cVar.f160790h = n.c(16, false, bArr10, bArr3);
                        dVar.f160800a = null;
                        dVar.f160801b = null;
                        dVar.f160802c = null;
                        dVar.f160805f = 5;
                        objB2 = vVar.b(5106, new byte[]{0}, dVar);
                    }
                }
                cVar = objB;
                return aVar;
            } catch (Exception e4) {
                throw new GfdiException("Failed to send STK Being Generation", e4);
            }
        } catch (Exception e14) {
            cVar.f160787e.error("Failed to send STK Begin Generation", (Throwable) e14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007b -> B:29:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(ss2.c r10, v13.c r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof ss2.i
            if (r0 == 0) goto L16
            r0 = r11
            ss2.i r0 = (ss2.i) r0
            int r1 = r0.f160815c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f160815c = r1
            goto L1b
        L16:
            ss2.i r0 = new ss2.i
            r0.<init>(r10, r11)
        L1b:
            java.lang.Object r11 = r0.f160813a
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f160815c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L31
            if (r2 != r3) goto L2b
            o13.r.b(r11)     // Catch: java.lang.Exception -> L83
            goto L7e
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r10)
            return r4
        L31:
            o13.r.b(r11)
        L34:
            o53.s r11 = r10.f160796n
            boolean r11 = r11.isActive()
            if (r11 == 0) goto L8e
            long r5 = android.os.SystemClock.elapsedRealtime()
            kotlin.jvm.internal.q0 r11 = new kotlin.jvm.internal.q0
            r11.<init>()
            kotlin.jvm.internal.q0 r2 = new kotlin.jvm.internal.q0
            r2.<init>()
            byte[] r7 = r10.f160793k
            monitor-enter(r7)
            long r8 = r10.f160794l     // Catch: java.lang.Throwable -> L8b
            long r5 = r5 - r8
            r11.f105808a = r5     // Catch: java.lang.Throwable -> L8b
            long r5 = r10.f160795m     // Catch: java.lang.Throwable -> L8b
            r2.f105808a = r5     // Catch: java.lang.Throwable -> L8b
            kotlin.Unit r2 = p005kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r7)
            long r7 = r11.f105808a
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 <= 0) goto L6f
            o53.s r10 = r10.f160796n
            com.garmin.gfdi.GfdiException r11 = new com.garmin.gfdi.GfdiException
            java.lang.String r0 = "Authentication failed: Timeout"
            r1 = 2
            r11.<init>(r0, r4, r1, r4)
            r10.O(r11)
            kotlin.Unit r1 = p005kotlin.Unit.INSTANCE
            goto L90
        L6f:
            long r5 = r5 - r7
            ss2.j r11 = new ss2.j     // Catch: java.lang.Exception -> L83
            r11.<init>(r10, r4)     // Catch: java.lang.Exception -> L83
            r0.f160815c = r3     // Catch: java.lang.Exception -> L83
            java.lang.Object r11 = o53.j2.c(r5, r11, r0)     // Catch: java.lang.Exception -> L83
            if (r11 != r1) goto L7e
            goto L90
        L7e:
            ss2.x r11 = (ss2.x) r11     // Catch: java.lang.Exception -> L83
            if (r11 == 0) goto L34
            goto L8e
        L83:
            org.slf4j.Logger r11 = r10.f160787e
            java.lang.String r2 = "Garmin Auth failed"
            r11.error(r2)
            goto L34
        L8b:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        L8e:
            kotlin.Unit r1 = p005kotlin.Unit.INSTANCE
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ss2.c.b(ss2.c, v13.c):java.lang.Object");
    }

    @Override // ss2.q
    /* JADX INFO: renamed from: c, reason: from getter */
    public final o53.s getF160796n() {
        return this.f160796n;
    }

    @Override // rs2.h
    public final void close(String str) {
        str.getClass();
        c0.d(this.f160788f, "AuthManager closed");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v8, types: [byte[], java.io.Serializable] */
    public final Serializable e(byte[] bArr, v13.c cVar) throws GfdiException {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f160820c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f160820c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objB = kVar.f160818a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f160820c;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                rs2.v vVar = this.f160785c;
                kVar.f160820c = 1;
                objB = vVar.b(5105, bArr, kVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB);
            }
            byte[] bArr2 = (byte[]) objB;
            bArr2.getClass();
            int i16 = bArr2[0] & UnsignedBytes.MAX_VALUE;
            if (i16 == 2) {
                this.f160787e.warn("Confirm value failed. Restarting auth");
                return null;
            }
            if (i16 != 0) {
                throw new GfdiException("STK Rand Number failed: ".concat(i16 == 1 ? "Auth not started" : e0.f(i16, "Unknown status (", ")")), null, 2, null);
            }
            if (bArr2.length >= 17) {
                return p13.s.k(1, 17, bArr2);
            }
            throw new GfdiException(am.j.h(bArr2.length, "Received STK Rand Number response with invalid length: "), null, 2, null);
        } catch (ResponseStatusException e4) {
            throw new GfdiException("Failed to send STK Rand Number request", e4);
        } catch (IOException e14) {
            throw new GfdiException("Failed to send STK Rand Number request", e14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v8, types: [byte[], java.io.Serializable] */
    public final Serializable f(byte[] bArr, v13.c cVar) throws GfdiException {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f160823c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f160823c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objB = lVar.f160821a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f160823c;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                rs2.v vVar = this.f160785c;
                lVar.f160823c = 1;
                objB = vVar.b(5104, bArr, lVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB);
            }
            byte[] bArr2 = (byte[]) objB;
            Byte bF = p13.u.F(bArr2);
            byte bByteValue = bF != null ? bF.byteValue() : UnsignedBytes.MAX_VALUE;
            if (bByteValue != 0) {
                throw new GfdiException(am.j.h(bByteValue, "STK Confirm failed; status = "), null, 2, null);
            }
            if (bArr2.length >= 17) {
                return p13.s.k(1, 17, bArr2);
            }
            throw new GfdiException(am.j.h(bArr2.length, "Received STK Confirm response with invalid length: "), null, 2, null);
        } catch (Exception e4) {
            throw new GfdiException("Failed to send STK Confirm request", e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(v13.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f160826c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f160826c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objB = mVar.f160824a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f160826c;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                synchronized (this.f160793k) {
                    this.f160794l = SystemClock.elapsedRealtime();
                    this.f160795m = 30000L;
                    Unit unit = Unit.INSTANCE;
                }
                int i16 = 0;
                this.f160789g.set(false);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(0);
                int i17 = 1;
                while (true) {
                    ss2.a.EnumC3036a[] enumC3036aArr = ss2.a.f160777b;
                    if (i16 >= enumC3036aArr.length) {
                        break;
                    }
                    i17 |= i17 << ((byte) enumC3036aArr[i16].f160781a);
                    i16++;
                }
                lg.d.Q(byteArrayOutputStream, i17);
                rs2.v vVar = this.f160785c;
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                mVar.f160826c = 1;
                objB = vVar.b(5101, byteArray, mVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB);
            }
            Byte bF = p13.u.F((byte[]) objB);
            if ((bF != null ? bF.byteValue() : (byte) -1) != 0) {
                this.f160796n.O(new GfdiException("No common algorithms", null, 2, null));
            }
            return Unit.INSTANCE;
        } catch (Exception e4) {
            this.f160796n.O(new GfdiException("Failed to restart authentication", e4));
            return Unit.INSTANCE;
        }
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return l0.f134950a;
    }

    public final void h(byte[] bArr) {
        if (this.f160789g.getAndSet(true)) {
            this.f160787e.warn("Key generation already started");
        } else if (bArr.length != 16) {
            vb.h.s("16-byte passkey required");
        } else {
            ge1.b.T(this.f160788f, null, null, new b(bArr, null), 3);
        }
    }

    @Override // ss2.q
    public final void l() {
        this.f160796n.g0(new x(this.f160792j, null, null));
    }

    @Override // rs2.w
    public final void onMessageReceived(int i14, byte[] bArr, rs2.x xVar) throws IOException {
        bArr.getClass();
        if (i14 == 5101) {
            if (bArr.length < 5) {
                ft2.d.a(xVar, this.f160788f, rs2.y.LENGTH_ERROR, new byte[0]);
                return;
            }
            synchronized (this.f160793k) {
                this.f160794l = SystemClock.elapsedRealtime();
                Unit unit = Unit.INSTANCE;
            }
            ge1.b.T(this.f160788f, null, null, new e(this, null), 3);
            long jL = jg.b.L(1, bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i15 = 1;
            int i16 = 0;
            while (true) {
                ss2.a.EnumC3036a[] enumC3036aArr = ss2.a.f160777b;
                if (i16 >= enumC3036aArr.length) {
                    break;
                }
                i15 |= i15 << ((byte) enumC3036aArr[i16].f160781a);
                i16++;
            }
            long j8 = i15;
            if ((jL & j8) == 0) {
                byteArrayOutputStream.write(1);
            } else {
                byteArrayOutputStream.write(0);
            }
            byte[] longTermKey = this.f160786d.getLongTermKey(this.f160784b);
            byte[] encryptedDiversifier = this.f160786d.getEncryptedDiversifier(this.f160784b);
            byte[] randomNumber = this.f160786d.getRandomNumber(this.f160784b);
            if (longTermKey == null || encryptedDiversifier == null || randomNumber == null) {
                byteArrayOutputStream.write(0);
            } else {
                this.f160791i = longTermKey;
                byteArrayOutputStream.write(1);
            }
            lg.d.Q(byteArrayOutputStream, j8);
            b0 b0Var = this.f160788f;
            rs2.y yVar = rs2.y.ACK;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            ft2.d.a(xVar, b0Var, yVar, byteArray);
            if (longTermKey == null || encryptedDiversifier == null || randomNumber == null) {
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byteArrayOutputStream2.write(encryptedDiversifier);
            byteArrayOutputStream2.write(randomNumber);
            ge1.b.T(this.f160788f, null, null, new f(this, byteArrayOutputStream2, null), 3);
            return;
        }
        if (i14 == 5103) {
            if (bArr.length < 6) {
                ft2.d.a(xVar, this.f160788f, rs2.y.LENGTH_ERROR, new byte[0]);
            }
            int iK = jg.b.K(1, bArr);
            int i17 = bArr.length >= 6 ? bArr[5] & UnsignedBytes.MAX_VALUE : 0;
            boolean z14 = i17 < 0 || i17 > 2;
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            byteArrayOutputStream3.write(0);
            byteArrayOutputStream3.write((z14 ? i17 : 255) & 255);
            b0 b0Var2 = this.f160788f;
            rs2.y yVar2 = rs2.y.ACK;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            byteArray2.getClass();
            ft2.d.a(xVar, b0Var2, yVar2, byteArray2);
            if (z14) {
                this.f160796n.O(new GfdiException(e0.f(i17, "Authentication failed: Unsupported passkey mode (", ")"), null, 2, null));
                return;
            }
            if (i17 == 0) {
                this.f160787e.debug("Visible mode requested! Waiting for user to enter passkey...");
                if (iK == 0) {
                    iK = 30;
                }
                synchronized (this.f160793k) {
                    this.f160794l = SystemClock.elapsedRealtime();
                    this.f160795m = ((long) iK) * 1000;
                    Unit unit2 = Unit.INSTANCE;
                }
                this.f160786d.onDevicePairingPasskeyRequired(this.f160784b, iK, new g(this));
                return;
            }
            if (i17 == 1) {
                h(f160782o);
                return;
            }
            if (i17 != 2) {
                vb.h.z("Unhandled passkey mode");
                return;
            }
            this.f160787e.warn("Out-of-band passkey mode requested! Waiting for the OOB passkey...");
            synchronized (this.f160793k) {
                this.f160794l = SystemClock.elapsedRealtime();
                this.f160795m = 30000L;
                Unit unit3 = Unit.INSTANCE;
            }
            this.f160786d.onOutOfBandPasskeyRequired(this.f160784b, new h(this));
            return;
        }
        if (i14 == 5111) {
            if (bArr.length < 16) {
                ft2.d.a(xVar, this.f160788f, rs2.y.LENGTH_ERROR, new byte[0]);
                return;
            }
            byte[] bArr2 = this.f160792j;
            if (bArr2 == null) {
                this.f160787e.warn("Received Secure Session with no session key");
                return;
            }
            byte[] bArrB = n.b(bArr, 0, 16, false, bArr2);
            bArrB.getClass();
            byte[] bArrK = p13.s.k(8, 12, bArrB);
            byte[] bArr3 = new byte[16];
            bArr3[0] = bArrB[0];
            SecureRandom secureRandom = f160783p;
            byte[] bArrGenerateSeed = secureRandom.generateSeed(4);
            bArrGenerateSeed.getClass();
            p13.s.e(bArrGenerateSeed, 8, 0, bArr3, 4);
            byte[] bArr4 = new byte[4];
            secureRandom.nextBytes(bArr4);
            p13.s.e(bArr4, 12, 0, bArr3, 4);
            ft2.d.a(xVar, this.f160788f, rs2.y.ACK, n.c(16, false, bArr3, bArr2));
            this.f160796n.g0(new x(bArr2, bArrK, bArrGenerateSeed));
            return;
        }
        switch (i14) {
            case 5107:
                b0 b0Var3 = this.f160788f;
                Logger logger = this.f160787e;
                if (bArr.length < 33) {
                    ft2.d.a(xVar, b0Var3, rs2.y.LENGTH_ERROR, new byte[0]);
                    return;
                }
                byte[] bArr5 = this.f160790h;
                if (bArr5 == null) {
                    logger.warn("Received LTK distribution with no short term key");
                    ft2.d.a(xVar, b0Var3, rs2.y.ACK, new byte[]{1});
                    return;
                }
                byte[] bArrB2 = n.b(bArr, 1, 32, false, bArr5);
                bArrB2.getClass();
                byte[] bArrK2 = p13.s.k(0, 16, bArrB2);
                byte[] bArrK3 = p13.s.k(16, 18, bArrB2);
                byte[] bArrK4 = p13.s.k(18, 26, bArrB2);
                logger.trace("ltk = ".concat(lg.d.x(bArrK2)));
                logger.trace("ediv = ".concat(lg.d.x(bArrK3)));
                logger.trace("rand = ".concat(lg.d.x(bArrK4)));
                this.f160786d.saveAuthenticationInfo(this.f160784b, bArrK2, bArrK3, bArrK4);
                this.f160791i = bArrK2;
                ft2.d.a(xVar, b0Var3, rs2.y.ACK, new byte[]{0});
                return;
            case 5108:
                b0 b0Var4 = this.f160788f;
                if (bArr.length < 8) {
                    ft2.d.a(xVar, b0Var4, rs2.y.LENGTH_ERROR, new byte[0]);
                    return;
                }
                byte[] bArr6 = this.f160791i;
                if (bArr6 == null) {
                    this.f160787e.warn("Received session key diversifier with no long term key");
                    ft2.d.a(xVar, b0Var4, rs2.y.ACK, new byte[]{1});
                    return;
                }
                byte[] bArrK5 = p13.s.k(8, 16, ss2.a.b());
                byte[] bArr7 = new byte[16];
                System.arraycopy(p13.s.k(0, 8, bArr), 0, bArr7, 0, 8);
                System.arraycopy(bArrK5, 0, bArr7, 8, 8);
                this.f160792j = n.c(16, false, bArr7, bArr6);
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                byteArrayOutputStream4.write(0);
                byteArrayOutputStream4.write(bArrK5);
                rs2.y yVar3 = rs2.y.ACK;
                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                byteArray3.getClass();
                ft2.d.a(xVar, b0Var4, yVar3, byteArray3);
                return;
            case 5109:
                b0 b0Var5 = this.f160788f;
                if (bArr.length < 25) {
                    ft2.d.a(xVar, b0Var5, rs2.y.LENGTH_ERROR, new byte[0]);
                    return;
                }
                byte[] bArr8 = this.f160792j;
                if (bArr8 == null) {
                    this.f160787e.warn("Receive session key verification with no session key");
                    ft2.d.a(xVar, b0Var5, rs2.y.ACK, new byte[]{1});
                    return;
                }
                byte[] bArrB3 = n.b(bArr, 1, 24, false, bArr8);
                bArrB3.getClass();
                if (Arrays.equals(bArr8, p13.s.k(0, 16, bArrB3))) {
                    ft2.d.a(xVar, b0Var5, rs2.y.ACK, new byte[]{0});
                    return;
                } else {
                    ft2.d.a(xVar, b0Var5, rs2.y.ACK, new byte[]{2});
                    return;
                }
            default:
                sn.a.k(i14, "Unexpected message type: ");
                return;
        }
    }

    @Override // rs2.h
    public final void start(rs2.c cVar, rs2.v vVar) {
        cVar.getClass();
        vVar.getClass();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lss2/c$a;", "", "<init>", "()V", "", "DEFAULT_AUTH_TIMEOUT", "J", "", "DEFAULT_PASSKEY_TIMEOUT_SECONDS", "I", "", "JUST_WORKS_PASSKEY", "[B", "Ljava/security/SecureRandom;", "SECURE_RANDOM", "Ljava/security/SecureRandom;", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(String str, rs2.v vVar, ss2.b bVar, b0 b0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, vVar, bVar, (i14 & 8) != 0 ? null : b0Var);
    }
}
