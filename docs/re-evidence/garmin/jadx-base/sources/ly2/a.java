package ly2;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes13.dex */
public class a extends DefaultHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f115389b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jy2.b f115390c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StringBuilder f115391d = new StringBuilder();

    public a(String str) {
        this.f115388a = str;
    }

    public final String a() {
        String strTrim = this.f115391d.toString().trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        return strTrim;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i14, int i15) {
        this.f115391d.append(cArr, i14, i15);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) throws b {
        if (this.f115390c != null) {
            str3.getClass();
            switch (str3) {
                case "FileName":
                    this.f115390c.f101866c = a();
                    return;
                case "Path":
                    this.f115390c.f101865b = a();
                    return;
                case "Major":
                    jy2.b bVar = this.f115390c;
                    a();
                    bVar.getClass();
                    return;
                case "Minor":
                    jy2.b bVar2 = this.f115390c;
                    a();
                    bVar2.getClass();
                    return;
                case "PartNumber":
                    this.f115390c.f101864a = a();
                    return;
                case "UpdateFile":
                    String str4 = this.f115388a;
                    if (str4 == null || str4.equals(this.f115390c.f101864a)) {
                        this.f115389b.add(this.f115390c);
                        if (str4 != null) {
                            throw new b("Requested product number found");
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        str3.getClass();
        if (str3.equals("UpdateFile")) {
            this.f115390c = new jy2.b();
        }
        this.f115391d.setLength(0);
    }
}
