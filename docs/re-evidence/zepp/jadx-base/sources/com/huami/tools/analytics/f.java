package com.huami.tools.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
interface f {
    void clearUselessContexts(@NonNull String str);

    void deleteEvents(@NonNull List<Event> list);

    boolean hasContext(@Nullable String str);

    void init(@NonNull Context context);

    boolean insertContext(@NonNull d dVar);

    void insertEvent(@NonNull Event event);

    @Nullable
    d queryContext(@Nullable String str);

    @NonNull
    List<Event> queryEvents();
}
