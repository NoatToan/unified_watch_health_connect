package com.huami.account.auth.entity;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e2\u00020\u0001:\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/account/auth/entity/LastLoginInfo;", "", "", "a", "Ljava/lang/String;", "getProvider", "()Ljava/lang/String;", "provider", "getNickname", "nickname", "getAvatar", WebAPI.PARAM_SHARE_INVITE_AVATAR, "<init>", "(Ljava/lang/String;)V", "Companion", "Email", "Facebook", "Google", "Line", "Phone", "ThirdPartLogin", "UsernameLogin", "WeChat", "XiaoMi", "Lcom/huami/account/auth/entity/LastLoginInfo$ThirdPartLogin;", "Lcom/huami/account/auth/entity/LastLoginInfo$UsernameLogin;", "accountui_release"}, k = 1, mv = {1, 5, 1})
public abstract class LastLoginInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String provider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ,\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¨\u0006\u000b"}, d2 = {"Lcom/huami/account/auth/entity/LastLoginInfo$Companion;", "", "", "provider", "username", "nickname", WebAPI.PARAM_SHARE_INVITE_AVATAR, "Lcom/huami/account/auth/entity/LastLoginInfo;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

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
                return "构造最后登录信息出错：" + kotlin.a.stackTraceToString(this.a);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Nullable
        public final LastLoginInfo build(@NotNull String provider, @Nullable String username, @NotNull String nickname, @Nullable String avatar) {
            try {
                Result.Companion companion = Result.Companion;
                switch (provider.hashCode()) {
                    case -1240244679:
                        if (provider.equals("google")) {
                            return new Google(nickname, avatar);
                        }
                        break;
                    case -791770330:
                        if (provider.equals("wechat")) {
                            return new WeChat(nickname, avatar);
                        }
                        break;
                    case -759499589:
                        if (provider.equals("xiaomi")) {
                            return new XiaoMi(nickname, avatar);
                        }
                        break;
                    case -433231361:
                        if (provider.equals("huami_phone")) {
                            return new Phone(nickname, avatar, username);
                        }
                        break;
                    case 3321844:
                        if (provider.equals("line")) {
                            return new Line(nickname, avatar);
                        }
                        break;
                    case 99628432:
                        if (provider.equals("huami")) {
                            return new Email(nickname, avatar, username);
                        }
                        break;
                    case 497130182:
                        if (provider.equals("facebook")) {
                            return new Facebook(nickname, avatar);
                        }
                        break;
                }
                throw new IllegalStateException("无效的登录类型 " + provider);
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J)\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\b\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/huami/account/auth/entity/LastLoginInfo$Email;", "Lcom/huami/account/auth/entity/LastLoginInfo$UsernameLogin;", "", "component1", "component2", "component3", "nickname", WebAPI.PARAM_SHARE_INVITE_AVATAR, "username", "copy", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "getNickname", "()Ljava/lang/String;", "c", "getAvatar", GoogleApiAvailabilityLight.a, "getUsername", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Email extends UsernameLogin {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String nickname;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final String avatar;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final String username;

        public Email(@NotNull String str, @Nullable String str2, @NotNull String str3) {
            super("huami", null);
            this.nickname = str;
            this.avatar = str2;
            this.username = str3;
        }

        public static /* synthetic */ Email copy$default(Email email, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = email.getNickname();
            }
            if ((i & 2) != 0) {
                str2 = email.getAvatar();
            }
            if ((i & 4) != 0) {
                str3 = email.getUsername();
            }
            return email.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return getNickname();
        }

        @Nullable
        public final String component2() {
            return getAvatar();
        }

        @NotNull
        public final String component3() {
            return getUsername();
        }

        @NotNull
        public final Email copy(@NotNull String nickname, @Nullable String avatar, @NotNull String username) {
            return new Email(nickname, avatar, username);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Email)) {
                return false;
            }
            Email email = (Email) other;
            return Intrinsics.areEqual(getNickname(), email.getNickname()) && Intrinsics.areEqual(getAvatar(), email.getAvatar()) && Intrinsics.areEqual(getUsername(), email.getUsername());
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo
        @Nullable
        public String getAvatar() {
            return this.avatar;
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo
        @NotNull
        public String getNickname() {
            return this.nickname;
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo.UsernameLogin
        @NotNull
        public String getUsername() {
            return this.username;
        }

        public int hashCode() {
            return (((getNickname().hashCode() * 31) + (getAvatar() == null ? 0 : getAvatar().hashCode())) * 31) + getUsername().hashCode();
        }

        @NotNull
        public String toString() {
            return "Email(nickname=" + getNickname() + ", avatar=" + getAvatar() + ", username=" + getUsername() + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001c\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/account/auth/entity/LastLoginInfo$Facebook;", "Lcom/huami/account/auth/entity/LastLoginInfo$ThirdPartLogin;", "", "component1", "component2", "nickname", WebAPI.PARAM_SHARE_INVITE_AVATAR, "copy", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "getNickname", "()Ljava/lang/String;", "c", "getAvatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Facebook extends ThirdPartLogin {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String nickname;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final String avatar;

        public Facebook(@NotNull String str, @Nullable String str2) {
            super("facebook", null);
            this.nickname = str;
            this.avatar = str2;
        }

        public static /* synthetic */ Facebook copy$default(Facebook facebook, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = facebook.getNickname();
            }
            if ((i & 2) != 0) {
                str2 = facebook.getAvatar();
            }
            return facebook.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return getNickname();
        }

        @Nullable
        public final String component2() {
            return getAvatar();
        }

        @NotNull
        public final Facebook copy(@NotNull String nickname, @Nullable String avatar) {
            return new Facebook(nickname, avatar);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Facebook)) {
                return false;
            }
            Facebook facebook = (Facebook) other;
            return Intrinsics.areEqual(getNickname(), facebook.getNickname()) && Intrinsics.areEqual(getAvatar(), facebook.getAvatar());
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo
        @Nullable
        public String getAvatar() {
            return this.avatar;
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo
        @NotNull
        public String getNickname() {
            return this.nickname;
        }

        public int hashCode() {
            return (getNickname().hashCode() * 31) + (getAvatar() == null ? 0 : getAvatar().hashCode());
        }

        @NotNull
        public String toString() {
            return "Facebook(nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001c\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/account/auth/entity/LastLoginInfo$Google;", "Lcom/huami/account/auth/entity/LastLoginInfo$ThirdPartLogin;", "", "component1", "component2", "nickname", WebAPI.PARAM_SHARE_INVITE_AVATAR, "copy", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "getNickname", "()Ljava/lang/String;", "c", "getAvatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Google extends ThirdPartLogin {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String nickname;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final String avatar;

        public Google(@NotNull String str, @Nullable String str2) {
            super("google", null);
            this.nickname = str;
            this.avatar = str2;
        }

        public static /* synthetic */ Google copy$default(Google google, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = google.getNickname();
            }
            if ((i & 2) != 0) {
                str2 = google.getAvatar();
            }
            return google.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return getNickname();
        }

        @Nullable
        public final String component2() {
            return getAvatar();
        }

        @NotNull
        public final Google copy(@NotNull String nickname, @Nullable String avatar) {
            return new Google(nickname, avatar);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Google)) {
                return false;
            }
            Google google = (Google) other;
            return Intrinsics.areEqual(getNickname(), google.getNickname()) && Intrinsics.areEqual(getAvatar(), google.getAvatar());
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo
        @Nullable
        public String getAvatar() {
            return this.avatar;
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo
        @NotNull
        public String getNickname() {
            return this.nickname;
        }

        public int hashCode() {
            return (getNickname().hashCode() * 31) + (getAvatar() == null ? 0 : getAvatar().hashCode());
        }

        @NotNull
        public String toString() {
            return "Google(nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001c\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/account/auth/entity/LastLoginInfo$Line;", "Lcom/huami/account/auth/entity/LastLoginInfo$ThirdPartLogin;", "", "component1", "component2", "nickname", WebAPI.PARAM_SHARE_INVITE_AVATAR, "copy", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "getNickname", "()Ljava/lang/String;", "c", "getAvatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Line extends ThirdPartLogin {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String nickname;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final String avatar;

        public Line(@NotNull String str, @Nullable String str2) {
            super("line", null);
            this.nickname = str;
            this.avatar = str2;
        }

        public static /* synthetic */ Line copy$default(Line line, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = line.getNickname();
            }
            if ((i & 2) != 0) {
                str2 = line.getAvatar();
            }
            return line.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return getNickname();
        }

        @Nullable
        public final String component2() {
            return getAvatar();
        }

        @NotNull
        public final Line copy(@NotNull String nickname, @Nullable String avatar) {
            return new Line(nickname, avatar);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Line)) {
                return false;
            }
            Line line = (Line) other;
            return Intrinsics.areEqual(getNickname(), line.getNickname()) && Intrinsics.areEqual(getAvatar(), line.getAvatar());
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo
        @Nullable
        public String getAvatar() {
            return this.avatar;
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo
        @NotNull
        public String getNickname() {
            return this.nickname;
        }

        public int hashCode() {
            return (getNickname().hashCode() * 31) + (getAvatar() == null ? 0 : getAvatar().hashCode());
        }

        @NotNull
        public String toString() {
            return "Line(nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J)\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\b\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/huami/account/auth/entity/LastLoginInfo$Phone;", "Lcom/huami/account/auth/entity/LastLoginInfo$UsernameLogin;", "", "component1", "component2", "component3", "nickname", WebAPI.PARAM_SHARE_INVITE_AVATAR, "username", "copy", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "getNickname", "()Ljava/lang/String;", "c", "getAvatar", GoogleApiAvailabilityLight.a, "getUsername", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Phone extends UsernameLogin {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String nickname;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final String avatar;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final String username;

        public Phone(@NotNull String str, @Nullable String str2, @NotNull String str3) {
            super("huami_phone", null);
            this.nickname = str;
            this.avatar = str2;
            this.username = str3;
        }

        public static /* synthetic */ Phone copy$default(Phone phone, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = phone.getNickname();
            }
            if ((i & 2) != 0) {
                str2 = phone.getAvatar();
            }
            if ((i & 4) != 0) {
                str3 = phone.getUsername();
            }
            return phone.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return getNickname();
        }

        @Nullable
        public final String component2() {
            return getAvatar();
        }

        @NotNull
        public final String component3() {
            return getUsername();
        }

        @NotNull
        public final Phone copy(@NotNull String nickname, @Nullable String avatar, @NotNull String username) {
            return new Phone(nickname, avatar, username);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) other;
            return Intrinsics.areEqual(getNickname(), phone.getNickname()) && Intrinsics.areEqual(getAvatar(), phone.getAvatar()) && Intrinsics.areEqual(getUsername(), phone.getUsername());
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo
        @Nullable
        public String getAvatar() {
            return this.avatar;
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo
        @NotNull
        public String getNickname() {
            return this.nickname;
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo.UsernameLogin
        @NotNull
        public String getUsername() {
            return this.username;
        }

        public int hashCode() {
            return (((getNickname().hashCode() * 31) + (getAvatar() == null ? 0 : getAvatar().hashCode())) * 31) + getUsername().hashCode();
        }

        @NotNull
        public String toString() {
            return "Phone(nickname=" + getNickname() + ", avatar=" + getAvatar() + ", username=" + getUsername() + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/huami/account/auth/entity/LastLoginInfo$ThirdPartLogin;", "Lcom/huami/account/auth/entity/LastLoginInfo;", "", "provider", "<init>", "(Ljava/lang/String;)V", "Lcom/huami/account/auth/entity/LastLoginInfo$XiaoMi;", "Lcom/huami/account/auth/entity/LastLoginInfo$WeChat;", "Lcom/huami/account/auth/entity/LastLoginInfo$Google;", "Lcom/huami/account/auth/entity/LastLoginInfo$Facebook;", "Lcom/huami/account/auth/entity/LastLoginInfo$Line;", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class ThirdPartLogin extends LastLoginInfo {
        private ThirdPartLogin(String str) {
            super(str, null);
        }

        public /* synthetic */ ThirdPartLogin(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/huami/account/auth/entity/LastLoginInfo$UsernameLogin;", "Lcom/huami/account/auth/entity/LastLoginInfo;", "", "getUsername", "()Ljava/lang/String;", "username", "provider", "<init>", "(Ljava/lang/String;)V", "Lcom/huami/account/auth/entity/LastLoginInfo$Phone;", "Lcom/huami/account/auth/entity/LastLoginInfo$Email;", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class UsernameLogin extends LastLoginInfo {
        private UsernameLogin(String str) {
            super(str, null);
        }

        public /* synthetic */ UsernameLogin(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @NotNull
        public abstract String getUsername();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001c\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/account/auth/entity/LastLoginInfo$WeChat;", "Lcom/huami/account/auth/entity/LastLoginInfo$ThirdPartLogin;", "", "component1", "component2", "nickname", WebAPI.PARAM_SHARE_INVITE_AVATAR, "copy", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "getNickname", "()Ljava/lang/String;", "c", "getAvatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class WeChat extends ThirdPartLogin {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String nickname;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final String avatar;

        public WeChat(@NotNull String str, @Nullable String str2) {
            super("wechat", null);
            this.nickname = str;
            this.avatar = str2;
        }

        public static /* synthetic */ WeChat copy$default(WeChat weChat, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = weChat.getNickname();
            }
            if ((i & 2) != 0) {
                str2 = weChat.getAvatar();
            }
            return weChat.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return getNickname();
        }

        @Nullable
        public final String component2() {
            return getAvatar();
        }

        @NotNull
        public final WeChat copy(@NotNull String nickname, @Nullable String avatar) {
            return new WeChat(nickname, avatar);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeChat)) {
                return false;
            }
            WeChat weChat = (WeChat) other;
            return Intrinsics.areEqual(getNickname(), weChat.getNickname()) && Intrinsics.areEqual(getAvatar(), weChat.getAvatar());
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo
        @Nullable
        public String getAvatar() {
            return this.avatar;
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo
        @NotNull
        public String getNickname() {
            return this.nickname;
        }

        public int hashCode() {
            return (getNickname().hashCode() * 31) + (getAvatar() == null ? 0 : getAvatar().hashCode());
        }

        @NotNull
        public String toString() {
            return "WeChat(nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001c\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/account/auth/entity/LastLoginInfo$XiaoMi;", "Lcom/huami/account/auth/entity/LastLoginInfo$ThirdPartLogin;", "", "component1", "component2", "nickname", WebAPI.PARAM_SHARE_INVITE_AVATAR, "copy", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "getNickname", "()Ljava/lang/String;", "c", "getAvatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class XiaoMi extends ThirdPartLogin {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String nickname;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final String avatar;

        public XiaoMi(@NotNull String str, @Nullable String str2) {
            super("xiaomi", null);
            this.nickname = str;
            this.avatar = str2;
        }

        public static /* synthetic */ XiaoMi copy$default(XiaoMi xiaoMi, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = xiaoMi.getNickname();
            }
            if ((i & 2) != 0) {
                str2 = xiaoMi.getAvatar();
            }
            return xiaoMi.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return getNickname();
        }

        @Nullable
        public final String component2() {
            return getAvatar();
        }

        @NotNull
        public final XiaoMi copy(@NotNull String nickname, @Nullable String avatar) {
            return new XiaoMi(nickname, avatar);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof XiaoMi)) {
                return false;
            }
            XiaoMi xiaoMi = (XiaoMi) other;
            return Intrinsics.areEqual(getNickname(), xiaoMi.getNickname()) && Intrinsics.areEqual(getAvatar(), xiaoMi.getAvatar());
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo
        @Nullable
        public String getAvatar() {
            return this.avatar;
        }

        @Override // com.huami.account.auth.entity.LastLoginInfo
        @NotNull
        public String getNickname() {
            return this.nickname;
        }

        public int hashCode() {
            return (getNickname().hashCode() * 31) + (getAvatar() == null ? 0 : getAvatar().hashCode());
        }

        @NotNull
        public String toString() {
            return "XiaoMi(nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
        }
    }

    private LastLoginInfo(String str) {
        this.provider = str;
    }

    public /* synthetic */ LastLoginInfo(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Nullable
    public abstract String getAvatar();

    @NotNull
    public abstract String getNickname();

    @NotNull
    public final String getProvider() {
        return this.provider;
    }
}
