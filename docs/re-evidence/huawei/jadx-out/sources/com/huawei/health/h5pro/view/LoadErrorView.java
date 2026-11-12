package com.huawei.health.h5pro.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.health.h5pro.core.H5ProWebViewActivity;
import com.huawei.health.h5pro.core.R;
import com.huawei.health.h5pro.utils.H5ProNetworkUtil;
import com.huawei.uikit.phone.hwbutton.widget.HwButton;

/* JADX INFO: loaded from: classes7.dex */
public class LoadErrorView extends RelativeLayout {
    public LoadErrorView(Context context) {
        super(context);
        b(context);
    }

    private void b(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.load_fail, (ViewGroup) this, true);
        if (H5ProNetworkUtil.isNetworkAvailable(context)) {
            return;
        }
        e(viewInflate);
    }

    private void e(View view) {
        ((TextView) view.findViewById(R.id.error_tip)).setText(R.string.IDS_hwh_home_healthshop_no_net_work_pls_click_again);
        if (getActivity() instanceof H5ProWebViewActivity) {
            HwButton hwButton = (HwButton) view.findViewById(R.id.setting_button);
            hwButton.setVisibility(0);
            hwButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.h5pro.view.LoadErrorView.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    LoadErrorView.this.getContext().startActivity(new Intent("android.settings.SETTINGS"));
                }
            });
        }
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
