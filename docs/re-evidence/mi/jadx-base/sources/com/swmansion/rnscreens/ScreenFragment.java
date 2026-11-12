package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import defpackage.ngl;

/* JADX INFO: loaded from: classes6.dex */
public class ScreenFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Screen f10667a;

    public ScreenFragment() {
        throw new IllegalStateException("Screen fragments should never be restored");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f10667a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((UIManagerModule) ((ReactContext) this.f10667a.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new ngl(this.f10667a.getId()));
    }

    public Screen s() {
        return this.f10667a;
    }

    @SuppressLint({"ValidFragment"})
    public ScreenFragment(Screen screen) {
        this.f10667a = screen;
    }
}
