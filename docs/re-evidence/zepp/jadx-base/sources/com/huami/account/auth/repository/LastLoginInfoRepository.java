package com.huami.account.auth.repository;

import com.huami.account.auth.entity.LastLoginInfo;
import com.huami.account.utils.AccountConstants;
import com.huami.tools.log.HMLog;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002R\u001d\u0010\u0013\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/account/auth/repository/LastLoginInfoRepository;", "", "Lcom/huami/account/auth/entity/LastLoginInfo;", "info", "", "saveLoginInfo", "", "avatar", "updateAvatar", "nickname", "updateNickname", "provider", "username", "updateUsername", "readLoginInfo", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "a", "Lkotlin/Lazy;", "()Lcom/huami/utils/persistence/kvkit/KvPersistence;", "storage", "<init>", "()V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class LastLoginInfoRepository {

    @NotNull
    private static final String b = "last_login_info";

    @NotNull
    private static final String c = "provider";

    @NotNull
    private static final String d = "username";

    @NotNull
    private static final String e = "nickname";

    @NotNull
    private static final String f = "avatar";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy storage = LazyKt__LazyJVMKt.lazy(c.a);

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
            return "读取上次登录数据字段缺失：" + kotlin.a.stackTraceToString(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ LastLoginInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LastLoginInfo lastLoginInfo) {
            super(0);
            this.a = lastLoginInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "登录成功：记录账号信息 " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/persistence/kvkit/KvPersistence;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<KvPersistence> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KvPersistence invoke() {
            return KvKit.getKvPersistence$default(LastLoginInfoRepository.b, false, 2, null);
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
            return "更新头像：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "更新昵称：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "更新 username：" + this.a;
        }
    }

    private final KvPersistence a() {
        return (KvPersistence) this.storage.getValue();
    }

    @Nullable
    public final LastLoginInfo readLoginInfo() {
        try {
            Result.Companion companion = Result.Companion;
            String str = (String) a().getValue("provider", "");
            String str2 = (String) a().getValue("username", "");
            String str3 = (String) a().getValue("nickname", "");
            String str4 = (String) a().getValue("avatar", "");
            if (!m.isBlank(str) && !m.isBlank(str3)) {
                return LastLoginInfo.INSTANCE.build(str, str2, str3, str4);
            }
            throw new IllegalStateException("字段缺失：provider=" + str + ", nickname=" + str3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.info$default(null, new a(thM3848exceptionOrNullimpl), 1, null);
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            return (LastLoginInfo) objM3845constructorimpl;
        }
    }

    public final void saveLoginInfo(@Nullable LastLoginInfo info) {
        HMLog.info$default(null, new b(info), 1, null);
        if (info instanceof LastLoginInfo.UsernameLogin) {
            KvPersistence kvPersistenceA = a();
            Pair[] pairArr = new Pair[4];
            LastLoginInfo.UsernameLogin usernameLogin = (LastLoginInfo.UsernameLogin) info;
            String avatar = usernameLogin.getCom.xiaomi.hm.health.relation.cloud.WebAPI.PARAM_SHARE_INVITE_AVATAR java.lang.String();
            pairArr[0] = TuplesKt.to("avatar", avatar != null ? avatar : "");
            pairArr[1] = TuplesKt.to("username", usernameLogin.getUsername());
            pairArr[2] = TuplesKt.to("nickname", usernameLogin.getNickname());
            pairArr[3] = TuplesKt.to("provider", usernameLogin.getProvider());
            kvPersistenceA.setValues(pairArr);
            return;
        }
        if (info instanceof LastLoginInfo.ThirdPartLogin) {
            KvPersistence kvPersistenceA2 = a();
            Pair[] pairArr2 = new Pair[3];
            LastLoginInfo.ThirdPartLogin thirdPartLogin = (LastLoginInfo.ThirdPartLogin) info;
            String avatar2 = thirdPartLogin.getCom.xiaomi.hm.health.relation.cloud.WebAPI.PARAM_SHARE_INVITE_AVATAR java.lang.String();
            pairArr2[0] = TuplesKt.to("avatar", avatar2 != null ? avatar2 : "");
            pairArr2[1] = TuplesKt.to("nickname", thirdPartLogin.getNickname());
            pairArr2[2] = TuplesKt.to("provider", thirdPartLogin.getProvider());
            kvPersistenceA2.setValues(pairArr2);
        }
    }

    public final void updateAvatar(@NotNull String avatar) {
        HMLog.debug$default(null, new d(avatar), 1, null);
        a().setValue("avatar", avatar);
    }

    public final void updateNickname(@NotNull String nickname) {
        HMLog.debug$default(null, new e(nickname), 1, null);
        a().setValue("nickname", nickname);
    }

    public final void updateUsername(@NotNull String provider, @NotNull String username) {
        HMLog.debug$default(null, new f(username), 1, null);
        if (Intrinsics.areEqual(provider, "huami_phone")) {
            username = StringsKt__StringsKt.removePrefix(username, (CharSequence) AccountConstants.DEFAULT_AREA_CODE);
        }
        a().setValue("username", username);
    }
}
