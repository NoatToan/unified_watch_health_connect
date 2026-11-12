package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.huawei.openalliance.ad.analysis.BaseAnalysisInfo;
import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public class sc extends sf {
    private boolean e;
    private View f;

    @Override // com.huawei.openalliance.ad.sf
    public boolean a() {
        if (this.f == null) {
            return false;
        }
        if (!this.e) {
            if (this.d != null) {
                return this.d.a();
            }
            return false;
        }
        Rect rect = new Rect();
        this.f.getGlobalVisibleRect(rect);
        a(rect, "1");
        return true;
    }

    private void a(Rect rect, String str) {
        BaseAnalysisInfo baseAnalysisInfo = new BaseAnalysisInfo();
        baseAnalysisInfo.ak("2100040");
        baseAnalysisInfo.am(this.f.getClass().getSimpleName() + "_" + str);
        baseAnalysisInfo.an(String.valueOf(this.f.getAlpha()));
        baseAnalysisInfo.ao(String.valueOf(rect.width()));
        baseAnalysisInfo.ap(String.valueOf(rect.height()));
        this.f20253c.b(this.f20252b, baseAnalysisInfo);
    }

    public sc(Context context, ContentRecord contentRecord, View view) {
        super(context, contentRecord);
        this.e = false;
        this.f = view;
        if (view == null || view.getAlpha() >= 1.0f) {
            return;
        }
        this.e = true;
    }
}
