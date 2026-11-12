package com.huami.account.userinfo.usecase;

import com.huami.account.api.HMAccountWebAPI;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/account/userinfo/usecase/SetupDefaultFieldsUseCase;", "", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "personInfo", "", "", HMAccountWebAPI.PARAM_DEFAULT_FIELDS, "", Constant.METHOD_EXECUTE, "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class SetupDefaultFieldsUseCase {

    @NotNull
    public static final SetupDefaultFieldsUseCase INSTANCE = new SetupDefaultFieldsUseCase();

    private SetupDefaultFieldsUseCase() {
    }

    @JvmStatic
    public static final void execute(@NotNull HMPersonInfo personInfo, @NotNull Map<String, String> defaultFields) {
        HMUserInfo userInfo = personInfo.getUserInfo();
        userInfo.setDefaultFields(new ArrayList(defaultFields.keySet()));
        if (defaultFields.keySet().contains("gender")) {
            try {
                Result.Companion companion = Result.Companion;
                userInfo.setGender(Integer.parseInt(defaultFields.get("gender")));
                Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
        if (defaultFields.keySet().contains("birthday")) {
            userInfo.setBirthday(defaultFields.get("birthday"));
        }
        if (defaultFields.keySet().contains("height")) {
            try {
                Result.Companion companion3 = Result.Companion;
                userInfo.setHeight(Integer.parseInt(defaultFields.get("height")));
                Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th2));
            }
        }
        if (defaultFields.keySet().contains("weight")) {
            try {
                Result.Companion companion5 = Result.Companion;
                userInfo.setWeight(Float.parseFloat(defaultFields.get("weight")));
                Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th3));
            }
        }
    }
}
