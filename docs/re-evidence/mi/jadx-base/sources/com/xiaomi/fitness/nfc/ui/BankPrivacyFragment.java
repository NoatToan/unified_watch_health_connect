package com.xiaomi.fitness.nfc.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.protocol.OpenPDFProtocolFragment;
import com.xiaomi.fitness.nfc.ui.BankPrivacyFragment;
import com.xiaomi.fitness.nfc.ui.issued.BankCardDetailViewModel;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.dng;
import defpackage.o0j;
import defpackage.sui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/BankPrivacyFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/BankCardDetailViewModel;", "Ldng;", "", "phoneNum", "", "callPhone", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "", "isNeedCardInfo", "()Z", "bindView", "(Ldng;)V", "privacyUrl", "Ljava/lang/String;", "serviceUrl", BankPrivacyFragment.sCustomerServicePhoneNumber, BankPrivacyFragment.sCustomerServiceUrl, "<init>", "()V", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BankPrivacyFragment extends BaseCardFragment<BankCardDetailViewModel, dng> {

    @NotNull
    public static final String sCustomerServicePhoneNumber = "customerServicePhoneNumber";

    @NotNull
    public static final String sCustomerServiceUrl = "customerServiceUrl";

    @NotNull
    public static final String sPrivicyUrl = "sPrivicyUrl";

    @NotNull
    public static final String sServiceUrl = "sServiceUrl";

    @Nullable
    private String customerServicePhoneNumber;

    @Nullable
    private String customerServiceUrl;

    @Nullable
    private String privacyUrl;

    @Nullable
    private String serviceUrl;

    public BankPrivacyFragment() {
        super(sui.t, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(BankPrivacyFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = this$0.privacyUrl;
        if (str == null || !StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "pdf", false, 2, (Object) null)) {
            String str2 = this$0.privacyUrl;
            Intrinsics.checkNotNull(str2);
            WebViewUtilKt.startWebView$default(str2, this$0.getString(o0j.q0), false, false, null, false, null, false, 252, null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(OpenPDFProtocolFragment.PROTOCOL_URL, this$0.privacyUrl);
            this$0.gotoPage(OpenPDFProtocolFragment.class, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(BankPrivacyFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = this$0.serviceUrl;
        if (str == null || !StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "pdf", false, 2, (Object) null)) {
            String str2 = this$0.serviceUrl;
            Intrinsics.checkNotNull(str2);
            WebViewUtilKt.startWebView$default(str2, this$0.getString(o0j.F5), false, false, null, false, null, false, 252, null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(OpenPDFProtocolFragment.PROTOCOL_URL, this$0.serviceUrl);
            this$0.gotoPage(OpenPDFProtocolFragment.class, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(BankPrivacyFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = this$0.customerServiceUrl;
        if (str == null || !StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "pdf", false, 2, (Object) null)) {
            String str2 = this$0.customerServiceUrl;
            Intrinsics.checkNotNull(str2);
            WebViewUtilKt.startWebView$default(str2, "", false, false, null, false, null, false, 252, null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(OpenPDFProtocolFragment.PROTOCOL_URL, this$0.customerServiceUrl);
            this$0.gotoPage(OpenPDFProtocolFragment.class, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$3(BankPrivacyFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.callPhone(this$0.customerServicePhoneNumber);
    }

    private final void callPhone(String phoneNum) {
        Intent intent = new Intent("android.intent.action.DIAL");
        Uri uri = Uri.parse("tel:" + phoneNum);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        intent.setData(uri);
        startActivity(intent);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull dng dngVar) {
        Intrinsics.checkNotNullParameter(dngVar, "<this>");
        setTitle(o0j.w0);
        if (TextUtils.isEmpty(this.customerServicePhoneNumber)) {
            dngVar.A.setVisibility(8);
        } else {
            dngVar.A.setText(this.customerServicePhoneNumber);
            dngVar.A.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.customerServiceUrl)) {
            dngVar.B.setVisibility(8);
        } else {
            dngVar.B.setText(this.customerServiceUrl);
            dngVar.B.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.privacyUrl)) {
            dngVar.C.setVisibility(8);
        }
        if (TextUtils.isEmpty(this.serviceUrl)) {
            dngVar.D.setVisibility(8);
        }
        dngVar.A.getPaint().setFlags(8);
        dngVar.B.getPaint().setFlags(8);
        dngVar.C.setOnClickListener(new View.OnClickListener() { // from class: b02
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BankPrivacyFragment.bindView$lambda$0(this.f3631a, view);
            }
        });
        dngVar.D.setOnClickListener(new View.OnClickListener() { // from class: c02
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BankPrivacyFragment.bindView$lambda$1(this.f4768a, view);
            }
        });
        dngVar.B.setOnClickListener(new View.OnClickListener() { // from class: d02
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BankPrivacyFragment.bindView$lambda$2(this.f14911a, view);
            }
        });
        dngVar.A.setOnClickListener(new View.OnClickListener() { // from class: e02
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BankPrivacyFragment.bindView$lambda$3(this.f16110a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        this.privacyUrl = args != null ? args.getString(sPrivicyUrl) : null;
        this.serviceUrl = args != null ? args.getString(sServiceUrl) : null;
        this.customerServicePhoneNumber = args != null ? args.getString(sCustomerServicePhoneNumber) : null;
        this.customerServiceUrl = args != null ? args.getString(sCustomerServiceUrl) : null;
    }
}
