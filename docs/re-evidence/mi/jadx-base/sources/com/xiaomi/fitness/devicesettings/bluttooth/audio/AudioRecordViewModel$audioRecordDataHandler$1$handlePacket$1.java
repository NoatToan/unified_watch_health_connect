package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import defpackage.wkf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordViewModel$audioRecordDataHandler$1$handlePacket$1", f = "AudioRecordViewModel.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nAudioRecordViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioRecordViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel$audioRecordDataHandler$1$handlePacket$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,257:1\n1557#2:258\n1628#2,3:259\n1557#2:262\n1628#2,3:263\n*S KotlinDebug\n*F\n+ 1 AudioRecordViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel$audioRecordDataHandler$1$handlePacket$1\n*L\n63#1:258\n63#1:259,3\n64#1:262\n64#1:263,3\n*E\n"})
public final class AudioRecordViewModel$audioRecordDataHandler$1$handlePacket$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $did;
    final /* synthetic */ List<wkf> $mediaFiles;
    int label;
    final /* synthetic */ AudioRecordViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecordViewModel$audioRecordDataHandler$1$handlePacket$1(String str, List<wkf> list, AudioRecordViewModel audioRecordViewModel, Continuation<? super AudioRecordViewModel$audioRecordDataHandler$1$handlePacket$1> continuation) {
        super(2, continuation);
        this.$did = str;
        this.$mediaFiles = list;
        this.this$0 = audioRecordViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioRecordViewModel$audioRecordDataHandler$1$handlePacket$1(this.$did, this.$mediaFiles, this.this$0, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<WatchRecordBean> arrayList;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AudioRecordDao audioRecordDao = AudioRecordDataBase.INSTANCE.getInstance().audioRecordDao();
            String str = this.$did;
            this.label = 1;
            obj = audioRecordDao.list(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List list = (List) obj;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AudioRecordEntity) it.next()).getTitle());
        }
        List<wkf> list2 = this.$mediaFiles;
        if (list2 != null) {
            List<wkf> list3 = list2;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            for (wkf wkfVar : list3) {
                Intrinsics.checkNotNull(wkfVar);
                arrayList3.add(new WatchRecordBean(wkfVar, arrayList2.contains(wkfVar.c.c)));
            }
            arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
        } else {
            arrayList = new ArrayList<>();
        }
        this.this$0.getDataListLiveData().postValue(arrayList);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioRecordViewModel$audioRecordDataHandler$1$handlePacket$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
