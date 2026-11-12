package com.huami.worldclock.manager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.WorkerThread;
import com.huami.bluetooth.profile.channel.module.WorldClockModule;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.service.entity.remote.PushResult;
import com.huami.worldclock.bean.WorldClockBean;
import com.huami.worldclock.bean.WorldClockCityBean;
import com.huami.worldclock.property.WorldClockProperties;
import com.huami.worldclock.utils.DeviceLanguageUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.model.HmLocale;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.bt.profile.worldclock.WorldTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005J \u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019J\u0014\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\""}, d2 = {"Lcom/huami/worldclock/manager/WorldClockDataFactory;", "", "", "Lcom/huami/worldclock/bean/WorldClockBean;", "getLocalWorldClock", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "", "Lcom/xiaomi/hm/health/bt/profile/worldclock/WorldTime;", "getLocalWorldTime", "Lcom/huami/bluetooth/profile/channel/module/WorldClockModule;", "worldClockModule", "getLocaleWorldTimeAndBuiltInCity", "getDefaultWorldCity", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmBaseDevice", "getDefaultWorldTime", "showData", "hideData", "combinationData", "getDeviceBuiltInWorldCity", "", "isFirstUsing", "Lcom/huami/worldclock/bean/WorldClockCityBean;", "worldClockBean", "isContainTimeZone", "cityList", "", "updateWorldClockList", "<init>", "()V", "Companion", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class WorldClockDataFactory {

    @NotNull
    public static final String PROPERTY_WORLD_CLOCK = "huami.mifit.user.settings.worldclock";

    @NotNull
    private static final String a = "WorldClockDataFactory";

    @NotNull
    private static final String h = "America/New_York";

    @NotNull
    private static final String i = "Europe/London";

    @NotNull
    private static final String j = "Europe/Moscow";

    @NotNull
    private static final String k = "Asia/Shanghai";

    @NotNull
    private static final String l = "Australia/Sydney";

    @NotNull
    private static final String m = "Asia/Tokyo";

    @NotNull
    private static final String n = "Wellington";

    @NotNull
    private static final String f = "Sydney";

    @NotNull
    private static final String g = "Tokyo";

    @NotNull
    private static final String o = "Seoul";

    @NotNull
    private static final String e = "Beijing";

    @NotNull
    private static final String p = "HongKong";

    @NotNull
    private static final String q = "Singapore";

    @NotNull
    private static final String r = "Bangkok";

    @NotNull
    private static final String s = "New_Delhi";

    @NotNull
    private static final String t = "Islamabad";

    @NotNull
    private static final String E = "Dubai";

    @NotNull
    private static final String d = "Moscow";

    @NotNull
    private static final String u = "Cairo";

    @NotNull
    private static final String v = "Cape_Town";

    @NotNull
    private static final String w = "Paris";

    @NotNull
    private static final String c = "London";

    @NotNull
    private static final String b = "New_York";

    @NotNull
    private static final String x = "Chicago";

    @NotNull
    private static final String y = "Los_Angeles";

    @NotNull
    private static final String D = "Honolulu";

    @NotNull
    private static final String z = "Athens";

    @NotNull
    private static final String A = "Tehran";

    @NotNull
    private static final String B = "Yangon";

    @NotNull
    private static final String C = "Rio_de_Janeiro";

    @NotNull
    private static final List<String> F = CollectionsKt__CollectionsKt.mutableListOf(n, f, g, o, e, p, q, r, s, t, E, d, u, v, w, c, b, x, y, D, z, A, B, C);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/worldclock/bean/WorldClockBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<WorldClockBean, Boolean> {
        public final /* synthetic */ List<WorldClockBean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<WorldClockBean> list) {
            super(1);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull WorldClockBean worldClockBean) {
            return Boolean.valueOf(this.a.contains(worldClockBean));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("getDefaultWorldCity -->locale timeZone identifier is ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("getDefaultWorldCity -->notContainLocaleTimeZone: ", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Locale a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Locale locale) {
            super(0);
            this.a = locale;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            StringBuilder sb = new StringBuilder();
            Locale locale = this.a;
            sb.append((Object) (locale == null ? null : locale.getCountry()));
            sb.append("--");
            Locale locale2 = this.a;
            sb.append((Object) (locale2 != null ? locale2.getLanguage() : null));
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/userproperty/service/entity/remote/PushResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PushResult, Unit> {
        public static final e a = new e();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ PushResult a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PushResult pushResult) {
                super(0);
                this.a = pushResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return this.a.toString();
            }
        }

        public e() {
            super(1);
        }

        public final void a(@NotNull PushResult pushResult) {
            HMLog.info(WorldClockDataFactory.a, new a(pushResult));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PushResult pushResult) {
            a(pushResult);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final List<WorldClockBean> combinationData(@NotNull List<WorldClockBean> showData, @NotNull List<WorldClockBean> hideData) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(hideData);
        arrayList.addAll(showData);
        h.removeAll((List) arrayList2, (Function1) new a(showData));
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:70:0x0129  */
    /* JADX WARN: Code duplicated, block: B:73:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:0x013e  */
    /* JADX WARN: Code duplicated, block: B:91:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[LOOP:2: B:74:0x0138->B:92:?, LOOP_END, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 java.lang.Object, still in use, count: 2, list:
          (r1v10 java.lang.Object) from 0x0126: PHI (r1 I:??) = (r1v6 java.lang.Object), (r1v10 java.lang.Object) binds: [B:67:0x0125, B:87:0x0126] A[DONT_GENERATE, DONT_INLINE]
          (r1v10 java.lang.Object) from 0x0114: CHECK_CAST (com.huami.worldclock.bean.WorldClockBean) (r1v10 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.huami.worldclock.bean.WorldClockBean> getDefaultWorldCity(@org.jetbrains.annotations.NotNull android.content.Context r12) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.worldclock.manager.WorldClockDataFactory.getDefaultWorldCity(android.content.Context):java.util.List");
    }

    @Nullable
    public final List<WorldTime> getDefaultWorldTime(@NotNull Context context, @Nullable HMBaseDevice hmBaseDevice) {
        Locale deviceLanguageToLocale = DeviceLanguageUtils.INSTANCE.parseDeviceLanguageToLocale(hmBaseDevice);
        HMLog.info(a, new d(deviceLanguageToLocale));
        List<WorldClockBean> defaultWorldCity = WorldClockConfig.INSTANCE.getDefaultWorldCity(context);
        if (defaultWorldCity == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : defaultWorldCity) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            WorldTime worldTimeWorldClockBeanToWorldTime = deviceLanguageToLocale == null ? null : TransformHelper.INSTANCE.worldClockBeanToWorldTime(context, deviceLanguageToLocale, (WorldClockBean) obj, i2);
            if (worldTimeWorldClockBeanToWorldTime != null) {
                arrayList.add(worldTimeWorldClockBeanToWorldTime);
            }
            i2 = i3;
        }
        return arrayList;
    }

    @Nullable
    public final List<WorldClockBean> getDeviceBuiltInWorldCity(@NotNull Context context) {
        List<WorldClockBean> listManagerTimeZonesData = TimeZonesJsonHelper.INSTANCE.managerTimeZonesData(context);
        if (listManagerTimeZonesData == null) {
            return null;
        }
        ArrayList<WorldClockBean> arrayList = new ArrayList();
        for (Object obj : listManagerTimeZonesData) {
            if (F.contains(((WorldClockBean) obj).getCity())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (WorldClockBean worldClockBean : arrayList) {
            arrayList2.add(worldClockBean.copy((255 & 1) != 0 ? worldClockBean.cityCN : null, (255 & 2) != 0 ? worldClockBean.city : null, (255 & 4) != 0 ? worldClockBean.mainCity : false, (255 & 8) != 0 ? worldClockBean.identifier : null, (255 & 16) != 0 ? worldClockBean.cityCode : null, (255 & 32) != 0 ? worldClockBean.daylightState : 0, (255 & 64) != 0 ? worldClockBean.offsetTransitionDateTime : 0L, (255 & 128) != 0 ? worldClockBean.isShow : false));
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
    }

    @NotNull
    public final List<WorldClockBean> getLocalWorldClock() {
        try {
            String str = WorldClockProperties.INSTANCE.getUserWorldClock().get();
            if (str == null) {
                str = "";
            }
            return TimeZonesJsonHelper.INSTANCE.parsePropertyToZones(str);
        } catch (Exception e2) {
            HMLog.i(a, e2.getMessage(), new Object[0]);
            return new ArrayList();
        }
    }

    @Nullable
    public final List<WorldTime> getLocalWorldTime(@NotNull Context context, @NotNull DeviceInfo deviceInfo) throws Throwable {
        HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
        if (otherVersion == null) {
            return null;
        }
        try {
            Locale locale = HmLocale.getLocale(otherVersion.getLanguage().getLanguage());
            List<WorldClockBean> localWorldClock = WorldClockConfig.INSTANCE.getLocalWorldClock();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(localWorldClock, 10));
            int i2 = 0;
            for (Object obj : localWorldClock) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(TransformHelper.INSTANCE.worldClockBeanToWorldTime(context, locale, (WorldClockBean) obj, i2));
                i2 = i3;
            }
            return CollectionsKt___CollectionsKt.toList(arrayList);
        } catch (Exception e2) {
            HMLog.i(a, e2.getMessage(), new Object[0]);
            return null;
        }
    }

    @WorkerThread
    @Nullable
    public final List<WorldTime> getLocaleWorldTimeAndBuiltInCity(@NotNull Context context, @NotNull DeviceInfo deviceInfo, @Nullable WorldClockModule worldClockModule) {
        Integer numQueryVersionSync;
        List<WorldClockBean> localWorldClock;
        List<WorldClockBean> listCombinationData;
        DeviceLanguageUtils deviceLanguageUtils = DeviceLanguageUtils.INSTANCE;
        deviceLanguageUtils.parseDeviceLanguageToLocale(deviceInfo);
        Locale deviceLanguageToLocale = deviceLanguageUtils.parseDeviceLanguageToLocale(deviceInfo);
        if (deviceLanguageToLocale == null) {
            return null;
        }
        int i2 = 0;
        int iIntValue = (worldClockModule == null || (numQueryVersionSync = worldClockModule.queryVersionSync()) == null) ? 0 : numQueryVersionSync.intValue();
        if (isFirstUsing()) {
            localWorldClock = getDefaultWorldCity(context);
            if (localWorldClock == null) {
                localWorldClock = new ArrayList<>();
            }
        } else {
            localWorldClock = WorldClockConfig.INSTANCE.getLocalWorldClock();
        }
        List<WorldClockBean> deviceBuiltInWorldCity = iIntValue > 1 ? getDeviceBuiltInWorldCity(context) : null;
        if (deviceBuiltInWorldCity != null && (listCombinationData = combinationData(localWorldClock, deviceBuiltInWorldCity)) != null) {
            localWorldClock = listCombinationData;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : localWorldClock) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            WorldClockBean worldClockBean = (WorldClockBean) obj;
            TransformHelper transformHelper = TransformHelper.INSTANCE;
            if (!worldClockBean.isShow()) {
                i2 = 255;
            }
            WorldTime worldTimeWorldClockBeanToWorldTime = transformHelper.worldClockBeanToWorldTime(context, deviceLanguageToLocale, worldClockBean, i2);
            if (worldTimeWorldClockBeanToWorldTime != null) {
                arrayList.add(worldTimeWorldClockBeanToWorldTime);
            }
            i2 = i3;
        }
        return arrayList;
    }

    public final synchronized boolean isContainTimeZone(@NotNull WorldClockCityBean worldClockBean) {
        boolean z2;
        List<WorldClockBean> localWorldClock = getLocalWorldClock();
        z2 = true;
        if ((localWorldClock instanceof Collection) && localWorldClock.isEmpty()) {
            z2 = false;
        } else {
            for (WorldClockBean worldClockBean2 : localWorldClock) {
                if (Intrinsics.areEqual(worldClockBean2.getCity(), worldClockBean.getCity()) && Intrinsics.areEqual(worldClockBean2.getIdentifier(), worldClockBean.getIdentifier())) {
                }
            }
            z2 = false;
        }
        return z2;
    }

    public final synchronized boolean isFirstUsing() {
        String str;
        str = WorldClockProperties.INSTANCE.getUserWorldClock().get();
        if (str == null) {
            str = "";
        }
        return TimeZonesJsonHelper.INSTANCE.parsePropertyIsFirstUsing(str);
    }

    public final void updateWorldClockList(@NotNull List<WorldClockBean> cityList) {
        try {
            String strWorldClockListToJsonString$default = TimeZonesJsonHelper.worldClockListToJsonString$default(TimeZonesJsonHelper.INSTANCE, cityList, false, 2, null);
            Log.i(a, strWorldClockListToJsonString$default);
            WorldClockProperties worldClockProperties = WorldClockProperties.INSTANCE;
            worldClockProperties.getUserWorldClock().set(strWorldClockListToJsonString$default);
            worldClockProperties.getUserWorldClock().push().get(e.a);
        } catch (Exception e2) {
            HMLog.i(a, e2.getMessage(), new Object[0]);
        }
    }
}
