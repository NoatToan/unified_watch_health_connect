package com.huami.wallet.ui.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.Protocol;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.activity.ShiftCardActivity;
import com.huami.wallet.ui.fragment.ShiftOutTipsFragment;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.utils.ImageLoadUtils;
import com.huami.wallet.ui.utils.KTViewExtensionKt;
import com.huami.wallet.ui.viewmodel.ShiftOutTipsCardViewModel;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u000212B\u0007¢\u0006\u0004\b/\u00100J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0016\u0010*\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010'R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010'R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010-¨\u00063"}, d2 = {"Lcom/huami/wallet/ui/fragment/ShiftOutTipsFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/wallet/lib/entity/Protocol;", "it", "", z.j, "Landroid/widget/TextView;", "textView", "", "mLink", "f", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/wallet/ui/viewmodel/ShiftOutTipsCardViewModel;", "b", "Lkotlin/Lazy;", "i", "()Lcom/huami/wallet/ui/viewmodel/ShiftOutTipsCardViewModel;", "shiftOutTipsCardViewModel", "Lcom/huami/wallet/ui/navigation/NavigationController;", "c", "h", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "navigationController", "Lcom/huami/wallet/lib/api/WalletDataSource;", GoogleApiAvailabilityLight.a, "g", "()Lcom/huami/wallet/lib/api/WalletDataSource;", ParamKey.dataSource, "e", "Ljava/lang/String;", "cardImgUrl", "appCode", "cardName", "xiaoMiCardName", "", "Z", "isForMi", "<init>", "()V", "Companion", "ShiftLinkSpan", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ShiftOutTipsFragment extends BaseFragment {

    @NotNull
    public static final String ARG_APPCODE = "EXTRA_EXPAND_CARD_ID";

    @NotNull
    public static final String ARG_IMG_URL = "EXTRA_EXPAND_CARD_IMG_URL";

    @NotNull
    public static final String TAG = "ShiftOutTipsFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy shiftOutTipsCardViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private String cardImgUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private String appCode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private String cardName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private String xiaoMiCardName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isForMi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/wallet/ui/fragment/ShiftOutTipsFragment$ShiftLinkSpan;", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "Landroid/text/TextPaint;", "ds", "updateDrawState", "<init>", "(Lcom/huami/wallet/ui/fragment/ShiftOutTipsFragment;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public final class ShiftLinkSpan extends ClickableSpan {
        public ShiftLinkSpan() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View widget) {
            Protocol protocol;
            Resource<Protocol> value = ShiftOutTipsFragment.this.i().getShiftProtocolLiveData().getValue();
            String content = (value == null || (protocol = value.data) == null) ? null : protocol.getContent();
            Resource<Protocol> value2 = ShiftOutTipsFragment.this.i().getShiftProtocolLiveData().getValue();
            if ((value2 == null ? null : value2.data) != null) {
                if (content == null || content.length() == 0) {
                    return;
                }
                ShiftOutTipsFragment.this.h().navigateToWeb(content, null);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds) {
            ds.setUnderlineText(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable View view) {
            if (!ShiftOutTipsFragment.this.isForMi) {
                ShiftOutTipsFragment.this.i().agreeShiftProtocol(ShiftOutTipsFragment.this.appCode);
                return;
            }
            ShiftOutTipsFragment.this.h().closePreviousPages();
            ShiftOutTipsFragment.this.h().finishCurrentPage(ShiftOutTipsFragment.this.getActivity());
            ShiftOutTipsFragment.this.h().navigateToShift(ShiftOutTipsFragment.this.getActivity(), ShiftOutTipsFragment.this.appCode, ShiftOutTipsFragment.this.cardName, ShiftOutTipsFragment.this.xiaoMiCardName, false, "", ShiftOutTipsFragment.this.cardImgUrl, Boolean.FALSE, "", null, null, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShiftOutTipsFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.shiftOutTipsCardViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ShiftOutTipsCardViewModel>() { // from class: com.huami.wallet.ui.fragment.ShiftOutTipsFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.viewmodel.ShiftOutTipsCardViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ShiftOutTipsCardViewModel invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(ShiftOutTipsCardViewModel.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.ShiftOutTipsFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.dataSource = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WalletDataSource>() { // from class: com.huami.wallet.ui.fragment.ShiftOutTipsFragment$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.lib.api.WalletDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WalletDataSource invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), objArr4, objArr5);
            }
        });
        this.cardImgUrl = "";
        this.appCode = "";
        this.cardName = "";
        this.xiaoMiCardName = "";
    }

    private final void f(TextView textView, String mLink) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 12298);
        sb.append((Object) mLink);
        sb.append((char) 12299);
        String string = sb.toString();
        SpannableString spannableString = new SpannableString(((Object) textView.getText()) + "  " + string);
        int length = textView.getText().length() + 2;
        spannableString.setSpan(new ShiftLinkSpan(), length, string.length() + length, 33);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.s15)), length, string.length() + length, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final WalletDataSource g() {
        return (WalletDataSource) this.dataSource.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController h() {
        return (NavigationController) this.navigationController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShiftOutTipsCardViewModel i() {
        return (ShiftOutTipsCardViewModel) this.shiftOutTipsCardViewModel.getValue();
    }

    private final void j(Resource<Protocol> it2) {
        if (it2 == null) {
            return;
        }
        if (it2.status == Status.SUCCESS && it2.data != null) {
            View view = getView();
            ((CheckBox) (view == null ? null : view.findViewById(R.id.wl_agreement_checkbox))).setVisibility(0);
            View view2 = getView();
            ((TextView) (view2 == null ? null : view2.findViewById(R.id.wl_shift_out_agree))).setVisibility(0);
            View view3 = getView();
            TextView textView = (TextView) (view3 == null ? null : view3.findViewById(R.id.wl_shift_out_agree));
            Protocol protocol = it2.data;
            f(textView, protocol == null ? null : protocol.getTitle());
        }
        if (it2.isCompleted() && it2.data == null) {
            View view4 = getView();
            ((Button) (view4 != null ? view4.findViewById(R.id.wl_bt_shift_out) : null)).setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ShiftOutTipsFragment shiftOutTipsFragment, Resource resource) {
        shiftOutTipsFragment.j(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(ShiftOutTipsFragment shiftOutTipsFragment, CompoundButton compoundButton, boolean z) {
        View view = shiftOutTipsFragment.getView();
        ((Button) (view == null ? null : view.findViewById(R.id.wl_bt_shift_out))).setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(ShiftOutTipsFragment shiftOutTipsFragment, Resource resource) {
        if (resource != null && resource.isCompleted()) {
            shiftOutTipsFragment.h().closePreviousPages();
            shiftOutTipsFragment.h().finishCurrentPage(shiftOutTipsFragment.getActivity());
            shiftOutTipsFragment.h().navigateToShift(shiftOutTipsFragment.getActivity(), shiftOutTipsFragment.appCode, shiftOutTipsFragment.cardName, shiftOutTipsFragment.xiaoMiCardName, false, null, shiftOutTipsFragment.cardImgUrl, Boolean.FALSE, "", null, null, null, null);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        this.appCode = arguments == null ? null : arguments.getString("EXTRA_EXPAND_CARD_ID");
        Bundle arguments2 = getArguments();
        this.cardImgUrl = arguments2 == null ? null : arguments2.getString("EXTRA_EXPAND_CARD_IMG_URL");
        Bundle arguments3 = getArguments();
        this.cardName = arguments3 == null ? null : arguments3.getString(ShiftCardActivity.EXTRA_BUS_CARD_NAME);
        Bundle arguments4 = getArguments();
        this.xiaoMiCardName = arguments4 != null ? arguments4.getString(ShiftCardActivity.EXTRA_XIAO_MI_CARD_NAME) : null;
        this.isForMi = g().isForMi();
        return inflater.inflate(R.layout.wl_shift_out_tips_fragment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View view2 = getView();
        ImageLoadUtils.loadImage((ImageView) (view2 == null ? null : view2.findViewById(R.id.wl_card_image_detail)), this.cardImgUrl);
        i().getShiftProtocolLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: vt6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ShiftOutTipsFragment.k(this.a, (Resource) obj);
            }
        });
        View view3 = getView();
        ((CheckBox) (view3 == null ? null : view3.findViewById(R.id.wl_agreement_checkbox))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ut6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ShiftOutTipsFragment.l(this.a, compoundButton, z);
            }
        });
        View view4 = getView();
        KTViewExtensionKt.singleClick(view4 == null ? null : view4.findViewById(R.id.wl_bt_shift_out), new a());
        i().getAgreeShiftProtocolLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: wt6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ShiftOutTipsFragment.m(this.a, (Resource) obj);
            }
        });
        if (!this.isForMi) {
            i().getShiftProtocol(this.appCode);
            return;
        }
        View view5 = getView();
        ((Button) (view5 == null ? null : view5.findViewById(R.id.wl_bt_shift_out))).setEnabled(true);
        View view6 = getView();
        ((LinearLayout) (view6 != null ? view6.findViewById(R.id.ll_agree) : null)).setVisibility(8);
    }
}
