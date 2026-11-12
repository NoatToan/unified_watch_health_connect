package com.xiaomi.hm.health.bt.profile.base;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0005\u000b\n\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/SystemImageStatus;", "Ljava/io/Serializable;", "", "a", LogUtil.I, "getCode", "()I", "code", "<init>", "(I)V", "Companion", "Broken", "Complete", "NoInformation", "Others", "Lcom/xiaomi/hm/health/bt/profile/base/SystemImageStatus$NoInformation;", "Lcom/xiaomi/hm/health/bt/profile/base/SystemImageStatus$Complete;", "Lcom/xiaomi/hm/health/bt/profile/base/SystemImageStatus$Broken;", "Lcom/xiaomi/hm/health/bt/profile/base/SystemImageStatus$Others;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class SystemImageStatus implements Serializable {
    public static final int BROKEN = 2;
    public static final int COMPLETE = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = 0;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int code;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/SystemImageStatus$Broken;", "Lcom/xiaomi/hm/health/bt/profile/base/SystemImageStatus;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Broken extends SystemImageStatus {

        @NotNull
        public static final Broken INSTANCE = new Broken();

        private Broken() {
            super(2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/SystemImageStatus$Companion;", "", "", "code", "Lcom/xiaomi/hm/health/bt/profile/base/SystemImageStatus;", "fromValue", "BROKEN", LogUtil.I, "COMPLETE", "NO_INFORMATION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SystemImageStatus fromValue(int code) {
            if (code == 0) {
                return NoInformation.INSTANCE;
            }
            if (code != 1) {
                return code != 2 ? new Others(code) : Broken.INSTANCE;
            }
            return Complete.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/SystemImageStatus$Complete;", "Lcom/xiaomi/hm/health/bt/profile/base/SystemImageStatus;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Complete extends SystemImageStatus {

        @NotNull
        public static final Complete INSTANCE = new Complete();

        private Complete() {
            super(1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/SystemImageStatus$NoInformation;", "Lcom/xiaomi/hm/health/bt/profile/base/SystemImageStatus;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class NoInformation extends SystemImageStatus {

        @NotNull
        public static final NoInformation INSTANCE = new NoInformation();

        private NoInformation() {
            super(0, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/SystemImageStatus$Others;", "Lcom/xiaomi/hm/health/bt/profile/base/SystemImageStatus;", "", "c", LogUtil.I, "getCode", "()I", "code", "<init>", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Others extends SystemImageStatus {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int code;

        public Others(int i) {
            super(i, null);
            this.code = i;
        }

        @Override // com.xiaomi.hm.health.bt.profile.base.SystemImageStatus
        public int getCode() {
            return this.code;
        }
    }

    private SystemImageStatus(int i) {
        this.code = i;
    }

    public /* synthetic */ SystemImageStatus(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public int getCode() {
        return this.code;
    }
}
