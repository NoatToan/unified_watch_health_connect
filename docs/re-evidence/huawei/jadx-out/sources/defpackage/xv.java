package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class xv extends ConcurrentHashMap<String, String> {
    public static final xv e = new xv();
    private static final long serialVersionUID = 1;
    private final Object d;

    private xv() {
        super(180, 0.8f, 4);
        this.d = new Object();
    }

    public String c(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.d) {
                if (size() >= 180) {
                    clear();
                }
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }
}
