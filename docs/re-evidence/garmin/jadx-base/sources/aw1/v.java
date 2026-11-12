package aw1;

import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$fetchTrainingLevelRecommendation$1", f = "FBTPlanWizardViewModel.kt", l = {4931}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f13575b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(h hVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f13575b = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f13575b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e9  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        jv1.y yVar;
        vt1.o oVar;
        tw1.k kVar;
        tw1.k kVarJ;
        double dDoubleValue;
        jv1.s sVarI6;
        hv1.j jVar;
        int iB;
        jv1.h hVarE5;
        jv1.g gVar;
        gg0.i iVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13574a;
        boolean zG = true;
        h hVar = this.f13575b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = hVar.L1;
            p2 p2Var2 = hVar.L1;
            p2Var.k(null, g3.a.c(g3.f35298f));
            if (!hVar.Z6() && hVar.c7()) {
                p2Var2.k(null, g3.a.d(null));
                return Unit.INSTANCE;
            }
            if (hVar.a8()) {
                if (hVar.Z6()) {
                    kVar = tw1.k.BEGINNER;
                } else {
                    jv1.s sVarI7 = hVar.i6();
                    if ((sVarI7 != null ? sVarI7.C : null) == hv1.f.ZERO_FOUR) {
                        kVar = tw1.k.BEGINNER;
                    } else {
                        kVar = tw1.k.INTERMEDIATE;
                    }
                }
                p2Var2.k(null, g3.a.d(kVar));
                return Unit.INSTANCE;
            }
            if (hVar.Z6()) {
                jv1.s sVarI8 = hVar.i6();
                if (sVarI8 == null || (oVar = sVarI8.f101125d) == null) {
                    yVar = null;
                } else {
                    this.f13574a = 1;
                    obj = h.b5(hVar, oVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (yVar != null) {
                    zG = p005kotlin.jvm.internal.s.g(yVar.getHasMinimumHistory(), Boolean.TRUE);
                } else {
                    zG = false;
                }
            }
            if (zG) {
                dDoubleValue = 0.0d;
                if (!hVar.Z6()) {
                    hVarE5 = hVar.E5();
                    if (hVarE5 instanceof jv1.g) {
                        gVar = (jv1.g) hVarE5;
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        og0.a aVar2 = og0.a.f131967a;
                        Double d14 = gVar.f101057a;
                        dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                        iVar = gVar.f101058b;
                        if (iVar == null) {
                            iVar = gg0.i.METER;
                        }
                        aVar2.getClass();
                        dDoubleValue = og0.a.g(dDoubleValue, iVar);
                    }
                }
                sVarI6 = hVar.i6();
                if (sVarI6 != null || (jVar = sVarI6.f101143v) == null) {
                    jVar = hv1.j.ZERO;
                }
                if (jVar != hv1.j.TWENTY_FIVE_PLUS || jVar == hv1.j.FORTY_PLUS_KM) {
                    iB = 26;
                } else {
                    iB = jVar.b();
                }
                tu1.i.f166483a.getClass();
                kVarJ = tu1.i.a.j(dDoubleValue, iB);
            } else {
                kVarJ = null;
            }
            p2 p2Var3 = hVar.L1;
            g3.f35298f.getClass();
            p2Var3.k(null, g3.a.d(kVarJ));
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        yVar = (jv1.y) obj;
        if (yVar != null) {
            zG = p005kotlin.jvm.internal.s.g(yVar.getHasMinimumHistory(), Boolean.TRUE);
        } else {
            zG = false;
        }
        if (zG) {
            dDoubleValue = 0.0d;
            if (!hVar.Z6()) {
                hVarE5 = hVar.E5();
                if (hVarE5 instanceof jv1.g) {
                    gVar = (jv1.g) hVarE5;
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    og0.a aVar3 = og0.a.f131967a;
                    Double d15 = gVar.f101057a;
                    if (d15 != null) {
                    }
                    iVar = gVar.f101058b;
                    if (iVar == null) {
                        iVar = gg0.i.METER;
                    }
                    aVar3.getClass();
                    dDoubleValue = og0.a.g(dDoubleValue, iVar);
                }
            }
            sVarI6 = hVar.i6();
            if (sVarI6 != null) {
                jVar = hv1.j.ZERO;
            } else {
                jVar = hv1.j.ZERO;
            }
            if (jVar != hv1.j.TWENTY_FIVE_PLUS) {
                iB = 26;
            } else {
                iB = 26;
            }
            tu1.i.f166483a.getClass();
            kVarJ = tu1.i.a.j(dDoubleValue, iB);
        } else {
            kVarJ = null;
        }
        p2 p2Var4 = hVar.L1;
        g3.f35298f.getClass();
        p2Var4.k(null, g3.a.d(kVarJ));
        return Unit.INSTANCE;
    }
}
