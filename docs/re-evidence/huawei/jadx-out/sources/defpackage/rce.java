package defpackage;

import com.huawei.ui.device.declaration.xmlparser.parser.XmlParser;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes16.dex */
public class rce implements XmlParser<rbq> {
    private XmlParser<rbq> e = new rcf();

    @Override // com.huawei.ui.device.declaration.xmlparser.parser.XmlParser
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public rbq parse(InputStream inputStream) throws XmlPullParserException, IOException {
        if (inputStream == null) {
            return new rbq();
        }
        return this.e.parse(inputStream);
    }
}
