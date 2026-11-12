package com.xiaomi.smarthome;

import com.xiaomi.smarthome.utils.Watcher;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/smarthome/IReadyCallback;", "", "isReadyListener", "", "autoRequest", "", "runnable", "Lcom/xiaomi/smarthome/utils/Watcher;", "", "Companion", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IReadyCallback {
    public static final int ACCOUNT = 4;
    public static final int CARD = 512;
    public static final int CHECK_ALL = 2047;
    public static final int CHECK_ERROR = -1;
    public static final int CHECK_WAIT = 0;
    public static final int CTA = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DEVICE = 32;
    public static final int DEVICE_CONFIG = 16;
    public static final int HOME = 64;
    public static final int NONE = 0;
    public static final int PROP_VALUE = 1024;
    public static final int SERVER = 2;
    public static final int SPEC_LANGUAGE = 256;
    public static final int SPEC_URN = 128;
    public static final int STAT = 8;

    @NotNull
    public static final String TAG = "IReadyCallback";

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/smarthome/IReadyCallback$Companion;", "", "()V", "ACCOUNT", "", "CARD", "CHECK_ALL", "CHECK_ERROR", "CHECK_WAIT", "CTA", "DEVICE", "DEVICE_CONFIG", "HOME", "NONE", "PROP_VALUE", "SERVER", "SPEC_LANGUAGE", "SPEC_URN", "STAT", "TAG", "", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int ACCOUNT = 4;
        public static final int CARD = 512;
        public static final int CHECK_ALL = 2047;
        public static final int CHECK_ERROR = -1;
        public static final int CHECK_WAIT = 0;
        public static final int CTA = 1;
        public static final int DEVICE = 32;
        public static final int DEVICE_CONFIG = 16;
        public static final int HOME = 64;
        public static final int NONE = 0;
        public static final int PROP_VALUE = 1024;
        public static final int SERVER = 2;
        public static final int SPEC_LANGUAGE = 256;
        public static final int SPEC_URN = 128;
        public static final int STAT = 8;

        @NotNull
        public static final String TAG = "IReadyCallback";

        private Companion() {
        }
    }

    void isReadyListener(boolean autoRequest, @NotNull Watcher<Integer> runnable);
}
