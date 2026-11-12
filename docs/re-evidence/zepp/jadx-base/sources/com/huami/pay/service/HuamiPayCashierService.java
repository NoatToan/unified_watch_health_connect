package com.huami.pay.service;

import android.app.Activity;
import androidx.annotation.StyleRes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\b2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b0\u000bH&J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H&¨\u0006\u0016"}, d2 = {"Lcom/huami/pay/service/HuamiPayCashierService;", "", "Landroid/app/Activity;", "activity", "Lcom/huami/pay/service/ProductCashierParam;", "productCashierParam", "", "payCashierTheme", "", "payCashier", "(Landroid/app/Activity;Lcom/huami/pay/service/ProductCashierParam;Ljava/lang/Integer;)V", "Lkotlin/Function1;", "Lcom/huami/pay/service/PayProgress;", "Lkotlin/ParameterName;", "name", "payProgress", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setPayProgressListener", "Lcom/huami/pay/service/PayResult;", "payResult", "", "getResultMessage", "pay-service_release"}, k = 1, mv = {1, 5, 1})
public interface HuamiPayCashierService {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void payCashier$default(HuamiPayCashierService huamiPayCashierService, Activity activity, ProductCashierParam productCashierParam, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: payCashier");
            }
            if ((i & 4) != 0) {
                num = null;
            }
            huamiPayCashierService.payCashier(activity, productCashierParam, num);
        }
    }

    @NotNull
    String getResultMessage(@NotNull PayResult payResult);

    void payCashier(@NotNull Activity activity, @NotNull ProductCashierParam productCashierParam, @StyleRes @Nullable Integer payCashierTheme);

    void setPayProgressListener(@NotNull Function1<? super PayProgress, Unit> listener);
}
