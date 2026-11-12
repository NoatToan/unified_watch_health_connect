package com.xiaomi.fitness.route.track.view;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.route.track.view.TrackImportListFragment$setListener$3$1$1", f = "TrackImportListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TrackImportListFragment$setListener$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TrackImportListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackImportListFragment$setListener$3$1$1(TrackImportListFragment trackImportListFragment, Continuation<? super TrackImportListFragment$setListener$3$1$1> continuation) {
        super(2, continuation);
        this.this$0 = trackImportListFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(TrackImportListFragment trackImportListFragment, int i, Intent intent) {
        String stringExtra;
        if (i == -1 && intent != null && (stringExtra = intent.getStringExtra("route_id")) != null) {
            trackImportListFragment.refreshDistributeState(stringExtra);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackImportListFragment$setListener$3$1$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TrackImportListFragment trackImportListFragment = this.this$0;
        Intent intent = new Intent(this.this$0.requireContext(), (Class<?>) TrackDetailActivity.class);
        final TrackImportListFragment trackImportListFragment2 = this.this$0;
        trackImportListFragment.startForActivityResult(intent, new Function2() { // from class: com.xiaomi.fitness.route.track.view.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return TrackImportListFragment$setListener$3$1$1.invokeSuspend$lambda$1(trackImportListFragment2, ((Integer) obj2).intValue(), (Intent) obj3);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackImportListFragment$setListener$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
