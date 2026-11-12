package com.huami.message.converter;

import android.text.TextUtils;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.push.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0002"}, d2 = {"", "toFollowStatusPo", "common-message_release"}, k = 2, mv = {1, 5, 1})
public final class OtherToPoKt {
    @NotNull
    public static final String toFollowStatusPo(@NotNull String str) {
        if (TextUtils.equals(Constant.FOLLOW_STATUS, str)) {
            return Type.FOLLOW_MESSAGE;
        }
        if (TextUtils.equals(Constant.UNFOLLOW_STATUS, str)) {
            return Type.UNFOLLOW_MESSAGE;
        }
        if (TextUtils.equals("FOLLOWEACH", str)) {
            return "followEach";
        }
        return TextUtils.equals("BLOCK", str) ? TransportUri.ACTION_BLOCK : "";
    }
}
