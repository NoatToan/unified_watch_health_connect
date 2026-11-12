package com.huami.moving.maps.google;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.SupportMapFragment;

/* JADX INFO: loaded from: classes11.dex */
public class MapFragmentWrapper extends SupportMapFragment {
    private View b;
    private TouchableWrapper c;

    public static MapFragmentWrapper newInstance() {
        return new MapFragmentWrapper();
    }

    @Override // androidx.fragment.app.Fragment
    public View getView() {
        return this.b;
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b = super.onCreateView(layoutInflater, viewGroup, bundle);
        TouchableWrapper touchableWrapper = new TouchableWrapper(getActivity());
        this.c = touchableWrapper;
        touchableWrapper.addView(this.b);
        return this.c;
    }

    public void setListener(TouchableWrapper.OnDragListener onDragListener) {
        TouchableWrapper touchableWrapper = this.c;
        if (touchableWrapper != null) {
            touchableWrapper.setListener(onDragListener);
        }
    }
}
