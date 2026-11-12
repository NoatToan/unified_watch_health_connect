package com.xiaomi.fitness.nfc.schema;

import android.content.Context;
import android.net.Uri;
import com.service.mi.BankCard;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.export.NfcManager;
import com.xiaomi.fitness.nfc.export.NfcManagerExtKt;
import com.xiaomi.fitness.nfc.schema.NFCPushSchemaHandler;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.zl3;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J&\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\t0\u0012H\u0002¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/nfc/schema/NFCPushSchemaHandler;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "parameterList", "", "", "pathList", "doProcess", "", "context", "Landroid/content/Context;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "jumpPage", "loadMasterCardList", "cardID", "cardWrapper", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NFCPushSchemaHandler extends IntentSchemeHandle {

    @NotNull
    public static final String PARAM_PAGE_TYPE = "pageType";

    @NotNull
    public static final String PARAM_TARGET = "target";

    @NotNull
    public static final String TAG = "NFCPushSchemaHandler";

    @NotNull
    public static final String VALUE_PAGE_TYPE = "nfcNotification";

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.schema.NFCPushSchemaHandler$loadMasterCardList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.schema.NFCPushSchemaHandler$loadMasterCardList$1", f = "NFCPushSchemaHandler.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $cardID;
        final /* synthetic */ Function1<CardWrapper, Unit> $cardWrapper;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super CardWrapper, Unit> function1, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cardWrapper = function1;
            this.$cardID = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$cardWrapper, this.$cardID, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                NFCPushSchemaHandler$loadMasterCardList$1$bankCard$1 nFCPushSchemaHandler$loadMasterCardList$1$bankCard$1 = new NFCPushSchemaHandler$loadMasterCardList$1$bankCard$1(this.$cardID, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, nFCPushSchemaHandler$loadMasterCardList$1$bankCard$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BankCard bankCard = (BankCard) obj;
            this.$cardWrapper.invoke2(bankCard != null ? new CardWrapper(bankCard) : null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void jumpPage(final Context context, Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3 = uri.getQueryParameter("target");
        Logger.i(TAG, "jumpPage target " + queryParameter3);
        if (queryParameter3 != null) {
            int iHashCode = queryParameter3.hashCode();
            if (iHashCode == -879524714) {
                if (queryParameter3.equals("payCardList")) {
                    NfcManagerExtKt.getInstance(NfcManager.INSTANCE).gotoMasterListPage(context);
                }
            } else {
                if (iHashCode == 113057868) {
                    if (queryParameter3.equals("payTransactionRecords") && (queryParameter = uri.getQueryParameter("cardId")) != null) {
                        loadMasterCardList(queryParameter, new Function1() { // from class: bgg
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return NFCPushSchemaHandler.jumpPage$lambda$1(context, (CardWrapper) obj);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (iHashCode == 652594761 && queryParameter3.equals("payCardDetail") && (queryParameter2 = uri.getQueryParameter("cardId")) != null) {
                    loadMasterCardList(queryParameter2, new Function1() { // from class: agg
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return NFCPushSchemaHandler.jumpPage$lambda$0(context, (CardWrapper) obj);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jumpPage$lambda$0(Context context, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(context, "$context");
        if (cardWrapper != null) {
            zl3.g().l(cardWrapper);
            NfcManagerExtKt.getInstance(NfcManager.INSTANCE).gotoBankCardDetailPage(context);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jumpPage$lambda$1(Context context, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(context, "$context");
        if (cardWrapper != null) {
            zl3.g().l(cardWrapper);
            NfcManagerExtKt.getInstance(NfcManager.INSTANCE).gotoBankCardTransactionPage(context);
        }
        return Unit.INSTANCE;
    }

    private final void loadMasterCardList(String cardID, Function1<? super CardWrapper, Unit> cardWrapper) {
        ScopeExtKt.scope$default(null, new AnonymousClass1(cardWrapper, cardID, null), 1, null);
    }

    @Override // defpackage.y0c
    public void doProcess(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Logger.i(TAG, "doProcess uri is " + uri);
        String queryParameter = uri.getQueryParameter("pageType");
        if (Intrinsics.areEqual(queryParameter, VALUE_PAGE_TYPE)) {
            try {
                jumpPage(context, uri);
                return;
            } catch (Exception e) {
                Logger.w(TAG, "doProcess exception , exception is", e);
                return;
            }
        }
        Logger.i(TAG, "pageType " + queryParameter + " is invalid");
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> parameterList() {
        List<String> listSingletonList = Collections.singletonList(VALUE_PAGE_TYPE);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> pathList() {
        return CollectionsKt__CollectionsKt.emptyList();
    }
}
