package oo2;

import com.garmin.device.nfc.h;
import com.garmin.feature.garminpay.providers.gpay.sync.NewFitPayTransitCardSync;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.l;
import fo2.i0;
import fo2.l0;
import fo2.m;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lc.u0;
import mn2.k;
import mn2.o;
import o13.r;
import o53.m0;
import o53.s0;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.a1;
import p13.h0;
import p13.s;
import ps2.n;
import ps2.w;
import w2.a0;
import zn2.g1;
import zn2.m3;
import zn2.t;
import zn2.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Loo2/a;", "", "Lhs2/d;", "device", "Lhs2/a;", TtmlNode.TAG_METADATA, "Lzn2/g1;", "userDataManager", "Lzn2/t;", "deviceServiceProvider", "Lmn2/k;", "nfcApi", "Lmn2/o;", "ciqImageApi", "<init>", "(Lhs2/d;Lhs2/a;Lzn2/g1;Lzn2/t;Lmn2/k;Lmn2/o;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f133132h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.sync.a f133133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hs2.d f133134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hs2.a f133135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f133136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f133137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f133138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f133139g;

    static {
        new C2526a(null);
        int i14 = gt2.c.f79010a;
        f133132h = gt2.b.f79005a.h("PAY#SB#SnowballSyncStrategy");
    }

    public a(hs2.d dVar, hs2.a aVar, g1 g1Var, t tVar, k kVar, o oVar) {
        dVar.getClass();
        aVar.getClass();
        g1Var.getClass();
        tVar.getClass();
        kVar.getClass();
        oVar.getClass();
        this.f133133a = new com.garmin.feature.garminpay.providers.gpay.sync.a(dVar, aVar, g1Var, tVar, kVar, oVar);
        this.f133134b = dVar;
        this.f133135c = aVar;
        this.f133136d = g1Var;
        this.f133137e = tVar;
        this.f133138f = kVar;
        this.f133139g = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final h[] a(a aVar, String str) {
        hs2.a aVar2 = aVar.f133135c;
        mn2.a aVar3 = (mn2.a) ge1.b.W(t13.h.f161748a, new b(aVar, null));
        if (aVar3 instanceof mn2.a.C2276a) {
            return new h[0];
        }
        if (aVar3 instanceof mn2.a.b) {
            ij0.a.f93807a.getClass();
            return ij0.a.f93808b;
        }
        if (!(aVar3 instanceof mn2.a.c)) {
            u0.r();
            return null;
        }
        mn2.a.c cVar = (mn2.a.c) aVar3;
        R rC = mn2.t.a(aVar.f133139g, aVar2.getUnitId(), aVar2.getProductNumber(), cVar.f119778a, cVar.f119779b, str).c();
        rC.getClass();
        return (h[]) rC;
    }

    public static final h[] b(a aVar, l0 l0Var) throws NoSuchAlgorithmException {
        fo2.d dVarG;
        String issuerName;
        aVar.getClass();
        byte b14 = l0Var.getState() == fo2.e.ACTIVE ? (byte) 1 : (byte) 0;
        i0<String, fo2.d> i0VarH = l0Var.h();
        if (i0VarH == null || (dVarG = i0VarH.g()) == null || (issuerName = dVarG.getIssuerName()) == null) {
            l.i(l0Var.h(), " does not contain issuerName");
            return null;
        }
        h hVarI = h.i(l0Var.d());
        h hVarH = h.h(l0Var.k().h());
        h hVar = new h(h.c.TAG_ISSUER_NAME, issuerName.getBytes());
        h hVar2 = new h(h.c.TAG_CARD_ACTIVE, new byte[]{b14});
        h hVar3 = new h(h.c.TAG_DESCRIPTION, l0Var.k().g().getShortDescription().getBytes());
        NewFitPayTransitCardSync.a aVar2 = NewFitPayTransitCardSync.f51347g;
        String strH = l0Var.k().h();
        aVar2.getClass();
        strH.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        byte[] bytes = strH.getBytes(charsetForName);
        bytes.getClass();
        Charset charsetForName2 = Charset.forName("UTF-8");
        charsetForName2.getClass();
        byte[] bytes2 = issuerName.getBytes(charsetForName2);
        bytes2.getClass();
        byte[] bArrQ = s.q(bytes, bytes2);
        int length = bArrQ.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrQ, length + 1);
        bArrCopyOf[length] = b14;
        messageDigest.update(bArrCopyOf);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new h[]{hVarI, hVarH, hVar, hVar2, hVar3, new h(h.c.TAG_CREDIT_CARD_HASH, s.k(0, 8, bArrDigest)), new h(h.c.TAG_TOP_OF_WALLET_APDU, hb2.d.a("80F00101124F10A00000063201010510009156000014A1"))};
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d3 A[PHI: r14
      0x00d3: PHI (r14v8 fo2.l0) = (r14v36 fo2.l0), (r14v37 fo2.l0) binds: [B:26:0x007c, B:31:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0149  */
    /* JADX WARN: Code duplicated, block: B:65:0x015d A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:68:0x0181, B:20:0x004c, B:63:0x014c, B:65:0x015d, B:70:0x018a, B:71:0x0191), top: B:84:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x0181 A[Catch: all -> 0x0041, PHI: r2 r4 r5 r14
      0x0181: PHI (r2v25 ??) = (r2v27 ??), (r2v28 ??) binds: [B:66:0x017e, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0181: PHI (r4v9 ??) = (r4v11 ??), (r4v12 ??) binds: [B:66:0x017e, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0181: PHI (r5v12 ??) = (r5v19 ??), (r5v20 ??) binds: [B:66:0x017e, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0181: PHI (r14v27 int) = (r14v29 int), (r14v30 int) binds: [B:66:0x017e, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:68:0x0181, B:20:0x004c, B:63:0x014c, B:65:0x015d, B:70:0x018a, B:71:0x0191), top: B:84:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x018a A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:68:0x0181, B:20:0x004c, B:63:0x014c, B:65:0x015d, B:70:0x018a, B:71:0x0191), top: B:84:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x019c A[DONT_INVERT, PHI: r2 r4 r5 r14
      0x019c: PHI (r2v2 ??) = (r2v3 ??), (r2v19 ??) binds: [B:69:0x0186, B:58:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r4v2 ??) = (r4v3 ??), (r4v5 ??) binds: [B:69:0x0186, B:58:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r5v2 ??) = (r5v4 ??), (r5v6 ??) binds: [B:69:0x0186, B:58:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r14v2 ??) = (r14v6 ??), (r14v19 ??) binds: [B:69:0x0186, B:58:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x019e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:85:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (r15 == r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0105, code lost:
    
        if (r15 == r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0125, code lost:
    
        if (r15 == r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ad, code lost:
    
        if (d(r14, r0) == r1) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r13v0, types: [oo2.a] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v19, types: [fo2.l0] */
    /* JADX WARN: Type inference failed for: r14v2, types: [fo2.l0] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r4v0, types: [hs2.d] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [fo2.l0] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(l0 l0Var, t13.d dVar) throws Throwable {
        c cVar;
        ?? r14;
        ?? r15;
        ?? r16;
        l0 l0Var2;
        l0 l0Var3;
        int i14;
        List<m> listB;
        m mVar;
        String strB;
        l0 l0Var4;
        int i15;
        ?? r17;
        int i16;
        ?? r18;
        ?? r19;
        n nVarI;
        z03.d dVarP;
        int i17;
        ?? r24;
        ?? r25;
        ?? r26;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i18 = cVar.f133148g;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                cVar.f133148g = i18 - Integer.MIN_VALUE;
            } else {
                cVar = new c(this, dVar);
            }
        } else {
            cVar = new c(this, dVar);
        }
        Object objB = cVar.f133146e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ?? BooleanValue = cVar.f133148g;
        Logger logger = f133132h;
        ?? r27 = this.f133134b;
        ?? r28 = 1;
        ?? r29 = 1;
        try {
            switch (BooleanValue) {
                case 0:
                    r.b(objB);
                    ListenableFuture listenableFutureE = r27.E(a1.b(l0Var.k().h()), false);
                    l0Var2 = l0Var;
                    if (listenableFutureE != null) {
                        cVar.f133142a = l0Var;
                        cVar.f133148g = 1;
                        objB = t53.c.b(listenableFutureE, cVar);
                        break;
                    } else {
                        l0Var3 = l0Var2;
                        i14 = 0;
                        listB = l0Var3.k().g().b();
                        if (listB != null || (mVar = (m) h0.I0(listB)) == null || (strB = mVar.b()) == null) {
                            l.n(l0Var3, "No card image url in ");
                            return null;
                        }
                        if (i14 == 0) {
                            e eVar = new e(this, strB, l0Var3, null);
                            cVar.f133142a = l0Var3;
                            cVar.f133143b = i14;
                            cVar.f133144c = 0;
                            cVar.f133148g = 3;
                            objB = ks2.e.d(r27, eVar, cVar);
                        } else {
                            d dVar2 = new d(this, strB, l0Var3, null);
                            cVar.f133142a = l0Var3;
                            cVar.f133143b = i14;
                            cVar.f133144c = 0;
                            cVar.f133148g = 2;
                            objB = ks2.e.d(r27, dVar2, cVar);
                        }
                        break;
                    }
                    l0Var4 = l0Var;
                    l0Var = l0Var3;
                    l0Var = l0Var3;
                    return aVar;
                case 1:
                    l0 l0Var5 = cVar.f133142a;
                    r.b(objB);
                    l0Var4 = l0Var5;
                    l0Var4 = l0Var;
                    Map map = (Map) objB;
                    l0Var2 = l0Var4;
                    if (map != null) {
                        if (map.isEmpty()) {
                            i15 = 0;
                        } else {
                            Iterator it = map.entrySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) ((Map.Entry) it.next()).getKey());
                                    if (new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong()).equals(UUID.fromString(l0Var4.getCredentialId()))) {
                                        i15 = 1;
                                    }
                                } else {
                                    i15 = 0;
                                }
                            }
                        }
                        l0Var3 = l0Var4;
                        i14 = i15;
                    } else {
                        l0Var3 = l0Var2;
                        i14 = 0;
                    }
                    listB = l0Var3.k().g().b();
                    if (listB != null) {
                        break;
                    }
                    l.n(l0Var3, "No card image url in ");
                    return null;
                case 2:
                    i14 = cVar.f133143b;
                    l0 l0Var6 = cVar.f133142a;
                    r.b(objB);
                    l0 l0Var7 = l0Var6;
                    l0Var7 = l0Var3;
                    r27 = i14;
                    r14 = l0Var7;
                    BooleanValue = ((Boolean) objB).booleanValue();
                    if (r29 != 0) {
                        if (BooleanValue != 0) {
                            throw new NewFitPayTransitCardSync.SyncException("Device failed to process metadata", yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED);
                        }
                        cVar.f133142a = null;
                        cVar.f133143b = r27;
                        cVar.f133145d = BooleanValue;
                        cVar.f133144c = r29;
                        cVar.f133148g = 6;
                        break;
                    } else {
                        try {
                            cVar.f133142a = r14;
                            cVar.f133143b = r27;
                            cVar.f133145d = BooleanValue;
                            cVar.f133144c = r29 == true ? 1 : 0;
                            cVar.f133148g = 4;
                            if (m0.b(1000L, cVar) != aVar) {
                                boolean z14 = r29 == true ? 1 : 0;
                                r17 = r14;
                                i16 = z14 ? 1 : 0;
                                r19 = BooleanValue;
                                r18 = r27;
                                w wVar = w.f140538a;
                                long unitId = this.f133135c.getUnitId();
                                wVar.getClass();
                                nVarI = w.i(unitId);
                                if (nVarI == null) {
                                    throw new ns2.d("Null device wallet");
                                }
                                dVarP = nVarI.p(r17.d(), r17.k().h(), Float.POSITIVE_INFINITY);
                                cVar.f133142a = r17;
                                cVar.f133143b = r18;
                                cVar.f133145d = r19;
                                cVar.f133144c = i16;
                                cVar.f133148g = 5;
                                if (a0.g(dVarP, cVar) != aVar) {
                                    r26 = r19;
                                    r25 = r18;
                                    r24 = r17;
                                    i17 = i16;
                                } else {
                                    r26 = r19;
                                    r25 = r18;
                                    r24 = r17;
                                    i17 = i16;
                                    logger.info("Set express transit successfully.");
                                    BooleanValue = r26;
                                    r27 = r25;
                                    r16 = r24;
                                    r15 = i17;
                                    ?? r110 = r16;
                                    r29 = r15;
                                    r14 = r110;
                                    if (BooleanValue != 0) {
                                        throw new NewFitPayTransitCardSync.SyncException("Device failed to process metadata", yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED);
                                    }
                                    cVar.f133142a = null;
                                    cVar.f133143b = r27;
                                    cVar.f133145d = BooleanValue;
                                    cVar.f133144c = r29;
                                    cVar.f133148g = 6;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            boolean z15 = r29 == true ? 1 : 0;
                            r28 = r14;
                            l0Var = z15 ? 1 : 0;
                            logger.warn("Set express transit failed.", th);
                            BooleanValue = BooleanValue;
                            r27 = r27;
                            r16 = r28;
                            r15 = l0Var;
                        }
                        break;
                    }
                    l0Var4 = l0Var;
                    l0Var = l0Var3;
                    l0Var7 = l0Var3;
                    return aVar;
                case 3:
                    i14 = cVar.f133143b;
                    l0 l0Var8 = cVar.f133142a;
                    r.b(objB);
                    l0 l0Var9 = l0Var8;
                    l0Var9 = l0Var3;
                    boolean zBooleanValue = ((Boolean) objB).booleanValue();
                    r27 = i14;
                    r14 = l0Var9;
                    BooleanValue = zBooleanValue ? 1 : 0;
                    r29 = zBooleanValue;
                    if (r29 != 0) {
                        if (BooleanValue != 0) {
                            throw new NewFitPayTransitCardSync.SyncException("Device failed to process metadata", yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED);
                        }
                        cVar.f133142a = null;
                        cVar.f133143b = r27;
                        cVar.f133145d = BooleanValue;
                        cVar.f133144c = r29;
                        cVar.f133148g = 6;
                        break;
                    } else {
                        cVar.f133142a = r14;
                        cVar.f133143b = r27;
                        cVar.f133145d = BooleanValue;
                        cVar.f133144c = r29 == true ? 1 : 0;
                        cVar.f133148g = 4;
                        if (m0.b(1000L, cVar) != aVar) {
                            boolean z16 = r29 == true ? 1 : 0;
                            r17 = r14;
                            i16 = z16 ? 1 : 0;
                            r19 = BooleanValue;
                            r18 = r27;
                            w wVar2 = w.f140538a;
                            long unitId2 = this.f133135c.getUnitId();
                            wVar2.getClass();
                            nVarI = w.i(unitId2);
                            if (nVarI == null) {
                                throw new ns2.d("Null device wallet");
                            }
                            dVarP = nVarI.p(r17.d(), r17.k().h(), Float.POSITIVE_INFINITY);
                            cVar.f133142a = r17;
                            cVar.f133143b = r18;
                            cVar.f133145d = r19;
                            cVar.f133144c = i16;
                            cVar.f133148g = 5;
                            if (a0.g(dVarP, cVar) != aVar) {
                                r26 = r19;
                                r25 = r18;
                                r24 = r17;
                                i17 = i16;
                            } else {
                                r26 = r19;
                                r25 = r18;
                                r24 = r17;
                                i17 = i16;
                                logger.info("Set express transit successfully.");
                                BooleanValue = r26;
                                r27 = r25;
                                r16 = r24;
                                r15 = i17;
                                ?? r111 = r16;
                                r29 = r15;
                                r14 = r111;
                                if (BooleanValue != 0) {
                                    throw new NewFitPayTransitCardSync.SyncException("Device failed to process metadata", yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED);
                                }
                                cVar.f133142a = null;
                                cVar.f133143b = r27;
                                cVar.f133145d = BooleanValue;
                                cVar.f133144c = r29;
                                cVar.f133148g = 6;
                            }
                        }
                        break;
                    }
                    l0Var4 = l0Var;
                    l0Var9 = l0Var3;
                    l0Var7 = l0Var3;
                    return aVar;
                case 4:
                    int i19 = cVar.f133144c;
                    boolean z17 = cVar.f133145d;
                    int i24 = cVar.f133143b;
                    l0 l0Var10 = cVar.f133142a;
                    r.b(objB);
                    r19 = z17;
                    r18 = i24;
                    r17 = l0Var10;
                    i16 = i19;
                    w wVar3 = w.f140538a;
                    long unitId3 = this.f133135c.getUnitId();
                    wVar3.getClass();
                    nVarI = w.i(unitId3);
                    if (nVarI == null) {
                        throw new ns2.d("Null device wallet");
                    }
                    dVarP = nVarI.p(r17.d(), r17.k().h(), Float.POSITIVE_INFINITY);
                    cVar.f133142a = r17;
                    cVar.f133143b = r18;
                    cVar.f133145d = r19;
                    cVar.f133144c = i16;
                    cVar.f133148g = 5;
                    if (a0.g(dVarP, cVar) != aVar) {
                        r26 = r19;
                        r25 = r18;
                        r24 = r17;
                        i17 = i16;
                        logger.info("Set express transit successfully.");
                        BooleanValue = r26;
                        r27 = r25;
                        r16 = r24;
                        r15 = i17;
                        ?? r112 = r16;
                        r29 = r15;
                        r14 = r112;
                        if (BooleanValue != 0) {
                            throw new NewFitPayTransitCardSync.SyncException("Device failed to process metadata", yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED);
                        }
                        cVar.f133142a = null;
                        cVar.f133143b = r27;
                        cVar.f133145d = BooleanValue;
                        cVar.f133144c = r29;
                        cVar.f133148g = 6;
                        break;
                    } else {
                        r26 = r19;
                        r25 = r18;
                        r24 = r17;
                        i17 = i16;
                    }
                    l0Var4 = l0Var;
                    l0Var9 = l0Var3;
                    l0Var7 = l0Var3;
                    return aVar;
                case 5:
                    int i25 = cVar.f133144c;
                    boolean z18 = cVar.f133145d;
                    int i26 = cVar.f133143b;
                    l0 l0Var11 = cVar.f133142a;
                    r.b(objB);
                    r26 = z18;
                    r25 = i26;
                    r24 = l0Var11;
                    i17 = i25;
                    r26 = r19;
                    r25 = r18;
                    r24 = r17;
                    i17 = i16;
                    logger.info("Set express transit successfully.");
                    BooleanValue = r26;
                    r27 = r25;
                    r16 = r24;
                    r15 = i17;
                    ?? r113 = r16;
                    r29 = r15;
                    r14 = r113;
                    if (BooleanValue != 0) {
                        throw new NewFitPayTransitCardSync.SyncException("Device failed to process metadata", yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED);
                    }
                    cVar.f133142a = null;
                    cVar.f133143b = r27;
                    cVar.f133145d = BooleanValue;
                    cVar.f133144c = r29;
                    cVar.f133148g = 6;
                    break;
                    break;
                case 6:
                    r.b(objB);
                    return yo2.a.EnumC3717a.SUCCESS;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r13 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(l0 l0Var, v13.c cVar) throws Throwable {
        f fVar;
        l0 l0Var2;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f133162d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f133162d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.f133160b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f133162d;
        if (i15 != 0) {
            if (i15 == 1) {
                l0Var2 = fVar.f133159a;
                r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        long unitId = this.f133135c.getUnitId();
        fVar.f133159a = l0Var;
        fVar.f133162d = 1;
        g1 g1Var = this.f133136d;
        g1Var.getClass();
        x53.c cVar2 = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new m3(g1Var, unitId, l0Var, null), fVar);
        if (objE0 != obj2) {
            objE0 = Unit.INSTANCE;
        }
        if (objE0 != obj2) {
            l0Var2 = l0Var;
        }
        return obj2;
        String credentialId = l0Var2.getCredentialId();
        fVar.f133159a = null;
        fVar.f133162d = 2;
        t tVar = this.f133137e;
        tVar.getClass();
        x53.c cVar3 = s0.f129406a;
        Object objE1 = ge1.b.e0(x53.b.f189152a, new x(tVar, credentialId, true, null), fVar);
        if (objE1 != obj2) {
            objE1 = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: oo2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Loo2/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2526a {
        public /* synthetic */ C2526a(j jVar) {
            this();
        }

        private C2526a() {
        }
    }
}
