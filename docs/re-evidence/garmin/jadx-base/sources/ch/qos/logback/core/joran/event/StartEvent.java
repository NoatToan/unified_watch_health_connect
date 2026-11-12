package ch.qos.logback.core.joran.event;

import ch.qos.logback.core.joran.spi.ElementPath;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes7.dex */
public class StartEvent extends SaxEvent {
    public final Attributes attributes;
    public final ElementPath elementPath;

    public StartEvent(ElementPath elementPath, String str, String str2, String str3, Attributes attributes, Locator locator) {
        super(str, str2, str3, locator);
        this.attributes = new AttributesImpl(attributes);
        this.elementPath = elementPath;
    }

    public Attributes getAttributes() {
        return this.attributes;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("StartEvent(");
        sb3.append(getQName());
        if (this.attributes != null) {
            for (int i14 = 0; i14 < this.attributes.getLength(); i14++) {
                if (i14 > 0) {
                    sb3.append(' ');
                }
                sb3.append(this.attributes.getLocalName(i14));
                sb3.append("=\"");
                sb3.append(this.attributes.getValue(i14));
                sb3.append("\"");
            }
        }
        sb3.append(")  [");
        sb3.append(this.locator.getLineNumber());
        sb3.append(",");
        sb3.append(this.locator.getColumnNumber());
        sb3.append("]");
        return sb3.toString();
    }
}
