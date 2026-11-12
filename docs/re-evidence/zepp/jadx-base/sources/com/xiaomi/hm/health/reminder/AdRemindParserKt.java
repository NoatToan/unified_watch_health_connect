package com.xiaomi.hm.health.reminder;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.adreminder.AdReminder;
import com.xiaomi.hm.health.bt.profile.adreminder.Goal;
import com.xiaomi.hm.health.bt.profile.adreminder.GoalReminder;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0018\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n2\u0006\u0010\t\u001a\u00020\u0000H\u0002\"\u0016\u0010\r\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0016\u0010\u000f\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e\"\u0016\u0010\u0010\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\"\u0016\u0010\u0011\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e\"\u0016\u0010\u0012\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e\"\u0016\u0010\u0013\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e\"\u0016\u0010\u0014\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e\"\u0016\u0010\u0015\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e\"\u0016\u0010\u0016\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000e\"\u0016\u0010\u0017\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000e\"\u0016\u0010\u0018\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000e\"\u0016\u0010\u0019\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000e\"\u0016\u0010\u001a\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000e\"\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0016\u0010\u001e\u001a\u00020\u001b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d\"\u0016\u0010\u001f\u001a\u00020\u001b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"", "data", "Lcom/xiaomi/hm/health/reminder/NotifyMessagePushCallback;", "callback", "", "work", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/adreminder/AdReminder;", "parse", "date", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "a", "TAG", "Ljava/lang/String;", "KEY_ID", "KEY_OP", "KEY_CATEGORY", "KEY_START_DATE", "KEY_STOP_DATE", "KEY_TEXT", "KEY_BODY", "KEY_CONFIG", "KEY_TYPE", "KEY_VALUE", "KEY_ITEMS", "TYPE_STEP", "", "CATEGORY_GOAL", LogUtil.I, "OP_CLOSE", "OP_REOPEN", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class AdRemindParserKt {
    public static final int CATEGORY_GOAL = 7;

    @NotNull
    public static final String KEY_BODY = "body";

    @NotNull
    public static final String KEY_CATEGORY = "category";

    @NotNull
    public static final String KEY_CONFIG = "config";

    @NotNull
    public static final String KEY_ID = "id";

    @NotNull
    public static final String KEY_ITEMS = "items";

    @NotNull
    public static final String KEY_OP = "op";

    @NotNull
    public static final String KEY_START_DATE = "startDate";

    @NotNull
    public static final String KEY_STOP_DATE = "stopDate";

    @NotNull
    public static final String KEY_TEXT = "title";

    @NotNull
    public static final String KEY_TYPE = "type";

    @NotNull
    public static final String KEY_VALUE = "value";
    public static final int OP_CLOSE = 0;
    public static final int OP_REOPEN = 3;

    @NotNull
    public static final String TAG = "AdRemindParser";

    @NotNull
    public static final String TYPE_STEP = "step";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parseData: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<AdReminder> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ArrayList<AdReminder> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "reminders: " + Arrays.toString(this.a.toArray());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "reminder null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device not support";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "miss connect";
        }
    }

    private static final Calendar a(String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).parse(str));
        return calendar;
    }

    @NotNull
    public static final ArrayList<AdReminder> parse(@NotNull String str) {
        ArrayList<AdReminder> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("id");
            int i2 = jSONObject.getInt(KEY_OP);
            if (i2 == 0) {
                AdReminder adReminder = new AdReminder();
                adReminder.setIndex((byte) i);
                adReminder.setEnable(false);
                Unit unit = Unit.INSTANCE;
                arrayList.add(adReminder);
                return arrayList;
            }
            if (i2 == 3) {
                AdReminder adReminder2 = new AdReminder();
                adReminder2.setIndex((byte) i);
                adReminder2.setEnable(false);
                Unit unit2 = Unit.INSTANCE;
                arrayList.add(adReminder2);
            }
            String string = jSONObject.getString("startDate");
            String string2 = jSONObject.getString(KEY_STOP_DATE);
            AdReminder adReminder3 = new AdReminder();
            adReminder3.setIndex((byte) i);
            adReminder3.setStartTime(a(string));
            adReminder3.setStopTime(a(string2));
            adReminder3.setEnable(true);
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            int length = jSONArray.length();
            if (length > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    if (jSONObject2.getInt("category") == 7) {
                        String strOptString = jSONObject2.optString("title");
                        String strOptString2 = jSONObject2.optString("body");
                        JSONObject jSONObject3 = jSONObject2.getJSONArray("config").getJSONObject(0);
                        if (Intrinsics.areEqual(jSONObject3.getString("type"), "step")) {
                            int i5 = jSONObject3.getInt("value");
                            Goal goal = new Goal();
                            goal.setFlag(1);
                            goal.setValue(i5);
                            GoalReminder goalReminder = new GoalReminder();
                            goalReminder.setTitle(strOptString);
                            goalReminder.setBody(strOptString2);
                            goalReminder.setStartTime(a(string));
                            goalReminder.setStopTime(a(string2));
                            goalReminder.setType((byte) 0);
                            goalReminder.setGoal(goal);
                            adReminder3.addGoalReminder(goalReminder);
                        }
                    }
                    if (i4 >= length) {
                        break;
                    }
                    i3 = i4;
                }
            }
            arrayList.add(adReminder3);
            return arrayList;
        } catch (Exception e2) {
            HMLog.info(TAG, new a(e2));
        }
    }

    public static final void work(@NotNull String str, @NotNull final NotifyMessagePushCallback notifyMessagePushCallback) {
        ArrayList<AdReminder> arrayList = parse(str);
        HMLog.info(TAG, new b(arrayList));
        if (arrayList.isEmpty()) {
            HMLog.info(TAG, c.a);
            notifyMessagePushCallback.onResult(6);
            return;
        }
        if (!HMDeviceConfig.isWuhanSeries() && !HMDeviceConfig.isCincoSeries()) {
            HMLog.info(TAG, d.a);
            notifyMessagePushCallback.onResult(2);
            return;
        }
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        if (hMMiLiProDevice == null) {
            HMLog.info(TAG, e.a);
            notifyMessagePushCallback.onResult(0);
        } else if (hMMiLiProDevice.isConnected()) {
            hMMiLiProDevice.setAdReminder(arrayList, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.reminder.AdRemindParserKt.work.6

                /* JADX INFO: renamed from: com.xiaomi.hm.health.reminder.AdRemindParserKt$work$6$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "ret: " + this.a;
                    }
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                    onFinish(bool.booleanValue());
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    HMLog.info(AdRemindParserKt.TAG, new a(result));
                    notifyMessagePushCallback.onResult(result ? -1 : 4);
                }
            });
        } else {
            HMLog.info(TAG, f.a);
            notifyMessagePushCallback.onResult(1);
        }
    }
}
