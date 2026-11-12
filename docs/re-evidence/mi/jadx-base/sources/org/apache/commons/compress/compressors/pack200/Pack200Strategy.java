package org.apache.commons.compress.compressors.pack200;

import defpackage.c7d;
import defpackage.rio;
import defpackage.x1p;
import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Pack200Strategy {
    private static final /* synthetic */ Pack200Strategy[] $VALUES;
    public static final Pack200Strategy IN_MEMORY;
    public static final Pack200Strategy TEMP_FILE;

    public static enum a extends Pack200Strategy {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // org.apache.commons.compress.compressors.pack200.Pack200Strategy
        public rio newStreamBridge() {
            return new c7d();
        }
    }

    static {
        a aVar = new a("IN_MEMORY", 0);
        IN_MEMORY = aVar;
        Pack200Strategy pack200Strategy = new Pack200Strategy("TEMP_FILE", 1) { // from class: org.apache.commons.compress.compressors.pack200.Pack200Strategy.b
            {
                a aVar2 = null;
            }

            @Override // org.apache.commons.compress.compressors.pack200.Pack200Strategy
            public rio newStreamBridge() throws IOException {
                return new x1p();
            }
        };
        TEMP_FILE = pack200Strategy;
        $VALUES = new Pack200Strategy[]{aVar, pack200Strategy};
    }

    private Pack200Strategy(String str, int i) {
        super(str, i);
    }

    public static Pack200Strategy valueOf(String str) {
        return (Pack200Strategy) Enum.valueOf(Pack200Strategy.class, str);
    }

    public static Pack200Strategy[] values() {
        return (Pack200Strategy[]) $VALUES.clone();
    }

    public abstract rio newStreamBridge() throws IOException;

    public /* synthetic */ Pack200Strategy(String str, int i, a aVar) {
        this(str, i);
    }
}
