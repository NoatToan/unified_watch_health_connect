package com.xiaomi.push;

import com.xiaomi.ai.core.AivsConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes22.dex */
public class bn {
    private XmlPullParser a;

    public bn() {
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            this.a = xmlPullParserNewPullParser;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        } catch (XmlPullParserException unused) {
        }
    }

    public cj a(byte[] bArr, bt btVar) throws XmlPullParserException, cd, IOException {
        String name;
        String str;
        this.a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
        this.a.next();
        int eventType = this.a.getEventType();
        String name2 = this.a.getName();
        if (eventType != 2) {
            return null;
        }
        if (name2.equals("message")) {
            return cr.a(this.a);
        }
        if (name2.equals("iq")) {
            return cr.a(this.a, btVar);
        }
        if (name2.equals("presence")) {
            return cr.m3646a(this.a);
        }
        if (this.a.getName().equals(AivsConfig.Tts.AUDIO_TYPE_STREAM)) {
            return null;
        }
        if (this.a.getName().equals("error")) {
            throw new cd(cr.m3647a(this.a));
        }
        if (this.a.getName().equals("warning")) {
            this.a.next();
            name = this.a.getName();
            str = "multi-login";
        } else {
            name = this.a.getName();
            str = "bind";
        }
        name.equals(str);
        return null;
    }
}
