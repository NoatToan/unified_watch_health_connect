package defpackage;

import cn.hutool.core.date.a;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class m0b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<CharSequence, Function<Date, String>> f25610a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<CharSequence, Function<CharSequence, Date>> f25611b = new ConcurrentHashMap();

    static {
        k("#sss", new Function() { // from class: i0b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return m0b.f((Date) obj);
            }
        });
        l("#sss", new Function() { // from class: j0b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return m0b.g((CharSequence) obj);
            }
        });
        k("#SSS", new Function() { // from class: k0b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return m0b.h((Date) obj);
            }
        });
        l("#SSS", new Function() { // from class: l0b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return m0b.i((CharSequence) obj);
            }
        });
    }

    public static boolean e(String str) {
        return f25610a.containsKey(str);
    }

    public static /* synthetic */ String f(Date date) {
        return String.valueOf(Math.floorDiv(date.getTime(), 1000L));
    }

    public static /* synthetic */ Date g(CharSequence charSequence) {
        return a.f(Math.multiplyExact(Long.parseLong(charSequence.toString()), 1000L));
    }

    public static /* synthetic */ String h(Date date) {
        return String.valueOf(date.getTime());
    }

    public static /* synthetic */ Date i(CharSequence charSequence) {
        return a.f(Long.parseLong(charSequence.toString()));
    }

    public static Date j(CharSequence charSequence, String str) {
        Function<CharSequence, Date> function;
        Map<CharSequence, Function<CharSequence, Date>> map = f25611b;
        if (map == null || (function = map.get(str)) == null) {
            return null;
        }
        return function.apply(charSequence);
    }

    public static void k(String str, Function<Date, String> function) {
        qk1.u(str, "Format must be not null !", new Object[0]);
        qk1.u(function, "Function must be not null !", new Object[0]);
        f25610a.put(str, function);
    }

    public static void l(String str, Function<CharSequence, Date> function) {
        qk1.u(str, "Format must be not null !", new Object[0]);
        qk1.u(function, "Function must be not null !", new Object[0]);
        f25611b.put(str, function);
    }
}
