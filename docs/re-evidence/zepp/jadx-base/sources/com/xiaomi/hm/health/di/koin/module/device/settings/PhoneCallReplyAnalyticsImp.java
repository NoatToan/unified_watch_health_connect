package com.xiaomi.hm.health.di.koin.module.device.settings;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.phone_call.sms.PhoneCallReplyAnalytics;
import com.huami.watch.ota.UpdateUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/module/device/settings/PhoneCallReplyAnalyticsImp;", "Lcom/huami/phone_call/sms/PhoneCallReplyAnalytics;", "", "msg", "", "result", "", UpdateUtils.CMD_SEND_RESULT, "<init>", "()V", "a", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PhoneCallReplyAnalyticsImp implements PhoneCallReplyAnalytics {

    @Deprecated
    @NotNull
    public static final String EVENT_ID = "INDEX_SMS_REPLIES";

    @Deprecated
    @NotNull
    public static final String KEY_RESULT = "result";

    @Deprecated
    @NotNull
    public static final String KEY_TEMPLATE = "template";

    @NotNull
    private static final a a = new a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"com/xiaomi/hm/health/di/koin/module/device/settings/PhoneCallReplyAnalyticsImp$a", "", "", "EVENT_ID", "Ljava/lang/String;", "KEY_RESULT", "KEY_TEMPLATE", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // com.huami.phone_call.sms.PhoneCallReplyAnalytics
    public void sendResult(@NotNull String msg, boolean result) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(EVENT_ID);
        int i = 2;
        Pair[] pairArr = new Pair[2];
        int iHashCode = msg.hashCode();
        if (iHashCode != -2027016144) {
            if (iHashCode != -1719167969) {
                if (iHashCode == -699386309 && msg.equals("现在正忙，请晚点打我手机，谢谢。")) {
                    i = 3;
                } else {
                    i = 0;
                }
            } else if (msg.equals("正在开会，稍后回复你。")) {
                i = 1;
            } else {
                i = 0;
            }
        } else if (!msg.equals("现在不方便接电话，稍后回复电话。")) {
            i = 0;
        }
        pairArr[0] = TuplesKt.to("template", String.valueOf(i));
        pairArr[1] = TuplesKt.to("result", result ? "0" : "1");
        Analytics.recordEvent(countEventBuilder.putExtras(r.mapOf(pairArr)));
    }
}
