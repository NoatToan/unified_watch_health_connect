package com.mapbox.common.movement;

import com.mapbox.common.MapboxCommonLogger;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class GoogleActivityRecognition$Companion$withLogs$1<T> extends w implements l<T, Unit> {
    final /* synthetic */ String $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleActivityRecognition$Companion$withLogs$1(String str) {
        super(1);
        this.$name = str;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(T t7) {
        MapboxCommonLogger.INSTANCE.logD$common_release(GoogleActivityRecognition.TAG, this.$name + " success");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.INSTANCE;
    }
}
