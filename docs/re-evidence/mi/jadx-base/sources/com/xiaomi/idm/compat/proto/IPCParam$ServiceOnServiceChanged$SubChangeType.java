package com.xiaomi.idm.compat.proto;

import com.google.protobuf.d0;

/* JADX INFO: loaded from: classes11.dex */
public enum IPCParam$ServiceOnServiceChanged$SubChangeType implements d0.c {
    LOGIN(0),
    LOGOUT(1),
    CHANGE(2),
    UNRECOGNIZED(-1);

    public static final int CHANGE_VALUE = 2;
    public static final int LOGIN_VALUE = 0;
    public static final int LOGOUT_VALUE = 1;
    private static final d0.d<IPCParam$ServiceOnServiceChanged$SubChangeType> internalValueMap = new d0.d<IPCParam$ServiceOnServiceChanged$SubChangeType>() { // from class: com.xiaomi.idm.compat.proto.IPCParam$ServiceOnServiceChanged$SubChangeType.a
        @Override // com.google.protobuf.d0.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IPCParam$ServiceOnServiceChanged$SubChangeType findValueByNumber(int i) {
            return IPCParam$ServiceOnServiceChanged$SubChangeType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements d0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d0.e f13584a = new b();

        @Override // com.google.protobuf.d0.e
        public boolean isInRange(int i) {
            return IPCParam$ServiceOnServiceChanged$SubChangeType.forNumber(i) != null;
        }
    }

    IPCParam$ServiceOnServiceChanged$SubChangeType(int i) {
        this.value = i;
    }

    public static IPCParam$ServiceOnServiceChanged$SubChangeType forNumber(int i) {
        if (i == 0) {
            return LOGIN;
        }
        if (i == 1) {
            return LOGOUT;
        }
        if (i != 2) {
            return null;
        }
        return CHANGE;
    }

    public static d0.d<IPCParam$ServiceOnServiceChanged$SubChangeType> internalGetValueMap() {
        return internalValueMap;
    }

    public static d0.e internalGetVerifier() {
        return b.f13584a;
    }

    @Override // com.google.protobuf.d0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static IPCParam$ServiceOnServiceChanged$SubChangeType valueOf(int i) {
        return forNumber(i);
    }
}
