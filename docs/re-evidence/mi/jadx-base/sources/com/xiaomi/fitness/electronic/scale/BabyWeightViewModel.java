package com.xiaomi.fitness.electronic.scale;

import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.electronic.scale.BabyWeightViewModel;
import com.xiaomi.fitness.electronic.scale.export.bean.ProxyResponse;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.manager.MiAccountManager;
import com.xiaomi.fitness.electronic.scale.manager.WeightManager;
import com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel;
import com.xiaomi.fitness.electronic.scale.request.ScaleRequest;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.f4b;
import defpackage.fx7;
import defpackage.jx7;
import defpackage.kx7;
import defpackage.u7r;
import defpackage.ww7;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J.\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 J\u001e\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/BabyWeightViewModel;", "Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel;", "<init>", "()V", "mapVirtualAccount", "", "", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "getMapVirtualAccount", "()Ljava/util/Map;", "setMapVirtualAccount", "(Ljava/util/Map;)V", "virtualUserCount", "", "getVirtualUserCount", "()I", "setVirtualUserCount", "(I)V", "TAG", "", "getAllVirtualAccount", "", "did", "onVirtualAccountListener", "Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel$OnVirtualAccountListener;", "updateVirtualUserToDevice", "virtualId", "deviceId", "weight", "", "unit", "onSyncCallback", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "getVirtualAccountByVirtualId", "initVirtualAccount", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBabyWeightViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BabyWeightViewModel.kt\ncom/xiaomi/fitness/electronic/scale/BabyWeightViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1863#2,2:149\n1863#2,2:151\n1863#2,2:153\n*S KotlinDebug\n*F\n+ 1 BabyWeightViewModel.kt\ncom/xiaomi/fitness/electronic/scale/BabyWeightViewModel\n*L\n42#1:149,2\n110#1:151,2\n135#1:153,2\n*E\n"})
public final class BabyWeightViewModel extends ElectronicScaleBaseViewModel {
    private int virtualUserCount;

    @NotNull
    private Map<Long, VirtualAccount> mapVirtualAccount = new LinkedHashMap();

