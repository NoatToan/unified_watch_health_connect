package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionRangeView extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f7889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f7890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f7891c;
    private View d;
    private HealthTextView e;
    private HealthTextView f;

    public SectionRangeView(Context context) {
        super(context);
    }

    public SectionRangeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionRangeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionRangeView", "onCreateView");
        this.f7890b = context;
        b();
        return this.d;
    }

    private void b() {
        if (qrs.u()) {
            this.d = LayoutInflater.from(this.f7890b).inflate(R.layout.section_blood_oxygen_altitude_range_large, (ViewGroup) this, false);
        } else {
            this.d = LayoutInflater.from(this.f7890b).inflate(R.layout.section_blood_oxygen_altitude_range, (ViewGroup) this, false);
        }
        this.e = (HealthTextView) this.d.findViewById(R.id.blood_oxygen_latest_string);
        this.f7889a = (HealthTextView) this.d.findViewById(R.id.blood_oxygen_latest_data);
        this.f = (HealthTextView) this.d.findViewById(R.id.bloodgen_trend_range_string);
        this.f7891c = (HealthTextView) this.d.findViewById(R.id.bloodgen_trend_range_data);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionRangeView", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.e("SectionRangeView", "no need to bind");
            return;
        }
        qsp.b(this.e, qqw.d((Map) map, "LEFT_TOP_VALUE", ""));
        qsp.b(this.f7889a, (CharSequence) qqw.a(map, "LEFT_TEXT", (Class<Object>) SpannableString.class, (Object) null));
        qsp.b(this.f, qqw.d((Map) map, "RIGHT_TEXT", ""));
        qsp.b(this.f7891c, (CharSequence) qqw.a(map, "RIGHT_BOTTOM_TEXT", (Class<Object>) SpannableString.class, (Object) null));
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionRangeView";
    }
}
