package wt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zf0.y0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.RaceEventViewModel$handleEventCreationForDashBoard$1", f = "RaceEventViewModel.kt", l = {556, 563, 587}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g3 f187084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f187085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fg0.k f187086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fg0.k f187087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f187088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f187089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f187090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xw1.n f187091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f187092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f187093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ xw1.d f187094k;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187095a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f187095a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar, xw1.n nVar, Context context, long j8, xw1.d dVar2, t13.d<? super k> dVar3) {
        super(2, dVar3);
        this.f187090g = dVar;
        this.f187091h = nVar;
        this.f187092i = context;
        this.f187093j = j8;
        this.f187094k = dVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f187090g, this.f187091h, this.f187092i, this.f187093j, this.f187094k, dVar);
        kVar.f187089f = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:54:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x015f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0188  */
    /* JADX WARN: Code duplicated, block: B:71:0x018f  */
    /* JADX WARN: Code duplicated, block: B:72:0x019e  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01df  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        if (r3 == r2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r8 == r2) goto L67;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x01a2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objX4;
        g3 g3VarD;
        fw.p pVar;
        int i14;
        fg0.k kVar;
        v2 v2Var;
        Object objY4;
        fg0.k kVar2;
        fg0.j eventCustomization;
        xw1.d dVar;
        fg0.d dVar2;
        fg0.k kVarD;
        Object objJ4;
        fg0.k kVar3;
        xw1.m athletePlanGoal;
        fg0.k kVar4;
        Long l14;
        fg0.k kVar5;
        fg0.j eventCustomization2;
        v2 v2Var2;
        b0 b0Var = (b0) this.f187089f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f187088e;
        d dVar3 = this.f187090g;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                objX4 = obj;
            } else {
                if (i15 == 2) {
                    g3VarD = this.f187084a;
                    o13.r.b(obj);
                    objY4 = obj;
                    v2Var = (v2) objY4;
                    if (v2Var instanceof v2.a) {
                        Exception exc = ((v2.a) v2Var).f47383a;
                        kVar4 = dVar3.f187048o;
                        if (kVar4 != null) {
                            l14 = kVar4.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                        } else {
                            l14 = null;
                        }
                        kVar5 = dVar3.f187048o;
                        if (kVar5 != null) {
                            eventCustomization2 = kVar5.getEventCustomization();
                        } else {
                            eventCustomization2 = null;
                        }
                        String str = exc + " Error in updating the customization " + l14 + " :: " + eventCustomization2;
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.f(a2Var, "RaceEventViewModel", str);
                        dVar3.E4().j(new rt1.a.C2926a(g3VarD != null ? g3VarD.f35302c : null));
                    } else {
                        kVar2 = (fg0.k) g3VarD.f35301b;
                        if (kVar2 != null) {
                            eventCustomization = kVar2.getEventCustomization();
                            if (eventCustomization == null) {
                                eventCustomization = new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                            }
                            eventCustomization.I(new Long(this.f187093j));
                            eventCustomization.M(gg0.e.COACH_ATP);
                            int i16 = d.f187033q;
                            dVar3.getClass();
                            dVar = this.f187094k;
                            if (dVar == null && ((athletePlanGoal = dVar.getAthletePlanGoal()) == null || athletePlanGoal.f())) {
                                Integer goalTimeSeconds = dVar.getGoalTimeSeconds();
                                dVar2 = new fg0.d(goalTimeSeconds != null ? Double.valueOf(goalTimeSeconds.intValue()) : null, gg0.i.SECOND, gg0.h.TIME);
                            } else {
                                dVar2 = null;
                            }
                            eventCustomization.F(dVar2);
                            kVarD = fg0.k.d(kVar2, null, null, null, null, null, null, eventCustomization, -16777217);
                            this.f187089f = b0Var;
                            this.f187084a = null;
                            this.f187085b = dVar3;
                            this.f187086c = kVar2;
                            this.f187087d = kVarD;
                            this.f187088e = 3;
                            objJ4 = dVar3.J4(kVarD, this);
                            if (objJ4 != aVar) {
                                kVar3 = kVar2;
                            }
                            return aVar;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg0.k kVar6 = this.f187087d;
                kVar3 = this.f187086c;
                dVar3 = this.f187085b;
                o13.r.b(obj);
                kVarD = kVar6;
                objJ4 = obj;
            }
            v2Var2 = (v2) objJ4;
            if (v2Var2 instanceof v2.b) {
                dVar3.f187048o = kVar3;
                dVar3.E4().j(new rt1.a.b(kVarD));
            } else {
                if (!(v2Var2 instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String str2 = ((v2.a) v2Var2).f47383a + " Error in updating the customization " + kVarD.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() + " :: " + kVarD.getEventCustomization();
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "RaceEventViewModel", str2);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        int i17 = d.f187033q;
        dVar3.E4().j(rt1.a.c.f154512a);
        xw1.n nVar = this.f187091h;
        y0 y0Var = nVar.f192425a;
        fg0.k kVar7 = nVar.f192426b;
        if (y0Var == y0.USER_CALENDAR_EVENT) {
            g3.f35298f.getClass();
            g3VarD = g3.a.d(kVar7);
            if (g3VarD != null) {
                pVar = g3VarD.f35300a;
            } else {
                pVar = null;
            }
            if (pVar == null) {
                i14 = -1;
            } else {
                i14 = a.f187095a[pVar.ordinal()];
            }
            if (i14 == 1) {
                kVar = dVar3.f187048o;
                if (kVar != null) {
                    boolean z14 = dVar3.f187047n;
                    this.f187089f = b0Var;
                    this.f187084a = g3VarD;
                    this.f187088e = 2;
                    objY4 = d.y4(dVar3, z14, kVar, this);
                } else {
                    v2Var = null;
                    if (v2Var instanceof v2.a) {
                        Exception exc2 = ((v2.a) v2Var).f47383a;
                        kVar4 = dVar3.f187048o;
                        if (kVar4 != null) {
                            l14 = kVar4.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                        } else {
                            l14 = null;
                        }
                        kVar5 = dVar3.f187048o;
                        if (kVar5 != null) {
                            eventCustomization2 = kVar5.getEventCustomization();
                        } else {
                            eventCustomization2 = null;
                        }
                        String str3 = exc2 + " Error in updating the customization " + l14 + " :: " + eventCustomization2;
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar4.getClass();
                        i2.a.f(a2Var3, "RaceEventViewModel", str3);
                        dVar3.E4().j(new rt1.a.C2926a(g3VarD != null ? g3VarD.f35302c : null));
                    } else {
                        kVar2 = (fg0.k) g3VarD.f35301b;
                        if (kVar2 != null) {
                            eventCustomization = kVar2.getEventCustomization();
                            if (eventCustomization == null) {
                                eventCustomization = new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                            }
                            eventCustomization.I(new Long(this.f187093j));
                            eventCustomization.M(gg0.e.COACH_ATP);
                            int i18 = d.f187033q;
                            dVar3.getClass();
                            dVar = this.f187094k;
                            if (dVar == null) {
                                dVar2 = null;
                            } else {
                                dVar2 = null;
                            }
                            eventCustomization.F(dVar2);
                            kVarD = fg0.k.d(kVar2, null, null, null, null, null, null, eventCustomization, -16777217);
                            this.f187089f = b0Var;
                            this.f187084a = null;
                            this.f187085b = dVar3;
                            this.f187086c = kVar2;
                            this.f187087d = kVarD;
                            this.f187088e = 3;
                            objJ4 = dVar3.J4(kVarD, this);
                            if (objJ4 != aVar) {
                                kVar3 = kVar2;
                                v2Var2 = (v2) objJ4;
                                if (v2Var2 instanceof v2.b) {
                                    dVar3.f187048o = kVar3;
                                    dVar3.E4().j(new rt1.a.b(kVarD));
                                } else {
                                    if (!(v2Var2 instanceof v2.a)) {
                                        u0.r();
                                        return null;
                                    }
                                    String str4 = ((v2.a) v2Var2).f47383a + " Error in updating the customization " + kVarD.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() + " :: " + kVarD.getEventCustomization();
                                    i2.a aVar5 = i2.f36769a;
                                    a2 a2Var4 = a2.GENERAL;
                                    aVar5.getClass();
                                    i2.a.f(a2Var4, "RaceEventViewModel", str4);
                                }
                            }
                        }
                    }
                }
            } else {
                int i19 = d.f187033q;
                dVar3.E4().j(new rt1.a.C2926a(g3VarD != null ? g3VarD.f35302c : null));
            }
            return Unit.INSTANCE;
        }
        fg0.p pVar2 = nVar.f192427c;
        this.f187089f = b0Var;
        this.f187088e = 1;
        objX4 = d.x4(dVar3, this.f187092i, pVar2, kVar7, this);
        return aVar;
        g3VarD = (g3) objX4;
        if (g3VarD != null) {
            pVar = g3VarD.f35300a;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            i14 = -1;
        } else {
            i14 = a.f187095a[pVar.ordinal()];
        }
        if (i14 == 1) {
            kVar = dVar3.f187048o;
            if (kVar != null) {
                boolean z15 = dVar3.f187047n;
                this.f187089f = b0Var;
                this.f187084a = g3VarD;
                this.f187088e = 2;
                objY4 = d.y4(dVar3, z15, kVar, this);
            } else {
                v2Var = null;
                if (v2Var instanceof v2.a) {
                    Exception exc3 = ((v2.a) v2Var).f47383a;
                    kVar4 = dVar3.f187048o;
                    if (kVar4 != null) {
                        l14 = kVar4.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                    } else {
                        l14 = null;
                    }
                    kVar5 = dVar3.f187048o;
                    if (kVar5 != null) {
                        eventCustomization2 = kVar5.getEventCustomization();
                    } else {
                        eventCustomization2 = null;
                    }
                    String str5 = exc3 + " Error in updating the customization " + l14 + " :: " + eventCustomization2;
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.f(a2Var5, "RaceEventViewModel", str5);
                    dVar3.E4().j(new rt1.a.C2926a(g3VarD != null ? g3VarD.f35302c : null));
                } else {
                    kVar2 = (fg0.k) g3VarD.f35301b;
                    if (kVar2 != null) {
                        eventCustomization = kVar2.getEventCustomization();
                        if (eventCustomization == null) {
                            eventCustomization = new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                        }
                        eventCustomization.I(new Long(this.f187093j));
                        eventCustomization.M(gg0.e.COACH_ATP);
                        int i110 = d.f187033q;
                        dVar3.getClass();
                        dVar = this.f187094k;
                        if (dVar == null) {
                            dVar2 = null;
                        } else {
                            dVar2 = null;
                        }
                        eventCustomization.F(dVar2);
                        kVarD = fg0.k.d(kVar2, null, null, null, null, null, null, eventCustomization, -16777217);
                        this.f187089f = b0Var;
                        this.f187084a = null;
                        this.f187085b = dVar3;
                        this.f187086c = kVar2;
                        this.f187087d = kVarD;
                        this.f187088e = 3;
                        objJ4 = dVar3.J4(kVarD, this);
                        if (objJ4 != aVar) {
                            kVar3 = kVar2;
                            v2Var2 = (v2) objJ4;
                            if (v2Var2 instanceof v2.b) {
                                dVar3.f187048o = kVar3;
                                dVar3.E4().j(new rt1.a.b(kVarD));
                            } else {
                                if (!(v2Var2 instanceof v2.a)) {
                                    u0.r();
                                    return null;
                                }
                                String str6 = ((v2.a) v2Var2).f47383a + " Error in updating the customization " + kVarD.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() + " :: " + kVarD.getEventCustomization();
                                i2.a aVar7 = i2.f36769a;
                                a2 a2Var6 = a2.GENERAL;
                                aVar7.getClass();
                                i2.a.f(a2Var6, "RaceEventViewModel", str6);
                            }
                        }
                    }
                }
            }
            return aVar;
        }
        int i111 = d.f187033q;
        dVar3.E4().j(new rt1.a.C2926a(g3VarD != null ? g3VarD.f35302c : null));
        return Unit.INSTANCE;
    }
}
