package com.xmlywind.sdk.base.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.utils.k;
import com.xmlywind.sdk.common.utils.m;
import java.io.File;

/* JADX INFO: loaded from: classes22.dex */
public class CreativeWebView extends BaseWebView {
    private static float b = 10.0f;
    private final AdLogoView a;
    private a c;

    public interface a {
        void a(MotionEvent motionEvent, MotionEvent motionEvent2);
    }

    public class b implements View.OnTouchListener {
        public MotionEvent a;
        private boolean c;

        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.c = true;
                this.a = MotionEvent.obtain(motionEvent);
            } else if (action == 1 && this.c) {
                this.c = false;
                if (CreativeWebView.this.c != null) {
                    CreativeWebView.this.c.a(this.a, motionEvent);
                }
            }
            return false;
        }
    }

    private CreativeWebView(Context context, String str, boolean z, boolean z2) {
        super(context);
        a();
        getSettings().setJavaScriptEnabled(true);
        a(true);
        setBackgroundColor(0);
        if (z) {
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            AdLogoView adLogoView = new AdLogoView(getContext(), 1);
            this.a = adLogoView;
            adLogoView.a(str);
            adLogoView.b(com.xmlywind.sdk.base.b.f());
            addView(adLogoView, layoutParams);
        } else {
            this.a = null;
        }
        setOnTouchListener(new b());
    }

    public static CreativeWebView a(Context context, String str, boolean z, boolean z2) {
        m.a.a(context);
        return new CreativeWebView(context, str, z, z2);
    }

    private void a() {
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setScrollBarStyle(0);
    }

    public void a(String str) {
        File fileA = com.xmlywind.sdk.common.utils.d.a(str, k.a(str) + ".html");
        if (fileA == null || TextUtils.isEmpty(fileA.getAbsolutePath())) {
            loadDataWithBaseURL(com.xmlywind.sdk.common.e.f.h() + "://localhost/", str, "text/html", "utf-8", null);
            return;
        }
        loadUrl("file://" + fileA.getAbsolutePath());
    }

    @Override // com.xmlywind.sdk.base.views.BaseWebView, android.webkit.WebView
    public void destroy() {
        SigmobLog.d("CreativeWebView destroy() callSigmobLog.d( \"CreativeWebView destroy() called\");ed");
        super.destroy();
    }

    public void setWebViewClickListener(a aVar) {
        this.c = aVar;
    }
}
