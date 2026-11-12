package com.xiaomi.fitness.electronic.scale;

import android.os.Bundle;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.user.info.export.UserInformationManager;
import com.xiaomi.fitness.user.info.export.UserInformationManagerExtKt;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0002\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u000e\u0010\u0010\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"J\u0006\u0010$\u001a\u00020\u0005J\u0006\u0010%\u001a\u00020&R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/VisitorWeightViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "DEFAULT_BIRTHDAY_TIME", "", "getDEFAULT_BIRTHDAY_TIME", "()J", "nickName", "", "getNickName", "()Ljava/lang/String;", "setNickName", "(Ljava/lang/String;)V", "sex", "getSex", "setSex", "birthday", "getBirthday", "setBirthday", "height", "getHeight", "setHeight", "setted", "", "getSetted", "()Z", "setSetted", "(Z)V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "gender", "", "getSexInt", "birthStringToMillis", "getBirthdayRange", "", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVisitorWeightViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisitorWeightViewModel.kt\ncom/xiaomi/fitness/electronic/scale/VisitorWeightViewModel\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,69:1\n37#2:70\n36#2,3:71\n*S KotlinDebug\n*F\n+ 1 VisitorWeightViewModel.kt\ncom/xiaomi/fitness/electronic/scale/VisitorWeightViewModel\n*L\n50#1:70\n50#1:71,3\n*E\n"})
public final class VisitorWeightViewModel extends AbsViewModel {

    @NotNull
    private static final String TAG = "VisitorWeightViewModel";
    private boolean setted;
    private final long DEFAULT_BIRTHDAY_TIME = 631123200000L;

    @NotNull
    private String nickName = ResourceExtKt.getString(zzi.f4);

    @NotNull
    private String sex = ResourceExtKt.getString(zzi.f4);

    @NotNull
    private String birthday = ResourceExtKt.getString(zzi.f4);

    @NotNull
    private String height = ResourceExtKt.getString(zzi.f4);

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final long birthStringToMillis() {
        long dateInMonth;
        if (Intrinsics.areEqual(this.birthday, ResourceExtKt.getString(zzi.f4))) {
            return this.DEFAULT_BIRTHDAY_TIME;
        }
        String[] strArr = (String[]) new Regex("-").split(this.birthday, 0).toArray(new String[0]);
        if (strArr != null) {
            dateInMonth = TimeUtils.INSTANCE.getDateInMonth(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
            Logger.d(TAG, "year " + strArr[0] + " -" + strArr[1] + " -" + strArr[2] + " time " + dateInMonth);
        } else {
            dateInMonth = 0;
        }
        return dateInMonth != 0 ? dateInMonth : this.DEFAULT_BIRTHDAY_TIME;
    }

    @NotNull
    public final String getBirthday() {
        return this.birthday;
    }

    @NotNull
    public final long[] getBirthdayRange() {
        return UserInformationManagerExtKt.getInstance(UserInformationManager.INSTANCE).getBirthdaySelectRange();
    }

    public final long getDEFAULT_BIRTHDAY_TIME() {
        return this.DEFAULT_BIRTHDAY_TIME;
    }

    @NotNull
    public final String getHeight() {
        return this.height;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    public final boolean getSetted() {
        return this.setted;
    }

    @NotNull
    public final String getSex() {
        return this.sex;
    }

    public final int getSexInt() {
        return Intrinsics.areEqual(this.sex, ResourceExtKt.getString(zzi.V4)) ? 0 : 1;
    }

    public final void setBirthday(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.birthday = str;
    }

    public final void setHeight(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.height = str;
    }

    public final void setNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickName = str;
    }

    public final void setSetted(boolean z) {
        this.setted = z;
    }

    public final void setSex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sex = str;
    }

    public final void setSex(int gender) {
        this.sex = gender == 2 ? ResourceExtKt.getString(zzi.V4) : ResourceExtKt.getString(zzi.W4);
    }
}
