package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public interface ReachabilityInterface {
    long addListener(ReachabilityChanged reachabilityChanged);

    NetworkStatus currentNetworkStatus();

    boolean isReachable();

    boolean removeListener(long j8);
}
