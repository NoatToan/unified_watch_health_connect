package com.xiaomi.fitness.research.sync.receive;

import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessFileUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.research.sync.receive.RelayDataLauncher;
import com.xiaomi.fitness.research.sync.remote.ResearchRemoteServer;
import defpackage.wnf;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ&\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/research/sync/receive/RelayDataLauncher;", "", "<init>", "()V", "onReceive", "", "sid", "", "dataId", "Lcom/xiaomi/fitness/research/sync/receive/ResearchDataId;", "data", "", "saveAsFile", "did", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelayDataLauncher {

    @NotNull
    public static final String TAG = "Research_Handler_Relay_Data";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<RelayDataLauncher> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: uik
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RelayDataLauncher.instance_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/research/sync/receive/RelayDataLauncher$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/research/sync/receive/RelayDataLauncher;", "getInstance", "()Lcom/xiaomi/fitness/research/sync/receive/RelayDataLauncher;", "instance$delegate", "Lkotlin/Lazy;", "TAG", "", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RelayDataLauncher getInstance() {
            return (RelayDataLauncher) RelayDataLauncher.instance$delegate.getValue();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.research.sync.receive.RelayDataLauncher$onReceive$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.research.sync.receive.RelayDataLauncher$onReceive$1", f = "RelayDataLauncher.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $data;
        final /* synthetic */ ResearchDataId $dataId;
        final /* synthetic */ String $sid;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, byte[] bArr, ResearchDataId researchDataId, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sid = str;
            this.$data = bArr;
            this.$dataId = researchDataId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sid, this.$data, this.$dataId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IBinder iBinderAsBinder;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new RelayDataLauncher$onReceive$1$file$1(this.$data, this.$dataId, null), 2, null);
                    wnf dataCallback = ResearchRemoteServer.INSTANCE.getDataCallback();
                    if (dataCallback == null || (iBinderAsBinder = dataCallback.asBinder()) == null || !iBinderAsBinder.isBinderAlive()) {
                        FitnessLogUtils.i("Research_Handler_Relay_Data", "dataCallback binder is dead");
                    } else {
                        this.label = 1;
                        obj = deferredAsync$default.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) obj, 268435456);
                FitnessLogUtils.i("Research_Handler_Relay_Data", "data push to research app , pfd:" + parcelFileDescriptorOpen);
                wnf dataCallback2 = ResearchRemoteServer.INSTANCE.getDataCallback();
                if (dataCallback2 != null) {
                    dataCallback2.m5(this.$sid, parcelFileDescriptorOpen);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (RemoteException e) {
                e.printStackTrace();
                Unit unit2 = Unit.INSTANCE;
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
                Unit unit3 = Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private RelayDataLauncher() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelayDataLauncher instance_delegate$lambda$0() {
        return new RelayDataLauncher();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveAsFile(String str, FitnessDataId fitnessDataId, byte[] bArr, Continuation<? super Unit> continuation) {
        FitnessFileUtils.writeFile(FitnessFileUtils.getCacheDataFile(ApplicationExtKt.getApplication(), str, fitnessDataId), bArr);
        return Unit.INSTANCE;
    }

    public final void onReceive(@NotNull String sid, @NotNull ResearchDataId dataId, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(data, "data");
        FitnessLogUtils.i("Research_Handler_Relay_Data", "onReceive , sid:" + sid + " , dataId:" + dataId + " , data:" + ByteUtil.bytesToHex$default(data, false, 2, null));
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(sid, data, dataId, null), 3, null);
    }
}
