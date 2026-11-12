package com.garmin.android.apps.connectmobile.connections.model;

import com.google.gson.annotations.JsonAdapter;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(ConnectionDTO.ConnectionStatusDeserializer.class)
public enum a {
    NOT_FRIEND(0),
    REQUEST_SENT(1),
    CONNECTED(2),
    REQUEST_RECEIVED(3),
    BLOCKED(6),
    I_AM_BLOCKED(7),
    MUTED(8);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31685a;

    a(int i14) {
        this.f31685a = i14;
    }

    public static a a(int i14) {
        a aVar = NOT_FRIEND;
        if (i14 == 0) {
            return aVar;
        }
        if (i14 == 1) {
            return REQUEST_SENT;
        }
        if (i14 == 2) {
            return CONNECTED;
        }
        if (i14 == 3) {
            return REQUEST_RECEIVED;
        }
        if (i14 == 6) {
            return BLOCKED;
        }
        if (i14 != 7) {
            return i14 != 8 ? aVar : MUTED;
        }
        return I_AM_BLOCKED;
    }
}
