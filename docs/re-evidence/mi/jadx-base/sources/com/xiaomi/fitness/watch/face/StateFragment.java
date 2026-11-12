package com.xiaomi.fitness.watch.face;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.watch.face.StateFragment;
import com.xiaomi.fitness.watch.face.viewmodel.StateViewModel;
import com.xiaomi.fitness.watch.face.widget.StateLayout;
import defpackage.isi;
import defpackage.ld8;
import defpackage.orf;
import defpackage.pdg;
import defpackage.uno;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\u0004\b\u0001\u0010\u00032\u00020\u00042\b\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b/\u0010\u000eJ3\u0010\u000b\u001a\u00020\n2\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00028\u0000H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\n2\b\b\u0001\u0010\u0019\u001a\u00028\u0001H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010\u000eJ\u000f\u0010!\u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010&R\u001b\u0010\u0017\u001a\u00028\u00008DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0018R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/watch/face/StateFragment;", "Lcom/xiaomi/fitness/watch/face/viewmodel/StateViewModel;", "VM", "DATA", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Lpdg;", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "liveData", "action", "", "handleData", "(Landroidx/lifecycle/LiveData;Lpdg;)V", "onLoading", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewModel", "()Lcom/xiaomi/fitness/watch/face/viewmodel/StateViewModel;", PluginDeviceInfo.FICONOFF, "onDataOk", "(Ljava/lang/Object;)V", "", "code", "onError", "(I)V", "onNoNet", "onEmpty", "call", "Lorf;", "message", "onDataEvent", "(Lorf;)V", "event", "onMessageEvent", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "Lcom/xiaomi/fitness/watch/face/widget/StateLayout;", "mStateView", "Lcom/xiaomi/fitness/watch/face/widget/StateLayout;", "<init>", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class StateFragment<VM extends StateViewModel<DATA>, DATA> extends BaseFragment implements pdg<DATA> {

    @JvmField
    @Nullable
    protected StateLayout mStateView;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    public StateFragment() {
        super(0, 1, null);
        this.viewModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jco
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StateFragment.viewModel_delegate$lambda$0(this.f22650a);
            }
        });
    }

    private final void handleData(LiveData<StateData<DATA>> liveData, final pdg<DATA> action) {
        if (liveData != null) {
            liveData.observe(this, new Observer() { // from class: ico
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    StateFragment.handleData$lambda$1(this.f21003a, action, (StateData) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleData$lambda$1(StateFragment this$0, pdg action, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(action, "$action");
        if (stateData == null || stateData.h()) {
            this$0.onError(stateData != null ? stateData.c : -11);
            return;
        }
        if (stateData.i()) {
            this$0.onLoading();
        } else if (stateData.g()) {
            this$0.onEmpty();
        } else if (stateData.k()) {
            action.call(stateData.f11668a);
        }
    }

    private final void onLoading() {
        StateLayout stateLayout = this.mStateView;
        if (stateLayout != null) {
            StateLayout.showLoading$default(stateLayout, 0, null, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateViewModel viewModel_delegate$lambda$0(StateFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.viewModel();
    }

    @Override // defpackage.pdg
    public void call(DATA d) {
        StateLayout stateLayout = this.mStateView;
        if (stateLayout != null) {
            stateLayout.showContent();
        }
        onDataOk(d);
    }

    @NotNull
    public final VM getViewModel() {
        return (VM) this.viewModel.getValue();
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        handleData(getViewModel().liveData, this);
        if (ld8.c().j(this)) {
            return;
        }
        ld8.c().p(this);
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onDataEvent(@NotNull orf message) {
        Intrinsics.checkNotNullParameter(message, "message");
        onMessageEvent(message);
    }

    public abstract void onDataOk(@NotNull DATA d);

    public void onEmpty() {
        StateLayout stateLayout = this.mStateView;
        if (stateLayout != null) {
            StateLayout.showEmpty$default(stateLayout, 0, null, 0, 7, null);
        }
    }

    public void onError(int code) {
        Logger.d(BaseFragment.TAG, "onError: code = " + code);
        StateLayout stateLayout = this.mStateView;
        if (stateLayout != null) {
            if (code == 22223) {
                onNoNet();
            } else {
                StateLayout.showError$default(stateLayout, null, 1, null);
            }
        }
    }

    public void onMessageEvent(@NotNull orf event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    public void onNoNet() {
        StateLayout stateLayout = this.mStateView;
        if (stateLayout != null) {
            StateLayout.showNoNet$default(stateLayout, null, 1, null);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.mStateView = (StateLayout) view.findViewById(isi.h2);
        super.onViewCreated(view, savedInstanceState);
    }

    @NotNull
    public abstract VM viewModel();
}
