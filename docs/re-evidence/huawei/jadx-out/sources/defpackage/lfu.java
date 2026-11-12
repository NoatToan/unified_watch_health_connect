package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class lfu extends MessageObject {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f40049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile long f40050b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40051c;
    private String d;
    private TimeUnit e;
    private int f;

    @Override // com.huawei.health.messagecenter.model.MessageObject
    public void setMsgId(String str) {
    }

    public lfu(long j, TimeUnit timeUnit) {
        this.f40049a = j;
        this.e = timeUnit;
    }

    public void a() {
        if (b()) {
            MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
            LogUtil.a("TimingMessageObject", "message expired, use new MessageID");
            super.setMsgId(messageCenterApi.getMessageId(getModule(), getType()));
        }
        this.f40050b = SystemClock.elapsedRealtime();
    }

    public void e() {
        Context context = BaseApplication.getContext();
        int i = this.f;
        setMsgTitle(i == -1 ? "" : context.getString(i));
        int i2 = this.f40051c;
        setMsgContent(i2 != -1 ? context.getString(i2) : "");
        LogUtil.a("TimingMessageObject", "refresh message locale=", Locale.getDefault().getLanguage(), ", title=[", getMsgTitle(), "], content=[", getMsgContent(), "]");
    }

    private boolean b() {
        return this.f40050b == 0 || SystemClock.elapsedRealtime() - this.f40050b > this.e.toMillis(this.f40049a);
    }

    @Override // com.huawei.health.messagecenter.model.MessageObject
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.huawei.health.messagecenter.model.MessageObject
    public int hashCode() {
        int iHashCode = super.hashCode();
        long j = this.f40049a;
        return Objects.hash(Integer.valueOf(iHashCode), Long.valueOf(j), this.e, Long.valueOf(this.f40050b));
    }

    public void c(int i) {
        this.f = i;
    }

    public void d(int i) {
        this.f40051c = i;
    }

    public String d() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
        setDetailUri(str);
    }
}
