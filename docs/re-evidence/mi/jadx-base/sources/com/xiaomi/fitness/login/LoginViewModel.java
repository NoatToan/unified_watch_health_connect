package com.xiaomi.fitness.login;

import android.os.Bundle;
import com.xiaomi.fitness.baseui.BaseViewModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/login/LoginViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/login/LoginModel;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoginViewModel extends BaseViewModel<LoginModel> {

    @NotNull
    public static final String MODE_AUTO = "auto";

    @NotNull
    private final String TAG = "LoginViewModel";

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return this.TAG;
    }
}
