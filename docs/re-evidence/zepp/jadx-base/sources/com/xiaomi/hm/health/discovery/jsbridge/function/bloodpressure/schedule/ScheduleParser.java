package com.xiaomi.hm.health.discovery.jsbridge.function.bloodpressure.schedule;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.assistant.ui.v2.model.ScheduleRepeatMode;
import com.huami.assistant.ui.v2.util.ScheduleIdUtil;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bG\u0010HJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0012R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0012R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0012R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0012R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0012R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0012R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0012R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u0012R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u0012R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u0012R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010\u0012R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u0010\u0012R\u0016\u0010;\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010\u0012R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010\u0012R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010\u0012R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/bloodpressure/schedule/ScheduleParser;", "", "", "loop", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "parseRepeatMode", "", "remind", "a", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/discovery/jsbridge/function/bloodpressure/schedule/ScheduleBean;", "Lkotlin/collections/ArrayList;", "beans", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "parseSchedule", "json", "Lcom/xiaomi/hm/health/discovery/jsbridge/function/bloodpressure/schedule/SchedulePayload;", LogUtil.I, "REMIND_CLOSE", "b", "REMIND_CURRENT", "c", "REMIND_5_MINUTES", GoogleApiAvailabilityLight.a, "REMIND_10_MINUTES", "e", "REMIND_15_MINUTES", "f", "REMIND_30_MINUTES", "g", "REMIND_1_HOUR", "h", "REMIND_2_HOURS", "i", "LOOP_EVERYDAY", z.j, "LOOP_MON", hl.k, "LOOP_TUES", "l", "LOOP_WED", "m", "LOOP_THUR", GoogleApiAvailabilityLight.b, "LOOP_FRI", "o", "LOOP_SAT", com.google.android.exoplayer2.text.ttml.b.r, "LOOP_SUN", DTransferConstants.SEARCH_KEY, "LOOP_MONTH", "r", "LOOP_YEAR", SOAP.XMLNS, "LOOP_ONCE", "t", "LOOP_WORKDAY", "u", "LOOP_WEEKEND", "v", "LOOP_WEEK", "w", "LOOP_FORTNIGHT", "Lcom/google/gson/Gson;", "x", "Lcom/google/gson/Gson;", "gson", "y", "Ljava/lang/String;", "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ScheduleParser {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int REMIND_CLOSE = 0;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int REMIND_CURRENT = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int REMIND_5_MINUTES = 2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int REMIND_10_MINUTES = 3;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int REMIND_15_MINUTES = 4;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final int REMIND_30_MINUTES = 5;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final int REMIND_1_HOUR = 6;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final int REMIND_2_HOURS = 7;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final int LOOP_EVERYDAY = 0;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final int LOOP_MON = 1;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final int LOOP_TUES = 2;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final int LOOP_WED = 3;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final int LOOP_THUR = 4;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final int LOOP_FRI = 5;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final int LOOP_SAT = 6;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final int LOOP_SUN = 7;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final int LOOP_MONTH = 8;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private static final int LOOP_YEAR = 9;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private static final int LOOP_ONCE = 10;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private static final int LOOP_WORKDAY = 11;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private static final int LOOP_WEEKEND = 12;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private static final int LOOP_WEEK = 13;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private static final int LOOP_FORTNIGHT = 14;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "ScheduleParser";

    @NotNull
    public static final ScheduleParser INSTANCE = new ScheduleParser();

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private static final Gson gson = new Gson();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parseSchedule: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parse schedule: " + this.a;
        }
    }

    private ScheduleParser() {
    }

    private final int a(int remind) {
        switch (remind) {
            case 0:
                return -1;
            case 1:
                return 0;
            case 2:
                return 300;
            case 3:
                return 600;
            case 4:
                return 900;
            case 5:
                return 1800;
            case 6:
                return 3600;
            case 7:
                return 7200;
            default:
                throw new IllegalArgumentException("not support remind: " + remind);
        }
    }

    @JvmStatic
    @NotNull
    public static final ScheduleRepeatMode parseRepeatMode(@NotNull String loop) {
        long mode;
        List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) loop, new String[]{","}, false, 0, 6, (Object) null);
        if (listSplit$default.size() > 1) {
            long j = 0;
            for (String str : listSplit$default) {
                switch (Integer.parseInt(str)) {
                    case 1:
                        mode = ScheduleRepeatMode.Monday.INSTANCE.getMode();
                        break;
                    case 2:
                        mode = ScheduleRepeatMode.Tuesday.INSTANCE.getMode();
                        break;
                    case 3:
                        mode = ScheduleRepeatMode.Wednesday.INSTANCE.getMode();
                        break;
                    case 4:
                        mode = ScheduleRepeatMode.Thursday.INSTANCE.getMode();
                        break;
                    case 5:
                        mode = ScheduleRepeatMode.Friday.INSTANCE.getMode();
                        break;
                    case 6:
                        mode = ScheduleRepeatMode.Saturday.INSTANCE.getMode();
                        break;
                    case 7:
                        mode = ScheduleRepeatMode.Sunday.INSTANCE.getMode();
                        break;
                    default:
                        throw new IllegalArgumentException("not support loop: " + str);
                }
                j = mode | j;
            }
            return new ScheduleRepeatMode(j);
        }
        int i = Integer.parseInt(loop);
        if (i == 0) {
            return ScheduleRepeatMode.EveryDay.INSTANCE;
        }
        if (i == 1) {
            return ScheduleRepeatMode.Monday.INSTANCE;
        }
        if (i == 2) {
            return ScheduleRepeatMode.Tuesday.INSTANCE;
        }
        if (i == 3) {
            return ScheduleRepeatMode.Wednesday.INSTANCE;
        }
        if (i == 4) {
            return ScheduleRepeatMode.Thursday.INSTANCE;
        }
        if (i == 5) {
            return ScheduleRepeatMode.Friday.INSTANCE;
        }
        if (i == 6) {
            return ScheduleRepeatMode.Saturday.INSTANCE;
        }
        if (i == 7) {
            return ScheduleRepeatMode.Sunday.INSTANCE;
        }
        if (i == 8) {
            return ScheduleRepeatMode.Month.INSTANCE;
        }
        if (i == 9) {
            return ScheduleRepeatMode.Year.INSTANCE;
        }
        if (i == 10) {
            return ScheduleRepeatMode.Once.INSTANCE;
        }
        if (i == 11) {
            return ScheduleRepeatMode.WorkDay.INSTANCE;
        }
        if (i == 12) {
            return ScheduleRepeatMode.Weekend.INSTANCE;
        }
        if (i == 13) {
            return ScheduleRepeatMode.Week.INSTANCE;
        }
        if (i == 14) {
            return ScheduleRepeatMode.Fortnight.INSTANCE;
        }
        throw new IllegalArgumentException("not support loop: " + loop);
    }

    @NotNull
    public final List<ScheduleModel> parseSchedule(@NotNull ArrayList<ScheduleBean> beans) {
        Object objM3845constructorimpl;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(beans, 10));
        for (ScheduleBean scheduleBean : beans) {
            try {
                Result.Companion companion = Result.Companion;
                long j = 1000;
                long time = simpleDateFormat.parse(scheduleBean.getStartDate()).getTime() / j;
                long time2 = simpleDateFormat.parse(scheduleBean.getStopDate()).getTime() / j;
                long jGenerateId = ScheduleIdUtil.INSTANCE.generateId();
                String title = scheduleBean.getTitle();
                String note = scheduleBean.getNote();
                if (note == null) {
                    note = "";
                }
                objM3845constructorimpl = Result.m3845constructorimpl(new ScheduleModel(jGenerateId, title, note, time, time2, INSTANCE.a(scheduleBean.getRemind()), parseRepeatMode(scheduleBean.getLoop()).getMode(), 0L, scheduleBean.getAllDay(), null, 0, 0L, null, 7808, null));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error$default(TAG, null, null, new a(thM3848exceptionOrNullimpl), 6, null);
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            arrayList.add((ScheduleModel) objM3845constructorimpl);
        }
        return CollectionsKt___CollectionsKt.filterNotNull(arrayList);
    }

    @Nullable
    public final SchedulePayload parseSchedule(@Nullable String json) {
        Object objM3845constructorimpl;
        if (json == null || m.isBlank(json)) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl((SchedulePayload) gson.fromJson(json, SchedulePayload.class));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(TAG, null, null, new b(thM3848exceptionOrNullimpl), 6, null);
        }
        return (SchedulePayload) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }
}
