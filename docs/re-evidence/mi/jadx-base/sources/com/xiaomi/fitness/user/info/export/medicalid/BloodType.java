package com.xiaomi.fitness.user.info.export.medicalid;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/medicalid/BloodType;", "", "Companion", "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface BloodType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int TYPE_A = 1;
    public static final int TYPE_AB = 3;
    public static final int TYPE_B = 2;
    public static final int TYPE_O = 4;
    public static final int TYPE_RH_AB_N = 10;
    public static final int TYPE_RH_AB_P = 9;
    public static final int TYPE_RH_A_N = 6;
    public static final int TYPE_RH_A_P = 5;
    public static final int TYPE_RH_B_N = 8;
    public static final int TYPE_RH_B_P = 7;
    public static final int TYPE_RH_O_N = 12;
    public static final int TYPE_RH_O_P = 11;
    public static final int TYPE_UNKNOWN = 0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/medicalid/BloodType$Companion;", "", "<init>", "()V", "TYPE_UNKNOWN", "", "TYPE_A", "TYPE_B", "TYPE_AB", "TYPE_O", "TYPE_RH_A_P", "TYPE_RH_A_N", "TYPE_RH_B_P", "TYPE_RH_B_N", "TYPE_RH_AB_P", "TYPE_RH_AB_N", "TYPE_RH_O_P", "TYPE_RH_O_N", "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int TYPE_A = 1;
        public static final int TYPE_AB = 3;
        public static final int TYPE_B = 2;
        public static final int TYPE_O = 4;
        public static final int TYPE_RH_AB_N = 10;
        public static final int TYPE_RH_AB_P = 9;
        public static final int TYPE_RH_A_N = 6;
        public static final int TYPE_RH_A_P = 5;
        public static final int TYPE_RH_B_N = 8;
        public static final int TYPE_RH_B_P = 7;
        public static final int TYPE_RH_O_N = 12;
        public static final int TYPE_RH_O_P = 11;
        public static final int TYPE_UNKNOWN = 0;

        private Companion() {
        }
    }
}
