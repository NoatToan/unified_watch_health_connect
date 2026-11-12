package com.xiaomi.hm.health.relation.copy;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xiaomi.hm.health.relation.R;

/* JADX INFO: loaded from: classes21.dex */
public class DimPanelFragment extends DialogFragment {
    public boolean mCanceled = true;
    public boolean mCanceledOnTouchOutside = true;

    public static void showPanel(Activity activity, Class<? extends DialogFragment> cls, Bundle bundle) {
        ((DialogFragment) Fragment.instantiate(activity, cls.getName(), bundle)).show(activity.getFragmentManager().beginTransaction(), cls.getName());
    }

    public int inflateLayout() {
        return 0;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = R.style.RelativesDimPanel;
        if (SystemBarTintSupport.isSupport(getActivity())) {
            i = R.style.RelativesDimPanelTint;
        }
        setStyle(0, i);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(inflateLayout(), viewGroup, false);
        getDialog().setCanceledOnTouchOutside(this.mCanceledOnTouchOutside);
        getDialog().setCancelable(this.mCanceled);
        viewInflate.setFitsSystemWindows(true);
        return viewInflate;
    }
}
