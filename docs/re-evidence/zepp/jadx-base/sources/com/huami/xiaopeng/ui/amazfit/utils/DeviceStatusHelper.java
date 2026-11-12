package com.huami.xiaopeng.ui.amazfit.utils;

import com.huami.components.devicestatus.DeviceStatusNavigator;
import com.huami.components.devicestatus.DeviceStatusStringProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u000bB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/utils/DeviceStatusHelper;", "", "Lcom/huami/components/devicestatus/DeviceStatusNavigator;", "getDeviceStatusNavigator", "deviceStatusNavigator", "", "setDeviceStatusNavigator", "Lcom/huami/components/devicestatus/DeviceStatusStringProvider;", "getDeviceStatusStringProvider", "deviceStatusStringProvider", "setDeviceStatusStringProvider", "a", "Lcom/huami/components/devicestatus/DeviceStatusStringProvider;", "b", "Lcom/huami/components/devicestatus/DeviceStatusNavigator;", "<init>", "()V", "Companion", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceStatusHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private DeviceStatusStringProvider deviceStatusStringProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private DeviceStatusNavigator deviceStatusNavigator;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/utils/DeviceStatusHelper$Companion;", "", "Lcom/huami/xiaopeng/ui/amazfit/utils/DeviceStatusHelper;", "getInstance", "<init>", "()V", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DeviceStatusHelper getInstance() {
            return a.a.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"com/huami/xiaopeng/ui/amazfit/utils/DeviceStatusHelper$a", "", "Lcom/huami/xiaopeng/ui/amazfit/utils/DeviceStatusHelper;", "b", "Lcom/huami/xiaopeng/ui/amazfit/utils/DeviceStatusHelper;", "a", "()Lcom/huami/xiaopeng/ui/amazfit/utils/DeviceStatusHelper;", "INSTANCE", "<init>", "()V", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        @NotNull
        public static final a a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final DeviceStatusHelper INSTANCE = new DeviceStatusHelper();

        private a() {
        }

        @NotNull
        public final DeviceStatusHelper a() {
            return INSTANCE;
        }
    }

    @Nullable
    public final DeviceStatusNavigator getDeviceStatusNavigator() {
        return this.deviceStatusNavigator;
    }

    @Nullable
    public final DeviceStatusStringProvider getDeviceStatusStringProvider() {
        return this.deviceStatusStringProvider;
    }

    public final void setDeviceStatusNavigator(@NotNull DeviceStatusNavigator deviceStatusNavigator) {
        this.deviceStatusNavigator = deviceStatusNavigator;
    }

    public final void setDeviceStatusStringProvider(@NotNull DeviceStatusStringProvider deviceStatusStringProvider) {
        this.deviceStatusStringProvider = deviceStatusStringProvider;
    }
}
