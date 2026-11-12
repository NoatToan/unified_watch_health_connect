package com.garmin.android.apps.connectmobile.gfdi.protobuf.eventbus;

import p005kotlin.Metadata;
import pi2.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/eventbus/GroupRideCodeReceivedEvent;", "Lpi2/f;", "", "groupRideCode", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getGroupRideCode", "()Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupRideCodeReceivedEvent extends f {
    public static final int $stable = 8;
    private final String groupRideCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupRideCodeReceivedEvent(String str) {
        super("GroupRideCodeReceivedEvent", null, 0, 0L, 14, null);
        str.getClass();
        this.groupRideCode = str;
    }

    public final String getGroupRideCode() {
        return this.groupRideCode;
    }
}
