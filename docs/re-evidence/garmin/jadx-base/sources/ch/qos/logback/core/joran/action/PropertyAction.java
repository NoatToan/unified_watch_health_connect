package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes7.dex */
public class PropertyAction extends Action {
    static String INVALID_ATTRIBUTES = "In <property> element, either the \"file\" attribute alone, or the \"resource\" element alone, or both the \"name\" and \"value\" attributes must be set.";
    static final String RESOURCE_ATTRIBUTE = "resource";

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        String strSubst;
        StringBuilder sb3;
        StringBuilder sb4;
        if ("substitutionProperty".equals(str)) {
            addWarn("[substitutionProperty] element has been deprecated. Please use the [property] element instead.");
        }
        String value = attributes.getValue("name");
        String value2 = attributes.getValue("value");
        ActionUtil.Scope scopeStringToScope = ActionUtil.stringToScope(attributes.getValue(Action.SCOPE_ATTRIBUTE));
        if (!checkFileAttributeSanity(attributes)) {
            if (!checkResourceAttributeSanity(attributes)) {
                if (checkValueNameAttributesSanity(attributes)) {
                    ActionUtil.setProperty(interpretationContext, value, interpretationContext.subst(RegularEscapeUtil.basicEscape(value2).trim()), scopeStringToScope);
                    return;
                } else {
                    addError(INVALID_ATTRIBUTES);
                    return;
                }
            }
            strSubst = interpretationContext.subst(attributes.getValue(RESOURCE_ATTRIBUTE));
            URL resourceBySelfClassLoader = Loader.getResourceBySelfClassLoader(strSubst);
            if (resourceBySelfClassLoader == null) {
                sb4 = new StringBuilder("Could not find resource [");
                sb4.append(strSubst);
                sb4.append("].");
                addError(sb4.toString());
                return;
            }
            try {
                loadAndSetProperties(interpretationContext, resourceBySelfClassLoader.openStream(), scopeStringToScope);
                return;
            } catch (IOException e4) {
                e = e4;
                sb3 = new StringBuilder("Could not read resource file [");
                sb3.append(strSubst);
                sb3.append("].");
                addError(sb3.toString(), e);
            }
        }
        strSubst = interpretationContext.subst(attributes.getValue("file"));
        try {
            loadAndSetProperties(interpretationContext, new FileInputStream(strSubst), scopeStringToScope);
        } catch (FileNotFoundException unused) {
            sb4 = new StringBuilder("Could not find properties file [");
        } catch (IOException e14) {
            e = e14;
            sb3 = new StringBuilder("Could not read properties file [");
            sb3.append(strSubst);
            sb3.append("].");
            addError(sb3.toString(), e);
        }
    }

    public boolean checkFileAttributeSanity(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue("file")) && OptionHelper.isEmpty(attributes.getValue("name")) && OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue(RESOURCE_ATTRIBUTE));
    }

    public boolean checkResourceAttributeSanity(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue(RESOURCE_ATTRIBUTE)) && OptionHelper.isEmpty(attributes.getValue("name")) && OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue("file"));
    }

    public boolean checkValueNameAttributesSanity(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue("name")) && !OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue("file")) && OptionHelper.isEmpty(attributes.getValue(RESOURCE_ATTRIBUTE));
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
    }

    public void finish(InterpretationContext interpretationContext) {
    }

    public void loadAndSetProperties(InterpretationContext interpretationContext, InputStream inputStream, ActionUtil.Scope scope) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        inputStream.close();
        ActionUtil.setProperties(interpretationContext, properties, scope);
    }
}
