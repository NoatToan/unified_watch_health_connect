package com.xiaomi.fitness.electronic.scale;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.electronic.scale.AddShareViewModel;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequestExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.AccountExist;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/AddShareViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "checkAccountExist", "baseContext", "Lcom/xiaomi/fitness/electronic/scale/AddShareActivity;", "userId", "", "did", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddShareViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddShareViewModel.kt\ncom/xiaomi/fitness/electronic/scale/AddShareViewModel\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,70:1\n29#2:71\n*S KotlinDebug\n*F\n+ 1 AddShareViewModel.kt\ncom/xiaomi/fitness/electronic/scale/AddShareViewModel\n*L\n44#1:71\n*E\n"})
public final class AddShareViewModel extends AbsViewModel {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAccountExist$lambda$1(final AddShareActivity baseContext, String str, ScaleData it) {
        Intrinsics.checkNotNullParameter(baseContext, "$baseContext");
        Intrinsics.checkNotNullParameter(it, "it");
        AccountExist accountExist = (AccountExist) new Gson().fromJson(it.getResp(), new TypeToken<AccountExist>() { // from class: com.xiaomi.fitness.electronic.scale.AddShareViewModel$checkAccountExist$lambda$1$$inlined$fromJson$1
        }.getType());
        if (!accountExist.accountExist()) {
            String string = baseContext.getString(zzi.h);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(baseContext, string);
            baseContext.hideLoading();
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(accountExist.getData(), AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId())) {
            String string2 = baseContext.getString(zzi.Y4);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            ToastExtKt.toastShort(baseContext, string2);
            baseContext.hideLoading();
            return Unit.INSTANCE;
        }
        Intent intent = new Intent(baseContext, (Class<?>) ShareConfirmActivity.class);
        intent.putExtra(ShareConfirmActivity.USER_ID, accountExist.getData());
        intent.putExtra("DEVICE_DID", str);
        baseContext.startForActivityResult(intent, new Function2() { // from class: pt0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AddShareViewModel.checkAccountExist$lambda$1$lambda$0(baseContext, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
        baseContext.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAccountExist$lambda$1$lambda$0(AddShareActivity baseContext, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(baseContext, "$baseContext");
        baseContext.setResult(-1, new Intent());
        baseContext.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAccountExist$lambda$2(AddShareActivity baseContext, ApiException it) {
        Intrinsics.checkNotNullParameter(baseContext, "$baseContext");
        Intrinsics.checkNotNullParameter(it, "it");
        baseContext.hideLoading();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void checkAccountExist(@NotNull final AddShareActivity baseContext, @Nullable CharSequence userId, @Nullable final String did) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        if (TextUtils.isEmpty(userId)) {
            String string = baseContext.getString(zzi.X4);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(baseContext, string);
        } else if (NetworkExtKt.isNetworkAvailable()) {
            baseContext.showLoading();
            ElectronicScaleRequestExtKt.getInstance(ElectronicScaleRequest.INSTANCE).checkAccountWhetherExist(String.valueOf(userId), ViewModelKt.getViewModelScope(this), new Function1() { // from class: qt0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AddShareViewModel.checkAccountExist$lambda$1(baseContext, did, (ScaleData) obj);
                }
            }, new Function1() { // from class: rt0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AddShareViewModel.checkAccountExist$lambda$2(baseContext, (ApiException) obj);
                }
            });
        } else {
            String string2 = baseContext.getString(zzi.e4);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            ToastExtKt.toastShort(baseContext, string2);
        }
    }
}
