package com.xiaomi.fitness.schema.export;

import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/schema/export/PushConstants;", "", "<init>", "()V", "sSchemeWearable", "", "getSSchemeWearable$annotations", "getSSchemeWearable", "()Ljava/lang/String;", "sSchemeMihealth", "getSSchemeMihealth$annotations", "getSSchemeMihealth", "sSchemeWearableStrava", "getSSchemeWearableStrava$annotations", "getSSchemeWearableStrava", "schema-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PushConstants {

    @NotNull
    public static final PushConstants INSTANCE = new PushConstants();

    @NotNull
    private static final String sSchemeWearable = "wearable";

    @NotNull
    private static final String sSchemeMihealth = "mihealth";

    @NotNull
    private static final String sSchemeWearableStrava = ThirdPartAccessConstants.STRAVA_SCHEME;

    private PushConstants() {
    }

    @NotNull
    public static final String getSSchemeMihealth() {
        return sSchemeMihealth;
    }

    @JvmStatic
    public static /* synthetic */ void getSSchemeMihealth$annotations() {
    }

    @NotNull
    public static final String getSSchemeWearable() {
        return sSchemeWearable;
    }

    @JvmStatic
    public static /* synthetic */ void getSSchemeWearable$annotations() {
    }

    @NotNull
    public static final String getSSchemeWearableStrava() {
        return sSchemeWearableStrava;
    }

    @JvmStatic
    public static /* synthetic */ void getSSchemeWearableStrava$annotations() {
    }
}
