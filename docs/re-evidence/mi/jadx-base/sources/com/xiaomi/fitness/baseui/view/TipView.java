package com.xiaomi.fitness.baseui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.xiaomi.fitness.baseui.view.TipView;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.gki;
import defpackage.loi;
import defpackage.n1j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\bH\u0002J\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/baseui/view/TipView;", "Landroid/widget/FrameLayout;", "ctx", "Landroid/content/Context;", "type", "Lcom/xiaomi/fitness/baseui/view/TipType;", "onRetry", "Lkotlin/Function0;", "", "removeErrorOnRefresh", "", "<init>", "(Landroid/content/Context;Lcom/xiaomi/fitness/baseui/view/TipType;Lkotlin/jvm/functions/Function0;Z)V", "getType", "()Lcom/xiaomi/fitness/baseui/view/TipType;", "initView", "getTipRes", "Lkotlin/Pair;", "", "tipType", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class TipView extends FrameLayout {

    @NotNull
    private static final String TAG = "NetErrorView";

    @NotNull
    private final Context ctx;

    @Nullable
    private final Function0<Unit> onRetry;
    private final boolean removeErrorOnRefresh;

    @NotNull
    private final TipType type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TipType.values().length];
            try {
                iArr[TipType.NO_NET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TipType.NO_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipView(@NotNull Context ctx, @NotNull TipType type, @Nullable Function0<Unit> function0, boolean z) {
        super(ctx, null);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(type, "type");
        this.ctx = ctx;
        this.type = type;
        this.onRetry = function0;
        this.removeErrorOnRefresh = z;
        initView();
    }

    private final Pair<Integer, Integer> getTipRes(TipType tipType) {
        int i = WhenMappings.$EnumSwitchMapping$0[tipType.ordinal()];
        if (i == 1) {
            return new Pair<>(Integer.valueOf(n1j.i), Integer.valueOf(loi.j));
        }
        if (i == 2) {
            return new Pair<>(Integer.valueOf(n1j.common_data_empty), Integer.valueOf(loi.f25272k));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void initView() {
        setBackgroundColor(this.ctx.getColor(gki.f19086k));
        Pair<Integer, Integer> tipRes = getTipRes(this.type);
        AppCompatTextView appCompatTextView = new AppCompatTextView(this.ctx);
        appCompatTextView.setText(this.ctx.getString(tipRes.getFirst().intValue()));
        appCompatTextView.setTextColor(this.ctx.getColor(gki.q));
        appCompatTextView.setTextSize(16.0f);
        appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(0, tipRes.getSecond().intValue(), 0, 0);
        appCompatTextView.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        Unit unit = Unit.INSTANCE;
        addView(appCompatTextView, layoutParams);
        setOnClickListener(new View.OnClickListener() { // from class: yfp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TipView.initView$lambda$3(this.f40139a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(TipView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onRetry;
        if (function0 != null) {
            try {
                if (this$0.removeErrorOnRefresh) {
                    ViewParent parent = this$0.getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(this$0);
                }
                function0.invoke();
            } catch (Exception e) {
                Logger.e(TAG, "onRetry exception " + e.getMessage());
            }
        }
    }

    @NotNull
    public final TipType getType() {
        return this.type;
    }
}
