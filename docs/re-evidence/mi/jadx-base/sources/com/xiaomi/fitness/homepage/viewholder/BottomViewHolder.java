package com.xiaomi.fitness.homepage.viewholder;

import android.app.ActivityOptions;
import android.content.Context;
import android.view.View;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.homepage.util.HealthDataUtil;
import com.xiaomi.fitness.homepage.viewholder.BottomViewHolder;
import com.xiaomi.fitness.showalldata.HealthShowAllDataFragment;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import defpackage.dih;
import defpackage.nf2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/homepage/viewholder/BottomViewHolder;", "Lnf2;", "Landroid/view/View;", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "itemView", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BottomViewHolder extends nf2 {

    @Nullable
    private View contentView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.contentView = itemView;
        final Context context = itemView.getContext();
        View view = this.contentView;
        if (view != null) {
            HealthDataUtil healthDataUtil = HealthDataUtil.INSTANCE;
            Intrinsics.checkNotNull(context);
            healthDataUtil.cardZoom(context, view, new Function1() { // from class: x43
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BottomViewHolder.lambda$1$lambda$0(context, (ActivityOptions) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda$1$lambda$0(Context context, ActivityOptions activityOptions) {
        HealthTabOneTrackExtKt.oneTrackOnClickHealthManageBtn();
        FragmentParams fragmentParamsB = new FragmentParams.b().e(HealthShowAllDataFragment.class).c(null).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().g(context, fragmentParamsB, true, activityOptions);
        return Unit.INSTANCE;
    }

    @Nullable
    public final View getContentView() {
        return this.contentView;
    }

    public final void setContentView(@Nullable View view) {
        this.contentView = view;
    }
}
