package com.xiaomi.fitness.active.pk.util;

import android.app.Activity;
import android.content.Context;
import com.xiaomi.fitness.active.pk.net.model.GetInviteRecordUserDetailResult;
import com.xiaomi.fitness.active.pk.net.model.InviteRecordDetail;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.ozi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ&\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/active/pk/util/BusinessFailDealUtil;", "", "<init>", "()V", "dealAcceptOrRejectInviteFail", "", "context", "Landroid/content/Context;", "exception", "Lcom/xiaomi/fitness/net/response/ApiException;", "dealCreateInviteRecordFail", "dealGetInviteUserDetailFail", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "result", "Lcom/xiaomi/fitness/active/pk/net/model/GetInviteRecordUserDetailResult;", "pageCallback", "Lcom/xiaomi/fitness/active/pk/util/BusinessFailDealUtil$PageCallback;", "Lcom/xiaomi/fitness/active/pk/net/model/InviteRecordDetail;", "PageCallback", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BusinessFailDealUtil {

    @NotNull
    public static final BusinessFailDealUtil INSTANCE = new BusinessFailDealUtil();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/active/pk/util/BusinessFailDealUtil$PageCallback;", "T", "", "showSuccess", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "(Ljava/lang/Object;)V", "showFail", "showNerWorkError", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PageCallback<T> {
        void showFail();

        void showNerWorkError();

        void showSuccess(T t);
    }

    private BusinessFailDealUtil() {
    }

    public static /* synthetic */ void dealAcceptOrRejectInviteFail$default(BusinessFailDealUtil businessFailDealUtil, Context context, ApiException apiException, int i, Object obj) {
        if ((i & 1) != 0) {
            context = ApplicationExtKt.getApplication();
        }
        businessFailDealUtil.dealAcceptOrRejectInviteFail(context, apiException);
    }

    public static /* synthetic */ void dealCreateInviteRecordFail$default(BusinessFailDealUtil businessFailDealUtil, Context context, ApiException apiException, int i, Object obj) {
        if ((i & 1) != 0) {
            context = ApplicationExtKt.getApplication();
        }
        businessFailDealUtil.dealCreateInviteRecordFail(context, apiException);
    }

    public final void dealAcceptOrRejectInviteFail(@NotNull Context context, @NotNull ApiException exception) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exception, "exception");
        PkLogger.INSTANCE.e("dealAcceptOrRejectInviteFail", "code: " + exception.getErrorCode() + " message:" + exception.getMessage(), new Object[0]);
        switch (exception.getErrorCode()) {
            case 1001:
                ToastExtKt.toastLong(context, ozi.A);
                break;
            case 1002:
                ToastExtKt.toastLong(context, ozi.y);
                break;
            case 1003:
                ToastExtKt.toastLong(context, ozi.u);
                break;
            case 1004:
                ToastExtKt.toastShort(context, ozi.x);
                break;
            case 1005:
                ToastExtKt.toastShort(context, ozi.z);
                break;
            case 1006:
            case 1010:
            default:
                ToastExtKt.toastShort(context, ozi.common_hint_unkonwn_error);
                break;
            case 1007:
                ToastExtKt.toastShort(context, ozi.H);
                break;
            case 1008:
                ToastExtKt.toastShort(context, ozi.w);
                break;
            case 1009:
                ToastExtKt.toastShort(context, ozi.x);
                break;
            case 1011:
                ToastExtKt.toastShort(context, ozi.m);
                break;
        }
    }

    public final void dealCreateInviteRecordFail(@NotNull Context context, @NotNull ApiException exception) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exception, "exception");
        PkLogger.INSTANCE.e("dealCreateInviteRecordFail", "code: " + exception.getErrorCode() + " message:" + exception.getMessage(), new Object[0]);
        int errorCode = exception.getErrorCode();
        if (errorCode == 1001) {
            ToastExtKt.toastLong(context, ozi.C);
            return;
        }
        if (errorCode == 1002) {
            ToastExtKt.toastLong(context, ozi.y);
        } else if (errorCode != 1008) {
            ToastExtKt.toastShort(context, ozi.common_hint_unkonwn_error);
        } else {
            ToastExtKt.toastLong(context, ozi.w);
        }
    }

    public final void dealGetInviteUserDetailFail(@NotNull Activity activity, @NotNull GetInviteRecordUserDetailResult result, @NotNull PageCallback<InviteRecordDetail> pageCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(pageCallback, "pageCallback");
        PkLogger.INSTANCE.i("dealGetInviteUserDetailFail", "code: " + result.getCode() + " ", new Object[0]);
        int code = result.getCode();
        if (code == 1000) {
            pageCallback.showSuccess(result.getInviteRecordDetail());
            return;
        }
        if (code != 1011) {
            switch (code) {
                case 1003:
                case 1004:
                    break;
                case 1005:
                    LaunchExtKt.stateLaunchActivity(activity);
                    activity.finish();
                    break;
                default:
                    ToastExtKt.toastShort(activity, ozi.H);
                    break;
            }
            return;
        }
        pageCallback.showFail();
    }
}
