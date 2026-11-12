package com.xmlywind.sdk.mraid;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.xmlywind.sdk.base.views.BaseWebView;

/* JADX INFO: loaded from: classes22.dex */
public class MraidWebView extends BaseWebView {
    private a a;
    private boolean b;

    public interface a {
        void a(boolean z);
    }

    public MraidWebView(Context context) {
        super(context);
        if (Build.VERSION.SDK_INT <= 22) {
            this.b = getVisibility() == 0;
        }
    }

    private void setMraidViewable(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    public boolean a() {
        return this.b;
    }

    @Override // com.xmlywind.sdk.base.views.BaseWebView, android.webkit.WebView
    public void destroy() {
        super.destroy();
        this.a = null;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            return;
        }
        setMraidViewable(false);
    }

    public void setVisibilityChangedListener(a aVar) {
        this.a = aVar;
    }
}
