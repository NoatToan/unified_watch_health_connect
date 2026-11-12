package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.action.ImplicitAction;
import ch.qos.logback.core.joran.event.BodyEvent;
import ch.qos.logback.core.joran.event.EndEvent;
import ch.qos.logback.core.joran.event.StartEvent;
import hb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

/* JADX INFO: loaded from: classes7.dex */
public class Interpreter {
    private static List<Action> EMPTY_LIST = new Vector(0);
    private final CAI_WithLocatorSupport cai;
    private ElementPath elementPath;
    private final InterpretationContext interpretationContext;
    Locator locator;
    private final RuleStore ruleStore;
    ElementPath skip = null;
    private final ArrayList<ImplicitAction> implicitActions = new ArrayList<>(3);
    Stack<List<Action>> actionListStack = new Stack<>();
    EventPlayer eventPlayer = new EventPlayer(this);

    public Interpreter(Context context, RuleStore ruleStore, ElementPath elementPath) {
        this.cai = new CAI_WithLocatorSupport(context, this);
        this.ruleStore = ruleStore;
        this.interpretationContext = new InterpretationContext(context, this);
        this.elementPath = elementPath;
    }

    private void callBodyAction(List<Action> list, String str) {
        if (list == null) {
            return;
        }
        for (Action action : list) {
            try {
                action.body(this.interpretationContext, str);
            } catch (ActionException e4) {
                this.cai.addError("Exception in end() methd for action [" + action + "]", e4);
            }
        }
    }

    private void callEndAction(List<Action> list, String str) {
        CAI_WithLocatorSupport cAI_WithLocatorSupport;
        StringBuilder sb3;
        if (list == null) {
            return;
        }
        Iterator<Action> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().end(this.interpretationContext, str);
            } catch (ActionException e4) {
                e = e4;
                cAI_WithLocatorSupport = this.cai;
                sb3 = new StringBuilder("ActionException in Action for tag [");
                sb3.append(str);
                sb3.append("]");
                cAI_WithLocatorSupport.addError(sb3.toString(), e);
            } catch (RuntimeException e14) {
                e = e14;
                cAI_WithLocatorSupport = this.cai;
                sb3 = new StringBuilder("RuntimeException in Action for tag [");
                sb3.append(str);
                sb3.append("]");
                cAI_WithLocatorSupport.addError(sb3.toString(), e);
            }
        }
    }

    private void endElement(String str, String str2, String str3) {
        List<Action> listPop = this.actionListStack.pop();
        ElementPath elementPath = this.skip;
        if (elementPath != null) {
            if (elementPath.equals(this.elementPath)) {
                this.skip = null;
            }
        } else if (listPop != EMPTY_LIST) {
            callEndAction(listPop, getTagName(str2, str3));
        }
        this.elementPath.pop();
    }

    private void pushEmptyActionList() {
        this.actionListStack.add(EMPTY_LIST);
    }

    private void startElement(String str, String str2, String str3, Attributes attributes) {
        String tagName = getTagName(str2, str3);
        this.elementPath.push(tagName);
        if (this.skip != null) {
            pushEmptyActionList();
            return;
        }
        List<Action> applicableActionList = getApplicableActionList(this.elementPath, attributes);
        if (applicableActionList != null) {
            this.actionListStack.add(applicableActionList);
            callBeginAction(applicableActionList, tagName, attributes);
            return;
        }
        pushEmptyActionList();
        StringBuilder sbL = a.l("no applicable action for [", tagName, "], current ElementPath  is [");
        sbL.append(this.elementPath);
        sbL.append("]");
        this.cai.addError(sbL.toString());
    }

    public void addImplicitAction(ImplicitAction implicitAction) {
        this.implicitActions.add(implicitAction);
    }

    public void callBeginAction(List<Action> list, String str, Attributes attributes) {
        CAI_WithLocatorSupport cAI_WithLocatorSupport;
        StringBuilder sb3;
        if (list == null) {
            return;
        }
        Iterator<Action> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().begin(this.interpretationContext, str, attributes);
            } catch (ActionException e4) {
                e = e4;
                this.skip = this.elementPath.duplicate();
                cAI_WithLocatorSupport = this.cai;
                sb3 = new StringBuilder("ActionException in Action for tag [");
                sb3.append(str);
                sb3.append("]");
                cAI_WithLocatorSupport.addError(sb3.toString(), e);
            } catch (RuntimeException e14) {
                e = e14;
                this.skip = this.elementPath.duplicate();
                cAI_WithLocatorSupport = this.cai;
                sb3 = new StringBuilder("RuntimeException in Action for tag [");
                sb3.append(str);
                sb3.append("]");
                cAI_WithLocatorSupport.addError(sb3.toString(), e);
            }
        }
    }

    public void characters(BodyEvent bodyEvent) {
        setDocumentLocator(bodyEvent.locator);
        String text = bodyEvent.getText();
        List<Action> listPeek = this.actionListStack.peek();
        if (text != null) {
            String strTrim = text.trim();
            if (strTrim.length() > 0) {
                callBodyAction(listPeek, strTrim);
            }
        }
    }

    public List<Action> getApplicableActionList(ElementPath elementPath, Attributes attributes) {
        List<Action> listMatchActions = this.ruleStore.matchActions(elementPath);
        return listMatchActions == null ? lookupImplicitAction(elementPath, attributes, this.interpretationContext) : listMatchActions;
    }

    public EventPlayer getEventPlayer() {
        return this.eventPlayer;
    }

    public InterpretationContext getExecutionContext() {
        return getInterpretationContext();
    }

    public InterpretationContext getInterpretationContext() {
        return this.interpretationContext;
    }

    public Locator getLocator() {
        return this.locator;
    }

    public RuleStore getRuleStore() {
        return this.ruleStore;
    }

    public String getTagName(String str, String str2) {
        return (str == null || str.length() < 1) ? str2 : str;
    }

    public List<Action> lookupImplicitAction(ElementPath elementPath, Attributes attributes, InterpretationContext interpretationContext) {
        int size = this.implicitActions.size();
        for (int i14 = 0; i14 < size; i14++) {
            ImplicitAction implicitAction = this.implicitActions.get(i14);
            if (implicitAction.isApplicable(elementPath, attributes, interpretationContext)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(implicitAction);
                return arrayList;
            }
        }
        return null;
    }

    public void setDocumentLocator(Locator locator) {
        this.locator = locator;
    }

    public void setInterpretationContextPropertiesMap(Map<String, String> map) {
        this.interpretationContext.setPropertiesMap(map);
    }

    public void startDocument() {
    }

    public void endElement(EndEvent endEvent) {
        setDocumentLocator(endEvent.locator);
        endElement(endEvent.namespaceURI, endEvent.localName, endEvent.qName);
    }

    public void startElement(StartEvent startEvent) {
        setDocumentLocator(startEvent.getLocator());
        startElement(startEvent.namespaceURI, startEvent.localName, startEvent.qName, startEvent.attributes);
    }
}
