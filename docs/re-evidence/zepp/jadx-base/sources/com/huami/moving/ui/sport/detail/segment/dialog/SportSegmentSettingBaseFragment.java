package com.huami.moving.ui.sport.detail.segment.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.moving.R;
import com.huami.widget.share.ShareAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingBaseFragment;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "", "c", "onStart", "", "hasPadding", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/moving/ui/sport/detail/segment/dialog/StrengthTrainEditOption;", "getEditOption", "Lcom/huami/moving/ui/sport/detail/segment/dialog/StrengthTrainEditResult;", "editResult", ShareAnalytics.ParamValue.SAVE, "Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingBaseFragment$OnDataChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "e", "Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingBaseFragment$OnDataChangeListener;", "getMListener", "()Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingBaseFragment$OnDataChangeListener;", "setMListener", "(Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingBaseFragment$OnDataChangeListener;)V", "mListener", "f", "Lcom/huami/moving/ui/sport/detail/segment/dialog/StrengthTrainEditOption;", "editOption", "<init>", "()V", "Companion", "OnDataChangeListener", "moving_release"}, k = 1, mv = {1, 5, 1})
public abstract class SportSegmentSettingBaseFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EDIT_OPTIONS = "edit_options";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private OnDataChangeListener mListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private StrengthTrainEditOption editOption;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingBaseFragment$Companion;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingBaseFragment;", "fragment", "Lcom/huami/moving/ui/sport/detail/segment/dialog/StrengthTrainEditOption;", "options", "", "show", "", "EDIT_OPTIONS", "Ljava/lang/String;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void show(@NotNull FragmentActivity activity, @NotNull SportSegmentSettingBaseFragment fragment, @NotNull StrengthTrainEditOption options) {
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportSegmentSettingBaseFragment.EDIT_OPTIONS, options);
            fragment.setArguments(bundle);
            fragment.show(activity.getSupportFragmentManager(), (String) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingBaseFragment$OnDataChangeListener;", "", "", "onChange", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface OnDataChangeListener {
        void onChange();
    }

    private final void c() {
        if (getArguments() == null || !getArguments().containsKey(EDIT_OPTIONS)) {
            return;
        }
        this.editOption = (StrengthTrainEditOption) getArguments().getSerializable(EDIT_OPTIONS);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public StrengthTrainEditOption getEditOption() {
        return this.editOption;
    }

    @Nullable
    public final OnDataChangeListener getMListener() {
        return this.mListener;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = R.style.DimPanel;
        if (SportSegmentSystemBarTintSupport.INSTANCE.isSupport(getActivity())) {
            i = R.style.DimPanelTint;
        }
        setStyle(0, i);
        c();
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Window window = dialog == null ? null : dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -1;
            window.setAttributes(attributes);
        }
    }

    public void save(@NotNull StrengthTrainEditResult editResult) {
    }

    public final void setListener(@Nullable OnDataChangeListener listener) {
        this.mListener = listener;
    }

    public final void setMListener(@Nullable OnDataChangeListener onDataChangeListener) {
        this.mListener = onDataChangeListener;
    }
}
