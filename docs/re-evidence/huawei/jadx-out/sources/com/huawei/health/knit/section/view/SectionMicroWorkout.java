package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqw;
import health.compact.a.util.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionMicroWorkout extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f7847a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f7848c;
    private View e;

    public SectionMicroWorkout(Context context) {
        super(context);
    }

    public SectionMicroWorkout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionMicroWorkout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_micro_exercise, (ViewGroup) this, false);
        this.e = viewInflate;
        this.f7847a = (HealthTextView) viewInflate.findViewById(R.id.micro_workout_title);
        this.f7848c = (HealthTextView) this.e.findViewById(R.id.micro_workout_times);
        this.e.setVisibility(8);
        return this.e;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionMicroWorkout";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null) {
            LogUtil.d("SectionMicroWorkout", "currentParams is null");
            return;
        }
        this.e.setVisibility(0);
        View.OnClickListener onClickListener = (View.OnClickListener) qqw.a(map, "CLICK_EVENT_LISTENER", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener != null) {
            this.e.setOnClickListener(onClickListener);
        }
        String strD = qqw.d((Map) map, "TITLE", "");
        String strD2 = qqw.d((Map) map, "MICRO_WORKOUT_TIMES", "");
        this.f7847a.setText(strD);
        this.f7848c.setText(strD2);
    }
}
