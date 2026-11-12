package com.garmin.android.apps.connectmobile.incidentdetection;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import cq0.h;
import cq0.i;
import kotlin.w3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/d;", "Lcq0/c;", "<init>", "()V", "a", "", "Ll20/a;", "contacts", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends cq0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36855d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36856c;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.composable_container, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Handler handler = this.f55120a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f55120a = null;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        int i14 = arguments != null ? arguments.getInt("NUMBER_OF_SEC_EXTRA", 0) : 0;
        Bundle arguments2 = getArguments();
        boolean z14 = arguments2 != null ? arguments2.getBoolean("IS_FALL_DETECTION_EXTRA", false) : false;
        this.f36856c = z14;
        String string = getString(R.string.lbl_cancel);
        string.getClass();
        y6(new h(this, 1), z14, string, i14);
    }

    @Override // cq0.c
    public final void u6() {
        boolean z14 = this.f36856c;
        String string = getString(R.string.lbl_sending);
        string.getClass();
        y6(null, z14, string, 0);
    }

    @Override // cq0.c
    public final void v6(int i14) {
        boolean z14 = this.f36856c;
        String string = getString(R.string.lbl_cancel);
        string.getClass();
        y6(new h(this, 0), z14, string, i14);
    }

    public final void y6(e23.a aVar, boolean z14, String str, int i14) {
        ComposeView composeView;
        View view2 = getView();
        if (view2 == null || (composeView = (ComposeView) view2.findViewById(R.id.composable_container)) == null) {
            return;
        }
        composeView.setVisibility(0);
        composeView.setViewCompositionStrategy(w3.b.f91619b);
        composeView.setContent(new z3.e(290139635, true, new i(z14, this, i14, str, aVar)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/d$a;", "", "<init>", "()V", "", "NUMBER_OF_SEC_EXTRA", "Ljava/lang/String;", "IS_FALL_DETECTION_EXTRA", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
