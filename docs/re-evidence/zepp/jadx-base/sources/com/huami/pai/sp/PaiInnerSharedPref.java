package com.huami.pai.sp;

import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/pai/sp/PaiInnerSharedPref;", "Lcom/huami/pai/sp/ISharedPref;", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "a", "", "key", "", "value", "", "saveBoolean", "getBoolean", "", "saveInt", "default", "getInt", "saveString", "getString", "Ljava/lang/String;", "MMKV_PAI_FILENAME", "b", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kvInstance", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiInnerSharedPref implements ISharedPref {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String MMKV_PAI_FILENAME = "MMKV_PAI_FILENAME";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private KvPersistence kvInstance;

    private final KvPersistence a() {
        if (this.kvInstance == null) {
            this.kvInstance = KvKit.getKvPersistence(this.MMKV_PAI_FILENAME, false);
        }
        return this.kvInstance;
    }

    @Override // com.huami.pai.sp.ISharedPref
    public boolean getBoolean(@NotNull String key) {
        return ((Boolean) a().getValue(key, Boolean.FALSE)).booleanValue();
    }

    @Override // com.huami.pai.sp.ISharedPref
    public int getInt(@NotNull String key, int i) {
        return ((Number) a().getValue(key, Integer.valueOf(i))).intValue();
    }

    @Override // com.huami.pai.sp.ISharedPref
    @NotNull
    public String getString(@NotNull String key, @NotNull String str) {
        return (String) a().getValue(key, str);
    }

    @Override // com.huami.pai.sp.ISharedPref
    public void saveBoolean(@NotNull String key, boolean value) {
        a().setValue(key, Boolean.valueOf(value));
    }

    @Override // com.huami.pai.sp.ISharedPref
    public void saveInt(@NotNull String key, int value) {
        a().setValue(key, Integer.valueOf(value));
    }

    @Override // com.huami.pai.sp.ISharedPref
    public void saveString(@NotNull String key, @NotNull String value) {
        a().setValue(key, value);
    }
}
