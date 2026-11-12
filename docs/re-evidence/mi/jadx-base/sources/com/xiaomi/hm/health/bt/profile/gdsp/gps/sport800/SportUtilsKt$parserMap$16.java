package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.GolfGroupNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public /* synthetic */ class SportUtilsKt$parserMap$16 extends FunctionReferenceImpl implements Function1<byte[], GolfGroupNode> {
    public SportUtilsKt$parserMap$16(Object obj) {
        super(1, obj, GolfGroupNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GolfGroupNode;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final GolfGroupNode invoke2(@NotNull byte[] p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((GolfGroupNode.Companion) this.receiver).parse(p0);
    }
}
