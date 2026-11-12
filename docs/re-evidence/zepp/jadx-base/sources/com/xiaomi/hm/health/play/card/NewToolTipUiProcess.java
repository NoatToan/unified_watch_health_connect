package com.xiaomi.hm.health.play.card;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huami.module.ktx.NumberExtKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.notification.TransportUri;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J \u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004R\u001d\u0010\r\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/play/card/NewToolTipUiProcess;", "", "Landroid/view/ViewGroup;", "viewGroup", "Lkotlin/Function0;", "", TransportUri.ACTION_BLOCK, "addNewTipView", "removeNewTipView", "Landroid/widget/ImageView;", "a", "Lkotlin/Lazy;", "()Landroid/widget/ImageView;", "newTipView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NewToolTipUiProcess {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy newTipView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ImageView> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView invoke() {
            ImageView imageView = new ImageView(this.a);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(NumberExtKt.getDp(30), NumberExtKt.getDp(30));
            layoutParams.startToStart = 0;
            layoutParams.topToTop = 0;
            Unit unit = Unit.INSTANCE;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.ic_tool_new);
            return imageView;
        }
    }

    public NewToolTipUiProcess(@Nullable Context context) {
        this.newTipView = LazyKt__LazyJVMKt.lazy(new a(context));
    }

    private final ImageView a() {
        return (ImageView) this.newTipView.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addNewTipView$default(NewToolTipUiProcess newToolTipUiProcess, ViewGroup viewGroup, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        newToolTipUiProcess.addNewTipView(viewGroup, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void removeNewTipView$default(NewToolTipUiProcess newToolTipUiProcess, ViewGroup viewGroup, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        newToolTipUiProcess.removeNewTipView(viewGroup, function0);
    }

    public final void addNewTipView(@NotNull ViewGroup viewGroup, @Nullable Function0<Unit> block) {
        ViewParent parent = a().getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(a());
        }
        viewGroup.addView(a());
        if (block == null) {
            return;
        }
        block.invoke();
    }

    public final void removeNewTipView(@NotNull ViewGroup viewGroup, @Nullable Function0<Unit> block) {
        if (a().getParent() != null) {
            viewGroup.removeView(a());
            if (block == null) {
                return;
            }
            block.invoke();
        }
    }
}
