package com.roomorama.caldroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes3.dex */
public class DateGridFragment extends Fragment {
    private CaldroidGridAdapter gridAdapter;
    private GridView gridView;
    private AdapterView.OnItemClickListener onItemClickListener;
    private AdapterView.OnItemLongClickListener onItemLongClickListener;
    private int gridViewRes = 0;
    private int themeResource = 0;

    private void setupGridView() {
        CaldroidGridAdapter caldroidGridAdapter = this.gridAdapter;
        if (caldroidGridAdapter != null) {
            this.gridView.setAdapter((ListAdapter) caldroidGridAdapter);
        }
        AdapterView.OnItemClickListener onItemClickListener = this.onItemClickListener;
        if (onItemClickListener != null) {
            this.gridView.setOnItemClickListener(onItemClickListener);
        }
        AdapterView.OnItemLongClickListener onItemLongClickListener = this.onItemLongClickListener;
        if (onItemLongClickListener != null) {
            this.gridView.setOnItemLongClickListener(onItemLongClickListener);
        }
    }

    public CaldroidGridAdapter getGridAdapter() {
        return this.gridAdapter;
    }

    public GridView getGridView() {
        return this.gridView;
    }

    public AdapterView.OnItemClickListener getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public AdapterView.OnItemLongClickListener getOnItemLongClickListener() {
        return this.onItemLongClickListener;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CaldroidGridAdapter caldroidGridAdapter;
        if (this.gridViewRes == 0) {
            this.gridViewRes = R.layout.date_grid_fragment;
        }
        if (this.themeResource == 0 && (caldroidGridAdapter = this.gridAdapter) != null) {
            this.themeResource = caldroidGridAdapter.getThemeResource();
        }
        GridView gridView = this.gridView;
        if (gridView == null) {
            this.gridView = (GridView) CaldroidFragment.getLayoutInflater(getActivity(), layoutInflater, this.themeResource).inflate(this.gridViewRes, viewGroup, false);
            setupGridView();
        } else {
            ViewGroup viewGroup2 = (ViewGroup) gridView.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.gridView);
            }
        }
        return this.gridView;
    }

    public void setGridAdapter(CaldroidGridAdapter caldroidGridAdapter) {
        this.gridAdapter = caldroidGridAdapter;
    }

    public void setGridViewRes(int i14) {
        this.gridViewRes = i14;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.onItemLongClickListener = onItemLongClickListener;
    }
}
