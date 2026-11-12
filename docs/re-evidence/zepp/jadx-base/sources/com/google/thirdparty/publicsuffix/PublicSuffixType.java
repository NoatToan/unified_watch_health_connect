package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@Beta
@GwtCompatible
public enum PublicSuffixType {
    PRIVATE(JsonLexerKt.COLON, ','),
    REGISTRY('!', '?');

    private final char innerNodeCode;
    private final char leafNodeCode;

    PublicSuffixType(char c, char c2) {
        this.innerNodeCode = c;
        this.leafNodeCode = c2;
    }

    public static PublicSuffixType a(char c) {
        for (PublicSuffixType publicSuffixType : values()) {
            if (publicSuffixType.c() == c || publicSuffixType.e() == c) {
                return publicSuffixType;
            }
        }
        throw new IllegalArgumentException("No enum corresponding to given code: " + c);
    }

    public static PublicSuffixType b(boolean z) {
        return z ? PRIVATE : REGISTRY;
    }

    public char c() {
        return this.innerNodeCode;
    }

    public char e() {
        return this.leafNodeCode;
    }
}
