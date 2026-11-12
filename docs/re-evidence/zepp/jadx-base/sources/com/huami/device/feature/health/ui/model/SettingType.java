package com.huami.device.feature.health.ui.model;

import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/huami/device/feature/health/ui/model/SettingType;", "", "", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "type", "<init>", "(Ljava/lang/String;)V", "BloodPressure", StatEvent.OTHER, "Lcom/huami/device/feature/health/ui/model/SettingType$BloodPressure;", "Lcom/huami/device/feature/health/ui/model/SettingType$Other;", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class SettingType {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/model/SettingType$BloodPressure;", "Lcom/huami/device/feature/health/ui/model/SettingType;", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class BloodPressure extends SettingType {

        @NotNull
        public static final BloodPressure INSTANCE = new BloodPressure();

        private BloodPressure() {
            super("BloodPressure", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/model/SettingType$Other;", "Lcom/huami/device/feature/health/ui/model/SettingType;", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Other extends SettingType {

        @NotNull
        public static final Other INSTANCE = new Other();

        private Other() {
            super(StatEvent.OTHER, null);
        }
    }

    private SettingType(String str) {
        this.type = str;
    }

    public /* synthetic */ SettingType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
