package com.huami.midong.webview.nativejsapi.apis;

import com.google.gson.Gson;
import com.huami.midong.webview.JsBridgeDelegate;
import com.huami.midong.webview.jsbridge.JsBridgeError;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.midong.webview.nativejsapi.apis.JsPushDeviceNoticeFunc;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class JsPushDeviceNoticeFunc extends JsBridgeFunc {
    private DateFormat mDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public class DeviceNotificationEffect {
        private Icon icon;
        private List<Reminders> reminders = new ArrayList();
        private Text text;
        private Vibration vibration;

        public DeviceNotificationEffect() {
        }

        public Icon getIcon() {
            return this.icon;
        }

        public List<Reminders> getReminders() {
            return this.reminders;
        }

        public Text getText() {
            return this.text;
        }

        public Vibration getVibration() {
            return this.vibration;
        }

        public void setIcon(Icon icon) {
            this.icon = icon;
        }

        public void setReminders(List<Reminders> list) {
            this.reminders = list;
        }

        public void setText(Text text) {
            this.text = text;
        }

        public void setVibration(Vibration vibration) {
            this.vibration = vibration;
        }
    }

    public class Icon {
        private String uri;

        public Icon() {
        }

        public String getUri() {
            return this.uri;
        }

        public void setUri(String str) {
            this.uri = str;
        }
    }

    public class Notice {
        private int acceptDelay;
        private String callback;
        private DeviceNotificationEffect deviceNotificationEffect;
        private String from;
        private String messageId;

        public Notice() {
        }

        public int getAcceptDelay() {
            return this.acceptDelay;
        }

        public String getCallback() {
            return this.callback;
        }

        public DeviceNotificationEffect getDeviceNotificationEffect() {
            return this.deviceNotificationEffect;
        }

        public String getFrom() {
            return this.from;
        }

        public String getMessageId() {
            return this.messageId;
        }

        public void setAcceptDelay(int i) {
            this.acceptDelay = i;
        }

        public void setCallback(String str) {
            this.callback = str;
        }

        public void setDeviceNotificationEffect(DeviceNotificationEffect deviceNotificationEffect) {
            this.deviceNotificationEffect = deviceNotificationEffect;
        }

        public void setFrom(String str) {
            this.from = str;
        }

        public void setMessageId(String str) {
            this.messageId = str;
        }
    }

    public class Reminders {
        private String from;
        private int id;
        private String loop;
        private int op;
        private String startDate;
        private String stopDate;

        public Reminders() {
        }

        public String getFrom() {
            return this.from;
        }

        public int getId() {
            return this.id;
        }

        public String getLoop() {
            return this.loop;
        }

        public int getOp() {
            return this.op;
        }

        public String getStartDate() {
            return this.startDate;
        }

        public String getStopDate() {
            return this.stopDate;
        }

        public void setFrom(String str) {
            this.from = str;
        }

        public void setId(int i) {
            this.id = i;
        }

        public void setLoop(String str) {
            this.loop = str;
        }

        public void setOp(int i) {
            this.op = i;
        }

        public void setStartDate(String str) {
            this.startDate = str;
        }

        public void setStopDate(String str) {
            this.stopDate = str;
        }
    }

    public class Text {
        private String body;
        private String title;

        public Text() {
        }

        public String getBody() {
            return this.body;
        }

        public String getTitle() {
            return this.title;
        }

        public void setBody(String str) {
            this.body = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }
    }

    public class Vibration {
        private String mode;

        public Vibration() {
        }

        public String getMode() {
            return this.mode;
        }

        public void setMode(String str) {
            this.mode = str;
        }
    }

    private void cancel(final Reminders reminders, final JsCallBackFunction jsCallBackFunction) {
        Rx.io(new ObservableOnSubscribe() { // from class: dk4
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                JsPushDeviceNoticeFunc.lambda$cancel$2(reminders, observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: fk4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                JsPushDeviceNoticeFunc.lambda$cancel$3(jsCallBackFunction, (Long) obj);
            }
        });
    }

    private Reminders getReminder(Notice notice) {
        if (notice == null || notice.getDeviceNotificationEffect() == null || notice.getDeviceNotificationEffect() == null || notice.getDeviceNotificationEffect().getReminders().size() <= 0) {
            return null;
        }
        return notice.getDeviceNotificationEffect().getReminders().get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cancel$2(Reminders reminders, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Long.valueOf(JsBridgeDelegate.getJsBridgeCallback().cancelDeviceNotice(reminders)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cancel$3(JsCallBackFunction jsCallBackFunction, Long l) throws Exception {
        if (l.longValue() == 1) {
            jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
        } else {
            jsCallBackFunction.onCallBack(new Gson().toJson(new JsBridgeError(l.longValue(), new String[0])));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$set$0(Notice notice, Reminders reminders, long j, long j2, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Long.valueOf(JsBridgeDelegate.getJsBridgeCallback().pushDeviceNotice(notice, reminders, j, j2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$set$1(JsCallBackFunction jsCallBackFunction, Long l) throws Exception {
        if (l.longValue() == 1) {
            jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
        } else {
            jsCallBackFunction.onCallBack(new Gson().toJson(new JsBridgeError(l.longValue(), new String[0])));
        }
    }

    private Notice parseNotice(String str) {
        try {
            return (Notice) new Gson().fromJson(str, Notice.class);
        } catch (Exception e) {
            Log.e(JsBridgeFunc.TAG, e.getMessage(), e, new Object[0]);
            return null;
        }
    }

    private void set(final Notice notice, final Reminders reminders, final long j, final long j2, final JsCallBackFunction jsCallBackFunction) {
        Rx.io(new ObservableOnSubscribe() { // from class: ck4
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                JsPushDeviceNoticeFunc.lambda$set$0(notice, reminders, j, j2, observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: ek4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                JsPushDeviceNoticeFunc.lambda$set$1(jsCallBackFunction, (Long) obj);
            }
        });
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, JsCallBackFunction jsCallBackFunction) {
        Notice notice = parseNotice(str);
        Reminders reminder = getReminder(notice);
        if (reminder == null) {
            jsCallBackFunction.onCallBack(new Gson().toJson(new JsBridgeError(JsBridgeError.ERR_CODE_INVALID_PAYLOAD, new String[0])));
            return;
        }
        try {
            set(notice, reminder, this.mDateFormat.parse(reminder.getStartDate()).getTime(), this.mDateFormat.parse(reminder.getStopDate()).getTime(), jsCallBackFunction);
        } catch (ParseException e) {
            e.printStackTrace();
            cancel(reminder, jsCallBackFunction);
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_PUSH_DEVICE_NOTICE;
    }
}
