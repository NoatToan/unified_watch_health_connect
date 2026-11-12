package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class TokenFilter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TokenFilter f4077c = new TokenFilter();

    public enum Inclusion {
        ONLY_INCLUDE_ALL,
        INCLUDE_ALL_AND_PATH,
        INCLUDE_NON_NULL
    }

    public void a() {
    }

    public TokenFilter b(int i) {
        return this;
    }

    public TokenFilter b(String str) {
        return this;
    }

    public TokenFilter c() {
        return this;
    }

    public TokenFilter c(int i) {
        return this;
    }

    protected boolean d() {
        return true;
    }

    public TokenFilter e() {
        return this;
    }

    protected TokenFilter() {
    }

    public boolean c(JsonParser jsonParser) throws IOException {
        return d();
    }

    public String toString() {
        if (this == f4077c) {
            return "TokenFilter.INCLUDE_ALL";
        }
        return super.toString();
    }
}
