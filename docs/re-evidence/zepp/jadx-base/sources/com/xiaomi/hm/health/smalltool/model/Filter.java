package com.xiaomi.hm.health.smalltool.model;

import android.content.Context;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.di.koin.util.FemaleCheckUtil;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0004\u0016\u0017\u0018\u0019B\u001f\b\u0012\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u0012\u0010\u0013B%\b\u0012\u0012\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0004\b\u0012\u0010\u0014B\u0011\b\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R&\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR,\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/model/Filter;", "", "Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "device", "", "match", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlin/Function1;", "filter1", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function2;", "filter2", "Lkotlin/jvm/functions/Function2;", "filter3", "Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "filter", "<init>", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "(Ljava/lang/String;ILkotlin/jvm/functions/Function2;)V", "(Ljava/lang/String;ILcom/xiaomi/hm/health/smalltool/model/IFilter;)V", "Band", "Devices", "FemaleBand", "SmartWatch", "SUPPORT", "NO_DEVICE", "BAND", "BAND_DEFAULT", "TREADMILL", "BAND_NFC", "SMART_WATCH", "SMART_WATCH_NFC", "SMART_WATCH_OVERSEA", "SCALE", "USER_OVERSEA", "LOCALE_OVERSEA", "ANETO", "NOT_SUPPORT", "CHOPIN_HANDSET", "FILTER_FEMALE_HEALTH", "YORK", "COMO_NESS", "GUEST_MODE_FILTER", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public enum Filter implements IFilter {
    SUPPORT(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.k
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            return true;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    }),
    NO_DEVICE(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.l
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            return hMDeviceSource == null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    }),
    BAND(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.m
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            return (hMDeviceSource == null ? null : hMDeviceSource.getType()) == HMDeviceType.MILI;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    }),
    BAND_DEFAULT(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.n
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            return ((hMDeviceSource == null ? null : hMDeviceSource.getType()) != HMDeviceType.MILI || ConfigHelperKt.hasFeature(Feature.YORK_SERIES_S, hMDeviceSource) || ConfigHelperKt.hasFeature(Feature.COMO_NESS_SERIES_S, hMDeviceSource)) ? false : true;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    }),
    TREADMILL(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.o
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            return (hMDeviceSource == null ? null : hMDeviceSource.getType()) == HMDeviceType.TREADMILL;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    }),
    BAND_NFC(new Band(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.p
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            return ConfigHelperKt.hasFeature(Feature.NFC_BUS, hMDeviceSource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    })),
    SMART_WATCH(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.q
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            return (hMDeviceSource == null ? null : hMDeviceSource.getType()) == HMDeviceType.WATCH;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    }),
    SMART_WATCH_NFC(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.r
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            if (Filter.SMART_WATCH.match(hMDeviceSource)) {
                HMDeviceSource[] watch_support_nfc = ToolConfigKt.getWATCH_SUPPORT_NFC();
                if (new Devices((HMDeviceSource[]) Arrays.copyOf(watch_support_nfc, watch_support_nfc.length)).match(hMDeviceSource)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    }),
    SMART_WATCH_OVERSEA(new SmartWatch(new Function1<Device, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.s
        public final boolean a(@NotNull Device device) {
            return Config.isDeviceOversea(device);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Device device) {
            return Boolean.valueOf(a(device));
        }
    })),
    SCALE(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.a
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            return (hMDeviceSource == null ? null : hMDeviceSource.getType()) == HMDeviceType.WEIGHT;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    }),
    USER_OVERSEA(new Function2<Context, HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.b
        public final boolean a(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource) {
            return Config.isUserOversea(context);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Context context, HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(context, hMDeviceSource));
        }
    }),
    LOCALE_OVERSEA(new Function2<Context, HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.c
        public final boolean a(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource) {
            return Config.isLocaleOversea(context);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Context context, HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(context, hMDeviceSource));
        }
    }),
    ANETO(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.d
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            HMDeviceSource[] mili_aneto_series = ToolConfigKt.getMILI_ANETO_SERIES();
            return new Devices((HMDeviceSource[]) Arrays.copyOf(mili_aneto_series, mili_aneto_series.length)).match(hMDeviceSource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    }),
    NOT_SUPPORT(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.e
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            return false;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    }),
    CHOPIN_HANDSET(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.f
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            return (hMDeviceSource == null ? null : hMDeviceSource.getType()) == HMDeviceType.EARBUD;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    }),
    FILTER_FEMALE_HEALTH(new FemaleBand(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.g
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            return ConfigHelperKt.hasFeature(Feature.FEMALE_HEALTH, hMDeviceSource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    })),
    YORK(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.h
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            return ConfigHelperKt.hasFeature(Feature.YORK_SERIES_S, hMDeviceSource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    }),
    COMO_NESS(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.i
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            return ConfigHelperKt.hasFeature(Feature.COMO_NESS_SERIES_S, hMDeviceSource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    }),
    GUEST_MODE_FILTER(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Filter.j
        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            HMDeviceSource[] guest_mode_series = ToolConfigKt.getGUEST_MODE_SERIES();
            return new Devices((HMDeviceSource[]) Arrays.copyOf(guest_mode_series, guest_mode_series.length)).match(hMDeviceSource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    });


    @Nullable
    private Function1<? super HMDeviceSource, Boolean> filter1;

    @Nullable
    private Function2<? super Context, ? super HMDeviceSource, Boolean> filter2;

    @Nullable
    private IFilter filter3;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u0011\u0010\u0013J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R&\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR,\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/model/Filter$Band;", "Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "device", "", "match", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "filter1", "Lkotlin/Function2;", "b", "Lkotlin/jvm/functions/Function2;", "filter2", "filter", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function2;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static class Band implements IFilter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private Function1<? super HMDeviceSource, Boolean> filter1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private Function2<? super Context, ? super HMDeviceSource, Boolean> filter2;

        public Band(@NotNull Function1<? super HMDeviceSource, Boolean> function1) {
            this.filter1 = function1;
        }

        @Override // com.xiaomi.hm.health.smalltool.model.IFilter
        public boolean match(@Nullable HMDeviceSource hMDeviceSource) {
            return IFilter.DefaultImpls.match(this, hMDeviceSource);
        }

        @Override // com.xiaomi.hm.health.smalltool.model.IFilter
        public boolean match(@NotNull Context context, @Nullable HMDeviceSource device) {
            boolean zBooleanValue;
            if (!Filter.BAND.match(device)) {
                return false;
            }
            Function1<? super HMDeviceSource, Boolean> function1 = this.filter1;
            Boolean boolValueOf = function1 == null ? null : Boolean.valueOf(function1.invoke(device).booleanValue());
            if (boolValueOf == null) {
                Function2<? super Context, ? super HMDeviceSource, Boolean> function2 = this.filter2;
                zBooleanValue = function2 == null ? false : function2.invoke(context, device).booleanValue();
            } else {
                zBooleanValue = boolValueOf.booleanValue();
            }
            return zBooleanValue;
        }

        public Band(@NotNull Function2<? super Context, ? super HMDeviceSource, Boolean> function2) {
            this.filter2 = function2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/model/Filter$Devices;", "Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "device", "", "match", "", "a", "[Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "supportDevices", "<init>", "([Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Devices implements IFilter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private HMDeviceSource[] supportDevices;

        public Devices(@NotNull HMDeviceSource... hMDeviceSourceArr) {
            this.supportDevices = hMDeviceSourceArr;
        }

        @Override // com.xiaomi.hm.health.smalltool.model.IFilter
        public boolean match(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource) {
            return IFilter.DefaultImpls.match(this, context, hMDeviceSource);
        }

        @Override // com.xiaomi.hm.health.smalltool.model.IFilter
        public boolean match(@Nullable HMDeviceSource device) {
            return ArraysKt___ArraysKt.contains(this.supportDevices, device);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/model/Filter$FemaleBand;", "Lcom/xiaomi/hm/health/smalltool/model/Filter$Band;", "Lkotlin/Function1;", "", "", "callback", "Lkotlinx/coroutines/Job;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "device", "match", "c", "Z", "hasData", "Lcom/xiaomi/hm/health/smalltool/model/IDeviceFeatureCheck;", "check", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class FemaleBand extends Band {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean hasData;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.smalltool.model.Filter$FemaleBand$hasFemaleData$1", f = "ToolConfig.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ Function1<Boolean, Unit> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super Boolean, Unit> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Function1 function1;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function1<Boolean, Unit> function2 = this.c;
                    FemaleCheckUtil femaleCheckUtil = FemaleCheckUtil.INSTANCE;
                    this.a = function2;
                    this.b = 1;
                    Object objHasData = femaleCheckUtil.hasData(this);
                    if (objHasData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function1 = function2;
                    obj = objHasData;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (Function1) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                function1.invoke(obj);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Boolean, Unit> {
            public b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                FemaleBand.this.hasData = z;
            }
        }

        public FemaleBand(@NotNull Function1<? super HMDeviceSource, Boolean> function1) {
            super(function1);
        }

        private final Job a(Function1<? super Boolean, Unit> callback) {
            return kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(callback, null), 2, null);
        }

        @Override // com.xiaomi.hm.health.smalltool.model.Filter.Band, com.xiaomi.hm.health.smalltool.model.IFilter
        public boolean match(@NotNull Context context, @Nullable HMDeviceSource device) {
            a(new b());
            if (!super.match(context, device)) {
                return this.hasData;
            }
            FemaleCheckUtil femaleCheckUtil = FemaleCheckUtil.INSTANCE;
            return femaleCheckUtil.checkUserGenderFemale() || femaleCheckUtil.checkWomenHealthEnable() || this.hasData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0012\u0010\u0014J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR*\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/model/Filter$SmartWatch;", "Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "device", "", "match", "Lkotlin/Function1;", "Lcom/huami/watch/companion/device/Device;", "a", "Lkotlin/jvm/functions/Function1;", "filter1", "Lkotlin/Function2;", "b", "Lkotlin/jvm/functions/Function2;", "filter2", "filter", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function2;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class SmartWatch implements IFilter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private Function1<? super Device, Boolean> filter1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private Function2<? super Context, ? super Device, Boolean> filter2;

        public SmartWatch(@NotNull Function1<? super Device, Boolean> function1) {
            this.filter1 = function1;
        }

        @Override // com.xiaomi.hm.health.smalltool.model.IFilter
        public boolean match(@Nullable HMDeviceSource hMDeviceSource) {
            return IFilter.DefaultImpls.match(this, hMDeviceSource);
        }

        /* JADX WARN: Code duplicated, block: B:6:0x0013  */
        @Override // com.xiaomi.hm.health.smalltool.model.IFilter
        public boolean match(@NotNull Context context, @Nullable HMDeviceSource device) {
            boolean zBooleanValue;
            if (!Filter.SMART_WATCH.match(device)) {
                return false;
            }
            Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
            if (currentDevice != null) {
                Function1<? super Device, Boolean> function1 = this.filter1;
                Boolean boolValueOf = function1 == null ? null : Boolean.valueOf(function1.invoke(currentDevice).booleanValue());
                if (boolValueOf == null) {
                    Function2<? super Context, ? super Device, Boolean> function2 = this.filter2;
                    if (function2 == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = function2.invoke(context, currentDevice).booleanValue();
                    }
                } else {
                    zBooleanValue = boolValueOf.booleanValue();
                }
            } else {
                zBooleanValue = false;
            }
            return zBooleanValue;
        }

        public SmartWatch(@NotNull Function2<? super Context, ? super Device, Boolean> function2) {
            this.filter2 = function2;
        }
    }

    Filter(Function1 function1) {
        this.filter1 = function1;
    }

    @Override // com.xiaomi.hm.health.smalltool.model.IFilter
    public boolean match(@Nullable HMDeviceSource device) {
        Function1<? super HMDeviceSource, Boolean> function1 = this.filter1;
        if (function1 == null) {
            return false;
        }
        return function1.invoke(device).booleanValue();
    }

    @Override // com.xiaomi.hm.health.smalltool.model.IFilter
    public boolean match(@NotNull Context context, @Nullable HMDeviceSource device) {
        Function1<? super HMDeviceSource, Boolean> function1 = this.filter1;
        Boolean boolValueOf = function1 == null ? null : Boolean.valueOf(function1.invoke(device).booleanValue());
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        Function2<? super Context, ? super HMDeviceSource, Boolean> function2 = this.filter2;
        Boolean boolValueOf2 = function2 != null ? Boolean.valueOf(function2.invoke(context, device).booleanValue()) : null;
        if (boolValueOf2 != null) {
            return boolValueOf2.booleanValue();
        }
        IFilter iFilter = this.filter3;
        if (iFilter == null) {
            return false;
        }
        return iFilter.match(context, device);
    }

    Filter(Function2 function2) {
        this.filter2 = function2;
    }

    Filter(IFilter iFilter) {
        this.filter3 = iFilter;
    }
}
