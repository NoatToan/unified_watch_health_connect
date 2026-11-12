package com.huami.health.afppg.data.remote;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/health/afppg/data/remote/WebUrlConfig;", "", "", "postEventsUrl", "postAFResultUrl", "uploadFileUrl", "uploadRRPeakUrl", "dateStrUrl", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public interface WebUrlConfig {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Nullable
        public static String dateStrUrl(@NotNull WebUrlConfig webUrlConfig) {
            return null;
        }

        @Nullable
        public static String postAFResultUrl(@NotNull WebUrlConfig webUrlConfig) {
            return null;
        }

        @Nullable
        public static String postEventsUrl(@NotNull WebUrlConfig webUrlConfig) {
            return null;
        }

        @Nullable
        public static String uploadFileUrl(@NotNull WebUrlConfig webUrlConfig) {
            return null;
        }

        @Nullable
        public static String uploadRRPeakUrl(@NotNull WebUrlConfig webUrlConfig) {
            return null;
        }
    }

    @Nullable
    String dateStrUrl();

    @Nullable
    String postAFResultUrl();

    @Nullable
    String postEventsUrl();

    @Nullable
    String uploadFileUrl();

    @Nullable
    String uploadRRPeakUrl();
}
