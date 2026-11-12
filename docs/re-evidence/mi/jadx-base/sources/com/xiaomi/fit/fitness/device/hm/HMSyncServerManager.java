package com.xiaomi.fit.fitness.device.hm;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.ThirdPartyDataServerSyncer;
import com.xiaomi.fit.fitness.export.di.HuamiSyncExtKt;
import com.xiaomi.fit.fitness.request.HuaMiKey;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import java.io.ByteArrayInputStream;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J(\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/HMSyncServerManager;", "", "<init>", "()V", "TAG", "", "SUB_PATH", "syncDataToServer", "", "did", "saveFile", "key", "time", "", "value", CloudContract.COL_ZONE_OFFSET, "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HMSyncServerManager {

    @NotNull
    public static final HMSyncServerManager INSTANCE = new HMSyncServerManager();

    @NotNull
    private static final String SUB_PATH = "HmRawData";

    @NotNull
    private static final String TAG = "HMSyncServerManager";

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMSyncServerManager$saveFile$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMSyncServerManager$saveFile$1", f = "HMSyncServerManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ long $time;
        final /* synthetic */ String $value;
        final /* synthetic */ int $zoneOffset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, int i, String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$time = j;
            this.$zoneOffset = i;
            this.$key = str;
            this.$value = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$time, this.$zoneOffset, this.$key, this.$value, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            File file = new File(ApplicationExtKt.getApplication().getExternalCacheDir(), "HmRawData/" + this.$time + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.$zoneOffset + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.$key);
            file.deleteOnExit();
            FileUtils fileUtils = FileUtils.INSTANCE;
            byte[] bytes = this.$value.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            FitnessLogUtils.d(HMSyncServerManager.TAG, "syncHMDataToServer saveFile " + fileUtils.writeFile(file, new ByteArrayInputStream(bytes)) + "**" + file.getPath());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMSyncServerManager$syncDataToServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMSyncServerManager$syncDataToServer$1", f = "HMSyncServerManager.kt", i = {0, 0, 0}, l = {48}, m = "invokeSuspend", n = {"$this$forEach$iv", "it", "hmData"}, s = {"L$0", "L$2", "L$3"})
    @SourceDebugExtension({"SMAP\nHMSyncServerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HMSyncServerManager.kt\ncom/xiaomi/fit/fitness/device/hm/HMSyncServerManager$syncDataToServer$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,73:1\n13402#2,2:74\n*S KotlinDebug\n*F\n+ 1 HMSyncServerManager.kt\ncom/xiaomi/fit/fitness/device/hm/HMSyncServerManager$syncDataToServer$1\n*L\n33#1:74,2\n*E\n"})
    public static final class C15741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15741(String str, Continuation<? super C15741> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C15741(this.$did, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0053  */
        /* JADX WARN: Code duplicated, block: B:12:0x005b  */
        /* JADX WARN: Code duplicated, block: B:14:0x007e  */
        /* JADX WARN: Code duplicated, block: B:18:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:21:0x00b0 A[LOOP:0: B:20:0x00ae->B:21:0x00b0, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:24:0x00fd A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x00fe  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0059 -> B:30:0x0132). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x007c -> B:30:0x0132). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007f -> B:30:0x0132). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00fe -> B:26:0x0102). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x007e
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 315
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.device.hm.HMSyncServerManager.C15741.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private HMSyncServerManager() {
    }

    public final void saveFile(@HuaMiKey @NotNull String key, long time, @NotNull String value, int zoneOffset) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(time, zoneOffset, key, value, null));
    }

    public final void syncDataToServer(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (HuamiSyncExtKt.getInstance(ThirdPartyDataServerSyncer.INSTANCE).isEnable()) {
            ScopeExtKt.scope(Dispatchers.getIO(), new C15741(did, null));
        } else {
            FitnessLogUtils.d(TAG, "syncHMDataToServer abort due to cloud sync switch close");
        }
    }
}
