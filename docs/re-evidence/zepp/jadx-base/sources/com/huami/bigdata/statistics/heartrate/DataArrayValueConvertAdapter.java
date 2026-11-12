package com.huami.bigdata.statistics.heartrate;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/huami/bigdata/statistics/heartrate/DataArrayValueConvertAdapter;", "Lcom/google/gson/JsonDeserializer;", "", "Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", DbUtils.Const.Table.CONTEXT, "deserialize", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class DataArrayValueConvertAdapter implements JsonDeserializer<int[]> {
    @Override // com.google.gson.JsonDeserializer
    @NotNull
    public int[] deserialize(@NotNull JsonElement json, @NotNull Type typeOfT, @NotNull JsonDeserializationContext context) {
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it2 = json.getAsJsonArray().iterator();
        while (it2.hasNext()) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it2.next().getAsString(), new String[]{Constants.ACCEPT_TIME_SEPARATOR_SERVER}, false, 0, 6, (Object) null);
            int i = Integer.parseInt((String) CollectionsKt.first(listSplit$default));
            int i2 = Integer.parseInt((String) CollectionsKt.last(listSplit$default));
            if (i <= i2) {
                while (true) {
                    int i3 = i + 1;
                    arrayList.add(Integer.valueOf(i));
                    if (i == i2) {
                        break;
                    }
                    i = i3;
                }
            }
        }
        return CollectionsKt___CollectionsKt.toIntArray(arrayList);
    }
}
