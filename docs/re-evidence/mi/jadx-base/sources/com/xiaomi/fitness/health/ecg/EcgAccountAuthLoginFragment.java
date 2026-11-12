package com.xiaomi.fitness.health.ecg;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.Target;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.health.ecg.EcgAccountAuthLoginFragment;
import com.xiaomi.fitness.health.ecg.data.EcgConstantsKt;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.c0j;
import defpackage.jui;
import defpackage.kub;
import defpackage.pni;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgAccountAuthLoginFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/ecg/EcgViewModel;", "Lkub;", "", "initView", "()V", "", "url", "loadAvatar", "(Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "ecgMedicalItemReport", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcgAccountAuthLoginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcgAccountAuthLoginFragment.kt\ncom/xiaomi/fitness/health/ecg/EcgAccountAuthLoginFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,71:1\n54#2,3:72\n24#2:75\n59#2,4:76\n63#2,2:89\n844#3,9:80\n*S KotlinDebug\n*F\n+ 1 EcgAccountAuthLoginFragment.kt\ncom/xiaomi/fitness/health/ecg/EcgAccountAuthLoginFragment\n*L\n59#1:72,3\n59#1:75\n59#1:76,4\n59#1:89,2\n61#1:80,9\n*E\n"})
public final class EcgAccountAuthLoginFragment extends Hilt_EcgAccountAuthLoginFragment<EcgViewModel, kub> {

    @Nullable
    private EcgMedicalItemReport ecgMedicalItemReport;

    public EcgAccountAuthLoginFragment() {
        super(jui.w3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((EcgViewModel) getMViewModel()).getAccountCoreInfo().observe(getViewLifecycleOwner(), new EcgAccountAuthLoginFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ia7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcgAccountAuthLoginFragment.initView$lambda$0(this.f20936a, (AccountCoreInfo) obj);
            }
        }));
        ((kub) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: ja7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgAccountAuthLoginFragment.initView$lambda$1(this.f22585a, view);
            }
        });
        ((kub) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: ka7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgAccountAuthLoginFragment.initView$lambda$2(this.f23653a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$0(EcgAccountAuthLoginFragment this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String userId = null;
        this$0.loadAvatar(accountCoreInfo != null ? accountCoreInfo.getAvatarAddress() : null);
        TextView textView = ((kub) this$0.getMBinding()).G;
        String nickName = accountCoreInfo != null ? accountCoreInfo.getNickName() : null;
        if (nickName == null || StringsKt__StringsKt.isBlank(nickName)) {
            if (accountCoreInfo != null) {
                userId = accountCoreInfo.getUserId();
            }
        } else if (accountCoreInfo != null) {
            userId = accountCoreInfo.getNickName();
        }
        textView.setText(userId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(EcgAccountAuthLoginFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putSerializable(EcgConstantsKt.PARAM_REPORT, this$0.ecgMedicalItemReport);
        BaseFragmentExKt.gotoPage(this$0, EcgAnalyzeServiceAuthFragment.class, bundle);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(EcgAccountAuthLoginFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadAvatar(String url) {
        final RoundImageView ivUserAvatar = ((kub) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(ivUserAvatar, "ivUserAvatar");
        if (TextUtils.isEmpty(url)) {
            ivUserAvatar.setImageResource(pni.K1);
            return;
        }
        ImageLoader imageLoader = Coil.imageLoader(ivUserAvatar.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(ivUserAvatar.getContext()).data(url).target(ivUserAvatar);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.health.ecg.EcgAccountAuthLoginFragment$loadAvatar$lambda$5$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
                ivUserAvatar.setImageResource(pni.K1);
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                Intrinsics.checkNotNull(result, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                ivUserAvatar.setImageBitmap(((BitmapDrawable) result).getBitmap());
            }
        });
        builderTarget.placeholder(pni.K1);
        imageLoader.enqueue(builderTarget.build());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        EcgMedicalItemReport ecgMedicalItemReport = (EcgMedicalItemReport) (arguments != null ? arguments.getSerializable(EcgConstantsKt.PARAM_REPORT) : null);
        this.ecgMedicalItemReport = ecgMedicalItemReport;
        if (ecgMedicalItemReport == null) {
            finish();
        } else {
            setTitle(c0j.oa);
            initView();
        }
    }
}
