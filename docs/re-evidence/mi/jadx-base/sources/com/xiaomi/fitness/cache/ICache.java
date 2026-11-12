package com.xiaomi.fitness.cache;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H¦\u0002¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\u0015\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/cache/ICache;", "K", "V", "", LifecycleConstantKt.ACTION_PUT, "key", "val", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", CervicalMucusRecord.Appearance.CLEAR, "", MediaStoreUtil.MediaInfo.SIZE, "", "remove", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ICache<K, V> {
    void clear();

    V get(K key);

    V put(K key, V val);

    V remove(K key);

    int size();
}
