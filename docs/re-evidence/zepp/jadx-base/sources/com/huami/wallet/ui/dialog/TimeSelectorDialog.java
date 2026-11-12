package com.huami.wallet.ui.dialog;

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
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.dialog.TimeSelectorDialog;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.huami.widget.wheelview.event.Event12HourUpdate;
import com.huami.widget.wheelview.event.EventAmPmUpdate;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 Q2\u00020\u0001:\u0002QRB\u0007¢\u0006\u0004\bO\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\b\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\u0012\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010!\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\"\u001a\u00020\u0002H\u0016J\b\u0010#\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020\u0002H\u0016J\u0016\u0010&\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007J\u000e\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-R\u0016\u00101\u001a\u00020'8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u00078\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00106RX\u0010A\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\u0002\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00103R\u0016\u0010%\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00103R\u0016\u0010G\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010FR$\u0010N\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00100¨\u0006S"}, d2 = {"Lcom/huami/wallet/ui/dialog/TimeSelectorDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "", "initEvents", "g", hl.k, "h", "", "c", "()Ljava/lang/Integer;", GoogleApiAvailabilityLight.a, "getMinute", "getHour", "hour", "i", "amPm", z.j, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", Constant.PAI_KEY_DAILY_PAI, "dp2px", "px", "px2dp", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onActivityCreated", "onStart", "onResume", "onDestroyView", "minutes", "setInitialTime", "", "title", d.o, "Lcom/huami/widget/wheelview/event/Event12HourUpdate;", "event12HourUpdate", "onEvent", "Lcom/huami/widget/wheelview/event/EventAmPmUpdate;", "eventAmPmUpdate", "a", "Ljava/lang/String;", "TAG", "b", LogUtil.I, "wheelItemHeight", "Lcom/huami/widget/wheelview/adapters/PickAdapter;", "Lcom/huami/widget/wheelview/adapters/PickAdapter;", "mHourAdapter", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "minute", "Lkotlin/jvm/functions/Function2;", "getSureListener", "()Lkotlin/jvm/functions/Function2;", "setSureListener", "(Lkotlin/jvm/functions/Function2;)V", "sureListener", "e", "mHour", "f", "", "Z", "mIs24HourFormat", "Lcom/huami/wallet/ui/dialog/TimeSelectorDialog$ITimeChooseListener;", "Lcom/huami/wallet/ui/dialog/TimeSelectorDialog$ITimeChooseListener;", "getMListener", "()Lcom/huami/wallet/ui/dialog/TimeSelectorDialog$ITimeChooseListener;", "setMListener", "(Lcom/huami/wallet/ui/dialog/TimeSelectorDialog$ITimeChooseListener;)V", "mListener", "<init>", "()V", "Companion", "ITimeChooseListener", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class TimeSelectorDialog extends BottomSheetDialogFragment {
    public static final int AM_INDEX = 0;
    public static final int PM_INDEX = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private PickAdapter mHourAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function2<? super Integer, ? super Integer, Unit> sureListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean mIs24HourFormat;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private ITimeChooseListener mListener;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "TimeSelectorDialog";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int wheelItemHeight = 44;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mHour = -1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int minutes = -1;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private String title = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huami/wallet/ui/dialog/TimeSelectorDialog$ITimeChooseListener;", "", "", "hour", "minutes", "", "onTimeChoose", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public interface ITimeChooseListener {
        void onTimeChoose(@Nullable Integer hour, @Nullable Integer minutes);
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

    private final float dp2px(Context context, float dp) {
        return TypedValue.applyDimension(1, dp, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(TimeSelectorDialog timeSelectorDialog, View view) {
        Function2<Integer, Integer, Unit> sureListener = timeSelectorDialog.getSureListener();
        if (sureListener != null) {
            sureListener.invoke(timeSelectorDialog.c(), timeSelectorDialog.d());
        }
        timeSelectorDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(TimeSelectorDialog timeSelectorDialog, View view) {
        timeSelectorDialog.dismiss();
    }

    private final void g() {
        Display defaultDisplay = getActivity().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        float f = 2;
        float fPx2dp = this.mIs24HourFormat ? 120.0f : px2dp(getContext(), (((point.x - (dp2px(getContext(), 15.0f) * f)) - (dp2px(getContext(), 20.0f) * f)) - (dp2px(getContext(), 8.0f) * f)) / 3);
        Context context = getContext();
        View view = getView();
        WheelView wheelView = (WheelView) (view == null ? null : view.findViewById(R.id.wheelView_am_pm));
        Context context2 = getContext();
        int i = R.color.p4;
        int color = ContextCompat.getColor(context2, i);
        Context context3 = getContext();
        int i2 = R.color.s36;
        PickAdapter pickAdapter = new PickAdapter(context, 0, 1, wheelView, color, ContextCompat.getColor(context3, i2), ContextCompat.getColor(getContext(), i2), false, this.wheelItemHeight, 20, 16, 15, 1);
        pickAdapter.setUIStyle("normal");
        pickAdapter.setMode(17);
        View view2 = getView();
        WheelView visibleItems = ((WheelView) (view2 == null ? null : view2.findViewById(R.id.wheelView_am_pm))).setSelectBgLineWidth(fPx2dp).setSelectBgHeight(44.0f).setVisibleItems(2);
        WheelView.Style style = WheelView.Style.LINE;
        visibleItems.setStyle(style).setCenterStyle("", 0.0f).setViewAdapter(pickAdapter);
        Context context4 = getContext();
        View view3 = getView();
        this.mHourAdapter = new PickAdapter(context4, 0, 23, (WheelView) (view3 == null ? null : view3.findViewById(R.id.wheelView_hour)), ContextCompat.getColor(getContext(), i), ContextCompat.getColor(getContext(), i2), ContextCompat.getColor(getContext(), i2), true, this.wheelItemHeight, 20, 19, 15, 1);
        View view4 = getView();
        WheelView centerDrawable = ((WheelView) (view4 == null ? null : view4.findViewById(R.id.wheelView_hour))).setSelectBgLineWidth(fPx2dp).setmUnitCenterXoffset(28.5f).setSelectBgHeight(44.0f).setStyle(style).setVisibleItems(5).setCenterDrawable(R.drawable.wheel_custom_val_white_1);
        int i3 = R.color.s3;
        centerDrawable.setCenterStyle("", i3, 12, 0.0f, 0.0f).setViewAdapter(this.mHourAdapter);
        View view5 = getView();
        ((WheelView) (view5 == null ? null : view5.findViewById(R.id.wheelView_hour))).addScrollingListener(new OnWheelScrollListener() { // from class: com.huami.wallet.ui.dialog.TimeSelectorDialog$initPickers$1
            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingFinished(@NotNull WheelView wheel) {
                this.a.h();
            }

            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingStarted(@NotNull WheelView wheel) {
            }
        });
        View view6 = getView();
        WheelView centerStyle = ((WheelView) (view6 == null ? null : view6.findViewById(R.id.wheelView_minute))).setSelectBgLineWidth(fPx2dp).setmUnitCenterXoffset(28.5f).setSelectBgHeight(44.0f).setStyle(style).setVisibleItems(5).setCenterStyle("", i3, 12, 0.0f, 0.0f);
        Context context5 = getContext();
        View view7 = getView();
        centerStyle.setViewAdapter(new PickAdapter(context5, 0, 59, (WheelView) (view7 == null ? null : view7.findViewById(R.id.wheelView_minute)), ContextCompat.getColor(getContext(), i), ContextCompat.getColor(getContext(), i2), ContextCompat.getColor(getContext(), i2), true, this.wheelItemHeight, 20, 19, 15, 1));
        View view8 = getView();
        ((WheelView) (view8 != null ? view8.findViewById(R.id.wheelView_minute) : null)).addScrollingListener(new OnWheelScrollListener() { // from class: com.huami.wallet.ui.dialog.TimeSelectorDialog$initPickers$2
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
        HMLog.i(this.TAG, Intrinsics.stringPlus("updateAmPmByHour hour=", Integer.valueOf(hour)), new Object[0]);
        if (this.mIs24HourFormat) {
            return;
        }
        View view = getView();
        ((WheelView) (view == null ? null : view.findViewById(R.id.wheelView_am_pm))).setCurrentItem(hour >= 12 ? 1 : 0);
    }

    private final void initEvents() {
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.btn_yes))).setOnClickListener(new View.OnClickListener() { // from class: so7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TimeSelectorDialog.e(this.a, view2);
            }
        });
        View view2 = getView();
        ((TextView) (view2 != null ? view2.findViewById(R.id.btn_cancel) : null)).setOnClickListener(new View.OnClickListener() { // from class: ro7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                TimeSelectorDialog.f(this.a, view3);
            }
        });
    }

    private final void j(int amPm) {
        HMLog.d(this.TAG, Intrinsics.stringPlus("updateHourByAmPm : ", Integer.valueOf(amPm)), new Object[0]);
        if (this.mIs24HourFormat) {
            return;
        }
        View view = getView();
        int currentItem = ((WheelView) (view == null ? null : view.findViewById(R.id.wheelView_hour))).getCurrentItem();
        HMLog.d(this.TAG, Intrinsics.stringPlus("cur hour =", Integer.valueOf(currentItem)), new Object[0]);
        if (amPm == 0) {
            if (currentItem >= 12) {
                currentItem -= 12;
            }
        } else if (currentItem < 12) {
            currentItem += 12;
        }
        HMLog.d(this.TAG, Intrinsics.stringPlus("after hour =", Integer.valueOf(currentItem)), new Object[0]);
        View view2 = getView();
        ((WheelView) (view2 != null ? view2.findViewById(R.id.wheelView_hour) : null)).setCurrentItemLooped(currentItem);
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

    private final int px2dp(Context context, float px) {
        return (int) ((px / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final ITimeChooseListener getMListener() {
        return this.mListener;
    }

    @Nullable
    public final Function2<Integer, Integer, Unit> getSureListener() {
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
        return inflater.inflate(R.layout.wl_time_selector_wheel_view, container, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        EventBus.getDefault().unregister(this);
    }

    public final void onEvent(@NotNull Event12HourUpdate event12HourUpdate) {
        Log.i(this.TAG, Intrinsics.stringPlus("----event12HourUpdate----", Integer.valueOf(event12HourUpdate.getHour())));
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

    public final void setInitialTime(int hour, int minutes) {
        this.mHour = hour;
        this.minutes = minutes;
    }

    public final void setMListener(@Nullable ITimeChooseListener iTimeChooseListener) {
        this.mListener = iTimeChooseListener;
    }

    public final void setSureListener(@Nullable Function2<? super Integer, ? super Integer, Unit> function2) {
        this.sureListener = function2;
    }

    public final void setTitle(@NotNull String title) {
        this.title = title;
    }

    public final void onEvent(@NotNull EventAmPmUpdate eventAmPmUpdate) {
        Log.i(this.TAG, Intrinsics.stringPlus("----eventAmPmUpdate----", Integer.valueOf(eventAmPmUpdate.getAmPm())));
        j(eventAmPmUpdate.getAmPm());
    }
}
