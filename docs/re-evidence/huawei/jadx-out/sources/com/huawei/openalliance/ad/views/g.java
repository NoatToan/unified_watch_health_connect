package com.huawei.openalliance.ad.views;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.br;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class g extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f21212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f21213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f21214c;
    private String d;
    private Context e;
    private BroadcastReceiver f;
    private List<View> g;

    public void setStyle(int i) {
        if (-1 == i) {
            return;
        }
        hw.b("MultiAdsTemplateView", "setStyleFromMedia");
        if (a(i)) {
            TextView textView = this.f21213b;
            if (textView != null) {
                textView.setTextColor(ContextCompat.getColor(this.e, R.color.hiad_90_percent_white));
            }
            if (bm.a(this.g)) {
                return;
            }
            Iterator<View> it = this.g.iterator();
            while (it.hasNext()) {
                it.next().setBackgroundColor(getResources().getColor(R.color.hiad_20_percent_white));
            }
            return;
        }
        TextView textView2 = this.f21213b;
        if (textView2 != null) {
            textView2.setTextColor(ContextCompat.getColor(this.e, R.color.hiad_90_percent_black));
        }
        if (bm.a(this.g)) {
            return;
        }
        Iterator<View> it2 = this.g.iterator();
        while (it2.hasNext()) {
            it2.next().setBackgroundColor(getResources().getColor(R.color.hiad_20_percent_black));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BroadcastReceiver broadcastReceiver = this.f;
        if (broadcastReceiver != null) {
            this.e.unregisterReceiver(broadcastReceiver);
            this.f = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setStyle(fp.b(getContext()).cB());
    }

    public void a(View view) {
        view.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        LinearLayout linearLayout = this.f21214c;
        if (linearLayout != null) {
            linearLayout.addView(view);
        }
    }

    public void a() {
        View view = new View(this.e);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMarginStart(as.a(getContext(), 88.0f));
        layoutParams.setMarginEnd(as.a(getContext(), 16.0f));
        layoutParams.topMargin = as.a(getContext(), 8.0f);
        view.setBackgroundColor(getResources().getColor(R.color.hiad_20_percent_black));
        view.setLayoutParams(layoutParams);
        this.f21214c.addView(view);
        this.g.add(view);
    }

    private void c() {
        this.f = new a(getContext().getApplicationContext(), this);
        as.a(getContext().getApplicationContext(), this.f, new IntentFilter(Constants.UI_CHANGE_ACTION));
    }

    private void b() {
        Map<String, String> mapAu = fp.b(this.e).au();
        if (!br.a(mapAu) && mapAu.containsKey(this.d)) {
            this.f21213b.setText(dg.e(mapAu.get(this.d)));
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Context f21215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<g> f21216b;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                g gVar = this.f21216b.get();
                if (gVar != null) {
                    gVar.setStyle(fp.b(this.f21215a).cB());
                }
            } catch (Throwable th) {
                hw.d("MultiAdsTemplateView", "ChangeUiModeReceiver err: %s", th.getClass().getSimpleName());
            }
        }

        public a(Context context, g gVar) {
            this.f21216b = new WeakReference<>(gVar);
            this.f21215a = context;
        }
    }

    private boolean a(int i) {
        return dk.r(getContext()) || 1 == i;
    }

    private void a(Context context) {
        View viewInflate = inflate(context, R.layout.hiad_multi_ads_template_view, this);
        this.f21212a = viewInflate;
        this.f21213b = (TextView) viewInflate.findViewById(R.id.multi_ads_title);
        this.f21214c = (LinearLayout) this.f21212a.findViewById(R.id.content_layout_view);
        b();
        c();
    }

    public g(Context context, String str) {
        super(context);
        this.g = new ArrayList();
        this.d = str;
        this.e = context;
        a(context);
    }
}
