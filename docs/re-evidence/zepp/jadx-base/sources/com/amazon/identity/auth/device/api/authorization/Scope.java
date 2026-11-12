package com.amazon.identity.auth.device.api.authorization;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface Scope {
    String getName();

    JSONObject getScopeData();
}
