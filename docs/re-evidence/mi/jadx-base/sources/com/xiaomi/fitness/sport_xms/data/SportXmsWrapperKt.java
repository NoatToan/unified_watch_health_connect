package com.xiaomi.fitness.sport_xms.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\u0019\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0003\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0005\u001a\u001e\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0007*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007\u001a \u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¨\u0006\b"}, d2 = {"asData", "T", "Lcom/xiaomi/fitness/sport_xms/data/SportXmsWrapper;", "(Lcom/xiaomi/fitness/sport_xms/data/SportXmsWrapper;)Ljava/lang/Object;", "wrap", "Ljava/io/Serializable;", "wrapList", "", "sport-xms_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportXmsWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportXmsWrapper.kt\ncom/xiaomi/fitness/sport_xms/data/SportXmsWrapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1863#2,2:61\n1863#2,2:63\n*S KotlinDebug\n*F\n+ 1 SportXmsWrapper.kt\ncom/xiaomi/fitness/sport_xms/data/SportXmsWrapperKt\n*L\n13#1:61,2\n22#1:63,2\n*E\n"})
public final class SportXmsWrapperKt {
    @Nullable
    public static final <T> T asData(@Nullable SportXmsWrapper sportXmsWrapper) {
        Serializable data = sportXmsWrapper != null ? sportXmsWrapper.getData() : null;
        if (data == null) {
            return null;
        }
        return (T) data;
    }

    @Nullable
    public static final SportXmsWrapper wrap(@Nullable Serializable serializable) {
        if (serializable == null) {
            return null;
        }
        return new SportXmsWrapper(serializable);
    }

    @Nullable
    public static final List<SportXmsWrapper> wrapList(@Nullable List<? extends Serializable> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(wrap((Serializable) it.next()));
        }
        return arrayList;
    }

    @Nullable
    public static final <T> List<T> asData(@Nullable List<SportXmsWrapper> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SportXmsWrapper) it.next()).getData());
        }
        return arrayList;
    }
}
