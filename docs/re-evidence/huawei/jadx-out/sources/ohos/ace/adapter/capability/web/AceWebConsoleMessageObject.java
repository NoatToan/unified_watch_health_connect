package ohos.ace.adapter.capability.web;

import android.webkit.ConsoleMessage;

/* JADX INFO: loaded from: classes46.dex */
public class AceWebConsoleMessageObject {
    private static final String LOG_TAG = "AceWebConsoleMessageObject";
    private static final int ONELEVEL = 1;
    private ConsoleMessage consoleMessage;

    public AceWebConsoleMessageObject(ConsoleMessage consoleMessage) {
        this.consoleMessage = consoleMessage;
    }

    public int getLineNumber() {
        return this.consoleMessage.lineNumber();
    }

    public String getMessage() {
        if (this.consoleMessage.message() != null) {
            return this.consoleMessage.message().toString();
        }
        return "";
    }

    public int getMessageLevel() {
        return this.consoleMessage.messageLevel().ordinal() + 1;
    }

    public String getSourceId() {
        if (this.consoleMessage.sourceId() != null) {
            return this.consoleMessage.sourceId().toString();
        }
        return "";
    }
}
