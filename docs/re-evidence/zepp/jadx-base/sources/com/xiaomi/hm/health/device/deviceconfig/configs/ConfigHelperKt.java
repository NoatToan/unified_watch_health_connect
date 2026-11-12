package com.xiaomi.hm.health.device.deviceconfig.configs;

import android.content.Context;
import com.huami.devicex.R;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig;
import com.xiaomi.market.sdk.Constants;
import java.util.BitSet;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\n\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a8\u0010\r\u001a\u00020\u00052.\u0010\f\u001a*\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007j\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t`\u000bH\u0002\u001a\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\b\u001a\u0012\u0010\u0010\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u001a\u000e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\b\u001a\u0016\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\b\u001a\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\b\u001a\u0016\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\b\u001a\u0018\u0010\u001b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u001a\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\b\u001a\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\b\u001a\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\b\u001a\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001f\"\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0 8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#\"A\u0010)\u001a*\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007j\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Ljava/util/BitSet;", "Lcom/xiaomi/hm/health/device/deviceconfig/Feature;", Constants.JSON_FEATURE, "", "value", "", WatchFaceArrivingEvent.CMD_SET, "Ljava/util/HashMap;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lkotlin/Lazy;", "Lcom/xiaomi/hm/health/device/deviceconfig/HMBaseDeviceConfig;", "Lkotlin/collections/HashMap;", SportAnalytics.ParamValue.MapButtonType.MAP, "a", "source", "getDeviceConfig", "hasFeature", "hasMiliFeature", "hasHeadsetFeature", "", "getDeviceDesc", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getDeviceShortDesc", "Ljava/lang/Class;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDeviceClass", "getDevicePageBg", "getDeviceIcon", "getBindingHintTitle", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)Ljava/lang/Integer;", "", "[Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getRepresentSources", "()[Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "representSources", "b", "Ljava/util/HashMap;", "getConfigMap", "()Ljava/util/HashMap;", "configMap", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class ConfigHelperKt {

    @NotNull
    private static final HMDeviceSource[] a;

    @NotNull
    private static final HashMap<HMDeviceSource, Lazy<HMBaseDeviceConfig>> b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/SMART_WATCH_EVEREST_2SW;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SMART_WATCH_EVEREST_2SW> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SMART_WATCH_EVEREST_2SW invoke() {
            return new SMART_WATCH_EVEREST_2SW();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_COMO_WL;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function0<MILI_COMO_WL> {
        public static final a0 a = new a0();

        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_COMO_WL invoke() {
            return new MILI_COMO_WL();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliAndes;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a1 extends Lambda implements Function0<MiliAndes> {
        public static final a1 a = new a1();

        public a1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliAndes invoke() {
            return new MiliAndes();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliBari;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a2 extends Lambda implements Function0<MiliBari> {
        public static final a2 a = new a2();

        public a2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliBari invoke() {
            return new MiliBari();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_DTH;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a3 extends Lambda implements Function0<MILI_DTH> {
        public static final a3 a = new a3();

        public a3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_DTH invoke() {
            return new MILI_DTH();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_PEYTO_WL;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a4 extends Lambda implements Function0<MILI_PEYTO_WL> {
        public static final a4 a = new a4();

        public a4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_PEYTO_WL invoke() {
            return new MILI_PEYTO_WL();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_L66_IN;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a5 extends Lambda implements Function0<MILI_L66_IN> {
        public static final a5 a = new a5();

        public a5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_L66_IN invoke() {
            return new MILI_L66_IN();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/SMART_WATCH_EVEREST_2W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SMART_WATCH_EVEREST_2W> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SMART_WATCH_EVEREST_2W invoke() {
            return new SMART_WATCH_EVEREST_2W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliCraterW;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b0 extends Lambda implements Function0<MiliCraterW> {
        public static final b0 a = new b0();

        public b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliCraterW invoke() {
            return new MiliCraterW();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliAndesW;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b1 extends Lambda implements Function0<MiliAndesW> {
        public static final b1 a = new b1();

        public b1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliAndesW invoke() {
            return new MiliAndesW();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliBariNFC;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b2 extends Lambda implements Function0<MiliBariNFC> {
        public static final b2 a = new b2();

        public b2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliBariNFC invoke() {
            return new MiliBariNFC();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_BEATS_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b3 extends Lambda implements Function0<MILI_BEATS_W> {
        public static final b3 a = new b3();

        public b3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_BEATS_W invoke() {
            return new MILI_BEATS_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WEIGHT;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b4 extends Lambda implements Function0<WEIGHT> {
        public static final b4 a = new b4();

        public b4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WEIGHT invoke() {
            return new WEIGHT();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_L66_NFC;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b5 extends Lambda implements Function0<MILI_L66_NFC> {
        public static final b5 a = new b5();

        public b5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_L66_NFC invoke() {
            return new MILI_L66_NFC();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/SMART_WATCH_EVEREST_2_STAR_WAR;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<SMART_WATCH_EVEREST_2_STAR_WAR> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SMART_WATCH_EVEREST_2_STAR_WAR invoke() {
            return new SMART_WATCH_EVEREST_2_STAR_WAR();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliCraterWL;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c0 extends Lambda implements Function0<MiliCraterWL> {
        public static final c0 a = new c0();

        public c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliCraterWL invoke() {
            return new MiliCraterWL();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/SHOES_MARS;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c1 extends Lambda implements Function0<SHOES_MARS> {
        public static final c1 a = new c1();

        public c1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SHOES_MARS invoke() {
            return new SHOES_MARS();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliBariW;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c2 extends Lambda implements Function0<MiliBariW> {
        public static final c2 a = new c2();

        public c2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliBariW invoke() {
            return new MiliBariW();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_DTH_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c3 extends Lambda implements Function0<MILI_DTH_W> {
        public static final c3 a = new c3();

        public c3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_DTH_W invoke() {
            return new MILI_DTH_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_HAWK_L;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c4 extends Lambda implements Function0<MILI_HAWK_L> {
        public static final c4 a = new c4();

        public c4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_HAWK_L invoke() {
            return new MILI_HAWK_L();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_L66_NFC_I;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c5 extends Lambda implements Function0<MILI_L66_NFC_I> {
        public static final c5 a = new c5();

        public c5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_L66_NFC_I invoke() {
            return new MILI_L66_NFC_I();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_TOKYO;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<MILI_TOKYO> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_TOKYO invoke() {
            return new MILI_TOKYO();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_NESS;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d0 extends Lambda implements Function0<MILI_NESS> {
        public static final d0 a = new d0();

        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_NESS invoke() {
            return new MILI_NESS();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliTeide;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d1 extends Lambda implements Function0<MiliTeide> {
        public static final d1 a = new d1();

        public d1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliTeide invoke() {
            return new MiliTeide();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliLeiden;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d2 extends Lambda implements Function0<MiliLeiden> {
        public static final d2 a = new d2();

        public d2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliLeiden invoke() {
            return new MiliLeiden();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_CINCO;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d3 extends Lambda implements Function0<MILI_CINCO> {
        public static final d3 a = new d3();

        public d3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_CINCO invoke() {
            return new MILI_CINCO();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_HAWK_WL;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d4 extends Lambda implements Function0<MILI_HAWK_WL> {
        public static final d4 a = new d4();

        public d4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_HAWK_WL invoke() {
            return new MILI_HAWK_WL();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_L66_WE;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d5 extends Lambda implements Function0<MILI_L66_WE> {
        public static final d5 a = new d5();

        public d5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_L66_WE invoke() {
            return new MILI_L66_WE();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_OSPREY;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<MILI_OSPREY> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_OSPREY invoke() {
            return new MILI_OSPREY();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_NESS_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e0 extends Lambda implements Function0<MILI_NESS_W> {
        public static final e0 a = new e0();

        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_NESS_W invoke() {
            return new MILI_NESS_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliTeideW;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e1 extends Lambda implements Function0<MiliTeideW> {
        public static final e1 a = new e1();

        public e1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliTeideW invoke() {
            return new MiliTeideW();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliLeidenW;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e2 extends Lambda implements Function0<MiliLeidenW> {
        public static final e2 a = new e2();

        public e2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliLeidenW invoke() {
            return new MiliLeidenW();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_CINCO_L;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e3 extends Lambda implements Function0<MILI_CINCO_L> {
        public static final e3 a = new e3();

        public e3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_CINCO_L invoke() {
            return new MILI_CINCO_L();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_FALCON_L;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e4 extends Lambda implements Function0<MILI_FALCON_L> {
        public static final e4 a = new e4();

        public e4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_FALCON_L invoke() {
            return new MILI_FALCON_L();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/OTHER_BM;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e5 extends Lambda implements Function0<OTHER_BM> {
        public static final e5 a = new e5();

        public e5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OTHER_BM invoke() {
            return new OTHER_BM();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_OSPREY_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<MILI_OSPREY_W> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_OSPREY_W invoke() {
            return new MILI_OSPREY_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliWast;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f0 extends Lambda implements Function0<MiliWast> {
        public static final f0 a = new f0();

        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliWast invoke() {
            return new MiliWast();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILIZurich;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f1 extends Lambda implements Function0<MILIZurich> {
        public static final f1 a = new f1();

        public f1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILIZurich invoke() {
            return new MILIZurich();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliMadridHML;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f2 extends Lambda implements Function0<MiliMadridHML> {
        public static final f2 a = new f2();

        public f2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliMadridHML invoke() {
            return new MiliMadridHML();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_1A;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f3 extends Lambda implements Function0<MILI_1A> {
        public static final f3 a = new f3();

        public f3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_1A invoke() {
            return new MILI_1A();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_FALCON_WL;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f4 extends Lambda implements Function0<MILI_FALCON_WL> {
        public static final f4 a = new f4();

        public f4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_FALCON_WL invoke() {
            return new MILI_FALCON_WL();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/OTHER_BOLT;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f5 extends Lambda implements Function0<OTHER_BOLT> {
        public static final f5 a = new f5();

        public f5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OTHER_BOLT invoke() {
            return new OTHER_BOLT();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_OSPREY_C;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<MILI_OSPREY_C> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_OSPREY_C invoke() {
            return new MILI_OSPREY_C();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/SHOES_LIGHT;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g0 extends Lambda implements Function0<SHOES_LIGHT> {
        public static final g0 a = new g0();

        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SHOES_LIGHT invoke() {
            return new SHOES_LIGHT();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILIZurichW;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g1 extends Lambda implements Function0<MILIZurichW> {
        public static final g1 a = new g1();

        public g1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILIZurichW invoke() {
            return new MILIZurichW();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WATCH_EVEREST_2S;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g2 extends Lambda implements Function0<WATCH_EVEREST_2S> {
        public static final g2 a = new g2();

        public g2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WATCH_EVEREST_2S invoke() {
            return new WATCH_EVEREST_2S();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_TONLESAP;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g3 extends Lambda implements Function0<MILI_TONLESAP> {
        public static final g3 a = new g3();

        public g3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_TONLESAP invoke() {
            return new MILI_TONLESAP();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_KESTREL_L;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g4 extends Lambda implements Function0<MILI_KESTREL_L> {
        public static final g4 a = new g4();

        public g4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_KESTREL_L invoke() {
            return new MILI_KESTREL_L();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/OTHER_BOLT_SECOND;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g5 extends Lambda implements Function0<OTHER_BOLT_SECOND> {
        public static final g5 a = new g5();

        public g5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OTHER_BOLT_SECOND invoke() {
            return new OTHER_BOLT_SECOND();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_LISBON;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<MILI_LISBON> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_LISBON invoke() {
            return new MILI_LISBON();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliWastW;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h0 extends Lambda implements Function0<MiliWastW> {
        public static final h0 a = new h0();

        public h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliWastW invoke() {
            return new MiliWastW();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILIVerona;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h1 extends Lambda implements Function0<MILIVerona> {
        public static final h1 a = new h1();

        public h1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILIVerona invoke() {
            return new MILIVerona();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WATCH_AMAZFIT_QOG;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h2 extends Lambda implements Function0<WATCH_AMAZFIT_QOG> {
        public static final h2 a = new h2();

        public h2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WATCH_AMAZFIT_QOG invoke() {
            return new WATCH_AMAZFIT_QOG();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_TONLESAP_L;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h3 extends Lambda implements Function0<MILI_TONLESAP_L> {
        public static final h3 a = new h3();

        public h3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_TONLESAP_L invoke() {
            return new MILI_TONLESAP_L();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_KESTREL_WL;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h4 extends Lambda implements Function0<MILI_KESTREL_WL> {
        public static final h4 a = new h4();

        public h4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_KESTREL_WL invoke() {
            return new MILI_KESTREL_WL();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/HEADSET_MOZART;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h5 extends Lambda implements Function0<HEADSET_MOZART> {
        public static final h5 a = new h5();

        public h5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HEADSET_MOZART invoke() {
            return new HEADSET_MOZART();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_LISBON_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<MILI_LISBON_W> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_LISBON_W invoke() {
            return new MILI_LISBON_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_DAX;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i0 extends Lambda implements Function0<MILI_DAX> {
        public static final i0 a = new i0();

        public i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_DAX invoke() {
            return new MILI_DAX();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILIVeronaW;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i1 extends Lambda implements Function0<MILIVeronaW> {
        public static final i1 a = new i1();

        public i1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILIVeronaW invoke() {
            return new MILIVeronaW();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WATCH_XIHU;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i2 extends Lambda implements Function0<WATCH_XIHU> {
        public static final i2 a = new i2();

        public i2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WATCH_XIHU invoke() {
            return new WATCH_XIHU();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_TONLESAP_O;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i3 extends Lambda implements Function0<MILI_TONLESAP_O> {
        public static final i3 a = new i3();

        public i3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_TONLESAP_O invoke() {
            return new MILI_TONLESAP_O();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_ATHENS;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i4 extends Lambda implements Function0<MILI_ATHENS> {
        public static final i4 a = new i4();

        public i4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_ATHENS invoke() {
            return new MILI_ATHENS();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WEIGHT_SCALE2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i5 extends Lambda implements Function0<WEIGHT_SCALE2> {
        public static final i5 a = new i5();

        public i5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WEIGHT_SCALE2 invoke() {
            return new WEIGHT_SCALE2();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_LINCS;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<MILI_LINCS> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_LINCS invoke() {
            return new MILI_LINCS();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_LONDON;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j0 extends Lambda implements Function0<MILI_LONDON> {
        public static final j0 a = new j0();

        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_LONDON invoke() {
            return new MILI_LONDON();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_OSAKA;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j1 extends Lambda implements Function0<MILI_OSAKA> {
        public static final j1 a = new j1();

        public j1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_OSAKA invoke() {
            return new MILI_OSAKA();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/VDEVICE;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j2 extends Lambda implements Function0<VDEVICE> {
        public static final j2 a = new j2();

        public j2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VDEVICE invoke() {
            return new VDEVICE();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_TONLESAP_OL;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j3 extends Lambda implements Function0<MILI_TONLESAP_OL> {
        public static final j3 a = new j3();

        public j3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_TONLESAP_OL invoke() {
            return new MILI_TONLESAP_OL();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_VULTURE;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j4 extends Lambda implements Function0<MILI_VULTURE> {
        public static final j4 a = new j4();

        public j4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_VULTURE invoke() {
            return new MILI_VULTURE();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/HeadsetHaydn;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j5 extends Lambda implements Function0<HeadsetHaydn> {
        public static final j5 a = new j5();

        public j5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HeadsetHaydn invoke() {
            return new HeadsetHaydn();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/SHOES;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<SHOES> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SHOES invoke() {
            return new SHOES();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_LONDON_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k0 extends Lambda implements Function0<MILI_LONDON_W> {
        public static final k0 a = new k0();

        public k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_LONDON_W invoke() {
            return new MILI_LONDON_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_OSAKA_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k1 extends Lambda implements Function0<MILI_OSAKA_W> {
        public static final k1 a = new k1();

        public k1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_OSAKA_W invoke() {
            return new MILI_OSAKA_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WATCH_XIHU_E;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k2 extends Lambda implements Function0<WATCH_XIHU_E> {
        public static final k2 a = new k2();

        public k2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WATCH_XIHU_E invoke() {
            return new WATCH_XIHU_E();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_PYH;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k3 extends Lambda implements Function0<MILI_PYH> {
        public static final k3 a = new k3();

        public k3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_PYH invoke() {
            return new MILI_PYH();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_YORK;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k4 extends Lambda implements Function0<MILI_YORK> {
        public static final k4 a = new k4();

        public k4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_YORK invoke() {
            return new MILI_YORK();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/HeadsetLullaby;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k5 extends Lambda implements Function0<HeadsetLullaby> {
        public static final k5 a = new k5();

        public k5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HeadsetLullaby invoke() {
            return new HeadsetLullaby();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_LINCS_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<MILI_LINCS_W> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_LINCS_W invoke() {
            return new MILI_LINCS_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_BLANC;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l0 extends Lambda implements Function0<MILI_BLANC> {
        public static final l0 a = new l0();

        public l0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_BLANC invoke() {
            return new MILI_BLANC();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_BLED_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l1 extends Lambda implements Function0<MILI_BLED_W> {
        public static final l1 a = new l1();

        public l1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_BLED_W invoke() {
            return new MILI_BLED_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WATCH_XIHU_EA;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l2 extends Lambda implements Function0<WATCH_XIHU_EA> {
        public static final l2 a = new l2();

        public l2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WATCH_XIHU_EA invoke() {
            return new WATCH_XIHU_EA();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_RIO;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l3 extends Lambda implements Function0<MILI_RIO> {
        public static final l3 a = new l3();

        public l3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_RIO invoke() {
            return new MILI_RIO();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_CORSICA;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l4 extends Lambda implements Function0<MILI_CORSICA> {
        public static final l4 a = new l4();

        public l4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_CORSICA invoke() {
            return new MILI_CORSICA();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WATCH_AMAZFIT_XIHU;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l5 extends Lambda implements Function0<WATCH_AMAZFIT_XIHU> {
        public static final l5 a = new l5();

        public l5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WATCH_AMAZFIT_XIHU invoke() {
            return new WATCH_AMAZFIT_XIHU();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_NEWTON;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<MILI_NEWTON> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_NEWTON invoke() {
            return new MILI_NEWTON();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_BLANC_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m0 extends Lambda implements Function0<MILI_BLANC_W> {
        public static final m0 a = new m0();

        public m0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_BLANC_W invoke() {
            return new MILI_BLANC_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_BLED_PRO;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m1 extends Lambda implements Function0<MILI_BLED_PRO> {
        public static final m1 a = new m1();

        public m1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_BLED_PRO invoke() {
            return new MILI_BLED_PRO();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_AMAZFIT;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m2 extends Lambda implements Function0<MILI_AMAZFIT> {
        public static final m2 a = new m2();

        public m2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_AMAZFIT invoke() {
            return new MILI_AMAZFIT();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_JIUHUASHAN;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m3 extends Lambda implements Function0<MILI_JIUHUASHAN> {
        public static final m3 a = new m3();

        public m3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_JIUHUASHAN invoke() {
            return new MILI_JIUHUASHAN();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WEIGHT_BODYFAT;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m4 extends Lambda implements Function0<WEIGHT_BODYFAT> {
        public static final m4 a = new m4();

        public m4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WEIGHT_BODYFAT invoke() {
            return new WEIGHT_BODYFAT();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WATCH_AMAZFIT_XIHU_E;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m5 extends Lambda implements Function0<WATCH_AMAZFIT_XIHU_E> {
        public static final m5 a = new m5();

        public m5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WATCH_AMAZFIT_XIHU_E invoke() {
            return new WATCH_AMAZFIT_XIHU_E();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_NEWTON_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<MILI_NEWTON_W> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_NEWTON_W invoke() {
            return new MILI_NEWTON_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_HAMBURG;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n0 extends Lambda implements Function0<MILI_HAMBURG> {
        public static final n0 a = new n0();

        public n0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_HAMBURG invoke() {
            return new MILI_HAMBURG();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WATCH_AMAZFIT;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n1 extends Lambda implements Function0<WATCH_AMAZFIT> {
        public static final n1 a = new n1();

        public n1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WATCH_AMAZFIT invoke() {
            return new WATCH_AMAZFIT();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_PRO_OLD;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n2 extends Lambda implements Function0<MILI_PRO_OLD> {
        public static final n2 a = new n2();

        public n2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_PRO_OLD invoke() {
            return new MILI_PRO_OLD();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_QINLING_S2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n3 extends Lambda implements Function0<MILI_QINLING_S2> {
        public static final n3 a = new n3();

        public n3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_QINLING_S2 invoke() {
            return new MILI_QINLING_S2();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_CORSICA_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n4 extends Lambda implements Function0<MILI_CORSICA_W> {
        public static final n4 a = new n4();

        public n4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_CORSICA_W invoke() {
            return new MILI_CORSICA_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WATCH_AMAZFIT_XIHU_EA;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n5 extends Lambda implements Function0<WATCH_AMAZFIT_XIHU_EA> {
        public static final n5 a = new n5();

        public n5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WATCH_AMAZFIT_XIHU_EA invoke() {
            return new WATCH_AMAZFIT_XIHU_EA();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_PRAGUE;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<MILI_PRAGUE> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_PRAGUE invoke() {
            return new MILI_PRAGUE();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_BONN;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o0 extends Lambda implements Function0<MILI_BONN> {
        public static final o0 a = new o0();

        public o0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_BONN invoke() {
            return new MILI_BONN();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_BLED_PRO_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o1 extends Lambda implements Function0<MILI_BLED_PRO_W> {
        public static final o1 a = new o1();

        public o1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_BLED_PRO_W invoke() {
            return new MILI_BLED_PRO_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_PRO;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o2 extends Lambda implements Function0<MILI_PRO> {
        public static final o2 a = new o2();

        public o2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_PRO invoke() {
            return new MILI_PRO();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_PYH_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o3 extends Lambda implements Function0<MILI_PYH_W> {
        public static final o3 a = new o3();

        public o3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_PYH_W invoke() {
            return new MILI_PYH_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_ANETO;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o4 extends Lambda implements Function0<MILI_ANETO> {
        public static final o4 a = new o4();

        public o4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_ANETO invoke() {
            return new MILI_ANETO();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WATCH_AMAZFIT_XIHU_DISNEY;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o5 extends Lambda implements Function0<WATCH_AMAZFIT_XIHU_DISNEY> {
        public static final o5 a = new o5();

        public o5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WATCH_AMAZFIT_XIHU_DISNEY invoke() {
            return new WATCH_AMAZFIT_XIHU_DISNEY();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_PRAGUE_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<MILI_PRAGUE_W> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_PRAGUE_W invoke() {
            return new MILI_PRAGUE_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_HAMBURG_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p0 extends Lambda implements Function0<MILI_HAMBURG_W> {
        public static final p0 a = new p0();

        public p0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_HAMBURG_W invoke() {
            return new MILI_HAMBURG_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_BLED;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p1 extends Lambda implements Function0<MILI_BLED> {
        public static final p1 a = new p1();

        public p1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_BLED invoke() {
            return new MILI_BLED();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_ROCKY;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p2 extends Lambda implements Function0<MILI_ROCKY> {
        public static final p2 a = new p2();

        public p2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_ROCKY invoke() {
            return new MILI_ROCKY();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_FALCON;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p3 extends Lambda implements Function0<MILI_FALCON> {
        public static final p3 a = new p3();

        public p3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_FALCON invoke() {
            return new MILI_FALCON();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_KONGMING;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p4 extends Lambda implements Function0<MILI_KONGMING> {
        public static final p4 a = new p4();

        public p4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_KONGMING invoke() {
            return new MILI_KONGMING();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_HAWK_SWK;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p5 extends Lambda implements Function0<MILI_HAWK_SWK> {
        public static final p5 a = new p5();

        public p5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_HAWK_SWK invoke() {
            return new MILI_HAWK_SWK();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliVolga;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<MiliVolga> {
        public static final q a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliVolga invoke() {
            return new MiliVolga();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_BONN_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q0 extends Lambda implements Function0<MILI_BONN_W> {
        public static final q0 a = new q0();

        public q0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_BONN_W invoke() {
            return new MILI_BONN_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_CANNES_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q1 extends Lambda implements Function0<MILI_CANNES_W> {
        public static final q1 a = new q1();

        public q1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_CANNES_W invoke() {
            return new MILI_CANNES_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_NFC;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q2 extends Lambda implements Function0<MILI_NFC> {
        public static final q2 a = new q2();

        public q2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_NFC invoke() {
            return new MILI_NFC();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_1S;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q3 extends Lambda implements Function0<MILI_1S> {
        public static final q3 a = new q3();

        public q3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_1S invoke() {
            return new MILI_1S();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_KONGMING_L;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q4 extends Lambda implements Function0<MILI_KONGMING_L> {
        public static final q4 a = new q4();

        public q4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_KONGMING_L invoke() {
            return new MILI_KONGMING_L();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_HAWK_SWK_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q5 extends Lambda implements Function0<MILI_HAWK_SWK_W> {
        public static final q5 a = new q5();

        public q5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_HAWK_SWK_W invoke() {
            return new MILI_HAWK_SWK_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliVolgaW;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<MiliVolgaW> {
        public static final r a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliVolgaW invoke() {
            return new MiliVolgaW();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/SHOES_SPRANDI;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r0 extends Lambda implements Function0<SHOES_SPRANDI> {
        public static final r0 a = new r0();

        public r0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SHOES_SPRANDI invoke() {
            return new SHOES_SPRANDI();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_CANNES;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r1 extends Lambda implements Function0<MILI_CANNES> {
        public static final r1 a = new r1();

        public r1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_CANNES invoke() {
            return new MILI_CANNES();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_QINLING;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r2 extends Lambda implements Function0<MILI_QINLING> {
        public static final r2 a = new r2();

        public r2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_QINLING invoke() {
            return new MILI_QINLING();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_ONYX;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r3 extends Lambda implements Function0<MILI_ONYX> {
        public static final r3 a = new r3();

        public r3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_ONYX invoke() {
            return new MILI_ONYX();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_KONGMING_PRO;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r4 extends Lambda implements Function0<MILI_KONGMING_PRO> {
        public static final r4 a = new r4();

        public r4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_KONGMING_PRO invoke() {
            return new MILI_KONGMING_PRO();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/SMART_WATCH_EVEREST_2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r5 extends Lambda implements Function0<SMART_WATCH_EVEREST_2> {
        public static final r5 a = new r5();

        public r5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SMART_WATCH_EVEREST_2 invoke() {
            return new SMART_WATCH_EVEREST_2();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_VENICE;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<MILI_VENICE> {
        public static final s a = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_VENICE invoke() {
            return new MILI_VENICE();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/FITBIT_IONIC;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s0 extends Lambda implements Function0<FITBIT_IONIC> {
        public static final s0 a = new s0();

        public s0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FITBIT_IONIC invoke() {
            return new FITBIT_IONIC();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_SOFIA;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s1 extends Lambda implements Function0<MILI_SOFIA> {
        public static final s1 a = new s1();

        public s1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_SOFIA invoke() {
            return new MILI_SOFIA();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_PEYTO;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s2 extends Lambda implements Function0<MILI_PEYTO> {
        public static final s2 a = new s2();

        public s2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_PEYTO invoke() {
            return new MILI_PEYTO();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_ONYX_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s3 extends Lambda implements Function0<MILI_ONYX_W> {
        public static final s3 a = new s3();

        public s3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_ONYX_W invoke() {
            return new MILI_ONYX_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_KONGMING_PRO_L;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s4 extends Lambda implements Function0<MILI_KONGMING_PRO_L> {
        public static final s4 a = new s4();

        public s4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_KONGMING_PRO_L invoke() {
            return new MILI_KONGMING_PRO_L();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/SMART_WATCH_EVEREST_2S;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s5 extends Lambda implements Function0<SMART_WATCH_EVEREST_2S> {
        public static final s5 a = new s5();

        public s5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SMART_WATCH_EVEREST_2S invoke() {
            return new SMART_WATCH_EVEREST_2S();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_VENICE_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<MILI_VENICE_W> {
        public static final t a = new t();

        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_VENICE_W invoke() {
            return new MILI_VENICE_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/FITBIT_VERSA;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t0 extends Lambda implements Function0<FITBIT_VERSA> {
        public static final t0 a = new t0();

        public t0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FITBIT_VERSA invoke() {
            return new FITBIT_VERSA();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_SOFIA_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t1 extends Lambda implements Function0<MILI_SOFIA_W> {
        public static final t1 a = new t1();

        public t1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_SOFIA_W invoke() {
            return new MILI_SOFIA_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_TEMPO;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t2 extends Lambda implements Function0<MILI_TEMPO> {
        public static final t2 a = new t2();

        public t2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_TEMPO invoke() {
            return new MILI_TEMPO();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_FALCON_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t3 extends Lambda implements Function0<MILI_FALCON_W> {
        public static final t3 a = new t3();

        public t3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_FALCON_W invoke() {
            return new MILI_FALCON_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_KONGMING_LITE;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t4 extends Lambda implements Function0<MILI_KONGMING_LITE> {
        public static final t4 a = new t4();

        public t4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_KONGMING_LITE invoke() {
            return new MILI_KONGMING_LITE();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/SENSORHUB;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t5 extends Lambda implements Function0<SENSORHUB> {
        public static final t5 a = new t5();

        public t5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SENSORHUB invoke() {
            return new SENSORHUB();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/EARBUD_CHOPIN;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<EARBUD_CHOPIN> {
        public static final u a = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EARBUD_CHOPIN invoke() {
            return new EARBUD_CHOPIN();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/FITBIT_VERSA_2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u0 extends Lambda implements Function0<FITBIT_VERSA_2> {
        public static final u0 a = new u0();

        public u0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FITBIT_VERSA_2 invoke() {
            return new FITBIT_VERSA_2();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_LISBON_WL;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u1 extends Lambda implements Function0<MILI_LISBON_WL> {
        public static final u1 a = new u1();

        public u1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_LISBON_WL invoke() {
            return new MILI_LISBON_WL();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u2 extends Lambda implements Function0<MILI> {
        public static final u2 a = new u2();

        public u2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI invoke() {
            return new MILI();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_FALCON_DISNEY;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u3 extends Lambda implements Function0<MILI_FALCON_DISNEY> {
        public static final u3 a = new u3();

        public u3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_FALCON_DISNEY invoke() {
            return new MILI_FALCON_DISNEY();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_PANGU;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u4 extends Lambda implements Function0<MILI_PANGU> {
        public static final u4 a = new u4();

        public u4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_PANGU invoke() {
            return new MILI_PANGU();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/Florence;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u5 extends Lambda implements Function0<Florence> {
        public static final u5 a = new u5();

        public u5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Florence invoke() {
            return new Florence(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/SHOES_CHILD;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<SHOES_CHILD> {
        public static final v a = new v();

        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SHOES_CHILD invoke() {
            return new SHOES_CHILD();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/FITBIT_VERSA_LITE;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v0 extends Lambda implements Function0<FITBIT_VERSA_LITE> {
        public static final v0 a = new v0();

        public v0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FITBIT_VERSA_LITE invoke() {
            return new FITBIT_VERSA_LITE();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_NEWTON_WL;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v1 extends Lambda implements Function0<MILI_NEWTON_WL> {
        public static final v1 a = new v1();

        public v1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_NEWTON_WL invoke() {
            return new MILI_NEWTON_WL();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_PRO_I;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v2 extends Lambda implements Function0<MILI_PRO_I> {
        public static final v2 a = new v2();

        public v2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_PRO_I invoke() {
            return new MILI_PRO_I();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_HAWK;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v3 extends Lambda implements Function0<MILI_HAWK> {
        public static final v3 a = new v3();

        public v3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_HAWK invoke() {
            return new MILI_HAWK();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_PANGU_L;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v4 extends Lambda implements Function0<MILI_PANGU_L> {
        public static final v4 a = new v4();

        public v4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_PANGU_L invoke() {
            return new MILI_PANGU_L();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/Florence;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v5 extends Lambda implements Function0<Florence> {
        public static final v5 a = new v5();

        public v5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Florence invoke() {
            return new Florence(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WEIGHT_AMAZFIT_SCALE;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<WEIGHT_AMAZFIT_SCALE> {
        public static final w a = new w();

        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WEIGHT_AMAZFIT_SCALE invoke() {
            return new WEIGHT_AMAZFIT_SCALE();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_MADRID;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w0 extends Lambda implements Function0<MILI_MADRID> {
        public static final w0 a = new w0();

        public w0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_MADRID invoke() {
            return new MILI_MADRID();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliProvence;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w1 extends Lambda implements Function0<MiliProvence> {
        public static final w1 a = new w1();

        public w1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliProvence invoke() {
            return new MiliProvence(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_WUHAN;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w2 extends Lambda implements Function0<MILI_WUHAN> {
        public static final w2 a = new w2();

        public w2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_WUHAN invoke() {
            return new MILI_WUHAN();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_HAWK_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w3 extends Lambda implements Function0<MILI_HAWK_W> {
        public static final w3 a = new w3();

        public w3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_HAWK_W invoke() {
            return new MILI_HAWK_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_L66;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w4 extends Lambda implements Function0<MILI_L66> {
        public static final w4 a = new w4();

        public w4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_L66 invoke() {
            return new MILI_L66();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/Berlin;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w5 extends Lambda implements Function0<Berlin> {
        public static final w5 a = new w5();

        public w5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Berlin invoke() {
            return new Berlin(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_COMO;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<MILI_COMO> {
        public static final x a = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_COMO invoke() {
            return new MILI_COMO();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_MADRID_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x0 extends Lambda implements Function0<MILI_MADRID_W> {
        public static final x0 a = new x0();

        public x0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_MADRID_W invoke() {
            return new MILI_MADRID_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliProvenceW;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x1 extends Lambda implements Function0<MiliProvenceW> {
        public static final x1 a = new x1();

        public x1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliProvenceW invoke() {
            return new MiliProvenceW();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_BEATS;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x2 extends Lambda implements Function0<MILI_BEATS> {
        public static final x2 a = new x2();

        public x2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_BEATS invoke() {
            return new MILI_BEATS();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_PEYTO_L;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x3 extends Lambda implements Function0<MILI_PEYTO_L> {
        public static final x3 a = new x3();

        public x3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_PEYTO_L invoke() {
            return new MILI_PEYTO_L();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WEIGHT_BFS;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x4 extends Lambda implements Function0<WEIGHT_BFS> {
        public static final x4 a = new x4();

        public x4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WEIGHT_BFS invoke() {
            return new WEIGHT_BFS();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/Berlin;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x5 extends Lambda implements Function0<Berlin> {
        public static final x5 a = new x5();

        public x5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Berlin invoke() {
            return new Berlin(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_COMO_L;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<MILI_COMO_L> {
        public static final y a = new y();

        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_COMO_L invoke() {
            return new MILI_COMO_L();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliVienna;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y0 extends Lambda implements Function0<MiliVienna> {
        public static final y0 a = new y0();

        public y0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliVienna invoke() {
            return new MiliVienna();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WATCH_EVEREST;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y1 extends Lambda implements Function0<WATCH_EVEREST> {
        public static final y1 a = new y1();

        public y1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WATCH_EVEREST invoke() {
            return new WATCH_EVEREST();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_CHONGQING;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y2 extends Lambda implements Function0<MILI_CHONGQING> {
        public static final y2 a = new y2();

        public y2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_CHONGQING invoke() {
            return new MILI_CHONGQING();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_KESTREL;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y3 extends Lambda implements Function0<MILI_KESTREL> {
        public static final y3 a = new y3();

        public y3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_KESTREL invoke() {
            return new MILI_KESTREL();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_L66_AP;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y4 extends Lambda implements Function0<MILI_L66_AP> {
        public static final y4 a = new y4();

        public y4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_L66_AP invoke() {
            return new MILI_L66_AP();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/Berlin;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y5 extends Lambda implements Function0<Berlin> {
        public static final y5 a = new y5();

        public y5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Berlin invoke() {
            return new Berlin(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_COMO_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends Lambda implements Function0<MILI_COMO_W> {
        public static final z a = new z();

        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_COMO_W invoke() {
            return new MILI_COMO_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliViennaW;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z0 extends Lambda implements Function0<MiliViennaW> {
        public static final z0 a = new z0();

        public z0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliViennaW invoke() {
            return new MiliViennaW();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliProvenceWNFC;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z1 extends Lambda implements Function0<MiliProvenceWNFC> {
        public static final z1 a = new z1();

        public z1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiliProvenceWNFC invoke() {
            return new MiliProvenceWNFC();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_BEATS_P;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z2 extends Lambda implements Function0<MILI_BEATS_P> {
        public static final z2 a = new z2();

        public z2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_BEATS_P invoke() {
            return new MILI_BEATS_P();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_KESTREL_W;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z3 extends Lambda implements Function0<MILI_KESTREL_W> {
        public static final z3 a = new z3();

        public z3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_KESTREL_W invoke() {
            return new MILI_KESTREL_W();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_L66_I;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z4 extends Lambda implements Function0<MILI_L66_I> {
        public static final z4 a = new z4();

        public z4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MILI_L66_I invoke() {
            return new MILI_L66_I();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/Berlin;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z5 extends Lambda implements Function0<Berlin> {
        public static final z5 a = new z5();

        public z5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Berlin invoke() {
            return new Berlin(true);
        }
    }

    static {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_PRO;
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_ROCKY;
        HMDeviceSource hMDeviceSource3 = HMDeviceSource.MILI_NFC;
        HMDeviceSource hMDeviceSource4 = HMDeviceSource.MILI_QINLING;
        HMDeviceSource hMDeviceSource5 = HMDeviceSource.MILI_PEYTO;
        HMDeviceSource hMDeviceSource6 = HMDeviceSource.MILI_TEMPO;
        HMDeviceSource hMDeviceSource7 = HMDeviceSource.MILI_PRO_I;
        HMDeviceSource hMDeviceSource8 = HMDeviceSource.MILI_WUHAN;
        HMDeviceSource hMDeviceSource9 = HMDeviceSource.MILI_BEATS;
        HMDeviceSource hMDeviceSource10 = HMDeviceSource.MILI_CHONGQING;
        HMDeviceSource hMDeviceSource11 = HMDeviceSource.MILI_BEATS_P;
        HMDeviceSource hMDeviceSource12 = HMDeviceSource.MILI_DTH;
        HMDeviceSource hMDeviceSource13 = HMDeviceSource.MILI_BEATS_W;
        HMDeviceSource hMDeviceSource14 = HMDeviceSource.MILI_DTH_W;
        HMDeviceSource hMDeviceSource15 = HMDeviceSource.MILI_CINCO;
        HMDeviceSource hMDeviceSource16 = HMDeviceSource.MILI_TONLESAP;
        HMDeviceSource hMDeviceSource17 = HMDeviceSource.MILI_TONLESAP_OL;
        HMDeviceSource hMDeviceSource18 = HMDeviceSource.MILI_PYH;
        HMDeviceSource hMDeviceSource19 = HMDeviceSource.MILI_RIO;
        HMDeviceSource hMDeviceSource20 = HMDeviceSource.MILI_FALCON;
        HMDeviceSource hMDeviceSource21 = HMDeviceSource.MILI_FALCON_L;
        HMDeviceSource hMDeviceSource22 = HMDeviceSource.MILI_HAWK;
        HMDeviceSource hMDeviceSource23 = HMDeviceSource.MILI_PEYTO_L;
        HMDeviceSource hMDeviceSource24 = HMDeviceSource.MILI_KESTREL;
        HMDeviceSource hMDeviceSource25 = HMDeviceSource.MILI_KESTREL_L;
        HMDeviceSource hMDeviceSource26 = HMDeviceSource.MILI_ATHENS;
        HMDeviceSource hMDeviceSource27 = HMDeviceSource.MILI_VULTURE;
        HMDeviceSource hMDeviceSource28 = HMDeviceSource.MILI_HAWK_SWK;
        HMDeviceSource hMDeviceSource29 = HMDeviceSource.MILI_TOKYO;
        HMDeviceSource hMDeviceSource30 = HMDeviceSource.MILI_OSAKA;
        HMDeviceSource hMDeviceSource31 = HMDeviceSource.MILI_OSAKA_W;
        HMDeviceSource hMDeviceSource32 = HMDeviceSource.MILI_KONGMING;
        HMDeviceSource hMDeviceSource33 = HMDeviceSource.MILI_KONGMING_L;
        HMDeviceSource hMDeviceSource34 = HMDeviceSource.MILI_KONGMING_PRO;
        HMDeviceSource hMDeviceSource35 = HMDeviceSource.MILI_KONGMING_PRO_L;
        HMDeviceSource hMDeviceSource36 = HMDeviceSource.MILI_KONGMING_LITE;
        HMDeviceSource hMDeviceSource37 = HMDeviceSource.MILI_PANGU;
        HMDeviceSource hMDeviceSource38 = HMDeviceSource.MILI_PANGU_L;
        HMDeviceSource hMDeviceSource39 = HMDeviceSource.MILI_L66;
        HMDeviceSource hMDeviceSource40 = HMDeviceSource.MILI_L66_AP;
        HMDeviceSource hMDeviceSource41 = HMDeviceSource.MILI_L66_I;
        HMDeviceSource hMDeviceSource42 = HMDeviceSource.MILI_L66_IN;
        HMDeviceSource hMDeviceSource43 = HMDeviceSource.MILI_L66_NFC;
        HMDeviceSource hMDeviceSource44 = HMDeviceSource.MILI_L66_NFC_I;
        HMDeviceSource hMDeviceSource45 = HMDeviceSource.MILI_L66_WE;
        HMDeviceSource hMDeviceSource46 = HMDeviceSource.SMART_WATCH_EVEREST_2;
        HMDeviceSource hMDeviceSource47 = HMDeviceSource.MILI_COMO;
        HMDeviceSource hMDeviceSource48 = HMDeviceSource.MILI_COMO_L;
        HMDeviceSource hMDeviceSource49 = HMDeviceSource.MILI_COMO_W;
        HMDeviceSource hMDeviceSource50 = HMDeviceSource.MILI_COMO_WL;
        HMDeviceSource hMDeviceSource51 = HMDeviceSource.MILI_CRATER_W;
        HMDeviceSource hMDeviceSource52 = HMDeviceSource.MILI_CRATER_WL;
        HMDeviceSource hMDeviceSource53 = HMDeviceSource.MILI_NESS;
        HMDeviceSource hMDeviceSource54 = HMDeviceSource.MILI_NESS_W;
        HMDeviceSource hMDeviceSource55 = HMDeviceSource.MILI_DAX;
        HMDeviceSource hMDeviceSource56 = HMDeviceSource.MILI_ONYX;
        HMDeviceSource hMDeviceSource57 = HMDeviceSource.MILI_CORSICA;
        HMDeviceSource hMDeviceSource58 = HMDeviceSource.MILI_OSPREY;
        HMDeviceSource hMDeviceSource59 = HMDeviceSource.MILI_OSPREY_C;
        HMDeviceSource hMDeviceSource60 = HMDeviceSource.MILI_LISBON;
        HMDeviceSource hMDeviceSource61 = HMDeviceSource.MILI_LISBON_W;
        HMDeviceSource hMDeviceSource62 = HMDeviceSource.MILI_YORK;
        HMDeviceSource hMDeviceSource63 = HMDeviceSource.MILI_ANETO;
        HMDeviceSource hMDeviceSource64 = HMDeviceSource.MILI_LINCS;
        HMDeviceSource hMDeviceSource65 = HMDeviceSource.MILI_NEWTON;
        HMDeviceSource hMDeviceSource66 = HMDeviceSource.MILI_PRAGUE;
        HMDeviceSource hMDeviceSource67 = HMDeviceSource.MILI_VOLGA;
        HMDeviceSource hMDeviceSource68 = HMDeviceSource.MILI_VOLGA_W;
        HMDeviceSource hMDeviceSource69 = HMDeviceSource.MILI_VENICE;
        HMDeviceSource hMDeviceSource70 = HMDeviceSource.MILI_LONDON;
        HMDeviceSource hMDeviceSource71 = HMDeviceSource.MILI_LONDON_W;
        HMDeviceSource hMDeviceSource72 = HMDeviceSource.MILI_BLANC;
        HMDeviceSource hMDeviceSource73 = HMDeviceSource.MILI_BLANC_W;
        HMDeviceSource hMDeviceSource74 = HMDeviceSource.MILI_HAMBURG;
        HMDeviceSource hMDeviceSource75 = HMDeviceSource.MILI_HAMBURG_W;
        HMDeviceSource hMDeviceSource76 = HMDeviceSource.MILI_BONN;
        HMDeviceSource hMDeviceSource77 = HMDeviceSource.MILI_BONN_W;
        HMDeviceSource hMDeviceSource78 = HMDeviceSource.MILI_MADRID;
        HMDeviceSource hMDeviceSource79 = HMDeviceSource.MILI_MADRID_W;
        HMDeviceSource hMDeviceSource80 = HMDeviceSource.MILI_VIENNA;
        HMDeviceSource hMDeviceSource81 = HMDeviceSource.MILI_VIENNA_W;
        HMDeviceSource hMDeviceSource82 = HMDeviceSource.MILI_ANDES;
        HMDeviceSource hMDeviceSource83 = HMDeviceSource.MILI_ANDES_W;
        HMDeviceSource hMDeviceSource84 = HMDeviceSource.MILI_TEIDE;
        HMDeviceSource hMDeviceSource85 = HMDeviceSource.MILI_TEIDE_W;
        HMDeviceSource hMDeviceSource86 = HMDeviceSource.MILI_ZURICH;
        HMDeviceSource hMDeviceSource87 = HMDeviceSource.MILI_ZURICH_W;
        HMDeviceSource hMDeviceSource88 = HMDeviceSource.MILI_VERONA;
        HMDeviceSource hMDeviceSource89 = HMDeviceSource.MILI_VERONA_W;
        HMDeviceSource hMDeviceSource90 = HMDeviceSource.MILI_BLED;
        HMDeviceSource hMDeviceSource91 = HMDeviceSource.MILI_BLED_W;
        HMDeviceSource hMDeviceSource92 = HMDeviceSource.MILI_BLED_PRO;
        HMDeviceSource hMDeviceSource93 = HMDeviceSource.MILI_BLED_PRO_W;
        HMDeviceSource hMDeviceSource94 = HMDeviceSource.MILI_CANNES;
        HMDeviceSource hMDeviceSource95 = HMDeviceSource.MILI_CANNES_W;
        HMDeviceSource hMDeviceSource96 = HMDeviceSource.MILI_SOFIA;
        HMDeviceSource hMDeviceSource97 = HMDeviceSource.MILI_SOFIA_W;
        HMDeviceSource hMDeviceSource98 = HMDeviceSource.MILI_PROVENCE;
        HMDeviceSource hMDeviceSource99 = HMDeviceSource.MILI_PROVENCE_W;
        HMDeviceSource hMDeviceSource100 = HMDeviceSource.MILI_PROVENCE_W_NFC;
        HMDeviceSource hMDeviceSource101 = HMDeviceSource.MILI_BARI;
        HMDeviceSource hMDeviceSource102 = HMDeviceSource.MILI_BARI_NFC;
        HMDeviceSource hMDeviceSource103 = HMDeviceSource.MILI_BARI_W;
        HMDeviceSource hMDeviceSource104 = HMDeviceSource.MILI_LISBON_WL;
        HMDeviceSource hMDeviceSource105 = HMDeviceSource.MILI_NEWTON_WL;
        HMDeviceSource hMDeviceSource106 = HMDeviceSource.MILI_LEIDEN;
        HMDeviceSource hMDeviceSource107 = HMDeviceSource.MILI_LEIDEN_W;
        HMDeviceSource hMDeviceSource108 = HMDeviceSource.MILI_MADRID_HML;
        HMDeviceSource hMDeviceSource109 = HMDeviceSource.MILI_WAST;
        HMDeviceSource hMDeviceSource110 = HMDeviceSource.MILI_WAST_W;
        a = new HMDeviceSource[]{hMDeviceSource, hMDeviceSource2, hMDeviceSource3, hMDeviceSource4, hMDeviceSource5, hMDeviceSource6, hMDeviceSource7, hMDeviceSource8, hMDeviceSource9, hMDeviceSource10, hMDeviceSource11, hMDeviceSource12, hMDeviceSource13, hMDeviceSource14, hMDeviceSource15, hMDeviceSource16, hMDeviceSource17, hMDeviceSource18, hMDeviceSource19, hMDeviceSource20, hMDeviceSource21, hMDeviceSource22, hMDeviceSource23, hMDeviceSource24, hMDeviceSource25, hMDeviceSource26, hMDeviceSource27, hMDeviceSource28, hMDeviceSource29, hMDeviceSource30, hMDeviceSource31, hMDeviceSource32, hMDeviceSource33, hMDeviceSource34, hMDeviceSource35, hMDeviceSource36, hMDeviceSource37, hMDeviceSource38, hMDeviceSource39, hMDeviceSource40, hMDeviceSource41, hMDeviceSource42, hMDeviceSource43, hMDeviceSource44, hMDeviceSource45, hMDeviceSource46, hMDeviceSource47, hMDeviceSource48, hMDeviceSource49, hMDeviceSource50, hMDeviceSource51, hMDeviceSource52, hMDeviceSource53, hMDeviceSource54, hMDeviceSource55, hMDeviceSource56, hMDeviceSource57, hMDeviceSource58, hMDeviceSource59, hMDeviceSource60, hMDeviceSource61, hMDeviceSource62, hMDeviceSource63, hMDeviceSource64, hMDeviceSource65, hMDeviceSource66, hMDeviceSource67, hMDeviceSource68, hMDeviceSource69, hMDeviceSource70, hMDeviceSource71, hMDeviceSource72, hMDeviceSource73, hMDeviceSource74, hMDeviceSource75, hMDeviceSource76, hMDeviceSource77, hMDeviceSource78, hMDeviceSource79, hMDeviceSource80, hMDeviceSource81, hMDeviceSource82, hMDeviceSource83, hMDeviceSource84, hMDeviceSource85, hMDeviceSource86, hMDeviceSource87, hMDeviceSource88, hMDeviceSource89, hMDeviceSource90, hMDeviceSource91, hMDeviceSource92, hMDeviceSource93, hMDeviceSource94, hMDeviceSource95, hMDeviceSource96, hMDeviceSource97, hMDeviceSource98, hMDeviceSource99, hMDeviceSource100, hMDeviceSource101, hMDeviceSource102, hMDeviceSource103, hMDeviceSource104, hMDeviceSource105, hMDeviceSource106, hMDeviceSource107, hMDeviceSource108, HMDeviceSource.MILI_FLORENCE, HMDeviceSource.MILI_FLORENCE_W, HMDeviceSource.MILI_BERLIN, HMDeviceSource.MILI_BERLIN_W, HMDeviceSource.MILI_LILLE, HMDeviceSource.MILI_LILLE_W, hMDeviceSource109, hMDeviceSource110};
        HashMap<HMDeviceSource, Lazy<HMBaseDeviceConfig>> map = new HashMap<>();
        map.put(HMDeviceSource.VDEVICE, LazyKt__LazyJVMKt.lazy(j2.a));
        map.put(HMDeviceSource.MILI, LazyKt__LazyJVMKt.lazy(u2.a));
        map.put(HMDeviceSource.MILI_1A, LazyKt__LazyJVMKt.lazy(f3.a));
        map.put(HMDeviceSource.MILI_1S, LazyKt__LazyJVMKt.lazy(q3.a));
        map.put(HMDeviceSource.WEIGHT, LazyKt__LazyJVMKt.lazy(b4.a));
        map.put(HMDeviceSource.WEIGHT_BODYFAT, LazyKt__LazyJVMKt.lazy(m4.a));
        map.put(HMDeviceSource.WEIGHT_BFS, LazyKt__LazyJVMKt.lazy(x4.a));
        map.put(HMDeviceSource.WEIGHT_SCALE2, LazyKt__LazyJVMKt.lazy(i5.a));
        map.put(HMDeviceSource.SENSORHUB, LazyKt__LazyJVMKt.lazy(t5.a));
        map.put(HMDeviceSource.SHOES, LazyKt__LazyJVMKt.lazy(k.a));
        map.put(HMDeviceSource.SHOES_CHILD, LazyKt__LazyJVMKt.lazy(v.a));
        map.put(HMDeviceSource.SHOES_LIGHT, LazyKt__LazyJVMKt.lazy(g0.a));
        map.put(HMDeviceSource.SHOES_SPRANDI, LazyKt__LazyJVMKt.lazy(r0.a));
        map.put(HMDeviceSource.SHOES_MARS, LazyKt__LazyJVMKt.lazy(c1.a));
        map.put(HMDeviceSource.WATCH_AMAZFIT, LazyKt__LazyJVMKt.lazy(n1.a));
        map.put(HMDeviceSource.WATCH_EVEREST, LazyKt__LazyJVMKt.lazy(y1.a));
        map.put(HMDeviceSource.WATCH_EVEREST_2S, LazyKt__LazyJVMKt.lazy(g2.a));
        map.put(HMDeviceSource.WATCH_AMAZFIT_QOG, LazyKt__LazyJVMKt.lazy(h2.a));
        HMDeviceSource hMDeviceSource111 = HMDeviceSource.WATCH_AMAZFIT_XIHU;
        map.put(hMDeviceSource111, LazyKt__LazyJVMKt.lazy(i2.a));
        HMDeviceSource hMDeviceSource112 = HMDeviceSource.WATCH_AMAZFIT_XIHU_E;
        map.put(hMDeviceSource112, LazyKt__LazyJVMKt.lazy(k2.a));
        HMDeviceSource hMDeviceSource113 = HMDeviceSource.WATCH_AMAZFIT_XIHU_EA;
        map.put(hMDeviceSource113, LazyKt__LazyJVMKt.lazy(l2.a));
        map.put(HMDeviceSource.MILI_AMAZFIT, LazyKt__LazyJVMKt.lazy(m2.a));
        map.put(HMDeviceSource.MILI_PRO_OLD, LazyKt__LazyJVMKt.lazy(n2.a));
        map.put(hMDeviceSource, LazyKt__LazyJVMKt.lazy(o2.a));
        map.put(hMDeviceSource2, LazyKt__LazyJVMKt.lazy(p2.a));
        map.put(hMDeviceSource3, LazyKt__LazyJVMKt.lazy(q2.a));
        map.put(hMDeviceSource4, LazyKt__LazyJVMKt.lazy(r2.a));
        map.put(hMDeviceSource5, LazyKt__LazyJVMKt.lazy(s2.a));
        map.put(hMDeviceSource6, LazyKt__LazyJVMKt.lazy(t2.a));
        map.put(hMDeviceSource7, LazyKt__LazyJVMKt.lazy(v2.a));
        map.put(hMDeviceSource8, LazyKt__LazyJVMKt.lazy(w2.a));
        map.put(hMDeviceSource9, LazyKt__LazyJVMKt.lazy(x2.a));
        map.put(hMDeviceSource10, LazyKt__LazyJVMKt.lazy(y2.a));
        map.put(hMDeviceSource11, LazyKt__LazyJVMKt.lazy(z2.a));
        map.put(hMDeviceSource12, LazyKt__LazyJVMKt.lazy(a3.a));
        map.put(hMDeviceSource13, LazyKt__LazyJVMKt.lazy(b3.a));
        map.put(hMDeviceSource14, LazyKt__LazyJVMKt.lazy(c3.a));
        map.put(hMDeviceSource15, LazyKt__LazyJVMKt.lazy(d3.a));
        map.put(HMDeviceSource.MILI_CINCO_L, LazyKt__LazyJVMKt.lazy(e3.a));
        map.put(hMDeviceSource16, LazyKt__LazyJVMKt.lazy(g3.a));
        map.put(HMDeviceSource.MILI_TONLESAP_L, LazyKt__LazyJVMKt.lazy(h3.a));
        map.put(HMDeviceSource.MILI_TONLESAP_O, LazyKt__LazyJVMKt.lazy(i3.a));
        map.put(hMDeviceSource17, LazyKt__LazyJVMKt.lazy(j3.a));
        map.put(hMDeviceSource18, LazyKt__LazyJVMKt.lazy(k3.a));
        map.put(hMDeviceSource19, LazyKt__LazyJVMKt.lazy(l3.a));
        map.put(HMDeviceSource.MILI_JIUHUASHAN, LazyKt__LazyJVMKt.lazy(m3.a));
        map.put(HMDeviceSource.MILI_QINLING_S2, LazyKt__LazyJVMKt.lazy(n3.a));
        map.put(HMDeviceSource.MILI_PYH_W, LazyKt__LazyJVMKt.lazy(o3.a));
        map.put(hMDeviceSource20, LazyKt__LazyJVMKt.lazy(p3.a));
        map.put(hMDeviceSource56, LazyKt__LazyJVMKt.lazy(r3.a));
        map.put(HMDeviceSource.MILI_ONYX_W, LazyKt__LazyJVMKt.lazy(s3.a));
        map.put(HMDeviceSource.MILI_FALCON_W, LazyKt__LazyJVMKt.lazy(t3.a));
        map.put(HMDeviceSource.MILI_FALCON_DISNEY, LazyKt__LazyJVMKt.lazy(u3.a));
        map.put(hMDeviceSource22, LazyKt__LazyJVMKt.lazy(v3.a));
        map.put(HMDeviceSource.MILI_HAWK_W, LazyKt__LazyJVMKt.lazy(w3.a));
        map.put(hMDeviceSource23, LazyKt__LazyJVMKt.lazy(x3.a));
        map.put(hMDeviceSource24, LazyKt__LazyJVMKt.lazy(y3.a));
        map.put(HMDeviceSource.MILI_KESTREL_W, LazyKt__LazyJVMKt.lazy(z3.a));
        map.put(HMDeviceSource.MILI_PEYTO_WL, LazyKt__LazyJVMKt.lazy(a4.a));
        map.put(HMDeviceSource.MILI_HAWK_L, LazyKt__LazyJVMKt.lazy(c4.a));
        map.put(HMDeviceSource.MILI_HAWK_WL, LazyKt__LazyJVMKt.lazy(d4.a));
        map.put(hMDeviceSource21, LazyKt__LazyJVMKt.lazy(e4.a));
        map.put(HMDeviceSource.MILI_FALCON_WL, LazyKt__LazyJVMKt.lazy(f4.a));
        map.put(hMDeviceSource25, LazyKt__LazyJVMKt.lazy(g4.a));
        map.put(HMDeviceSource.MILI_KESTREL_WL, LazyKt__LazyJVMKt.lazy(h4.a));
        map.put(hMDeviceSource26, LazyKt__LazyJVMKt.lazy(i4.a));
        map.put(hMDeviceSource27, LazyKt__LazyJVMKt.lazy(j4.a));
        map.put(hMDeviceSource62, LazyKt__LazyJVMKt.lazy(k4.a));
        map.put(hMDeviceSource57, LazyKt__LazyJVMKt.lazy(l4.a));
        map.put(HMDeviceSource.MILI_CORSICA_W, LazyKt__LazyJVMKt.lazy(n4.a));
        map.put(hMDeviceSource63, LazyKt__LazyJVMKt.lazy(o4.a));
        map.put(hMDeviceSource32, LazyKt__LazyJVMKt.lazy(p4.a));
        map.put(hMDeviceSource33, LazyKt__LazyJVMKt.lazy(q4.a));
        map.put(hMDeviceSource34, LazyKt__LazyJVMKt.lazy(r4.a));
        map.put(hMDeviceSource35, LazyKt__LazyJVMKt.lazy(s4.a));
        map.put(hMDeviceSource36, LazyKt__LazyJVMKt.lazy(t4.a));
        map.put(hMDeviceSource37, LazyKt__LazyJVMKt.lazy(u4.a));
        map.put(hMDeviceSource38, LazyKt__LazyJVMKt.lazy(v4.a));
        map.put(hMDeviceSource39, LazyKt__LazyJVMKt.lazy(w4.a));
        map.put(hMDeviceSource40, LazyKt__LazyJVMKt.lazy(y4.a));
        map.put(hMDeviceSource41, LazyKt__LazyJVMKt.lazy(z4.a));
        map.put(hMDeviceSource42, LazyKt__LazyJVMKt.lazy(a5.a));
        map.put(hMDeviceSource43, LazyKt__LazyJVMKt.lazy(b5.a));
        map.put(hMDeviceSource44, LazyKt__LazyJVMKt.lazy(c5.a));
        map.put(hMDeviceSource45, LazyKt__LazyJVMKt.lazy(d5.a));
        map.put(HMDeviceSource.OTHER_BM, LazyKt__LazyJVMKt.lazy(e5.a));
        map.put(HMDeviceSource.OTHER_BOLT, LazyKt__LazyJVMKt.lazy(f5.a));
        map.put(HMDeviceSource.OTHER_BOLT_SECOND, LazyKt__LazyJVMKt.lazy(g5.a));
        map.put(HMDeviceSource.OTHER_MOZART, LazyKt__LazyJVMKt.lazy(h5.a));
        map.put(HMDeviceSource.OTHER_HAYDN, LazyKt__LazyJVMKt.lazy(j5.a));
        map.put(HMDeviceSource.OTHER_LULLABY, LazyKt__LazyJVMKt.lazy(k5.a));
        map.put(hMDeviceSource111, LazyKt__LazyJVMKt.lazy(l5.a));
        map.put(hMDeviceSource112, LazyKt__LazyJVMKt.lazy(m5.a));
        map.put(hMDeviceSource113, LazyKt__LazyJVMKt.lazy(n5.a));
        map.put(HMDeviceSource.WATCH_AMAZFIT_XIHU_DISNEY, LazyKt__LazyJVMKt.lazy(o5.a));
        map.put(hMDeviceSource28, LazyKt__LazyJVMKt.lazy(p5.a));
        map.put(HMDeviceSource.MILI_HAWK_SWK_W, LazyKt__LazyJVMKt.lazy(q5.a));
        map.put(hMDeviceSource46, LazyKt__LazyJVMKt.lazy(r5.a));
        map.put(HMDeviceSource.SMART_WATCH_EVEREST_2S, LazyKt__LazyJVMKt.lazy(s5.a));
        map.put(HMDeviceSource.SMART_WATCH_EVEREST_2SW, LazyKt__LazyJVMKt.lazy(a.a));
        map.put(HMDeviceSource.SMART_WATCH_EVEREST_2W, LazyKt__LazyJVMKt.lazy(b.a));
        map.put(HMDeviceSource.SMART_WATCH_EVEREST_2_STAR_WAR, LazyKt__LazyJVMKt.lazy(c.a));
        map.put(hMDeviceSource29, LazyKt__LazyJVMKt.lazy(d.a));
        map.put(hMDeviceSource58, LazyKt__LazyJVMKt.lazy(e.a));
        map.put(HMDeviceSource.MILI_OSPREY_W, LazyKt__LazyJVMKt.lazy(f.a));
        map.put(hMDeviceSource59, LazyKt__LazyJVMKt.lazy(g.a));
        map.put(hMDeviceSource60, LazyKt__LazyJVMKt.lazy(h.a));
        map.put(hMDeviceSource61, LazyKt__LazyJVMKt.lazy(i.a));
        map.put(hMDeviceSource64, LazyKt__LazyJVMKt.lazy(j.a));
        map.put(HMDeviceSource.MILI_LINCS_W, LazyKt__LazyJVMKt.lazy(l.a));
        map.put(hMDeviceSource65, LazyKt__LazyJVMKt.lazy(m.a));
        map.put(HMDeviceSource.MILI_NEWTON_W, LazyKt__LazyJVMKt.lazy(n.a));
        map.put(hMDeviceSource66, LazyKt__LazyJVMKt.lazy(o.a));
        map.put(HMDeviceSource.MILI_PRAGUE_W, LazyKt__LazyJVMKt.lazy(p.a));
        map.put(hMDeviceSource67, LazyKt__LazyJVMKt.lazy(q.a));
        map.put(hMDeviceSource68, LazyKt__LazyJVMKt.lazy(r.a));
        map.put(hMDeviceSource69, LazyKt__LazyJVMKt.lazy(s.a));
        map.put(HMDeviceSource.MILI_VENICE_W, LazyKt__LazyJVMKt.lazy(t.a));
        map.put(HMDeviceSource.EARBUD_CHOPIN, LazyKt__LazyJVMKt.lazy(u.a));
        map.put(HMDeviceSource.WEIGHT_AMAZFIT_SCALE, LazyKt__LazyJVMKt.lazy(w.a));
        map.put(hMDeviceSource47, LazyKt__LazyJVMKt.lazy(x.a));
        map.put(hMDeviceSource48, LazyKt__LazyJVMKt.lazy(y.a));
        map.put(hMDeviceSource49, LazyKt__LazyJVMKt.lazy(z.a));
        map.put(hMDeviceSource50, LazyKt__LazyJVMKt.lazy(a0.a));
        map.put(hMDeviceSource51, LazyKt__LazyJVMKt.lazy(b0.a));
        map.put(hMDeviceSource52, LazyKt__LazyJVMKt.lazy(c0.a));
        map.put(hMDeviceSource53, LazyKt__LazyJVMKt.lazy(d0.a));
        map.put(hMDeviceSource54, LazyKt__LazyJVMKt.lazy(e0.a));
        map.put(hMDeviceSource109, LazyKt__LazyJVMKt.lazy(f0.a));
        map.put(hMDeviceSource110, LazyKt__LazyJVMKt.lazy(h0.a));
        map.put(hMDeviceSource55, LazyKt__LazyJVMKt.lazy(i0.a));
        map.put(hMDeviceSource70, LazyKt__LazyJVMKt.lazy(j0.a));
        map.put(hMDeviceSource71, LazyKt__LazyJVMKt.lazy(k0.a));
        map.put(hMDeviceSource72, LazyKt__LazyJVMKt.lazy(l0.a));
        map.put(hMDeviceSource73, LazyKt__LazyJVMKt.lazy(m0.a));
        map.put(hMDeviceSource74, LazyKt__LazyJVMKt.lazy(n0.a));
        map.put(hMDeviceSource76, LazyKt__LazyJVMKt.lazy(o0.a));
        map.put(hMDeviceSource75, LazyKt__LazyJVMKt.lazy(p0.a));
        map.put(hMDeviceSource77, LazyKt__LazyJVMKt.lazy(q0.a));
        map.put(HMDeviceSource.FITBIT_IONIC, LazyKt__LazyJVMKt.lazy(s0.a));
        map.put(HMDeviceSource.FITBIT_VERSA, LazyKt__LazyJVMKt.lazy(t0.a));
        map.put(HMDeviceSource.FITBIT_VERSA_2, LazyKt__LazyJVMKt.lazy(u0.a));
        map.put(HMDeviceSource.FITBIT_VERSA_LITE, LazyKt__LazyJVMKt.lazy(v0.a));
        map.put(hMDeviceSource78, LazyKt__LazyJVMKt.lazy(w0.a));
        map.put(hMDeviceSource79, LazyKt__LazyJVMKt.lazy(x0.a));
        map.put(hMDeviceSource80, LazyKt__LazyJVMKt.lazy(y0.a));
        map.put(hMDeviceSource81, LazyKt__LazyJVMKt.lazy(z0.a));
        map.put(hMDeviceSource82, LazyKt__LazyJVMKt.lazy(a1.a));
        map.put(hMDeviceSource83, LazyKt__LazyJVMKt.lazy(b1.a));
        map.put(hMDeviceSource84, LazyKt__LazyJVMKt.lazy(d1.a));
        map.put(hMDeviceSource85, LazyKt__LazyJVMKt.lazy(e1.a));
        map.put(hMDeviceSource86, LazyKt__LazyJVMKt.lazy(f1.a));
        map.put(hMDeviceSource87, LazyKt__LazyJVMKt.lazy(g1.a));
        map.put(hMDeviceSource88, LazyKt__LazyJVMKt.lazy(h1.a));
        map.put(hMDeviceSource89, LazyKt__LazyJVMKt.lazy(i1.a));
        map.put(hMDeviceSource30, LazyKt__LazyJVMKt.lazy(j1.a));
        map.put(hMDeviceSource31, LazyKt__LazyJVMKt.lazy(k1.a));
        map.put(hMDeviceSource91, LazyKt__LazyJVMKt.lazy(l1.a));
        map.put(hMDeviceSource92, LazyKt__LazyJVMKt.lazy(m1.a));
        map.put(hMDeviceSource93, LazyKt__LazyJVMKt.lazy(o1.a));
        map.put(hMDeviceSource90, LazyKt__LazyJVMKt.lazy(p1.a));
        map.put(hMDeviceSource95, LazyKt__LazyJVMKt.lazy(q1.a));
        map.put(hMDeviceSource94, LazyKt__LazyJVMKt.lazy(r1.a));
        map.put(hMDeviceSource96, LazyKt__LazyJVMKt.lazy(s1.a));
        map.put(hMDeviceSource97, LazyKt__LazyJVMKt.lazy(t1.a));
        map.put(hMDeviceSource104, LazyKt__LazyJVMKt.lazy(u1.a));
        map.put(hMDeviceSource105, LazyKt__LazyJVMKt.lazy(v1.a));
        map.put(hMDeviceSource98, LazyKt__LazyJVMKt.lazy(w1.a));
        map.put(hMDeviceSource99, LazyKt__LazyJVMKt.lazy(x1.a));
        map.put(hMDeviceSource100, LazyKt__LazyJVMKt.lazy(z1.a));
        map.put(hMDeviceSource101, LazyKt__LazyJVMKt.lazy(a2.a));
        map.put(hMDeviceSource102, LazyKt__LazyJVMKt.lazy(b2.a));
        map.put(hMDeviceSource103, LazyKt__LazyJVMKt.lazy(c2.a));
        map.put(hMDeviceSource106, LazyKt__LazyJVMKt.lazy(d2.a));
        map.put(hMDeviceSource107, LazyKt__LazyJVMKt.lazy(e2.a));
        map.put(hMDeviceSource108, LazyKt__LazyJVMKt.lazy(f2.a));
        a(map);
        Unit unit = Unit.INSTANCE;
        b = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void a(HashMap<HMDeviceSource, Lazy<HMBaseDeviceConfig>> map) {
        for (Pair pair : CollectionsKt__CollectionsKt.arrayListOf(new Pair(HMDeviceSource.MILI_FLORENCE, LazyKt__LazyJVMKt.lazy(u5.a)), new Pair(HMDeviceSource.MILI_FLORENCE_W, LazyKt__LazyJVMKt.lazy(v5.a)), new Pair(HMDeviceSource.MILI_BERLIN, LazyKt__LazyJVMKt.lazy(w5.a)), new Pair(HMDeviceSource.MILI_BERLIN_W, LazyKt__LazyJVMKt.lazy(x5.a)), new Pair(HMDeviceSource.MILI_LILLE, LazyKt__LazyJVMKt.lazy(y5.a)), new Pair(HMDeviceSource.MILI_LILLE_W, LazyKt__LazyJVMKt.lazy(z5.a)))) {
            map.put(pair.getFirst(), pair.getSecond());
        }
    }

    @Nullable
    public static final Integer getBindingHintTitle(@NotNull HMDeviceSource hMDeviceSource) {
        return getDeviceConfig(hMDeviceSource).getBindingHintTitle();
    }

    @NotNull
    public static final HashMap<HMDeviceSource, Lazy<HMBaseDeviceConfig>> getConfigMap() {
        return b;
    }

    @Nullable
    public static final Class<? extends HMBaseDevice> getDeviceClass(@NotNull HMDeviceSource hMDeviceSource) {
        return getDeviceConfig(hMDeviceSource).getDeviceClass();
    }

    @NotNull
    public static final HMBaseDeviceConfig getDeviceConfig(@NotNull HMDeviceSource hMDeviceSource) {
        HashMap<HMDeviceSource, Lazy<HMBaseDeviceConfig>> map = b;
        Lazy<HMBaseDeviceConfig> lazy = map.get(hMDeviceSource);
        return lazy == null ? map.get(HMDeviceSource.VDEVICE).getValue() : lazy.getValue();
    }

    public static final int getDeviceDesc(@NotNull HMDeviceSource hMDeviceSource) {
        return getDeviceConfig(hMDeviceSource).getDeviceDesc();
    }

    public static final int getDeviceIcon(@NotNull HMDeviceSource hMDeviceSource) {
        int deviceIcon = getDeviceConfig(hMDeviceSource).getDeviceIcon();
        return deviceIcon == -1 ? R.drawable.img_amazfitwatch : deviceIcon;
    }

    public static final int getDevicePageBg(@NotNull HMDeviceSource hMDeviceSource) {
        return getDeviceConfig(hMDeviceSource).getDevicePageBg();
    }

    public static final int getDeviceShortDesc(@NotNull HMDeviceSource hMDeviceSource) {
        return getDeviceConfig(hMDeviceSource).getDeviceShortDesc();
    }

    @NotNull
    public static final HMDeviceSource[] getRepresentSources() {
        return a;
    }

    public static final boolean hasFeature(@NotNull HMDeviceSource hMDeviceSource, @NotNull Feature feature) {
        return hasFeature(feature, hMDeviceSource);
    }

    public static final boolean hasHeadsetFeature(@NotNull Feature feature) {
        return hasFeature(feature, ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.HEADSET));
    }

    public static final boolean hasMiliFeature(@NotNull Feature feature) {
        return hasFeature(feature, ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI));
    }

    public static final void set(@NotNull BitSet bitSet, @NotNull Feature feature, boolean z6) {
        if (z6) {
            bitSet.set(feature.ordinal());
        } else {
            bitSet.clear(feature.ordinal());
        }
    }

    @NotNull
    public static final String getDeviceDesc(@NotNull Context context, @NotNull HMDeviceSource hMDeviceSource) {
        return context.getString(getDeviceDesc(hMDeviceSource));
    }

    @NotNull
    public static final String getDeviceShortDesc(@NotNull Context context, @NotNull HMDeviceSource hMDeviceSource) {
        return context.getString(getDeviceShortDesc(hMDeviceSource));
    }

    public static final boolean hasFeature(@NotNull Feature feature, @Nullable HMDeviceSource hMDeviceSource) {
        if (hMDeviceSource == null) {
            return false;
        }
        return getDeviceConfig(hMDeviceSource).getConfigBitSet().get(feature.ordinal());
    }

    public static final boolean hasFeature(@NotNull Feature feature) {
        HMDeviceSource boundDeviceSource;
        for (HMDeviceType hMDeviceType : HMDeviceType.values()) {
            if (hMDeviceType != HMDeviceType.VDevice && hMDeviceType != HMDeviceType.SENSORHUB && (boundDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(hMDeviceType)) != HMDeviceSource.VDEVICE && hasFeature(feature, boundDeviceSource)) {
                return true;
            }
        }
        return false;
    }
}
