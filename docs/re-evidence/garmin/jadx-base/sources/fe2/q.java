package fe2;

import java.util.ArrayList;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import wd2.i2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lfe2/q;", "", "", "deviceUnitId", "Lae2/e0;", "publisher", "Lxd2/a1;", "repository", "Lde2/g0;", "deviceManager", "<init>", "(JLae2/e0;Lxd2/a1;Lde2/g0;)V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f70890f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f70891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae2.e0 f70892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xd2.a1 f70893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final de2.g0 f70894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Logger f70895e;

    static {
        new a(null);
    }

    public q(long j8, ae2.e0 e0Var, xd2.a1 a1Var, de2.g0 g0Var) {
        e0Var.getClass();
        a1Var.getClass();
        g0Var.getClass();
        this.f70891a = j8;
        this.f70892b = e0Var;
        this.f70893c = a1Var;
        this.f70894d = g0Var;
        this.f70895e = i2.a("ClassicTerminator");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(c2 c2Var, de2.g0.b bVar, v13.c cVar) {
        r rVar;
        ArrayList arrayListM;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f70902d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f70902d = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object obj = rVar.f70900b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f70902d;
        if (i15 == 0) {
            o13.r.b(obj);
            arrayListM = p13.x.m(c2Var);
            if (!p005kotlin.jvm.internal.s.g(bVar, de2.g0.b.d.f59299a)) {
                arrayListM.add(c2.a.f70684a);
            }
            rVar.f70899a = arrayListM;
            rVar.f70902d = 1;
            if (this.f70893c.b(this.f70891a, rVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayListM = rVar.f70899a;
            o13.r.b(obj);
        }
        return new d2.a(arrayListM);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(de2.g0.b bVar, xd2.g1 g1Var, v13.c cVar) {
        s sVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f70916e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f70916e = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object obj = sVar.f70914c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f70916e;
        if (i15 == 0) {
            o13.r.b(obj);
            sVar.f70912a = bVar;
            sVar.f70913b = g1Var;
            sVar.f70916e = 1;
            if (this.f70893c.b(this.f70891a, sVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g1Var = sVar.f70913b;
            bVar = sVar.f70912a;
            o13.r.b(obj);
        }
        ArrayList arrayList = new ArrayList();
        if (!p005kotlin.jvm.internal.s.g(bVar, de2.g0.b.d.f59299a)) {
            arrayList.add(c2.a.f70684a);
        }
        if (g1Var != null && (g1Var instanceof xd2.g1.a)) {
            arrayList.add(c2.b.C1450b.f70686a);
        }
        return new d2.b(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(String str, v13.c cVar) {
        t tVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f70930c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f70930c = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        t tVar2 = tVar;
        Object objV = tVar2.f70928a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar2.f70930c;
        if (i15 == 0) {
            o13.r.b(objV);
            this.f70895e.debug(n23.j.d(this.f70891a, "Ending session: ", str, " for "));
            tVar2.f70930c = 1;
            objV = this.f70893c.v(this.f70891a, this.f70892b, str, tVar2);
            if (objV == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objV);
        }
        return ((xd2.g1) objV) instanceof xd2.g1.b ? new d2.b(null, 1, null) : new d2.a(p13.w.c(c2.b.a.f70685a));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:44:0x0102  */
    /* JADX WARN: Code duplicated, block: B:47:0x0117  */
    /* JADX WARN: Code duplicated, block: B:50:0x011c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Code duplicated, block: B:55:0x013c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0154  */
    /* JADX WARN: Code duplicated, block: B:62:0x0158  */
    /* JADX WARN: Code duplicated, block: B:64:0x015e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0161  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:68:0x0168  */
    /* JADX WARN: Code duplicated, block: B:72:0x0181  */
    /* JADX WARN: Code duplicated, block: B:75:0x019a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x019b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x019c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, v13.c cVar) throws Throwable {
        u uVar;
        o53.i0 i0Var;
        Object objE0;
        String str2;
        o53.i0 i0Var2;
        o53.i0 i0Var3;
        o53.i0 i0Var4;
        o53.i0 i0Var5;
        o53.i0 i0Var6;
        Object objE1;
        Object objAwait;
        o53.i0 i0Var7;
        xd2.g1 g1Var;
        xd2.g1.a aVar;
        c2 c2Var;
        q qVar;
        q qVar2;
        de2.g0.b bVar;
        xd2.g1 g1Var2;
        Object objAwait2;
        de2.g0.b bVar2;
        Object objB;
        Object objA;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f70944i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f70944i = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objE2 = uVar.f70942g;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        switch (uVar.f70944i) {
            case 0:
                o13.r.b(objE2);
                this.f70895e.debug(v.h.u(this.f70891a, "Ending sessions: ", " + grouptrackSessionId ", str));
                x53.c cVar2 = o53.s0.f129406a;
                o53.t1 t1Var = u53.o.f168762a;
                v vVar = new v(this, null);
                uVar.f70936a = str;
                uVar.f70944i = 1;
                objE2 = ge1.b.e0(t1Var, vVar, uVar);
                if (objE2 != aVar2) {
                    i0Var = (o53.i0) objE2;
                    x53.c cVar3 = o53.s0.f129406a;
                    o53.t1 t1Var2 = u53.o.f168762a;
                    x xVar = new x(this, null);
                    uVar.f70936a = str;
                    uVar.f70937b = i0Var;
                    uVar.f70944i = 2;
                    objE0 = ge1.b.e0(t1Var2, xVar, uVar);
                    if (objE0 != aVar2) {
                        str2 = str;
                        i0Var2 = i0Var;
                        objE2 = objE0;
                        i0Var3 = (o53.i0) objE2;
                        if (str2 != null) {
                            x53.c cVar4 = o53.s0.f129406a;
                            o53.t1 t1Var3 = u53.o.f168762a;
                            w wVar = new w(this, str2, null);
                            uVar.f70936a = null;
                            uVar.f70937b = i0Var2;
                            uVar.f70938c = i0Var3;
                            uVar.f70939d = null;
                            uVar.f70944i = 3;
                            objE1 = ge1.b.e0(t1Var3, wVar, uVar);
                            if (objE1 != aVar2) {
                                i0Var4 = i0Var2;
                                i0Var5 = i0Var3;
                                objE2 = objE1;
                                i0Var6 = (o53.i0) objE2;
                                uVar.f70936a = null;
                                uVar.f70937b = i0Var4;
                                uVar.f70938c = null;
                                uVar.f70939d = i0Var6;
                                uVar.f70944i = 4;
                                objAwait = i0Var5.await(uVar);
                                if (objAwait != aVar2) {
                                    o53.i0 i0Var8 = i0Var6;
                                    objE2 = objAwait;
                                    i0Var7 = i0Var8;
                                    g1Var = (xd2.g1) objE2;
                                    if (g1Var instanceof xd2.g1.b) {
                                        uVar.f70936a = null;
                                        uVar.f70937b = null;
                                        uVar.f70938c = null;
                                        uVar.f70939d = i0Var7;
                                        uVar.f70940e = this;
                                        uVar.f70944i = 5;
                                        objE2 = i0Var4.await(uVar);
                                        if (objE2 != aVar2) {
                                            qVar2 = this;
                                            bVar = (de2.g0.b) objE2;
                                            if (i0Var7 != null) {
                                                uVar.f70936a = null;
                                                uVar.f70937b = null;
                                                uVar.f70938c = null;
                                                uVar.f70939d = null;
                                                uVar.f70940e = qVar2;
                                                uVar.f70941f = bVar;
                                                uVar.f70944i = 6;
                                                objAwait2 = i0Var7.await(uVar);
                                                if (objAwait2 != aVar2) {
                                                    objE2 = objAwait2;
                                                    bVar2 = bVar;
                                                    xd2.g1 g1Var3 = (xd2.g1) objE2;
                                                    bVar = bVar2;
                                                    g1Var2 = g1Var3;
                                                    uVar.f70936a = null;
                                                    uVar.f70937b = null;
                                                    uVar.f70938c = null;
                                                    uVar.f70939d = null;
                                                    uVar.f70940e = null;
                                                    uVar.f70941f = null;
                                                    uVar.f70944i = 7;
                                                    objB = qVar2.b(bVar, g1Var2, uVar);
                                                    if (objB == aVar2) {
                                                        return objB;
                                                    }
                                                }
                                            } else {
                                                g1Var2 = null;
                                                uVar.f70936a = null;
                                                uVar.f70937b = null;
                                                uVar.f70938c = null;
                                                uVar.f70939d = null;
                                                uVar.f70940e = null;
                                                uVar.f70941f = null;
                                                uVar.f70944i = 7;
                                                objB = qVar2.b(bVar, g1Var2, uVar);
                                                if (objB == aVar2) {
                                                    return objB;
                                                }
                                            }
                                        }
                                    } else {
                                        if (g1Var instanceof xd2.g1.a) {
                                            lc.u0.r();
                                            return null;
                                        }
                                        aVar = (xd2.g1.a) g1Var;
                                        if (aVar instanceof xd2.g1.a.b) {
                                            c2Var = c2.b.c.f70687a;
                                        } else if (aVar instanceof xd2.g1.a.d) {
                                            c2Var = c2.b.d.f70688a;
                                        } else {
                                            c2Var = c2.b.a.f70685a;
                                        }
                                        uVar.f70936a = null;
                                        uVar.f70937b = null;
                                        uVar.f70938c = null;
                                        uVar.f70939d = null;
                                        uVar.f70940e = this;
                                        uVar.f70941f = c2Var;
                                        uVar.f70944i = 8;
                                        objE2 = i0Var4.await(uVar);
                                        if (objE2 != aVar2) {
                                            qVar = this;
                                            uVar.f70936a = null;
                                            uVar.f70937b = null;
                                            uVar.f70938c = null;
                                            uVar.f70939d = null;
                                            uVar.f70940e = null;
                                            uVar.f70941f = null;
                                            uVar.f70944i = 9;
                                            objA = qVar.a(c2Var, (de2.g0.b) objE2, uVar);
                                            if (objA == aVar2) {
                                                return objA;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            i0Var4 = i0Var2;
                            i0Var5 = i0Var3;
                            i0Var6 = null;
                            uVar.f70936a = null;
                            uVar.f70937b = i0Var4;
                            uVar.f70938c = null;
                            uVar.f70939d = i0Var6;
                            uVar.f70944i = 4;
                            objAwait = i0Var5.await(uVar);
                            if (objAwait != aVar2) {
                                o53.i0 i0Var9 = i0Var6;
                                objE2 = objAwait;
                                i0Var7 = i0Var9;
                                g1Var = (xd2.g1) objE2;
                                if (g1Var instanceof xd2.g1.b) {
                                    uVar.f70936a = null;
                                    uVar.f70937b = null;
                                    uVar.f70938c = null;
                                    uVar.f70939d = i0Var7;
                                    uVar.f70940e = this;
                                    uVar.f70944i = 5;
                                    objE2 = i0Var4.await(uVar);
                                    if (objE2 != aVar2) {
                                        qVar2 = this;
                                        bVar = (de2.g0.b) objE2;
                                        if (i0Var7 != null) {
                                            uVar.f70936a = null;
                                            uVar.f70937b = null;
                                            uVar.f70938c = null;
                                            uVar.f70939d = null;
                                            uVar.f70940e = qVar2;
                                            uVar.f70941f = bVar;
                                            uVar.f70944i = 6;
                                            objAwait2 = i0Var7.await(uVar);
                                            if (objAwait2 != aVar2) {
                                                objE2 = objAwait2;
                                                bVar2 = bVar;
                                                xd2.g1 g1Var4 = (xd2.g1) objE2;
                                                bVar = bVar2;
                                                g1Var2 = g1Var4;
                                                uVar.f70936a = null;
                                                uVar.f70937b = null;
                                                uVar.f70938c = null;
                                                uVar.f70939d = null;
                                                uVar.f70940e = null;
                                                uVar.f70941f = null;
                                                uVar.f70944i = 7;
                                                objB = qVar2.b(bVar, g1Var2, uVar);
                                                if (objB == aVar2) {
                                                    return objB;
                                                }
                                            }
                                        } else {
                                            g1Var2 = null;
                                            uVar.f70936a = null;
                                            uVar.f70937b = null;
                                            uVar.f70938c = null;
                                            uVar.f70939d = null;
                                            uVar.f70940e = null;
                                            uVar.f70941f = null;
                                            uVar.f70944i = 7;
                                            objB = qVar2.b(bVar, g1Var2, uVar);
                                            if (objB == aVar2) {
                                                return objB;
                                            }
                                        }
                                    }
                                } else {
                                    if (g1Var instanceof xd2.g1.a) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    aVar = (xd2.g1.a) g1Var;
                                    if (aVar instanceof xd2.g1.a.b) {
                                        c2Var = c2.b.c.f70687a;
                                    } else if (aVar instanceof xd2.g1.a.d) {
                                        c2Var = c2.b.d.f70688a;
                                    } else {
                                        c2Var = c2.b.a.f70685a;
                                    }
                                    uVar.f70936a = null;
                                    uVar.f70937b = null;
                                    uVar.f70938c = null;
                                    uVar.f70939d = null;
                                    uVar.f70940e = this;
                                    uVar.f70941f = c2Var;
                                    uVar.f70944i = 8;
                                    objE2 = i0Var4.await(uVar);
                                    if (objE2 != aVar2) {
                                        qVar = this;
                                        uVar.f70936a = null;
                                        uVar.f70937b = null;
                                        uVar.f70938c = null;
                                        uVar.f70939d = null;
                                        uVar.f70940e = null;
                                        uVar.f70941f = null;
                                        uVar.f70944i = 9;
                                        objA = qVar.a(c2Var, (de2.g0.b) objE2, uVar);
                                        if (objA == aVar2) {
                                            return objA;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar2;
            case 1:
                str = uVar.f70936a;
                o13.r.b(objE2);
                i0Var = (o53.i0) objE2;
                x53.c cVar5 = o53.s0.f129406a;
                o53.t1 t1Var4 = u53.o.f168762a;
                x xVar2 = new x(this, null);
                uVar.f70936a = str;
                uVar.f70937b = i0Var;
                uVar.f70944i = 2;
                objE0 = ge1.b.e0(t1Var4, xVar2, uVar);
                if (objE0 != aVar2) {
                    str2 = str;
                    i0Var2 = i0Var;
                    objE2 = objE0;
                    i0Var3 = (o53.i0) objE2;
                    if (str2 != null) {
                        x53.c cVar6 = o53.s0.f129406a;
                        o53.t1 t1Var5 = u53.o.f168762a;
                        w wVar2 = new w(this, str2, null);
                        uVar.f70936a = null;
                        uVar.f70937b = i0Var2;
                        uVar.f70938c = i0Var3;
                        uVar.f70939d = null;
                        uVar.f70944i = 3;
                        objE1 = ge1.b.e0(t1Var5, wVar2, uVar);
                        if (objE1 != aVar2) {
                            i0Var4 = i0Var2;
                            i0Var5 = i0Var3;
                            objE2 = objE1;
                            i0Var6 = (o53.i0) objE2;
                            uVar.f70936a = null;
                            uVar.f70937b = i0Var4;
                            uVar.f70938c = null;
                            uVar.f70939d = i0Var6;
                            uVar.f70944i = 4;
                            objAwait = i0Var5.await(uVar);
                            if (objAwait != aVar2) {
                                o53.i0 i0Var10 = i0Var6;
                                objE2 = objAwait;
                                i0Var7 = i0Var10;
                                g1Var = (xd2.g1) objE2;
                                if (g1Var instanceof xd2.g1.b) {
                                    uVar.f70936a = null;
                                    uVar.f70937b = null;
                                    uVar.f70938c = null;
                                    uVar.f70939d = i0Var7;
                                    uVar.f70940e = this;
                                    uVar.f70944i = 5;
                                    objE2 = i0Var4.await(uVar);
                                    if (objE2 != aVar2) {
                                        qVar2 = this;
                                        bVar = (de2.g0.b) objE2;
                                        if (i0Var7 != null) {
                                            uVar.f70936a = null;
                                            uVar.f70937b = null;
                                            uVar.f70938c = null;
                                            uVar.f70939d = null;
                                            uVar.f70940e = qVar2;
                                            uVar.f70941f = bVar;
                                            uVar.f70944i = 6;
                                            objAwait2 = i0Var7.await(uVar);
                                            if (objAwait2 != aVar2) {
                                                objE2 = objAwait2;
                                                bVar2 = bVar;
                                                xd2.g1 g1Var5 = (xd2.g1) objE2;
                                                bVar = bVar2;
                                                g1Var2 = g1Var5;
                                                uVar.f70936a = null;
                                                uVar.f70937b = null;
                                                uVar.f70938c = null;
                                                uVar.f70939d = null;
                                                uVar.f70940e = null;
                                                uVar.f70941f = null;
                                                uVar.f70944i = 7;
                                                objB = qVar2.b(bVar, g1Var2, uVar);
                                                if (objB == aVar2) {
                                                    return objB;
                                                }
                                            }
                                        } else {
                                            g1Var2 = null;
                                            uVar.f70936a = null;
                                            uVar.f70937b = null;
                                            uVar.f70938c = null;
                                            uVar.f70939d = null;
                                            uVar.f70940e = null;
                                            uVar.f70941f = null;
                                            uVar.f70944i = 7;
                                            objB = qVar2.b(bVar, g1Var2, uVar);
                                            if (objB == aVar2) {
                                                return objB;
                                            }
                                        }
                                    }
                                } else {
                                    if (g1Var instanceof xd2.g1.a) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    aVar = (xd2.g1.a) g1Var;
                                    if (aVar instanceof xd2.g1.a.b) {
                                        c2Var = c2.b.c.f70687a;
                                    } else if (aVar instanceof xd2.g1.a.d) {
                                        c2Var = c2.b.d.f70688a;
                                    } else {
                                        c2Var = c2.b.a.f70685a;
                                    }
                                    uVar.f70936a = null;
                                    uVar.f70937b = null;
                                    uVar.f70938c = null;
                                    uVar.f70939d = null;
                                    uVar.f70940e = this;
                                    uVar.f70941f = c2Var;
                                    uVar.f70944i = 8;
                                    objE2 = i0Var4.await(uVar);
                                    if (objE2 != aVar2) {
                                        qVar = this;
                                        uVar.f70936a = null;
                                        uVar.f70937b = null;
                                        uVar.f70938c = null;
                                        uVar.f70939d = null;
                                        uVar.f70940e = null;
                                        uVar.f70941f = null;
                                        uVar.f70944i = 9;
                                        objA = qVar.a(c2Var, (de2.g0.b) objE2, uVar);
                                        if (objA == aVar2) {
                                            return objA;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        i0Var4 = i0Var2;
                        i0Var5 = i0Var3;
                        i0Var6 = null;
                        uVar.f70936a = null;
                        uVar.f70937b = i0Var4;
                        uVar.f70938c = null;
                        uVar.f70939d = i0Var6;
                        uVar.f70944i = 4;
                        objAwait = i0Var5.await(uVar);
                        if (objAwait != aVar2) {
                            o53.i0 i0Var11 = i0Var6;
                            objE2 = objAwait;
                            i0Var7 = i0Var11;
                            g1Var = (xd2.g1) objE2;
                            if (g1Var instanceof xd2.g1.b) {
                                uVar.f70936a = null;
                                uVar.f70937b = null;
                                uVar.f70938c = null;
                                uVar.f70939d = i0Var7;
                                uVar.f70940e = this;
                                uVar.f70944i = 5;
                                objE2 = i0Var4.await(uVar);
                                if (objE2 != aVar2) {
                                    qVar2 = this;
                                    bVar = (de2.g0.b) objE2;
                                    if (i0Var7 != null) {
                                        uVar.f70936a = null;
                                        uVar.f70937b = null;
                                        uVar.f70938c = null;
                                        uVar.f70939d = null;
                                        uVar.f70940e = qVar2;
                                        uVar.f70941f = bVar;
                                        uVar.f70944i = 6;
                                        objAwait2 = i0Var7.await(uVar);
                                        if (objAwait2 != aVar2) {
                                            objE2 = objAwait2;
                                            bVar2 = bVar;
                                            xd2.g1 g1Var6 = (xd2.g1) objE2;
                                            bVar = bVar2;
                                            g1Var2 = g1Var6;
                                            uVar.f70936a = null;
                                            uVar.f70937b = null;
                                            uVar.f70938c = null;
                                            uVar.f70939d = null;
                                            uVar.f70940e = null;
                                            uVar.f70941f = null;
                                            uVar.f70944i = 7;
                                            objB = qVar2.b(bVar, g1Var2, uVar);
                                            if (objB == aVar2) {
                                                return objB;
                                            }
                                        }
                                    } else {
                                        g1Var2 = null;
                                        uVar.f70936a = null;
                                        uVar.f70937b = null;
                                        uVar.f70938c = null;
                                        uVar.f70939d = null;
                                        uVar.f70940e = null;
                                        uVar.f70941f = null;
                                        uVar.f70944i = 7;
                                        objB = qVar2.b(bVar, g1Var2, uVar);
                                        if (objB == aVar2) {
                                            return objB;
                                        }
                                    }
                                }
                            } else {
                                if (g1Var instanceof xd2.g1.a) {
                                    lc.u0.r();
                                    return null;
                                }
                                aVar = (xd2.g1.a) g1Var;
                                if (aVar instanceof xd2.g1.a.b) {
                                    c2Var = c2.b.c.f70687a;
                                } else if (aVar instanceof xd2.g1.a.d) {
                                    c2Var = c2.b.d.f70688a;
                                } else {
                                    c2Var = c2.b.a.f70685a;
                                }
                                uVar.f70936a = null;
                                uVar.f70937b = null;
                                uVar.f70938c = null;
                                uVar.f70939d = null;
                                uVar.f70940e = this;
                                uVar.f70941f = c2Var;
                                uVar.f70944i = 8;
                                objE2 = i0Var4.await(uVar);
                                if (objE2 != aVar2) {
                                    qVar = this;
                                    uVar.f70936a = null;
                                    uVar.f70937b = null;
                                    uVar.f70938c = null;
                                    uVar.f70939d = null;
                                    uVar.f70940e = null;
                                    uVar.f70941f = null;
                                    uVar.f70944i = 9;
                                    objA = qVar.a(c2Var, (de2.g0.b) objE2, uVar);
                                    if (objA == aVar2) {
                                        return objA;
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar2;
            case 2:
                i0Var2 = uVar.f70937b;
                str2 = uVar.f70936a;
                o13.r.b(objE2);
                i0Var3 = (o53.i0) objE2;
                if (str2 != null) {
                    x53.c cVar7 = o53.s0.f129406a;
                    o53.t1 t1Var6 = u53.o.f168762a;
                    w wVar3 = new w(this, str2, null);
                    uVar.f70936a = null;
                    uVar.f70937b = i0Var2;
                    uVar.f70938c = i0Var3;
                    uVar.f70939d = null;
                    uVar.f70944i = 3;
                    objE1 = ge1.b.e0(t1Var6, wVar3, uVar);
                    if (objE1 != aVar2) {
                        i0Var4 = i0Var2;
                        i0Var5 = i0Var3;
                        objE2 = objE1;
                        i0Var6 = (o53.i0) objE2;
                        uVar.f70936a = null;
                        uVar.f70937b = i0Var4;
                        uVar.f70938c = null;
                        uVar.f70939d = i0Var6;
                        uVar.f70944i = 4;
                        objAwait = i0Var5.await(uVar);
                        if (objAwait != aVar2) {
                            o53.i0 i0Var12 = i0Var6;
                            objE2 = objAwait;
                            i0Var7 = i0Var12;
                            g1Var = (xd2.g1) objE2;
                            if (g1Var instanceof xd2.g1.b) {
                                uVar.f70936a = null;
                                uVar.f70937b = null;
                                uVar.f70938c = null;
                                uVar.f70939d = i0Var7;
                                uVar.f70940e = this;
                                uVar.f70944i = 5;
                                objE2 = i0Var4.await(uVar);
                                if (objE2 != aVar2) {
                                    qVar2 = this;
                                    bVar = (de2.g0.b) objE2;
                                    if (i0Var7 != null) {
                                        uVar.f70936a = null;
                                        uVar.f70937b = null;
                                        uVar.f70938c = null;
                                        uVar.f70939d = null;
                                        uVar.f70940e = qVar2;
                                        uVar.f70941f = bVar;
                                        uVar.f70944i = 6;
                                        objAwait2 = i0Var7.await(uVar);
                                        if (objAwait2 != aVar2) {
                                            objE2 = objAwait2;
                                            bVar2 = bVar;
                                            xd2.g1 g1Var7 = (xd2.g1) objE2;
                                            bVar = bVar2;
                                            g1Var2 = g1Var7;
                                            uVar.f70936a = null;
                                            uVar.f70937b = null;
                                            uVar.f70938c = null;
                                            uVar.f70939d = null;
                                            uVar.f70940e = null;
                                            uVar.f70941f = null;
                                            uVar.f70944i = 7;
                                            objB = qVar2.b(bVar, g1Var2, uVar);
                                            if (objB == aVar2) {
                                                return objB;
                                            }
                                        }
                                    } else {
                                        g1Var2 = null;
                                        uVar.f70936a = null;
                                        uVar.f70937b = null;
                                        uVar.f70938c = null;
                                        uVar.f70939d = null;
                                        uVar.f70940e = null;
                                        uVar.f70941f = null;
                                        uVar.f70944i = 7;
                                        objB = qVar2.b(bVar, g1Var2, uVar);
                                        if (objB == aVar2) {
                                            return objB;
                                        }
                                    }
                                }
                            } else {
                                if (g1Var instanceof xd2.g1.a) {
                                    lc.u0.r();
                                    return null;
                                }
                                aVar = (xd2.g1.a) g1Var;
                                if (aVar instanceof xd2.g1.a.b) {
                                    c2Var = c2.b.c.f70687a;
                                } else if (aVar instanceof xd2.g1.a.d) {
                                    c2Var = c2.b.d.f70688a;
                                } else {
                                    c2Var = c2.b.a.f70685a;
                                }
                                uVar.f70936a = null;
                                uVar.f70937b = null;
                                uVar.f70938c = null;
                                uVar.f70939d = null;
                                uVar.f70940e = this;
                                uVar.f70941f = c2Var;
                                uVar.f70944i = 8;
                                objE2 = i0Var4.await(uVar);
                                if (objE2 != aVar2) {
                                    qVar = this;
                                    uVar.f70936a = null;
                                    uVar.f70937b = null;
                                    uVar.f70938c = null;
                                    uVar.f70939d = null;
                                    uVar.f70940e = null;
                                    uVar.f70941f = null;
                                    uVar.f70944i = 9;
                                    objA = qVar.a(c2Var, (de2.g0.b) objE2, uVar);
                                    if (objA == aVar2) {
                                        return objA;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i0Var4 = i0Var2;
                    i0Var5 = i0Var3;
                    i0Var6 = null;
                    uVar.f70936a = null;
                    uVar.f70937b = i0Var4;
                    uVar.f70938c = null;
                    uVar.f70939d = i0Var6;
                    uVar.f70944i = 4;
                    objAwait = i0Var5.await(uVar);
                    if (objAwait != aVar2) {
                        o53.i0 i0Var13 = i0Var6;
                        objE2 = objAwait;
                        i0Var7 = i0Var13;
                        g1Var = (xd2.g1) objE2;
                        if (g1Var instanceof xd2.g1.b) {
                            uVar.f70936a = null;
                            uVar.f70937b = null;
                            uVar.f70938c = null;
                            uVar.f70939d = i0Var7;
                            uVar.f70940e = this;
                            uVar.f70944i = 5;
                            objE2 = i0Var4.await(uVar);
                            if (objE2 != aVar2) {
                                qVar2 = this;
                                bVar = (de2.g0.b) objE2;
                                if (i0Var7 != null) {
                                    uVar.f70936a = null;
                                    uVar.f70937b = null;
                                    uVar.f70938c = null;
                                    uVar.f70939d = null;
                                    uVar.f70940e = qVar2;
                                    uVar.f70941f = bVar;
                                    uVar.f70944i = 6;
                                    objAwait2 = i0Var7.await(uVar);
                                    if (objAwait2 != aVar2) {
                                        objE2 = objAwait2;
                                        bVar2 = bVar;
                                        xd2.g1 g1Var8 = (xd2.g1) objE2;
                                        bVar = bVar2;
                                        g1Var2 = g1Var8;
                                        uVar.f70936a = null;
                                        uVar.f70937b = null;
                                        uVar.f70938c = null;
                                        uVar.f70939d = null;
                                        uVar.f70940e = null;
                                        uVar.f70941f = null;
                                        uVar.f70944i = 7;
                                        objB = qVar2.b(bVar, g1Var2, uVar);
                                        if (objB == aVar2) {
                                            return objB;
                                        }
                                    }
                                } else {
                                    g1Var2 = null;
                                    uVar.f70936a = null;
                                    uVar.f70937b = null;
                                    uVar.f70938c = null;
                                    uVar.f70939d = null;
                                    uVar.f70940e = null;
                                    uVar.f70941f = null;
                                    uVar.f70944i = 7;
                                    objB = qVar2.b(bVar, g1Var2, uVar);
                                    if (objB == aVar2) {
                                        return objB;
                                    }
                                }
                            }
                        } else {
                            if (g1Var instanceof xd2.g1.a) {
                                lc.u0.r();
                                return null;
                            }
                            aVar = (xd2.g1.a) g1Var;
                            if (aVar instanceof xd2.g1.a.b) {
                                c2Var = c2.b.c.f70687a;
                            } else if (aVar instanceof xd2.g1.a.d) {
                                c2Var = c2.b.d.f70688a;
                            } else {
                                c2Var = c2.b.a.f70685a;
                            }
                            uVar.f70936a = null;
                            uVar.f70937b = null;
                            uVar.f70938c = null;
                            uVar.f70939d = null;
                            uVar.f70940e = this;
                            uVar.f70941f = c2Var;
                            uVar.f70944i = 8;
                            objE2 = i0Var4.await(uVar);
                            if (objE2 != aVar2) {
                                qVar = this;
                                uVar.f70936a = null;
                                uVar.f70937b = null;
                                uVar.f70938c = null;
                                uVar.f70939d = null;
                                uVar.f70940e = null;
                                uVar.f70941f = null;
                                uVar.f70944i = 9;
                                objA = qVar.a(c2Var, (de2.g0.b) objE2, uVar);
                                if (objA == aVar2) {
                                    return objA;
                                }
                            }
                        }
                    }
                }
                return aVar2;
            case 3:
                i0Var5 = uVar.f70938c;
                i0Var4 = uVar.f70937b;
                o13.r.b(objE2);
                i0Var6 = (o53.i0) objE2;
                uVar.f70936a = null;
                uVar.f70937b = i0Var4;
                uVar.f70938c = null;
                uVar.f70939d = i0Var6;
                uVar.f70944i = 4;
                objAwait = i0Var5.await(uVar);
                if (objAwait != aVar2) {
                    o53.i0 i0Var14 = i0Var6;
                    objE2 = objAwait;
                    i0Var7 = i0Var14;
                    g1Var = (xd2.g1) objE2;
                    if (g1Var instanceof xd2.g1.b) {
                        uVar.f70936a = null;
                        uVar.f70937b = null;
                        uVar.f70938c = null;
                        uVar.f70939d = i0Var7;
                        uVar.f70940e = this;
                        uVar.f70944i = 5;
                        objE2 = i0Var4.await(uVar);
                        if (objE2 != aVar2) {
                            qVar2 = this;
                            bVar = (de2.g0.b) objE2;
                            if (i0Var7 != null) {
                                uVar.f70936a = null;
                                uVar.f70937b = null;
                                uVar.f70938c = null;
                                uVar.f70939d = null;
                                uVar.f70940e = qVar2;
                                uVar.f70941f = bVar;
                                uVar.f70944i = 6;
                                objAwait2 = i0Var7.await(uVar);
                                if (objAwait2 != aVar2) {
                                    objE2 = objAwait2;
                                    bVar2 = bVar;
                                    xd2.g1 g1Var9 = (xd2.g1) objE2;
                                    bVar = bVar2;
                                    g1Var2 = g1Var9;
                                    uVar.f70936a = null;
                                    uVar.f70937b = null;
                                    uVar.f70938c = null;
                                    uVar.f70939d = null;
                                    uVar.f70940e = null;
                                    uVar.f70941f = null;
                                    uVar.f70944i = 7;
                                    objB = qVar2.b(bVar, g1Var2, uVar);
                                    if (objB == aVar2) {
                                        return objB;
                                    }
                                }
                            } else {
                                g1Var2 = null;
                                uVar.f70936a = null;
                                uVar.f70937b = null;
                                uVar.f70938c = null;
                                uVar.f70939d = null;
                                uVar.f70940e = null;
                                uVar.f70941f = null;
                                uVar.f70944i = 7;
                                objB = qVar2.b(bVar, g1Var2, uVar);
                                if (objB == aVar2) {
                                    return objB;
                                }
                            }
                        }
                    } else {
                        if (g1Var instanceof xd2.g1.a) {
                            lc.u0.r();
                            return null;
                        }
                        aVar = (xd2.g1.a) g1Var;
                        if (aVar instanceof xd2.g1.a.b) {
                            c2Var = c2.b.c.f70687a;
                        } else if (aVar instanceof xd2.g1.a.d) {
                            c2Var = c2.b.d.f70688a;
                        } else {
                            c2Var = c2.b.a.f70685a;
                        }
                        uVar.f70936a = null;
                        uVar.f70937b = null;
                        uVar.f70938c = null;
                        uVar.f70939d = null;
                        uVar.f70940e = this;
                        uVar.f70941f = c2Var;
                        uVar.f70944i = 8;
                        objE2 = i0Var4.await(uVar);
                        if (objE2 != aVar2) {
                            qVar = this;
                            uVar.f70936a = null;
                            uVar.f70937b = null;
                            uVar.f70938c = null;
                            uVar.f70939d = null;
                            uVar.f70940e = null;
                            uVar.f70941f = null;
                            uVar.f70944i = 9;
                            objA = qVar.a(c2Var, (de2.g0.b) objE2, uVar);
                            if (objA == aVar2) {
                                return objA;
                            }
                        }
                    }
                }
                return aVar2;
            case 4:
                i0Var7 = uVar.f70939d;
                i0Var4 = uVar.f70937b;
                o13.r.b(objE2);
                g1Var = (xd2.g1) objE2;
                if (g1Var instanceof xd2.g1.b) {
                    uVar.f70936a = null;
                    uVar.f70937b = null;
                    uVar.f70938c = null;
                    uVar.f70939d = i0Var7;
                    uVar.f70940e = this;
                    uVar.f70944i = 5;
                    objE2 = i0Var4.await(uVar);
                    if (objE2 != aVar2) {
                        qVar2 = this;
                        bVar = (de2.g0.b) objE2;
                        if (i0Var7 != null) {
                            uVar.f70936a = null;
                            uVar.f70937b = null;
                            uVar.f70938c = null;
                            uVar.f70939d = null;
                            uVar.f70940e = qVar2;
                            uVar.f70941f = bVar;
                            uVar.f70944i = 6;
                            objAwait2 = i0Var7.await(uVar);
                            if (objAwait2 != aVar2) {
                                objE2 = objAwait2;
                                bVar2 = bVar;
                                xd2.g1 g1Var10 = (xd2.g1) objE2;
                                bVar = bVar2;
                                g1Var2 = g1Var10;
                                uVar.f70936a = null;
                                uVar.f70937b = null;
                                uVar.f70938c = null;
                                uVar.f70939d = null;
                                uVar.f70940e = null;
                                uVar.f70941f = null;
                                uVar.f70944i = 7;
                                objB = qVar2.b(bVar, g1Var2, uVar);
                                if (objB == aVar2) {
                                    return objB;
                                }
                            }
                        } else {
                            g1Var2 = null;
                            uVar.f70936a = null;
                            uVar.f70937b = null;
                            uVar.f70938c = null;
                            uVar.f70939d = null;
                            uVar.f70940e = null;
                            uVar.f70941f = null;
                            uVar.f70944i = 7;
                            objB = qVar2.b(bVar, g1Var2, uVar);
                            if (objB == aVar2) {
                                return objB;
                            }
                        }
                    }
                } else {
                    if (g1Var instanceof xd2.g1.a) {
                        lc.u0.r();
                        return null;
                    }
                    aVar = (xd2.g1.a) g1Var;
                    if (aVar instanceof xd2.g1.a.b) {
                        c2Var = c2.b.c.f70687a;
                    } else if (aVar instanceof xd2.g1.a.d) {
                        c2Var = c2.b.d.f70688a;
                    } else {
                        c2Var = c2.b.a.f70685a;
                    }
                    uVar.f70936a = null;
                    uVar.f70937b = null;
                    uVar.f70938c = null;
                    uVar.f70939d = null;
                    uVar.f70940e = this;
                    uVar.f70941f = c2Var;
                    uVar.f70944i = 8;
                    objE2 = i0Var4.await(uVar);
                    if (objE2 != aVar2) {
                        qVar = this;
                        uVar.f70936a = null;
                        uVar.f70937b = null;
                        uVar.f70938c = null;
                        uVar.f70939d = null;
                        uVar.f70940e = null;
                        uVar.f70941f = null;
                        uVar.f70944i = 9;
                        objA = qVar.a(c2Var, (de2.g0.b) objE2, uVar);
                        if (objA == aVar2) {
                            return objA;
                        }
                    }
                }
                return aVar2;
            case 5:
                q qVar3 = uVar.f70940e;
                o53.i0 i0Var15 = uVar.f70939d;
                o13.r.b(objE2);
                qVar2 = qVar3;
                i0Var7 = i0Var15;
                bVar = (de2.g0.b) objE2;
                if (i0Var7 != null) {
                    uVar.f70936a = null;
                    uVar.f70937b = null;
                    uVar.f70938c = null;
                    uVar.f70939d = null;
                    uVar.f70940e = qVar2;
                    uVar.f70941f = bVar;
                    uVar.f70944i = 6;
                    objAwait2 = i0Var7.await(uVar);
                    if (objAwait2 != aVar2) {
                        objE2 = objAwait2;
                        bVar2 = bVar;
                        xd2.g1 g1Var11 = (xd2.g1) objE2;
                        bVar = bVar2;
                        g1Var2 = g1Var11;
                        uVar.f70936a = null;
                        uVar.f70937b = null;
                        uVar.f70938c = null;
                        uVar.f70939d = null;
                        uVar.f70940e = null;
                        uVar.f70941f = null;
                        uVar.f70944i = 7;
                        objB = qVar2.b(bVar, g1Var2, uVar);
                        if (objB == aVar2) {
                            return objB;
                        }
                    }
                } else {
                    g1Var2 = null;
                    uVar.f70936a = null;
                    uVar.f70937b = null;
                    uVar.f70938c = null;
                    uVar.f70939d = null;
                    uVar.f70940e = null;
                    uVar.f70941f = null;
                    uVar.f70944i = 7;
                    objB = qVar2.b(bVar, g1Var2, uVar);
                    if (objB == aVar2) {
                        return objB;
                    }
                }
                return aVar2;
            case 6:
                bVar2 = (de2.g0.b) uVar.f70941f;
                qVar2 = uVar.f70940e;
                o13.r.b(objE2);
                xd2.g1 g1Var12 = (xd2.g1) objE2;
                bVar = bVar2;
                g1Var2 = g1Var12;
                uVar.f70936a = null;
                uVar.f70937b = null;
                uVar.f70938c = null;
                uVar.f70939d = null;
                uVar.f70940e = null;
                uVar.f70941f = null;
                uVar.f70944i = 7;
                objB = qVar2.b(bVar, g1Var2, uVar);
                if (objB == aVar2) {
                    return aVar2;
                }
                return objB;
            case 7:
                o13.r.b(objE2);
                return objE2;
            case 8:
                c2Var = (c2) uVar.f70941f;
                qVar = uVar.f70940e;
                o13.r.b(objE2);
                uVar.f70936a = null;
                uVar.f70937b = null;
                uVar.f70938c = null;
                uVar.f70939d = null;
                uVar.f70940e = null;
                uVar.f70941f = null;
                uVar.f70944i = 9;
                objA = qVar.a(c2Var, (de2.g0.b) objE2, uVar);
                if (objA == aVar2) {
                    return aVar2;
                }
                return objA;
            case 9:
                o13.r.b(objE2);
                return objE2;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfe2/q$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
