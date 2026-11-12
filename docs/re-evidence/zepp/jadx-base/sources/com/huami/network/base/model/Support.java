package com.huami.network.base.model;

/* JADX INFO: loaded from: classes6.dex */
public interface Support {

    public enum RequestSupport implements Support {
        POST,
        DELETE,
        PUT,
        GET,
        HEAD;

        @Override // com.huami.network.base.model.Support
        public int getSupport() {
            return ordinal();
        }

        @Override // com.huami.network.base.model.Support
        public boolean isSupport(Support support) {
            return this == support;
        }
    }

    int getSupport();

    boolean isSupport(Support support);
}
