package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.openalliance.ad.analysis.BaseAnalysisInfo;
import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public class si extends sf {
    private View e;
    private int f;
    private int g;
    private int h;
    private int i;

    @Override // com.huawei.openalliance.ad.sf
    public boolean a() {
        String str;
        View view = this.e;
        if (view == null || !a(view)) {
            return false;
        }
        Rect rect = new Rect();
        this.e.getGlobalVisibleRect(rect);
        if (c() || d() || e()) {
            str = "2";
        } else {
            if (!b()) {
                if (this.d != null) {
                    return this.d.a();
                }
                return false;
            }
            str = "3";
        }
        a(rect, str);
        return true;
    }

    private boolean e() {
        return a((ViewGroup) this.e) || b(this.e);
    }

    private boolean d() {
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f = marginLayoutParams.leftMargin;
        this.g = marginLayoutParams.topMargin;
        this.h = marginLayoutParams.rightMargin;
        int i = marginLayoutParams.bottomMargin;
        this.i = i;
        return this.f < 0 || this.g < 0 || this.h < 0 || i < 0;
    }

    private boolean c() {
        this.f = this.e.getPaddingLeft();
        this.g = this.e.getPaddingTop();
        this.h = this.e.getPaddingRight();
        int paddingBottom = this.e.getPaddingBottom();
        this.i = paddingBottom;
        return this.f < 0 || this.g < 0 || this.h < 0 || paddingBottom < 0;
    }

    private boolean b(View view) {
        if (view == null || com.huawei.openalliance.ad.utils.as.a(this.f20252b)) {
            return false;
        }
        float scaleX = view.getScaleX() * view.getScaleY();
        if (scaleX < 0.5d || scaleX > 2.0f) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (b(viewGroup.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean b() {
        int iA = com.huawei.openalliance.ad.utils.as.a(this.e.getContext(), 9.0f);
        return this.e.getWidth() < iA || this.e.getHeight() < iA;
    }

    private boolean a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return false;
        }
        float scaleX = viewGroup.getScaleX() * viewGroup.getScaleY();
        if (scaleX < 0.5d || scaleX > 2.0f) {
            return true;
        }
        if (viewGroup.getParent() instanceof ViewGroup) {
            return a((ViewGroup) viewGroup.getParent());
        }
        return false;
    }

    private void a(Rect rect, String str) {
        int width = rect.width() < 0 ? this.e.getWidth() : rect.width();
        int height = rect.height() < 0 ? this.e.getHeight() : rect.height();
        BaseAnalysisInfo baseAnalysisInfo = new BaseAnalysisInfo();
        baseAnalysisInfo.ak("2100040");
        baseAnalysisInfo.am(this.e.getClass().getSimpleName() + "_" + str);
        baseAnalysisInfo.an(String.valueOf(this.e.getAlpha()));
        baseAnalysisInfo.ao(String.valueOf(width));
        baseAnalysisInfo.ap(String.valueOf(height));
        this.f20253c.b(this.f20252b, baseAnalysisInfo);
    }

    public si(Context context, ContentRecord contentRecord, View view) {
        super(context, contentRecord);
        this.e = view;
    }
}
