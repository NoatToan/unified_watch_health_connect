package c63;

import kotlinx.datetime.DateTimeFormatException;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f25034a = new e0(null, null, 3, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o13.t f25035b = o13.m.b(new g0(7));

    public static final void a(Object obj, String str) {
        if (obj == null) {
            throw new DateTimeFormatException(v.e0.g("Can not create a ", str, " from the given input: the field ", str, " is missing"));
        }
    }
}
