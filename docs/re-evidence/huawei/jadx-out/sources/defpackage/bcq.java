package defpackage;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bcq<k, t> implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<k, t> f979a;

    public Map<k, t> d() {
        return this.f979a;
    }

    public void e(Map<k, t> map) {
        this.f979a = map;
    }
}
