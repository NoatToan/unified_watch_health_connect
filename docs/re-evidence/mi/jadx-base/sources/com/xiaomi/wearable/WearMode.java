package com.xiaomi.wearable;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/wearable/WearMode;", "", "<init>", "()V", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WearMode {
    public static final int BEAN = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int NECKLACE = 2;
    public static final int WEAR = 0;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\b\u001a\u00020\t*\u00020\u0005J\n\u0010\n\u001a\u00020\u000b*\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/wearable/WearMode$Companion;", "", "<init>", "()V", "WEAR", "", "BEAN", "NECKLACE", "print", "", "keepAliveMode", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean keepAliveMode(int i) {
            return i == 1 || i == 2;
        }

        @NotNull
        public final String print(int i) {
            if (i == 0) {
                return "Wear";
            }
            if (i != 1) {
                return i != 2 ? "unknown" : "necklace";
            }
            return "Bean";
        }
    }
}
