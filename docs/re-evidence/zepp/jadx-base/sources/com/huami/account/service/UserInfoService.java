package com.huami.account.service;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphRequest;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.webapi.account.model.HMBeanPersonInfo;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H'J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH&J'\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/huami/account/service/UserInfoService;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/account/service/Option;", "option", "", "navigateToPersonInfo", "Landroid/content/Intent;", "getNavigateToPersonInfoIntent", "Lcom/xiaomi/hm/health/webapi/account/model/HMBeanPersonInfo;", "getPersonInfoFromServer", "", "", GraphRequest.FIELDS_PARAM, "", "updatePartOfPersonInfo", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "finishedCallbacks", "navigateToNewUserGuide", "service_release"}, k = 1, mv = {1, 5, 1})
public interface UserInfoService {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void navigateToNewUserGuide$default(UserInfoService userInfoService, Context context, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToNewUserGuide");
            }
            if ((i & 2) != 0) {
                function0 = a.a;
            }
            userInfoService.navigateToNewUserGuide(context, function0);
        }

        public static /* synthetic */ void navigateToPersonInfo$default(UserInfoService userInfoService, Context context, Option option, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToPersonInfo");
            }
            if ((i & 2) != 0) {
                option = null;
            }
            userInfoService.navigateToPersonInfo(context, option);
        }
    }

    @Deprecated(message = "建议使用 navigateToPersonInfo 进行跳转")
    @NotNull
    Intent getNavigateToPersonInfoIntent(@NotNull Context context);

    @Nullable
    HMBeanPersonInfo getPersonInfoFromServer();

    void navigateToNewUserGuide(@NotNull Context context, @Nullable Function0<Unit> finishedCallbacks);

    void navigateToPersonInfo(@NotNull Context context, @Nullable Option option);

    @Nullable
    Object updatePartOfPersonInfo(@NotNull Map<String, String> map, @NotNull Continuation<? super Boolean> continuation);
}
