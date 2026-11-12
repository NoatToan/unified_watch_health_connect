package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/f;", "Lcom/garmin/android/apps/connectmobile/b0;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends com.garmin.android.apps.connectmobile.b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f48979n = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f48980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f48981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f48982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f48983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f48984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f48985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public NumberPicker f48986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public GCMComplexTwoLineButton f48987m;

    public f() {
        super(R.layout.repeat_action_bottom_sheet_header, R.layout.repeat_action_bottom_sheet, false, false, false, 28, null);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f48983i = arguments != null ? arguments.getInt("MIN_VALUE") : 0;
        Bundle arguments2 = getArguments();
        this.f48984j = arguments2 != null ? arguments2.getInt("MAX_VALUE") : 0;
        Bundle arguments3 = getArguments();
        this.f48985k = arguments3 != null ? arguments3.getInt("DEFAULT_VALUE") : 0;
        Bundle arguments4 = getArguments();
        if (arguments4 != null && arguments4.containsKey("SKIP_LAST_REST_STEP")) {
            Bundle arguments5 = getArguments();
            this.f48981g = arguments5 != null ? Boolean.valueOf(arguments5.getBoolean("SKIP_LAST_REST_STEP")) : null;
        }
        Bundle arguments6 = getArguments();
        if (arguments6 == null || !arguments6.containsKey("STEP_TYPE_NAME")) {
            this.f48982h = getString(R.string.step_unit);
        } else {
            Bundle arguments7 = getArguments();
            this.f48982h = arguments7 != null ? arguments7.getString("STEP_TYPE_NAME") : null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        View viewFindViewById = view2.findViewById(R.id.create_activity_number_of_lengths_number_picker);
        viewFindViewById.getClass();
        NumberPicker numberPicker = (NumberPicker) viewFindViewById;
        this.f48986l = numberPicker;
        numberPicker.setDescendantFocusability(393216);
        NumberPicker numberPicker2 = this.f48986l;
        if (numberPicker2 == null) {
            p005kotlin.jvm.internal.s.m("numberPicker");
            throw null;
        }
        numberPicker2.setMinValue(this.f48983i);
        NumberPicker numberPicker3 = this.f48986l;
        if (numberPicker3 == null) {
            p005kotlin.jvm.internal.s.m("numberPicker");
            throw null;
        }
        numberPicker3.setMaxValue(this.f48984j);
        NumberPicker numberPicker4 = this.f48986l;
        if (numberPicker4 == null) {
            p005kotlin.jvm.internal.s.m("numberPicker");
            throw null;
        }
        numberPicker4.setValue(this.f48985k);
        View viewFindViewById2 = view2.findViewById(R.id.skip_last_rest_step_toggle_view);
        viewFindViewById2.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) viewFindViewById2;
        this.f48987m = gCMComplexTwoLineButton;
        if (this.f48981g == null) {
            gCMComplexTwoLineButton.setVisibility(8);
            return;
        }
        gCMComplexTwoLineButton.setVisibility(0);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f48987m;
        if (gCMComplexTwoLineButton2 == null) {
            p005kotlin.jvm.internal.s.m("skipLastRestStepView");
            throw null;
        }
        gCMComplexTwoLineButton2.f(true);
        int dimension = (int) getResources().getDimension(R.dimen.spacing_xxlarge);
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f48987m;
        if (gCMComplexTwoLineButton3 == null) {
            p005kotlin.jvm.internal.s.m("skipLastRestStepView");
            throw null;
        }
        gCMComplexTwoLineButton3.f47786f.setPadding(0, 0, dimension, 0);
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f48987m;
        if (gCMComplexTwoLineButton4 == null) {
            p005kotlin.jvm.internal.s.m("skipLastRestStepView");
            throw null;
        }
        gCMComplexTwoLineButton4.setEnabled(true);
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = this.f48987m;
        if (gCMComplexTwoLineButton5 == null) {
            p005kotlin.jvm.internal.s.m("skipLastRestStepView");
            throw null;
        }
        Boolean bool = this.f48981g;
        gCMComplexTwoLineButton5.g(bool != null ? bool.booleanValue() : false);
        String string = this.f48982h;
        if (string == null) {
            string = getString(R.string.workout_step_type_rest);
            string.getClass();
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = this.f48987m;
        if (gCMComplexTwoLineButton6 == null) {
            p005kotlin.jvm.internal.s.m("skipLastRestStepView");
            throw null;
        }
        gCMComplexTwoLineButton6.setButtonTopLabel(getString(R.string.lbl_workout_skip_last_step, string));
        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = this.f48987m;
        if (gCMComplexTwoLineButton7 != null) {
            gCMComplexTwoLineButton7.setButtonBottomLeftLabel(getString(R.string.msg_workout_skip_last_step_toggle, hb.a.i(string)));
        } else {
            p005kotlin.jvm.internal.s.m("skipLastRestStepView");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void v6(View view2) {
        View viewFindViewById = view2.findViewById(R.id.bottom_sheet_action_button);
        viewFindViewById.getClass();
        final int i14 = 0;
        v22.e.n(viewFindViewById, new e23.l(this) { // from class: f62.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.f f69283b;

            {
                this.f69283b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                Boolean boolValueOf;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.f fVar = this.f69283b;
                View view3 = (View) obj;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.f.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.f.f48979n;
                        view3.getClass();
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.b bVar = fVar.f48980f;
                        if (bVar != null) {
                            NumberPicker numberPicker = fVar.f48986l;
                            if (numberPicker == null) {
                                p005kotlin.jvm.internal.s.m("numberPicker");
                                throw null;
                            }
                            int value = numberPicker.getValue();
                            if (fVar.f48981g == null) {
                                boolValueOf = null;
                            } else {
                                GCMComplexTwoLineButton gCMComplexTwoLineButton = fVar.f48987m;
                                if (gCMComplexTwoLineButton == null) {
                                    p005kotlin.jvm.internal.s.m("skipLastRestStepView");
                                    throw null;
                                }
                                SwitchCompat switchCompat = gCMComplexTwoLineButton.f47791k;
                                boolValueOf = Boolean.valueOf(switchCompat != null && switchCompat.isChecked());
                            }
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa = bVar.f48929a.ga();
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.k kVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.k) bVar.f48930b;
                            ge1.b.T(v1.a(rVarGa), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.d0(rVarGa, kVar.f49230a, value, boolValueOf, !p005kotlin.jvm.internal.s.g(boolValueOf, kVar.f49231b), null), 3);
                        }
                        fVar.dismiss();
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.f.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.f.f48979n;
                        view3.getClass();
                        fVar.dismiss();
                        return Unit.INSTANCE;
                }
            }
        });
        View viewFindViewById2 = view2.findViewById(R.id.bottom_sheet_back_button);
        viewFindViewById2.getClass();
        final int i15 = 1;
        v22.e.n(viewFindViewById2, new e23.l(this) { // from class: f62.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.f f69283b;

            {
                this.f69283b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                Boolean boolValueOf;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.f fVar = this.f69283b;
                View view3 = (View) obj;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.f.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.f.f48979n;
                        view3.getClass();
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.b bVar = fVar.f48980f;
                        if (bVar != null) {
                            NumberPicker numberPicker = fVar.f48986l;
                            if (numberPicker == null) {
                                p005kotlin.jvm.internal.s.m("numberPicker");
                                throw null;
                            }
                            int value = numberPicker.getValue();
                            if (fVar.f48981g == null) {
                                boolValueOf = null;
                            } else {
                                GCMComplexTwoLineButton gCMComplexTwoLineButton = fVar.f48987m;
                                if (gCMComplexTwoLineButton == null) {
                                    p005kotlin.jvm.internal.s.m("skipLastRestStepView");
                                    throw null;
                                }
                                SwitchCompat switchCompat = gCMComplexTwoLineButton.f47791k;
                                boolValueOf = Boolean.valueOf(switchCompat != null && switchCompat.isChecked());
                            }
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa = bVar.f48929a.ga();
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.k kVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.k) bVar.f48930b;
                            ge1.b.T(v1.a(rVarGa), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.d0(rVarGa, kVar.f49230a, value, boolValueOf, !p005kotlin.jvm.internal.s.g(boolValueOf, kVar.f49231b), null), 3);
                        }
                        fVar.dismiss();
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.f.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.f.f48979n;
                        view3.getClass();
                        fVar.dismiss();
                        return Unit.INSTANCE;
                }
            }
        });
        viewFindViewById2.setVisibility(0);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/f$a;", "", "<init>", "()V", "", "EXTRA_MIN_VALUE", "Ljava/lang/String;", "EXTRA_MAX_VALUE", "EXTRA_DEFAULT_VALUE", "EXTRA_SKIP_LAST_REST_STEP", "EXTRA_STEP_TYPE_NAME", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
