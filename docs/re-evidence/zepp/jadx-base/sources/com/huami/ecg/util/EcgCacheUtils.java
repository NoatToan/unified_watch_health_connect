package com.huami.ecg.util;

import androidx.exifinterface.media.ExifInterface;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/huami/ecg/util/EcgCacheUtils;", "", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "a", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "value", "", "saveCache", "(Ljava/lang/String;Ljava/lang/Object;)V", "getCache", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "userId", "saveCacheByUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getCacheByUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/String;", "FILE_NAME", "ECG_BIO_ID_SAMPLE", "ECG_NONE_BIOID_SELF", "OLD_SP_FILE_NAME", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgCacheUtils {

    @NotNull
    public static final String ECG_BIO_ID_SAMPLE = "ecg_bio_id_sample";

    @NotNull
    public static final String ECG_NONE_BIOID_SELF = "ecg_none_bioid_self";
    public static final EcgCacheUtils INSTANCE = new EcgCacheUtils();

    @NotNull
    public static final String OLD_SP_FILE_NAME = "modular-ECG-";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String FILE_NAME = "ecg_core_cache";

    private EcgCacheUtils() {
    }

    private final KvPersistence a() {
        return KvKit.getKvPersistence(FILE_NAME, false);
    }

    public final <T> T getCache(@NotNull String key, T value) {
        return (T) a().getValue(key, value);
    }

    public final <T> T getCacheByUser(@NotNull String key, @NotNull String userId, T value) {
        return (T) a().getValue(userId + '_' + key, value);
    }

    public final <T> void saveCache(@NotNull String key, T value) {
        a().setValue(key, value);
    }

    public final <T> void saveCacheByUser(@NotNull String key, @NotNull String userId, T value) {
        a().setValue(userId + '_' + key, value);
    }
}
