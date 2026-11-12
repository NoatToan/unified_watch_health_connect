package com.garmin.android.apps.connectmobile.calendar.presentation;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.m0;
import com.roomorama.caldroid.CaldroidGridAdapter;
import ey.w;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GridView f31139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GridView f31140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CaldroidGridAdapter f31141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f31142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ey.a f31143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m0 f31144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f31147i;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        GridView gridView;
        GridView gridView2;
        GridView gridView3;
        CaldroidGridAdapter caldroidGridAdapter;
        layoutInflater.getClass();
        if (this.f31145g == 0) {
            this.f31145g = R.layout.date_grid_fragment;
        }
        if (this.f31146h == 0 && (caldroidGridAdapter = this.f31141c) != null) {
            this.f31146h = caldroidGridAdapter.getThemeResource();
        }
        View view2 = this.f31147i;
        if (view2 == null || this.f31140b == null || this.f31139a == null) {
            a.C0496a c0496a = a.D;
            m activity = getActivity();
            int i14 = this.f31146h;
            c0496a.getClass();
            LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(activity, i14));
            layoutInflaterCloneInContext.getClass();
            View viewInflate = layoutInflaterCloneInContext.inflate(this.f31145g, viewGroup, false);
            this.f31147i = viewInflate;
            View viewFindViewById = viewInflate != null ? viewInflate.findViewById(R.id.weekday_gridview) : null;
            viewFindViewById.getClass();
            this.f31139a = (GridView) viewFindViewById;
            View view3 = this.f31147i;
            View viewFindViewById2 = view3 != null ? view3.findViewById(R.id.calendar_gridview) : null;
            viewFindViewById2.getClass();
            GridView gridView4 = (GridView) viewFindViewById2;
            this.f31140b = gridView4;
            CaldroidGridAdapter caldroidGridAdapter2 = this.f31141c;
            if (caldroidGridAdapter2 != null) {
                gridView4.setAdapter((ListAdapter) caldroidGridAdapter2);
            }
            ey.a aVar = this.f31143e;
            if (aVar != null && (gridView3 = this.f31140b) != null) {
                gridView3.setOnItemClickListener(aVar);
            }
            m0 m0Var = this.f31144f;
            if (m0Var != null && (gridView2 = this.f31140b) != null) {
                gridView2.setOnItemLongClickListener(m0Var);
            }
            w wVar = this.f31142d;
            if (wVar != null && (gridView = this.f31139a) != null) {
                gridView.setAdapter((ListAdapter) wVar);
            }
        } else {
            ViewParent parent = view2.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f31147i);
            }
        }
        return this.f31147i;
    }
}
