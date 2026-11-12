package com.huawei.health.search;

import android.content.Context;
import com.huawei.health.knit.section.view.BaseBiItemView;
import defpackage.gvi;

/* JADX INFO: loaded from: classes8.dex */
public class SearchResultItemView extends BaseBiItemView {
    public SearchResultItemView(Context context, int i) {
        super(context, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseBiItemView
    public void c() {
        if (this.f7578a != null) {
            gvi.e(this.f7579b, this.f7578a);
            this.f7578a = null;
        }
    }
}
