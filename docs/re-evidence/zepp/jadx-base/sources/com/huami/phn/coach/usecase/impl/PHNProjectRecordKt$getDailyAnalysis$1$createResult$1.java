package com.huami.phn.coach.usecase.impl;

import com.huami.phn.core.model.PHNDailyAnalysisResult;
import com.twitter.sdk.android.core.identity.AuthHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElementKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "index", "", AuthHandler.d, "Lcom/huami/phn/core/model/PHNDailyAnalysisResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class PHNProjectRecordKt$getDailyAnalysis$1$createResult$1 extends Lambda implements Function2<Integer, Long, PHNDailyAnalysisResult> {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ JsonArray c;
    public final /* synthetic */ JsonArray d;
    public final /* synthetic */ JsonArray e;
    public final /* synthetic */ JsonArray f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PHNProjectRecordKt$getDailyAnalysis$1$createResult$1(int i, long j, JsonArray jsonArray, JsonArray jsonArray2, JsonArray jsonArray3, JsonArray jsonArray4) {
        super(2);
        this.a = i;
        this.b = j;
        this.c = jsonArray;
        this.d = jsonArray2;
        this.e = jsonArray3;
        this.f = jsonArray4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ PHNDailyAnalysisResult invoke(Integer num, Long l) {
        return invoke(num.intValue(), l.longValue());
    }

    @NotNull
    public final PHNDailyAnalysisResult invoke(int i, long j) {
        return new PHNDailyAnalysisResult(j, this.a, this.b, new PHNDailyAnalysisResult.DailyAnaResultInfo(JsonElementKt.getInt(JsonElementKt.getJsonPrimitive(this.c.get(i))), JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive(this.d.get(i))), JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive(this.e.get(i))), JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive(this.f.get(i)))), 0, 16, null);
    }
}
