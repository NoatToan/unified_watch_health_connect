package defpackage;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class e8q implements cei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f16394a = Collections.singleton("UTC");

    @Override // defpackage.cei
    public DateTimeZone a(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return DateTimeZone.UTC;
        }
        return null;
    }

    @Override // defpackage.cei
    public Set<String> b() {
        return f16394a;
    }
}
