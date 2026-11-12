package com.xiaomi.hm.health.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.huami.lib.view.text.UnitTextView;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes22.dex */
public class ShareItemView extends RelativeLayout {
    private static final String d = "ShareItemView";
    private ImageView a;
    private TextView b;
    private UnitTextView c;

    public ShareItemView(Context context) {
        this(context, null);
    }

    private void a() {
        this.a = (ImageView) findViewById(R.id.icon);
        this.b = (TextView) findViewById(R.id.title);
        UnitTextView unitTextView = (UnitTextView) findViewById(R.id.unit_text);
        this.c = unitTextView;
        unitTextView.setTypeFace(HomeUtils.getMaisonTypeface());
    }

    public void bind(@DrawableRes int icon, String title, String firstValue, String firstUnit, String secondValue, String secondUnit) {
        String str;
        if (this.a != null) {
            str = "icon id : " + icon;
        } else {
            str = "view is null";
        }
        HMLog.d(d, str, new Object[0]);
        this.a.setImageResource(icon);
        this.b.setText(title);
        this.c.setValues(firstValue, firstUnit, secondValue, secondUnit);
    }

    public void bindFigure(@DrawableRes int icon, String title, String firstValue, float textSize) {
        this.a.setImageResource(icon);
        this.b.setText(title);
        this.c.setValues(firstValue, "");
        this.c.setValueSize(textSize);
    }

    public UnitTextView getUnitText() {
        return this.c;
    }

    public void setTitle(String title) {
        this.b.setText(title);
    }

    public ShareItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShareItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View.inflate(context, R.layout.view_share_item, this);
        a();
    }

    public void bind(@DrawableRes int icon, String title, String firstValue, String firstUnit) {
        this.a.setImageResource(icon);
        this.b.setText(title);
        this.c.setValues(firstValue, firstUnit);
    }

    public void bind(@DrawableRes int icon, String title, String firstValue) {
        this.a.setImageResource(icon);
        this.b.setText(title);
        this.c.setValues(firstValue, "");
    }
}
