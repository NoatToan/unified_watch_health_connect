package com.huami.healthlabel.healthlabelmanager.adapter;

import com.huami.healthlabel.entry.RecordContent;
import com.huami.healthlabel.koin.ScopesAndQualifersKt;
import com.huami.healthlabel.utils.ext.EntryExtKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"", "Lcom/huami/healthlabel/healthlabelmanager/adapter/HealthLabelEntity;", "Lorg/json/JSONArray;", "toDeleteJson", "Lorg/json/JSONObject;", "healthLabel_release"}, k = 2, mv = {1, 5, 1})
public final class HealthLabelEntityKt {
    @NotNull
    public static final JSONObject toDeleteJson(@NotNull HealthLabelEntity healthLabelEntity) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("eventType", "HealthTagRecord");
        jSONObject.put("subType", "HealthTagRecordDel");
        jSONObject.put("timestamp", System.currentTimeMillis());
        jSONObject.put("userId", ScopesAndQualifersKt.masterData(ScopesAndQualifersKt.getKoin()).getUserId());
        jSONObject.put("content", EntryExtKt.toJsonString(new RecordContent(healthLabelEntity.getLabelId(), healthLabelEntity.getLabelText(), healthLabelEntity.getLabelColor())));
        jSONObject.put("content", new JSONObject().put("id", healthLabelEntity.getLabelId()).put("tag", healthLabelEntity.getLabelText()).toString());
        return jSONObject;
    }

    @NotNull
    public static final JSONArray toDeleteJson(@NotNull Collection<HealthLabelEntity> collection) throws JSONException {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(toDeleteJson((HealthLabelEntity) it2.next()));
        }
        return new JSONArray((Collection) arrayList);
    }
}
