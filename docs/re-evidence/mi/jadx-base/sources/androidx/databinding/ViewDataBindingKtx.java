package androidx.databinding;

import androidx.annotation.RestrictTo;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.entity.CardInfo;
import defpackage.h45;
import defpackage.k5h;
import defpackage.r6r;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/databinding/ViewDataBindingKtx;", "", "Landroidx/databinding/ViewDataBinding;", "viewDataBinding", "", "localFieldId", "Lkotlinx/coroutines/flow/Flow;", "observable", "", "updateStateFlowRegistration", "(Landroidx/databinding/ViewDataBinding;ILkotlinx/coroutines/flow/Flow;)Z", "Lh45;", "CREATE_STATE_FLOW_LISTENER", "Lh45;", "<init>", "()V", "StateFlowListener", "databindingKtx_release"}, k = 1, mv = {1, 9, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ViewDataBindingKtx {

    @NotNull
    public static final ViewDataBindingKtx INSTANCE = new ViewDataBindingKtx();

    @NotNull
    private static final h45 CREATE_STATE_FLOW_LISTENER = new h45() { // from class: osq
        @Override // defpackage.h45
        public final r6r a(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            return ViewDataBindingKtx.CREATE_STATE_FLOW_LISTENER$lambda$0(viewDataBinding, i, referenceQueue);
        }
    };

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B'\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0 ¢\u0006\u0004\b\"\u0010#J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\u00072\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00072\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006$"}, d2 = {"Landroidx/databinding/ViewDataBindingKtx$StateFlowListener;", "Lk5h;", "Lkotlinx/coroutines/flow/Flow;", "", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, "flow", "", "startCollection", "(Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/flow/Flow;)V", "Lr6r;", "getListener", "()Lr6r;", "target", "addListener", "(Lkotlinx/coroutines/flow/Flow;)V", "removeListener", "lifecycleOwner", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Ljava/lang/ref/WeakReference;", "_lifecycleOwnerRef", "Ljava/lang/ref/WeakReference;", "Lkotlinx/coroutines/Job;", "observerJob", "Lkotlinx/coroutines/Job;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lr6r;", "Landroidx/databinding/ViewDataBinding;", "binder", "", "localFieldId", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "<init>", "(Landroidx/databinding/ViewDataBinding;ILjava/lang/ref/ReferenceQueue;)V", "databindingKtx_release"}, k = 1, mv = {1, 9, 0})
    public static final class StateFlowListener implements k5h<Flow<? extends Object>> {

        @Nullable
        private WeakReference<LifecycleOwner> _lifecycleOwnerRef;

        @NotNull
        private final r6r<Flow<Object>> listener;

        @Nullable
        private Job observerJob;

        public StateFlowListener(@Nullable ViewDataBinding viewDataBinding, int i, @NotNull ReferenceQueue<ViewDataBinding> referenceQueue) {
            Intrinsics.checkNotNullParameter(referenceQueue, "referenceQueue");
            this.listener = new r6r<>(viewDataBinding, i, this, referenceQueue);
        }

        private final void startCollection(LifecycleOwner owner, Flow<? extends Object> flow) {
            Job job = this.observerJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.observerJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(owner), null, null, new ViewDataBindingKtx$StateFlowListener$startCollection$1(owner, flow, this, null), 3, null);
        }

        @NotNull
        public r6r<Flow<Object>> getListener() {
            return this.listener;
        }

        @Override // defpackage.k5h
        public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            if ((weakReference != null ? weakReference.get() : null) == lifecycleOwner) {
                return;
            }
            Job job = this.observerJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            if (lifecycleOwner == null) {
                this._lifecycleOwnerRef = null;
                return;
            }
            this._lifecycleOwnerRef = new WeakReference<>(lifecycleOwner);
            Flow<? extends Object> flow = (Flow) this.listener.b();
            if (flow != null) {
                startCollection(lifecycleOwner, flow);
            }
        }

        @Override // defpackage.k5h
        public void addListener(@Nullable Flow<? extends Object> target) {
            LifecycleOwner lifecycleOwner;
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            if (weakReference == null || (lifecycleOwner = weakReference.get()) == null || target == null) {
                return;
            }
            startCollection(lifecycleOwner, target);
        }

        @Override // defpackage.k5h
        public void removeListener(@Nullable Flow<? extends Object> target) {
            Job job = this.observerJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.observerJob = null;
        }
    }

    private ViewDataBindingKtx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r6r CREATE_STATE_FLOW_LISTENER$lambda$0(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
        Intrinsics.checkNotNull(referenceQueue);
        return new StateFlowListener(viewDataBinding, i, referenceQueue).getListener();
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean updateStateFlowRegistration(@NotNull ViewDataBinding viewDataBinding, int localFieldId, @Nullable Flow<?> observable) {
        Intrinsics.checkNotNullParameter(viewDataBinding, "viewDataBinding");
        viewDataBinding.p = true;
        try {
            return viewDataBinding.z0(localFieldId, observable, CREATE_STATE_FLOW_LISTENER);
        } finally {
            viewDataBinding.p = false;
        }
    }
}
