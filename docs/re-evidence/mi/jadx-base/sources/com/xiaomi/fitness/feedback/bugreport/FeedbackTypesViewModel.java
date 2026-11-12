package com.xiaomi.fitness.feedback.bugreport;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.f;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.baseui.recyclerview.provider.MergeObservableList;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.feedback.bugreport.FeedbackDeviceInfo;
import com.xiaomi.fitness.feedback.bugreport.FeedbackTypesViewModel;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.feedback.request.BaseFeedbackRequest;
import com.xiaomi.fitness.feedback.request.FeedbackRequest;
import com.xiaomi.fitness.feedback.ui.FeedbackModel;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import defpackage.bv1;
import defpackage.hui;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b6\u0010\u0005J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0011\u0010\u001cR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R+\u0010+\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0'8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R#\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000/8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedbackTypesViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/feedback/ui/FeedbackModel;", "", "loadTypes", "()V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "Landroidx/databinding/f;", "Lcom/xiaomi/fitness/feedback/bugreport/FeedbackDeviceInfo;", "list", "setDataList", "(Landroidx/databinding/f;)V", "", "show", "setShowMore", "(Z)V", "Lcom/xiaomi/fitness/feedback/bugreport/FeedBackSubCategoryAdapter;", "adapter", "Lcom/xiaomi/fitness/feedback/bugreport/FeedBackSubCategoryAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/feedback/bugreport/FeedBackSubCategoryAdapter;", "showMore", "Ljava/lang/Boolean;", "getShowMore", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)V", "Lcom/xiaomi/fitness/baseui/recyclerview/provider/MergeObservableList;", "tagItems", "Lcom/xiaomi/fitness/baseui/recyclerview/provider/MergeObservableList;", "getTagItems", "()Lcom/xiaomi/fitness/baseui/recyclerview/provider/MergeObservableList;", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "feedbackItemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getFeedbackItemBinding", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "Lkotlin/Function2;", "Landroid/view/View;", "", "Lcom/xiaomi/fitness/feedback/bugreport/FeedBackSubCategoryHolder;", "viewHolderFactory", "Lkotlin/jvm/functions/Function2;", "getViewHolderFactory", "()Lkotlin/jvm/functions/Function2;", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;", "feedbackList", "Landroidx/lifecycle/MutableLiveData;", "getFeedbackList", "()Landroidx/lifecycle/MutableLiveData;", "<init>", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFeedbackTypesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackTypesViewModel.kt\ncom/xiaomi/fitness/feedback/bugreport/FeedbackTypesViewModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n*L\n1#1,71:1\n27#2,5:72\n*S KotlinDebug\n*F\n+ 1 FeedbackTypesViewModel.kt\ncom/xiaomi/fitness/feedback/bugreport/FeedbackTypesViewModel\n*L\n31#1:72,5\n*E\n"})
public final class FeedbackTypesViewModel extends BaseViewModel<FeedbackModel> {

    @NotNull
    private final ItemBinding<FeedbackDeviceInfo> feedbackItemBinding;

    @NotNull
    private final MutableLiveData<List<FeedBackModelData.FeedBackType>> feedbackList;

    @NotNull
    private final Function2<View, Integer, FeedBackSubCategoryHolder> viewHolderFactory;

    @NotNull
    private final FeedBackSubCategoryAdapter adapter = new FeedBackSubCategoryAdapter();

    @Nullable
    private Boolean showMore = Boolean.TRUE;

    @NotNull
    private final MergeObservableList<FeedbackDeviceInfo> tagItems = new MergeObservableList<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.feedback.bugreport.FeedbackTypesViewModel$setDataList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.feedback.bugreport.FeedbackTypesViewModel$setDataList$1", f = "FeedbackTypesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ f<FeedbackDeviceInfo> $list;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f<FeedbackDeviceInfo> fVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$list = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FeedbackTypesViewModel.this.new AnonymousClass1(this.$list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FeedbackTypesViewModel.this.getTagItems().insertList(this.$list);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FeedbackTypesViewModel() {
        final Function3 function3 = new Function3() { // from class: ek9
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FeedbackTypesViewModel.feedbackItemBinding$lambda$0((ItemBinding) obj, ((Integer) obj2).intValue(), (FeedbackDeviceInfo) obj3);
            }
        };
        this.feedbackItemBinding = ItemBinding.INSTANCE.of(new OnItemBind<FeedbackDeviceInfo>() { // from class: com.xiaomi.fitness.feedback.bugreport.FeedbackTypesViewModel$special$$inlined$itemBindingOf$1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<FeedbackDeviceInfo> itemBinding, int position, FeedbackDeviceInfo item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function3.invoke(itemBinding, Integer.valueOf(position), item);
            }
        }).bindExtra(bv1.e, this);
        this.viewHolderFactory = new Function2() { // from class: fk9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeedbackTypesViewModel.viewHolderFactory$lambda$1((View) obj, ((Integer) obj2).intValue());
            }
        };
        this.feedbackList = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit feedbackItemBinding$lambda$0(ItemBinding itemBinding, int i, FeedbackDeviceInfo item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        itemBinding.set(bv1.c, hui.g);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadTypes$lambda$2(FeedbackTypesViewModel this$0, List data) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "data");
        this$0.feedbackList.setValue(data);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FeedBackSubCategoryHolder viewHolderFactory$lambda$1(View view, int i) {
        if (i == hui.g) {
            Intrinsics.checkNotNull(view);
            return new FeedBackSubCategoryHolder(view);
        }
        Intrinsics.checkNotNull(view);
        return new FeedBackSubCategoryHolder(view);
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final FeedBackSubCategoryAdapter getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final ItemBinding<FeedbackDeviceInfo> getFeedbackItemBinding() {
        return this.feedbackItemBinding;
    }

    @NotNull
    public final MutableLiveData<List<FeedBackModelData.FeedBackType>> getFeedbackList() {
        return this.feedbackList;
    }

    @Nullable
    public final Boolean getShowMore() {
        return this.showMore;
    }

    @NotNull
    public final MergeObservableList<FeedbackDeviceInfo> getTagItems() {
        return this.tagItems;
    }

    @NotNull
    public final Function2<View, Integer, FeedBackSubCategoryHolder> getViewHolderFactory() {
        return this.viewHolderFactory;
    }

    public final void loadTypes() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (AppUtil.INSTANCE.isPlayChannel()) {
            jSONObject.put(FeedbackConstants.KEY_MODULE_ID, 273);
        } else {
            jSONObject.put(FeedbackConstants.KEY_MODULE_ID, 239);
        }
        Logger.d(getTAG(), "feedback info IS " + jSONObject);
        BaseFeedbackRequest.getFeedBackTypes$default(new FeedbackRequest(), jSONObject, new Function1() { // from class: gk9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeedbackTypesViewModel.loadTypes$lambda$2(this.f19077a, (List) obj);
            }
        }, null, 4, null);
    }

    public final void setDataList(@NotNull f<FeedbackDeviceInfo> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        AnyExtKt.main$default(null, new AnonymousClass1(list, null), 1, null);
    }

    public final void setShowMore(@Nullable Boolean bool) {
        this.showMore = bool;
    }

    public final void setShowMore(boolean show) {
        this.showMore = Boolean.valueOf(show);
    }
}
