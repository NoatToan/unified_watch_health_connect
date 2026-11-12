package com.xiaomi.hm.health.device.introduce;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResultCaller;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMAppSortActivity;
import com.xiaomi.hm.health.device.introduce.ChooseRestoreFragment;
import com.xiaomi.hm.health.device.introduce.recocver.DeviceConfigRestore;
import com.xiaomi.hm.health.device.introduce.recocver.PaiRestore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0004\u001a\u00020\u0003H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001c\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010!\u001a\u0004\u0018\u00010\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010(\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b#\u0010'¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/ChooseRestoreFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/xiaomi/hm/health/device/introduce/RestoreAdapterCallback;", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDetach", "", "checked", "onCheckChange", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "a", "Lkotlin/Lazy;", "getDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "b", "h", "()Z", "isBind", "Lcom/xiaomi/hm/health/device/introduce/RestoreChooseCallback;", "c", "e", "()Lcom/xiaomi/hm/health/device/introduce/RestoreChooseCallback;", "restoreChooseCallback", "Lcom/xiaomi/hm/health/device/introduce/ChooseRestoreAdapter;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/introduce/ChooseRestoreAdapter;", "adapter", "Landroid/os/Handler;", "()Landroid/os/Handler;", "handler", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ChooseRestoreFragment extends Fragment implements RestoreAdapterCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String f = "ChooseRestoreFragment";

    @NotNull
    private static final String g = "device_type";
    private static final long h = 60000;

    @NotNull
    private static final String i = "is_bind";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ChooseRestoreAdapter adapter;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSource = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy isBind = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy restoreChooseCallback = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy handler = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/ChooseRestoreFragment$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "isBind", "Lcom/xiaomi/hm/health/device/introduce/ChooseRestoreFragment;", "newInstance", "", "CHOOSE_DELAY", "J", "", HMAppSortActivity.KEY_DEVICE_SOURCE, "Ljava/lang/String;", "KEY_IS_BIND", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ChooseRestoreFragment newInstance(@NotNull HMDeviceSource source, boolean isBind) {
            ChooseRestoreFragment chooseRestoreFragment = new ChooseRestoreFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("device_type", source);
            bundle.putBoolean(ChooseRestoreFragment.i, isBind);
            Unit unit = Unit.INSTANCE;
            chooseRestoreFragment.setArguments(bundle);
            return chooseRestoreFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HMDeviceSource> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMDeviceSource invoke() {
            Bundle arguments = ChooseRestoreFragment.this.getArguments();
            Serializable serializable = arguments == null ? null : arguments.getSerializable("device_type");
            HMDeviceSource hMDeviceSource = serializable instanceof HMDeviceSource ? (HMDeviceSource) serializable : null;
            return hMDeviceSource == null ? HMDeviceSource.VDEVICE : hMDeviceSource;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/os/Handler;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Handler> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Boolean> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "getIsBind error: " + this.a;
            }
        }

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            Object objM3845constructorimpl;
            ChooseRestoreFragment chooseRestoreFragment = ChooseRestoreFragment.this;
            try {
                Result.Companion companion = Result.Companion;
                Bundle arguments = chooseRestoreFragment.getArguments();
                objM3845constructorimpl = Result.m3845constructorimpl(arguments == null ? null : Boolean.valueOf(arguments.getBoolean(ChooseRestoreFragment.i)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error$default(ChooseRestoreFragment.f, null, null, new a(thM3848exceptionOrNullimpl), 6, null);
            }
            Boolean bool = Boolean.FALSE;
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = bool;
            }
            Boolean bool2 = (Boolean) objM3845constructorimpl;
            if (bool2 == null) {
                return false;
            }
            return bool2.booleanValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/RestoreChooseCallback;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<RestoreChooseCallback> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RestoreChooseCallback invoke() {
            if (ChooseRestoreFragment.this.getActivity() instanceof RestoreChooseCallback) {
                KeyEventDispatcher.Component activity = ChooseRestoreFragment.this.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.xiaomi.hm.health.device.introduce.RestoreChooseCallback");
                return (RestoreChooseCallback) activity;
            }
            if (!(ChooseRestoreFragment.this.getParentFragment() instanceof RestoreChooseCallback)) {
                return null;
            }
            ActivityResultCaller parentFragment = ChooseRestoreFragment.this.getParentFragment();
            Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.xiaomi.hm.health.device.introduce.RestoreChooseCallback");
            return (RestoreChooseCallback) parentFragment;
        }
    }

    private final Handler d() {
        return (Handler) this.handler.getValue();
    }

    private final RestoreChooseCallback e() {
        return (RestoreChooseCallback) this.restoreChooseCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ChooseRestoreFragment chooseRestoreFragment, View view) {
        chooseRestoreFragment.d().removeCallbacksAndMessages(null);
        View view2 = chooseRestoreFragment.getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.choose_restore_not_tv))).setOnClickListener(null);
        RestoreChooseCallback restoreChooseCallbackE = chooseRestoreFragment.e();
        if (restoreChooseCallbackE == null) {
            return;
        }
        restoreChooseCallbackE.onEvent(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ChooseRestoreFragment chooseRestoreFragment, View view) {
        chooseRestoreFragment.d().removeCallbacksAndMessages(null);
        View view2 = chooseRestoreFragment.getView();
        ((Button) (view2 == null ? null : view2.findViewById(R.id.choose_restore_tv))).setOnClickListener(null);
        RestoreChooseCallback restoreChooseCallbackE = chooseRestoreFragment.e();
        if (restoreChooseCallbackE == null) {
            return;
        }
        ChooseRestoreAdapter chooseRestoreAdapter = chooseRestoreFragment.adapter;
        Objects.requireNonNull(chooseRestoreAdapter);
        restoreChooseCallbackE.onEvent(chooseRestoreAdapter.getData());
    }

    private final HMDeviceSource getDeviceSource() {
        return (HMDeviceSource) this.deviceSource.getValue();
    }

    private final boolean h() {
        return ((Boolean) this.isBind.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ChooseRestoreFragment chooseRestoreFragment) {
        RestoreChooseCallback restoreChooseCallbackE;
        if (chooseRestoreFragment.isDetached() || (restoreChooseCallbackE = chooseRestoreFragment.e()) == null) {
            return;
        }
        restoreChooseCallbackE.onEvent(null);
    }

    private final void initView() {
        View view = getView();
        ((RecyclerView) (view == null ? null : view.findViewById(R.id.restore_rv))).setLayoutManager(new LinearLayoutManager(getContext()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DeviceConfigRestore(getDeviceSource(), getActivity()));
        arrayList.add(new PaiRestore());
        View view2 = getView();
        View viewFindViewById = view2 == null ? null : view2.findViewById(R.id.restore_rv);
        ChooseRestoreAdapter chooseRestoreAdapter = new ChooseRestoreAdapter(arrayList, this, h());
        this.adapter = chooseRestoreAdapter;
        Unit unit = Unit.INSTANCE;
        ((RecyclerView) viewFindViewById).setAdapter(chooseRestoreAdapter);
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.choose_restore_not_tv))).setOnClickListener(new View.OnClickListener() { // from class: lo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                ChooseRestoreFragment.f(this.a, view4);
            }
        });
        View view4 = getView();
        ((Button) (view4 != null ? view4.findViewById(R.id.choose_restore_tv) : null)).setOnClickListener(new View.OnClickListener() { // from class: ko0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                ChooseRestoreFragment.g(this.a, view5);
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final ChooseRestoreFragment newInstance(@NotNull HMDeviceSource hMDeviceSource, boolean z) {
        return INSTANCE.newInstance(hMDeviceSource, z);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.device.introduce.RestoreAdapterCallback
    public void onCheckChange(boolean checked) {
        if (checked) {
            View view = getView();
            ((Button) (view != null ? view.findViewById(R.id.choose_restore_tv) : null)).setEnabled(true);
            return;
        }
        ChooseRestoreAdapter chooseRestoreAdapter = this.adapter;
        Objects.requireNonNull(chooseRestoreAdapter);
        List<RestoreItem> data = chooseRestoreAdapter.getData();
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (((RestoreItem) obj).getRestore()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            View view2 = getView();
            ((Button) (view2 != null ? view2.findViewById(R.id.choose_restore_tv) : null)).setEnabled(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_choose_restore, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        d().removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        initView();
        d().postDelayed(new Runnable() { // from class: mo0
            @Override // java.lang.Runnable
            public final void run() {
                ChooseRestoreFragment.i(this.a);
            }
        }, 60000L);
    }
}
