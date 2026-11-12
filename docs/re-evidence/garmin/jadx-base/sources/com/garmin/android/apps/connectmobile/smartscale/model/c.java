package com.garmin.android.apps.connectmobile.smartscale.model;

import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public class c implements Comparator<b> {
    @Override // java.util.Comparator
    public final int compare(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        if (bVar3.getDeviceInviteID().longValue() < bVar4.getDeviceInviteID().longValue()) {
            return -1;
        }
        return bVar3.getDeviceInviteID().longValue() > bVar4.getDeviceInviteID().longValue() ? 1 : 0;
    }
}
