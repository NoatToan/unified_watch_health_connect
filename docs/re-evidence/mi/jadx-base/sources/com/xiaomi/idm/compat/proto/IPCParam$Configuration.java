package com.xiaomi.idm.compat.proto;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.d0;
import defpackage.bsf;

/* JADX INFO: loaded from: classes11.dex */
public final class IPCParam$Configuration extends GeneratedMessageLite<IPCParam$Configuration, Object> implements bsf {

    public enum Type implements d0.c {
        SEND_BLOCK(0),
        UNRECOGNIZED(-1);

        public static final int SEND_BLOCK_VALUE = 0;
        private static final d0.d<Type> internalValueMap = new a();
        private final int value;

        public class a implements d0.d<Type> {
            @Override // com.google.protobuf.d0.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Type findValueByNumber(int i) {
                return Type.forNumber(i);
            }
        }

        public static final class b implements d0.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d0.e f13583a = new b();

            @Override // com.google.protobuf.d0.e
            public boolean isInRange(int i) {
                return Type.forNumber(i) != null;
            }
        }

        Type(int i) {
            this.value = i;
        }

        public static Type forNumber(int i) {
            if (i != 0) {
                return null;
            }
            return SEND_BLOCK;
        }

        public static d0.d<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static d0.e internalGetVerifier() {
            return b.f13583a;
        }

        @Override // com.google.protobuf.d0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Type valueOf(int i) {
            return forNumber(i);
        }
    }
}
