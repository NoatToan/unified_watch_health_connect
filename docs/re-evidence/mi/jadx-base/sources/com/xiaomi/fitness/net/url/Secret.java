package com.xiaomi.fitness.net.url;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Target({ElementType.TYPE, ElementType.METHOD})
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB8\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\nR\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u000bR\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\fR\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\rR\u000f\u0010\b\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\fR\u000f\u0010\t\u001a\u00020\n¢\u0006\u0006\u001a\u0004\b\t\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/net/url/Secret;", "", "encryptResponse", "", "pathPrefix", "", "filterSignatureKeys", "", "sid", "loginPolicy", "", "()Z", "()Ljava/lang/String;", "()[Ljava/lang/String;", "()I", "Companion", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface Secret {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int LOGIN_POLICY_MEYBE = 3;
    public static final int LOGIN_POLICY_NECESSARY = 2;
    public static final int LOGIN_POLICY_UNNECESSARY = 1;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/net/url/Secret$Companion;", "", "<init>", "()V", "LOGIN_POLICY_UNNECESSARY", "", "LOGIN_POLICY_NECESSARY", "LOGIN_POLICY_MEYBE", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int LOGIN_POLICY_MEYBE = 3;
        public static final int LOGIN_POLICY_NECESSARY = 2;
        public static final int LOGIN_POLICY_UNNECESSARY = 1;

        private Companion() {
        }
    }

    boolean encryptResponse() default true;

    String[] filterSignatureKeys() default {"data"};

    int loginPolicy() default 2;

    String pathPrefix() default "";

    String sid() default "";
}
