package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtCompatible
public final class Runnables {
    private static final Runnable a = new a();

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private Runnables() {
    }

    public static Runnable doNothing() {
        return a;
    }
}
