package com.huami.applet.bluetooth.store;

import android.util.SparseArray;
import androidx.annotation.WorkerThread;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.applet.AppletConfig;
import com.huami.applet.ConstantKt;
import com.huami.applet.bluetooth.core.HMAppletProtocolProxyKt;
import com.huami.applet.bluetooth.store.StoreProtocolImpl;
import com.huami.applet.extension.ContextExtKt;
import com.huami.applet.extension.FileExtKt;
import com.huami.applet.extension.Otherwise;
import com.huami.applet.extension.WithData;
import com.huami.applet.jsengine.exception.AppletException;
import com.huami.applet.utils.UtilsKt;
import com.huami.tools.log.HMLog;
import com.huami.utils.persistence.kvkit.KvKit;
import com.loc.z;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002J\u001c\u0010\u0016\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\u001c\u0010\u0017\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\u001c\u0010\u0018\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\u001c\u0010\u0019\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\f\u0010\u001e\u001a\u00020\u0002*\u00020\u000bH\u0002J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0016\u0010!\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020 0\u000eH\u0016J\u001e\u0010\"\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0016J\u0010\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020 H\u0016J\u001e\u0010&\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0016J\u001c\u0010)\u001a\u00020\u00122\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120'H\u0016J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0002H\u0017J\b\u0010+\u001a\u00020\u0012H\u0016R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010-R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00101R$\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103R\"\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u000e0\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00105R\"\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00105R\"\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R2\u0010<\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00120:098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010;¨\u0006?"}, d2 = {"Lcom/huami/applet/bluetooth/store/StoreProtocolImpl;", "Lcom/huami/applet/bluetooth/store/StoreProtocol;", "", z.j, "", "size", "i", "appId", hl.k, "", "type", "Ljava/nio/ByteBuffer;", "h", "byteArray", "Lcom/huami/applet/bluetooth/store/Callback;", "callback", "Ljava/util/LinkedList;", "list", "", GoogleApiAvailabilityLight.b, "", Constants.EXCEPTION, GoogleApiAvailabilityLight.a, "c", "e", "f", "g", "m", "([B)Ljava/lang/Integer;", "l", com.google.android.exoplayer2.text.ttml.b.r, "b", "", "getInstalledApps", "haveInstallationConditions", "path", "", "installCompanionApp", "uninstallApp", "Lkotlin/Function1;", "result", "setUninstallListener", "dispatchResult", "clearContainer", "a", LogUtil.I, "flag", "version", "headerSize", "[B", "singleBuffer", "Lkotlin/jvm/functions/Function1;", "unInstallListener", "Ljava/util/LinkedList;", "devicesArray", "conditionsArray", "unInstallArray", "Landroid/util/SparseArray;", "Lkotlin/Function2;", "Landroid/util/SparseArray;", "sparseArray", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class StoreProtocolImpl implements StoreProtocol {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Integer, Unit> unInstallListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final SparseArray<Function2<byte[], Throwable, Unit>> sparseArray;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int flag = 2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int version = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int headerSize = 16;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final byte[] singleBuffer = new byte[3600];

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LinkedList<Callback<String>> devicesArray = new LinkedList<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LinkedList<Callback<Integer>> conditionsArray = new LinkedList<>();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LinkedList<Callback<Integer>> unInstallArray = new LinkedList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2<byte[], Throwable, Unit> {
        public a(StoreProtocolImpl storeProtocolImpl) {
            super(2, storeProtocolImpl, StoreProtocolImpl.class, "executeInstalledCallback", "executeInstalledCallback([BLjava/lang/Throwable;)V", 0);
        }

        public final void a(@Nullable byte[] bArr, @Nullable Throwable th) {
            ((StoreProtocolImpl) this.receiver).d(bArr, th);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr, Throwable th) {
            a(bArr, th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function2<byte[], Throwable, Unit> {
        public b(StoreProtocolImpl storeProtocolImpl) {
            super(2, storeProtocolImpl, StoreProtocolImpl.class, "executeInstallationConditionsCallback", "executeInstallationConditionsCallback([BLjava/lang/Throwable;)V", 0);
        }

        public final void a(@Nullable byte[] bArr, @Nullable Throwable th) {
            ((StoreProtocolImpl) this.receiver).c(bArr, th);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr, Throwable th) {
            a(bArr, th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function2<byte[], Throwable, Unit> {
        public c(StoreProtocolImpl storeProtocolImpl) {
            super(2, storeProtocolImpl, StoreProtocolImpl.class, "executeUninstallCallback", "executeUninstallCallback([BLjava/lang/Throwable;)V", 0);
        }

        public final void a(@Nullable byte[] bArr, @Nullable Throwable th) {
            ((StoreProtocolImpl) this.receiver).e(bArr, th);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr, Throwable th) {
            a(bArr, th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function2<byte[], Throwable, Unit> {
        public d(StoreProtocolImpl storeProtocolImpl) {
            super(2, storeProtocolImpl, StoreProtocolImpl.class, "executeUninstallOfDeviceCallback", "executeUninstallOfDeviceCallback([BLjava/lang/Throwable;)V", 0);
        }

        public final void a(@Nullable byte[] bArr, @Nullable Throwable th) {
            ((StoreProtocolImpl) this.receiver).f(bArr, th);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr, Throwable th) {
            a(bArr, th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "未匹配到对应的处理器";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "未设置应用卸载监听器";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("size:", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "未匹配到对应的处理器";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "message-dispatchResult-parseAppId异常";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "message-dispatchResult-parseType异常";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ Callback<?> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Callback<?> callback) {
            super(0);
            this.a = callback;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("start send message callback > ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "execute send message in sub thread.";
        }
    }

    public StoreProtocolImpl() {
        SparseArray<Function2<byte[], Throwable, Unit>> sparseArray = new SparseArray<>();
        this.sparseArray = sparseArray;
        sparseArray.put(1, new a(this));
        sparseArray.put(2, new b(this));
        sparseArray.put(3, new c(this));
        sparseArray.put(4, new d(this));
    }

    private final void b(int appId) {
        KvKit.getKvPersistence$default(Intrinsics.stringPlus("setting-", Integer.valueOf(appId)), ContextExtKt.getAppletKVDir(AppletConfig.INSTANCE.getAppContext(), String.valueOf(appId)).getAbsolutePath(), false, 4, null).clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(byte[] byteArray, Throwable exception) {
        Callback<Integer> callbackPoll = this.conditionsArray.poll();
        Objects.requireNonNull(callbackPoll, "null cannot be cast to non-null type com.huami.applet.bluetooth.store.Callback<kotlin.Int>");
        Callback<Integer> callback = callbackPoll;
        if (byteArray != null) {
            callback.success(Integer.valueOf(byteArray[0]));
        }
        if (exception == null) {
            return;
        }
        callback.failed(exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(byte[] byteArray, Throwable exception) {
        Callback<String> callbackPoll = this.devicesArray.poll();
        Objects.requireNonNull(callbackPoll, "null cannot be cast to non-null type com.huami.applet.bluetooth.store.Callback<kotlin.String>");
        Callback<String> callback = callbackPoll;
        if (byteArray != null) {
            callback.success(new String(byteArray, Charsets.UTF_8));
        }
        if (exception == null) {
            return;
        }
        callback.failed(exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(byte[] byteArray, Throwable exception) {
        Callback<Integer> callbackPoll = this.unInstallArray.poll();
        Objects.requireNonNull(callbackPoll, "null cannot be cast to non-null type com.huami.applet.bluetooth.store.Callback<kotlin.Int>");
        Callback<Integer> callback = callbackPoll;
        if (byteArray != null) {
            callback.success(Integer.valueOf(byteArray[0]));
        }
        if (exception == null) {
            return;
        }
        callback.failed(exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(byte[] byteArray, Throwable exception) {
        Unit unit = null;
        if (byteArray != null) {
            Integer numL = l(byteArray);
            int iIntValue = numL == null ? -1 : numL.intValue();
            Function1<? super Integer, Unit> function1 = this.unInstallListener;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(iIntValue));
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                HMLog.info(ConstantKt.TAG_APPLET, f.a);
            }
            b(iIntValue);
            unit = Unit.INSTANCE;
        }
        if (unit != null || exception == null) {
            return;
        }
        exception.printStackTrace();
    }

    private final void g(byte[] byteArray, int type) {
        Unit unit;
        byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(byteArray, this.headerSize, byteArray.length);
        Function2<byte[], Throwable, Unit> function2 = this.sparseArray.get(type);
        if (function2 == null) {
            unit = null;
        } else {
            function2.invoke(bArrCopyOfRange, null);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            HMLog.warn$default(ConstantKt.TAG_APPLET, null, h.a, 2, null);
        }
    }

    private final ByteBuffer h(short type) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.singleBuffer);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferWrap.put((byte) this.flag);
        byteBufferWrap.put((byte) this.version);
        byteBufferWrap.putShort(type);
        byteBufferWrap.put(new byte[12]);
        return byteBufferWrap;
    }

    private final byte[] i(int size) {
        return p(h((short) 2).putInt(size));
    }

    private final byte[] j() {
        return p(h((short) 1));
    }

    private final byte[] k(int appId) {
        return p(h((short) 3).putInt(appId));
    }

    private final Integer l(byte[] byteArray) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[4]);
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
            byteBufferWrap.put(byteArray[2]);
            byteBufferWrap.put(byteArray[3]);
            byteBufferWrap.put(byteArray[0]);
            byteBufferWrap.put(byteArray[1]);
            byteBufferWrap.flip();
            objM3845constructorimpl = Result.m3845constructorimpl(Integer.valueOf(byteBufferWrap.getInt()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn$default(ConstantKt.TAG_APPLET, null, i.a, 2, null);
            thM3848exceptionOrNullimpl.printStackTrace();
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (Integer) objM3845constructorimpl;
    }

    private final Integer m(byte[] byteArray) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArray);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferWrap.position(2);
            objM3845constructorimpl = Result.m3845constructorimpl(Integer.valueOf(byteBufferWrap.getShort()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn$default(ConstantKt.TAG_APPLET, null, j.a, 2, null);
            thM3848exceptionOrNullimpl.printStackTrace();
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (Integer) objM3845constructorimpl;
    }

    private final void n(final byte[] byteArray, final Callback<?> callback, final LinkedList<?> list) {
        HMLog.info$default(null, new k(callback), 1, null);
        UtilsKt.executeOnSubThread(new Runnable() { // from class: tg7
            @Override // java.lang.Runnable
            public final void run() {
                StoreProtocolImpl.o(byteArray, list, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(byte[] bArr, LinkedList linkedList, Callback callback) {
        HMLog.info$default(null, l.a, 1, null);
        if (HMAppletProtocolProxyKt.getHMAppletProtocolProxy().sendMessage(bArr)) {
            Otherwise otherwise = Otherwise.INSTANCE;
            return;
        }
        linkedList.poll();
        callback.failed(new AppletException(Intrinsics.stringPlus(UtilsKt.byteToHexString(bArr), "指令发送异常"), 0, 2, null));
        new WithData(Unit.INSTANCE);
    }

    private final byte[] p(ByteBuffer byteBuffer) {
        return Arrays.copyOfRange(byteBuffer.array(), 0, byteBuffer.position());
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void clearContainer() {
        this.devicesArray.clear();
        this.conditionsArray.clear();
        this.unInstallArray.clear();
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    @WorkerThread
    public synchronized void dispatchResult(@NotNull byte[] byteArray) {
        Object objM3845constructorimpl;
        Unit unit;
        int iIntValue = -1;
        try {
            Result.Companion companion = Result.Companion;
            Integer numM = m(byteArray);
            if (numM != null) {
                g(byteArray, numM.intValue());
                Unit unit2 = Unit.INSTANCE;
                iIntValue = numM.intValue();
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Function2<byte[], Throwable, Unit> function2 = this.sparseArray.get(iIntValue);
            if (function2 == null) {
                unit = null;
            } else {
                function2.invoke(null, thM3848exceptionOrNullimpl);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                HMLog.warn$default(ConstantKt.TAG_MESSAGE, null, e.a, 2, null);
            }
        }
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void getInstalledApps(@NotNull Callback<String> callback) {
        this.devicesArray.offer(callback);
        n(j(), callback, this.devicesArray);
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void haveInstallationConditions(int size, @NotNull Callback<Integer> callback) {
        this.conditionsArray.offer(callback);
        n(i(size), callback, this.conditionsArray);
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public boolean installCompanionApp(@NotNull String path) {
        Long lFilesSize = FileExtKt.filesSize(new File(path));
        if (lFilesSize == null) {
            return false;
        }
        long jLongValue = lFilesSize.longValue();
        HMLog.info(ConstantKt.TAG_APPLET, new g(jLongValue));
        return jLongValue > 2;
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void setUninstallListener(@NotNull Function1<? super Integer, Unit> result) {
        this.unInstallListener = result;
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void uninstallApp(int appId, @NotNull Callback<Integer> callback) {
        this.unInstallArray.offer(callback);
        n(k(appId), callback, this.unInstallArray);
    }
}
