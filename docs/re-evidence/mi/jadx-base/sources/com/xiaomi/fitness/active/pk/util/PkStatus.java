package com.xiaomi.fitness.active.pk.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE, ElementType.TYPE_USE})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/active/pk/util/PkStatus;", "", "Companion", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PkStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int STATUS_DONE = 4;
    public static final int STATUS_PROCESS = 1;
    public static final int STATUS_SETTLE_PROCESS = 3;
    public static final int STATUS_TOMORROW_START = 0;
    public static final int STATUS_WAIT_TO_SETTLED = 2;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/active/pk/util/PkStatus$Companion;", "", "<init>", "()V", "STATUS_TOMORROW_START", "", "STATUS_PROCESS", "STATUS_WAIT_TO_SETTLED", "STATUS_SETTLE_PROCESS", "STATUS_DONE", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int STATUS_DONE = 4;
        public static final int STATUS_PROCESS = 1;
        public static final int STATUS_SETTLE_PROCESS = 3;
        public static final int STATUS_TOMORROW_START = 0;
        public static final int STATUS_WAIT_TO_SETTLED = 2;

        private Companion() {
        }
    }
}
