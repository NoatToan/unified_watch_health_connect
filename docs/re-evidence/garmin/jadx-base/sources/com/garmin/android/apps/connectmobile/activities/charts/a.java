package com.garmin.android.apps.connectmobile.activities.charts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import hx0.k;
import im.h;
import java.util.ArrayList;
import java.util.List;
import k32.e;
import p005kotlin.Metadata;
import p13.h0;
import zm.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/charts/a;", "", "Landroid/widget/LinearLayout;", "view", "Lcom/garmin/android/apps/connectmobile/activities/charts/a$a;", "optionListener", "<init>", "(Landroid/widget/LinearLayout;Lcom/garmin/android/apps/connectmobile/activities/charts/a$a;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f28955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0444a f28956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<? extends p> f28958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f28959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<e<Object>> f28960f;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.charts.a$a, reason: collision with other inner class name */
    public interface InterfaceC0444a {
        void c6(p pVar);

        void v6();
    }

    public a(LinearLayout linearLayout, InterfaceC0444a interfaceC0444a) {
        interfaceC0444a.getClass();
        this.f28955a = linearLayout;
        this.f28956b = interfaceC0444a;
        this.f28957c = true;
        this.f28959e = linearLayout != null ? linearLayout.getContext() : null;
        this.f28960f = new ArrayList<>();
    }

    public final void a(ArrayList arrayList) {
        List<? extends p> listN0 = h0.N0(arrayList, new h());
        this.f28958d = listN0;
        LinearLayout linearLayout = this.f28955a;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        ArrayList<p> arrayList2 = new ArrayList();
        for (Object obj : listN0) {
            if (((p) obj).W0() != null) {
                arrayList2.add(obj);
            }
        }
        Context context = this.f28959e;
        if (context != null) {
            for (p pVar : arrayList2) {
                Object systemService = context.getSystemService("layout_inflater");
                systemService.getClass();
                View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.view_display_chip, (ViewGroup) linearLayout, false);
                e<Object> eVar = new e<>(viewInflate, pVar, false, 4, null);
                k kVar = new k(14, this, eVar);
                Button button = eVar.f102679d;
                if (button != null) {
                    button.setOnClickListener(kVar);
                }
                this.f28960f.add(eVar);
                String strW0 = pVar.W0();
                if (strW0 != null && button != null) {
                    button.setText(strW0);
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(15, 0, 15, 0);
                viewInflate.setLayoutParams(layoutParams);
                if (linearLayout != null) {
                    linearLayout.addView(viewInflate);
                }
            }
        }
    }
}
