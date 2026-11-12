package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/SequenceScope;", "Landroid/view/View;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", i = {0, 0, 0, 1, 1}, l = {97, 99}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "child", "$this$sequence", "$this$forEach$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
public final class ViewGroupKt$descendants$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super View>, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ViewGroup $this_descendants;
    public int I$0;
    public int I$1;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewGroupKt$descendants$1(ViewGroup viewGroup, Continuation<? super ViewGroupKt$descendants$1> continuation) {
        super(2, continuation);
        this.$this_descendants = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.$this_descendants, continuation);
        viewGroupKt$descendants$1.L$0 = obj;
        return viewGroupKt$descendants$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull SequenceScope<? super View> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ViewGroupKt$descendants$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:21:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r4 >= r5) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008c -> B:23:0x008e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0094 -> B:25:0x0097). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        SequenceScope sequenceScope;
        ViewGroup viewGroup;
        int i;
        int childCount;
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1;
        ViewGroupKt$descendants$1 viewGroupKt$descendants$2;
        ViewGroup viewGroup2;
        View view;
        int i2;
        Sequence<View> descendants;
        ViewGroup viewGroup3;
        SequenceScope sequenceScope2;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = this.I$1;
                i = this.I$0;
                view = (View) this.L$2;
                viewGroup2 = (ViewGroup) this.L$1;
                SequenceScope sequenceScope3 = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                sequenceScope = sequenceScope3;
                viewGroupKt$descendants$2 = this;
                if (view instanceof ViewGroup) {
                    descendants = ViewGroupKt.getDescendants((ViewGroup) view);
                    viewGroupKt$descendants$2.L$0 = sequenceScope;
                    viewGroupKt$descendants$2.L$1 = viewGroup2;
                    viewGroupKt$descendants$2.L$2 = null;
                    viewGroupKt$descendants$2.I$0 = i;
                    viewGroupKt$descendants$2.I$1 = i2;
                    viewGroupKt$descendants$2.label = 2;
                    if (sequenceScope.yieldAll(descendants, viewGroupKt$descendants$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    viewGroup3 = viewGroup2;
                    sequenceScope2 = sequenceScope;
                } else {
                    childCount = i2;
                    viewGroup = viewGroup2;
                    viewGroupKt$descendants$1 = viewGroupKt$descendants$2;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.I$1;
                i = this.I$0;
                viewGroup3 = (ViewGroup) this.L$1;
                sequenceScope2 = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                viewGroupKt$descendants$2 = this;
            }
            sequenceScope = sequenceScope2;
            viewGroupKt$descendants$1 = viewGroupKt$descendants$2;
            ViewGroup viewGroup4 = viewGroup3;
            childCount = i2;
            viewGroup = viewGroup4;
        } else {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            viewGroup = this.$this_descendants;
            i = 0;
            childCount = viewGroup.getChildCount();
            if (childCount > 0) {
                viewGroupKt$descendants$1 = this;
                int i4 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                viewGroupKt$descendants$1.L$0 = sequenceScope;
                viewGroupKt$descendants$1.L$1 = viewGroup;
                viewGroupKt$descendants$1.L$2 = childAt;
                viewGroupKt$descendants$1.I$0 = i4;
                viewGroupKt$descendants$1.I$1 = childCount;
                viewGroupKt$descendants$1.label = 1;
                if (sequenceScope.yield(childAt, viewGroupKt$descendants$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ViewGroupKt$descendants$1 viewGroupKt$descendants$3 = viewGroupKt$descendants$1;
                viewGroup2 = viewGroup;
                i2 = childCount;
                view = childAt;
                i = i4;
                viewGroupKt$descendants$2 = viewGroupKt$descendants$3;
                if (view instanceof ViewGroup) {
                    descendants = ViewGroupKt.getDescendants((ViewGroup) view);
                    viewGroupKt$descendants$2.L$0 = sequenceScope;
                    viewGroupKt$descendants$2.L$1 = viewGroup2;
                    viewGroupKt$descendants$2.L$2 = null;
                    viewGroupKt$descendants$2.I$0 = i;
                    viewGroupKt$descendants$2.I$1 = i2;
                    viewGroupKt$descendants$2.label = 2;
                    if (sequenceScope.yieldAll(descendants, viewGroupKt$descendants$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    viewGroup3 = viewGroup2;
                    sequenceScope2 = sequenceScope;
                    sequenceScope = sequenceScope2;
                    viewGroupKt$descendants$1 = viewGroupKt$descendants$2;
                    ViewGroup viewGroup5 = viewGroup3;
                    childCount = i2;
                    viewGroup = viewGroup5;
                } else {
                    childCount = i2;
                    viewGroup = viewGroup2;
                    viewGroupKt$descendants$1 = viewGroupKt$descendants$2;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
