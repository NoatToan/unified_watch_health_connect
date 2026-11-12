package com.miui.tsmclient.net.request;

import com.miui.tsmclient.common.net.request.GsonRequest;
import com.tsmclient.smartcard.model.ConfigRules;

/* JADX INFO: loaded from: classes6.dex */
public class ConfigRulesRequest extends GsonRequest<ConfigRules> {
    public ConfigRulesRequest(String str) {
        super("GET", str, ConfigRules.class);
        setPersistence();
    }
}
