package com.amazon.alexa.avs.message.request.settings;

import com.amazon.alexa.avs.message.Payload;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SettingsUpdatedPayload extends Payload {
    private final List<Setting> settings;

    public SettingsUpdatedPayload(List<Setting> list) {
        this.settings = list;
    }

    public List<Setting> getSettings() {
        return this.settings;
    }
}
