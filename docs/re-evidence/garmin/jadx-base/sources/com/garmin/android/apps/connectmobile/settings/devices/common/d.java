package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f42829a = new a(null);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.bike_alarm_setup, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Integer numValueOf;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        Integer numValueOf2 = null;
        Object obj = arguments != null ? arguments.get("CONNECTION_STATUS_KEY") : null;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view2.findViewById(R.id.bike_alarm_setup_lottie_view);
        TextView textView = (TextView) view2.findViewById(R.id.bike_alarm_setup_title);
        TextView textView2 = (TextView) view2.findViewById(R.id.bike_alarm_setup_description);
        if (s.g(obj, "DEVICE_NOT_CONNECTED")) {
            lottieAnimationView.setAnimation(R.raw.bike_alarm_device_not_connected);
            numValueOf2 = Integer.valueOf(R.string.bike_alarm_device_disconnected_title);
            numValueOf = Integer.valueOf(R.string.bike_alarm_device_disconnected_description);
        } else if (s.g(obj, "DEVICE_BIKE_ALARM_NOT_SETUP")) {
            lottieAnimationView.setAnimation(R.raw.bike_alarm_not_setup);
            numValueOf2 = Integer.valueOf(R.string.bike_alarm_set_pin_title);
            numValueOf = Integer.valueOf(R.string.bike_alarm_set_pin_description);
        } else {
            numValueOf = null;
        }
        if (numValueOf2 != null) {
            textView.setText(getString(numValueOf2.intValue()));
        }
        if (numValueOf != null) {
            textView2.setText(getString(numValueOf.intValue()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/d$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
