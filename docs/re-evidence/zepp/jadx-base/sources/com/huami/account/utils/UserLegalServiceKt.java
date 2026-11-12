package com.huami.account.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.account.service.AccountService;
import com.huami.account.service.model.Area;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0002¨\u0006\u0005"}, d2 = {"", "jsonString", "filterUselessProperties", "Lcom/huami/account/utils/AgreementResult;", "a", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class UserLegalServiceKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    private static final AgreementResult a(AgreementResult agreementResult) {
        Area userArea;
        List arrayList;
        ArrayList arrayList2 = null;
        AccountService accountService = (AccountService) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(AccountService.class), null, null);
        String value = (accountService == null || (userArea = accountService.getUserArea()) == null) ? null : userArea.getValue();
        List<AgreementItem> items = agreementResult.getItems();
        if (items == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
            Iterator<T> it2 = items.iterator();
            while (it2.hasNext()) {
                arrayList.add(((AgreementItem) it2.next()).getLanguage());
            }
        }
        if (arrayList == null) {
            arrayList = CollectionsKt__CollectionsKt.emptyList();
        }
        if ((value == null || value.length() == 0) || !arrayList.contains(value)) {
            return agreementResult;
        }
        String hadSaved = agreementResult.getHadSaved();
        String time = agreementResult.getTime();
        List<AgreementItem> items2 = agreementResult.getItems();
        if (items2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj : items2) {
                if (Intrinsics.areEqual(((AgreementItem) obj).getLanguage(), value)) {
                    arrayList2.add(obj);
                }
            }
        }
        return new AgreementResult(hadSaved, time, arrayList2);
    }

    @NotNull
    public static final String filterUselessProperties(@NotNull String str) {
        try {
            Result.Companion companion = Result.Companion;
            Gson gson = HMHttpUtils.getGson();
            return gson.toJson(a((AgreementResult) gson.fromJson(str, new TypeToken<AgreementResult>() { // from class: com.huami.account.utils.UserLegalServiceKt$filterUselessProperties$1$type$1
            }.getType())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.debug$default(null, new a(thM3848exceptionOrNullimpl), 1, null);
            }
            Object obj = str;
            if (!Result.m3850isFailureimpl(objM3845constructorimpl)) {
                obj = objM3845constructorimpl;
            }
            return (String) obj;
        }
    }
}
