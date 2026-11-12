package com.huami.third.wechat.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.third.wechat.ExtensionKt;
import com.huami.third.wechat.ui.WeChatBindFragment;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0007¢\u0006\u0004\b3\u00104J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0003J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J/\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010.R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00101¨\u00066"}, d2 = {"Lcom/huami/third/wechat/ui/WeChatBindFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "initView", DTransferConstants.SEARCH_KEY, "o", z.j, "m", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/huami/third/wechat/ui/WeChatBindViewModel;", "a", "Lkotlin/Lazy;", "h", "()Lcom/huami/third/wechat/ui/WeChatBindViewModel;", "weChatBindViewModel", "Lcom/huami/third/wechat/ui/WeChatParams;", "b", "g", "()Lcom/huami/third/wechat/ui/WeChatParams;", "params", "c", "Landroid/view/View;", "supportWatchView", GoogleApiAvailabilityLight.a, "saveQRView", "Landroid/widget/Button;", "e", "Landroid/widget/Button;", "doQRBtn", "f", "otherWayBtn", "Ljava/lang/String;", "qrCodeContent", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "qrBitmap", "<init>", "()V", "Companion", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public class WeChatBindFragment extends Fragment implements KoinComponent {
    private static final int i = 1000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy weChatBindViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy params;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private View supportWatchView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private View saveQRView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Button doQRBtn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Button otherWayBtn;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private String qrCodeContent;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Bitmap qrBitmap;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ViewModelProvider.Factory> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return WeChatBindVMFactory.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeChatBindFragment() {
        super(R.layout.fragment_bind_wechat);
        a aVar = a.a;
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.huami.third.wechat.ui.WeChatBindFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Fragment getA() {
                return this;
            }
        };
        this.weChatBindViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(WeChatBindViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.third.wechat.ui.WeChatBindFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) function0.getA()).getViewModelStore();
            }
        }, aVar);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.params = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<WeChatParams>() { // from class: com.huami.third.wechat.ui.WeChatBindFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.third.wechat.ui.WeChatParams, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WeChatParams getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(WeChatParams.class), qualifier, objArr);
            }
        });
    }

    private final WeChatParams g() {
        return (WeChatParams) this.params.getValue();
    }

    private final WeChatBindViewModel h() {
        return (WeChatBindViewModel) this.weChatBindViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(View view, WeChatBindFragment weChatBindFragment, View view2) {
        FragmentActivity activity;
        if (androidx.p010navigation.View.findNavController(view).navigateUp() || (activity = weChatBindFragment.getActivity()) == null) {
            return;
        }
        activity.onBackPressed();
    }

    private final void initView(final View view) {
        ((RainbowTitleBar) view.findViewById(R.id.title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: en8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WeChatBindFragment.i(view, this, view2);
            }
        });
        this.supportWatchView = view.findViewById(R.id.view_send_qr);
        this.saveQRView = view.findViewById(R.id.view_save_qr);
        this.doQRBtn = (Button) view.findViewById(R.id.btn_do_qr);
        this.otherWayBtn = (Button) view.findViewById(R.id.btn_other_way);
        if (g().getSupportWatch()) {
            q();
        } else {
            o();
        }
    }

    @ExperimentalCoroutinesApi
    private final void j() {
        h().loadQR(getResources().getDimensionPixelSize(R.dimen.qr_size));
        h().getQrContentLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: jn8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeChatBindFragment.l(this.a, (String) obj);
            }
        });
        h().getQrBitmapLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: in8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeChatBindFragment.k(this.a, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(WeChatBindFragment weChatBindFragment, Bitmap bitmap) {
        View view;
        ImageView imageView;
        weChatBindFragment.qrBitmap = bitmap;
        if (bitmap == null || (view = weChatBindFragment.getView()) == null || (imageView = (ImageView) view.findViewById(R.id.img_qr)) == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(WeChatBindFragment weChatBindFragment, String str) {
        weChatBindFragment.qrCodeContent = str;
    }

    private final void m() {
        requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 1000);
    }

    private final void n() {
        Bitmap bitmap = this.qrBitmap;
        if (bitmap != null && ExtensionKt.saveQR(bitmap, requireContext())) {
            Toast.makeText(requireContext(), R.string.save_qr_success, 0).show();
        }
    }

    private final void o() {
        View view = this.supportWatchView;
        Objects.requireNonNull(view);
        if (view.getVisibility() == 0) {
            View view2 = this.supportWatchView;
            Objects.requireNonNull(view2);
            view2.setVisibility(8);
        }
        Button button = this.otherWayBtn;
        Objects.requireNonNull(button);
        if (button.getVisibility() == 0) {
            Button button2 = this.otherWayBtn;
            Objects.requireNonNull(button2);
            button2.setVisibility(8);
        }
        View view3 = this.saveQRView;
        Objects.requireNonNull(view3);
        view3.setVisibility(0);
        Button button3 = this.doQRBtn;
        Objects.requireNonNull(button3);
        button3.setText(getResources().getString(R.string.save_qr));
        button3.setOnClickListener(new View.OnClickListener() { // from class: gn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                WeChatBindFragment.p(this.a, view4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(WeChatBindFragment weChatBindFragment, View view) {
        if (ContextCompat.checkSelfPermission(weChatBindFragment.requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            weChatBindFragment.n();
        } else {
            weChatBindFragment.m();
        }
    }

    private final void q() {
        View view = this.supportWatchView;
        Objects.requireNonNull(view);
        view.setVisibility(0);
        Button button = this.doQRBtn;
        Objects.requireNonNull(button);
        button.setText(getResources().getString(R.string.btn_watch_qr));
        button.setOnClickListener(new View.OnClickListener() { // from class: fn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WeChatBindFragment.r(this.a, view2);
            }
        });
        Button button2 = this.otherWayBtn;
        Objects.requireNonNull(button2);
        button2.setVisibility(0);
        button2.setOnClickListener(new View.OnClickListener() { // from class: hn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WeChatBindFragment.s(this.a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(WeChatBindFragment weChatBindFragment, View view) {
        String str = weChatBindFragment.qrCodeContent;
        if (str == null) {
            return;
        }
        weChatBindFragment.g().getSendQRToWatchFunc().invoke(weChatBindFragment.requireActivity(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(WeChatBindFragment weChatBindFragment, View view) {
        weChatBindFragment.o();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.Fragment, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1000) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                n();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        j();
        initView(view);
    }
}
