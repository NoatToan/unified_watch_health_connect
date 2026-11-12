package com.huami.flutter.bluechannelplugin;

import com.huami.flutter.bluechannelplugin.PigeonBlueChannel;
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
public class PigeonBlueChannel {

    public static class DeviceInformation {
        private Long a;
        private String b;

        public static DeviceInformation a(Map<String, Object> map) {
            Long lValueOf;
            DeviceInformation deviceInformation = new DeviceInformation();
            Object obj = map.get("deviceSourceValue");
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            deviceInformation.a = lValueOf;
            deviceInformation.b = (String) map.get("boundDeviceAddress");
            return deviceInformation;
        }

        public Map<String, Object> b() {
            HashMap map = new HashMap();
            map.put("deviceSourceValue", this.a);
            map.put("boundDeviceAddress", this.b);
            return map;
        }

        public String getBoundDeviceAddress() {
            return this.b;
        }

        public Long getDeviceSourceValue() {
            return this.a;
        }

        public void setBoundDeviceAddress(String str) {
            this.b = str;
        }

        public void setDeviceSourceValue(Long l) {
            this.a = l;
        }
    }

    public static class DevicePackageInstallStatus {
        private Long a;
        private Boolean b;
        private Long c;

        public static DevicePackageInstallStatus a(Map<String, Object> map) {
            Long lValueOf;
            DevicePackageInstallStatus devicePackageInstallStatus = new DevicePackageInstallStatus();
            Object obj = map.get("progress");
            Long lValueOf2 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            devicePackageInstallStatus.a = lValueOf;
            devicePackageInstallStatus.b = (Boolean) map.get("finish");
            Object obj2 = map.get("status");
            if (obj2 != null) {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            devicePackageInstallStatus.c = lValueOf2;
            return devicePackageInstallStatus;
        }

        public Map<String, Object> b() {
            HashMap map = new HashMap();
            map.put("progress", this.a);
            map.put("finish", this.b);
            map.put("status", this.c);
            return map;
        }

        public Boolean getFinish() {
            return this.b;
        }

        public Long getProgress() {
            return this.a;
        }

        public Long getStatus() {
            return this.c;
        }

        public void setFinish(Boolean bool) {
            this.b = bool;
        }

        public void setProgress(Long l) {
            this.a = l;
        }

        public void setStatus(Long l) {
            this.c = l;
        }
    }

    public interface PigeonBlueChannelApi {
        void getConnectionStatus(Result<Long> result);

        void getDeviceInfo(Result<DeviceInformation> result);

        void getDeviceWatchFaceStorageConditions(Long l, Long l2, Result<Boolean> result);

        void getOtaStatus(String str, Result<Long> result);

        void isDeviceSupportJsApp(Result<Boolean> result);

        void sendDevicePackage(String str, String str2, Result<DevicePackageInstallStatus> result);
    }

    public static class PigeonBlueChannelCallbackApi {
        private final BinaryMessenger a;

        public interface Reply<T> {
            void reply(T t);
        }

        public PigeonBlueChannelCallbackApi(BinaryMessenger binaryMessenger) {
            this.a = binaryMessenger;
        }

        public static MessageCodec<Object> b() {
            return h.a;
        }

        public void sendDevicePackageInstallResult(DevicePackageInstallStatus devicePackageInstallStatus, final Reply<Void> reply) {
            new BasicMessageChannel(this.a, "dev.flutter.pigeon.PigeonBlueChannelCallbackApi.sendDevicePackageInstallResult", b()).send(new ArrayList(Arrays.asList(devicePackageInstallStatus)), new BasicMessageChannel.Reply() { // from class: tz5
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

    public class a implements Result<Long> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ BasicMessageChannel.Reply b;

        public a(Map map, BasicMessageChannel.Reply reply) {
            this.a = map;
            this.b = reply;
        }

        @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(Long l) {
            this.a.put("result", l);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonBlueChannel.p(th));
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

        @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(Long l) {
            this.a.put("result", l);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonBlueChannel.p(th));
            this.b.reply(this.a);
        }
    }

    public class c implements Result<DevicePackageInstallStatus> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ BasicMessageChannel.Reply b;

        public c(Map map, BasicMessageChannel.Reply reply) {
            this.a = map;
            this.b = reply;
        }

        @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(DevicePackageInstallStatus devicePackageInstallStatus) {
            this.a.put("result", devicePackageInstallStatus);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonBlueChannel.p(th));
            this.b.reply(this.a);
        }
    }

