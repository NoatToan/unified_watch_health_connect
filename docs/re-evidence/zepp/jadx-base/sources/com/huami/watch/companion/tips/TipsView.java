package com.huami.watch.companion.tips;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class TipsView extends BaseTipView<TipsView> implements ITipAction {
    private ImageView e;
    private TextView f;
    private TextView g;
    private ImageView h;
    private ImageView i;
    private View j;

    public TipsView(@NonNull Context context) {
        super(context);
    }

    @Override // com.huami.watch.companion.tips.BaseTipView
    public void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.tip_normal, (ViewGroup) this, true);
        this.j = findViewById(R.id.rlyt_tip_container);
        this.e = (ImageView) findViewById(R.id.iv_tips_left_img);
        this.f = (TextView) findViewById(R.id.tv_tips_title);
        this.g = (TextView) findViewById(R.id.tv_tips_info);
        this.h = (ImageView) findViewById(R.id.iv_tips_right_img);
        this.i = (ImageView) findViewById(R.id.iv_tips_right_bottom_img);
    }

    public TipsView setBgColor(@ColorRes int i) {
        this.j.setBackgroundColor(getResources().getColor(i));
        return this;
    }

    public TipsView setInfo(@StringRes int i) {
        this.g.setText(i);
        return this;
    }

    public TipsView setLeftImg(@DrawableRes int i) {
        this.e.setImageResource(i);
        return this;
    }

    public TipsView setOnRightBottomImgClickListener(@Nullable View.OnClickListener onClickListener) {
        this.i.setOnClickListener(onClickListener);
        return this;
    }

    public TipsView setOnRightImgClickListener(@Nullable View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
        return this;
    }

    public TipsView setRightBottomImg(@DrawableRes int i) {
        this.i.setImageResource(i);
        this.i.setVisibility(0);
        return this;
    }

    public TipsView setRightBottomImgVisible(int i) {
        this.i.setVisibility(i);
        return this;
    }

    public TipsView setRightImg(@DrawableRes int i) {
        this.h.setImageResource(i);
        return this;
    }

    public TipsView setTitle(@StringRes int i) {
        this.f.setText(i);
        return this;
    }

    public TipsView setInfo(String str) {
        this.g.setText(str);
        return this;
    }

    public TipsView setTitle(String str) {
        this.f.setText(str);
        return this;
    }
}
