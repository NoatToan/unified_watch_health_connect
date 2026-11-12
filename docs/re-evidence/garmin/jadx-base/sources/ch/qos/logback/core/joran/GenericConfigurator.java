package ch.qos.logback.core.joran;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.Interpreter;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.spi.RuleStore;
import ch.qos.logback.core.joran.spi.SimpleRuleStore;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.StatusUtil;
import ch.qos.logback.core.util.CloseUtil;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes7.dex */
public abstract class GenericConfigurator extends ContextAwareBase {
    protected Interpreter interpreter;

    public static void informContextOfURLUsedForConfiguration(Context context, URL url) {
        ConfigurationWatchListUtil.setMainWatchURL(context, url);
    }

    public void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry defaultNestedComponentRegistry) {
    }

    public abstract void addImplicitRules(Interpreter interpreter);

    public abstract void addInstanceRules(RuleStore ruleStore);

    public void buildInterpreter() {
        SimpleRuleStore simpleRuleStore = new SimpleRuleStore(this.context);
        addInstanceRules(simpleRuleStore);
        Interpreter interpreter = new Interpreter(this.context, simpleRuleStore, initialElementPath());
        this.interpreter = interpreter;
        InterpretationContext interpretationContext = interpreter.getInterpretationContext();
        interpretationContext.setContext(this.context);
        addImplicitRules(this.interpreter);
        addDefaultNestedComponentRegistryRules(interpretationContext.getDefaultNestedComponentRegistry());
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0023: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:8:0x0023 */
    public final void doConfigure(File file) throws Throwable {
        IOException e4;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                URL url = file.toURI().toURL();
                informContextOfURLUsedForConfiguration(getContext(), url);
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    doConfigure(fileInputStream, url.toExternalForm());
                    CloseUtil.closeQuietly(fileInputStream);
                } catch (IOException e14) {
                    e4 = e14;
                    String str = "Could not open [" + file.getPath() + "].";
                    addError(str, e4);
                    throw new JoranException(str, e4);
                }
            } catch (Throwable th3) {
                th = th3;
                closeable2 = closeable;
                CloseUtil.closeQuietly(closeable2);
                throw th;
            }
        } catch (IOException e15) {
            e4 = e15;
        } catch (Throwable th4) {
            th = th4;
            CloseUtil.closeQuietly(closeable2);
            throw th;
        }
    }

    public ElementPath initialElementPath() {
        return new ElementPath();
    }

    public List<SaxEvent> recallSafeConfiguration() {
        return (List) this.context.getObject(CoreConstants.SAFE_JORAN_CONFIGURATION);
    }

    public void registerSafeConfiguration(List<SaxEvent> list) {
        this.context.putObject(CoreConstants.SAFE_JORAN_CONFIGURATION, list);
    }

    public final void doConfigure(InputStream inputStream) throws JoranException {
        try {
            doConfigure(new InputSource(inputStream));
            try {
                inputStream.close();
            } catch (IOException e4) {
                addError("Could not close the stream", e4);
                throw new JoranException("Could not close the stream", e4);
            }
        } catch (Throwable th3) {
            try {
                inputStream.close();
                throw th3;
            } catch (IOException e14) {
                addError("Could not close the stream", e14);
                throw new JoranException("Could not close the stream", e14);
            }
        }
    }

    public final void doConfigure(InputStream inputStream, String str) {
        InputSource inputSource = new InputSource(inputStream);
        inputSource.setSystemId(str);
        doConfigure(inputSource);
    }

    public final void doConfigure(String str) throws Throwable {
        doConfigure(new File(str));
    }

    public final void doConfigure(URL url) {
        InputStream inputStream = null;
        try {
            try {
                informContextOfURLUsedForConfiguration(getContext(), url);
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setUseCaches(false);
                inputStream = uRLConnectionOpenConnection.getInputStream();
                doConfigure(inputStream, url.toExternalForm());
                CloseUtil.closeQuietly(inputStream);
            } catch (IOException e4) {
                String str = "Could not open URL [" + url + "].";
                addError(str, e4);
                throw new JoranException(str, e4);
            }
        } catch (Throwable th3) {
            CloseUtil.closeQuietly(inputStream);
            throw th3;
        }
    }

    public void doConfigure(List<SaxEvent> list) {
        buildInterpreter();
        synchronized (this.context.getConfigurationLock()) {
            this.interpreter.getEventPlayer().play(list);
        }
    }

    private final void doConfigure(InputSource inputSource) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SaxEventRecorder saxEventRecorder = new SaxEventRecorder(this.context);
        saxEventRecorder.recordEvents(inputSource);
        doConfigure(saxEventRecorder.getSaxEventList());
        if (new StatusUtil(this.context).noXMLParsingErrorsOccurred(jCurrentTimeMillis)) {
            addInfo("Registering current configuration as safe fallback point");
            registerSafeConfiguration(saxEventRecorder.getSaxEventList());
        }
    }
}
