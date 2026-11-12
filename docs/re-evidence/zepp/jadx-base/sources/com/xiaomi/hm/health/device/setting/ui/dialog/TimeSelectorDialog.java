package com.xiaomi.hm.health.device.setting.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.alipay.sdk.m.x.d;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.huami.widget.wheelview.event.Event12HourUpdate;
import com.huami.widget.wheelview.event.EventAmPmUpdate;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.device.setting.ui.dialog.TimeSelectorDialog;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 Q2\u00020\u0001:\u0002QRB\u0007¢\u0006\u0004\bO\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\b\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u001c\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\u0016\u0010!\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"J\u000e\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u000e\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(J\u0016\u0010.\u001a\u00020,2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,J\u0016\u00100\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\u0006\u0010/\u001a\u00020,R\u001e\u00104\u001a\n 1*\u0004\u0018\u00010\"0\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020\u00078\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00109R$\u0010A\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00106R\u0016\u0010 \u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00106R\u0016\u0010G\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010FR$\u0010N\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00103¨\u0006S"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/dialog/TimeSelectorDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "", "initEvents", "g", hl.k, "h", "", "c", "()Ljava/lang/Integer;", GoogleApiAvailabilityLight.a, "getMinute", "getHour", "hour", "i", "amPm", z.j, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "onStart", "onResume", "onDestroyView", "minutes", "setInitialTime", "", "title", d.o, "Lcom/huami/widget/wheelview/event/Event12HourUpdate;", "event12HourUpdate", "onEvent", "Lcom/huami/widget/wheelview/event/EventAmPmUpdate;", "eventAmPmUpdate", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", Constant.PAI_KEY_DAILY_PAI, "dp2px", "px", "px2dp", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "b", LogUtil.I, "wheelItemHeight", "Lcom/huami/widget/wheelview/adapters/PickAdapter;", "Lcom/huami/widget/wheelview/adapters/PickAdapter;", "mHourAdapter", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnClickListener;", "getSureListener", "()Landroid/view/View$OnClickListener;", "setSureListener", "(Landroid/view/View$OnClickListener;)V", "sureListener", "e", "mHour", "f", "", "Z", "mIs24HourFormat", "Lcom/xiaomi/hm/health/device/setting/ui/dialog/TimeSelectorDialog$ITimeChooseListener;", "Lcom/xiaomi/hm/health/device/setting/ui/dialog/TimeSelectorDialog$ITimeChooseListener;", "getMListener", "()Lcom/xiaomi/hm/health/device/setting/ui/dialog/TimeSelectorDialog$ITimeChooseListener;", "setMListener", "(Lcom/xiaomi/hm/health/device/setting/ui/dialog/TimeSelectorDialog$ITimeChooseListener;)V", "mListener", "<init>", "()V", "Companion", "ITimeChooseListener", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TimeSelectorDialog extends BottomSheetDialogFragment {
    public static final int AM_INDEX = 0;
    public static final int PM_INDEX = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private PickAdapter mHourAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener sureListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean mIs24HourFormat;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private ITimeChooseListener mListener;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = TimeSelectorDialog.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int wheelItemHeight = 44;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mHour = -1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int minutes = -1;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private String title = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/dialog/TimeSelectorDialog$ITimeChooseListener;", "", "", "hour", "minutes", "", "onTimeChoose", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public interface ITimeChooseListener {
        void onTimeChoose(@Nullable Integer hour, @Nullable Integer minutes);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "updateHourByAmPm : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "cur hour =" + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "after hour =" + this.a.element;
        }
    }

    private final Integer c() {
        View view = getView();
        if ((view == null ? null : view.findViewById(R.id.wheelView_hour)) == null) {
            return null;
        }
        View view2 = getView();
        return Integer.valueOf(((WheelView) (view2 != null ? view2.findViewById(R.id.wheelView_hour) : null)).getCurrentItem());
    }

    private final Integer d() {
        View view = getView();
        if ((view == null ? null : view.findViewById(R.id.wheelView_minute)) == null) {
            return null;
        }
        View view2 = getView();
        return Integer.valueOf(((WheelView) (view2 != null ? view2.findViewById(R.id.wheelView_minute) : null)).getCurrentItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(TimeSelectorDialog timeSelectorDialog, View view) {
        View.OnClickListener sureListener = timeSelectorDialog.getSureListener();
        if (sureListener != null) {
            sureListener.onClick(view);
        }
        timeSelectorDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(TimeSelectorDialog timeSelectorDialog, View view) {
        timeSelectorDialog.dismiss();
    }

    private final void g() {
        Display defaultDisplay = requireActivity().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        float f = 2;
        float fPx2dp = this.mIs24HourFormat ? 120.0f : px2dp(requireContext(), (((point.x - (dp2px(requireContext(), 15.0f) * f)) - (dp2px(requireContext(), 20.0f) * f)) - (dp2px(requireContext(), 8.0f) * f)) / 3);
        Context context = getContext();
        View view = getView();
        WheelView wheelView = (WheelView) (view == null ? null : view.findViewById(R.id.wheelView_am_pm));
        Context contextRequireContext = requireContext();
        int i = R.color.p4;
        int color = ContextCompat.getColor(contextRequireContext, i);
        Context contextRequireContext2 = requireContext();
        int i2 = R.color.s4;
        PickAdapter pickAdapter = new PickAdapter(context, 0, 1, wheelView, color, ContextCompat.getColor(contextRequireContext2, i2), ContextCompat.getColor(requireContext(), i2), false, this.wheelItemHeight, 20, 16, 15, 1);
        pickAdapter.setUIStyle("normal");
        pickAdapter.setMode(17);
        View view2 = getView();
        WheelView visibleItems = ((WheelView) (view2 == null ? null : view2.findViewById(R.id.wheelView_am_pm))).setSelectBgLineWidth(fPx2dp).setSelectBgHeight(44.0f).setVisibleItems(2);
        WheelView.Style style = WheelView.Style.LINE;
        visibleItems.setStyle(style).setCenterStyle("", 0.0f).setViewAdapter(pickAdapter);
        Context context2 = getContext();
        View view3 = getView();
        this.mHourAdapter = new PickAdapter(context2, 0, 23, (WheelView) (view3 == null ? null : view3.findViewById(R.id.wheelView_hour)), ContextCompat.getColor(requireContext(), i), ContextCompat.getColor(requireContext(), i2), ContextCompat.getColor(requireContext(), i2), true, this.wheelItemHeight, 20, 19, 15, 1);
        View view4 = getView();
        ((WheelView) (view4 == null ? null : view4.findViewById(R.id.wheelView_hour))).setSelectBgLineWidth(fPx2dp).setmUnitCenterXoffset(28.5f).setSelectBgHeight(44.0f).setStyle(style).setVisibleItems(5).setCenterDrawable(R.drawable.wheel_custom_val_white_1).setCenterStyle("", R.color.s3, 12, 0.0f, 0.0f).setViewAdapter(this.mHourAdapter);
        View view5 = getView();
        ((WheelView) (view5 == null ? null : view5.findViewById(R.id.wheelView_hour))).addScrollingListener(new OnWheelScrollListener() { // from class: com.xiaomi.hm.health.device.setting.ui.dialog.TimeSelectorDialog$initPickers$1
            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingFinished(@NotNull WheelView wheel) {
                this.a.h();
            }

            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingStarted(@NotNull WheelView wheel) {
            }
        });
        View view6 = getView();
        WheelView centerStyle = ((WheelView) (view6 == null ? null : view6.findViewById(R.id.wheelView_minute))).setSelectBgLineWidth(fPx2dp).setmUnitCenterXoffset(28.5f).setSelectBgHeight(44.0f).setStyle(style).setVisibleItems(5).setCenterStyle("", R.color.cl_a09e9e, 12, 0.0f, 0.0f);
        Context context3 = getContext();
        View view7 = getView();
        centerStyle.setViewAdapter(new PickAdapter(context3, 0, 59, (WheelView) (view7 == null ? null : view7.findViewById(R.id.wheelView_minute)), ContextCompat.getColor(requireContext(), i), ContextCompat.getColor(requireContext(), i2), ContextCompat.getColor(requireContext(), i2), true, this.wheelItemHeight, 20, 19, 15, 1));
        View view8 = getView();
        ((WheelView) (view8 != null ? view8.findViewById(R.id.wheelView_minute) : null)).addScrollingListener(new OnWheelScrollListener() { // from class: com.xiaomi.hm.health.device.setting.ui.dialog.TimeSelectorDialog$initPickers$2
            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingFinished(@NotNull WheelView wheel) {
                this.a.h();
            }

            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingStarted(@NotNull WheelView wheel) {
            }
        });
    }

    private final int getHour() {
        int i = this.mHour;
        return i == -1 ? Calendar.getInstance().get(11) : i;
    }

    private final int getMinute() {
        int i = this.minutes;
        return i == -1 ? Calendar.getInstance().get(12) : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        ITimeChooseListener iTimeChooseListener = this.mListener;
        if (iTimeChooseListener == null) {
            return;
        }
        iTimeChooseListener.onTimeChoose(c(), d());
    }

    private final void i(int hour) {
        HMLog.i(this.TAG, "updateAmPmByHour hour=" + hour, new Object[0]);
        if (this.mIs24HourFormat) {
            return;
        }
        View view = getView();
        ((WheelView) (view == null ? null : view.findViewById(R.id.wheelView_am_pm))).setCurrentItem(hour >= 12 ? 1 : 0);
    }

    private final void initEvents() {
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.btn_yes))).setOnClickListener(new View.OnClickListener() { // from class: to7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TimeSelectorDialog.e(this.a, view2);
            }
        });
        View view2 = getView();
        ((TextView) (view2 != null ? view2.findViewById(R.id.btn_cancel) : null)).setOnClickListener(new View.OnClickListener() { // from class: uo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                TimeSelectorDialog.f(this.a, view3);
            }
        });
    }

    private final void j(int amPm) {
        HMLog.debug(this.TAG, new a(amPm));
        if (this.mIs24HourFormat) {
            return;
        }
        Ref.IntRef intRef = new Ref.IntRef();
        View view = getView();
        intRef.element = ((WheelView) (view == null ? null : view.findViewById(R.id.wheelView_hour))).getCurrentItem();
        HMLog.debug(this.TAG, new b(intRef));
        if (amPm == 0) {
            int i = intRef.element;
            if (i >= 12) {
                intRef.element = i - 12;
            }
        } else {
            int i2 = intRef.element;
            if (i2 < 12) {
                intRef.element = i2 + 12;
            }
        }
        HMLog.debug(this.TAG, new c(intRef));
        View view2 = getView();
        ((WheelView) (view2 != null ? view2.findViewById(R.id.wheelView_hour) : null)).setCurrentItemLooped(intRef.element);
    }

    private final void k() {
        if (this.mIs24HourFormat) {
            View view = getView();
            ((Space) (view == null ? null : view.findViewById(R.id.space1))).setVisibility(0);
            View view2 = getView();
            ((Space) (view2 == null ? null : view2.findViewById(R.id.space2))).setVisibility(0);
            View view3 = getView();
            ((Space) (view3 == null ? null : view3.findViewById(R.id.space3))).setVisibility(0);
            View view4 = getView();
            ((WheelView) (view4 == null ? null : view4.findViewById(R.id.wheelView_am_pm))).setVisibility(8);
            View view5 = getView();
            ((WheelView) (view5 == null ? null : view5.findViewById(R.id.wheelView_hour))).setCurrentItem(getHour());
            this.mHourAdapter.setMode(9);
        } else {
            View view6 = getView();
            ((Space) (view6 == null ? null : view6.findViewById(R.id.space1))).setVisibility(8);
            View view7 = getView();
            ((Space) (view7 == null ? null : view7.findViewById(R.id.space2))).setVisibility(8);
            View view8 = getView();
            ((Space) (view8 == null ? null : view8.findViewById(R.id.space3))).setVisibility(8);
            View view9 = getView();
            ((WheelView) (view9 == null ? null : view9.findViewById(R.id.wheelView_am_pm))).setVisibility(0);
            this.mHourAdapter.setMode(16);
            int hour = getHour();
            if (hour >= 12) {
                View view10 = getView();
                ((WheelView) (view10 == null ? null : view10.findViewById(R.id.wheelView_am_pm))).setCurrentItem(1);
                View view11 = getView();
                ((WheelView) (view11 == null ? null : view11.findViewById(R.id.wheelView_hour))).setCurrentItem(hour - 12);
            } else {
                View view12 = getView();
                ((WheelView) (view12 == null ? null : view12.findViewById(R.id.wheelView_am_pm))).setCurrentItem(0);
                View view13 = getView();
                ((WheelView) (view13 == null ? null : view13.findViewById(R.id.wheelView_hour))).setCurrentItem(hour);
            }
        }
        View view14 = getView();
        ((WheelView) (view14 != null ? view14.findViewById(R.id.wheelView_minute) : null)).setCurrentItem(getMinute());
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final float dp2px(@NotNull Context context, float dp) {
        return TypedValue.applyDimension(1, dp, context.getResources().getDisplayMetrics());
    }

    @Nullable
    public final ITimeChooseListener getMListener() {
        return this.mListener;
    }

    @Nullable
    public final View.OnClickListener getSureListener() {
        return this.sureListener;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        g();
        k();
        initEvents();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R.style.CustomBottomSheetDialogTheme);
        this.mIs24HourFormat = DateFormat.is24HourFormat(getContext());
        EventBus.getDefault().register(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.time_selector_wheel_view, container, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        EventBus.getDefault().unregister(this);
    }

    public final void onEvent(@NotNull Event12HourUpdate event12HourUpdate) {
        Log.i(this.TAG, "----event12HourUpdate----" + event12HourUpdate.getHour());
        i(event12HourUpdate.getHour());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.time_selector_title))).setText(this.title);
        k();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        WindowManager.LayoutParams attributes = (dialog == null || (window = dialog.getWindow()) == null) ? null : window.getAttributes();
        if (attributes != null) {
            attributes.width = -1;
        }
        if (attributes != null) {
            attributes.height = -1;
        }
        Dialog dialog2 = getDialog();
        Window window3 = dialog2 != null ? dialog2.getWindow() : null;
        if (window3 != null) {
            window3.setAttributes(attributes);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window2 = dialog3.getWindow()) == null) {
            return;
        }
        window2.setSoftInputMode(2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public final int px2dp(@NotNull Context context, float px) {
        return (int) ((px / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void setInitialTime(int hour, int minutes) {
        this.mHour = hour;
        this.minutes = minutes;
    }

    public final void setMListener(@Nullable ITimeChooseListener iTimeChooseListener) {
        this.mListener = iTimeChooseListener;
    }

    public final void setSureListener(@Nullable View.OnClickListener onClickListener) {
        this.sureListener = onClickListener;
    }

    public final void setTitle(@NotNull String title) {
        this.title = title;
    }

    public final void onEvent(@NotNull EventAmPmUpdate eventAmPmUpdate) {
        Log.i(this.TAG, "----eventAmPmUpdate----" + eventAmPmUpdate.getAmPm());
        j(eventAmPmUpdate.getAmPm());
    }
}
