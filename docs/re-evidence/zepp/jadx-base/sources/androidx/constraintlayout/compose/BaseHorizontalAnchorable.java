package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.state.ConstraintReference;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B)\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u00100\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J+\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR(\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u00100\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/constraintlayout/compose/BaseHorizontalAnchorable;", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "Landroidx/constraintlayout/compose/State;", "state", "Landroidx/constraintlayout/core/state/ConstraintReference;", "getConstraintReference", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", XmPlayerService.TYPE_RANK_ANCHOR, "Landroidx/compose/ui/unit/Dp;", "margin", "goneMargin", "", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FF)V", "linkTo", "", "Lkotlin/Function1;", "tasks", "Ljava/util/List;", "", "index", LogUtil.I, "<init>", "(Ljava/util/List;I)V", "compose_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseHorizontalAnchorable implements HorizontalAnchorable {
    private final int index;

    @NotNull
    private final List<Function1<State, Unit>> tasks;

    public BaseHorizontalAnchorable(@NotNull List<Function1<State, Unit>> list, int i) {
        this.tasks = list;
        this.index = i;
    }

    @NotNull
    public abstract ConstraintReference getConstraintReference(@NotNull State state);

    @Override // androidx.constraintlayout.compose.HorizontalAnchorable
    /* JADX INFO: renamed from: linkTo-VpY3zN4, reason: not valid java name */
    public final void mo3173linkToVpY3zN4(@NotNull final ConstraintLayoutBaseScope.HorizontalAnchor anchor, final float margin, final float goneMargin) {
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.BaseHorizontalAnchorable$linkTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State state) {
                invoke2(state);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull State state) {
                ConstraintReference constraintReference = this.this$0.getConstraintReference(state);
                BaseHorizontalAnchorable baseHorizontalAnchorable = this.this$0;
                ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor = anchor;
                AnchorFunctions.INSTANCE.getHorizontalAnchorFunctions()[baseHorizontalAnchorable.index][horizontalAnchor.getIndex$compose_release()].invoke(constraintReference, horizontalAnchor.getId$compose_release()).margin(Dp.m2963boximpl(margin)).marginGone(Dp.m2963boximpl(goneMargin));
            }
        });
    }
}
