package com.xiaomi.fitness.push.core;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.push.bean.PushMessageStatus;
import com.xiaomi.fitness.push.export.PushManagerKt;
import com.xiaomi.fitness.schema.export.PushConstants;
import com.xiaomi.mipush.sdk.MiPushMessage;
import defpackage.xei;
import defpackage.xfl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\f\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/push/core/MessageCenter;", "", "<init>", "()V", "pendingMessage", "", "processPushNotification", "", "status", "Lcom/xiaomi/fitness/push/bean/PushMessageStatus;", "message", "Lcom/xiaomi/mipush/sdk/MiPushMessage;", "processPendingMessage", "push_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MessageCenter {

    @NotNull
    public static final MessageCenter INSTANCE = new MessageCenter();

    @Nullable
    private static String pendingMessage;

    private MessageCenter() {
    }

    public final void processPendingMessage() {
        xei.d("MessageCenter processPendingMessage " + pendingMessage);
        String str = pendingMessage;
        if (str != null) {
            xfl.b(AppUtil.getApp(), str);
        }
        pendingMessage = null;
    }

    public final void processPushNotification(@NotNull PushMessageStatus status, @Nullable MiPushMessage message) {
        String string;
        Intrinsics.checkNotNullParameter(status, "status");
        xei.d("MessageCenter   processPushNotification");
        if (message != null) {
            xei.d("message extras:" + new Gson().toJson(message.getExtra()) + " content:" + message.getContent());
            String content = message.getContent();
            if (TextUtils.isEmpty(content)) {
                string = "";
            } else {
                try {
                    string = new JSONObject(content).getString("launch_uri");
                } catch (JSONException e) {
                    e.printStackTrace();
                    string = "";
                }
            }
            if (TextUtils.isEmpty(string)) {
                string = PushConstants.getSSchemeMihealth() + "://intent?pageType=hometab";
            }
            if (status == PushMessageStatus.CLICK_PUSH_MESSAGE) {
                pendingMessage = string;
                MainExtKt.showMainActivity(AppUtil.getApp(), PushManagerKt.sMainPageHandlerPaddingAction, null);
            } else if (status == PushMessageStatus.RECEIVE_PUSH_MESSAGE) {
                xfl.b(AppUtil.getApp(), string);
            }
        }
    }
}
