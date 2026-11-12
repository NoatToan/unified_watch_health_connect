package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mdd extends mdl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<mdg> f41456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41458c;
    private String d;
    private String e = null;

    public mdd(Map<String, String> map, List<mdg> list, String str) {
        a(map.get("issuerid"));
        e(map.get("appletId"));
        b(map.get("cplc"));
        c(map.get("transactionId"));
        d(map.get("commandId"));
        b(list);
        b(list.size());
        i(str);
    }

    public String e() {
        return this.e;
    }

    private void d(String str) {
        this.e = str;
    }

    public int c() {
        return this.f41457b;
    }

    private void b(int i) {
        this.f41457b = i;
    }

    public List<mdg> b() {
        return this.f41456a;
    }

    private void b(List<mdg> list) {
        this.f41456a = list;
    }

    public String d() {
        return this.f41458c;
    }

    private void i(String str) {
        this.f41458c = str;
    }

    public String a() {
        return this.d;
    }
}
