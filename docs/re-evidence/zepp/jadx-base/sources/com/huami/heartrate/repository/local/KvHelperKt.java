package com.huami.heartrate.repository.local;

import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\b*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "", "key", "value", "", "a", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;Ljava/lang/String;Ljava/lang/Object;)V", "Landroid/os/Parcelable;", "Ljava/lang/Class;", "tClass", "default", "c", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;Ljava/lang/String;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;", "b", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class KvHelperKt {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Parcelable> T c(KvPersistence kvPersistence, String str, Class<T> cls, T t) {
        if (kvPersistence.isContainKey(str)) {
            return (T) kvPersistence.getParcelableValue(str, cls, t);
        }
        return null;
    }
}
