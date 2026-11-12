package com.huami.account.auth.quicklogin;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/account/auth/quicklogin/QuickLoginUiState;", "", "<init>", "()V", "NavigateNormalLogin", "auth_release"}, k = 1, mv = {1, 5, 1})
public final class QuickLoginUiState {

    @NotNull
    public static final QuickLoginUiState INSTANCE = new QuickLoginUiState();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/account/auth/quicklogin/QuickLoginUiState$NavigateNormalLogin;", "", "", "component1", "username", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "auth_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class NavigateNormalLogin {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        private final String username;

        /* JADX WARN: Multi-variable type inference failed */
        public NavigateNormalLogin() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public NavigateNormalLogin(@Nullable String str) {
            this.username = str;
        }

        public static /* synthetic */ NavigateNormalLogin copy$default(NavigateNormalLogin navigateNormalLogin, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateNormalLogin.username;
            }
            return navigateNormalLogin.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        @NotNull
        public final NavigateNormalLogin copy(@Nullable String username) {
            return new NavigateNormalLogin(username);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateNormalLogin) && Intrinsics.areEqual(this.username, ((NavigateNormalLogin) other).username);
        }

        @Nullable
        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            String str = this.username;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "NavigateNormalLogin(username=" + ((Object) this.username) + ')';
        }

        public /* synthetic */ NavigateNormalLogin(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    private QuickLoginUiState() {
    }
}
