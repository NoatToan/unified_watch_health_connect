package com.huami.userproperty.datasource;

import com.huami.userproperty.entity.FetchedRangeKey;
import com.huami.userproperty.service.entity.local.LastSyncProperty;
import com.huami.userproperty.service.entity.local.LocalProperty;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&J\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J&\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&J\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0011\u001a\u00020\bH&¨\u0006\u0012"}, d2 = {"Lcom/huami/userproperty/datasource/InternalLocalDataSource;", "", "", "key", "customApi", "Lcom/huami/userproperty/service/entity/local/LocalProperty;", "readLocal", "value", "", "saveLocal", "Lcom/huami/userproperty/service/entity/local/LastSyncProperty;", "readLastSync", "saveLastSync", "saveFetchedRangeKey", "", "Lcom/huami/userproperty/entity/FetchedRangeKey;", "readAllFetchedRangeKey", "removeAll", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public interface InternalLocalDataSource {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ LastSyncProperty readLastSync$default(InternalLocalDataSource internalLocalDataSource, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readLastSync");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return internalLocalDataSource.readLastSync(str, str2);
        }

        public static /* synthetic */ LocalProperty readLocal$default(InternalLocalDataSource internalLocalDataSource, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readLocal");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return internalLocalDataSource.readLocal(str, str2);
        }

        public static /* synthetic */ void saveLastSync$default(InternalLocalDataSource internalLocalDataSource, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveLastSync");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            internalLocalDataSource.saveLastSync(str, str2, str3);
        }

        public static /* synthetic */ void saveLocal$default(InternalLocalDataSource internalLocalDataSource, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveLocal");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            internalLocalDataSource.saveLocal(str, str2, str3);
        }
    }

    @NotNull
    List<FetchedRangeKey> readAllFetchedRangeKey(@Nullable String customApi);

    @Nullable
    LastSyncProperty readLastSync(@NotNull String key, @Nullable String customApi);

    @Nullable
    LocalProperty readLocal(@NotNull String key, @Nullable String customApi);

    void removeAll();

    void saveFetchedRangeKey(@NotNull String key, @Nullable String customApi);

    void saveLastSync(@NotNull String key, @Nullable String customApi, @Nullable String value);

    void saveLocal(@NotNull String key, @Nullable String customApi, @Nullable String value);
}
