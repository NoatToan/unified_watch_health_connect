package defpackage;

import java.nio.charset.Charset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/text/Charsets;", "", "<init>", "()V", "UTF_8", "Ljava/nio/charset/Charset;", "UTF_16", "UTF_16BE", "UTF_16LE", "US_ASCII", "ISO_8859_1", "UTF_32", "UTF32", "()Ljava/nio/charset/Charset;", "utf_32", "UTF_32LE", "UTF32_LE", "utf_32le", "UTF_32BE", "UTF32_BE", "utf_32be", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f54024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f54025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zel f54026c = new zel();
    public static final Charset d;
    public static final Charset e;
    private static volatile Charset f;
    public static final Charset h;
    private static volatile Charset i;
    public static final Charset j;

    private zel() {
    }

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        zcp.b((Object) charsetForName, "");
        h = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        zcp.b((Object) charsetForName2, "");
        f54024a = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        zcp.b((Object) charsetForName3, "");
        f54025b = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        zcp.b((Object) charsetForName4, "");
        j = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        zcp.b((Object) charsetForName5, "");
        e = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        zcp.b((Object) charsetForName6, "");
        d = charsetForName6;
    }

    public final Charset d() {
        Charset charset = f;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        zcp.b((Object) charsetForName, "");
        f = charsetForName;
        return charsetForName;
    }

    public final Charset a() {
        Charset charset = i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        zcp.b((Object) charsetForName, "");
        i = charsetForName;
        return charsetForName;
    }
}
