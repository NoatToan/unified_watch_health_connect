package com.garmin.android.apps.connectmobile.training.atp.create.steps;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/e;", "Lau1/a;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends au1.a implements View.OnClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f45264m = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45265k = 7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45266l;

    public final void F6() {
        for (au1.h hVar : this.f13023j) {
            List<String> listY = w6().y();
            boolean z14 = false;
            if (listY != null && listY.contains(hVar.getAtpDay().f187130a)) {
                z14 = true;
            }
            hVar.setChecked(z14);
            hVar.setOnClickListener(this);
        }
    }

    public final int G6() {
        Iterator<T> it = this.f13023j.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (((au1.h) it.next()).isChecked()) {
                i14++;
            }
        }
        return i14;
    }

    @Override // yt1.e
    public final int V5() {
        return R.string.lbl_days_available;
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b
    public final String b5() {
        return "DaysSelectionFragment";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        if (view2 == null || !(view2 instanceof au1.h)) {
            return;
        }
        au1.h hVar = (au1.h) view2;
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
            if (G6() >= this.f45265k) {
                E6().setVisibility(0);
                return;
            }
            return;
        }
        if (G6() > this.f45265k) {
            hVar.setChecked(false);
            return;
        }
        if (y6()) {
            String string = getString(R.string.lbl_min_days_available, String.valueOf(this.f45265k));
            string.getClass();
            String string2 = getString(R.string.msg_min_days_available, String.valueOf(this.f45265k));
            string2.getClass();
            new androidx.appcompat.app.e.a(requireActivity()).setTitle(string).setMessage(string2).setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
        }
        if (z6()) {
            E6().setVisibility(8);
            hVar.setChecked(false);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Integer selectedWorkoutsPerWeek = w6().getSelectedWorkoutsPerWeek();
        this.f45265k = selectedWorkoutsPerWeek != null ? selectedWorkoutsPerWeek.intValue() : 7;
    }

    @Override // au1.a, com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        E6().setOnClickListener(new a32.b(this, 8));
        if (z6()) {
            TextView textView = this.f13021h;
            if (textView == null) {
                s.m("headerInfo");
                throw null;
            }
            textView.setText(getString(R.string.msg_training_day_selection_edit, String.valueOf(w6().getSelectedWorkoutsPerWeek())));
            F6();
            int iG6 = G6();
            Integer selectedWorkoutsPerWeek = w6().getSelectedWorkoutsPerWeek();
            if (iG6 < (selectedWorkoutsPerWeek != null ? selectedWorkoutsPerWeek.intValue() : 0)) {
                E6().setVisibility(8);
            }
            this.f45266l = false;
        }
        if (y6()) {
            TextView textView2 = this.f13021h;
            if (textView2 == null) {
                s.m("headerInfo");
                throw null;
            }
            textView2.setText(R.string.atp_msg_days_available_header);
            this.f45266l = true;
            if (w6().y() == null) {
                for (au1.h hVar : this.f13023j) {
                    hVar.setChecked(true);
                    hVar.setOnClickListener(this);
                }
                return;
            }
            F6();
            int iG7 = G6();
            Integer selectedWorkoutsPerWeek2 = w6().getSelectedWorkoutsPerWeek();
            if (iG7 < (selectedWorkoutsPerWeek2 != null ? selectedWorkoutsPerWeek2.intValue() : 0)) {
                E6().setVisibility(8);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "ALL_DAYS_SELECTED", "I", "CONSECUTIVE_WORKOUTS_NUMBER", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
