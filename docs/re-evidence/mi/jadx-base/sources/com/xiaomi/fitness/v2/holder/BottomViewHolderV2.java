package com.xiaomi.fitness.v2.holder;

import android.content.Context;
import android.view.View;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.showalldata.ManageHealthFunctionFragment;
import com.xiaomi.fitness.v2.holder.BottomViewHolderV2;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import defpackage.dih;
import defpackage.nf2;
import defpackage.sxb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/v2/holder/BottomViewHolderV2;", "Lnf2;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lsxb;", "binding", "Lsxb;", "getBinding", "()Lsxb;", "<init>", "(Landroid/content/Context;Lsxb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BottomViewHolderV2 extends nf2 {

    @NotNull
    private final sxb binding;

    @NotNull
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomViewHolderV2(@NotNull Context context, @NotNull sxb binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.context = context;
        this.binding = binding;
        binding.B.setOnClickListener(new View.OnClickListener() { // from class: y43
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomViewHolderV2._init_$lambda$0(this.f39771a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(BottomViewHolderV2 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HealthTabOneTrackExtKt.oneTrackOnClickHealthManageBtn();
        FragmentParams fragmentParamsB = new FragmentParams.b().e(ManageHealthFunctionFragment.class).c(null).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().f(this$0.context, fragmentParamsB, true);
    }

    @NotNull
    public final sxb getBinding() {
        return this.binding;
    }
}
