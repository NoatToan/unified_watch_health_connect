package yc;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.PagingDataPresenter$collectFrom$2$1$2", f = "PagingDataPresenter.kt", l = {141, 158, 170, 173, 225, 228}, m = "invokeSuspend")
public final class b3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1<Object> f195780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a3<Object> f195781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v2<Object> f195782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(m1<Object> m1Var, a3<Object> a3Var, v2<Object> v2Var, t13.d<? super b3> dVar) {
        super(2, dVar);
        this.f195780b = m1Var;
        this.f195781c = a3Var;
        this.f195782d = v2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b3(this.f195780b, this.f195781c, this.f195782d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0206  */
    /* JADX WARN: Code duplicated, block: B:105:0x0214 A[LOOP:0: B:103:0x020e->B:105:0x0214, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[PHI: r9
      0x00b4: PHI (r9v4 yc.b3) = (r9v0 yc.b3), (r9v0 yc.b3), (r9v5 yc.b3) binds: [B:33:0x00a7, B:35:0x00b0, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0169  */
    /* JADX WARN: Code duplicated, block: B:80:0x016f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0183  */
    /* JADX WARN: Code duplicated, block: B:84:0x0187  */
    /* JADX WARN: Code duplicated, block: B:86:0x0197  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a1 A[PHI: r9
      0x01a1: PHI (r9v8 yc.b3) = (r9v0 yc.b3), (r9v0 yc.b3), (r9v9 yc.b3) binds: [B:85:0x0195, B:87:0x019e, B:8:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fe  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r14 == r0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (yc.a3.a(r1, r2, r3, r4, true, r6, r7, r8, r9) == r0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (r14.c(r1, r13) == r0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b2, code lost:
    
        if (r14.c(r1, r13) == r0) goto L91;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        b3 b3Var;
        a3<Object> a3Var;
        n0 n0Var;
        m1<Object> m1Var;
        Iterator<e23.a<Unit>> it;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        boolean z14 = true;
        switch (this.f195779a) {
            case 0:
                o13.r.b(obj);
                m1<Object> m1Var2 = this.f195780b;
                if (!(m1Var2 instanceof m1.d)) {
                    b3Var = this;
                    boolean z15 = m1Var2 instanceof m1.b;
                    if (!z15) {
                        if (z15) {
                            if (m1Var2 instanceof m1.a) {
                                if (((Boolean) b3Var.f195781c.f195745j.getValue()).booleanValue()) {
                                    a3<Object> a3Var2 = b3Var.f195781c;
                                    z2<Object> z2VarG = a3Var2.f195739d.g(b3Var.f195780b);
                                    b3Var.f195779a = 6;
                                } else {
                                    b3Var.f195779a = 5;
                                    if (gg.b.U(this) != aVar) {
                                        a3<Object> a3Var3 = b3Var.f195781c;
                                        z2<Object> z2VarG2 = a3Var3.f195739d.g(b3Var.f195780b);
                                        b3Var.f195779a = 6;
                                    }
                                }
                            } else if (m1Var2 instanceof m1.c) {
                                j1 j1Var = b3Var.f195781c.f195740e;
                                m1.c cVar = (m1.c) m1Var2;
                                b1 b1Var = cVar.f196198a;
                                b1 b1Var2 = cVar.f196199b;
                                j1Var.getClass();
                                b1Var.getClass();
                                j1Var.c(new h1(j1Var, b1Var, b1Var2));
                            }
                            break;
                        } else {
                            if (((Boolean) b3Var.f195781c.f195745j.getValue()).booleanValue()) {
                                a3<Object> a3Var4 = b3Var.f195781c;
                                z2<Object> z2VarG3 = a3Var4.f195739d.g(b3Var.f195780b);
                                b3Var.f195779a = 4;
                            } else {
                                b3Var.f195779a = 3;
                                if (gg.b.U(this) != aVar) {
                                    a3<Object> a3Var5 = b3Var.f195781c;
                                    z2<Object> z2VarG4 = a3Var5.f195739d.g(b3Var.f195780b);
                                    b3Var.f195779a = 4;
                                }
                            }
                            break;
                        }
                        return aVar;
                    }
                    m1.b bVar = (m1.b) m1Var2;
                    if (bVar.f196162a == c1.REFRESH) {
                        a3<Object> a3Var6 = b3Var.f195781c;
                        List<p4<T>> list = bVar.f196163b;
                        int i14 = bVar.f196164c;
                        int i15 = bVar.f196165d;
                        b1 b1Var3 = bVar.f196166e;
                        b1 b1Var4 = bVar.f196167f;
                        n0 n0Var2 = b3Var.f195782d.f196540c;
                        b3Var.f195779a = 2;
                        break;
                    }
                    if (z15) {
                        if (m1Var2 instanceof m1.a) {
                            if (((Boolean) b3Var.f195781c.f195745j.getValue()).booleanValue()) {
                                a3<Object> a3Var7 = b3Var.f195781c;
                                z2<Object> z2VarG5 = a3Var7.f195739d.g(b3Var.f195780b);
                                b3Var.f195779a = 6;
                            } else {
                                b3Var.f195779a = 5;
                                if (gg.b.U(this) != aVar) {
                                    a3<Object> a3Var8 = b3Var.f195781c;
                                    z2<Object> z2VarG6 = a3Var8.f195739d.g(b3Var.f195780b);
                                    b3Var.f195779a = 6;
                                }
                            }
                        } else if (m1Var2 instanceof m1.c) {
                            j1 j1Var2 = b3Var.f195781c.f195740e;
                            m1.c cVar2 = (m1.c) m1Var2;
                            b1 b1Var5 = cVar2.f196198a;
                            b1 b1Var6 = cVar2.f196199b;
                            j1Var2.getClass();
                            b1Var5.getClass();
                            j1Var2.c(new h1(j1Var2, b1Var5, b1Var6));
                        }
                        break;
                    } else {
                        if (((Boolean) b3Var.f195781c.f195745j.getValue()).booleanValue()) {
                            a3<Object> a3Var9 = b3Var.f195781c;
                            z2<Object> z2VarG7 = a3Var9.f195739d.g(b3Var.f195780b);
                            b3Var.f195779a = 4;
                        } else {
                            b3Var.f195779a = 3;
                            if (gg.b.U(this) != aVar) {
                                a3<Object> a3Var10 = b3Var.f195781c;
                                z2<Object> z2VarG8 = a3Var10.f195739d.g(b3Var.f195780b);
                                b3Var.f195779a = 4;
                            }
                        }
                        break;
                    }
                    return aVar;
                    m1Var = b3Var.f195780b;
                    if ((m1Var instanceof m1.b) || (m1Var instanceof m1.a) || (m1Var instanceof m1.d)) {
                        it = b3Var.f195781c.f195741f.iterator();
                        while (it.hasNext()) {
                            it.next().invoke();
                        }
                    }
                    return Unit.INSTANCE;
                }
                a3<Object> a3Var11 = this.f195781c;
                List listC = p13.w.c(new p4(0, ((m1.d) this.f195780b).f196200a));
                m1.d dVar = (m1.d) this.f195780b;
                b1 b1Var7 = dVar.f196201b;
                boolean z16 = (b1Var7 == null && dVar.f196202c == null) ? false : true;
                b1 b1Var8 = dVar.f196202c;
                n0 n0Var3 = this.f195782d.f196540c;
                this.f195779a = 1;
                Object objA = a3.a(a3Var11, listC, 0, 0, z16, b1Var7, b1Var8, n0Var3, this);
                b3Var = this;
                break;
                break;
            case 1:
            case 2:
                o13.r.b(obj);
                b3Var = this;
                m1Var = b3Var.f195780b;
                if (m1Var instanceof m1.b) {
                    it = b3Var.f195781c.f195741f.iterator();
                    while (it.hasNext()) {
                        it.next().invoke();
                    }
                } else {
                    it = b3Var.f195781c.f195741f.iterator();
                    while (it.hasNext()) {
                        it.next().invoke();
                    }
                }
                return Unit.INSTANCE;
            case 3:
                o13.r.b(obj);
                b3Var = this;
                a3<Object> a3Var12 = b3Var.f195781c;
                z2<Object> z2VarG9 = a3Var12.f195739d.g(b3Var.f195780b);
                b3Var.f195779a = 4;
                break;
            case 4:
                o13.r.b(obj);
                b3Var = this;
                j1 j1Var3 = b3Var.f195781c.f195740e;
                m1.b bVar2 = (m1.b) b3Var.f195780b;
                b1 b1Var9 = bVar2.f196166e;
                b1 b1Var10 = bVar2.f196167f;
                j1Var3.getClass();
                b1Var9.getClass();
                j1Var3.c(new h1(j1Var3, b1Var9, b1Var10));
                s sVar = (s) b3Var.f195781c.f195740e.f196091c.f150540a.getValue();
                b1 b1Var11 = sVar != null ? sVar.f196388d : null;
                if (b1Var11 == null) {
                    vb.h.z("PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event.");
                    return null;
                }
                boolean z17 = b1Var11.f195770b.f196662a;
                boolean z18 = b1Var11.f195771c.f196662a;
                m1.b bVar3 = (m1.b) b3Var.f195780b;
                c1 c1Var = bVar3.f196162a;
                boolean z19 = ((c1Var == c1.PREPEND && z17) || (c1Var == c1.APPEND && z18)) ? false : true;
                Collection collection = bVar3.f196163b;
                if (collection == null || !collection.isEmpty()) {
                    Iterator it3 = collection.iterator();
                    while (it3.hasNext()) {
                        if (!((p4) it3.next()).f196319b.isEmpty()) {
                            z14 = false;
                        }
                    }
                }
                a3<Object> a3Var13 = b3Var.f195781c;
                if (!z19) {
                    a3Var13.f195743h = false;
                } else if (a3Var13.f195743h || z14) {
                    if (z14) {
                        a3Var = b3Var.f195781c;
                        n0Var = a3Var.f195737b;
                        if (n0Var != null) {
                            n0Var.a(a3Var.f195739d.c(a3Var.f195744i));
                        }
                    } else {
                        int i16 = b3Var.f195781c.f195744i;
                        a3<Object> a3Var14 = b3Var.f195781c;
                        if (i16 >= a3Var14.f195739d.f196121c) {
                            int i17 = a3Var14.f195744i;
                            a3<Object> a3Var15 = b3Var.f195781c;
                            k2<Object> k2Var = a3Var15.f195739d;
                            if (i17 > k2Var.f196121c + k2Var.f196120b) {
                                a3Var = b3Var.f195781c;
                                n0Var = a3Var.f195737b;
                                if (n0Var != null) {
                                    n0Var.a(a3Var.f195739d.c(a3Var.f195744i));
                                }
                            } else {
                                a3Var15.f195743h = false;
                            }
                        } else {
                            a3Var = b3Var.f195781c;
                            n0Var = a3Var.f195737b;
                            if (n0Var != null) {
                                n0Var.a(a3Var.f195739d.c(a3Var.f195744i));
                            }
                        }
                    }
                }
                m1Var = b3Var.f195780b;
                if (m1Var instanceof m1.b) {
                    it = b3Var.f195781c.f195741f.iterator();
                    while (it.hasNext()) {
                        it.next().invoke();
                    }
                } else {
                    it = b3Var.f195781c.f195741f.iterator();
                    while (it.hasNext()) {
                        it.next().invoke();
                    }
                }
                return Unit.INSTANCE;
            case 5:
                o13.r.b(obj);
                b3Var = this;
                a3<Object> a3Var16 = b3Var.f195781c;
                z2<Object> z2VarG10 = a3Var16.f195739d.g(b3Var.f195780b);
                b3Var.f195779a = 6;
                break;
            case 6:
                o13.r.b(obj);
                b3Var = this;
                j1 j1Var4 = b3Var.f195781c.f195740e;
                c1 c1Var2 = ((m1.a) b3Var.f195780b).f196155a;
                z0.c.f196665b.getClass();
                z0.c cVar3 = z0.c.f196667d;
                j1Var4.getClass();
                c1Var2.getClass();
                cVar3.getClass();
                j1Var4.c(new i1(false, c1Var2, cVar3, j1Var4));
                b3Var.f195781c.f195743h = false;
                m1Var = b3Var.f195780b;
                if (m1Var instanceof m1.b) {
                    it = b3Var.f195781c.f195741f.iterator();
                    while (it.hasNext()) {
                        it.next().invoke();
                    }
                } else {
                    it = b3Var.f195781c.f195741f.iterator();
                    while (it.hasNext()) {
                        it.next().invoke();
                    }
                }
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
