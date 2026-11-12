package com.huami.snore.ui.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.huami.snore.core.R;
import com.huami.snore.ui.activity.SnoreListActivity;
import com.huami.snore.ui.base.BaseDialogFragment;
import com.huami.snore.ui.dialog.SnoreFinishDialogDialog;
import com.huami.snore.ui.util.CommonUiUtil;
import java.util.Date;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/huami/snore/ui/dialog/SnoreFinishDialogDialog;", "Lcom/huami/snore/ui/base/BaseDialogFragment;", "", "hasPadding", "Landroid/view/View;", "initView", "", "onStart", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "titleTv", "f", "monitorTimeTv", "g", "btnOk", "h", "btnCancel", "<init>", "()V", "Companion", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreFinishDialogDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String MONITOR_TIME = "monitor_time";

    @NotNull
    public static final String TITLE_KEY = "title";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private TextView titleTv;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private TextView monitorTimeTv;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private TextView btnOk;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private TextView btnCancel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/snore/ui/dialog/SnoreFinishDialogDialog$Companion;", "", "", "title", "monitorTime", "Lcom/huami/snore/ui/dialog/SnoreFinishDialogDialog;", "newInstance", "MONITOR_TIME", "Ljava/lang/String;", "TITLE_KEY", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SnoreFinishDialogDialog newInstance(@NotNull String title, @NotNull String monitorTime) {
            SnoreFinishDialogDialog snoreFinishDialogDialog = new SnoreFinishDialogDialog();
            Bundle bundle = new Bundle();
            bundle.putString("title", title);
            bundle.putString(SnoreFinishDialogDialog.MONITOR_TIME, monitorTime);
            snoreFinishDialogDialog.setArguments(bundle);
            return snoreFinishDialogDialog;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SnoreFinishDialogDialog snoreFinishDialogDialog, View view) {
        SnoreListActivity.INSTANCE.navigation(snoreFinishDialogDialog.getContext(), new Date());
        snoreFinishDialogDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SnoreFinishDialogDialog snoreFinishDialogDialog, View view) {
        snoreFinishDialogDialog.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.snore.ui.base.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.snore.ui.base.BaseDialogFragment
    @NotNull
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_snore_monitor_finish_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        this.titleTv = textView;
        Objects.requireNonNull(textView);
        Bundle arguments = getArguments();
        textView.setText(arguments == null ? null : arguments.getString("title"));
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.monitorTime);
        this.monitorTimeTv = textView2;
        Objects.requireNonNull(textView2);
        Bundle arguments2 = getArguments();
        textView2.setText(arguments2 != null ? arguments2.getString(MONITOR_TIME) : null);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.bottomReport);
        this.btnOk = textView3;
        Objects.requireNonNull(textView3);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: v47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnoreFinishDialogDialog.e(this.a, view);
            }
        });
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.bottomCancel);
        this.btnCancel = textView4;
        Objects.requireNonNull(textView4);
        textView4.setOnClickListener(new View.OnClickListener() { // from class: u47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnoreFinishDialogDialog.f(this.a, view);
            }
        });
        return viewInflate;
    }

    @Override // com.huami.snore.ui.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.width = CommonUiUtil.INSTANCE.getInstance().dip2px(getContext(), 300.0f);
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }
}
