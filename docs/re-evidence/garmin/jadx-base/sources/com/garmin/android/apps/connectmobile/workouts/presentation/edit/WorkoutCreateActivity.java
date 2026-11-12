package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/WorkoutCreateActivity;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/a;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkoutCreateActivity extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f48852j = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f48853i = "";

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.a
    /* JADX INFO: renamed from: fa, reason: from getter */
    public final String getF48853i() {
        return this.f48853i;
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.a
    public final void ha(Long l14, String str, g gVar) {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.workout_dialog, (ViewGroup) null);
        EditText editText = (EditText) viewInflate.findViewById(R.id.edit_text);
        if (!c22.b.f(this)) {
            editText.requestFocus();
        }
        editText.setText(str);
        editText.setSingleLine();
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(this).setTitle(R.string.workout_name).setView(viewInflate).setPositiveButton(getString(R.string.lbl_save), new ag0.d(23, editText, this)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create();
        eVarCreate.getClass();
        Window window = eVarCreate.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        eVarCreate.show();
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.a
    public final void init() {
        Object serializableExtra;
        double d14;
        m52.j jVar;
        d bVar;
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("extra_workout_type", m52.k.class) : null;
        } else {
            Object serializableExtra2 = intent != null ? intent.getSerializableExtra("extra_workout_type") : null;
            if (!(serializableExtra2 instanceof m52.k)) {
                serializableExtra2 = null;
            }
            serializableExtra = (m52.k) serializableExtra2;
        }
        m52.k kVar = (m52.k) serializableExtra;
        if (kVar == null) {
            kVar = m52.k.f116756p;
        }
        m52.k kVar2 = kVar;
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("extra_existing_workout_names");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>();
        }
        m52.k kVar3 = m52.k.f116758r;
        if (kVar2 == kVar3) {
            ga();
            d14 = 25.0d;
        } else {
            d14 = Double.NaN;
        }
        if (kVar2 == kVar3) {
            ga();
            jVar = r.f49273q;
        } else {
            jVar = null;
        }
        if (kVar2 == kVar3) {
            ga();
            ga();
            bVar = new d.b(25.0d, r.f49273q);
        } else {
            bVar = d.c.f48949b;
        }
        d dVar = bVar;
        long longExtra = getIntent().getLongExtra("GCM_workout_queue_download_to_device", -1L);
        k0.f49020a.getClass();
        k0.a aVarA = k0.a(kVar2, d14, jVar, false);
        r rVarGa = ga();
        if (jVar == null) {
            jVar = m52.j.f116747g;
        }
        rVarGa.f49278e = jVar;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        String strC = aVarA.c(applicationContext);
        int iB = v52.f.b(strC, stringArrayListExtra);
        if (iB != 1) {
            x0 x0Var = x0.f105818a;
            strC = String.format(Locale.getDefault(), "%s (%d)", Arrays.copyOf(new Object[]{strC, Integer.valueOf(iB)}, 2));
        }
        String str = strC;
        this.f48853i = str;
        r rVarGa2 = ga();
        Long lValueOf = longExtra != -1 ? Long.valueOf(longExtra) : null;
        l52.m mVarF = aVarA.f();
        f62.o oVar = new f62.o(null, null, null, null);
        g.b bVar2 = g.b.f48995a;
        r.d.f49311c.getClass();
        rVarGa2.G4(kVar2, null, lValueOf, null, str, mVarF, aVarA, null, null, null, null, false, dVar, oVar, bVar2, false, r.d.f49312d, false, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/WorkoutCreateActivity$a;", "", "<init>", "()V", "", "EXTRA_EXISTING_WORKOUT_NAMES", "Ljava/lang/String;", "EXTRA_WORKOUT_TYPE", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, m52.k kVar, ArrayList arrayList, long j8) {
            context.getClass();
            kVar.getClass();
            Intent intent = new Intent(context, (Class<?>) WorkoutCreateActivity.class);
            intent.putStringArrayListExtra("extra_existing_workout_names", arrayList);
            intent.putExtra("GCM_workout_queue_download_to_device", j8);
            intent.putExtra("extra_workout_type", kVar);
            return intent;
        }

        private a() {
        }
    }
}
