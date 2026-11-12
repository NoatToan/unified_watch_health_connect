package com.garmin.android.apps.connectmobile.menstrualcycle.network;

import com.garmin.android.library.backgroundtaskmanagement.b;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/network/ServerResponseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$c;", "status", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b$c;)V", "Lcom/garmin/android/library/backgroundtaskmanagement/b$c;", "getStatus", "()Lcom/garmin/android/library/backgroundtaskmanagement/b$c;", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ServerResponseException extends Exception {
    public static final int $stable = 8;
    private final b.c status;

    public ServerResponseException(b.c cVar) {
        cVar.getClass();
        this.status = cVar;
    }

    public final b.c getStatus() {
        return this.status;
    }
}
