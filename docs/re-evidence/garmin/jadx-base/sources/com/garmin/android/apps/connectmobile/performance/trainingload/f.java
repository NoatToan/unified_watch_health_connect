package com.garmin.android.apps.connectmobile.performance.trainingload;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.SwipeViewPager;
import com.google.android.material.tabs.TabLayout;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/f;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40244a = new a(null);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm4_tab_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Intent intent;
        Bundle extras;
        m activity;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        SwipeViewPager swipeViewPager = (SwipeViewPager) view2.findViewById(R.id.view_pager);
        int i14 = 0;
        swipeViewPager.setSwipeEnabled(false);
        v fragmentManager = getFragmentManager();
        String string = null;
        g gVar = (fragmentManager == null || (activity = getActivity()) == null) ? null : new g(activity, fragmentManager);
        if (gVar != null) {
            swipeViewPager.setAdapter(gVar);
            ((TabLayout) view2.findViewById(R.id.tab_layout)).setupWithViewPager(swipeViewPager);
        }
        m activity2 = getActivity();
        if (activity2 != null && (intent = activity2.getIntent()) != null && (extras = intent.getExtras()) != null) {
            string = extras.getString("EXTRA_NAVIGATION_DESTINATION");
        }
        if (string != null && string.hashCode() == 1447574838 && string.equals("TRAINING_LOAD_DEST")) {
            i14 = 2;
        }
        swipeViewPager.setCurrentItem(i14);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/f$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
