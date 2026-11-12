package com.huawei.ui.homehealth.devicearkui.delegate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseViewDelegate {
    public final ComponentActivity activity;
    private View delegateView;

    public abstract View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public void onDestroy() {
    }

    public void setUserVisibleHint(boolean z) {
    }

    public BaseViewDelegate(ComponentActivity componentActivity) {
        this.activity = componentActivity;
    }

    public ComponentActivity getActivity() {
        return this.activity;
    }

    public final View obtainView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view = this.delegateView;
        if (view != null) {
            return view;
        }
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup);
        this.delegateView = viewOnCreateView;
        return viewOnCreateView;
    }
}
