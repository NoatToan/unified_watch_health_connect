package com.huami.heartrate.repository.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/heartrate/repository/entity/HeartRateSyncType;", "", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface HeartRateSyncType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int STATE_NEED_DELETE = 2;
    public static final int STATE_NEED_SYNC = 0;
    public static final int STATE_SYNCED = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/heartrate/repository/entity/HeartRateSyncType$Companion;", "", "", "STATE_NEED_SYNC", LogUtil.I, "STATE_SYNCED", "STATE_NEED_DELETE", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int STATE_NEED_DELETE = 2;
        public static final int STATE_NEED_SYNC = 0;
        public static final int STATE_SYNCED = 1;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }
}
