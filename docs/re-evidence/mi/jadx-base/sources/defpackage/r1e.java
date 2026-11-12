package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class r1e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList<q1e> f32075a = new CopyOnWriteArrayList<>();

    public static q1e a(String str) throws GeneralSecurityException {
        for (q1e q1eVar : f32075a) {
            if (q1eVar.a(str)) {
                return q1eVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
