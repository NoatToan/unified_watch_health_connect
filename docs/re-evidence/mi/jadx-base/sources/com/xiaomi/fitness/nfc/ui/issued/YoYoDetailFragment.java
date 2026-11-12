package com.xiaomi.fitness.nfc.ui.issued;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoBean;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoBeanKt;
import com.xiaomi.fitness.nfc.ui.issued.YoYoDetailFragment;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.ltg;
import defpackage.o0j;
import defpackage.o63;
import defpackage.pqg;
import defpackage.rji;
import defpackage.sui;
import defpackage.yl3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/YoYoDetailFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/YoYoCardViewModel;", "Lpqg;", "", "loadCardDetail", "()V", "bindView", "(Lpqg;)V", "", "faceNo", "Ljava/lang/String;", "<init>", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class YoYoDetailFragment extends BaseCardFragment<YoYoCardViewModel, pqg> {

    @NotNull
    private String faceNo;

    public YoYoDetailFragment() {
        super(sui.n0, 0, true);
        this.faceNo = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(YoYoDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object systemService = this$0.requireActivity().getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, this$0.faceNo));
        ToastUtil.showLongToast(o0j.N2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$3(final YoYoDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading(o0j.Z2, false);
        ((YoYoCardViewModel) this$0.getMViewModel()).removeCard(new Function0() { // from class: uzr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return YoYoDetailFragment.bindView$lambda$3$lambda$1(this.f36332a);
            }
        }, new Function1() { // from class: vzr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return YoYoDetailFragment.bindView$lambda$3$lambda$2(this.f37403a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3$lambda$1(YoYoDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastUtil.showShortToast(o0j.i3);
        this$0.dismissDialogForce();
        o63.b(new yl3(false));
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3$lambda$2(YoYoDetailFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        ToastUtil.showLongToast(msg);
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$5(YoYoDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://lihi.cc/hBdQO")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadCardDetail() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        ((YoYoCardViewModel) getMViewModel()).loadCard(new Function1() { // from class: a0s
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return YoYoDetailFragment.loadCardDetail$lambda$6(this.f495a, (CardInfoBean) obj);
            }
        }, new Function1() { // from class: b0s
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return YoYoDetailFragment.loadCardDetail$lambda$7(this.f3661a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit loadCardDetail$lambda$6(YoYoDetailFragment this$0, CardInfoBean cardInfoBean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cardInfoBean, "cardInfoBean");
        this$0.dismissDialogForce();
        ((pqg) this$0.getMBinding()).E.showUrl((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel(), NfcUtils.getYoYoCardFace(cardInfoBean.getCardLayout()));
        if (Intrinsics.areEqual(cardInfoBean.getCardStatus(), "00") || Intrinsics.areEqual(cardInfoBean.getCardStatus(), CardInfoBeanKt.sStatusDisableCard)) {
            this$0.faceNo = cardInfoBean.getFaceNo();
            ((pqg) this$0.getMBinding()).D.setText(this$0.faceNo);
            ltg.c().w(true);
            ((pqg) this$0.getMBinding()).B.setText(String.valueOf(cardInfoBean.getBalance()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadCardDetail$lambda$7(YoYoDetailFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialogForce();
        ToastUtil.showShortToast(this$0.getString(o0j.common_network_error_retry_later));
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull pqg pqgVar) {
        Intrinsics.checkNotNullParameter(pqgVar, "<this>");
        setTitle(o0j.E7);
        ((pqg) getMBinding()).H.show((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel());
        String string = getString(o0j.I7);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new UnderlineSpan(), 0, string.length(), 18);
        spannableString.setSpan(new ForegroundColorSpan(BaseFragmentExtKt.getColor(this, rji.f32614b)), 0, string.length(), 18);
        pqgVar.M.setText(spannableString);
        pqgVar.F.setOnClickListener(new View.OnClickListener() { // from class: wzr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YoYoDetailFragment.bindView$lambda$0(this.f38529a, view);
            }
        });
        loadCardDetail();
        pqgVar.N.setOnClickListener(new View.OnClickListener() { // from class: xzr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YoYoDetailFragment.bindView$lambda$3(this.f39629a, view);
            }
        });
        pqgVar.J.setOnClickListener(new View.OnClickListener() { // from class: yzr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewUtilKt.startWebView$default("https://www.easycard.com.tw/mobilecard?id=1717472520", null, false, false, null, false, null, false, 254, null);
            }
        });
        pqgVar.M.setOnClickListener(new View.OnClickListener() { // from class: zzr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YoYoDetailFragment.bindView$lambda$5(this.f41841a, view);
            }
        });
    }
}
