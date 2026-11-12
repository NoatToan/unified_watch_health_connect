package com.xiaomi.fitness.training_plan.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.cyi;
import defpackage.ei;
import defpackage.ioi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/AbilityMedalProgressLayoutTablet;", "Landroid/widget/FrameLayout;", "", "bindLessThan1", "()V", "", "finishTrainingTime", "bindLessThan5", "(I)V", "bindLessThan10", "bindLessThan30", "bindDefault", "bind", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "Lei;", "binding", "Lei;", "", "progressRatio", "F", "", "finish1TimeTip", "Ljava/lang/String;", "finish5TimeTip", "finish10TimeTip", "finish30TimeTip", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AbilityMedalProgressLayoutTablet extends FrameLayout {

    @NotNull
    private ei binding;

    @NotNull
    private final Context ctx;

    @NotNull
    private String finish10TimeTip;

    @NotNull
    private String finish1TimeTip;

    @NotNull
    private String finish30TimeTip;

    @NotNull
    private String finish5TimeTip;
    private final float progressRatio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbilityMedalProgressLayoutTablet(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        ei eiVarA0 = ei.A0(LayoutInflater.from(ctx));
        Intrinsics.checkNotNullExpressionValue(eiVarA0, "inflate(...)");
        this.binding = eiVarA0;
        this.progressRatio = 0.33f;
        View root = eiVarA0.getRoot();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, ExtUtilsKt.getDp(14), 0, ExtUtilsKt.getDp(45));
        Unit unit = Unit.INSTANCE;
        addView(root, layoutParams);
        this.finish1TimeTip = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.f14866a, 1, 1);
        this.finish5TimeTip = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.f14866a, 5, 5);
        this.finish10TimeTip = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.f14866a, 10, 10);
        this.finish30TimeTip = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.f14866a, 30, 30);
        this.binding.F.setText(this.finish1TimeTip);
        this.binding.J.setText(this.finish5TimeTip);
        this.binding.N.setText(this.finish10TimeTip);
        this.binding.R.setText(this.finish30TimeTip);
    }

    private final void bindDefault() {
        setBackgroundResource(ioi.g);
        this.binding.D.setImageResource(ioi.v);
        ImageView medal1ImageBig = this.binding.C;
        Intrinsics.checkNotNullExpressionValue(medal1ImageBig, "medal1ImageBig");
        ViewExtKt.invisible(medal1ImageBig);
        this.binding.H.setImageResource(ioi.z);
        ImageView medal2ImageBig = this.binding.G;
        Intrinsics.checkNotNullExpressionValue(medal2ImageBig, "medal2ImageBig");
        ViewExtKt.invisible(medal2ImageBig);
        this.binding.L.setImageResource(ioi.s);
        ImageView medal3ImageBig = this.binding.K;
        Intrinsics.checkNotNullExpressionValue(medal3ImageBig, "medal3ImageBig");
        ViewExtKt.invisible(medal3ImageBig);
        this.binding.O.setImageResource(ioi.w);
        ImageView medal4ImageSmall = this.binding.P;
        Intrinsics.checkNotNullExpressionValue(medal4ImageSmall, "medal4ImageSmall");
        ViewExtKt.invisible(medal4ImageSmall);
        View status1Big = this.binding.T;
        Intrinsics.checkNotNullExpressionValue(status1Big, "status1Big");
        ViewExtKt.invisible(status1Big);
        this.binding.U.setBackgroundResource(ioi.j);
        View status2Big = this.binding.V;
        Intrinsics.checkNotNullExpressionValue(status2Big, "status2Big");
        ViewExtKt.invisible(status2Big);
        this.binding.W.setBackgroundResource(ioi.j);
        View status3Big = this.binding.X;
        Intrinsics.checkNotNullExpressionValue(status3Big, "status3Big");
        ViewExtKt.invisible(status3Big);
        this.binding.Y.setBackgroundResource(ioi.j);
        this.binding.Z.setBackgroundResource(ioi.l);
        this.binding.a0.setBackgroundResource(ioi.j);
        this.binding.S.setProgress(100);
    }

    private final void bindLessThan1() {
        setBackgroundResource(ioi.f);
        this.binding.D.setImageResource(ioi.q);
        ImageView medal1ImageBig = this.binding.C;
        Intrinsics.checkNotNullExpressionValue(medal1ImageBig, "medal1ImageBig");
        ViewExtKt.invisible(medal1ImageBig);
        this.binding.H.setImageResource(ioi.A);
        ImageView medal2ImageBig = this.binding.G;
        Intrinsics.checkNotNullExpressionValue(medal2ImageBig, "medal2ImageBig");
        ViewExtKt.invisible(medal2ImageBig);
        this.binding.L.setImageResource(ioi.t);
        ImageView medal3ImageBig = this.binding.K;
        Intrinsics.checkNotNullExpressionValue(medal3ImageBig, "medal3ImageBig");
        ViewExtKt.invisible(medal3ImageBig);
        this.binding.P.setImageResource(ioi.x);
        ImageView medal4ImageBig = this.binding.O;
        Intrinsics.checkNotNullExpressionValue(medal4ImageBig, "medal4ImageBig");
        ViewExtKt.invisible(medal4ImageBig);
        View status1Big = this.binding.T;
        Intrinsics.checkNotNullExpressionValue(status1Big, "status1Big");
        ViewExtKt.invisible(status1Big);
        this.binding.U.setBackgroundResource(ioi.f21949k);
        View status2Big = this.binding.V;
        Intrinsics.checkNotNullExpressionValue(status2Big, "status2Big");
        ViewExtKt.invisible(status2Big);
        this.binding.W.setBackgroundResource(ioi.f21949k);
        View status3Big = this.binding.X;
        Intrinsics.checkNotNullExpressionValue(status3Big, "status3Big");
        ViewExtKt.invisible(status3Big);
        this.binding.Y.setBackgroundResource(ioi.f21949k);
        View status4Big = this.binding.Z;
        Intrinsics.checkNotNullExpressionValue(status4Big, "status4Big");
        ViewExtKt.invisible(status4Big);
        this.binding.a0.setBackgroundResource(ioi.f21949k);
        this.binding.S.setProgress(0);
    }

    private final void bindLessThan10(int finishTrainingTime) {
        setBackgroundResource(ioi.h);
        this.binding.D.setImageResource(ioi.v);
        ImageView medal1ImageBig = this.binding.C;
        Intrinsics.checkNotNullExpressionValue(medal1ImageBig, "medal1ImageBig");
        ViewExtKt.invisible(medal1ImageBig);
        this.binding.G.setImageResource(ioi.y);
        ImageView medal2ImageSmall = this.binding.H;
        Intrinsics.checkNotNullExpressionValue(medal2ImageSmall, "medal2ImageSmall");
        ViewExtKt.invisible(medal2ImageSmall);
        this.binding.L.setImageResource(ioi.t);
        ImageView medal3ImageBig = this.binding.K;
        Intrinsics.checkNotNullExpressionValue(medal3ImageBig, "medal3ImageBig");
        ViewExtKt.invisible(medal3ImageBig);
        this.binding.P.setImageResource(ioi.x);
        ImageView medal4ImageBig = this.binding.O;
        Intrinsics.checkNotNullExpressionValue(medal4ImageBig, "medal4ImageBig");
        ViewExtKt.invisible(medal4ImageBig);
        View status1Big = this.binding.T;
        Intrinsics.checkNotNullExpressionValue(status1Big, "status1Big");
        ViewExtKt.invisible(status1Big);
        this.binding.U.setBackgroundResource(ioi.j);
        this.binding.V.setBackgroundResource(ioi.l);
        this.binding.W.setBackgroundResource(ioi.j);
        View status3Big = this.binding.X;
        Intrinsics.checkNotNullExpressionValue(status3Big, "status3Big");
        ViewExtKt.invisible(status3Big);
        this.binding.Y.setBackgroundResource(ioi.f21949k);
        View status4Big = this.binding.Z;
        Intrinsics.checkNotNullExpressionValue(status4Big, "status4Big");
        ViewExtKt.invisible(status4Big);
        this.binding.a0.setBackgroundResource(ioi.f21949k);
        this.binding.S.setProgress(((int) (((finishTrainingTime - 5) / 5) * 100 * this.progressRatio)) + 33);
    }

    private final void bindLessThan30(int finishTrainingTime) {
        setBackgroundResource(ioi.i);
        this.binding.D.setImageResource(ioi.v);
        ImageView medal1ImageBig = this.binding.C;
        Intrinsics.checkNotNullExpressionValue(medal1ImageBig, "medal1ImageBig");
        ViewExtKt.invisible(medal1ImageBig);
        this.binding.H.setImageResource(ioi.z);
        ImageView medal2ImageBig = this.binding.G;
        Intrinsics.checkNotNullExpressionValue(medal2ImageBig, "medal2ImageBig");
        ViewExtKt.invisible(medal2ImageBig);
        this.binding.K.setImageResource(ioi.f21950r);
        ImageView medal3ImageSmall = this.binding.L;
        Intrinsics.checkNotNullExpressionValue(medal3ImageSmall, "medal3ImageSmall");
        ViewExtKt.invisible(medal3ImageSmall);
        this.binding.P.setImageResource(ioi.x);
        ImageView medal4ImageBig = this.binding.O;
        Intrinsics.checkNotNullExpressionValue(medal4ImageBig, "medal4ImageBig");
        ViewExtKt.invisible(medal4ImageBig);
        View status1Big = this.binding.T;
        Intrinsics.checkNotNullExpressionValue(status1Big, "status1Big");
        ViewExtKt.invisible(status1Big);
        this.binding.U.setBackgroundResource(ioi.j);
        View status2Big = this.binding.V;
        Intrinsics.checkNotNullExpressionValue(status2Big, "status2Big");
        ViewExtKt.invisible(status2Big);
        this.binding.W.setBackgroundResource(ioi.j);
        this.binding.X.setBackgroundResource(ioi.l);
        this.binding.Y.setBackgroundResource(ioi.j);
        View status4Big = this.binding.Z;
        Intrinsics.checkNotNullExpressionValue(status4Big, "status4Big");
        ViewExtKt.invisible(status4Big);
        this.binding.a0.setBackgroundResource(ioi.f21949k);
        this.binding.S.setProgress(((int) (((finishTrainingTime - 10) / 20) * 100 * this.progressRatio)) + 66);
    }

    private final void bindLessThan5(int finishTrainingTime) {
        setBackgroundResource(ioi.f);
        this.binding.C.setImageResource(ioi.u);
        ImageView medal1ImageSmall = this.binding.D;
        Intrinsics.checkNotNullExpressionValue(medal1ImageSmall, "medal1ImageSmall");
        ViewExtKt.invisible(medal1ImageSmall);
        this.binding.H.setImageResource(ioi.A);
        ImageView medal2ImageBig = this.binding.G;
        Intrinsics.checkNotNullExpressionValue(medal2ImageBig, "medal2ImageBig");
        ViewExtKt.invisible(medal2ImageBig);
        this.binding.L.setImageResource(ioi.t);
        ImageView medal3ImageBig = this.binding.K;
        Intrinsics.checkNotNullExpressionValue(medal3ImageBig, "medal3ImageBig");
        ViewExtKt.invisible(medal3ImageBig);
        this.binding.P.setImageResource(ioi.x);
        ImageView medal4ImageBig = this.binding.O;
        Intrinsics.checkNotNullExpressionValue(medal4ImageBig, "medal4ImageBig");
        ViewExtKt.invisible(medal4ImageBig);
        this.binding.U.setBackgroundResource(ioi.j);
        this.binding.T.setBackgroundResource(ioi.l);
        View status2Big = this.binding.V;
        Intrinsics.checkNotNullExpressionValue(status2Big, "status2Big");
        ViewExtKt.invisible(status2Big);
        this.binding.W.setBackgroundResource(ioi.f21949k);
        View status3Big = this.binding.X;
        Intrinsics.checkNotNullExpressionValue(status3Big, "status3Big");
        ViewExtKt.invisible(status3Big);
        this.binding.Y.setBackgroundResource(ioi.f21949k);
        View status4Big = this.binding.Z;
        Intrinsics.checkNotNullExpressionValue(status4Big, "status4Big");
        ViewExtKt.invisible(status4Big);
        this.binding.a0.setBackgroundResource(ioi.f21949k);
        this.binding.S.setProgress((int) (((finishTrainingTime - 1) / 4) * this.progressRatio * 100));
    }

    public final void bind(int finishTrainingTime) {
        if (finishTrainingTime < 1) {
            bindLessThan1();
            return;
        }
        if (finishTrainingTime < 5) {
            bindLessThan5(finishTrainingTime);
            return;
        }
        if (finishTrainingTime < 10) {
            bindLessThan10(finishTrainingTime);
        } else if (finishTrainingTime < 30) {
            bindLessThan30(finishTrainingTime);
        } else {
            bindDefault();
        }
    }
}
