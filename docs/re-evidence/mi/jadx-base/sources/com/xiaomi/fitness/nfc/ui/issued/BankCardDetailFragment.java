package com.xiaomi.fitness.nfc.ui.issued;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.google.gson.Gson;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.service.mi.BankCard;
import com.service.mi.visa.entity.CardMetaData;
import com.service.mi.wallet.entity.ProductConfig;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.entity.RequestOTPLimitEntry;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.ui.BankPrivacyFragment;
import com.xiaomi.fitness.nfc.ui.issued.BankCardDetailFragment;
import com.xiaomi.fitness.nfc.utils.CardFaceHelper;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import com.xiaomi.fitness.nfc.widget.CardImageView;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.bng;
import defpackage.ltg;
import defpackage.mri;
import defpackage.o0j;
import defpackage.pli;
import defpackage.sui;
import defpackage.wni;
import defpackage.zl3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0007¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u0013\u0010\u0011\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/BankCardDetailFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/BankCardDetailViewModel;", "Lbng;", "", "loadCardInfo", "()V", "loadCard", "masterDefaultBtnClick", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "updateMaster", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;)V", "initDefaultView", "deleteCard", "removeCardFaceLocal", "removeLimitMethodCard", "bindView", "(Lbng;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "cardFace", "Ljava/lang/String;", "bankName", "tailNo", "status", "cardType", "Ljava/lang/Integer;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBankCardDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BankCardDetailFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/BankCardDetailFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,309:1\n54#2,3:310\n24#2:313\n59#2,6:314\n54#2,3:320\n24#2:323\n59#2,6:324\n*S KotlinDebug\n*F\n+ 1 BankCardDetailFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/BankCardDetailFragment\n*L\n99#1:310,3\n99#1:313\n99#1:314,6\n103#1:320,3\n103#1:323\n103#1:324,6\n*E\n"})
public final class BankCardDetailFragment extends BaseCardFragment<BankCardDetailViewModel, bng> {
    private static final int sReqestCodeAuth = 10;

    @Nullable
    private String bankName;

    @Nullable
    private String cardFace;

    @Nullable
    private Integer cardType;

    @Nullable
    private String status;

    @Nullable
    private String tailNo;

