package com.huami.userproperty.datasource.impl;

import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyModuleKt;
import com.huami.userproperty.datasource.InternalLocalDataSource;
import com.huami.userproperty.entity.FetchedRangeKey;
import com.huami.userproperty.service.entity.local.LastSyncProperty;
import com.huami.userproperty.service.entity.local.LocalProperty;
import com.huami.utils.persistence.kvkit.KvPersistence;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huami/userproperty/datasource/impl/InternalLocalDataSourceImpl;", "Lcom/huami/userproperty/datasource/InternalLocalDataSource;", "", "propertyKey", "customApi", "a", "key", "Lcom/huami/userproperty/service/entity/local/LocalProperty;", "readLocal", "value", "", "saveLocal", "saveLastSync", "Lcom/huami/userproperty/service/entity/local/LastSyncProperty;", "readLastSync", "saveFetchedRangeKey", "", "Lcom/huami/userproperty/entity/FetchedRangeKey;", "readAllFetchedRangeKey", "removeAll", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "localValue", "b", "lastSyncValue", "c", "fetchedRangeKey", "<init>", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;Lcom/huami/utils/persistence/kvkit/KvPersistence;Lcom/huami/utils/persistence/kvkit/KvPersistence;)V", "Companion", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class InternalLocalDataSourceImpl implements InternalLocalDataSource {
    private static final long d = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence localValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence lastSyncValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence fetchedRangeKey;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ LocalProperty c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, LocalProperty localProperty) {
            super(0);
            this.a = str;
            this.b = str2;
            this.c = localProperty;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("readLocal: key=");
            sb.append(this.a);
            sb.append(',');
            String str = this.b;
            String str2 = "";
            if (str != null) {
                String str3 = " api=" + str + ',';
                if (str3 != null) {
                    str2 = str3;
                }
            }
            sb.append(str2);
            sb.append(" value=");
            sb.append(this.c);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "刷新云端同步值：key=" + this.a + ", (RANGE 模式)";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "刷新云端同步值：key=" + this.a + ", value=" + ((Object) this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3) {
            super(0);
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("saveLocal: key=");
            sb.append(this.a);
            sb.append(',');
            String str = this.b;
            String str2 = "";
            if (str != null) {
                String str3 = " api=" + str + ',';
                if (str3 != null) {
                    str2 = str3;
                }
            }
            sb.append(str2);
            sb.append(" value=");
            sb.append((Object) this.c);
            return sb.toString();
        }
    }

    public InternalLocalDataSourceImpl(@NotNull KvPersistence kvPersistence, @NotNull KvPersistence kvPersistence2, @NotNull KvPersistence kvPersistence3) {
        this.localValue = kvPersistence;
        this.lastSyncValue = kvPersistence2;
        this.fetchedRangeKey = kvPersistence3;
    }

    private final String a(String propertyKey, String customApi) {
        if (customApi == null) {
            return propertyKey;
        }
        return ((Object) customApi) + '#' + propertyKey;
    }

    @Override // com.huami.userproperty.datasource.InternalLocalDataSource
    @NotNull
    public List<FetchedRangeKey> readAllFetchedRangeKey(@Nullable String customApi) {
        String[] allKeys = this.fetchedRangeKey.getAllKeys();
        ArrayList arrayList = new ArrayList();
        for (String str : allKeys) {
            FetchedRangeKey fetchedRangeKey = (FetchedRangeKey) this.fetchedRangeKey.getParcelableValue(str, FetchedRangeKey.class);
            if (fetchedRangeKey != null) {
                arrayList.add(fetchedRangeKey);
            }
        }
        return arrayList;
    }

    @Override // com.huami.userproperty.datasource.InternalLocalDataSource
    @Nullable
    public LastSyncProperty readLastSync(@NotNull String key, @Nullable String customApi) {
        return (LastSyncProperty) this.lastSyncValue.getParcelableValue(a(key, customApi), LastSyncProperty.class);
    }

    @Override // com.huami.userproperty.datasource.InternalLocalDataSource
    @Nullable
    public LocalProperty readLocal(@NotNull String key, @Nullable String customApi) {
        LocalProperty localProperty = (LocalProperty) this.localValue.getParcelableValue(a(key, customApi), LocalProperty.class);
        if (localProperty == null || localProperty.getUpdateAt() == 0) {
            return null;
        }
        HMLog.verbose(UserPropertyModuleKt.MODULE_TAG, new a(key, customApi, localProperty));
        return localProperty;
    }

    @Override // com.huami.userproperty.datasource.InternalLocalDataSource
    public void removeAll() {
        this.localValue.clear();
        this.lastSyncValue.clear();
        this.fetchedRangeKey.clear();
    }

    @Override // com.huami.userproperty.datasource.InternalLocalDataSource
    public void saveFetchedRangeKey(@NotNull String key, @Nullable String customApi) {
        this.fetchedRangeKey.setValue(a(key, customApi), new FetchedRangeKey(key, customApi));
        HMLog.verbose(UserPropertyModuleKt.MODULE_TAG, new b(key));
    }

    @Override // com.huami.userproperty.datasource.InternalLocalDataSource
    public void saveLastSync(@NotNull String key, @Nullable String customApi, @Nullable String value) {
        this.lastSyncValue.setValue(a(key, customApi), new LastSyncProperty(key, value, customApi));
        HMLog.verbose(UserPropertyModuleKt.MODULE_TAG, new c(key, value));
    }

    @Override // com.huami.userproperty.datasource.InternalLocalDataSource
    public void saveLocal(@NotNull String key, @Nullable String customApi, @Nullable String value) {
        this.localValue.setValue(a(key, customApi), new LocalProperty(key, value, System.currentTimeMillis(), customApi));
        HMLog.verbose(UserPropertyModuleKt.MODULE_TAG, new d(key, customApi, value));
    }
}
