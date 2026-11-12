package com.huami.utils.persistence.kvkit;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.huami.tools.analytics.DbUtils;
import com.tencent.mmkv.MMKV;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.ArrayIteratorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J%\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00062*\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u000e0\r\"\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J#\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\r\"\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0004H\u0016J\u0017\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\rH\u0016¢\u0006\u0004\b \u0010!J\b\u0010#\u001a\u00020\"H\u0016R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/huami/utils/persistence/kvkit/MmkvPersistenceImpl;", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "initialize", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "value", "", "setValue", "(Ljava/lang/String;Ljava/lang/Object;)Z", "", "Lkotlin/Pair;", "kvs", "setValues", "([Lkotlin/Pair;)V", "defValue", "getValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/os/Parcelable;", "Ljava/lang/Class;", "tClass", "getParcelableValue", "(Ljava/lang/String;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;", "(Ljava/lang/String;Ljava/lang/Class;)Landroid/os/Parcelable;", "isContainKey", "keys", "removeValuesForKeys", "([Ljava/lang/String;)V", "clear", "getAllKeys", "()[Ljava/lang/String;", "Landroid/content/SharedPreferences;", "getSharedPreferences", "Lcom/tencent/mmkv/MMKV;", "a", "Lcom/tencent/mmkv/MMKV;", "kv", "<init>", "(Lcom/tencent/mmkv/MMKV;)V", "library_release"}, k = 1, mv = {1, 5, 1})
public final class MmkvPersistenceImpl implements KvPersistence {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MMKV kv;

    public MmkvPersistenceImpl(@NotNull MMKV mmkv) {
        this.kv = mmkv;
    }

    @Override // com.huami.utils.persistence.kvkit.KvPersistence
    public void clear() {
        this.kv.clearAll();
    }

    @Override // com.huami.utils.persistence.kvkit.KvPersistence
    @NotNull
    public String[] getAllKeys() {
        String[] strArrAllKeys = this.kv.allKeys();
        return strArrAllKeys == null ? new String[0] : strArrAllKeys;
    }

    @Override // com.huami.utils.persistence.kvkit.KvPersistence
    @NotNull
    public <T extends Parcelable> T getParcelableValue(@NotNull String key, @NotNull Class<T> tClass, @NotNull T defValue) {
        T t = (T) this.kv.decodeParcelable(key, tClass, defValue);
        return t == null ? defValue : t;
    }

    @Override // com.huami.utils.persistence.kvkit.KvPersistence
    @NotNull
    public SharedPreferences getSharedPreferences() {
        return this.kv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, byte[]] */
    @Override // com.huami.utils.persistence.kvkit.KvPersistence
    public <T> T getValue(@NotNull String key, T defValue) {
        if (defValue instanceof Boolean) {
            return (T) Boolean.valueOf(this.kv.decodeBool(key, ((Boolean) defValue).booleanValue()));
        }
        if (defValue instanceof Integer) {
            return (T) Integer.valueOf(this.kv.decodeInt(key, ((Number) defValue).intValue()));
        }
        if (defValue instanceof Long) {
            return (T) Long.valueOf(this.kv.decodeLong(key, ((Number) defValue).longValue()));
        }
        if (defValue instanceof Float) {
            return (T) Float.valueOf(this.kv.decodeFloat(key, ((Number) defValue).floatValue()));
        }
        if (defValue instanceof Double) {
            return (T) Double.valueOf(this.kv.decodeDouble(key, ((Number) defValue).doubleValue()));
        }
        if (defValue instanceof String) {
            return (T) this.kv.decodeString(key, (String) defValue);
        }
        if (!(defValue instanceof byte[])) {
            if (defValue instanceof Set) {
                return (T) this.kv.decodeStringSet(key, (Set<String>) defValue);
            }
            throw new IllegalArgumentException("This type cannot be saved into MMKV");
        }
        ?? r4 = (T) this.kv.decodeBytes(key);
        if (r4 != 0) {
            if (!(r4.length == 0)) {
                return r4;
            }
        }
        return (T) ((byte[]) defValue);
    }

    @Override // com.huami.utils.persistence.kvkit.KvPersistence
    public void initialize(@NotNull Context context) {
    }

    @Override // com.huami.utils.persistence.kvkit.KvPersistence
    public boolean isContainKey(@NotNull String key) {
        return this.kv.containsKey(key);
    }

    @Override // com.huami.utils.persistence.kvkit.KvPersistence
    public void removeValuesForKeys(@NotNull String... keys) {
        this.kv.removeValuesForKeys(keys);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.utils.persistence.kvkit.KvPersistence
    public <T> boolean setValue(@NotNull String key, T value) {
        if (value instanceof Boolean) {
            return this.kv.encode(key, ((Boolean) value).booleanValue());
        }
        if (value instanceof Integer) {
            return this.kv.encode(key, ((Number) value).intValue());
        }
        if (value instanceof Long) {
            return this.kv.encode(key, ((Number) value).longValue());
        }
        if (value instanceof Float) {
            return this.kv.encode(key, ((Number) value).floatValue());
        }
        if (value instanceof Double) {
            return this.kv.encode(key, ((Number) value).doubleValue());
        }
        if (value instanceof String) {
            return this.kv.encode(key, (String) value);
        }
        if (value instanceof byte[]) {
            return this.kv.encode(key, (byte[]) value);
        }
        if (value instanceof Parcelable) {
            return this.kv.encode(key, (Parcelable) value);
        }
        if (!(value instanceof Set)) {
            throw new IllegalArgumentException("This type cannot be saved into MMKV");
        }
        MMKV mmkv = this.kv;
        if (value != 0) {
            return mmkv.encode(key, (Set<String>) value);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.utils.persistence.kvkit.KvPersistence
    public <T> void setValues(@NotNull Pair<String, ? extends T>... kvs) {
        Iterator it2 = ArrayIteratorKt.iterator(kvs);
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            setValue((String) pair.getFirst(), pair.getSecond());
        }
    }

    @Override // com.huami.utils.persistence.kvkit.KvPersistence
    @Nullable
    public <T extends Parcelable> T getParcelableValue(@NotNull String key, @NotNull Class<T> tClass) {
        return (T) this.kv.decodeParcelable(key, tClass);
    }
}
