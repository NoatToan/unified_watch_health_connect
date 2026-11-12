package com.xiaomi.fitness.electronic.scale;

import android.os.Bundle;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel;
import defpackage.fx7;
import defpackage.jx7;
import defpackage.kx7;
import defpackage.t48;
import defpackage.u7r;
import defpackage.ww7;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J.\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/WeightGuideViewModel;", "Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel;", "<init>", "()V", "TAG", "", "type", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "nickName", "getNickName", "setNickName", "sex", "", "getSex", "()I", "setSex", "(I)V", "birthday", "getBirthday", "setBirthday", "height", "getHeight", "setHeight", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "sendVisitorData", "did", "age", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightGuideViewModel extends ElectronicScaleBaseViewModel {

    @Nullable
    private String birthday;
    private int height;

    @Nullable
    private String nickName;

    @NotNull
    private final String TAG = "WeightGuideViewModel ";

    @Nullable
    private String type = WeightActivity.WEIGHT_TYPE_NORMAL;
    private int sex = 1;

    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @Nullable
    public final String getBirthday() {
        return this.birthday;
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    public final int getSex() {
        return this.sex;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void sendVisitorData(@NotNull String did, int age, int sex, int height, @NotNull String nickName) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 0;
        ww7 ww7Var = new ww7();
        fx7 fx7Var = new fx7();
        Long lB = t48.c().b(nickName);
        Logger.i(this.TAG, "visitor mi id  : " + lB);
        jx7 jx7Var = new jx7();
        jx7Var.c = lB.longValue();
        fx7Var.c = jx7Var;
        kx7 kx7Var = new kx7();
        kx7Var.c = 0L;
        fx7Var.d = kx7Var;
        fx7Var.g = age;
        fx7Var.f = sex;
        fx7Var.e = 3;
        fx7Var.h = height;
        fx7Var.i = 0;
        ww7Var.F(fx7Var);
        u7rVar.D(ww7Var);
        Logger.i(this.TAG, " VisitorMeasure " + did + " send " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.WeightGuideViewModel.sendVisitorData.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                ToastUtil.INSTANCE.showToast(zzi.E4);
                Logger.i(WeightGuideViewModel.this.TAG, "VisitorMeasure send user failed " + type + " " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                Logger.i(WeightGuideViewModel.this.TAG, "VisitorMeasure send user success");
            }
        }, 10000);
    }

    public final void setBirthday(@Nullable String str) {
        this.birthday = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    public final void setSex(int i) {
        this.sex = i;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