    @NotNull
    private final String TAG = "BabyWeightViewModel";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAllVirtualAccount$lambda$1(BabyWeightViewModel this$0, ElectronicScaleBaseViewModel.OnVirtualAccountListener onVirtualAccountListener, ProxyResponse it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onVirtualAccountListener, "$onVirtualAccountListener");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "initVirtualAccount it " + f4b.c(it));
        List<VirtualAccount> list = (List) it.getResult();
        if (list != null) {
            for (VirtualAccount virtualAccount : list) {
                this$0.mapVirtualAccount.put(Long.valueOf(Long.parseLong(String.valueOf(virtualAccount.getAccountId()).subSequence(0, 12).toString())), virtualAccount);
                onVirtualAccountListener.onVirtualAccount(virtualAccount);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAllVirtualAccount$lambda$2(BabyWeightViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "initVirtualAccount it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x005c  */
    public static final Unit getVirtualAccountByVirtualId$lambda$4(ElectronicScaleBaseViewModel.OnVirtualAccountListener onVirtualAccountListener, BabyWeightViewModel this$0, long j, ProxyResponse it) {
        Intrinsics.checkNotNullParameter(onVirtualAccountListener, "$onVirtualAccountListener");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        List<VirtualAccount> list = (List) it.getResult();
        if (list != null) {
            boolean z = false;
            for (VirtualAccount virtualAccount : list) {
                Logger.i(this$0.TAG, "handleWeight getVirtualAccount it " + virtualAccount);
                this$0.mapVirtualAccount.put(Long.valueOf(virtualAccount.getAccountId()), virtualAccount);
                if (virtualAccount.getAccountId() == j) {
                    onVirtualAccountListener.onVirtualAccount(virtualAccount);
                    z = true;
                }
            }
            if (!z) {
                onVirtualAccountListener.onNoVirtualAccount();
            }
        } else {
            onVirtualAccountListener.onNoVirtualAccount();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getVirtualAccountByVirtualId$lambda$5(BabyWeightViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "getVirtualAccount it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initVirtualAccount$lambda$7(BabyWeightViewModel this$0, ProxyResponse it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        List<VirtualAccount> list = (List) it.getResult();
        if (list != null) {
            for (VirtualAccount virtualAccount : list) {
                this$0.mapVirtualAccount.put(Long.valueOf(virtualAccount.getAccountId()), virtualAccount);
            }
        }
        List list2 = (List) it.getResult();
        Integer numValueOf = list2 != null ? Integer.valueOf(list2.size()) : null;
        Intrinsics.checkNotNull(numValueOf);
        this$0.virtualUserCount = numValueOf.intValue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initVirtualAccount$lambda$8(BabyWeightViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "initVirtualAccount it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    public final void getAllVirtualAccount(@NotNull String did, @NotNull final ElectronicScaleBaseViewModel.OnVirtualAccountListener onVirtualAccountListener) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onVirtualAccountListener, "onVirtualAccountListener");
        new ScaleRequest().getVirtualAccount(ViewModelKt.getViewModelScope(this), Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), did, new Function1() { // from class: vw1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BabyWeightViewModel.getAllVirtualAccount$lambda$1(this.f37283a, onVirtualAccountListener, (ProxyResponse) obj);
            }
        }, new Function1() { // from class: ww1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BabyWeightViewModel.getAllVirtualAccount$lambda$2(this.f38415a, (ApiException) obj);
            }
        });
    }

    @NotNull
    public final Map<Long, VirtualAccount> getMapVirtualAccount() {
        return this.mapVirtualAccount;
    }

    public final void getVirtualAccountByVirtualId(@NotNull String did, final long virtualId, @NotNull final ElectronicScaleBaseViewModel.OnVirtualAccountListener onVirtualAccountListener) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onVirtualAccountListener, "onVirtualAccountListener");
        Logger.i(this.TAG, "handleWeight getVirtualAccount virtualId " + virtualId);
        if (this.mapVirtualAccount.get(Long.valueOf(virtualId)) == null) {
            new ScaleRequest().getVirtualAccount(ViewModelKt.getViewModelScope(this), Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), did, new Function1() { // from class: zw1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BabyWeightViewModel.getVirtualAccountByVirtualId$lambda$4(onVirtualAccountListener, this, virtualId, (ProxyResponse) obj);
                }
            }, new Function1() { // from class: ax1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BabyWeightViewModel.getVirtualAccountByVirtualId$lambda$5(this.f3529a, (ApiException) obj);
                }
            });
            return;
        }
        String str = this.TAG;
        VirtualAccount virtualAccount = this.mapVirtualAccount.get(Long.valueOf(virtualId));
        Intrinsics.checkNotNull(virtualAccount);
        Logger.i(str, "handleWeight getVirtualAccount mapVirtualAccount " + virtualAccount);
        VirtualAccount virtualAccount2 = this.mapVirtualAccount.get(Long.valueOf(virtualId));
        Intrinsics.checkNotNull(virtualAccount2);
        onVirtualAccountListener.onVirtualAccount(virtualAccount2);
    }

    public final int getVirtualUserCount() {
        return this.virtualUserCount;
    }

    public final void initVirtualAccount(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        new ScaleRequest().getVirtualAccount(ViewModelKt.getViewModelScope(this), Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), did, new Function1() { // from class: xw1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BabyWeightViewModel.initVirtualAccount$lambda$7(this.f39523a, (ProxyResponse) obj);
            }
        }, new Function1() { // from class: yw1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BabyWeightViewModel.initVirtualAccount$lambda$8(this.f40631a, (ApiException) obj);
            }
        });
    }

    public final void setMapVirtualAccount(@NotNull Map<Long, VirtualAccount> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.mapVirtualAccount = map;
    }

    public final void setVirtualUserCount(int i) {
        this.virtualUserCount = i;
    }

    public final void updateVirtualUserToDevice(long virtualId, @NotNull String deviceId, float weight, int unit, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 0;
        ww7 ww7Var = new ww7();
        fx7 fx7Var = new fx7();
        jx7 jx7Var = new jx7();
        jx7Var.c = Long.parseLong(MiAccountManager.INSTANCE.getInstance().getMiId());
        fx7Var.c = jx7Var;
        kx7 kx7Var = new kx7();
        kx7Var.c = virtualId;
        fx7Var.d = kx7Var;
        fx7Var.g = 0;
        fx7Var.f = 0;
        fx7Var.e = 1;
        fx7Var.h = 0;
        fx7Var.i = (int) (WeightManager.INSTANCE.getInstance().convertToKg(weight, unit) * 10);
        ww7Var.F(fx7Var);
        u7rVar.D(ww7Var);
        Logger.i(this.TAG, "syncVirtualUser addOrUpdateVirtualUserToDevice pack: " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceId, u7rVar, true, onSyncCallback, 2000);
    }
}
