package com.xiaomi.fitness.devicesettings.bigdata;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.common.utils.CRCUtil;
import com.xiaomi.fitness.devicesettings.bigdata.NormalFileSave;
import defpackage.hj2;
import defpackage.xc6;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005J\u0006\u0010 \u001a\u00020\u001aJ\u0006\u0010!\u001a\u00020\u001aJ\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\"\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\u0006\u0010%\u001a\u00020\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bigdata/NormalFileSave;", "", "<init>", "()V", "sTag", "", "sDelayTimeout", "", "sHeadLength", "", "sDataStartIndex", "mCurrentCount", "mTotalCount", "mTotalBytes", "mSegments", "", "Lcom/xiaomi/fitness/devicesettings/bigdata/Segment;", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "mHandler$delegate", "Lkotlin/Lazy;", "timeoutRunnable", "Ljava/lang/Runnable;", "receiverData", "", "data", "", "byteBuffer", "Ljava/nio/ByteBuffer;", "dir", "postDelayHandler", "removeDelayHandler", "merge", "saveFile", "id", "reset", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NormalFileSave {
    private static int mCurrentCount = 0;
    private static int mTotalBytes = 0;
    private static int mTotalCount = 0;
    private static final int sDataStartIndex = 6;
    public static final long sDelayTimeout = 15000;
    private static final int sHeadLength = 5;

    @NotNull
    public static final String sTag = "NormalFileSave";

    @NotNull
    public static final NormalFileSave INSTANCE = new NormalFileSave();

    @NotNull
    private static final List<Segment> mSegments = new ArrayList();

    /* JADX INFO: renamed from: mHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: iwg
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NormalFileSave.mHandler_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Runnable timeoutRunnable = new Runnable() { // from class: jwg
        @Override // java.lang.Runnable
        public final void run() {
            NormalFileSave.timeoutRunnable$lambda$1();
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bigdata.NormalFileSave$saveFile$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bigdata.NormalFileSave$saveFile$1", f = "NormalFileSave.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $data;
        final /* synthetic */ String $dir;
        final /* synthetic */ Ref.ObjectRef<String> $newId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Ref.ObjectRef<String> objectRef, byte[] bArr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$dir = str;
            this.$newId = objectRef;
            this.$data = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$dir, this.$newId, this.$data, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            FileOutputStream fileOutputStream;
            Throwable th;
            Exception e;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(this.$dir);
            if (externalFilesDir != null && !externalFilesDir.exists()) {
                externalFilesDir.mkdirs();
            }
            File file = new File(externalFilesDir, this.$newId.element);
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        try {
                            fileOutputStream.write(this.$data);
                            xc6.d("saveFile success fileSize:" + file.length() + " " + this.$data.length);
                            NormalFileSaveKt.sendUploadResult(this.$newId.element, true);
                            fileOutputStream.close();
                        } catch (Exception e2) {
                            e = e2;
                            NormalFileSaveKt.sendUploadResult(this.$newId.element, false);
                            Logger.i(NormalFileSave.sTag, "saveFile FileNotFoundException");
                            e.printStackTrace();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            } catch (Exception e5) {
                fileOutputStream = null;
                e = e5;
            } catch (Throwable th3) {
                fileOutputStream = null;
                th = th3;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private NormalFileSave() {
    }

    private final Handler getMHandler() {
        return (Handler) mHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mHandler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    private final void merge(String dir) {
        String str;
        Logger.i(sTag, "merge");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(mTotalBytes);
        for (Segment segment : mSegments) {
            Intrinsics.checkNotNull(byteBufferAllocate);
            segment.fillBuffer(byteBufferAllocate);
        }
        int i = mTotalBytes;
        byte[] bArr = new byte[i - 4];
        byteBufferAllocate.clear();
        byteBufferAllocate.get(bArr);
        byte[] bArr2 = new byte[4];
        byteBufferAllocate.get(bArr2);
        String str2 = null;
        if (!ByteUtil.equals$default(bArr2, CRCUtil.CRC32(bArr), 0, 4, null)) {
            Logger.i(sTag, "check crc32 failed!!! ");
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str3 = String.format("received %d bytes", Arrays.copyOf(new Object[]{Integer.valueOf(mTotalBytes)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        Logger.i(sTag, str3);
        byteBufferAllocate.clear();
        int i2 = byteBufferAllocate.get();
        byte[] bArr3 = new byte[i2];
        byteBufferAllocate.get(bArr3);
        Logger.i(sTag, "idLength=" + i2 + ",id byte[]**" + hj2.a(bArr3));
        try {
            Charset charsetDefaultCharset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
            str = new String(bArr3, charsetDefaultCharset);
            try {
                Logger.i(sTag, "id=" + str);
            } catch (UnsupportedEncodingException e) {
                e = e;
                str2 = str;
                Logger.i(sTag, "UnsupportedEncodingException");
                e.printStackTrace();
                str = str2;
            }
        } catch (UnsupportedEncodingException e2) {
            e = e2;
        }
        byte[] bArr4 = new byte[(i - 10) - i2];
        byteBufferAllocate.get(new byte[5]);
        byteBufferAllocate.get(bArr4);
        saveFile(str, bArr4, dir);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void saveFile(String id, byte[] data, String dir) {
        T t;
        Logger.i(sTag, "saveFile id==" + id + "**dir=" + dir);
        if (id == null) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (StringsKt__StringsKt.contains$default((CharSequence) id, (CharSequence) "/", false, 2, (Object) null)) {
            t = id;
            String strSubstring = id.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) id, "/", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            t = strSubstring;
        }
        t = id;
        objectRef.element = t;
        xc6.d("saveFile newId:" + t);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(dir, objectRef, data, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timeoutRunnable$lambda$1() {
        xc6.d("NormalFileSave receiverData timeoutRunnable");
        INSTANCE.reset();
        NormalFileSaveKt.sendCancelReceiver();
    }

    public final void postDelayHandler() {
        Handler mHandler2 = getMHandler();
        Runnable runnable = timeoutRunnable;
        mHandler2.removeCallbacks(runnable);
        getMHandler().postDelayed(runnable, 15000L);
    }

    public final void receiverData(@NotNull byte[] data, @NotNull ByteBuffer byteBuffer, @NotNull String dir) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(dir, "dir");
        postDelayHandler();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        if (s2 > s) {
            Logger.e(sTag, "receiverLogData exception data!!! sequence = " + ((int) s2) + ", total = " + ((int) s) + "dir is" + dir);
            return;
        }
        int i = mTotalCount;
        if (i == 0) {
            mTotalCount = s;
        } else if (i != s) {
            Logger.e(sTag, "total not match!!!");
            reset();
            return;
        }
        int i2 = mCurrentCount;
        if (s2 != i2 + 1) {
            Logger.e(sTag, "sequence not match!!! " + ((int) s2) + ", current count: " + i2);
            reset();
            return;
        }
        mCurrentCount = s2;
        Segment segment = new Segment(s2, data, 6);
        mTotalBytes += segment.getDataLength();
        int dataLength = segment.getDataLength();
        xc6.d("NormalFileSave receiverData acceptLength:" + dataLength);
        NormalFileSaveKt.sendProgress(dataLength);
        mSegments.add(segment);
        if (s == s2) {
            merge(dir);
            reset();
        }
    }

    public final void removeDelayHandler() {
        getMHandler().removeCallbacks(timeoutRunnable);
    }

    public final void reset() {
        mCurrentCount = 0;
        mTotalCount = 0;
        mTotalBytes = 0;
        mSegments.clear();
        removeDelayHandler();
    }
}
