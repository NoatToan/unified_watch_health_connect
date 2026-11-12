package com.xiaomi.fitness.route.track.view;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.route.track.view.MyTrackLibraryAdapter$Holder$startToTrackDetailActivity$1$1", f = "MyTrackLibraryAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MyTrackLibraryAdapter$Holder$startToTrackDetailActivity$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intent $intent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MyTrackLibraryAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTrackLibraryAdapter$Holder$startToTrackDetailActivity$1$1(MyTrackLibraryAdapter myTrackLibraryAdapter, Intent intent, Continuation<? super MyTrackLibraryAdapter$Holder$startToTrackDetailActivity$1$1> continuation) {
        super(2, continuation);
        this.this$0 = myTrackLibraryAdapter;
        this.$intent = intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(MyTrackLibraryAdapter myTrackLibraryAdapter, CoroutineScope coroutineScope, int i, Intent intent) {
        String stringExtra;
        if (i == -1 && intent != null && (stringExtra = intent.getStringExtra("route_id")) != null) {
            List<String> deviceTrackList = myTrackLibraryAdapter.getDeviceTrackList();
            if (deviceTrackList == null) {
                myTrackLibraryAdapter.setDeviceTrackList(CollectionsKt__CollectionsKt.mutableListOf(stringExtra));
            } else if (!deviceTrackList.contains(stringExtra)) {
                deviceTrackList.add(stringExtra);
            }
            myTrackLibraryAdapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MyTrackLibraryAdapter$Holder$startToTrackDetailActivity$1$1 myTrackLibraryAdapter$Holder$startToTrackDetailActivity$1$1 = new MyTrackLibraryAdapter$Holder$startToTrackDetailActivity$1$1(this.this$0, this.$intent, continuation);
        myTrackLibraryAdapter$Holder$startToTrackDetailActivity$1$1.L$0 = obj;
        return myTrackLibraryAdapter$Holder$startToTrackDetailActivity$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Context mContext = this.this$0.getMContext();
        MyTrackLibraryActivity myTrackLibraryActivity = mContext instanceof MyTrackLibraryActivity ? (MyTrackLibraryActivity) mContext : null;
        if (myTrackLibraryActivity != null) {
            Intent intent = this.$intent;
            final MyTrackLibraryAdapter myTrackLibraryAdapter = this.this$0;
            myTrackLibraryActivity.startForActivityResult(intent, new Function2() { // from class: com.xiaomi.fitness.route.track.view.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MyTrackLibraryAdapter$Holder$startToTrackDetailActivity$1$1.invokeSuspend$lambda$3(myTrackLibraryAdapter, coroutineScope, ((Integer) obj2).intValue(), (Intent) obj3);
                }
            });
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MyTrackLibraryAdapter$Holder$startToTrackDetailActivity$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
