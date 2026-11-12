package com.huami.sky.ui.sleepreminder;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.timepicker.TimeModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/huami/sky/ui/sleepreminder/SkySleepReminderParams;", "", "", "", "buildHourParams", "buildMinuteParams", "", "a", LogUtil.I, "REMINDER_HOUR_START", "b", "REMINDER_HOUR_END", "c", "REMINDER_MINUTE_START", GoogleApiAvailabilityLight.a, "REMINDER_MINUTE_END", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkySleepReminderParams {

    @NotNull
    public static final SkySleepReminderParams INSTANCE = new SkySleepReminderParams();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int REMINDER_HOUR_START = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int REMINDER_HOUR_END = 12;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int REMINDER_MINUTE_START = 0;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int REMINDER_MINUTE_END = 59;

    private SkySleepReminderParams() {
    }

    @NotNull
    public final List<String> buildHourParams() {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (true) {
            int i2 = i + 1;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            arrayList.add(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
            if (i2 > 12) {
                return arrayList;
            }
            i = i2;
        }
    }

    @NotNull
    public final List<String> buildMinuteParams() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            arrayList.add(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
            if (i2 > 59) {
                return arrayList;
            }
            i = i2;
        }
    }
}
