package org.chromium.net;

import android.content.Context;
import android.util.Log;
import androidx.room.a0;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kg.f;
import n23.j;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CronetEngine {
    public static final int ACTIVE_REQUEST_COUNT_UNKNOWN = -1;
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    private static final String TAG = "CronetEngine";
    public static final long UNBIND_NETWORK_HANDLE = -1;

    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void bindToNetwork(long j8) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z14, boolean z15, boolean z16) {
    }

    public abstract URLStreamHandlerFactory createURLStreamHandlerFactory();

    public int getActiveRequestCount() {
        return -1;
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    public abstract byte[] getGlobalMetricsDeltas();

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract String getVersionString();

    public BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public abstract UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public abstract URLConnection openConnection(URL url);

    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public abstract void shutdown();

    public void startNetLogToDisk(String str, boolean z14, int i14) {
    }

    public abstract void startNetLogToFile(String str, boolean z14);

    public abstract void stopNetLog();

    public static class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        private static final String TAG = "CronetEngine.Builder";
        protected final ICronetEngineBuilder mBuilderDelegate;

        public static abstract class LibraryLoader {
            public abstract void loadLibrary(String str);
        }

        public class a implements Comparator<CronetProvider> {
            @Override // java.util.Comparator
            public final int compare(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
                CronetProvider cronetProvider3 = cronetProvider;
                CronetProvider cronetProvider4 = cronetProvider2;
                if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider3.getName())) {
                    return 1;
                }
                if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider4.getName())) {
                    return -1;
                }
                return -Builder.compareVersions(cronetProvider3.getVersion(), cronetProvider4.getVersion());
            }
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            if (iCronetEngineBuilder instanceof b) {
                this.mBuilderDelegate = iCronetEngineBuilder;
            } else {
                this.mBuilderDelegate = new b(iCronetEngineBuilder);
            }
        }

        public static int compareVersions(String str, String str2) {
            if (str == null || str2 == null) {
                h.s("The input values cannot be null");
                return 0;
            }
            String[] strArrSplit = str.split("\\.");
            String[] strArrSplit2 = str2.split("\\.");
            for (int i14 = 0; i14 < strArrSplit.length && i14 < strArrSplit2.length; i14++) {
                try {
                    int i15 = Integer.parseInt(strArrSplit[i14]);
                    int i16 = Integer.parseInt(strArrSplit2[i14]);
                    if (i15 != i16) {
                        return Integer.signum(i15 - i16);
                    }
                } catch (NumberFormatException e4) {
                    j.w(a0.j("Unable to convert version segments into integers: ", strArrSplit[i14], " & ", strArrSplit2[i14]), e4);
                    return 0;
                }
            }
            return Integer.signum(strArrSplit.length - strArrSplit2.length);
        }

        private static ICronetEngineBuilder createBuilderDelegate(Context context) {
            CronetProvider cronetProvider = getEnabledCronetProviders(context, new ArrayList(CronetProvider.getAllProviders(context))).get(0);
            if (Log.isLoggable(TAG, 3)) {
                String.format("Using '%s' provider for creating CronetEngine.Builder.", cronetProvider);
            }
            return cronetProvider.createBuilder().mBuilderDelegate;
        }

        public static List<CronetProvider> getEnabledCronetProviders(Context context, List<CronetProvider> list) {
            if (list.isEmpty()) {
                f.n("Unable to find any Cronet provider. Have you included all necessary jars?");
                return null;
            }
            Iterator<CronetProvider> it = list.iterator();
            while (it.hasNext()) {
                if (!it.next().isEnabled()) {
                    it.remove();
                }
            }
            if (list.isEmpty()) {
                f.n("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
                return null;
            }
            Collections.sort(list, new a());
            return list;
        }

        private int getImplementationApiLevel() {
            try {
                return ((Integer) this.mBuilderDelegate.getClass().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion").getMethod("getApiLevel", null).invoke(null, null)).intValue();
            } catch (Exception unused) {
                return -1;
            }
        }

        private int getMaximumApiLevel() {
            return ApiVersion.getMaximumAvailableApiLevel();
        }

        public Builder addPublicKeyPins(String str, Set<byte[]> set, boolean z14, Date date) {
            this.mBuilderDelegate.addPublicKeyPins(str, set, z14, date);
            return this;
        }

        public Builder addQuicHint(String str, int i14, int i15) {
            this.mBuilderDelegate.addQuicHint(str, i14, i15);
            return this;
        }

        public CronetEngine build() {
            if (getImplementationApiLevel() != -1) {
                getMaximumApiLevel();
            }
            return this.mBuilderDelegate.build();
        }

        public Builder enableBrotli(boolean z14) {
            this.mBuilderDelegate.enableBrotli(z14);
            return this;
        }

        public Builder enableHttp2(boolean z14) {
            this.mBuilderDelegate.enableHttp2(z14);
            return this;
        }

        public Builder enableHttpCache(int i14, long j8) {
            this.mBuilderDelegate.enableHttpCache(i14, j8);
            return this;
        }

        public Builder enableNetworkQualityEstimator(boolean z14) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(z14);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z14) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z14);
            return this;
        }

        public Builder enableQuic(boolean z14) {
            this.mBuilderDelegate.enableQuic(z14);
            return this;
        }

        @Deprecated
        public Builder enableSdch(boolean z14) {
            return this;
        }

        public String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        @ConnectionMigrationOptions.Experimental
        public Builder setConnectionMigrationOptions(ConnectionMigrationOptions.Builder builder) {
            return setConnectionMigrationOptions(builder.build());
        }

        @DnsOptions.Experimental
        public Builder setDnsOptions(DnsOptions.Builder builder) {
            return setDnsOptions(builder.build());
        }

        public Builder setLibraryLoader(LibraryLoader libraryLoader) {
            this.mBuilderDelegate.setLibraryLoader(libraryLoader);
            return this;
        }

        @QuicOptions.Experimental
        public Builder setQuicOptions(QuicOptions.Builder builder) {
            return setQuicOptions(builder.build());
        }

        public Builder setStoragePath(String str) {
            this.mBuilderDelegate.setStoragePath(str);
            return this;
        }

        public Builder setThreadPriority(int i14) {
            this.mBuilderDelegate.setThreadPriority(i14);
            return this;
        }

        public Builder setUserAgent(String str) {
            this.mBuilderDelegate.setUserAgent(str);
            return this;
        }

        @ConnectionMigrationOptions.Experimental
        public Builder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
            this.mBuilderDelegate.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }

        @DnsOptions.Experimental
        public Builder setDnsOptions(DnsOptions dnsOptions) {
            this.mBuilderDelegate.setDnsOptions(dnsOptions);
            return this;
        }

        @QuicOptions.Experimental
        public Builder setQuicOptions(QuicOptions quicOptions) {
            this.mBuilderDelegate.setQuicOptions(quicOptions);
            return this;
        }

        public Builder(Context context) {
            this(createBuilderDelegate(context));
        }
    }
}
