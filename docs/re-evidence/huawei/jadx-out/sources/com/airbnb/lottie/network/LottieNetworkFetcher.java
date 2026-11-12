package com.airbnb.lottie.network;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public interface LottieNetworkFetcher {
    LottieFetchResult fetchSync(String str) throws IOException;
}
