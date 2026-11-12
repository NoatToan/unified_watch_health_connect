package com.huami.watch.companion.firstbeat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.DeviceManager;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseFirstbeatFragment extends Fragment {
    public boolean mShowUpdateToast = true;
    public boolean mExistData = false;
    public boolean mBindedEverest = false;

    private void b() {
        this.mExistData = isExistData();
        this.mBindedEverest = DeviceManager.getManager(getContext()).isBindedEverest();
    }

    public abstract int getLayout();

    public abstract void initView(View view);

    public boolean isExistData() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(getLayout(), viewGroup, false);
        b();
        initView(viewInflate);
        updateTips();
        return viewInflate;
    }

    public void showUpdateToast() {
        if (this.mShowUpdateToast) {
            Toast.makeText(getContext(), R.string.not_support_firstbeat_update, 0).show();
            this.mShowUpdateToast = false;
        }
    }

    public void updateTips() {
    }
}
