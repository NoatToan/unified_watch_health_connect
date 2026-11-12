package com.xiaomi.hm.health.hmintent;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.sleepassistant.lib.ui.base.Navigator;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.HMIntentHandler;
import com.xiaomi.hm.health.healthdata.navigation.SleepExternalNavigtor;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0016\u0010\u0015\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0016\u0010!\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\nR\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\n¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/hmintent/SleepHMIntent;", "Lcom/xiaomi/hm/health/hmintent/IHMIntent;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/HMIntentHandler$HMAction;", "action", "", "doAction", "", "a", "Ljava/lang/String;", "TAG", "b", "SLEEP_TARGET_DETAIL", "c", "SLEEP_TARGET_HOME", GoogleApiAvailabilityLight.a, "SLEEP_TARGET_RHYTHM_DETAIL", "e", "SLEEP_TARGET_RHYTHM_LIST", "f", "SLEEP_TARGET_BREATH_INTRODUCE", "g", "SLEEP_TARGET_BREATH_DETAIL", "h", "SLEEP_TARGET_LITTLE", "i", "SLEEP_TARGET_RHYTHM_H5", z.j, "SLEEP_TARGET_DETAIL_DAY", hl.k, "SLEEP_TARGET_DETAIL_WEEK", "l", "SLEEP_TARGET_DETAIL_MONTH", "m", "SLEEP_TARGET_DETAIL_YEAR", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepHMIntent implements IHMIntent {

    @NotNull
    public static final SleepHMIntent INSTANCE = new SleepHMIntent();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "SleepHMIntent";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String SLEEP_TARGET_DETAIL = "detail";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String SLEEP_TARGET_HOME = "home";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String SLEEP_TARGET_RHYTHM_DETAIL = "rhythm_detail";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String SLEEP_TARGET_RHYTHM_LIST = "rhythm_list";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String SLEEP_TARGET_BREATH_INTRODUCE = "breath_introduce";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String SLEEP_TARGET_BREATH_DETAIL = "breath_detail";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String SLEEP_TARGET_LITTLE = "little";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final String SLEEP_TARGET_RHYTHM_H5 = "rhythm_h5";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final String SLEEP_TARGET_DETAIL_DAY = "day";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static final String SLEEP_TARGET_DETAIL_WEEK = "week";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private static final String SLEEP_TARGET_DETAIL_MONTH = "month";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private static final String SLEEP_TARGET_DETAIL_YEAR = "year";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMIntentHandler.HMAction a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMIntentHandler.HMAction hMAction) {
            super(0);
            this.a = hMAction;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "action:" + new Gson().toJson(this.a);
        }
    }

    private SleepHMIntent() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.xiaomi.hm.health.hmintent.IHMIntent
    public boolean doAction(@NotNull Context context, @NotNull HMIntentHandler.HMAction action) {
        HMLog.info(TAG, new a(action));
        String target = action.getTarget();
        if (target == null) {
            return false;
        }
        switch (target) {
            case "breath_introduce":
                SleepExternalNavigtor.INSTANCE.jumpPranayamaIntroduction();
                return true;
            case "detail":
                String vaildData = HMIntentHandler.getVaildData(action.getData(), "type");
                if (vaildData != null) {
                    switch (vaildData.hashCode()) {
                        case 99228:
                            if (vaildData.equals("day")) {
                                SleepExternalNavigtor.INSTANCE.jumpSleepDay();
                            }
                            break;
                        case 3645428:
                            if (vaildData.equals("week")) {
                                SleepExternalNavigtor.INSTANCE.jumpSleepWeek();
                            }
                            break;
                        case 3704893:
                            if (vaildData.equals("year")) {
                                SleepExternalNavigtor.INSTANCE.jumpSleepYear();
                            }
                            break;
                        case 104080000:
                            if (vaildData.equals("month")) {
                                SleepExternalNavigtor.INSTANCE.jumpSleepMonth();
                            }
                            break;
                    }
                }
                return true;
            case "breath_detail":
                SleepExternalNavigtor.INSTANCE.jumpPranayamaDetails();
                return true;
            case "rhythm_list":
                String vaildData2 = HMIntentHandler.getVaildData(action.getData(), "type");
                SleepExternalNavigtor sleepExternalNavigtor = SleepExternalNavigtor.INSTANCE;
                if (vaildData2 != null) {
                    sleepExternalNavigtor.jumpToneList(vaildData2);
                }
                return true;
            case "rhythm_h5":
                Navigator.INSTANCE.startMusicPlayer(context);
                return true;
            case "rhythm_detail":
                String vaildData3 = HMIntentHandler.getVaildData(action.getData(), "id");
                List listSplit$default = vaildData3 == null ? null : StringsKt__StringsKt.split$default((CharSequence) vaildData3, new String[]{","}, false, 0, 6, (Object) null);
                if (listSplit$default != null) {
                    Object[] array = listSplit$default.toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    SleepExternalNavigtor.INSTANCE.jumpToneDetails((String[]) array);
                }
                return true;
            default:
                return false;
        }
    }
}
