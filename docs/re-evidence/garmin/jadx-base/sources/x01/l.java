package x01;

import b21.fb;
import b21.l4;
import b63.o;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionViewModel$fetchNutritionSettings$2", f = "NutritionViewModel.kt", l = {113, 143, 151}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f188314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fb f188315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l4 f188316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f188317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f188318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f188319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f188320g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, o oVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f188319f = kVar;
        this.f188320g = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f188319f, this.f188320g, dVar);
        lVar.f188318e = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x016c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0176  */
    /* JADX WARN: Code duplicated, block: B:89:0x018d  */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Code duplicated, block: B:94:0x019e  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a2  */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0137, code lost:
    
        if (r3 == r2) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        e eVar;
        f01.b bVar;
        Object obj2;
        o13.p pVar;
        String str;
        Object objY4;
        f fVar;
        Object value2;
        Object value3;
        e eVar2;
        fb fbVar;
        l4 l4Var;
        Object objY;
        l4 l4Var2;
        fb fbVar2;
        e eVar3;
        v2 v2Var;
        p2 p2Var;
        Object value4;
        e eVar4;
        p2 p2Var2;
        Object value5;
        j jVar;
        fb fbVar3;
        b0 b0Var = (b0) this.f188318e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f188317d;
        k kVar = this.f188319f;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var3 = kVar.f188297k;
            do {
                value = p2Var3.getValue();
            } while (!p2Var3.b(value, j.a((j) value, true, null, null, null, 30)));
            i iVar = kVar.f188289c;
            this.f188318e = b0Var;
            this.f188317d = 1;
            objA = iVar.a(false, this);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
            objA = obj;
        } else {
            if (i14 == 2) {
                e eVar5 = this.f188314a;
                r.b(obj);
                eVar = eVar5;
                objY4 = obj;
                pVar = (o13.p) objY4;
                eVar2 = eVar;
                fbVar = (fb) pVar.f128594a;
                l4Var = (l4) pVar.f128595b;
                m01.g gVar = kVar.f188288b;
                this.f188318e = b0Var;
                this.f188314a = eVar2;
                this.f188315b = fbVar;
                this.f188316c = l4Var;
                this.f188317d = 3;
                objY = gVar.Y(this.f188320g, this);
                if (objY != aVar) {
                    l4Var2 = l4Var;
                    fbVar2 = fbVar;
                }
                return aVar;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l4 l4Var3 = this.f188316c;
            fbVar2 = this.f188315b;
            eVar2 = this.f188314a;
            r.b(obj);
            l4Var2 = l4Var3;
            objY = obj;
        }
        eVar3 = eVar2;
        v2Var = (v2) objY;
        if (v2Var instanceof v2.b) {
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "NutritionViewModel", "fetchNutritionSettings: successfully retrieved nutrition settings");
            p2Var2 = kVar.f188297k;
            do {
                value5 = p2Var2.getValue();
                jVar = (j) value5;
                if (l4Var2 == null) {
                    fbVar3 = fbVar2;
                } else {
                    fbVar3 = null;
                }
            } while (!p2Var2.b(value5, j.a(jVar, false, fbVar3, l4Var2, eVar3, 8)));
        } else {
            if (v2Var instanceof v2.a) {
                u0.r();
                return null;
            }
            a2 a2Var2 = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "NutritionViewModel", "fetchNutritionSettings: error retrieving nutrition settings");
            p2Var = kVar.f188297k;
            do {
                value4 = p2Var.getValue();
                eVar4 = eVar3;
                eVar3 = eVar4;
            } while (!p2Var.b(value4, j.a((j) value4, false, null, null, eVar4, 6)));
        }
        return Unit.INSTANCE;
        eVar = (e) objA;
        e01.a aVar2 = kVar.f188291e;
        l4 l4Var4 = kVar.f188293g;
        e01.a aVar3 = kVar.f188291e;
        f01.b bVarD = aVar2.D();
        f fVar2 = eVar.f188255d;
        boolean z14 = eVar.f188256e;
        f fVar3 = eVar.f188254c;
        f fVar4 = f.ACTIVE;
        if (fVar2 == fVar4) {
            bVar = f01.b.GARMIN;
        } else {
            bVar = fVar3 == fVar4 ? f01.b.MY_FITNESS_PAL : null;
        }
        aVar3.v(bVar);
        if (bVarD == f01.b.GARMIN && bVar == f01.b.MY_FITNESS_PAL) {
            p2 p2Var4 = kVar.f188299m;
            do {
                value3 = p2Var4.getValue();
                ((Boolean) value3).getClass();
            } while (!p2Var4.b(value3, Boolean.TRUE));
        }
        if (!aVar3.z()) {
            if (l4Var4 == null) {
                obj2 = fb.c.INSTANCE;
            } else {
                if (l4Var4 instanceof l4.i0) {
                    obj2 = fb.e.INSTANCE;
                } else if (l4Var4 instanceof l4.y0) {
                    obj2 = fb.c.INSTANCE;
                } else if (l4Var4 instanceof l4.m) {
                    obj2 = fb.b.INSTANCE;
                } else {
                    obj2 = l4Var4 instanceof l4.g0 ? fb.d.INSTANCE : null;
                }
                if (obj2 == null) {
                    obj2 = fb.c.INSTANCE;
                }
            }
            if (eVar.f188258g && !z14 && fVar2 == (fVar = f.NEVER) && fVar3 == fVar) {
                pVar = new o13.p(fb.a.INSTANCE, null);
            } else {
                if (!s.g(obj2, fb.e.INSTANCE) || !z14) {
                    f fVar5 = f.ACTIVE;
                    if (fVar2 == fVar5 && (l4Var4 instanceof l4.x0) && (str = ((l4.x0) l4Var4).f14988b) != null) {
                        this.f188318e = b0Var;
                        this.f188314a = eVar;
                        this.f188317d = 2;
                        objY4 = k.y4(kVar, str, this);
                    } else {
                        pVar = fVar2 != fVar5 ? new o13.p(fb.c.INSTANCE, null) : new o13.p(obj2, null);
                    }
                    return aVar;
                }
                pVar = new o13.p(obj2, null);
            }
            eVar2 = eVar;
            fbVar = (fb) pVar.f128594a;
            l4Var = (l4) pVar.f128595b;
            m01.g gVar2 = kVar.f188288b;
            this.f188318e = b0Var;
            this.f188314a = eVar2;
            this.f188315b = fbVar;
            this.f188316c = l4Var;
            this.f188317d = 3;
            objY = gVar2.Y(this.f188320g, this);
            if (objY != aVar) {
                l4Var2 = l4Var;
                fbVar2 = fbVar;
                eVar3 = eVar2;
                v2Var = (v2) objY;
                if (v2Var instanceof v2.b) {
                    a2 a2Var3 = a2.NUTRITION;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var3, "NutritionViewModel", "fetchNutritionSettings: successfully retrieved nutrition settings");
                    p2Var2 = kVar.f188297k;
                    do {
                        value5 = p2Var2.getValue();
                        jVar = (j) value5;
                        if (l4Var2 == null) {
                            fbVar3 = fbVar2;
                        } else {
                            fbVar3 = null;
                        }
                    } while (!p2Var2.b(value5, j.a(jVar, false, fbVar3, l4Var2, eVar3, 8)));
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    a2 a2Var4 = a2.NUTRITION;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var4, "NutritionViewModel", "fetchNutritionSettings: error retrieving nutrition settings");
                    p2Var = kVar.f188297k;
                    do {
                        value4 = p2Var.getValue();
                        eVar4 = eVar3;
                        eVar3 = eVar4;
                    } while (!p2Var.b(value4, j.a((j) value4, false, null, null, eVar4, 6)));
                }
            }
            return aVar;
        }
        p2 p2Var5 = kVar.f188297k;
        do {
            value2 = p2Var5.getValue();
        } while (!p2Var5.b(value2, j.a((j) value2, false, fb.e.INSTANCE, null, eVar, 12)));
        a2 a2Var5 = a2.NUTRITION;
        i2.f36769a.getClass();
        i2.a.b(a2Var5, "NutritionViewModel", "fetchNutritionSettings: forced to setup flow by developer settings");
        return Unit.INSTANCE;
    }
}
