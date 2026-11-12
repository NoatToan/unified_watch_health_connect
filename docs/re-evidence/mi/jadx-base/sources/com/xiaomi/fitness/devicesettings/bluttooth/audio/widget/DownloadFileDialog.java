package com.xiaomi.fitness.devicesettings.bluttooth.audio.widget;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.a;
import defpackage.av6;
import defpackage.eui;
import defpackage.zqi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import miuix.androidbasewidget.widget.ProgressBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/DownloadFileDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "mProgressBar", "Lmiuix/androidbasewidget/widget/ProgressBar;", "mPercentText", "Landroid/widget/TextView;", "initCustomView", "", "rootView", "Landroid/view/View;", "updateProgress", "current", "", SportDataTypeKt.DIMEN_TOTAL, "Builder", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DownloadFileDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private TextView mPercentText;

    @Nullable
    private ProgressBar mProgressBar;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/DownloadFileDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/DownloadFileDialog;", "getThis", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/DownloadFileDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/DownloadFileDialog;", "", "name", "<init>", "(Ljava/lang/String;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends a<Builder, DialogParams, DownloadFileDialog> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull String name) {
            super(new DialogParams(name));
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public DownloadFileDialog internalCreate() {
            return new DownloadFileDialog();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/DownloadFileDialog$Companion;", "", "<init>", "()V", "defaultBuilder", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/DownloadFileDialog$Builder;", "name", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder defaultBuilder(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Builder cancelable = new Builder(name).setCustomLayoutId(eui.D).setCanceledOnTouchOutside(false).setCancelable(false);
            Intrinsics.checkNotNullExpressionValue(cancelable, "setCancelable(...)");
            return cancelable;
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
        super.initCustomView(rootView);
        this.mProgressBar = rootView != null ? (ProgressBar) rootView.findViewById(zqi.m2) : null;
        this.mPercentText = rootView != null ? (TextView) rootView.findViewById(zqi.l2) : null;
        addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.widget.DownloadFileDialog.initCustomView.1
            @Override // defpackage.av6
            public boolean onDialogKeyEvent(String dialogName, DialogInterface dialog, int keyCode, KeyEvent event) {
                return keyCode == 4;
            }
        });
    }

    @SuppressLint({"SetTextI18n"})
    public final void updateProgress(int current, int total) {
        int i = (int) ((current / total) * 100);
        if (i > 99) {
            i = 99;
        }
        TextView textView = this.mPercentText;
        if (textView != null) {
            textView.setText(i + "%");
        }
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
    }
}
