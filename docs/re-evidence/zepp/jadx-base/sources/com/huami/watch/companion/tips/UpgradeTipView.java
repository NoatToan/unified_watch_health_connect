package com.huami.watch.companion.tips;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class UpgradeTipView extends BaseTipView<UpgradeTipView> implements ITipAction {
    public TextView mSkipBtn;
    public ImageView mTipRightImg;
    public TextView mTipsInfo;
    public ImageView mTipsLeftImg;
    public TextView mTipsTitle;
    public TextView mUpgradeBtn;

    public UpgradeTipView(@NonNull Context context) {
        super(context);
    }

    @Override // com.huami.watch.companion.tips.BaseTipView
    public void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.tip_upgrade, (ViewGroup) this, true);
        this.mTipsLeftImg = (ImageView) findViewById(R.id.iv_tips_left_img);
        this.mTipsTitle = (TextView) findViewById(R.id.tv_tips_title);
        this.mTipsInfo = (TextView) findViewById(R.id.tv_tips_info);
        this.mTipRightImg = (ImageView) findViewById(R.id.iv_tips_right_img);
        this.mUpgradeBtn = (TextView) findViewById(R.id.btn_tip_upgrade);
        this.mSkipBtn = (TextView) findViewById(R.id.btn_tip_skip);
        this.mTipsInfo.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    public UpgradeTipView setInfo(@StringRes int i) {
        this.mTipsInfo.setText(i);
        return this;
    }

    public UpgradeTipView setOnRightImgClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mTipRightImg.setOnClickListener(onClickListener);
        return this;
    }

    public UpgradeTipView setOnSkipClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mSkipBtn.setOnClickListener(onClickListener);
        return this;
    }

    public UpgradeTipView setOnUpgradeClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mUpgradeBtn.setOnClickListener(onClickListener);
        return this;
    }

    public UpgradeTipView setTitle(@StringRes int i) {
        this.mTipsTitle.setText(i);
        return this;
    }

    public UpgradeTipView setInfo(String str) {
        this.mTipsInfo.setText(str);
        return this;
    }
}
