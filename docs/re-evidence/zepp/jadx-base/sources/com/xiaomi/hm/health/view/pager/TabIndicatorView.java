package com.xiaomi.hm.health.view.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import com.huami.reddot.RedDotManager;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes22.dex */
public class TabIndicatorView extends LinearLayout {
    private int a;
    private ImageView b;
    private TextView c;
    private View d;
    private View e;
    private TextView f;

    public TabIndicatorView(Context context) {
        this(context, null);
    }

    private void a() {
        b(false);
    }

    private void b(boolean showOverSea) {
        boolean z = this.d.getVisibility() == 0;
        if ((this.f.getVisibility() == 0) && z) {
            this.d.setVisibility(8);
        }
    }

    public int getIndex() {
        return this.a;
    }

    public boolean isShowingRedDot() {
        return this.d.getVisibility() == 0;
    }

    public boolean isShowingRedDotWithCount() {
        return this.f.getVisibility() == 0;
    }

    public void setImg(int resId) {
        this.b.setImageResource(resId);
    }

    public void setIndex(int index) {
        this.a = index;
    }

    public void setReDotVisible(boolean isShow) {
        this.d.setVisibility(isShow ? 0 : 8);
        a();
    }

    public void setReDotVisibleForSport(boolean isShow) {
        this.e.setVisibility(isShow ? 0 : 8);
    }

    public void setReDotVisibleOversea(boolean isShow) {
        this.d.setVisibility(isShow ? 0 : 8);
        b(true);
    }

    public void setReDotWithCountVisible(int count) {
        this.f.setVisibility(count > 0 ? 0 : 8);
        this.f.setText(RedDotManager.getManager().getRedDotCountStr(count));
        a();
    }

    public void setText(CharSequence text) {
        this.c.setText(text);
    }

    public TabIndicatorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.tab_item_view, this);
        this.b = (ImageView) findViewById(R.id.imageview);
        TextView textView = (TextView) findViewById(R.id.textview);
        this.c = textView;
        textView.setTextColor(AppCompatResources.getColorStateList(context, R.color.main_tab_item_selector));
        this.d = findViewById(R.id.red_dot);
        this.e = findViewById(R.id.red_dot_for_sport);
        this.f = (TextView) findViewById(R.id.tv_red_dot);
    }
}
