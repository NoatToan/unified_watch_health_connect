package com.xiaomi.fit.fitness.sleep.algo.stage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.sleep.algo.stage.MiParseModel;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0007¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0004R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/fit/fitness/sleep/algo/stage/MiParseModel;", "", "", "initializeInterpreter", "()V", "Landroid/content/res/AssetManager;", "assetManager", "", "filename", "Ljava/nio/ByteBuffer;", "loadModelFile", "(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/nio/ByteBuffer;", "Landroid/content/Context;", "context", "Lcom/xiaomi/fit/fitness/sleep/algo/stage/MiParseModel$OnMiClassifierCallBack;", "onMiClassifierCallBack", "initialize", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/sleep/algo/stage/MiParseModel$OnMiClassifierCallBack;)V", "", "", "data", "classify", "([[F)V", Constants.EXTRA_CLOSE_TAI, "Lorg/tensorflow/lite/a;", "interpreter", "Lorg/tensorflow/lite/a;", "", "isInitialized", "Z", "mOnMiClassifierCallBack", "Lcom/xiaomi/fit/fitness/sleep/algo/stage/MiParseModel$OnMiClassifierCallBack;", "Landroid/content/Context;", "<init>", "Companion", "OnMiClassifierCallBack", "fitness-sleep-algo_release"}, k = 1, mv = {2, 0, 0})
public final class MiParseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String LITE_MODE_NAME = "mi_stage_model_0_1_1.tflite";
    public static final int NUM_THREAD = 4;
    public static final int OUTPUT_CLASSES_COUNT = 4;

    @NotNull
    public static final String TAG = "MiSleepClassifier";

    @NotNull
    private static Executor mExecutor;
    private Context context;

    @Nullable
    private a interpreter;
    private boolean isInitialized;
    private OnMiClassifierCallBack mOnMiClassifierCallBack;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fit/fitness/sleep/algo/stage/MiParseModel$Companion;", "", "<init>", "()V", "TAG", "", "OUTPUT_CLASSES_COUNT", "", "NUM_THREAD", "mExecutor", "Ljava/util/concurrent/Executor;", "getMExecutor", "()Ljava/util/concurrent/Executor;", "setMExecutor", "(Ljava/util/concurrent/Executor;)V", "LITE_MODE_NAME", "fitness-sleep-algo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Executor getMExecutor() {
            return MiParseModel.mExecutor;
        }

        public final void setMExecutor(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "<set-?>");
            MiParseModel.mExecutor = executor;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/fitness/sleep/algo/stage/MiParseModel$OnMiClassifierCallBack;", "", "onResult", "", "output", "", "", "([[F)V", "fitness-sleep-algo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnMiClassifierCallBack {
        void onResult(@Nullable float[][] output);
    }

    static {
        final HandlerThread handlerThread = new HandlerThread("relayService");
        handlerThread.start();
        mExecutor = new Executor() { // from class: jvf
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                MiParseModel._init_$lambda$1(handlerThread, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(HandlerThread thread, Runnable r2) {
        Intrinsics.checkNotNullParameter(thread, "$thread");
        Intrinsics.checkNotNullParameter(r2, "r");
        new Handler(thread.getLooper()).post(r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void classify$lambda$0(float[][] data, MiParseModel this$0) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        float[][][] fArr = new float[1][][];
        int length = data.length;
        float[][] fArr2 = new float[length][];
        for (int i = 0; i < length; i++) {
            fArr2[i] = new float[4];
        }
        fArr[0] = fArr2;
        float[][][] fArr3 = new float[1][][];
        int length2 = data.length;
        float[][] fArr4 = new float[length2][];
        for (int i2 = 0; i2 < length2; i2++) {
            fArr4[i2] = new float[data[0].length];
        }
        fArr3[0] = fArr4;
        int length3 = data.length;
        for (int i3 = 0; i3 < length3; i3++) {
            int length4 = data[i3].length;
            for (int i4 = 0; i4 < length4; i4++) {
                fArr3[0][i3][i4] = data[i3][i4];
            }
        }
        a aVar = this$0.interpreter;
        Intrinsics.checkNotNull(aVar);
        aVar.c(fArr3, fArr);
        int length5 = data.length;
        float[][] fArr5 = new float[length5][];
        for (int i5 = 0; i5 < length5; i5++) {
            fArr5[i5] = new float[4];
        }
        int length6 = fArr[0].length;
        for (int i6 = 0; i6 < length6; i6++) {
            int length7 = fArr[0][0].length;
            for (int i7 = 0; i7 < length7; i7++) {
                fArr5[i6][i7] = fArr[0][i6][i7];
            }
        }
        OnMiClassifierCallBack onMiClassifierCallBack = this$0.mOnMiClassifierCallBack;
        if (onMiClassifierCallBack == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOnMiClassifierCallBack");
            onMiClassifierCallBack = null;
        }
        onMiClassifierCallBack.onResult(fArr5);
    }

    private final void initializeInterpreter() throws IOException {
        if (this.isInitialized) {
            FitnessLogUtils.i(TAG, "isInitialized");
            return;
        }
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        AssetManager assets = context.getAssets();
        Intrinsics.checkNotNull(assets);
        ByteBuffer byteBufferLoadModelFile = loadModelFile(assets, LITE_MODE_NAME);
        new a.C1067a().b(4);
        this.interpreter = new a(byteBufferLoadModelFile);
        this.isInitialized = true;
    }

    private final ByteBuffer loadModelFile(AssetManager assetManager, String filename) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenFd = assetManager.openFd(filename);
        Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "openFd(...)");
        MappedByteBuffer map = new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel().map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength());
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void classify(@NotNull final float[][] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        mExecutor.execute(new Runnable() { // from class: kvf
            @Override // java.lang.Runnable
            public final void run() {
                MiParseModel.classify$lambda$0(data, this);
            }
        });
    }

    public final void close() {
        FitnessLogUtils.i(TAG, "close: isInitialized = " + this.isInitialized);
        if (this.isInitialized) {
            a aVar = this.interpreter;
            if (aVar != null) {
                aVar.close();
            }
            this.interpreter = null;
            this.isInitialized = false;
        }
    }

    public final void initialize(@NotNull Context context, @NotNull OnMiClassifierCallBack onMiClassifierCallBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onMiClassifierCallBack, "onMiClassifierCallBack");
        this.context = context;
        this.mOnMiClassifierCallBack = onMiClassifierCallBack;
        try {
            initializeInterpreter();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
