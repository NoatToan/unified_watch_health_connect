package com.xiaomi.fitness.sport_eco.baseui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.of4;
import defpackage.v84;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class SportGoalBaseFragment extends Fragment {
    public static final String KEY_PARAM1 = "key_param1";
    public static final String KEY_PARAM2 = "key_param2";
    public static final String KEY_PARAM3 = "key_param3";
    public View rootView = null;
    protected FragmentActivity mActivity = null;
    protected boolean isPrepared = false;
    protected boolean isVisible = false;
    protected boolean isFirstVisible = true;
    protected boolean isNeedAwaysToRefresh = false;
    protected boolean isStatusBarFontBlack = true;
    protected boolean isStatusBarFontNeedSet = true;
    protected int sportType = 1;
    protected int sportGoal = -1;
    protected int deviceType = 0;

    public void createView(View view, ViewGroup viewGroup) {
    }

    public void finish() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        activity.finish();
    }

    public View getTitleBar() {
        return null;
    }

    public abstract void initView(View view);

    public boolean isNeedPageStat() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public boolean onBackPressed() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.rootView;
        if (view != null) {
            ViewGroup viewGroup2 = (ViewGroup) view.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.rootView);
            }
        } else {
            View viewInflate = layoutInflater.inflate(setLayoutResourceId(), viewGroup, false);
            this.rootView = viewInflate;
            createView(viewInflate, viewGroup);
        }
        return this.rootView;
    }

    public void onLeftImageClick() {
        if (onBackPressed()) {
            return;
        }
        getActivity().finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    public void onRightButtonClick() {
    }

    public void onRightImageClick() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (of4.f29101b == 0) {
            of4.f29101b = DisplayUtil.getStatusBarHeight();
        }
        View titleBar = getTitleBar();
        if (titleBar != null) {
            v84.i(titleBar, 0, of4.f29101b, 0, 0);
        }
        if (titleBar instanceof TitleBar) {
            TitleBar titleBar2 = (TitleBar) titleBar;
            if (titleBar2.b()) {
                titleBar2.f(new TitleBar.d() { // from class: wmn
                    @Override // com.xiaomi.fitness.sport_eco.baseui.TitleBar.d
                    public final void a() {
                        this.f38136a.onLeftImageClick();
                    }
                });
            }
            if (titleBar2.d()) {
                titleBar2.h(new TitleBar.f() { // from class: ymn
                    @Override // com.xiaomi.fitness.sport_eco.baseui.TitleBar.f
                    public final void a() {
                        this.f40336a.onRightImageClick();
                    }
                });
            }
            if (titleBar2.c()) {
                titleBar2.g(new TitleBar.e() { // from class: ann
                    @Override // com.xiaomi.fitness.sport_eco.baseui.TitleBar.e
                    public final void a() {
                        this.f3290a.onRightButtonClick();
                    }
                });
            }
            if (showTitleLine()) {
                titleBar2.m(true);
            }
        }
        initView(view);
        setListener();
        this.isPrepared = true;
    }

    public void onVisible() {
        if (this.isStatusBarFontNeedSet) {
            DisplayUtil.setStatusBarFontColor(this.mActivity, this.isStatusBarFontBlack);
        }
    }

    public abstract int setLayoutResourceId();

    public void setListener() {
    }

    public void setStatusBarColor2(int i) {
        Window window = this.mActivity.getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i);
    }

    public boolean showTitleLine() {
        return false;
    }
}
