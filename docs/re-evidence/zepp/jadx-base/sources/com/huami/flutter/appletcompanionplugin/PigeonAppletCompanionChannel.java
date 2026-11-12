package com.huami.flutter.appletcompanionplugin;

import com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class PigeonAppletCompanionChannel {

    public static class OpenJsLogPageParams {
        private Long a;
        private String b;

        public static OpenJsLogPageParams a(Map<String, Object> map) {
            Long lValueOf;
            OpenJsLogPageParams openJsLogPageParams = new OpenJsLogPageParams();
            Object obj = map.get("appId");
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            openJsLogPageParams.a = lValueOf;
            openJsLogPageParams.b = (String) map.get("appName");
            return openJsLogPageParams;
        }

        public Map<String, Object> b() {
            HashMap map = new HashMap();
            map.put("appId", this.a);
            map.put("appName", this.b);
            return map;
        }

        public Long getAppId() {
            return this.a;
        }

        public String getAppName() {
            return this.b;
        }

        public void setAppId(Long l) {
            this.a = l;
        }

        public void setAppName(String str) {
            this.b = str;
        }
    }

    public static class OpenSettingPageParams {
        private Long a;
        private String b;
        private String c;

        public static OpenSettingPageParams a(Map<String, Object> map) {
            Long lValueOf;
            OpenSettingPageParams openSettingPageParams = new OpenSettingPageParams();
            Object obj = map.get("appId");
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            openSettingPageParams.a = lValueOf;
            openSettingPageParams.b = (String) map.get("appName");
            openSettingPageParams.c = (String) map.get("filePath");
            return openSettingPageParams;
        }

        public Map<String, Object> b() {
            HashMap map = new HashMap();
            map.put("appId", this.a);
            map.put("appName", this.b);
            map.put("filePath", this.c);
            return map;
        }

        public Long getAppId() {
            return this.a;
        }

        public String getAppName() {
            return this.b;
        }

        public String getFilePath() {
            return this.c;
        }

        public void setAppId(Long l) {
            this.a = l;
        }

        public void setAppName(String str) {
            this.b = str;
        }

        public void setFilePath(String str) {
            this.c = str;
        }
    }

    public interface PigeonAppletCompanionChannelApi {
        void getDeviceStorageConditions(Long l, Result<Long> result);

        void getInstalledApps(Result<String> result);

        void installAppletCompanion(String str, Result<Boolean> result);

        void openJsLogPage(OpenJsLogPageParams openJsLogPageParams, Result<Void> result);

        void openSettingPage(OpenSettingPageParams openSettingPageParams, Result<Void> result);

        void uninstallApp(Long l, Result<Long> result);
    }

    public static class PigeonAppletCompanionChannelCallbackApi {
        private final BinaryMessenger a;

        public interface Reply<T> {
            void reply(T t);
        }

        public PigeonAppletCompanionChannelCallbackApi(BinaryMessenger binaryMessenger) {
            this.a = binaryMessenger;
        }

        public static MessageCodec<Object> b() {
            return h.a;
        }

        public void uninstallAppFromDevice(Long l, final Reply<Void> reply) {
            new BasicMessageChannel(this.a, "dev.flutter.pigeon.PigeonAppletCompanionChannelCallbackApi.uninstallAppFromDevice", b()).send(new ArrayList(Arrays.asList(l)), new BasicMessageChannel.Reply() { // from class: mz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t);
    }

    public class a implements Result<String> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ BasicMessageChannel.Reply b;

        public a(Map map, BasicMessageChannel.Reply reply) {
            this.a = map;
            this.b = reply;
        }

        @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(String str) {
            this.a.put("result", str);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonAppletCompanionChannel.p(th));
            this.b.reply(this.a);
        }
    }

    public class b implements Result<Long> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ BasicMessageChannel.Reply b;

        public b(Map map, BasicMessageChannel.Reply reply) {
            this.a = map;
            this.b = reply;
        }

        @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(Long l) {
            this.a.put("result", l);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonAppletCompanionChannel.p(th));
            this.b.reply(this.a);
        }
    }

    public class c implements Result<Boolean> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ BasicMessageChannel.Reply b;

        public c(Map map, BasicMessageChannel.Reply reply) {
            this.a = map;
            this.b = reply;
        }

        @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(Boolean bool) {
            this.a.put("result", bool);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonAppletCompanionChannel.p(th));
            this.b.reply(this.a);
        }
    }

    public class d implements Result<Long> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ BasicMessageChannel.Reply b;

        public d(Map map, BasicMessageChannel.Reply reply) {
            this.a = map;
            this.b = reply;
        }

        @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(Long l) {
            this.a.put("result", l);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonAppletCompanionChannel.p(th));
            this.b.reply(this.a);
        }
    }

    public class e implements Result<Void> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ BasicMessageChannel.Reply b;

        public e(Map map, BasicMessageChannel.Reply reply) {
            this.a = map;
            this.b = reply;
        }

        @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(Void r3) {
            this.a.put("result", null);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonAppletCompanionChannel.p(th));
            this.b.reply(this.a);
        }
    }

    public class f implements Result<Void> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ BasicMessageChannel.Reply b;

        public f(Map map, BasicMessageChannel.Reply reply) {
            this.a = map;
            this.b = reply;
        }

        @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(Void r3) {
            this.a.put("result", null);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonAppletCompanionChannel.p(th));
            this.b.reply(this.a);
        }
    }

    public static class g extends StandardMessageCodec {
        public static final g a = new g();

        private g() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            if (b != -128) {
                return b != -127 ? super.readValueOfType(b, byteBuffer) : OpenSettingPageParams.a((Map) readValue(byteBuffer));
            }
            return OpenJsLogPageParams.a((Map) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof OpenJsLogPageParams) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((OpenJsLogPageParams) obj).b());
            } else if (!(obj instanceof OpenSettingPageParams)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((OpenSettingPageParams) obj).b());
            }
        }
    }

    public static class h extends StandardMessageCodec {
        public static final h a = new h();

        private h() {
        }
    }

    public static MessageCodec<Object> h() {
        return g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(PigeonAppletCompanionChannelApi pigeonAppletCompanionChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            pigeonAppletCompanionChannelApi.getInstalledApps(new a(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(PigeonAppletCompanionChannelApi pigeonAppletCompanionChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                throw new NullPointerException("appSizeArg unexpectedly null.");
            }
            pigeonAppletCompanionChannelApi.getDeviceStorageConditions(Long.valueOf(number.longValue()), new b(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(PigeonAppletCompanionChannelApi pigeonAppletCompanionChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str == null) {
                throw new NullPointerException("filePathArg unexpectedly null.");
            }
            pigeonAppletCompanionChannelApi.installAppletCompanion(str, new c(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(PigeonAppletCompanionChannelApi pigeonAppletCompanionChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                throw new NullPointerException("appIdArg unexpectedly null.");
            }
            pigeonAppletCompanionChannelApi.uninstallApp(Long.valueOf(number.longValue()), new d(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(PigeonAppletCompanionChannelApi pigeonAppletCompanionChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            OpenSettingPageParams openSettingPageParams = (OpenSettingPageParams) ((ArrayList) obj).get(0);
            if (openSettingPageParams == null) {
                throw new NullPointerException("openSettingPageParamsArg unexpectedly null.");
            }
            pigeonAppletCompanionChannelApi.openSettingPage(openSettingPageParams, new e(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(PigeonAppletCompanionChannelApi pigeonAppletCompanionChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            OpenJsLogPageParams openJsLogPageParams = (OpenJsLogPageParams) ((ArrayList) obj).get(0);
            if (openJsLogPageParams == null) {
                throw new NullPointerException("openJsLogPageParamsArg unexpectedly null.");
            }
            pigeonAppletCompanionChannelApi.openJsLogPage(openJsLogPageParams, new f(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    public static void o(BinaryMessenger binaryMessenger, final PigeonAppletCompanionChannelApi pigeonAppletCompanionChannelApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonAppletCompanionChannelApi.getInstalledApps", h());
        if (pigeonAppletCompanionChannelApi != null) {
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: iz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonAppletCompanionChannel.i(pigeonAppletCompanionChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonAppletCompanionChannelApi.getDeviceStorageConditions", h());
        if (pigeonAppletCompanionChannelApi != null) {
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: lz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonAppletCompanionChannel.j(pigeonAppletCompanionChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonAppletCompanionChannelApi.installAppletCompanion", h());
        if (pigeonAppletCompanionChannelApi != null) {
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: gz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonAppletCompanionChannel.k(pigeonAppletCompanionChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonAppletCompanionChannelApi.uninstallApp", h());
        if (pigeonAppletCompanionChannelApi != null) {
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: kz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonAppletCompanionChannel.l(pigeonAppletCompanionChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonAppletCompanionChannelApi.openSettingPage", h());
        if (pigeonAppletCompanionChannelApi != null) {
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: hz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonAppletCompanionChannel.m(pigeonAppletCompanionChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonAppletCompanionChannelApi.openJsLogPage", h());
        if (pigeonAppletCompanionChannelApi != null) {
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: jz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonAppletCompanionChannel.n(pigeonAppletCompanionChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel6.setMessageHandler(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> p(Throwable th) {
        HashMap map = new HashMap();
        map.put("message", th.toString());
        map.put("code", th.getClass().getSimpleName());
        map.put("details", null);
        return map;
    }
}
