package com.huami.account.keeper;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.huami.account.AccountExternalsKt;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.utils.AgreementItem;
import com.huami.account.utils.AgreementResult;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.network.hmnetwork.model.account.LoginData;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.keeper.HMWebKeeper;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\bO\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J<\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\u0006J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002J\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\u0006J*\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u000bJ\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\bJ\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002J\u000e\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\bJ\u0006\u0010!\u001a\u00020\bJ$\u0010%\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0002J\u0006\u0010'\u001a\u00020&J\u000e\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\bJ\u0006\u0010*\u001a\u00020\bJ\b\u0010+\u001a\u0004\u0018\u00010\u0002J\u0010\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0002J\b\u0010.\u001a\u0004\u0018\u00010\u0002J\u0010\u00100\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u0002J\b\u00101\u001a\u0004\u0018\u00010\u0002J\u0010\u00103\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u0002J\u0010\u00104\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0002J\u0006\u00105\u001a\u00020\u0006J\u0010\u00107\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u0006H\u0007J\u000e\u00109\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\bJ\u0006\u0010:\u001a\u00020\bJ\u0006\u0010;\u001a\u00020\bJ\u000e\u0010<\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\bJ\u0006\u0010=\u001a\u00020\u0006J\u000e\u0010?\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u0006J\u0018\u0010B\u001a\u00020\u000b2\u0010\u0010A\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010@J\u0010\u0010C\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010@J\b\u0010D\u001a\u0004\u0018\u00010\u0002J\u0010\u0010F\u001a\u00020\u000b2\b\u0010E\u001a\u0004\u0018\u00010\u0002J\u0018\u0010G\u001a\u00020\u000b2\u0010\u0010A\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010@J\u0010\u0010H\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010@J\b\u0010I\u001a\u0004\u0018\u00010\u0002J\u0010\u0010J\u001a\u00020\u000b2\b\u0010E\u001a\u0004\u0018\u00010\u0002J\u0010\u0010L\u001a\u00020\u000b2\b\u0010K\u001a\u0004\u0018\u00010\u0002J\b\u0010M\u001a\u0004\u0018\u00010\u0002J\u0010\u0010O\u001a\u00020\u000b2\b\u0010N\u001a\u0004\u0018\u00010\u0002J\b\u0010P\u001a\u0004\u0018\u00010\u0002J\u0010\u0010R\u001a\u00020\u000b2\b\u0010Q\u001a\u0004\u0018\u00010\u0002J\b\u0010S\u001a\u0004\u0018\u00010\u0002J\u0006\u0010T\u001a\u00020\bJ\u000e\u0010V\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020\bJ\u0012\u0010X\u001a\u0004\u0018\u00010\u00022\b\u0010W\u001a\u0004\u0018\u00010\u0002J\u0010\u0010Z\u001a\u00020\u000b2\b\u0010Y\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\\\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u0006J\u0006\u0010]\u001a\u00020\u0006J\u0010\u0010_\u001a\u00020\u000b2\b\u0010^\u001a\u0004\u0018\u00010\u0002J\b\u0010`\u001a\u0004\u0018\u00010\u0002J\u0006\u0010a\u001a\u00020\u0006J\u000e\u0010c\u001a\u00020\u000b2\u0006\u0010b\u001a\u00020\u0006J\u0006\u0010d\u001a\u00020\u0006J\u000e\u0010e\u001a\u00020\u000b2\u0006\u0010b\u001a\u00020\u0006J\b\u0010f\u001a\u0004\u0018\u00010\u0002J\u0010\u0010h\u001a\u00020\u000b2\b\u0010g\u001a\u0004\u0018\u00010\u0002J\b\u0010i\u001a\u0004\u0018\u00010\u0002J\u0010\u0010k\u001a\u00020\u000b2\b\u0010j\u001a\u0004\u0018\u00010\u0002J\u0006\u0010l\u001a\u00020\u0006J\u000e\u0010m\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u0006R\u0016\u0010n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bp\u0010oR\u0016\u0010q\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bq\u0010oR\u0016\u0010r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\br\u0010oR\u0016\u0010s\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bs\u0010oR\u0016\u0010t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bt\u0010oR\u0016\u0010u\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bu\u0010oR\u0016\u0010v\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bv\u0010oR\u0016\u0010w\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bw\u0010oR\u0016\u0010x\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bx\u0010oR\u0016\u0010y\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\by\u0010oR\u0016\u0010z\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bz\u0010oR\u0016\u0010{\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b{\u0010oR\u0016\u0010|\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b|\u0010oR\u0016\u0010}\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b}\u0010oR\u0016\u0010~\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b~\u0010oR\u0016\u0010\u007f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u007f\u0010oR\u0018\u0010\u0080\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010oR\u0018\u0010\u0081\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010oR\u0018\u0010\u0082\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010oR\u0018\u0010\u0083\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010oR\u0018\u0010\u0084\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010oR\u0018\u0010\u0085\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010oR\u0018\u0010\u0086\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010oR\u0018\u0010\u0087\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010oR\u0018\u0010\u0088\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010oR\u0018\u0010\u0089\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010oR\u0018\u0010\u008a\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010oR\u0018\u0010\u008b\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010oR\u0018\u0010\u008d\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010oR\u0018\u0010\u008f\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010oR\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001a\u0010\u0095\u0001\u001a\u00030\u0090\u00018B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u0094\u0001¨\u0006\u0098\u0001"}, d2 = {"Lcom/huami/account/keeper/HMAccountKeeper;", "", "", "refreshToken", "accessToken", "xiaomiId", "", "expiresIn", "", "hasIoT", "hasMasterCard", "", "saveXiaomiToken", "getXiaomiTokenSaveTime", "getXiaomiAccessToken", "getXiaomiRefreshToken", "getXiaomiUserId", "setMasterCardFlagFalse", "getExpiresIn", "token", com.google.firebase.crashlytics.internal.settings.b.c, "startTimeStamp", "expire", "saveMiotTokenInfo", "clearMiotTokenInfo", "getMiotToken", "getMiotSession", "getMiotTokenStartTimeStamp", "getMiotTokenExpire", "isMiotTokenInit", "getXiaomiUserIdOrEmpty", "isShowed", "setUserGuideState", "isShowedUserGuide", "huamiUid", "thirdUid", "security", "keepLoginData", "Lcom/huami/network/hmnetwork/model/account/LoginData;", "readLoginData", "agree", "keepAgreeUserExperience", "readAgreeUserExperience", "readUpdateUserAgreement", "agreement", "keepUpdateUserAgreement", "readUpdateUserExperience", "experience", "keepUpdateUserExperience", "readUpdateUserPrivacy", "privacy", "keepUpdateUserPrivacy", "formatAgreementLog", "getCreateTime", ParamKey.createTime, "saveCreateTime", "isRestart", "saveAppRestart", "getAppRestart", "isMutexLogin", "setIsMutexLogin", "getMutexTime", "mutexTime", "setMutexTime", "", "list", "setTestUrlList", "getTestUrlList", "getTestUrl", "url", "setTestUrl", "setTestAccountUrlList", "getTestAccountUrlList", "getTestAccountUrl", "setTestAccountUrl", "uid", "setLastLoginUid", "getLastLoginUid", BaseDeviceStatusActivity.KEY_AREA, "setLastSelectArea", "getLastSelectArea", "code", "setLastSelectAreaCode", "getLastSelectAreaCode", "getAlreadyBindPhone", "bind", "saveAlreadyBindPhone", "def", "getLastLoginProvider", "provider", "setLastLoginProvider", "millis", "setCheckUserBirthdayTime", "getCheckUserBirthdayTime", "value", "setLastSyncPersonInfo", "getLastSyncPersonInfo", "getLastUserInfoTipTime", "time", "setLastUserInfoTipTime", "getLastCheckUserInfoSecurityTime", "setLastCheckUserInfoSecurityTime", "getManualAuditNickName", "nickName", "setManualAuditNickName", "getManualAuditAvatar", WebAPI.PARAM_SHARE_INVITE_AVATAR, "setManualAuditAvatar", "getCheckMinorAuthorizationTime", "setCheckMinorAuthorizationTime", "TAG", "Ljava/lang/String;", "KEY_MERGE_MIDONG", "MIOT_TOKEN_SAVE_TIME", HMAccountKeeper.MIOT_TOKEN, HMAccountKeeper.MIOT_SESSION, HMAccountKeeper.MIOT_TOKEN_EXPIRE, HMAccountKeeper.MIOT_TOKEN_INIT, "KEY_LAST_LOGIN_PROVIDER", "KEY_LAST_LOGIN_UID", "REF_AGREE_USER_EXPERIENCE", "REF_UPDATE_USER_AGREEMENT", "REF_UPDATE_USER_EXPERIENCE", "REF_UPDATE_USER_PRIVACY", "NEW_VERSION_HELPER_SHOWED", "CREATE_TIME", "IS_RESTART", "KEY_IS_MUTEX_LOGIN", "KEY_MUTEX_TIME", "KEY_ALREADY_BIND_PHONE", "TEST_URL_LIST", "TEST_URL", "TEST_ACCOUNT_URL_LIST", "TEST_ACCOUNT_URL", "KEY_CHECK_USER_BIRTHDAY_TIME_STAMP", HMAccountKeeper.XIAOMI_HAS_MASTER_CARD, "KEY_CHECK_MINOR_AUTHORIZATION_TIME_STAMP", "LAST_SYNC_PERSON_INFO", "LAST_USER_INFO_TIP_TIME", "LAST_CHECK_USER_INFO_SECURITY_TIME", "a", "MANUAL_AUDIT_NICKNAME", "b", "MANUAL_AUDIT_AVATAR", "Landroid/content/SharedPreferences;", "c", "Landroid/content/SharedPreferences;", "_sp", "()Landroid/content/SharedPreferences;", "sp", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class HMAccountKeeper {

    @NotNull
    public static final String CREATE_TIME = "create_time";

    @NotNull
    public static final HMAccountKeeper INSTANCE = new HMAccountKeeper();

    @NotNull
    public static final String IS_RESTART = "isRestart";

    @NotNull
    public static final String KEY_ALREADY_BIND_PHONE = "KEY_ALREADY_BIND_PHONE";

    @NotNull
    public static final String KEY_CHECK_MINOR_AUTHORIZATION_TIME_STAMP = "KEY_CHECK_MINOR_AUTHORIZATION_TIME_STAMP";

    @NotNull
    public static final String KEY_CHECK_USER_BIRTHDAY_TIME_STAMP = "KEY_CHECK_USER_BIRTHDAY_TIME_STAMP";

    @NotNull
    public static final String KEY_IS_MUTEX_LOGIN = "isMutexLogin";

    @NotNull
    public static final String KEY_LAST_LOGIN_PROVIDER = "last_login_provider";

    @NotNull
    public static final String KEY_LAST_LOGIN_UID = "last_login_uid";

    @NotNull
    public static final String KEY_MERGE_MIDONG = "KEY_MERGE_MIDONG";

    @NotNull
    public static final String KEY_MUTEX_TIME = "mutexTime";

    @NotNull
    public static final String LAST_CHECK_USER_INFO_SECURITY_TIME = "last_check_user_info_security_time";

    @NotNull
    public static final String LAST_SYNC_PERSON_INFO = "last_sync_person_info";

    @NotNull
    public static final String LAST_USER_INFO_TIP_TIME = "last_user_info_tip_time";

    @NotNull
    public static final String MIOT_SESSION = "MIOT_SESSION";

    @NotNull
    public static final String MIOT_TOKEN = "MIOT_TOKEN";

    @NotNull
    public static final String MIOT_TOKEN_EXPIRE = "MIOT_TOKEN_EXPIRE";

    @NotNull
    public static final String MIOT_TOKEN_INIT = "MIOT_TOKEN_INIT";

    @NotNull
    public static final String MIOT_TOKEN_SAVE_TIME = "MIOT_TOKEN_START_TIME";

    @NotNull
    public static final String NEW_VERSION_HELPER_SHOWED = "new_version_helper_showed";

    @NotNull
    public static final String REF_AGREE_USER_EXPERIENCE = "agree_user_agreement";

    @NotNull
    public static final String REF_UPDATE_USER_AGREEMENT = "update_user_agreement";

    @NotNull
    public static final String REF_UPDATE_USER_EXPERIENCE = "update_user_experience";

    @NotNull
    public static final String REF_UPDATE_USER_PRIVACY = "update_user_privacy";

    @NotNull
    public static final String TAG = "HMAccountKeeper";

    @NotNull
    public static final String TEST_ACCOUNT_URL = "test_account_url";

    @NotNull
    public static final String TEST_ACCOUNT_URL_LIST = "test_account_url_list";

    @NotNull
    public static final String TEST_URL = "test_url";

    @NotNull
    public static final String TEST_URL_LIST = "test_url_list";

    @NotNull
    public static final String XIAOMI_HAS_MASTER_CARD = "XIAOMI_HAS_MASTER_CARD";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String MANUAL_AUDIT_NICKNAME = "manualAuditNickName";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String MANUAL_AUDIT_AVATAR = "manualAuditAvatar";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static volatile SharedPreferences _sp;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "保存体验计划（标识）：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "保存用户协议：" + HMAccountKeeper.INSTANCE.formatAgreementLog(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "保存体验计划：" + HMAccountKeeper.INSTANCE.formatAgreementLog(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "保存隐私协议：" + HMAccountKeeper.INSTANCE.formatAgreementLog(this.a);
        }
    }

    private HMAccountKeeper() {
    }

    private final SharedPreferences a() {
        SharedPreferences sharedPreferences = _sp;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferencesInitAccountKeeper = AccountExternalsKt.getAccountDelegate().initAccountKeeper();
        _sp = sharedPreferencesInitAccountKeeper;
        return sharedPreferencesInitAccountKeeper;
    }

    public final void clearMiotTokenInfo() {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.remove(MIOT_TOKEN);
        editorEdit.remove(MIOT_SESSION);
        editorEdit.remove(MIOT_TOKEN_SAVE_TIME);
        editorEdit.remove(MIOT_TOKEN_EXPIRE);
        editorEdit.remove(MIOT_TOKEN_INIT);
        editorEdit.apply();
    }

    @NotNull
    public final String formatAgreementLog(@Nullable String agreement) {
        ArrayList arrayList;
        if (agreement == null) {
            return "[empty]";
        }
        try {
            AgreementResult agreementResult = (AgreementResult) HMHttpUtils.getGson().fromJson(agreement, AgreementResult.class);
            String hadSaved = agreementResult.getHadSaved();
            List<AgreementItem> items = agreementResult.getItems();
            if (items == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
                Iterator<T> it2 = items.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((AgreementItem) it2.next()).getLanguage());
                }
                arrayList = arrayList2;
            }
            return "[had_saved: " + hadSaved + ", items: " + arrayList + "]";
        } catch (Exception unused) {
            return "parse failed: " + agreement;
        }
    }

    public final boolean getAlreadyBindPhone() {
        return a().getBoolean("KEY_ALREADY_BIND_PHONE", false);
    }

    public final boolean getAppRestart() {
        return a().getBoolean("isRestart", false);
    }

    public final long getCheckMinorAuthorizationTime() {
        return a().getLong("KEY_CHECK_MINOR_AUTHORIZATION_TIME_STAMP", 0L);
    }

    public final long getCheckUserBirthdayTime() {
        return a().getLong("KEY_CHECK_USER_BIRTHDAY_TIME_STAMP", 0L);
    }

    public final long getCreateTime() {
        return a().getLong("create_time", -1L);
    }

    public final long getExpiresIn() {
        return HMWebKeeper.getExpiresIn();
    }

    public final long getLastCheckUserInfoSecurityTime() {
        return a().getLong(LAST_CHECK_USER_INFO_SECURITY_TIME, 0L);
    }

    @Nullable
    public final String getLastLoginProvider(@Nullable String def) {
        return a().getString("last_login_provider", def);
    }

    @Nullable
    public final String getLastLoginUid() {
        return a().getString("last_login_uid", null);
    }

    @Nullable
    public final String getLastSelectArea() {
        return HMWebKeeper.getLastSelectArea();
    }

    @Nullable
    public final String getLastSelectAreaCode() {
        return HMWebKeeper.getLastSelectAreaCode();
    }

    @Nullable
    public final String getLastSyncPersonInfo() {
        return a().getString(LAST_SYNC_PERSON_INFO, null);
    }

    public final long getLastUserInfoTipTime() {
        return a().getLong(LAST_USER_INFO_TIP_TIME, 0L);
    }

    @Nullable
    public final String getManualAuditAvatar() {
        return a().getString(MANUAL_AUDIT_AVATAR, null);
    }

    @Nullable
    public final String getManualAuditNickName() {
        return a().getString(MANUAL_AUDIT_NICKNAME, null);
    }

    @Nullable
    public final String getMiotSession() {
        return a().getString(MIOT_SESSION, null);
    }

    @Nullable
    public final String getMiotToken() {
        return a().getString(MIOT_TOKEN, null);
    }

    public final long getMiotTokenExpire() {
        return a().getLong(MIOT_TOKEN_EXPIRE, -1L);
    }

    public final long getMiotTokenStartTimeStamp() {
        return a().getLong(MIOT_TOKEN_SAVE_TIME, -1L);
    }

    public final long getMutexTime() {
        return a().getLong("mutexTime", System.currentTimeMillis());
    }

    @Nullable
    public final String getTestAccountUrl() {
        return HMWebKeeper.getUrl("test_account_url");
    }

    @Nullable
    public final List<String> getTestAccountUrlList() {
        List<String> urlList = HMWebKeeper.getUrlList("test_account_url_list");
        return urlList == null ? new ArrayList() : urlList;
    }

    @Nullable
    public final String getTestUrl() {
        return HMWebKeeper.getUrl("test_url");
    }

    @Nullable
    public final List<String> getTestUrlList() {
        List<String> urlList = HMWebKeeper.getUrlList("test_url_list");
        return urlList == null ? new ArrayList() : urlList;
    }

    @Nullable
    public final String getXiaomiAccessToken() {
        return HMWebKeeper.getXiaomiAccessToken();
    }

    @Nullable
    public final String getXiaomiRefreshToken() {
        return HMWebKeeper.getXiaomiRefreshToken();
    }

    public final long getXiaomiTokenSaveTime() {
        return HMWebKeeper.getXiaomiTokenSaveTime();
    }

    @Nullable
    public final String getXiaomiUserId() {
        return HMWebKeeper.getXiaomiUserId();
    }

    @Nullable
    public final String getXiaomiUserIdOrEmpty() {
        String xiaomiUserId = getXiaomiUserId();
        return xiaomiUserId == null ? "" : xiaomiUserId;
    }

    public final boolean hasIoT() {
        return HMWebKeeper.hasIoT();
    }

    public final boolean hasMasterCard() {
        return a().getBoolean(XIAOMI_HAS_MASTER_CARD, false);
    }

    public final boolean isMiotTokenInit() {
        return a().getBoolean(MIOT_TOKEN_INIT, false);
    }

    public final boolean isMutexLogin() {
        return a().getBoolean("isMutexLogin", false);
    }

    public final boolean isShowedUserGuide() {
        return a().getBoolean("new_version_helper_showed", true);
    }

    public final void keepAgreeUserExperience(boolean agree) {
        HMLog.debug(UserLegalInfoManager.TAG, new a(agree));
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putBoolean("agree_user_agreement", agree);
        editorEdit.apply();
    }

    public final void keepLoginData(@Nullable String huamiUid, @Nullable String thirdUid, @Nullable String security) {
        HMWebKeeper.keepLoginData(huamiUid, thirdUid, security);
    }

    public final void keepUpdateUserAgreement(@Nullable String agreement) {
        HMLog.debug(UserLegalInfoManager.TAG, new b(agreement));
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putString("update_user_agreement", agreement);
        editorEdit.apply();
    }

    public final void keepUpdateUserExperience(@Nullable String experience) {
        HMLog.debug(UserLegalInfoManager.TAG, new c(experience));
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putString("update_user_experience", experience);
        editorEdit.apply();
    }

    public final void keepUpdateUserPrivacy(@Nullable String privacy) {
        HMLog.debug(UserLegalInfoManager.TAG, new d(privacy));
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putString("update_user_privacy", privacy);
        editorEdit.apply();
    }

    public final boolean readAgreeUserExperience() {
        return a().getBoolean("agree_user_agreement", true);
    }

    @NotNull
    public final LoginData readLoginData() {
        return HMWebKeeper.readLoginData();
    }

    @Nullable
    public final String readUpdateUserAgreement() {
        return a().getString("update_user_agreement", null);
    }

    @Nullable
    public final String readUpdateUserExperience() {
        return a().getString("update_user_experience", null);
    }

    @Nullable
    public final String readUpdateUserPrivacy() {
        return a().getString("update_user_privacy", null);
    }

    public final void saveAlreadyBindPhone(boolean bind) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putBoolean("KEY_ALREADY_BIND_PHONE", bind);
        editorEdit.apply();
    }

    public final void saveAppRestart(boolean isRestart) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putBoolean("isRestart", isRestart);
        editorEdit.apply();
    }

    @SuppressLint({"ApplySharedPref"})
    public final void saveCreateTime(long createTime) {
        HMLog.i("SportDataManager", "keep save createTime: " + createTime, new Object[0]);
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putLong("create_time", createTime);
        editorEdit.commit();
    }

    public final void saveMiotTokenInfo(@Nullable String token, @Nullable String session, long startTimeStamp, long expire) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putString(MIOT_TOKEN, token);
        editorEdit.putString(MIOT_SESSION, session);
        editorEdit.putLong(MIOT_TOKEN_SAVE_TIME, startTimeStamp);
        editorEdit.putLong(MIOT_TOKEN_EXPIRE, expire);
        editorEdit.putBoolean(MIOT_TOKEN_INIT, true);
        editorEdit.apply();
    }

    public final void saveXiaomiToken(@Nullable String refreshToken, @Nullable String accessToken, @Nullable String xiaomiId, long expiresIn, boolean hasIoT, boolean hasMasterCard) {
        HMWebKeeper.saveXiaomiToken(refreshToken, accessToken, xiaomiId, expiresIn, hasIoT);
        a().edit().putBoolean(XIAOMI_HAS_MASTER_CARD, hasMasterCard).apply();
    }

    public final void setCheckMinorAuthorizationTime(long millis) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putLong("KEY_CHECK_MINOR_AUTHORIZATION_TIME_STAMP", millis);
        editorEdit.apply();
    }

    public final void setCheckUserBirthdayTime(long millis) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putLong("KEY_CHECK_USER_BIRTHDAY_TIME_STAMP", millis);
        editorEdit.apply();
    }

    public final void setIsMutexLogin(boolean isMutexLogin) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putBoolean("isMutexLogin", isMutexLogin);
        editorEdit.apply();
    }

    public final void setLastCheckUserInfoSecurityTime(long time) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putLong(LAST_CHECK_USER_INFO_SECURITY_TIME, time);
        editorEdit.apply();
    }

    public final void setLastLoginProvider(@Nullable String provider) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putString("last_login_provider", provider);
        editorEdit.apply();
    }

    public final void setLastLoginUid(@Nullable String uid) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putString("last_login_uid", uid);
        editorEdit.apply();
    }

    public final void setLastSelectArea(@Nullable String area) {
        HMWebKeeper.setLastSelectArea(area);
    }

    public final void setLastSelectAreaCode(@Nullable String code) {
        HMWebKeeper.setLastSelectAreaCode(code);
    }

    public final void setLastSyncPersonInfo(@Nullable String value) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putString(LAST_SYNC_PERSON_INFO, value);
        editorEdit.apply();
    }

    public final void setLastUserInfoTipTime(long time) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putLong(LAST_USER_INFO_TIP_TIME, time);
        editorEdit.apply();
    }

    public final void setManualAuditAvatar(@Nullable String avatar) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putString(MANUAL_AUDIT_AVATAR, avatar);
        editorEdit.apply();
    }

    public final void setManualAuditNickName(@Nullable String nickName) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putString(MANUAL_AUDIT_NICKNAME, nickName);
        editorEdit.apply();
    }

    public final void setMasterCardFlagFalse() {
        a().edit().putBoolean(XIAOMI_HAS_MASTER_CARD, false).apply();
    }

    public final void setMutexTime(long mutexTime) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putLong("mutexTime", mutexTime);
        editorEdit.apply();
    }

    public final void setTestAccountUrl(@Nullable String url) {
        HMWebKeeper.setUrl("test_account_url", url);
    }

    public final void setTestAccountUrlList(@Nullable List<String> list) {
        HMWebKeeper.setUrlList("test_account_url_list", list);
    }

    public final void setTestUrl(@Nullable String url) {
        HMWebKeeper.setUrl("test_url", url);
    }

    public final void setTestUrlList(@Nullable List<String> list) {
        HMWebKeeper.setUrlList("test_url_list", list);
    }

    public final void setUserGuideState(boolean isShowed) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putBoolean("new_version_helper_showed", isShowed);
        editorEdit.apply();
    }
}
