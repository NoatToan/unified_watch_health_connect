package com.garmin.android.apps.connectmobile.segments.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/h;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f41449b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41450a = 2;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("BANNER_MODE")) {
            return;
        }
        this.f41450a = arguments.getInt("BANNER_MODE");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm_strava_segments_msg, viewGroup, false);
        if (this.f41450a == 1) {
            viewInflate.findViewById(R.id.strava_map_image).setBackgroundResource(2131231993);
            viewInflate.findViewById(R.id.strava_go_premium_container).setVisibility(8);
        }
        View viewFindViewById = viewInflate.findViewById(R.id.strava_app_button);
        viewFindViewById.getClass();
        ((Button) viewFindViewById).setOnClickListener(new a32.b(this, 24));
        TextView textView = (TextView) viewInflate.findViewById(R.id.text2_view);
        String string = getString(R.string.strava_beacon_marketing_msg);
        string.getClass();
        textView.setContentDescription(oi0.d.a(viewInflate.getContext(), string, new cg1.e(9)));
        return viewInflate;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/h$a;", "", "<init>", "()V", "", "STRAVA_ATHLETE_SEGMENTS_STARRED", "Ljava/lang/String;", "BANNER_MODE", "", "MODE_STRAVA_PREMIUM", "I", "MODE_STRAVA_NON_PREMIUM", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
