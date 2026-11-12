package com.huawei.ui.homehealth.operamsgcard;

import android.content.Context;
import android.view.View;
import android.widget.ViewFlipper;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;

/* JADX INFO: loaded from: classes17.dex */
public class OperaMsgCardViewHolder extends CardViewHolder {
    public ViewFlipper d;

    public OperaMsgCardViewHolder(View view, Context context, boolean z) {
        super(view, context, z);
        ViewFlipper viewFlipper = (ViewFlipper) view.findViewById(R.id.opera_msg_flipper);
        this.d = viewFlipper;
        BaseActivity.setViewSafeRegion(true, viewFlipper);
    }
}
