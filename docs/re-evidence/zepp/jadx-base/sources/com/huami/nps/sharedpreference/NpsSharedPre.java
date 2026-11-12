package com.huami.nps.sharedpreference;

import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016R\u0016\u0010\u0017\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/nps/sharedpreference/NpsSharedPre;", "Lcom/huami/nps/sharedpreference/ISharedPref;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "a", "", "key", "", "value", "", "saveBoolean", "default", "getBoolean", "", "saveInt", "getInt", "saveString", "getString", "", "saveLong", "getLong", WorkoutExercises.CLEAN, "Ljava/lang/String;", "MMKV_NPS_FILENAME", "b", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kvInstance", "<init>", "()V", "nps_release"}, k = 1, mv = {1, 5, 1})
public final class NpsSharedPre implements ISharedPref, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String MMKV_NPS_FILENAME = "MMKV_NPS_FILENAME";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private KvPersistence kvInstance;

    private final KvPersistence a() {
        if (this.kvInstance == null) {
            this.kvInstance = KvKit.getKvPersistence(this.MMKV_NPS_FILENAME, false);
        }
        return this.kvInstance;
    }

    @Override // com.huami.nps.sharedpreference.ISharedPref
    public void clean() {
        KvPersistence kvPersistenceA = a();
        String[] allKeys = a().getAllKeys();
        kvPersistenceA.removeValuesForKeys((String[]) Arrays.copyOf(allKeys, allKeys.length));
    }

    @Override // com.huami.nps.sharedpreference.ISharedPref
    public boolean getBoolean(@NotNull String key, boolean z) {
        return ((Boolean) a().getValue(key, Boolean.valueOf(z))).booleanValue();
    }

    @Override // com.huami.nps.sharedpreference.ISharedPref
    public int getInt(@NotNull String key, int i) {
        return ((Number) a().getValue(key, Integer.valueOf(i))).intValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.nps.sharedpreference.ISharedPref
    public long getLong(@NotNull String key, long j) {
        return ((Number) a().getValue(key, Long.valueOf(j))).longValue();
    }

    @Override // com.huami.nps.sharedpreference.ISharedPref
    @NotNull
    public String getString(@NotNull String key, @NotNull String str) {
        return (String) a().getValue(key, str);
    }

    @Override // com.huami.nps.sharedpreference.ISharedPref
    public void saveBoolean(@NotNull String key, boolean value) {
        a().setValue(key, Boolean.valueOf(value));
    }

    @Override // com.huami.nps.sharedpreference.ISharedPref
    public void saveInt(@NotNull String key, int value) {
        a().setValue(key, Integer.valueOf(value));
    }

    @Override // com.huami.nps.sharedpreference.ISharedPref
    public void saveLong(@NotNull String key, long value) {
        a().setValue(key, Long.valueOf(value));
    }

    @Override // com.huami.nps.sharedpreference.ISharedPref
    public void saveString(@NotNull String key, @NotNull String value) {
        a().setValue(key, value);
    }
}
