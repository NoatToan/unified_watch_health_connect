package ch.qos.logback.core.joran.action;

import am.j;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import org.xml.sax.Attributes;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractIncludeAction extends Action {
    private static final String FILE_ATTR = "file";
    private static final String OPTIONAL_ATTR = "optional";
    private static final String RESOURCE_ATTR = "resource";
    private static final String URL_ATTR = "url";
    private String attributeInUse;
    private boolean optional;

    private URL attributeToURL(String str) {
        StringBuilder sb3;
        String str2;
        try {
            URL url = new URL(str);
            url.openStream().close();
            return url;
        } catch (MalformedURLException e4) {
            e = e4;
            sb3 = new StringBuilder("URL [");
            sb3.append(str);
            str2 = "] is not well formed.";
            sb3.append(str2);
            optionalWarning(sb3.toString(), e);
            return null;
        } catch (IOException e14) {
            e = e14;
            sb3 = new StringBuilder("URL [");
            sb3.append(str);
            str2 = "] cannot be opened.";
            sb3.append(str2);
            optionalWarning(sb3.toString(), e);
            return null;
        }
    }

    private boolean checkAttributes(Attributes attributes) {
        String value = attributes.getValue("file");
        String value2 = attributes.getValue("url");
        String value3 = attributes.getValue(RESOURCE_ATTR);
        int i14 = !OptionHelper.isEmpty(value) ? 1 : 0;
        if (!OptionHelper.isEmpty(value2)) {
            i14++;
        }
        if (!OptionHelper.isEmpty(value3)) {
            i14++;
        }
        if (i14 == 0) {
            optionalWarning(String.format("One of \"%1$s\", \"%2$s\" or \"%3$s\" attributes must be set.", "file", RESOURCE_ATTR, "url"), null);
            return false;
        }
        if (i14 > 1) {
            optionalWarning(String.format("Only one of \"%1$s\", \"%2$s\" or \"%3$s\" attributes should be set.", "file", RESOURCE_ATTR, "url"), null);
            return false;
        }
        if (i14 == 1) {
            return true;
        }
        h.z(e0.f(i14, "Count value [", "] is not expected"));
        return false;
    }

    private URL filePathAsURL(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            optionalWarning(j.m("File does not exist [", str, "]"), new FileNotFoundException(str));
            return null;
        }
        try {
            return file.toURI().toURL();
        } catch (MalformedURLException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private URL getInputURL(InterpretationContext interpretationContext, Attributes attributes) {
        String value = attributes.getValue("file");
        String value2 = attributes.getValue("url");
        String value3 = attributes.getValue(RESOURCE_ATTR);
        if (!OptionHelper.isEmpty(value)) {
            String strSubst = interpretationContext.subst(value);
            this.attributeInUse = strSubst;
            return filePathAsURL(strSubst);
        }
        if (!OptionHelper.isEmpty(value2)) {
            String strSubst2 = interpretationContext.subst(value2);
            this.attributeInUse = strSubst2;
            return attributeToURL(strSubst2);
        }
        if (OptionHelper.isEmpty(value3)) {
            h.z("A URL stream should have been returned");
            return null;
        }
        String strSubst3 = interpretationContext.subst(value3);
        this.attributeInUse = strSubst3;
        return resourceAsURL(strSubst3);
    }

    private URL resourceAsURL(String str) {
        URL resourceBySelfClassLoader = Loader.getResourceBySelfClassLoader(str);
        if (resourceBySelfClassLoader != null) {
            return resourceBySelfClassLoader;
        }
        optionalWarning("Could not find resource corresponding to [" + str + "]", null);
        return null;
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        this.attributeInUse = null;
        this.optional = OptionHelper.toBoolean(attributes.getValue(OPTIONAL_ATTR), false);
        if (checkAttributes(attributes)) {
            try {
                URL inputURL = getInputURL(interpretationContext, attributes);
                if (inputURL != null) {
                    processInclude(interpretationContext, inputURL);
                }
            } catch (JoranException e4) {
                optionalWarning("Error while parsing " + this.attributeInUse, e4);
            }
        }
    }

    public void close(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
    }

    public String getAttributeInUse() {
        return this.attributeInUse;
    }

    public void handleError(String str, Exception exc) {
        if (exc == null || !((exc instanceof FileNotFoundException) || (exc instanceof UnknownHostException))) {
            addError(str, exc);
        } else {
            addWarn(str, exc);
        }
    }

    public boolean isOptional() {
        return this.optional;
    }

    public void optionalWarning(String str, Exception exc) {
        if (isOptional()) {
            return;
        }
        handleError(str, exc);
    }

    public abstract void processInclude(InterpretationContext interpretationContext, URL url);
}
