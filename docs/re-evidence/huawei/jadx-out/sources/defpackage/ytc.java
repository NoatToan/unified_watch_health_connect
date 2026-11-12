package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes46.dex */
public class ytc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Integer, List<ytf>> f53837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53839c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String i;
    private int j;

    public ytc() {
    }

    public ytc(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Map<Integer, List<ytf>> map) {
        this.g = str;
        this.f = str2;
        this.f53838b = str3;
        this.i = str4;
        this.d = str5;
        this.e = str6;
        this.j = i;
        this.f53839c = i2;
        this.f53837a = map;
    }

    public String d() {
        return this.f53838b;
    }

    public int e() {
        return Integer.parseInt(this.e);
    }

    public Map<Integer, List<ytf>> b() {
        return this.f53837a;
    }
}
