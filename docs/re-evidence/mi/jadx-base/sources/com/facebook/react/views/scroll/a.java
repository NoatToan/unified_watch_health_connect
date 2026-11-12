package com.facebook.react.views.scroll;

import com.facebook.react.bridge.ReadableArray;
import defpackage.e4f;
import defpackage.exh;
import defpackage.sk1;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.a$a, reason: collision with other inner class name */
    public interface InterfaceC0172a<T> {
        void flashScrollIndicators(T t);

        void scrollTo(T t, b bVar);

        void scrollToEnd(T t, c cVar);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7551b;
        public final boolean c;

        public b(int i, int i2, boolean z) {
            this.f7550a = i;
            this.f7551b = i2;
            this.c = z;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f7552a;

        public c(boolean z) {
            this.f7552a = z;
        }
    }

    public static Map<String, Integer> a() {
        return e4f.f("scrollTo", 1, "scrollToEnd", 2, "flashScrollIndicators", 3);
    }

    public static <T> void b(InterfaceC0172a<T> interfaceC0172a, T t, int i, ReadableArray readableArray) {
        sk1.c(interfaceC0172a);
        sk1.c(t);
        sk1.c(readableArray);
        if (i == 1) {
            d(interfaceC0172a, t, readableArray);
        } else if (i == 2) {
            e(interfaceC0172a, t, readableArray);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), interfaceC0172a.getClass().getSimpleName()));
            }
            interfaceC0172a.flashScrollIndicators(t);
        }
    }

    public static <T> void c(InterfaceC0172a<T> interfaceC0172a, T t, String str, ReadableArray readableArray) {
        sk1.c(interfaceC0172a);
        sk1.c(t);
        sk1.c(readableArray);
        str.hashCode();
        switch (str) {
            case "scrollTo":
                d(interfaceC0172a, t, readableArray);
                return;
            case "flashScrollIndicators":
                interfaceC0172a.flashScrollIndicators(t);
                return;
            case "scrollToEnd":
                e(interfaceC0172a, t, readableArray);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", str, interfaceC0172a.getClass().getSimpleName()));
        }
    }

    public static <T> void d(InterfaceC0172a<T> interfaceC0172a, T t, ReadableArray readableArray) {
        interfaceC0172a.scrollTo(t, new b(Math.round(exh.b(readableArray.getDouble(0))), Math.round(exh.b(readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }

    public static <T> void e(InterfaceC0172a<T> interfaceC0172a, T t, ReadableArray readableArray) {
        interfaceC0172a.scrollToEnd(t, new c(readableArray.getBoolean(0)));
    }
}
