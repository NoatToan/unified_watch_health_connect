package com.xiaomi.fitness.watch.face.widget;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.iki;
import defpackage.isi;
import defpackage.ovi;
import defpackage.p1j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\u0006J\u0010\u0010\u0019\u001a\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u0006J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/widget/FaceDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "maxProgress", "progressInfo", "Landroid/widget/TextView;", "progressBar", "Landroid/widget/ProgressBar;", "title", "infoFormatRes", "getInfoFormatRes", "()I", "setInfoFormatRes", "(I)V", "editTitle", "", "titleId", "setProgress", "", "setMaxProgress", "id", "setTitle", "initCustomView", "rootView", "Landroid/view/View;", "Builder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceDialog extends CommonDialog<DialogParams> {
    private boolean editTitle;
    private int progress;

    @Nullable
    private ProgressBar progressBar;

    @Nullable
    private TextView progressInfo;

    @Nullable
    private TextView title;
    private int titleId;
    private int maxProgress = 100;
    private int infoFormatRes = p1j.u;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/watch/face/widget/FaceDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "Lcom/xiaomi/fitness/watch/face/widget/FaceDialog;", "getThis", "()Lcom/xiaomi/fitness/watch/face/widget/FaceDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/watch/face/widget/FaceDialog;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends com.xiaomi.fitness.baseui.dialog.a<Builder, DialogParams, FaceDialog> {

        @NotNull
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull String name) {
            super(new DialogParams(name));
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            setCustomLayoutId(ovi.o0);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public FaceDialog internalCreate() {
            return new FaceDialog();
        }
    }

    public final int getInfoFormatRes() {
        return this.infoFormatRes;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
        super.initCustomView(rootView);
        setCancelable(false);
        this.progressBar = rootView != null ? (ProgressBar) rootView.findViewById(isi.I1) : null;
        this.progressInfo = rootView != null ? (TextView) rootView.findViewById(isi.J1) : null;
        if (this.editTitle) {
            TextView textView = rootView != null ? (TextView) rootView.findViewById(isi.V0) : null;
            this.title = textView;
            if (textView != null) {
                textView.setText(this.titleId);
            }
        }
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setMax(100);
        }
        TextView textView2 = this.progressInfo;
        if (textView2 != null) {
            textView2.setText(getString(this.infoFormatRes, 0));
        }
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            progressBar2.setProgressTintList(ColorStateList.valueOf(ApplicationExtKt.getApplication().getResources().getColor(iki.e)));
        }
    }

    public final void setInfoFormatRes(int i) {
        this.infoFormatRes = i;
    }

    public final void setMaxProgress(int progress) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setMax(progress);
        }
        this.maxProgress = progress;
    }

    public final void setProgress(int progress) {
        if (isAdded()) {
            int i = this.maxProgress;
            int iMin = Math.min(i, (int) ((progress * 100.0f) / i));
            if (progress == this.progress) {
                return;
            }
            TextView textView = this.progressInfo;
            if (textView != null) {
                textView.setText(getString(this.infoFormatRes, Integer.valueOf(iMin)));
            }
            ProgressBar progressBar = this.progressBar;
            if (progressBar != null) {
                progressBar.setProgress(iMin);
            }
            this.progress = progress;
        }
    }

    public final void setTitle(int id) {
        this.editTitle = true;
        this.titleId = id;
        TextView textView = this.title;
        if (textView != null) {
            textView.setText(id);
        }
    }

    @NotNull
    public final FaceDialog title(int id) {
        this.editTitle = true;
        this.titleId = id;
        return this;
    }
}
