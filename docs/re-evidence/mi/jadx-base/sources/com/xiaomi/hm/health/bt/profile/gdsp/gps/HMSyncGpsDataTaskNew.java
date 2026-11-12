package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import defpackage.dc;
import defpackage.f1;
import defpackage.i7t;
import defpackage.jet;
import defpackage.kc;
import defpackage.mb;
import defpackage.nb;
import defpackage.qd;
import defpackage.t5t;
import defpackage.wb;
import defpackage.xb;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB;\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/HMSyncGpsDataTaskNew;", "Li7t;", "", "", "doWork", "()V", "stopSync", "Ljava/util/Calendar;", "calendar", "Ljava/util/Calendar;", "", "version", "I", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "mCallback", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;", "Lkotlin/Function1;", "Lmb;", "mErrorCodeTrans", "Lkotlin/jvm/functions/Function1;", "Ljet;", "gattPeripheral", "Lqd;", "source", "<init>", "(Ljet;Lqd;Ljava/util/Calendar;ILcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class HMSyncGpsDataTaskNew extends i7t {
    private static final int SYNC_TIME_STEP = 1000;

    @NotNull
    private static final String TAG = "gps.HMSyncGpsDataTask";

    @NotNull
    private final Calendar calendar;

    @NotNull
    private final jet gattPeripheral;

    @NotNull
    private final SyncDataCallback<List<? extends GpsRecord>> mCallback;

    @NotNull
    private final Function1<mb, mb> mErrorCodeTrans;

    @NotNull
    private final kc profile;

    @NotNull
    private final qd source;

    @Nullable
    private wb syncUnit;
    private final int version;

    /* JADX WARN: Multi-variable type inference failed */
    public HMSyncGpsDataTaskNew(@NotNull jet gattPeripheral, @NotNull qd source, @NotNull Calendar calendar, int i, @NotNull SyncDataCallback<? super List<? extends GpsRecord>> mCallback) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(mCallback, "mCallback");
        this.gattPeripheral = gattPeripheral;
        this.source = source;
        this.calendar = calendar;
        this.version = i;
        this.mCallback = mCallback;
        this.profile = xb.f38931a.a(gattPeripheral, i);
        this.mErrorCodeTrans = new Function1<mb, mb>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.HMSyncGpsDataTaskNew$mErrorCodeTrans$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final mb invoke2(@NotNull mb errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                return errorCode;
            }
        };
    }

    @Override // defpackage.i7t
    public void doWork() {
        mb mbVarA;
        HMDeviceError hMDeviceError;
        SportSummary sportSummaryB;
        this.mCallback.onStart();
        if (!this.profile.init()) {
            t5t.m(TAG, "init gps data profile failed!!!");
            this.mCallback.onFinish(new HMDeviceError(2));
            return;
        }
        Object objClone = this.calendar.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar = (Calendar) objClone;
        ArrayList arrayList = new ArrayList();
        t5t.d(TAG, "gps startTime:" + calendar.getTime());
        while (true) {
            dc dcVar = dc.f15358a;
            f1<SportSummary> f1VarA = dcVar.a(calendar, this.source, this.version);
            wb wbVar = new wb(this.profile, f1VarA.getC());
            this.syncUnit = wbVar;
            mbVarA = wbVar.a(f1VarA.getF17276b(), calendar, f1VarA.a(), CollectionsKt__CollectionsKt.emptyList(), this.mErrorCodeTrans);
            mb mbVar = mb.SUCCESS;
            if (mbVarA != mbVar || (sportSummaryB = f1VarA.a().b()) == null) {
                break;
            }
            GpsRecord gpsRecord = new GpsRecord();
            t5t.d(TAG, "gps summary:" + sportSummaryB);
            gpsRecord.setSummary(sportSummaryB);
            f1<SportDetail> f1VarA2 = dcVar.a(calendar, this.source, sportSummaryB, this.version);
            wb wbVar2 = new wb(this.profile, f1VarA2.getC());
            this.syncUnit = wbVar2;
            mbVarA = wbVar2.a(f1VarA2.getF17276b(), calendar, f1VarA2.a(), CollectionsKt__CollectionsKt.emptyList(), this.mErrorCodeTrans);
            if (mbVarA != mbVar) {
                break;
            }
            SportDetail sportDetailB = f1VarA2.a().b();
            StringBuilder sb = new StringBuilder();
            sb.append("gps detail:");
            sb.append(sportDetailB != null ? sportDetailB.toSimpleString() : null);
            t5t.d(TAG, sb.toString());
            if (sportDetailB == null) {
                sportDetailB = new SportDetail();
            }
            gpsRecord.setDetail(sportDetailB);
            arrayList.add(gpsRecord);
            calendar.setTimeInMillis(sportSummaryB.getStartTime() + ((long) 1000));
            t5t.d(TAG, "update gps startTime:" + calendar.getTime());
        }
        this.mCallback.onProgress(new Progress(100, 100));
        this.profile.deInit();
        this.mCallback.onData(arrayList);
        SyncDataCallback<List<? extends GpsRecord>> syncDataCallback = this.mCallback;
        if (mbVarA == null || (hMDeviceError = nb.b(mbVarA)) == null) {
            hMDeviceError = new HMDeviceError(0);
        }
        syncDataCallback.onFinish(hMDeviceError);
    }

    public void stopSync() {
        wb wbVar = this.syncUnit;
        if (wbVar != null) {
            wbVar.b();
        }
    }
}
