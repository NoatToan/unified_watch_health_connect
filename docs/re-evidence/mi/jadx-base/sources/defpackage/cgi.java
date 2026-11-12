package defpackage;

import io.reactivex.internal.queue.SpscArrayQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class cgi {
    public static <T> jdm<T> a(int i) {
        return i < 0 ? new c8o(-i) : new SpscArrayQueue(i);
    }

    public static void b(joo jooVar, int i) {
        jooVar.request(i < 0 ? Long.MAX_VALUE : i);
    }
}
