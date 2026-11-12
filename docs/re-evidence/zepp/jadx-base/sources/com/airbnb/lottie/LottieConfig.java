package com.airbnb.lottie;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class LottieConfig {

    @Nullable
    public final LottieNetworkFetcher a;

    @Nullable
    public final LottieNetworkCacheProvider b;
    public final boolean c;

    public static final class Builder {

        @Nullable
        private LottieNetworkFetcher a;

        @Nullable
        private LottieNetworkCacheProvider b;
        private boolean c = false;

        public class a implements LottieNetworkCacheProvider {
            public final /* synthetic */ File a;

            public a(File file) {
                this.a = file;
            }

            @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
            @NonNull
            public File getCacheDir() {
                if (this.a.isDirectory()) {
                    return this.a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        public class b implements LottieNetworkCacheProvider {
            public final /* synthetic */ LottieNetworkCacheProvider a;

            public b(LottieNetworkCacheProvider lottieNetworkCacheProvider) {
                this.a = lottieNetworkCacheProvider;
            }

            @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
            @NonNull
            public File getCacheDir() {
                File cacheDir = this.a.getCacheDir();
                if (cacheDir.isDirectory()) {
                    return cacheDir;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        @NonNull
        public LottieConfig build() {
            return new LottieConfig(this.a, this.b, this.c);
        }

        @NonNull
        public Builder setEnableSystraceMarkers(boolean z) {
            this.c = z;
            return this;
        }

        @NonNull
        public Builder setNetworkCacheDir(@NonNull File file) {
            if (this.b != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.b = new a(file);
            return this;
        }

        @NonNull
        public Builder setNetworkCacheProvider(@NonNull LottieNetworkCacheProvider lottieNetworkCacheProvider) {
            if (this.b != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.b = new b(lottieNetworkCacheProvider);
            return this;
        }

        @NonNull
        public Builder setNetworkFetcher(@NonNull LottieNetworkFetcher lottieNetworkFetcher) {
            this.a = lottieNetworkFetcher;
            return this;
        }
    }

    private LottieConfig(@Nullable LottieNetworkFetcher lottieNetworkFetcher, @Nullable LottieNetworkCacheProvider lottieNetworkCacheProvider, boolean z) {
        this.a = lottieNetworkFetcher;
        this.b = lottieNetworkCacheProvider;
        this.c = z;
    }
}
