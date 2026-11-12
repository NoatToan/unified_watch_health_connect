package com.huami.watchfacesstore.device;

import android.graphics.Color;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.device.channel.IDeviceManager;
import com.huami.watchfacesstore.device.process.DialBitmapProcessorFactory;
import com.huami.watchfacesstore.device.process.IDialInfoReader;
import com.huami.watchfacesstore.device.process.IDialInfoReaderKt;
import com.huami.watchfacesstore.device.process.IDialProcessor;
import com.huami.watchfacesstore.ext.KoinExtKt;
import java.io.File;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b7\u00108J9\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J5\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\nJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002Jj\u0010!\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022%\u0010 \u001a!\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u001aj\u0002`\u001fH\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J=\u0010&\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040#2%\u0010%\u001a!\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u001aj\u0002`\u001fH\u0016J\u0010\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0004H\u0016J7\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u00042%\u0010%\u001a!\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u001aj\u0002`\u001fH\u0016R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u001d\u00102\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R5\u00104\u001a!\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u001aj\u0002`\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u00103R\u0018\u00106\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lcom/huami/watchfacesstore/device/MILIDeviceManager;", "Lcom/huami/watchfacesstore/device/WFDeviceManager;", "", "bgPath", "", "transparentColor", "skinPath", "transparentPath", "", "f", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "path", "", "e", "dialPath", GoogleApiAvailabilityLight.a, "color", "", "g", "(Ljava/lang/Integer;)[B", "c", "(Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "dfuState", "a", "fwVersion", "watchFacePath", "Lkotlin/Function1;", "Lcom/huami/watchfacesstore/device/WatchFaceState;", "Lkotlin/ParameterName;", "name", "state", "Lcom/huami/watchfacesstore/device/OnSyncResultCallBack;", "onSyncResultCallBack", "syncWatchFace", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "watchFaceIds", "onResultCallBack", "deleteWatchFace", "id", "setWatchFaceById", "currentId", "replaceWatchFace", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "mDeviceManager", "Lcom/huami/watchfacesstore/device/process/IDialInfoReader;", "b", "Lkotlin/Lazy;", "()Lcom/huami/watchfacesstore/device/process/IDialInfoReader;", "dialInfoReader", "Lkotlin/jvm/functions/Function1;", "mCallBack", "Ljava/lang/String;", "finalPath", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class MILIDeviceManager implements WFDeviceManager {

    @NotNull
    private static final String e = "MILIDeviceManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDeviceManager mDeviceManager = KoinExtKt.getDeviceManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy dialInfoReader = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Function1<? super WatchFaceState, Unit> mCallBack;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String finalPath;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Integer> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<Integer> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete dial success: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Integer> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<Integer> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete dial fail: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/device/process/IDialInfoReader;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<IDialInfoReader> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IDialInfoReader invoke() {
            return IDialInfoReaderKt.createDialInfoReader(KoinExtKt.getDeviceInfo().getDeviceConfig().getDialFileType());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.device.MILIDeviceManager", f = "MILIDeviceManager.kt", i = {0}, l = {133}, m = "handleDialWithBg", n = {"dialPath"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return MILIDeviceManager.this.d(null, null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "bgPath: " + this.a;
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
            return "此时已经生成了目标bmp，开始组装表盘文件~";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "path: " + this.a + " size: " + new File(this.a).length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ Long a;
        public final /* synthetic */ Long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Long l, Long l2) {
            super(0);
            this.a = l;
            this.b = l2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "dialId: " + this.a + " dialSize: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.device.MILIDeviceManager", f = "MILIDeviceManager.kt", i = {}, l = {78}, m = "syncReally", n = {}, s = {})
    public static final class i extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return MILIDeviceManager.this.f(null, null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handleDialWithBg: " + Log.getStackTraceString(this.a.getCause());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handleDialWithBg error finalPath isNullOrBlank ！！！！";
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
            return "sync prepare work done start device sync";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/device/WatchFaceState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<WatchFaceState, Unit> {
        public m() {
            super(1);
        }

        public final void a(@NotNull WatchFaceState watchFaceState) {
            Function1 function1 = MILIDeviceManager.this.mCallBack;
            Objects.requireNonNull(function1);
            function1.invoke(watchFaceState);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchFaceState watchFaceState) {
            a(watchFaceState);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "同步表盘开始执行前置判断条件和处理工作~";
        }
    }

    private final boolean a(int dfuState) {
        if (dfuState == 32) {
            Function1<? super WatchFaceState, Unit> function1 = this.mCallBack;
            Objects.requireNonNull(function1);
            function1.invoke(new WatchFaceState(WatchFaceStatus.SPORT_ONGOING, null, 2, null));
            return false;
        }
        if (dfuState == 33) {
            Function1<? super WatchFaceState, Unit> function2 = this.mCallBack;
            Objects.requireNonNull(function2);
            function2.invoke(new WatchFaceState(WatchFaceStatus.TIME_ONGOING, null, 2, null));
            return false;
        }
        if (dfuState != 48) {
            return true;
        }
        Function1<? super WatchFaceState, Unit> function3 = this.mCallBack;
        Objects.requireNonNull(function3);
        function3.invoke(new WatchFaceState(WatchFaceStatus.MUSIC_ONGOING, null, 2, null));
        return false;
    }

    private final IDialInfoReader b() {
        return (IDialInfoReader) this.dialInfoReader.getValue();
    }

    private final String c(Integer transparentColor, String dialPath) {
        return DialBitmapProcessorFactory.INSTANCE.createChangeColorProcessor(g(transparentColor)).process(dialPath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, Integer num, String str2, String str3, Continuation<? super String> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objCreateEmbedProcessor = dVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objCreateEmbedProcessor);
            HMLog.info(e, new e(str));
            byte[] bArrG = g(num);
            DialBitmapProcessorFactory.Companion companion = DialBitmapProcessorFactory.INSTANCE;
            String strProcess = companion.createBitmapProcessor().process(str);
            HMLog.info(e, f.a);
            dVar.a = str2;
            dVar.d = 1;
            objCreateEmbedProcessor = companion.createEmbedProcessor(strProcess, bArrG, str3, dVar);
            if (objCreateEmbedProcessor == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) dVar.a;
            ResultKt.throwOnFailure(objCreateEmbedProcessor);
        }
        return ((IDialProcessor) objCreateEmbedProcessor).process(str2);
    }

    private final boolean e(String path) {
        if (!this.mDeviceManager.isSupportQueryStorageState()) {
            return true;
        }
        HMLog.info(e, new g(path));
        Long[] dialInfo = b().readDialInfo(path);
        Long l2 = dialInfo[0];
        Long l3 = dialInfo[1];
        HMLog.info(e, new h(l2, l3));
        if (l2 == null || l3 == null || this.mDeviceManager.getStorageStateSync(l3.longValue(), l2.longValue())) {
            return true;
        }
        Function1<? super WatchFaceState, Unit> function1 = this.mCallBack;
        Objects.requireNonNull(function1);
        function1.invoke(new WatchFaceState(WatchFaceStatus.STORAGE_FULL, null, 2, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 2321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object f(java.lang.String r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.watchfacesstore.device.MILIDeviceManager.f(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final byte[] g(Integer color) {
        if (color == null) {
            return null;
        }
        int iIntValue = color.intValue();
        return new byte[]{(byte) Color.alpha(iIntValue), (byte) Color.red(iIntValue), (byte) Color.green(iIntValue), (byte) Color.blue(iIntValue)};
    }

    @Override // com.huami.watchfacesstore.device.WFDeviceManager
    public void deleteWatchFace(@NotNull List<Integer> watchFaceIds, @NotNull Function1<? super WatchFaceState, Unit> onResultCallBack) {
        this.mCallBack = onResultCallBack;
        if (!this.mDeviceManager.isBluetoothEnable()) {
            Function1<? super WatchFaceState, Unit> function1 = this.mCallBack;
            Objects.requireNonNull(function1);
            function1.invoke(new WatchFaceState(WatchFaceStatus.BLUETOOTH_NOT_OPEN, null, 2, null));
            return;
        }
        if (!this.mDeviceManager.isConnected()) {
            Function1<? super WatchFaceState, Unit> function2 = this.mCallBack;
            Objects.requireNonNull(function2);
            function2.invoke(new WatchFaceState(WatchFaceStatus.CONNECTING, null, 2, null));
        } else {
            if (this.mDeviceManager.deleteWatchFaceIds(watchFaceIds)) {
                HMLog.info(e, new a(watchFaceIds));
                Function1<? super WatchFaceState, Unit> function3 = this.mCallBack;
                Objects.requireNonNull(function3);
                function3.invoke(new WatchFaceState(WatchFaceStatus.DELETE_SUCCESS, null, 2, null));
                return;
            }
            HMLog.info(e, new b(watchFaceIds));
            Function1<? super WatchFaceState, Unit> function4 = this.mCallBack;
            Objects.requireNonNull(function4);
            function4.invoke(new WatchFaceState(WatchFaceStatus.DELETE_FAIL, null, 2, null));
        }
    }

    @Override // com.huami.watchfacesstore.device.WFDeviceManager
    public void replaceWatchFace(int currentId, @NotNull Function1<? super WatchFaceState, Unit> onResultCallBack) {
        this.mCallBack = onResultCallBack;
        if (!this.mDeviceManager.isBluetoothEnable()) {
            Function1<? super WatchFaceState, Unit> function1 = this.mCallBack;
            Objects.requireNonNull(function1);
            function1.invoke(new WatchFaceState(WatchFaceStatus.BLUETOOTH_NOT_OPEN, null, 2, null));
            return;
        }
        if (!this.mDeviceManager.isConnected()) {
            Function1<? super WatchFaceState, Unit> function2 = this.mCallBack;
            Objects.requireNonNull(function2);
            function2.invoke(new WatchFaceState(WatchFaceStatus.CONNECTING, null, 2, null));
            return;
        }
        String str = this.finalPath;
        if (str == null) {
            return;
        }
        Long[] dialInfo = b().readDialInfo(str);
        Long l2 = dialInfo[0];
        Long l3 = dialInfo[1];
        if (l2 == null || l3 == null) {
            return;
        }
        if (this.mDeviceManager.replaceWatchFace(currentId, (int) l2.longValue(), (int) l3.longValue())) {
            Function1<? super WatchFaceState, Unit> function3 = this.mCallBack;
            Objects.requireNonNull(function3);
            function3.invoke(new WatchFaceState(WatchFaceStatus.REPLACE_SUCCESS, null, 2, null));
        } else {
            Function1<? super WatchFaceState, Unit> function4 = this.mCallBack;
            Objects.requireNonNull(function4);
            function4.invoke(new WatchFaceState(WatchFaceStatus.REPLACE_FAIL, null, 2, null));
        }
    }

    @Override // com.huami.watchfacesstore.device.WFDeviceManager
    public boolean setWatchFaceById(int id) {
        return this.mDeviceManager.setWatchFaceById(id);
    }

    @Override // com.huami.watchfacesstore.device.WFDeviceManager
    @Nullable
    public Object syncWatchFace(@Nullable String str, @Nullable String str2, @Nullable Integer num, @NotNull String str3, @Nullable String str4, @NotNull Function1<? super WatchFaceState, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objF;
        this.mCallBack = function1;
        Objects.requireNonNull(function1);
        function1.invoke(new WatchFaceState(WatchFaceStatus.START, null, 2, null));
        HMLog.info(e, n.a);
        if (!this.mDeviceManager.isBluetoothEnable()) {
            Function1<? super WatchFaceState, Unit> function2 = this.mCallBack;
            Objects.requireNonNull(function2);
            Unit unitInvoke = function2.invoke(new WatchFaceState(WatchFaceStatus.BLUETOOTH_NOT_OPEN, null, 2, null));
            return unitInvoke == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? unitInvoke : Unit.INSTANCE;
        }
        if (!this.mDeviceManager.isConnected()) {
            Function1<? super WatchFaceState, Unit> function3 = this.mCallBack;
            Objects.requireNonNull(function3);
            Unit unitInvoke2 = function3.invoke(new WatchFaceState(WatchFaceStatus.CONNECTING, null, 2, null));
            return unitInvoke2 == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? unitInvoke2 : Unit.INSTANCE;
        }
        if (this.mDeviceManager.isSyncingData()) {
            Function1<? super WatchFaceState, Unit> function4 = this.mCallBack;
            Objects.requireNonNull(function4);
            Unit unitInvoke3 = function4.invoke(new WatchFaceState(WatchFaceStatus.SYNC_DATA, null, 2, null));
            return unitInvoke3 == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? unitInvoke3 : Unit.INSTANCE;
        }
        if (this.mDeviceManager.isAgpsUpgrading()) {
            Function1<? super WatchFaceState, Unit> function5 = this.mCallBack;
            Objects.requireNonNull(function5);
            Unit unitInvoke4 = function5.invoke(new WatchFaceState(WatchFaceStatus.AGPS_UPDATE, null, 2, null));
            return unitInvoke4 == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? unitInvoke4 : Unit.INSTANCE;
        }
        if (!this.mDeviceManager.isFwSupport(str)) {
            Function1<? super WatchFaceState, Unit> function6 = this.mCallBack;
            Objects.requireNonNull(function6);
            Unit unitInvoke5 = function6.invoke(new WatchFaceState(WatchFaceStatus.FW_LOW, null, 2, null));
            return unitInvoke5 == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? unitInvoke5 : Unit.INSTANCE;
        }
        if (!this.mDeviceManager.isSilentTransmitting()) {
            return (a(this.mDeviceManager.getDfuState()) && (objF = f(str2, num, str3, str4, continuation)) == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) ? objF : Unit.INSTANCE;
        }
        Function1<? super WatchFaceState, Unit> function7 = this.mCallBack;
        Objects.requireNonNull(function7);
        Unit unitInvoke6 = function7.invoke(new WatchFaceState(WatchFaceStatus.FW_UPDATE, null, 2, null));
        return unitInvoke6 == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? unitInvoke6 : Unit.INSTANCE;
    }
}
