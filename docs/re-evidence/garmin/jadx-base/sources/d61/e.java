package d61;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.a0;
import c22.j0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import f32.g;
import f32.j;
import f32.l;
import f32.m;
import f32.p;
import gg1.o0;
import java.util.Collection;
import java.util.List;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ld61/e;", "Landroidx/lifecycle/u1;", "Lc61/b;", "mapper", "Lc22/a0;", "dispatcherProvider", "<init>", "(Lc61/b;Lc22/a0;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s61.a f57983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c61.a f57984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f57985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f57986d;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"d61/e$b", "Lf32/g;", "Lc61/c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends g<c61.c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c61.b f57988b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.performance.acclimation.presentation.HeatAltitudeAcclimationViewModel$detailsDataAdapter$1", f = "HeatAltitudeAcclimationViewModel.kt", l = {56}, m = "requestSafeDetails", v = 2)
        public static final class a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f57989a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f57991c;

            public a(t13.d<? super a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f57989a = obj;
                this.f57991c |= Integer.MIN_VALUE;
                return b.this.c(null, this);
            }
        }

        public b(c61.b bVar) {
            this.f57988b = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:106:0x028f  */
        /* JADX WARN: Code duplicated, block: B:132:0x0325  */
        /* JADX WARN: Code duplicated, block: B:136:0x0335  */
        /* JADX WARN: Code duplicated, block: B:138:0x0339  */
        /* JADX WARN: Code duplicated, block: B:7:0x001d  */
        @Override // f32.g
        public final Object c(DateTime dateTime, t13.d<? super v2<? extends c61.c>> dVar) {
            a aVar;
            String strA;
            Integer num;
            Integer num2 = 4000;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i14 = aVar.f57991c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    aVar.f57991c = i14 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object objJ = aVar.f57989a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = aVar.f57991c;
            e eVar = e.this;
            String string = "";
            String strA2 = null;
            if (i15 == 0) {
                r.b(objJ);
                String strB = j0.b(dateTime, "yyyy-MM-dd", null);
                if (strB == null) {
                    strB = "";
                }
                s61.a aVar3 = eVar.f57983a;
                aVar.f57991c = 1;
                aVar3.getClass();
                objJ = f0.J(aVar3, new s61.c(aVar3, strB, strB, null), aVar);
                if (objJ == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objJ);
            }
            v2 v2Var = (v2) objJ;
            c61.a aVar4 = eVar.f57984b;
            c61.a aVar5 = c61.a.HEAT;
            c61.b bVar = this.f57988b;
            if (aVar4 == aVar5) {
                if (!(v2Var instanceof v2.b)) {
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.f(a2Var, "AltitudeAcclimationViewModel", "Error! acclimationResult was Result.Error!");
                    return new v2.b(bVar.g(), 200, null, null, 12, null);
                }
                List list = (List) ((v2.b) v2Var).f47386a;
                if (list.isEmpty()) {
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.b(a2Var2, "AltitudeAcclimationViewModel", "Heat acclimationResult is empty.");
                    return new v2.b(bVar.g(), 200, null, null, 12, null);
                }
                x61.e eVar2 = (x61.e) list.get(0);
                if (eVar2.getHeatAcclimationPercentage() != null) {
                    Integer heatAcclimationPercentage = eVar2.getHeatAcclimationPercentage();
                    if ((heatAcclimationPercentage != null ? heatAcclimationPercentage.intValue() : 0) > 0) {
                        bVar.getClass();
                        String strB2 = bVar.b(eVar2.q());
                        String strA3 = bVar.a(eVar2.getHeatAcclimationPercentage());
                        b61.a aVar8 = b61.a.f16163a;
                        l22.b bVar2 = bVar.f24633a;
                        String strA4 = bVar.a(eVar2.getPreviousHeatAcclimationPercentage());
                        x61.a aVarT = eVar2.t();
                        b61.b bVar3 = b61.b.f16165a;
                        Integer heatAcclimationPercentage2 = eVar2.getHeatAcclimationPercentage();
                        bVar3.getClass();
                        boolean z14 = heatAcclimationPercentage2 != null && heatAcclimationPercentage2.intValue() >= 100;
                        aVar8.getClass();
                        String strC = b61.a.c(bVar2, strA4, aVarT, z14);
                        Integer num3 = eVar2.t().f189181g;
                        Integer num4 = eVar2.t().f189182h;
                        String string2 = num4 != null ? bVar2.getString(num4.intValue()) : null;
                        boolean z15 = bVar.d() == o0.STATUTE_US;
                        x61.a aVarT2 = eVar2.t();
                        Integer heatAcclimationPercentage3 = eVar2.getHeatAcclimationPercentage();
                        if (heatAcclimationPercentage3 != null && heatAcclimationPercentage3.intValue() >= 100) {
                            Integer num5 = aVarT2.f189179e;
                            if (num5 != null) {
                                strA2 = bVar2.getString(num5.intValue());
                            }
                        } else {
                            Integer num6 = aVarT2.f189177c;
                            if (num6 != null) {
                                strA2 = bVar2.a(num6.intValue(), bVar.c(z15));
                            }
                        }
                        return new v2.b(new c61.c(strB2, strA3, null, strC, num3, string2, strA2, null), 200, null, null, 12, null);
                    }
                }
                i2.a aVar9 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar9.getClass();
                i2.a.b(a2Var3, "AltitudeAcclimationViewModel", "Heat acclimation percent value was <= 0.");
                return new v2.b(bVar.g(), 200, null, null, 12, null);
            }
            if (!(v2Var instanceof v2.b)) {
                i2.a aVar10 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar10.getClass();
                i2.a.f(a2Var4, "AltitudeAcclimationViewModel", "Error! acclimationResult was Result.Error!");
                return new v2.b(bVar.g(), 200, null, null, 12, null);
            }
            T t7 = ((v2.b) v2Var).f47386a;
            if (((Collection) t7).isEmpty()) {
                i2.a aVar11 = i2.f36769a;
                a2 a2Var5 = a2.GENERAL;
                aVar11.getClass();
                i2.a.b(a2Var5, "AltitudeAcclimationViewModel", "AcclimationResult is empty.");
                return new v2.b(bVar.f(), 200, null, null, 12, null);
            }
            x61.e eVar3 = (x61.e) ((List) t7).get(0);
            if (eVar3.getAltitudeAcclimationMeters() != null) {
                Integer altitudeAcclimationMeters = eVar3.getAltitudeAcclimationMeters();
                if ((altitudeAcclimationMeters != null ? altitudeAcclimationMeters.intValue() : 0) > 0) {
                    if (eVar3.getAltitudeAcclimationPercentage() == null) {
                        l22.b bVar4 = bVar.f24633a;
                        l22.b bVar5 = bVar.f24633a;
                        ac1.a aVarE = bVar.e();
                        o0 o0VarD = bVar.d();
                        Integer altitudeAcclimationMeters2 = eVar3.getAltitudeAcclimationMeters();
                        Integer currentAltitude = eVar3.getCurrentAltitude();
                        b61.b bVar6 = b61.b.f16165a;
                        bVar6.getClass();
                        num2 = b61.b.a(currentAltitude) ? 4000 : altitudeAcclimationMeters2;
                        aVarE.getClass();
                        String strA5 = ac1.a.a(o0VarD, num2);
                        String string3 = c61.b.a.f24637a[bVar.d().ordinal()] == 1 ? bVar5.getString(R.string.lbl_m) : bVar5.getString(R.string.lbl_ft);
                        b61.a aVar12 = b61.a.f16163a;
                        Integer previousAltitudeAcclimationMeters = eVar3.getPreviousAltitudeAcclimationMeters();
                        o0 o0VarD2 = bVar.d();
                        aVar12.getClass();
                        String strB3 = b61.a.b(bVar5, previousAltitudeAcclimationMeters, o0VarD2, false);
                        x61.a aVarI = eVar3.i();
                        Integer altitudeAcclimationMeters3 = eVar3.getAltitudeAcclimationMeters();
                        bVar6.getClass();
                        String strC2 = b61.a.c(bVar5, strB3, aVarI, altitudeAcclimationMeters3 != null && altitudeAcclimationMeters3.intValue() >= 4000);
                        Integer num7 = eVar3.i().f189180f;
                        Integer num8 = eVar3.i().f189182h;
                        return new v2.b(new c61.c(null, strA5, string3, strC2, num7, num8 != null ? bVar4.getString(num8.intValue()) : null, b61.a.a(bVar4, eVar3.getAltitudeAcclimationMeters(), eVar3.i()), null, 128, null), 200, null, null, 12, null);
                    }
                    bVar.getClass();
                    l22.b bVar7 = bVar.f24633a;
                    String strB4 = bVar.b(eVar3.f());
                    ac1.a aVarE2 = bVar.e();
                    o0 o0VarD3 = bVar.d();
                    Integer altitudeAcclimationMeters4 = eVar3.getAltitudeAcclimationMeters();
                    Integer currentAltitude2 = eVar3.getCurrentAltitude();
                    b61.b bVar8 = b61.b.f16165a;
                    bVar8.getClass();
                    if (b61.b.a(currentAltitude2)) {
                        altitudeAcclimationMeters4 = num2;
                    }
                    aVarE2.getClass();
                    String strA6 = ac1.a.a(o0VarD3, altitudeAcclimationMeters4);
                    String string4 = c61.b.a.f24637a[bVar.d().ordinal()] == 1 ? bVar7.getString(R.string.lbl_m) : bVar7.getString(R.string.lbl_ft);
                    Integer currentAltitude3 = eVar3.getCurrentAltitude();
                    Integer altitudeAcclimationPercentage = eVar3.getAltitudeAcclimationPercentage();
                    if (altitudeAcclimationPercentage != null) {
                        bVar8.getClass();
                        if (b61.b.a(currentAltitude3)) {
                            strA = bVar7.a(R.string.msg_your_current_elevation_is_amount, bVar.e().b(bVar.d(), currentAltitude3));
                        } else {
                            if (currentAltitude3 != null && currentAltitude3.intValue() < 800) {
                                strA = bVar7.a(R.string.msg_your_current_elevation_is_amount, bVar.e().b(bVar.d(), currentAltitude3));
                            } else {
                                strA = altitudeAcclimationPercentage.intValue() >= 100 ? bVar7.a(R.string.msg_fully_acclimated_current_elevation, bVar.e().b(bVar.d(), currentAltitude3)) : bVar7.a(R.string.msg_percentage_acclimated_current_elevation, bVar7.a(R.string.lbl_value_percent, altitudeAcclimationPercentage), bVar.e().b(bVar.d(), currentAltitude3));
                            }
                        }
                    } else {
                        strA = bVar7.a(R.string.msg_your_current_elevation_is_amount, bVar.e().b(bVar.d(), currentAltitude3));
                    }
                    String str = strA;
                    Integer currentAltitude4 = eVar3.getCurrentAltitude();
                    x61.a aVarI2 = eVar3.i();
                    bVar8.getClass();
                    Integer num9 = !b61.b.a(currentAltitude4) ? aVarI2.f189181g : null;
                    Integer num10 = eVar3.i().f189182h;
                    String string5 = num10 != null ? bVar7.getString(num10.intValue()) : null;
                    Integer altitudeAcclimationPercentage2 = eVar3.getAltitudeAcclimationPercentage();
                    Integer altitudeAcclimationMeters5 = eVar3.getAltitudeAcclimationMeters();
                    Integer currentAltitude5 = eVar3.getCurrentAltitude();
                    x61.a aVarI3 = eVar3.i();
                    if (b61.b.a(currentAltitude5)) {
                        string = bVar7.a(R.string.msg_acclimation_levels_above_amount_not_determined, bVar.e().b(bVar.d(), num2));
                    } else {
                        if (!(altitudeAcclimationMeters5 != null && altitudeAcclimationMeters5.intValue() < 800)) {
                            if (currentAltitude5 != null && currentAltitude5.intValue() < 800) {
                                string = bVar7.getString(R.string.msg_may_see_performance_improvements_from_lower_elevation);
                            } else if (altitudeAcclimationPercentage2 != null) {
                                num = aVarI3.f189176b;
                                if (num != null) {
                                    string = bVar7.getString(num.intValue());
                                }
                            } else {
                                num = aVarI3.f189176b;
                                if (num != null) {
                                    string = bVar7.getString(num.intValue());
                                }
                            }
                        } else if (altitudeAcclimationPercentage2 != null || altitudeAcclimationPercentage2.intValue() < 100) {
                            num = aVarI3.f189176b;
                            if (num != null) {
                                string = bVar7.getString(num.intValue());
                            }
                        } else {
                            string = bVar7.getString(R.string.msg_achieved_maximum_acclimation_for_current_altitude);
                        }
                    }
                    return new v2.b(new c61.c(strB4, strA6, string4, str, num9, string5, string, null), 200, null, null, 12, null);
                }
            }
            i2.a aVar13 = i2.f36769a;
            a2 a2Var6 = a2.GENERAL;
            aVar13.getClass();
            i2.a.b(a2Var6, "AltitudeAcclimationViewModel", "Altitude acclimation value was <= 0.");
            return new v2.b(bVar.f(), 200, null, null, 12, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"d61/e$c", "Lf32/p;", "", "Lx61/e;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends p<List<? extends x61.e>> {

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.performance.acclimation.presentation.HeatAltitudeAcclimationViewModel$summaryDataAdapter$1", f = "HeatAltitudeAcclimationViewModel.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "requestSafeSummary", v = 2)
        public static final class a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f57993a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f57995c;

            public a(t13.d<? super a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f57993a = obj;
                this.f57995c |= Integer.MIN_VALUE;
                return c.this.b(null, null, this);
            }
        }

        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // f32.p
        public final Object b(DateTime dateTime, DateTime dateTime2, t13.d<? super v2<? extends List<? extends x61.e>>> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i14 = aVar.f57995c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    aVar.f57995c = i14 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object objJ = aVar.f57993a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = aVar.f57995c;
            if (i15 == 0) {
                r.b(objJ);
                String strB = j0.b(dateTime, "yyyy-MM-dd", null);
                if (strB == null) {
                    strB = "";
                }
                String strB2 = j0.b(dateTime2, "yyyy-MM-dd", null);
                String str = strB2 != null ? strB2 : "";
                s61.a aVar3 = e.this.f57983a;
                aVar.f57995c = 1;
                aVar3.getClass();
                objJ = f0.J(aVar3, new s61.c(aVar3, strB, str, null), aVar);
                if (objJ == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objJ);
            }
            v2 v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                return new v2.b((List) ((v2.b) v2Var).f47386a, 200, null, null, 12, null);
            }
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var, "AltitudeAcclimationViewModel", "Error! summaryData fetch failed!");
            return new v2.b(p13.j0.f134944a, 200, null, null, 12, null);
        }
    }

    static {
        new a(null);
    }

    public e(c61.b bVar, a0 a0Var) {
        bVar.getClass();
        a0Var.getClass();
        this.f57983a = s61.a.C2979a.a(s61.a.f157622b);
        this.f57984b = c61.a.ALTITUDE;
        this.f57985c = new l(new f32.a(v1.a(this), new b(bVar), a0Var));
        this.f57986d = new m(new j(v1.a(this), new c(), a0Var));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld61/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e(c61.b bVar, a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new a0(null, null, null, 7, null) : a0Var);
    }
}
