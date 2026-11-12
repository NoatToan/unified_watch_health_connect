package of;

import android.graphics.Bitmap;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import dg.q;
import dg.r;
import dg.t;
import dg.u;
import hf.y;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import wf.m;
import wf.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lof/a;", "Lof/j;", "Lhf/j;", "imageLoader", "Ldg/q;", "systemCallbacks", "Lwf/o;", "requestService", "Ldg/l;", "logger", "<init>", "(Lhf/j;Ldg/q;Lwf/o;Ldg/l;)V", "b", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f131584e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.j f131585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f131586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f131587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rf.c f131588d;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lof/a$b;", "", "Lhf/h;", "image", "", "isSampled", "Llf/e;", "dataSource", "", "diskCacheKey", "<init>", "(Lhf/h;ZLlf/e;Ljava/lang/String;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hf.h f131589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f131590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lf.e f131591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f131592d;

        public b(hf.h hVar, boolean z14, lf.e eVar, String str) {
            this.f131589a = hVar;
            this.f131590b = z14;
            this.f131591c = eVar;
            this.f131592d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f131589a, bVar.f131589a) && this.f131590b == bVar.f131590b && this.f131591c == bVar.f131591c && s.g(this.f131592d, bVar.f131592d);
        }

        public final int hashCode() {
            int iHashCode = (this.f131591c.hashCode() + q6.f.g(this.f131589a.hashCode() * 31, 31, this.f131590b)) * 31;
            String str = this.f131592d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ExecuteResult(image=");
            sb3.append(this.f131589a);
            sb3.append(", isSampled=");
            sb3.append(this.f131590b);
            sb3.append(", dataSource=");
            sb3.append(this.f131591c);
            sb3.append(", diskCacheKey=");
            return a0.m(sb3, this.f131592d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    static {
        new C2500a(null);
    }

    public a(hf.j jVar, q qVar, o oVar, dg.l lVar) {
        this.f131585a = jVar;
        this.f131586b = qVar;
        this.f131587c = oVar;
        this.f131588d = new rf.c(jVar, oVar, lVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[LOOP:0: B:17:0x0056->B:21:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a5 -> B:28:0x00a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(of.a r6, nf.o r7, hf.c r8, wf.f r9, java.lang.Object r10, wf.m r11, hf.e r12, v13.c r13) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: of.a.b(of.a, nf.o, hf.c, wf.f, java.lang.Object, wf.m, hf.e, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0159  */
    /* JADX WARN: Code duplicated, block: B:61:0x015c  */
    /* JADX WARN: Code duplicated, block: B:63:0x015f  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0191, code lost:
    
        if (r1 == r9) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, hf.c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, hf.c] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, wf.m] */
    /* JADX WARN: Type inference failed for: r2v0, types: [wf.f] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a aVar, wf.f fVar, Object obj, m mVar, hf.e eVar, v13.c cVar) {
        c cVar2;
        nf.o oVar;
        lf.o oVar2;
        r0 r0Var;
        wf.f fVar2;
        Object obj2;
        r0 r0Var2;
        r0 r0Var3;
        r0 r0Var4;
        hf.e eVar2;
        T t7;
        r0 r0Var5;
        b bVar;
        r0 r0Var6;
        hf.e eVar3;
        T t14;
        nf.o oVar3;
        lf.o oVar4;
        Object obj3;
        Object obj4;
        r0 r0Var7 = fVar;
        aVar.getClass();
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f131613j;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f131613j = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(aVar, cVar);
            }
        } else {
            cVar2 = new c(aVar, cVar);
        }
        c cVar3 = cVar2;
        Object obj5 = cVar3.f131611h;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar3.f131613j;
        try {
            if (i15 == 0) {
                r0 r0VarS = wr.g.s(obj5);
                r0VarS.f105810a = mVar;
                r0Var = new r0();
                r0Var.f105810a = aVar.f131585a.getF83581d();
                r0 r0Var8 = new r0();
                try {
                    r0VarS.f105810a = aVar.f131587c.c((m) r0VarS.f105810a);
                    p<nf.j.a<?>, k23.d<?>> pVar = r0Var7.f184910i;
                    lf.h.a aVar3 = r0Var7.f184911j;
                    if (pVar != null || aVar3 != null) {
                        hf.c cVar4 = (hf.c) r0Var.f105810a;
                        cVar4.getClass();
                        hf.c.a aVar4 = new hf.c.a(cVar4);
                        p<nf.j.a<?>, k23.d<?>> pVar2 = r0Var7.f184910i;
                        t.a aVar5 = t.f59501a;
                        if (pVar2 != null) {
                            aVar4.f83551d.add(0, new r(0, pVar2));
                        }
                        if (aVar3 != null) {
                            aVar4.f83552e.add(0, new dg.s(aVar3, 0));
                        }
                        r0Var.f105810a = aVar4.c();
                    }
                    hf.c cVar5 = (hf.c) r0Var.f105810a;
                    m mVar2 = (m) r0VarS.f105810a;
                    cVar3.f131604a = r0Var7;
                    cVar3.f131605b = obj;
                    cVar3.f131606c = eVar;
                    cVar3.f131607d = r0VarS;
                    cVar3.f131608e = r0Var;
                    cVar3.f131609f = r0Var8;
                    cVar3.f131610g = r0Var8;
                    cVar3.f131613j = 1;
                    Object objD = aVar.d(cVar5, r0Var7, obj, mVar2, eVar, cVar3);
                    if (objD != aVar2) {
                        fVar2 = fVar;
                        obj2 = obj;
                        r0Var2 = r0VarS;
                        r0Var3 = r0Var8;
                        r0Var4 = r0Var3;
                        eVar2 = eVar;
                        t7 = objD;
                    }
                    return aVar2;
                } catch (Throwable th3) {
                    th = th3;
                    r0Var7 = r0Var8;
                    T t15 = r0Var7.f105810a;
                    if (t15 instanceof nf.o) {
                    }
                    if (oVar != null && (oVar2 = oVar.f125762a) != null) {
                        t.a aVar6 = t.f59501a;
                        vb.h.p(oVar2);
                    }
                    throw th;
                }
            }
            if (i15 == 1) {
                r0Var3 = cVar3.f131610g;
                r0Var4 = cVar3.f131609f;
                r0 r0Var9 = cVar3.f131608e;
                r0 r0Var10 = cVar3.f131607d;
                eVar2 = cVar3.f131606c;
                Object obj6 = cVar3.f131605b;
                wf.f fVar3 = cVar3.f131604a;
                try {
                    o13.r.b(obj5);
                    r0Var2 = r0Var10;
                    obj2 = obj6;
                    r0Var = r0Var9;
                    fVar2 = fVar3;
                    t7 = obj5;
                } catch (Throwable th4) {
                    th = th4;
                    r0Var7 = r0Var4;
                    T t16 = r0Var7.f105810a;
                    oVar = t16 instanceof nf.o ? (nf.o) t16 : null;
                    if (oVar != null) {
                        t.a aVar7 = t.f59501a;
                        try {
                            vb.h.p(oVar2);
                        } catch (RuntimeException e4) {
                            throw e4;
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } else if (i15 == 2) {
                r0Var5 = cVar3.f131609f;
                r0Var6 = cVar3.f131607d;
                eVar3 = cVar3.f131606c;
                fVar2 = cVar3.f131604a;
                o13.r.b(obj5);
                cVar3 = cVar3;
                obj3 = obj5;
                bVar = (b) obj3;
                r0Var2 = r0Var6;
                eVar2 = eVar3;
                t14 = r0Var5.f105810a;
                if (t14 instanceof nf.o) {
                    oVar3 = (nf.o) t14;
                } else {
                    oVar3 = null;
                }
                if (oVar3 != null && (oVar4 = oVar3.f125762a) != null) {
                    t.a aVar8 = t.f59501a;
                    try {
                        vb.h.p(oVar4);
                    } catch (RuntimeException e14) {
                        throw e14;
                    } catch (Exception unused2) {
                    }
                }
                m mVar3 = (m) r0Var2.f105810a;
                cVar3.f131604a = null;
                cVar3.f131605b = null;
                cVar3.f131606c = null;
                cVar3.f131607d = null;
                cVar3.f131608e = null;
                cVar3.f131609f = null;
                cVar3.f131610g = null;
                cVar3.f131613j = 3;
                Object objA = i.a(bVar, fVar2, mVar3, eVar2, null, cVar3);
                obj4 = objA;
            } else {
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj5);
                obj4 = obj5;
            }
            b bVar2 = (b) obj4;
            hf.h hVar = bVar2.f131589a;
            Bitmap.Config[] configArr = u.f59504a;
            if (hVar instanceof hf.a) {
                ((hf.a) hVar).f83537a.prepareToDraw();
            }
            return bVar2;
            r0Var3.f105810a = t7;
            T t17 = r0Var4.f105810a;
            nf.i iVar = (nf.i) t17;
            if (iVar instanceof nf.o) {
                t13.g gVar = fVar2.f184914m;
                r0Var5 = r0Var4;
                d dVar = new d(aVar, r0Var5, r0Var, fVar2, obj2, r0Var2, eVar2, null);
                cVar3.f131604a = fVar2;
                cVar3.f131605b = null;
                cVar3.f131606c = eVar2;
                cVar3.f131607d = r0Var2;
                cVar3.f131608e = null;
                cVar3.f131609f = r0Var5;
                cVar3.f131610g = null;
                cVar3.f131613j = 2;
                Object objE0 = ge1.b.e0(gVar, dVar, cVar3);
                if (objE0 != aVar2) {
                    r0Var6 = r0Var2;
                    eVar3 = eVar2;
                    obj3 = objE0;
                    bVar = (b) obj3;
                    r0Var2 = r0Var6;
                    eVar2 = eVar3;
                    t14 = r0Var5.f105810a;
                    if (t14 instanceof nf.o) {
                        oVar3 = (nf.o) t14;
                    } else {
                        oVar3 = null;
                    }
                    if (oVar3 != null) {
                        t.a aVar9 = t.f59501a;
                        vb.h.p(oVar4);
                    }
                    m mVar4 = (m) r0Var2.f105810a;
                    cVar3.f131604a = null;
                    cVar3.f131605b = null;
                    cVar3.f131606c = null;
                    cVar3.f131607d = null;
                    cVar3.f131608e = null;
                    cVar3.f131609f = null;
                    cVar3.f131610g = null;
                    cVar3.f131613j = 3;
                    Object objA2 = i.a(bVar, fVar2, mVar4, eVar2, null, cVar3);
                    obj4 = objA2;
                }
            } else {
                r0Var5 = r0Var4;
                if (!(iVar instanceof nf.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new b(((nf.l) t17).f125755a, ((nf.l) t17).f125756b, ((nf.l) t17).f125757c, null);
                t14 = r0Var5.f105810a;
                if (t14 instanceof nf.o) {
                    oVar3 = (nf.o) t14;
                } else {
                    oVar3 = null;
                }
                if (oVar3 != null) {
                    t.a aVar10 = t.f59501a;
                    vb.h.p(oVar4);
                }
                m mVar5 = (m) r0Var2.f105810a;
                cVar3.f131604a = null;
                cVar3.f131605b = null;
                cVar3.f131606c = null;
                cVar3.f131607d = null;
                cVar3.f131608e = null;
                cVar3.f131609f = null;
                cVar3.f131610g = null;
                cVar3.f131613j = 3;
                Object objA3 = i.a(bVar, fVar2, mVar5, eVar2, null, cVar3);
                obj4 = objA3;
            }
            return aVar2;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // of.j
    public final Object a(l lVar, v13.c cVar) throws Throwable {
        f fVar;
        l lVar2 = lVar;
        rf.c cVar2 = this.f131588d;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f131635d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f131635d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f131633b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar2.f131635d;
        if (i15 == 0) {
            o13.r.b(obj);
            try {
                wf.f fVar3 = lVar2.f131661d;
                Object obj2 = fVar3.f184903b;
                xf.g gVar = lVar2.f131662e;
                t.a aVar2 = t.f59501a;
                hf.e eVar = lVar2.f131663f;
                m mVarA = this.f131587c.a(fVar3, gVar);
                xf.f fVar4 = mVarA.f184998c;
                eVar.getClass();
                List<p<qf.c<? extends Object, ? extends Object>, k23.d<? extends Object>>> list = this.f131585a.getF83581d().f83542b;
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                    p<qf.c<? extends Object, ? extends Object>, k23.d<? extends Object>> pVar = list.get(i16);
                    qf.c<? extends Object, ? extends Object> cVar3 = pVar.f128594a;
                    if (pVar.f128595b.q(obj2)) {
                        cVar3.getClass();
                        y yVarA = cVar3.a(obj2, mVarA);
                        if (yVarA != null) {
                            obj2 = yVarA;
                        }
                    }
                }
                rf.b.C2864b c2864bB = cVar2.b(fVar3, obj2, mVarA, eVar);
                rf.b.c cVarA = c2864bB != null ? cVar2.a(fVar3, c2864bB, gVar, fVar4) : null;
                if (cVarA == null) {
                    t13.g gVar2 = fVar3.f184913l;
                    g gVar3 = new g(this, fVar3, obj2, mVarA, eVar, c2864bB, lVar2, null);
                    fVar2.f131632a = lVar2;
                    fVar2.f131635d = 1;
                    Object objE0 = ge1.b.e0(gVar2, gVar3, fVar2);
                    return objE0 == aVar ? aVar : objE0;
                }
                Map<String, Object> map = cVarA.f152368b;
                hf.h hVar = cVarA.f152367a;
                lf.e eVar2 = lf.e.MEMORY_CACHE;
                Object obj3 = map.get("coil#disk_cache_key");
                String str = obj3 instanceof String ? (String) obj3 : null;
                Object obj4 = map.get("coil#is_sampled");
                Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                return new wf.p(hVar, fVar3, eVar2, c2864bB, str, bool != null ? bool.booleanValue() : false, lVar2.f131664g);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l lVar3 = fVar2.f131632a;
            try {
                o13.r.b(obj);
                return obj;
            } catch (Throwable th4) {
                th = th4;
                lVar2 = lVar3;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        return t.a(lVar2.getF131661d(), th);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b1 -> B:28:0x00b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(hf.c r9, wf.f r10, java.lang.Object r11, wf.m r12, hf.e r13, v13.c r14) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: of.a.d(hf.c, wf.f, java.lang.Object, wf.m, hf.e, v13.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: of.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lof/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2500a {
        public /* synthetic */ C2500a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2500a() {
        }
    }
}
