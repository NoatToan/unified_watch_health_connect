package com.xiaomi.fitness.rn.share.viewmodel;

import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.rn.share.bean.UserListBean;
import com.xiaomi.fitness.rn.share.request.MijiaRequest;
import com.xiaomi.fitness.rn.share.viewmodel.DeviceShareDetailViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00050\t28\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00050\u0010Jd\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\t28\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00050\u0010¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/rn/share/viewmodel/DeviceShareDetailViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "loadDeviceShareList", "", "did", "", "success", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/rn/share/bean/UserListBean;", "Lkotlin/ParameterName;", "name", "userList", "error", "Lkotlin/Function2;", "", "code", "msg", "deleteShareUser", "userListBean", "", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceShareDetailViewModel extends AbsViewModel {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteShareUser$lambda$2(Function1 success, boolean z) {
        Intrinsics.checkNotNullParameter(success, "$success");
        AnyExtKt.main$default(null, new DeviceShareDetailViewModel$deleteShareUser$1$1(success, z, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteShareUser$lambda$3(Function2 error, int i, String str) {
        Intrinsics.checkNotNullParameter(error, "$error");
        AnyExtKt.main$default(null, new DeviceShareDetailViewModel$deleteShareUser$2$1(error, i, str, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDeviceShareList$lambda$0(Function1 success, List it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new DeviceShareDetailViewModel$loadDeviceShareList$1$1(success, it, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDeviceShareList$lambda$1(Function2 error, int i, String str) {
        Intrinsics.checkNotNullParameter(error, "$error");
        AnyExtKt.main$default(null, new DeviceShareDetailViewModel$loadDeviceShareList$2$1(error, i, str, null), 1, null);
        return Unit.INSTANCE;
    }

    public final void deleteShareUser(@NotNull String did, @NotNull UserListBean userListBean, @NotNull final Function1<? super Boolean, Unit> success, @NotNull final Function2<? super Integer, ? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(userListBean, "userListBean");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        MijiaRequest.INSTANCE.deleteShare(did, userListBean.getUserid(), new Function1() { // from class: io6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceShareDetailViewModel.deleteShareUser$lambda$2(success, ((Boolean) obj).booleanValue());
            }
        }, new Function2() { // from class: jo6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceShareDetailViewModel.deleteShareUser$lambda$3(error, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    public final void loadDeviceShareList(@NotNull String did, @NotNull final Function1<? super List<UserListBean>, Unit> success, @NotNull final Function2<? super Integer, ? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        MijiaRequest.INSTANCE.loadDeviceShareList(did, new Function1() { // from class: go6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceShareDetailViewModel.loadDeviceShareList$lambda$0(success, (List) obj);
            }
        }, new Function2() { // from class: ho6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceShareDetailViewModel.loadDeviceShareList$lambda$1(error, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }
}
