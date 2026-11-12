package com.xiaomi.hm.health.devicex.factory;

import android.content.Context;
import android.util.SparseArray;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.bt.profile.page.PageItem;
import com.xiaomi.hm.health.device.AppSortHelperKt;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import com.xiaomi.hm.health.device.setting.appsort.SortAppSetting;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.LisbonWSortFactory;
import com.xiaomi.hm.health.devicex.factory.AppSortHelperImpl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001b\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b.\u0010/J\u001e\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002JT\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0016\u0010\u0019\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eJ\u001c\u0010\u001b\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J:\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u00102\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\tJ\u001c\u0010 \u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J\u001c\u0010\u001f\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J\u001c\u0010!\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003J\u001c\u0010\"\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J\u001c\u0010#\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J\u001c\u0010%\u001a\u00020\u00162\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J\u001c\u0010&\u001a\u00020\u00162\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J\u001a\u0010'\u001a\u00020\u00162\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0010J\u001a\u0010(\u001a\u00020\u00162\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0010J\u001c\u0010)\u001a\u00020\u00162\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J\u001c\u0010*\u001a\u00020\u00162\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J\u001c\u0010+\u001a\u00020\u00162\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J\u001c\u0010,\u001a\u00020\u00162\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J\u001c\u0010-\u001a\u00020\u00162\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0010H\u0016¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/devicex/factory/AppSortHelperImpl;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortHelperApi;", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "array", "settingItem", "e", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "displaySetting", "", "b", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Ljava/util/HashMap;", "", "", "nameMap", "drawableMap", "colorMap", "", "createAppSortMap", "syncAppSortDataToDevice", "syncAppSortToDevice", SportAnalytics.ParamValue.MapButtonType.MAP, "upgradeCincoNFC", com.google.android.exoplayer2.text.ttml.b.d0, "pai", "enable", "upgradePAI", "upgradePAIBeatsW", "upgradeWuhanTimerInner", "upgradeWuhanTimer", "upgradeChongqingTimer", "hashMap", "fixChaohuAppSort", "fixCincoAppSort", "fixCincoHPai", "fixCincoLPai", "fixCincoPAI", "upgradeFalcon", "upgradePyh", "fixLisbonW", "fixYork", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AppSortHelperImpl implements AppSortHelperApi {

    @NotNull
    private static final String a = "AppSortHelper";
    private static final int b = 11;
    private static final int c = 8;
    private static final int d = 12;
    private static final int e = 11;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "chaohu appsort wrong！fixed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "cincoRet: " + this.a;
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
            return "cincoLRet: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "remove cinco PAI";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "remove cincoL PAI";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "needFixLisbonW: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "not bound!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "device null or disconnected";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "already upgrade";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "upgrade cinco NFC";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "upgrade falcon";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "upgrade falconW";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.BooleanRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Ref.BooleanRef booleanRef) {
            super(0);
            this.a = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "needUpgrade: " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.BooleanRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Ref.BooleanRef booleanRef) {
            super(0);
            this.a = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "needUpgradeW: " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "upgrade pyh";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "upgrade pyhw";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public static final q a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "already upgrade";
        }
    }

    private final boolean b(SortableAppItems displaySetting) {
        if (displaySetting == null) {
            return false;
        }
        int size = displaySetting.getSparseArrayApps().size();
        if (size <= 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            AppItem appItemValueAt = displaySetting.getSparseArrayApps().valueAt(i2);
            if (appItemValueAt.getType() == 255) {
                appItemValueAt.setType(18);
                return false;
            }
            if (i3 >= size) {
                return true;
            }
            i2 = i3;
        }
    }

    private final boolean c(SortableAppItems displaySetting) {
        if (displaySetting.getAppCount() > HMDisplaySetting.AppType.values().length) {
            return false;
        }
        int size = displaySetting.getSparseArrayApps().size();
        if (size <= 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (displaySetting.getSparseArrayApps().valueAt(i2).getType() >= HMDisplaySetting.AppType.values().length) {
                return false;
            }
            if (i3 >= size) {
                return true;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(PageItem pageItem, PageItem pageItem2) {
        return pageItem.getIndex() - pageItem2.getIndex();
    }

    private final AppItem e(ArrayList<AppItem> array, AppItem settingItem) {
        int index;
        if (settingItem.isEnable()) {
            index = settingItem.getIndex();
            for (AppItem appItem : array) {
                if (appItem.getIndex() >= index) {
                    appItem.setIndex(appItem.getIndex() + 1);
                }
            }
        } else {
            int iMax = -1;
            for (AppItem appItem2 : array) {
                if (appItem2.isEnable()) {
                    iMax = Math.max(appItem2.getIndex(), iMax);
                }
            }
            for (AppItem appItem3 : array) {
                if (appItem3.getIndex() >= iMax + 1) {
                    appItem3.setIndex(appItem3.getIndex() + 1);
                }
            }
            index = iMax + 1;
        }
        return new AppItem(HMDisplaySetting.AppTypeChongqing.TIMER.getValue(), index, true);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi
    public void createAppSortMap(@NotNull Context context, @NotNull HMDeviceSource deviceSource, @NotNull HashMap<Integer, String> nameMap, @NotNull HashMap<Integer, Integer> drawableMap, @NotNull HashMap<Integer, Integer> colorMap) {
        AppSortHelperKt.createAppSort(context, deviceSource, nameMap, drawableMap, colorMap);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi
    public void fixChaohuAppSort(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_PEYTO;
        SortableAppItems sortableAppItems = hashMap.get(hMDeviceSource);
        if (sortableAppItems == null || c(sortableAppItems)) {
            return;
        }
        HMLog.info(a, a.a);
        hashMap.put(hMDeviceSource, HMAppSortDataManager.getChaohuDefaultSetting());
        syncAppSortToDevice(hashMap.get(hMDeviceSource), hMDeviceSource);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi
    public void fixCincoAppSort(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap) {
        HMLog.info(a, new b(b(hashMap.get(HMDeviceSource.MILI_CINCO))));
        HMLog.info(a, new c(b(hashMap.get(HMDeviceSource.MILI_CINCO_L))));
    }

    public final void fixCincoHPai(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap) {
        SparseArray<AppItem> sparseArrayApps;
        AppItem appItem;
        SortableAppItems sortableAppItems = hashMap.get(HMDeviceSource.MILI_CINCO);
        if (sortableAppItems == null || (appItem = (sparseArrayApps = sortableAppItems.getSparseArrayApps()).get(25)) == null) {
            return;
        }
        HMLog.info(a, d.a);
        int i2 = 0;
        int size = sparseArrayApps.size();
        if (size > 0) {
            while (true) {
                int i3 = i2 + 1;
                AppItem appItemValueAt = sparseArrayApps.valueAt(i2);
                if (appItemValueAt.getIndex() > appItem.getIndex()) {
                    appItemValueAt.setIndex(appItemValueAt.getIndex() - 1);
                }
                if (i3 >= size) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        sparseArrayApps.remove(25);
    }

    public final void fixCincoLPai(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap) {
        SparseArray<AppItem> sparseArrayApps;
        AppItem appItem;
        SortableAppItems sortableAppItems = hashMap.get(HMDeviceSource.MILI_CINCO_L);
        if (sortableAppItems == null || (appItem = (sparseArrayApps = sortableAppItems.getSparseArrayApps()).get(25)) == null) {
            return;
        }
        HMLog.info(a, e.a);
        int i2 = 0;
        int size = sparseArrayApps.size();
        if (size > 0) {
            while (true) {
                int i3 = i2 + 1;
                AppItem appItemValueAt = sparseArrayApps.valueAt(i2);
                if (appItemValueAt.getIndex() > appItem.getIndex()) {
                    appItemValueAt.setIndex(appItemValueAt.getIndex() - 1);
                }
                if (i3 >= size) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        sparseArrayApps.remove(25);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi
    public void fixCincoPAI(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap) {
        fixCincoHPai(hashMap);
        fixCincoLPai(hashMap);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi
    public void fixLisbonW(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_LISBON_W;
        SortableAppItems sortableAppItems = hashMap.get(hMDeviceSource);
        boolean z = true;
        if (sortableAppItems != null && sortableAppItems.getSparseArrayApps().indexOfKey(41) < 0 && sortableAppItems.getSparseArrayApps().indexOfKey(16) < 0) {
            z = false;
        }
        HMLog.info(a, new f(z));
        if (z) {
            hashMap.put(hMDeviceSource, new LisbonWSortFactory(hMDeviceSource).createDisplayDefault());
            syncAppSortToDevice(hashMap.get(hMDeviceSource), hMDeviceSource);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi
    public void fixYork(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap) {
        SparseArray<AppItem> sparseArrayApps;
        int size;
        SortableAppItems sortableAppItems = hashMap.get(HMDeviceSource.MILI_YORK);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (sortableAppItems != null && (sparseArrayApps = sortableAppItems.getSparseArrayApps()) != null && (size = sparseArrayApps.size()) > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                int iKeyAt = sparseArrayApps.keyAt(i3);
                AppItem appItemValueAt = sparseArrayApps.valueAt(i3);
                if (iKeyAt != 26) {
                    arrayList.add(appItemValueAt);
                }
                if (i4 >= size) {
                    break;
                } else {
                    i3 = i4;
                }
            }
        }
        SparseArray sparseArray = new SparseArray();
        for (Object obj : arrayList) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            AppItem appItem = (AppItem) obj;
            sparseArray.put(appItem.getType(), appItem);
            i2 = i5;
        }
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_YORK;
        hashMap.put(hMDeviceSource, new SortAppSetting(hMDeviceSource, sparseArray));
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi
    public void syncAppSortDataToDevice(@NotNull SortableAppItems displaySetting, @NotNull HMDeviceSource deviceSource) {
        syncAppSortToDevice(displaySetting, deviceSource);
    }

    public final void syncAppSortToDevice(@NotNull SortableAppItems displaySetting, @NotNull HMDeviceSource deviceSource) {
        if (!ManagerFunctionsKt.getDeviceManagerApi().hasBound(deviceSource)) {
            HMLog.info(a, g.a);
            return;
        }
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) ManagerFunctionsKt.getDeviceManagerApi().getDevice(HMDeviceType.MILI);
        if (hMMiLiProDevice == null || !hMMiLiProDevice.isConnected()) {
            HMLog.info(a, h.a);
        } else {
            if (!ConfigHelperKt.hasFeature(deviceSource, Feature.PROTOCAL_NEW_S)) {
                hMMiLiProDevice.setDisplaySetting(displaySetting, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.devicex.factory.AppSortHelperImpl.syncAppSortToDevice.5

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.devicex.factory.AppSortHelperImpl$syncAppSortToDevice$5$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ boolean a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(boolean z) {
                            super(0);
                            this.a = z;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "ret: " + this.a;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                        onFinish(bool.booleanValue());
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        HMLog.info(AppSortHelperImpl.a, new a(result));
                    }
                });
                return;
            }
            List<PageItem> listTransFromHMDisplaySetting = HMDeviceUtils.transFromHMDisplaySetting(displaySetting);
            kotlin.collections.g.sortWith(listTransFromHMDisplaySetting, new Comparator() { // from class: li
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return AppSortHelperImpl.d((PageItem) obj, (PageItem) obj2);
                }
            });
            hMMiLiProDevice.setPages(listTransFromHMDisplaySetting, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.devicex.factory.AppSortHelperImpl.syncAppSortToDevice.4

                /* JADX INFO: renamed from: com.xiaomi.hm.health.devicex.factory.AppSortHelperImpl$syncAppSortToDevice$4$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "ret: " + this.a;
                    }
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                    onFinish(bool.booleanValue());
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    HMLog.info(AppSortHelperImpl.a, new a(result));
                }
            });
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi
    public void upgradeChongqingTimer(@NotNull HashMap<HMDeviceSource, SortableAppItems> map) {
        SortableAppItems sortableAppItems = map.get(HMDeviceSource.MILI_CHONGQING);
        if (sortableAppItems == null) {
            return;
        }
        if (sortableAppItems.getSparseArrayApps().size() >= HMDisplaySetting.AppTypeChongqing.values().length) {
            HMLog.info(a, i.a);
            return;
        }
        ArrayList<AppItem> arrayList = new ArrayList<>();
        int i2 = 0;
        int size = sortableAppItems.getSparseArrayApps().size();
        if (size > 0) {
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(sortableAppItems.getSparseArrayApps().valueAt(i2));
                if (i3 >= size) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        sortableAppItems.addAppItem(e(arrayList, sortableAppItems.getAppItemByType(HMDisplaySetting.AppTypeChongqing.SETTING.getValue())));
        syncAppSortToDevice(sortableAppItems, HMDeviceSource.MILI_CHONGQING);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi
    public void upgradeCincoNFC(@NotNull HashMap<HMDeviceSource, SortableAppItems> map) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_CINCO;
        SortableAppItems sortableAppItems = map.get(hMDeviceSource);
        if (sortableAppItems != null && sortableAppItems.getAppCount() < 8) {
            HMLog.info(a, j.a);
            map.put(hMDeviceSource, new HMDisplaySetting(9, true));
            syncAppSortToDevice(map.get(hMDeviceSource), hMDeviceSource);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi
    public void upgradeFalcon(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_FALCON;
        SortableAppItems sortableAppItems = hashMap.get(hMDeviceSource);
        if (sortableAppItems == null) {
            return;
        }
        if (sortableAppItems.getSparseArrayApps().size() < 12) {
            HMLog.info(a, k.a);
            hashMap.put(hMDeviceSource, new HMDisplaySetting(19, true));
            syncAppSortDataToDevice(hashMap.get(hMDeviceSource), hMDeviceSource);
        }
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_FALCON_W;
        SortableAppItems sortableAppItems2 = hashMap.get(hMDeviceSource2);
        if (sortableAppItems2 != null && sortableAppItems2.getSparseArrayApps().size() < 11) {
            HMLog.info(a, l.a);
            hashMap.put(hMDeviceSource2, new HMDisplaySetting(20, true));
            syncAppSortDataToDevice(hashMap.get(hMDeviceSource2), hMDeviceSource2);
        }
    }

    public final void upgradePAI(@NotNull HMDeviceSource deviceSource, @NotNull HashMap<HMDeviceSource, SortableAppItems> map, int after, int pai, boolean enable) {
        SortableAppItems sortableAppItems = map.get(deviceSource);
        if (sortableAppItems == null) {
            return;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        int size = sortableAppItems.getSparseArrayApps().size();
        int i2 = 0;
        if (size > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (sortableAppItems.getSparseArrayApps().valueAt(i3).getType() == pai) {
                    booleanRef.element = false;
                    break;
                } else if (i4 >= size) {
                    break;
                } else {
                    i3 = i4;
                }
            }
        }
        HMLog.info(a, new m(booleanRef));
        if (booleanRef.element) {
            int size2 = sortableAppItems.getSparseArrayApps().size();
            if (size2 > 0) {
                while (true) {
                    int i5 = i2 + 1;
                    AppItem appItemValueAt = sortableAppItems.getSparseArrayApps().valueAt(i2);
                    if (appItemValueAt.getType() != after) {
                        appItemValueAt.setIndex(appItemValueAt.getIndex() + 1);
                    }
                    if (i5 >= size2) {
                        break;
                    } else {
                        i2 = i5;
                    }
                }
            }
            sortableAppItems.getSparseArrayApps().put(pai, new AppItem(pai, 1, enable));
            syncAppSortToDevice(sortableAppItems, deviceSource);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi
    public void upgradePAIBeatsW(@NotNull HashMap<HMDeviceSource, SortableAppItems> map) {
        SortableAppItems sortableAppItems = map.get(HMDeviceSource.MILI_BEATS_W);
        if (sortableAppItems == null) {
            return;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        int size = sortableAppItems.getSparseArrayApps().size();
        int i2 = 0;
        if (size > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (sortableAppItems.getSparseArrayApps().valueAt(i3).getType() == HMDisplaySetting.AppTypeBeatsW.PAI.getValue()) {
                    booleanRef.element = false;
                    break;
                } else if (i4 >= size) {
                    break;
                } else {
                    i3 = i4;
                }
            }
        }
        HMLog.info(a, new n(booleanRef));
        if (booleanRef.element) {
            int size2 = sortableAppItems.getSparseArrayApps().size();
            if (size2 > 0) {
                while (true) {
                    int i5 = i2 + 1;
                    AppItem appItemValueAt = sortableAppItems.getSparseArrayApps().valueAt(i2);
                    if (appItemValueAt.getType() != HMDisplaySetting.AppTypeBeatsW.DIAL.getValue()) {
                        appItemValueAt.setIndex(appItemValueAt.getIndex() + 1);
                    }
                    if (i5 >= size2) {
                        break;
                    } else {
                        i2 = i5;
                    }
                }
            }
            SparseArray<AppItem> sparseArrayApps = sortableAppItems.getSparseArrayApps();
            HMDisplaySetting.AppTypeBeatsW appTypeBeatsW = HMDisplaySetting.AppTypeBeatsW.PAI;
            sparseArrayApps.put(appTypeBeatsW.getValue(), new AppItem(appTypeBeatsW.getValue(), 1, true));
            syncAppSortToDevice(sortableAppItems, HMDeviceSource.MILI_BEATS_W);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi
    public void upgradePyh(@NotNull HashMap<HMDeviceSource, SortableAppItems> hashMap) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_PYH;
        SortableAppItems sortableAppItems = hashMap.get(hMDeviceSource);
        if (sortableAppItems == null) {
            return;
        }
        if (sortableAppItems.getSparseArrayApps().size() < 11) {
            HMLog.info(a, o.a);
            hashMap.put(hMDeviceSource, new HMDisplaySetting(17, true));
            syncAppSortDataToDevice(hashMap.get(hMDeviceSource), hMDeviceSource);
        }
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_PYH_W;
        SortableAppItems sortableAppItems2 = hashMap.get(hMDeviceSource2);
        if (sortableAppItems2 != null && sortableAppItems2.getSparseArrayApps().size() < 11) {
            HMLog.info(a, p.a);
            hashMap.put(hMDeviceSource2, new HMDisplaySetting(18, true));
            syncAppSortDataToDevice(hashMap.get(hMDeviceSource2), hMDeviceSource2);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi
    public void upgradeWuhanTimer(@NotNull HashMap<HMDeviceSource, SortableAppItems> map) {
        SortableAppItems sortableAppItems = map.get(HMDeviceSource.MILI_WUHAN);
        if (sortableAppItems == null) {
            return;
        }
        if (sortableAppItems.getSparseArrayApps().size() >= HMDisplaySetting.AppTypeWuhan.values().length) {
            HMLog.info(a, q.a);
            return;
        }
        ArrayList<AppItem> arrayList = new ArrayList<>();
        int i2 = 0;
        int size = sortableAppItems.getSparseArrayApps().size();
        if (size > 0) {
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(sortableAppItems.getSparseArrayApps().valueAt(i2));
                if (i3 >= size) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        sortableAppItems.addAppItem(upgradeWuhanTimerInner(arrayList, sortableAppItems.getAppItemByType(HMDisplaySetting.AppTypeWuhan.SETTING.getValue())));
        syncAppSortToDevice(sortableAppItems, HMDeviceSource.MILI_WUHAN);
    }

    @NotNull
    public final AppItem upgradeWuhanTimerInner(@NotNull ArrayList<AppItem> array, @NotNull AppItem settingItem) {
        int index;
        if (settingItem.isEnable()) {
            index = settingItem.getIndex();
            for (AppItem appItem : array) {
                if (appItem.getIndex() >= index) {
                    appItem.setIndex(appItem.getIndex() + 1);
                }
            }
        } else {
            int iMax = -1;
            for (AppItem appItem2 : array) {
                if (appItem2.isEnable()) {
                    iMax = Math.max(appItem2.getIndex(), iMax);
                }
            }
            for (AppItem appItem3 : array) {
                if (appItem3.getIndex() >= iMax + 1) {
                    appItem3.setIndex(appItem3.getIndex() + 1);
                }
            }
            index = iMax + 1;
        }
        return new AppItem(HMDisplaySetting.AppTypeWuhan.TIMER.getValue(), index, true);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi
    public void upgradePAI(@NotNull HashMap<HMDeviceSource, SortableAppItems> map) {
        upgradePAI(HMDeviceSource.MILI_BEATS, map, HMDisplaySetting.AppTypeBeats.DIAL.getValue(), HMDisplaySetting.AppTypeBeats.PAI.getValue(), true);
        upgradePAI(HMDeviceSource.MILI_ANETO, map, 3, 25, false);
    }
}
