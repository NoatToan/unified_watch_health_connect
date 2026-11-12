package com.huawei.ui.commonui.chart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.oval.HealthOval;
import defpackage.njy;
import defpackage.qjm;
import defpackage.qjp;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class HealthRingChartAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DataFormatter f23355a = new DataFormatter() { // from class: qjn
        @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
        public final String format(qjp qjpVar) {
            return String.format(Locale.ENGLISH, "%.1f", Double.valueOf(qjpVar.f()));
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final DataFormatter f23356b = new DataFormatter() { // from class: qjl
        @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
        public final String format(qjp qjpVar) {
            return HealthRingChartAdapter.b(qjpVar);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f23357c;
    private int[] d;
    private List<qjp> e;
    private int f;
    private boolean g;
    private int[] h;
    private int[] i;
    private DataListener j;
    private DataFormatter k;
    private DataFormatter l;
    private int m;
    private boolean n;
    private boolean o;
    private float t;

    public interface DataFormatter {
        String format(qjp qjpVar);
    }

    interface DataListener {
        void onDataUpdate();
    }

    public static /* synthetic */ String b(qjp qjpVar) {
        return String.format(Locale.ENGLISH, "%.1f", Float.valueOf(qjpVar.b() * 100.0f)) + "%";
    }

    public HealthRingChartAdapter(Context context, qjm qjmVar) {
        this.e = new ArrayList();
        this.o = false;
        this.n = false;
        this.k = f23355a;
        this.l = f23356b;
        this.m = 0;
        this.t = 0.0f;
        this.g = false;
        this.f23357c = context;
        if (qjmVar != null) {
            this.o = qjmVar.a();
            this.n = qjmVar.e();
            this.g = qjmVar.c();
        }
    }

    public HealthRingChartAdapter(Context context, qjm qjmVar, List<qjp> list) {
        this(context, qjmVar);
        e(list);
    }

    public final void e(List<qjp> list) {
        List<qjp> list2 = this.e;
        if (list2 == null) {
            LogUtil.e("HealthRingChartAdapter", "setData mData null");
            return;
        }
        list2.clear();
        this.e.addAll(list);
        g();
        double d = 0.0d;
        for (int i = 0; i < this.e.size(); i++) {
            qjp qjpVar = this.e.get(i);
            double dF = qjpVar.f();
            d += dF;
            this.h[i] = (int) dF;
            this.d[i] = qjpVar.d();
            this.i[i] = qjpVar.c();
        }
        for (qjp qjpVar2 : this.e) {
            if (Math.abs(d) < 1.0E-6d) {
                return;
            }
            float f = (float) (qjpVar2.f() / d);
            qjpVar2.e(f);
            qjpVar2.b(Math.round(f * 100.0f));
        }
        h();
        DataListener dataListener = this.j;
        if (dataListener != null) {
            dataListener.onDataUpdate();
        }
    }

    private void g() {
        int size = this.e.size();
        int[] iArr = this.h;
        if (iArr == null || iArr.length != size) {
            this.h = new int[size];
        }
        int[] iArr2 = this.d;
        if (iArr2 == null || iArr2.length != size) {
            this.d = new int[size];
        }
        int[] iArr3 = this.i;
        if (iArr3 == null || iArr3.length != size) {
            this.i = new int[size];
        }
    }

    private void h() {
        int size = this.e.size();
        Iterator<qjp> it = this.e.iterator();
        int iE = 0;
        while (it.hasNext()) {
            iE += it.next().e();
        }
        if (iE == 100) {
            return;
        }
        int i = 100 - iE;
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            qjp qjpVar = this.e.get(size);
            if (Math.abs((qjpVar.b() * 100.0f) - qjpVar.e()) > 1.0E-5d) {
                if (i > 0) {
                    qjpVar.b(qjpVar.e() + 1);
                    i--;
                } else {
                    if (i >= 0) {
                        return;
                    }
                    qjpVar.b(qjpVar.e() - 1);
                    i++;
                }
            }
        }
    }

    void b(List<Integer> list) {
        if (list == null || this.e == null) {
            LogUtil.j("HealthRingChartAdapter", "update values failed, cause titles or mData is null!");
            return;
        }
        int iMin = Math.min(list.size(), this.e.size());
        for (int i = 0; i < iMin; i++) {
            qjp qjpVar = this.e.get(i);
            Integer num = list.get(i);
            if (qjpVar != null) {
                qjpVar.b(num.intValue());
            }
        }
        DataListener dataListener = this.j;
        if (dataListener != null) {
            dataListener.onDataUpdate();
        }
    }

    e e(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.f23357c).inflate(R.layout.health_ring_chart_item_layout, viewGroup, false);
        viewGroup.addView(viewInflate);
        return new e(viewInflate);
    }

    void e(e eVar, int i) {
        if (njy.e(this.e, i)) {
            LogUtil.j("HealthRingChartAdapter", "onBindViewHolder is out of bounds");
            return;
        }
        if (this.g) {
            c(eVar.f23358a);
            c(eVar.f23359b);
            c(eVar.d);
        }
        qjp qjpVar = this.e.get(i);
        eVar.f23360c.setFillColor(qjpVar.c());
        eVar.f23360c.invalidate();
        if (this.m != 0) {
            eVar.f23358a.setTextColor(this.m);
        }
        eVar.f23358a.setText(qjpVar.a());
        DataFormatter dataFormatter = this.k;
        String str = dataFormatter != null ? dataFormatter.format(qjpVar) : null;
        if (!this.o) {
            eVar.f23359b.setVisibility(8);
        } else {
            eVar.f23359b.setVisibility(0);
            eVar.f23359b.setText(str);
        }
        if (i == this.e.size() - 1 && !Double.isInfinite(1.0f - this.t) && !Double.isNaN(1.0f - this.t)) {
            qjpVar.e(new BigDecimal(1.0f - this.t).setScale(this.f, 4).floatValue());
        }
        if (!Double.isInfinite(qjpVar.b()) && !Double.isNaN(qjpVar.b())) {
            this.t += new BigDecimal(qjpVar.b()).setScale(this.f, 4).floatValue();
        }
        DataFormatter dataFormatter2 = this.l;
        String str2 = dataFormatter2 != null ? dataFormatter2.format(qjpVar) : null;
        if (i == this.e.size() - 1) {
            this.t = 0.0f;
        }
        if (!this.n) {
            eVar.d.setVisibility(8);
        } else {
            eVar.d.setVisibility(0);
            eVar.d.setText(str2);
        }
    }

    int d() {
        List<qjp> list = this.e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    int[] a() {
        return this.d;
    }

    int[] c() {
        return this.i;
    }

    int[] b() {
        int size = this.e.size();
        int[] iArr = new int[size];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            qjp qjpVar = this.e.get(i3);
            if (qjpVar != null) {
                if (qjpVar.b() <= 0.0f || qjpVar.b() >= 0.016f) {
                    int iF = (int) qjpVar.f();
                    iArr[i3] = iF;
                    i += iF;
                } else {
                    i2++;
                }
            }
        }
        int iRound = Math.round(i / (62.499996f - i2));
        for (int i4 = 0; i4 < size; i4++) {
            qjp qjpVar2 = this.e.get(i4);
            if (qjpVar2 != null && qjpVar2.b() > 0.0f && qjpVar2.b() < 0.016f) {
                iArr[i4] = iRound;
                int iC = qjpVar2.c();
                qjpVar2.d(iC);
                this.d[i4] = iC;
            }
        }
        return iArr;
    }

    private void c(HealthTextView healthTextView) {
        healthTextView.setAutoTextSize(1, 10.0f);
        healthTextView.setAutoTextInfo(10, 1, 1);
    }

    public boolean e() {
        return this.g;
    }

    public void d(int i) {
        this.m = i;
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f23358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f23359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthOval f23360c;
        HealthTextView d;

        e(View view) {
            this.f23360c = (HealthOval) view.findViewById(R.id.ring_chart_legend_oval);
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.ring_chart_legend_title);
            this.f23358a = healthTextView;
            if (LanguageUtil.q(healthTextView.getContext())) {
                this.f23358a.setTextSize(1, 11.0f);
            }
            this.f23359b = (HealthTextView) view.findViewById(R.id.ring_chart_item_value);
            this.d = (HealthTextView) view.findViewById(R.id.ring_chart_item_percent);
            if (qrs.ac()) {
                a(this.f23358a);
                a(this.f23359b);
                a(this.d);
            }
        }

        private void a(HealthTextView healthTextView) {
            healthTextView.setAutoTextSize(1, 24.0f);
            healthTextView.setAutoTextInfo(24, 1, 1);
        }
    }

    public void d(DataFormatter dataFormatter) {
        this.k = dataFormatter;
    }

    public void c(DataFormatter dataFormatter) {
        e(dataFormatter, 1);
    }

    public void e(DataFormatter dataFormatter, int i) {
        this.l = dataFormatter;
        this.f = i + 2;
    }

    void b(DataListener dataListener) {
        this.j = dataListener;
    }
}
