package defpackage;

import com.huawei.ads.fund.util.ListUtil;
import com.huawei.ads.fund.util.StringUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ayg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f792c;
    private Map<String, axf> d;

    public long e() {
        return this.f792c;
    }

    public String d() {
        return this.f790a;
    }

    public void b(long j) {
        this.f792c = j;
    }

    public long c() {
        return this.f791b;
    }

    public void e(String str) {
        this.f790a = str;
    }

    public void e(long j) {
        this.f791b = j;
    }

    public String b() {
        if (axv.d(this.d)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (axf axfVar : this.d.values()) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            String strA = axfVar.a();
            if (!StringUtils.isBlank(strA)) {
                sb.append(strA);
            }
        }
        return sb.toString();
    }

    public ayg(List<axm> list) {
        if (ListUtil.isEmpty(list)) {
            return;
        }
        this.d = new LinkedHashMap();
        for (axm axmVar : list) {
            if (axmVar != null && !axmVar.h()) {
                String strJ = axmVar.j();
                if (!StringUtils.isBlank(strJ)) {
                    List<axh> listB = axmVar.b();
                    if (!ListUtil.isEmpty(listB)) {
                        axf axfVar = new axf();
                        for (axh axhVar : listB) {
                            if (axhVar != null) {
                                if (Math.abs(axhVar.g()) > 9.99999993922529E-9d) {
                                    axfVar.e();
                                }
                                if (!axhVar.w().booleanValue()) {
                                    axfVar.b();
                                }
                            }
                        }
                        axfVar.d(listB.size());
                        axfVar.b(strJ);
                        this.d.put(strJ, axfVar);
                    }
                }
            }
        }
    }

    public ayg() {
    }
}
