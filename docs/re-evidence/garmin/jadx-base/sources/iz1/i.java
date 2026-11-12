package iz1;

import androidx.lifecycle.t1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fg0.z;
import lc.u0;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import zf0.j0;
import zf0.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Liz1/i;", "Lzf0/j0;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends j0 {
    public static final /* synthetic */ int N0 = 0;
    public boolean H0;
    public fg0.k I;
    public jz1.a I0;
    public final t J0;
    public final y0 K0;
    public final t L0;
    public final w0 M0;
    public fg0.j P;
    public CalendarItemDTO T;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f95876k0;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95877a;

        static {
            int[] iArr = new int[dg0.a.values().length];
            try {
                iArr[dg0.a.PRIMARY_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dg0.a.SUPPORTING_EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f95877a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.TrainingPriorityViewModel$getUpcomingEvents$1", f = "TrainingPriorityViewModel.kt", l = {149, 149, 159, 169}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ww1.g f95878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f95879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f95880c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lfg0/z;", "<anonymous>", "(Lo53/b0;)Lfg0/z;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.TrainingPriorityViewModel$getUpcomingEvents$1$currentPrimaryEvent$1", f = "TrainingPriorityViewModel.kt", l = {151}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super z>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f95882a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f95883b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f95884c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f95884c = iVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f95884c, dVar);
                aVar.f95883b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super z> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                b0 b0Var = (b0) this.f95883b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f95882a;
                i iVar = this.f95884c;
                if (i14 == 0) {
                    r.b(obj);
                    zf0.d dVar = iVar.f204384a;
                    this.f95883b = b0Var;
                    this.f95882a = 1;
                    dVar.getClass();
                    obj = f0.J(dVar, new q(dVar, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                v2 v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    return ((v2.b) v2Var).f47386a;
                }
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                int i15 = i.N0;
                iVar.Z4().j(g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13));
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "TrainingPriorityViewModel", "Error while fetching primary event dto");
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lfg0/k;", "<anonymous>", "(Lo53/b0;)Lfg0/k;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.TrainingPriorityViewModel$getUpcomingEvents$1$primaryEventDTO$1", f = "TrainingPriorityViewModel.kt", l = {165}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements p<b0, t13.d<? super fg0.k>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f95885a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f95886b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f95887c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ z f95888d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z14, i iVar, z zVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f95886b = z14;
                this.f95887c = iVar;
                this.f95888d = zVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f95886b, this.f95887c, this.f95888d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super fg0.k> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f95885a;
                if (i14 == 0) {
                    r.b(obj);
                    if (this.f95886b) {
                        return null;
                    }
                    z zVar = this.f95888d;
                    String shareableEventUuid = zVar != null ? zVar.getShareableEventUuid() : null;
                    Long id3 = zVar != null ? zVar.getId() : null;
                    this.f95885a = 1;
                    obj = this.f95887c.G4(shareableEventUuid, id3, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return (fg0.k) obj;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = i.this.new c(dVar);
            cVar.f95880c = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005d  */
        /* JADX WARN: Code duplicated, block: B:23:0x0062  */
        /* JADX WARN: Code duplicated, block: B:27:0x0079  */
        /* JADX WARN: Code duplicated, block: B:30:0x0080  */
        /* JADX WARN: Code duplicated, block: B:31:0x0085  */
        /* JADX WARN: Code duplicated, block: B:33:0x0088  */
        /* JADX WARN: Code duplicated, block: B:35:0x0090  */
        /* JADX WARN: Code duplicated, block: B:36:0x0095  */
        /* JADX WARN: Code duplicated, block: B:39:0x009c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x009e  */
        /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:50:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            g3 g3Var;
            ww1.g gVar;
            Object objC;
            ww1.g gVar2;
            z zVar;
            Long id3;
            String shareableEventUuid;
            String shareableEventUuid2;
            fg0.k kVar;
            String shareableEventUuid3;
            ww1.g gVar3;
            Long id4;
            fg0.k kVar2;
            Long l14;
            b0 b0Var = (b0) this.f95880c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f95879b;
            boolean z14 = true;
            i iVar = i.this;
            if (i14 == 0) {
                r.b(obj);
                ou1.a aVar2 = (ou1.a) iVar.E.getValue();
                this.f95880c = b0Var;
                this.f95879b = 1;
                obj = aVar2.a(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 == 2) {
                    r.b(obj);
                    g3Var = (g3) obj;
                    if (g3Var != null) {
                        gVar = (ww1.g) g3Var.f35301b;
                    } else {
                        gVar = null;
                    }
                    o53.j0 j0VarJ = ge1.b.j(b0Var, null, null, new a(iVar, null), 3);
                    this.f95880c = b0Var;
                    this.f95878a = gVar;
                    this.f95879b = 3;
                    objC = j0VarJ.C(this);
                    if (objC != aVar) {
                        gVar2 = gVar;
                        obj = objC;
                        zVar = (z) obj;
                        if (zVar != null) {
                            id3 = zVar.getId();
                        } else {
                            id3 = null;
                        }
                        if (id3 != null) {
                            id4 = zVar.getId();
                            kVar2 = iVar.I;
                            if (kVar2 != null) {
                                l14 = kVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                            } else {
                                l14 = null;
                            }
                            if (!s.g(id4, l14)) {
                                if (zVar != null) {
                                    shareableEventUuid = zVar.getShareableEventUuid();
                                } else {
                                    shareableEventUuid = null;
                                }
                                if (shareableEventUuid != null) {
                                    shareableEventUuid2 = zVar.getShareableEventUuid();
                                    kVar = iVar.I;
                                    if (kVar != null) {
                                        shareableEventUuid3 = kVar.getShareableEventUuid();
                                    } else {
                                        shareableEventUuid3 = null;
                                    }
                                    if (!s.g(shareableEventUuid2, shareableEventUuid3)) {
                                        z14 = false;
                                    }
                                } else {
                                    z14 = false;
                                }
                            }
                        } else {
                            if (zVar != null) {
                                shareableEventUuid = zVar.getShareableEventUuid();
                            } else {
                                shareableEventUuid = null;
                            }
                            if (shareableEventUuid != null) {
                                shareableEventUuid2 = zVar.getShareableEventUuid();
                                kVar = iVar.I;
                                if (kVar != null) {
                                    shareableEventUuid3 = kVar.getShareableEventUuid();
                                } else {
                                    shareableEventUuid3 = null;
                                }
                                if (!s.g(shareableEventUuid2, shareableEventUuid3)) {
                                    z14 = false;
                                }
                            } else {
                                z14 = false;
                            }
                        }
                        o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new b(z14, iVar, zVar, null), 3);
                        this.f95880c = null;
                        this.f95878a = gVar2;
                        this.f95879b = 4;
                        obj = j0VarJ2.C(this);
                        if (obj != aVar) {
                            gVar3 = gVar2;
                        }
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    gVar2 = this.f95878a;
                    r.b(obj);
                    zVar = (z) obj;
                    if (zVar != null) {
                        id3 = zVar.getId();
                    } else {
                        id3 = null;
                    }
                    if (id3 != null) {
                        id4 = zVar.getId();
                        kVar2 = iVar.I;
                        if (kVar2 != null) {
                            l14 = kVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                        } else {
                            l14 = null;
                        }
                        if (!s.g(id4, l14)) {
                            if (zVar != null) {
                                shareableEventUuid = zVar.getShareableEventUuid();
                            } else {
                                shareableEventUuid = null;
                            }
                            if (shareableEventUuid != null) {
                                shareableEventUuid2 = zVar.getShareableEventUuid();
                                kVar = iVar.I;
                                if (kVar != null) {
                                    shareableEventUuid3 = kVar.getShareableEventUuid();
                                } else {
                                    shareableEventUuid3 = null;
                                }
                                if (!s.g(shareableEventUuid2, shareableEventUuid3)) {
                                    z14 = false;
                                }
                            } else {
                                z14 = false;
                            }
                        }
                    } else {
                        if (zVar != null) {
                            shareableEventUuid = zVar.getShareableEventUuid();
                        } else {
                            shareableEventUuid = null;
                        }
                        if (shareableEventUuid != null) {
                            shareableEventUuid2 = zVar.getShareableEventUuid();
                            kVar = iVar.I;
                            if (kVar != null) {
                                shareableEventUuid3 = kVar.getShareableEventUuid();
                            } else {
                                shareableEventUuid3 = null;
                            }
                            if (!s.g(shareableEventUuid2, shareableEventUuid3)) {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    }
                    o53.j0 j0VarJ3 = ge1.b.j(b0Var, null, null, new b(z14, iVar, zVar, null), 3);
                    this.f95880c = null;
                    this.f95878a = gVar2;
                    this.f95879b = 4;
                    obj = j0VarJ3.C(this);
                    if (obj != aVar) {
                        gVar3 = gVar2;
                    }
                    return aVar;
                }
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gVar3 = this.f95878a;
                r.b(obj);
            }
            int i15 = i.N0;
            y0<g3<o13.p<fg0.k, ww1.g>>> y0VarZ4 = iVar.Z4();
            g3.a aVar3 = g3.f35298f;
            o13.p pVar = new o13.p((fg0.k) obj, gVar3);
            aVar3.getClass();
            y0VarZ4.j(g3.a.d(pVar));
            return Unit.INSTANCE;
            this.f95880c = b0Var;
            this.f95879b = 2;
            obj = r53.s.x((r53.i) obj, this);
            if (obj != aVar) {
                g3Var = (g3) obj;
                if (g3Var != null) {
                    gVar = (ww1.g) g3Var.f35301b;
                } else {
                    gVar = null;
                }
                o53.j0 j0VarJ4 = ge1.b.j(b0Var, null, null, new a(iVar, null), 3);
                this.f95880c = b0Var;
                this.f95878a = gVar;
                this.f95879b = 3;
                objC = j0VarJ4.C(this);
                if (objC != aVar) {
                    gVar2 = gVar;
                    obj = objC;
                    zVar = (z) obj;
                    if (zVar != null) {
                        id3 = zVar.getId();
                    } else {
                        id3 = null;
                    }
                    if (id3 != null) {
                        id4 = zVar.getId();
                        kVar2 = iVar.I;
                        if (kVar2 != null) {
                            l14 = kVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                        } else {
                            l14 = null;
                        }
                        if (!s.g(id4, l14)) {
                            if (zVar != null) {
                                shareableEventUuid = zVar.getShareableEventUuid();
                            } else {
                                shareableEventUuid = null;
                            }
                            if (shareableEventUuid != null) {
                                shareableEventUuid2 = zVar.getShareableEventUuid();
                                kVar = iVar.I;
                                if (kVar != null) {
                                    shareableEventUuid3 = kVar.getShareableEventUuid();
                                } else {
                                    shareableEventUuid3 = null;
                                }
                                if (!s.g(shareableEventUuid2, shareableEventUuid3)) {
                                    z14 = false;
                                }
                            } else {
                                z14 = false;
                            }
                        }
                    } else {
                        if (zVar != null) {
                            shareableEventUuid = zVar.getShareableEventUuid();
                        } else {
                            shareableEventUuid = null;
                        }
                        if (shareableEventUuid != null) {
                            shareableEventUuid2 = zVar.getShareableEventUuid();
                            kVar = iVar.I;
                            if (kVar != null) {
                                shareableEventUuid3 = kVar.getShareableEventUuid();
                            } else {
                                shareableEventUuid3 = null;
                            }
                            if (!s.g(shareableEventUuid2, shareableEventUuid3)) {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    }
                    o53.j0 j0VarJ5 = ge1.b.j(b0Var, null, null, new b(z14, iVar, zVar, null), 3);
                    this.f95880c = null;
                    this.f95878a = gVar2;
                    this.f95879b = 4;
                    obj = j0VarJ5.C(this);
                    if (obj != aVar) {
                        gVar3 = gVar2;
                        int i16 = i.N0;
                        y0<g3<o13.p<fg0.k, ww1.g>>> y0VarZ5 = iVar.Z4();
                        g3.a aVar4 = g3.f35298f;
                        o13.p pVar2 = new o13.p((fg0.k) obj, gVar3);
                        aVar4.getClass();
                        y0VarZ5.j(g3.a.d(pVar2));
                        return Unit.INSTANCE;
                    }
                }
            }
            return aVar;
        }
    }

    static {
        new a(null);
    }

    public i() {
        t tVarB = m.b(new ik2.b(16));
        this.J0 = tVarB;
        this.K0 = (y0) tVarB.getValue();
        this.L0 = m.b(new ik2.b(17));
        this.M0 = t1.a(Z4(), new f(this, 1));
        ((y0) tVarB.getValue()).m("TrainingPrioritySelectionFragment");
        Y4();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    public static final Object X4(i iVar, v13.c cVar) {
        l lVar;
        int i14;
        long j8;
        o13.p<fg0.k, ww1.g> pVar;
        ww1.g gVar;
        o13.p<fg0.k, ww1.g> pVar2;
        ww1.g gVar2;
        int i15;
        v2 v2Var;
        o13.p<fg0.k, ww1.g> pVar3;
        ww1.g gVar3;
        fg0.k kVar;
        v2 v2Var2;
        iVar.getClass();
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i16 = lVar.f95901g;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                lVar.f95901g = i16 - Integer.MIN_VALUE;
            } else {
                lVar = new l(iVar, cVar);
            }
        } else {
            lVar = new l(iVar, cVar);
        }
        Object objS4 = lVar.f95899e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = lVar.f95901g;
        if (i17 != 0) {
            if (i17 == 1) {
                i14 = lVar.f95897c;
                j8 = lVar.f95898d;
                int i18 = lVar.f95896b;
                r.b(objS4);
                i15 = i18;
            } else {
                if (i17 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var2 = lVar.f95895a;
                r.b(objS4);
            }
            v2Var = (v2) objS4;
            if (v2Var == null) {
                v2Var = v2Var2;
            }
            if (v2Var != null) {
                return v2Var;
            }
            return new v2.a(new IllegalStateException("Training Plan id is null"), null, null, 6, null);
        }
        r.b(objS4);
        g3<o13.p<fg0.k, ww1.g>> g3VarD = iVar.Z4().d();
        xw1.d dVar = null;
        Long l14 = (g3VarD == null || (pVar2 = g3VarD.f35301b) == null || (gVar2 = pVar2.f128595b) == null) ? null : gVar2.f187764b;
        g3<o13.p<fg0.k, ww1.g>> g3VarD2 = iVar.Z4().d();
        if (g3VarD2 != null && (pVar = g3VarD2.f35301b) != null && (gVar = pVar.f128595b) != null) {
            dVar = gVar.f187766d;
        }
        ?? r14 = dVar != null ? 1 : 0;
        if (l14 != null) {
            long jLongValue = l14.longValue();
            long jLongValue2 = l14.longValue();
            lVar.f95896b = r14;
            lVar.f95898d = jLongValue;
            lVar.f95897c = 0;
            lVar.f95901g = 1;
            objS4 = iVar.S4(jLongValue2, lVar, r14);
            if (objS4 != aVar) {
                i14 = 0;
                j8 = jLongValue;
                i15 = r14;
            }
            return aVar;
        }
        return new v2.a(new IllegalStateException("Training Plan id is null"), null, null, 6, null);
        v2Var = (v2) objS4;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            u0.r();
            return null;
        }
        g3<o13.p<fg0.k, ww1.g>> g3VarD3 = iVar.Z4().d();
        if (g3VarD3 != null && (pVar3 = g3VarD3.f35301b) != null && (gVar3 = pVar3.f128595b) != null && (kVar = gVar3.f187767e) != null) {
            cg0.a aVar2 = (cg0.a) iVar.f204401r.getValue();
            dg0.a aVar3 = dg0.a.NO_PRIORITY;
            lVar.f95895a = (v2.b) v2Var;
            lVar.f95896b = i15;
            lVar.f95898d = j8;
            lVar.f95897c = i14;
            lVar.f95901g = 2;
            aVar2.getClass();
            Object objB = aVar2.b(cg0.a.a(kVar, aVar3, true), lVar);
            if (objB != aVar) {
                objS4 = objB;
                v2Var2 = v2Var;
                v2Var = (v2) objS4;
                if (v2Var == null) {
                    v2Var = v2Var2;
                }
            }
            return aVar;
        }
        if (v2Var != null) {
            return v2Var;
        }
        return new v2.a(new IllegalStateException("Training Plan id is null"), null, null, 6, null);
    }

    public final void Y4() {
        Z4().m(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(this), null, null, new c(null), 3);
    }

    public final y0<g3<o13.p<fg0.k, ww1.g>>> Z4() {
        return (y0) this.L0.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liz1/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
