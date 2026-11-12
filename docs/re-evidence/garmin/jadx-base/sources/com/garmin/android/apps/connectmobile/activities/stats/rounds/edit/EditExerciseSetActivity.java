package com.garmin.android.apps.connectmobile.activities.stats.rounds.edit;

import am.x0;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.EditExerciseSetActivity;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.repcounting.model.b;
import com.garmin.android.apps.connectmobile.repcounting.model.d;
import com.garmin.android.apps.connectmobile.repcounting.model.e;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import d53.u;
import d53.w;
import f12.l;
import java.io.Serializable;
import java.util.Locale;
import mt0.h0;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r22.a2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/rounds/edit/EditExerciseSetActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditExerciseSetActivity extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f29932e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f29933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sq.a f29934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sq.a f29935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.c f29936d;

    public final sq.a ca(d dVar, boolean z14) {
        if (dVar == null) {
            sq.a aVar = this.f29935c;
            if (aVar != null) {
                return aVar;
            }
            s.m("exerciseSet");
            throw null;
        }
        b bVar = new b();
        String str = dVar.f41102a;
        bVar.H(str);
        String str2 = dVar.f41106e;
        bVar.I((str == null || u.m(str, str2)) ? null : str2);
        bVar.M();
        b[] bVarArr = {bVar};
        sq.a aVar2 = this.f29935c;
        if (aVar2 == null) {
            s.m("exerciseSet");
            throw null;
        }
        sq.a aVarB = sq.a.b(aVar2, null, 7);
        e eVar = aVarB.f160521b;
        eVar.f41117g = dVar.f41107f;
        eVar.h0(bVarArr);
        if (!z14) {
            sq.a aVar3 = this.f29935c;
            if (aVar3 == null) {
                s.m("exerciseSet");
                throw null;
            }
            eVar.n0(aVar3.f160521b.Z());
        } else if (dVar.f41105d) {
            eVar.n0(-1L);
        } else {
            eVar.n0(null);
        }
        eVar.f41116f = str2;
        eVar.f41115e = str;
        eVar.j0(new DateTime());
        return aVarB;
    }

    public final void da(final sq.a aVar) {
        String string;
        String string2;
        String lowerCase;
        boolean z14;
        String strC1;
        Double D;
        this.f29935c = aVar;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.rest);
        e eVar = aVar.f160522c;
        e eVar2 = aVar.f160521b;
        Long lValueOf = (eVar == null || (D = eVar.D()) == null) ? null : Long.valueOf((long) D.doubleValue());
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            l3.f23124b.getClass();
            string = l3.a.c1(this, jLongValue);
        } else {
            string = null;
        }
        if (string == null || w.J(string)) {
            string = getString(R.string.activities_value_not_set);
        }
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(string);
        final int i14 = 0;
        gCMComplexTwoLineButton.setOnClickListener(new View.OnClickListener() { // from class: nq.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Double D2;
                int i15 = i14;
                final int i16 = 1;
                final int iDoubleValue = 0;
                final sq.a aVar2 = aVar;
                final EditExerciseSetActivity editExerciseSetActivity = this;
                switch (i15) {
                    case 0:
                        EditExerciseSetActivity.a aVar3 = EditExerciseSetActivity.f29932e;
                        com.garmin.android.apps.connectmobile.repcounting.model.e eVar3 = aVar2.f160522c;
                        if (eVar3 != null && (D2 = eVar3.D()) != null) {
                            iDoubleValue = (int) D2.doubleValue();
                        }
                        r22.x0 x0VarA = r22.x0.a.a(r22.x0.U0, Integer.valueOf(iDoubleValue), null, 6);
                        x0VarA.T = new a2.d() { // from class: nq.b
                            @Override // r22.a2.d
                            public final void i(String str, int i17, int i18, String str2, String str3, int i19) {
                                int i24 = i16;
                                EditExerciseSetActivity editExerciseSetActivity2 = editExerciseSetActivity;
                                sq.a aVar4 = aVar2;
                                switch (i24) {
                                    case 0:
                                        EditExerciseSetActivity.a aVar5 = EditExerciseSetActivity.f29932e;
                                        int i25 = (i17 * DateTimeConstants.SECONDS_PER_HOUR) + (i18 * 60) + i19;
                                        aVar4.f160521b.g0(i25 != 0 ? Double.valueOf(i25) : null);
                                        editExerciseSetActivity2.da(aVar4);
                                        break;
                                    case 1:
                                        EditExerciseSetActivity.a aVar6 = EditExerciseSetActivity.f29932e;
                                        int i26 = (i17 * DateTimeConstants.SECONDS_PER_HOUR) + (i18 * 60) + i19;
                                        com.garmin.android.apps.connectmobile.repcounting.model.e eVar4 = aVar4.f160522c;
                                        if (eVar4 == null) {
                                            eVar4 = new com.garmin.android.apps.connectmobile.repcounting.model.e();
                                            eVar4.k0(sq.b.REST.f160525a);
                                        }
                                        eVar4.g0(i26 != 0 ? Double.valueOf(i26) : null);
                                        editExerciseSetActivity2.da(sq.a.b(aVar4, eVar4, 3));
                                        break;
                                    default:
                                        EditExerciseSetActivity.a aVar7 = EditExerciseSetActivity.f29932e;
                                        aVar4.f160521b.i0(Long.valueOf(i17));
                                        editExerciseSetActivity2.da(aVar4);
                                        break;
                                }
                            }
                        };
                        x0VarA.show(editExerciseSetActivity.getSupportFragmentManager(), "");
                        break;
                    case 1:
                        EditExerciseSetActivity.a aVar4 = EditExerciseSetActivity.f29932e;
                        Double D3 = aVar2.f160521b.D();
                        r22.x0 x0VarA2 = r22.x0.a.a(r22.x0.U0, Integer.valueOf(D3 != null ? (int) D3.doubleValue() : 0), new r22.x0.b(0, 0, 1, 3, null), 4);
                        x0VarA2.T = new a2.d() { // from class: nq.b
                            @Override // r22.a2.d
                            public final void i(String str, int i17, int i18, String str2, String str3, int i19) {
                                int i24 = iDoubleValue;
                                EditExerciseSetActivity editExerciseSetActivity2 = editExerciseSetActivity;
                                sq.a aVar5 = aVar2;
                                switch (i24) {
                                    case 0:
                                        EditExerciseSetActivity.a aVar6 = EditExerciseSetActivity.f29932e;
                                        int i25 = (i17 * DateTimeConstants.SECONDS_PER_HOUR) + (i18 * 60) + i19;
                                        aVar5.f160521b.g0(i25 != 0 ? Double.valueOf(i25) : null);
                                        editExerciseSetActivity2.da(aVar5);
                                        break;
                                    case 1:
                                        EditExerciseSetActivity.a aVar7 = EditExerciseSetActivity.f29932e;
                                        int i26 = (i17 * DateTimeConstants.SECONDS_PER_HOUR) + (i18 * 60) + i19;
                                        com.garmin.android.apps.connectmobile.repcounting.model.e eVar4 = aVar5.f160522c;
                                        if (eVar4 == null) {
                                            eVar4 = new com.garmin.android.apps.connectmobile.repcounting.model.e();
                                            eVar4.k0(sq.b.REST.f160525a);
                                        }
                                        eVar4.g0(i26 != 0 ? Double.valueOf(i26) : null);
                                        editExerciseSetActivity2.da(sq.a.b(aVar5, eVar4, 3));
                                        break;
                                    default:
                                        EditExerciseSetActivity.a aVar8 = EditExerciseSetActivity.f29932e;
                                        aVar5.f160521b.i0(Long.valueOf(i17));
                                        editExerciseSetActivity2.da(aVar5);
                                        break;
                                }
                            }
                        };
                        x0VarA2.show(editExerciseSetActivity.getSupportFragmentManager(), "");
                        break;
                    default:
                        EditExerciseSetActivity.a aVar5 = EditExerciseSetActivity.f29932e;
                        Long lH = aVar2.f160521b.H();
                        long jLongValue2 = 1;
                        if (lH != null && lH.longValue() >= 1) {
                            jLongValue2 = lH.longValue() > 99 ? 99L : lH.longValue();
                        }
                        oq.e.S0.getClass();
                        Bundle bundle = new Bundle(1);
                        oq.e eVar4 = new oq.e();
                        bundle.putLong("reps_count", jLongValue2);
                        eVar4.setArguments(bundle);
                        final int i17 = 2;
                        eVar4.T = new a2.d() { // from class: nq.b
                            @Override // r22.a2.d
                            public final void i(String str, int i18, int i19, String str2, String str3, int i110) {
                                int i24 = i17;
                                EditExerciseSetActivity editExerciseSetActivity2 = editExerciseSetActivity;
                                sq.a aVar6 = aVar2;
                                switch (i24) {
                                    case 0:
                                        EditExerciseSetActivity.a aVar7 = EditExerciseSetActivity.f29932e;
                                        int i25 = (i18 * DateTimeConstants.SECONDS_PER_HOUR) + (i19 * 60) + i110;
                                        aVar6.f160521b.g0(i25 != 0 ? Double.valueOf(i25) : null);
                                        editExerciseSetActivity2.da(aVar6);
                                        break;
                                    case 1:
                                        EditExerciseSetActivity.a aVar8 = EditExerciseSetActivity.f29932e;
                                        int i26 = (i18 * DateTimeConstants.SECONDS_PER_HOUR) + (i19 * 60) + i110;
                                        com.garmin.android.apps.connectmobile.repcounting.model.e eVar5 = aVar6.f160522c;
                                        if (eVar5 == null) {
                                            eVar5 = new com.garmin.android.apps.connectmobile.repcounting.model.e();
                                            eVar5.k0(sq.b.REST.f160525a);
                                        }
                                        eVar5.g0(i26 != 0 ? Double.valueOf(i26) : null);
                                        editExerciseSetActivity2.da(sq.a.b(aVar6, eVar5, 3));
                                        break;
                                    default:
                                        EditExerciseSetActivity.a aVar9 = EditExerciseSetActivity.f29932e;
                                        aVar6.f160521b.i0(Long.valueOf(i18));
                                        editExerciseSetActivity2.da(aVar6);
                                        break;
                                }
                            }
                        };
                        eVar4.show(editExerciseSetActivity.getSupportFragmentManager(), "");
                        break;
                }
            }
        });
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) findViewById(R.id.exercise);
        String str = eVar2.f41117g;
        gCMComplexTwoLineButton2.setButtonBottomLeftLabel((str == null || !(w.J(str) ^ true)) ? getString(R.string.strength_training_choose_an_exercise) : eVar2.f41117g);
        gCMComplexTwoLineButton2.setOnClickListener(new h0(this, 26));
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = (GCMComplexTwoLineButton) findViewById(R.id.duration);
        Double D2 = eVar2.D();
        Long lValueOf2 = D2 != null ? Long.valueOf((long) D2.doubleValue()) : null;
        if (lValueOf2 != null) {
            long jLongValue2 = lValueOf2.longValue();
            l3.f23124b.getClass();
            string2 = l3.a.c1(this, jLongValue2);
        } else {
            string2 = null;
        }
        if (string2 == null || w.J(string2)) {
            string2 = getString(R.string.activities_value_not_set);
        }
        gCMComplexTwoLineButton3.setButtonBottomLeftLabel(string2);
        final int i15 = 1;
        gCMComplexTwoLineButton3.setOnClickListener(new View.OnClickListener() { // from class: nq.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Double D3;
                int i16 = i15;
                final int i17 = 1;
                final int iDoubleValue = 0;
                final sq.a aVar2 = aVar;
                final EditExerciseSetActivity editExerciseSetActivity = this;
                switch (i16) {
                    case 0:
                        EditExerciseSetActivity.a aVar3 = EditExerciseSetActivity.f29932e;
                        com.garmin.android.apps.connectmobile.repcounting.model.e eVar3 = aVar2.f160522c;
                        if (eVar3 != null && (D3 = eVar3.D()) != null) {
                            iDoubleValue = (int) D3.doubleValue();
                        }
                        r22.x0 x0VarA = r22.x0.a.a(r22.x0.U0, Integer.valueOf(iDoubleValue), null, 6);
                        x0VarA.T = new a2.d() { // from class: nq.b
                            @Override // r22.a2.d
                            public final void i(String str2, int i18, int i19, String str3, String str4, int i110) {
                                int i24 = i17;
                                EditExerciseSetActivity editExerciseSetActivity2 = editExerciseSetActivity;
                                sq.a aVar6 = aVar2;
                                switch (i24) {
                                    case 0:
                                        EditExerciseSetActivity.a aVar7 = EditExerciseSetActivity.f29932e;
                                        int i25 = (i18 * DateTimeConstants.SECONDS_PER_HOUR) + (i19 * 60) + i110;
                                        aVar6.f160521b.g0(i25 != 0 ? Double.valueOf(i25) : null);
                                        editExerciseSetActivity2.da(aVar6);
                                        break;
                                    case 1:
                                        EditExerciseSetActivity.a aVar8 = EditExerciseSetActivity.f29932e;
                                        int i26 = (i18 * DateTimeConstants.SECONDS_PER_HOUR) + (i19 * 60) + i110;
                                        com.garmin.android.apps.connectmobile.repcounting.model.e eVar5 = aVar6.f160522c;
                                        if (eVar5 == null) {
                                            eVar5 = new com.garmin.android.apps.connectmobile.repcounting.model.e();
                                            eVar5.k0(sq.b.REST.f160525a);
                                        }
                                        eVar5.g0(i26 != 0 ? Double.valueOf(i26) : null);
                                        editExerciseSetActivity2.da(sq.a.b(aVar6, eVar5, 3));
                                        break;
                                    default:
                                        EditExerciseSetActivity.a aVar9 = EditExerciseSetActivity.f29932e;
                                        aVar6.f160521b.i0(Long.valueOf(i18));
                                        editExerciseSetActivity2.da(aVar6);
                                        break;
                                }
                            }
                        };
                        x0VarA.show(editExerciseSetActivity.getSupportFragmentManager(), "");
                        break;
                    case 1:
                        EditExerciseSetActivity.a aVar4 = EditExerciseSetActivity.f29932e;
                        Double D4 = aVar2.f160521b.D();
                        r22.x0 x0VarA2 = r22.x0.a.a(r22.x0.U0, Integer.valueOf(D4 != null ? (int) D4.doubleValue() : 0), new r22.x0.b(0, 0, 1, 3, null), 4);
                        x0VarA2.T = new a2.d() { // from class: nq.b
                            @Override // r22.a2.d
                            public final void i(String str2, int i18, int i19, String str3, String str4, int i110) {
                                int i24 = iDoubleValue;
                                EditExerciseSetActivity editExerciseSetActivity2 = editExerciseSetActivity;
                                sq.a aVar6 = aVar2;
                                switch (i24) {
                                    case 0:
                                        EditExerciseSetActivity.a aVar7 = EditExerciseSetActivity.f29932e;
                                        int i25 = (i18 * DateTimeConstants.SECONDS_PER_HOUR) + (i19 * 60) + i110;
                                        aVar6.f160521b.g0(i25 != 0 ? Double.valueOf(i25) : null);
                                        editExerciseSetActivity2.da(aVar6);
                                        break;
                                    case 1:
                                        EditExerciseSetActivity.a aVar8 = EditExerciseSetActivity.f29932e;
                                        int i26 = (i18 * DateTimeConstants.SECONDS_PER_HOUR) + (i19 * 60) + i110;
                                        com.garmin.android.apps.connectmobile.repcounting.model.e eVar5 = aVar6.f160522c;
                                        if (eVar5 == null) {
                                            eVar5 = new com.garmin.android.apps.connectmobile.repcounting.model.e();
                                            eVar5.k0(sq.b.REST.f160525a);
                                        }
                                        eVar5.g0(i26 != 0 ? Double.valueOf(i26) : null);
                                        editExerciseSetActivity2.da(sq.a.b(aVar6, eVar5, 3));
                                        break;
                                    default:
                                        EditExerciseSetActivity.a aVar9 = EditExerciseSetActivity.f29932e;
                                        aVar6.f160521b.i0(Long.valueOf(i18));
                                        editExerciseSetActivity2.da(aVar6);
                                        break;
                                }
                            }
                        };
                        x0VarA2.show(editExerciseSetActivity.getSupportFragmentManager(), "");
                        break;
                    default:
                        EditExerciseSetActivity.a aVar5 = EditExerciseSetActivity.f29932e;
                        Long lH = aVar2.f160521b.H();
                        long jLongValue3 = 1;
                        if (lH != null && lH.longValue() >= 1) {
                            jLongValue3 = lH.longValue() > 99 ? 99L : lH.longValue();
                        }
                        oq.e.S0.getClass();
                        Bundle bundle = new Bundle(1);
                        oq.e eVar4 = new oq.e();
                        bundle.putLong("reps_count", jLongValue3);
                        eVar4.setArguments(bundle);
                        final int i18 = 2;
                        eVar4.T = new a2.d() { // from class: nq.b
                            @Override // r22.a2.d
                            public final void i(String str2, int i19, int i110, String str3, String str4, int i111) {
                                int i24 = i18;
                                EditExerciseSetActivity editExerciseSetActivity2 = editExerciseSetActivity;
                                sq.a aVar6 = aVar2;
                                switch (i24) {
                                    case 0:
                                        EditExerciseSetActivity.a aVar7 = EditExerciseSetActivity.f29932e;
                                        int i25 = (i19 * DateTimeConstants.SECONDS_PER_HOUR) + (i110 * 60) + i111;
                                        aVar6.f160521b.g0(i25 != 0 ? Double.valueOf(i25) : null);
                                        editExerciseSetActivity2.da(aVar6);
                                        break;
                                    case 1:
                                        EditExerciseSetActivity.a aVar8 = EditExerciseSetActivity.f29932e;
                                        int i26 = (i19 * DateTimeConstants.SECONDS_PER_HOUR) + (i110 * 60) + i111;
                                        com.garmin.android.apps.connectmobile.repcounting.model.e eVar5 = aVar6.f160522c;
                                        if (eVar5 == null) {
                                            eVar5 = new com.garmin.android.apps.connectmobile.repcounting.model.e();
                                            eVar5.k0(sq.b.REST.f160525a);
                                        }
                                        eVar5.g0(i26 != 0 ? Double.valueOf(i26) : null);
                                        editExerciseSetActivity2.da(sq.a.b(aVar6, eVar5, 3));
                                        break;
                                    default:
                                        EditExerciseSetActivity.a aVar9 = EditExerciseSetActivity.f29932e;
                                        aVar6.f160521b.i0(Long.valueOf(i19));
                                        editExerciseSetActivity2.da(aVar6);
                                        break;
                                }
                            }
                        };
                        eVar4.show(editExerciseSetActivity.getSupportFragmentManager(), "");
                        break;
                }
            }
        });
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = (GCMComplexTwoLineButton) findViewById(R.id.reps);
        Long lH = eVar2.H();
        if ((lH != null && lH.longValue() == -2) || lH == null || lH.longValue() == 0) {
            lowerCase = getString(R.string.activities_value_not_set);
        } else {
            l3.a aVar2 = l3.f23124b;
            double dLongValue = lH.longValue();
            aVar2.getClass();
            lowerCase = l3.a.Q0(dLongValue, this, false).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        lowerCase.getClass();
        gCMComplexTwoLineButton4.setButtonBottomLeftLabel(lowerCase);
        final int i16 = 2;
        gCMComplexTwoLineButton4.setOnClickListener(new View.OnClickListener() { // from class: nq.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Double D3;
                int i17 = i16;
                final int i18 = 1;
                final int iDoubleValue = 0;
                final sq.a aVar3 = aVar;
                final EditExerciseSetActivity editExerciseSetActivity = this;
                switch (i17) {
                    case 0:
                        EditExerciseSetActivity.a aVar4 = EditExerciseSetActivity.f29932e;
                        com.garmin.android.apps.connectmobile.repcounting.model.e eVar3 = aVar3.f160522c;
                        if (eVar3 != null && (D3 = eVar3.D()) != null) {
                            iDoubleValue = (int) D3.doubleValue();
                        }
                        r22.x0 x0VarA = r22.x0.a.a(r22.x0.U0, Integer.valueOf(iDoubleValue), null, 6);
                        x0VarA.T = new a2.d() { // from class: nq.b
                            @Override // r22.a2.d
                            public final void i(String str2, int i19, int i110, String str3, String str4, int i111) {
                                int i24 = i18;
                                EditExerciseSetActivity editExerciseSetActivity2 = editExerciseSetActivity;
                                sq.a aVar6 = aVar3;
                                switch (i24) {
                                    case 0:
                                        EditExerciseSetActivity.a aVar7 = EditExerciseSetActivity.f29932e;
                                        int i25 = (i19 * DateTimeConstants.SECONDS_PER_HOUR) + (i110 * 60) + i111;
                                        aVar6.f160521b.g0(i25 != 0 ? Double.valueOf(i25) : null);
                                        editExerciseSetActivity2.da(aVar6);
                                        break;
                                    case 1:
                                        EditExerciseSetActivity.a aVar8 = EditExerciseSetActivity.f29932e;
                                        int i26 = (i19 * DateTimeConstants.SECONDS_PER_HOUR) + (i110 * 60) + i111;
                                        com.garmin.android.apps.connectmobile.repcounting.model.e eVar5 = aVar6.f160522c;
                                        if (eVar5 == null) {
                                            eVar5 = new com.garmin.android.apps.connectmobile.repcounting.model.e();
                                            eVar5.k0(sq.b.REST.f160525a);
                                        }
                                        eVar5.g0(i26 != 0 ? Double.valueOf(i26) : null);
                                        editExerciseSetActivity2.da(sq.a.b(aVar6, eVar5, 3));
                                        break;
                                    default:
                                        EditExerciseSetActivity.a aVar9 = EditExerciseSetActivity.f29932e;
                                        aVar6.f160521b.i0(Long.valueOf(i19));
                                        editExerciseSetActivity2.da(aVar6);
                                        break;
                                }
                            }
                        };
                        x0VarA.show(editExerciseSetActivity.getSupportFragmentManager(), "");
                        break;
                    case 1:
                        EditExerciseSetActivity.a aVar5 = EditExerciseSetActivity.f29932e;
                        Double D4 = aVar3.f160521b.D();
                        r22.x0 x0VarA2 = r22.x0.a.a(r22.x0.U0, Integer.valueOf(D4 != null ? (int) D4.doubleValue() : 0), new r22.x0.b(0, 0, 1, 3, null), 4);
                        x0VarA2.T = new a2.d() { // from class: nq.b
                            @Override // r22.a2.d
                            public final void i(String str2, int i19, int i110, String str3, String str4, int i111) {
                                int i24 = iDoubleValue;
                                EditExerciseSetActivity editExerciseSetActivity2 = editExerciseSetActivity;
                                sq.a aVar6 = aVar3;
                                switch (i24) {
                                    case 0:
                                        EditExerciseSetActivity.a aVar7 = EditExerciseSetActivity.f29932e;
                                        int i25 = (i19 * DateTimeConstants.SECONDS_PER_HOUR) + (i110 * 60) + i111;
                                        aVar6.f160521b.g0(i25 != 0 ? Double.valueOf(i25) : null);
                                        editExerciseSetActivity2.da(aVar6);
                                        break;
                                    case 1:
                                        EditExerciseSetActivity.a aVar8 = EditExerciseSetActivity.f29932e;
                                        int i26 = (i19 * DateTimeConstants.SECONDS_PER_HOUR) + (i110 * 60) + i111;
                                        com.garmin.android.apps.connectmobile.repcounting.model.e eVar5 = aVar6.f160522c;
                                        if (eVar5 == null) {
                                            eVar5 = new com.garmin.android.apps.connectmobile.repcounting.model.e();
                                            eVar5.k0(sq.b.REST.f160525a);
                                        }
                                        eVar5.g0(i26 != 0 ? Double.valueOf(i26) : null);
                                        editExerciseSetActivity2.da(sq.a.b(aVar6, eVar5, 3));
                                        break;
                                    default:
                                        EditExerciseSetActivity.a aVar9 = EditExerciseSetActivity.f29932e;
                                        aVar6.f160521b.i0(Long.valueOf(i19));
                                        editExerciseSetActivity2.da(aVar6);
                                        break;
                                }
                            }
                        };
                        x0VarA2.show(editExerciseSetActivity.getSupportFragmentManager(), "");
                        break;
                    default:
                        EditExerciseSetActivity.a aVar6 = EditExerciseSetActivity.f29932e;
                        Long lH2 = aVar3.f160521b.H();
                        long jLongValue3 = 1;
                        if (lH2 != null && lH2.longValue() >= 1) {
                            jLongValue3 = lH2.longValue() > 99 ? 99L : lH2.longValue();
                        }
                        oq.e.S0.getClass();
                        Bundle bundle = new Bundle(1);
                        oq.e eVar4 = new oq.e();
                        bundle.putLong("reps_count", jLongValue3);
                        eVar4.setArguments(bundle);
                        final int i19 = 2;
                        eVar4.T = new a2.d() { // from class: nq.b
                            @Override // r22.a2.d
                            public final void i(String str2, int i110, int i111, String str3, String str4, int i112) {
                                int i24 = i19;
                                EditExerciseSetActivity editExerciseSetActivity2 = editExerciseSetActivity;
                                sq.a aVar7 = aVar3;
                                switch (i24) {
                                    case 0:
                                        EditExerciseSetActivity.a aVar8 = EditExerciseSetActivity.f29932e;
                                        int i25 = (i110 * DateTimeConstants.SECONDS_PER_HOUR) + (i111 * 60) + i112;
                                        aVar7.f160521b.g0(i25 != 0 ? Double.valueOf(i25) : null);
                                        editExerciseSetActivity2.da(aVar7);
                                        break;
                                    case 1:
                                        EditExerciseSetActivity.a aVar9 = EditExerciseSetActivity.f29932e;
                                        int i26 = (i110 * DateTimeConstants.SECONDS_PER_HOUR) + (i111 * 60) + i112;
                                        com.garmin.android.apps.connectmobile.repcounting.model.e eVar5 = aVar7.f160522c;
                                        if (eVar5 == null) {
                                            eVar5 = new com.garmin.android.apps.connectmobile.repcounting.model.e();
                                            eVar5.k0(sq.b.REST.f160525a);
                                        }
                                        eVar5.g0(i26 != 0 ? Double.valueOf(i26) : null);
                                        editExerciseSetActivity2.da(sq.a.b(aVar7, eVar5, 3));
                                        break;
                                    default:
                                        EditExerciseSetActivity.a aVar10 = EditExerciseSetActivity.f29932e;
                                        aVar7.f160521b.i0(Long.valueOf(i110));
                                        editExerciseSetActivity2.da(aVar7);
                                        break;
                                }
                            }
                        };
                        eVar4.show(editExerciseSetActivity.getSupportFragmentManager(), "");
                        break;
                }
            }
        });
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = (GCMComplexTwoLineButton) findViewById(R.id.weight);
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        Long lZ = eVar2.Z();
        if (lZ != null && lZ.longValue() == -1) {
            String str2 = eVar2.f41115e;
            String str3 = eVar2.f41116f;
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f29936d;
            if (cVar == null) {
                s.m("exerciseList");
                throw null;
            }
            if (cVar.H(str2, str3)) {
                strC1 = getString(R.string.strength_training_body);
            } else if (lZ.longValue() > 0) {
                z14 = zY;
                strC1 = l3.a.C1(l3.f23124b, this, lZ.longValue() / 1000.0d, z14, false, null, 56);
            } else {
                strC1 = getString(R.string.activities_value_not_set);
            }
            z14 = zY;
        } else if ((lZ != null && lZ.longValue() == -2) || lZ == null) {
            z14 = zY;
            String str4 = eVar2.f41115e;
            String str5 = eVar2.f41116f;
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = this.f29936d;
            if (cVar2 == null) {
                s.m("exerciseList");
                throw null;
            }
            strC1 = cVar2.H(str4, str5) ? getString(R.string.strength_training_body) : getString(R.string.activities_value_not_set);
        } else {
            z14 = zY;
            strC1 = l3.a.C1(l3.f23124b, this, lZ.longValue() / 1000.0d, z14, false, null, 56);
        }
        strC1.getClass();
        gCMComplexTwoLineButton5.setButtonBottomLeftLabel(strC1);
        gCMComplexTwoLineButton5.setOnClickListener(new hb1.c(this, aVar, z14, 2));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Parcelable parcelable;
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            if (i14 == 1001 && intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) intent.getParcelableExtra("RESULT_SELECTED_EXERCISE", d.class);
                } else {
                    Parcelable parcelableExtra = intent.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                    parcelable = (d) (parcelableExtra instanceof d ? parcelableExtra : null);
                }
                sq.a aVarCa = ca((d) parcelable, true);
                this.f29935c = aVarCa;
                da(aVarCa);
                return;
            }
            if (i14 != 50505 || intent == null) {
                return;
            }
            double doubleExtra = intent.getDoubleExtra("weight", -1.0d);
            sq.a aVar = this.f29935c;
            if (aVar == null) {
                s.m("exerciseSet");
                throw null;
            }
            aVar.f160521b.n0(doubleExtra > 0.0d ? Long.valueOf((long) (doubleExtra * 1000.0d)) : -1L);
            String stringExtra = intent.getStringExtra("exerciseCategoryKey");
            String stringExtra2 = intent.getStringExtra("exerciseKey");
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f29936d;
            if (cVar == null) {
                s.m("exerciseList");
                throw null;
            }
            sq.a aVarCa2 = ca(cVar.D(stringExtra, stringExtra2), false);
            this.f29935c = aVarCa2;
            da(aVarCa2);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        sq.a aVar = this.f29935c;
        if (aVar == null) {
            s.m("exerciseSet");
            throw null;
        }
        sq.a aVar2 = this.f29934b;
        if (aVar2 == null) {
            s.m("originalExerciseSet");
            throw null;
        }
        if (!aVar.equals(aVar2)) {
            Intent intent = new Intent();
            l2.a aVar3 = l2.f37135b;
            sq.a aVar4 = this.f29935c;
            if (aVar4 == null) {
                s.m("exerciseSet");
                throw null;
            }
            com.airbnb.lottie.animation.keyframe.a.q(aVar3, intent, h7.c.a(new p("EXTRA_EXERCISE_SET", aVar4)));
            setResult(-1, intent);
        }
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializable;
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_edit_exercise_set);
        initActionBar(true, R.string.activities_edit_exercise_title);
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (bundleA == null) {
            return;
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            serializable = bundleA.getSerializable("GCM_extra_activity_type", x0.class);
        } else {
            Serializable serializable2 = bundleA.getSerializable("GCM_extra_activity_type");
            if (!(serializable2 instanceof x0)) {
                serializable2 = null;
            }
            serializable = (x0) serializable2;
        }
        serializable.getClass();
        this.f29933a = (x0) serializable;
        if (i14 >= 33) {
            parcelable = (Parcelable) bundleA.getParcelable("EXTRA_EXERCISE_SET", sq.a.class);
        } else {
            Parcelable parcelable3 = bundleA.getParcelable("EXTRA_EXERCISE_SET");
            if (!(parcelable3 instanceof sq.a)) {
                parcelable3 = null;
            }
            parcelable = (sq.a) parcelable3;
        }
        sq.a aVar2 = (sq.a) parcelable;
        if (aVar2 == null) {
            return;
        }
        this.f29934b = aVar2;
        if (i14 >= 33) {
            parcelable2 = (Parcelable) bundleA.getParcelable("EXTRA_EXERCISE_LIST", com.garmin.android.apps.connectmobile.repcounting.model.c.class);
        } else {
            Parcelable parcelable4 = bundleA.getParcelable("EXTRA_EXERCISE_LIST");
            if (!(parcelable4 instanceof com.garmin.android.apps.connectmobile.repcounting.model.c)) {
                parcelable4 = null;
            }
            parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcelable4;
        }
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcelable2;
        if (cVar == null) {
            return;
        }
        this.f29936d = cVar;
        sq.a aVar3 = this.f29934b;
        if (aVar3 == null) {
            s.m("originalExerciseSet");
            throw null;
        }
        int i15 = aVar3.f160520a;
        e eVarC = aVar3.f160521b.C();
        sq.a aVar4 = this.f29934b;
        if (aVar4 == null) {
            s.m("originalExerciseSet");
            throw null;
        }
        e eVar = aVar4.f160522c;
        sq.a aVar5 = new sq.a(i15, eVarC, eVar != null ? eVar.C() : null);
        this.f29935c = aVar5;
        da(aVar5);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/rounds/edit/EditExerciseSetActivity$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
