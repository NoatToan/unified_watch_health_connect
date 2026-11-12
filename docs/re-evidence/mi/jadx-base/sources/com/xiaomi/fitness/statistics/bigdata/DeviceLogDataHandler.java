package com.xiaomi.fitness.statistics.bigdata;

import android.content.Intent;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.common.utils.CRCUtil;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.aje;
import defpackage.hj2;
import defpackage.s7r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b$\u0010\u0011J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u001e\u0010\"\u001a\f\u0012\b\u0012\u00060!R\u00020\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/statistics/bigdata/DeviceLogDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "data", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "dir", "", "receiverLogData", "([BLjava/nio/ByteBuffer;Ljava/lang/String;)V", "merge", "(Ljava/lang/String;)V", "id", "saveFile", "(Ljava/lang/String;[BLjava/lang/String;)V", "reset", "()V", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "handleData", "(Ljava/lang/String;I[B)Z", "mCurrentCount", "I", "mTotalCount", "mTotalBytes", "", "Lcom/xiaomi/fitness/statistics/bigdata/DeviceLogDataHandler$Segment;", "mSegments", "Ljava/util/List;", "<init>", "Segment", "statistics_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceLogDataHandler extends DataHandlerWrapper {
    private int mCurrentCount;

    @NotNull
    private final List<Segment> mSegments = new ArrayList();
    private int mTotalBytes;
    private int mTotalCount;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/statistics/bigdata/DeviceLogDataHandler$Segment;", "", "sequence", "", "data", "", StatConstants.PARAM_START, "<init>", "(Lcom/xiaomi/fitness/statistics/bigdata/DeviceLogDataHandler;I[BI)V", "getSequence", "()I", "getData", "()[B", "getStart", "dataLength", "getDataLength", "fillBuffer", "", "buffer", "Ljava/nio/ByteBuffer;", "statistics_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Segment {

        @NotNull
        private final byte[] data;
        private final int sequence;
        private final int start;
        final /* synthetic */ DeviceLogDataHandler this$0;

        public Segment(DeviceLogDataHandler deviceLogDataHandler, @NotNull int i, byte[] data, int i2) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.this$0 = deviceLogDataHandler;
            this.sequence = i;
            this.data = data;
            this.start = i2;
        }

        public final void fillBuffer(@NotNull ByteBuffer buffer) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            buffer.put(this.data, this.start, getDataLength());
        }

        @NotNull
        public final byte[] getData() {
            return this.data;
        }

        public final int getDataLength() {
            return this.data.length - this.start;
        }

        public final int getSequence() {
            return this.sequence;
        }

        public final int getStart() {
            return this.start;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.statistics.bigdata.DeviceLogDataHandler$saveFile$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.statistics.bigdata.DeviceLogDataHandler$saveFile$1", f = "DeviceLogDataHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $data;
        final /* synthetic */ String $dir;
        final /* synthetic */ String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, byte[] bArr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$dir = str;
            this.$id = str2;
            this.$data = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$dir, this.$id, this.$data, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(this.$dir);
            if (externalFilesDir != null && !externalFilesDir.exists() && externalFilesDir != null) {
                Boxing.boxBoolean(externalFilesDir.mkdir());
            }
            File file = new File(externalFilesDir, StringsKt__StringsJVMKt.replace$default(this.$id, "/", RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR, false, 4, (Object) null));
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            fileOutputStream2.write(this.$data);
                            fileOutputStream2.close();
                        } catch (FileNotFoundException e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                            Logger.i("DeviceLogDataHandler", "saveFile FileNotFoundException");
                            e.printStackTrace();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return Unit.INSTANCE;
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            Logger.i("DeviceLogDataHandler", "saveFile IOException");
                            e.printStackTrace();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
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
                } catch (FileNotFoundException e5) {
                    e = e5;
                } catch (IOException e6) {
                    e = e6;
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void merge(String dir) {
        String str;
        Logger.i("DeviceLogDataHandler", "merge");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.mTotalBytes);
        for (Segment segment : this.mSegments) {
            Intrinsics.checkNotNull(byteBufferAllocate);
            segment.fillBuffer(byteBufferAllocate);
        }
        int i = this.mTotalBytes;
        byte[] bArr = new byte[i - 4];
        byteBufferAllocate.clear();
        byteBufferAllocate.get(bArr);
        byte[] bArr2 = new byte[4];
        byteBufferAllocate.get(bArr2);
        String str2 = null;
        if (!ByteUtil.equals$default(bArr2, CRCUtil.CRC32(bArr), 0, 4, null)) {
            Logger.i("DeviceLogDataHandler", "check crc32 failed!!! ");
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str3 = String.format("received %d bytes", Arrays.copyOf(new Object[]{Integer.valueOf(this.mTotalBytes)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        Logger.i("DeviceLogDataHandler", str3);
        byteBufferAllocate.clear();
        int i2 = byteBufferAllocate.get();
        byte[] bArr3 = new byte[i2];
        byteBufferAllocate.get(bArr3);
        Logger.i("DeviceLogDataHandler", "idLength=" + i2 + ",id byte[]**" + hj2.a(bArr3));
        try {
            Charset charsetDefaultCharset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
            str = new String(bArr3, charsetDefaultCharset);
            try {
                Logger.i("DeviceLogDataHandler", "id=" + str);
            } catch (UnsupportedEncodingException e) {
                e = e;
                str2 = str;
                Logger.i("DeviceLogDataHandler", "UnsupportedEncodingException");
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

    private final void receiverLogData(byte[] data, ByteBuffer byteBuffer, String dir) {
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        if (AppUtil.INSTANCE.isDevChannel() && s != 0) {
            Intent intent = new Intent("com.mi.health.test.progress");
            intent.setPackage(AppUtil.getApp().getPackageName());
            intent.putExtra("sProgress", (int) (((((double) s2) * 1.0d) / ((double) s)) * ((double) 100)));
            aje.b(AppUtil.getApp()).d(intent);
        }
        if (s2 > s) {
            Logger.e("DeviceLogDataHandler", "receiverLogData exception data!!! sequence = " + ((int) s2) + ", total = " + ((int) s) + "dir is" + dir);
            return;
        }
        int i = this.mTotalCount;
        if (i == 0) {
            this.mTotalCount = s;
        } else if (i != s) {
            Logger.e("DeviceLogDataHandler", "total not match!!!");
            reset();
            return;
        }
        int i2 = this.mCurrentCount;
        if (s2 != i2 + 1) {
            Logger.e("DeviceLogDataHandler", "sequence not match!!! " + ((int) s2) + ", current count: " + i2);
            reset();
            return;
        }
        this.mCurrentCount = s2;
        Segment segment = new Segment(this, s2, data, 6);
        this.mTotalBytes += segment.getDataLength();
        this.mSegments.add(segment);
        if (s == s2) {
            merge(dir);
            reset();
        }
    }

    private final void reset() {
        this.mCurrentCount = 0;
        this.mTotalCount = 0;
        this.mTotalBytes = 0;
        this.mSegments.clear();
    }

    private final void saveFile(String id, byte[] data, String dir) {
        Logger.i("DeviceLogDataHandler", "saveFile id==" + id + "**dir=" + dir);
        if (id == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(dir, id, data, null), 3, null);
    }

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handleData(@NotNull String did, int type, @Nullable byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (data == null) {
            return false;
        }
        if (type == 103 || type == 104) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
            Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "order(...)");
            if (byteBufferOrder.get() == 0) {
                int i = byteBufferOrder.get() & 255;
                Logger.d("DeviceLogDataHandler", "receiverLogData handleData" + i);
                if (i == 129) {
                    WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                    receiverLogData(data, byteBufferOrder, "/log/devicelog/" + did + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + (wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null));
                    return true;
                }
                if (i == 130) {
                    WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                    receiverLogData(data, byteBufferOrder, "onetrack/" + did + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + (wearableDeviceModel2 != null ? DeviceModelExtKt.getModel(wearableDeviceModel2) : null));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (packet != null && type == 2 && packet.f == 81 && (packet.E().D().c == 1 || packet.E().D().c == 3)) {
            Logger.i("DeviceLogDataHandler", "receiverLogData reportDataResult status is " + packet.E().D().d);
            Logger.i("LogWork", "receiverLogData reportDataResult status is " + packet.E().D().d);
            int i = packet.E().D().d;
            if (i == 0) {
                Logger.e("DeviceLogDataHandler", "notifyListenerBleLogLoadProgressChanged success");
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).notifyListenerBleLogLoadProgressChanged(true);
                return true;
            }
            if (i == 1 || i == 2 || i == 10) {
                Logger.i("DeviceLogDataHandler", "receiverLogData code is " + i);
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).notifyListenerBleLogLoadProgressChanged(false);
                return true;
            }
        }
        return false;
    }
}
