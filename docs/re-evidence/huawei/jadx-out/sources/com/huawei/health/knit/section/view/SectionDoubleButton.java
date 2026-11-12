package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.qqw;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionDoubleButton extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthCardView f7771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f7772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f7773c;
    private HealthTextView d;
    private HealthCardView e;
    private HealthTextView g;

    public SectionDoubleButton(Context context) {
        super(context);
    }

    public SectionDoubleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionDoubleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionDoubleButton", "onCreateView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_double_button, (ViewGroup) this, false);
        this.e = (HealthCardView) viewInflate.findViewById(R.id.left_button);
        this.f7771a = (HealthCardView) viewInflate.findViewById(R.id.right_button);
        this.f7772b = (ImageView) viewInflate.findViewById(R.id.left_button_image);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.left_button_text);
        this.f7773c = (ImageView) viewInflate.findViewById(R.id.right_button_image);
        this.g = (HealthTextView) viewInflate.findViewById(R.id.right_button_text);
        if (!LanguageUtil.l(context) && !LanguageUtil.q(context)) {
            this.d.setAllCaps(true);
            this.g.setAllCaps(true);
        }
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionDoubleButton";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionDoubleButton", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionDoubleButton", "no need to bind");
            return;
        }
        qsp.c((View) this.e, qqw.c(map, "LEFT_BUTTON_VISIBILITY", 0));
        qsp.c((View) this.f7771a, qqw.c(map, "RIGHT_BUTTON_VISIBILITY", 0));
        qsp.b(this.d, qqw.d((Map) map, "LEFT_BUTTON_TEXT", ""));
        qsp.b(this.g, qqw.d((Map) map, "RIGHT_BUTTON_TEXT", ""));
        this.f7772b.setBackgroundResource(qqw.c(map, "LEFT_BUTTON_IMAGE", R.drawable.default_blank));
        this.f7773c.setBackgroundResource(qqw.c(map, "RIGHT_BUTTON_IMAGE", R.drawable.default_blank));
        final OnClickSectionListener onClickSectionListenerC = qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionDoubleButton.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                onClickSectionListenerC.onClick(1);
            }
        });
        this.f7771a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionDoubleButton.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                onClickSectionListenerC.onClick(2);
            }
        });
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.f7772b.setRotationY(180.0f);
            this.f7773c.setRotationY(180.0f);
        }
    }
}
