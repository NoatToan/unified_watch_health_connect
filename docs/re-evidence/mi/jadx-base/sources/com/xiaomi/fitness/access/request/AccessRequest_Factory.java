package com.xiaomi.fitness.access.request;

import defpackage.dei;

/* JADX INFO: loaded from: classes7.dex */
public final class AccessRequest_Factory implements dei {

    public static final class InstanceHolder {
        static final AccessRequest_Factory INSTANCE = new AccessRequest_Factory();

        private InstanceHolder() {
        }
    }

    public static AccessRequest_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AccessRequest newInstance() {
        return new AccessRequest();
    }

    @Override // javax.inject.Provider
    public AccessRequest get() {
        return newInstance();
    }
}
