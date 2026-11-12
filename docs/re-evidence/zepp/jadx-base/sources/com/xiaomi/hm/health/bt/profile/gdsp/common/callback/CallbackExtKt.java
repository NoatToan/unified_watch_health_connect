package com.xiaomi.hm.health.bt.profile.gdsp.common.callback;

import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMRawDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.RawData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.gdsp.common.GDSPErrorCodeExtKt;
import com.xiaomi.hm.health.bt.profile.gdsp.common.data.GdspResultData;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.HMHrData;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.IHMHrDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.IHMPressureDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmGdspRawData;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmRawDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u0007\u001a\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\u0002*\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\n\u001a\u0016\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0002*\u00020\f\u001a\u0016\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0002*\u00020\u000f\u001a(\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\t\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\t\u001a\u0016\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00100\u0002*\u00020\u0013\u001a\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00160\u0002\u001a\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00100\u0018*\b\u0012\u0004\u0012\u00020\u00160\u0002¨\u0006\u001b"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmRawDataCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/callback/IGdspSyncCallback;", "", "toGdspCallback", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmGdspRawData;", "", "type", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "Ljava/io/File;", "file", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/IHMActivityDataCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityData;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/IHMHrDataCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/HMHrData;", "toGdspListCallback", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/IHMPressureDataCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "toGdspCallack", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/GdspResultData;", "typedCallback", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "toGpsCallback", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class CallbackExtKt {
    @NotNull
    public static final IGdspSyncCallback<List<HMPressureData>> toGdspCallack(@NotNull final IHMPressureDataCallback iHMPressureDataCallback) {
        return new IGdspSyncCallback<List<? extends HMPressureData>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.callback.CallbackExtKt.toGdspCallack.1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final ArrayList<HMPressureData> resultData = new ArrayList<>();

            @NotNull
            public final ArrayList<HMPressureData> getResultData() {
                return this.resultData;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onAllRawData(@NotNull List<RawData> data) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onData(@NotNull List<? extends List<? extends HMPressureData>> data) {
                Iterator<T> it2 = data.iterator();
                while (it2.hasNext()) {
                    getResultData().addAll((List) it2.next());
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onDataHeader(@NotNull DataHeader header) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onProgress(long current, long total) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onResult(@NotNull GDSPErrorCode code) {
                iHMPressureDataCallback.onPressureData(this.resultData);
                iHMPressureDataCallback.onPressureStop(GDSPErrorCodeExtKt.isSyncSuccess(code));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onStart() {
                iHMPressureDataCallback.onPressureStart();
            }
        };
    }

    @NotNull
    public static final <T> IGdspSyncCallback<byte[]> toGdspCallback(@NotNull final HmRawDataCallback<T> hmRawDataCallback) {
        return new IGdspSyncCallback<byte[]>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.callback.CallbackExtKt.toGdspCallback.1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @Nullable
            private DataHeader resultHeader;

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onAllRawData(@NotNull List<RawData> data) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onData(@NotNull List<? extends byte[]> data) {
                HmRawDataCallback<T> hmRawDataCallback2 = hmRawDataCallback;
                for (byte[] bArr : data) {
                    DataHeader dataHeader = this.resultHeader;
                    if (dataHeader != null) {
                        hmRawDataCallback2.onData(new HmGdspRawData(hmRawDataCallback2.getDataType(), dataHeader.calendar, bArr, dataHeader.expansionData));
                    }
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onDataHeader(@NotNull DataHeader header) {
                this.resultHeader = header;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onProgress(long current, long total) {
                hmRawDataCallback.onProgress(new Progress((int) total, (int) current));
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onResult(@NotNull GDSPErrorCode code) {
                hmRawDataCallback.onFinish(GDSPErrorCodeExtKt.isSyncSuccess(code));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onStart() {
                hmRawDataCallback.onStart();
            }
        };
    }

    @NotNull
    public static final <T> IGdspSyncCallback<List<T>> toGdspListCallback(@NotNull final IHMDataCallback<List<T>> iHMDataCallback) {
        return new IGdspSyncCallback<List<? extends T>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.callback.CallbackExtKt.toGdspListCallback.1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final ArrayList<T> resultData = new ArrayList<>();

            @NotNull
            public final ArrayList<T> getResultData() {
                return this.resultData;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onAllRawData(@NotNull List<RawData> data) {
                if (this instanceof IHMRawDataCallback) {
                    ((IHMRawDataCallback) iHMDataCallback).onRawData(data);
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onData(@NotNull List<? extends List<? extends T>> data) {
                Iterator<T> it2 = data.iterator();
                while (it2.hasNext()) {
                    getResultData().addAll((List) it2.next());
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onDataHeader(@NotNull DataHeader header) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onProgress(long current, long total) {
                int i = (int) total;
                iHMDataCallback.onProgress(new Progress(i, i));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onResult(@NotNull GDSPErrorCode code) {
                iHMDataCallback.onStop(this.resultData, GDSPErrorCodeExtKt.toDeviceError(code));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onStart() {
                iHMDataCallback.onStart();
            }
        };
    }

    @NotNull
    public static final SyncDataCallback<List<? extends GpsRecord>> toGpsCallback(@NotNull final IGdspSyncCallback<GdspResultData> iGdspSyncCallback) {
        return new SyncDataCallback<List<? extends GpsRecord>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.callback.CallbackExtKt.toGpsCallback.1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
            public void onFinish(@NotNull HMDeviceError error) {
                iGdspSyncCallback.onResult(GDSPErrorCodeExtKt.toGdspError(error));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
            public void onProgress(@NotNull Progress progress) {
                iGdspSyncCallback.onProgress(progress.progress, progress.total);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
            public void onStart() {
                iGdspSyncCallback.onStart();
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
            public void onData(@Nullable List<? extends GpsRecord> data) {
                if (data == null) {
                    return;
                }
                IGdspSyncCallback<GdspResultData> iGdspSyncCallback2 = iGdspSyncCallback;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
                Iterator<T> it2 = data.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new GdspResultData((GpsRecord) it2.next()));
                }
                iGdspSyncCallback2.onData(arrayList);
            }
        };
    }

    @NotNull
    public static final <T> IGdspSyncCallback<T> typedCallback(@NotNull final IGdspSyncCallback<GdspResultData> iGdspSyncCallback) {
        return new IGdspSyncCallback<T>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.callback.CallbackExtKt.typedCallback.1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onAllRawData(@NotNull List<RawData> data) {
                iGdspSyncCallback.onAllRawData(data);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onData(@NotNull List<? extends T> data) {
                IGdspSyncCallback<GdspResultData> iGdspSyncCallback2 = iGdspSyncCallback;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
                for (T t : data) {
                    Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.Any");
                    arrayList.add(new GdspResultData(t));
                }
                iGdspSyncCallback2.onData(arrayList);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onDataHeader(@NotNull DataHeader header) {
                iGdspSyncCallback.onDataHeader(header);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onProgress(long current, long total) {
                iGdspSyncCallback.onProgress(current, total);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onResult(@NotNull GDSPErrorCode code) {
                iGdspSyncCallback.onResult(code);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onStart() {
                iGdspSyncCallback.onStart();
            }
        };
    }

    @NotNull
    public static final IGdspSyncCallback<byte[]> toGdspCallback(@NotNull final HMCallback<HmGdspRawData> hMCallback, final int i) {
        return new IGdspSyncCallback<byte[]>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.callback.CallbackExtKt.toGdspCallback.2

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @Nullable
            private DataHeader resultHeader;

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onAllRawData(@NotNull List<RawData> data) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onData(@NotNull List<? extends byte[]> data) {
                HMCallback<HmGdspRawData> hMCallback2 = hMCallback;
                int i2 = i;
                for (byte[] bArr : data) {
                    DataHeader dataHeader = this.resultHeader;
                    if (dataHeader != null) {
                        hMCallback2.onData(new HmGdspRawData(i2, dataHeader.calendar, bArr, dataHeader.expansionData));
                    }
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onDataHeader(@NotNull DataHeader header) {
                this.resultHeader = header;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onProgress(long current, long total) {
                hMCallback.onProgress(new Progress((int) total, (int) current));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onResult(@NotNull GDSPErrorCode code) {
                hMCallback.onFinish(GDSPErrorCodeExtKt.isSyncSuccess(code));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onStart() {
                hMCallback.onStart();
            }
        };
    }

    @NotNull
    public static final IGdspSyncCallback<File> toGdspCallback(@NotNull IHMDataCallback<File> iHMDataCallback, @NotNull File file) {
        return new IGdspSyncCallback<File>(iHMDataCallback, file) { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.callback.CallbackExtKt.toGdspCallback.3

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean useRawData;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private long startTime;
            public final /* synthetic */ IHMDataCallback<File> c;
            public final /* synthetic */ File d;

            {
                this.c = iHMDataCallback;
                this.d = file;
                this.useRawData = iHMDataCallback instanceof IHMRawDataCallback;
            }

            public final long getStartTime() {
                return this.startTime;
            }

            public final boolean getUseRawData() {
                return this.useRawData;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onAllRawData(@NotNull List<RawData> data) {
                if (this.useRawData) {
                    ((IHMRawDataCallback) this.c).onRawData(data);
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onData(@NotNull List<? extends File> data) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onDataHeader(@NotNull DataHeader header) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onProgress(long current, long total) {
                Progress progress = new Progress((int) total, (int) current);
                this.c.onProgress(progress);
                if (!(current == total)) {
                    progress = null;
                }
                if (progress == null) {
                    return;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Debug.fi("HMSyncLogTask", String.format(Locale.getDefault(), "LOG transfer rate: %.1f KBps", Arrays.copyOf(new Object[]{Float.valueOf(progress.total / (System.currentTimeMillis() - getStartTime()))}, 1)));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onResult(@NotNull GDSPErrorCode code) {
                this.c.onStop(this.d, GDSPErrorCodeExtKt.toDeviceError(code));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onStart() {
                this.c.onStart();
                this.startTime = System.currentTimeMillis();
            }

            public final void setStartTime(long j) {
                this.startTime = j;
            }
        };
    }

    @NotNull
    public static final IGdspSyncCallback<ActivityDataFragment<ActivityData>> toGdspCallback(@NotNull final IHMActivityDataCallback iHMActivityDataCallback) {
        return new IGdspSyncCallback<ActivityDataFragment<ActivityData>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.callback.CallbackExtKt.toGdspCallback.4
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onAllRawData(@NotNull List<RawData> data) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onData(@NotNull List<? extends ActivityDataFragment<ActivityData>> data) {
                iHMActivityDataCallback.onSyncStop(data);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onDataHeader(@NotNull DataHeader header) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onProgress(long current, long total) {
                iHMActivityDataCallback.onSyncProgress(new Progress((int) total, (int) current));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onResult(@NotNull GDSPErrorCode code) {
                IHMActivityDataCallback iHMActivityDataCallback2 = iHMActivityDataCallback;
                HMDeviceSyncDataError hMDeviceSyncDataError = new HMDeviceSyncDataError(GDSPErrorCodeExtKt.toDeviceError(code).getError());
                hMDeviceSyncDataError.setLosePackageHappened(code == GDSPErrorCode.PACKET_INDEX_ERROR);
                iHMActivityDataCallback2.onSyncFinish(hMDeviceSyncDataError);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onStart() {
                iHMActivityDataCallback.onSyncStart();
            }
        };
    }

    @NotNull
    public static final IGdspSyncCallback<List<HMHrData>> toGdspCallback(@NotNull final IHMHrDataCallback iHMHrDataCallback) {
        return new IGdspSyncCallback<List<? extends HMHrData>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.callback.CallbackExtKt.toGdspCallback.5

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final ArrayList<HMHrData> resultData = new ArrayList<>();

            @NotNull
            public final ArrayList<HMHrData> getResultData() {
                return this.resultData;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onAllRawData(@NotNull List<RawData> data) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onData(@NotNull List<? extends List<? extends HMHrData>> data) {
                Iterator<T> it2 = data.iterator();
                while (it2.hasNext()) {
                    getResultData().addAll((List) it2.next());
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onDataHeader(@NotNull DataHeader header) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onProgress(long current, long total) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onResult(@NotNull GDSPErrorCode code) {
                if (code == GDSPErrorCode.SUCCESS) {
                    iHMHrDataCallback.onHrData(this.resultData);
                }
                iHMHrDataCallback.onHrStop(GDSPErrorCodeExtKt.isSyncSuccess(code));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onStart() {
                iHMHrDataCallback.onHrStart();
            }
        };
    }

    @NotNull
    public static final <T> IGdspSyncCallback<T> toGdspCallback(@NotNull final IHMDataCallback<List<T>> iHMDataCallback) {
        return new IGdspSyncCallback<T>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.callback.CallbackExtKt.toGdspCallback.6

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final ArrayList<T> resultData = new ArrayList<>();

            @NotNull
            public final ArrayList<T> getResultData() {
                return this.resultData;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onAllRawData(@NotNull List<RawData> data) {
                if (this instanceof IHMRawDataCallback) {
                    ((IHMRawDataCallback) iHMDataCallback).onRawData(data);
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onData(@NotNull List<? extends T> data) {
                this.resultData.addAll(data);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onDataHeader(@NotNull DataHeader header) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onProgress(long current, long total) {
                int i = (int) total;
                iHMDataCallback.onProgress(new Progress(i, i));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onResult(@NotNull GDSPErrorCode code) {
                iHMDataCallback.onStop(this.resultData, GDSPErrorCodeExtKt.toDeviceError(code));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onStart() {
                iHMDataCallback.onStart();
            }
        };
    }
}
