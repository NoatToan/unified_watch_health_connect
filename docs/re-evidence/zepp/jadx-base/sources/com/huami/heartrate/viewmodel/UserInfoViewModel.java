package com.huami.heartrate.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.heartrate.model.UserOfHeartRate;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/heartrate/viewmodel/UserInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/heartrate/model/UserOfHeartRate;", "a", "Lkotlin/Lazy;", "getUserInfoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "userInfoLiveData", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class UserInfoViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfoLiveData = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/heartrate/model/UserOfHeartRate;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<UserOfHeartRate>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<UserOfHeartRate> invoke() {
            return new MutableLiveData<>();
        }
    }

    @NotNull
    public final MutableLiveData<UserOfHeartRate> getUserInfoLiveData() {
        return (MutableLiveData) this.userInfoLiveData.getValue();
    }
}
