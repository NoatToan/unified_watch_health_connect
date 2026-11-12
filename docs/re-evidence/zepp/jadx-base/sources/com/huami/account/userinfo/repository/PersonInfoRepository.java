package com.huami.account.userinfo.repository;

import com.facebook.GraphRequest;
import com.huami.account.userinfo.UserinfoExternalsKt;
import com.huami.account.userinfo.datasource.PersonInfoRemoteDataSource;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.passport.AccountManager;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.webapi.account.model.HMBeanPersonInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/huami/account/userinfo/repository/PersonInfoRepository;", "", "", "", GraphRequest.FIELDS_PARAM, "", "updatePartOfPersonInfo", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "fetchAndSavePersonInfo", "Lcom/xiaomi/hm/health/webapi/account/model/HMBeanPersonInfo;", "fetchPersonInfoFromServer", "Lcom/huami/account/userinfo/datasource/PersonInfoRemoteDataSource;", "a", "Lcom/huami/account/userinfo/datasource/PersonInfoRemoteDataSource;", "remoteDataSource", "<init>", "(Lcom/huami/account/userinfo/datasource/PersonInfoRemoteDataSource;)V", "Companion", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class PersonInfoRepository {

    @NotNull
    public static final String PARAM_BIND_BIRTHDAY = "birthday";

    @NotNull
    public static final String PARAM_BIND_GENDER = "gender";

    @NotNull
    public static final String PARAM_BIND_HEIGHT = "height";

    @NotNull
    public static final String PARAM_BIND_LOCATION = "location";

    @NotNull
    public static final String PARAM_BIND_WEIGHT = "weight";

    @NotNull
    private static final String b = "PersonInfoRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PersonInfoRemoteDataSource remoteDataSource;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fetch userinfo fail";
        }
    }

    public PersonInfoRepository(@NotNull PersonInfoRemoteDataSource personInfoRemoteDataSource) {
        this.remoteDataSource = personInfoRemoteDataSource;
    }

    @Nullable
    public final HMPersonInfo fetchAndSavePersonInfo() {
        AccountManager accountManager = AccountManager.getDefault(UserinfoExternalsKt.getAppContext());
        HMBeanPersonInfo hMBeanPersonInfoFetchPersonInfoFromServer = fetchPersonInfoFromServer();
        if (hMBeanPersonInfoFetchPersonInfoFromServer == null) {
            return null;
        }
        hMBeanPersonInfoFetchPersonInfoFromServer.setUserid(accountManager.getCurrentUid());
        HMPersonInfo hMPersonInfoUpdateFromServer = HMPersonInfo.getInstance().updateFromServer(hMBeanPersonInfoFetchPersonInfoFromServer);
        hMPersonInfoUpdateFromServer.saveInfoAsync();
        return hMPersonInfoUpdateFromServer;
    }

    @Nullable
    public final HMBeanPersonInfo fetchPersonInfoFromServer() {
        HMHttpResponseData userInfo = this.remoteDataSource.getUserInfo();
        if (userInfo.isSuccess()) {
            return this.remoteDataSource.parsePersonInfo(userInfo);
        }
        HMLog.debug(b, a.a);
        return null;
    }

    @Nullable
    public final Object updatePartOfPersonInfo(@NotNull Map<String, String> map, @NotNull Continuation<? super Boolean> continuation) {
        return this.remoteDataSource.uploadPartOfPersonInfo(map, continuation);
    }
}
