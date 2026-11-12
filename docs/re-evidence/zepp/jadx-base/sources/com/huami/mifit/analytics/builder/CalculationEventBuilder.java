package com.huami.mifit.analytics.builder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.huami.mifit.analytics.bean.CalculationEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class CalculationEventBuilder implements EventBuilder<CalculationEvent> {
    private final String d;
    private final long e;
    private boolean a = true;
    private boolean b = false;
    private boolean c = false;
    private final Map<String, String> f = new HashMap();

    public CalculationEventBuilder(@NonNull String str, long j) {
        this.d = str;
        this.e = j;
    }

    public CalculationEventBuilder addExtra(@Nullable String str, @Nullable String str2) {
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
    public long getValue() {
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

    public CalculationEventBuilder putExtras(@Nullable Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            this.f.putAll(map);
        }
        return this;
    }

    @Deprecated
    public CalculationEventBuilder setAnonymous(boolean z) {
        this.a = z;
        return this;
    }

    @Deprecated
    public CalculationEventBuilder setIdentified(boolean z) {
        this.b = z;
        return this;
    }

    public CalculationEventBuilder setRealTimeRecord(boolean z) {
        this.c = z;
        return this;
    }

    @Override // com.huami.mifit.analytics.builder.EventBuilder
    @NonNull
    public CalculationEvent build() {
        CalculationEvent calculationEvent = new CalculationEvent();
        calculationEvent.anonymous = this.a;
        calculationEvent.identified = this.b;
        calculationEvent.id = this.d;
        calculationEvent.value = this.e;
        calculationEvent.extras = this.f;
        calculationEvent.isRealTimeRecord = this.c;
        return calculationEvent;
    }
}
