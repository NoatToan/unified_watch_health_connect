package com.huami.pai.ext;

import com.huami.pai.vo.PAIDataVoMin;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a*\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00030\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u0000\u001a&\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003H\u0000\u001a(\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003H\u0000\u001a/\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u001a\f\u0010\u0011\u001a\u00020\u0004*\u00020\u0002H\u0000¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/pai/vo/PAIDataVoMin;", "", "", "mapWithPai", "Ljava/util/Date;", "dateKey", "dateMap", "", "hasReal", "date", "getDataByMap", "", "getPredictDataByMap", "(Ljava/util/Date;Ljava/util/Map;)Ljava/lang/Float;", "getRealOrPredictData", "realDateStr", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class PaiDataVoMinExKt {
    @Nullable
    public static final PAIDataVoMin getDataByMap(@NotNull Date date, @Nullable Map<String, PAIDataVoMin> map) {
        String strInvoke = PaiDataVoExKt.getDefaultDateTransform().invoke(date);
        boolean z = false;
        if (map != null && map.containsKey(strInvoke)) {
            z = true;
        }
        if (z) {
            return map.get(strInvoke);
        }
        return null;
    }

    @Nullable
    public static final Float getPredictDataByMap(@NotNull Date date, @Nullable Map<String, PAIDataVoMin> map) {
        PAIDataVoMin pAIDataVoMin;
        boolean z = true;
        int i = 1;
        while (true) {
            int i2 = i + 1;
            if (hasReal(DateExKt.nextDay(date, -i), map)) {
                break;
            }
            if (i2 > 6) {
                i = -1;
                break;
            }
            i = i2;
        }
        if (i == -1) {
            return null;
        }
        String nextActivityScore = (map == null || (pAIDataVoMin = map.get(PaiDataVoExKt.getDefaultDateTransform().invoke(DateExKt.nextDay(date, -i)))) == null) ? null : pAIDataVoMin.getNextActivityScore();
        if (nextActivityScore == null) {
            return null;
        }
        try {
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE)), nextActivityScore));
            if (mutableList != null && !mutableList.isEmpty()) {
                z = false;
            }
            if (!z && mutableList.size() >= i) {
                return (Float) mutableList.get(i);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static final Float getRealOrPredictData(@NotNull Date date, @Nullable Map<String, PAIDataVoMin> map) {
        PAIDataVoMin dataByMap = getDataByMap(date, map);
        Float fValueOf = dataByMap == null ? null : Float.valueOf(dataByMap.getTp());
        return fValueOf == null ? getPredictDataByMap(date, map) : fValueOf;
    }

    public static final boolean hasReal(@NotNull Date date, @Nullable Map<String, PAIDataVoMin> map) {
        if (map == null) {
            return false;
        }
        return map.containsKey(PaiDataVoExKt.getDefaultDateTransform().invoke(date));
    }

    @NotNull
    public static final Flow<Map<String, PAIDataVoMin>> mapWithPai(@NotNull Flow<? extends List<PAIDataVoMin>> flow) {
        return FlowKt.flow(new PaiDataVoMinExKt$mapWithPai$$inlined$transform$1(flow, null));
    }

    @NotNull
    public static final String realDateStr(@NotNull PAIDataVoMin pAIDataVoMin) {
        return PaiTimeExKt.formatTimeYMD$default(pAIDataVoMin.getTimestamp(), null, 2, null);
    }
}
