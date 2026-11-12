package com.huami.bloodoxygen.core.local.kvkit;

import androidx.exifinterface.media.ExifInterface;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a+\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "", "key", "value", "", "a", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;Ljava/lang/String;Ljava/lang/Object;)V", "default", "b", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "core_release"}, k = 2, mv = {1, 5, 1})
public final class KeyDelegateKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void a(KvPersistence kvPersistence, String str, T t) {
        if (t == null) {
            kvPersistence.removeValuesForKeys(str);
        } else {
            kvPersistence.setValue(str, t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T b(KvPersistence kvPersistence, String str, T t) {
        if (kvPersistence.isContainKey(str)) {
            return (T) kvPersistence.getValue(str, t);
        }
        return null;
    }
}
