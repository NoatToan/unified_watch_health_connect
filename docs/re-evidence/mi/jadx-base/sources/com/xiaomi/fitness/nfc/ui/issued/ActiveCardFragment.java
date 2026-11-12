package com.xiaomi.fitness.nfc.ui.issued;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.gson.Gson;
import com.service.mi.BankCard;
import com.service.mi.entity.BaseResponse;
import com.service.mi.wallet.entity.AuthenticationMethod;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.entity.RequestOTPLimitEntry;
import com.xiaomi.fitness.nfc.exception.MasterCardExpiredException;
import com.xiaomi.fitness.nfc.issuer.CardActiveWay;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.ui.issued.ActiveCardFragment;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import defpackage.av6;
import defpackage.o0j;
import defpackage.rji;
import defpackage.rmg;
import defpackage.sui;
import defpackage.vqg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0007¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\nR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/ActiveCardFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/ActiviteCardViewModel;", "Lrmg;", "", "sendAuthorCode", "()V", "showGetCodeLimitDialog", "", "isNeedCardInfo", "()Z", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "bindView", "(Lrmg;)V", "finish", "onBackPressed", "", "methodId", "Ljava/lang/String;", "methodType", "methodValue", "cardFace", "bankName", "tailNo", "status", "", "mRequestCodeTimes", "I", "Lcom/service/mi/wallet/entity/AuthenticationMethod;", "authenticationMethod", "Lcom/service/mi/wallet/entity/AuthenticationMethod;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nActiveCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveCardFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/ActiveCardFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,287:1\n1863#2,2:288\n*S KotlinDebug\n*F\n+ 1 ActiveCardFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/ActiveCardFragment\n*L\n76#1:288,2\n*E\n"})
public final class ActiveCardFragment extends BaseCardFragment<ActiviteCardViewModel, rmg> {
    public static final int sCountTime = 60;

    @Nullable
    private AuthenticationMethod authenticationMethod;

    @Nullable
    private String bankName;

    @Nullable
    private String cardFace;
    private int mRequestCodeTimes;

    @Nullable
    private String methodId;

    @Nullable
    private String methodType;

    @Nullable
    private String methodValue;

    @Nullable
    private String status;

    @Nullable
    private String tailNo;

