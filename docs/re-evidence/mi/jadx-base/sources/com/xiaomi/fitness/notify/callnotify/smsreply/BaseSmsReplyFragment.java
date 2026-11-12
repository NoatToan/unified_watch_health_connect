package com.xiaomi.fitness.notify.callnotify.smsreply;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyFragment;
import com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel;
import com.xiaomi.fitness.notify.extension.ExtUtilsKt;
import defpackage.fzg;
import defpackage.q0j;
import defpackage.tui;
import defpackage.wc0;
import defpackage.xni;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003:\u00018B\u0007¢\u0006\u0004\b7\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0007J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0014¢\u0006\u0004\b$\u0010\u0007J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H$¢\u0006\u0004\b%\u0010\u0013R\"\u0010'\u001a\u00020&8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R%\u00104\u001a\f0/R\b\u0012\u0004\u0012\u00028\u00000\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0016\u00105\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/smsreply/BaseSmsReplyFragment;", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/BaseSmsReplyViewModel;", "VM", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lfzg;", "", "finishByNoData", "()V", "onEndImageClick", "onStartImageClick", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/DisplayMode;", "mode", "changeEditMode", "(Lcom/xiaomi/fitness/notify/callnotify/smsreply/DisplayMode;)V", "hideKeyboard", "onAddBtnClicked", "", "position", "onItemDeleteIconClicked", "(I)V", "deleteItem", "Landroid/view/View;", "anchor", "showPopupMenu", "(Landroid/view/View;I)V", "msg", "showNoticeDialog", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "doDeleteSms", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter;", "mAdapter", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter;", "getMAdapter", "()Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter;", "setMAdapter", "(Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter;)V", "deletePosition", "I", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/BaseSmsReplyFragment$SmsTouchCallback;", "mItemTouchCallback$delegate", "Lkotlin/Lazy;", "getMItemTouchCallback", "()Lcom/xiaomi/fitness/notify/callnotify/smsreply/BaseSmsReplyFragment$SmsTouchCallback;", "mItemTouchCallback", "mDisplayMode", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/DisplayMode;", "<init>", "SmsTouchCallback", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BaseSmsReplyFragment<VM extends BaseSmsReplyViewModel> extends BaseBindingFragment<VM, fzg> {
    private int deletePosition;
    protected SmsAdapter mAdapter;

    @NotNull
    private DisplayMode mDisplayMode;

    /* JADX INFO: renamed from: mItemTouchCallback$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mItemTouchCallback;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/smsreply/BaseSmsReplyFragment$SmsTouchCallback;", "Landroidx/recyclerview/widget/l$h;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "target", "", "onMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$d0;)Z", "", "clearView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;)V", "isLongPressDragEnabled", "()Z", "", "direction", "onSwiped", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "<init>", "(Lcom/xiaomi/fitness/notify/callnotify/smsreply/BaseSmsReplyFragment;)V", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SmsTouchCallback extends l.h {
        public SmsTouchCallback() {
            super(3, 0);
        }

        @Override // androidx.recyclerview.widget.l.e
        public void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.d0 viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            super.clearView(recyclerView, viewHolder);
            BaseSmsReplyFragment.this.getMAdapter().notifyDataAllChanged();
        }

        @Override // androidx.recyclerview.widget.l.e
        public boolean isLongPressDragEnabled() {
            return false;
        }

        @Override // androidx.recyclerview.widget.l.e
        public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.d0 viewHolder, @NotNull RecyclerView.d0 target) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            Intrinsics.checkNotNullParameter(target, "target");
            int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
            int bindingAdapterPosition2 = target.getBindingAdapterPosition();
            Collections.swap(BaseSmsReplyFragment.this.getMAdapter().getDataList(), bindingAdapterPosition, bindingAdapterPosition2);
            if (recyclerView.isComputingLayout()) {
                return true;
            }
            BaseSmsReplyFragment.this.getMAdapter().notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.l.e
        public void onSwiped(@NotNull RecyclerView.d0 viewHolder, int direction) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplayMode.values().length];
            try {
                iArr[DisplayMode.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplayMode.DELETE_OR_SORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BaseSmsReplyFragment() {
        super(tui.d);
        this.deletePosition = -1;
        this.mItemTouchCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cc2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseSmsReplyFragment.mItemTouchCallback_delegate$lambda$0(this.f5176a);
            }
        });
        this.mDisplayMode = DisplayMode.NORMAL;
    }

    private final void changeEditMode(DisplayMode mode) {
        this.mDisplayMode = mode;
        if (WhenMappings.$EnumSwitchMapping$0[mode.ordinal()] == 1) {
            hideKeyboard();
            wc0 miuiActionBar = getMiuiActionBar();
            if (miuiActionBar != null) {
                View endView = miuiActionBar.getEndView();
                if (endView != null) {
                    endView.setVisibility(8);
                }
                View startView = miuiActionBar.getStartView();
                if (startView != null) {
                    startView.setBackgroundResource(xni.f39283b);
                }
                miuiActionBar.getStartView().setContentDescription(getString(q0j.f30959a));
            }
            getMBinding().B.setVisibility(0);
        } else {
            wc0 miuiActionBar2 = getMiuiActionBar();
            if (miuiActionBar2 != null) {
                View startView2 = miuiActionBar2.getStartView();
                if (startView2 != null) {
                    startView2.setBackgroundResource(xni.f39282a);
                }
                miuiActionBar2.getStartView().setContentDescription(getString(q0j.f30960b));
                View endView2 = miuiActionBar2.getEndView();
                if (endView2 != null) {
                    endView2.setVisibility(0);
                }
                View endView3 = miuiActionBar2.getEndView();
                if (endView3 != null) {
                    endView3.setBackgroundResource(xni.c);
                }
            }
            getMBinding().B.setVisibility(8);
        }
        getMAdapter().changeEditMode(this.mDisplayMode);
    }

    private final void deleteItem(int position) {
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, q0j.common_deleting);
        }
        this.deletePosition = position;
        Logger.i(BaseFragment.TAG, "SMS delete position = " + position);
        doDeleteSms(position);
    }

    private final void finishByNoData() {
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, q0j.o);
        }
        finish();
    }

    private final BaseSmsReplyFragment<VM>.SmsTouchCallback getMItemTouchCallback() {
        return (SmsTouchCallback) this.mItemTouchCallback.getValue();
    }

    private final void hideKeyboard() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Object systemService = fragmentActivityRequireActivity.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(fragmentActivityRequireActivity.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SmsTouchCallback mItemTouchCallback_delegate$lambda$0(BaseSmsReplyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new SmsTouchCallback();
    }

    private final void onAddBtnClicked() {
        if (getMAdapter().getDataSize() >= getMViewModel().getMaxSmsCount()) {
            showNoticeDialog(q0j.c0);
        } else {
            changeEditMode(DisplayMode.CREATE);
            getMAdapter().createItem(new SmsAdapter.Sms(""));
        }
    }

    private final void onEndImageClick() {
        if (getMViewModel().getIsSyncing()) {
            return;
        }
        getMAdapter().finishEdit(new Function0() { // from class: ec2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseSmsReplyFragment.onEndImageClick$lambda$15(this.f16477a);
            }
        });
        if (!getMAdapter().isDataChanged()) {
            Logger.i("onRightImageClick data not changed", new Object[0]);
            return;
        }
        getMViewModel().setSyncing(true);
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, q0j.f30962r);
        }
        getMViewModel().syncSmsList(getMAdapter().getDataList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEndImageClick$lambda$15(BaseSmsReplyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showNoticeDialog(q0j.d0);
        return Unit.INSTANCE;
    }

    private final void onItemDeleteIconClicked(int position) {
        if (getMAdapter().getDataSize() <= getMViewModel().getMinSmsCount()) {
            showNoticeDialog(q0j.d0);
            return;
        }
        Logger.i(BaseFragment.TAG, "onItemDeleteIconClicked Mode = " + this.mDisplayMode);
        int i = WhenMappings.$EnumSwitchMapping$0[this.mDisplayMode.ordinal()];
        if (i == 1) {
            getMAdapter().deleteItem(position, new Function0() { // from class: zb2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseSmsReplyFragment.onItemDeleteIconClicked$lambda$18(this.f41090a);
                }
            });
            getMViewModel().syncSmsList(getMAdapter().getDataList());
        } else {
            if (i != 2) {
                return;
            }
            getMAdapter().deleteItem(position, new Function0() { // from class: ac2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseSmsReplyFragment.onItemDeleteIconClicked$lambda$19(this.f870a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemDeleteIconClicked$lambda$18(BaseSmsReplyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showNoticeDialog(q0j.d0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemDeleteIconClicked$lambda$19(BaseSmsReplyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showNoticeDialog(q0j.d0);
        return Unit.INSTANCE;
    }

    private final void onStartImageClick() {
        if (WhenMappings.$EnumSwitchMapping$0[this.mDisplayMode.ordinal()] != 1) {
            getMAdapter().cancelEdit();
            changeEditMode(DisplayMode.NORMAL);
        } else {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                mActivity.lambda$onCreate$0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$10(final BaseSmsReplyFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (bool != null) {
            if (bool.booleanValue()) {
                FragmentActivity mActivity = this$0.getMActivity();
                if (mActivity != null) {
                    ToastExtKt.toastShort(mActivity, q0j.common_delete_success);
                }
                int i = this$0.deletePosition;
                if (i > 0 && i < this$0.getMAdapter().getDataSize()) {
                    this$0.getMAdapter().deleteItem(this$0.deletePosition, new Function0() { // from class: dc2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BaseSmsReplyFragment.setListener$lambda$10$lambda$9$lambda$8(this.f15361a);
                        }
                    });
                }
            } else {
                FragmentActivity mActivity2 = this$0.getMActivity();
                if (mActivity2 != null) {
                    ToastExtKt.toastShort(mActivity2, q0j.common_delete_failure);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$10$lambda$9$lambda$8(BaseSmsReplyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showNoticeDialog(q0j.d0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$11(BaseSmsReplyFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.changeEditMode(DisplayMode.DELETE_OR_SORT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$12(BaseSmsReplyFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onAddBtnClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$13(BaseSmsReplyFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onItemDeleteIconClicked(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$14(BaseSmsReplyFragment this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        this$0.showPopupMenu(view, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$2(BaseSmsReplyFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onStartImageClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$3(BaseSmsReplyFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onEndImageClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$5(BaseSmsReplyFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (list != null) {
            this$0.getMAdapter().setDataList(list);
        } else {
            this$0.finishByNoData();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$7(BaseSmsReplyFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((BaseSmsReplyViewModel) this$0.getMViewModel()).setSyncing(false);
        this$0.hideLoading();
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (this$0.mDisplayMode == DisplayMode.NORMAL) {
                FragmentActivity mActivity = this$0.getMActivity();
                if (mActivity != null) {
                    ToastExtKt.toastShort(mActivity, zBooleanValue ? q0j.common_delete_success : q0j.common_delete_failure);
                }
            } else {
                FragmentActivity mActivity2 = this$0.getMActivity();
                if (mActivity2 != null) {
                    ToastExtKt.toastShort(mActivity2, zBooleanValue ? q0j.q : q0j.p);
                }
            }
        }
        this$0.changeEditMode(DisplayMode.NORMAL);
        return Unit.INSTANCE;
    }

    private final void showNoticeDialog(int msg) {
        new CommonDialog.c("notice").setDialogDescription(msg).setPositiveText(q0j.d).create().showIfNeed(getParentFragmentManager());
    }

    private final void showPopupMenu(View anchor, final int position) {
        if (this.mDisplayMode == DisplayMode.NORMAL) {
            int dp2px = ExtUtilsKt.getDp2px(-10.0f);
            SmsReplyPopupMenu.Companion companion = SmsReplyPopupMenu.INSTANCE;
            Context activity = getActivity();
            if (activity == null) {
                activity = requireContext();
            }
            Intrinsics.checkNotNull(activity);
            companion.create(activity).setOnItemClickListener(new Function1() { // from class: ub2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseSmsReplyFragment.showPopupMenu$lambda$20(this.f35584a, position, (View) obj);
                }
            }, new Function1() { // from class: bc2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseSmsReplyFragment.showPopupMenu$lambda$21(this.f4046a, position, (View) obj);
                }
            }).show(anchor, dp2px, 0, 8388613);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPopupMenu$lambda$20(BaseSmsReplyFragment this$0, int i, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.changeEditMode(DisplayMode.UPDATE);
        this$0.getMAdapter().editItem(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPopupMenu$lambda$21(BaseSmsReplyFragment this$0, int i, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onItemDeleteIconClicked(i);
        return Unit.INSTANCE;
    }

    public abstract void doDeleteSms(int position);

    @NotNull
    public final SmsAdapter getMAdapter() {
        SmsAdapter smsAdapter = this.mAdapter;
        if (smsAdapter != null) {
            return smsAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Window window;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(18);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        View endView;
        View startView;
        Intrinsics.checkNotNullParameter(view, "view");
        l lVar = new l(getMItemTouchCallback());
        lVar.d(getMBinding().D);
        setMAdapter(new SmsAdapter(lVar));
        super.onViewCreated(view, savedInstanceState);
        setTitle(q0j.f30961k);
        getMBinding().D.setLayoutManager(new LinearLayoutManager(requireContext()));
        getMBinding().D.setAdapter(getMAdapter());
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null && (startView = miuiActionBar.getStartView()) != null) {
            startView.setContentDescription(getString(q0j.f30959a));
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 != null && (endView = miuiActionBar2.getEndView()) != null) {
            endView.setVisibility(8);
        }
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        getMViewModel().loadDeviceSmsList();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        Bundle bundle = new Bundle();
        bundle.putInt("cancel_btn_res_id", xni.f39283b);
        bundle.putInt("save_btn_res_id", xni.c);
        IActionBar.DefaultImpls.applyEditModeActionBar$default(this, bundle, new Function1() { // from class: fc2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseSmsReplyFragment.setListener$lambda$2(this.f17641a, (View) obj);
            }
        }, new Function1() { // from class: gc2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseSmsReplyFragment.setListener$lambda$3(this.f18821a, (View) obj);
            }
        }, null, null, 24, null);
        getMViewModel().getSmsList().observe(getViewLifecycleOwner(), new BaseSmsReplyFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hc2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseSmsReplyFragment.setListener$lambda$5(this.f19923a, (List) obj);
            }
        }));
        getMViewModel().getSyncState().observe(getViewLifecycleOwner(), new BaseSmsReplyFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ic2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseSmsReplyFragment.setListener$lambda$7(this.f20990a, (Boolean) obj);
            }
        }));
        getMViewModel().getDeleteState().observe(getViewLifecycleOwner(), new BaseSmsReplyFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jc2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseSmsReplyFragment.setListener$lambda$10(this.f22640a, (Boolean) obj);
            }
        }));
        getMBinding().C.setOnClickListener(new View.OnClickListener() { // from class: vb2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSmsReplyFragment.setListener$lambda$11(this.f36691a, view);
            }
        });
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: wb2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSmsReplyFragment.setListener$lambda$12(this.f37793a, view);
            }
        });
        getMAdapter().setOnItemDeleteListener(new Function1() { // from class: xb2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseSmsReplyFragment.setListener$lambda$13(this.f38933a, ((Integer) obj).intValue());
            }
        });
        getMAdapter().setOnItemLongClickListener(new Function2() { // from class: yb2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BaseSmsReplyFragment.setListener$lambda$14(this.f40005a, ((Integer) obj).intValue(), (View) obj2);
            }
        });
    }

    public final void setMAdapter(@NotNull SmsAdapter smsAdapter) {
        Intrinsics.checkNotNullParameter(smsAdapter, "<set-?>");
        this.mAdapter = smsAdapter;
    }
}
