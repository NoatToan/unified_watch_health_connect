package com.huami.ecg.sync.mili;

import com.huami.ecg.EcgDataRepo;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.db.entity.EcgTag;
import com.huami.ecg.sync.mili.device.EcgRawDataCallback;
import com.huami.ecg.sync.mili.device.MiliDeviceEcgSync;
import com.huami.ecg.sync.mili.device.OnSyncData;
import com.huami.ecg.sync.mili.model.EcgSyncInfo;
import com.huami.ecg.sync.mili.parser.EcgParser;
import com.huami.tools.log.HMLog;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\"\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/ecg/sync/mili/MiliEcgSync;", "", "Ljava/util/Calendar;", "time", "Lcom/huami/ecg/sync/mili/device/MiliDeviceEcgSync;", "sync", "", "c", "startTime", "", "a", "Lcom/huami/ecg/sync/mili/device/OnSyncData;", "onSyncData", "b", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class MiliEcgSync {
    public static final MiliEcgSync INSTANCE = new MiliEcgSync();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = "EcgSync";

    private MiliEcgSync() {
    }

    private final boolean a(Calendar startTime, MiliDeviceEcgSync sync) throws InterruptedException {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        sync.syncEcg(startTime, new EcgRawDataCallback() { // from class: com.huami.ecg.sync.mili.MiliEcgSync$syncECG$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "sync ecg result:" + this.a;
                }
            }

            @Override // com.huami.ecg.sync.mili.device.EcgRawDataCallback
            public void onData(@Nullable EcgSyncInfo data) {
                if (data != null) {
                    new EcgDataRepo().saveEcgFile(data.getTime().getTimeInMillis() / ((long) 1000), EcgParser.INSTANCE.toEcgData(data.getData()));
                }
            }

            @Override // com.huami.ecg.sync.mili.device.EcgRawDataCallback
            public void onFinish(boolean result) {
                HMLog.info("EcgSync", new a(result));
                booleanRef.element = result;
                countDownLatch.countDown();
            }

            @Override // com.huami.ecg.sync.mili.device.EcgRawDataCallback
            public void onStart() {
            }
        });
        countDownLatch.await();
        return booleanRef.element;
    }

    private final void b(Calendar startTime, MiliDeviceEcgSync sync, final OnSyncData onSyncData) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        sync.syncSummary(startTime, new EcgRawDataCallback() { // from class: com.huami.ecg.sync.mili.MiliEcgSync$syncECGSummary$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "sync ecg summary result:" + this.a;
                }
            }

            @Override // com.huami.ecg.sync.mili.device.EcgRawDataCallback
            public void onData(@Nullable EcgSyncInfo data) {
                byte[] data2;
                List<Pair<EcgData, EcgTag>> ecg;
                if (data == null || (data2 = data.getData()) == null || (ecg = EcgParser.INSTANCE.toEcg(data2)) == null) {
                    return;
                }
                EcgDataRepo ecgDataRepo = new EcgDataRepo();
                OnSyncData onSyncData2 = onSyncData;
                if (onSyncData2 != null) {
                    Calendar time = data.getTime();
                    time.add(13, 1);
                    onSyncData2.onSuccess(time);
                }
                Iterator<T> it2 = ecg.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    EcgData ecgData = (EcgData) pair.getFirst();
                    if (ecgData != null) {
                        ecgData.setLocalUpdatedTime(System.currentTimeMillis());
                        ecgData.setUserId(EcgCore.INSTANCE.getWebSetting().userId());
                        ecgData.setDeviceId(data.getDeviceId());
                        ecgData.setDeviceSn(data.getDeviceSn());
                        ecgData.setDeviceSource(data.getDeviceSource());
                        ecgDataRepo.saveEcg(ecgData);
                        ecgDataRepo.uploadEcg(ecgData);
                    }
                    EcgTag ecgTag = (EcgTag) pair.getSecond();
                    if (ecgTag != null && ecgDataRepo.getTagById(ecgTag.getEcgId()) == null) {
                        ecgDataRepo.saveEcgTag(ecgTag);
                    }
                }
            }

            @Override // com.huami.ecg.sync.mili.device.EcgRawDataCallback
            public void onFinish(boolean result) {
                HMLog.info("EcgSync", new a(result));
                countDownLatch.countDown();
            }

            @Override // com.huami.ecg.sync.mili.device.EcgRawDataCallback
            public void onStart() {
            }
        });
        countDownLatch.await();
    }

    private final void c(Calendar time, MiliDeviceEcgSync sync) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        sync.syncPpg(time, new EcgRawDataCallback() { // from class: com.huami.ecg.sync.mili.MiliEcgSync$syncPPG$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "sync ecg ppg result:" + this.a;
                }
            }

            @Override // com.huami.ecg.sync.mili.device.EcgRawDataCallback
            public void onData(@Nullable EcgSyncInfo data) {
                if (data != null) {
                    new EcgDataRepo().savePpgFile(data.getTime().getTimeInMillis() / ((long) 1000), data.getData());
                }
            }

            @Override // com.huami.ecg.sync.mili.device.EcgRawDataCallback
            public void onFinish(boolean result) {
                HMLog.info("EcgSync", new a(result));
                countDownLatch.countDown();
            }

            @Override // com.huami.ecg.sync.mili.device.EcgRawDataCallback
            public void onStart() {
            }
        });
        countDownLatch.await();
    }

    public final void sync(@NotNull Calendar time, @NotNull MiliDeviceEcgSync sync, @Nullable OnSyncData onSyncData) throws InterruptedException {
        Object objClone = time.clone();
        if (objClone == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.util.Calendar");
        }
        c((Calendar) objClone, sync);
        Object objClone2 = time.clone();
        if (objClone2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.util.Calendar");
        }
        if (a((Calendar) objClone2, sync)) {
            Object objClone3 = time.clone();
            if (objClone3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.util.Calendar");
            }
            b((Calendar) objClone3, sync, onSyncData);
        }
    }
}
