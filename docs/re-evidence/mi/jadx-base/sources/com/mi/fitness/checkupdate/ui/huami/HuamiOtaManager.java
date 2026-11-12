package com.mi.fitness.checkupdate.ui.huami;

import android.os.Environment;
import com.mi.fitness.checkupdate.model.OtaUpgradeResult;
import com.mi.fitness.checkupdate.ota.DownloadListener;
import com.mi.fitness.checkupdate.ota.IOtaManager;
import com.mi.fitness.checkupdate.ota.SilentUpgradeExtKt;
import com.mi.fitness.checkupdate.ota.SilentUpgradeManager;
import com.mi.fitness.checkupdate.util.CheckUpdatePreferenceSupport;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.sdk.fw.FwType;
import com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback;
import com.xiaomi.onetrack.api.b;
import defpackage.r72;
import defpackage.yyi;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 62\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\tH\u0002J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019J\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0012J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001c\u0010!\u001a\u00020\u001c2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0#H\u0016J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u0016\u001a\u00020\u0010J\u0012\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\tH\u0002J\u0012\u0010*\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010(H\u0002J\u0012\u0010,\u001a\u00020-2\b\u0010+\u001a\u0004\u0018\u00010(H\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\tH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\tH\u0016J\u0010\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\tH\u0016J\u0010\u00105\u001a\u00020\u00152\u0006\u00104\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/mi/fitness/checkupdate/ui/huami/HuamiOtaManager;", "Lcom/mi/fitness/checkupdate/ota/IOtaManager;", "result", "Lcom/mi/fitness/checkupdate/model/OtaUpgradeResult;", "<init>", "(Lcom/mi/fitness/checkupdate/model/OtaUpgradeResult;)V", "getResult", "()Lcom/mi/fitness/checkupdate/model/OtaUpgradeResult;", "versionId", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "updateInfoList", "", "Lcom/mi/fitness/checkupdate/ui/huami/HuamiUpdateInfo;", "firmwareUpdateMap", "Ljava/util/HashMap;", "Lcom/xiaomi/hm/health/bt/sdk/fw/FwType;", "isDownloaded", "", "updateInfo", "genVersionId", "getUpdateInfoList", "", "getFirmwareUpdateMap", "startDownload", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "downloadListener", "Lcom/mi/fitness/checkupdate/ota/DownloadListener;", "startUpgrade", "callback", "Lkotlin/Function1;", "download", "Lkotlinx/coroutines/flow/Flow;", "", "requestHead", "Lokhttp3/Response;", "url", "supportRange", b.I, "contentLength", "", "getFirmwareFile", "Ljava/io/File;", "md5", "interruptIfNeed", "reason", "recordPushed", "did", "isPushed", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHuamiOtaManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuamiOtaManager.kt\ncom/mi/fitness/checkupdate/ui/huami/HuamiOtaManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,441:1\n1863#2,2:442\n*S KotlinDebug\n*F\n+ 1 HuamiOtaManager.kt\ncom/mi/fitness/checkupdate/ui/huami/HuamiOtaManager\n*L\n123#1:442,2\n*E\n"})
public final class HuamiOtaManager implements IOtaManager {

    @NotNull
    private static final String TAG = "HuamiOtaManager";

    @NotNull
    private final HashMap<FwType, String> firmwareUpdateMap;

    @NotNull
    private final OtaUpgradeResult result;

    @NotNull
    private final List<HuamiUpdateInfo> updateInfoList;

