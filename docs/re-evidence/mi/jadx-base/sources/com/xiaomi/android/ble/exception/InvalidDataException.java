package com.xiaomi.android.ble.exception;

import com.xiaomi.android.ble.callback.profile.ProfileReadResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class InvalidDataException extends Exception {
    private final ProfileReadResponse response;

    public InvalidDataException(ProfileReadResponse profileReadResponse) {
        this.response = profileReadResponse;
    }

    public ProfileReadResponse getResponse() {
        return this.response;
    }
}
