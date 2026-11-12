package ch.qos.logback.classic.joran.action;

import ch.qos.logback.core.joran.action.AbstractIncludeAction;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import java.io.FileNotFoundException;
import java.net.URL;
import java.net.UnknownHostException;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes7.dex */
public class ConditionalIncludeAction extends AbstractIncludeAction {

    public class State {
        private URL url;

        public State() {
        }

        public URL getUrl() {
            return this.url;
        }

        public void setUrl(URL url) {
            this.url = url;
        }
    }

    private URL peekPath(InterpretationContext interpretationContext) {
        URL url;
        if (interpretationContext.isEmpty()) {
            return null;
        }
        Object objPeekObject = interpretationContext.peekObject();
        if (!(objPeekObject instanceof State) || (url = ((State) objPeekObject).getUrl()) == null) {
            return null;
        }
        return url;
    }

    private URL pushPath(InterpretationContext interpretationContext, URL url) {
        State state = new State();
        state.setUrl(url);
        interpretationContext.pushObject(state);
        return url;
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction, ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        if (peekPath(interpretationContext) != null) {
            return;
        }
        super.begin(interpretationContext, str, attributes);
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction
    public void handleError(String str, Exception exc) {
        if (exc == null || (exc instanceof FileNotFoundException) || (exc instanceof UnknownHostException)) {
            addInfo(str);
        } else {
            addWarn(str, exc);
        }
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction
    public void processInclude(InterpretationContext interpretationContext, URL url) {
        pushPath(interpretationContext, url);
    }
}
