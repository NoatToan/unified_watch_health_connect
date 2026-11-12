package com.xiaomi.hm.health.starsky.api.gdsp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ecg.media.MediaRecorderHelper;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.starsky.StarSkyActivity;
import com.xiaomi.hm.health.bt.model.starsky.StarSkyRrInterval;
import com.xiaomi.hm.health.bt.model.starsky.StarSkySleep;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataExtend;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.health.rrpeak.RRPackageDataAnalysisUtils;
import com.xiaomi.hm.health.device.health.rrpeak.RRSingleDataNew;
import com.xiaomi.hm.health.starsky.StartSkyDataCallback;
import com.xiaomi.hm.health.starsky.api.StarSkyApi;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u001a\u0010\u000b\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007J\u0014\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u001d\u0010!\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u000f\u0010 ¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/starsky/api/gdsp/GdspStarSkyApiImpl;", "Lcom/xiaomi/hm/health/starsky/api/StarSkyApi;", "Lcom/xiaomi/hm/health/starsky/StartSkyDataCallback;", "callback", "", "registerDataCallback", MiPushClient.COMMAND_UNREGISTER, "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityData;", "fragmentList", "onActivityData", "", "byteArrayList", "onRrData", "a", "Lcom/xiaomi/hm/health/starsky/StartSkyDataCallback;", "mCallback", "", "Lcom/xiaomi/hm/health/bt/model/starsky/StarSkyActivity;", "b", "Ljava/util/List;", "mActivityList", "Lcom/xiaomi/hm/health/bt/model/starsky/StarSkySleep;", "c", "mSleepList", "Lcom/xiaomi/hm/health/bt/model/starsky/StarSkyRrInterval;", GoogleApiAvailabilityLight.a, "mRrList", "Landroid/os/Handler;", "e", "Lkotlin/Lazy;", "()Landroid/os/Handler;", "mHandler", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GdspStarSkyApiImpl implements StarSkyApi {

    @NotNull
    private static final String f = "GdspStarSkyApiImpl";
    private static final int g = 1;
    private static final long h = 180000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private StartSkyDataCallback mCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<StarSkyActivity> mActivityList = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<StarSkySleep> mSleepList = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<StarSkyRrInterval> mRrList = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mHandler = LazyKt__LazyJVMKt.lazy(new Function0<GdspStarSkyApiImpl$mHandler$2.AnonymousClass1>() { // from class: com.xiaomi.hm.health.starsky.api.gdsp.GdspStarSkyApiImpl$mHandler$2
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.xiaomi.hm.health.starsky.api.gdsp.GdspStarSkyApiImpl$mHandler$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            Looper mainLooper = Looper.getMainLooper();
            final GdspStarSkyApiImpl gdspStarSkyApiImpl = this.a;
            return new Handler(mainLooper) { // from class: com.xiaomi.hm.health.starsky.api.gdsp.GdspStarSkyApiImpl$mHandler$2.1
                @Override // android.os.Handler
                public void dispatchMessage(@NotNull Message msg) {
                    super.dispatchMessage(msg);
                    if (msg.what == 1) {
                        gdspStarSkyApiImpl.a().sendEmptyMessageDelayed(1, MediaRecorderHelper.MAX_RECORD_TIME);
                        HMDeviceManager.getInstance().startSyncData(HMDeviceType.MILI);
                    }
                }
            };
        }
    });

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<GdspStarSkyApiImpl> i = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/starsky/api/gdsp/GdspStarSkyApiImpl$Companion;", "", "Lcom/xiaomi/hm/health/starsky/api/gdsp/GdspStarSkyApiImpl;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/xiaomi/hm/health/starsky/api/gdsp/GdspStarSkyApiImpl;", DefaultSettingsSpiCall.n, "", "DATA_INTERVAL", "J", "", "NEW_DATA_MSG", LogUtil.I, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), DefaultSettingsSpiCall.n, "getInstance()Lcom/xiaomi/hm/health/starsky/api/gdsp/GdspStarSkyApiImpl;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GdspStarSkyApiImpl getInstance() {
            return (GdspStarSkyApiImpl) GdspStarSkyApiImpl.i.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/starsky/api/gdsp/GdspStarSkyApiImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<GdspStarSkyApiImpl> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GdspStarSkyApiImpl invoke() {
            return new GdspStarSkyApiImpl();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ StarSkyActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StarSkyActivity starSkyActivity) {
            super(0);
            this.a = starSkyActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "star sky activity:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ StarSkySleep a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(StarSkySleep starSkySleep) {
            super(0);
            this.a = starSkySleep;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "star sky sleep:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ StarSkyRrInterval a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(StarSkyRrInterval starSkyRrInterval) {
            super(0);
            this.a = starSkyRrInterval;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "rrinterval:" + this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler a() {
        return (Handler) this.mHandler.getValue();
    }

    public final void onActivityData(@NotNull List<? extends ActivityDataFragment<ActivityData>> fragmentList) {
        if (this.mCallback == null) {
            return;
        }
        Iterator<T> it2 = fragmentList.iterator();
        while (it2.hasNext()) {
            ActivityDataFragment activityDataFragment = (ActivityDataFragment) it2.next();
            int i2 = 0;
            for (Object obj : activityDataFragment.data) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                ActivityData activityData = (ActivityData) obj;
                if (activityData instanceof ActivityDataExtend) {
                    Calendar calendar = (Calendar) activityDataFragment.timestamp.clone();
                    calendar.add(12, i2);
                    long timeInMillis = calendar.getTimeInMillis();
                    List<StarSkyActivity> list = this.mActivityList;
                    StarSkyActivity starSkyActivity = new StarSkyActivity(timeInMillis, activityData.intensity & 255);
                    HMLog.info(f, new b(starSkyActivity));
                    Unit unit = Unit.INSTANCE;
                    list.add(starSkyActivity);
                    ActivityDataExtend activityDataExtend = (ActivityDataExtend) activityData;
                    int sleepProbabilityAndPosture = activityDataExtend.getSleepProbabilityAndPosture() & 63;
                    float f2 = 100;
                    float sleepProbabilityDeep = ((activityDataExtend.getSleepProbabilityDeep() & 127) / 127.0f) * f2;
                    float sleepProbabilityRem = ((activityDataExtend.getSleepProbabilityRem() & 127) / 127.0f) * f2;
                    List<StarSkySleep> list2 = this.mSleepList;
                    StarSkySleep starSkySleep = new StarSkySleep(timeInMillis, sleepProbabilityAndPosture, sleepProbabilityDeep, sleepProbabilityRem);
                    HMLog.info(f, new c(starSkySleep));
                    list2.add(starSkySleep);
                }
                i2 = i3;
            }
        }
    }

    public final void onRrData(@NotNull List<byte[]> byteArrayList) {
        if (this.mCallback == null) {
            return;
        }
        Iterator<T> it2 = byteArrayList.iterator();
        while (it2.hasNext()) {
            for (RRSingleDataNew rRSingleDataNew : RRPackageDataAnalysisUtils.analysisForRRPkgDataNew((byte[]) it2.next())) {
                long jLongValue = rRSingleDataNew.getTimestamp().longValue() * ((long) 1000);
                List<Integer> intervalData = rRSingleDataNew.getIntervalData();
                if (intervalData != null) {
                    for (Integer num : intervalData) {
                        List<StarSkyRrInterval> list = this.mRrList;
                        StarSkyRrInterval starSkyRrInterval = new StarSkyRrInterval(jLongValue, num.intValue());
                        HMLog.info(f, new d(starSkyRrInterval));
                        Unit unit = Unit.INSTANCE;
                        list.add(starSkyRrInterval);
                        jLongValue += (long) Math.abs(num.intValue());
                    }
                }
            }
        }
        StartSkyDataCallback startSkyDataCallback = this.mCallback;
        if (startSkyDataCallback != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.mActivityList);
            Unit unit2 = Unit.INSTANCE;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.mSleepList);
            List<StarSkyRrInterval> list2 = this.mRrList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Long.valueOf(((StarSkyRrInterval) it3.next()).getTimestamp()));
            }
            List<StarSkyRrInterval> list3 = this.mRrList;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Integer.valueOf(((StarSkyRrInterval) it4.next()).getRrInterval()));
            }
            startSkyDataCallback.onData(arrayList, arrayList2, arrayList3, arrayList4);
        }
        this.mActivityList.clear();
        this.mSleepList.clear();
        this.mRrList.clear();
    }

    @Override // com.xiaomi.hm.health.starsky.api.StarSkyApi
    public void registerDataCallback(@NotNull StartSkyDataCallback callback) {
        this.mCallback = callback;
        a().sendEmptyMessage(1);
    }

    @Override // com.xiaomi.hm.health.starsky.api.StarSkyApi
    public void unregister() {
        this.mCallback = null;
        a().removeMessages(1);
    }
}
