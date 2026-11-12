package com.huami.mifit.analytics.builder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.huami.mifit.analytics.bean.CountEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class CountEventBuilder implements EventBuilder<CountEvent> {
    private final String d;
    private String e;
    private boolean a = true;
    private boolean b = false;
    private boolean c = false;
    private final Map<String, String> f = new HashMap();

    public CountEventBuilder(@NonNull String str) {
        this.d = str;
    }

    public CountEventBuilder addExtra(@Nullable String str, @Nullable String str2) {
        if (str != null && str2 != null) {
            this.f.put(str, str2);
        }
        return this;
    }

    @VisibleForTesting
    public Map<String, String> getExtras() {
        return this.f;
    }

    @VisibleForTesting
    public String getId() {
        return this.d;
    }

    @VisibleForTesting
    public String getValue() {
        return this.e;
    }

    @VisibleForTesting
    public boolean isAnonymous() {
        return this.a;
    }

    @VisibleForTesting
    public boolean isRealTimeRecord() {
        return this.c;
    }

    public CountEventBuilder putExtras(@Nullable Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            this.f.putAll(map);
        }
        return this;
    }

    @Deprecated
    public CountEventBuilder setAnonymous(boolean z) {
        this.a = z;
        return this;
    }

    @Deprecated
    public CountEventBuilder setIdentified(boolean z) {
        this.b = z;
        return this;
    }

    public CountEventBuilder setRealTimeRecord(boolean z) {
        this.c = z;
        return this;
    }

    public CountEventBuilder setValue(@Nullable String str) {
        this.e = str;
        return this;
    }

    @Override // com.huami.mifit.analytics.builder.EventBuilder
    @NonNull
    public CountEvent build() {
        CountEvent countEvent = new CountEvent();
        countEvent.anonymous = this.a;
        countEvent.identified = this.b;
        countEvent.id = this.d;
        countEvent.value = this.e;
        countEvent.extras = this.f;
        countEvent.isRealTimeRecord = this.c;
        return countEvent;
    }
}
