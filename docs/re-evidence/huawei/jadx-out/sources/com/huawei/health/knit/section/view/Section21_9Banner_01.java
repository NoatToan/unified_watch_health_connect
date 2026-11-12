package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.adapter.Section21_9Banner_01_Adapter;
import com.huawei.health.knit.section.utils.SpacesItemDecoration;
import com.huawei.health.servicesui.R;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.qqs;
import defpackage.qqw;
import defpackage.qrs;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class Section21_9Banner_01 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, List<Object>> f7655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f7656c;
    private OnClickSectionListener d;
    private RelativeLayout e;
    private HealthSubHeader f;
    private Pair<Integer, Integer> g;
    private View h;
    private boolean i;
    private HealthRecycleView j;
    private Section21_9Banner_01_Adapter o;

    public Section21_9Banner_01(Context context) {
        super(context);
        this.i = false;
        this.g = BaseActivity.getSafeRegionWidth();
    }

    public Section21_9Banner_01(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = false;
        this.g = BaseActivity.getSafeRegionWidth();
    }

    public Section21_9Banner_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = false;
        this.g = BaseActivity.getSafeRegionWidth();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        c(map);
        a();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_Section21_9Banner_01";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    private void c(HashMap<String, Object> map) {
        byte b2;
        this.f7655b = new HashMap();
        setHealthSubHeaderTitle(qqw.d((Map) map, "TITLE", ""));
        setHealthSubHeaderSubTitle(qqw.d((Map) map, "SUBTITLE", ""));
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            key.hashCode();
            switch (key) {
                case "NUMBER":
                    b2 = 0;
                    break;
                case "STATUS":
                    b2 = 1;
                    break;
                case "ACTIVITY_TYPE_CONTENT":
                    b2 = 2;
                    break;
                case "IMAGE":
                    b2 = 3;
                    break;
                case "ACTIVITY_TYPE_DESCRIPTION":
                    b2 = 4;
                    break;
                case "CLICK_EVENT_LISTENER":
                    b2 = 5;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 3) {
                            if (b2 != 4) {
                                if (b2 == 5) {
                                    e(map, key);
                                }
                            } else if (entry.getValue() instanceof List) {
                                this.f7655b.put("ACTIVITY_TYPE_DESCRIPTION", (List) entry.getValue());
                            }
                        } else if (entry.getValue() instanceof List) {
                            this.f7655b.put("IMAGE", (List) entry.getValue());
                        }
                    } else if (entry.getValue() instanceof List) {
                        this.f7655b.put("ACTIVITY_TYPE_CONTENT", (List) entry.getValue());
                    }
                } else if (entry.getValue() instanceof List) {
                    this.f7655b.put(CommonConstant.RETKEY.STATUS, (List) entry.getValue());
                }
            } else if (entry.getValue() instanceof List) {
                this.f7655b.put("NUMBER", (List) entry.getValue());
            }
        }
    }

    private void a() {
        Section21_9Banner_01_Adapter section21_9Banner_01_Adapter;
        if (this.o == null) {
            this.o = new Section21_9Banner_01_Adapter(this.f7654a, this.d);
        }
        Map<String, List<Object>> map = this.f7655b;
        if (map != null && (section21_9Banner_01_Adapter = this.o) != null) {
            section21_9Banner_01_Adapter.e(map);
            this.j.setAdapter(this.o);
        } else {
            LogUtil.j("Section_Section21_9Banner_01", "subDataList is null or activityPageSectionAdapter is null");
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.f7654a = context;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.configured_activity_page, (ViewGroup) this, false);
        this.h = viewInflate;
        this.e = (RelativeLayout) viewInflate.findViewById(R.id.activity_recycler_view_layout);
        this.f7656c = (LinearLayout) this.h.findViewById(R.id.configured_activity_layout);
        this.f = (HealthSubHeader) this.h.findViewById(R.id.health_activity_header);
        this.j = (HealthRecycleView) this.h.findViewById(R.id.activity_recycle_view);
        if (qqs.e(this.f7654a)) {
            this.f7656c.setBackgroundColor(this.f7654a.getResources().getColor(com.huawei.ui.commonui.R.color.emui_color_bg));
        }
        this.f.setBackgroundColor(0);
        this.f.getBackground().setAlpha(0);
        this.f.setSubHeaderBackgroundColor(ContextCompat.getColor(this.h.getContext(), com.huawei.ui.commonui.R.color.common_transparent));
        this.j.setNestedScrollingEnabled(false);
        this.j.setHasFixedSize(true);
        this.j.b(false);
        this.j.e(false);
        this.j.setLayoutManager(new LinearLayoutManager(this.f7654a));
        d();
        return this.h;
    }

    private void e(final HashMap<String, Object> map, final String str) {
        if (map.get(str) instanceof OnClickSectionListener) {
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section21_9Banner_01.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ((OnClickSectionListener) map.get(str)).onClick("TITLE_SHOW_MORE_CLICK_EVENT");
                }
            });
            this.d = (OnClickSectionListener) map.get(str);
        }
    }

    public void setSubTitleVisible(boolean z) {
        this.i = z;
    }

    private void setHealthSubHeaderTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f.setHeadTitleText(str);
    }

    private void setHealthSubHeaderSubTitle(String str) {
        if (TextUtils.isEmpty(str) || !this.i) {
            this.f.setMoreTextVisibility(4);
        } else {
            this.f.setMoreTextVisibility(0);
            this.f.setMoreText(str);
        }
    }

    private void d() {
        int i = qrs.af(this.f7654a) ? 2 : 1;
        if (this.j.getItemDecorationCount() > 0 && this.j.getItemDecorationAt(0) != null) {
            this.j.removeItemDecorationAt(0);
        }
        this.j.addItemDecoration(new SpacesItemDecoration(0, BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.cardMarginMiddle), i, new int[]{0, 0, BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.emui_dimens_default_end) + ((Integer) this.g.second).intValue(), 0}));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f7654a, i);
        gridLayoutManager.setOrientation(1);
        this.j.setLayoutManager(gridLayoutManager);
        this.j.setHasFixedSize(true);
        this.j.setNestedScrollingEnabled(false);
    }
}
