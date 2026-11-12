package com.huami.device.feature.health.ui.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/health/ui/model/SettingStatus;", "", "<init>", "()V", "Fail", "Loading", "Success", "Lcom/huami/device/feature/health/ui/model/SettingStatus$Success;", "Lcom/huami/device/feature/health/ui/model/SettingStatus$Fail;", "Lcom/huami/device/feature/health/ui/model/SettingStatus$Loading;", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class SettingStatus {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/model/SettingStatus$Fail;", "Lcom/huami/device/feature/health/ui/model/SettingStatus;", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Fail extends SettingStatus {

        @NotNull
        public static final Fail INSTANCE = new Fail();

        private Fail() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/model/SettingStatus$Loading;", "Lcom/huami/device/feature/health/ui/model/SettingStatus;", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Loading extends SettingStatus {

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/model/SettingStatus$Success;", "Lcom/huami/device/feature/health/ui/model/SettingStatus;", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Success extends SettingStatus {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    private SettingStatus() {
    }

    public /* synthetic */ SettingStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
