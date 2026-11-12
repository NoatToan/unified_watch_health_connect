package com.nimbusds.jose;

import defpackage.da4;
import defpackage.mqd;

/* JADX INFO: loaded from: classes6.dex */
public class ActionRequiredForJWSCompletionException extends JOSEException {
    private final da4 completableSigning;
    private final mqd option;

    public ActionRequiredForJWSCompletionException(String str, mqd mqdVar, da4 da4Var) {
        super(str);
        if (mqdVar == null) {
            throw new IllegalArgumentException("The triggering option must not be null");
        }
        this.option = mqdVar;
        if (da4Var == null) {
            throw new IllegalArgumentException("The completable signing must not be null");
        }
        this.completableSigning = da4Var;
    }

    public da4 getCompletableJWSObjectSigning() {
        return this.completableSigning;
    }

    public mqd getTriggeringOption() {
        return this.option;
    }
}
