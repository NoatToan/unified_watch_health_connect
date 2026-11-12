package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.PaceNode2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public /* synthetic */ class SportUtilsKt$parserMap$6 extends FunctionReferenceImpl implements Function1<byte[], PaceNode2> {
    public SportUtilsKt$parserMap$6(Object obj) {
        super(1, obj, PaceNode2.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PaceNode2;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final PaceNode2 invoke2(@NotNull byte[] p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((PaceNode2.Companion) this.receiver).parse(p0);
    }
}
