package com.huawei.ui.commonui.errortip;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class NetworkErrorTipBar extends ErrorTipBar {
    public NetworkErrorTipBar(Context context) {
        super(context);
        c(context);
    }

    public NetworkErrorTipBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        c(context);
    }

    public NetworkErrorTipBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context);
    }

    private void c(Context context) {
        d();
        setJumpSetting(context);
    }

    private void d() {
        setTipText(R.string.IDS_hwh_home_group_network_disconnection);
        setLeadBtnText(R.string.IDS_hwh_home_healthshop_setting_net_work);
    }

    private void setJumpSetting(final Context context) {
        setOnClicked(new View.OnClickListener() { // from class: com.huawei.ui.commonui.errortip.NetworkErrorTipBar.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    context.startActivity(new Intent("android.settings.SETTINGS"));
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("NetworkErrorTipBar", "ActivityNotFoundException", e.getMessage());
                }
            }
        });
    }
}
