package defpackage;

import android.util.Xml;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes3.dex */
public class nnn {
    public static void e(XmlSerializer xmlSerializer, String str, String str2) throws IllegalStateException, IOException, IllegalArgumentException {
        if (str2 == null || xmlSerializer == null || str == null) {
            return;
        }
        xmlSerializer.startTag(null, str).text(str2).endTag(null, str);
    }

    public static XmlSerializer b(OutputStream outputStream) throws IllegalStateException, IOException, IllegalArgumentException {
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(outputStream, "UTF-8");
        return xmlSerializerNewSerializer;
    }

    public static XmlPullParser c(byte[] bArr) throws XmlPullParserException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr), "UTF-8");
        return xmlPullParserNewPullParser;
    }
}
