package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qpa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46595b;
    private List<e> d;

    public qpa(String str, List<e> list) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f46595b = str;
        arrayList.addAll(list);
    }

    public String b() {
        return this.f46595b;
    }

    public List<e> c() {
        return this.d;
    }

    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f46596c;
        public final String d;

        public e(String str, String str2) {
            this.f46596c = str;
            this.d = str2;
        }
    }
}
