package com.xiaomi.hm.health.ui.smartplay.alarm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/RepeatDayDialogFragment;", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/RepeatModeDialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "Landroidx/fragment/app/FragmentManager;", "manager", "show", "Landroid/view/View$OnClickListener;", "c", "Landroid/view/View$OnClickListener;", "getConfirmListener", "()Landroid/view/View$OnClickListener;", "setConfirmListener", "(Landroid/view/View$OnClickListener;)V", "confirmListener", GoogleApiAvailabilityLight.a, "getCancelListener", "setCancelListener", "cancelListener", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListDialogAdapter;", "adapter", "<init>", "(Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListDialogAdapter;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class RepeatDayDialogFragment extends RepeatModeDialogFragment {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener confirmListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener cancelListener;

    /* JADX WARN: Multi-variable type inference failed */
    public RepeatDayDialogFragment() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ RepeatDayDialogFragment(ListDialogAdapter listDialogAdapter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ListDialogAdapter() : listDialogAdapter);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.RepeatModeDialogFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final View.OnClickListener getCancelListener() {
        return this.cancelListener;
    }

    @Nullable
    public final View.OnClickListener getConfirmListener() {
        return this.confirmListener;
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.RepeatModeDialogFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_repeat_day, container, false);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.RepeatModeDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View viewFindViewById = view.findViewById(R.id.tv_cancel);
        View viewFindViewById2 = view.findViewById(R.id.tv_confirm);
        View.OnClickListener onClickListener = this.confirmListener;
        if (onClickListener != null) {
            viewFindViewById2.setOnClickListener(onClickListener);
        }
        View.OnClickListener onClickListener2 = this.cancelListener;
        if (onClickListener2 == null) {
            return;
        }
        viewFindViewById.setOnClickListener(onClickListener2);
    }

    public final void setCancelListener(@Nullable View.OnClickListener onClickListener) {
        this.cancelListener = onClickListener;
    }

    public final void setConfirmListener(@Nullable View.OnClickListener onClickListener) {
        this.confirmListener = onClickListener;
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.RepeatModeDialogFragment
    public void show(@NotNull FragmentManager manager) {
        show(manager, "RepeatDayDialogFragment");
    }

    public RepeatDayDialogFragment(@NotNull ListDialogAdapter listDialogAdapter) {
        super(listDialogAdapter);
    }
}
