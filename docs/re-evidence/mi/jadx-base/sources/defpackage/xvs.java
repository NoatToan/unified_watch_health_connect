package defpackage;

import com.xiaomi.push.h;
import com.xiaomi.push.ha;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes11.dex */
public class xvs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XmlPullParser f39522a;

    public xvs() {
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            this.f39522a = xmlPullParserNewPullParser;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        } catch (XmlPullParserException unused) {
        }
    }

    public fys a(byte[] bArr, gws gwsVar) throws XmlPullParserException, IOException, ha {
        this.f39522a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
        this.f39522a.next();
        int eventType = this.f39522a.getEventType();
        String name = this.f39522a.getName();
        if (eventType != 2) {
            return null;
        }
        if (name.equals("message")) {
            return h.e(this.f39522a);
        }
        if (name.equals("iq")) {
            return h.a(this.f39522a, gwsVar);
        }
        if (name.equals("presence")) {
            return h.b(this.f39522a);
        }
        if (this.f39522a.getName().equals("stream")) {
            return null;
        }
        if (this.f39522a.getName().equals("error")) {
            throw new ha(h.f(this.f39522a));
        }
        if (!this.f39522a.getName().equals("warning")) {
            this.f39522a.getName().equals("bind");
            return null;
        }
        this.f39522a.next();
        this.f39522a.getName().equals("multi-login");
        return null;
    }
}
