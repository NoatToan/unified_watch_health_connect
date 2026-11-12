package com.garmin.android.apps.connectmobile.incidentdetection;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import c62.m1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.incidentdetection.service.WellnessIncidentDetectionService;
import java.util.Iterator;
import kotlin.w3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/e;", "Lcq0/c;", "<init>", "()V", "a", "", "Ll20/a;", "contacts", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends cq0.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f36857e = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36859d;

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
        boolean z14;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        if (y6()) {
            Bundle arguments = getArguments();
            z14 = arguments != null ? arguments.getBoolean("USER_CAN_CANCEL", false) : false;
        } else {
            z14 = true;
        }
        this.f36858c = z14;
        Bundle arguments2 = getArguments();
        this.f36859d = arguments2 != null ? arguments2.getBoolean("IS_FALL_DETECTION_EXTRA", false) : false;
        z6();
    }

    @Override // cq0.c
    public final void u6() {
        z6();
    }

    @Override // cq0.c
    public final void v6(int i14) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.INCIDENT_DETECTION;
        String strF = e0.f(i14, "user has ", " seconds left before the incident finishes on its own");
        i2.f36769a.getClass();
        i2.a.a(a2Var, strF);
    }

    @Override // cq0.c
    public final void w6() {
        if (y6()) {
            this.f36858c = true;
            z6();
        }
    }

    public final boolean y6() {
        Object systemService = requireActivity().getSystemService("activity");
        systemService.getClass();
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (WellnessIncidentDetectionService.class.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public final void z6() {
        ComposeView composeView;
        View view2 = getView();
        if (view2 == null || (composeView = (ComposeView) view2.findViewById(R.id.composable_container)) == null) {
            return;
        }
        composeView.setVisibility(0);
        composeView.setViewCompositionStrategy(w3.b.f91619b);
        composeView.setContent(new z3.e(571961361, true, new m1(this, 19)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/e$a;", "", "<init>", "()V", "", "USER_CAN_CANCEL", "Ljava/lang/String;", "IS_FALL_DETECTION_EXTRA", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
