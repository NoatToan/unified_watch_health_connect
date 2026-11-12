package com.garmin.android.apps.connectmobile.activities.stats;

import am.x0;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import aq.n0;
import aq.u0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectActivity;
import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import com.garmin.android.apps.connectmobile.repcounting.model.d;
import com.garmin.android.apps.connectmobile.repcounting.model.e;
import e23.l;
import fw.p;
import java.util.ArrayList;
import java.util.Arrays;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/EditExercisesMultiSelectActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditExercisesMultiSelectActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29784b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditExercisesMultiSelectViewModel f29785a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29786a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29786a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f29787a;

        public c(l lVar) {
            lVar.getClass();
            this.f29787a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f29787a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29787a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializable;
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        ExerciseSetsDTO exerciseSetsDTO;
        e[] eVarArr;
        super.onCreate(bundle);
        setContentView(R.layout.edit_exercises_3_0);
        Bundle extras = getIntent().getExtras();
        long j8 = extras != null ? extras.getLong("EXTRA_ACTIVITY_ID") : 0L;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            serializable = extras != null ? extras.getSerializable("EXTRA_ACTIVITY_TYPE", x0.class) : null;
        } else {
            Object serializable2 = extras != null ? extras.getSerializable("EXTRA_ACTIVITY_TYPE") : null;
            if (!(serializable2 instanceof x0)) {
                serializable2 = null;
            }
            serializable = (x0) serializable2;
        }
        x0 x0Var = (x0) serializable;
        if (i14 >= 33) {
            parcelable = extras != null ? (Parcelable) extras.getParcelable("EXTRA_EXERCISE_SETS", ExerciseSetsDTO.class) : null;
        } else {
            Parcelable parcelable4 = extras != null ? extras.getParcelable("EXTRA_EXERCISE_SETS") : null;
            if (!(parcelable4 instanceof ExerciseSetsDTO)) {
                parcelable4 = null;
            }
            parcelable = (ExerciseSetsDTO) parcelable4;
        }
        ExerciseSetsDTO exerciseSetsDTO2 = (ExerciseSetsDTO) parcelable;
        if (i14 >= 33) {
            parcelable2 = extras != null ? (Parcelable) extras.getParcelable("EXTRA_EXERCISE_LIST", com.garmin.android.apps.connectmobile.repcounting.model.c.class) : null;
        } else {
            Parcelable parcelable5 = extras != null ? extras.getParcelable("EXTRA_EXERCISE_LIST") : null;
            if (!(parcelable5 instanceof com.garmin.android.apps.connectmobile.repcounting.model.c)) {
                parcelable5 = null;
            }
            parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcelable5;
        }
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcelable2;
        if (i14 >= 33) {
            parcelable3 = extras != null ? (Parcelable) extras.getParcelable("EXTRA_ADDED_EXERCISE", d.class) : null;
        } else {
            Parcelable parcelable6 = extras != null ? extras.getParcelable("EXTRA_ADDED_EXERCISE") : null;
            if (!(parcelable6 instanceof d)) {
                parcelable6 = null;
            }
            parcelable3 = (d) parcelable6;
        }
        this.f29785a = (EditExercisesMultiSelectViewModel) new x1(this, new EditExercisesMultiSelectViewModel.b(j8, x0Var, exerciseSetsDTO2, cVar, (d) parcelable3)).b(s0.f105811a.b(EditExercisesMultiSelectViewModel.class));
        initActionBar(getString(R.string.strength_training_edit_exercise_sets), 2);
        EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModel = this.f29785a;
        if (editExercisesMultiSelectViewModel == null) {
            s.m("viewModel");
            throw null;
        }
        final int i15 = 2;
        dh.b.L(editExercisesMultiSelectViewModel.f29797i, this, new c(new l(this) { // from class: aq.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditExercisesMultiSelectActivity f12017b;

            {
                this.f12017b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                final EditExercisesMultiSelectActivity editExercisesMultiSelectActivity = this.f12017b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                        EditExercisesMultiSelectActivity.a aVar = EditExercisesMultiSelectActivity.f29784b;
                        int i17 = EditExercisesMultiSelectActivity.b.f29786a[g3Var.f35300a.ordinal()];
                        final int i18 = 1;
                        if (i17 == 1) {
                            editExercisesMultiSelectActivity.showProgressOverlay();
                        } else if (i17 == 2) {
                            Intent intent = new Intent();
                            intent.putExtra("EXTRA_EXERCISE_SETS", (Parcelable) g3Var.f35301b);
                            editExercisesMultiSelectActivity.setResult(-1, intent);
                            editExercisesMultiSelectActivity.finish();
                        } else {
                            if (i17 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            editExercisesMultiSelectActivity.hideProgressOverlay();
                            Exception exc = g3Var.f35303d;
                            if (exc instanceof EditExercisesMultiSelectViewModel.NoNetworkAvailableException) {
                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(editExercisesMultiSelectActivity);
                                aVar2.setTitle(editExercisesMultiSelectActivity.getString(R.string.common_network_reachability_error));
                                aVar2.setMessage(editExercisesMultiSelectActivity.getString(R.string.common_no_internet_save_error_msg));
                                aVar2.setCancelable(true);
                                final int i19 = 0;
                                aVar2.setPositiveButton(editExercisesMultiSelectActivity.getString(R.string.lbl_don_t_save), new DialogInterface.OnClickListener() { // from class: aq.k0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i24) {
                                        int i25 = i19;
                                        EditExercisesMultiSelectActivity editExercisesMultiSelectActivity2 = editExercisesMultiSelectActivity;
                                        switch (i25) {
                                            case 0:
                                                EditExercisesMultiSelectActivity.a aVar3 = EditExercisesMultiSelectActivity.f29784b;
                                                editExercisesMultiSelectActivity2.finish();
                                                break;
                                            default:
                                                EditExercisesMultiSelectActivity.a aVar4 = EditExercisesMultiSelectActivity.f29784b;
                                                editExercisesMultiSelectActivity2.finish();
                                                break;
                                        }
                                    }
                                });
                                aVar2.setNegativeButton(editExercisesMultiSelectActivity.getString(R.string.lbl_cancel), new ag0.e(7));
                                androidx.appcompat.app.e eVarCreate = aVar2.create();
                                eVarCreate.getClass();
                                eVarCreate.show();
                            } else if (exc instanceof EditExercisesMultiSelectViewModel.UnableToSaveException) {
                                androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(editExercisesMultiSelectActivity);
                                aVar3.setTitle(editExercisesMultiSelectActivity.getString(R.string.common_save_error_title));
                                aVar3.setMessage(editExercisesMultiSelectActivity.getString(R.string.common_save_error_msg));
                                aVar3.setCancelable(true);
                                aVar3.setPositiveButton(editExercisesMultiSelectActivity.getString(R.string.lbl_don_t_save), new DialogInterface.OnClickListener() { // from class: aq.k0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i24) {
                                        int i25 = i18;
                                        EditExercisesMultiSelectActivity editExercisesMultiSelectActivity2 = editExercisesMultiSelectActivity;
                                        switch (i25) {
                                            case 0:
                                                EditExercisesMultiSelectActivity.a aVar4 = EditExercisesMultiSelectActivity.f29784b;
                                                editExercisesMultiSelectActivity2.finish();
                                                break;
                                            default:
                                                EditExercisesMultiSelectActivity.a aVar5 = EditExercisesMultiSelectActivity.f29784b;
                                                editExercisesMultiSelectActivity2.finish();
                                                break;
                                        }
                                    }
                                });
                                aVar3.setNegativeButton(editExercisesMultiSelectActivity.getString(R.string.lbl_cancel), new ag0.e(8));
                                androidx.appcompat.app.e eVarCreate2 = aVar3.create();
                                eVarCreate2.getClass();
                                eVarCreate2.show();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        EditExercisesMultiSelectActivity.a aVar4 = EditExercisesMultiSelectActivity.f29784b;
                        androidx.fragment.app.v supportFragmentManager = editExercisesMultiSelectActivity.getSupportFragmentManager();
                        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                        aVarB.l(R.id.edit_exercises_fragment, new c0(), null);
                        aVarB.d(null);
                        aVarB.e();
                        return Unit.INSTANCE;
                    default:
                        Integer num = (Integer) obj;
                        EditExercisesMultiSelectActivity.a aVar5 = EditExercisesMultiSelectActivity.f29784b;
                        if (num.intValue() > 0) {
                            editExercisesMultiSelectActivity.updateActionBar(editExercisesMultiSelectActivity.getString(R.string.lbl_num_selected, num), 3);
                        } else {
                            editExercisesMultiSelectActivity.updateActionBar(editExercisesMultiSelectActivity.getString(R.string.strength_training_edit_exercise_sets), 2);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.edit_exercises_fragment, new n0(), null);
        aVar.e();
        EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModel2 = this.f29785a;
        if (editExercisesMultiSelectViewModel2 == null) {
            s.m("viewModel");
            throw null;
        }
        final int i16 = 1;
        dh.b.L(editExercisesMultiSelectViewModel2.f29798j, this, new c(new l(this) { // from class: aq.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditExercisesMultiSelectActivity f12017b;

            {
                this.f12017b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                final EditExercisesMultiSelectActivity editExercisesMultiSelectActivity = this.f12017b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                        EditExercisesMultiSelectActivity.a aVar2 = EditExercisesMultiSelectActivity.f29784b;
                        int i18 = EditExercisesMultiSelectActivity.b.f29786a[g3Var.f35300a.ordinal()];
                        final int i19 = 1;
                        if (i18 == 1) {
                            editExercisesMultiSelectActivity.showProgressOverlay();
                        } else if (i18 == 2) {
                            Intent intent = new Intent();
                            intent.putExtra("EXTRA_EXERCISE_SETS", (Parcelable) g3Var.f35301b);
                            editExercisesMultiSelectActivity.setResult(-1, intent);
                            editExercisesMultiSelectActivity.finish();
                        } else {
                            if (i18 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            editExercisesMultiSelectActivity.hideProgressOverlay();
                            Exception exc = g3Var.f35303d;
                            if (exc instanceof EditExercisesMultiSelectViewModel.NoNetworkAvailableException) {
                                androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(editExercisesMultiSelectActivity);
                                aVar3.setTitle(editExercisesMultiSelectActivity.getString(R.string.common_network_reachability_error));
                                aVar3.setMessage(editExercisesMultiSelectActivity.getString(R.string.common_no_internet_save_error_msg));
                                aVar3.setCancelable(true);
                                final int i110 = 0;
                                aVar3.setPositiveButton(editExercisesMultiSelectActivity.getString(R.string.lbl_don_t_save), new DialogInterface.OnClickListener() { // from class: aq.k0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i24) {
                                        int i25 = i110;
                                        EditExercisesMultiSelectActivity editExercisesMultiSelectActivity2 = editExercisesMultiSelectActivity;
                                        switch (i25) {
                                            case 0:
                                                EditExercisesMultiSelectActivity.a aVar4 = EditExercisesMultiSelectActivity.f29784b;
                                                editExercisesMultiSelectActivity2.finish();
                                                break;
                                            default:
                                                EditExercisesMultiSelectActivity.a aVar5 = EditExercisesMultiSelectActivity.f29784b;
                                                editExercisesMultiSelectActivity2.finish();
                                                break;
                                        }
                                    }
                                });
                                aVar3.setNegativeButton(editExercisesMultiSelectActivity.getString(R.string.lbl_cancel), new ag0.e(7));
                                androidx.appcompat.app.e eVarCreate = aVar3.create();
                                eVarCreate.getClass();
                                eVarCreate.show();
                            } else if (exc instanceof EditExercisesMultiSelectViewModel.UnableToSaveException) {
                                androidx.appcompat.app.e.a aVar4 = new androidx.appcompat.app.e.a(editExercisesMultiSelectActivity);
                                aVar4.setTitle(editExercisesMultiSelectActivity.getString(R.string.common_save_error_title));
                                aVar4.setMessage(editExercisesMultiSelectActivity.getString(R.string.common_save_error_msg));
                                aVar4.setCancelable(true);
                                aVar4.setPositiveButton(editExercisesMultiSelectActivity.getString(R.string.lbl_don_t_save), new DialogInterface.OnClickListener() { // from class: aq.k0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i24) {
                                        int i25 = i19;
                                        EditExercisesMultiSelectActivity editExercisesMultiSelectActivity2 = editExercisesMultiSelectActivity;
                                        switch (i25) {
                                            case 0:
                                                EditExercisesMultiSelectActivity.a aVar5 = EditExercisesMultiSelectActivity.f29784b;
                                                editExercisesMultiSelectActivity2.finish();
                                                break;
                                            default:
                                                EditExercisesMultiSelectActivity.a aVar6 = EditExercisesMultiSelectActivity.f29784b;
                                                editExercisesMultiSelectActivity2.finish();
                                                break;
                                        }
                                    }
                                });
                                aVar4.setNegativeButton(editExercisesMultiSelectActivity.getString(R.string.lbl_cancel), new ag0.e(8));
                                androidx.appcompat.app.e eVarCreate2 = aVar4.create();
                                eVarCreate2.getClass();
                                eVarCreate2.show();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        EditExercisesMultiSelectActivity.a aVar5 = EditExercisesMultiSelectActivity.f29784b;
                        androidx.fragment.app.v supportFragmentManager2 = editExercisesMultiSelectActivity.getSupportFragmentManager();
                        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager2, supportFragmentManager2);
                        aVarB.l(R.id.edit_exercises_fragment, new c0(), null);
                        aVarB.d(null);
                        aVarB.e();
                        return Unit.INSTANCE;
                    default:
                        Integer num = (Integer) obj;
                        EditExercisesMultiSelectActivity.a aVar6 = EditExercisesMultiSelectActivity.f29784b;
                        if (num.intValue() > 0) {
                            editExercisesMultiSelectActivity.updateActionBar(editExercisesMultiSelectActivity.getString(R.string.lbl_num_selected, num), 3);
                        } else {
                            editExercisesMultiSelectActivity.updateActionBar(editExercisesMultiSelectActivity.getString(R.string.strength_training_edit_exercise_sets), 2);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModel3 = this.f29785a;
        if (editExercisesMultiSelectViewModel3 == null) {
            s.m("viewModel");
            throw null;
        }
        ExerciseSetsDTO exerciseSetsDTO3 = editExercisesMultiSelectViewModel3.f29791c;
        if (exerciseSetsDTO3 != null) {
            exerciseSetsDTO = new ExerciseSetsDTO();
            exerciseSetsDTO.f41090b = exerciseSetsDTO3.f41090b;
            e[] eVarArr2 = exerciseSetsDTO3.f41089a;
            exerciseSetsDTO.f41089a = (e[]) Arrays.copyOf(eVarArr2, eVarArr2.length);
        } else {
            exerciseSetsDTO = null;
        }
        editExercisesMultiSelectViewModel3.f29801m = exerciseSetsDTO;
        ArrayList arrayList = new ArrayList();
        int i17 = R.color.gcm_background;
        if (exerciseSetsDTO3 != null && (eVarArr = exerciseSetsDTO3.f41089a) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (e eVar : eVarArr) {
                if (!eVar.f0()) {
                    arrayList2.add(eVar);
                }
            }
            int i18 = 0;
            for (Object obj : arrayList2) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    x.q();
                    throw null;
                }
                arrayList.add(new u0(i18, new e((e) obj), false, i18 % 2 == 0 ? R.color.gcm_surface_2 : R.color.gcm_background));
                i18 = i19;
            }
        }
        d dVar = editExercisesMultiSelectViewModel3.f29793e;
        if (dVar != null) {
            int size = arrayList.size();
            e eVarP = gl.b.P(dVar);
            if (arrayList.size() % 2 == 0) {
                i17 = R.color.gcm_surface_2;
            }
            arrayList.add(new u0(size, eVarP, false, i17));
        }
        editExercisesMultiSelectViewModel3.f29803o = arrayList;
        editExercisesMultiSelectViewModel3.f29802n.m(arrayList);
        editExercisesMultiSelectViewModel3.y4();
        EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModel4 = this.f29785a;
        if (editExercisesMultiSelectViewModel4 == null) {
            s.m("viewModel");
            throw null;
        }
        final int i24 = 0;
        editExercisesMultiSelectViewModel4.f29799k.f(this, new c(new l(this) { // from class: aq.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditExercisesMultiSelectActivity f12017b;

            {
                this.f12017b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj2) {
                int i110 = i24;
                final EditExercisesMultiSelectActivity editExercisesMultiSelectActivity = this.f12017b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj2;
                        EditExercisesMultiSelectActivity.a aVar2 = EditExercisesMultiSelectActivity.f29784b;
                        int i111 = EditExercisesMultiSelectActivity.b.f29786a[g3Var.f35300a.ordinal()];
                        final int i112 = 1;
                        if (i111 == 1) {
                            editExercisesMultiSelectActivity.showProgressOverlay();
                        } else if (i111 == 2) {
                            Intent intent = new Intent();
                            intent.putExtra("EXTRA_EXERCISE_SETS", (Parcelable) g3Var.f35301b);
                            editExercisesMultiSelectActivity.setResult(-1, intent);
                            editExercisesMultiSelectActivity.finish();
                        } else {
                            if (i111 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            editExercisesMultiSelectActivity.hideProgressOverlay();
                            Exception exc = g3Var.f35303d;
                            if (exc instanceof EditExercisesMultiSelectViewModel.NoNetworkAvailableException) {
                                androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(editExercisesMultiSelectActivity);
                                aVar3.setTitle(editExercisesMultiSelectActivity.getString(R.string.common_network_reachability_error));
                                aVar3.setMessage(editExercisesMultiSelectActivity.getString(R.string.common_no_internet_save_error_msg));
                                aVar3.setCancelable(true);
                                final int i113 = 0;
                                aVar3.setPositiveButton(editExercisesMultiSelectActivity.getString(R.string.lbl_don_t_save), new DialogInterface.OnClickListener() { // from class: aq.k0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i25) {
                                        int i26 = i113;
                                        EditExercisesMultiSelectActivity editExercisesMultiSelectActivity2 = editExercisesMultiSelectActivity;
                                        switch (i26) {
                                            case 0:
                                                EditExercisesMultiSelectActivity.a aVar5 = EditExercisesMultiSelectActivity.f29784b;
                                                editExercisesMultiSelectActivity2.finish();
                                                break;
                                            default:
                                                EditExercisesMultiSelectActivity.a aVar6 = EditExercisesMultiSelectActivity.f29784b;
                                                editExercisesMultiSelectActivity2.finish();
                                                break;
                                        }
                                    }
                                });
                                aVar3.setNegativeButton(editExercisesMultiSelectActivity.getString(R.string.lbl_cancel), new ag0.e(7));
                                androidx.appcompat.app.e eVarCreate = aVar3.create();
                                eVarCreate.getClass();
                                eVarCreate.show();
                            } else if (exc instanceof EditExercisesMultiSelectViewModel.UnableToSaveException) {
                                androidx.appcompat.app.e.a aVar4 = new androidx.appcompat.app.e.a(editExercisesMultiSelectActivity);
                                aVar4.setTitle(editExercisesMultiSelectActivity.getString(R.string.common_save_error_title));
                                aVar4.setMessage(editExercisesMultiSelectActivity.getString(R.string.common_save_error_msg));
                                aVar4.setCancelable(true);
                                aVar4.setPositiveButton(editExercisesMultiSelectActivity.getString(R.string.lbl_don_t_save), new DialogInterface.OnClickListener() { // from class: aq.k0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i25) {
                                        int i26 = i112;
                                        EditExercisesMultiSelectActivity editExercisesMultiSelectActivity2 = editExercisesMultiSelectActivity;
                                        switch (i26) {
                                            case 0:
                                                EditExercisesMultiSelectActivity.a aVar5 = EditExercisesMultiSelectActivity.f29784b;
                                                editExercisesMultiSelectActivity2.finish();
                                                break;
                                            default:
                                                EditExercisesMultiSelectActivity.a aVar6 = EditExercisesMultiSelectActivity.f29784b;
                                                editExercisesMultiSelectActivity2.finish();
                                                break;
                                        }
                                    }
                                });
                                aVar4.setNegativeButton(editExercisesMultiSelectActivity.getString(R.string.lbl_cancel), new ag0.e(8));
                                androidx.appcompat.app.e eVarCreate2 = aVar4.create();
                                eVarCreate2.getClass();
                                eVarCreate2.show();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        EditExercisesMultiSelectActivity.a aVar5 = EditExercisesMultiSelectActivity.f29784b;
                        androidx.fragment.app.v supportFragmentManager2 = editExercisesMultiSelectActivity.getSupportFragmentManager();
                        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager2, supportFragmentManager2);
                        aVarB.l(R.id.edit_exercises_fragment, new c0(), null);
                        aVarB.d(null);
                        aVarB.e();
                        return Unit.INSTANCE;
                    default:
                        Integer num = (Integer) obj2;
                        EditExercisesMultiSelectActivity.a aVar6 = EditExercisesMultiSelectActivity.f29784b;
                        if (num.intValue() > 0) {
                            editExercisesMultiSelectActivity.updateActionBar(editExercisesMultiSelectActivity.getString(R.string.lbl_num_selected, num), 3);
                        } else {
                            editExercisesMultiSelectActivity.updateActionBar(editExercisesMultiSelectActivity.getString(R.string.strength_training_edit_exercise_sets), 2);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        getOnBackPressedDispatcher().d();
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/EditExercisesMultiSelectActivity$a;", "", "<init>", "()V", "", "EXTRA_EXERCISE_SETS", "Ljava/lang/String;", "EXTRA_ACTIVITY_ID", "EXTRA_ACTIVITY_TYPE", "EXTRA_EXERCISE_LIST", "EXTRA_EXERCISE_ADDED", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
