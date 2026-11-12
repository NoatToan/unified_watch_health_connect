package r02;

import b5.a0;
import b82.r0;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import l72.y0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q0;
import p008y1.k3;
import p008y1.m0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableLayoutKt$detectDragGestures$5", f = "ZoomableLayout.kt", l = {PsExtractor.PRIVATE_STREAM_1, 198, 211, 220}, m = "invokeSuspend", v = 2)
public final class g extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f148841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q0 f148842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f148843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f148844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f148845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a<Boolean> f148846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l<a0, Unit> f148847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.p<a0, n4.c, Unit> f148848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f148849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f148850j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(m mVar, e23.a<Boolean> aVar, e23.l<? super a0, Unit> lVar, e23.p<? super a0, ? super n4.c, Unit> pVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f148845e = mVar;
        this.f148846f = aVar;
        this.f148847g = lVar;
        this.f148848h = pVar;
        this.f148849i = aVar2;
        this.f148850j = aVar3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f148845e, this.f148846f, this.f148847g, this.f148848h, this.f148849i, this.f148850j, dVar);
        gVar.f148844d = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
        return ((g) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0110  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0142, code lost:
    
        if (r14 == r1) goto L58;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a0 a0Var;
        q0 q0Var;
        a0 a0Var2;
        q0 q0Var2;
        int i14;
        boolean zD;
        e23.p<a0, n4.c, Unit> pVar;
        b5.c cVar = (b5.c) this.f148844d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f148843c;
        if (i15 == 0) {
            o13.r.b(obj);
            this.f148844d = cVar;
            this.f148843c = 1;
            obj = k3.c(cVar, null, this, 2);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(obj);
        } else {
            if (i15 == 2) {
                q0Var2 = this.f148842b;
                a0Var2 = this.f148841a;
                o13.r.b(obj);
                a0Var = (a0) obj;
                q0Var = q0Var2;
                if (a0Var != null) {
                    this.f148847g.invoke(a0Var2);
                    long j8 = q0Var.f105808a;
                    n4.c.f123541b.getClass();
                    zD = n4.c.d(j8, 0L);
                    pVar = this.f148848h;
                    if (!zD) {
                        pVar.invoke(a0Var, n4.c.a(q0Var.f105808a));
                    }
                    long j14 = a0Var.f15748a;
                    r0 r0Var = new r0(pVar, 10);
                    this.f148844d = null;
                    this.f148841a = null;
                    this.f148842b = null;
                    this.f148843c = 4;
                    obj = m0.i(cVar, j14, r0Var, this);
                }
                return Unit.INSTANCE;
            }
            if (i15 == 3) {
                q0Var2 = this.f148842b;
                a0Var2 = this.f148841a;
                o13.r.b(obj);
                a0Var = (a0) obj;
                q0Var = q0Var2;
                if (a0Var != null) {
                    this.f148847g.invoke(a0Var2);
                    long j15 = q0Var.f105808a;
                    n4.c.f123541b.getClass();
                    zD = n4.c.d(j15, 0L);
                    pVar = this.f148848h;
                    if (!zD) {
                        pVar.invoke(a0Var, n4.c.a(q0Var.f105808a));
                    }
                    long j16 = a0Var.f15748a;
                    r0 r0Var2 = new r0(pVar, 10);
                    this.f148844d = null;
                    this.f148841a = null;
                    this.f148842b = null;
                    this.f148843c = 4;
                    obj = m0.i(cVar, j16, r0Var2, this);
                }
                return Unit.INSTANCE;
            }
            if (i15 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.f148850j.invoke();
        } else {
            this.f148849i.invoke();
        }
        return Unit.INSTANCE;
        a0Var = (a0) obj;
        m mVar = this.f148845e;
        if (mVar.h()) {
            q0Var = new q0();
            n4.c.f123541b.getClass();
            q0Var.f105808a = 0L;
            if (!mVar.h()) {
                long j17 = a0Var.f15748a;
                f fVar = new f(0, q0Var);
                this.f148844d = cVar;
                this.f148841a = a0Var;
                this.f148842b = q0Var;
                this.f148843c = 3;
                Object objE = m0.e(cVar, j17, fVar, this);
                if (objE != aVar) {
                    a0Var2 = a0Var;
                    obj = objE;
                    q0Var2 = q0Var;
                    a0Var = (a0) obj;
                    q0Var = q0Var2;
                    if (a0Var != null) {
                        this.f148847g.invoke(a0Var2);
                        long j18 = q0Var.f105808a;
                        n4.c.f123541b.getClass();
                        zD = n4.c.d(j18, 0L);
                        pVar = this.f148848h;
                        if (!zD) {
                            pVar.invoke(a0Var, n4.c.a(q0Var.f105808a));
                        }
                        long j19 = a0Var.f15748a;
                        r0 r0Var3 = new r0(pVar, 10);
                        this.f148844d = null;
                        this.f148841a = null;
                        this.f148842b = null;
                        this.f148843c = 4;
                        obj = m0.i(cVar, j19, r0Var3, this);
                    }
                }
            } else if (this.f148846f.invoke().booleanValue()) {
                a0Var2 = a0Var;
                if (a0Var != null) {
                    this.f148847g.invoke(a0Var2);
                    long j110 = q0Var.f105808a;
                    n4.c.f123541b.getClass();
                    zD = n4.c.d(j110, 0L);
                    pVar = this.f148848h;
                    if (!zD) {
                        pVar.invoke(a0Var, n4.c.a(q0Var.f105808a));
                    }
                    long j111 = a0Var.f15748a;
                    r0 r0Var4 = new r0(pVar, 10);
                    this.f148844d = null;
                    this.f148841a = null;
                    this.f148842b = null;
                    this.f148843c = 4;
                    obj = m0.i(cVar, j111, r0Var4, this);
                }
            } else {
                s1.b<Float, s1.n> bVar = mVar.f148896d;
                if (p005kotlin.jvm.internal.s.f(bVar.f155493g, bVar.f155492f)) {
                    a.f148824b.getClass();
                    i14 = a.f148827e;
                } else {
                    float fFloatValue = bVar.e().floatValue();
                    Float f14 = bVar.f155493g;
                    if (fFloatValue >= (f14 != null ? f14.floatValue() : 0.0f) - 0.5f) {
                        a.f148824b.getClass();
                        i14 = a.f148825c;
                    } else {
                        float fFloatValue2 = bVar.e().floatValue();
                        Float f15 = bVar.f155492f;
                        if (fFloatValue2 <= (f15 != null ? f15.floatValue() : 0.0f) + 0.5f) {
                            a.f148824b.getClass();
                            i14 = a.f148826d;
                        } else {
                            a.f148824b.getClass();
                            i14 = 0;
                        }
                    }
                }
                long j24 = a0Var.f15748a;
                y0 y0Var = new y0(i14, q0Var);
                this.f148844d = cVar;
                this.f148841a = a0Var;
                this.f148842b = q0Var;
                this.f148843c = 2;
                Object objD = m0.d(cVar, j24, y0Var, this);
                if (objD != aVar) {
                    a0Var2 = a0Var;
                    obj = objD;
                    q0Var2 = q0Var;
                    a0Var = (a0) obj;
                    q0Var = q0Var2;
                    if (a0Var != null) {
                        this.f148847g.invoke(a0Var2);
                        long j112 = q0Var.f105808a;
                        n4.c.f123541b.getClass();
                        zD = n4.c.d(j112, 0L);
                        pVar = this.f148848h;
                        if (!zD) {
                            pVar.invoke(a0Var, n4.c.a(q0Var.f105808a));
                        }
                        long j113 = a0Var.f15748a;
                        r0 r0Var5 = new r0(pVar, 10);
                        this.f148844d = null;
                        this.f148841a = null;
                        this.f148842b = null;
                        this.f148843c = 4;
                        obj = m0.i(cVar, j113, r0Var5, this);
                    }
                }
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }
}
