package com.huami.account.userinfo;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphRequest;
import com.huami.account.service.Option;
import com.huami.account.service.UserInfoService;
import com.huami.account.userinfo.repository.PersonInfoRepository;
import com.huami.account.userinfo.ui.NewUserGuideActivity;
import com.huami.account.userinfo.ui.PersonInfoActivity;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.webapi.account.model.HMBeanPersonInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J'\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012H\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/huami/account/userinfo/UserInfoServiceImpl;", "Lcom/huami/account/service/UserInfoService;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/account/service/Option;", "option", "", "navigateToPersonInfo", "Landroid/content/Intent;", "getNavigateToPersonInfoIntent", "Lcom/xiaomi/hm/health/webapi/account/model/HMBeanPersonInfo;", "getPersonInfoFromServer", "", "", GraphRequest.FIELDS_PARAM, "", "updatePartOfPersonInfo", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "finishedCallbacks", "navigateToNewUserGuide", "Lcom/huami/account/userinfo/repository/PersonInfoRepository;", "a", "Lcom/huami/account/userinfo/repository/PersonInfoRepository;", "repository", "<init>", "(Lcom/huami/account/userinfo/repository/PersonInfoRepository;)V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class UserInfoServiceImpl implements UserInfoService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PersonInfoRepository repository;

    public UserInfoServiceImpl(@NotNull PersonInfoRepository personInfoRepository) {
        this.repository = personInfoRepository;
    }

    @Override // com.huami.account.service.UserInfoService
    @NotNull
    public Intent getNavigateToPersonInfoIntent(@NotNull Context context) {
        return new Intent(context, (Class<?>) PersonInfoActivity.class);
    }

    @Override // com.huami.account.service.UserInfoService
    @Nullable
    public HMBeanPersonInfo getPersonInfoFromServer() {
        return this.repository.fetchPersonInfoFromServer();
    }

    @Override // com.huami.account.service.UserInfoService
    public void navigateToNewUserGuide(@NotNull Context context, @Nullable Function0<Unit> finishedCallbacks) {
        NewUserGuideActivity.INSTANCE.start(context, finishedCallbacks);
    }

    @Override // com.huami.account.service.UserInfoService
    public void navigateToPersonInfo(@NotNull Context context, @Nullable Option option) {
        PersonInfoActivity.INSTANCE.start(context, option);
    }

    @Override // com.huami.account.service.UserInfoService
    @Nullable
    public Object updatePartOfPersonInfo(@NotNull Map<String, String> map, @NotNull Continuation<? super Boolean> continuation) {
        return this.repository.updatePartOfPersonInfo(map, continuation);
    }
}
