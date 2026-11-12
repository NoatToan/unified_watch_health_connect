package com.xiaomi.hm.health.ui.smartplay.alarm;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.ui.smartplay.alarm.AlarmAdapter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003DEFB\u0007¢\u0006\u0004\bB\u0010CJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0014\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR*\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010$R<\u0010-\u001a\u001c\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R6\u00105\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010=\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010A\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u001f\u001a\u0004\b?\u0010!\"\u0004\b@\u0010#¨\u0006G"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "", "position", "", "isChecked", "", "c", "alarmId", "b", "", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmItem;", "mAlarmClocks", "setAlarmClocks", "getAlarmClocks", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "holder", "onBindViewHolder", "getItemCount", "getItemViewType", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApiLazy", "value", "Z", "isEdit", "()Z", "setEdit", "(Z)V", "Ljava/util/List;", "Lkotlin/Function3;", "Lcom/xiaomi/hm/health/databases/model/Alarm;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function3;", "getOnCheckListener", "()Lkotlin/jvm/functions/Function3;", "setOnCheckListener", "(Lkotlin/jvm/functions/Function3;)V", "onCheckListener", "Lkotlin/Function2;", "e", "Lkotlin/jvm/functions/Function2;", "getOnDeleteListener", "()Lkotlin/jvm/functions/Function2;", "setOnDeleteListener", "(Lkotlin/jvm/functions/Function2;)V", "onDeleteListener", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/OnRecyclerItemClickedListener;", "f", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/OnRecyclerItemClickedListener;", "getMListener", "()Lcom/xiaomi/hm/health/ui/smartplay/alarm/OnRecyclerItemClickedListener;", "setMListener", "(Lcom/xiaomi/hm/health/ui/smartplay/alarm/OnRecyclerItemClickedListener;)V", "mListener", "g", "getSupportCalendar", "setSupportCalendar", "supportCalendar", "<init>", "()V", "Companion", "TitleHolder", "ViewHolder", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AlarmAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements KoinComponentAdapter {

    @NotNull
    private static final String h = "AlarmAdapter";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApiLazy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isEdit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<AlarmItem> mAlarmClocks;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function3<? super Alarm, ? super Integer, ? super Boolean, Unit> onCheckListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Function2<? super Alarm, ? super Integer, Unit> onDeleteListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private OnRecyclerItemClickedListener mListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean supportCalendar;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmAdapter$TitleHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "title", "", "bind", "Lcom/huami/widget/typeface/TypefaceTextView;", "a", "Lcom/huami/widget/typeface/TypefaceTextView;", "getTitleView", "()Lcom/huami/widget/typeface/TypefaceTextView;", "titleView", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class TitleHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final TypefaceTextView titleView;

        public TitleHolder(@NotNull View view) {
            super(view);
            this.titleView = (TypefaceTextView) view.findViewById(R.id.tv_title);
        }

        public final void bind(@Nullable String title) {
            if (title == null) {
                return;
            }
            this.titleView.setText(title);
        }

        @NotNull
        public final TypefaceTextView getTitleView() {
            return this.titleView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0001\u0012\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b0\u00101J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017J\u0018\u0010\u0013\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\tR\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001e\u001a\u00020\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010!\u001a\u00020\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0019\u0010$\u001a\u00020\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0019\u0010,\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnTouchListener;", "Lcom/xiaomi/hm/health/databases/model/Alarm;", "alarm", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", z.j, "", "state", "h", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", "event", "onTouch", "", "position", "bind", "isEdit", "playAnim", "a", "Landroid/view/View;", "mItemView", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getAlarmTime", "()Landroid/widget/TextView;", "alarmTime", "c", "getAlarmAmPm", "alarmAmPm", GoogleApiAvailabilityLight.a, "getAlarmRepeat", "alarmRepeat", "Landroidx/appcompat/widget/SwitchCompat;", "e", "Landroidx/appcompat/widget/SwitchCompat;", "alarmSwitch", "f", "getIconLayout", "()Landroid/view/View;", "iconLayout", "g", "Z", "isPressed", "<init>", "(Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmAdapter;Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class ViewHolder extends RecyclerView.ViewHolder implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final View mItemView;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView alarmTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final TextView alarmAmPm;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final TextView alarmRepeat;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final SwitchCompat alarmSwitch;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private final View iconLayout;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private boolean isPressed;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ AlarmAdapter a;
            public final /* synthetic */ Alarm b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AlarmAdapter alarmAdapter, Alarm alarm) {
                super(0);
                this.a = alarmAdapter;
                this.b = alarm;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "bind alarm : " + this.a.a().getGson().toJson(this.b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i, boolean z) {
                super(0);
                this.a = i;
                this.b = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "setOnCheckedChangeListener position: " + this.a + " switch : " + this.b;
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
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "ACTION_DOWN";
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
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "ACTION_UP or ACTION_CANCEL";
            }
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public ViewHolder(View view) {
            super(view);
            this.mItemView = view;
            this.alarmTime = (TextView) this.itemView.findViewById(R.id.miband_alarm_time_text);
            this.alarmAmPm = (TextView) this.itemView.findViewById(R.id.miband_alarm_ampm_text);
            this.alarmRepeat = (TextView) this.itemView.findViewById(R.id.miband_alarm_repeat);
            SwitchCompat switchCompat = (SwitchCompat) this.itemView.findViewById(R.id.miband_alarm_switch);
            this.alarmSwitch = switchCompat;
            this.iconLayout = this.itemView.findViewById(R.id.delete_layout);
            switchCompat.setOnTouchListener(this);
            AlarmAdapter.this.a().setViewTouchDelegate(switchCompat, 50, 50, 50, 50);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(AlarmAdapter alarmAdapter, Alarm alarm, View view) {
            OnRecyclerItemClickedListener mListener = alarmAdapter.getMListener();
            if (mListener == null) {
                return;
            }
            mListener.onClick(alarm.getIndex().intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(AlarmAdapter alarmAdapter, int i, CompoundButton compoundButton, boolean z) {
            HMLog.debug(AlarmAdapter.h, new b(i, z));
            if (compoundButton.isPressed()) {
                alarmAdapter.c(i, z);
            }
            if (z) {
                Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_SWITCH).setValue("On"));
            } else {
                Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_SWITCH).setValue("Off"));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(AlarmAdapter alarmAdapter, Alarm alarm, View view) {
            alarmAdapter.b(alarm.getIndex().intValue());
        }

        private final void h(boolean state) {
            if (state) {
                this.isPressed = true;
            } else {
                this.mItemView.postDelayed(new Runnable() { // from class: sa
                    @Override // java.lang.Runnable
                    public final void run() {
                        AlarmAdapter.ViewHolder.i(this.a);
                    }
                }, 20L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(ViewHolder viewHolder) {
            viewHolder.isPressed = false;
        }

        private final void j(Alarm alarm, Context context) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(alarm.getCalendar().longValue());
            Date date = new Date(alarm.getCalendar().longValue());
            if (DateFormat.is24HourFormat(context)) {
                this.alarmAmPm.setVisibility(8);
                this.alarmTime.setText(TimeUtils.formatDate(context.getResources().getString(R.string.time_HHmm_pattern), calendar.getTime()));
            } else {
                this.alarmAmPm.setVisibility(0);
                this.alarmAmPm.setText(TimeUtils.getPrefix_zh(this.itemView.getContext(), date));
                this.alarmTime.setText(TimeUtils.formatDate12Hour(context, date));
            }
        }

        public final void bind(@Nullable final Alarm alarm, final int position) {
            if (alarm == null) {
                return;
            }
            View view = this.mItemView;
            final AlarmAdapter alarmAdapter = AlarmAdapter.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: pa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AlarmAdapter.ViewHolder.e(alarmAdapter, alarm, view2);
                }
            });
            this.alarmRepeat.setText(AlarmRepeatChooser.INSTANCE.getWeekString(this.itemView.getContext(), alarm, AlarmAdapter.this.getSupportCalendar()));
            HMLog.debug(AlarmAdapter.h, new a(AlarmAdapter.this, alarm));
            this.alarmSwitch.setChecked(alarm.getEnabled().booleanValue());
            SwitchCompat switchCompat = this.alarmSwitch;
            final AlarmAdapter alarmAdapter2 = AlarmAdapter.this;
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ra
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    AlarmAdapter.ViewHolder.f(alarmAdapter2, position, compoundButton, z);
                }
            });
            View view2 = this.iconLayout;
            final AlarmAdapter alarmAdapter3 = AlarmAdapter.this;
            view2.setOnClickListener(new View.OnClickListener() { // from class: qa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    AlarmAdapter.ViewHolder.g(alarmAdapter3, alarm, view3);
                }
            });
            j(alarm, this.itemView.getContext());
        }

        @NotNull
        public final TextView getAlarmAmPm() {
            return this.alarmAmPm;
        }

        @NotNull
        public final TextView getAlarmRepeat() {
            return this.alarmRepeat;
        }

        @NotNull
        public final TextView getAlarmTime() {
            return this.alarmTime;
        }

        @NotNull
        public final View getIconLayout() {
            return this.iconLayout;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(@NotNull View v, @NotNull MotionEvent event) {
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0) {
                h(true);
                HMLog.debug(AlarmAdapter.h, c.a);
            } else if (actionMasked == 1 || actionMasked == 3) {
                h(false);
                HMLog.debug(AlarmAdapter.h, d.a);
            }
            return false;
        }

        public final void playAnim(boolean isEdit) {
            if (isEdit) {
                this.alarmSwitch.setVisibility(8);
                AlarmAdapter.this.a().removeViewTouchDelegate(this.alarmSwitch);
                float scaleY = this.alarmSwitch.getScaleY();
                float scaleX = this.alarmSwitch.getScaleX();
                float alpha = this.alarmSwitch.getAlpha();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.alarmSwitch, "scaleY", scaleY, 0.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.alarmSwitch, "scaleX", scaleX, 0.0f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.alarmSwitch, "alpha", alpha, 0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                long j = 250;
                animatorSet.setDuration(j);
                animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
                animatorSet.start();
                this.iconLayout.setVisibility(0);
                float scaleY2 = this.iconLayout.getScaleY();
                float scaleX2 = this.iconLayout.getScaleX();
                float alpha2 = this.iconLayout.getAlpha();
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.iconLayout, "scaleY", scaleY2, 1.0f);
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.iconLayout, "scaleX", scaleX2, 1.0f);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.iconLayout, "alpha", alpha2, 1.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setDuration(j);
                animatorSet2.play(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
                animatorSet2.start();
                return;
            }
            AlarmAdapter alarmAdapter = AlarmAdapter.this;
            this.alarmSwitch.setVisibility(0);
            alarmAdapter.a().setViewTouchDelegate(this.alarmSwitch, 50, 50, 50, 50);
            float scaleY3 = this.alarmSwitch.getScaleY();
            float scaleX3 = this.alarmSwitch.getScaleX();
            float alpha3 = this.alarmSwitch.getAlpha();
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.alarmSwitch, "scaleY", scaleY3, 1.0f);
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.alarmSwitch, "scaleX", scaleX3, 1.0f);
            ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.alarmSwitch, "alpha", alpha3, 1.0f);
            AnimatorSet animatorSet3 = new AnimatorSet();
            long j2 = 250;
            animatorSet3.setDuration(j2);
            animatorSet3.play(objectAnimatorOfFloat7).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat9);
            animatorSet3.start();
            getIconLayout().setVisibility(8);
            float scaleY4 = getIconLayout().getScaleY();
            float scaleX4 = getIconLayout().getScaleX();
            float alpha4 = getIconLayout().getAlpha();
            ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(getIconLayout(), "scaleY", scaleY4, 0.0f);
            ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(getIconLayout(), "scaleX", scaleX4, 0.0f);
            ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(getIconLayout(), "alpha", alpha4, 0.0f);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.setDuration(j2);
            animatorSet4.play(objectAnimatorOfFloat10).with(objectAnimatorOfFloat11).with(objectAnimatorOfFloat12);
            animatorSet4.start();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "handleDeleteAction ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Alarm a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Alarm alarm) {
            super(0);
            this.a = alarm;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "alarm index: " + this.a.getIndex();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "isChecked : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Alarm a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Alarm alarm) {
            super(0);
            this.a = alarm;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "switch alarm : " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlarmAdapter() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApiLazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.ui.smartplay.alarm.AlarmAdapter$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
        this.mAlarmClocks = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceUtilsApi a() {
        return (DeviceUtilsApi) this.deviceUtilsApiLazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int alarmId) {
        HMLog.debug(h, a.a);
        Alarm alarmCopyAlarm = AlarmClockManager.getInstance().copyAlarm(AlarmClockManager.getInstance().getAlarmByIndex(alarmId));
        Boolean bool = Boolean.FALSE;
        alarmCopyAlarm.setVisible(bool);
        alarmCopyAlarm.setEnabled(bool);
        alarmCopyAlarm.setIsSmart(bool);
        Function2<? super Alarm, ? super Integer, Unit> function2 = this.onDeleteListener;
        if (function2 == null) {
            return;
        }
        function2.invoke(alarmCopyAlarm, Integer.valueOf(alarmId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int position, boolean isChecked) {
        Alarm alarm = this.mAlarmClocks.get(position).alarm;
        HMLog.debug(h, new b(alarm));
        HMLog.debug(h, new c(isChecked));
        alarm.setEnabled(Boolean.valueOf(isChecked));
        AlarmClockManager.getInstance().setAlarm4Once(alarm);
        HMLog.info(h, new d(alarm));
        Function3<? super Alarm, ? super Integer, ? super Boolean, Unit> function3 = this.onCheckListener;
        if (function3 == null) {
            return;
        }
        function3.invoke(alarm, Integer.valueOf(position), Boolean.valueOf(isChecked));
    }

    @NotNull
    public final List<AlarmItem> getAlarmClocks() {
        return this.mAlarmClocks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.mAlarmClocks.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.mAlarmClocks.get(position).type;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Nullable
    public final OnRecyclerItemClickedListener getMListener() {
        return this.mListener;
    }

    @Nullable
    public final Function3<Alarm, Integer, Boolean, Unit> getOnCheckListener() {
        return this.onCheckListener;
    }

    @Nullable
    public final Function2<Alarm, Integer, Unit> getOnDeleteListener() {
        return this.onDeleteListener;
    }

    public final boolean getSupportCalendar() {
        return this.supportCalendar;
    }

    /* JADX INFO: renamed from: isEdit, reason: from getter */
    public final boolean getIsEdit() {
        return this.isEdit;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolder) {
            ViewHolder viewHolder = (ViewHolder) holder;
            viewHolder.bind(this.mAlarmClocks.get(position).alarm, position);
            viewHolder.playAnim(this.isEdit);
        } else if (holder instanceof TitleHolder) {
            ((TitleHolder) holder).bind(this.mAlarmClocks.get(position).title);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        return viewType == 1 ? new ViewHolder(layoutInflaterFrom.inflate(R.layout.item_miband_alarm_list_new, parent, false)) : new TitleHolder(layoutInflaterFrom.inflate(R.layout.item_alarm_title, parent, false));
    }

    public final void setAlarmClocks(@NotNull List<AlarmItem> mAlarmClocks) {
        this.mAlarmClocks.clear();
        this.mAlarmClocks.addAll(mAlarmClocks);
    }

    public final void setEdit(boolean z) {
        this.isEdit = z;
        notifyDataSetChanged();
    }

    public final void setMListener(@Nullable OnRecyclerItemClickedListener onRecyclerItemClickedListener) {
        this.mListener = onRecyclerItemClickedListener;
    }

    public final void setOnCheckListener(@Nullable Function3<? super Alarm, ? super Integer, ? super Boolean, Unit> function3) {
        this.onCheckListener = function3;
    }

    public final void setOnDeleteListener(@Nullable Function2<? super Alarm, ? super Integer, Unit> function2) {
        this.onDeleteListener = function2;
    }

    public final void setSupportCalendar(boolean z) {
        this.supportCalendar = z;
    }
}
