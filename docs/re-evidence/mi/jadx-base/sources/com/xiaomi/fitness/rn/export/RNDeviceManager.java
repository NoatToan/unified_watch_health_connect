package com.xiaomi.fitness.rn.export;

import android.content.Intent;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.device.manager.BaseDeviceManager;
import com.xiaomi.fitness.net.response.ApiException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&JC\u0010\t\u001a\u00020\u00062\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\b`\u000b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000eH&¢\u0006\u0002\u0010\u0010J[\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0015`\u000b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000eH&¢\u0006\u0002\u0010\u0016J[\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0015`\u000b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000eH&¢\u0006\u0002\u0010\u0016JC\u0010\u0018\u001a\u00020\u00062\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\b`\u000b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000eH&¢\u0006\u0002\u0010\u0010JK\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\b2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0015`\u000b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000eH&¢\u0006\u0002\u0010\u001bJ \u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H&¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/rn/export/RNDeviceManager;", "Lcom/xiaomi/fitness/device/manager/BaseDeviceManager;", "Lcom/xiaomi/fitness/rn/export/RNDeviceModel;", "<init>", "()V", "openPlugin", "", "did", "", "getBindKey", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "revokePrivacy", "privacyId", "", "privacyVersion", "", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "acceptPrivacy", "getCommonConfig", "setCommonConfig", "value", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "revokeSuccessResult", "result", AccountInteractActivity.KEY_REQUEST_CODE, "data", "Landroid/content/Intent;", "Companion", "export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RNDeviceManager extends BaseDeviceManager<RNDeviceModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/rn/export/RNDeviceManager$Companion;", "", "<init>", "()V", "export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract void acceptPrivacy(@NotNull String did, int privacyId, @NotNull String privacyVersion, @NotNull Function1<? super Boolean, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail);

    public abstract void getBindKey(@NotNull Function1<? super String, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail);

    public abstract void getCommonConfig(@NotNull Function1<? super String, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail);

    public abstract void openPlugin(@NotNull String did);

    public abstract void revokePrivacy(@NotNull String did, int privacyId, @NotNull String privacyVersion, @NotNull Function1<? super Boolean, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail);

    public abstract void revokeSuccessResult(int result, int requestCode, @NotNull Intent data);

    public abstract void setCommonConfig(@NotNull String value, @NotNull Function1<? super Boolean, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail);
}
