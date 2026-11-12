package gh2;

import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f77421a = m.a("DefaultAppRemoteConfig");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f77422b;

    private a() {
    }

    public static a a() {
        if (f77422b == null) {
            f77422b = new a();
        }
        return f77422b;
    }
}
