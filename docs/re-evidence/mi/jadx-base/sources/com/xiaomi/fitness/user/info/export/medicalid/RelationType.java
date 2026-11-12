package com.xiaomi.fitness.user.info.export.medicalid;

import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.miui.tsmclient.service.DKFRequestService;
import com.xiaomi.digitalkey.wearable.storage.KeyShareRecord;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/medicalid/RelationType;", "", "Companion", "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface RelationType {
    public static final int ASSISTANT = 11;
    public static final int BROTHER = 3;
    public static final int CARETAKER = 17;
    public static final int CHILD = 9;
    public static final int CLASSMATE = 8;
    public static final int COLLEAGUE = 7;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DOCTOR = 14;
    public static final int FAMILY_MEMBER = 15;
    public static final int FRIEND = 6;
    public static final int GUARDIAN = 18;
    public static final int KINDERGARTEN = 21;
    public static final int LOVER = 5;
    public static final int OTHER = 22;
    public static final int PARENT = 1;
    public static final int PARTNER = 10;
    public static final int ROOMMATE = 13;
    public static final int SCHOOL = 20;
    public static final int SISTER = 2;
    public static final int SOCIAL_WORKER = 19;
    public static final int SPOUSE = 4;
    public static final int SUPERVISOR = 12;
    public static final int TEACHER = 16;
    public static final int UNKNOWN = 0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/medicalid/RelationType$Companion;", "", "<init>", "()V", DeviceTypes.UNKNOWN, "", "PARENT", "SISTER", "BROTHER", "SPOUSE", "LOVER", KeyShareRecord.SHARE_TYPE_FRIEND, "COLLEAGUE", "CLASSMATE", "CHILD", "PARTNER", "ASSISTANT", "SUPERVISOR", "ROOMMATE", "DOCTOR", "FAMILY_MEMBER", "TEACHER", "CARETAKER", "GUARDIAN", "SOCIAL_WORKER", "SCHOOL", "KINDERGARTEN", DKFRequestService.a.d, "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int ASSISTANT = 11;
        public static final int BROTHER = 3;
        public static final int CARETAKER = 17;
        public static final int CHILD = 9;
        public static final int CLASSMATE = 8;
        public static final int COLLEAGUE = 7;
        public static final int DOCTOR = 14;
        public static final int FAMILY_MEMBER = 15;
        public static final int FRIEND = 6;
        public static final int GUARDIAN = 18;
        public static final int KINDERGARTEN = 21;
        public static final int LOVER = 5;
        public static final int OTHER = 22;
        public static final int PARENT = 1;
        public static final int PARTNER = 10;
        public static final int ROOMMATE = 13;
        public static final int SCHOOL = 20;
        public static final int SISTER = 2;
        public static final int SOCIAL_WORKER = 19;
        public static final int SPOUSE = 4;
        public static final int SUPERVISOR = 12;
        public static final int TEACHER = 16;
        public static final int UNKNOWN = 0;

        private Companion() {
        }
    }
}
