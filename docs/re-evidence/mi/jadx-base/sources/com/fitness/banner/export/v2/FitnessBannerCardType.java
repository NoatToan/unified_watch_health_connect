package com.fitness.banner.export.v2;

import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/fitness/banner/export/v2/FitnessBannerCardType;", "", "Companion", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public @interface FitnessBannerCardType {
    public static final int BLOOD_PRESSURE = 3;
    public static final int CURSE = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int ECG = 4;
    public static final int ENERGY = 13;
    public static final int HEARING = 10;
    public static final int HEART_RATE = 2;
    public static final int PAI = 12;
    public static final int SLEEP = 1;
    public static final int SPO2 = 5;
    public static final int STRESS = 9;
    public static final int TEMPERATURE = 7;
    public static final int UNKNOWN = 0;
    public static final int VITALITY = 11;
    public static final int WEIGHT = 6;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/fitness/banner/export/v2/FitnessBannerCardType$Companion;", "", "<init>", "()V", DeviceTypes.UNKNOWN, "", "SLEEP", "HEART_RATE", "BLOOD_PRESSURE", DialWidgetType.ECG, "SPO2", "WEIGHT", "TEMPERATURE", "CURSE", "STRESS", "HEARING", "VITALITY", "PAI", "ENERGY", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int BLOOD_PRESSURE = 3;
        public static final int CURSE = 8;
        public static final int ECG = 4;
        public static final int ENERGY = 13;
        public static final int HEARING = 10;
        public static final int HEART_RATE = 2;
        public static final int PAI = 12;
        public static final int SLEEP = 1;
        public static final int SPO2 = 5;
        public static final int STRESS = 9;
        public static final int TEMPERATURE = 7;
        public static final int UNKNOWN = 0;
        public static final int VITALITY = 11;
        public static final int WEIGHT = 6;

        private Companion() {
        }
    }
}
