package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.qqw;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionActiveRecordTips extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f7727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f7728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthImageView f7729c;
    private View d;
    private HealthButton e;
    private HealthTextView i;

    public SectionActiveRecordTips(Context context) {
        super(context);
    }

    public SectionActiveRecordTips(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionActiveRecordTips(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionActiveRecordTips", "onCreateView: ");
        if (this.d == null) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_active_record_tips_item, (ViewGroup) this, false);
            this.d = viewInflate;
            this.i = (HealthTextView) viewInflate.findViewById(R.id.tips_item_tv);
            this.f7727a = (HealthTextView) this.d.findViewById(R.id.tips_item_button_tv);
            this.f7728b = (ImageView) this.d.findViewById(R.id.tips_item_img);
            this.e = (HealthButton) this.d.findViewById(R.id.go_sport_button);
            this.f7729c = (HealthImageView) this.d.findViewById(R.id.tips_description);
        }
        return this.d;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionActiveRecordTips";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionActiveRecordTips", "bindParamsToView enter ");
        setViewData(map);
    }

    private void setViewData(HashMap<String, Object> map) {
        String strD = qqw.d((Map) map, "ITEM_TITLE", "");
        String strD2 = qqw.d((Map) map, "ITEM_SUBTITLE", "");
        int iC = qqw.c(map, "BACKGROUND_IMAGE", 0);
        String strD3 = qqw.d((Map) map, "RIGHT_BUTTON_TEXT", "");
        final BaseKnitDataProvider.c cVar = (BaseKnitDataProvider.c) qqw.a(map, "CLICK_EVENT_LISTENER", (Class<Object>) BaseKnitDataProvider.c.class, (Object) null);
        this.i.setText(strD);
        this.f7727a.setText(strD2);
        e();
        this.f7728b.setBackground(qre.c(iC));
        if (LanguageUtil.ba(getContext())) {
            this.f7728b.setRotationY(180.0f);
        }
        this.e.setText(strD3);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionActiveRecordTips.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseKnitDataProvider.c cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.onClick(0);
                }
            }
        });
        final BaseKnitDataProvider.c cVar2 = (BaseKnitDataProvider.c) qqw.a(map, "LEFT_BUTTON_VISIBILITY", (Class<Object>) BaseKnitDataProvider.c.class, (Object) null);
        if (cVar2 != null) {
            this.f7729c.setVisibility(0);
            this.f7729c.setOnClickListener(new View.OnClickListener() { // from class: fvi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cVar2.onClick(0);
                }
            });
        } else {
            this.f7729c.setVisibility(8);
        }
    }

    private void e() {
        if (this.i.getTextLine() > 3 || this.f7727a.getTextLine() > 3) {
            LogUtil.a("SectionActiveRecordTips", "title text lines more than 3");
            this.i.setTextSize(getContext().getResources().getDimensionPixelSize(R.dimen.textSizeBody2));
            this.f7727a.setTextSize(getContext().getResources().getDimensionPixelSize(R.dimen.textSizeBody3));
        }
    }
}
