package defpackage;

import com.huawei.ads.adsrec.IUtilCallback;
import com.huawei.ads.adsrec.l;
import com.huawei.ads.adsrec.o0;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.ads.fund.util.StringUtils;
import com.huawei.openplatform.abl.log.HiAdLog;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class axp extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f756b;
    private int d;
    private Map<String, d> e;

    @Override // com.huawei.ads.adsrec.h0
    public void a() {
        c cVar = new c(null);
        for (axh axhVar : this.f4757a) {
            if (axhVar.w().booleanValue()) {
                double dK = axhVar.k();
                double dG = axhVar.g();
                cVar.f757a = Double.valueOf(Math.min(cVar.f757a.doubleValue(), dK));
                cVar.d = Double.valueOf(Math.max(cVar.d.doubleValue(), dK));
                cVar.e = Double.valueOf(Math.min(cVar.e.doubleValue(), dG));
                cVar.f758c = Double.valueOf(Math.max(cVar.f758c.doubleValue(), dG));
            }
        }
        double dDoubleValue = cVar.d.doubleValue();
        double dDoubleValue2 = cVar.f757a.doubleValue();
        double dDoubleValue3 = cVar.f758c.doubleValue();
        double dDoubleValue4 = cVar.e.doubleValue();
        Iterator<axh> it = this.f4757a.iterator();
        while (it.hasNext()) {
            axh next = it.next();
            if (next.w().booleanValue()) {
                double dK2 = next.k();
                double dG2 = next.g();
                Iterator<axh> it2 = it;
                double d2 = dDoubleValue;
                int iB = b(((dK2 - cVar.f757a.doubleValue()) / (dDoubleValue - dDoubleValue2)) * ((double) this.d));
                int i = this.d;
                if (iB == i) {
                    iB = i - 1;
                }
                int iB2 = b(((dG2 - cVar.e.doubleValue()) / (dDoubleValue3 - dDoubleValue4)) * ((double) this.d));
                int i2 = this.d;
                if (iB2 == i2) {
                    iB2 = i2 - 1;
                }
                d dVar = new d(iB, iB2);
                if (!StringUtils.isBlank(next.i())) {
                    this.e.put(next.i(), dVar);
                }
                next.i();
                it = it2;
                dDoubleValue = d2;
            }
        }
        Collections.sort(this.f4757a, new e());
        if (HiAdLog.isDebugEnable()) {
            Iterator<axh> it3 = this.f4757a.iterator();
            while (it3.hasNext()) {
                it3.next().i();
            }
        }
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f760c;

        public int b() {
            return this.f760c;
        }

        public int a() {
            return this.f759b;
        }

        public d(int i, int i2) {
            this.f759b = i;
            this.f760c = i2;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Double f757a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Double f758c;
        Double d;
        Double e;

        /* synthetic */ c(e eVar) {
            this();
        }

        private c() {
            Double dValueOf = Double.valueOf(Double.MAX_VALUE);
            this.f757a = dValueOf;
            Double dValueOf2 = Double.valueOf(Double.MIN_VALUE);
            this.d = dValueOf2;
            this.e = dValueOf;
            this.f758c = dValueOf2;
        }
    }

    class e implements Comparator<axh> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(axh axhVar, axh axhVar2) {
            return o0.a(axhVar, axhVar2, (axhVar.w().booleanValue() && axhVar2.w().booleanValue()) ? axp.this.d(axhVar, axhVar2) : o0.a(axhVar, axhVar2));
        }

        e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(axh axhVar, axh axhVar2) {
        double dK = axhVar.k();
        double dG = axhVar.g();
        double dK2 = axhVar2.k();
        double dG2 = axhVar2.g();
        d dVar = this.e.get(axhVar.i());
        d dVar2 = this.e.get(axhVar2.i());
        if (dVar == null || dVar2 == null) {
            HiAdLog.e("StrategySortation", "content can't find in sortingDataMap");
            return 0;
        }
        int iA = dVar.a();
        int iB = dVar.b();
        int iA2 = dVar2.a();
        int iB2 = dVar2.b();
        int iCompare = Integer.compare(iA2 + iB2, iA + iB);
        if (iCompare != 0) {
            return iCompare;
        }
        if (this.f756b == 1) {
            int iCompare2 = Integer.compare(iB2, iB);
            if (iCompare2 == 0) {
                iCompare2 = o0.a(dG2, dG);
            }
            return iCompare2 == 0 ? o0.a(dK2, dK) : iCompare2;
        }
        int iCompare3 = Integer.compare(iA2, iA);
        if (iCompare3 == 0) {
            iCompare3 = o0.a(dK2, dK);
        }
        return iCompare3 == 0 ? o0.a(dG2, dG) : iCompare3;
    }

    private static int b(double d2) {
        int i = (int) d2;
        return Math.abs(d2 - ((double) i)) > 9.99999993922529E-9d ? i : (int) Math.round(d2);
    }

    public axp(List<axh> list) {
        super(list);
        this.f756b = 0;
        this.d = 10;
        IUtilCallback iUtilCallbackC = awz.c();
        if (iUtilCallbackC != null) {
            this.f756b = StringUtils.parseIntOrDefault(iUtilCallbackC.getConfig("rankSide"), 0);
            int intOrDefault = StringUtils.parseIntOrDefault(iUtilCallbackC.getConfig("bucketCnt"), 10);
            this.d = intOrDefault;
            this.d = intOrDefault >= 1 ? intOrDefault : 10;
        }
        if (ListUtil.isEmpty(list)) {
            return;
        }
        this.e = new HashMap();
    }
}
