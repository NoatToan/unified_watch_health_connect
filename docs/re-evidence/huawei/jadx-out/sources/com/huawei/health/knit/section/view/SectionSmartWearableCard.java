package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.chi;
import defpackage.qqw;
import defpackage.qqz;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionSmartWearableCard extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f7939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f7940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthCardView f7941c;
    private ImageView d;
    private Context e;
    private HealthTextView f;
    private StorageParams i;

    @Override // com.huawei.health.knit.section.view.BaseSection
    public boolean isSupportShare() {
        return false;
    }

    public SectionSmartWearableCard(Context context) {
        this(context, null);
    }

    public SectionSmartWearableCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionSmartWearableCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new StorageParams();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("Section_Smart_Wearable_Card", "onCreateView");
        this.e = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sleep_no_data_smart_wearable_layout, (ViewGroup) this, false);
        this.f7941c = (HealthCardView) viewInflate.findViewById(R.id.sleep_no_data_device_card);
        if (!LanguageUtil.l(context)) {
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.cancel_image);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = getResources().getDimensionPixelSize(R.dimen.emui_text_size_headline8);
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.ic_public_cancel_3);
            if (LanguageUtil.ba(context)) {
                imageView.setImageDrawable(qqz.e(context, getResources().getDrawable(R.drawable.ic_public_cancel_3)));
            }
        }
        this.d = (ImageView) viewInflate.findViewById(R.id.cancel_image);
        this.f = (HealthTextView) viewInflate.findViewById(R.id.sleep_device_card_title);
        if (qrs.x(this.e)) {
            this.f.setTextColor(getResources().getColor(R.color.textColorPrimaryInverse, null));
        }
        this.f7939a = (HealthTextView) viewInflate.findViewById(R.id.sleep_device_card_description);
        this.f7940b = (HealthTextView) viewInflate.findViewById(R.id.sleep_device_card_learn_more);
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(final HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.a("Section_Smart_Wearable_Card", "no need to bind");
            return;
        }
        LogUtil.a("Section_Smart_Wearable_Card", map);
        Drawable drawable = (Drawable) qqw.a(map, "ICON_CANCEL", (Class<Object>) Drawable.class, (Object) null);
        if (drawable == null) {
            qsp.c((View) this.d, 8);
        } else {
            qsp.c(this.d, drawable);
        }
        qsp.b(this.f, qqw.d((Map) map, "CARD_TITLE", ""));
        qsp.b(this.f7939a, qqw.d((Map) map, "CARD_DESCRIPTION", ""));
        qsp.a(this.f7940b, qqw.d((Map) map, "CARD_LEARN_MORE", ""), true);
        qsp.c((TextView) this.f7940b, getContext().getColor(qqw.c(map, "LEARN_MORE_COLOR", R.color.common_colorAccent)));
        qsp.b(this.f7940b, chi.b(map, "CLICK_EVENT_LISTENER", null));
        qsp.c((View) this.f7940b, qqw.c(map, "LEARN_MORE_VISIBLE", 0));
        if (drawable != null) {
            qsp.b(this.d, new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionSmartWearableCard.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SectionSmartWearableCard.this.f7941c.setVisibility(8);
                    String strD = qqw.d((Map) map, "CLOSE_BUTTON_SP_KEY", "");
                    if (!TextUtils.isEmpty(strD)) {
                        SharedPreferenceManager.e(SectionSmartWearableCard.this.e, String.valueOf(PrebakedEffectId.RT_COIN_DROP), strD, "true", SectionSmartWearableCard.this.i);
                        return;
                    }
                    LogUtil.e("Section_Smart_Wearable_Card", "sp key is invalid");
                }
            });
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_Smart_Wearable_Card";
    }
}
