package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.adapter.Section1_1Card_02_Adapter;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.dkf;
import defpackage.qqw;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Section1_1Card_02 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnClickSectionListener f7650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSubHeader f7651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7652c;
    private HealthRecycleView d;
    private int e;
    private String g;
    private List<Object> h;
    private Section1_1Card_02_Adapter i;
    private View j;

    public Section1_1Card_02(Context context) {
        this(context, null);
    }

    public Section1_1Card_02(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section1_1Card_02(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.f7652c = context;
        e();
        return this.j;
    }

    private void e() {
        if (this.j == null) {
            LogUtil.j("Section1_1Card_02", "initView mainView is null, start to inflate");
            View viewInflate = LayoutInflater.from(this.f7652c).inflate(R.layout.section1_1card_02_layout, (ViewGroup) this, false);
            this.j = viewInflate;
            this.f7651b = (HealthSubHeader) viewInflate.findViewById(R.id.section1_1_card_02_subheader);
            HealthRecycleView healthRecycleView = (HealthRecycleView) this.j.findViewById(R.id.section1_1card_02_recyclerview);
            this.d = healthRecycleView;
            dkf.d(healthRecycleView);
            this.d.setLayoutManager(new LinearLayoutManager(this.f7652c, 0, false));
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section1_1Card_02";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        byte b2;
        LogUtil.a("Section1_1Card_02", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("Section1_1Card_02", "no need to bind");
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            key.hashCode();
            switch (key) {
                case "SUBTITLE":
                    b2 = 0;
                    break;
                case "SECTION1_1CARD_02_BEAN":
                    b2 = 1;
                    break;
                case "PAGE_TYPE":
                    b2 = 2;
                    break;
                case "TITLE":
                    b2 = 3;
                    break;
                case "CLICK_EVENT_LISTENER":
                    b2 = 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 == 2) {
                        this.e = qqw.c(map, key, 0);
                    } else if (b2 == 3) {
                        setTittle(value);
                    } else if (b2 == 4) {
                        setClickEvent(value);
                    }
                } else if (value instanceof List) {
                    LogUtil.a("Section1_1Card_02", "start to set section1_1Card_02_BeanList");
                    this.h = (List) value;
                }
            } else if (value instanceof String) {
                LogUtil.a("Section1_1Card_02", "start to set mSubHeader subtitle");
                this.f7651b.setMoreTextVisibility(8);
                this.f7651b.setMoreText(String.valueOf(value));
                this.f7651b.setRightArrayVisibility(8);
            }
        }
        Section1_1Card_02_Adapter section1_1Card_02_Adapter = new Section1_1Card_02_Adapter(this.f7652c, this.h, this.f7650a);
        this.i = section1_1Card_02_Adapter;
        this.d.setAdapter(section1_1Card_02_Adapter);
        this.d.setOnScrollListener(new MarketingBiUtils.FitnessOnScrollListener(this.e, this.g, 12));
    }

    private void setTittle(Object obj) {
        if (obj instanceof String) {
            LogUtil.a("Section1_1Card_02", "start to set mSubHeader title");
            this.g = String.valueOf(obj);
            this.f7651b.setVisibility(0);
            this.f7651b.setHeadTitleText(this.g);
            this.f7651b.setMoreTextVisibility(8);
            this.f7651b.setSubHeaderBackgroundColor(this.f7652c.getResources().getColor(R.color.common_transparent));
            this.f7651b.setRightArrayVisibility(8);
        }
    }

    private void setClickEvent(Object obj) {
        HealthRecycleView healthRecycleView = this.d;
        if (healthRecycleView == null || !(obj instanceof OnClickSectionListener)) {
            return;
        }
        this.f7650a = (OnClickSectionListener) obj;
        healthRecycleView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section1_1Card_02.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Section1_1Card_02", "set subtitleClickEvent onClick");
                Section1_1Card_02.this.f7650a.onClick("SUBTITLE");
            }
        });
    }
}
