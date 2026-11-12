package com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/f;", "Ld10/d;", "Lj62/d;", "<init>", "()V", "b", "a", "", "isSportTrainingFocusAvailable", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends d10.d<j62.d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f49519e = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f49520d;

    public interface b {
        void C2();

        void X4();

        void d3();

        void p6(boolean z14);

        void v5();

        void v8();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        com.garmin.android.apps.connectmobile.c cVar = (com.garmin.android.apps.connectmobile.c) getActivity();
        if (cVar != null) {
            cVar.initActionBar(true, R.string.lbl_filter_msn_workouts);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d10.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f49520d = context instanceof b ? (b) context : null;
    }

    @Override // d10.d
    public final void w6() {
        ComposeView composeView = this.f57032c;
        if (composeView != null) {
            composeView.setContent(new z3.e(1682929834, true, new j62.e(this, 0)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/f$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
