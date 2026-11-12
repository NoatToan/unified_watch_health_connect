package com.xiaomi.fitness.nfc.ui.issued;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.size.Scale;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.yoyo.CommandRequest;
import com.xiaomi.fitness.nfc.ui.issued.YoYoPreIssueFragment;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import defpackage.o0j;
import defpackage.sui;
import defpackage.tqg;
import defpackage.wni;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/YoYoPreIssueFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/YoYoCardViewModel;", "Ltqg;", "", "isNeedCardInfo", "()Z", "Landroid/os/Bundle;", "args", "", "setArguments", "(Landroid/os/Bundle;)V", "bindView", "(Ltqg;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "cardFace", "Ljava/lang/String;", "<init>", "()V", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nYoYoPreIssueFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YoYoPreIssueFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/YoYoPreIssueFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,95:1\n54#2,3:96\n24#2:99\n59#2,6:100\n*S KotlinDebug\n*F\n+ 1 YoYoPreIssueFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/YoYoPreIssueFragment\n*L\n54#1:96,3\n54#1:99\n54#1:100,6\n*E\n"})
public final class YoYoPreIssueFragment extends BaseCardFragment<YoYoCardViewModel, tqg> {

    @NotNull
    public static final String sCardFace = "sCardFace";
    public static final int sRequestCodeIssue = 10;

    @NotNull
    private String cardFace;

    public YoYoPreIssueFragment() {
        super(sui.p0, 0, true);
        this.cardFace = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(tqg this_bindView, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        this_bindView.D.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$5(final YoYoPreIssueFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading();
        ((YoYoCardViewModel) this$0.getMViewModel()).createNewCard(new Function1() { // from class: g0s
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return YoYoPreIssueFragment.bindView$lambda$5$lambda$3(this.f18441a, (CommandRequest) obj);
            }
        }, new Function1() { // from class: h0s
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return YoYoPreIssueFragment.bindView$lambda$5$lambda$4(this.f19553a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5$lambda$3(YoYoPreIssueFragment this$0, CommandRequest commandRequest) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(commandRequest, "commandRequest");
        this$0.dismissDialogForce();
        Bundle bundle = new Bundle();
        bundle.putParcelable(YoYoIssueFragment.sCommandRequest, commandRequest);
        bundle.putString(sCardFace, this$0.cardFace);
        this$0.gotoPageForResult(YoYoIssueFragment.class, bundle, 10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5$lambda$4(YoYoPreIssueFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.dismissDialogForce();
        ToastUtil.showShortToast(msg);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final tqg tqgVar) {
        Intrinsics.checkNotNullParameter(tqgVar, "<this>");
        setTitle(o0j.E7);
        ImageView cardFaceView = tqgVar.B;
        Intrinsics.checkNotNullExpressionValue(cardFaceView, "cardFaceView");
        String yoYoCardFace = NfcUtils.getYoYoCardFace(this.cardFace);
        ImageLoader imageLoader = Coil.imageLoader(cardFaceView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(cardFaceView.getContext()).data(yoYoCardFace).target(cardFaceView);
        builderTarget.scale(Scale.FILL);
        builderTarget.placeholder(wni.n);
        imageLoader.enqueue(builderTarget.build());
        String string = getResources().getString(o0j.F7, "https://www.easycard.com.tw/term");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        tqgVar.F.setText(com.xiaomi.fitness.nfc.hyperlink.a.b(string));
        tqgVar.F.setMovementMethod(LinkMovementMethod.getInstance());
        tqgVar.A.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: e0s
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                YoYoPreIssueFragment.bindView$lambda$2(tqgVar, compoundButton, z);
            }
        });
        tqgVar.D.setOnClickListener(new View.OnClickListener() { // from class: f0s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YoYoPreIssueFragment.bindView$lambda$5(this.f17274a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10 && resultCode == -1) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                mActivity.setResult(-1);
            }
            finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            String string = args.getString(sCardFace);
            Intrinsics.checkNotNull(string);
            this.cardFace = string;
        }
    }
}
