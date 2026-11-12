package com.xiaomi.fitness.active.pk.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.fni;
import defpackage.jpi;
import defpackage.kzh;
import defpackage.wqi;
import defpackage.zii;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/active/pk/widget/PkScoreView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "oppPercent", "", "applyConstraint", "(F)V", "", "score", "", "status", "showSameScoreView", "(JI)V", "showEmptyView", "()V", "ownScore", "oppScore", "setScore", "(JJI)V", "Landroid/widget/ImageView;", "ivOppRect", "Landroid/widget/ImageView;", "ivOwnRect", "ivOppWin", "ivOwnWin", "Landroid/widget/TextView;", "tvOppScore", "Landroid/widget/TextView;", "tvOwnScore", "normalPxTextSize", "F", "winTextPxSize", "Landroid/graphics/Typeface;", "normalTypeFace", "Landroid/graphics/Typeface;", "winTypeFace", "Lkzh;", "binding", "Lkzh;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PkScoreView extends ConstraintLayout {

    @NotNull
    private final kzh binding;

    @NotNull
    private final ImageView ivOppRect;

    @NotNull
    private final ImageView ivOppWin;

    @NotNull
    private final ImageView ivOwnRect;

    @NotNull
    private final ImageView ivOwnWin;
    private final float normalPxTextSize;

    @Nullable
    private final Typeface normalTypeFace;

    @NotNull
    private final TextView tvOppScore;

    @NotNull
    private final TextView tvOwnScore;
    private final float winTextPxSize;

    @Nullable
    private final Typeface winTypeFace;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PkScoreView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyConstraint(float oppPercent) {
        a aVar = new a();
        ConstraintLayout parent = this.binding.F;
        Intrinsics.checkNotNullExpressionValue(parent, "parent");
        aVar.s(parent);
        aVar.z(wqi.M, oppPercent);
        aVar.b0(wqi.x, (float) (((double) oppPercent) - 0.01d));
        aVar.i(parent);
    }

    private final void showEmptyView() {
        applyConstraint(0.5f);
        ViewExtKt.setVisible(this.ivOwnWin, false);
        ViewExtKt.setVisible(this.ivOppWin, false);
        boolean zIsRTLDirection = AppUtil.isRTLDirection();
        this.ivOwnRect.setBackgroundResource(zIsRTLDirection ? fni.m : fni.f17960r);
        this.ivOppRect.setBackgroundResource(zIsRTLDirection ? fni.f17960r : fni.m);
        this.tvOwnScore.setText("--");
        this.tvOppScore.setText("--");
        this.tvOwnScore.setTextSize(0, this.normalPxTextSize);
        this.tvOppScore.setTextSize(0, this.normalPxTextSize);
        this.tvOwnScore.setTextColor(ViewExtKt.getColor(this, zii.j));
        this.tvOppScore.setTextColor(ViewExtKt.getColor(this, zii.j));
        this.tvOwnScore.setTypeface(this.normalTypeFace);
        this.tvOppScore.setTypeface(this.normalTypeFace);
    }

    private final void showSameScoreView(long score, int status) {
        int i;
        int i2;
        applyConstraint(0.5f);
        ViewExtKt.setVisible(this.ivOwnWin, false);
        ViewExtKt.setVisible(this.ivOppWin, false);
        boolean zIsRTLDirection = AppUtil.isRTLDirection();
        ImageView imageView = this.ivOwnRect;
        if (status == 2) {
            i = zIsRTLDirection ? fni.o : fni.t;
        } else {
            i = zIsRTLDirection ? fni.n : fni.s;
        }
        imageView.setBackgroundResource(i);
        ImageView imageView2 = this.ivOppRect;
        if (status == 2) {
            i2 = zIsRTLDirection ? fni.t : fni.o;
        } else {
            i2 = zIsRTLDirection ? fni.s : fni.n;
        }
        imageView2.setBackgroundResource(i2);
        this.tvOwnScore.setText(String.valueOf(score));
        this.tvOppScore.setText(String.valueOf(score));
        int color = ViewExtKt.getColor(this, status == 2 ? zii.l : zii.f41319k);
        this.tvOwnScore.setTextColor(color);
        this.tvOppScore.setTextColor(color);
    }

    public final void setScore(long ownScore, long oppScore, int status) {
        float fCoerceAtMost;
        int i;
        int i2;
        int i3;
        int i4;
        if (status == 0 || (ownScore < 0 && oppScore < 0)) {
            showEmptyView();
            return;
        }
        if (ownScore == oppScore) {
            showSameScoreView(ownScore, status);
            return;
        }
        float f = ownScore + oppScore;
        float f2 = ownScore / f;
        float f3 = oppScore / f;
        float f4 = 0.18f;
        if (ownScore < oppScore) {
            if (ownScore > 1000) {
                f4 = 0.22f;
            } else if (ownScore > 100) {
                f4 = 0.16f;
            } else if (ownScore <= 10) {
                f4 = 0.123f;
            }
            float f5 = 1;
            fCoerceAtMost = f5 - RangesKt___RangesKt.coerceAtMost(f5 - f4, RangesKt___RangesKt.coerceAtLeast(f4, f2));
        } else {
            if (oppScore > 1000) {
                f4 = 0.22f;
            } else if (oppScore > 100) {
                f4 = 0.16f;
            } else if (oppScore <= 10) {
                f4 = 0.123f;
            }
            fCoerceAtMost = RangesKt___RangesKt.coerceAtMost(1 - f4, RangesKt___RangesKt.coerceAtLeast(f4, f3));
        }
        applyConstraint(fCoerceAtMost);
        int color = ViewExtKt.getColor(this, status == 2 ? zii.m : zii.n);
        int color2 = ViewExtKt.getColor(this, status == 2 ? zii.l : zii.f41319k);
        boolean zIsRTLDirection = AppUtil.isRTLDirection();
        if (ownScore > oppScore) {
            ViewExtKt.setVisible(this.ivOwnWin, true);
            ViewExtKt.setVisible(this.ivOppWin, false);
            ImageView imageView = this.ivOwnRect;
            if (status == 2) {
                i3 = zIsRTLDirection ? fni.p : fni.u;
            } else {
                i3 = zIsRTLDirection ? fni.q : fni.v;
            }
            imageView.setBackgroundResource(i3);
            ImageView imageView2 = this.ivOppRect;
            if (status == 2) {
                i4 = zIsRTLDirection ? fni.t : fni.o;
            } else {
                i4 = zIsRTLDirection ? fni.s : fni.n;
            }
            imageView2.setBackgroundResource(i4);
            this.tvOwnScore.setTextSize(0, this.winTextPxSize);
            this.tvOppScore.setTextSize(0, this.normalPxTextSize);
            this.tvOwnScore.setTextColor(color);
            this.tvOppScore.setTextColor(color2);
            this.tvOwnScore.setTypeface(this.winTypeFace);
            this.tvOppScore.setTypeface(this.normalTypeFace);
        } else {
            ViewExtKt.setVisible(this.ivOwnWin, false);
            ViewExtKt.setVisible(this.ivOppWin, true);
            ImageView imageView3 = this.ivOwnRect;
            if (status == 2) {
                i = zIsRTLDirection ? fni.o : fni.t;
            } else {
                i = zIsRTLDirection ? fni.n : fni.s;
            }
            imageView3.setBackgroundResource(i);
            ImageView imageView4 = this.ivOppRect;
            if (status == 2) {
                i2 = zIsRTLDirection ? fni.u : fni.p;
            } else {
                i2 = zIsRTLDirection ? fni.v : fni.q;
            }
            imageView4.setBackgroundResource(i2);
            this.tvOwnScore.setTextSize(0, this.normalPxTextSize);
            this.tvOppScore.setTextSize(0, this.winTextPxSize);
            this.tvOwnScore.setTextColor(color2);
            this.tvOppScore.setTextColor(color);
            this.tvOwnScore.setTypeface(this.normalTypeFace);
            this.tvOppScore.setTypeface(this.winTypeFace);
        }
        this.tvOwnScore.setText(String.valueOf(ownScore));
        this.tvOppScore.setText(String.valueOf(oppScore));
    }

    public /* synthetic */ PkScoreView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PkScoreView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.normalPxTextSize = ExtUtilsKt.getDp(Float.valueOf(16.0f));
        this.winTextPxSize = ExtUtilsKt.getDp(Float.valueOf(18.6f));
        kzh kzhVarA0 = kzh.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(kzhVarA0, "inflate(...)");
        this.binding = kzhVarA0;
        this.ivOppRect = kzhVarA0.B;
        this.ivOwnRect = kzhVarA0.D;
        this.ivOppWin = kzhVarA0.C;
        this.ivOwnWin = kzhVarA0.E;
        this.tvOppScore = kzhVarA0.G;
        this.tvOwnScore = kzhVarA0.H;
        this.normalTypeFace = DisplayUtil.getTypefaceAsResourceId(context, jpi.f23005a);
        this.winTypeFace = DisplayUtil.getTypefaceAsResourceId(context, jpi.f23006b);
    }
}
