package com.huawei.ui.main.stories.health.temperature.view.levelcard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.main.R;
import defpackage.ien;
import defpackage.njy;
import defpackage.qqp;
import defpackage.qqv;
import defpackage.qrs;
import defpackage.vbr;
import defpackage.vbu;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class TemperatureCardView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f28156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MultiViewDataObserverView f28158c;
    private MultiViewDataObserverView.OnSelectListener d;
    private String[] e;
    private String f;
    private Map<String, String> g;
    private List<ScrollCardParentView> j;

    public TemperatureCardView(Context context) {
        super(context);
        this.e = new String[]{"TEMPERATURE_MIN_MAX", "SKIN_TEMPERATURE_MIN_MAX"};
        this.f28157b = false;
        this.f = "TEMPERATURE_MIN_MAX";
        c();
    }

    public TemperatureCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new String[]{"TEMPERATURE_MIN_MAX", "SKIN_TEMPERATURE_MIN_MAX"};
        this.f28157b = false;
        this.f = "TEMPERATURE_MIN_MAX";
        this.f28156a = context;
        c();
    }

    public void a(String str) {
        this.f = str;
        removeAllViews();
        c();
    }

    private Map<String, String> e() {
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                map.put("TEMPERATURE_MIN_MAX", "--");
            } else {
                map.put("SKIN_TEMPERATURE_MIN_MAX", "--");
            }
        }
        return map;
    }

    private void c() {
        Utils.init(this.f28156a);
        this.f28157b = qrs.af(this.f28156a);
        d(e(getTemperatureList()));
    }

    private Map<String, vbu> e(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.d("TemperatureCardView", "getTemperatureCardContent temperatureList is null");
            map = e();
        }
        HashMap map2 = new HashMap(16);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            vbu vbuVar = new vbu();
            vbuVar.b(entry.getValue());
            if (entry.getKey() == "TEMPERATURE_MIN_MAX") {
                vbuVar.e(getResources().getString(R.string.IDS_settings_health_temperature));
            } else if (entry.getKey() != "SKIN_TEMPERATURE_MIN_MAX") {
                LogUtil.a("TemperatureCardView", "other card");
            } else {
                vbuVar.e(getResources().getString(R.string.IDS_health_skin_temperature));
            }
            vbuVar.a(vbr.e());
            map2.put(entry.getKey(), vbuVar);
        }
        return map2;
    }

    public void b(final Map<String, String> map) {
        post(new Runnable() { // from class: com.huawei.ui.main.stories.health.temperature.view.levelcard.TemperatureCardView.5
            @Override // java.lang.Runnable
            public void run() {
                if (TemperatureCardView.this.f28156a == null) {
                    LogUtil.d("TemperatureCardView", "notifyCardContent, the context is invalid");
                } else {
                    TemperatureCardView.this.c(map);
                }
            }
        });
    }

    public void c(Map<String, String> map) {
        if (njy.e(this.j) || map == null || map.isEmpty()) {
            LogUtil.d("TemperatureCardView", "updateContent mScrollCardParentViewList is null");
            return;
        }
        LogUtil.e("TemperatureCardView", "updateContent ", Integer.valueOf(map.size()));
        for (int i = 0; i < this.j.size(); i++) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                ScrollCardParentView scrollCardParentView = this.j.get(i);
                if (scrollCardParentView.getType().equals(entry.getKey())) {
                    scrollCardParentView.c(entry.getValue());
                    d(scrollCardParentView, entry.getValue());
                    LogUtil.a("TemperatureCardView", "updateContent ", entry.getValue());
                }
            }
        }
    }

    private void d(ScrollCardParentView scrollCardParentView, String str) {
        if ("--".equals(str)) {
            scrollCardParentView.getUnitTextView().setVisibility(8);
        } else {
            scrollCardParentView.getUnitTextView().setVisibility(0);
        }
    }

    private int getMargin() {
        Context context = this.f28156a;
        if (context == null) {
            LogUtil.d("TemperatureCardView", "getMargin() mContext is null.");
            return 0;
        }
        return context.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
    }

    private int getGutter() {
        return qqp.b(this.f28156a);
    }

    private int getCardWidth() {
        int margin = getMargin();
        int gutter = getGutter();
        return this.f28157b ? ((((ien.b(this.f28156a) - (margin * 2)) - (gutter * 7)) / 8) * 2) + gutter : (int) Utils.convertDpToPixel(getNormalWidth());
    }

    private int getNormalWidth() {
        if (this.f28156a == null) {
            LogUtil.d("TemperatureCardView", "getNormalWidth() mContext is null.");
            return MachineControlPointResponse.OP_CODE_EXTENSION_SET_DYNAMIC_ENERGY;
        }
        int iIntValue = ((Integer) BaseActivity.getSafeRegionWidth().first).intValue() * 2;
        LogUtil.e("TemperatureCardView", "getNormalWidth() safeWidth is ", Integer.valueOf(iIntValue));
        return qqp.d(this.f28156a, ((qqv.d(this.f28156a) - ((getMargin() + iIntValue) * 2)) - getGutter()) / 2);
    }

    private void d(Map<String, vbu> map) {
        MultiViewDataObserverView multiViewDataObserverView = new MultiViewDataObserverView(this.f28156a);
        this.f28158c = multiViewDataObserverView;
        multiViewDataObserverView.setDefaultTitleColor(R.color.textColorSecondary);
        this.f28158c.setDefaultColor(R.color.emui_color_text_primary);
        this.f28158c.setDefaultBackground(R.drawable.background_charteye);
        this.f28158c.setSelectColor(R.color.textColorPrimaryInverse);
        this.f28158c.setSelectBackground(R.drawable.bakground_temperature_select);
        this.f28158c.c().setMinimumWidth(getGutter());
        this.f28158c.e().setMinimumWidth(getMargin());
        this.j = new ArrayList(16);
        for (int i = 0; i < this.e.length; i++) {
            for (Map.Entry<String, vbu> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null && entry.getKey().equals(this.e[i])) {
                    vbu value = entry.getValue();
                    ScrollCardParentView scrollCardParentView = new ScrollCardParentView(this.f28156a, value.e(), value.b(), entry.getKey(), value.d());
                    d(scrollCardParentView, value.d());
                    this.j.add(scrollCardParentView);
                }
            }
        }
        this.f28158c.setCardWidth(getCardWidth());
        this.f28158c.b(this.j);
        if (this.e[0].equals(this.f)) {
            this.f28158c.setSelectIndex(this.j.get(0));
        } else if (this.e[1].equals(this.f)) {
            this.f28158c.setSelectIndex(this.j.get(1));
        } else {
            LogUtil.d("TemperatureCardView", "TemperatureType Is UnKnow");
        }
        MultiViewDataObserverView.OnSelectListener onSelectListener = this.d;
        if (onSelectListener != null) {
            this.f28158c.setListener(onSelectListener);
        }
        addView(this.f28158c, -1, -2);
    }

    public void setListener(MultiViewDataObserverView.OnSelectListener onSelectListener) {
        MultiViewDataObserverView multiViewDataObserverView;
        this.d = onSelectListener;
        if (onSelectListener == null || (multiViewDataObserverView = this.f28158c) == null) {
            return;
        }
        multiViewDataObserverView.setListener(onSelectListener);
    }

    public Map<String, String> getTemperatureList() {
        return this.g;
    }
}
