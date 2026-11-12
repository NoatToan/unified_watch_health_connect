package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.n0;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/f;", "Landroidx/fragment/app/Fragment;", "", "pageTitle", "helpTitle", "helpDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends Fragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f49662e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f49666d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/stepedit/f$b", "Lb/s;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            f fVar = f.this;
            fVar.f49666d.f(false);
            fVar.requireActivity().onBackPressed();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, String str2, String str3) {
        super(R.layout.workout_rest_step_help);
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f49663a = str;
        this.f49664b = str2;
        this.f49665c = str3;
        this.f49666d = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.help_title);
        viewFindViewById.getClass();
        ((TextView) viewFindViewById).setText(this.f49664b);
        View viewFindViewById2 = view2.findViewById(R.id.help_description);
        viewFindViewById2.getClass();
        ((TextView) viewFindViewById2).setText(this.f49665c);
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.setTitle(this.f49663a);
        u onBackPressedDispatcher = mVarRequireActivity.getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f49666d, viewLifecycleOwner);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
