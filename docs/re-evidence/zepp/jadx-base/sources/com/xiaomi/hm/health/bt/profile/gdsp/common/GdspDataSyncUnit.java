package com.xiaomi.hm.health.bt.profile.gdsp.common;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.companion.mediac.Command;
import com.tencent.open.SocialConstants;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.gdsp.common.filter.IGdspHeaderFilter;
import com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JR\u0010\u0011\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010!¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/GdspDataSyncUnit;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;", "errorCode", "a", ExifInterface.GPS_DIRECTION_TRUE, "", "type", "Ljava/util/Calendar;", "startTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", SocialConstants.PARAM_RECEIVER, "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/filter/IGdspHeaderFilter;", "headerFilters", "Lkotlin/Function1;", "errorCodeTrans", "sync", "", Command.STOP, "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/GdspSyncProfile;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/GdspSyncProfile;", "mProfile", "b", LogUtil.I, "mVersion", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mIsForceStop", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/DataTransferSniffApiProxy;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/DataTransferSniffApiProxy;", "dataTransferSniffApi", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/GdspSyncProfile;I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspDataSyncUnit {

    @NotNull
    private static final String e = "GdspDataSyncUnit";
    private static final int f = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GdspSyncProfile mProfile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int mVersion;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private AtomicBoolean mIsForceStop = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataTransferSniffApi = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/DataTransferSniffApiProxy;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<DataTransferSniffApiProxy> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DataTransferSniffApiProxy invoke() {
            return new DataTransferSniffApiProxy();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.GdspDataSyncUnit$sync$1", f = "GdspDataSyncUnit.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2}, l = {82, 82, 118}, m = "invokeSuspend", n = {"header", "totalSize", "dataCrc32", "compress", "startResult", "header", "totalSize", "dataCrc32", "compress", "startResult", "dataCrc32"}, s = {"L$3", "L$4", "L$5", "L$6", "L$8", "L$3", "L$4", "L$5", "L$6", "L$8", "L$1"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GDSPErrorCode>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public int i;
        public int j;
        private /* synthetic */ Object k;
        public final /* synthetic */ IGdspDataReceiver<T> l;
        public final /* synthetic */ GdspDataSyncUnit m;
        public final /* synthetic */ Calendar n;
        public final /* synthetic */ int o;
        public final /* synthetic */ List<IGdspHeaderFilter> p;
        public final /* synthetic */ Function1<GDSPErrorCode, GDSPErrorCode> q;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.GdspDataSyncUnit$sync$1$resultCode$1$startResponse$1", f = "GdspDataSyncUnit.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HMNotifyResponse>, Object> {
            public int a;
            public final /* synthetic */ Ref.ObjectRef<Channel<HMNotifyResponse>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.ObjectRef<Channel<HMNotifyResponse>> objectRef, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super HMNotifyResponse> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<HMNotifyResponse> channel = this.b.element;
                    this.a = 1;
                    obj = channel.receive(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(IGdspDataReceiver<T> iGdspDataReceiver, GdspDataSyncUnit gdspDataSyncUnit, Calendar calendar, int i, List<? extends IGdspHeaderFilter> list, Function1<? super GDSPErrorCode, ? extends GDSPErrorCode> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.l = iGdspDataReceiver;
            this.m = gdspDataSyncUnit;
            this.n = calendar;
            this.o = i;
            this.p = list;
            this.q = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.l, this.m, this.n, this.o, this.p, this.q, continuation);
            bVar.k = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super GDSPErrorCode> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:70:0x01aa A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:71:0x01ab  */
        /* JADX WARN: Code duplicated, block: B:74:0x01c8 A[Catch: all -> 0x0276, TryCatch #0 {all -> 0x0276, blocks: (B:124:0x02d2, B:126:0x02d6, B:129:0x02dd, B:131:0x02e3, B:77:0x01e6, B:99:0x0263, B:103:0x027d, B:105:0x0281, B:113:0x0296, B:108:0x0287, B:111:0x0290, B:114:0x0298, B:116:0x02a2, B:119:0x02a8, B:121:0x02af, B:80:0x01f9, B:82:0x01ff, B:68:0x018e, B:72:0x01c0, B:74:0x01c8, B:85:0x020b, B:92:0x0228, B:88:0x021a, B:94:0x023a, B:96:0x0244), top: B:192:0x01e6 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x01e5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:80:0x01f9 A[Catch: all -> 0x0276, TryCatch #0 {all -> 0x0276, blocks: (B:124:0x02d2, B:126:0x02d6, B:129:0x02dd, B:131:0x02e3, B:77:0x01e6, B:99:0x0263, B:103:0x027d, B:105:0x0281, B:113:0x0296, B:108:0x0287, B:111:0x0290, B:114:0x0298, B:116:0x02a2, B:119:0x02a8, B:121:0x02af, B:80:0x01f9, B:82:0x01ff, B:68:0x018e, B:72:0x01c0, B:74:0x01c8, B:85:0x020b, B:92:0x0228, B:88:0x021a, B:94:0x023a, B:96:0x0244), top: B:192:0x01e6 }] */
        /* JADX WARN: Code duplicated, block: B:82:0x01ff A[Catch: all -> 0x0276, TryCatch #0 {all -> 0x0276, blocks: (B:124:0x02d2, B:126:0x02d6, B:129:0x02dd, B:131:0x02e3, B:77:0x01e6, B:99:0x0263, B:103:0x027d, B:105:0x0281, B:113:0x0296, B:108:0x0287, B:111:0x0290, B:114:0x0298, B:116:0x02a2, B:119:0x02a8, B:121:0x02af, B:80:0x01f9, B:82:0x01ff, B:68:0x018e, B:72:0x01c0, B:74:0x01c8, B:85:0x020b, B:92:0x0228, B:88:0x021a, B:94:0x023a, B:96:0x0244), top: B:192:0x01e6 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x0205  */
        /* JADX WARN: Code duplicated, block: B:85:0x020b A[Catch: all -> 0x0276, TryCatch #0 {all -> 0x0276, blocks: (B:124:0x02d2, B:126:0x02d6, B:129:0x02dd, B:131:0x02e3, B:77:0x01e6, B:99:0x0263, B:103:0x027d, B:105:0x0281, B:113:0x0296, B:108:0x0287, B:111:0x0290, B:114:0x0298, B:116:0x02a2, B:119:0x02a8, B:121:0x02af, B:80:0x01f9, B:82:0x01ff, B:68:0x018e, B:72:0x01c0, B:74:0x01c8, B:85:0x020b, B:92:0x0228, B:88:0x021a, B:94:0x023a, B:96:0x0244), top: B:192:0x01e6 }] */
        /* JADX WARN: Code duplicated, block: B:87:0x0214  */
        /* JADX WARN: Code duplicated, block: B:88:0x021a A[Catch: all -> 0x0276, TryCatch #0 {all -> 0x0276, blocks: (B:124:0x02d2, B:126:0x02d6, B:129:0x02dd, B:131:0x02e3, B:77:0x01e6, B:99:0x0263, B:103:0x027d, B:105:0x0281, B:113:0x0296, B:108:0x0287, B:111:0x0290, B:114:0x0298, B:116:0x02a2, B:119:0x02a8, B:121:0x02af, B:80:0x01f9, B:82:0x01ff, B:68:0x018e, B:72:0x01c0, B:74:0x01c8, B:85:0x020b, B:92:0x0228, B:88:0x021a, B:94:0x023a, B:96:0x0244), top: B:192:0x01e6 }] */
        /* JADX WARN: Code duplicated, block: B:90:0x0226  */
        /* JADX WARN: Code duplicated, block: B:91:0x0227  */
        /* JADX WARN: Code duplicated, block: B:94:0x023a A[Catch: all -> 0x0276, TryCatch #0 {all -> 0x0276, blocks: (B:124:0x02d2, B:126:0x02d6, B:129:0x02dd, B:131:0x02e3, B:77:0x01e6, B:99:0x0263, B:103:0x027d, B:105:0x0281, B:113:0x0296, B:108:0x0287, B:111:0x0290, B:114:0x0298, B:116:0x02a2, B:119:0x02a8, B:121:0x02af, B:80:0x01f9, B:82:0x01ff, B:68:0x018e, B:72:0x01c0, B:74:0x01c8, B:85:0x020b, B:92:0x0228, B:88:0x021a, B:94:0x023a, B:96:0x0244), top: B:192:0x01e6 }] */
        /* JADX WARN: Code duplicated, block: B:96:0x0244 A[Catch: all -> 0x0276, TryCatch #0 {all -> 0x0276, blocks: (B:124:0x02d2, B:126:0x02d6, B:129:0x02dd, B:131:0x02e3, B:77:0x01e6, B:99:0x0263, B:103:0x027d, B:105:0x0281, B:113:0x0296, B:108:0x0287, B:111:0x0290, B:114:0x0298, B:116:0x02a2, B:119:0x02a8, B:121:0x02af, B:80:0x01f9, B:82:0x01ff, B:68:0x018e, B:72:0x01c0, B:74:0x01c8, B:85:0x020b, B:92:0x0228, B:88:0x021a, B:94:0x023a, B:96:0x0244), top: B:192:0x01e6 }] */
        /* JADX WARN: Type inference failed for: r11v4, types: [T, kotlinx.coroutines.channels.Channel] */
        /* JADX WARN: Type inference failed for: r7v11, types: [T, com.huami.core.device.feature.compress.impl.ZipCompress] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01e3 -> B:15:0x005d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 982
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.hm.health.bt.profile.gdsp.common.GdspDataSyncUnit.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public GdspDataSyncUnit(@NotNull GdspSyncProfile gdspSyncProfile, int i) {
        this.mProfile = gdspSyncProfile;
        this.mVersion = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GDSPErrorCode a(GDSPErrorCode errorCode) {
        if (!(errorCode != GDSPErrorCode.SUCCESS)) {
            errorCode = null;
        }
        return errorCode == null ? GDSPErrorCode.CANCEL : errorCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataTransferSniffApiProxy b() {
        return (DataTransferSniffApiProxy) this.dataTransferSniffApi.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GDSPErrorCode sync$default(GdspDataSyncUnit gdspDataSyncUnit, int i, Calendar calendar, IGdspDataReceiver iGdspDataReceiver, List list, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        List list2 = list;
        if ((i2 & 16) != 0) {
            function1 = null;
        }
        return gdspDataSyncUnit.sync(i, calendar, iGdspDataReceiver, list2, function1);
    }

    public final void stop() {
        Debug.fi(e, "user cancel data sync");
        this.mIsForceStop.set(true);
        this.mProfile.forceStop();
    }

    @NotNull
    public final <T> GDSPErrorCode sync(int type, @NotNull Calendar startTime, @NotNull IGdspDataReceiver<T> receiver, @NotNull List<? extends IGdspHeaderFilter> headerFilters, @Nullable Function1<? super GDSPErrorCode, ? extends GDSPErrorCode> errorCodeTrans) {
        return (GDSPErrorCode) BuildersKt.runBlocking(GdspScope.INSTANCE.getCoroutineContext(), new b(receiver, this, startTime, type, headerFilters, errorCodeTrans, null));
    }
}
