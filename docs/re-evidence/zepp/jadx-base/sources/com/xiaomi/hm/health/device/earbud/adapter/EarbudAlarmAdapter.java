package com.xiaomi.hm.health.device.earbud.adapter;

import android.text.format.DateFormat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import java.util.Calendar;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\n\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/adapter/EarbudAlarmAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/xiaomi/hm/health/databases/model/Alarm;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "helper", "item", "", "convert", "", "value", "a", "Z", "getMShowDelete", "()Z", "setMShowDelete", "(Z)V", "mShowDelete", "Lcom/xiaomi/hm/health/device/alarm/AlarmClockManager;", "b", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/alarm/AlarmClockManager;", "mAlarmClockManager", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudAlarmAdapter extends BaseQuickAdapter<Alarm, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean mShowDelete;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAlarmClockManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/alarm/AlarmClockManager;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AlarmClockManager> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AlarmClockManager invoke() {
            return AlarmClockManager.getInstance();
        }
    }

    public EarbudAlarmAdapter() {
        super(R.layout.item_earbud_alarm, null);
        this.mAlarmClockManager = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private final AlarmClockManager a() {
        return (AlarmClockManager) this.mAlarmClockManager.getValue();
    }

    public final boolean getMShowDelete() {
        return this.mShowDelete;
    }

    public final void setMShowDelete(boolean z) {
        this.mShowDelete = z;
        notifyDataSetChanged();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull Alarm item) {
        int i = R.id.alarm_delete;
        helper.setGone(i, this.mShowDelete);
        helper.setText(R.id.alarm_repeat, a().getWeekString(item));
        helper.setText(R.id.alarm_status, a().getEarbudStatusTipStr(item));
        int i2 = R.id.alarm_switch;
        helper.setChecked(i2, item.getEnabled().booleanValue());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(item.getCalendar().longValue());
        Date date = new Date(item.getCalendar().longValue());
        if (DateFormat.is24HourFormat(this.mContext)) {
            helper.setGone(R.id.alarm_ampm_text, false);
            helper.setText(R.id.alarm_time_text, TimeUtils.formatDate(this.mContext.getString(R.string.time_HHmm_pattern), calendar.getTime()));
        } else {
            int i3 = R.id.alarm_ampm_text;
            helper.setGone(i3, true);
            helper.setText(R.id.alarm_time_text, TimeUtils.formatDate12Hour(this.mContext, date));
            helper.setText(i3, TimeUtils.getPrefix_zh(DeviceXFunctionsKt.getContext(), date));
        }
        helper.addOnClickListener(i);
        helper.addOnClickListener(i2);
        helper.setGone(R.id.end_line, helper.getAdapterPosition() == this.mData.size() - 1);
    }
}
