package com.huami.ai.speech.alexa.uitls;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.ai.speech.alexa.alarm.AlarmDay;
import com.huami.ai.speech.alexa.alarm.Recurrence;
import com.huami.ai.speech.alexa.capability.alerts.AlertType;
import com.huami.tools.log.HMLog;
import com.huami.watch.ota.UpdateUtils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0000H\u0002\u001a\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\"\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"", "token", "Lcom/huami/ai/speech/alexa/capability/alerts/AlertType;", "getTypeByAlertToken", "repeatType", "", "byDay", "", "parseAlexaAlarmRepeat", "(Ljava/lang/String;[Ljava/lang/String;)I", "a", "([Ljava/lang/String;)I", "dayName", "b", "shortAlexaAlertToken", LogUtil.I, "WORKDAY_LENGTH", "speech-alexa_release"}, k = 2, mv = {1, 5, 1})
public final class AlertUtilKt {
    private static final int a = 5;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Recurrence.values().length];
            iArr[Recurrence.DAILY.ordinal()] = 1;
            iArr[Recurrence.WEEKLY.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AlarmDay.values().length];
            iArr2[AlarmDay.MO.ordinal()] = 1;
            iArr2[AlarmDay.TU.ordinal()] = 2;
            iArr2[AlarmDay.WE.ordinal()] = 3;
            iArr2[AlarmDay.TH.ordinal()] = 4;
            iArr2[AlarmDay.FR.ordinal()] = 5;
            iArr2[AlarmDay.SA.ordinal()] = 6;
            iArr2[AlarmDay.SU.ordinal()] = 7;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("un expect token:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String[] strArr) {
            super(0);
            this.a = strArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("解析闹钟循环数据时，遇到意外的，未处理的数据类型：", Arrays.toString(this.a));
        }
    }

    private static final int a(String[] strArr) {
        if (strArr == null) {
            return 0;
        }
        int length = strArr.length;
        if (length == 1) {
            return b(strArr[0]);
        }
        if (length == 2) {
            return 96;
        }
        if (length == 5) {
            return 31;
        }
        HMLog.error$default("speech", null, null, new b(strArr), 6, null);
        return 0;
    }

    private static final int b(String str) {
        switch (WhenMappings.$EnumSwitchMapping$1[AlarmDay.valueOf(str).ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 16;
            case 6:
                return 32;
            case 7:
                return 64;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Nullable
    public static final AlertType getTypeByAlertToken(@NotNull String str) {
        if (StringsKt__StringsKt.contains((CharSequence) str, (CharSequence) "Alarms", true)) {
            return AlertType.ALARM;
        }
        if (StringsKt__StringsKt.contains((CharSequence) str, (CharSequence) "Reminders", true)) {
            return AlertType.REMINDER;
        }
        if (StringsKt__StringsKt.contains((CharSequence) str, (CharSequence) AVSAPIConstants.Notifications.NAMESPACE, true)) {
            return AlertType.TIMER;
        }
        HMLog.warn$default("speech", null, new a(str), 2, null);
        return null;
    }

    public static final int parseAlexaAlarmRepeat(@NotNull String str, @Nullable String[] strArr) {
        int i = WhenMappings.$EnumSwitchMapping$0[Recurrence.valueOf(str).ordinal()];
        if (i == 1) {
            return 127;
        }
        if (i == 2) {
            return a(strArr);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final String shortAlexaAlertToken(@NotNull String str) {
        return (String) CollectionsKt.last(StringsKt__StringsKt.split$default((CharSequence) str, new String[]{UpdateUtils.CMD_FILTER}, false, 0, 6, (Object) null));
    }
}
