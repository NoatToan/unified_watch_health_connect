package com.xiaomi.hm.health.bodyfat.manager;

import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.UserScaleInfo;
import com.xiaomi.hm.health.databases.model.UserScaleInfoDao;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006J\u0014\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ\u0010\u0010\u000e\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/manager/UserScaleInfoRepository;", "", "Lcom/xiaomi/hm/health/databases/model/UserScaleInfoDao;", "a", "", "id", "Lcom/xiaomi/hm/health/databases/model/UserScaleInfo;", "getUserScaleInfoById", "info", "", "addOrUpdateUserScaleInfo", "", "infos", "addUserScaleInfos", "deleteUserScaleInfoById", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class UserScaleInfoRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile UserScaleInfoRepository a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/manager/UserScaleInfoRepository$Companion;", "", "Lcom/xiaomi/hm/health/bodyfat/manager/UserScaleInfoRepository;", "getInstance", DefaultSettingsSpiCall.n, "Lcom/xiaomi/hm/health/bodyfat/manager/UserScaleInfoRepository;", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UserScaleInfoRepository getInstance() {
            UserScaleInfoRepository userScaleInfoRepository = UserScaleInfoRepository.a;
            if (userScaleInfoRepository == null) {
                synchronized (this) {
                    userScaleInfoRepository = UserScaleInfoRepository.a;
                    if (userScaleInfoRepository == null) {
                        userScaleInfoRepository = new UserScaleInfoRepository();
                        Companion companion = UserScaleInfoRepository.INSTANCE;
                        UserScaleInfoRepository.a = userScaleInfoRepository;
                    }
                }
            }
            return userScaleInfoRepository;
        }
    }

    private final UserScaleInfoDao a() {
        return HMDaoManager.getInstance().getUserScaleInfoDao();
    }

    public final void addOrUpdateUserScaleInfo(@NotNull UserScaleInfo info) {
        if (HMWeightUtils.isSelf(info.getId())) {
            info.setId(EcgData.DEFAULT_DIGIT_VALUE);
        }
        a().insertOrReplace(info);
    }

    public final void addUserScaleInfos(@NotNull List<? extends UserScaleInfo> infos) {
        for (UserScaleInfo userScaleInfo : infos) {
            if (HMWeightUtils.isSelf(userScaleInfo.getId())) {
                userScaleInfo.setId(EcgData.DEFAULT_DIGIT_VALUE);
            }
        }
        a().insertOrReplaceInTx(infos);
    }

    public final void deleteUserScaleInfoById(@Nullable String id) {
        if (id == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (HMWeightUtils.isSelf(id)) {
            a().deleteByKey(EcgData.DEFAULT_DIGIT_VALUE);
        } else {
            a().deleteByKey(id);
        }
    }

    @Nullable
    public final UserScaleInfo getUserScaleInfoById(@NotNull String id) {
        return HMWeightUtils.isSelf(id) ? a().queryBuilder().where(UserScaleInfoDao.Properties.Id.eq(-1L), new WhereCondition[0]).unique() : a().queryBuilder().where(UserScaleInfoDao.Properties.Id.eq(id), new WhereCondition[0]).unique();
    }
}
