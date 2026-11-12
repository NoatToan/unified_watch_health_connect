package com.xiaomi.fitness.devicesettings.common.offlinemap;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.offlinemap.RegionListFragment$onViewCreated$1$1", f = "RegionListFragment.kt", i = {0, 1}, l = {57, 70}, m = "invokeSuspend", n = {"destination$iv$iv", "destination$iv$iv"}, s = {"L$1", "L$1"})
@SourceDebugExtension({"SMAP\nRegionListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegionListFragment.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/RegionListFragment$onViewCreated$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n1557#2:139\n1628#2,3:140\n1557#2:143\n1628#2,3:144\n*S KotlinDebug\n*F\n+ 1 RegionListFragment.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/RegionListFragment$onViewCreated$1$1\n*L\n51#1:139\n51#1:140,3\n64#1:143\n64#1:144,3\n*E\n"})
public final class RegionListFragment$onViewCreated$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConcurrentHashMap<String, DistrictData> $map;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ RegionListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionListFragment$onViewCreated$1$1(RegionListFragment regionListFragment, ConcurrentHashMap<String, DistrictData> concurrentHashMap, Continuation<? super RegionListFragment$onViewCreated$1$1> continuation) {
        super(2, continuation);
        this.this$0 = regionListFragment;
        this.$map = concurrentHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RegionListFragment$onViewCreated$1$1(this.this$0, this.$map, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0073  */
    /* JADX WARN: Code duplicated, block: B:15:0x0083  */
    /* JADX WARN: Code duplicated, block: B:16:0x0088  */
    /* JADX WARN: Code duplicated, block: B:19:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00c6 -> B:21:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x014e -> B:32:0x014f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.devicesettings.common.offlinemap.RegionListFragment$onViewCreated$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RegionListFragment$onViewCreated$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
