package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class fbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, String> f17638b = new HashMap();
    public String c;

    public String a() {
        return this.c;
    }

    public String toString() {
        return String.format("resCode = %1$d, headers = %2$s, response = %3$s", Integer.valueOf(this.f17637a), this.f17638b.toString(), this.c);
    }
}
