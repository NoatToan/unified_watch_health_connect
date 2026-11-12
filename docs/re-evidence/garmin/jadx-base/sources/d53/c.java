package d53;

import java.nio.charset.Charset;
import org.apache.commons.lang3.CharEncoding;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld53/c;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f57665a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f57666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f57667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f57668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Charset f57669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile Charset f57670f;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        f57666b = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset.forName(CharEncoding.UTF_16BE).getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset charsetForName2 = Charset.forName("US-ASCII");
        charsetForName2.getClass();
        f57667c = charsetForName2;
        Charset charsetForName3 = Charset.forName("ISO-8859-1");
        charsetForName3.getClass();
        f57668d = charsetForName3;
    }

    private c() {
    }
}
