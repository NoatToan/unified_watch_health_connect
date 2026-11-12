package com.google.firebase.emulators;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EmulatedServiceSettings {
    private final String a;
    private final int b;

    public EmulatedServiceSettings(@NonNull String str, int i) {
        this.a = str;
        this.b = i;
    }

    public String getHost() {
        return this.a;
    }

    public int getPort() {
        return this.b;
    }
}
