package com.huami.utils.persistence.kvkit;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import com.huami.tools.analytics.DbUtils;
import com.tencent.mmkv.MMKV;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007J&\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007J\"\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u0015"}, d2 = {"Lcom/huami/utils/persistence/kvkit/KvKit;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/utils/persistence/kvkit/KvPersistenceLogger;", "logger", "", PointCategory.INIT, "", "fileName", "", "isMultiProcess", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "getKvPersistence", "rootPath", "Landroid/content/SharedPreferences;", "sp", "fromSharedPreferences", "<init>", "()V", "Delegate", "library_release"}, k = 1, mv = {1, 5, 1})
public final class KvKit {

    @NotNull
    public static final KvKit INSTANCE = new KvKit();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00028\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/utils/persistence/kvkit/KvKit$Delegate;", ExifInterface.GPS_DIRECTION_TRUE, "", "thisRef", "Lkotlin/reflect/KProperty;", "prop", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "setValue", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "a", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kv", "", "b", "Ljava/lang/String;", "key", "c", "Ljava/lang/Object;", "defValue", "<init>", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;Ljava/lang/String;Ljava/lang/Object;)V", "library_release"}, k = 1, mv = {1, 5, 1})
    public static final class Delegate<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final KvPersistence kv;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String key;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final T defValue;

        public Delegate(@NotNull KvPersistence kvPersistence, @NotNull String str, T t) {
            this.kv = kvPersistence;
            this.key = str;
            this.defValue = t;
        }

        public final T getValue(@Nullable Object thisRef, @NotNull KProperty<?> prop) {
            return (T) this.kv.getValue(this.key, this.defValue);
        }

        public final void setValue(@Nullable Object thisRef, @NotNull KProperty<?> prop, @NotNull Object value) {
            this.kv.setValue(this.key, value);
        }
    }

    private KvKit() {
    }

    @JvmStatic
    @NotNull
    public static final KvPersistence fromSharedPreferences(@NotNull SharedPreferences sp, @NotNull String fileName, boolean isMultiProcess) {
        MMKV mmkv$default = MmkvKt.getMmkv$default(fileName, isMultiProcess, null, 4, null);
        mmkv$default.importFromSharedPreferences(sp);
        sp.edit().clear().apply();
        return new MmkvPersistenceImpl(mmkv$default);
    }

    public static /* synthetic */ KvPersistence fromSharedPreferences$default(SharedPreferences sharedPreferences, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return fromSharedPreferences(sharedPreferences, str, z);
    }

    @JvmStatic
    @NotNull
    public static final KvPersistence getKvPersistence(@NotNull String fileName, boolean isMultiProcess) {
        return new MmkvPersistenceImpl(MmkvKt.getMmkv$default(fileName, isMultiProcess, null, 4, null));
    }

    public static /* synthetic */ KvPersistence getKvPersistence$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getKvPersistence(str, z);
    }

    @JvmStatic
    public static final void init(@NotNull Context context, @Nullable KvPersistenceLogger logger) {
        MmkvKt.initMmkv(context, logger);
    }

    public static /* synthetic */ void init$default(Context context, KvPersistenceLogger kvPersistenceLogger, int i, Object obj) {
        if ((i & 2) != 0) {
            kvPersistenceLogger = null;
        }
        init(context, kvPersistenceLogger);
    }

    @JvmStatic
    @NotNull
    public static final KvPersistence getKvPersistence(@NotNull String fileName, @Nullable String rootPath, boolean isMultiProcess) {
        return new MmkvPersistenceImpl(MmkvKt.getMmkv(fileName, isMultiProcess, rootPath));
    }

    public static /* synthetic */ KvPersistence getKvPersistence$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return getKvPersistence(str, str2, z);
    }
}
