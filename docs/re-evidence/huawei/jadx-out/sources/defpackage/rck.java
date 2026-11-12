package defpackage;

import android.text.TextUtils;
import android.util.Xml;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.declaration.xmlparser.parser.XmlParser;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes16.dex */
public class rck implements XmlParser<rbs> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private XmlPullParser f47134b;

    @Override // com.huawei.ui.device.declaration.xmlparser.parser.XmlParser
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public rbs parse(InputStream inputStream) throws XmlPullParserException, IOException {
        if (inputStream == null) {
            throw new NullPointerException("parameter 'xmlInputStream' is null.");
        }
        a(inputStream);
        rbs rbsVarC = c();
        inputStream.close();
        return rbsVarC;
    }

    private rbs c() throws XmlPullParserException, IOException {
        rbs rbsVar = new rbs();
        int eventType = this.f47134b.getEventType();
        String text = "";
        String attributeValue = "";
        while (eventType != 1) {
            String name = this.f47134b.getName();
            if (eventType == 0) {
                LogUtil.a("ResourceParserImpl", "parse xml begin.");
            } else if (eventType != 2) {
                if (eventType == 3) {
                    LogUtil.a("ResourceParserImpl", "parse xml end.");
                    text = null;
                    attributeValue = null;
                } else if (eventType != 4) {
                    LogUtil.a("ResourceParserImpl", "default case.");
                } else {
                    boolean zIsEmpty = TextUtils.isEmpty(attributeValue);
                    if (!zIsEmpty) {
                        text = this.f47134b.getText();
                    }
                    boolean zIsEmpty2 = TextUtils.isEmpty(text);
                    if (!zIsEmpty && !zIsEmpty2) {
                        rbsVar.d(attributeValue, text);
                    }
                }
            } else if ("string".equals(name)) {
                attributeValue = this.f47134b.getAttributeValue(0);
            }
            eventType = this.f47134b.next();
        }
        return rbsVar;
    }

    private void a(InputStream inputStream) throws XmlPullParserException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        this.f47134b = xmlPullParserNewPullParser;
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        this.f47134b.setInput(inputStream, "UTF-8");
    }
}