    public class d implements Result<DeviceInformation> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ BasicMessageChannel.Reply b;

        public d(Map map, BasicMessageChannel.Reply reply) {
            this.a = map;
            this.b = reply;
        }

        @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(DeviceInformation deviceInformation) {
            this.a.put("result", deviceInformation);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonBlueChannel.p(th));
            this.b.reply(this.a);
        }
    }

    public class e implements Result<Boolean> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ BasicMessageChannel.Reply b;

        public e(Map map, BasicMessageChannel.Reply reply) {
            this.a = map;
            this.b = reply;
        }

        @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(Boolean bool) {
            this.a.put("result", bool);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonBlueChannel.p(th));
            this.b.reply(this.a);
        }
    }

    public class f implements Result<Boolean> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ BasicMessageChannel.Reply b;

        public f(Map map, BasicMessageChannel.Reply reply) {
            this.a = map;
            this.b = reply;
        }

        @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(Boolean bool) {
            this.a.put("result", bool);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.bluechannelplugin.PigeonBlueChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonBlueChannel.p(th));
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
                return b != -127 ? super.readValueOfType(b, byteBuffer) : DevicePackageInstallStatus.a((Map) readValue(byteBuffer));
            }
            return DeviceInformation.a((Map) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof DeviceInformation) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((DeviceInformation) obj).b());
            } else if (!(obj instanceof DevicePackageInstallStatus)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((DevicePackageInstallStatus) obj).b());
            }
        }
    }

    public static class h extends StandardMessageCodec {
        public static final h a = new h();

        private h() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            return b != -128 ? super.readValueOfType(b, byteBuffer) : DevicePackageInstallStatus.a((Map) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof DevicePackageInstallStatus)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((DevicePackageInstallStatus) obj).b());
            }
        }
    }

    public static MessageCodec<Object> h() {
        return g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(PigeonBlueChannelApi pigeonBlueChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            pigeonBlueChannelApi.getConnectionStatus(new a(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(PigeonBlueChannelApi pigeonBlueChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str == null) {
                throw new NullPointerException("supportFwLowestVersionArg unexpectedly null.");
            }
            pigeonBlueChannelApi.getOtaStatus(str, new b(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(PigeonBlueChannelApi pigeonBlueChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new NullPointerException("devicePackagePathArg unexpectedly null.");
            }
            String str2 = (String) arrayList.get(1);
            if (str2 == null) {
                throw new NullPointerException("typeArg unexpectedly null.");
            }
            pigeonBlueChannelApi.sendDevicePackage(str, str2, new c(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(PigeonBlueChannelApi pigeonBlueChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            pigeonBlueChannelApi.getDeviceInfo(new d(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(PigeonBlueChannelApi pigeonBlueChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            pigeonBlueChannelApi.isDeviceSupportJsApp(new e(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(PigeonBlueChannelApi pigeonBlueChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number == null) {
                throw new NullPointerException("appSizeArg unexpectedly null.");
            }
            Number number2 = (Number) arrayList.get(1);
            if (number2 == null) {
                throw new NullPointerException("faceIdArg unexpectedly null.");
            }
            pigeonBlueChannelApi.getDeviceWatchFaceStorageConditions(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()), new f(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    public static void o(BinaryMessenger binaryMessenger, final PigeonBlueChannelApi pigeonBlueChannelApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonBlueChannelApi.getConnectionStatus", h());
        if (pigeonBlueChannelApi != null) {
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: rz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonBlueChannel.i(pigeonBlueChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonBlueChannelApi.getOtaStatus", h());
        if (pigeonBlueChannelApi != null) {
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonBlueChannel.j(pigeonBlueChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonBlueChannelApi.sendDevicePackage", h());
        if (pigeonBlueChannelApi != null) {
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonBlueChannel.k(pigeonBlueChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonBlueChannelApi.getDeviceInfo", h());
        if (pigeonBlueChannelApi != null) {
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: oz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonBlueChannel.l(pigeonBlueChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonBlueChannelApi.isDeviceSupportJsApp", h());
        if (pigeonBlueChannelApi != null) {
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: qz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonBlueChannel.m(pigeonBlueChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonBlueChannelApi.getDeviceWatchFaceStorageConditions", h());
        if (pigeonBlueChannelApi != null) {
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonBlueChannel.n(pigeonBlueChannelApi, obj, reply);
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
