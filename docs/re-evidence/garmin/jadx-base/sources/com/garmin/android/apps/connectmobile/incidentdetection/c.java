package com.garmin.android.apps.connectmobile.incidentdetection;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import c62.m1;
import cd0.h0;
import com.garmin.android.apps.connectmobile.R;
import cq0.f;
import kotlin.w3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/c;", "Lcq0/c;", "<init>", "()V", "a", "", "Ll20/a;", "contacts", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends cq0.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f36851e = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f36852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36853d;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f36853d = arguments != null ? arguments.getBoolean("IS_FALL_DETECTION_EXTRA", false) : false;
        int i14 = getArguments() != null ? requireArguments().getInt("arg1", -1) : -1;
        if (i14 == -1) {
            return;
        }
        this.f36852c = (f) f.f55138j.get(i14);
    }

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
        this.f55120a = new Handler();
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        composeView.getClass();
        composeView.setVisibility(0);
        composeView.setViewCompositionStrategy(w3.b.f91619b);
        composeView.setContent(new z3.e(-1018923424, true, new m1(this, 18)));
        Handler handler = this.f55120a;
        if (handler != null) {
            handler.postDelayed(new h0(this, 25), 60000L);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/c$a;", "", "<init>", "()V", "", "IS_FALL_DETECTION_EXTRA", "Ljava/lang/String;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.incidentdetection.c$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0657a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f36854a;

            static {
                int[] iArr = new int[f.values().length];
                try {
                    iArr[f.FROM_GCM_CANCELLED_TIMER_NO_CONTACTS_NOTIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f.FROM_DEVICE_CANCELLED_COUNTDOWN_TIMER_NO_CONTACTS_NOTIFIED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[f.FROM_GCM_I_AM_OKAY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[f.FROM_DEVICE_I_AM_OKAY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[f.FROM_DEVICE_FINISH_UNKNOWN_COMMUNICATION.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[f.FROM_GCM_I_AM_OKAY_TIMER_EXPIRED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[f.FROM_GCM_UNABLE_TO_NOTIFY_EMERGENCY_CONTACTS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f36854a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
