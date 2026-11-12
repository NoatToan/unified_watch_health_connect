package com.airbnb.lottie;

import com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption;
import com.airbnb.lottie.configurations.reducemotion.SystemReducedMotionOption;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class LottieConfig {
    final LottieNetworkCacheProvider cacheProvider;
    final AsyncUpdates defaultAsyncUpdates;
    final boolean disablePathInterpolatorCache;
    final boolean enableNetworkCache;
    final boolean enableSystraceMarkers;
    final LottieNetworkFetcher networkFetcher;
    final ReducedMotionOption reducedMotionOption;

    public static final class Builder {
        private LottieNetworkCacheProvider cacheProvider;
        private LottieNetworkFetcher networkFetcher;
        private boolean enableSystraceMarkers = false;
        private boolean enableNetworkCache = true;
        private boolean disablePathInterpolatorCache = false;
        private AsyncUpdates defaultAsyncUpdates = AsyncUpdates.AUTOMATIC;
        private ReducedMotionOption reducedMotionOption = new SystemReducedMotionOption();

        public LottieConfig build() {
            return new LottieConfig(this.networkFetcher, this.cacheProvider, this.enableSystraceMarkers, this.enableNetworkCache, this.disablePathInterpolatorCache, this.defaultAsyncUpdates, this.reducedMotionOption);
        }

        public Builder setDefaultAsyncUpdates(AsyncUpdates asyncUpdates) {
            this.defaultAsyncUpdates = asyncUpdates;
            return this;
        }

        public Builder setDisablePathInterpolatorCache(boolean z14) {
            this.disablePathInterpolatorCache = z14;
            return this;
        }

        public Builder setEnableNetworkCache(boolean z14) {
            this.enableNetworkCache = z14;
            return this;
        }

        public Builder setEnableSystraceMarkers(boolean z14) {
            this.enableSystraceMarkers = z14;
            return this;
        }

        public Builder setNetworkCacheDir(final File file) {
            if (this.cacheProvider == null) {
                this.cacheProvider = new LottieNetworkCacheProvider(this) { // from class: com.airbnb.lottie.LottieConfig.Builder.1
                    final /* synthetic */ Builder this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                    public File getCacheDir() {
                        if (file.isDirectory()) {
                            return file;
                        }
                        vb.h.s("cache file must be a directory");
                        return null;
                    }
                };
                return this;
            }
            vb.h.z("There is already a cache provider!");
            return null;
        }

        public Builder setNetworkCacheProvider(final LottieNetworkCacheProvider lottieNetworkCacheProvider) {
            if (this.cacheProvider == null) {
                this.cacheProvider = new LottieNetworkCacheProvider(this) { // from class: com.airbnb.lottie.LottieConfig.Builder.2
                    final /* synthetic */ Builder this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                    public File getCacheDir() {
                        File cacheDir = lottieNetworkCacheProvider.getCacheDir();
                        if (cacheDir.isDirectory()) {
                            return cacheDir;
                        }
                        vb.h.s("cache file must be a directory");
                        return null;
                    }
                };
                return this;
            }
            vb.h.z("There is already a cache provider!");
            return null;
        }

        public Builder setNetworkFetcher(LottieNetworkFetcher lottieNetworkFetcher) {
            this.networkFetcher = lottieNetworkFetcher;
            return this;
        }

        public Builder setReducedMotionOption(ReducedMotionOption reducedMotionOption) {
            this.reducedMotionOption = reducedMotionOption;
            return this;
        }
    }

    private LottieConfig(LottieNetworkFetcher lottieNetworkFetcher, LottieNetworkCacheProvider lottieNetworkCacheProvider, boolean z14, boolean z15, boolean z16, AsyncUpdates asyncUpdates, ReducedMotionOption reducedMotionOption) {
        this.networkFetcher = lottieNetworkFetcher;
        this.cacheProvider = lottieNetworkCacheProvider;
        this.enableSystraceMarkers = z14;
        this.enableNetworkCache = z15;
        this.disablePathInterpolatorCache = z16;
        this.defaultAsyncUpdates = asyncUpdates;
        this.reducedMotionOption = reducedMotionOption;
    }
}
