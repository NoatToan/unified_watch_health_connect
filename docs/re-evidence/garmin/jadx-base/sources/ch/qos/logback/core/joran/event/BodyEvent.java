package ch.qos.logback.core.joran.event;

import am.j;
import org.xml.sax.Locator;

/* JADX INFO: loaded from: classes7.dex */
public class BodyEvent extends SaxEvent {
    private String text;

    public BodyEvent(String str, Locator locator) {
        super(null, null, null, locator);
        this.text = str;
    }

    public void append(String str) {
        this.text = j.o(this.text, str, new StringBuilder());
    }

    public String getText() {
        String str = this.text;
        return str != null ? str.trim() : str;
    }

    public String toString() {
        return "BodyEvent(" + getText() + ")" + this.locator.getLineNumber() + "," + this.locator.getColumnNumber();
    }
}
