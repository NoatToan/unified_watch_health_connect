package com.xiaomi.hm.health.bodyfat.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R'\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fRu\u0010\u0016\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u0012 \u0013*\u0012\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u0012\u0018\u00010\n0\u0011 \u0013*.\u0012(\u0012&\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u0012 \u0013*\u0012\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u0012\u0018\u00010\n0\u0011\u0018\u00010\t0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR!\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007R\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u001c\u0010\u0007¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/BalanceDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Landroidx/lifecycle/MutableLiveData;", "getUid", "()Landroidx/lifecycle/MutableLiveData;", "uid", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "b", "Landroidx/lifecycle/LiveData;", "getWeightInfos", "()Landroidx/lifecycle/LiveData;", "weightInfos", "", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "kotlin.jvm.PlatformType", "c", "getUserInfos", "userInfos", GoogleApiAvailabilityLight.a, "getSelectData", "selectData", "", "e", "getDeleteEnable", "deleteEnable", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BalanceDetailViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> uid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<WeightInfos>> weightInfos;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LiveData<List<UserInfos>> userInfos;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<WeightInfos> selectData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> deleteEnable;

    public BalanceDetailViewModel() {
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this.uid = mutableLiveData;
        this.weightInfos = Transformations.switchMap(mutableLiveData, new Function<Long, LiveData<List<? extends WeightInfos>>>() { // from class: com.xiaomi.hm.health.bodyfat.viewmodel.BalanceDetailViewModel$special$$inlined$switchMap$1
            @Override // androidx.arch.core.util.Function
            @NotNull
            public final LiveData<List<? extends WeightInfos>> apply(Long l) {
                return WeightInfoRepository.INSTANCE.getInstance().getWeightInfosBalance(l.longValue());
            }
        });
        this.userInfos = UserInfoManager.getManager().getAllUserInfos();
        this.selectData = new MutableLiveData<>();
        this.deleteEnable = new MutableLiveData<>();
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeleteEnable() {
        return this.deleteEnable;
    }

    @NotNull
    public final MutableLiveData<WeightInfos> getSelectData() {
        return this.selectData;
    }

    @NotNull
    public final MutableLiveData<Long> getUid() {
        return this.uid;
    }

    public final LiveData<List<UserInfos>> getUserInfos() {
        return this.userInfos;
    }

    @NotNull
    public final LiveData<List<WeightInfos>> getWeightInfos() {
        return this.weightInfos;
    }
}
