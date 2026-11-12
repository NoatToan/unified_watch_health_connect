package com.huami.watchfacesstore.device.process;

import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.ext.KoinExtKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/watchfacesstore/device/process/DialBitmapProcessorFactory;", "", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DialBitmapProcessorFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J-\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/huami/watchfacesstore/device/process/DialBitmapProcessorFactory$Companion;", "", "Lcom/huami/watchfacesstore/device/process/IDialProcessor;", "a", "createBitmapProcessor", "", "argb", "Lcom/huami/watchfacesstore/device/process/DialColorYorkProcessor;", "createChangeColorProcessor", "", "bgPath", "transparentPath", "createEmbedProcessor", "(Ljava/lang/String;[BLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialFileType.values().length];
                iArr[DialFileType.UIH_ORIGIN_DIAL.ordinal()] = 1;
                iArr[DialFileType.ORIGIN_DIAL.ordinal()] = 2;
                iArr[DialFileType.COMPRESS_DIAL.ordinal()] = 3;
                iArr[DialFileType.UIH_COMPRESS_DIAL.ordinal()] = 4;
                iArr[DialFileType.JS_DIAL.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.watchfacesstore.device.process.DialBitmapProcessorFactory$Companion", f = "DialBitmapProcessorFactory.kt", i = {}, l = {139}, m = "createEmbedProcessor", n = {}, s = {})
        public static final class a extends ContinuationImpl {
            public Object a;
            public Object b;
            public /* synthetic */ Object c;
            public int e;

            public a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return Companion.this.createEmbedProcessor(null, null, null, this);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "imageFmt: " + this.a;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final IDialProcessor a() {
            Pair<Integer, Integer> realDialPreviewSize = KoinExtKt.getDeviceConfigManager().getCurrentDeviceConfig().getRealDialPreviewSize();
            return new DialBitmap565Processor(new DialBitmapBmpProcessor(new DialBitmapScaleProcessor(realDialPreviewSize.getFirst().intValue(), realDialPreviewSize.getSecond().intValue()), false, false, 0, 10, null));
        }

        @NotNull
        public final IDialProcessor createBitmapProcessor() {
            DeviceConfigManager deviceConfigManager = KoinExtKt.getDeviceConfigManager();
            Pair<Integer, Integer> deviceDialRealSize = deviceConfigManager.getDeviceDialRealSize();
            int i = WhenMappings.$EnumSwitchMapping$0[deviceConfigManager.getCurrentDeviceConfig().getDialFileType().ordinal()];
            if (i == 1) {
                DialBitmapScaleProcessor dialBitmapScaleProcessor = new DialBitmapScaleProcessor(deviceDialRealSize.getFirst().intValue(), deviceDialRealSize.getSecond().intValue());
                return new DialBitmap565Processor(deviceConfigManager.isSupportRadius() ? new DialBitmapBmpProcessor(new DialBitmapCornerProcessor(dialBitmapScaleProcessor, deviceConfigManager.getDeviceDialRealRadius()), false, false, 0, 10, null) : new DialBitmapBmpProcessor(dialBitmapScaleProcessor, false, false, 0, 10, null));
            }
            if (i == 2) {
                return new DialBitmap565Processor(new DialBitmapBmpProcessor(new DialBitmapScaleProcessor(deviceDialRealSize.getFirst().intValue(), deviceDialRealSize.getSecond().intValue()), false, false, 0, 14, null));
            }
            if (i == 3) {
                return new DialBitmapDtaHeaderProcessor(new DialBitmapBmpProcessor(new DialBitmapCornerProcessor(new DialBitmapScaleProcessor(deviceDialRealSize.getFirst().intValue(), deviceDialRealSize.getSecond().intValue()), deviceConfigManager.getDeviceDialRealRadius()), true, false, 0, 8, null), 0, 2, null);
            }
            if (i == 4) {
                return new DialBitmapDtaHeaderProcessor(new DialBitmapBmpProcessor(new DialBitmapCornerProcessor(new DialBitmapScaleProcessor(deviceDialRealSize.getFirst().intValue(), deviceDialRealSize.getSecond().intValue()), deviceConfigManager.getDeviceDialRealRadius()), true, false, 1), 0, 2, null);
            }
            if (i == 5) {
                return new DialPngProcessor(new DialBitmapCornerProcessor(new DialBitmapScaleProcessor(deviceDialRealSize.getFirst().intValue(), deviceDialRealSize.getSecond().intValue()), deviceConfigManager.getDeviceDialRealRadius()));
            }
            throw new NoWhenBranchMatchedException();
        }

        @NotNull
        public final DialColorYorkProcessor createChangeColorProcessor(@Nullable byte[] argb) {
            return new DialColorYorkProcessor(new DialPassProcessor(), argb);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        @Nullable
        public final Object createEmbedProcessor(@NotNull String str, @Nullable byte[] bArr, @NotNull String str2, @NotNull Continuation<? super IDialProcessor> continuation) {
            a aVar;
            DeviceConfigManager deviceConfigManager;
            DeviceConfigManager deviceConfigManager2;
            String str3 = str;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i = aVar.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.e = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(continuation);
                }
            } else {
                aVar = new a(continuation);
            }
            Object obj = aVar.c;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = aVar.e;
            String str4 = "";
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                deviceConfigManager = KoinExtKt.getDeviceConfigManager();
                int i3 = WhenMappings.$EnumSwitchMapping$0[deviceConfigManager.getCurrentDeviceConfig().getDialFileType().ordinal()];
                if (i3 == 1) {
                    DialPassProcessor dialPassProcessor = new DialPassProcessor();
                    String strProcess = a().process(str);
                    return bArr == null ? new DialEmbedYorkBgProcessor(dialPassProcessor, str, strProcess) : new DialEmbedYorkBgProcessor(DialBitmapProcessorFactory.INSTANCE.createChangeColorProcessor(bArr), str, strProcess);
                }
                if (i3 == 2) {
                    return new DialEmbedBgProcessor(new DialPassProcessor(), str, 0L, 0, 0, 0L, 60, null);
                }
                if (i3 == 3) {
                    return new DialCompressComProcessor(new DialEmbedBgProcessor(new DialDecompressProcessor(), str, 0L, 0, 0, 0L, 60, null));
                }
                if (i3 == 4) {
                    return new UihDialEmbedBgProcessor(new DialCompressComProcessor(new DialEmbedBgProcessor(new DialDecompressProcessor(), str, 13L, 14, 3, 21L)));
                }
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                Pair<Integer, Integer> realDialPreviewSize = deviceConfigManager.getCurrentDeviceConfig().getRealDialPreviewSize();
                if (realDialPreviewSize != null) {
                    String strProcess2 = new DialBitmapScaleProcessor(realDialPreviewSize.getFirst().intValue(), realDialPreviewSize.getSecond().intValue()).process(str);
                    DialJsPreviewProcessor dialJsPreviewProcessor = new DialJsPreviewProcessor(str2, realDialPreviewSize.getFirst().intValue(), realDialPreviewSize.getSecond().intValue());
                    aVar.a = str3;
                    aVar.b = deviceConfigManager;
                    aVar.e = 1;
                    Object objProcess = dialJsPreviewProcessor.process(strProcess2, aVar);
                    if (objProcess == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objProcess;
                    deviceConfigManager2 = deviceConfigManager;
                }
                int imageFmt = deviceConfigManager.getImageFmt();
                HMLog.info("DialBitmapProcessorFactory", new b(imageFmt));
                return new DialJsProcessor(str3, str4, imageFmt);
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deviceConfigManager2 = (DeviceConfigManager) aVar.b;
            str3 = (String) aVar.a;
            ResultKt.throwOnFailure(obj);
            String str5 = (String) obj;
            str4 = str5 != null ? str5 : "";
            deviceConfigManager = deviceConfigManager2;
            int imageFmt2 = deviceConfigManager.getImageFmt();
            HMLog.info("DialBitmapProcessorFactory", new b(imageFmt2));
            return new DialJsProcessor(str3, str4, imageFmt2);
        }
    }
}
