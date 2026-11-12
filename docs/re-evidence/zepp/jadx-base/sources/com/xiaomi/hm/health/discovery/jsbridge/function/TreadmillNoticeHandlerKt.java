package com.xiaomi.hm.health.discovery.jsbridge.function;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.reminder.AdRemindParserKt;
import com.xiaomi.hm.health.reminder.NotifyMessagePushCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0000\"\u0016\u0010\t\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", SOAP.XMLNS, "Lcom/xiaomi/hm/health/reminder/NotifyMessagePushCallback;", "callback", "", "formatMessage", "data", "Lcom/xiaomi/hm/health/discovery/jsbridge/function/JsTreadmillMaintainData;", "parse", "KEY_TYPE", "Ljava/lang/String;", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class TreadmillNoticeHandlerKt {

    @NotNull
    public static final String KEY_TYPE = "type";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parseData: " + this.a;
        }
    }

    public static final void formatMessage(@NotNull String str, @NotNull NotifyMessagePushCallback notifyMessagePushCallback) {
        JsTreadmillMaintainData jsTreadmillMaintainData = parse(str);
        if (jsTreadmillMaintainData == null) {
            notifyMessagePushCallback.onResult(6);
        } else if (1 != jsTreadmillMaintainData.getType()) {
            notifyMessagePushCallback.onResult(6);
        } else {
            notifyMessagePushCallback.onResult(-1);
        }
    }

    @Nullable
    public static final JsTreadmillMaintainData parse(@NotNull String str) {
        try {
            return new JsTreadmillMaintainData(new JSONObject(str).getInt("type"));
        } catch (Exception e) {
            HMLog.info(AdRemindParserKt.TAG, new a(e));
            return null;
        }
    }
}
