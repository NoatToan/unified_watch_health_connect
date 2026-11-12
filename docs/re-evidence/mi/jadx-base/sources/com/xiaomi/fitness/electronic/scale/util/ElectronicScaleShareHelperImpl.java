package com.xiaomi.fitness.electronic.scale.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequestExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelper;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.export.bean.ShareAccount;
import com.xiaomi.fitness.electronic.scale.export.bean.SharedUser;
import com.xiaomi.fitness.electronic.scale.util.ElectronicScaleShareHelperImpl;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.share.ui.DeviceShareActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J(\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\u001a\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/ElectronicScaleShareHelperImpl;", "Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleShareHelper;", "<init>", "()V", DeviceShareActivity.sPageShareList, "", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ShareAccount;", "isOwner", "", "checkSharedScale", "", "success", "Lkotlin/Function1;", "refreshShareToOtherList", "getShareAccount", "data", "updateShareStatus", "userId", "", "shareUserId", "shareId", "type", "", "offlineShareDevice", "checkAccountWhetherShared", "did", "full", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nElectronicScaleShareHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectronicScaleShareHelperImpl.kt\ncom/xiaomi/fitness/electronic/scale/util/ElectronicScaleShareHelperImpl\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,174:1\n29#2:175\n*S KotlinDebug\n*F\n+ 1 ElectronicScaleShareHelperImpl.kt\ncom/xiaomi/fitness/electronic/scale/util/ElectronicScaleShareHelperImpl\n*L\n79#1:175\n*E\n"})
public final class ElectronicScaleShareHelperImpl implements ElectronicScaleShareHelper {

    @NotNull
    public static final String TAG = "ElectronicScaleShareHelper";

    @Nullable
    private List<ShareAccount> shareList;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkSharedScale$lambda$0(ElectronicScaleShareHelperImpl this$0, Function1 success, ScaleData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d(TAG, "BindScaleRequest().getShareList, success it.resp: " + it.getResp());
        SharedUser sharedUser = (SharedUser) new Gson().fromJson(it.getResp(), SharedUser.class);
        List<ShareAccount> data = sharedUser != null ? sharedUser.getData() : null;
        List<ShareAccount> list = data;
        if (list == null || list.isEmpty()) {
            Logger.e(TAG, "BindScaleRequest().getShareList, data is empty");
            return Unit.INSTANCE;
        }
        ShareAccount shareAccount = this$0.getShareAccount(data);
        if (shareAccount == null) {
            return Unit.INSTANCE;
        }
        success.invoke2(shareAccount);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkSharedScale$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(TAG, "BindScaleRequest().getShareList, failed", it);
        return Unit.INSTANCE;
    }

    private final ShareAccount getShareAccount(List<ShareAccount> data) {
        Boolean bool = null;
        ShareAccount shareAccount = null;
        for (int size = data.size() - 1; -1 < size; size--) {
            ShareAccount shareAccount2 = data.get(size);
            if (shareAccount == null && shareAccount2.showShareDialog()) {
                Logger.d(TAG, "getShareAccount = " + shareAccount2);
                shareAccount = shareAccount2;
            }
            if (bool == null && !shareAccount2.isBondBoolean()) {
                bool = Boolean.TRUE;
            }
        }
        Intrinsics.areEqual(bool, Boolean.TRUE);
        return shareAccount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshShareToOtherList$lambda$2(ElectronicScaleShareHelperImpl this$0, ScaleData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        SharedUser sharedUser = (SharedUser) new Gson().fromJson(it.getResp(), new TypeToken<SharedUser>() { // from class: com.xiaomi.fitness.electronic.scale.util.ElectronicScaleShareHelperImpl$refreshShareToOtherList$lambda$2$$inlined$fromJson$1
        }.getType());
        List<ShareAccount> data = sharedUser != null ? sharedUser.getData() : null;
        this$0.shareList = data;
        List<ShareAccount> list = data;
        if (list != null && !list.isEmpty()) {
            return Unit.INSTANCE;
        }
        Logger.e(TAG, "BindScaleRequest().getShareList, share to other, data is empty");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshShareToOtherList$lambda$3(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(TAG, "BindScaleRequest().getShareList, share to other, failed", it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateShareStatus$lambda$4(ScaleData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DeviceManager.DefaultImpls.requestDeviceList$default(EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE), null, null, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateShareStatus$lambda$5(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelper
    public boolean checkAccountWhetherShared(@NotNull String userId, @Nullable String did) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        List<ShareAccount> list = this.shareList;
        if (list != null && !list.isEmpty()) {
            List<ShareAccount> list2 = this.shareList;
            Intrinsics.checkNotNull(list2);
            for (ShareAccount shareAccount : list2) {
                if (Intrinsics.areEqual(userId, shareAccount.getShareUserId()) && Intrinsics.areEqual(did, shareAccount.getDid())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelper
    public void checkSharedScale(@NotNull final Function1<? super ShareAccount, Unit> success) {
        Intrinsics.checkNotNullParameter(success, "success");
        if (offlineShareDevice()) {
            Logger.e(TAG, "checkSharedScale, offlineShareDevice == true");
        } else {
            ElectronicScaleRequest.DefaultImpls.getShareList$default(ElectronicScaleRequestExtKt.getInstance(ElectronicScaleRequest.INSTANCE), 0, null, new Function1() { // from class: t58
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ElectronicScaleShareHelperImpl.checkSharedScale$lambda$0(this.f34327a, success, (ScaleData) obj);
                }
            }, new Function1() { // from class: u58
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ElectronicScaleShareHelperImpl.checkSharedScale$lambda$1((ApiException) obj);
                }
            }, 3, null);
            refreshShareToOtherList();
        }
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelper
    public boolean full(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        List<ShareAccount> list = this.shareList;
        if (list != null) {
            Iterator<ShareAccount> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().getDid(), did)) {
                    i++;
                }
            }
            if (i >= 5) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelper
    public boolean isOwner() {
        List<ShareAccount> list;
        if (!offlineShareDevice() && (list = this.shareList) != null && !list.isEmpty()) {
            String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
            List<ShareAccount> list2 = this.shareList;
            Intrinsics.checkNotNull(list2);
            Iterator<ShareAccount> it = list2.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(userId, it.next().getUserId())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelper
    public boolean offlineShareDevice() {
        return false;
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelper
    public void refreshShareToOtherList() {
        ElectronicScaleRequest.DefaultImpls.getShareList$default(ElectronicScaleRequestExtKt.getInstance(ElectronicScaleRequest.INSTANCE), 1, null, new Function1() { // from class: v58
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ElectronicScaleShareHelperImpl.refreshShareToOtherList$lambda$2(this.f36494a, (ScaleData) obj);
            }
        }, new Function1() { // from class: w58
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ElectronicScaleShareHelperImpl.refreshShareToOtherList$lambda$3((ApiException) obj);
            }
        }, 2, null);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelper
    public void updateShareStatus(@NotNull String userId, @NotNull String shareUserId, @NotNull String shareId, int type) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(shareUserId, "shareUserId");
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        ElectronicScaleRequest.DefaultImpls.acceptShare$default(ElectronicScaleRequestExtKt.getInstance(ElectronicScaleRequest.INSTANCE), userId, shareUserId, shareId, type, null, new Function1() { // from class: x58
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ElectronicScaleShareHelperImpl.updateShareStatus$lambda$4((ScaleData) obj);
            }
        }, new Function1() { // from class: y58
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ElectronicScaleShareHelperImpl.updateShareStatus$lambda$5((String) obj);
            }
        }, 16, null);
    }
}
