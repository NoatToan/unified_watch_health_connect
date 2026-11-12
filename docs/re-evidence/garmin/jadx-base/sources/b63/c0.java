package b63;

import java.time.DateTimeException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import kotlinx.datetime.DateTimeFormatException;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o13.t f16175a = o13.m.b(new b4.b(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o13.t f16176b = o13.m.b(new b4.b(3));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.t f16177c = o13.m.b(new b4.b(4));

    public static final a0 a(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new a0((ZoneOffset) dateTimeFormatter.parse(str, new b0()));
        } catch (DateTimeException e4) {
            throw new DateTimeFormatException(e4);
        }
    }
}
