package com.garmin.android.apps.connectmobile.social.conversation.exception;

import am.c2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/conversation/exception/UnableToCreateConversationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lam/c2;", "resourceType", "", "resourceId", "<init>", "(Lam/c2;Ljava/lang/String;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UnableToCreateConversationException extends Exception {
    public static final int $stable = 8;

    public UnableToCreateConversationException(c2 c2Var, String str) {
        super("Unable to create conversation for resourceType=[" + c2Var + "], resourceId=[" + str + "]");
    }
}
