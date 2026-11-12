package com.facebook.login;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u001e\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\b\u0017\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013B-\b\u0016\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0014R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\r\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/facebook/login/LoginConfiguration;", "", "", "", "a", "Ljava/util/Set;", "getPermissions", "()Ljava/util/Set;", "permissions", "b", "Ljava/lang/String;", "getNonce", "()Ljava/lang/String;", "nonce", "c", "getCodeVerifier", "codeVerifier", "", "<init>", "(Ljava/util/Collection;Ljava/lang/String;)V", "(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class LoginConfiguration {

    @NotNull
    public static final String OPENID = "openid";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Set<String> permissions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String nonce;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String codeVerifier;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LoginConfiguration(@Nullable Collection<String> collection) {
        this(collection, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ LoginConfiguration(Collection collection, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, (i & 2) != 0 ? UUID.randomUUID().toString() : str);
    }

    @NotNull
    public final String getCodeVerifier() {
        return this.codeVerifier;
    }

    @NotNull
    public final String getNonce() {
        return this.nonce;
    }

    @NotNull
    public final Set<String> getPermissions() {
        return this.permissions;
    }

    @JvmOverloads
    public LoginConfiguration(@Nullable Collection<String> collection, @NotNull String str) {
        this(collection, str, PKCEUtil.generateCodeVerifier());
    }

    public /* synthetic */ LoginConfiguration(Collection collection, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : collection, (i & 2) != 0 ? UUID.randomUUID().toString() : str, str2);
    }

    public LoginConfiguration(@Nullable Collection<String> collection, @NotNull String str, @NotNull String str2) {
        if (NonceUtil.isValidNonce(str) && PKCEUtil.isValidCodeVerifier(str2)) {
            HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
            hashSet.add("openid");
            this.permissions = Collections.unmodifiableSet(hashSet);
            this.nonce = str;
            this.codeVerifier = str2;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
