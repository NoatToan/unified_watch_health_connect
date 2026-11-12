package com.xiaomi.fitness.component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/component/AppTime;", "", "Companion", "component-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface AppTime {
    public static final int AFTER_APP_CREATED = 4;
    public static final int AFTER_FIRST_ACT_CREATED = 7;
    public static final int AFTER_MAIN_ACT_CREATED = 11;
    public static final int APP_ATTACH_CONTEXT = 1;
    public static final int APP_CREATE = 3;
    public static final int BEFORE_APP_CREATED = 2;
    public static final int BEFORE_FIRST_ACT_CREATED = 5;
    public static final int BEFORE_MAIN_ACT_CREATED = 9;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int FIRST_ACT_CREATE = 6;
    public static final int MAIN_ACT_CREATED = 10;
    public static final int MAIN_HANDLER_IDLE = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/component/AppTime$Companion;", "", "<init>", "()V", "APP_ATTACH_CONTEXT", "", "BEFORE_APP_CREATED", "APP_CREATE", "AFTER_APP_CREATED", "BEFORE_FIRST_ACT_CREATED", "FIRST_ACT_CREATE", "AFTER_FIRST_ACT_CREATED", "MAIN_HANDLER_IDLE", "BEFORE_MAIN_ACT_CREATED", "MAIN_ACT_CREATED", "AFTER_MAIN_ACT_CREATED", "component-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int AFTER_APP_CREATED = 4;
        public static final int AFTER_FIRST_ACT_CREATED = 7;
        public static final int AFTER_MAIN_ACT_CREATED = 11;
        public static final int APP_ATTACH_CONTEXT = 1;
        public static final int APP_CREATE = 3;
        public static final int BEFORE_APP_CREATED = 2;
        public static final int BEFORE_FIRST_ACT_CREATED = 5;
        public static final int BEFORE_MAIN_ACT_CREATED = 9;
        public static final int FIRST_ACT_CREATE = 6;
        public static final int MAIN_ACT_CREATED = 10;
        public static final int MAIN_HANDLER_IDLE = 8;

        private Companion() {
        }
    }
}
