package com.facebook.login;

import com.huami.identity.auth.alexa.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/login/CodeChallengeMethod;", "", "", SOAP.XMLNS, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", ConstantsKt.SHA_256, "PLAIN", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public enum CodeChallengeMethod {
    S256(ConstantsKt.SHA_256),
    PLAIN(ConstantsKt.PLAIN);

    CodeChallengeMethod(String str) {
    }

    /* synthetic */ CodeChallengeMethod(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ConstantsKt.SHA_256 : str);
    }
}
