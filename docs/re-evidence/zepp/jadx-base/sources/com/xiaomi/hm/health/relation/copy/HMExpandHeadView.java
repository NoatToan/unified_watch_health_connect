package com.xiaomi.hm.health.relation.copy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.relation.R;

/* JADX INFO: loaded from: classes21.dex */
public class HMExpandHeadView extends RelativeLayout {
    private static final String c = HMExpandHeadView.class.getSimpleName();
    private RelativeLayout a;
    private ImageView b;

    public HMExpandHeadView(Context context) {
        super(context);
    }

    public ImageView getBackgroundImage() {
        return this.b;
    }

    public void zoom(float f, int i) {
        this.b.setScaleX(f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.height = i;
        setLayoutParams(marginLayoutParams);
    }

    public HMExpandHeadView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.relatives_hm_expand_head_view, this);
        this.b = (ImageView) viewInflate.findViewById(R.id.layout_bg);
        this.a = (RelativeLayout) viewInflate.findViewById(R.id.layout_container);
        this.b.setBackground(getBackground());
    }
}
