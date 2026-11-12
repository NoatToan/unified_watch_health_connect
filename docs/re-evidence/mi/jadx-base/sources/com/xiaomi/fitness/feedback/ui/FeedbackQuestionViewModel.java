package com.xiaomi.fitness.feedback.ui;

import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.feedback.ui.FeedbackItemInfo;
import com.xiaomi.fitness.feedback.ui.FeedbackQuestionViewModel;
import defpackage.bv1;
import defpackage.hui;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0006\u0010%\u001a\u00020\"J\u0010\u0010&\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013RU\u0010\u0014\u001aD\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001d0\u0016j\b\u0012\u0004\u0012\u00020\u0007`\u0015¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001f¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/feedback/ui/FeedbackQuestionViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/feedback/ui/FeedbackQuestionModel;", "<init>", "()V", "items", "Landroidx/databinding/ObservableArrayList;", "Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;", "getItems", "()Landroidx/databinding/ObservableArrayList;", "adapter", "Lcom/xiaomi/fitness/feedback/ui/FeedbackAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/feedback/ui/FeedbackAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "itemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getItemBinding", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "viewHolderFactory", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/ViewHolderFactory;", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "", "viewType", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "getViewHolderFactory", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "onCreate", "", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "loadItemInfos", LifecycleConstantKt.ON_DESTROY, "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFeedbackQuestionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackQuestionViewModel.kt\ncom/xiaomi/fitness/feedback/ui/FeedbackQuestionViewModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n*L\n1#1,63:1\n27#2,5:64\n*S KotlinDebug\n*F\n+ 1 FeedbackQuestionViewModel.kt\ncom/xiaomi/fitness/feedback/ui/FeedbackQuestionViewModel\n*L\n24#1:64,5\n*E\n"})
public final class FeedbackQuestionViewModel extends BaseViewModel<FeedbackQuestionModel> {

    @NotNull
    private final ItemBinding<FeedbackItemInfo> itemBinding;

    @NotNull
    private final Function2<View, Integer, BaseViewHolder<FeedbackItemInfo>> viewHolderFactory;

    @NotNull
    private final ObservableArrayList<FeedbackItemInfo> items = new ObservableArrayList<>();

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: oj9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FeedbackQuestionViewModel.adapter_delegate$lambda$0();
        }
    });

    public FeedbackQuestionViewModel() {
        final Function3 function3 = new Function3() { // from class: pj9
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FeedbackQuestionViewModel.itemBinding$lambda$1((ItemBinding) obj, ((Integer) obj2).intValue(), (FeedbackItemInfo) obj3);
            }
        };
        this.itemBinding = ItemBinding.INSTANCE.of(new OnItemBind<FeedbackItemInfo>() { // from class: com.xiaomi.fitness.feedback.ui.FeedbackQuestionViewModel$special$$inlined$itemBindingOf$1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<FeedbackItemInfo> itemBinding, int position, FeedbackItemInfo item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function3.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
        this.viewHolderFactory = new Function2() { // from class: qj9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeedbackQuestionViewModel.viewHolderFactory$lambda$2((View) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final FeedbackAdapter adapter_delegate$lambda$0() {
        return new FeedbackAdapter(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit itemBinding$lambda$1(ItemBinding itemBinding, int i, FeedbackItemInfo item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        switch (item.getType()) {
            case 10:
                itemBinding.set(bv1.c, hui.s);
                break;
            case 11:
                itemBinding.set(bv1.c, hui.p);
                break;
            case 12:
                itemBinding.set(bv1.c, hui.o);
                break;
            case 13:
                itemBinding.set(bv1.f4630a, hui.u);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadItemInfos$lambda$3(FeedbackQuestionViewModel this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.items.clear();
        this$0.items.addAll(it);
        this$0.items.add(new FeedbackItemInfo(13, "", -1, 0, 0, null, null, false, false, 504, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseViewHolder viewHolderFactory$lambda$2(View view, int i) {
        if (i == hui.p) {
            Intrinsics.checkNotNull(view);
            return new FeedbackAdapter.DeviceViewHolder(view);
        }
        if (i == hui.o) {
            Intrinsics.checkNotNull(view);
            return new FeedbackAdapter.AppViewHolder(view);
        }
        if (i == hui.s) {
            Intrinsics.checkNotNull(view);
            return new FeedbackAdapter.LabelViewHolder(view);
        }
        Intrinsics.checkNotNull(view);
        return new FeedbackAdapter.BottomViewHolder(view);
    }

    @NotNull
    public final FeedbackAdapter getAdapter() {
        return (FeedbackAdapter) this.adapter.getValue();
    }

    @NotNull
    public final ItemBinding<FeedbackItemInfo> getItemBinding() {
        return this.itemBinding;
    }

    @NotNull
    public final ObservableArrayList<FeedbackItemInfo> getItems() {
        return this.items;
    }

    @NotNull
    public final Function2<View, Integer, BaseViewHolder<FeedbackItemInfo>> getViewHolderFactory() {
        return this.viewHolderFactory;
    }

    public final void loadItemInfos() throws JSONException {
        getMModel().loadItemInfos$feedback_chinaProductRelease(new Function1() { // from class: rj9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeedbackQuestionViewModel.loadItemInfos$lambda$3(this.f32599a, (List) obj);
            }
        });
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        getMModel().setLifecycleOwner(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        getMModel().setLifecycleOwner(null);
    }
}
