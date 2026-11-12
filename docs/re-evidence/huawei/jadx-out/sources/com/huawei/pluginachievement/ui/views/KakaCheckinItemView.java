package com.huawei.pluginachievement.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.pluginachievement.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.UnitUtil;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes13.dex */
public class KakaCheckinItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f22288a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22289c;
    private Context d;
    private HealthTextView e;

    public KakaCheckinItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = context;
        c();
    }

    private void c() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.kaka_checkin_item_layout, this);
        this.f22288a = (ImageView) viewInflate.findViewById(R.id.kaka_checkin_status_image);
        this.f22289c = (HealthTextView) viewInflate.findViewById(R.id.kaka_add_value);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.kaka_checkin_date);
    }

    public void setCheckeinStatus(int i, boolean z) {
        if (this.d == null) {
            return;
        }
        b(i, z);
        this.f22289c.setText(Marker.ANY_NON_NULL_MARKER + UnitUtil.e(i, 1, 0));
    }

    private void b(int i, boolean z) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        if (z) {
            dimensionPixelSize = this.d.getResources().getDimensionPixelSize(R.dimen.health_common_6dp);
            dimensionPixelSize2 = this.d.getResources().getDimensionPixelSize(R.dimen.health_common_35dp);
            if (i < 6) {
                this.f22288a.setBackgroundResource(R.mipmap.kaka_gift_small);
            } else {
                this.f22288a.setBackgroundResource(R.mipmap.kaka_gift_mid);
            }
        } else if (i >= 10) {
            dimensionPixelSize = this.d.getResources().getDimensionPixelSize(R.dimen.health_common_0dp);
            dimensionPixelSize2 = this.d.getResources().getDimensionPixelSize(R.dimen.health_common_3dp);
            this.f22288a.setBackgroundResource(R.mipmap.kaka_gift_best);
        } else {
            dimensionPixelSize = this.d.getResources().getDimensionPixelSize(R.dimen.health_common_3dp);
            dimensionPixelSize2 = this.d.getResources().getDimensionPixelSize(R.dimen.health_common_3dp);
            this.f22288a.setBackgroundResource(R.mipmap.kaka_gift_close);
        }
        if (this.f22288a.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22288a.getLayoutParams();
            layoutParams.setMargins(0, dimensionPixelSize, 0, 0);
            this.f22288a.setLayoutParams(layoutParams);
        }
        if (this.f22289c.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f22289c.getLayoutParams();
            layoutParams2.setMargins(0, dimensionPixelSize2, 0, 0);
            this.f22289c.setLayoutParams(layoutParams2);
        }
    }

    public void setDate(String str) {
        this.e.setText(str);
    }

    public void setDateTextColor(int i) {
        this.e.setTextColor(this.d.getResources().getColor(i));
        this.e.setBackgroundResource(R.drawable.kaka_check_text_background);
    }
}
