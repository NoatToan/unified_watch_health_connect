package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public abstract class Escaper {
    private final Function<String, String> a = new a();

    public class a implements Function<String, String> {
        public a() {
        }

        @Override // com.google.common.base.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(String str) {
            return Escaper.this.escape(str);
        }
    }

    public final Function<String, String> asFunction() {
        return this.a;
    }

    public abstract String escape(String str);
}
