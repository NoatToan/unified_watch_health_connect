package com.xiaomi.fitness.electronic.scale;

import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.electronic.scale.ShareMemberViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/ShareMemberViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "startAddShareActivity", "baseContext", "Lcom/xiaomi/fitness/electronic/scale/ShareMemberActivity;", "did", "", "addSuccessCallback", "Lcom/xiaomi/fitness/electronic/scale/ShareMemberViewModel$AddSuccessCallback;", "AddSuccessCallback", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareMemberViewModel extends AbsViewModel {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/ShareMemberViewModel$AddSuccessCallback;", "", "onAddSuccess", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AddSuccessCallback {
        void onAddSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startAddShareActivity$lambda$0(AddSuccessCallback addSuccessCallback, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(addSuccessCallback, "$addSuccessCallback");
        addSuccessCallback.onAddSuccess();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void startAddShareActivity(@NotNull ShareMemberActivity baseContext, @NotNull String did, @NotNull final AddSuccessCallback addSuccessCallback) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(addSuccessCallback, "addSuccessCallback");
        Intent intent = new Intent(baseContext, (Class<?>) AddShareActivity.class);
        intent.putExtra("DEVICE_DID", did);
        baseContext.startForActivityResult(intent, new Function2() { // from class: x5m
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ShareMemberViewModel.startAddShareActivity$lambda$0(addSuccessCallback, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }
}
