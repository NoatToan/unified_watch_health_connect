package com.huawei.hms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.c;
import com.huawei.openalliance.ad.d;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.bm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class a extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f12747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f12748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HorizontalScrollView f12749c;
    private ScrollView d;
    private LinearLayout e;
    private LinearLayout f;
    private c g;
    private RelativeLayout h;
    private HorizontalScrollView i;
    private ScrollView j;
    private LinearLayout k;
    private LinearLayout l;
    private c m;
    private TextView n;
    private b o;

    /* JADX INFO: renamed from: com.huawei.hms.ads.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes33.dex */
    public enum EnumC0090a {
        NONE,
        INIT,
        SHOWN,
        DISLIKED
    }

    public void setOnCloseCallBack(b bVar) {
        this.o = bVar;
    }

    public void e() {
        d();
    }

    public void d() {
        b bVar = this.o;
        if (bVar != null) {
            bVar.a();
        }
        TextView textView = this.n;
        if (textView != null) {
            textView.setVisibility(8);
        }
        RelativeLayout relativeLayout = this.f12748b;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.h;
        boolean z = false;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        HorizontalScrollView horizontalScrollView = this.f12749c;
        if (horizontalScrollView != null) {
            horizontalScrollView.setVisibility(0);
        }
        List<String> arrayList = new ArrayList<>();
        b bVar2 = this.o;
        if (bVar2 != null) {
            arrayList = bVar2.c();
        }
        ArrayList arrayList2 = new ArrayList();
        if (bm.a(arrayList)) {
            a(null);
            return;
        }
        arrayList2.add(new d(getContext().getString(R.string.hiad_choices_ad_no_interest), com.huawei.openalliance.ad.b.NOT_INTEREST));
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new d(it.next(), com.huawei.openalliance.ad.b.CLOSE_AD));
        }
        if (this.f12747a.getWidth() > this.f12747a.getHeight()) {
            this.g = new c(getContext(), this, this.e);
            this.f12749c.setVisibility(0);
            this.d.setVisibility(8);
            z = true;
        } else {
            this.g = new c(getContext(), this, this.f);
            this.f12749c.setVisibility(8);
            this.d.setVisibility(0);
        }
        this.g.a(arrayList2, z);
        hw.a("CusWhyView", "SDK showFeedBackList end");
    }

    public void c() {
        b bVar = this.o;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void b() {
        RelativeLayout relativeLayout = this.h;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        boolean z = false;
        this.f12748b.setVisibility(0);
        d dVar = new d(getContext().getString(R.string.hiad_choices_hide), com.huawei.openalliance.ad.b.HIDE_AD);
        d dVar2 = new d(getContext().getString(R.string.hiad_choices_whythisad), com.huawei.openalliance.ad.b.WHY_THIS_AD);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar);
        arrayList.add(dVar2);
        if (this.f12747a.getWidth() > this.f12747a.getHeight()) {
            this.m = new c(getContext(), this, this.k);
            this.i.setVisibility(0);
            this.j.setVisibility(8);
            z = true;
        } else {
            this.m = new c(getContext(), this, this.l);
            this.i.setVisibility(8);
            this.j.setVisibility(0);
        }
        this.m.a(arrayList, z);
        hw.a("CusWhyView", "SDK showWhyThisAd end");
    }

    public void a(String str) {
        HorizontalScrollView horizontalScrollView = this.f12749c;
        if (horizontalScrollView != null) {
            horizontalScrollView.setVisibility(8);
        }
        ScrollView scrollView = this.d;
        if (scrollView != null) {
            scrollView.setVisibility(8);
        }
        HorizontalScrollView horizontalScrollView2 = this.i;
        if (horizontalScrollView2 != null) {
            horizontalScrollView2.setVisibility(8);
        }
        ScrollView scrollView2 = this.j;
        if (scrollView2 != null) {
            scrollView2.setVisibility(8);
        }
        RelativeLayout relativeLayout = this.h;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        TextView textView = this.n;
        if (textView != null) {
            textView.setVisibility(0);
        }
        this.o.a(str);
        hw.a("CusWhyView", "SDK processCloseEvent");
    }

    public void a() {
        this.f12748b.setVisibility(8);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.f12749c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.n.setVisibility(8);
    }

    private void a(Context context, AttributeSet attributeSet) {
        inflate(context, R.layout.hiad_choices_whythisad_root, this);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.hiad_whythisad_wrapper);
        this.f12748b = relativeLayout;
        relativeLayout.setVisibility(8);
        this.i = (HorizontalScrollView) findViewById(R.id.hiad_whythisad_horizontal_List);
        this.k = (LinearLayout) findViewById(R.id.hiad_whythisad_horizional_ll_wrapper);
        this.i.setVisibility(8);
        this.j = (ScrollView) findViewById(R.id.hiad_whythisad_vertical_feedback_List);
        this.l = (LinearLayout) findViewById(R.id.hiad_whythisad_vertical_ll_wrapper);
        this.j.setVisibility(8);
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.hiad_feedback_wrapper);
        this.h = relativeLayout2;
        relativeLayout2.setVisibility(8);
        this.f12749c = (HorizontalScrollView) findViewById(R.id.hiad_feedback_horizontal_List);
        this.e = (LinearLayout) findViewById(R.id.hiad_feedback_horizional_ll_wrapper);
        this.f12749c.setVisibility(8);
        this.d = (ScrollView) findViewById(R.id.hiad_feedback_vertical_feedback_List);
        this.f = (LinearLayout) findViewById(R.id.hiad_feedback_vertical_ll_wrapper);
        this.d.setVisibility(8);
        TextView textView = (TextView) findViewById(R.id.hiad_closed_hint);
        this.n = textView;
        textView.setVisibility(8);
    }

    public a(Context context, RelativeLayout relativeLayout) {
        super(context);
        this.f12747a = relativeLayout;
        a(context, null);
    }
}
