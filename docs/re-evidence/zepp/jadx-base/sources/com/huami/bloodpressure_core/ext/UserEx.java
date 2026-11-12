package com.huami.bloodpressure_core.ext;

import com.huami.bloodpressure_core.user.WeakUserInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.QualifierKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/bloodpressure_core/ext/UserEx;", "Lorg/koin/core/component/KoinComponent;", "", "getUserCreateTime", "", "getUserId", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class UserEx implements KoinComponent {

    @NotNull
    public static final UserEx INSTANCE = new UserEx();

    private UserEx() {
    }

    @JvmStatic
    public static final long getUserCreateTime() {
        Long createTime = ((WeakUserInfo) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WeakUserInfo.class), QualifierKt.named(UserExKt.getWEAK_NAME_USERINFO()), null)).getCreateTime();
        return createTime == null ? System.currentTimeMillis() : createTime.longValue();
    }

    @JvmStatic
    @NotNull
    public static final String getUserId() {
        String userId = ((WeakUserInfo) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WeakUserInfo.class), QualifierKt.named(UserExKt.getWEAK_NAME_USERINFO()), null)).getUserId();
        return userId == null ? "" : userId;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
