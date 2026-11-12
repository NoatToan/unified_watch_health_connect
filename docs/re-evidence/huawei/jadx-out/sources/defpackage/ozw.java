package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class ozw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f45049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, ArrayList<String>> f45050b;
    private Map<String, ArrayList<String>> e;

    public List<String> e() {
        return this.f45049a;
    }

    public void c(List<String> list) {
        this.f45049a = list;
    }

    public Map<String, ArrayList<String>> c() {
        return this.f45050b;
    }

    public void c(Map<String, ArrayList<String>> map) {
        this.f45050b = map;
    }

    public Map<String, ArrayList<String>> d() {
        return this.e;
    }

    public void b(Map<String, ArrayList<String>> map) {
        this.e = map;
    }
}
