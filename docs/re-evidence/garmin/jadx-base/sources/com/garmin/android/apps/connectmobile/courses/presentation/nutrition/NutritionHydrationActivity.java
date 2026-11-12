package com.garmin.android.apps.connectmobile.courses.presentation.nutrition;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import e23.l;
import e23.p;
import i3.e9;
import i3.mc;
import java.util.Iterator;
import lc.u0;
import mg2.o;
import o13.h;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.x;
import p3.l0;
import p3.l1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import v13.i;
import w01.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0018²\u0006\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\n\u001a\u0004\u0018\u00010\t8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/nutrition/NutritionHydrationActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "", "feedbackMessage", "", "pgDurationInHours", "Lw01/a;", "hydrationRecommendation", "Lw01/f;", "nutritionRecommendation", "temperature", "feelsLikeTemperature", "La01/a;", "weatherType", "temporaryWeatherType", "", "hasEvent", "shouldShowWeatherBottomSheet", "Lcom/garmin/android/apps/connectmobile/g3;", "Lw01/c;", "nutritionHydrationResult", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NutritionHydrationActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f33067b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33068a = m.a(n.NONE, new e(this, null, null, null));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.nutrition.NutritionHydrationActivity$NutritionHydrationScreen$1$1", f = "NutritionHydrationActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w01.c f33069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<a01.a> f33070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f33071c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w01.c cVar, p1<a01.a> p1Var, p1<Boolean> p1Var2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f33069a = cVar;
            this.f33070b = p1Var;
            this.f33071c = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f33069a, this.f33070b, this.f33071c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a01.a aVar2 = this.f33069a.f181036i;
            if (aVar2 == null) {
                aVar2 = a01.a.TODAY;
            }
            a aVar3 = NutritionHydrationActivity.f33067b;
            p1<a01.a> p1Var = this.f33070b;
            p1Var.setValue(aVar2);
            if (p1Var.getF182175a() == a01.a.EVENT) {
                this.f33071c.setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f33073b;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33072a = iArr;
            int[] iArr2 = new int[a01.a.values().length];
            try {
                iArr2[a01.a.EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a01.a.TODAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[a01.a.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f33073b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f33074a;

        public d(l lVar) {
            lVar.getClass();
            this.f33074a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f33074a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f33074a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<o50.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f33075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f33076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f33077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f33078d;

        public e(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f33075a = gVar;
            this.f33076b = qualifier;
            this.f33077c = aVar;
            this.f33078d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, o50.h] */
        @Override // e23.a
        public final o50.h invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f33075a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f33077c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(o50.h.class), f189591b, null, defaultViewModelCreationExtras, this.f33076b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f33078d, 4, null);
        }
    }

    public static w01.a ea(w01.c cVar) {
        q22.b bVar = cVar.f181030c;
        w01.b bVar2 = cVar.f181028a;
        q22.b bVar3 = q22.b.MILLILITER;
        if (bVar == bVar3) {
            if (bVar2 == null || !zf.b.D(bVar2.getMetricHydrationTotalValueInML()) || bVar2.getMetricHydrationTotalValueInML().doubleValue() <= 0.0d) {
                return null;
            }
            double dDoubleValue = bVar2.getMetricHydrationTotalValueInML().doubleValue();
            if (!zf.b.D(bVar2.getMetricHydrationIntervalValueInML()) || bVar2.getMetricHydrationIntervalValueInML().doubleValue() <= 0.0d) {
                return null;
            }
            double dDoubleValue2 = bVar2.getMetricHydrationIntervalValueInML().doubleValue();
            if (bVar2.getMetricIntervalInSeconds() == null || bVar2.getMetricIntervalInSeconds().intValue() <= 0) {
                return null;
            }
            return new w01.a(dDoubleValue, dDoubleValue2, bVar2.getMetricIntervalInSeconds().intValue(), x.k(bVar3, q22.b.FLUID_OUNCE), bVar3);
        }
        if (bVar2 == null || !zf.b.D(bVar2.getStatuteHydrationTotalValueInOz()) || bVar2.getStatuteHydrationTotalValueInOz().doubleValue() <= 0.0d) {
            return null;
        }
        double dDoubleValue3 = bVar2.getStatuteHydrationTotalValueInOz().doubleValue();
        if (!zf.b.D(bVar2.getStatuteHydrationIntervalValueInOz()) || bVar2.getStatuteHydrationIntervalValueInOz().doubleValue() <= 0.0d) {
            return null;
        }
        double dDoubleValue4 = bVar2.getStatuteHydrationIntervalValueInOz().doubleValue();
        if (bVar2.getStatuteIntervalInSeconds() == null || bVar2.getStatuteIntervalInSeconds().intValue() <= 0) {
            return null;
        }
        int iIntValue = bVar2.getStatuteIntervalInSeconds().intValue();
        q22.b bVar4 = q22.b.FLUID_OUNCE;
        return new w01.a(dDoubleValue3, dDoubleValue4, iIntValue, x.k(bVar3, bVar4), bVar4);
    }

    public static f fa(w01.c cVar) {
        w01.e eVar = cVar.f181029b;
        w01.b bVar = cVar.f181028a;
        w01.e eVar2 = w01.e.GRAMS;
        if (eVar == eVar2) {
            if (bVar == null || !zf.b.D(bVar.getMetricNutritionTotalValueLowInGrams()) || bVar.getMetricNutritionTotalValueLowInGrams().doubleValue() <= 0.0d || !zf.b.D(bVar.getMetricNutritionTotalValueHighInGrams()) || bVar.getMetricNutritionTotalValueHighInGrams().doubleValue() <= 0.0d) {
                return null;
            }
            j23.d dVar = new j23.d(bVar.getMetricNutritionTotalValueLowInGrams().doubleValue(), bVar.getMetricNutritionTotalValueHighInGrams().doubleValue());
            if (!zf.b.D(bVar.getMetricNutritionIntervalValueLowInGrams()) || bVar.getMetricNutritionIntervalValueLowInGrams().doubleValue() <= 0.0d || !zf.b.D(bVar.getMetricNutritionIntervalValueHighInGrams()) || bVar.getMetricNutritionIntervalValueHighInGrams().doubleValue() <= 0.0d) {
                return null;
            }
            j23.d dVar2 = new j23.d(bVar.getMetricNutritionIntervalValueLowInGrams().doubleValue(), bVar.getMetricNutritionIntervalValueHighInGrams().doubleValue());
            if (bVar.getMetricIntervalInSeconds() == null || bVar.getMetricIntervalInSeconds().intValue() <= 0) {
                return null;
            }
            return new f(dVar, dVar2, bVar.getMetricIntervalInSeconds().intValue(), x.k(eVar2, w01.e.CALORIE), eVar2);
        }
        if (bVar == null || !zf.b.D(bVar.getStatuteNutritionTotalValueLowInGrams()) || bVar.getStatuteNutritionTotalValueLowInGrams().doubleValue() <= 0.0d || !zf.b.D(bVar.getStatuteNutritionTotalValueHighInGrams()) || bVar.getStatuteNutritionTotalValueHighInGrams().doubleValue() <= 0.0d) {
            return null;
        }
        double d14 = 4;
        j23.d dVar3 = new j23.d(bVar.getStatuteNutritionTotalValueLowInGrams().doubleValue() * d14, bVar.getStatuteNutritionTotalValueHighInGrams().doubleValue() * d14);
        if (!zf.b.D(bVar.getStatuteNutritionIntervalValueLowInGrams()) || bVar.getStatuteNutritionIntervalValueLowInGrams().doubleValue() <= 0.0d || !zf.b.D(bVar.getStatuteNutritionIntervalValueHighInGrams()) || bVar.getStatuteNutritionIntervalValueHighInGrams().doubleValue() <= 0.0d) {
            return null;
        }
        j23.d dVar4 = new j23.d(bVar.getStatuteNutritionIntervalValueLowInGrams().doubleValue() * d14, bVar.getStatuteNutritionIntervalValueHighInGrams().doubleValue() * d14);
        if (bVar.getStatuteIntervalInSeconds() == null || bVar.getStatuteIntervalInSeconds().intValue() <= 0) {
            return null;
        }
        int iIntValue = bVar.getStatuteIntervalInSeconds().intValue();
        w01.e eVar3 = w01.e.CALORIE;
        return new f(dVar3, dVar4, iIntValue, x.k(eVar2, eVar3), eVar3);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0218  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ca(w01.c cVar, p3.m mVar, int i14) {
        o0 o0Var;
        double dDoubleValue;
        double d14;
        Double dValueOf;
        double dFloatValue;
        o0 o0VarE = mVar.E(-624962363);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            w01.b bVar = cVar.f181028a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(bVar != null ? da(bVar) : null);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                if (bVar != null) {
                    dFloatValue = bVar.getEffortMaxDurationInHours();
                } else {
                    Float f14 = cVar.f181033f;
                    if (f14 != null) {
                        dFloatValue = f14.floatValue();
                    } else {
                        dValueOf = null;
                    }
                    objQ2 = p0.n(dValueOf);
                    o0VarE.K(objQ2);
                }
                dValueOf = Double.valueOf(dFloatValue);
                objQ2 = p0.n(dValueOf);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(ea(cVar));
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(fa(cVar));
                o0VarE.K(objQ4);
            }
            p1 p1Var4 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                w01.b bVar2 = cVar.f181028a;
                objQ5 = new p3.y1(bVar2 != null ? bVar2.getTemperatureCelsius() : Double.NaN);
                o0VarE.K(objQ5);
            } else {
                bVar = bVar;
            }
            l1 l1Var = (l1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                w01.b bVar3 = cVar.f181028a;
                p3.y1 y1Var = new p3.y1(bVar3 != null ? bVar3.getHeatIndexTemperatureCelsius() : Double.NaN);
                o0VarE.K(y1Var);
                objQ6 = y1Var;
            }
            l1 l1Var2 = (l1) objQ6;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = p0.n(a01.a.TODAY);
                o0VarE.K(objQ7);
            }
            p1 p1Var5 = (p1) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = p0.n(a01.a.TODAY);
                o0VarE.K(objQ8);
            }
            p1 p1Var6 = (p1) objQ8;
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ9);
            }
            p1 p1Var7 = (p1) objQ9;
            Object objQ10 = o0VarE.q();
            if (objQ10 == c2565a) {
                objQ10 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ10);
            }
            p1 p1Var8 = (p1) objQ10;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ11 = o0VarE.q();
            if (objQ11 == c2565a) {
                objQ11 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ11);
            }
            b0 b0Var = (b0) objQ11;
            boolean z14 = (i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(cVar));
            Object objQ12 = o0VarE.q();
            if (z14 || objQ12 == c2565a) {
                objQ12 = new b(cVar, p1Var5, p1Var7, null);
                o0VarE.K(objQ12);
            }
            Parcelable.Creator<w01.c> creator = w01.c.CREATOR;
            l0.e((p) objQ12, cVar, o0VarE);
            p1 p1VarC = s9.c.c(ga().f129203c, o0VarE);
            int i16 = c.f33072a[((g3) p1VarC.getF182175a()).f35300a.ordinal()];
            if (i16 != 1) {
                if (i16 == 2) {
                    hideProgressOverlay();
                    w01.c cVar2 = (w01.c) ((g3) p1VarC.getF182175a()).f35301b;
                    if (cVar2 != null) {
                        cVar.f181028a = cVar2.f181028a;
                        cVar.f181036i = (a01.a) p1Var5.getF182175a();
                        p1Var2.setValue(bVar != null ? Double.valueOf(bVar.getEffortMaxDurationInHours()) : null);
                        w01.b bVar4 = cVar2.f181028a;
                        p1Var.setValue(bVar4 != null ? da(bVar4) : null);
                        p1Var3.setValue(ea(cVar2));
                        p1Var4.setValue(fa(cVar2));
                        p1Var5.setValue((a01.a) p1Var6.getF182175a());
                        if (((a01.a) p1Var5.getF182175a()) != a01.a.EVENT) {
                            w01.b bVar5 = cVar2.f181028a;
                            if (bVar5 != null) {
                                dDoubleValue = bVar5.getTemperatureCelsius();
                                d14 = dDoubleValue;
                            } else {
                                d14 = Double.NaN;
                            }
                        } else {
                            Double d15 = cVar.f181034g;
                            if (d15 != null) {
                                dDoubleValue = d15.doubleValue();
                                d14 = dDoubleValue;
                            } else {
                                d14 = Double.NaN;
                            }
                        }
                        l1Var.u(d14);
                        w01.b bVar6 = cVar2.f181028a;
                        l1Var2.u(bVar6 != null ? bVar6.getHeatIndexTemperatureCelsius() : Double.NaN);
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_nutrition_hydration_details", cVar);
                        setResult(-1, intent);
                    }
                } else if (i16 != 3) {
                    u0.r();
                    return;
                } else {
                    hideProgressOverlay();
                    displayFailedMessage();
                }
                o0VarE = o0VarE;
                mcVarF = mcVarF;
            } else {
                o0VarE = o0VarE;
                mcVarF = mcVarF;
                showProgressOverlay();
            }
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, z3.f.c(-1710756401, new o50.b(mcVarF, b0Var, cVar, this, p1Var, p1Var3, p1Var4, p1Var2, p1Var5, l1Var, l1Var2, p1Var8, p1Var7, p1Var6), o0Var), o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, cVar, i14, 4);
        }
    }

    public final String da(w01.b bVar) {
        Object next;
        String string;
        String feedbackPhraseKey = bVar.getFeedbackPhraseKey();
        q50.a.f142868c.getClass();
        feedbackPhraseKey.getClass();
        Iterator<T> it = q50.a.f142870e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((q50.a) next).f142871a, feedbackPhraseKey));
        q50.a aVar = (q50.a) next;
        return (aVar == null || (string = getString(aVar.f142872b)) == null) ? "" : string;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final o50.h ga() {
        return (o50.h) this.f33068a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        initActionBar(true, R.string.activity_details_nutrition_and_hydration);
        Bundle extras = getIntent().getExtras();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelable2 = extras != null ? extras.getParcelable("GCM_extra_nutrition_hydration_details") : null;
            parcelable = (w01.c) (parcelable2 instanceof w01.c ? parcelable2 : null);
        } else if (extras != null) {
            parcelable = (Parcelable) extras.getParcelable("GCM_extra_nutrition_hydration_details", w01.c.class);
        }
        w01.c cVar = (w01.c) parcelable;
        if (cVar == null) {
            finish();
            return;
        }
        ComposeView composeView = (ComposeView) findViewById(R.id.composable_container);
        if (composeView != null) {
            composeView.setContent(new z3.e(198055248, true, new mw0.i(16, this, cVar)));
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_help, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.CYCLING_NUTRITION_HYDRATION, "DEFAULT_ACTION", null, 8);
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/nutrition/NutritionHydrationActivity$a;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
