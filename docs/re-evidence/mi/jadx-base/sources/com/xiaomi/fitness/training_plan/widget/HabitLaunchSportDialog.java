package com.xiaomi.fitness.training_plan.widget;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.a;
import com.xiaomi.fitness.training_plan.widget.HabitLaunchSportDialog;
import defpackage.csi;
import defpackage.jvi;
import defpackage.k1j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0014\u0010\u0015\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\u0017\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/HabitLaunchSportDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "outDoorRunClickListener", "Lkotlin/Function0;", "", "getOutDoorRunClickListener", "()Lkotlin/jvm/functions/Function0;", "setOutDoorRunClickListener", "(Lkotlin/jvm/functions/Function0;)V", "walkClickListener", "getWalkClickListener", "setWalkClickListener", "inDoorRunClickListener", "getInDoorRunClickListener", "setInDoorRunClickListener", "initCustomView", "rootView", "Landroid/view/View;", "setOutdoorRunClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setIndoorRunClickListener", "Builder", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitLaunchSportDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Function0<Unit> inDoorRunClickListener;

    @Nullable
    private Function0<Unit> outDoorRunClickListener;

    @Nullable
    private Function0<Unit> walkClickListener;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/HabitLaunchSportDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "Lcom/xiaomi/fitness/training_plan/widget/HabitLaunchSportDialog;", "getThis", "()Lcom/xiaomi/fitness/training_plan/widget/HabitLaunchSportDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/training_plan/widget/HabitLaunchSportDialog;", "", "name", "<init>", "(Ljava/lang/String;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends a<Builder, DialogParams, HabitLaunchSportDialog> {
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
        public HabitLaunchSportDialog internalCreate() {
            return new HabitLaunchSportDialog();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/HabitLaunchSportDialog$Companion;", "", "<init>", "()V", "defaultBuilder", "Lcom/xiaomi/fitness/training_plan/widget/HabitLaunchSportDialog$Builder;", "name", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder defaultBuilder(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Builder negativeText = new Builder(name).setCustomLayoutId(jvi.C).setCancelable(true).setCanceledOnTouchOutside(true).setNegativeText(k1j.f);
            Intrinsics.checkNotNullExpressionValue(negativeText, "setNegativeText(...)");
            return negativeText;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCustomView$lambda$0(HabitLaunchSportDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        Function0<Unit> function0 = this$0.outDoorRunClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCustomView$lambda$1(HabitLaunchSportDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        Function0<Unit> function0 = this$0.walkClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCustomView$lambda$2(HabitLaunchSportDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        Function0<Unit> function0 = this$0.inDoorRunClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Nullable
    public final Function0<Unit> getInDoorRunClickListener() {
        return this.inDoorRunClickListener;
    }

    @Nullable
    public final Function0<Unit> getOutDoorRunClickListener() {
        return this.outDoorRunClickListener;
    }

    @Nullable
    public final Function0<Unit> getWalkClickListener() {
        return this.walkClickListener;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
        super.initCustomView(rootView);
        TextView textView = rootView != null ? (TextView) rootView.findViewById(csi.Z1) : null;
        TextView textView2 = rootView != null ? (TextView) rootView.findViewById(csi.g5) : null;
        TextView textView3 = rootView != null ? (TextView) rootView.findViewById(csi.B0) : null;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: yeb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HabitLaunchSportDialog.initCustomView$lambda$0(this.f40093a, view);
                }
            });
        }
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: zeb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HabitLaunchSportDialog.initCustomView$lambda$1(this.f41189a, view);
                }
            });
        }
        if (textView3 != null) {
            textView3.setOnClickListener(new View.OnClickListener() { // from class: afb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HabitLaunchSportDialog.initCustomView$lambda$2(this.f945a, view);
                }
            });
        }
    }

    public final void setInDoorRunClickListener(@Nullable Function0<Unit> function0) {
        this.inDoorRunClickListener = function0;
    }

    @NotNull
    public final HabitLaunchSportDialog setIndoorRunClickListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.inDoorRunClickListener = listener;
        return this;
    }

    public final void setOutDoorRunClickListener(@Nullable Function0<Unit> function0) {
        this.outDoorRunClickListener = function0;
    }

    @NotNull
    public final HabitLaunchSportDialog setOutdoorRunClickListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.outDoorRunClickListener = listener;
        return this;
    }

    /* JADX INFO: renamed from: setWalkClickListener, reason: collision with other method in class */
    public final void m627setWalkClickListener(@Nullable Function0<Unit> function0) {
        this.walkClickListener = function0;
    }

    @NotNull
    public final HabitLaunchSportDialog setWalkClickListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.walkClickListener = listener;
        return this;
    }
}
