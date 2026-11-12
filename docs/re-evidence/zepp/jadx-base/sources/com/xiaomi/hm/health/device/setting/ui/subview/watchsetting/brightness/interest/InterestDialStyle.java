package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestDialStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "DIGITALDIAL", "ANALOGDIAL", "FOLLOWDIAL", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public enum InterestDialStyle {
    DIGITALDIAL,
    ANALOGDIAL,
    FOLLOWDIAL;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestDialStyle$Companion;", "", "", "ordinal", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestDialStyle;", "parseDialMode", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterestDialStyle parseDialMode(int ordinal) {
            for (InterestDialStyle interestDialStyle : InterestDialStyle.values()) {
                if (interestDialStyle.ordinal() == ordinal) {
                    return interestDialStyle;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }
}
