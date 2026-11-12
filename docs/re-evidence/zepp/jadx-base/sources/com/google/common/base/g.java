package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
final class g extends d implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern a;

    public static final class a extends c {
        public final Matcher a;

        public a(Matcher matcher) {
            this.a = (Matcher) Preconditions.checkNotNull(matcher);
        }

        @Override // com.google.common.base.c
        public int a() {
            return this.a.end();
        }

        @Override // com.google.common.base.c
        public boolean b() {
            return this.a.find();
        }

        @Override // com.google.common.base.c
        public boolean c(int i) {
            return this.a.find(i);
        }

        @Override // com.google.common.base.c
        public boolean d() {
            return this.a.matches();
        }

        @Override // com.google.common.base.c
        public String e(String str) {
            return this.a.replaceAll(str);
        }

        @Override // com.google.common.base.c
        public int f() {
            return this.a.start();
        }
    }

    public g(Pattern pattern) {
        this.a = (Pattern) Preconditions.checkNotNull(pattern);
    }

    @Override // com.google.common.base.d
    public int b() {
        return this.a.flags();
    }

    @Override // com.google.common.base.d
    public c e(CharSequence charSequence) {
        return new a(this.a.matcher(charSequence));
    }

    @Override // com.google.common.base.d
    public String f() {
        return this.a.pattern();
    }

    @Override // com.google.common.base.d
    public String toString() {
        return this.a.toString();
    }
}
