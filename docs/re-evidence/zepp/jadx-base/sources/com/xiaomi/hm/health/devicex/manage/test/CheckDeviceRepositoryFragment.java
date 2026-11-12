package com.xiaomi.hm.health.devicex.manage.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceRepositoryWrapper;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.amazfit_watch.DownloadAmazfitActivity;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import com.xiaomi.hm.health.devicex.manage.test.CheckDeviceRepositoryFragment;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0002J&\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010$\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/devicex/manage/test/CheckDeviceRepositoryFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "Landroid/widget/LinearLayout;", "content", "", "f", "h", "", "lineText", "b", "i", "parent", "Landroid/widget/TextView;", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "a", "Landroid/widget/TextView;", "contentText", "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "Lkotlin/Lazy;", "e", "()Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "repositoryApi", "Lcom/huami/devicex/manager/DeviceRepositoryWrapper;", GoogleApiAvailabilityLight.a, "()Lcom/huami/devicex/manager/DeviceRepositoryWrapper;", "deviceRepositoryWrapper", "Lcom/huami/devicex/manager/DeviceRepositoryWrapper;", "wrapper", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CheckDeviceRepositoryFragment extends Fragment implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private TextView contentText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy repositoryApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceRepositoryWrapper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final DeviceRepositoryWrapper wrapper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.devicex.manage.test.CheckDeviceRepositoryFragment$appendDisplay$1", f = "CheckDeviceRepositoryFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CheckDeviceRepositoryFragment.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TextView textView = CheckDeviceRepositoryFragment.this.contentText;
            if (textView != null) {
                textView.append(this.c + " \n");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.devicex.manage.test.CheckDeviceRepositoryFragment$testListAllDeviceInMine$1", f = "CheckDeviceRepositoryFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CheckDeviceRepositoryFragment.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StringBuffer stringBuffer = new StringBuffer();
            List<Device> listFindAll = CheckDeviceRepositoryFragment.this.e().findAll();
            stringBuffer.append("------ repositoryApi.findAll() ----\n");
            for (Device device : listFindAll) {
                stringBuffer.append(device.getDevice_id() + "@" + device.getDevice_address() + AESEncryptionHelper.SEPARATOR + device.getDisplayName() + "|bind : " + device.getDevice_bind_status() + "|active : " + device.getActiveStatus() + " \n");
            }
            stringBuffer.append("------ repositoryApi.findAll() ----\n");
            CheckDeviceRepositoryFragment.this.b(stringBuffer.toString());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.devicex.manage.test.CheckDeviceRepositoryFragment$testListDeviceInOrder$1", f = "CheckDeviceRepositoryFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CheckDeviceRepositoryFragment.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<Device> deviceListOrdered = CheckDeviceRepositoryFragment.this.d().getDeviceListOrdered();
            List<Device> deviceListOrdered2 = CheckDeviceRepositoryFragment.this.wrapper.getDeviceListOrdered();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("dList 1 ==> " + deviceListOrdered.size() + " \n");
            for (Device device : deviceListOrdered) {
                stringBuffer.append(device.getDevice_id() + " - " + device.getDevice_address() + " \n");
            }
            stringBuffer.append("dList 2 ==> " + deviceListOrdered2.size() + " \n");
            for (Device device2 : deviceListOrdered2) {
                stringBuffer.append(device2.getDevice_id() + " - " + device2.getDevice_address() + " \n");
            }
            CheckDeviceRepositoryFragment.this.b(stringBuffer.toString());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckDeviceRepositoryFragment() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.repositoryApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceRepositoryApi>() { // from class: com.xiaomi.hm.health.devicex.manage.test.CheckDeviceRepositoryFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceRepositoryApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceRepositoryApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceRepositoryWrapper = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceRepositoryWrapper>() { // from class: com.xiaomi.hm.health.devicex.manage.test.CheckDeviceRepositoryFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceRepositoryWrapper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceRepositoryWrapper getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceRepositoryWrapper.class), objArr2, objArr3);
            }
        });
        this.wrapper = new DeviceRepositoryWrapper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String lineText) {
        e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new a(lineText, null), 2, null);
    }

    private final TextView c(LinearLayout parent) {
        TextView textView = new TextView(parent.getContext());
        parent.addView(textView, new ViewGroup.LayoutParams(-1, -1));
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceRepositoryWrapper d() {
        return (DeviceRepositoryWrapper) this.deviceRepositoryWrapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceRepositoryApi e() {
        return (DeviceRepositoryApi) this.repositoryApi.getValue();
    }

    private final void f(LinearLayout content) {
        AppCompatButton appCompatButton = new AppCompatButton(requireContext());
        appCompatButton.setText("打开测试Amazfit下载");
        appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: bo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckDeviceRepositoryFragment.g(this.a, view);
            }
        });
        content.addView(appCompatButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(CheckDeviceRepositoryFragment checkDeviceRepositoryFragment, View view) {
        checkDeviceRepositoryFragment.startActivity(new Intent(checkDeviceRepositoryFragment.requireContext(), (Class<?>) DownloadAmazfitActivity.class));
    }

    private final void h() {
        e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new b(null), 2, null);
    }

    private final void i() {
        e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new c(null), 2, null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ScrollView scrollView = new ScrollView(inflater.getContext());
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(inflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        scrollView.addView(linearLayout);
        this.contentText = c(linearLayout);
        f(linearLayout);
        return scrollView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = this.contentText;
        if (textView != null) {
            textView.setPadding(0, textView.getResources().getDimensionPixelOffset(R.dimen.action_bar_h), 0, 0);
            textView.setTextColor(-16777216);
            textView.append("start test : ===> \n");
        }
        h();
        i();
    }
}
