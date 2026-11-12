package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes12.dex */
public class an extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f21155a;

    public interface a {
        void a(View view, int i, int i2, int i3, int i4);
    }

    public void setScrollChangedListener(a aVar) {
        this.f21155a = aVar;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a aVar = this.f21155a;
        if (aVar != null) {
            aVar.a(this, i, i2, i3, i4);
        }
    }

    public an(Context context) {
        super(context);
    }
}
