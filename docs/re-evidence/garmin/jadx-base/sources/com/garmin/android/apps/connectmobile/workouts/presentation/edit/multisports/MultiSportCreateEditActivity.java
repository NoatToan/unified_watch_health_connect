package com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportCreateEditActivity;
import fw.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.x0;
import p13.c0;
import p13.j0;
import r22.q0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/MultiSportCreateEditActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MultiSportCreateEditActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f49083f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f49084a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f49085b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f49086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g62.d f49087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g62.d f49088e;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49089a;

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
            f49089a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((h0) t7).getSegmentOrder()), Integer.valueOf(((h0) t14).getSegmentOrder()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f49090a;

        public d(b.g gVar) {
            this.f49090a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f49090a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f49091a;

        public e(b.g gVar) {
            this.f49091a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f49091a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f49092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f49093b;

        public f(e23.a aVar, b.g gVar) {
            this.f49092a = aVar;
            this.f49093b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f49092a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f49093b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [g62.d] */
    /* JADX WARN: Type inference failed for: r0v3, types: [g62.d] */
    public MultiSportCreateEditActivity() {
        final int i14 = 0;
        this.f49087d = new z0(this) { // from class: g62.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultiSportCreateEditActivity f76068b;

            {
                this.f76068b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                MultiSportCreateEditActivity multiSportCreateEditActivity = this.f76068b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h hVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h) obj;
                        MultiSportCreateEditActivity.a aVar = MultiSportCreateEditActivity.f49083f;
                        hVar.getClass();
                        if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.b) {
                            multiSportCreateEditActivity.showProgressOverlay();
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.c) {
                            multiSportCreateEditActivity.hideProgressOverlay();
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.a) {
                            multiSportCreateEditActivity.hideProgressOverlay();
                            if (((com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.a) hVar).f49192a) {
                                multiSportCreateEditActivity.displayFailedMessage();
                            }
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.j) {
                            multiSportCreateEditActivity.setTitle(multiSportCreateEditActivity.f49085b);
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.j jVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.j) hVar;
                            WorkoutDetailsDTO workoutDetailsDTO = jVar.f49201a;
                            Integer num = jVar.f49202b;
                            aVar2.getClass();
                            workoutDetailsDTO.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("extra_workout_dto", workoutDetailsDTO);
                            if (num != null) {
                                bundle.putInt("extra_sports_segment_index", num.intValue());
                            }
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b();
                            bVar.setArguments(bundle);
                            androidx.fragment.app.v supportFragmentManager = multiSportCreateEditActivity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
                            aVar3.l(R.id.content_frame, bVar, null);
                            aVar3.e();
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.d) {
                            View viewInflate = LayoutInflater.from(multiSportCreateEditActivity).inflate(R.layout.workout_dialog, (ViewGroup) null);
                            EditText editText = (EditText) viewInflate.findViewById(R.id.edit_text);
                            editText.setText(multiSportCreateEditActivity.f49085b);
                            editText.setSingleLine();
                            editText.setSelectAllOnFocus(true);
                            androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(multiSportCreateEditActivity).setTitle(R.string.workout_name).setView(viewInflate).setPositiveButton(multiSportCreateEditActivity.getString(R.string.lbl_save), new ag0.d(26, editText, multiSportCreateEditActivity)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create();
                            eVarCreate.getClass();
                            Window window = eVarCreate.getWindow();
                            if (window != null) {
                                window.setSoftInputMode(4);
                            }
                            eVarCreate.show();
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.f) {
                            String string = multiSportCreateEditActivity.getString(R.string.msg_workout_close_to_segment_limit, "25");
                            string.getClass();
                            MultiSportCreateEditActivity.ca(multiSportCreateEditActivity, string);
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.C0965h) {
                            String string2 = multiSportCreateEditActivity.getString(R.string.msg_workout_multisport_close_to_step_limit, "250");
                            string2.getClass();
                            MultiSportCreateEditActivity.ca(multiSportCreateEditActivity, string2);
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.i) {
                            new androidx.appcompat.app.e.a(multiSportCreateEditActivity).setTitle(R.string.msg_workout_step_limit_reached_alert_title).setMessage(R.string.msg_workout_step_limit_reached_alert_msg).setPositiveButton(multiSportCreateEditActivity.getString(R.string.common_button_ok), new f20.i(12)).show();
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.g) {
                            androidx.appcompat.app.e.a aVar4 = new androidx.appcompat.app.e.a(multiSportCreateEditActivity);
                            String string3 = multiSportCreateEditActivity.getString(R.string.msg_workout_leg_limit_reached_alert_title);
                            string3.getClass();
                            aVar4.setTitle(g22.n.a(string3)).setMessage(R.string.msg_workout_leg_limit_reached_alert_msg).setPositiveButton(multiSportCreateEditActivity.getString(R.string.common_button_ok), new f20.i(13)).show();
                        } else if (!(hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.e)) {
                            u0.r();
                        } else {
                            new androidx.appcompat.app.e.a(multiSportCreateEditActivity).setTitle(R.string.msg_workout_two_legs_required_alert_title).setMessage(R.string.msg_workout_two_legs_required_alert_msg).setPositiveButton(multiSportCreateEditActivity.getString(R.string.common_button_ok), new f20.i(11)).show();
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        MultiSportCreateEditActivity.a aVar5 = MultiSportCreateEditActivity.f49083f;
                        g3Var.getClass();
                        fw.p pVar = g3Var.f35300a;
                        WorkoutDetailsDTO workoutDetailsDTO2 = (WorkoutDetailsDTO) g3Var.f35301b;
                        int i16 = MultiSportCreateEditActivity.b.f49089a[pVar.ordinal()];
                        if (i16 == 1) {
                            multiSportCreateEditActivity.showProgressOverlay();
                        } else if (i16 == 2) {
                            multiSportCreateEditActivity.hideProgressOverlay();
                            multiSportCreateEditActivity.setResult(-1);
                            multiSportCreateEditActivity.finish();
                        } else if (i16 != 3) {
                            u0.r();
                        } else {
                            multiSportCreateEditActivity.hideProgressOverlay();
                            Toast.makeText(multiSportCreateEditActivity, workoutDetailsDTO2 == null ? R.string.workout_update_failed : R.string.workout_create_failed, 0).show();
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f49088e = new z0(this) { // from class: g62.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultiSportCreateEditActivity f76068b;

            {
                this.f76068b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                MultiSportCreateEditActivity multiSportCreateEditActivity = this.f76068b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h hVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h) obj;
                        MultiSportCreateEditActivity.a aVar = MultiSportCreateEditActivity.f49083f;
                        hVar.getClass();
                        if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.b) {
                            multiSportCreateEditActivity.showProgressOverlay();
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.c) {
                            multiSportCreateEditActivity.hideProgressOverlay();
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.a) {
                            multiSportCreateEditActivity.hideProgressOverlay();
                            if (((com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.a) hVar).f49192a) {
                                multiSportCreateEditActivity.displayFailedMessage();
                            }
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.j) {
                            multiSportCreateEditActivity.setTitle(multiSportCreateEditActivity.f49085b);
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.j jVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.j) hVar;
                            WorkoutDetailsDTO workoutDetailsDTO = jVar.f49201a;
                            Integer num = jVar.f49202b;
                            aVar2.getClass();
                            workoutDetailsDTO.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("extra_workout_dto", workoutDetailsDTO);
                            if (num != null) {
                                bundle.putInt("extra_sports_segment_index", num.intValue());
                            }
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b();
                            bVar.setArguments(bundle);
                            androidx.fragment.app.v supportFragmentManager = multiSportCreateEditActivity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
                            aVar3.l(R.id.content_frame, bVar, null);
                            aVar3.e();
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.d) {
                            View viewInflate = LayoutInflater.from(multiSportCreateEditActivity).inflate(R.layout.workout_dialog, (ViewGroup) null);
                            EditText editText = (EditText) viewInflate.findViewById(R.id.edit_text);
                            editText.setText(multiSportCreateEditActivity.f49085b);
                            editText.setSingleLine();
                            editText.setSelectAllOnFocus(true);
                            androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(multiSportCreateEditActivity).setTitle(R.string.workout_name).setView(viewInflate).setPositiveButton(multiSportCreateEditActivity.getString(R.string.lbl_save), new ag0.d(26, editText, multiSportCreateEditActivity)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create();
                            eVarCreate.getClass();
                            Window window = eVarCreate.getWindow();
                            if (window != null) {
                                window.setSoftInputMode(4);
                            }
                            eVarCreate.show();
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.f) {
                            String string = multiSportCreateEditActivity.getString(R.string.msg_workout_close_to_segment_limit, "25");
                            string.getClass();
                            MultiSportCreateEditActivity.ca(multiSportCreateEditActivity, string);
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.C0965h) {
                            String string2 = multiSportCreateEditActivity.getString(R.string.msg_workout_multisport_close_to_step_limit, "250");
                            string2.getClass();
                            MultiSportCreateEditActivity.ca(multiSportCreateEditActivity, string2);
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.i) {
                            new androidx.appcompat.app.e.a(multiSportCreateEditActivity).setTitle(R.string.msg_workout_step_limit_reached_alert_title).setMessage(R.string.msg_workout_step_limit_reached_alert_msg).setPositiveButton(multiSportCreateEditActivity.getString(R.string.common_button_ok), new f20.i(12)).show();
                        } else if (hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.g) {
                            androidx.appcompat.app.e.a aVar4 = new androidx.appcompat.app.e.a(multiSportCreateEditActivity);
                            String string3 = multiSportCreateEditActivity.getString(R.string.msg_workout_leg_limit_reached_alert_title);
                            string3.getClass();
                            aVar4.setTitle(g22.n.a(string3)).setMessage(R.string.msg_workout_leg_limit_reached_alert_msg).setPositiveButton(multiSportCreateEditActivity.getString(R.string.common_button_ok), new f20.i(13)).show();
                        } else if (!(hVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.e)) {
                            u0.r();
                        } else {
                            new androidx.appcompat.app.e.a(multiSportCreateEditActivity).setTitle(R.string.msg_workout_two_legs_required_alert_title).setMessage(R.string.msg_workout_two_legs_required_alert_msg).setPositiveButton(multiSportCreateEditActivity.getString(R.string.common_button_ok), new f20.i(11)).show();
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        MultiSportCreateEditActivity.a aVar5 = MultiSportCreateEditActivity.f49083f;
                        g3Var.getClass();
                        fw.p pVar = g3Var.f35300a;
                        WorkoutDetailsDTO workoutDetailsDTO2 = (WorkoutDetailsDTO) g3Var.f35301b;
                        int i17 = MultiSportCreateEditActivity.b.f49089a[pVar.ordinal()];
                        if (i17 == 1) {
                            multiSportCreateEditActivity.showProgressOverlay();
                        } else if (i17 == 2) {
                            multiSportCreateEditActivity.hideProgressOverlay();
                            multiSportCreateEditActivity.setResult(-1);
                            multiSportCreateEditActivity.finish();
                        } else if (i17 != 3) {
                            u0.r();
                        } else {
                            multiSportCreateEditActivity.hideProgressOverlay();
                            Toast.makeText(multiSportCreateEditActivity, workoutDetailsDTO2 == null ? R.string.workout_update_failed : R.string.workout_create_failed, 0).show();
                        }
                        break;
                }
            }
        };
    }

    public static void ca(MultiSportCreateEditActivity multiSportCreateEditActivity, String str) {
        q0.b bVar = q0.f149800b;
        View viewFindViewById = multiSportCreateEditActivity.findViewById(R.id.content_frame);
        viewFindViewById.getClass();
        q0.b.c(bVar, viewFindViewById, str, null, 12).show();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView();
        Intent intent = getIntent();
        Integer numValueOf = null;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("extra_workout_dto", WorkoutDetailsDTO.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra_workout_dto") : null;
            if (!(parcelableExtra instanceof WorkoutDetailsDTO)) {
                parcelableExtra = null;
            }
            parcelable = (WorkoutDetailsDTO) parcelableExtra;
        }
        WorkoutDetailsDTO workoutDetailsDTO = (WorkoutDetailsDTO) parcelable;
        w1 w1Var = this.f49084a;
        ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c) w1Var.getValue()).f49141w.f(this, this.f49087d);
        ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c) w1Var.getValue()).B.f(this, this.f49088e);
        initActionBar(true);
        getIntent().getLongExtra("GCM_workout_queue_download_to_device", -1L);
        Bundle extras = getIntent().getExtras();
        this.f49086c = extras != null ? Integer.valueOf(extras.getInt("extra_workout_segment_order")) : null;
        ArrayList arrayList = new ArrayList();
        RandomAccess stringArrayListExtra = getIntent().getStringArrayListExtra("extra_workout_name_list");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = j0.f134944a;
        }
        arrayList.addAll(stringArrayListExtra);
        if (arrayList.isEmpty()) {
            String string = getString(R.string.lbl_multisport_workout);
            string.getClass();
            x0 x0Var = x0.f105818a;
            this.f49085b = String.format(Locale.getDefault(), "%s", Arrays.copyOf(new Object[]{string}, 1));
        } else {
            String string2 = getString(R.string.lbl_multisport_workout);
            string2.getClass();
            int iB = v52.f.b(string2, arrayList);
            if (iB != 1) {
                x0 x0Var2 = x0.f105818a;
                string2 = String.format(Locale.getDefault(), "%s (%d)", Arrays.copyOf(new Object[]{string2, Integer.valueOf(iB)}, 2));
            }
            this.f49085b = string2;
        }
        if (workoutDetailsDTO == null) {
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a.f49094h.getClass();
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a aVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a();
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.l(R.id.content_frame, aVar, null);
            aVar2.e();
            setTitle(getString(R.string.workout_lbl_create_workout));
            return;
        }
        String str = workoutDetailsDTO.f48041b;
        this.f49085b = str;
        setTitle(str);
        List<h0> list = workoutDetailsDTO.Q0;
        if (list.size() > 1) {
            c0.u(list, new c());
        }
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c) w1Var.getValue();
        Integer num = this.f49086c;
        if (num != null && !workoutDetailsDTO.Q0.isEmpty()) {
            Iterator<T> it = workoutDetailsDTO.Q0.iterator();
            int i14 = 0;
            while (it.hasNext()) {
                if (((h0) it.next()).getSegmentOrder() == num.intValue()) {
                    numValueOf = Integer.valueOf(i14);
                    break;
                }
                i14++;
            }
        }
        cVar.f49141w.j(new h.j(workoutDetailsDTO, numValueOf));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        setResult(0);
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/MultiSportCreateEditActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_WORKOUT_NAME_LIST", "EXTRA_WORKOUT_DTO", "EXTRA_WORKOUT_SEGMENT_ORDER", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
