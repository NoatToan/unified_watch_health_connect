package bj2;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f18370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f18371c;

    public c(String str, c cVar) {
        this.f18369a = str;
        this.f18370b = new HashMap();
        this.f18371c = null;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        if (this.f18371c != null) {
            for (int i14 = 0; i14 < this.f18371c.size(); i14++) {
                arrayList.addAll(((c) this.f18371c.get(i14)).a());
            }
        }
        arrayList.add(this);
        return arrayList;
    }

    public c(String str) {
        this(str, null);
    }
}
