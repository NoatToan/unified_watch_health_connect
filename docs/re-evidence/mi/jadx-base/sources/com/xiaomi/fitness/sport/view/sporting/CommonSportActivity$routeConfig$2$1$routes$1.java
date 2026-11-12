package com.xiaomi.fitness.sport.view.sporting;

import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import defpackage.bxa;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport.view.sporting.CommonSportActivity$routeConfig$2$1$routes$1", f = "CommonSportActivity.kt", i = {}, l = {347}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCommonSportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonSportActivity.kt\ncom/xiaomi/fitness/sport/view/sporting/CommonSportActivity$routeConfig$2$1$routes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,547:1\n1557#2:548\n1628#2,3:549\n*S KotlinDebug\n*F\n+ 1 CommonSportActivity.kt\ncom/xiaomi/fitness/sport/view/sporting/CommonSportActivity$routeConfig$2$1$routes$1\n*L\n356#1:548\n356#1:549,3\n*E\n"})
public final class CommonSportActivity$routeConfig$2$1$routes$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<CommonTrackData>>, Object> {
    final /* synthetic */ CommonSportActivity $this_run;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonSportActivity$routeConfig$2$1$routes$1(CommonSportActivity commonSportActivity, Continuation<? super CommonSportActivity$routeConfig$2$1$routes$1> continuation) {
        super(2, continuation);
        this.$this_run = commonSportActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommonSportActivity$routeConfig$2$1$routes$1(this.$this_run, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object trackByteData;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
            String fileUrl = this.$this_run.getFileUrl();
            Intrinsics.checkNotNull(fileUrl);
            this.label = 1;
            trackByteData = fitnessDataExtKt.getTrackByteData(fileUrl, "", this);
            if (trackByteData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            trackByteData = obj;
        }
        Triple trackFile$default = ParserHelper.readTrackFile$default(ParserHelper.INSTANCE, null, (byte[]) trackByteData, ParserHelper.GPX, 1, null);
        ArrayList arrayList = new ArrayList();
        Iterable<CommonTrackData> iterable = (Iterable) trackFile$default.getFirst();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (CommonTrackData commonTrackData : iterable) {
            double[] dArrC = bxa.c(commonTrackData.getLatitude(), commonTrackData.getLongitude());
            arrayList2.add(Boxing.boxBoolean(arrayList.add(new CommonTrackData(dArrC[0], dArrC[1], 0.0d, null, commonTrackData.getFlagSegment(), 12, null))));
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<CommonTrackData>> continuation) {
        return ((CommonSportActivity$routeConfig$2$1$routes$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
