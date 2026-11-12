package com.xiaomi.fitness.homepage.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.homepage.view.HealthGradientView;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import defpackage.iji;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\rH\u0014J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\rH\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/homepage/view/HealthGradientView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mSetCommonHeaderFlag", "", "mSelectModeListener", "Lkotlin/Function1;", "", "", "onFinishInflate", "setBackground", "headerFlag", "initListener", "setGradientBg", "onDetachedFromWindow", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthGradientView extends View {

    @NotNull
    public static final String TAG = "HealthGradientView";

    @Nullable
    private Function1<? super Integer, Unit> mSelectModeListener;
    private boolean mSetCommonHeaderFlag;

    public HealthGradientView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void initListener() {
        this.mSelectModeListener = new Function1() { // from class: mwb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthGradientView.initListener$lambda$0(this.f27282a, ((Integer) obj).intValue());
            }
        };
        CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
        Function1<? super Integer, Unit> function1 = this.mSelectModeListener;
        Intrinsics.checkNotNull(function1);
        checkerUserSettingManagerExtKt.addSelectModeListener(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initListener$lambda$0(HealthGradientView this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CheckerUserSettingManager.Companion companion = CheckerUserSettingManager.INSTANCE;
        boolean z = CheckerUserSettingManagerExtKt.getInstance(companion).getSelectMode() == companion.getCONCISE_MODE();
        if (z != this$0.mSetCommonHeaderFlag) {
            this$0.mSetCommonHeaderFlag = z;
            this$0.setBackground(z);
        }
        return Unit.INSTANCE;
    }

    private final void setBackground(boolean headerFlag) {
        if (headerFlag) {
            setBackground(ViewExtKt.getDrawable(this, iji.K));
        } else {
            setGradientBg();
        }
    }

    private final void setGradientBg() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i = UIUtils.isNightMode(context) ? iji.f21228a : iji.J3;
        setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ViewExtKt.getColor(this, i), ViewExtKt.getColor(this, i), ViewExtKt.getColor(this, i)}));
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Function1<? super Integer, Unit> function1 = this.mSelectModeListener;
        if (function1 != null) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).removeSelectModeListener(function1);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        initListener();
        CheckerUserSettingManager.Companion companion = CheckerUserSettingManager.INSTANCE;
        boolean z = CheckerUserSettingManagerExtKt.getInstance(companion).getSelectMode() == companion.getCONCISE_MODE();
        this.mSetCommonHeaderFlag = z;
        setBackground(z);
    }
}
