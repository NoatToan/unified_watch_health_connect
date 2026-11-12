package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public abstract class RemovalCause {
    private static final /* synthetic */ RemovalCause[] $VALUES;
    public static final RemovalCause COLLECTED;
    public static final RemovalCause EXPIRED;
    public static final RemovalCause EXPLICIT;
    public static final RemovalCause REPLACED;
    public static final RemovalCause SIZE;

    public static enum a extends RemovalCause {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.common.cache.RemovalCause
        public boolean a() {
            return false;
        }
    }

    static {
        a aVar = new a("EXPLICIT", 0);
        EXPLICIT = aVar;
        RemovalCause removalCause = new RemovalCause("REPLACED", 1) { // from class: com.google.common.cache.RemovalCause.b
            {
                a aVar2 = null;
            }

            @Override // com.google.common.cache.RemovalCause
            public boolean a() {
                return false;
            }
        };
        REPLACED = removalCause;
        RemovalCause removalCause2 = new RemovalCause("COLLECTED", 2) { // from class: com.google.common.cache.RemovalCause.c
            {
                a aVar2 = null;
            }

            @Override // com.google.common.cache.RemovalCause
            public boolean a() {
                return true;
            }
        };
        COLLECTED = removalCause2;
        RemovalCause removalCause3 = new RemovalCause("EXPIRED", 3) { // from class: com.google.common.cache.RemovalCause.d
            {
                a aVar2 = null;
            }

            @Override // com.google.common.cache.RemovalCause
            public boolean a() {
                return true;
            }
        };
        EXPIRED = removalCause3;
        RemovalCause removalCause4 = new RemovalCause("SIZE", 4) { // from class: com.google.common.cache.RemovalCause.e
            {
                a aVar2 = null;
            }

            @Override // com.google.common.cache.RemovalCause
            public boolean a() {
                return true;
            }
        };
        SIZE = removalCause4;
        $VALUES = new RemovalCause[]{aVar, removalCause, removalCause2, removalCause3, removalCause4};
    }

    private RemovalCause(String str, int i) {
        super(str, i);
    }

    public static RemovalCause valueOf(String str) {
        return (RemovalCause) Enum.valueOf(RemovalCause.class, str);
    }

    public static RemovalCause[] values() {
        return (RemovalCause[]) $VALUES.clone();
    }

    public abstract boolean a();

    public /* synthetic */ RemovalCause(String str, int i, a aVar) {
        this(str, i);
    }
}
