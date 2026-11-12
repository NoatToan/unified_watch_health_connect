package com.example.aivs.export;

import androidx.annotation.Keep;
import com.xiaomi.smarthome.setting.ServerSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/example/aivs/export/AivsEnvEntry;", "", "type", "", "name", "", "<init>", "(ILjava/lang/String;)V", "getType", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "aivs-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AivsEnvEntry {
    public static final int PREVIEW = 1;
    public static final int PREVIEW4TEST = 3;
    public static final int PRODUCTION = 0;
    public static final int STAGING = 2;

    @NotNull
    private final String name;
    private final int type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AivsEnvEntry ENV_PREVIEW = new AivsEnvEntry(1, ServerSetting.SERVER_ENV_PREVIEW);

    @NotNull
    private static final AivsEnvEntry ENV_STAGING = new AivsEnvEntry(2, "staging");

    @NotNull
    private static final AivsEnvEntry ENV_PREVIEW4TEST = new AivsEnvEntry(3, "preview4test");

    @NotNull
    private static final AivsEnvEntry ENV_PRODUCTION = new AivsEnvEntry(0, "product");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/example/aivs/export/AivsEnvEntry$Companion;", "", "<init>", "()V", "PRODUCTION", "", "PREVIEW", "STAGING", "PREVIEW4TEST", "ENV_PREVIEW", "Lcom/example/aivs/export/AivsEnvEntry;", "getENV_PREVIEW", "()Lcom/example/aivs/export/AivsEnvEntry;", "ENV_STAGING", "getENV_STAGING", "ENV_PREVIEW4TEST", "getENV_PREVIEW4TEST", "ENV_PRODUCTION", "getENV_PRODUCTION", "aivs-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AivsEnvEntry getENV_PREVIEW() {
            return AivsEnvEntry.ENV_PREVIEW;
        }

        @NotNull
        public final AivsEnvEntry getENV_PREVIEW4TEST() {
            return AivsEnvEntry.ENV_PREVIEW4TEST;
        }

        @NotNull
        public final AivsEnvEntry getENV_PRODUCTION() {
            return AivsEnvEntry.ENV_PRODUCTION;
        }

        @NotNull
        public final AivsEnvEntry getENV_STAGING() {
            return AivsEnvEntry.ENV_STAGING;
        }
    }

    public AivsEnvEntry(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.type = i;
        this.name = name;
    }

    public static /* synthetic */ AivsEnvEntry copy$default(AivsEnvEntry aivsEnvEntry, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aivsEnvEntry.type;
        }
        if ((i2 & 2) != 0) {
            str = aivsEnvEntry.name;
        }
        return aivsEnvEntry.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final AivsEnvEntry copy(int type, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new AivsEnvEntry(type, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AivsEnvEntry)) {
            return false;
        }
        AivsEnvEntry aivsEnvEntry = (AivsEnvEntry) other;
        return this.type == aivsEnvEntry.type && Intrinsics.areEqual(this.name, aivsEnvEntry.name);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "AivsEnvEntry(type=" + this.type + ", name=" + this.name + ")";
    }
}
