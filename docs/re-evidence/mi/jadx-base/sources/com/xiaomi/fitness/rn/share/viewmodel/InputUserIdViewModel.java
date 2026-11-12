package com.xiaomi.fitness.rn.share.viewmodel;

import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.rn.share.bean.UserBean;
import com.xiaomi.fitness.rn.share.request.AccountProfileRequest;
import com.xiaomi.fitness.rn.share.viewmodel.InputUserIdViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/rn/share/viewmodel/InputUserIdViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "getUserProfile", "", "input", "", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/rn/share/bean/UserBean;", "error", "Lkotlin/Function0;", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InputUserIdViewModel extends AbsViewModel {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserProfile$lambda$0(Function1 success, UserBean it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new InputUserIdViewModel$getUserProfile$1$1(success, it, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserProfile$lambda$1(Function0 error) {
        Intrinsics.checkNotNullParameter(error, "$error");
        AnyExtKt.main$default(null, new InputUserIdViewModel$getUserProfile$2$1(error, null), 1, null);
        return Unit.INSTANCE;
    }

    public final void getUserProfile(@NotNull String input, @NotNull final Function1<? super UserBean, Unit> success, @NotNull final Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new AccountProfileRequest().getUserProfile(input, new Function1() { // from class: dbd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return InputUserIdViewModel.getUserProfile$lambda$0(success, (UserBean) obj);
            }
        }, new Function0() { // from class: ebd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputUserIdViewModel.getUserProfile$lambda$1(error);
            }
        });
    }
}
