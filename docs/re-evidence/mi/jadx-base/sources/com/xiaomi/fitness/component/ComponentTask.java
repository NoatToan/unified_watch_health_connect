package com.xiaomi.fitness.component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.METHOD})
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0002\u0018\u00002\u00020\u0001BL\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\tR\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\rR\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u000eR\u000f\u0010\u0006\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000eR\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000fR\u000f\u0010\n\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\n\u0010\rR\u000f\u0010\u000b\u001a\u00020\t¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0010R\u000f\u0010\f\u001a\u00020\t¢\u0006\u0006\u001a\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/component/ComponentTask;", "", "onMainThread", "", "notEarlierThan", "", "notLaterThan", "dependency", "", "", "multiProcess", "processName", "name", "()Z", "()I", "()[Ljava/lang/String;", "()Ljava/lang/String;", "component-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER})
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface ComponentTask {
    String[] dependency() default {};

    boolean multiProcess() default false;

    String name() default "";

    int notEarlierThan() default 2;

    int notLaterThan() default 5;

    boolean onMainThread() default true;

    String processName() default "";
}
