package com.huawei.uikit.phone.hwsubtab.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import com.huawei.uikit.hwcolumnsystem.widget.HwColumnSystem;
import com.huawei.uikit.phone.hwsubtab.R;
import com.huawei.uikit.phone.hwunifiedinteract.widget.HwKeyEventDetector;
import defpackage.xfz;

/* JADX INFO: loaded from: classes20.dex */
public class HwSubTabWidget extends com.huawei.uikit.hwsubtab.widget.HwSubTabWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29854a;
    private boolean f;
    private HwColumnSystem g;
    private int h;
    private int i;
    private String j;
    private Context k;
    private SubTabView m;
    private float n;

    public class SubTabView extends com.huawei.uikit.hwsubtab.widget.HwSubTabWidget.SubTabView {
        public SubTabView(Context context, xfz xfzVar) {
            super(context, xfzVar);
        }

        @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabWidget.SubTabView
        public void c() {
            if (HwSubTabWidget.this.g.j() >= 8) {
                setPadding(HwSubTabWidget.this.getSubTabItemPaddingSecondary(), 0, HwSubTabWidget.this.getSubTabItemPaddingSecondary(), 0);
                HwSubTabWidget.this.setSubTabLeftScrollPadding(32);
            } else {
                setPadding(HwSubTabWidget.this.getSubTabItemPadding(), 0, HwSubTabWidget.this.getSubTabItemPadding(), 0);
                HwSubTabWidget.this.setSubTabLeftScrollPadding(28);
            }
        }

        @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabWidget.SubTabView, android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (accessibilityNodeInfo == null) {
                return;
            }
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (getEventBadgeDrawable() == null || getEventBadgeDrawable().c() == 0) {
                return;
            }
            accessibilityNodeInfo.setHintText(HwSubTabWidget.this.j);
        }
    }

    public HwSubTabWidget(Context context) {
        this(context, null);
    }

    public int getStartOriginPadding() {
        return this.f29749c.getStartOriginPadding();
    }

    public int getStartScrollPadding() {
        return this.f29749c.getStartScrollPadding();
    }

    @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabWidget, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f) {
            e(this.g);
        } else {
            d(this.g);
        }
    }

    public HwSubTabWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29854a = -1;
        c(context, attributeSet);
    }

    private void c(Context context, AttributeSet attributeSet) {
        this.k = context;
        this.j = getResources().getString(R.string.new_message);
        HwColumnSystem hwColumnSystem = new HwColumnSystem(context);
        this.g = hwColumnSystem;
        hwColumnSystem.d(this.f29854a);
        this.g.b(context);
        d();
    }

    private void e(HwColumnSystem hwColumnSystem) {
        hwColumnSystem.d(-1);
        hwColumnSystem.d(this.k, this.i, this.h, this.n);
    }

    @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabWidget
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SubTabView b(xfz xfzVar) {
        SubTabView subTabView = new SubTabView(getContext(), xfzVar);
        this.m = subTabView;
        return subTabView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabWidget
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public HwKeyEventDetector e() {
        return new HwKeyEventDetector(getContext());
    }

    private void d() {
        if (Float.compare(this.k.getResources().getConfiguration().fontScale, 1.75f) >= 0) {
            d(this.k.getResources().getDimensionPixelSize(R.dimen.emui_text_size_headline6_medium), this.k.getResources().getDimensionPixelSize(R.dimen.emui_text_size_headline7_medium));
            setSubTabItemPadding(this.k.getResources().getDimensionPixelSize(R.dimen.hwsubtab_item_padding_larger));
        }
    }

    private void d(HwColumnSystem hwColumnSystem) {
        hwColumnSystem.d(-1);
        hwColumnSystem.b(this.k);
    }

    public HwSubTabWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29854a = -1;
        c(context, attributeSet);
    }
}
