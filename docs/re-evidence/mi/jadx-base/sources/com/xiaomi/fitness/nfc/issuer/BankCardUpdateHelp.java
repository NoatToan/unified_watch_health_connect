package com.xiaomi.fitness.nfc.issuer;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.service.mi.BankCard;
import com.service.mi.entity.BaseResponse;
import com.service.mi.wallet.entity.resp.CardListResp;
import com.xiaomi.fitness.baseui.utils.NotificationPermission;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import defpackage.cxg;
import defpackage.ixi;
import defpackage.o0j;
import defpackage.rvf;
import defpackage.vqg;
import defpackage.wwg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0007H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/nfc/issuer/BankCardUpdateHelp;", "", "<init>", "()V", "MAIN_ACTIVITY", "", "remindBankCardUpdate", "", "cardListResponse", "Lcom/service/mi/entity/BaseResponse;", "isReActiveLoadingShow", "", "masterCardRedigitize", "needUpdateMasterCard", "Lcom/service/mi/BankCard;", "(Lcom/service/mi/BankCard;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendNotification", "title", "text", "createNotificationChannels", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BankCardUpdateHelp {

    @NotNull
    public static final BankCardUpdateHelp INSTANCE = new BankCardUpdateHelp();

    @NotNull
    private static final String MAIN_ACTIVITY = "com.xiaomi.fitness.main.MainActivity";
    private static boolean isReActiveLoadingShow;

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.issuer.BankCardUpdateHelp$getCardList$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a(\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u0001 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lcom/service/mi/BankCard;", "kotlin.jvm.PlatformType", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.issuer.BankCardUpdateHelp$getCardList$2", f = "BankCardUpdateHelp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<BankCard>>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BaseResponse baseResponseF = new rvf().f();
            if (!baseResponseF.isStatusOK() || !(baseResponseF.getData() instanceof CardListResp)) {
                return null;
            }
            Object data = baseResponseF.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.service.mi.wallet.entity.resp.CardListResp");
            return ((CardListResp) data).getCardList();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<BankCard>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.issuer.BankCardUpdateHelp$masterCardRedigitize$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.issuer.BankCardUpdateHelp$masterCardRedigitize$2", f = "BankCardUpdateHelp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26612 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ BankCard $needUpdateMasterCard;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26612(BankCard bankCard, Continuation<? super C26612> continuation) {
            super(2, continuation);
            this.$needUpdateMasterCard = bankCard;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26612(this.$needUpdateMasterCard, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String tokenUniqueReference = this.$needUpdateMasterCard.getTokenUniqueReference();
            HashMap map = new HashMap();
            map.put("redigitize_token", tokenUniqueReference);
            return Boxing.boxBoolean(this.$needUpdateMasterCard.prepare(map).isStatusOK() ? this.$needUpdateMasterCard.issue(map).isStatusOK() : false);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C26612) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.issuer.BankCardUpdateHelp$remindBankCardUpdate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.issuer.BankCardUpdateHelp$remindBankCardUpdate$1", f = "BankCardUpdateHelp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBankCardUpdateHelp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BankCardUpdateHelp.kt\ncom/xiaomi/fitness/nfc/issuer/BankCardUpdateHelp$remindBankCardUpdate$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<BankCard> $cardList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<BankCard> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cardList = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(DialogInterface dialogInterface) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$cardList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<BankCard> list = this.$cardList;
            if (list != null && (!list.isEmpty())) {
                Iterator<T> it = this.$cardList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((BankCard) next).getCardType() != 2);
                if (((BankCard) next) != null) {
                    NfcPreference nfcPreference = NfcPreference.INSTANCE;
                    int key_nfc_card_visa_update_remind_times = nfcPreference.getKEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES();
                    nfcPreference.setKEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES(key_nfc_card_visa_update_remind_times + 1);
                    nfcPreference.setKEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES(key_nfc_card_visa_update_remind_times);
                    nfcPreference.setKEY_NFC_CARD_VISA_UPDATE_REMIND_TIME(System.currentTimeMillis());
                    if (NotificationPermission.INSTANCE.postNotificationPermissionGranted(ApplicationExtKt.getApplication())) {
                        vqg.d(" sendNotification");
                        BankCardUpdateHelp bankCardUpdateHelp = BankCardUpdateHelp.INSTANCE;
                        String string = ApplicationExtKt.getApplication().getString(o0j.t7);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        String string2 = ApplicationExtKt.getApplication().getString(o0j.s7);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        bankCardUpdateHelp.sendNotification(string, string2);
                    } else {
                        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
                        if (currentActivity != null && (currentActivity instanceof FragmentActivity)) {
                            vqg.d(" showMsgDialog");
                            String string3 = ApplicationExtKt.getApplication().getString(o0j.t7);
                            String string4 = ApplicationExtKt.getApplication().getString(o0j.s7);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            int i = o0j.J;
                            FragmentManager supportFragmentManager = ((FragmentActivity) currentActivity).getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                            UtilsKt.showMsgDialog((80 & 1) != 0 ? null : string3, string4, i, supportFragmentManager, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: com.xiaomi.fitness.nfc.issuer.a
                                @Override // kotlin.jvm.functions.Function1
                                /* JADX INFO: renamed from: invoke */
                                public final Object invoke2(Object obj2) {
                                    return BankCardUpdateHelp.AnonymousClass1.invokeSuspend$lambda$1((DialogInterface) obj2);
                                }
                            }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.issuer.BankCardUpdateHelp$remindBankCardUpdate$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.issuer.BankCardUpdateHelp$remindBankCardUpdate$2", f = "BankCardUpdateHelp.kt", i = {0}, l = {108}, m = "invokeSuspend", n = {"curActivity"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nBankCardUpdateHelp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BankCardUpdateHelp.kt\ncom/xiaomi/fitness/nfc/issuer/BankCardUpdateHelp$remindBankCardUpdate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n774#2:182\n865#2,2:183\n*S KotlinDebug\n*F\n+ 1 BankCardUpdateHelp.kt\ncom/xiaomi/fitness/nfc/issuer/BankCardUpdateHelp$remindBankCardUpdate$2\n*L\n85#1:182\n85#1:183,2\n*E\n"})
    public static final class C26622 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<BankCard> $cardList;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26622(List<BankCard> list, Continuation<? super C26622> continuation) {
            super(2, continuation);
            this.$cardList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26622 c26622 = new C26622(this.$cardList, continuation);
            c26622.L$0 = obj;
            return c26622;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context] */
        /* JADX WARN: Type inference failed for: r0v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ?? r0;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                List<BankCard> list = this.$cardList;
                if (list != null && (!list.isEmpty())) {
                    List<BankCard> list2 = this.$cardList;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        if (((BankCard) obj2).getTokenStatus() == 5) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        if (NotificationPermission.INSTANCE.postNotificationPermissionGranted(ApplicationExtKt.getApplication())) {
                            BankCardUpdateHelp.INSTANCE.sendNotification(ResourceExtKt.getString(o0j.x4), ResourceExtKt.getString(o0j.u4));
                        }
                        ComponentCallbacks2 currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
                        if (currentActivity != null && (currentActivity instanceof PageState) && !BankCardUpdateHelp.isReActiveLoadingShow) {
                            BankCard bankCard = (BankCard) arrayList.get(0);
                            String string = ApplicationExtKt.getApplication().getString(o0j.p4, bankCard.getTokenInfo().getAccountPanSuffix());
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            ((PageState) currentActivity).showLoading(string, 0, true);
                            BankCardUpdateHelp.isReActiveLoadingShow = true;
                            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new BankCardUpdateHelp$remindBankCardUpdate$2$isReactiveJob$1(bankCard, null), 2, null);
                            this.L$0 = currentActivity;
                            this.label = 1;
                            Object objAwait = deferredAsync$default.await(this);
                            if (objAwait == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r0 = currentActivity;
                            obj = objAwait;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Activity activity = (Activity) this.L$0;
            ResultKt.throwOnFailure(obj);
            r0 = activity;
            if (((Boolean) obj).booleanValue()) {
                ToastExtKt.toastShort((Context) r0, ResourceExtKt.getString(o0j.w4));
            } else {
                ToastExtKt.toastShort((Context) r0, ResourceExtKt.getString(o0j.v4));
            }
            ((PageState) r0).hideLoading();
            BankCardUpdateHelp.isReActiveLoadingShow = false;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26622) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private BankCardUpdateHelp() {
    }

    @RequiresApi(26)
    private final void createNotificationChannels() {
        Object systemService = ApplicationExtKt.getApplication().getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(new NotificationChannel("DEVICE_NFC_CHANNEL_ID", "DEVICE_NFC_CHANNEL_ID", 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getCardList(Continuation<? super List<BankCard>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object masterCardRedigitize(BankCard bankCard, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C26612(bankCard, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNotification(String title, String text) {
        createNotificationChannels();
        Intent intent = new Intent();
        intent.putExtra("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setComponent(new ComponentName(ApplicationExtKt.getApplication().getPackageName(), "com.xiaomi.fitness.main.MainActivity"));
        Notification notificationD = new wwg.e(ApplicationExtKt.getApplication(), "DEVICE_NFC_CHANNEL_ID").u(ixi.f22201a).g(true).r(true).i(PendingIntentExtKt.getActivityPendingIntent$default(ApplicationExtKt.getApplication(), 0, intent, 0, 4, null)).w(new wwg.c().i(title).h(text)).d();
        Intrinsics.checkNotNullExpressionValue(notificationD, "build(...)");
        cxg.b(ApplicationExtKt.getApplication()).f("NFC_NOTIFICATION_TAG", 131417, notificationD);
    }

    public final void remindBankCardUpdate(@NotNull BaseResponse cardListResponse) {
        List<BankCard> cardList;
        Intrinsics.checkNotNullParameter(cardListResponse, "cardListResponse");
        if (cardListResponse.isStatusOK() && (cardListResponse.getData() instanceof CardListResp)) {
            Object data = cardListResponse.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.service.mi.wallet.entity.resp.CardListResp");
            cardList = ((CardListResp) data).getCardList();
        } else {
            cardList = null;
        }
        NfcPreference nfcPreference = NfcPreference.INSTANCE;
        if ((nfcPreference.getKEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES() == 0 || nfcPreference.getKEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES() == 1) && System.currentTimeMillis() - nfcPreference.getKEY_NFC_CARD_VISA_UPDATE_REMIND_TIME() >= 604800000) {
            ScopeExtKt.scope$default(null, new AnonymousClass1(cardList, null), 1, null);
        }
        ScopeExtKt.scope$default(null, new C26622(cardList, null), 1, null);
    }
}
