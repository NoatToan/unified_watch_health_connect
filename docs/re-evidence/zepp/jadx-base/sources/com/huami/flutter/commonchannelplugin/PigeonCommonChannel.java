package com.huami.flutter.commonchannelplugin;

import com.huami.flutter.commonchannelplugin.PigeonCommonChannel;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.musicupload.fragment.MusicConstant;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class PigeonCommonChannel {

    public static class EventModel {
        private Long a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private String e;
        private Long f;
        private Map<String, String> g;

        public static EventModel a(Map<String, Object> map) {
            Long lValueOf;
            EventModel eventModel = new EventModel();
            Object obj = map.get("eventType");
            Long lValueOf2 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            eventModel.a = lValueOf;
            eventModel.b = (Boolean) map.get(MusicConstant.FTP_USER_NAME);
            eventModel.c = (Boolean) map.get("identified");
            eventModel.d = (Boolean) map.get("realTimeRecord");
            eventModel.e = (String) map.get(DbUtils.Const.Columns.Event.EVENT_ID);
            Object obj2 = map.get("calculationTimeValue");
            if (obj2 != null) {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            eventModel.f = lValueOf2;
            eventModel.g = (Map) map.get("extras");
            return eventModel;
        }

        public Map<String, Object> b() {
            HashMap map = new HashMap();
            map.put("eventType", this.a);
            map.put(MusicConstant.FTP_USER_NAME, this.b);
            map.put("identified", this.c);
            map.put("realTimeRecord", this.d);
            map.put(DbUtils.Const.Columns.Event.EVENT_ID, this.e);
            map.put("calculationTimeValue", this.f);
            map.put("extras", this.g);
            return map;
        }

        public Boolean getAnonymous() {
            return this.b;
        }

        public Long getCalculationTimeValue() {
            return this.f;
        }

        public String getEventId() {
            return this.e;
        }

        public Long getEventType() {
            return this.a;
        }

        public Map<String, String> getExtras() {
            return this.g;
        }

        public Boolean getIdentified() {
            return this.c;
        }

        public Boolean getRealTimeRecord() {
            return this.d;
        }

        public void setAnonymous(Boolean bool) {
            this.b = bool;
        }

        public void setCalculationTimeValue(Long l) {
            this.f = l;
        }

        public void setEventId(String str) {
            this.e = str;
        }

        public void setEventType(Long l) {
            this.a = l;
        }

        public void setExtras(Map<String, String> map) {
            this.g = map;
        }

        public void setIdentified(Boolean bool) {
            this.c = bool;
        }

        public void setRealTimeRecord(Boolean bool) {
            this.d = bool;
        }
    }

    public static class HeaderInfo {
        private Map<String, String> a;

        public static HeaderInfo a(Map<String, Object> map) {
            HeaderInfo headerInfo = new HeaderInfo();
            headerInfo.a = (Map) map.get("headerInfo");
            return headerInfo;
        }

        public Map<String, Object> b() {
            HashMap map = new HashMap();
            map.put("headerInfo", this.a);
            return map;
        }

        public Map<String, String> getHeaderInfo() {
            return this.a;
        }

        public void setHeaderInfo(Map<String, String> map) {
            this.a = map;
        }
    }

    public interface PigeonCommonChannelApi {
        void canPopFlutterPage(Boolean bool, Result<Void> result);

        void exitFlutterModule(Result<Void> result);

        void getHeaderInfo(Result<HeaderInfo> result);

        void getHostInfo(Result<String> result);

        void isDarkMode(Result<Boolean> result);

        void recordEvent(EventModel eventModel, Result<Boolean> result);
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t);
    }

    public class a implements Result<Boolean> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ BasicMessageChannel.Reply b;

        public a(Map map, BasicMessageChannel.Reply reply) {
            this.a = map;
            this.b = reply;
        }

        @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(Boolean bool) {
            this.a.put("result", bool);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonCommonChannel.p(th));
            this.b.reply(this.a);
        }
    }

    public class b implements Result<HeaderInfo> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ BasicMessageChannel.Reply b;

        public b(Map map, BasicMessageChannel.Reply reply) {
            this.a = map;
            this.b = reply;
        }

        @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(HeaderInfo headerInfo) {
            this.a.put("result", headerInfo);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonCommonChannel.p(th));
            this.b.reply(this.a);
        }
    }

    public class c implements Result<String> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ BasicMessageChannel.Reply b;

        public c(Map map, BasicMessageChannel.Reply reply) {
            this.a = map;
            this.b = reply;
        }

        @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(String str) {
            this.a.put("result", str);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonCommonChannel.p(th));
            this.b.reply(this.a);
        }
    }

    public class d implements Result<Void> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ BasicMessageChannel.Reply b;

        public d(Map map, BasicMessageChannel.Reply reply) {
            this.a = map;
            this.b = reply;
        }

        @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(Void r3) {
            this.a.put("result", null);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonCommonChannel.p(th));
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

        @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(Void r3) {
            this.a.put("result", null);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonCommonChannel.p(th));
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

        @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.Result
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void success(Boolean bool) {
            this.a.put("result", bool);
            this.b.reply(this.a);
        }

        @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.Result
        public void error(Throwable th) {
            this.a.put("error", PigeonCommonChannel.p(th));
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
                return b != -127 ? super.readValueOfType(b, byteBuffer) : HeaderInfo.a((Map) readValue(byteBuffer));
            }
            return EventModel.a((Map) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof EventModel) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((EventModel) obj).b());
            } else if (!(obj instanceof HeaderInfo)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((HeaderInfo) obj).b());
            }
        }
    }

    public static MessageCodec<Object> h() {
        return g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(PigeonCommonChannelApi pigeonCommonChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            EventModel eventModel = (EventModel) ((ArrayList) obj).get(0);
            if (eventModel == null) {
                throw new NullPointerException("eventModelArg unexpectedly null.");
            }
            pigeonCommonChannelApi.recordEvent(eventModel, new a(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(PigeonCommonChannelApi pigeonCommonChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            pigeonCommonChannelApi.getHeaderInfo(new b(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(PigeonCommonChannelApi pigeonCommonChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            pigeonCommonChannelApi.getHostInfo(new c(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(PigeonCommonChannelApi pigeonCommonChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            pigeonCommonChannelApi.exitFlutterModule(new d(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(PigeonCommonChannelApi pigeonCommonChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            Boolean bool = (Boolean) ((ArrayList) obj).get(0);
            if (bool == null) {
                throw new NullPointerException("canPopArg unexpectedly null.");
            }
            pigeonCommonChannelApi.canPopFlutterPage(bool, new e(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(PigeonCommonChannelApi pigeonCommonChannelApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap map = new HashMap();
        try {
            pigeonCommonChannelApi.isDarkMode(new f(map, reply));
        } catch (Error | RuntimeException e2) {
            map.put("error", p(e2));
            reply.reply(map);
        }
    }

    public static void o(BinaryMessenger binaryMessenger, final PigeonCommonChannelApi pigeonCommonChannelApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonCommonChannelApi.recordEvent", h());
        if (pigeonCommonChannelApi != null) {
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: wz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonCommonChannel.i(pigeonCommonChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonCommonChannelApi.getHeaderInfo", h());
        if (pigeonCommonChannelApi != null) {
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: zz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonCommonChannel.j(pigeonCommonChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonCommonChannelApi.getHostInfo", h());
        if (pigeonCommonChannelApi != null) {
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: vz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonCommonChannel.k(pigeonCommonChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonCommonChannelApi.exitFlutterModule", h());
        if (pigeonCommonChannelApi != null) {
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonCommonChannel.l(pigeonCommonChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonCommonChannelApi.canPopFlutterPage", h());
        if (pigeonCommonChannelApi != null) {
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: a06
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonCommonChannel.m(pigeonCommonChannelApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PigeonCommonChannelApi.isDarkMode", h());
        if (pigeonCommonChannelApi != null) {
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: xz5
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    PigeonCommonChannel.n(pigeonCommonChannelApi, obj, reply);
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
