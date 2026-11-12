package com.xiaomi.hm.health.bodyfat.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R%\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00078F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "", "time", "", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "getLatestWeightInfos", "Landroidx/lifecycle/MutableLiveData;", "a", "Lkotlin/Lazy;", "getSelectWeightInfo", "()Landroidx/lifecycle/MutableLiveData;", "selectWeightInfo", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "b", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "getUserInfos", "()Lcom/xiaomi/hm/health/databases/model/UserInfos;", "setUserInfos", "(Lcom/xiaomi/hm/health/databases/model/UserInfos;)V", "userInfos", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BodyFatDetailsViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy selectWeightInfo = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private UserInfos userInfos;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<WeightInfos>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<WeightInfos> invoke() {
            return new MutableLiveData<>();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001e  */
    @NotNull
    public final List<WeightInfos> getLatestWeightInfos(long time) {
        boolean z;
        if (!(time > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        UserInfos userInfos = this.userInfos;
        if (userInfos != null) {
            z = (userInfos == null ? null : userInfos.getUserId()) != null;
        }
        if (z) {
            return WeightInfoRepository.INSTANCE.getInstance().getLatestBodyFatInfos(Long.parseLong(this.userInfos.getUserId()), time, 30);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @NotNull
    public final MutableLiveData<WeightInfos> getSelectWeightInfo() {
        return (MutableLiveData) this.selectWeightInfo.getValue();
    }

    @Nullable
    public final UserInfos getUserInfos() {
        return this.userInfos;
    }

    public final void setUserInfos(@Nullable UserInfos userInfos) {
        this.userInfos = userInfos;
    }
}
