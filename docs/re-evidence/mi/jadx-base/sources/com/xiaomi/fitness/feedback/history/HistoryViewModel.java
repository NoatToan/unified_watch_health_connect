package com.xiaomi.fitness.feedback.history;

import android.os.Bundle;
import androidx.databinding.ObservableArrayList;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.feedback.history.HistoryDetail;
import com.xiaomi.fitness.feedback.history.HistoryViewModel;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.bv1;
import defpackage.hui;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010#\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R6\u0010\u001c\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001e\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001fj\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001e\u0018\u0001`\u001dX\u0082\u000e¢\u0006\u0004\n\u0002\u0010 R\u001c\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/feedback/history/HistoryViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/feedback/history/HistoryModel;", "<init>", "()V", "adapter", "Lcom/xiaomi/fitness/feedback/history/HistoryAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/feedback/history/HistoryAdapter;", "itemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "Lcom/xiaomi/fitness/feedback/history/HistoryDetail;", "getItemBinding", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "items", "Landroidx/databinding/ObservableArrayList;", "getItems", "()Landroidx/databinding/ObservableArrayList;", "isEmpty", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "isEmpty$feedback_chinaProductRelease", "()Landroidx/lifecycle/MutableLiveData;", "onCreate", "", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "fail", "Lcom/xiaomi/fitness/net/response/ApiException;", "attach", "savedInstanceState", "Landroid/os/Bundle;", LifecycleConstantKt.ON_DESTROY, "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHistoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryViewModel.kt\ncom/xiaomi/fitness/feedback/history/HistoryViewModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n*L\n1#1,64:1\n27#2,5:65\n*S KotlinDebug\n*F\n+ 1 HistoryViewModel.kt\ncom/xiaomi/fitness/feedback/history/HistoryViewModel\n*L\n28#1:65,5\n*E\n"})
public final class HistoryViewModel extends BaseViewModel<HistoryModel> {

    @NotNull
    private final HistoryAdapter adapter = new HistoryAdapter();

    @Nullable
    private Function1<? super ApiException, Unit> fail;

    @NotNull
    private final MutableLiveData<Boolean> isEmpty;

    @NotNull
    private final ItemBinding<HistoryDetail> itemBinding;

    @NotNull
    private final ObservableArrayList<HistoryDetail> items;

    @Nullable
    private Function1<? super List<HistoryDetail>, Unit> success;

    public HistoryViewModel() {
        final Function3 function3 = new Function3() { // from class: v8c
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HistoryViewModel.itemBinding$lambda$0((ItemBinding) obj, ((Integer) obj2).intValue(), (HistoryDetail) obj3);
            }
        };
        this.itemBinding = ItemBinding.INSTANCE.of(new OnItemBind<HistoryDetail>() { // from class: com.xiaomi.fitness.feedback.history.HistoryViewModel$special$$inlined$itemBindingOf$1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<HistoryDetail> itemBinding, int position, HistoryDetail item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function3.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
        this.items = new ObservableArrayList<>();
        this.isEmpty = new MutableLiveData<>(Boolean.FALSE);
        this.success = new Function1() { // from class: w8c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryViewModel.success$lambda$1(this.f37718a, (List) obj);
            }
        };
        this.fail = new Function1() { // from class: x8c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryViewModel.fail$lambda$2(this.f38846a, (ApiException) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fail$lambda$2(HistoryViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e("get feedback histories error:" + it, new Object[0]);
        if (it.getErrorCode() == 1000) {
            this$0.isEmpty.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit itemBinding$lambda$0(ItemBinding itemBinding, int i, HistoryDetail historyDetail) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(historyDetail, "<unused var>");
        itemBinding.set(bv1.d, hui.f20478r);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit success$lambda$1(HistoryViewModel this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.items.clear();
        this$0.items.addAll(it);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
        getMModel().getHistories(this.success, this.fail);
    }

    @NotNull
    public final HistoryAdapter getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final ItemBinding<HistoryDetail> getItemBinding() {
        return this.itemBinding;
    }

    @NotNull
    public final ObservableArrayList<HistoryDetail> getItems() {
        return this.items;
    }

    @NotNull
    public final MutableLiveData<Boolean> isEmpty$feedback_chinaProductRelease() {
        return this.isEmpty;
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
        this.success = null;
        this.fail = null;
        super.onDestroy(owner);
    }
}
