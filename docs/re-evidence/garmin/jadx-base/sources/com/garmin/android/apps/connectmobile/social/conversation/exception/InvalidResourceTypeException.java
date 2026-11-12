package com.garmin.android.apps.connectmobile.social.conversation.exception;

import am.c2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/conversation/exception/InvalidResourceTypeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lam/c2;", "resourceType", "<init>", "(Lam/c2;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InvalidResourceTypeException extends Exception {
    public static final int $stable = 8;

    public InvalidResourceTypeException(c2 c2Var) {
        super("Invalid resource type: [" + c2Var + "]");
    }
}
