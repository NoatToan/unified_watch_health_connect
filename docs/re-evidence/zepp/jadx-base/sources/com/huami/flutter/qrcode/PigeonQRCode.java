package com.huami.flutter.qrcode;

import android.util.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class PigeonQRCode {

    public interface Api {
        void startScanActivity();
    }

    public static class OnScanResultCallback {
        private final BinaryMessenger a;

        public interface Reply<T> {
            void reply(T t);
        }

        public OnScanResultCallback(BinaryMessenger binaryMessenger) {
            this.a = binaryMessenger;
        }

        public static MessageCodec<Object> b() {
            return b.a;
        }

        public void onScanResult(String str, final Reply<Void> reply) {
            new BasicMessageChannel(this.a, "dev.flutter.pigeon.OnScanResultCallback.onScanResult", b()).send(new ArrayList(Arrays.asList(str)), new BasicMessageChannel.Reply() { // from class: c06
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }
    }

    public static class a extends StandardMessageCodec {
        public static final a a = new a();

        private a() {
        }
    }

    public static class b extends StandardMessageCodec {
        public static final b a = new b();

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> b(Throwable th) {
        HashMap map = new HashMap();
        map.put("message", th.toString());
        map.put("code", th.getClass().getSimpleName());
        map.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return map;
    }
}
