package com.huami.healthlabel.utils.ext;

import com.facebook.internal.ServerProtocol;
import com.huami.healthlabel.db.po.HealthLabel;
import com.huami.healthlabel.db.po.HomeLabel;
import com.huami.healthlabel.entry.HealthTagRecord;
import com.huami.healthlabel.entry.HomeHealthLabel;
import com.huami.healthlabel.entry.LabelProperties;
import com.huami.healthlabel.entry.RecordContent;
import com.huami.healthlabel.koin.ScopesAndQualifersKt;
import com.huami.healthlabel.utils.UtilsKt;
import com.huami.lib.healthlabel.service.MixLabel;
import com.huami.passport.Configs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0000*\u00020\u0001H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0004*\u00020\u0003H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000\u001a\f\u0010\t\u001a\u00020\b*\u00020\u0001H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\f\u0010\t\u001a\u00020\b*\u00020\u0004H\u0000\u001a\u0012\u0010\t\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00040\nH\u0000\u001a\u0012\u0010\f\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\nH\u0000\u001a\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e*\b\u0012\u0004\u0012\u00020\u00010\rH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0001*\u00020\u0010H\u0000\u001a\f\u0010\u0012\u001a\u00020\u0004*\u00020\u0010H\u0000\u001a\u0012\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\r*\u00020\u0013H\u0000\"\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005*\u00020\u00048@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/huami/healthlabel/db/po/HomeLabel;", "Lcom/huami/healthlabel/entry/HomeHealthLabel;", "convert", "Lcom/huami/healthlabel/db/po/HealthLabel;", "Lcom/huami/healthlabel/entry/HealthTagRecord;", "Lcom/huami/healthlabel/entry/RecordContent;", "", "toJsonString", "Lorg/json/JSONObject;", "toJson", "", "Lorg/json/JSONArray;", "toLabelPropertiesJson", "", "", "sort", "Lcom/huami/lib/healthlabel/service/MixLabel;", "toHomeLabel", "toRecordLabel", "Lcom/huami/healthlabel/entry/LabelProperties;", "parse", "getRecordContent", "(Lcom/huami/healthlabel/entry/HealthTagRecord;)Lcom/huami/healthlabel/entry/RecordContent;", "recordContent", "healthLabel_release"}, k = 2, mv = {1, 5, 1})
public final class EntryExtKt {
    @NotNull
    public static final HomeHealthLabel convert(@NotNull HomeLabel homeLabel) {
        return new HomeHealthLabel(homeLabel.getLabelId(), homeLabel.getLabelText(), homeLabel.getLabelColor(), homeLabel.getShowInHome(), homeLabel.getSort(), homeLabel.getReason());
    }

    @Nullable
    public static final RecordContent getRecordContent(@NotNull HealthTagRecord healthTagRecord) {
        try {
            return (RecordContent) UtilsKt.getJson().decodeFromString(RecordContent.INSTANCE.serializer(), healthTagRecord.getContent());
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public static final List<HomeHealthLabel> parse(@NotNull LabelProperties labelProperties) throws JSONException {
        return (List) UtilsKt.getJson().decodeFromString(BuiltinSerializersKt.ListSerializer(HomeHealthLabel.INSTANCE.serializer()), labelProperties.getHealthTag());
    }

    @NotNull
    public static final List<HomeHealthLabel> sort(@NotNull List<HomeHealthLabel> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            HomeHealthLabel homeHealthLabel = list.get(i);
            homeHealthLabel.setSort((-UtilsKt.getTimeSecond()) + ((long) i));
            Unit unit = Unit.INSTANCE;
            arrayList.add(homeHealthLabel);
        }
        return arrayList;
    }

    @NotNull
    public static final HomeHealthLabel toHomeLabel(@NotNull MixLabel mixLabel) {
        return new HomeHealthLabel(mixLabel.getLabelId(), mixLabel.getLabelText(), mixLabel.getLabelColor(), mixLabel.isShow(), mixLabel.getSort(), (String) null, 32, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final JSONObject toJson(@NotNull HomeHealthLabel homeHealthLabel) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", homeHealthLabel.getLabelId());
        jSONObject.put("tag", homeHealthLabel.getLabelText());
        jSONObject.put("color", homeHealthLabel.getLabelColor());
        jSONObject.put("sort", homeHealthLabel.getSort());
        jSONObject.put(ServerProtocol.DIALOG_PARAM_DISPLAY, homeHealthLabel.isShow());
        return jSONObject;
    }

    @NotNull
    public static final String toJsonString(@NotNull RecordContent recordContent) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", recordContent.getLabelId()).put("tag", recordContent.getLabelText()).put("color", recordContent.getLabelColor());
        return jSONObject.toString();
    }

    @NotNull
    public static final JSONObject toLabelPropertiesJson(@NotNull Collection<HomeHealthLabel> collection) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(toJson((HomeHealthLabel) it2.next()));
        }
        jSONObject2.put("huami.mifit.user.settings.health.tag", new JSONArray((Collection) arrayList));
        Unit unit = Unit.INSTANCE;
        jSONObject.put(Configs.Params.PROPERTIES, jSONObject2);
        return jSONObject;
    }

    @NotNull
    public static final HealthTagRecord toRecordLabel(@NotNull MixLabel mixLabel) {
        return new HealthTagRecord(ScopesAndQualifersKt.masterData(ScopesAndQualifersKt.getKoin()).getUserId(), mixLabel.getTimestamp(), toJsonString(new RecordContent(mixLabel.getLabelId(), mixLabel.getLabelText(), mixLabel.getLabelColor())), (String) null, (String) null, 24, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final HomeLabel convert(@NotNull HomeHealthLabel homeHealthLabel) {
        return new HomeLabel(homeHealthLabel.getLabelText(), homeHealthLabel.getLabelId(), homeHealthLabel.isShow(), homeHealthLabel.getLabelColor(), homeHealthLabel.getSort(), homeHealthLabel.getReason());
    }

    @NotNull
    public static final HealthTagRecord convert(@NotNull HealthLabel healthLabel) {
        return new HealthTagRecord(ScopesAndQualifersKt.masterData(ScopesAndQualifersKt.getKoin()).getUserId(), healthLabel.getTimestamp(), toJsonString(new RecordContent(healthLabel.getLabelId(), healthLabel.getLabelText(), healthLabel.getLabelColor())), (String) null, (String) null, 24, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final JSONObject toJson(@NotNull HealthTagRecord healthTagRecord) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("eventType", healthTagRecord.getEventType());
        jSONObject.put("subType", healthTagRecord.getSubType());
        jSONObject.put("timestamp", healthTagRecord.getTimestamp());
        jSONObject.put("userId", healthTagRecord.getUserId());
        jSONObject.put("content", healthTagRecord.getContent());
        return jSONObject;
    }

    @NotNull
    public static final HealthLabel convert(@NotNull HealthTagRecord healthTagRecord) throws SerializationException {
        RecordContent recordContent = (RecordContent) UtilsKt.getJson().decodeFromString(RecordContent.INSTANCE.serializer(), healthTagRecord.getContent());
        return new HealthLabel(recordContent.getLabelId(), healthTagRecord.getTimestamp(), recordContent.getLabelText(), recordContent.getLabelColor());
    }

    @NotNull
    public static final JSONArray toJson(@NotNull Collection<HealthTagRecord> collection) throws JSONException {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(toJson((HealthTagRecord) it2.next()));
        }
        return new JSONArray((Collection) arrayList);
    }
}
