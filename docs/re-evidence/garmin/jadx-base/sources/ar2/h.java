package ar2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.addcard.viewmodels.SelectProductViewModel$onProductClicked$1", f = "SelectProductViewModel.kt", l = {34, 36, 38, 52, 42, 52, 50, 52, 52}, m = "invokeSuspend", v = 2)
public final class h extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f12610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Unit f12611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f12613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ms2.f f12614e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements e23.a<String> {
        public a(Object obj) {
            super(0, obj, g.class, "requireDeviceName", "requireDeviceName()Ljava/lang/String;", 0);
        }

        @Override // e23.a
        public final String invoke() {
            return ((g) this.receiver).A4();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, ms2.f fVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f12613d = gVar;
        this.f12614e = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f12613d, this.f12614e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[Catch: all -> 0x0031, PHI: r9
      0x0072: PHI (r9v12 java.lang.Object) = (r9v11 java.lang.Object), (r9v0 java.lang.Object) binds: [B:29:0x006e, B:21:0x0046] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0031, blocks: (B:13:0x002c, B:20:0x0042, B:36:0x008c, B:21:0x0046, B:31:0x0072, B:33:0x0076, B:41:0x00a3, B:43:0x00a9, B:49:0x00cd, B:50:0x00d4, B:22:0x004a, B:28:0x0061, B:25:0x0051), top: B:64:0x000a, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0076 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:13:0x002c, B:20:0x0042, B:36:0x008c, B:21:0x0046, B:31:0x0072, B:33:0x0076, B:41:0x00a3, B:43:0x00a9, B:49:0x00cd, B:50:0x00d4, B:22:0x004a, B:28:0x0061, B:25:0x0051), top: B:64:0x000a, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:13:0x002c, B:20:0x0042, B:36:0x008c, B:21:0x0046, B:31:0x0072, B:33:0x0076, B:41:0x00a3, B:43:0x00a9, B:49:0x00cd, B:50:0x00d4, B:22:0x004a, B:28:0x0061, B:25:0x0051), top: B:64:0x000a, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:13:0x002c, B:20:0x0042, B:36:0x008c, B:21:0x0046, B:31:0x0072, B:33:0x0076, B:41:0x00a3, B:43:0x00a9, B:49:0x00cd, B:50:0x00d4, B:22:0x004a, B:28:0x0061, B:25:0x0051), top: B:64:0x000a, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:13:0x002c, B:20:0x0042, B:36:0x008c, B:21:0x0046, B:31:0x0072, B:33:0x0076, B:41:0x00a3, B:43:0x00a9, B:49:0x00cd, B:50:0x00d4, B:22:0x004a, B:28:0x0061, B:25:0x0051), top: B:64:0x000a, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:13:0x002c, B:20:0x0042, B:36:0x008c, B:21:0x0046, B:31:0x0072, B:33:0x0076, B:41:0x00a3, B:43:0x00a9, B:49:0x00cd, B:50:0x00d4, B:22:0x004a, B:28:0x0061, B:25:0x0051), top: B:64:0x000a, outer: #0 }] */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ca, code lost:
    
        if (r5.x4(r9, r8) == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ff, code lost:
    
        if (r5.x4(r9, r8) == r0) goto L61;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        dr2.a.InterfaceC1294a interfaceC1294a;
        g.b.a aVar;
        Long l14;
        ar2.a.b bVarA;
        Unit unit;
        ar2.a.b.h hVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12612c;
        ms2.f fVar = this.f12614e;
        g gVar = this.f12613d;
        try {
            try {
                switch (i14) {
                    case 0:
                        r.b(obj);
                        ar2.a.b.h hVar2 = new ar2.a.b.h(true);
                        this.f12612c = 1;
                        if (gVar.x4(hVar2, this) != aVar2) {
                            dr2.a aVar3 = gVar.f12560a;
                            long jB4 = gVar.B4();
                            this.f12612c = 2;
                            obj = aVar3.c(fVar, jB4, this);
                            if (obj == aVar2) {
                                interfaceC1294a = (dr2.a.InterfaceC1294a) obj;
                                if (interfaceC1294a == null) {
                                    l14 = gVar.f12562c;
                                    if (l14 == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    aVar = new g.b.a(fVar, l14.longValue());
                                    this.f12610a = null;
                                    this.f12612c = 5;
                                    if (gVar.y4(aVar, this) != aVar2) {
                                        ar2.a.b.h hVar3 = new ar2.a.b.h(false);
                                        this.f12610a = null;
                                        this.f12612c = 6;
                                    }
                                    break;
                                } else {
                                    bVarA = com.garmin.feature.garminpay.ui.addcard.c.a(interfaceC1294a, new a(gVar));
                                    this.f12610a = null;
                                    this.f12612c = 3;
                                    if (gVar.x4(bVarA, this) != aVar2) {
                                        unit = Unit.INSTANCE;
                                        hVar = new ar2.a.b.h(false);
                                        this.f12610a = null;
                                        this.f12611b = unit;
                                        this.f12612c = 4;
                                        if (gVar.x4(hVar, this) != aVar2) {
                                            return unit;
                                        }
                                    }
                                }
                            }
                        }
                        return aVar2;
                    case 1:
                        r.b(obj);
                        dr2.a aVar4 = gVar.f12560a;
                        long jB5 = gVar.B4();
                        this.f12612c = 2;
                        obj = aVar4.c(fVar, jB5, this);
                        if (obj == aVar2) {
                            interfaceC1294a = (dr2.a.InterfaceC1294a) obj;
                            if (interfaceC1294a == null) {
                                l14 = gVar.f12562c;
                                if (l14 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                aVar = new g.b.a(fVar, l14.longValue());
                                this.f12610a = null;
                                this.f12612c = 5;
                                if (gVar.y4(aVar, this) != aVar2) {
                                    ar2.a.b.h hVar4 = new ar2.a.b.h(false);
                                    this.f12610a = null;
                                    this.f12612c = 6;
                                }
                                break;
                            } else {
                                bVarA = com.garmin.feature.garminpay.ui.addcard.c.a(interfaceC1294a, new a(gVar));
                                this.f12610a = null;
                                this.f12612c = 3;
                                if (gVar.x4(bVarA, this) != aVar2) {
                                    unit = Unit.INSTANCE;
                                    hVar = new ar2.a.b.h(false);
                                    this.f12610a = null;
                                    this.f12611b = unit;
                                    this.f12612c = 4;
                                    if (gVar.x4(hVar, this) != aVar2) {
                                        return unit;
                                    }
                                }
                            }
                        }
                        return aVar2;
                    case 2:
                        r.b(obj);
                        interfaceC1294a = (dr2.a.InterfaceC1294a) obj;
                        if (interfaceC1294a == null) {
                            l14 = gVar.f12562c;
                            if (l14 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            aVar = new g.b.a(fVar, l14.longValue());
                            this.f12610a = null;
                            this.f12612c = 5;
                            if (gVar.y4(aVar, this) != aVar2) {
                                ar2.a.b.h hVar5 = new ar2.a.b.h(false);
                                this.f12610a = null;
                                this.f12612c = 6;
                            }
                            break;
                        } else {
                            bVarA = com.garmin.feature.garminpay.ui.addcard.c.a(interfaceC1294a, new a(gVar));
                            this.f12610a = null;
                            this.f12612c = 3;
                            if (gVar.x4(bVarA, this) != aVar2) {
                                unit = Unit.INSTANCE;
                                hVar = new ar2.a.b.h(false);
                                this.f12610a = null;
                                this.f12611b = unit;
                                this.f12612c = 4;
                                if (gVar.x4(hVar, this) != aVar2) {
                                    return unit;
                                }
                            }
                        }
                        return aVar2;
                    case 3:
                        r.b(obj);
                        unit = Unit.INSTANCE;
                        hVar = new ar2.a.b.h(false);
                        this.f12610a = null;
                        this.f12611b = unit;
                        this.f12612c = 4;
                        if (gVar.x4(hVar, this) != aVar2) {
                            return aVar2;
                        }
                        return unit;
                    case 4:
                        Unit unit2 = this.f12611b;
                        r.b(obj);
                        return unit2;
                    case 5:
                        r.b(obj);
                        ar2.a.b.h hVar6 = new ar2.a.b.h(false);
                        this.f12610a = null;
                        this.f12612c = 6;
                        break;
                    case 6:
                    case 8:
                        r.b(obj);
                        return Unit.INSTANCE;
                    case 7:
                        r.b(obj);
                        ar2.a.b.h hVar7 = new ar2.a.b.h(false);
                        this.f12610a = null;
                        this.f12612c = 8;
                        break;
                    case 9:
                        Throwable th3 = this.f12610a;
                        r.b(obj);
                        throw th3;
                    default:
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Throwable th4) {
                g.f12605g.f12607a.a().warn("[onProductClicked]", th4);
                ar2.a.b.C0176b c0176b = ar2.a.b.C0176b.f12566a;
                this.f12610a = null;
                this.f12612c = 7;
                if (gVar.x4(c0176b, this) != aVar2) {
                }
                return aVar2;
            }
        } catch (Throwable th5) {
            ar2.a.b.h hVar8 = new ar2.a.b.h(false);
            this.f12610a = th5;
            this.f12612c = 9;
            if (gVar.x4(hVar8, this) != aVar2) {
                throw th5;
            }
        }
    }
}
