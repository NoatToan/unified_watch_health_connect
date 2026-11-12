package com.garmin.android.apps.connectmobile.gfdi.protobuf.eventbus;

import l73.k;
import p005kotlin.Metadata;
import pi2.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/eventbus/GroupRideEventListener;", "Lpi2/c;", "<init>", "()V", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/eventbus/GroupRideCodeReceivedEvent;", "groupRideCodeReceived", "", "(Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/eventbus/GroupRideCodeReceivedEvent;)V", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/eventbus/GroupRideEnableReceivedEvent;", "groupRideEnableEvent", "groupRideEnableReceived", "(Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/eventbus/GroupRideEnableReceivedEvent;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class GroupRideEventListener implements c {
    public static final int $stable = 0;

    @k
    public void groupRideCodeReceived(GroupRideCodeReceivedEvent groupRideCodeReceived) {
        groupRideCodeReceived.getClass();
    }

    @k
    public void groupRideEnableReceived(GroupRideEnableReceivedEvent groupRideEnableEvent) {
        groupRideEnableEvent.getClass();
    }
}
