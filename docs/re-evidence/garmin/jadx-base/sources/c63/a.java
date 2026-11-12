package c63;

import ch.qos.logback.core.CoreConstants;
import g63.c;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.internal.format.parser.ParseException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lc63/a;", "T", "Lg63/c;", "U", "Lc63/r;", "<init>", "()V", "Lc63/p;", "Lc63/f0;", "Lc63/i0;", "Lc63/k0;", "Lc63/d1;", "Lc63/n1;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<T, U extends g63.c<U>> implements r<T> {
    public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Override // c63.r
    public final T a(CharSequence charSequence) {
        String str;
        charSequence.getClass();
        try {
            g63.o<U> oVar = c().f63245c;
            oVar.getClass();
            try {
                return f(g63.j.a(oVar, charSequence, d()));
            } catch (IllegalArgumentException e4) {
                String message = e4.getMessage();
                if (message == null) {
                    str = "The value parsed from '" + ((Object) charSequence) + "' is invalid";
                } else {
                    str = message + " (when parsing '" + ((Object) charSequence) + "')";
                }
                throw new DateTimeFormatException(str, e4);
            }
        } catch (ParseException e14) {
            throw new DateTimeFormatException("Failed to parse value from '" + ((Object) charSequence) + CoreConstants.SINGLE_QUOTE_CHAR, e14);
        }
    }

    public final String b(T t7) {
        StringBuilder sb3 = new StringBuilder();
        c().f63244b.a(e(t7), sb3, false);
        return sb3.toString();
    }

    public abstract e63.f<U> c();

    public abstract U d();

    public abstract U e(T t7);

    public abstract T f(U u8);

    private a() {
    }
}
