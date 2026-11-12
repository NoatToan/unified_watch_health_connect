package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import android.content.Context;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import com.nimbusds.jose.jwk.JWKParameterNames;
import f2.o0;
import f62.a1;
import f62.y0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p006l2.w2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0;", "", "<init>", "()V", "a", "g", "j", "b", "c", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.RSA_EXPONENT, "h", "d", "f", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f49020a = new k0();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$a;", "Ljava/io/Serializable;", "", "isMultiSportsWorkout", "<init>", "(Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a implements Serializable {
        public b(boolean z14) {
            super(z14);
        }

        @Override // f62.n
        public final List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> a() {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.INTERVAL;
            j0Var.f48227l = m52.a.f116649e;
            j0Var.f48229n = 1200.0d;
            j0Var.f48232q = m52.g.NONE;
            return p13.x.m(l52.n.c(j0Var));
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final String c(Context context) {
            bv.b.f21239a.getClass();
            bv.b.a();
            String string = context.getString(k1.f37122a.l0() ? R.string.lbl_handcycling_workout : R.string.workout_bike_workout_label);
            string.getClass();
            return string;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        /* JADX INFO: renamed from: e */
        public final int getF49028b() {
            return 300;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$c;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$a;", "Ljava/io/Serializable;", "", "isMultiSportsWorkout", "<init>", "(Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends a implements Serializable {
        public c(boolean z14) {
            super(z14);
        }

        @Override // f62.n
        public final List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> a() {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.INTERVAL;
            j0Var.f48227l = m52.a.f116649e;
            j0Var.f48229n = 300.0d;
            j0Var.f48232q = m52.g.NONE;
            return p13.x.m(l52.n.c(j0Var));
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final String c(Context context) {
            String string = context.getString(R.string.workout_custom_workout_label);
            string.getClass();
            return string;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        /* JADX INFO: renamed from: e */
        public final int getF49028b() {
            return 180;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$d;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$a;", "Ljava/io/Serializable;", "", "isMultiSportsWorkout", "<init>", "(Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends a implements Serializable {
        public d(boolean z14) {
            super(z14);
        }

        @Override // f62.n
        public final List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> a() {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.INTERVAL;
            j0Var.f48232q = m52.g.NONE;
            j0Var.f48227l = m52.a.f116649e;
            j0Var.f48229n = 30.0d;
            return p13.x.m(l52.n.c(j0Var));
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final String c(Context context) {
            String string = context.getString(R.string.workout_hitt_workout_label);
            string.getClass();
            return string;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        /* JADX INFO: renamed from: e */
        public final int getF49028b() {
            return 10;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final l52.m f() {
            if (this.f49021a) {
                return super.f();
            }
            l52.m mVarD = l52.n.d(new w2(19));
            l52.l.a(mVarD, a.b(m52.d.WARM_UP, m52.a.f116648d, m52.g.NONE));
            Iterator it = ((ArrayList) h()).iterator();
            while (it.hasNext()) {
                l52.l.a(mVarD, (l52.e.b) it.next());
            }
            l52.l.a(mVarD, a.b(m52.d.COOL_DOWN, m52.a.f116648d, m52.g.NONE));
            return mVarD;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final l52.f.b g() {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.REST;
            j0Var.f48227l = m52.a.f116649e;
            j0Var.f48229n = 10;
            j0Var.f48232q = m52.g.NONE;
            return l52.n.c(j0Var);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$e;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$a;", "Ljava/io/Serializable;", "Lm52/k;", "sportType", "", "isMultiSportsWorkout", "<init>", "(Lm52/k;Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m52.k f49022b;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f49023a;

            static {
                int[] iArr = new int[m52.k.values().length];
                try {
                    iArr[m52.k.f116760v.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[m52.k.f116762x.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[m52.k.f116763y.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[m52.k.f116761w.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f49023a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m52.k kVar, boolean z14) {
            super(z14);
            kVar.getClass();
            this.f49022b = kVar;
        }

        @Override // f62.n
        public final List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> a() {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.INTERVAL;
            j0Var.f48232q = m52.g.NONE;
            j0Var.f48227l = m52.a.f116657m;
            if (v52.f.s()) {
                j0Var.f48231p = m52.j.f116746f;
            } else {
                j0Var.f48231p = m52.j.f116745e;
            }
            m52.k kVar = m52.k.f116760v;
            m52.k kVar2 = this.f49022b;
            if (kVar2 == kVar) {
                j0Var.f48229n = 10.0d;
            } else if (p13.x.k(m52.k.f116762x, m52.k.f116761w, m52.k.f116763y).contains(kVar2)) {
                j0Var.f48227l = m52.a.f116648d;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(l52.n.c(j0Var));
            return arrayList;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final String c(Context context) {
            int i14 = a.f49023a[this.f49022b.ordinal()];
            if (i14 == 1) {
                String string = context.getString(R.string.workout_cardio_workout_label);
                string.getClass();
                return string;
            }
            if (i14 == 2) {
                String string2 = context.getString(R.string.workout_pilates_workout_label);
                string2.getClass();
                return string2;
            }
            if (i14 == 3) {
                String string3 = context.getString(R.string.lbl_mobility_workout);
                string3.getClass();
                return string3;
            }
            if (i14 != 4) {
                String string4 = context.getString(R.string.workout_strength_workout_label);
                string4.getClass();
                return string4;
            }
            String string5 = context.getString(R.string.workout_yoga_workout_label);
            string5.getClass();
            return string5;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> d() {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.INTERVAL;
            j0Var.f48232q = m52.g.NONE;
            j0Var.f48227l = this.f49022b == m52.k.f116761w ? m52.a.f116649e : m52.a.f116657m;
            if (v52.f.s()) {
                j0Var.f48231p = m52.j.f116746f;
            } else {
                j0Var.f48231p = m52.j.f116745e;
            }
            j0Var.f48229n = 10.0d;
            ArrayList arrayList = new ArrayList();
            arrayList.add(l52.n.c(j0Var));
            return arrayList;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        /* JADX INFO: renamed from: e */
        public final int getF49028b() {
            return 180;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> h() {
            ArrayList arrayList = new ArrayList();
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.REPEAT;
            j0Var.f48219e = 2;
            j0Var.f48227l = m52.a.f116654j;
            l52.f.a aVarB = l52.n.b(j0Var);
            Iterator it = ((ArrayList) a()).iterator();
            while (it.hasNext()) {
                l52.l.b(aVarB, (l52.e.b) it.next());
            }
            if (p13.x.k(m52.k.f116762x, m52.k.f116761w, m52.k.f116763y).contains(this.f49022b)) {
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
                j0Var2.f48217c = m52.d.REST;
                j0Var2.f48227l = m52.a.f116648d;
                l52.l.b(aVarB, l52.n.c(j0Var2));
            } else {
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var3 = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
                j0Var3.f48217c = m52.d.REST;
                j0Var3.f48227l = m52.a.f116649e;
                j0Var3.f48229n = 60.0d;
                j0Var3.f48232q = m52.g.NONE;
                l52.l.b(aVarB, l52.n.c(j0Var3));
            }
            arrayList.add(aVarB);
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$f;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$a;", "Ljava/io/Serializable;", "", "isMultiSportsWorkout", "<init>", "(Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f49024b = 0;

        public f(boolean z14) {
            super(z14);
        }

        @Override // f62.n
        public final List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> a() {
            return a1.a(new f21.g0(this, 13));
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final String c(Context context) {
            String string = context.getString(R.string.workout_rucking_default_name);
            string.getClass();
            return string;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        /* JADX INFO: renamed from: e */
        public final int getF49028b() {
            return 180;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final l52.m f() {
            return this.f49021a ? super.f() : l52.n.d(new o0(this, 6));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$g;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$a;", "Ljava/io/Serializable;", "Lm52/j;", "mMetricUnit", "mImperialUnit", "", "isMultiSportsWorkout", "<init>", "(Lm52/j;Lm52/j;Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g extends a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m52.j f49025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m52.j f49026c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(m52.j jVar, m52.j jVar2, boolean z14) {
            super(z14);
            jVar.getClass();
            jVar2.getClass();
            this.f49025b = jVar;
            this.f49026c = jVar2;
        }

        @Override // f62.n
        public final List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> a() {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.INTERVAL;
            j0Var.f48227l = m52.a.f116650f;
            f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
            j0Var.f48229n = lVar.y() ? k52.g.a(1.0d, qs.y.UNIT_DISTANCE_KILOMETER) : k52.g.a(1.0d, qs.y.UNIT_DISTANCE_MILE);
            if (lVar.y()) {
                j0Var.f48231p = this.f49025b;
            } else {
                j0Var.f48231p = this.f49026c;
            }
            j0Var.f48232q = m52.g.NONE;
            return p13.x.m(l52.n.c(j0Var));
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final String c(Context context) {
            bv.b.f21239a.getClass();
            bv.b.a();
            String string = context.getString(k1.f37122a.l0() ? R.string.lbl_pushing_run_speed_workout : R.string.workout_run_workout_label);
            string.getClass();
            return string;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        /* JADX INFO: renamed from: e */
        public final int getF49028b() {
            return 180;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$h;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$a;", "Ljava/io/Serializable;", "", "isMultiSportsWorkout", "<init>", "(Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h extends a implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f49027c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49028b;

        public h(boolean z14) {
            super(z14);
            this.f49028b = 180;
        }

        public static void i(l52.j jVar) {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.REST;
            j0Var.f48232q = m52.g.NONE;
            j0Var.f48227l = m52.a.f116648d;
            l52.l.c(jVar, j0Var);
        }

        @Override // f62.n
        public final List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> a() {
            return a1.a(new f21.g0(this, 14));
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final String c(Context context) {
            String string = context.getString(R.string.workout_strength_workout_label);
            string.getClass();
            return string;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getF49028b() {
            return this.f49028b;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final l52.m f() {
            return this.f49021a ? super.f() : l52.n.d(new y0(this, 0));
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> h() {
            return a1.a(new y0(this, 2));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$i;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$a;", "Ljava/io/Serializable;", "", "mPoolSize", "Lm52/j;", "mPoolSizeUnit", "", "isMultiSportsWorkout", "<init>", "(FLm52/j;Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i extends a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f49029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m52.j f49030c;

        public i(float f14, m52.j jVar, boolean z14) {
            super(z14);
            this.f49029b = f14;
            this.f49030c = jVar;
        }

        public static l52.f.b k() {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.REST;
            j0Var.f48227l = m52.a.f116648d;
            return l52.n.c(j0Var);
        }

        public static l52.f.b l() {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.REST;
            j0Var.f48227l = m52.a.f116655k;
            j0Var.f48229n = 15.0d;
            return l52.n.c(j0Var);
        }

        @Override // f62.n
        public final List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(i());
            arrayList.add(k());
            return arrayList;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final String c(Context context) {
            String string = context.getString(R.string.workout_pool_workout_label);
            string.getClass();
            return string;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> d() {
            ArrayList arrayList = new ArrayList();
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.INTERVAL;
            j0Var.f48227l = m52.a.f116650f;
            j0Var.j(this.f49029b, 20);
            j0Var.f48231p = this.f49030c;
            j0Var.X = m52.f.FREESTYLE;
            j0Var.f48232q = m52.g.NONE;
            arrayList.add(l52.n.c(j0Var));
            return arrayList;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        /* JADX INFO: renamed from: e */
        public final int getF49028b() {
            return 0;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final l52.m f() {
            if (this.f49021a) {
                return super.f();
            }
            l52.m mVarD = l52.n.d(new w2(19));
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.WARM_UP;
            m52.a aVar = m52.a.f116650f;
            j0Var.f48227l = aVar;
            float f14 = this.f49029b;
            j0Var.j(f14, 16);
            m52.j jVar = this.f49030c;
            j0Var.f48231p = jVar;
            m52.f fVar = m52.f.FREESTYLE;
            j0Var.X = fVar;
            l52.l.a(mVarD, l52.n.c(j0Var));
            l52.l.a(mVarD, k());
            ArrayList arrayList = new ArrayList();
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var2.f48217c = m52.d.REPEAT;
            j0Var2.f48219e = 8;
            j0Var2.f48227l = m52.a.f116654j;
            l52.f.a aVarB = l52.n.b(j0Var2);
            ArrayList arrayList2 = new ArrayList();
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var3 = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var3.f48217c = m52.d.MAIN;
            j0Var3.f48227l = aVar;
            j0Var3.j(f14, 4);
            j0Var3.f48231p = jVar;
            j0Var3.X = fVar;
            arrayList2.add(l52.n.c(j0Var3));
            arrayList2.add(l());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                l52.l.b(aVarB, (l52.e.b) it.next());
            }
            arrayList.add(aVarB);
            arrayList.add(k());
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                l52.l.a(mVarD, (l52.e.b) it3.next());
            }
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var4 = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var4.f48217c = m52.d.COOL_DOWN;
            j0Var4.f48227l = m52.a.f116650f;
            j0Var4.j(f14, 8);
            j0Var4.f48231p = jVar;
            j0Var4.X = m52.f.CHOICE;
            j0Var4.E = m52.g.SWIM_INSTRUCTION;
            j0Var4.F = x52.a.EASY.f189043a;
            l52.l.a(mVarD, l52.n.c(j0Var4));
            return mVarD;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> h() {
            ArrayList arrayList = new ArrayList();
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.REPEAT;
            j0Var.f48219e = 2;
            j0Var.f48227l = m52.a.f116654j;
            l52.f.a aVarB = l52.n.b(j0Var);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i());
            arrayList2.add(l());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                l52.l.b(aVarB, (l52.e.b) it.next());
            }
            arrayList.add(aVarB);
            arrayList.add(k());
            return arrayList;
        }

        public final l52.f.b i() {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.MAIN;
            j0Var.f48227l = m52.a.f116650f;
            j0Var.j(this.f49029b, 8);
            j0Var.f48231p = this.f49030c;
            j0Var.X = m52.f.FREESTYLE;
            return l52.n.c(j0Var);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$j;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$a;", "Ljava/io/Serializable;", "", "isMultiSportsWorkout", "<init>", "(Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j extends a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f49031b = 0;

        public j(boolean z14) {
            super(z14);
        }

        @Override // f62.n
        public final List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> a() {
            return a1.a(new f21.g0(this, 15));
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final String c(Context context) {
            String string = context.getString(R.string.workout_walk_workout_label);
            string.getClass();
            return string;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        /* JADX INFO: renamed from: e */
        public final int getF49028b() {
            return 180;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.a
        public final l52.m f() {
            return this.f49021a ? super.f() : l52.n.d(new o0(this, 7));
        }
    }

    public static final /* synthetic */ class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49032a;

        static {
            int[] iArr = new int[m52.k.values().length];
            try {
                iArr[m52.k.f116754n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m52.k.f116757q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m52.k.f116755o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m52.k.f116756p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m52.k.f116758r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m52.k.f116759t.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m52.k.B.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m52.k.f116760v.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m52.k.f116762x.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[m52.k.f116763y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[m52.k.f116761w.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[m52.k.f116764z.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f49032a = iArr;
        }
    }

    private k0() {
    }

    public static a a(m52.k kVar, double d14, m52.j jVar, boolean z14) {
        kVar.getClass();
        switch (k.f49032a[kVar.ordinal()]) {
            case 1:
                return new g(m52.j.f116746f, m52.j.f116745e, z14);
            case 2:
                return new j(z14);
            case 3:
                return new b(z14);
            case 4:
                return new c(z14);
            case 5:
                if (!Double.isNaN(d14)) {
                    return new i((float) d14, jVar, z14);
                }
                vb.h.s("poolSizeValue cannot be NaN and poolSizeUnit cannot be null. Developer, check the implementation.");
                return null;
            case 6:
                return new h(z14);
            case 7:
                return new f(z14);
            case 8:
            case 9:
            case 10:
            case 11:
                return new e(kVar, z14);
            case 12:
                return new d(z14);
            default:
                vb.h.s(am.j.m("Unsupported sport type: ", kVar.name(), ". Developer, check the implementation."));
                return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$a;", "Lf62/n;", "Ljava/io/Serializable;", "", "isMultiSportsWorkout", "<init>", "(Z)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a implements f62.n, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f49021a;

        static {
            new C0959a(null);
        }

        public a(boolean z14) {
            this.f49021a = z14;
        }

        public static l52.f.b b(m52.d dVar, m52.a aVar, m52.g gVar) {
            dVar.getClass();
            aVar.getClass();
            gVar.getClass();
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = dVar;
            j0Var.f48227l = aVar;
            j0Var.f48232q = gVar;
            return l52.n.c(j0Var);
        }

        public abstract String c(Context context);

        public List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> d() {
            return a();
        }

        /* JADX INFO: renamed from: e */
        public abstract int getF49028b();

        public l52.m f() {
            if (this.f49021a) {
                l52.m mVarD = l52.n.d(new w2(19));
                Iterator<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> it = d().iterator();
                while (it.hasNext()) {
                    l52.l.a(mVarD, it.next());
                }
                return mVarD;
            }
            l52.m mVarD2 = l52.n.d(new w2(19));
            l52.l.a(mVarD2, b(m52.d.WARM_UP, m52.a.f116648d, m52.g.NONE));
            Iterator<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> it3 = a().iterator();
            while (it3.hasNext()) {
                l52.l.a(mVarD2, it3.next());
            }
            l52.l.a(mVarD2, b(m52.d.COOL_DOWN, m52.a.f116648d, m52.g.NONE));
            return mVarD2;
        }

        public l52.f.b g() {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.RECOVERY;
            j0Var.f48227l = m52.a.f116649e;
            j0Var.f48229n = getF49028b();
            j0Var.f48232q = m52.g.NONE;
            return l52.n.c(j0Var);
        }

        public List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> h() {
            ArrayList arrayList = new ArrayList();
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
            j0Var.f48217c = m52.d.REPEAT;
            j0Var.f48219e = 2;
            j0Var.f48227l = m52.a.f116654j;
            l52.f.a aVarB = l52.n.b(j0Var);
            Iterator<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> it = a().iterator();
            while (it.hasNext()) {
                l52.l.b(aVarB, it.next());
            }
            l52.l.b(aVarB, g());
            arrayList.add(aVarB);
            return arrayList;
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$a$a;", "", "<init>", "()V", "", "FIRST_GROUP_INDEX", "I", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0959a {
            public /* synthetic */ C0959a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C0959a() {
            }
        }
    }
}
