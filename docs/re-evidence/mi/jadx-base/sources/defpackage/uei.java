package defpackage;

import com.xiaomi.push.service.module.PushChannelRegion;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class uei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PushChannelRegion f35686a = PushChannelRegion.China;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35687b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;

    public boolean a() {
        return this.d;
    }

    public boolean b() {
        return this.c;
    }

    public boolean c() {
        return this.e;
    }

    public boolean d() {
        return this.f35687b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("PushConfiguration{");
        stringBuffer.append("Region:");
        PushChannelRegion pushChannelRegion = this.f35686a;
        if (pushChannelRegion == null) {
            stringBuffer.append(AbstractJsonLexerKt.NULL);
        } else {
            stringBuffer.append(pushChannelRegion.name());
        }
        stringBuffer.append(",mOpenHmsPush:" + this.f35687b);
        stringBuffer.append(",mOpenFCMPush:" + this.c);
        stringBuffer.append(",mOpenCOSPush:" + this.d);
        stringBuffer.append(",mOpenFTOSPush:" + this.e);
        stringBuffer.append(AbstractJsonLexerKt.END_OBJ);
        return stringBuffer.toString();
    }
}
