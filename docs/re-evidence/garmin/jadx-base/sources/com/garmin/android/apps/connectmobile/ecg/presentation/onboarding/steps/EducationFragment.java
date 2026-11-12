package com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.m;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import lc.y;
import nf0.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/EducationFragment;", "Lnf0/z;", "<init>", "()V", "b", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EducationFragment extends z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f34786k = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f34788j = b.HOW_IT_WORKS;

    @Override // nf0.z
    public final void C6(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        linearLayout.addView(layoutInflater.inflate(this.f34788j.f34792b, (ViewGroup) linearLayout, false));
    }

    @Override // nf0.z
    public final void E6() {
        if (this.f34787i >= b.values().length - 1) {
            NavHostFragment.f10124e.getClass();
            NavHostFragment.a.a(this).g(R.id.action_important_things, null);
            return;
        }
        NavHostFragment.f10124e.getClass();
        y yVarA = NavHostFragment.a.a(this);
        int i14 = this.f34787i + 1;
        f34786k.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_STEP_ID", i14);
        yVarA.g(R.id.action_next_education_item, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        f34786k.getClass();
        this.f34787i = arguments != null ? arguments.getInt("EXTRA_STEP_ID", 0) : 0;
        this.f34788j = b.values()[this.f34787i];
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m activity = getActivity();
        if (activity != null) {
            activity.setTitle(getString(this.f34788j.f34791a));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/EducationFragment$a;", "", "<init>", "()V", "", "EXTRA_STEP_ID", "Ljava/lang/String;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/EducationFragment$b;", "", "", "titleResId", "layoutResId", "<init>", "(Ljava/lang/String;III)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        HOW_IT_WORKS(0, R.layout.container_how_it_works, 1, null),
        /* JADX INFO: Fake field, exist only in values array */
        SINUS_RHYTHM(R.string.lbl_results_you_might_see, R.layout.container_sinus_rhythm),
        /* JADX INFO: Fake field, exist only in values array */
        ATRIAL_FIBRILLATION(R.string.lbl_results_you_might_see, R.layout.container_atrial_fibrillation),
        /* JADX INFO: Fake field, exist only in values array */
        HR_HIGH_OR_LOW(R.string.lbl_results_you_might_see, R.layout.container_hr_high_low),
        /* JADX INFO: Fake field, exist only in values array */
        INCONCLUSIVE(R.string.lbl_results_you_might_see, R.layout.container_inconclusive),
        /* JADX INFO: Fake field, exist only in values array */
        IMPORTANT_THINGS_TO_KNOW(0, R.layout.container_important, 1, null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f34791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34792b;

        /* synthetic */ b(int i14, int i15, int i16, j jVar) {
            this((i16 & 1) != 0 ? R.string.lbl_ecg_education : i14, i15);
        }

        b(int i14, int i15) {
            this.f34791a = i14;
            this.f34792b = i15;
        }
    }
}
