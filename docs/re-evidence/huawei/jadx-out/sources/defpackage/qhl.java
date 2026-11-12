package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class qhl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, List<String>> f46235a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f46236c;
    private String d;
    private String e;

    public String a() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    public String d() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public Map<String, List<String>> c() {
        return this.f46235a;
    }

    public void a(Map<String, List<String>> map) {
        this.f46235a = map;
    }

    public List<String> b() {
        return this.f46236c;
    }

    public void d(List<String> list) {
        this.f46236c = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("ThreeCircleRulesBean{mPromptType=");
        sb.append(this.d);
        sb.append(",mCategory=");
        sb.append(this.e);
        sb.append(",mRuleSet=");
        sb.append(this.f46235a);
        sb.append(",mTotalParams=");
        sb.append(this.f46236c);
        return sb.toString();
    }
}
