package com.huami.sleep.util;

import androidx.exifinterface.media.ExifInterface;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0011\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/sleep/util/SleepKv;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "value", "", "saveKeyValue", "(Ljava/lang/String;Ljava/lang/Object;)Z", "getValueByKey", "(Ljava/lang/String;)Ljava/lang/Object;", "TONALITY_RATED", "Ljava/lang/String;", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "a", "Lkotlin/Lazy;", "()Lcom/huami/utils/persistence/kvkit/KvPersistence;", "sleepKv", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepKv {

    @NotNull
    public static final String TONALITY_RATED = "tonality_rated";

    @NotNull
    public static final SleepKv INSTANCE = new SleepKv();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy sleepKv = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/persistence/kvkit/KvPersistence;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<KvPersistence> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KvPersistence invoke() {
            return KvKit.getKvPersistence$default("module_sleep_kvkit", false, 2, null);
        }
    }

    private SleepKv() {
    }

    private final KvPersistence a() {
        return (KvPersistence) sleepKv.getValue();
    }

    @Nullable
    public final <T> T getValueByKey(@NotNull String key) {
        return (T) a().getValue(key, null);
    }

    public final <T> boolean saveKeyValue(@NotNull String key, T value) {
        return a().setValue(key, value);
    }
}
