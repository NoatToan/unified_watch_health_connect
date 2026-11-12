package com.xiaomi.hm.health.smalltool.model;

import com.huami.account.HMLoginManager;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/model/AdultBobyScaleWeight;", "Lcom/xiaomi/hm/health/smalltool/model/WeightToolFilter;", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "", "Lcom/xiaomi/hm/health/smalltool/model/DeviceFilter;", "deviceFilter", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AdultBobyScaleWeight extends WeightToolFilter {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "<anonymous parameter 0>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<HMDeviceSource, Boolean> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final boolean a(@Nullable HMDeviceSource hMDeviceSource) {
            return !HMLoginManager.isInNonContinental() || HMLoginManager.isAdult();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource) {
            return Boolean.valueOf(a(hMDeviceSource));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdultBobyScaleWeight() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public AdultBobyScaleWeight(@NotNull Function1<? super HMDeviceSource, Boolean> function1) {
        super(function1);
    }

    public /* synthetic */ AdultBobyScaleWeight(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.a : function1);
    }
}