    @NotNull
    private String versionId;

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager$download$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager$download$1", f = "HuamiOtaManager.kt", i = {0, 2, 2, 2, 2, 2, 2, 2, 2}, l = {256, 260, 316}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "fileTmp", b.I, "outputStream", "buffer", "len", SportDataTypeKt.DIMEN_TOTAL, "totalBytesRead"}, s = {"L$0", "L$0", "L$1", "L$5", "L$6", "L$7", "L$8", "J$0", "J$1"})
    @SourceDebugExtension({"SMAP\nHuamiOtaManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuamiOtaManager.kt\ncom/mi/fitness/checkupdate/ui/huami/HuamiOtaManager$download$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,441:1\n1#2:442\n329#3:443\n329#3:444\n329#3:445\n329#3:446\n*S KotlinDebug\n*F\n+ 1 HuamiOtaManager.kt\ncom/mi/fitness/checkupdate/ui/huami/HuamiOtaManager$download$1\n*L\n309#1:443\n323#1:444\n339#1:445\n346#1:446\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
        final /* synthetic */ File $file;
        final /* synthetic */ String $md5;
        final /* synthetic */ String $url;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        final /* synthetic */ HuamiOtaManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(File file, String str, HuamiOtaManager huamiOtaManager, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$file = file;
            this.$md5 = str;
            this.this$0 = huamiOtaManager;
            this.$url = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$file, this.$md5, this.this$0, this.$url, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x031f */
        /* JADX WARN: Code duplicated, block: B:102:0x02ae A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:103:0x02af  */
        /* JADX WARN: Code duplicated, block: B:113:0x02cb A[Catch: all -> 0x02b9, TryCatch #11 {all -> 0x02b9, blocks: (B:100:0x0297, B:113:0x02cb, B:115:0x02d4, B:117:0x02df, B:120:0x02f2, B:121:0x02f9, B:122:0x02fa), top: B:174:0x0297 }] */
        /* JADX WARN: Code duplicated, block: B:115:0x02d4 A[Catch: all -> 0x02b9, TryCatch #11 {all -> 0x02b9, blocks: (B:100:0x0297, B:113:0x02cb, B:115:0x02d4, B:117:0x02df, B:120:0x02f2, B:121:0x02f9, B:122:0x02fa), top: B:174:0x0297 }] */
        /* JADX WARN: Code duplicated, block: B:122:0x02fa A[Catch: all -> 0x02b9, TRY_LEAVE, TryCatch #11 {all -> 0x02b9, blocks: (B:100:0x0297, B:113:0x02cb, B:115:0x02d4, B:117:0x02df, B:120:0x02f2, B:121:0x02f9, B:122:0x02fa), top: B:174:0x0297 }] */
        /* JADX WARN: Code duplicated, block: B:167:0x022f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x0225 A[Catch: all -> 0x02c8, TRY_LEAVE, TryCatch #3 {all -> 0x02c8, blocks: (B:77:0x020d, B:79:0x0225, B:94:0x0258), top: B:160:0x020d }] */
        /* JADX WARN: Code duplicated, block: B:94:0x0258 A[Catch: all -> 0x02c8, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x02c8, blocks: (B:77:0x020d, B:79:0x0225, B:94:0x0258), top: B:160:0x020d }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x02af -> B:104:0x02b4). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 876
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager$startDownload$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager$startDownload$1", f = "HuamiOtaManager.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DownloadListener $downloadListener;
        final /* synthetic */ FwType[] $fwTypes;
        final /* synthetic */ Ref.BooleanRef $isFailure;
        final /* synthetic */ List<HuamiUpdateInfo> $updateInfos;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HuamiOtaManager this$0;

        /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager$startDownload$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/mi/fitness/checkupdate/ui/huami/HuamiUpdateInfo;", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager$startDownload$1$1", f = "HuamiOtaManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C02951 extends SuspendLambda implements Function3<FlowCollector<? super HuamiUpdateInfo>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ DownloadListener $downloadListener;
            final /* synthetic */ FwType[] $fwTypes;
            final /* synthetic */ Ref.BooleanRef $isFailure;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02951(DownloadListener downloadListener, FwType[] fwTypeArr, Ref.BooleanRef booleanRef, Continuation<? super C02951> continuation) {
                super(3, continuation);
                this.$downloadListener = downloadListener;
                this.$fwTypes = fwTypeArr;
                this.$isFailure = booleanRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Logger.i(HuamiOtaManager.TAG, "startDownload updateInfos error catch " + ((Throwable) this.L$0));
                this.$downloadListener.onProgress(this.$fwTypes[0], -1);
                this.$isFailure.element = true;
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super HuamiUpdateInfo> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                C02951 c02951 = new C02951(this.$downloadListener, this.$fwTypes, this.$isFailure, continuation);
                c02951.L$0 = th;
                return c02951.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager$startDownload$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0017\u0010\u0004\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/mi/fitness/checkupdate/ui/huami/HuamiUpdateInfo;", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager$startDownload$1$2", f = "HuamiOtaManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super HuamiUpdateInfo>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ DownloadListener $downloadListener;
            final /* synthetic */ Ref.BooleanRef $isFailure;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Ref.BooleanRef booleanRef, DownloadListener downloadListener, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.$isFailure = booleanRef;
                this.$downloadListener = downloadListener;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Logger.i(HuamiOtaManager.TAG, "download updateInfos Completes, isFailure = " + this.$isFailure.element);
                this.$downloadListener.onFinish(this.$isFailure.element ^ true);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super HuamiUpdateInfo> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass2(this.$isFailure, this.$downloadListener, continuation).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13771(List<HuamiUpdateInfo> list, DownloadListener downloadListener, FwType[] fwTypeArr, Ref.BooleanRef booleanRef, HuamiOtaManager huamiOtaManager, Continuation<? super C13771> continuation) {
            super(2, continuation);
            this.$updateInfos = list;
            this.$downloadListener = downloadListener;
            this.$fwTypes = fwTypeArr;
            this.$isFailure = booleanRef;
            this.this$0 = huamiOtaManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13771 c13771 = new C13771(this.$updateInfos, this.$downloadListener, this.$fwTypes, this.$isFailure, this.this$0, continuation);
            c13771.L$0 = obj;
            return c13771;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow flowFlowOn = FlowKt.flowOn(FlowKt.onCompletion(FlowKt.m2416catch(FlowKt.flowOn(FlowKt.asFlow(this.$updateInfos), Dispatchers.getIO()), new C02951(this.$downloadListener, this.$fwTypes, this.$isFailure, null)), new AnonymousClass2(this.$isFailure, this.$downloadListener, null)), Dispatchers.getMain());
                final Ref.BooleanRef booleanRef = this.$isFailure;
                final FwType[] fwTypeArr = this.$fwTypes;
                final HuamiOtaManager huamiOtaManager = this.this$0;
                final DownloadListener downloadListener = this.$downloadListener;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager.startDownload.1.3

                    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager$startDownload$1$3$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager$startDownload$1$3$1", f = "HuamiOtaManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C02961 extends SuspendLambda implements Function3<FlowCollector<? super Integer>, Throwable, Continuation<? super Unit>, Object> {
                        final /* synthetic */ DownloadListener $downloadListener;
                        final /* synthetic */ Ref.BooleanRef $isFailure;
                        final /* synthetic */ HuamiUpdateInfo $updateInfo;
                        /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C02961(Ref.BooleanRef booleanRef, HuamiUpdateInfo huamiUpdateInfo, DownloadListener downloadListener, Continuation<? super C02961> continuation) {
                            super(3, continuation);
                            this.$isFailure = booleanRef;
                            this.$updateInfo = huamiUpdateInfo;
                            this.$downloadListener = downloadListener;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            Throwable th = (Throwable) this.L$0;
                            this.$isFailure.element = true;
                            Logger.i(HuamiOtaManager.TAG, "download " + this.$updateInfo.getType() + " error catch " + th);
                            this.$downloadListener.onProgress(this.$updateInfo.getType(), -1);
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(FlowCollector<? super Integer> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                            C02961 c02961 = new C02961(this.$isFailure, this.$updateInfo, this.$downloadListener, continuation);
                            c02961.L$0 = th;
                            return c02961.invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager$startDownload$1$3$2, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0017\u0010\u0004\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager$startDownload$1$3$2", f = "HuamiOtaManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super Integer>, Throwable, Continuation<? super Unit>, Object> {
                        final /* synthetic */ DownloadListener $downloadListener;
                        final /* synthetic */ Ref.BooleanRef $isFailure;
                        final /* synthetic */ HuamiUpdateInfo $updateInfo;
                        int label;
                        final /* synthetic */ HuamiOtaManager this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(Ref.BooleanRef booleanRef, HuamiUpdateInfo huamiUpdateInfo, DownloadListener downloadListener, HuamiOtaManager huamiOtaManager, Continuation<? super AnonymousClass2> continuation) {
                            super(3, continuation);
                            this.$isFailure = booleanRef;
                            this.$updateInfo = huamiUpdateInfo;
                            this.$downloadListener = downloadListener;
                            this.this$0 = huamiOtaManager;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            if (!this.$isFailure.element) {
                                Logger.i(HuamiOtaManager.TAG, "download " + this.$updateInfo.getType() + " onCompletion, path = " + this.$updateInfo.getFilePath());
                                this.$updateInfo.setSuccess(true);
                                String filePath = this.$updateInfo.getFilePath();
                                if (filePath != null) {
                                    this.this$0.firmwareUpdateMap.put(this.$updateInfo.getType(), filePath);
                                }
                                this.$downloadListener.onProgress(this.$updateInfo.getType(), 100);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(FlowCollector<? super Integer> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                            return new AnonymousClass2(this.$isFailure, this.$updateInfo, this.$downloadListener, this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((HuamiUpdateInfo) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final HuamiUpdateInfo huamiUpdateInfo, Continuation<? super Unit> continuation) {
                        if (booleanRef.element || huamiUpdateInfo.getIsSuccess()) {
                            return Unit.INSTANCE;
                        }
                        if (!JobKt.isActive(coroutineScope.getU())) {
                            return Unit.INSTANCE;
                        }
                        fwTypeArr[0] = huamiUpdateInfo.getType();
                        Logger.i(HuamiOtaManager.TAG, "start download type = " + huamiUpdateInfo + ", name = " + huamiOtaManager.getFirmwareFile(huamiUpdateInfo.getMd5()));
                        Flow flowFlowOn2 = FlowKt.flowOn(FlowKt.onCompletion(FlowKt.m2416catch(FlowKt.flowOn(huamiOtaManager.download(huamiUpdateInfo), Dispatchers.getIO()), new C02961(booleanRef, huamiUpdateInfo, downloadListener, null)), new AnonymousClass2(booleanRef, huamiUpdateInfo, downloadListener, huamiOtaManager, null)), Dispatchers.getMain());
                        final DownloadListener downloadListener2 = downloadListener;
                        Object objCollect = flowFlowOn2.collect(new FlowCollector() { // from class: com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager.startDownload.1.3.3

                            /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager$startDownload$1$3$3$1, reason: invalid class name and collision with other inner class name */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager$startDownload$1$3$3$1", f = "HuamiOtaManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                            public static final class C02981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ DownloadListener $downloadListener;
                                final /* synthetic */ int $progress;
                                final /* synthetic */ HuamiUpdateInfo $updateInfo;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C02981(DownloadListener downloadListener, HuamiUpdateInfo huamiUpdateInfo, int i, Continuation<? super C02981> continuation) {
                                    super(2, continuation);
                                    this.$downloadListener = downloadListener;
                                    this.$updateInfo = huamiUpdateInfo;
                                    this.$progress = i;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C02981(this.$downloadListener, this.$updateInfo, this.$progress, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    if (this.label != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    this.$downloadListener.onProgress(this.$updateInfo.getType(), this.$progress);
                                    return Unit.INSTANCE;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C02981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation2) {
                                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation2);
                            }

                            public final Object emit(int i2, Continuation<? super Unit> continuation2) {
                                Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C02981(downloadListener2, huamiUpdateInfo, i2, null), continuation2);
                                return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
                            }
                        }, continuation);
                        return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowOn.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C13771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HuamiOtaManager(@NotNull OtaUpgradeResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        ArrayList arrayList = new ArrayList();
        this.updateInfoList = arrayList;
        this.firmwareUpdateMap = new HashMap<>();
        if (result.getFontVersion() != null && result.getFontMd5() != null && result.getFontUrl() != null) {
            FwType fwType = FwType.FONT;
            String fontUrl = result.getFontUrl();
            fontUrl = fontUrl == null ? "" : fontUrl;
            String fontMd5 = result.getFontMd5();
            fontMd5 = fontMd5 == null ? "" : fontMd5;
            String fontVersion = result.getFontVersion();
            HuamiUpdateInfo huamiUpdateInfo = new HuamiUpdateInfo(fwType, fontUrl, fontMd5, fontVersion == null ? "" : fontVersion);
            huamiUpdateInfo.setSuccess(isDownloaded(huamiUpdateInfo));
            arrayList.add(huamiUpdateInfo);
        }
        if (result.getFirmwareVersion() != null && result.getFirmwareMd5() != null && result.getFirmwareUrl() != null) {
            FwType fwType2 = FwType.FIRMWARE;
            String firmwareUrl = result.getFirmwareUrl();
            firmwareUrl = firmwareUrl == null ? "" : firmwareUrl;
            String firmwareMd5 = result.getFirmwareMd5();
            firmwareMd5 = firmwareMd5 == null ? "" : firmwareMd5;
            String firmwareVersion = result.getFirmwareVersion();
            HuamiUpdateInfo huamiUpdateInfo2 = new HuamiUpdateInfo(fwType2, firmwareUrl, firmwareMd5, firmwareVersion == null ? "" : firmwareVersion);
            huamiUpdateInfo2.setSuccess(isDownloaded(huamiUpdateInfo2));
            arrayList.add(huamiUpdateInfo2);
        }
        if (result.getGpsVersion() != null && result.getGpsUrl() != null && result.getGpsMd5() != null) {
            FwType fwType3 = FwType.FIRMWARE_GPS;
            String gpsUrl = result.getGpsUrl();
            gpsUrl = gpsUrl == null ? "" : gpsUrl;
            String gpsMd5 = result.getGpsMd5();
            gpsMd5 = gpsMd5 == null ? "" : gpsMd5;
            String gpsVersion = result.getGpsVersion();
            HuamiUpdateInfo huamiUpdateInfo3 = new HuamiUpdateInfo(fwType3, gpsUrl, gpsMd5, gpsVersion == null ? "" : gpsVersion);
            huamiUpdateInfo3.setSuccess(isDownloaded(huamiUpdateInfo3));
            arrayList.add(huamiUpdateInfo3);
        }
        if (result.getResourceVersion() != null && result.getResourceUrl() != null && result.getResourceMd5() != null) {
            FwType fwType4 = FwType.RESOURCE_COMPRESS;
            String resourceUrl = result.getResourceUrl();
            resourceUrl = resourceUrl == null ? "" : resourceUrl;
            String resourceMd5 = result.getResourceMd5();
            resourceMd5 = resourceMd5 == null ? "" : resourceMd5;
            String resourceVersion = result.getResourceVersion();
            HuamiUpdateInfo huamiUpdateInfo4 = new HuamiUpdateInfo(fwType4, resourceUrl, resourceMd5, resourceVersion == null ? "" : resourceVersion);
            huamiUpdateInfo4.setSuccess(isDownloaded(huamiUpdateInfo4));
            arrayList.add(huamiUpdateInfo4);
        }
        if (result.getBaseResourceVersion() != null && result.getBaseResourceUrl() != null && result.getBaseResourceMd5() != null) {
            FwType fwType5 = FwType.RESOURCE_BASE;
            String baseResourceUrl = result.getBaseResourceUrl();
            baseResourceUrl = baseResourceUrl == null ? "" : baseResourceUrl;
            String baseResourceMd5 = result.getBaseResourceMd5();
            baseResourceMd5 = baseResourceMd5 == null ? "" : baseResourceMd5;
            String baseResourceVersion = result.getBaseResourceVersion();
            HuamiUpdateInfo huamiUpdateInfo5 = new HuamiUpdateInfo(fwType5, baseResourceUrl, baseResourceMd5, baseResourceVersion != null ? baseResourceVersion : "");
            huamiUpdateInfo5.setSuccess(isDownloaded(huamiUpdateInfo5));
            arrayList.add(huamiUpdateInfo5);
        }
        this.versionId = genVersionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long contentLength(Response response) {
        if ((response != null ? response.body() : null) == null) {
            return -1L;
        }
        ResponseBody responseBodyBody = response.body();
        Intrinsics.checkNotNull(responseBodyBody);
        return responseBodyBody.getContentLength();
    }

    private final String genVersionId() {
        StringBuilder sb = new StringBuilder();
        for (HuamiUpdateInfo huamiUpdateInfo : this.updateInfoList) {
            sb.append(huamiUpdateInfo.getMd5());
            Logger.i(TAG, "genVersionId: upgrade info type " + huamiUpdateInfo.getType() + ", version " + huamiUpdateInfo.getVersion());
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return MD5Util.MD5(string);
    }

    private final WearableDeviceModel getDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    private final boolean isDownloaded(HuamiUpdateInfo updateInfo) {
        File firmwareFile = getFirmwareFile(updateInfo.getMd5());
        boolean zAreEqual = Intrinsics.areEqual(updateInfo.getMd5(), MD5Util.getFileMD5(firmwareFile));
        if (zAreEqual) {
            updateInfo.setFilePath(firmwareFile.getAbsolutePath());
            HashMap<FwType, String> map = this.firmwareUpdateMap;
            FwType type = updateInfo.getType();
            String filePath = updateInfo.getFilePath();
            Intrinsics.checkNotNull(filePath);
            map.put(type, filePath);
        }
        return zAreEqual;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Response requestHead(String url) {
        try {
            Response responseExecute = new OkHttpClient.Builder().build().newCall(new Request.Builder().url(url).head().build()).execute();
            try {
                Logger.d(TAG, "download requestHead:" + responseExecute);
                if (responseExecute.isSuccessful()) {
                    CloseableKt.closeFinally(responseExecute, null);
                    return responseExecute;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(responseExecute, null);
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(responseExecute, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            Logger.d(TAG, e);
        }
        Logger.d(TAG, e);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean supportRange(Response response) {
        if (response != null) {
            return StringsKt__StringsJVMKt.equals("bytes", Response.header$default(response, "Accept-Ranges", null, 2, null), true);
        }
        return false;
    }

    @NotNull
    public final Flow<Integer> download(@NotNull HuamiUpdateInfo updateInfo) {
        Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
        String url = updateInfo.getUrl();
        String md5 = updateInfo.getMd5();
        File firmwareFile = getFirmwareFile(md5);
        Logger.i(TAG, "downLoad:url = " + url + ", file " + firmwareFile.getAbsolutePath());
        updateInfo.setFilePath(firmwareFile.getAbsolutePath());
        return FlowKt.flow(new AnonymousClass1(firmwareFile, md5, this, url, null));
    }

    @Override // com.mi.fitness.checkupdate.ota.IOtaManager
    @NotNull
    public File getFirmwareFile(@NotNull String md5) {
        Intrinsics.checkNotNullParameter(md5, "md5");
        String strF = r72.f(Environment.DIRECTORY_DOWNLOADS);
        String str = File.separator;
        WearableDeviceModel deviceModel = getDeviceModel();
        File file = new File(strF + str + (deviceModel != null ? DeviceModelExtKt.getModel(deviceModel) : null));
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, md5);
    }

    @NotNull
    public final HashMap<FwType, String> getFirmwareUpdateMap() {
        return this.firmwareUpdateMap;
    }

    @NotNull
    public final OtaUpgradeResult getResult() {
        return this.result;
    }

    @NotNull
    public final List<HuamiUpdateInfo> getUpdateInfoList() {
        return this.updateInfoList;
    }

    @Override // com.mi.fitness.checkupdate.ota.IOtaManager
    public void interruptIfNeed(@NotNull String reason) {
        String mac;
        Intrinsics.checkNotNullParameter(reason, "reason");
        Logger.d(TAG, "interruptIfNeed() called");
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel == null || (mac = DeviceModelExtKt.getMac(deviceModel)) == null) {
            mac = "";
        }
        HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
        if (huaMiApiCaller == null) {
            Logger.i(TAG, "interruptIfNeed: huami device = null");
            return;
        }
        if (!huaMiApiCaller.isConnected()) {
            Logger.i(TAG, "interruptIfNeed: huami not connected");
            return;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(reason, "callTimeout", false, 2, null)) {
            Logger.i(TAG, "interruptIfNeed: huami device wont call");
            return;
        }
        Logger.i(TAG, "interruptIfNeed: cancelFwUpgrade");
        huaMiApiCaller.cancelFwUpgrade();
        SilentUpgradeExtKt.interrupted(SilentUpgradeManager.INSTANCE, 100);
        ToastExtKt.toast$default(ApplicationExtKt.getApplication(), yyi.f0, 0, 0, 0L, 14, null);
    }

    @Override // com.mi.fitness.checkupdate.ota.IOtaManager
    public boolean isPushed(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return CheckUpdatePreferenceSupport.INSTANCE.isSilentUpgradePushed(did, this.versionId);
    }

    @Override // com.mi.fitness.checkupdate.ota.IOtaManager
    public void recordPushed(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "recordPushed: did " + did + ", version " + this.versionId);
        CheckUpdatePreferenceSupport.INSTANCE.setSilentUpgradePushed(did, this.versionId);
    }

    @Override // com.mi.fitness.checkupdate.ota.IOtaManager
    public void startDownload(@NotNull CoroutineScope scope, @NotNull DownloadListener downloadListener) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(downloadListener, "downloadListener");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C13771(getUpdateInfoList(), downloadListener, new FwType[1], booleanRef, this, null), 3, null);
    }

    @Override // com.mi.fitness.checkupdate.ota.IOtaManager
    public void startUpgrade(@NotNull Function1<? super Boolean, Unit> callback) {
        String mac;
        Intrinsics.checkNotNullParameter(callback, "callback");
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel == null || (mac = DeviceModelExtKt.getMac(deviceModel)) == null) {
            mac = "";
        }
        HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
        if (huaMiApiCaller != null && !huaMiApiCaller.supportSilentUpgrade()) {
            Logger.i(TAG, "startUpgrade: not support");
            callback.invoke2(Boolean.FALSE);
            return;
        }
        if (this.firmwareUpdateMap.isEmpty()) {
            Logger.i(TAG, "startUpgrade: firmwareUpdateMap is empty");
            callback.invoke2(Boolean.FALSE);
            return;
        }
        Logger.i(TAG, "startUpgrade: " + this.firmwareUpdateMap + " ");
        if (huaMiApiCaller != null) {
            HashMap<FwType, String> map = this.firmwareUpdateMap;
            String changeLog = this.result.getChangeLog();
            huaMiApiCaller.updateFwUpgrade(false, 0, map, changeLog == null ? "" : changeLog, new IFirmwareProgressCallback() { // from class: com.mi.fitness.checkupdate.ui.huami.HuamiOtaManager.startUpgrade.1
                @Override // com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback
                public void onCancel() {
                    Logger.i(HuamiOtaManager.TAG, "onCancel() called");
                    SilentUpgradeExtKt.interrupted(SilentUpgradeManager.INSTANCE, 100);
                }

                @Override // com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback
                public void onError(int p0) {
                    Logger.i(HuamiOtaManager.TAG, "onError() called with: p0 = " + p0);
                    SilentUpgradeExtKt.interrupted(SilentUpgradeManager.INSTANCE, p0);
                }

                @Override // com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback
                public void onFwFinish() {
                    Logger.i(HuamiOtaManager.TAG, "onFwFinish() called");
                    SilentUpgradeExtKt.finished(SilentUpgradeManager.INSTANCE);
                }

                @Override // com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback
                public void onFwProgress(Progress p0, FwType p1) {
                    Logger.i(HuamiOtaManager.TAG, "onFwProgress() called with: p0 = " + p0 + ", p1 = " + p1);
                }

                @Override // com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback
                public void onFwStart(FwType p0) {
                    Logger.i(HuamiOtaManager.TAG, "onFwStart() called with: p0 = " + p0);
                }

                @Override // com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback
                public void onFwStop(boolean p0, FwType p1) {
                    Logger.i(HuamiOtaManager.TAG, "onFwStop() called with: p0 = " + p0 + ", p1 = " + p1);
                }

                @Override // com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback
                public void onTransmissionFinish() {
                    Logger.i(HuamiOtaManager.TAG, "onTransmissionFinish() called");
                    SilentUpgradeExtKt.finished(SilentUpgradeManager.INSTANCE);
                }
            });
        }
        callback.invoke2(Boolean.TRUE);
    }

    @Override // com.mi.fitness.checkupdate.ota.IOtaManager
    public boolean isDownloaded() {
        Iterator<HuamiUpdateInfo> it = this.updateInfoList.iterator();
        while (it.hasNext()) {
            if (!it.next().getIsSuccess()) {
                return false;
            }
        }
        return true;
    }
}
