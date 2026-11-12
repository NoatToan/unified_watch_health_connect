package com.garmin.android.apps.connectmobile.badges.redesign.filter;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import d10.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/filter/b;", "Ld10/d;", "Lvu/b;", "<init>", "()V", "a", "b", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends d<vu.b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0483b f30476e = new C0483b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f30477d;

    public interface a {
        void q1();

        void z3();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        com.garmin.android.apps.connectmobile.c cVar = (com.garmin.android.apps.connectmobile.c) getActivity();
        if (cVar != null) {
            cVar.initActionBar(true, R.string.lbl_filter);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d10.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f30477d = (a) context;
    }

    @Override // d10.d
    public final void w6() {
        ComposeView composeView = this.f57032c;
        if (composeView != null) {
            composeView.setContent(new e(-238384783, true, new vu.c(this, 0)));
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.badges.redesign.filter.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/filter/b$b;", "", "<init>", "()V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0483b {
        public /* synthetic */ C0483b(j jVar) {
            this();
        }

        private C0483b() {
        }
    }
}
