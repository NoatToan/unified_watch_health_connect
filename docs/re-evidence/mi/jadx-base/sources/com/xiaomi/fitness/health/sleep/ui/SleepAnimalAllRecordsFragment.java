package com.xiaomi.fitness.health.sleep.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.paging.CombinedLoadStates;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalAllRecordsFragment;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepAnimalAllRecordsAdapter;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalExtKt;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import defpackage.aub;
import defpackage.c0j;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import defpackage.k5g;
import defpackage.pni;
import defpackage.wc0;
import defpackage.yaa;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001+B\u0007¢\u0006\u0004\b*\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\bJ'\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepAnimalAllRecordsFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "Laub;", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepAnimalAllRecordsAdapter$OnItemClickListener;", "Lyaa;", "", "initActionBar", "()V", "", "editMode", "refreshWhenEditModeChanged", "(Z)V", "showDeleteDialog", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onBackPressed", "()Z", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "sleepAnimal", "onClick", "(Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;)V", "onDeleteSelectedItemUpdate", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView;", "recyclerView", "Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView;", "Landroid/widget/TextView;", "deleteView", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepAnimalAllRecordsAdapter;", "sleepAllRecordAdapter", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepAnimalAllRecordsAdapter;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepAnimalAllRecordsFragment extends Hilt_SleepAnimalAllRecordsFragment<SleepViewModel, aub> implements SleepAnimalAllRecordsAdapter.OnItemClickListener, yaa {

    @NotNull
    public static final String PARAM_RECORD = "sleep";
    public static final int RESULT_CODE_DELETE = 0;

    @NotNull
    public static final String TAG = "SleepAnimalAllRecordsFragment";
    private TextView deleteView;
    private MoreRecyclerView recyclerView;
    private SleepAnimalAllRecordsAdapter sleepAllRecordAdapter;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.ui.SleepAnimalAllRecordsFragment$onClick$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.ui.SleepAnimalAllRecordsFragment$onClick$1", f = "SleepAnimalAllRecordsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SleepAnimalReport $sleepAnimal;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SleepAnimalReport sleepAnimalReport, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sleepAnimal = sleepAnimalReport;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepAnimalAllRecordsFragment.this.new AnonymousClass1(this.$sleepAnimal, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Context contextRequireContext = SleepAnimalAllRecordsFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            SleepAnimalExtKt.gotoSleepAnimalReportActivity$default(contextRequireContext, this.$sleepAnimal, null, false, "history", 6, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.ui.SleepAnimalAllRecordsFragment$onFragmentResult$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.ui.SleepAnimalAllRecordsFragment$onFragmentResult$1", f = "SleepAnimalAllRecordsFragment.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<SleepAnimalReport> $deleteList;
        int label;
        final /* synthetic */ SleepAnimalAllRecordsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25231(List<SleepAnimalReport> list, SleepAnimalAllRecordsFragment sleepAnimalAllRecordsFragment, Continuation<? super C25231> continuation) {
            super(2, continuation);
            this.$deleteList = list;
            this.this$0 = sleepAnimalAllRecordsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25231(this.$deleteList, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Logger.i(SleepAnimalAllRecordsFragment.TAG, "deleteSleepAnimal(" + this.$deleteList + ")");
                SleepViewModel sleepViewModelAccess$getMViewModel = SleepAnimalAllRecordsFragment.access$getMViewModel(this.this$0);
                List<SleepAnimalReport> list = this.$deleteList;
                this.label = 1;
                if (sleepViewModelAccess$getMViewModel.deleteSleepAnimal(list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SleepAnimalAllRecordsFragment() {
        super(jui.r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SleepViewModel access$getMViewModel(SleepAnimalAllRecordsFragment sleepAnimalAllRecordsFragment) {
        return (SleepViewModel) sleepAnimalAllRecordsFragment.getMViewModel();
    }

    private final void initActionBar() {
        setTitleBackground(iji.T2);
        setActionBarNormalTitleMode();
        setTitle(c0j.Wf);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setDisplayOptions(8);
            k5g.i(requireContext(), miuiActionBar, pni.U1, getString(c0j.f4795b), new View.OnClickListener() { // from class: ufm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepAnimalAllRecordsFragment.initActionBar$lambda$6$lambda$3(this.f35717a, view);
                }
            });
            k5g.h(requireContext(), miuiActionBar, eri.l8, pni.L1, getString(c0j.G7), new View.OnClickListener() { // from class: vfm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepAnimalAllRecordsFragment.initActionBar$lambda$6$lambda$5(this.f36851a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initActionBar$lambda$6$lambda$3(SleepAnimalAllRecordsFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initActionBar$lambda$6$lambda$5(SleepAnimalAllRecordsFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter = this$0.sleepAllRecordAdapter;
        SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter2 = null;
        if (sleepAnimalAllRecordsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            sleepAnimalAllRecordsAdapter = null;
        }
        if (!sleepAnimalAllRecordsAdapter.getEditMode()) {
            this$0.refreshWhenEditModeChanged(true);
            return;
        }
        SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter3 = this$0.sleepAllRecordAdapter;
        if (sleepAnimalAllRecordsAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            sleepAnimalAllRecordsAdapter3 = null;
        }
        SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter4 = this$0.sleepAllRecordAdapter;
        if (sleepAnimalAllRecordsAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            sleepAnimalAllRecordsAdapter4 = null;
        }
        sleepAnimalAllRecordsAdapter3.setAllSelected(true ^ sleepAnimalAllRecordsAdapter4.isAllSelected());
        wc0 miuiActionBar = this$0.getMiuiActionBar();
        if (miuiActionBar != null) {
            SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter5 = this$0.sleepAllRecordAdapter;
            if (sleepAnimalAllRecordsAdapter5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            } else {
                sleepAnimalAllRecordsAdapter2 = sleepAnimalAllRecordsAdapter5;
            }
            if (sleepAnimalAllRecordsAdapter2.isAllSelected()) {
                View endView = miuiActionBar.getEndView();
                if (endView != null) {
                    endView.setContentDescription(this$0.getString(c0j.Jc));
                }
                View endView2 = miuiActionBar.getEndView();
                if (endView2 != null) {
                    endView2.sendAccessibilityEvent(16384);
                    return;
                }
                return;
            }
            View endView3 = miuiActionBar.getEndView();
            if (endView3 != null) {
                endView3.setContentDescription(this$0.getString(c0j.Ta));
            }
            View endView4 = miuiActionBar.getEndView();
            if (endView4 != null) {
                endView4.sendAccessibilityEvent(16384);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SleepAnimalAllRecordsFragment this$0, TextView tvNoData, CombinedLoadStates it) {
        View endView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tvNoData, "$tvNoData");
        Intrinsics.checkNotNullParameter(it, "it");
        SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter = this$0.sleepAllRecordAdapter;
        MoreRecyclerView moreRecyclerView = null;
        if (sleepAnimalAllRecordsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            sleepAnimalAllRecordsAdapter = null;
        }
        boolean z = sleepAnimalAllRecordsAdapter.getItemCount() == 0;
        MoreRecyclerView moreRecyclerView2 = this$0.recyclerView;
        if (moreRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        } else {
            moreRecyclerView = moreRecyclerView2;
        }
        ViewExtKt.setVisible(moreRecyclerView, !z);
        ViewExtKt.setVisible(tvNoData, z);
        wc0 miuiActionBar = this$0.getMiuiActionBar();
        if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
            ViewExtKt.setVisible(endView, !z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(Ref.IntRef count, SleepAnimalAllRecordsFragment this$0, PagingData pagingData) {
        Intrinsics.checkNotNullParameter(count, "$count");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = count.element + 1;
        count.element = i;
        Logger.i(TAG, "queryAllSleepAnimalLiveData count=" + i);
        SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter = this$0.sleepAllRecordAdapter;
        if (sleepAnimalAllRecordsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            sleepAnimalAllRecordsAdapter = null;
        }
        Lifecycle lifecycle = this$0.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNull(pagingData);
        sleepAnimalAllRecordsAdapter.submitData(lifecycle, pagingData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(SleepAnimalAllRecordsFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDeleteDialog();
    }

    private final void refreshWhenEditModeChanged(boolean editMode) {
        SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter = this.sleepAllRecordAdapter;
        TextView textView = null;
        if (sleepAnimalAllRecordsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            sleepAnimalAllRecordsAdapter = null;
        }
        sleepAnimalAllRecordsAdapter.setEditMode(editMode);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            if (editMode) {
                miuiActionBar.setTitle("");
                setStartViewRes(pni.J1, getString(c0j.common_exit));
                View endView = miuiActionBar.getEndView();
                if (endView != null) {
                    endView.setBackgroundResource(pni.V1);
                }
                View endView2 = miuiActionBar.getEndView();
                if (endView2 != null) {
                    endView2.announceForAccessibility(getString(c0j.pb));
                }
                SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter2 = this.sleepAllRecordAdapter;
                if (sleepAnimalAllRecordsAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
                    sleepAnimalAllRecordsAdapter2 = null;
                }
                if (sleepAnimalAllRecordsAdapter2.isAllSelected()) {
                    View endView3 = miuiActionBar.getEndView();
                    if (endView3 != null) {
                        endView3.setContentDescription(getString(c0j.Jc));
                    }
                    View endView4 = miuiActionBar.getEndView();
                    if (endView4 != null) {
                        endView4.sendAccessibilityEvent(16384);
                    }
                } else {
                    View endView5 = miuiActionBar.getEndView();
                    if (endView5 != null) {
                        endView5.setContentDescription(getString(c0j.Ta));
                    }
                    View endView6 = miuiActionBar.getEndView();
                    if (endView6 != null) {
                        endView6.sendAccessibilityEvent(16384);
                    }
                }
            } else {
                miuiActionBar.setTitle(c0j.Wf);
                setStartViewRes(pni.U1, getString(c0j.f4795b));
                View endView7 = miuiActionBar.getEndView();
                if (endView7 != null) {
                    endView7.setBackgroundResource(pni.L1);
                }
                View endView8 = miuiActionBar.getEndView();
                if (endView8 != null) {
                    endView8.setContentDescription(getString(c0j.G7));
                }
            }
        }
        TextView textView2 = this.deleteView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deleteView");
        } else {
            textView = textView2;
        }
        textView.setVisibility(8);
    }

    private final void showDeleteDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("delete_check").setDialogTitle(c0j.ve).setDialogDescription(c0j.ni).setNegativeText(c0j.D7).setPositiveText(c0j.G7).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.setRequestCode(0);
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter = this.sleepAllRecordAdapter;
        if (sleepAnimalAllRecordsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            sleepAnimalAllRecordsAdapter = null;
        }
        if (sleepAnimalAllRecordsAdapter.getEditMode()) {
            refreshWhenEditModeChanged(false);
            return true;
        }
        finish();
        return true;
    }

    @Override // com.xiaomi.fitness.health.sleep.ui.adapter.SleepAnimalAllRecordsAdapter.OnItemClickListener
    public void onClick(@NotNull SleepAnimalReport sleepAnimal) {
        Intrinsics.checkNotNullParameter(sleepAnimal, "sleepAnimal");
        AnyExtKt.main$default(null, new AnonymousClass1(sleepAnimal, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    @Override // com.xiaomi.fitness.health.sleep.ui.adapter.SleepAnimalAllRecordsAdapter.OnItemClickListener
    public void onDeleteSelectedItemUpdate() {
        boolean z;
        SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter = this.sleepAllRecordAdapter;
        TextView textView = null;
        if (sleepAnimalAllRecordsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            sleepAnimalAllRecordsAdapter = null;
        }
        if (sleepAnimalAllRecordsAdapter.getEditMode()) {
            SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter2 = this.sleepAllRecordAdapter;
            if (sleepAnimalAllRecordsAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
                sleepAnimalAllRecordsAdapter2 = null;
            }
            z = sleepAnimalAllRecordsAdapter2.getSelectDeleteList().isEmpty() ^ true;
        }
        TextView textView2 = this.deleteView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deleteView");
        } else {
            textView = textView2;
        }
        ViewExtKt.setVisible(textView, z);
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) throws InterruptedException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 0 && resultCode == -1) {
            SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter = this.sleepAllRecordAdapter;
            SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter2 = null;
            if (sleepAnimalAllRecordsAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
                sleepAnimalAllRecordsAdapter = null;
            }
            List<SleepAnimalReport> selectDeleteList = sleepAnimalAllRecordsAdapter.getSelectDeleteList();
            if (selectDeleteList.isEmpty()) {
                return;
            }
            BuildersKt__BuildersKt.runBlocking$default(null, new C25231(selectDeleteList, this, null), 1, null);
            SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter3 = this.sleepAllRecordAdapter;
            if (sleepAnimalAllRecordsAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            } else {
                sleepAnimalAllRecordsAdapter2 = sleepAnimalAllRecordsAdapter3;
            }
            sleepAnimalAllRecordsAdapter2.refresh();
            refreshWhenEditModeChanged(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initActionBar();
        this.deleteView = (TextView) view.findViewById(eri.Ek);
        View viewFindViewById = view.findViewById(eri.Ol);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final TextView textView = (TextView) viewFindViewById;
        this.recyclerView = (MoreRecyclerView) view.findViewById(eri.pd);
        SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter = new SleepAnimalAllRecordsAdapter();
        this.sleepAllRecordAdapter = sleepAnimalAllRecordsAdapter;
        sleepAnimalAllRecordsAdapter.setOnItemClickListener(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        MoreRecyclerView moreRecyclerView = this.recyclerView;
        TextView textView2 = null;
        if (moreRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            moreRecyclerView = null;
        }
        moreRecyclerView.setLayoutManager(linearLayoutManager);
        MoreRecyclerView moreRecyclerView2 = this.recyclerView;
        if (moreRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            moreRecyclerView2 = null;
        }
        SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter2 = this.sleepAllRecordAdapter;
        if (sleepAnimalAllRecordsAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            sleepAnimalAllRecordsAdapter2 = null;
        }
        moreRecyclerView2.setAdapter(sleepAnimalAllRecordsAdapter2);
        MoreRecyclerView moreRecyclerView3 = this.recyclerView;
        if (moreRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            moreRecyclerView3 = null;
        }
        moreRecyclerView3.setEnableMore(false);
        SleepAnimalAllRecordsAdapter sleepAnimalAllRecordsAdapter3 = this.sleepAllRecordAdapter;
        if (sleepAnimalAllRecordsAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAllRecordAdapter");
            sleepAnimalAllRecordsAdapter3 = null;
        }
        sleepAnimalAllRecordsAdapter3.addLoadStateListener(new Function1() { // from class: wfm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepAnimalAllRecordsFragment.onViewCreated$lambda$0(this.f37924a, textView, (CombinedLoadStates) obj);
            }
        });
        final Ref.IntRef intRef = new Ref.IntRef();
        ((SleepViewModel) getMViewModel()).queryAllSleepAnimalLiveData().observe(getViewLifecycleOwner(), new SleepAnimalAllRecordsFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xfm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepAnimalAllRecordsFragment.onViewCreated$lambda$1(intRef, this, (PagingData) obj);
            }
        }));
        TextView textView3 = this.deleteView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deleteView");
        } else {
            textView2 = textView3;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: yfm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SleepAnimalAllRecordsFragment.onViewCreated$lambda$2(this.f40136a, view2);
            }
        });
    }
}
