package com.garmin.android.apps.connectmobile.newsfeed.filter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import d10.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/filter/b;", "Ld10/d;", "Lnz0/b;", "<init>", "()V", "b", "a", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends d<nz0.b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f39532e = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0709b f39533d;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.newsfeed.filter.b$b, reason: collision with other inner class name */
    public interface InterfaceC0709b {
        void q5();

        void v2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d10.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f39533d = context instanceof InterfaceC0709b ? (InterfaceC0709b) context : null;
    }

    @Override // d10.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        ((com.garmin.android.apps.connectmobile.c) mVarRequireActivity).initActionBar(true, R.string.lbl_filter);
    }

    @Override // d10.d
    public final void w6() {
        ComposeView composeView = this.f57032c;
        if (composeView != null) {
            composeView.setContent(new e(-600059781, true, new mz0.b(this, 0)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/filter/b$a;", "", "<init>", "()V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
