package com.xiaomi.hm.health.play.card;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.dragview.draglist.DataCallback;
import com.huami.dragview.draglist.DragEntry;
import com.huami.dragview.draglist.DragListActivity;
import com.huami.dragview.draglist.DragParam;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databinding.PlayCardEditBinding;
import com.xiaomi.hm.health.play.PlayTabType;
import com.xiaomi.hm.health.play.PlayTool;
import com.xiaomi.hm.health.play.PlayViewModel;
import com.xiaomi.hm.health.play.bean.SortTool;
import com.xiaomi.hm.health.smalltool.model.ToolKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/play/card/EditCardRender;", "Lcom/xiaomi/hm/health/play/card/AbstractCardRender;", "Lcom/xiaomi/hm/health/databinding/PlayCardEditBinding;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "", "setUiData", "onCardClick", "Lcom/xiaomi/hm/health/play/PlayTabType;", "g", "Lcom/xiaomi/hm/health/play/PlayTabType;", "tabType", "Lcom/xiaomi/hm/health/play/PlayViewModel;", "h", "Lkotlin/Lazy;", "e", "()Lcom/xiaomi/hm/health/play/PlayViewModel;", "playViewModel", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Lcom/xiaomi/hm/health/play/PlayTabType;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EditCardRender extends AbstractCardRender<PlayCardEditBinding> {

    @NotNull
    private static final String i = "EditCardRender";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final PlayTabType tabType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy playViewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public EditCardRender(@NotNull LifecycleOwner lifecycleOwner, @NotNull PlayTabType playTabType) {
        this.tabType = playTabType;
        final ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.card.EditCardRender$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks2 = componentCallbacks;
                return companion.from((ViewModelStoreOwner) componentCallbacks2, componentCallbacks2 instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks2 : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.playViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PlayViewModel>() { // from class: com.xiaomi.hm.health.play.card.EditCardRender$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.play.PlayViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final PlayViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(componentCallbacks, qualifier, Reflection.getOrCreateKotlinClass(PlayViewModel.class), function0, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlayViewModel e() {
        return (PlayViewModel) this.playViewModel.getValue();
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void onCardClick(@NotNull final Context context, @NotNull CardUiData uiParams) {
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded()) {
            return;
        }
        final List<PlayTool> value = this.tabType == PlayTabType.INTELLIGENCE ? e().getIntelligenceLiveData().getValue() : e().getHealthLiveData().getValue();
        DragListActivity.INSTANCE.launch(context, new DragParam(context.getString(R.string.play_sort_title), context.getString(R.string.play_sort_show_title), context.getString(R.string.play_sort_not_show_title), context.getString(R.string.play_sort_drag_tips), context.getString(R.string.play_sort_empty_tips), context.getString(R.string.play_sort_cannot_drag_tips), TuplesKt.to(context.getString(R.string.save), context.getString(R.string.cancel)), TuplesKt.to(context.getString(R.string.saving_success), context.getString(R.string.play_sort_save_fail)), TuplesKt.to(1, context.getString(R.string.play_sort_min_show_tip))), new DataCallback() { // from class: com.xiaomi.hm.health.play.card.EditCardRender.onCardClick.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.play.card.EditCardRender$onCardClick$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ List<DragEntry> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(List<DragEntry> list) {
                    super(0);
                    this.a = list;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "调整后的小工具: " + this.a;
                }
            }

            @Override // com.huami.dragview.draglist.DataCallback
            @Nullable
            public Object loadData(@NotNull Continuation<? super List<DragEntry>> continuation) {
                ArrayList arrayList;
                List<PlayTool> list = value;
                if (list == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (Boxing.boxBoolean(!Intrinsics.areEqual(((PlayTool) obj).getTool().getKey(), ToolKey.WATCHFACE_SETTING)).booleanValue()) {
                            arrayList2.add(obj);
                        }
                    }
                    Context context2 = context;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        DragEntry dragEntryA = EditCardRenderKt.a((PlayTool) it2.next(), context2);
                        if (dragEntryA != null) {
                            arrayList3.add(dragEntryA);
                        }
                    }
                    arrayList = arrayList3;
                }
                return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
            }

            @Override // com.huami.dragview.draglist.DataCallback
            @Nullable
            public Object saveData(@NotNull List<DragEntry> list, @NotNull Continuation<? super Boolean> continuation) {
                boolean z;
                HMLog.info(EditCardRender.i, new a(list));
                if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
                    PlayViewModel playViewModelE = this.e();
                    PlayTabType playTabType = this.tabType;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (DragEntry dragEntry : list) {
                        arrayList.add(new SortTool(String.valueOf(dragEntry.getKey()), dragEntry.getShow()));
                    }
                    playViewModelE.saveSortTools(playTabType, arrayList);
                    z = true;
                } else {
                    z = false;
                }
                return Boxing.boxBoolean(z);
            }
        });
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void setUiData(@NotNull Context context, @NotNull CardUiData uiParams) {
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public PlayCardEditBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return PlayCardEditBinding.inflate(inflater, rootView, true);
    }
}
