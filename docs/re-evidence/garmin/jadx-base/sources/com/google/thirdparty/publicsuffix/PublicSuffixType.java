package com.google.thirdparty.publicsuffix;

import ch.qos.logback.core.CoreConstants;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@GwtCompatible
public enum PublicSuffixType {
    PRIVATE(CoreConstants.COLON_CHAR, CoreConstants.COMMA_CHAR),
    REGISTRY('!', '?');

    private final char innerNodeCode;
    private final char leafNodeCode;

    PublicSuffixType(char c14, char c15) {
        this.innerNodeCode = c14;
        this.leafNodeCode = c15;
    }

    public static PublicSuffixType fromCode(char c14) {
        for (PublicSuffixType publicSuffixType : values()) {
            if (publicSuffixType.getInnerNodeCode() == c14 || publicSuffixType.getLeafNodeCode() == c14) {
                return publicSuffixType;
            }
        }
        h.s(k.f("No enum corresponding to given code: ", c14));
        return null;
    }

    public char getInnerNodeCode() {
        return this.innerNodeCode;
    }

    public char getLeafNodeCode() {
        return this.leafNodeCode;
    }
}
