package defpackage;

import com.huawei.ads.adsrec.rank.sortation.IModelScoreData;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.ads.fund.util.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ayc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f782c;
    private final String d;
    private Integer e;
    private final int f;
    private Integer g;
    private String h;
    private String i;
    private String j;
    private Integer k;
    private String l;
    private int m = 0;
    private Map<String, ayn> n;
    private volatile IModelScoreData o;

    public String toString() {
        return "AdRecallParam{appPkgName='" + this.d + "', adSlotIds=" + this.f782c + ", maxCount=" + this.f781b + ", adType=" + this.f + ", clientRequestId='" + this.h + "'}";
    }

    public void b(Integer num) {
        this.g = num;
    }

    public void a(Integer num) {
        this.k = num;
    }

    public void e(String str) {
        this.i = str;
    }

    public void b(String str) {
        this.j = str;
    }

    public void c(Integer num) {
        this.e = num;
    }

    public void d(String str) {
        this.l = str;
    }

    public void c(List<String> list) {
        this.f780a = list;
    }

    public String o() {
        if (axv.d(this.n)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Map.Entry<String, ayn> entry : this.n.entrySet()) {
            String key = entry.getKey();
            ayn value = entry.getValue();
            if (value != null) {
                if (i > 0) {
                    sb.append(";");
                }
                Integer numB = value.b();
                Integer numE = value.e();
                sb.append(key);
                sb.append(",");
                sb.append(numB == null ? 0 : numB.intValue());
                sb.append(",");
                sb.append(numE == null ? 0 : numE.intValue());
                i++;
            }
        }
        return sb.toString();
    }

    public Integer k() {
        return this.g;
    }

    public Integer n() {
        return this.k;
    }

    public String l() {
        return this.i;
    }

    public Integer m() {
        return this.f781b;
    }

    public Integer i() {
        return this.e;
    }

    public String f() {
        return this.l;
    }

    public int g() {
        return this.f;
    }

    public String h() {
        return this.j;
    }

    public int j() {
        return this.m;
    }

    public IModelScoreData a() {
        return this.o;
    }

    public String b() {
        return this.h;
    }

    public String e() {
        String str = this.d;
        return str == null ? this.l : str;
    }

    public void c(String str, Integer num) {
        if (StringUtils.isBlank(str)) {
            return;
        }
        c(str).c(num);
    }

    public void c(int i) {
        this.m = i;
    }

    public List<String> d() {
        return this.f780a;
    }

    public Integer a(String str) {
        ayn aynVarF = f(str);
        if (aynVarF == null) {
            return null;
        }
        return aynVarF.b();
    }

    public void e(String str, Integer num) {
        if (StringUtils.isBlank(str)) {
            return;
        }
        c(str).e(num);
    }

    public void b(int i) {
        if (this.k == null) {
            this.k = Integer.valueOf(i);
        }
    }

    public List<String> c() {
        return this.f782c;
    }

    private void q() {
        if (ListUtil.isEmpty(this.f782c)) {
            return;
        }
        this.n = new HashMap(((int) (this.f782c.size() / 0.75f)) + 1);
        for (String str : this.f782c) {
            if (!StringUtils.isBlank(str)) {
                this.n.put(str, new ayn());
            }
        }
    }

    private ayn f(String str) {
        if (axv.d(this.n) || StringUtils.isBlank(str)) {
            return null;
        }
        return this.n.get(str);
    }

    private ayn c(String str) {
        if (this.n == null) {
            this.n = new HashMap();
        }
        ayn aynVar = this.n.get(str);
        if (aynVar != null) {
            return aynVar;
        }
        ayn aynVar2 = new ayn();
        this.n.put(str, aynVar2);
        return aynVar2;
    }

    public ayc(String str, String str2, List<String> list, Integer num, int i) {
        this.d = str;
        this.h = str2;
        this.f782c = list;
        this.f781b = num;
        this.f = i;
        q();
    }
}
