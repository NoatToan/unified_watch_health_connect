package com.garmin.android.apps.connectmobile.segments.presentation.leaderboard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.m0;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMNestedScrollView;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/leaderboard/b;", "Lcom/garmin/android/apps/connectmobile/m0;", "<init>", "()V", "b", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends m0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f41501p = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f41503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GCMNestedScrollView f41504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f41505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f41506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SegmentLeaderboardDTO f41507m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC0789b f41508n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f41509o;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.b$b, reason: collision with other inner class name */
    public interface InterfaceC0789b {
        void A0();

        void w0();
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/segments/presentation/leaderboard/b$c", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMNestedScrollView$a;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements GCMNestedScrollView.a {
        public c() {
        }

        @Override // com.garmin.android.apps.connectmobile.view.view_3_0.GCMNestedScrollView.a
        public final void a() {
            InterfaceC0789b interfaceC0789b = b.this.f41508n;
            interfaceC0789b.getClass();
            interfaceC0789b.A0();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        InterfaceC0789b interfaceC0789b = this.f41508n;
        interfaceC0789b.getClass();
        interfaceC0789b.w0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        F6(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f41508n = (InterfaceC0789b) context;
        } catch (ClassCastException unused) {
            p6.b.m(context, InterfaceC0789b.class.getName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f41502h = arguments.getInt("GCM_extra_activity_type");
            this.f41503i = arguments.getDouble("GCM_extra_segment_distance");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.gcm3_segment_leaderboard_fragment);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.segment_leaderboard_container);
        viewFindViewById.getClass();
        this.f41504j = (GCMNestedScrollView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.segment_leaderboard_error_label);
        viewFindViewById2.getClass();
        this.f41505k = (TextView) viewFindViewById2;
        this.f41509o = (TextView) view2.findViewById(R.id.empty_view);
        this.f41506l = (ImageView) view2.findViewById(R.id.segments_landscape_icon);
        GCMNestedScrollView gCMNestedScrollView = this.f41504j;
        if (gCMNestedScrollView != null) {
            gCMNestedScrollView.setOnBottomReachedListener(new c());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/leaderboard/b$a;", "", "<init>", "()V", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