    public BankCardDetailFragment() {
        super(sui.s, 0, true);
        this.cardType = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$3(final BankCardDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = o0j.p2;
        int i2 = o0j.X2;
        int i3 = o0j.l2;
        FragmentManager childFragmentManager = this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        UtilsKt.showMsgDialog(i, i2, i3, childFragmentManager, o0j.common_cancel, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: iy1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BankCardDetailFragment.bindView$lambda$3$lambda$1(this.f22214a, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: jy1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BankCardDetailFragment.bindView$lambda$3$lambda$2((DialogInterface) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3$lambda$1(BankCardDetailFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this$0.deleteCard();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3$lambda$2(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void deleteCard() {
        showLoading(o0j.Y2, false);
        BankCardDetailViewModel bankCardDetailViewModel = (BankCardDetailViewModel) getMViewModel();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        bankCardDetailViewModel.deleteCard(cardWrapper, new Function0() { // from class: ky1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BankCardDetailFragment.deleteCard$lambda$15(this.f24405a);
            }
        }, new Function1() { // from class: ly1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BankCardDetailFragment.deleteCard$lambda$16(this.f25542a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteCard$lambda$15(BankCardDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        ToastUtil.showShortToast(o0j.i3);
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        if (cardWrapper.isMaster()) {
            zl3.g().j.remove(this$0.getCardWrapper());
            zl3.g().l(this$0.getCardWrapper());
            zl3.g().q();
            ltg.c().r(this$0.getCardWrapper());
        } else {
            zl3.g().h.remove(this$0.getCardWrapper());
            zl3.g().l(this$0.getCardWrapper());
            zl3.g().m();
            ltg.c().r(this$0.getCardWrapper());
        }
        this$0.removeLimitMethodCard();
        this$0.removeCardFaceLocal();
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1);
        }
        FragmentActivity mActivity2 = this$0.getMActivity();
        if (mActivity2 != null) {
            mActivity2.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteCard$lambda$16(BankCardDetailFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        ToastUtil.showShortToast(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initDefaultView() {
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !(DeviceModelExtKt.isWearOS(wearableDeviceModel) || DeviceModelExtKt.isHuaMi(wearableDeviceModel))) {
            ((bng) getMBinding()).C.setVisibility(4);
        } else {
            ((BankCardDetailViewModel) getMViewModel()).getDefaultAid(new Function1() { // from class: my1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BankCardDetailFragment.initDefaultView$lambda$13(this.f27325a, wearableDeviceModel, (String) obj);
                }
            }, new Function0() { // from class: ny1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BankCardDetailFragment.initDefaultView$lambda$14(this.f28553a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initDefaultView$lambda$13(BankCardDetailFragment this$0, WearableDeviceModel wearableDeviceModel, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        boolean zEquals = StringsKt__StringsJVMKt.equals(cardWrapper.getAid(), it, true);
        Intrinsics.checkNotNull(wearableDeviceModel);
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            ((bng) this$0.getMBinding()).C.setText(!zEquals ? o0j.r6 : o0j.s6);
        } else {
            ((bng) this$0.getMBinding()).C.setText(!zEquals ? o0j.t6 : o0j.u6);
        }
        ((bng) this$0.getMBinding()).C.setEnabled(!zEquals);
        ((bng) this$0.getMBinding()).C.setVisibility(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initDefaultView$lambda$14(BankCardDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((bng) this$0.getMBinding()).C.setVisibility(4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadCard() {
        showLoading();
        BankCardDetailViewModel bankCardDetailViewModel = (BankCardDetailViewModel) getMViewModel();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        bankCardDetailViewModel.updateCard(cardWrapper, new Function1() { // from class: ty1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BankCardDetailFragment.loadCard$lambda$8(this.f35173a, (CardWrapper) obj);
            }
        }, new Function0() { // from class: uy1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BankCardDetailFragment.loadCard$lambda$9(this.f36266a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadCard$lambda$8(BankCardDetailFragment this$0, CardWrapper it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        this$0.updateMaster(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadCard$lambda$9(BankCardDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadCardInfo() {
        int screenWidth = DisplayUtil.getScreenWidth() - (((int) ApplicationExtKt.getApplication().getResources().getDimension(pli.e)) * 2);
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        if (cardWrapper.bankCard.getCardType() == 2) {
            CardWrapper cardWrapper2 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper2);
            String foregroundColor = cardWrapper2.bankCard.getCardMetaData().getForegroundColor();
            if (foregroundColor != null && foregroundColor.length() != 0) {
                CardWrapper cardWrapper3 = getCardWrapper();
                Intrinsics.checkNotNull(cardWrapper3);
                String foregroundColor2 = cardWrapper3.bankCard.getCardMetaData().getForegroundColor();
                Intrinsics.checkNotNullExpressionValue(foregroundColor2, "getForegroundColor(...)");
                if (StringsKt__StringsKt.contains$default((CharSequence) foregroundColor2, (CharSequence) "0x", false, 2, (Object) null)) {
                    CardWrapper cardWrapper4 = getCardWrapper();
                    Intrinsics.checkNotNull(cardWrapper4);
                    String foregroundColor3 = cardWrapper4.bankCard.getCardMetaData().getForegroundColor();
                    Intrinsics.checkNotNullExpressionValue(foregroundColor3, "getForegroundColor(...)");
                    ((bng) getMBinding()).A.setTextColor(Color.parseColor(StringsKt__StringsJVMKt.replace$default(foregroundColor3, "0x", PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, false, 4, (Object) null)));
                }
            }
            CardFaceHelper cardFaceHelper = CardFaceHelper.INSTANCE;
            CardWrapper cardWrapper5 = getCardWrapper();
            CardImageView cardView = ((bng) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(cardView, "cardView");
            cardFaceHelper.loadVISACardFace(cardWrapper5, cardView);
            Unit unit = Unit.INSTANCE;
        } else {
            CardWrapper cardWrapper6 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper6);
            String cardFace = cardWrapper6.getCardFace();
            if (cardFace == null || cardFace.length() == 0) {
                CardImageView cardView2 = ((bng) getMBinding()).B;
                Intrinsics.checkNotNullExpressionValue(cardView2, "cardView");
                Integer numValueOf = Integer.valueOf(wni.f);
                ImageLoader imageLoader = Coil.imageLoader(cardView2.getContext());
                ImageRequest.Builder builderTarget = new ImageRequest.Builder(cardView2.getContext()).data(numValueOf).target(cardView2);
                builderTarget.size(screenWidth, (screenWidth * 63) / 100);
                imageLoader.enqueue(builderTarget.build());
            } else {
                CardImageView cardView3 = ((bng) getMBinding()).B;
                Intrinsics.checkNotNullExpressionValue(cardView3, "cardView");
                CardWrapper cardWrapper7 = getCardWrapper();
                Intrinsics.checkNotNull(cardWrapper7);
                String cardFace2 = cardWrapper7.getCardFace();
                ImageLoader imageLoader2 = Coil.imageLoader(cardView3.getContext());
                ImageRequest.Builder builderTarget2 = new ImageRequest.Builder(cardView3.getContext()).data(cardFace2).target(cardView3);
                builderTarget2.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(Float.valueOf(16.0f))));
                int i = (screenWidth * 63) / 100;
                builderTarget2.error(wni.f).size(screenWidth, i).size(screenWidth, i);
                imageLoader2.enqueue(builderTarget2.build());
            }
        }
        CardWrapper cardWrapper8 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper8);
        if (cardWrapper8.isMaster()) {
            CardWrapper cardWrapper9 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper9);
            if (cardWrapper9.bankCard.getTokenStatus() == 5) {
                String string = getString(o0j.f7);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                int i2 = o0j.e7;
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                UtilsKt.showMsgDialog((80 & 1) != 0 ? null : null, string, i2, childFragmentManager, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: oy1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return BankCardDetailFragment.loadCardInfo$lambda$6(this.f29798a, (DialogInterface) obj);
                    }
                }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
            }
        }
        loadCard();
        ((bng) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: py1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BankCardDetailFragment.loadCardInfo$lambda$7(this.f30889a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadCardInfo$lambda$6(BankCardDetailFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        zl3.g().l(this$0.getCardWrapper());
        this$0.gotoPage(ReIssueMasterCardFragment.class, null);
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadCardInfo$lambda$7(BankCardDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.masterDefaultBtnClick();
    }

    private final void masterDefaultBtnClick() {
        zl3.g().l(getCardWrapper());
        Bundle bundle = new Bundle();
        ActiveCardResultFragment.Companion companion = ActiveCardResultFragment.INSTANCE;
        bundle.putString(companion.getSCardFace(), this.cardFace);
        bundle.putString(companion.getSStatus(), this.status);
        bundle.putString(companion.getSTailNo(), this.tailNo);
        bundle.putString(companion.getSBankName(), this.bankName);
        String mCardType = companion.getMCardType();
        Integer num = this.cardType;
        bundle.putInt(mCardType, num != null ? num.intValue() : 0);
        gotoPageForResult(SelectActiveWayFragment.class, bundle, 10);
    }

    private final void removeCardFaceLocal() {
        CardFaceHelper.INSTANCE.removePDFCardFace(getCardWrapper());
    }

    private final void removeLimitMethodCard() {
        BankCard bankCard;
        String requestOTPLimitMethod = NfcPreference.INSTANCE.getRequestOTPLimitMethod();
        if (requestOTPLimitMethod.length() > 0) {
            List list = (List) new Gson().fromJson(requestOTPLimitMethod, (Class) new ArrayList().getClass());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String cardNum = ((RequestOTPLimitEntry) new Gson().fromJson((String) it.next(), RequestOTPLimitEntry.class)).getCardNum();
                CardWrapper cardWrapper = getCardWrapper();
                String tokenUniqueReference = (cardWrapper == null || (bankCard = cardWrapper.bankCard) == null) ? null : bankCard.getTokenUniqueReference();
                Intrinsics.checkNotNull(tokenUniqueReference);
                if (Intrinsics.areEqual(cardNum, tokenUniqueReference)) {
                    it.remove();
                }
            }
            NfcPreference.INSTANCE.setRequestOTPLimitMethod(new Gson().toJson(list));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateMaster(final CardWrapper cardWrapper) {
        TextView textView = (TextView) ((bng) getMBinding()).E.findViewById(mri.C);
        TextView textView2 = (TextView) ((bng) getMBinding()).E.findViewById(mri.f27131a);
        TextView textView3 = (TextView) ((bng) getMBinding()).E.findViewById(mri.h1);
        LinearLayout linearLayout = (LinearLayout) ((bng) getMBinding()).E.findViewById(mri.D);
        View viewFindViewById = ((bng) getMBinding()).E.findViewById(mri.U4);
        textView.setText(cardWrapper.getBankName());
        textView2.setText(cardWrapper.mCardName);
        textView3.setText(".... " + cardWrapper.getDeviceEndNo());
        ((bng) getMBinding()).A.setText(cardWrapper.mCardName);
        int i = 4;
        if (cardWrapper.bankCard.getCardType() == 2) {
            final CardMetaData cardMetaData = cardWrapper.bankCard.getCardMetaData();
            if (cardMetaData != null && (!TextUtils.isEmpty(cardMetaData.getTermsAndConditionsURL()) || !TextUtils.isEmpty(cardMetaData.getPrivacyPolicyURL()))) {
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: qy1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BankCardDetailFragment.updateMaster$lambda$10(cardMetaData, this, view);
                    }
                });
                i = 0;
            }
            linearLayout.setVisibility(i);
        } else {
            final ProductConfig productConfig = cardWrapper.bankCard.getProductConfig();
            if (productConfig != null && (!TextUtils.isEmpty(productConfig.getTermsAndConditionsUrl()) || !TextUtils.isEmpty(productConfig.getPrivacyPolicyUrl()))) {
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: ry1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BankCardDetailFragment.updateMaster$lambda$11(productConfig, this, view);
                    }
                });
                i = 0;
            }
            linearLayout.setVisibility(i);
        }
        ((bng) getMBinding()).G.setText(cardWrapper.getStatus());
        ((bng) getMBinding()).G.setVisibility(0);
        if (1 == cardWrapper.bankCard.getTokenStatus()) {
            ((bng) getMBinding()).C.setVisibility(0);
            ((bng) getMBinding()).C.setText(o0j.m0);
        } else {
            ((bng) getMBinding()).C.setVisibility(8);
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: sy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BankCardDetailFragment.updateMaster$lambda$12(cardWrapper, this, view);
            }
        });
        this.cardFace = cardWrapper.getCardFace();
        this.status = cardWrapper.getStatus();
        this.tailNo = cardWrapper.getBankEndNo();
        this.bankName = cardWrapper.getBankName();
        BankCard bankCard = cardWrapper.bankCard;
        this.cardType = bankCard != null ? Integer.valueOf(bankCard.getCardType()) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMaster$lambda$10(CardMetaData cardMetaData, BankCardDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString(BankPrivacyFragment.sPrivicyUrl, cardMetaData.getPrivacyPolicyURL());
        bundle.putString(BankPrivacyFragment.sServiceUrl, cardMetaData.getTermsAndConditionsURL());
        bundle.putString(BankPrivacyFragment.sCustomerServicePhoneNumber, cardMetaData.getContactNumber());
        bundle.putString(BankPrivacyFragment.sCustomerServiceUrl, cardMetaData.getContactWebsite());
        this$0.gotoPage(BankPrivacyFragment.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMaster$lambda$11(ProductConfig productConfig, BankCardDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString(BankPrivacyFragment.sPrivicyUrl, productConfig.getPrivacyPolicyUrl());
        bundle.putString(BankPrivacyFragment.sServiceUrl, productConfig.getTermsAndConditionsUrl());
        bundle.putString(BankPrivacyFragment.sCustomerServicePhoneNumber, productConfig.getCustomerServicePhoneNumber());
        bundle.putString(BankPrivacyFragment.sCustomerServiceUrl, productConfig.getCustomerServiceUrl());
        this$0.gotoPage(BankPrivacyFragment.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMaster$lambda$12(CardWrapper cardWrapper, BankCardDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(cardWrapper, "$cardWrapper");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zl3.g().l(cardWrapper);
        this$0.gotoPage(MasterTranslationFragment.class, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull bng bngVar) {
        Intrinsics.checkNotNullParameter(bngVar, "<this>");
        setTitle(NfcUtils.INSTANCE.payName());
        CardWrapper cardWrapper = getCardWrapper();
        if (cardWrapper != null) {
            if (cardWrapper.isMaster()) {
                bngVar.E.setVisibility(0);
            } else {
                bngVar.H.setVisibility(0);
            }
        }
        ((bng) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: hy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BankCardDetailFragment.bindView$lambda$3(this.f20589a, view);
            }
        });
        loadCardInfo();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10 && resultCode == -1) {
            loadCard();
        }
    }
}
