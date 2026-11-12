package defpackage;

import java.io.File;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes20.dex */
public final class zql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f54482a = File.separator;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f54483c;
    public static final Charset d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        d = charsetForName;
        f54483c = charsetForName;
    }
}
