package com.xiaomi.hm.health.device.watch_skin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0016\u0010\b\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/DialDitherProcessor;", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "Lorg/koin/core/component/KoinComponent;", "", "originPath", "process", "a", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "processor", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "b", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "<init>", "(Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialDitherProcessor implements IDialProcessor, KoinComponent {

    @NotNull
    public static final String TAG = "DialDitherProcessor";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDialProcessor processor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save dither bitmap result:" + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialDitherProcessor(@NotNull IDialProcessor iDialProcessor) {
        this.processor = iDialProcessor;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.watch_skin.DialDitherProcessor$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceUtilsApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceUtilsApi a() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    public long finalSize() {
        return IDialProcessor.DefaultImpls.finalSize(this);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    /* JADX INFO: renamed from: originSize */
    public long getOriginSize() {
        return IDialProcessor.DefaultImpls.originSize(this);
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    @NotNull
    public String process(@NotNull String originPath) {
        String strProcess = this.processor.process(originPath);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new FileInputStream(new File(strProcess)));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), Bitmap.Config.RGB_565);
        Paint paint = new Paint();
        paint.setDither(true);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmapDecodeStream, 0.0f, 0.0f, paint);
        canvas.save();
        canvas.restore();
        bitmapDecodeStream.recycle();
        String str = strProcess + ".dither";
        boolean zSaveBitmapToPngFile = a().saveBitmapToPngFile(str, bitmapCreateBitmap);
        HMLog.info(TAG, new a(zSaveBitmapToPngFile));
        if (!zSaveBitmapToPngFile) {
            return strProcess;
        }
        new File(strProcess).deleteOnExit();
        return str;
    }
}
