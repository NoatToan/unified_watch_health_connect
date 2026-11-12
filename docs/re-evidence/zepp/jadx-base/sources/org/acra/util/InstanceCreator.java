package org.acra.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.acra.ACRA;

/* JADX INFO: loaded from: classes23.dex */
public final class InstanceCreator {

    @FunctionalInterface
    public interface Fallback<T> {
        @NonNull
        T get();
    }

    @Nullable
    @VisibleForTesting
    public <T> T a(@NonNull Class<? extends T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            ACRA.log.e(ACRA.LOG_TAG, "Failed to create instance of class " + cls.getName(), e);
            return null;
        } catch (InstantiationException e2) {
            ACRA.log.e(ACRA.LOG_TAG, "Failed to create instance of class " + cls.getName(), e2);
            return null;
        }
    }

    @NonNull
    public <T> T create(@NonNull Class<? extends T> cls, @NonNull Fallback<T> fallback) {
        T t = (T) a(cls);
        return t != null ? t : fallback.get();
    }

    @NonNull
    public <T> List<T> create(@NonNull Collection<Class<? extends T>> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Class<? extends T>> it2 = collection.iterator();
        while (it2.hasNext()) {
            Object objA = a(it2.next());
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }
}
