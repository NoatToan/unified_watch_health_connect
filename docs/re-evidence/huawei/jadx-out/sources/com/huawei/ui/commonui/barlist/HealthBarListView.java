package com.huawei.ui.commonui.barlist;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.R;
import defpackage.qix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HealthBarListView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayoutManager f23291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23292c;
    private BarViewAdapter d;
    private List<qix> e;
    private TextView i;

    public HealthBarListView(Context context) {
        super(context);
        this.e = new ArrayList();
        this.f23290a = 0;
        d();
    }

    public HealthBarListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new ArrayList();
        this.f23290a = 0;
        d();
    }

    public HealthBarListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new ArrayList();
        this.f23290a = 0;
        d();
    }

    private void d() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.health_bar_list_view_layout, this);
        this.i = (TextView) viewInflate.findViewById(R.id.health_bar_list_title);
        final LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.health_bar_root);
        post(new Runnable() { // from class: com.huawei.ui.commonui.barlist.HealthBarListView.1
            @Override // java.lang.Runnable
            public void run() {
                HealthBarListView.this.a(linearLayout, (HealthBarListView.this.getMeasuredWidth() - (HealthBarListView.this.getContext().getResources().getDimensionPixelSize(R.dimen.health_bar_view_margin) * 7)) / 7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(LinearLayout linearLayout, int i) {
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f23291b = new LinearLayoutManager(getContext(), 0, false);
        List<qix> list = this.e;
        if (list != null && list.size() > 7 && this.f23290a > 7) {
            this.f23291b.setStackFromEnd(true);
        }
        recyclerView.setLayoutManager(this.f23291b);
        BarViewAdapter barViewAdapter = new BarViewAdapter(getContext(), i, this.f23292c);
        this.d = barViewAdapter;
        recyclerView.setAdapter(barViewAdapter);
        setData(this.e, this.f23290a);
        linearLayout.addView(recyclerView);
    }

    public void setTitle(String str) {
        this.i.setText(str);
    }

    public void setBarColor(int i) {
        BarViewAdapter barViewAdapter = this.d;
        if (barViewAdapter == null) {
            this.f23292c = i;
        } else {
            barViewAdapter.a(i);
        }
    }

    public void setData(List<qix> list, int i) {
        if (this.d == null) {
            this.e.clear();
            this.e.addAll(list);
            this.f23290a = i;
            return;
        }
        if (list == null) {
            return;
        }
        if (list.size() > 7 && i > 7) {
            this.f23291b.setStackFromEnd(true);
        }
        if (list.size() <= 7 || i <= 7) {
            this.d.e(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        int iMax = Math.max(i, 7);
        for (int i2 = 0; i2 < list.size(); i2++) {
            qix qixVar = list.get(i2);
            if (i2 < iMax) {
                arrayList.add(qixVar);
            } else {
                arrayList2.add(qixVar);
            }
        }
        this.d.e(arrayList);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.huawei.ui.commonui.barlist.HealthBarListView.3
            @Override // java.lang.Runnable
            public void run() {
                HealthBarListView.this.d.b(arrayList2);
            }
        }, 200L);
    }
}
