package com.huami.account.di;

import com.huami.account.service.AnonymousInfo;
import com.huami.account.service.AnonymousInfoManager;
import com.huami.account.service.AreaService;
import com.huami.account.service.model.Area;
import com.huami.account.ui.areas.SelectAreaHelper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/account/di/AreaServiceImpl;", "Lcom/huami/account/service/AreaService;", "", "userRegionOrThrow", "userCountryCode", "Lcom/huami/account/service/model/Area;", "getUserArea", "getUserOrDeviceArea", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AreaServiceImpl implements AreaService {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            com.huami.passport.entity.LoginToken loginToken = LoginToken.INSTANCE.getLoginToken();
            if (loginToken == null) {
                return null;
            }
            return loginToken.getRegion();
        }
    }

    @Override // com.huami.account.service.AreaService
    @NotNull
    public Area getUserArea() {
        return SelectAreaHelper.getAreaBySave();
    }

    @Override // com.huami.account.service.AreaService
    @NotNull
    public Area getUserOrDeviceArea() {
        return SelectAreaHelper.getArea();
    }

    @Override // com.huami.account.service.AreaService
    @NotNull
    public String userCountryCode() {
        return SelectAreaHelper.getAreaBySave().getValue();
    }

    @Override // com.huami.account.service.AreaService
    @NotNull
    public String userRegionOrThrow() {
        AnonymousInfo anonymousInfo = AnonymousInfoManager.getAnonymousInfo();
        return anonymousInfo != null ? anonymousInfo.getRegion() : (String) LoginToken.INSTANCE.checkLoginState(a.a);
    }
}
