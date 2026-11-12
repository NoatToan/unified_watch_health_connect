package com.huawei.health.knit.section.adapter;

import com.huawei.health.knit.section.adapter.SectionRingChartData;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.IllegalFormatConversionException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class SectionRingChartData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f7437c;
    private List<Integer> d;
    private List<String> f;
    private List<Double> i;
    private static final DataFormatter e = new DataFormatter() { // from class: fqd
        @Override // com.huawei.health.knit.section.adapter.SectionRingChartData.DataFormatter
        public final String format(double d) {
            return SectionRingChartData.a(d);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final DataFormatter f7435b = new DataFormatter() { // from class: fqf
        @Override // com.huawei.health.knit.section.adapter.SectionRingChartData.DataFormatter
        public final String format(double d) {
            return SectionRingChartData.d(d);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Float> f7436a = new ArrayList();
    private boolean h = false;
    private boolean j = false;

    public interface DataFormatter {
        String format(double d);
    }

    public static /* synthetic */ String a(double d) {
        int i = (int) d;
        int i2 = i / 60;
        int i3 = i % 60;
        try {
            String quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_min_unit, i3, UnitUtil.e(i3, 1, 0));
            String quantityString2 = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hour_unit, i2, UnitUtil.e(i2, 1, 0));
            if (i2 == 0) {
                return quantityString;
            }
            if (i3 == 0) {
                return quantityString2;
            }
            if (LanguageUtil.x(BaseApplication.getContext())) {
                return quantityString2 + " و " + quantityString;
            }
            return BaseApplication.getContext().getString(R.string.IDS_two_parts, quantityString2, quantityString);
        } catch (IllegalFormatConversionException e2) {
            LogUtil.j("SectionRingChartData", "DEFAULT_VALUE_FORMATTER IllegalFormatConversionException = ", e2);
            return "";
        }
    }

    public static /* synthetic */ String d(double d) {
        return String.format(Locale.ENGLISH, "%.1f", Double.valueOf(d * 100.0d)) + "%";
    }

    public void e(List<Integer> list) {
        this.f7437c = list;
    }

    public List<Integer> a() {
        return this.f7437c;
    }

    public void a(List<Integer> list) {
        this.d = list;
    }

    public List<Integer> c() {
        return this.d;
    }

    public void c(List<String> list) {
        this.f = list;
    }

    public List<String> f() {
        return this.f;
    }

    public void d(List<Double> list) {
        this.i = list;
        j();
    }

    public List<String> h() {
        ArrayList arrayList = new ArrayList();
        Iterator<Double> it = this.i.iterator();
        while (it.hasNext()) {
            arrayList.add(e.format(it.next().doubleValue()));
        }
        return arrayList;
    }

    public List<String> d() {
        ArrayList arrayList = new ArrayList();
        Iterator<Float> it = this.f7436a.iterator();
        while (it.hasNext()) {
            arrayList.add(f7435b.format(it.next().floatValue()));
        }
        return arrayList;
    }

    private void j() {
        Iterator<Double> it = this.i.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        Iterator<Double> it2 = this.i.iterator();
        while (it2.hasNext()) {
            this.f7436a.add(Float.valueOf((float) (it2.next().doubleValue() / dDoubleValue)));
        }
    }

    public List<Integer> b() {
        ArrayList arrayList = new ArrayList();
        int size = this.i.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iIntValue = this.i.get(i3).intValue();
            if (this.f7436a.get(i3).floatValue() <= 0.0f || this.f7436a.get(i3).floatValue() >= 0.016f) {
                i += iIntValue;
            } else {
                i2++;
            }
            arrayList.add(Integer.valueOf(iIntValue));
        }
        int iRound = Math.round(i / (62.499996f - i2));
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f7436a.get(i4).floatValue() > 0.0f && this.f7436a.get(i4).floatValue() < 0.016f) {
                arrayList.set(i4, Integer.valueOf(iRound));
                this.f7437c.set(i4, this.d.get(i4));
            }
        }
        return arrayList;
    }

    public int e() {
        Iterator<Integer> it = b().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public boolean g() {
        return this.h;
    }

    public void b(boolean z) {
        this.j = z;
    }

    public boolean i() {
        return this.j;
    }
}
