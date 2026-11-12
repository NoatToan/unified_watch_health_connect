package com.xiaomi.fitness.electronic.scale;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.electronic.scale.ShareConfirmViewModel;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequestExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.AccountExist;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ>\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/ShareConfirmViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "checkAccountWhetherShared", "", "baseContext", "Landroid/content/Context;", "userId", "", "did", "createShare", "success", "Lkotlin/Function0;", "error", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShareConfirmViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareConfirmViewModel.kt\ncom/xiaomi/fitness/electronic/scale/ShareConfirmViewModel\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,63:1\n29#2:64\n*S KotlinDebug\n*F\n+ 1 ShareConfirmViewModel.kt\ncom/xiaomi/fitness/electronic/scale/ShareConfirmViewModel\n*L\n47#1:64\n*E\n"})
public final class ShareConfirmViewModel extends AbsViewModel {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createShare$lambda$0(Context baseContext, Function0 success, Function0 error, ScaleData it) {
        Intrinsics.checkNotNullParameter(baseContext, "$baseContext");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("createShare success " + it.getResp(), new Object[0]);
        if (((AccountExist) new Gson().fromJson(it.getResp(), new TypeToken<AccountExist>() { // from class: com.xiaomi.fitness.electronic.scale.ShareConfirmViewModel$createShare$lambda$0$$inlined$fromJson$1
        }.getType())).getCode() == 200) {
            String string = baseContext.getString(zzi.j);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(baseContext, string);
            success.invoke();
            ElectronicScaleShareHelperExtKt.getInstance(ElectronicScaleShareHelper.INSTANCE).refreshShareToOtherList();
        } else {
            String string2 = baseContext.getString(zzi.i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            ToastExtKt.toastShort(baseContext, string2);
            error.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createShare$lambda$1(Context baseContext, Function0 error, ApiException it) {
        Intrinsics.checkNotNullParameter(baseContext, "$baseContext");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e("createShare error", it);
        String string = baseContext.getString(zzi.i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ToastExtKt.toastShort(baseContext, string);
        error.invoke();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final boolean checkAccountWhetherShared(@NotNull Context baseContext, @NotNull String userId, @Nullable String did) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        Intrinsics.checkNotNullParameter(userId, "userId");
        if (!ElectronicScaleShareHelperExtKt.getInstance(ElectronicScaleShareHelper.INSTANCE).checkAccountWhetherShared(userId, did)) {
            return false;
        }
        String string = baseContext.getString(zzi.f);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ToastExtKt.toastShort(baseContext, string);
        return true;
    }

    public final void createShare(@NotNull final Context baseContext, @Nullable String userId, @Nullable String did, @NotNull final Function0<Unit> success, @NotNull final Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        ElectronicScaleRequestExtKt.getInstance(ElectronicScaleRequest.INSTANCE).createShare(userId, did, ViewModelKt.getViewModelScope(this), new Function1() { // from class: a5m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareConfirmViewModel.createShare$lambda$0(baseContext, success, error, (ScaleData) obj);
            }
        }, new Function1() { // from class: b5m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareConfirmViewModel.createShare$lambda$1(baseContext, error, (ApiException) obj);
            }
        });
    }
}
