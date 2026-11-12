package com.garmin.android.apps.connectmobile.activities.charts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import hx0.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k32.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\fB5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/charts/c;", "", "Landroid/view/ViewGroup;", "rootView", "Lcom/garmin/android/apps/connectmobile/activities/charts/c$b;", "selectionListener", "", "", "initialSelection", "<init>", "(Landroid/view/ViewGroup;Lcom/garmin/android/apps/connectmobile/activities/charts/c$b;Ljava/util/Map;)V", "a", "b", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f28972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f28973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedHashMap<String, Object> f28976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<e<Object>> f28977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28978g;

    public interface b {
        void A6(Object obj, boolean z14);
    }

    static {
        new a(null);
    }

    public c(ViewGroup viewGroup, b bVar, Map<String, ? extends Object> map) {
        this.f28972a = viewGroup;
        this.f28973b = bVar;
        this.f28974c = 1;
        this.f28976e = new LinkedHashMap<>();
        this.f28977f = new ArrayList<>();
        this.f28978g = true;
        if (map != null) {
            this.f28976e.clear();
            this.f28976e.putAll(map);
            c(null, this.f28976e);
        }
    }

    public final int[] a() {
        ArrayList arrayList = new ArrayList();
        ArrayList<e<Object>> arrayList2 = this.f28977f;
        for (Object obj : arrayList2) {
            if (((e) obj).b()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(arrayList2.indexOf((e) it.next())));
        }
        return h0.a1(arrayList3);
    }

    public final void b(List<Integer> list) {
        ArrayList<e<Object>> arrayList = this.f28977f;
        Iterator<e<Object>> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().c(false);
        }
        Iterator<Integer> it3 = list.iterator();
        while (it3.hasNext()) {
            int iIntValue = it3.next().intValue();
            if (iIntValue >= 0 && iIntValue < arrayList.size()) {
                arrayList.get(iIntValue).c(true);
            }
        }
        ViewGroup viewGroup = this.f28972a;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public final void c(String str, LinkedHashMap linkedHashMap) {
        Context context;
        TextView textView;
        linkedHashMap.getClass();
        ViewGroup viewGroup = this.f28972a;
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            return;
        }
        this.f28976e = linkedHashMap;
        viewGroup.removeAllViews();
        if (str != null) {
            textView = new TextView(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(15, 15, 15, 15);
            textView.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary));
            textView.setLayoutParams(layoutParams);
            textView.setText(str);
        } else {
            textView = null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 15, 0, 0);
        linearLayout.setLayoutParams(layoutParams2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object systemService = context.getSystemService("layout_inflater");
            systemService.getClass();
            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.view_display_chip, viewGroup, false);
            e<Object> eVar = new e<>(viewInflate, entry.getValue(), false, 4, null);
            k kVar = new k(15, this, eVar);
            Button button = eVar.f102679d;
            if (button != null) {
                button.setOnClickListener(kVar);
            }
            this.f28977f.add(eVar);
            String str2 = (String) entry.getKey();
            str2.getClass();
            if (button != null) {
                button.setText(str2);
            }
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.setMargins(15, 0, 15, 0);
            viewInflate.setLayoutParams(layoutParams3);
            linearLayout.addView(viewInflate);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        if (textView != null) {
            linearLayout2.addView(textView);
        }
        linearLayout2.addView(linearLayout);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setVerticalScrollBarEnabled(false);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        horizontalScrollView.addView(linearLayout2);
        viewGroup.addView(horizontalScrollView);
        viewGroup.setVisibility(0);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/charts/c$a;", "", "<init>", "()V", "", "DEFAULT_MARGIN", "I", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(ViewGroup viewGroup, b bVar, Map map, int i14, j jVar) {
        this(viewGroup, (i14 & 2) != 0 ? null : bVar, (i14 & 4) != 0 ? null : map);
    }
}
