package com.garmin.android.apps.connectmobile.segments.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import java.util.Arrays;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f41436b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41437a;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f41437a = (arguments == null || !arguments.containsKey("STARTUP_MODE")) ? -1 : arguments.getInt("STARTUP_MODE");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm4_strava_consent_parent, viewGroup, false);
        ((FrameLayout) viewInflate.findViewById(R.id.strava_screen_container)).addView(layoutInflater.inflate(R.layout.gcm_strava_marketing_layout, viewGroup, false));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(R.id.strava_marketing_banner);
        if (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f()) {
            relativeLayout.setVisibility(8);
            return;
        }
        TextView textView = (TextView) view2.findViewById(R.id.text3_view);
        String string = getString(R.string.strava_beacon_marketing_msg);
        string.getClass();
        x0 x0Var = x0.f105818a;
        textView.setText(String.format("%s%s", Arrays.copyOf(new Object[]{string, Marker.ANY_MARKER}, 2)));
        textView.setContentDescription(oi0.d.a(view2.getContext(), string, new cg1.e(3)));
        if (this.f41437a != -1) {
            relativeLayout.setVisibility(8);
        } else {
            relativeLayout.setVisibility(0);
        }
        ((Button) view2.findViewById(R.id.strava_connect_button)).setOnClickListener(new a32.b(this, 23));
        TextView textView2 = (TextView) view2.findViewById(R.id.text2_view);
        String string2 = getString(R.string.strava_strava_live_segments_marketing_msg);
        string2.getClass();
        textView2.setContentDescription(u.v(string2, Marker.ANY_MARKER, "", false));
        TextView textView3 = (TextView) view2.findViewById(R.id.text4_view);
        String string3 = getString(R.string.strava_requires_subscription_lbl);
        string3.getClass();
        textView3.setContentDescription(u.v(string3, Marker.ANY_MARKER, "", false));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/d$a;", "", "<init>", "()V", "", "EXISTING_STRAVA_USER_MODE", "I", "", "STARTUP_MODE", "Ljava/lang/String;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
