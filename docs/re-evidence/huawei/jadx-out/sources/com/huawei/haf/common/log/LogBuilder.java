package com.huawei.haf.common.log;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class LogBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayDeque<StringBuilder> f5904a = new ArrayDeque<>(3);

    private LogBuilder() {
    }

    public static void c() {
        ArrayDeque<StringBuilder> arrayDeque = f5904a;
        synchronized (arrayDeque) {
            arrayDeque.clear();
        }
    }

    public static String b(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        if (objArr.length == 1) {
            return String.valueOf(objArr[0]);
        }
        StringBuilder sbE = e();
        for (Object obj : objArr) {
            sbE.append(obj);
        }
        String string = sbE.toString();
        d(sbE);
        return string;
    }

    private static StringBuilder e() {
        StringBuilder sbPollLast;
        ArrayDeque<StringBuilder> arrayDeque = f5904a;
        synchronized (arrayDeque) {
            sbPollLast = arrayDeque.pollLast();
        }
        if (sbPollLast == null) {
            return new StringBuilder(256);
        }
        sbPollLast.delete(0, sbPollLast.length());
        return sbPollLast;
    }

    private static void d(StringBuilder sb) {
        if (sb.capacity() > 256) {
            return;
        }
        ArrayDeque<StringBuilder> arrayDeque = f5904a;
        synchronized (arrayDeque) {
            if (arrayDeque.size() < 3) {
                arrayDeque.addLast(sb);
            }
        }
    }
}
