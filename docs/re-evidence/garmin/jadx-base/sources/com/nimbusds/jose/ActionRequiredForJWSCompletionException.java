package com.nimbusds.jose;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class ActionRequiredForJWSCompletionException extends JOSEException {
    private final CompletableJWSObjectSigning completableSigning;
    private final JWSSignerOption option;

    public ActionRequiredForJWSCompletionException(String str, JWSSignerOption jWSSignerOption, CompletableJWSObjectSigning completableJWSObjectSigning) {
        super(str);
        Objects.requireNonNull(jWSSignerOption);
        this.option = jWSSignerOption;
        Objects.requireNonNull(completableJWSObjectSigning);
        this.completableSigning = completableJWSObjectSigning;
    }

    public CompletableJWSObjectSigning getCompletableJWSObjectSigning() {
        return this.completableSigning;
    }

    public JWSSignerOption getTriggeringOption() {
        return this.option;
    }
}
