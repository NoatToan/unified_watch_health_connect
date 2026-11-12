package com.huami.device.feature.health.model;

import com.huami.network.hmnetwork.properties.Property;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/huami/device/feature/health/model/UserHealthConfigKey;", "", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "<init>", "(Ljava/lang/String;)V", "HEALTH_DETECT_KEY", "HR_DETECT_ATRIAL_KEY", "HR_DETECT_KEY", "Lcom/huami/device/feature/health/model/UserHealthConfigKey$HR_DETECT_KEY;", "Lcom/huami/device/feature/health/model/UserHealthConfigKey$HR_DETECT_ATRIAL_KEY;", "Lcom/huami/device/feature/health/model/UserHealthConfigKey$HEALTH_DETECT_KEY;", "health-base_release"}, k = 1, mv = {1, 5, 1})
public abstract class UserHealthConfigKey {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String key;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/model/UserHealthConfigKey$HEALTH_DETECT_KEY;", "Lcom/huami/device/feature/health/model/UserHealthConfigKey;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class HEALTH_DETECT_KEY extends UserHealthConfigKey {

        @NotNull
        public static final HEALTH_DETECT_KEY INSTANCE = new HEALTH_DETECT_KEY();

        private HEALTH_DETECT_KEY() {
            super("huami.mifit.user.settings.health.detect", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/model/UserHealthConfigKey$HR_DETECT_ATRIAL_KEY;", "Lcom/huami/device/feature/health/model/UserHealthConfigKey;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class HR_DETECT_ATRIAL_KEY extends UserHealthConfigKey {

        @NotNull
        public static final HR_DETECT_ATRIAL_KEY INSTANCE = new HR_DETECT_ATRIAL_KEY();

        private HR_DETECT_ATRIAL_KEY() {
            super(Property.PROPERTY_THIRD_PART_HR_DETECT_ATRIAL_FIB, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/model/UserHealthConfigKey$HR_DETECT_KEY;", "Lcom/huami/device/feature/health/model/UserHealthConfigKey;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class HR_DETECT_KEY extends UserHealthConfigKey {

        @NotNull
        public static final HR_DETECT_KEY INSTANCE = new HR_DETECT_KEY();

        private HR_DETECT_KEY() {
            super(Property.PROPERTY_THIRD_PART_HR_DETECT, null);
        }
    }

    private UserHealthConfigKey(String str) {
        this.key = str;
    }

    public /* synthetic */ UserHealthConfigKey(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
