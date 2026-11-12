package com.huawei.health.section.section;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.flowlayout.HealthFlowLayout;
import com.huawei.ui.commonui.flowlayout.textviewbuilder.SearchTagTextViewBuilder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.njy;
import defpackage.qle;
import defpackage.qqw;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class Section21_9Search_01 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f8760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSubHeader f8761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthFlowLayout f8762c;
    private View d;
    private Context e;

    public Section21_9Search_01(Context context) {
        this(context, null);
    }

    public Section21_9Search_01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section21_9Search_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section21_9search_01_layout, (ViewGroup) this, false);
        this.d = viewInflate;
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section21_9_search_01_sub_header);
        this.f8761b = healthSubHeader;
        healthSubHeader.setMoreTextVisibility(4);
        this.f8761b.setMoreLayoutVisibility(4);
        this.f8761b.setSubHeaderBackgroundColor(ContextCompat.getColor(this.d.getContext(), R.color.common_transparent));
        this.f8760a = (HealthTextView) this.d.findViewById(R.id.section21_9search_01_right_button);
        this.f8762c = (HealthFlowLayout) this.d.findViewById(R.id.section21_9search_01_flow_layout);
        this.f8762c.setTextViewBuilder(new SearchTagTextViewBuilder(BaseApplication.getContext()));
        return this.d;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_Section21_9Search_01";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        this.f8761b.setHeadTitleText(qqw.d((Map) map, "TITLE", ""));
        String strD = qqw.d((Map) map, "ITEM_RIGHT_BTN", "");
        final OnClickSectionListener onClickSectionListenerC = qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null);
        qsp.a(this.f8760a, strD, true);
        qsp.b(this.f8760a, new View.OnClickListener() { // from class: com.huawei.health.section.section.Section21_9Search_01.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                OnClickSectionListener onClickSectionListener = onClickSectionListenerC;
                if (onClickSectionListener != null) {
                    onClickSectionListener.onClick("RIGHT_TOP_TEXT_CLICK_EVENT");
                }
            }
        });
        List<String> listA = qqw.a((Map) map, "ITEM_TITLE", String.class, (List) new ArrayList());
        this.f8762c.d(d(listA, qqw.a((Map) map, "RIGHT_ICON_TEXT", String.class, (List) new ArrayList())), false);
        if (njy.e(listA)) {
            return;
        }
        a(map, listA);
    }

    private void a(final HashMap<String, Object> map, final List<String> list) {
        for (final int i = 0; i < this.f8762c.getChildCount(); i++) {
            View childAt = this.f8762c.getChildAt(i);
            if (childAt instanceof HealthTextView) {
                childAt.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.section.section.Section21_9Search_01.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        OnClickSectionListener onClickSectionListener = (OnClickSectionListener) map.get("CLICK_EVENT_LISTENER");
                        if (onClickSectionListener != null) {
                            if (njy.e(list, i)) {
                                LogUtil.e("Section_Section21_9Search_01", "position is out of bounds");
                            } else {
                                int i2 = i;
                                onClickSectionListener.onClick(i2, (String) list.get(i2));
                            }
                        }
                    }
                });
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    private ArrayList<qle> d(List<String> list, List<String> list2) {
        byte b2;
        ArrayList<qle> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (njy.c(list2, i)) {
                String str2 = list2.get(i);
                if (str2 == null) {
                    str2 = "none";
                }
                int iHashCode = str2.hashCode();
                if (iHashCode != 103501) {
                    if (iHashCode != 108960) {
                        if (iHashCode == 3387192 && str2.equals("none")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                    } else if (str2.equals("new")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (str2.equals("hot")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    str = str + " 🔥";
                } else if (b2 == 1) {
                    str = str + " 🆕";
                }
            }
            arrayList.add(new qle(i, str, 1));
        }
        return arrayList;
    }
}
