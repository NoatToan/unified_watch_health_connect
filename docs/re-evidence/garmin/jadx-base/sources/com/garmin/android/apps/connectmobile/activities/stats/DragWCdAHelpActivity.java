package com.garmin.android.apps.connectmobile.activities.stats;

import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import aq.n;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSlidingTabLayout;

/* JADX INFO: loaded from: classes7.dex */
public class DragWCdAHelpActivity extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f29762c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager f29763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMSlidingTabLayout f29764b;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_drag_wcda_help);
        initActionBar(true, R.string.lbl_help);
        this.f29763a = (ViewPager) findViewById(R.id.drag_chart_zone_swipe_view_pager);
        this.f29764b = (GCMSlidingTabLayout) findViewById(R.id.drag_chart_help_sliding_tab_layout);
        this.f29763a.setAdapter(new n(getSupportFragmentManager()));
        this.f29764b.setViewPager(this.f29763a);
    }
}
