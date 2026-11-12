package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.spi.PropertyDefiner;
import ch.qos.logback.core.util.OptionHelper;
import hb.a;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes7.dex */
public class DefinePropertyAction extends Action {
    PropertyDefiner definer;
    boolean inError;
    String propertyName;
    ActionUtil.Scope scope;
    String scopeStr;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        String str2;
        this.scopeStr = null;
        this.scope = null;
        this.propertyName = null;
        this.definer = null;
        this.inError = false;
        this.propertyName = attributes.getValue("name");
        String value = attributes.getValue(Action.SCOPE_ATTRIBUTE);
        this.scopeStr = value;
        this.scope = ActionUtil.stringToScope(value);
        if (OptionHelper.isEmpty(this.propertyName)) {
            str2 = "Missing property name for property definer. Near [";
        } else {
            String value2 = attributes.getValue(Action.CLASS_ATTRIBUTE);
            if (!OptionHelper.isEmpty(value2)) {
                try {
                    addInfo("About to instantiate property definer of type [" + value2 + "]");
                    PropertyDefiner propertyDefiner = (PropertyDefiner) OptionHelper.instantiateByClassName(value2, (Class<?>) PropertyDefiner.class, this.context);
                    this.definer = propertyDefiner;
                    propertyDefiner.setContext(this.context);
                    PropertyDefiner propertyDefiner2 = this.definer;
                    if (propertyDefiner2 instanceof LifeCycle) {
                        ((LifeCycle) propertyDefiner2).start();
                    }
                    interpretationContext.pushObject(this.definer);
                    return;
                } catch (Exception e4) {
                    this.inError = true;
                    addError("Could not create an PropertyDefiner of type [" + value2 + "].", e4);
                    throw new ActionException(e4);
                }
            }
            str2 = "Missing class name for property definer. Near [";
        }
        StringBuilder sbL = a.l(str2, str, "] line ");
        sbL.append(getLineNumber(interpretationContext));
        addError(sbL.toString());
        this.inError = true;
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        if (this.inError) {
            return;
        }
        Object objPeekObject = interpretationContext.peekObject();
        PropertyDefiner propertyDefiner = this.definer;
        String str2 = this.propertyName;
        if (objPeekObject != propertyDefiner) {
            addWarn("The object at the of the stack is not the property definer for property named [" + str2 + "] pushed earlier.");
            return;
        }
        addInfo("Popping property definer for property named [" + str2 + "] from the object stack");
        interpretationContext.popObject();
        String propertyValue = this.definer.getPropertyValue();
        if (propertyValue != null) {
            ActionUtil.setProperty(interpretationContext, this.propertyName, propertyValue, this.scope);
        }
    }
}
