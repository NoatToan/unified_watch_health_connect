package com.huami.health.afppg.utils;

import com.huami.health.afppg.data.local.RRDataKeeper;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/health/afppg/utils/AfibCacheHelper;", "", "", "todayStr", "", "isCached", "", "saveCache", "toTime", "isLoadMore", "", "count", "updateCacheCount", "TAG", "Ljava/lang/String;", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class AfibCacheHelper {

    @NotNull
    public static final AfibCacheHelper INSTANCE = new AfibCacheHelper();

    @NotNull
    public static final String TAG = "AfibCacheHelper";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus(this.a, " is cached");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " is future day,latestDay:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "no cache count";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, int i, String str) {
            super(0);
            this.a = z;
            this.b = i;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "need load more:" + this.a + ",syncCount:" + this.b + ",toTime:" + this.c;
        }
    }

    private AfibCacheHelper() {
    }

    @JvmStatic
    public static final boolean isCached(@NotNull String todayStr) {
        RRDataKeeper.Companion companion = RRDataKeeper.INSTANCE;
        if (companion.isDayCacheAfib(todayStr)) {
            HMLog.info(TAG, new a(todayStr));
            return true;
        }
        String afibLatestSyncDay = companion.getAfibLatestSyncDay();
        if (!(afibLatestSyncDay.length() > 0) || todayStr.compareTo(afibLatestSyncDay) <= 0) {
            return false;
        }
        HMLog.info(TAG, new b(todayStr, afibLatestSyncDay));
        return true;
    }

    @JvmStatic
    public static final boolean isLoadMore(@NotNull String toTime) {
        int afibListSync = RRDataKeeper.INSTANCE.getAfibListSync();
        boolean z = true;
        if (afibListSync < 0) {
            HMLog.info(TAG, c.a);
        } else {
            z = System.currentTimeMillis() - PPGExtensionsKt.yMDHMSToTimestamp(toTime) > (((long) ((afibListSync * 71) * 2)) * 1000) + 5000;
            HMLog.info(TAG, new d(z, afibListSync, toTime));
        }
        return z;
    }

    @JvmStatic
    public static final void saveCache(@NotNull String todayStr) {
        RRDataKeeper.Companion companion = RRDataKeeper.INSTANCE;
        if ((companion.getAfibLatestSyncDay().length() == 0) && Intrinsics.areEqual(todayStr, PPGExtensionsKt.timestampToYMD$default(System.currentTimeMillis(), null, 2, null))) {
            companion.saveAfibLatestSyncDay(todayStr);
        }
        companion.saveDayCacheAfib(todayStr);
    }

    @JvmStatic
    public static final void updateCacheCount(int count) {
        RRDataKeeper.Companion companion = RRDataKeeper.INSTANCE;
        if (count > companion.getAfibListSync()) {
            companion.saveAfibListSync(count);
        }
    }
}
