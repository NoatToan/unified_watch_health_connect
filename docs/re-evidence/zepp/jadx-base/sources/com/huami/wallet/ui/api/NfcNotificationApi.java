package com.huami.wallet.ui.api;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ:\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0002H&¨\u0006\f"}, d2 = {"Lcom/huami/wallet/ui/api/NfcNotificationApi;", "", "", "hci", "cityCode", "", "consumption", StatEvent.SPORT_TP_VALUE_BALANCE, "aid", "", "notifySiteInfo", "NfcNotificationConfig", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public interface NfcNotificationApi {

    /* JADX INFO: renamed from: NfcNotificationConfig, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String channelId = "nfc_trade";

    /* JADX INFO: renamed from: com.huami.wallet.ui.api.NfcNotificationApi$NfcNotificationConfig, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/huami/wallet/ui/api/NfcNotificationApi$NfcNotificationConfig;", "", "", "channelId", "Ljava/lang/String;", "Lkotlin/Function0;", "", "b", "Lkotlin/jvm/functions/Function0;", "getChannelNameResId", "()Lkotlin/jvm/functions/Function0;", "setChannelNameResId", "(Lkotlin/jvm/functions/Function0;)V", "channelNameResId", "c", "getSmallIconResId", "setSmallIconResId", "smallIconResId", GoogleApiAvailabilityLight.a, "getLargeIconResId", "setLargeIconResId", "largeIconResId", "e", "getIconColorResId", "setIconColorResId", "iconColorResId", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @NotNull
        public static final String channelId = "nfc_trade";
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static Function0<Integer> channelNameResId = a.a;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private static Function0<Integer> smallIconResId = d.a;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private static Function0<Integer> largeIconResId = c.a;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private static Function0<Integer> iconColorResId = b.a;

        /* JADX INFO: renamed from: com.huami.wallet.ui.api.NfcNotificationApi$NfcNotificationConfig$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Integer> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                return -1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }
        }

        /* JADX INFO: renamed from: com.huami.wallet.ui.api.NfcNotificationApi$NfcNotificationConfig$b */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Integer> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                return -1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }
        }

        /* JADX INFO: renamed from: com.huami.wallet.ui.api.NfcNotificationApi$NfcNotificationConfig$c */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<Integer> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                return -1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }
        }

        /* JADX INFO: renamed from: com.huami.wallet.ui.api.NfcNotificationApi$NfcNotificationConfig$d */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<Integer> {
            public static final d a = new d();

            public d() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                return -1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }
        }

        private Companion() {
        }

        @NotNull
        public final Function0<Integer> getChannelNameResId() {
            return channelNameResId;
        }

        @NotNull
        public final Function0<Integer> getIconColorResId() {
            return iconColorResId;
        }

        @NotNull
        public final Function0<Integer> getLargeIconResId() {
            return largeIconResId;
        }

        @NotNull
        public final Function0<Integer> getSmallIconResId() {
            return smallIconResId;
        }

        public final void setChannelNameResId(@NotNull Function0<Integer> function0) {
            channelNameResId = function0;
        }

        public final void setIconColorResId(@NotNull Function0<Integer> function0) {
            iconColorResId = function0;
        }

        public final void setLargeIconResId(@NotNull Function0<Integer> function0) {
            largeIconResId = function0;
        }

        public final void setSmallIconResId(@NotNull Function0<Integer> function0) {
            smallIconResId = function0;
        }
    }

    void notifySiteInfo(@NotNull String hci, @NotNull String cityCode, @NotNull int consumption, @NotNull int balance, @NotNull String aid);
}
