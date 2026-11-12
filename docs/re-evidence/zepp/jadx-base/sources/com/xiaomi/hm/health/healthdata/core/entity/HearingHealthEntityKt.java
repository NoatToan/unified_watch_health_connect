package com.xiaomi.hm.health.healthdata.core.entity;

import com.huami.bluetooth.profile.gdsp.HeadsetHealthMetadata;
import com.huami.bluetooth.profile.gdsp.HearingHealthDayData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u001a\u0010\b\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/gdsp/HeadsetHealthMetadata;", "Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthMetadata;", "toHearingHealthMetadata", "Lcom/huami/bluetooth/profile/gdsp/HearingHealthDayData;", "", "userId", "eventType", "Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthEntity;", "toHearingHealthEntity", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class HearingHealthEntityKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<JsonBuilder, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull JsonBuilder jsonBuilder) {
            jsonBuilder.setIgnoreUnknownKeys(false);
            jsonBuilder.setAllowSpecialFloatingPointValues(false);
            jsonBuilder.setLenient(false);
            jsonBuilder.setEncodeDefaults(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            a(jsonBuilder);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final HearingHealthEntity toHearingHealthEntity(@NotNull HearingHealthDayData hearingHealthDayData, @NotNull String str, @NotNull String str2) {
        List<HeadsetHealthMetadata> data = hearingHealthDayData.getData();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
        Iterator<T> it2 = data.iterator();
        while (it2.hasNext()) {
            arrayList.add(toHearingHealthMetadata((HeadsetHealthMetadata) it2.next()));
        }
        return new HearingHealthEntity(hearingHealthDayData.getSaveScoreRtcTime() * ((long) 1000), str, str2, JsonKt.Json$default(null, a.a, 1, null).encodeToString(BuiltinSerializersKt.ListSerializer(HearingHealthMetadata.INSTANCE.serializer()), arrayList), 0, 16, null);
    }

    @NotNull
    public static final HearingHealthMetadata toHearingHealthMetadata(@NotNull HeadsetHealthMetadata headsetHealthMetadata) {
        return new HearingHealthMetadata(headsetHealthMetadata.getDb() & 255, headsetHealthMetadata.getTime());
    }
}
