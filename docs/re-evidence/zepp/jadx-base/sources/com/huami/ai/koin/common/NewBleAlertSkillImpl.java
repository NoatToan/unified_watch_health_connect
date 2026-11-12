package com.huami.ai.koin.common;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.amap.api.mapcore.util.hl;
import com.huami.ai.entity.alert.Alarm;
import com.huami.ai.entity.alert.Reminder;
import com.huami.ai.entity.alert.Timer;
import com.huami.ai.skill.AlertSkill;
import com.huami.ai.uitls.AlertUtilKt;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.ai.uitls.ISO8601DateFormatterKt;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.bluetooth.profile.channel.module.voice.command.NLPCommand;
import com.huami.bluetooth.profile.channel.module.voice.content.AlertContent;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020,¢\u0006\u0004\b0\u00101J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0013J\u0013\u0010\u0017\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u001b\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0013J\u001b\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0013J\u001d\u0010\"\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0015J\u0013\u0010%\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0015J\u0013\u0010&\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0015J\u0013\u0010'\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0015J\u0013\u0010(\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0015R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcom/huami/ai/koin/common/NewBleAlertSkillImpl;", "Lcom/huami/ai/skill/AlertSkill;", "", "circle", "", "cron", "", hl.k, "", "time", "a", "Lcom/huami/ai/entity/alert/Alarm;", "alarm", "", "setAlarm", "(Lcom/huami/ai/entity/alert/Alarm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "token", "deleteAlarm", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openAlarm", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeAlarm", "queryAlarm", "Lcom/huami/ai/entity/alert/Timer;", "timer", "setTimer", "(Lcom/huami/ai/entity/alert/Timer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTimer", "Lcom/huami/ai/entity/alert/Reminder;", NotificationCompat.CATEGORY_REMINDER, "setReminder", "(Lcom/huami/ai/entity/alert/Reminder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteReminder", "closeReminder", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryReminder", "openReminder", "openTimer", "closeTimer", "queryTimer", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "b", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "voiceConfig", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public class NewBleAlertSkillImpl implements AlertSkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice baseDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final VoiceConfig voiceConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, List<String> list) {
            super(0);
            this.a = z;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "发送了关闭闹钟的指令：" + this.a + ",token=" + CollectionsKt___CollectionsKt.joinToString$default(this.b, null, null, null, 0, null, null, 63, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, List<String> list) {
            super(0);
            this.a = z;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "发送了删除闹钟的指令:" + this.a + ",token=" + CollectionsKt___CollectionsKt.joinToString$default(this.b, null, null, null, 0, null, null, 63, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, List<String> list) {
            super(0);
            this.a = z;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "发送了删除Reminder的指令：" + this.a + ",token:" + CollectionsKt___CollectionsKt.joinToString$default(this.b, null, null, null, 0, null, null, 63, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, List<String> list) {
            super(0);
            this.a = z;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "发送了删除Timer的指令：" + this.a + ",token:" + CollectionsKt___CollectionsKt.joinToString$default(this.b, null, null, null, 0, null, null, 63, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("发送了打开Timer的指令：", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Alarm a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Alarm alarm) {
            super(0);
            this.a = alarm;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setAlarm-scheduleTime:" + this.a.getScheduledTime() + ",days:" + this.a.getDays();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("setAlarm-timeStamp:", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Alarm b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z, Alarm alarm) {
            super(0);
            this.a = z;
            this.b = alarm;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "发送了设置闹钟的指令:" + this.a + ",token=" + this.b.getToken();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Reminder b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z, Reminder reminder) {
            super(0);
            this.a = z;
            this.b = reminder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "发送设置Reminder的指令：" + this.a + ",token:" + this.b.getToken();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ Timer a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Timer timer, int i, int i2, int i3) {
            super(0);
            this.a = timer;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "scheduledTime:" + this.a.getScheduledTime() + ",parseTime:(hour:" + this.b + ",minute:" + this.c + ",second:" + this.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Timer b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(boolean z, Timer timer) {
            super(0);
            this.a = z;
            this.b = timer;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "发送设置Timer的指令：" + this.a + ",token:" + this.b.getToken();
        }
    }

    public NewBleAlertSkillImpl(@NotNull HMBaseDevice hMBaseDevice, @NotNull VoiceConfig voiceConfig) {
        this.baseDevice = hMBaseDevice;
        this.voiceConfig = voiceConfig;
    }

    private final long a(long time) {
        Calendar calendar = Calendar.getInstance();
        return ((long) (calendar.get(15) + calendar.get(16))) + time;
    }

    public static /* synthetic */ Object b(NewBleAlertSkillImpl newBleAlertSkillImpl, List list, Continuation continuation) {
        if (list == null || list.isEmpty()) {
            return Boxing.boxBoolean(false);
        }
        Boolean boolBoxBoolean = Boxing.boxBoolean(DeviceUtilsKt.sendCommand$default(newBleAlertSkillImpl.baseDevice, new NLPCommand(new AlertContent(1, 1, list, new AlertContent.NormalV3Parameter("", "", 0L, 0L, 0, false))), null, 2, null));
        HMLog.info("speech", new a(boolBoxBoolean.booleanValue(), list));
        return boolBoxBoolean;
    }

    public static /* synthetic */ Object c(NewBleAlertSkillImpl newBleAlertSkillImpl, String str, Continuation continuation) {
        return Boxing.boxBoolean(false);
    }

    public static /* synthetic */ Object d(NewBleAlertSkillImpl newBleAlertSkillImpl, Continuation continuation) {
        return Boxing.boxBoolean(false);
    }

    public static /* synthetic */ Object e(NewBleAlertSkillImpl newBleAlertSkillImpl, List list, Continuation continuation) {
        if (list == null || list.isEmpty()) {
            return Boxing.boxBoolean(false);
        }
        Boolean boolBoxBoolean = Boxing.boxBoolean(DeviceUtilsKt.sendCommand$default(newBleAlertSkillImpl.baseDevice, new NLPCommand(new AlertContent(2, 1, list, null, 8, null)), null, 2, null));
        HMLog.info("speech", new b(boolBoxBoolean.booleanValue(), list));
        return boolBoxBoolean;
    }

    public static /* synthetic */ Object f(NewBleAlertSkillImpl newBleAlertSkillImpl, List list, Continuation continuation) {
        if (list == null || list.isEmpty()) {
            return Boxing.boxBoolean(false);
        }
        Boolean boolBoxBoolean = Boxing.boxBoolean(DeviceUtilsKt.sendCommand$default(newBleAlertSkillImpl.baseDevice, new NLPCommand(new AlertContent(2, 2, list, null, 8, null)), null, 2, null));
        HMLog.info("speech", new c(boolBoxBoolean.booleanValue(), list));
        return boolBoxBoolean;
    }

    public static /* synthetic */ Object g(NewBleAlertSkillImpl newBleAlertSkillImpl, List list, Continuation continuation) {
        if (list == null || list.isEmpty()) {
            return Boxing.boxBoolean(false);
        }
        Boolean boolBoxBoolean = Boxing.boxBoolean(DeviceUtilsKt.sendCommand$default(newBleAlertSkillImpl.baseDevice, new NLPCommand(new AlertContent(2, 3, list, null, 8, null)), null, 2, null));
        HMLog.info("speech", new d(boolBoxBoolean.booleanValue(), list));
        return boolBoxBoolean;
    }

    public static /* synthetic */ Object h(NewBleAlertSkillImpl newBleAlertSkillImpl, Continuation continuation) {
        return Boxing.boxBoolean(false);
    }

    public static /* synthetic */ Object i(NewBleAlertSkillImpl newBleAlertSkillImpl, Continuation continuation) {
        return Boxing.boxBoolean(false);
    }

    public static /* synthetic */ Object j(NewBleAlertSkillImpl newBleAlertSkillImpl, Continuation continuation) {
        Boolean boolBoxBoolean = Boxing.boxBoolean(DeviceUtilsKt.sendCommand$default(newBleAlertSkillImpl.baseDevice, new NLPCommand(new AlertContent(1, 3, CollectionsKt__CollectionsKt.arrayListOf(""), new AlertContent.TimerParameter(0, 0, 0))), null, 2, null));
        HMLog.info("speech", new e(boolBoxBoolean.booleanValue()));
        return boolBoxBoolean;
    }

    private final int k(short circle, String cron) {
        if (circle == 0) {
            return 0;
        }
        if (circle == 4064) {
            return AlertUtilKt.getEveryDay_AlertContent();
        }
        if (circle == AlertUtilKt.getWorkingDay_HMReminderInfo()) {
            return AlertUtilKt.getWorkingDay_AlertContent();
        }
        if (circle == AlertUtilKt.getWeekend_HMReminderInfo()) {
            return AlertUtilKt.getWeekend_AlertContent();
        }
        if (circle == 4096) {
            return 512;
        }
        if (circle == 8192) {
            return 1024;
        }
        if (circle < 4096 && !TextUtils.isEmpty(cron)) {
            return circle >>> 5;
        }
        throw new UnsupportedOperationException("小爱 reminder circle:HOLIDY,circle:" + ((int) circle) + ",cron:" + cron);
    }

    public static /* synthetic */ Object l(NewBleAlertSkillImpl newBleAlertSkillImpl, Continuation continuation) {
        return Boxing.boxBoolean(false);
    }

    public static /* synthetic */ Object m(NewBleAlertSkillImpl newBleAlertSkillImpl, Continuation continuation) {
        return Boxing.boxBoolean(false);
    }

    public static /* synthetic */ Object n(NewBleAlertSkillImpl newBleAlertSkillImpl, Continuation continuation) {
        return Boxing.boxBoolean(false);
    }

    public static /* synthetic */ Object o(NewBleAlertSkillImpl newBleAlertSkillImpl, Alarm alarm, Continuation continuation) {
        HMLog.info("speech", new f(alarm));
        Calendar calendarIso0860ToCalendar = ISO8601DateFormatterKt.iso0860ToCalendar(alarm.getScheduledTime());
        Long lBoxLong = calendarIso0860ToCalendar == null ? null : Boxing.boxLong(calendarIso0860ToCalendar.getTimeInMillis());
        if (lBoxLong == null) {
            return Boxing.boxBoolean(false);
        }
        long jLongValue = lBoxLong.longValue();
        HMLog.info("speech", new g(jLongValue));
        Boolean boolBoxBoolean = Boxing.boxBoolean(DeviceUtilsKt.sendCommand$default(newBleAlertSkillImpl.baseDevice, new NLPCommand(new AlertContent(1, 1, CollectionsKt__CollectionsKt.arrayListOf(alarm.getToken()), newBleAlertSkillImpl.voiceConfig.getVersion() < 3 ? new AlertContent.NormalParameter("", "", newBleAlertSkillImpl.a(jLongValue) / ((long) 1000), 0L, alarm.getDays()) : new AlertContent.NormalV3Parameter("", "", newBleAlertSkillImpl.a(jLongValue) / ((long) 1000), 0L, alarm.getDays(), true))), null, 2, null));
        HMLog.info("speech", new h(boolBoxBoolean.booleanValue(), alarm));
        return boolBoxBoolean;
    }

    public static /* synthetic */ Object p(NewBleAlertSkillImpl newBleAlertSkillImpl, Reminder reminder, Continuation continuation) {
        int iK;
        Calendar calendarIso0860ToCalendar = ISO8601DateFormatterKt.iso0860ToCalendar(reminder.getScheduledTime());
        Long lBoxLong = calendarIso0860ToCalendar == null ? null : Boxing.boxLong(calendarIso0860ToCalendar.getTimeInMillis());
        if (lBoxLong == null) {
            return Boxing.boxBoolean(false);
        }
        long jLongValue = lBoxLong.longValue();
        try {
            iK = newBleAlertSkillImpl.k(reminder.getCircle(), reminder.getCron());
        } catch (Exception e2) {
            HMLog.error$default("speech", null, null, new j(e2), 6, null);
            iK = -1;
        }
        if (iK == -1) {
            return Boxing.boxBoolean(false);
        }
        Boolean boolBoxBoolean = Boxing.boxBoolean(DeviceUtilsKt.sendCommand$default(newBleAlertSkillImpl.baseDevice, new NLPCommand(new AlertContent(1, 2, CollectionsKt__CollectionsKt.arrayListOf(reminder.getToken()), newBleAlertSkillImpl.voiceConfig.getVersion() < 3 ? new AlertContent.NormalParameter(reminder.getLabel(), reminder.getLabel(), newBleAlertSkillImpl.a(jLongValue) / ((long) 1000), 0L, iK) : new AlertContent.NormalV3Parameter(reminder.getLabel(), reminder.getLabel(), newBleAlertSkillImpl.a(jLongValue) / ((long) 1000), 0L, iK, true))), null, 2, null));
        HMLog.info("speech", new i(boolBoxBoolean.booleanValue(), reminder));
        return boolBoxBoolean;
    }

    public static /* synthetic */ Object q(NewBleAlertSkillImpl newBleAlertSkillImpl, Timer timer, Continuation continuation) {
        TimerParam timerTime = AlertUtilKt.parseTimerTime(timer.getScheduledTime());
        int hour = timerTime.getHour();
        int minute = timerTime.getMinute();
        int second = timerTime.getSecond();
        HMLog.info("speech", new k(timer, hour, minute, second));
        Boolean boolBoxBoolean = Boxing.boxBoolean(DeviceUtilsKt.sendCommand$default(newBleAlertSkillImpl.baseDevice, new NLPCommand(new AlertContent(1, 3, CollectionsKt__CollectionsKt.arrayListOf(timer.getToken()), new AlertContent.TimerParameter(hour, minute, second))), null, 2, null));
        HMLog.info("speech", new l(boolBoxBoolean.booleanValue(), timer));
        return boolBoxBoolean;
    }

    @Override // com.huami.ai.skill.AlertSkill
    @Nullable
    public Object closeAlarm(@Nullable List<String> list, @NotNull Continuation<? super Boolean> continuation) {
        return b(this, list, continuation);
    }

    @Override // com.huami.ai.skill.AlertSkill
    @Nullable
    public Object closeReminder(@Nullable String str, @NotNull Continuation<? super Boolean> continuation) {
        return c(this, str, continuation);
    }

    @Override // com.huami.ai.skill.AlertSkill
    @Nullable
    public Object closeTimer(@NotNull Continuation<? super Boolean> continuation) {
        return d(this, continuation);
    }

    @Override // com.huami.ai.skill.AlertSkill
    @Nullable
    public Object deleteAlarm(@Nullable List<String> list, @NotNull Continuation<? super Boolean> continuation) {
        return e(this, list, continuation);
    }

    @Override // com.huami.ai.skill.AlertSkill
    @Nullable
    public Object deleteReminder(@Nullable List<String> list, @NotNull Continuation<? super Boolean> continuation) {
        return f(this, list, continuation);
    }

    @Override // com.huami.ai.skill.AlertSkill
    @Nullable
    public Object deleteTimer(@Nullable List<String> list, @NotNull Continuation<? super Boolean> continuation) {
        return g(this, list, continuation);
    }

    @Override // com.huami.ai.skill.AlertSkill
    @Nullable
    public Object openAlarm(@NotNull Continuation<? super Boolean> continuation) {
        return h(this, continuation);
    }

    @Override // com.huami.ai.skill.AlertSkill
    @Nullable
    public Object openReminder(@NotNull Continuation<? super Boolean> continuation) {
        return i(this, continuation);
    }

    @Override // com.huami.ai.skill.AlertSkill
    @Nullable
    public Object openTimer(@NotNull Continuation<? super Boolean> continuation) {
        return j(this, continuation);
    }

    @Override // com.huami.ai.skill.AlertSkill
    @Nullable
    public Object queryAlarm(@NotNull Continuation<? super Boolean> continuation) {
        return l(this, continuation);
    }

    @Override // com.huami.ai.skill.AlertSkill
    @Nullable
    public Object queryReminder(@NotNull Continuation<? super Boolean> continuation) {
        return m(this, continuation);
    }

    @Override // com.huami.ai.skill.AlertSkill
    @Nullable
    public Object queryTimer(@NotNull Continuation<? super Boolean> continuation) {
        return n(this, continuation);
    }

    @Override // com.huami.ai.skill.AlertSkill
    @Nullable
    public Object setAlarm(@NotNull Alarm alarm, @NotNull Continuation<? super Boolean> continuation) {
        return o(this, alarm, continuation);
    }

    @Override // com.huami.ai.skill.AlertSkill
    @Nullable
    public Object setReminder(@NotNull Reminder reminder, @NotNull Continuation<? super Boolean> continuation) {
        return p(this, reminder, continuation);
    }

    @Override // com.huami.ai.skill.AlertSkill
    @Nullable
    public Object setTimer(@NotNull Timer timer, @NotNull Continuation<? super Boolean> continuation) {
        return q(this, timer, continuation);
    }
}
