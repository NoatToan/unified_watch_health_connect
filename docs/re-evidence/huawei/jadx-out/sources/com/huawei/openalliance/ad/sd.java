package com.huawei.openalliance.ad;

import android.content.Context;
import android.view.View;
import com.huawei.openalliance.ad.analysis.BaseAnalysisInfo;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class sd extends sf {
    private String e;
    private View f;
    private List<StackTraceElement> g;
    private int h;

    @Override // com.huawei.openalliance.ad.sf
    public boolean a() {
        if (this.f != null && this.g != null) {
            for (int i = 0; i < this.h; i++) {
                if (!a(this.g.get(i))) {
                    a(this.g.get(i).toString(), "1");
                    return true;
                }
            }
            if (this.d != null) {
                return this.d.a();
            }
        }
        return false;
    }

    private void a(String str, String str2) {
        BaseAnalysisInfo baseAnalysisInfo = new BaseAnalysisInfo();
        baseAnalysisInfo.ak("2100039");
        baseAnalysisInfo.am(this.f.getClass().getSimpleName() + "_" + str2);
        baseAnalysisInfo.an(str);
        this.f20253c.b(this.f20252b, baseAnalysisInfo);
    }

    public sd(Context context, ContentRecord contentRecord, StackTraceElement[] stackTraceElementArr, View view) {
        super(context, contentRecord);
        this.e = "ClickDetector";
        this.g = new ArrayList();
        this.f = view;
        if (com.huawei.openalliance.ad.utils.bm.a(stackTraceElementArr)) {
            return;
        }
        this.h = stackTraceElementArr.length;
        this.g = Arrays.asList(stackTraceElementArr);
    }
}
