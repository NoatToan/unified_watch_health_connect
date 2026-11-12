package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionTopReminder extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthButton f7965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConstraintLayout f7966c;
    private HealthTextView d;
    private View e;

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void overrideParamsByOnlineData(SectionBean sectionBean, HashMap<String, Object> map) {
    }

    public SectionTopReminder(Context context) {
        this(context, null);
    }

    public SectionTopReminder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionTopReminder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionTopReminder", "loadView");
        this.f7964a = context;
        b();
        return this.e;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionTopReminder";
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        byte b2;
        LogUtil.a("SectionTopReminder", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionTopReminder", "no need to bind");
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            key.hashCode();
            int iHashCode = key.hashCode();
            if (iHashCode != -1937548587) {
                if (iHashCode != 263146085) {
                    if (iHashCode == 1675868304 && key.equals("CLICK_EVENT_LISTENER")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (key.equals("LEFT_TEXT")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (key.equals("RIGHT_BUTTON")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 == 2) {
                        LogUtil.a("SectionTopReminder", "start to set click event");
                        setClickListenerEvent(value);
                    }
                } else if (this.d != null && (value instanceof String)) {
                    LogUtil.a("SectionTopReminder", "start to set left text");
                    this.d.setText(String.valueOf(value));
                }
            } else if (this.f7965b != null && (value instanceof String)) {
                LogUtil.a("SectionTopReminder", "start to set rightButton");
                this.f7965b.setText(String.valueOf(value));
            }
        }
    }

    private void setClickListenerEvent(Object obj) {
        if (obj instanceof OnClickSectionListener) {
            final OnClickSectionListener onClickSectionListener = (OnClickSectionListener) obj;
            LogUtil.a("SectionTopReminder", "start to set button click event");
            ConstraintLayout constraintLayout = this.f7966c;
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionTopReminder.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LogUtil.a("SectionTopReminder", "set subtitleClickEvent onClick");
                        onClickSectionListener.onClick("CLICK_VIEW");
                    }
                });
            }
            HealthButton healthButton = this.f7965b;
            if (healthButton != null) {
                healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionTopReminder.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LogUtil.a("SectionTopReminder", "set button onClick");
                        onClickSectionListener.onClick("ITEM_BUTTON_TEXT");
                    }
                });
            }
        }
    }

    private void b() {
        if (this.e == null) {
            LogUtil.j("SectionTopReminder", "initView mainView is null, start to inflate");
            this.e = LayoutInflater.from(this.f7964a).inflate(R.layout.top_reminder_layout, (ViewGroup) this, false);
        }
        this.d = (HealthTextView) this.e.findViewById(R.id.left_text);
        this.f7965b = (HealthButton) this.e.findViewById(R.id.right_button);
        this.f7966c = (ConstraintLayout) this.e.findViewById(R.id.whole_click_area);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.whole_click_area) {
            onClick("CLICK_VIEW");
        } else if (view.getId() == R.id.right_button) {
            onClick("ITEM_BUTTON_TEXT");
        }
    }
}
