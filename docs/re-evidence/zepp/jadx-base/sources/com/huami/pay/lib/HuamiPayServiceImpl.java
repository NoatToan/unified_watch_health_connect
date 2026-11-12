package com.huami.pay.lib;

import android.app.Activity;
import com.huami.pay.lib.ali.AliPayApi;
import com.huami.pay.lib.google.GooglePayApi;
import com.huami.pay.lib.wechat.WeChatPayApi;
import com.huami.pay.service.HuamiPayService;
import com.huami.pay.service.PayChannel;
import com.huami.pay.service.PayProgress;
import com.huami.pay.service.ProductParam;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0016R$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/pay/lib/HuamiPayServiceImpl;", "Lcom/huami/pay/service/HuamiPayService;", "Landroid/app/Activity;", "activity", "Lcom/huami/pay/service/ProductParam;", "productParam", "", "pay", "Lkotlin/Function1;", "Lcom/huami/pay/service/PayProgress;", "progressListener", "setPayProgressListener", "a", "Lkotlin/jvm/functions/Function1;", "payProgressListener", "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
public final class HuamiPayServiceImpl implements HuamiPayService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function1<? super PayProgress, Unit> payProgressListener;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PayChannel.values().length];
            iArr[PayChannel.ALI_PAY.ordinal()] = 1;
            iArr[PayChannel.WECHAT_PAY.ordinal()] = 2;
            iArr[PayChannel.GOOGLE_PAY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.huami.pay.service.HuamiPayService
    public void pay(@NotNull Activity activity, @NotNull ProductParam productParam) {
        PayApi aliPayApi;
        Function1<? super PayProgress, Unit> function1 = this.payProgressListener;
        if (function1 != null) {
            function1.invoke(new PayProgress.Prepare(productParam.getChannel()));
        }
        int i = WhenMappings.$EnumSwitchMapping$0[productParam.getChannel().ordinal()];
        if (i == 1) {
            aliPayApi = new AliPayApi();
        } else if (i == 2) {
            aliPayApi = new WeChatPayApi();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            aliPayApi = new GooglePayApi();
        }
        aliPayApi.setListener(this.payProgressListener);
        aliPayApi.pay(new WeakReference<>(activity), productParam);
    }

    @Override // com.huami.pay.service.HuamiPayService
    public void setPayProgressListener(@NotNull Function1<? super PayProgress, Unit> progressListener) {
        this.payProgressListener = progressListener;
    }
}
