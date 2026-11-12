package com.xiaomi.hm.health.healthdata.core.dao;

import androidx.room.TypeConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dao/PrimitiveListConverter;", "", "", "string", "", "", "stringToIntList", "ints", "intListToString", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PrimitiveListConverter {
    @TypeConverter
    @Nullable
    public final String intListToString(@Nullable List<Integer> ints) {
        if (ints == null) {
            return null;
        }
        return CollectionsKt___CollectionsKt.joinToString$default(ints, ",", null, null, 0, null, null, 62, null);
    }

    @TypeConverter
    @Nullable
    public final List<Integer> stringToIntList(@Nullable String string) {
        Integer numValueOf;
        if (string == null) {
            return null;
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listSplit$default.iterator();
        while (it2.hasNext()) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) it2.next()));
            } catch (NumberFormatException unused) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        return arrayList;
    }
}
