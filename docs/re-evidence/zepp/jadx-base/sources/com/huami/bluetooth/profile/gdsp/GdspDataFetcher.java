package com.huami.bluetooth.profile.gdsp;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.characteristic.DataCallback;
import com.huami.bluetooth.profile.data.DataParser;
import com.huami.bluetooth.profile.data.SyncDataCallback;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPType;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002:\u0002\f\bB3\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J$\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\b@\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/bluetooth/profile/gdsp/GdspDataFetcher;", ExifInterface.GPS_DIRECTION_TRUE, "", "Ljava/util/Calendar;", "calendar", "Lcom/xiaomi/hm/health/bt/profile/gdsp/HMGDSPType;", "type", "", "b", "Lkotlin/Function1;", "", "fetchSize", "a", "start", "Lcom/huami/bluetooth/profile/gdsp/GdspControl;", "Lcom/huami/bluetooth/profile/gdsp/GdspControl;", SessionDescription.n, "Lcom/huami/bluetooth/profile/gdsp/GdspData;", "Lcom/huami/bluetooth/profile/gdsp/GdspData;", "data", "Lcom/huami/bluetooth/profile/data/DataParser;", "c", "Lcom/huami/bluetooth/profile/data/DataParser;", "parser", "Lcom/huami/bluetooth/profile/data/SyncDataCallback;", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/data/SyncDataCallback;", "callback", "<init>", "(Lcom/huami/bluetooth/profile/gdsp/GdspControl;Lcom/huami/bluetooth/profile/gdsp/GdspData;Lcom/huami/bluetooth/profile/data/DataParser;Lcom/huami/bluetooth/profile/data/SyncDataCallback;)V", "e", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspDataFetcher<T> {

    @Deprecated
    @NotNull
    public static final String TAG = "GDSPDataFetcher";

    @NotNull
    private static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GdspControl control;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final GdspData data;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DataParser<T> parser;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final SyncDataCallback<T> callback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/bluetooth/profile/gdsp/GdspDataFetcher$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\f"}, d2 = {"com/huami/bluetooth/profile/gdsp/GdspDataFetcher$b", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/xiaomi/hm/health/bt/error/HMDeviceError;", "a", "Lcom/xiaomi/hm/health/bt/error/HMDeviceError;", "()Lcom/xiaomi/hm/health/bt/error/HMDeviceError;", "error", "", "msg", "<init>", "(Lcom/xiaomi/hm/health/bt/error/HMDeviceError;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final HMDeviceError error;

        public b(@NotNull HMDeviceError hMDeviceError, @NotNull String str) {
            super(str);
            this.error = hMDeviceError;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final HMDeviceError getError() {
            return this.error;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000 \u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "result", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ AtomicBoolean a;
        public final /* synthetic */ CountDownLatch b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            super(1);
            this.a = atomicBoolean;
            this.b = countDownLatch;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.a.set(z);
            this.b.countDown();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000 \u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Long, Unit> {
        public final /* synthetic */ GdspDataFetcher<T> a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(GdspDataFetcher<? super T> gdspDataFetcher, long j) {
            super(1);
            this.a = gdspDataFetcher;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            ((GdspDataFetcher) this.a).callback.onProgress(new Progress((int) this.b, (int) j));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000 \u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "msg", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ HMGDSPType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMGDSPType hMGDSPType) {
            super(1);
            this.a = hMGDSPType;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable String str) {
            if (str != null) {
                Debug.fi(GdspDataFetcher.TAG, str);
            }
            Debug.fi(GdspDataFetcher.TAG, "<<<<<<<< Stop fetch " + this.a + " data!");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GdspDataFetcher(@NotNull GdspControl gdspControl, @NotNull GdspData gdspData, @NotNull DataParser<? extends T> dataParser, @NotNull SyncDataCallback<? super T> syncDataCallback) {
        this.control = gdspControl;
        this.data = gdspData;
        this.parser = dataParser;
        this.callback = syncDataCallback;
    }

    private final long a(final HMGDSPType type, final Function1<? super Long, Unit> fetchSize) throws InterruptedException, b {
        final Ref.LongRef longRef = new Ref.LongRef();
        final Ref.IntRef intRef = new Ref.IntRef();
        if (!this.data.registerCallback(new DataCallback() { // from class: com.huami.bluetooth.profile.gdsp.GdspDataFetcher$fetchData$dataCallback$1
            @Override // com.huami.bluetooth.profile.characteristic.DataCallback
            public void onReceived(@NotNull byte[] data) {
                int i = data[0] & 255;
                byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(data, 1, data.length);
                Debug.fi(GdspDataFetcher.TAG, "On fetch " + type + " data, index: " + i + " [size: " + bArrCopyOfRange.length + "]!");
                int i2 = intRef.element;
                if (i2 != 0 && i2 + 1 != i) {
                    Debug.fi(GdspDataFetcher.TAG, "Miss data (" + intRef.element + " ~ " + i + ")!");
                }
                longRef.element += (long) bArrCopyOfRange.length;
                intRef.element = i;
                if (((GdspDataFetcher) this).parser.isMultiPacket()) {
                    ((GdspDataFetcher) this).parser.append(bArrCopyOfRange);
                } else {
                    Object obj = ((GdspDataFetcher) this).parser.parse(bArrCopyOfRange);
                    if (obj != null) {
                        ((GdspDataFetcher) this).callback.onReceived(obj);
                    }
                }
                fetchSize.invoke(Long.valueOf(longRef.element));
            }
        })) {
            throw new b(new HMDeviceError(2), "Register data callback failed!");
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        if (!this.control.startTransfer(new c(atomicBoolean, countDownLatch))) {
            this.data.unregisterCallback();
            throw new b(new HMDeviceError(2), "Start transfer failed!");
        }
        countDownLatch.await();
        this.data.unregisterCallback();
        if (!atomicBoolean.get()) {
            throw new b(new HMDeviceError(2), "Transfer failed!");
        }
        if (!this.control.stopTransfer()) {
            Debug.fi(TAG, "Stop transfer failed!");
        }
        return longRef.element;
    }

    private final long b(Calendar calendar, HMGDSPType type) throws b {
        DataHeader dataHeader = this.control.getDataHeader(calendar, type);
        if (dataHeader != null) {
            return dataHeader.size;
        }
        throw new b(new HMDeviceError(2), "Get data header failed!");
    }

    public final void start(@NotNull Calendar calendar, @NotNull HMGDSPType type) throws InterruptedException {
        T t;
        Debug.fi(TAG, ">>>>>>>> Start fetch " + type + " data!");
        e eVar = new e(type);
        this.callback.onStart();
        try {
            long jB = b(calendar, type);
            if (jB == 0) {
                eVar.invoke("No data to fetch!");
                this.callback.onCompleted();
                return;
            }
            long jA = a(type, new d(this, jB));
            if (jB != jA) {
                throw new b(new HMDeviceError(1), "Fetch " + type + " data miss, totalSize: " + jB + ", fetchedSize: " + jA);
            }
            if (this.parser.isMultiPacket() && (t = this.parser.get()) != null) {
                this.callback.onReceived(t);
            }
            eVar.invoke("Fetch " + type + " data successfully!");
            this.callback.onCompleted();
        } catch (b e2) {
            eVar.invoke(e2.getMessage());
            this.callback.onError(e2.getError());
        }
    }
}
