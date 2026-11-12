package com.huami.phn.coach.usecase.impl;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class PHNProjectRecordKt$getDailyAnalysis$2$1 extends Lambda implements Function0<String> {
    public final /* synthetic */ Throwable a;
    public final /* synthetic */ JsonObject b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PHNProjectRecordKt$getDailyAnalysis$2$1(Throwable th, JsonObject jsonObject) {
        super(0);
        this.a = th;
        this.b = jsonObject;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final String invoke() {
        return "getDailyAnalysis: " + this.a.getMessage() + "\njson: " + this.b;
    }
}
