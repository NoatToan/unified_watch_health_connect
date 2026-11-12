package com.huami.third.wechat.ui;

import androidx.fragment.app.FragmentActivity;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bRF\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u000f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/huami/third/wechat/ui/WeChatParams;", "", "", "getSupportWatch", "()Z", "supportWatch", "Lcom/huami/third/wechat/ui/LoadingView;", "getLoadingView", "()Lcom/huami/third/wechat/ui/LoadingView;", "loadingView", "Lkotlin/Function2;", "Landroidx/fragment/app/FragmentActivity;", "Lkotlin/ParameterName;", "name", "activity", "", "content", "", "getSendQRToWatchFunc", "()Lkotlin/jvm/functions/Function2;", "sendQRToWatchFunc", "getAppID", "()Ljava/lang/String;", SDKConstants.PARAM_APP_ID, "", "getBindSuccessImg", "()Ljava/lang/Integer;", "bindSuccessImg", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public interface WeChatParams {
    @NotNull
    String getAppID();

    @Nullable
    Integer getBindSuccessImg();

    @NotNull
    LoadingView getLoadingView();

    @NotNull
    Function2<FragmentActivity, String, Unit> getSendQRToWatchFunc();

    boolean getSupportWatch();
}
