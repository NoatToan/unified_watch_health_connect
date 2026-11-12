package com.xiaomi.fitness.sport_manager_export.listener;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Target({ElementType.METHOD})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/listener/Event;", "", "Companion", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface Event {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String GET_BPM = "get_bpm";

    @NotNull
    public static final String PLAY_STATE = "play_state";

    @NotNull
    public static final String UPDATE_SONGINFO = "update_songinfo";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/listener/Event$Companion;", "", "<init>", "()V", "UPDATE_SONGINFO", "", "PLAY_STATE", "GET_BPM", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String GET_BPM = "get_bpm";

        @NotNull
        public static final String PLAY_STATE = "play_state";

        @NotNull
        public static final String UPDATE_SONGINFO = "update_songinfo";

        private Companion() {
        }
    }
}
