package com.huami.lib.view.scroll;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.huami.lib.view.R;

/* JADX INFO: loaded from: classes10.dex */
public class HMExpandHeadView extends RelativeLayout {
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
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.hm_expand_head_view, this);
        this.b = (ImageView) viewInflate.findViewById(R.id.layout_bg);
        this.a = (RelativeLayout) viewInflate.findViewById(R.id.layout_container);
        this.b.setBackground(getBackground());
    }
}
