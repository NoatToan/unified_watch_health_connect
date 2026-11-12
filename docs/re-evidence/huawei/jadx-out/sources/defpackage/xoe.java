package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xoe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53228b;
    private String e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f53229c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Object> f53227a = new HashMap();
    private boolean d = true;

    public xoe() {
    }

    public xoe(String str, String str2) {
        this.f53228b = str;
        this.e = str2;
    }

    public void d(String str) {
        this.e = str;
    }

    public void a(String str) {
        this.f53228b = str;
    }

    public void d(boolean z) {
        this.d = z;
    }

    public Object b(String str) {
        return this.f53227a.get(str);
    }

    public void b(Map<String, Object> map) {
        this.f53227a.putAll(map);
    }

    public void a(boolean z) {
        this.f53229c = z;
    }
}
