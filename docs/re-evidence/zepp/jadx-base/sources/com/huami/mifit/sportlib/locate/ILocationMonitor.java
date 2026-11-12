package com.huami.mifit.sportlib.locate;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u000b\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\bH&¨\u0006\r"}, d2 = {"Lcom/huami/mifit/sportlib/locate/ILocationMonitor;", "", "", "listenerKey", "", "hasRegisterLocationListener", "Lcom/huami/mifit/sportlib/locate/ILocationInfoListener;", "locationListener", "", "registerLocationListener", "unregisterLocationListener", "requestLocation", "releaseLocation", "sportlib_release"}, k = 1, mv = {1, 5, 1})
public interface ILocationMonitor {
    boolean hasRegisterLocationListener(@Nullable String listenerKey);

    void registerLocationListener(@Nullable String listenerKey, @NotNull ILocationInfoListener locationListener);

    void releaseLocation();

    void requestLocation();

    void unregisterLocationListener(@Nullable String listenerKey);
}
