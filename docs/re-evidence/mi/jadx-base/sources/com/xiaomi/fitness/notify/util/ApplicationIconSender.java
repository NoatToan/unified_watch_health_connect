package com.xiaomi.fitness.notify.util;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.onetrack.api.b;
import defpackage.kq2;
import defpackage.qxg;
import defpackage.s7r;
import defpackage.txg;
import defpackage.uxg;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\b\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/notify/util/ApplicationIconSender;", "", "<init>", "()V", "TAG", "", "ICON_PATH_DIR", "isDebugMode", "", "mIconSendExecutor", "Ljava/util/concurrent/ThreadPoolExecutor;", "trySendAppIcon", "", "did", "packageName", "sendIconFinish", "RejectHandler", "IconSendTask", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApplicationIconSender {

    @NotNull
    private static final String ICON_PATH_DIR = "NotificationAppIcon";

    @NotNull
    private static final String TAG = "ApplicationIconSender";

    @NotNull
    public static final ApplicationIconSender INSTANCE = new ApplicationIconSender();
    private static final boolean isDebugMode = AppUtil.INSTANCE.isDevChannel();

    @NotNull
    private static final ThreadPoolExecutor mIconSendExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingDeque(30), Executors.defaultThreadFactory(), new RejectHandler());

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b/\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u00020\u001f*\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010!J%\u0010$\u001a\u0004\u0018\u00010\u0016*\u00020\u00162\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0011\u0010.\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b-\u0010\u001c¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/notify/util/ApplicationIconSender$IconSendTask;", "Ljava/lang/Runnable;", "", "result", "", "release", "(Z)V", "", "deviceId", "packageName", "prepareSendIcon", "(Ljava/lang/String;Ljava/lang/String;)V", "did", "Luxg;", b.I, "handleIconResponse", "(Ljava/lang/String;Ljava/lang/String;Luxg;)V", "filePath", "", "segmentLength", "sendAppIcon", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/graphics/Bitmap;", "appIcon", "Lkotlin/Pair;", "save2File", "(Landroid/graphics/Bitmap;Luxg;)Lkotlin/Pair;", "getIconPathDir", "()Ljava/lang/String;", "maxSize", "declineQuality", "", "compressQuality", "(Landroid/graphics/Bitmap;II)[B", "targetWidth", "targetHeight", "compressScale", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "run", "()V", "Ljava/lang/String;", "Ljava/util/concurrent/CountDownLatch;", "latch", "Ljava/util/concurrent/CountDownLatch;", "Z", "getTaskName", "taskName", "<init>", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class IconSendTask implements Runnable {

        @NotNull
        private final String deviceId;

        @NotNull
        private CountDownLatch latch;

        @NotNull
        private final String packageName;
        private boolean result;

        public IconSendTask(@NotNull String deviceId, @NotNull String packageName) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            this.deviceId = deviceId;
            this.packageName = packageName;
            this.latch = new CountDownLatch(1);
        }

        private final byte[] compressQuality(Bitmap bitmap, int i, int i2) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i3 = 100;
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            while (byteArrayOutputStream.toByteArray().length > i) {
                try {
                    byteArrayOutputStream.reset();
                    i3 -= i2;
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream);
                } catch (Exception e) {
                    Logger.e(ApplicationIconSender.TAG, "compressQuality(" + i + ") error", e);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            return byteArray;
        }

        public static /* synthetic */ byte[] compressQuality$default(IconSendTask iconSendTask, Bitmap bitmap, int i, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i2 = 10;
            }
            return iconSendTask.compressQuality(bitmap, i, i2);
        }

        private final Bitmap compressScale(Bitmap bitmap, int i, int i2) {
            try {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                Logger.d(ApplicationIconSender.TAG, "compressScale origin:" + bitmap.getByteCount() + " new:" + bitmapCreateScaledBitmap.getByteCount());
                return bitmapCreateScaledBitmap;
            } catch (Exception e) {
                Logger.e(ApplicationIconSender.TAG, "compressScale error ", e);
                return null;
            }
        }

        private final String getIconPathDir() {
            String absolutePath;
            File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(ApplicationIconSender.ICON_PATH_DIR);
            if (externalFilesDir != null && (absolutePath = externalFilesDir.getAbsolutePath()) != null) {
                return absolutePath;
            }
            return ApplicationExtKt.getApplication().getFilesDir().getAbsolutePath() + File.separator + ApplicationIconSender.ICON_PATH_DIR;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleIconResponse(String did, String packageName, uxg response) throws Throwable {
            Logger.i(ApplicationIconSender.TAG, " handleIconResponse " + response.c + " " + response.d);
            if (response.c != 0) {
                release(false);
                return;
            }
            try {
                PackageManager packageManager = ApplicationExtKt.getApplication().getPackageManager();
                int i = response.d;
                Bitmap.Config config = (i == 2 || i == 3 || i == 7 || i == 8) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                Drawable drawableLoadIcon = packageManager.getApplicationInfo(packageName, 0).loadIcon(packageManager);
                Intrinsics.checkNotNullExpressionValue(drawableLoadIcon, "loadIcon(...)");
                Pair<Boolean, String> pairSave2File = save2File(DrawableKt.toBitmap$default(drawableLoadIcon, 0, 0, config, 3, null), response);
                if (pairSave2File.getFirst().booleanValue()) {
                    sendAppIcon(did, packageName, pairSave2File.getSecond(), response.g);
                    return;
                }
                Logger.e(ApplicationIconSender.TAG, "save2File error:" + did + " " + ((Object) pairSave2File.getSecond()));
                release(false);
            } catch (Exception e) {
                Logger.e(ApplicationIconSender.TAG, "$ sendAppIcon error:" + e);
                release(false);
            }
        }

        private final void prepareSendIcon(final String deviceId, final String packageName) {
            s7r s7rVar = new s7r();
            s7rVar.e = 7;
            s7rVar.f = 15;
            txg txgVar = new txg();
            txgVar.c = packageName;
            qxg qxgVar = new qxg();
            qxgVar.y(txgVar);
            s7rVar.a0(qxgVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), deviceId, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.notify.util.ApplicationIconSender$IconSendTask$prepareSendIcon$1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.e("ApplicationIconSender", "prepareSendIcon " + packageName + " failed:" + code);
                    this.this$0.release(false);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) throws Throwable {
                    s7r packet;
                    qxg qxgVarC;
                    uxg uxgVarP;
                    if (result == null || (packet = result.getPacket()) == null || (qxgVarC = packet.C()) == null || (uxgVarP = qxgVarC.p()) == null) {
                        onError(did, type, -1);
                    } else {
                        this.this$0.handleIconResponse(deviceId, packageName, uxgVarP);
                    }
                }
            }, 0, 16, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void release(boolean result) {
            this.result = result;
            Logger.i(ApplicationIconSender.TAG, "release latch count :" + this.latch.getCount());
            this.latch.countDown();
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0080 A[Catch: Exception -> 0x0069, TRY_LEAVE, TryCatch #0 {Exception -> 0x0069, blocks: (B:9:0x004f, B:23:0x0066, B:26:0x006b, B:27:0x0071, B:28:0x0076, B:29:0x007b, B:30:0x0080), top: B:35:0x004f }] */
        private final Pair<Boolean, String> save2File(Bitmap appIcon, uxg response) throws Throwable {
            Boolean boolD;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String iconPathDir = getIconPathDir();
            String str = File.separator;
            String str2 = iconPathDir + str + jCurrentTimeMillis;
            int i = response.e;
            Bitmap bitmapCompressScale = compressScale(appIcon, i, i);
            if (bitmapCompressScale == null) {
                return TuplesKt.to(Boolean.FALSE, str2);
            }
            if (ApplicationIconSender.isDebugMode) {
                kq2.c(bitmapCompressScale, getIconPathDir() + str + jCurrentTimeMillis + ".png");
            }
            try {
                int i2 = response.d;
                if (i2 == 0) {
                    boolD = kq2.d(bitmapCompressScale, str2);
                } else if (i2 == 1) {
                    boolD = kq2.f(bitmapCompressScale, str2);
                } else if (i2 == 2 || i2 == 3) {
                    boolD = kq2.k(bitmapCompressScale, str2);
                } else if (i2 == 4) {
                    boolD = kq2.d(bitmapCompressScale, str2);
                } else if (i2 != 7) {
                    boolD = i2 != 8 ? Boolean.FALSE : kq2.h(bitmapCompressScale, str2, false);
                } else {
                    boolD = kq2.h(bitmapCompressScale, str2, true);
                }
            } catch (Exception e) {
                Logger.e(ApplicationIconSender.TAG, "saveBytes error " + response.d + " ", e);
                boolD = Boolean.FALSE;
            }
            return TuplesKt.to(boolD, str2);
        }

        private final void sendAppIcon(String did, final String packageName, final String filePath, int segmentLength) {
            DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).sendFile(did, 3, 2, filePath, segmentLength, new SyncStateListener() { // from class: com.xiaomi.fitness.notify.util.ApplicationIconSender$IconSendTask$sendAppIcon$1
                @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
                public void onFinish(String did2, int code) {
                    Intrinsics.checkNotNullParameter(did2, "did");
                    boolean zDeleteFile = ApplicationIconSender.isDebugMode ? false : FileUtils.INSTANCE.deleteFile(filePath);
                    Logger.i("ApplicationIconSender", "sendAppIcon " + packageName + " " + filePath + " onFinish " + code + ", delete:" + zDeleteFile);
                    this.release(code == 0);
                }

                @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
                public void onStart(String did2) {
                    Intrinsics.checkNotNullParameter(did2, "did");
                    Logger.i("ApplicationIconSender", "sendAppIcon " + packageName + " " + filePath + " start");
                }

                @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
                public void onSyncing(String did2, int progress) {
                    Intrinsics.checkNotNullParameter(did2, "did");
                    Logger.d("ApplicationIconSender", "sendAppIcon " + packageName + " onSyncing " + progress);
                }
            });
        }

        @NotNull
        public final String getTaskName() {
            return "IconSendTask$" + this.packageName;
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.i(ApplicationIconSender.TAG, getTaskName() + " IconSendTask start");
            prepareSendIcon(this.deviceId, this.packageName);
            if (!this.latch.await(1L, TimeUnit.MINUTES)) {
                Logger.e(ApplicationIconSender.TAG, " IconSendTask timeout!");
                return;
            }
            Logger.i(ApplicationIconSender.TAG, "IconSendTask finished:" + this.result);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/notify/util/ApplicationIconSender$RejectHandler;", "Ljava/util/concurrent/RejectedExecutionHandler;", "<init>", "()V", "rejectedExecution", "", "r", "Ljava/lang/Runnable;", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RejectHandler implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(@Nullable Runnable r2, @Nullable ThreadPoolExecutor executor) {
            Logger.e(ApplicationIconSender.TAG, "task rejected:$ send icon task");
        }
    }

    private ApplicationIconSender() {
    }

    private final void sendIconFinish() {
    }

    public final void trySendAppIcon(@NotNull String did, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (packageName.length() == 0) {
            return;
        }
        Logger.i(TAG, "trySendAppIcon " + packageName);
        mIconSendExecutor.execute(new IconSendTask(did, packageName));
    }
}
