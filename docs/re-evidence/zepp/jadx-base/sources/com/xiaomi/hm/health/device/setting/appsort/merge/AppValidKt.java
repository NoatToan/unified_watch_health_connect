package com.xiaomi.hm.health.device.setting.appsort.merge;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.market.sdk.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0001\u001a&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u001a3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u001e\u0010\u000e\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\r\"\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u001e\u0010\u000e\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\r\"\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "default", "item", "Lkotlin/Function0;", "", "defaultValid", "", Constants.JSON_FEATURE, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "group", "deviceFeatureValid", "", "vs", "allValid", "([Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", "anyValid", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class AppValidKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ Function0<Boolean>[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Boolean>[] function0Arr) {
            super(0);
            this.a = function0Arr;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            for (Function0<Boolean> function0 : this.a) {
                if (!function0.invoke().booleanValue()) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ Function0<Boolean>[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0<Boolean>[] function0Arr) {
            super(0);
            this.a = function0Arr;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            for (Function0<Boolean> function0 : this.a) {
                if (function0.invoke().booleanValue()) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ List<AppItem> a;
        public final /* synthetic */ AppItem b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends AppItem> list, AppItem appItem) {
            super(0);
            this.a = list;
            this.b = appItem;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            List<AppItem> list = this.a;
            AppItem appItem = this.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((AppItem) it2.next()).getType() == appItem.getType()) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ HMDeviceSource a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMDeviceSource hMDeviceSource, int i, int i2) {
            super(0);
            this.a = hMDeviceSource;
            this.b = i;
            this.c = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return HMDevicePropertyCache.INSTANCE.getInstance().getFeature(this.a).has(this.b, this.c);
        }
    }

    @NotNull
    public static final Function0<Boolean> allValid(@NotNull Function0<Boolean>... function0Arr) {
        return new a(function0Arr);
    }

    @NotNull
    public static final Function0<Boolean> anyValid(@NotNull Function0<Boolean>... function0Arr) {
        return new b(function0Arr);
    }

    @NotNull
    public static final Function0<Boolean> defaultValid(@NotNull List<? extends AppItem> list, @NotNull AppItem appItem) {
        return new c(list, appItem);
    }

    @NotNull
    public static final Function0<Boolean> deviceFeatureValid(int i, @NotNull HMDeviceSource hMDeviceSource, int i2) {
        return new d(hMDeviceSource, i2, i);
    }

    public static /* synthetic */ Function0 deviceFeatureValid$default(int i, HMDeviceSource hMDeviceSource, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 2;
        }
        return deviceFeatureValid(i, hMDeviceSource, i2);
    }
}