    public ActiveCardFragment() {
        super(sui.n, 0, true);
        this.mRequestCodeTimes = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(ActiveCardFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putBoolean("sIsMaster", true);
        this$0.gotoPage(CodeHelpFragment.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(ActiveCardFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showGetCodeLimitDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$7(rmg this_bindView, final ActiveCardFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String strValueOf = String.valueOf(this_bindView.D.getText());
        if (TextUtils.isEmpty(strValueOf)) {
            ToastUtil.showShortToast(o0j.B0);
            return;
        }
        PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 5, null);
        ActiviteCardViewModel activiteCardViewModel = (ActiviteCardViewModel) this$0.getMViewModel();
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        activiteCardViewModel.active(cardWrapper, strValueOf, this$0.methodType, new Function0() { // from class: ve0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActiveCardFragment.bindView$lambda$7$lambda$3(this.f36788a);
            }
        }, new Function1() { // from class: we0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActiveCardFragment.bindView$lambda$7$lambda$4(this.f37886a, (String) obj);
            }
        }, new Function1() { // from class: xe0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActiveCardFragment.bindView$lambda$7$lambda$6(this.f39037a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$7$lambda$3(ActiveCardFragment this$0) {
        BankCard bankCard;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastUtil.showShortToast(o0j.j);
        this$0.dismissDialog();
        Bundle bundle = new Bundle();
        ActiveCardResultFragment.Companion companion = ActiveCardResultFragment.INSTANCE;
        String sCardFace = companion.getSCardFace();
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        bundle.putString(sCardFace, cardWrapper.getCardFace());
        String sStatus = companion.getSStatus();
        CardWrapper cardWrapper2 = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper2);
        bundle.putString(sStatus, cardWrapper2.getStatus());
        String sTailNo = companion.getSTailNo();
        CardWrapper cardWrapper3 = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper3);
        bundle.putString(sTailNo, cardWrapper3.getBankEndNo());
        String sBankName = companion.getSBankName();
        CardWrapper cardWrapper4 = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper4);
        bundle.putString(sBankName, cardWrapper4.getBankName());
        String mCardType = companion.getMCardType();
        CardWrapper cardWrapper5 = this$0.getCardWrapper();
        Integer numValueOf = (cardWrapper5 == null || (bankCard = cardWrapper5.bankCard) == null) ? null : Integer.valueOf(bankCard.getCardType());
        Intrinsics.checkNotNull(numValueOf);
        bundle.putInt(mCardType, numValueOf.intValue());
        this$0.gotoPage(ActiveCardResultFragment.class, bundle);
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1);
        }
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$7$lambda$4(ActiveCardFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        ToastUtil.showShortToast(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$7$lambda$6(ActiveCardFragment this$0, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        if (it instanceof MasterCardExpiredException) {
            String message = it.getMessage();
            Intrinsics.checkNotNull(message);
            int i = o0j.l2;
            FragmentManager childFragmentManager = this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            UtilsKt.showMsgDialog((80 & 1) != 0 ? null : null, message, i, childFragmentManager, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: se0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ActiveCardFragment.bindView$lambda$7$lambda$6$lambda$5((DialogInterface) obj);
                }
            }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
        } else {
            ToastUtil.showShortToast(o0j.o4);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$7$lambda$6$lambda$5(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBackPressed$lambda$11(ActiveCardFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBackPressed$lambda$12(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void sendAuthorCode() {
        ActiviteCardViewModel activiteCardViewModel = (ActiviteCardViewModel) getMViewModel();
        TextView sendView = ((rmg) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(sendView, "sendView");
        activiteCardViewModel.timer(sendView);
        ActiviteCardViewModel activiteCardViewModel2 = (ActiviteCardViewModel) getMViewModel();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        activiteCardViewModel2.sendAuthorCode(cardWrapper, this.authenticationMethod, new Function1() { // from class: ye0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActiveCardFragment.sendAuthorCode$lambda$8(this.f40085a, (BaseResponse) obj);
            }
        }, new Function1() { // from class: ze0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActiveCardFragment.sendAuthorCode$lambda$10(this.f41174a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit sendAuthorCode$lambda$10(final ActiveCardFragment this$0, final Throwable exception) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (exception instanceof MasterCardExpiredException) {
            String message = exception.getMessage();
            Intrinsics.checkNotNull(message);
            int i = o0j.l2;
            FragmentManager childFragmentManager = this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            UtilsKt.showMsgDialog((80 & 1) != 0 ? null : null, message, i, childFragmentManager, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: ue0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ActiveCardFragment.sendAuthorCode$lambda$10$lambda$9(exception, this$0, (DialogInterface) obj);
                }
            }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
        } else {
            ((rmg) this$0.getMBinding()).H.setText(o0j.n7);
            ToastUtil.showShortToast(exception.getMessage());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendAuthorCode$lambda$10$lambda$9(Throwable exception, ActiveCardFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(exception, "$exception");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(exception.getMessage(), this$0.getString(o0j.Y7))) {
            this$0.mRequestCodeTimes = 0;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            this$0.finish();
        } else if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit sendAuthorCode$lambda$8(ActiveCardFragment this$0, BaseResponse it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isStatusOK()) {
            if (this$0.mRequestCodeTimes == -1 && it.getMaxOTPRequestsAllowed() != null) {
                this$0.mRequestCodeTimes = it.getMaxOTPRequestsAllowed().intValue();
            }
            this$0.mRequestCodeTimes--;
            String str = this$0.methodType;
            if (Intrinsics.areEqual(str, CardActiveWay.MASTERCARD_EMAIL.getType()) || Intrinsics.areEqual(str, CardActiveWay.VISA_EMAIL.getType())) {
                TextView textView = ((rmg) this$0.getMBinding()).H;
                String string = this$0.getString(o0j.R0);
                AuthenticationMethod authenticationMethod = this$0.authenticationMethod;
                textView.setText(string + " " + (authenticationMethod != null ? authenticationMethod.getValue() : null));
            } else if (Intrinsics.areEqual(str, CardActiveWay.MASTERCARD_SMS.getType()) || Intrinsics.areEqual(str, CardActiveWay.VISA_SMS.getType())) {
                TextView textView2 = ((rmg) this$0.getMBinding()).H;
                String string2 = this$0.getString(o0j.R0);
                AuthenticationMethod authenticationMethod2 = this$0.authenticationMethod;
                textView2.setText(string2 + " " + (authenticationMethod2 != null ? authenticationMethod2.getValue() : null));
            } else {
                ((rmg) this$0.getMBinding()).H.setVisibility(8);
            }
        } else {
            ((rmg) this$0.getMBinding()).I.setTextColor(AppUtil.getApp().getColor(rji.o));
            ((rmg) this$0.getMBinding()).I.setClickable(true);
            ((rmg) this$0.getMBinding()).I.setText(o0j.o7);
            String str2 = this$0.methodType;
            if (Intrinsics.areEqual(str2, CardActiveWay.MASTERCARD_EMAIL.getType()) || Intrinsics.areEqual(str2, CardActiveWay.VISA_EMAIL.getType())) {
                ((rmg) this$0.getMBinding()).H.setText(o0j.m7);
            } else if (Intrinsics.areEqual(str2, CardActiveWay.MASTERCARD_SMS.getType()) || Intrinsics.areEqual(str2, CardActiveWay.VISA_SMS.getType())) {
                ((rmg) this$0.getMBinding()).H.setText(o0j.n7);
            } else {
                ((rmg) this$0.getMBinding()).H.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }

    private final void showGetCodeLimitDialog() {
        vqg.d("method limit  = " + this.mRequestCodeTimes);
        if (this.mRequestCodeTimes != 0) {
            sendAuthorCode();
        } else {
            new CommonDialog.c("getCodeLimitDialog").setDialogTitle(o0j.O2).setDialogDescription(o0j.P2).setNeutralText(o0j.l2).setCanceledOnBackPressed(false).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.issued.ActiveCardFragment.showGetCodeLimitDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -3) {
                        ActiveCardFragment.this.finish();
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                }
            }).show(getParentFragmentManager(), "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final rmg rmgVar) {
        BankCard bankCard;
        BankCard bankCard2;
        BankCard bankCard3;
        Intrinsics.checkNotNullParameter(rmgVar, "<this>");
        setTitle(NfcUtils.INSTANCE.payName());
        CardWrapper cardWrapper = getCardWrapper();
        String tokenUniqueReference = (cardWrapper == null || (bankCard3 = cardWrapper.bankCard) == null) ? null : bankCard3.getTokenUniqueReference();
        CardWrapper cardWrapper2 = getCardWrapper();
        vqg.a("active tur:" + tokenUniqueReference + "  aid:" + ((cardWrapper2 == null || (bankCard2 = cardWrapper2.bankCard) == null) ? null : bankCard2.getAppletInstanceAid()));
        NfcPreference nfcPreference = NfcPreference.INSTANCE;
        if (nfcPreference.getRequestOTPLimitMethod().length() > 0) {
            Object objFromJson = new Gson().fromJson(nfcPreference.getRequestOTPLimitMethod(), (Class<Object>) new ArrayList().getClass());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            if (!((Collection) objFromJson).isEmpty()) {
                List list = (List) new Gson().fromJson(nfcPreference.getRequestOTPLimitMethod(), (Class) new ArrayList().getClass());
                Intrinsics.checkNotNull(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    RequestOTPLimitEntry requestOTPLimitEntry = (RequestOTPLimitEntry) new Gson().fromJson((String) it.next(), RequestOTPLimitEntry.class);
                    String cardNum = requestOTPLimitEntry.getCardNum();
                    CardWrapper cardWrapper3 = getCardWrapper();
                    if (Intrinsics.areEqual(cardNum, (cardWrapper3 == null || (bankCard = cardWrapper3.bankCard) == null) ? null : bankCard.getTokenUniqueReference())) {
                        this.mRequestCodeTimes = requestOTPLimitEntry.getLimit();
                    }
                }
            }
        }
        String str = this.methodType;
        if (Intrinsics.areEqual(str, CardActiveWay.MASTERCARD_EMAIL.getType()) || Intrinsics.areEqual(str, CardActiveWay.VISA_EMAIL.getType())) {
            rmgVar.A.setText(o0j.h7);
        } else if (Intrinsics.areEqual(str, CardActiveWay.VISA_SMS.getType()) || Intrinsics.areEqual(str, CardActiveWay.MASTERCARD_SMS.getType())) {
            rmgVar.A.setText(o0j.i7);
        } else {
            rmgVar.A.setVisibility(8);
        }
        String string = getResources().getString(o0j.j7);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        rmgVar.E.setText(com.xiaomi.fitness.nfc.hyperlink.a.c(string, new com.xiaomi.fitness.nfc.hyperlink.a.InterfaceC0650a() { // from class: cf0
            @Override // com.xiaomi.fitness.nfc.hyperlink.a.InterfaceC0650a
            public final void callBack(String str2) {
                ActiveCardFragment.bindView$lambda$1(this.f5265a, str2);
            }
        }));
        rmgVar.E.setMovementMethod(LinkMovementMethod.getInstance());
        showGetCodeLimitDialog();
        ((rmg) getMBinding()).I.setOnClickListener(new View.OnClickListener() { // from class: df0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActiveCardFragment.bindView$lambda$2(this.f15466a, view);
            }
        });
        rmgVar.G.setOnClickListener(new View.OnClickListener() { // from class: te0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActiveCardFragment.bindView$lambda$7(rmgVar, this, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void finish() {
        BankCard bankCard;
        BankCard bankCard2;
        super.finish();
        vqg.d("finish() method limit  = " + this.mRequestCodeTimes);
        Gson gson = new Gson();
        int i = this.mRequestCodeTimes;
        CardWrapper cardWrapper = getCardWrapper();
        String tokenUniqueReference = (cardWrapper == null || (bankCard2 = cardWrapper.bankCard) == null) ? null : bankCard2.getTokenUniqueReference();
        Intrinsics.checkNotNull(tokenUniqueReference);
        String json = gson.toJson(new RequestOTPLimitEntry(i, tokenUniqueReference));
        NfcPreference nfcPreference = NfcPreference.INSTANCE;
        String requestOTPLimitMethod = nfcPreference.getRequestOTPLimitMethod();
        if (requestOTPLimitMethod.length() <= 0) {
            ArrayList arrayList = new ArrayList();
            Intrinsics.checkNotNull(json);
            arrayList.add(json);
            nfcPreference.setRequestOTPLimitMethod(new Gson().toJson(arrayList));
            return;
        }
        List list = (List) new Gson().fromJson(requestOTPLimitMethod, (Class) new ArrayList().getClass());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String cardNum = ((RequestOTPLimitEntry) new Gson().fromJson((String) it.next(), RequestOTPLimitEntry.class)).getCardNum();
            CardWrapper cardWrapper2 = getCardWrapper();
            String tokenUniqueReference2 = (cardWrapper2 == null || (bankCard = cardWrapper2.bankCard) == null) ? null : bankCard.getTokenUniqueReference();
            Intrinsics.checkNotNull(tokenUniqueReference2);
            if (Intrinsics.areEqual(cardNum, tokenUniqueReference2)) {
                it.remove();
            }
        }
        Intrinsics.checkNotNull(json);
        list.add(json);
        NfcPreference.INSTANCE.setRequestOTPLimitMethod(new Gson().toJson(list));
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        String string = getString(o0j.i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int i = o0j.l2;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        UtilsKt.showMsgDialog((String) null, string, i, childFragmentManager, o0j.common_cancel, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: af0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActiveCardFragment.onBackPressed$lambda$11(this.f941a, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: bf0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActiveCardFragment.onBackPressed$lambda$12((DialogInterface) obj);
            }
        });
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            this.methodId = args.getString(SelectActiveWayFragment.sMethodId);
            this.methodType = args.getString(SelectActiveWayFragment.sMethodType);
            this.methodValue = args.getString(SelectActiveWayFragment.sMethodValue);
            ActiveCardResultFragment.Companion companion = ActiveCardResultFragment.INSTANCE;
            this.cardFace = args.getString(companion.getSCardFace());
            this.bankName = args.getString(companion.getSBankName());
            this.tailNo = args.getString(companion.getSTailNo());
            this.status = args.getString(companion.getSStatus());
            AuthenticationMethod authenticationMethod = new AuthenticationMethod();
            this.authenticationMethod = authenticationMethod;
            authenticationMethod.setId(this.methodId);
            AuthenticationMethod authenticationMethod2 = this.authenticationMethod;
            if (authenticationMethod2 != null) {
                authenticationMethod2.setType(this.methodType);
            }
            AuthenticationMethod authenticationMethod3 = this.authenticationMethod;
            if (authenticationMethod3 != null) {
                authenticationMethod3.setValue(this.methodValue);
            }
        }
    }
}
