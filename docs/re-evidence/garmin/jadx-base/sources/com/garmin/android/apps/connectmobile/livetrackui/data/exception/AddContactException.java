package com.garmin.android.apps.connectmobile.livetrackui.data.exception;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/livetrackui/data/exception/AddContactException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "LiveTrackEmailsLimitReached", "MaximumContactsReached", "Lcom/garmin/android/apps/connectmobile/livetrackui/data/exception/AddContactException$LiveTrackEmailsLimitReached;", "Lcom/garmin/android/apps/connectmobile/livetrackui/data/exception/AddContactException$MaximumContactsReached;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class AddContactException extends Exception {
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/livetrackui/data/exception/AddContactException$LiveTrackEmailsLimitReached;", "Lcom/garmin/android/apps/connectmobile/livetrackui/data/exception/AddContactException;", "<init>", "()V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LiveTrackEmailsLimitReached extends AddContactException {
        public static final int $stable = 8;

        public LiveTrackEmailsLimitReached() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/livetrackui/data/exception/AddContactException$MaximumContactsReached;", "Lcom/garmin/android/apps/connectmobile/livetrackui/data/exception/AddContactException;", "<init>", "()V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MaximumContactsReached extends AddContactException {
        public static final int $stable = 8;

        public MaximumContactsReached() {
            super(null);
        }
    }

    public /* synthetic */ AddContactException(j jVar) {
        this();
    }

    private AddContactException() {
    }
}
