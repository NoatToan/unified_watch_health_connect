package com.huami.flutter.qrcode;

import com.huami.flutter.qrcode.a;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a {
    public static MessageCodec<Object> b() {
        return PigeonQRCode.a.a;
    }

    public static /* synthetic */ void c(PigeonQRCode.Api api, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            api.startScanActivity();
            map.put("result", null);
        } catch (Error | RuntimeException e) {
            map.put("error", PigeonQRCode.b(e));
        }
        reply.reply(map);
    }

    public static void d(BinaryMessenger binaryMessenger, final PigeonQRCode.Api api) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.Api.startScanActivity", b());
        if (api != null) {
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: b06
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    a.c(api, obj, reply);
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
    }
}
