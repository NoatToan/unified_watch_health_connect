package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.scrollview.HealthBottomView;
import com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView;
import defpackage.jho;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class PersonalizedTrackFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f11055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DynamicTrackActivity f11056b;
    private HealthBottomView e;
    private View f;
    private View g;
    private View h;
    private View i;
    private LinearLayout j;
    private int k;
    private LinearLayout l;
    private Rect m;
    private View n;
    private LinearLayout o;
    private LinearLayout s;
    private LinearLayout t;
    private int d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11057c = false;

    public void b(int i) {
        this.k = i;
    }

    public void e(boolean z) {
        this.f11057c = z;
        b();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f11055a = getActivity();
        if (getActivity() instanceof DynamicTrackActivity) {
            this.f11056b = (DynamicTrackActivity) getActivity();
        }
        return layoutInflater.inflate(R.layout.fragment_track_personalized, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.n = view;
        this.e = (HealthBottomView) view.findViewById(R.id.dynamic_track_personalized_tabs);
        this.h = view.findViewById(R.id.dynamic_track_album);
        this.f = view.findViewById(R.id.map_dialog_layout);
        this.g = view.findViewById(R.id.dynamic_track_music);
        this.i = view.findViewById(R.id.dynamic_track_playback_view);
        this.f11056b.initAlbumView(this.h);
        this.f11056b.initMapTypeLayout(this.f);
        this.f11056b.initViewSelectLayout(this.i);
        h();
        this.f11056b.getWindow().setSoftInputMode(18);
        this.f11056b.getWindow().setGravity(80);
        this.f11056b.getWindow().setDimAmount(0.0f);
        g();
        this.t = (LinearLayout) view.findViewById(R.id.track_tab_mark_layer_layout);
        if (!this.f11057c) {
            b(this.n);
        }
        this.m = new Rect();
        final View viewFindViewById = this.h.findViewById(R.id.track_album_soft_input_view);
        final ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        view.findViewById(R.id.fragment_personalized_container).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: jnt
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f38760c.d(layoutParams, viewFindViewById);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(ViewGroup.LayoutParams layoutParams, View view) {
        int height = this.f11056b.getWindow().getDecorView().getHeight();
        this.f11056b.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.m);
        int i = height - this.m.bottom;
        if (i > height / 4) {
            this.f11056b.d(true);
            this.t.setVisibility(0);
            layoutParams.height = i - this.e.getMeasuredHeight();
            view.setVisibility(0);
            view.setLayoutParams(layoutParams);
            return;
        }
        this.f11056b.d(false);
        jho.c((Activity) this.f11056b);
        view.setVisibility(8);
        if (this.f11055a.getSharedPreferences("retrack_file", 0).getBoolean("has_use_personalized_map", false)) {
            this.t.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view) {
        Drawable drawable;
        if (this.f11055a.getSharedPreferences("retrack_file", 0).getBoolean("has_use_personalized_map", false)) {
            LogUtil.a("Track_PersonalizedTrackFragment", "[handleGuideVisible] has click guide.");
            return;
        }
        View view2 = this.h;
        if (view2 == null || view == null) {
            LogUtil.e("Track_PersonalizedTrackFragment", "[handleGuideVisible] view is null.");
            return;
        }
        this.s = (LinearLayout) view2.findViewById(R.id.track_album_tip_layout);
        this.j = (LinearLayout) this.h.findViewById(R.id.track_album_mark_layer);
        this.o = (LinearLayout) view.findViewById(R.id.track_save_mark_layer);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.track_save_tip_layout);
        this.l = linearLayout;
        if (LanguageUtil.ba(this.f11055a)) {
            drawable = this.f11055a.getResources().getDrawable(R.drawable.ic_album_tip_up_left);
        } else {
            drawable = this.f11055a.getResources().getDrawable(R.drawable.ic_album_tip_up_right);
        }
        linearLayout.setBackground(drawable);
        ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin += this.k;
            this.l.setLayoutParams(layoutParams2);
        }
        this.s.setVisibility(0);
        this.j.setVisibility(0);
        this.t.setVisibility(0);
        this.l.setVisibility(8);
        this.o.setVisibility(8);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: jnq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.d.a(view3);
            }
        };
        this.j.setOnClickListener(onClickListener);
        this.h.findViewById(R.id.track_album_tip_got_it).setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: jnu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.e.d(view3);
            }
        };
        this.o.setOnClickListener(onClickListener2);
        view.findViewById(R.id.save_tip_got_it).setOnClickListener(onClickListener2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.s.setVisibility(8);
        this.j.setVisibility(8);
        this.l.setVisibility(0);
        this.o.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.l.setVisibility(8);
        this.o.setVisibility(8);
        this.t.setVisibility(8);
        j();
    }

    private void j() {
        SharedPreferences.Editor editorEdit = this.f11055a.getSharedPreferences("retrack_file", 0).edit();
        editorEdit.putBoolean("has_use_personalized_map", true);
        editorEdit.commit();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        jho.c((Activity) this.f11056b);
        c();
        this.f11056b.i();
    }

    private void g() {
        this.e.setBottomNavListener(new HwBottomNavigationView.BottomNavListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.PersonalizedTrackFragment.5
            @Override // com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavListener
            public void onBottomNavItemReselected(MenuItem menuItem, int i) {
            }

            @Override // com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavListener
            public void onBottomNavItemUnselected(MenuItem menuItem, int i) {
            }

            @Override // com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavListener
            public void onBottomNavItemSelected(MenuItem menuItem, int i) {
                ReleaseLogUtil.d("Track_PersonalizedTrackFragment", "tab view choose with ", Integer.valueOf(i));
                PersonalizedTrackFragment.this.d = i;
                PersonalizedTrackFragment.this.c();
                if (i == 0) {
                    PersonalizedTrackFragment.this.h.setVisibility(0);
                    if (PersonalizedTrackFragment.this.f11057c) {
                        PersonalizedTrackFragment personalizedTrackFragment = PersonalizedTrackFragment.this;
                        personalizedTrackFragment.b(personalizedTrackFragment.n);
                    }
                    PersonalizedTrackFragment personalizedTrackFragment2 = PersonalizedTrackFragment.this;
                    personalizedTrackFragment2.a(personalizedTrackFragment2.f, PersonalizedTrackFragment.this.g, PersonalizedTrackFragment.this.i);
                    PersonalizedTrackFragment.this.f11056b.c("common");
                    return;
                }
                if (i == 1) {
                    PersonalizedTrackFragment.this.f.setVisibility(0);
                    PersonalizedTrackFragment personalizedTrackFragment3 = PersonalizedTrackFragment.this;
                    personalizedTrackFragment3.a(personalizedTrackFragment3.h, PersonalizedTrackFragment.this.g, PersonalizedTrackFragment.this.i);
                    PersonalizedTrackFragment.this.f11056b.c("mapPage");
                    return;
                }
                if (i == 2) {
                    PersonalizedTrackFragment.this.g.setVisibility(0);
                    PersonalizedTrackFragment.this.f11056b.chooseMusic(PersonalizedTrackFragment.this.g);
                    PersonalizedTrackFragment personalizedTrackFragment4 = PersonalizedTrackFragment.this;
                    personalizedTrackFragment4.a(personalizedTrackFragment4.h, PersonalizedTrackFragment.this.f, PersonalizedTrackFragment.this.i);
                    PersonalizedTrackFragment.this.f11056b.c("musicPage");
                    return;
                }
                if (i != 3) {
                    ReleaseLogUtil.a("Track_PersonalizedTrackFragment", "[onBottomNavItemSelected] item is not find.");
                    return;
                }
                PersonalizedTrackFragment.this.i.setVisibility(0);
                PersonalizedTrackFragment personalizedTrackFragment5 = PersonalizedTrackFragment.this;
                personalizedTrackFragment5.a(personalizedTrackFragment5.h, PersonalizedTrackFragment.this.f, PersonalizedTrackFragment.this.g);
                PersonalizedTrackFragment.this.f11056b.c("playAngle");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, View view2, View view3) {
        e(view);
        e(view2);
        e(view3);
    }

    private void e(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void h() {
        this.e.a();
        e(R.string.IDS_track_tab_great_moments, LanguageUtil.ba(this.f11055a) ? R.drawable.track_moments_tab_selector_mirror : R.drawable.track_moments_tab_selector);
        e(R.string.IDS_track_tab_map_style, R.drawable.track_map_tab_selector);
        e(R.string.IDS_track_tab_music, R.drawable.track_music_tab_selector);
        e(R.string.IDS_track_tab_playback_view, LanguageUtil.ba(this.f11055a) ? R.drawable.track_direction_tab_selector_mirror : R.drawable.track_direction_tab_selector);
        b();
        c();
    }

    private void b() {
        HealthBottomView healthBottomView = this.e;
        if (healthBottomView == null || this.f == null) {
            LogUtil.j("Track_PersonalizedTrackFragment", "initPremiumEditionView: view is null");
            return;
        }
        if (!this.f11057c) {
            healthBottomView.setItemChecked(0);
            this.d = 0;
            return;
        }
        healthBottomView.setItemChecked(1);
        this.d = 1;
        this.f.setVisibility(0);
        e(this.h);
        e(this.g);
        e(this.i);
    }

    private void e(int i, int i2) {
        this.e.a(i, this.f11055a.getResources().getDrawable(i2), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f11056b.c()) {
            a();
        }
        d();
        e();
    }

    private void a() {
        DynamicTrackActivity dynamicTrackActivity = this.f11056b;
        if (dynamicTrackActivity == null) {
            LogUtil.j("Track_PersonalizedTrackFragment", "changeLineStatus activity is null");
        } else if (this.d == 0) {
            dynamicTrackActivity.f();
        } else {
            dynamicTrackActivity.h();
        }
    }

    private void d() {
        DynamicTrackActivity dynamicTrackActivity = this.f11056b;
        if (dynamicTrackActivity == null) {
            LogUtil.j("Track_PersonalizedTrackFragment", "changeLineStatus activity is null");
        } else if (this.d != 2) {
            dynamicTrackActivity.j();
        } else {
            dynamicTrackActivity.g();
        }
    }

    private void e() {
        DynamicTrackActivity dynamicTrackActivity = this.f11056b;
        if (dynamicTrackActivity == null) {
            LogUtil.j("Track_PersonalizedTrackFragment", "changeLineStatus activity is null");
        } else if (this.d == 1) {
            dynamicTrackActivity.d();
        }
    }
}
