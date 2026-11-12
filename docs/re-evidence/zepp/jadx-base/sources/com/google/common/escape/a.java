package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
final class a {
    private static final ThreadLocal<char[]> a = new C0205a();

    /* JADX INFO: renamed from: com.google.common.escape.a$a, reason: collision with other inner class name */
    public static class C0205a extends ThreadLocal<char[]> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    private a() {
    }

    public static char[] a() {
        return a.get();
    }
}
