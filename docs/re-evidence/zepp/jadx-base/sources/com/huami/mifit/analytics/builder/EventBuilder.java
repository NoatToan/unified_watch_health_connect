package com.huami.mifit.analytics.builder;

import androidx.annotation.NonNull;
import com.huami.mifit.analytics.bean.BaseEvent;

/* JADX INFO: loaded from: classes11.dex */
public interface EventBuilder<E extends BaseEvent> {
    @NonNull
    E build();
}
