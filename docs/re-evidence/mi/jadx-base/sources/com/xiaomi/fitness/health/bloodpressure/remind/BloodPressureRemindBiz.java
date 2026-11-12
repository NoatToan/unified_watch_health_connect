package com.xiaomi.fitness.health.bloodpressure.remind;

import android.content.Context;
import android.util.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.devicesettings.export.model.DeviceBPRemind;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelperExtKt;
import com.xiaomi.fitness.health.bloodpressure.remind.BloodPressureRemindBiz;
import com.xiaomi.fitness.health.bloodpressure.repository.BloodPressurePreRepository;
import com.xiaomi.fitness.health.bloodpressure.repository.IBloodPressurePreRepository;
import defpackage.j03;
import defpackage.tz2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/remind/BloodPressureRemindBiz;", "", "Landroid/content/Context;", "context", "", "observeRemind", "(Landroid/content/Context;)V", "startListener", "Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;", "mPrefRepo", "Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;", "getMPrefRepo", "()Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;", "setMPrefRepo", "(Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;)V", "Landroidx/lifecycle/LiveData;", "Ltz2;", "mMeasureRemindLiveData", "Landroidx/lifecycle/LiveData;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "<init>", "RemindObserver", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodPressureRemindBiz {

    @Nullable
    private LiveData<tz2> mMeasureRemindLiveData;

    @NotNull
    private IBloodPressurePreRepository mPrefRepo;

    @NotNull
    private final AtomicBoolean mStarted;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/remind/BloodPressureRemindBiz$RemindObserver;", "Landroidx/lifecycle/Observer;", "Ltz2;", "data", "", "refreshRemindIfNeed", "(Ltz2;)V", "updateToDevice", "", "", "getDeleteId", "(Ltz2;)Ljava/util/List;", "", "", "getRemindMap", "(Ltz2;)Ljava/util/Map;", "", "origin", "getDuplicateList", "([I)Ljava/util/List;", "onChanged", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;", "mBloodPressureRepo", "Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;", "context", "repository", "<init>", "(Landroid/content/Context;Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class RemindObserver implements Observer<tz2> {

        @NotNull
        private final IBloodPressurePreRepository mBloodPressureRepo;

        @NotNull
        private final Context mContext;

        public RemindObserver(@NotNull Context context, @NotNull IBloodPressurePreRepository repository) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(repository, "repository");
            Objects.requireNonNull(context);
            this.mContext = context;
            this.mBloodPressureRepo = repository;
        }

        private final List<String> getDeleteId(tz2 data) {
            List<Integer> duplicateList = getDuplicateList(data.c());
            String[] strArr = new String[duplicateList.size()];
            int size = duplicateList.size();
            for (int i = 0; i < size; i++) {
                strArr[i] = "remind:bp_measure:" + i;
            }
            return ArraysKt___ArraysKt.toList(strArr);
        }

        private final List<Integer> getDuplicateList(int[] origin) {
            int i;
            ArrayList arrayList = new ArrayList();
            if (origin != null && origin.length != 0) {
                arrayList.add(Integer.valueOf(origin[0]));
                int length = origin.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 > 0 && (i = origin[i2]) != origin[i2 - 1]) {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
            }
            return arrayList;
        }

        private final Map<String, Integer> getRemindMap(tz2 data) {
            Logger.i("MiHealth", "blood remind repeat days" + Arrays.toString(BloodPressureRemindUtils.getRepeatDays(data.d())));
            int[] iArrC = data.c();
            Arrays.sort(iArrC);
            List<Integer> duplicateList = getDuplicateList(iArrC);
            ArrayMap arrayMap = new ArrayMap(duplicateList.size());
            int size = duplicateList.size();
            for (int i = 0; i < size; i++) {
                int[] iArrSplitMins = TimeUtils.INSTANCE.splitMins(duplicateList.get(i).intValue());
                arrayMap.put("remind:bp_measure:" + i, Integer.valueOf((iArrSplitMins[0] * 100) + iArrSplitMins[1]));
            }
            return arrayMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onChanged$lambda$0(RemindObserver this$0, tz2 data) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(data, "$data");
            this$0.refreshRemindIfNeed(data);
        }

        private final void refreshRemindIfNeed(tz2 data) {
            Logger.i("MiHealth", "BloodPressure RemindObserver refreshRemindIfNeed : " + data);
            tz2 measureRemindData = this.mBloodPressureRepo.getMeasureRemindData(BloodPressurePreRepository.KEY_REMIND_DATA);
            updateToDevice(data);
            tz2 tz2VarA = tz2.a();
            if (measureRemindData == null || Intrinsics.areEqual(measureRemindData, tz2VarA)) {
                if (Intrinsics.areEqual(data, tz2VarA)) {
                    return;
                }
                j03.b(this.mContext, null, getRemindMap(data));
                this.mBloodPressureRepo.updateRemindConfig(BloodPressurePreRepository.KEY_REMIND_DATA, data);
                return;
            }
            if (Intrinsics.areEqual(measureRemindData, data)) {
                return;
            }
            if (data != null && !Intrinsics.areEqual(data, tz2VarA)) {
                j03.b(this.mContext, getDeleteId(measureRemindData), getRemindMap(data));
                this.mBloodPressureRepo.updateRemindConfig(BloodPressurePreRepository.KEY_REMIND_DATA, data);
            } else {
                j03.b(this.mContext, getDeleteId(measureRemindData), null);
                IBloodPressurePreRepository iBloodPressurePreRepository = this.mBloodPressureRepo;
                Intrinsics.checkNotNull(tz2VarA);
                iBloodPressurePreRepository.updateRemindConfig(BloodPressurePreRepository.KEY_REMIND_DATA, tz2VarA);
            }
        }

        private final void updateToDevice(tz2 data) {
            IBloodPressurePreRepository iBloodPressurePreRepository = this.mBloodPressureRepo;
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = (Boolean) iBloodPressurePreRepository.getPrefValue(BloodPressurePreRepository.KEY_MEASURE_REMIND_ENABLE, bool);
            int i = 0;
            boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
            Object prefValue = this.mBloodPressureRepo.getPrefValue("normal_enable", bool);
            Boolean bool3 = Boolean.TRUE;
            if (!Intrinsics.areEqual(prefValue, bool3)) {
                if (Intrinsics.areEqual(this.mBloodPressureRepo.getPrefValue("mid_enable", bool), bool3)) {
                    i = 1;
                } else if (Intrinsics.areEqual(this.mBloodPressureRepo.getPrefValue("severe_enable", bool), bool3)) {
                    i = 2;
                } else if (Intrinsics.areEqual(this.mBloodPressureRepo.getPrefValue("custom_enable", bool), bool3)) {
                    i = 3;
                }
            }
            int i2 = i;
            int iD = data.d();
            int iB = data.b();
            int[] iArrC = data.c();
            Intrinsics.checkNotNullExpressionValue(iArrC, "getRemindTimes(...)");
            DeviceSettingsSyncHelperExtKt.getInstance(DeviceSettingsSyncHelper.INSTANCE).setBloodPressureRemind(new DeviceBPRemind(zBooleanValue, i2, iD, iB, ArraysKt___ArraysKt.toMutableList(iArrC)));
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@NotNull final tz2 data) {
            Intrinsics.checkNotNullParameter(data, "data");
            ExecutorHelper.runInBackground(new Runnable() { // from class: i03
                @Override // java.lang.Runnable
                public final void run() {
                    BloodPressureRemindBiz.RemindObserver.onChanged$lambda$0(this.f20636a, data);
                }
            });
        }
    }

    public BloodPressureRemindBiz(@NotNull IBloodPressurePreRepository mPrefRepo) {
        Intrinsics.checkNotNullParameter(mPrefRepo, "mPrefRepo");
        this.mPrefRepo = mPrefRepo;
        this.mStarted = new AtomicBoolean();
    }

    private final void observeRemind(Context context) {
        LiveData<tz2> measureRemindLiveData = this.mPrefRepo.getMeasureRemindLiveData();
        this.mMeasureRemindLiveData = measureRemindLiveData;
        Intrinsics.checkNotNull(measureRemindLiveData);
        measureRemindLiveData.observeForever(new RemindObserver(context, this.mPrefRepo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startListener$lambda$0(BloodPressureRemindBiz this$0, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.observeRemind(context);
    }

    @NotNull
    public final IBloodPressurePreRepository getMPrefRepo() {
        return this.mPrefRepo;
    }

    public final void setMPrefRepo(@NotNull IBloodPressurePreRepository iBloodPressurePreRepository) {
        Intrinsics.checkNotNullParameter(iBloodPressurePreRepository, "<set-?>");
        this.mPrefRepo = iBloodPressurePreRepository;
    }

    public final void startListener(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Logger.i("MiHealth", "BloodPressureRemindBiz startListener...");
        if (this.mStarted.compareAndSet(false, true)) {
            ExecutorHelper.INSTANCE.runInMain(new Runnable() { // from class: h03
                @Override // java.lang.Runnable
                public final void run() {
                    BloodPressureRemindBiz.startListener$lambda$0(this.f19521a, context);
                }
            });
        }
    }
}
