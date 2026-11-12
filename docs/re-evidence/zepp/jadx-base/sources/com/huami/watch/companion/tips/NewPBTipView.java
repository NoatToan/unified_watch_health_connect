package com.huami.watch.companion.tips;

import android.content.Context;
import androidx.annotation.NonNull;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class NewPBTipView extends UpgradeTipView {
    public NewPBTipView(@NonNull Context context) {
        super(context);
    }

    @Override // com.huami.watch.companion.tips.UpgradeTipView, com.huami.watch.companion.tips.BaseTipView
    public void init() {
        super.init();
        this.mTipsLeftImg.setImageResource(R.drawable.ic_tips_pb);
        this.mTipsTitle.setText(this.mContext.getString(R.string.tip_new_pb_title));
        this.mTipsInfo.setText(this.mContext.getString(R.string.tip_new_pb_info));
        this.mUpgradeBtn.setText(this.mContext.getString(R.string.tip_new_pb_to_confirmed));
        this.mSkipBtn.setText(this.mContext.getString(R.string.tip_new_pb_later));
    }
}
