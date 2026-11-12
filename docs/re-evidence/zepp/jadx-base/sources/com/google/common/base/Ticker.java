package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtCompatible
public abstract class Ticker {
    private static final Ticker a = new a();

    public static class a extends Ticker {
        @Override // com.google.common.base.Ticker
        public long read() {
            return j.k();
        }
    }

    public static Ticker systemTicker() {
        return a;
    }

    @CanIgnoreReturnValue
    public abstract long read();
}
