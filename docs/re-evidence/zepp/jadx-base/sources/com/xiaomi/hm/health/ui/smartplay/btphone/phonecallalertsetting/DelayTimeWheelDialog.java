package com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.DelayTimeWheelDialog;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0006R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001e¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/DelayTimeWheelDialog;", "", "", "selectValue", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "b", "", "c", "value", "e", "Landroidx/fragment/app/FragmentManager;", "manger", "show", "getCurrentDelay", "dismiss", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/widget/wheelview/WheelView;", "Lcom/huami/widget/wheelview/WheelView;", "wheelView", "Landroid/view/View;", "Landroid/view/View;", "rootView", "Landroid/widget/TextView;", GoogleApiAvailabilityLight.a, "Landroid/widget/TextView;", "titleView", "Landroid/content/DialogInterface$OnClickListener;", "Landroid/content/DialogInterface$OnClickListener;", "getListener", "()Landroid/content/DialogInterface$OnClickListener;", "setListener", "(Landroid/content/DialogInterface$OnClickListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "f", "innerListener", "<init>", "(Landroid/content/Context;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DelayTimeWheelDialog {

    @NotNull
    private static final String g = "DelayTimeWheelDialog";
    private static final int h = 3;
    private static final int i = 3;
    private static final int j = 30;
    private static final int k = 5;
    private static final float l = 20.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private WheelView wheelView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private View rootView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private TextView titleView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private DialogInterface.OnClickListener listener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final DialogInterface.OnClickListener innerListener = new DialogInterface.OnClickListener() { // from class: m61
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i2) {
            DelayTimeWheelDialog.d(this.a, dialogInterface, i2);
        }
    };

    public DelayTimeWheelDialog(@NotNull Context context) {
        this.context = context;
    }

    private final AlertDialogFragment b(int selectValue) {
        c(selectValue);
        Resources resources = this.context.getResources();
        return new AlertDialogFragment.Builder(this.context).setContentView(this.rootView).setPositiveButton(resources.getString(R.string.yes), this.innerListener).setPositiveButtonTextStyle(R.color.s1, R.dimen.sp_16, true).setNegativeButton(resources.getString(R.string.cancel), this.innerListener).setNegativeButtonTextStyle(R.color.s2, R.dimen.sp_16, true).setCancelable(true).create();
    }

    private final void c(int selectValue) {
        View viewInflate = LayoutInflater.from(this.context).inflate(R.layout.delay_alert_time_dialog_new, (ViewGroup) null, false);
        this.rootView = viewInflate;
        WheelView wheelView = (WheelView) viewInflate.findViewById(R.id.delay_time_picker);
        this.wheelView = wheelView;
        Resources resources = this.context.getResources();
        this.titleView = (TextView) viewInflate.findViewById(R.id.time_value);
        Context context = this.context;
        PickAdapter pickAdapter = new PickAdapter(context, 3, 30, wheelView, ContextCompat.getColor(context, R.color.p3), ContextCompat.getColor(this.context, R.color.s2), -2003199591, true, 46, 24, 21, 21, 1);
        wheelView.setStyle(WheelView.Style.LINE);
        wheelView.setUnitTextColor(ContextCompat.getColor(this.context, R.color.p3));
        wheelView.setVisibleItems(5).setCenterDrawable(R.drawable.wheel_custom_val_white_1).setCenterStyle(resources.getString(R.string.unit_sec_short), R.color.p3, 20.0f).setViewAdapter(pickAdapter);
        e(selectValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DelayTimeWheelDialog delayTimeWheelDialog, DialogInterface dialogInterface, int i2) {
        DialogInterface.OnClickListener listener = delayTimeWheelDialog.getListener();
        if (listener == null) {
            return;
        }
        listener.onClick(dialogInterface, i2);
    }

    private final void e(int value) {
        WheelView wheelView;
        int i2 = value - 3;
        Resources resources = this.context.getResources();
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText(resources.getString(R.string.delay_to_alert));
        }
        WheelView wheelView2 = this.wheelView;
        boolean z = false;
        if (wheelView2 != null && wheelView2.getCurrentItem() == i2) {
            z = true;
        }
        if (z || (wheelView = this.wheelView) == null) {
            return;
        }
        wheelView.setCurrentItem(i2);
    }

    public final void dismiss() {
    }

    public final int getCurrentDelay() {
        WheelView wheelView = this.wheelView;
        return (wheelView == null ? 0 : wheelView.getCurrentItem()) + 3;
    }

    @Nullable
    public final DialogInterface.OnClickListener getListener() {
        return this.listener;
    }

    public final void setListener(@Nullable DialogInterface.OnClickListener onClickListener) {
        this.listener = onClickListener;
    }

    public final void show(int selectValue, @NotNull FragmentManager manger) {
        synchronized (this) {
            b(selectValue).show(manger);
            Unit unit = Unit.INSTANCE;
        }
    }
}
