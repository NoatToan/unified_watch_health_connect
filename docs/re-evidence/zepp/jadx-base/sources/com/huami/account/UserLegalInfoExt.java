package com.huami.account;

import com.huami.account.UserLegalInfoExt;
import com.huami.account.bean.LegalInfoType;
import com.huami.account.event.EventAgreeUserExperience;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.legal.ServerLegalTask;
import com.huami.account.service.model.Area;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.utils.AgreementItem;
import com.huami.account.utils.AgreementResult;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.passport.net.HttpConfig;
import com.huami.tools.log.HMLog;
import de.greenrobot.event.EventBus;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0006\u0010\u000e\u001a\u00020\u0006J\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00040\u0011H\u0007J\u0016\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/account/UserLegalInfoExt;", "", "", "json", "", "updateExperienceByUserAgree", "", "agree", "f", "Lcom/huami/account/bean/LegalInfoType;", "type", "getLegalPropKey", "isCheckAfterRegister", "isAgreementEmpty", "readAgreeUserExperience", "Lcom/huami/account/utils/AgreementResult;", "readLocalUserExperience", "Lkotlin/Function1;", "Lcom/huami/account/utils/AgreementItem;", "saveCallback", "updateAgreeUserExperience", "Lcom/huami/account/UserLegalInfoExt$UpdateAgreeUserExperienceCallback;", "<init>", "()V", "UpdateAgreeUserExperienceCallback", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class UserLegalInfoExt {

    @NotNull
    public static final UserLegalInfoExt INSTANCE = new UserLegalInfoExt();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/account/UserLegalInfoExt$UpdateAgreeUserExperienceCallback;", "", "", "isSuccess", "Lcom/huami/account/utils/AgreementItem;", "agreement", "", "onResult", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public interface UpdateAgreeUserExperienceCallback {
        void onResult(boolean isSuccess, @Nullable AgreementItem agreement);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ AgreementResult a;
        public final /* synthetic */ AgreementResult b;
        public final /* synthetic */ AgreementResult c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AgreementResult agreementResult, AgreementResult agreementResult2, AgreementResult agreementResult3) {
            super(0);
            this.a = agreementResult;
            this.b = agreementResult2;
            this.c = agreementResult3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "注册检查更新: 跳过（agreement=" + this.a + ", privacy=" + this.b + ", experience=" + this.c + "）";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/account/utils/AgreementItem;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<AgreementItem, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@Nullable AgreementItem agreementItem) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AgreementItem agreementItem) {
            a(agreementItem);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "体验计划拉取失败：云端协议为空";
        }
    }

    private UserLegalInfoExt() {
    }

    private static final AgreementResult e(String str) {
        Object objM3845constructorimpl;
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl((AgreementResult) HMHttpUtils.getGson().fromJson(str, AgreementResult.class));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return (AgreementResult) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    private final void f(boolean agree) {
        HttpConfig.addHeaders("hm-privacy-ceip", String.valueOf(agree));
        EventBus.getDefault().post(new EventAgreeUserExperience(agree));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final boolean z, final boolean z2, final UpdateAgreeUserExperienceCallback updateAgreeUserExperienceCallback, final Area area, boolean z3) throws JSONException {
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        String updateUserExperience = hMAccountKeeper.readUpdateUserExperience();
        if (updateUserExperience == null) {
            HMLog.info$default(null, c.a, 1, null);
            return;
        }
        JSONObject jSONObject = new JSONObject(updateUserExperience);
        jSONObject.put(UserLegalInfoManager.KEY_HAD_SAVED, false);
        hMAccountKeeper.keepUpdateUserExperience(jSONObject.toString());
        UserLegalInfoManager.saveVersionToServer(new UserLegalInfoManager.SaveVersionCallback() { // from class: c78
            @Override // com.huami.account.UserLegalInfoManager.SaveVersionCallback
            public final void onSaveResult(boolean z4) {
                UserLegalInfoExt.h(z, z2, updateAgreeUserExperienceCallback, area, z4);
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final String getLegalPropKey(@NotNull LegalInfoType type) {
        return AccountExternalsKt.getUserVersionPrefix() + "." + type.getTypeName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(boolean z, boolean z2, UpdateAgreeUserExperienceCallback updateAgreeUserExperienceCallback, Area area, boolean z3) {
        List<AgreementItem> items;
        if (z3) {
            INSTANCE.f(z);
        } else {
            HMAccountKeeper.INSTANCE.keepAgreeUserExperience(z2);
        }
        AgreementResult localUserExperience = INSTANCE.readLocalUserExperience();
        AgreementItem agreementItem = null;
        Object obj = null;
        agreementItem = null;
        if (localUserExperience != null && (items = localUserExperience.getItems()) != null) {
            for (Object obj2 : items) {
                if (Intrinsics.areEqual(((AgreementItem) obj2).getLanguage(), area.getValue())) {
                    obj = obj2;
                    break;
                }
            }
            agreementItem = (AgreementItem) obj;
        }
        updateAgreeUserExperienceCallback.onResult(z3, agreementItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(boolean z, boolean z2, UpdateAgreeUserExperienceCallback updateAgreeUserExperienceCallback, Area area, boolean z3) {
        List<AgreementItem> items;
        if (z3) {
            HMAccountKeeper.INSTANCE.keepAgreeUserExperience(z);
            INSTANCE.f(z);
        } else {
            HMAccountKeeper.INSTANCE.keepAgreeUserExperience(z2);
        }
        AgreementResult localUserExperience = INSTANCE.readLocalUserExperience();
        AgreementItem agreementItem = null;
        Object obj = null;
        agreementItem = null;
        if (localUserExperience != null && (items = localUserExperience.getItems()) != null) {
            for (Object obj2 : items) {
                if (Intrinsics.areEqual(((AgreementItem) obj2).getLanguage(), area.getValue())) {
                    obj = obj2;
                    break;
                }
            }
            agreementItem = (AgreementItem) obj;
        }
        updateAgreeUserExperienceCallback.onResult(z3, agreementItem);
    }

    @JvmStatic
    public static final boolean isAgreementEmpty(@Nullable String json) {
        JSONArray jSONArrayOptJSONArray;
        if (json == null || kotlin.text.m.isBlank(json)) {
            return true;
        }
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject(json);
            if (jSONObject.length() == 1 && jSONObject.has(UserLegalInfoManager.KEY_HAD_SAVED)) {
                return true;
            }
            if (jSONObject.has("items") && ((jSONArrayOptJSONArray = jSONObject.optJSONArray("items")) == null || jSONArrayOptJSONArray.length() == 0)) {
                return true;
            }
            Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return false;
    }

    @JvmStatic
    public static final boolean isCheckAfterRegister() {
        boolean z;
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        AgreementResult agreementResultE = e(hMAccountKeeper.readUpdateUserAgreement());
        AgreementResult agreementResultE2 = e(hMAccountKeeper.readUpdateUserPrivacy());
        AgreementResult agreementResultE3 = e(hMAccountKeeper.readUpdateUserExperience());
        AgreementResult[] agreementResultArr = {agreementResultE, agreementResultE2, agreementResultE3};
        int i = 0;
        while (true) {
            if (i >= 3) {
                z = false;
                break;
            }
            AgreementResult agreementResult = agreementResultArr[i];
            if (Intrinsics.areEqual(agreementResult == null ? null : agreementResult.getHadSaved(), "false")) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return false;
        }
        HMAccountKeeper hMAccountKeeper2 = HMAccountKeeper.INSTANCE;
        boolean agreeUserExperience = hMAccountKeeper2.readAgreeUserExperience();
        if (agreementResultE3 != null && !agreeUserExperience) {
            hMAccountKeeper2.keepAgreeUserExperience(false);
        }
        HMLog.debug(UserLegalInfoManager.TAG, new a(agreementResultE, agreementResultE2, agreementResultE3));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Function1 function1, boolean z, AgreementItem agreementItem) {
        function1.invoke(agreementItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAgreeUserExperience$default(UserLegalInfoExt userLegalInfoExt, boolean z, Function1 function1, int i, Object obj) throws JSONException {
        if ((i & 2) != 0) {
            function1 = b.a;
        }
        userLegalInfoExt.updateAgreeUserExperience(z, (Function1<? super AgreementItem, Unit>) function1);
    }

    @JvmStatic
    public static final void updateExperienceByUserAgree(@Nullable String json) {
        Object objM3845constructorimpl;
        if (json == null) {
            HMLoginManager.saveAgreeUserExperienceForRegister(false);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject(json);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() == 0) {
                jSONObject.remove("items");
            }
            jSONObject.put(UserLegalInfoManager.KEY_HAD_SAVED, true);
            HMAccountKeeper.INSTANCE.keepUpdateUserExperience(jSONObject.toString());
            Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl((AgreementResult) HMHttpUtils.getGson().fromJson(json, AgreementResult.class));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th2));
        }
        Object obj = null;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        AgreementResult agreementResult = (AgreementResult) objM3845constructorimpl;
        if (agreementResult == null) {
            HMLoginManager.saveAgreeUserExperienceForRegister(false);
            return;
        }
        String value = SelectAreaHelper.getArea().getValue();
        List<AgreementItem> items = agreementResult.getItems();
        if (items != null) {
            for (Object obj2 : items) {
                if (Intrinsics.areEqual(((AgreementItem) obj2).getLanguage(), value)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (AgreementItem) obj;
        }
        HMLoginManager.saveAgreeUserExperienceForRegister(obj != null);
    }

    public final boolean readAgreeUserExperience() {
        AgreementResult localUserExperience = readLocalUserExperience();
        if (localUserExperience == null) {
            return false;
        }
        String value = SelectAreaHelper.getArea().getValue();
        List<AgreementItem> items = localUserExperience.getItems();
        Object obj = null;
        if (items != null) {
            for (Object obj2 : items) {
                if (Intrinsics.areEqual(((AgreementItem) obj2).getLanguage(), value)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (AgreementItem) obj;
        }
        return obj != null;
    }

    @Nullable
    public final AgreementResult readLocalUserExperience() {
        Object objM3845constructorimpl;
        String updateUserExperience = HMAccountKeeper.INSTANCE.readUpdateUserExperience();
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl((AgreementResult) HMHttpUtils.getGson().fromJson(updateUserExperience, AgreementResult.class));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (AgreementResult) objM3845constructorimpl;
    }

    @Deprecated(message = "需要考虑保存是否成功，建议替换为参数为 UpdateAgreeUserExperienceCallback 的调用")
    public final void updateAgreeUserExperience(boolean agree, @NotNull final Function1<? super AgreementItem, Unit> saveCallback) throws JSONException {
        updateAgreeUserExperience(agree, new UpdateAgreeUserExperienceCallback() { // from class: b78
            @Override // com.huami.account.UserLegalInfoExt.UpdateAgreeUserExperienceCallback
            public final void onResult(boolean z, AgreementItem agreementItem) {
                UserLegalInfoExt.j(saveCallback, z, agreementItem);
            }
        });
    }

    public final void updateAgreeUserExperience(final boolean agree, @NotNull final UpdateAgreeUserExperienceCallback saveCallback) throws JSONException {
        final Area area = SelectAreaHelper.getArea();
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        final boolean agreeUserExperience = hMAccountKeeper.readAgreeUserExperience();
        if (agree) {
            hMAccountKeeper.keepAgreeUserExperience(agree);
            new ServerLegalTask(area, new ServerLegalTask.Callback() { // from class: e78
                @Override // com.huami.account.legal.ServerLegalTask.Callback
                public final void onResult(boolean z) throws JSONException {
                    UserLegalInfoExt.g(agree, agreeUserExperience, saveCallback, area, z);
                }
            }).execute(new Void[0]);
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(UserLegalInfoManager.KEY_HAD_SAVED, false);
            hMAccountKeeper.keepUpdateUserExperience(jSONObject.toString());
            UserLegalInfoManager.saveVersionToServer(new UserLegalInfoManager.SaveVersionCallback() { // from class: d78
                @Override // com.huami.account.UserLegalInfoManager.SaveVersionCallback
                public final void onSaveResult(boolean z) {
                    UserLegalInfoExt.i(agree, agreeUserExperience, saveCallback, area, z);
                }
            });
        }
    }
}
