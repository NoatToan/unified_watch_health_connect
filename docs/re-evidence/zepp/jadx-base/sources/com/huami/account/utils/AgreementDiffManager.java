package com.huami.account.utils;

import com.huami.account.UserLegalInfoManager;
import com.huami.account.bean.LegalInfoType;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/account/utils/AgreementDiffManager;", "", "Lcom/huami/account/bean/LegalInfoType;", "type", "Lorg/json/JSONObject;", "newValue", "", "isAgreementChanged", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AgreementDiffManager {

    @NotNull
    public static final AgreementDiffManager INSTANCE = new AgreementDiffManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "AgreementDiffManager";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegalInfoType.values().length];
            iArr[LegalInfoType.AGREEMENT.ordinal()] = 1;
            iArr[LegalInfoType.PRIVACY.ordinal()] = 2;
            iArr[LegalInfoType.EXPERIENCE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    private AgreementDiffManager() {
    }

    @JvmStatic
    public static final boolean isAgreementChanged(@NotNull LegalInfoType type, @NotNull JSONObject newValue) {
        String updateUserAgreement;
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                updateUserAgreement = HMAccountKeeper.INSTANCE.readUpdateUserAgreement();
            } else if (i == 2) {
                updateUserAgreement = HMAccountKeeper.INSTANCE.readUpdateUserPrivacy();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                updateUserAgreement = HMAccountKeeper.INSTANCE.readUpdateUserExperience();
            }
            JSONObject jSONObject = null;
            Object obj = null;
            if (updateUserAgreement != null) {
                try {
                    objM3845constructorimpl = Result.m3845constructorimpl(new JSONObject(updateUserAgreement));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                if (!Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    obj = objM3845constructorimpl;
                }
                jSONObject = (JSONObject) obj;
            }
            if (jSONObject == null) {
                return true;
            }
            jSONObject.remove(UserLegalInfoManager.KEY_HAD_SAVED);
            jSONObject.remove("time");
            return !Intrinsics.areEqual(jSONObject.toString(), newValue.toString());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            Object objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.info(TAG, new a(thM3848exceptionOrNullimpl));
            }
            Boolean bool = Boolean.TRUE;
            if (Result.m3850isFailureimpl(objM3845constructorimpl2)) {
                objM3845constructorimpl2 = bool;
            }
            return ((Boolean) objM3845constructorimpl2).booleanValue();
        }
    }
}
