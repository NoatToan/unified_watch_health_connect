package com.xiaomi.fitness.nfc.ui.issued;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.service.mi.BankCard;
import com.service.mi.entity.IssuerAppInfo;
import com.service.mi.wallet.entity.AuthenticationMethod;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.MarketUtil;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.entity.RequestOTPLimitEntry;
import com.xiaomi.fitness.nfc.issuer.CardActiveWay;
import com.xiaomi.fitness.nfc.issuer.CardActiveWayKt;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.ui.issued.SelectActiveWayFragment;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import com.xiaomi.fitness.nfc.widget.SetRightArrowView;
import defpackage.av6;
import defpackage.o0j;
import defpackage.ppg;
import defpackage.sui;
import defpackage.vqg;
import defpackage.zl3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00018B\u0007¢\u0006\u0004\b7\u0010!JS\u0010\f\u001a\u00020\u000b2B\u0010\n\u001a>\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u0004j\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b`\tH\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u00020\u000b2\"\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J;\u0010\u0017\u001a\u00020\u000b2\"\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u000e2\u0006\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u000b*\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J)\u0010*\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0018\u00102\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00100R\u0016\u00104\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00100¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/SelectActiveWayFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/SelectActiveWayViewModel;", "Lppg;", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lcom/service/mi/wallet/entity/AuthenticationMethod;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "methodList", "", "showActiveMethodView", "(Ljava/util/HashMap;)V", "", "method", "showActiveDialog", "(Ljava/util/Map$Entry;)V", "authenticationMethod", "callPhone", "(Lcom/service/mi/wallet/entity/AuthenticationMethod;)V", "masterAppToApp", "methodWay", "onSelectActiveWay", "(Ljava/util/Map$Entry;Lcom/service/mi/wallet/entity/AuthenticationMethod;)V", "toActivePage", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "bindView", "(Lppg;)V", LifecycleConstantKt.ON_RESUME, "()V", "packageName", "openGooglePlay", "(Ljava/lang/String;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "onBackPressed", "()Z", "cardFace", "Ljava/lang/String;", "bankName", "tailNo", "status", "cardType", "I", "activeWay", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSelectActiveWayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectActiveWayFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/SelectActiveWayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,346:1\n1863#2:347\n1864#2:349\n1863#2,2:350\n1863#2,2:354\n29#3:348\n29#3:360\n216#4,2:352\n37#5:356\n36#5,3:357\n*S KotlinDebug\n*F\n+ 1 SelectActiveWayFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/SelectActiveWayFragment\n*L\n79#1:347\n79#1:349\n122#1:350,2\n154#1:354,2\n80#1:348\n204#1:360\n129#1:352,2\n178#1:356\n178#1:357,3\n*E\n"})
public final class SelectActiveWayFragment extends BaseCardFragment<SelectActiveWayViewModel, ppg> {

    @NotNull
    public static final String ACTIVE_METHOD_LIST = "method_list";

    @NotNull
    public static final String sMethodId = "sMethodId";

    @NotNull
    public static final String sMethodType = "sMethodType";

    @NotNull
    public static final String sMethodValue = "sMethodValue";
    private static final int sRequestAPPCode = 101;
    private static final int sRequestCodeNext = 10;

    @NotNull
    private String activeWay;

    @Nullable
    private String bankName;

    @Nullable
    private String cardFace;
    private int cardType;

    @Nullable
    private String status;

    @Nullable
    private String tailNo;

    public SelectActiveWayFragment() {
        super(sui.Z, 0, true);
        this.activeWay = "PLEASE_IGNORE_ENUM_VALUE";
    }

    private final void callPhone(AuthenticationMethod authenticationMethod) {
        Intent intent = new Intent("android.intent.action.DIAL");
        String value = authenticationMethod.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Uri uri = Uri.parse("tel:" + StringsKt__StringsJVMKt.replace$default(value, "-", "", false, 4, (Object) null));
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        intent.setData(uri);
        startActivity(intent);
    }

    private final void masterAppToApp(AuthenticationMethod authenticationMethod) {
        try {
            Gson gson = new Gson();
            String value = authenticationMethod.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            IssuerAppInfo.IssuerAppAndroid issuerAppAndroid = ((IssuerAppInfo) gson.fromJson(value, new TypeToken<IssuerAppInfo>() { // from class: com.xiaomi.fitness.nfc.ui.issued.SelectActiveWayFragment$masterAppToApp$$inlined$fromJson$1
            }.getType())).getIssuerAppAndroid();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            boolean zCheckAppInstalled = MarketUtil.checkAppInstalled(contextRequireContext, issuerAppAndroid.getPackageName());
            vqg.d("SelectActiveWayFragment issuerAppInfo:" + zCheckAppInstalled + " packageName:" + issuerAppAndroid.getPackageName() + " action:" + issuerAppAndroid.getAction() + " extraTextValue:" + issuerAppAndroid.getExtraTextValue());
            if (zCheckAppInstalled) {
                Intent intent = new Intent();
                intent.setAction(issuerAppAndroid.getAction());
                Bundle bundle = new Bundle();
                bundle.putString("android.intent.extra.TEXT", issuerAppAndroid.getExtraTextValue());
                intent.putExtras(bundle);
                startActivityForResult(intent, 101);
            } else {
                String packageName = issuerAppAndroid.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                openGooglePlay(packageName);
            }
        } catch (Exception e) {
            vqg.c("SelectActiveWayFragment appToApp", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBackPressed$lambda$8(SelectActiveWayFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBackPressed$lambda$9(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(SelectActiveWayFragment this$0, HashMap it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        this$0.showActiveMethodView(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(SelectActiveWayFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        int i = o0j.l2;
        FragmentManager childFragmentManager = this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        UtilsKt.showMsgDialog((80 & 1) != 0 ? null : null, it, i, childFragmentManager, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: prl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SelectActiveWayFragment.onResume$lambda$3$lambda$2((DialogInterface) obj);
            }
        }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3$lambda$2(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSelectActiveWay(Map.Entry<String, ? extends ArrayList<AuthenticationMethod>> method, AuthenticationMethod methodWay) {
        String key = method.getKey();
        vqg.d("SelectActiveWayFragment onSelectActiveWay:" + ((Object) key) + " methodWay:" + methodWay.getValue());
        String key2 = method.getKey();
        if (Intrinsics.areEqual(key2, CardActiveWay.VISA_CALL_CENTER.getType()) || Intrinsics.areEqual(key2, CardActiveWay.VISA_CALL_CENTER2.getType()) || Intrinsics.areEqual(key2, CardActiveWay.VISA_CALL_CENTER3.getType())) {
            callPhone(methodWay);
            return;
        }
        if (Intrinsics.areEqual(key2, CardActiveWay.MASTERCARD_EMAIL.getType()) || Intrinsics.areEqual(key2, CardActiveWay.VISA_EMAIL.getType())) {
            toActivePage(methodWay);
            return;
        }
        if (Intrinsics.areEqual(key2, CardActiveWay.MASTERCARD_SMS.getType()) || Intrinsics.areEqual(key2, CardActiveWay.VISA_SMS.getType())) {
            toActivePage(methodWay);
            return;
        }
        if (Intrinsics.areEqual(key2, CardActiveWay.MASTER_APP_TO_APPLICATION.getType())) {
            try {
                masterAppToApp(methodWay);
                return;
            } catch (Exception e) {
                vqg.c("SelectActiveWayFragment appToApp", e);
                return;
            }
        }
        if (Intrinsics.areEqual(key2, CardActiveWay.VISA_APP_TO_APPLICATION2.getType())) {
            try {
                masterAppToApp(methodWay);
            } catch (Exception e2) {
                vqg.c("SelectActiveWayFragment appToApp", e2);
            }
        }
    }

    private final void showActiveDialog(final Map.Entry<String, ? extends ArrayList<AuthenticationMethod>> method) {
        int i;
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AuthenticationMethod authenticationMethod : method.getValue()) {
            String value = authenticationMethod.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            arrayList2.add(value);
            arrayList.add(authenticationMethod);
        }
        String key = method.getKey();
        if (Intrinsics.areEqual(key, CardActiveWay.VISA_CALL_CENTER.getType()) || Intrinsics.areEqual(key, CardActiveWay.VISA_CALL_CENTER2.getType()) || Intrinsics.areEqual(key, CardActiveWay.VISA_CALL_CENTER3.getType())) {
            i = o0j.f2;
        } else if (Intrinsics.areEqual(key, CardActiveWay.MASTERCARD_EMAIL.getType()) || Intrinsics.areEqual(key, CardActiveWay.VISA_EMAIL.getType())) {
            i = o0j.h3;
        } else if (Intrinsics.areEqual(key, CardActiveWay.MASTERCARD_SMS.getType()) || Intrinsics.areEqual(key, CardActiveWay.VISA_SMS.getType())) {
            i = o0j.I5;
        } else {
            i = (Intrinsics.areEqual(key, CardActiveWay.MASTER_APP_TO_APPLICATION.getType()) || Intrinsics.areEqual(key, CardActiveWay.VISA_APP_TO_APPLICATION2.getType())) ? o0j.e2 : o0j.f2;
        }
        new CommonDialog.c("active_dialog").setDialogTitle(i).setItems((String[]) arrayList2.toArray(new String[0])).setCancelable(true).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.issued.SelectActiveWayFragment.showActiveDialog.2
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                SelectActiveWayFragment selectActiveWayFragment = SelectActiveWayFragment.this;
                Map.Entry<String, ArrayList<AuthenticationMethod>> entry = method;
                AuthenticationMethod authenticationMethod2 = arrayList.get(which);
                Intrinsics.checkNotNullExpressionValue(authenticationMethod2, "get(...)");
                selectActiveWayFragment.onSelectActiveWay(entry, authenticationMethod2);
            }
        }).showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showActiveMethodView(HashMap<String, ArrayList<AuthenticationMethod>> methodList) {
        BankCard bankCard;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ExtUtilsKt.getDp(Float.valueOf(10.0f));
        ((ppg) getMBinding()).A.removeAllViews();
        NfcPreference nfcPreference = NfcPreference.INSTANCE;
        boolean z = false;
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
                    CardWrapper cardWrapper = getCardWrapper();
                    String tokenUniqueReference = (cardWrapper == null || (bankCard = cardWrapper.bankCard) == null) ? null : bankCard.getTokenUniqueReference();
                    Intrinsics.checkNotNull(tokenUniqueReference);
                    if (Intrinsics.areEqual(cardNum, tokenUniqueReference) && requestOTPLimitEntry.getLimit() == 0) {
                        z = true;
                    }
                }
            }
        }
        for (final Map.Entry<String, ArrayList<AuthenticationMethod>> entry : methodList.entrySet()) {
            if (!z || (!Intrinsics.areEqual(CardActiveWayKt.getSelectWay(entry.getKey()), ApplicationExtKt.getApplication().getString(o0j.I5)) && !Intrinsics.areEqual(CardActiveWayKt.getSelectWay(entry.getKey()), ApplicationExtKt.getApplication().getString(o0j.h3)))) {
                SetRightArrowView setRightArrowView = new SetRightArrowView(getMActivity());
                setRightArrowView.setTitle(CardActiveWayKt.getSelectWay(entry.getKey()));
                ((ppg) getMBinding()).A.addView(setRightArrowView, layoutParams);
                setRightArrowView.setOnClickListener(new View.OnClickListener() { // from class: mrl
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SelectActiveWayFragment.showActiveMethodView$lambda$6$lambda$5(entry, this, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showActiveMethodView$lambda$6$lambda$5(Map.Entry method, SelectActiveWayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(method, "$method");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((ArrayList) method.getValue()).isEmpty()) {
            return;
        }
        this$0.activeWay = (String) method.getKey();
        if (((ArrayList) method.getValue()).size() != 1) {
            this$0.showActiveDialog(method);
            return;
        }
        Object obj = ((ArrayList) method.getValue()).get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        this$0.onSelectActiveWay(method, (AuthenticationMethod) obj);
    }

    private final void toActivePage(AuthenticationMethod method) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("sIsMaster", true);
        bundle.putString(sMethodId, method.getId());
        bundle.putString(sMethodType, method.getType());
        bundle.putString(sMethodValue, method.getValue());
        ActiveCardResultFragment.Companion companion = ActiveCardResultFragment.INSTANCE;
        bundle.putString(companion.getSCardFace(), this.cardFace);
        bundle.putString(companion.getSStatus(), this.status);
        bundle.putString(companion.getSTailNo(), this.tailNo);
        bundle.putString(companion.getSBankName(), this.bankName);
        bundle.putInt(companion.getMCardType(), this.cardType);
        zl3.g().l(getCardWrapper());
        gotoPageForResult(ActiveCardFragment.class, bundle, 10);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull ppg ppgVar) {
        Intrinsics.checkNotNullParameter(ppgVar, "<this>");
        setTitle(o0j.W3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r3.equals("DECLINED") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (r3.equals("FAILURE") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        com.xiaomi.fitness.common.utils.ToastUtil.showShortToast(defpackage.o0j.x0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r3, int r4, @org.jetbrains.annotations.Nullable android.content.Intent r5) {
        /*
            r2 = this;
            super.onActivityResult(r3, r4, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SelectActiveWayFragment onActivityResult requestCode:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " resultCode:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            defpackage.vqg.d(r0)
            r0 = 10
            r1 = -1
            if (r3 == r0) goto L9a
            r0 = 101(0x65, float:1.42E-43)
            if (r3 == r0) goto L2a
            goto La8
        L2a:
            if (r4 != r1) goto L94
            if (r5 == 0) goto L35
            java.lang.String r3 = "issuerMobileAppAuthResponse"
            java.lang.String r3 = r5.getStringExtra(r3)
            goto L36
        L35:
            r3 = 0
        L36:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "SelectActiveWayFragment onActivityResult requestAppResult:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            defpackage.vqg.d(r4)
            if (r3 == 0) goto L8e
            int r4 = r3.hashCode()
            r5 = -368591510(0xffffffffea07bd6a, float:-4.1024867E25)
            if (r4 == r5) goto L7f
            r5 = 1350822958(0x5083ec2e, float:1.77063485E10)
            if (r4 == r5) goto L76
            r5 = 1967871671(0x754b56b7, float:2.5776246E32)
            if (r4 == r5) goto L60
            goto L8e
        L60:
            java.lang.String r4 = "APPROVED"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L69
            goto L8e
        L69:
            androidx.fragment.app.FragmentActivity r3 = r2.getMActivity()
            if (r3 == 0) goto L72
            r3.setResult(r1)
        L72:
            r2.finish()
            goto La8
        L76:
            java.lang.String r4 = "DECLINED"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L88
            goto L8e
        L7f:
            java.lang.String r4 = "FAILURE"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L88
            goto L8e
        L88:
            int r3 = defpackage.o0j.x0
            com.xiaomi.fitness.common.utils.ToastUtil.showShortToast(r3)
            goto La8
        L8e:
            int r3 = defpackage.o0j.x0
            com.xiaomi.fitness.common.utils.ToastUtil.showShortToast(r3)
            goto La8
        L94:
            int r3 = defpackage.o0j.x0
            com.xiaomi.fitness.common.utils.ToastUtil.showShortToast(r3)
            goto La8
        L9a:
            if (r4 != r1) goto La8
            androidx.fragment.app.FragmentActivity r3 = r2.getMActivity()
            if (r3 == 0) goto La5
            r3.setResult(r1)
        La5:
            r2.finish()
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.nfc.ui.issued.SelectActiveWayFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        String string = getString(o0j.i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int i = o0j.l2;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        UtilsKt.showMsgDialog((String) null, string, i, childFragmentManager, o0j.common_cancel, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: krl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SelectActiveWayFragment.onBackPressed$lambda$8(this.f24234a, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: lrl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SelectActiveWayFragment.onBackPressed$lambda$9((DialogInterface) obj);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ArrayList arrayList = new ArrayList();
        Bundle arguments = getArguments();
        if ((arguments != null ? arguments.getStringArrayList(ACTIVE_METHOD_LIST) : null) != null) {
            Bundle arguments2 = getArguments();
            ArrayList<String> stringArrayList = arguments2 != null ? arguments2.getStringArrayList(ACTIVE_METHOD_LIST) : null;
            if (stringArrayList != null && !stringArrayList.isEmpty()) {
                for (String str : stringArrayList) {
                    Gson gson = new Gson();
                    Intrinsics.checkNotNull(str);
                    arrayList.add(gson.fromJson(str, new TypeToken<AuthenticationMethod>() { // from class: com.xiaomi.fitness.nfc.ui.issued.SelectActiveWayFragment$onResume$lambda$0$$inlined$fromJson$1
                    }.getType()));
                }
            }
        }
        if (!(!arrayList.isEmpty())) {
            PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
            SelectActiveWayViewModel selectActiveWayViewModel = (SelectActiveWayViewModel) getMViewModel();
            CardWrapper cardWrapper = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper);
            selectActiveWayViewModel.loadWay(cardWrapper, new Function1() { // from class: nrl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SelectActiveWayFragment.onResume$lambda$1(this.f28297a, (HashMap) obj);
                }
            }, new Function1() { // from class: orl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SelectActiveWayFragment.onResume$lambda$3(this.f29631a, (String) obj);
                }
            });
            return;
        }
        vqg.b("activate loadWay size = " + arrayList.size());
        showActiveMethodView(((SelectActiveWayViewModel) getMViewModel()).filterMethod(arrayList));
    }

    public final void openGooglePlay(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            if (packageName.length() == 0) {
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName));
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                mActivity.startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
            vqg.c("SelectActiveWayFragment openGooglePlay", e);
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
            intent2.addFlags(268435456);
            FragmentActivity mActivity2 = getMActivity();
            if (mActivity2 != null) {
                mActivity2.startActivity(intent2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        this.cardFace = args != null ? args.getString(ActiveCardResultFragment.INSTANCE.getSCardFace()) : null;
        this.bankName = args != null ? args.getString(ActiveCardResultFragment.INSTANCE.getSBankName()) : null;
        this.tailNo = args != null ? args.getString(ActiveCardResultFragment.INSTANCE.getSTailNo()) : null;
        this.status = args != null ? args.getString(ActiveCardResultFragment.INSTANCE.getSStatus()) : null;
        this.cardType = args != null ? args.getInt(ActiveCardResultFragment.INSTANCE.getMCardType()) : 0;
    }
}
