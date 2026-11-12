package com.example.statistics.export;

import com.xiaomi.onetrack.c.i;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R*\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u00020\u0018X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/example/statistics/export/TrackContent;", "", "key", "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "repeatEnable", "", "getRepeatEnable", "()Z", "setRepeatEnable", "(Z)V", i.d, "getEventName", "setEventName", "params", "", "getParams", "()Ljava/util/Map;", "setParams", "(Ljava/util/Map;)V", "exposePercent", "", "getExposePercent", "()F", "setExposePercent", "(F)V", "statistics-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TrackContent {
    @Nullable
    String getEventName();

    float getExposePercent();

    @Nullable
    String getKey();

    @Nullable
    Map<String, Object> getParams();

    boolean getRepeatEnable();

    void setEventName(@Nullable String str);

    void setExposePercent(float f);

    void setKey(@Nullable String str);

    void setParams(@Nullable Map<String, ? extends Object> map);

    void setRepeatEnable(boolean z);
}
