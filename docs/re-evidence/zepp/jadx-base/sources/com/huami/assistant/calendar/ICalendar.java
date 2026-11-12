package com.huami.assistant.calendar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes5.dex */
public class ICalendar {
    private static final String a = "Sync";

    public static class FormatException extends Exception {
        public FormatException() {
        }

        public FormatException(String msg) {
            super(msg);
        }

        public FormatException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class Parameter {
        public String name;
        public String value;

        public Parameter() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            toString(sb);
            return sb.toString();
        }

        public Parameter(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public void toString(StringBuilder sb) {
            sb.append(this.name);
            sb.append(SearchCriteria.EQ);
            sb.append(this.value);
        }
    }

    public static final class a {
        public String a;
        public int b;

        private a() {
        }
    }

    private ICalendar() {
    }

    private static Parameter a(a state) throws FormatException {
        String str = state.a;
        int length = str.length();
        Parameter parameter = null;
        int i = -1;
        int i2 = -1;
        while (true) {
            int i3 = state.b;
            if (i3 >= length) {
                throw new FormatException("Expected ':' before end of line in " + str);
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt == ':') {
                if (parameter != null) {
                    if (i == -1) {
                        throw new FormatException("Expected '=' within parameter in " + str);
                    }
                    parameter.value = str.substring(i + 1, state.b);
                }
                return parameter;
            }
            if (cCharAt == ';') {
                if (parameter != null) {
                    if (i != -1) {
                        parameter.value = str.substring(i + 1, state.b);
                        return parameter;
                    }
                    throw new FormatException("Expected '=' within parameter in " + str);
                }
                parameter = new Parameter();
                i2 = state.b;
            } else if (cCharAt == '=') {
                i = state.b;
                if (parameter == null || i2 == -1) {
                    throw new FormatException("Expected ';' before '=' in " + str);
                }
                parameter.name = str.substring(i2 + 1, i);
            } else if (cCharAt == '\"') {
                if (parameter == null) {
                    throw new FormatException("Expected parameter before '\"' in " + str);
                }
                if (i == -1) {
                    throw new FormatException("Expected '=' within parameter in " + str);
                }
                int i4 = state.b;
                if (i4 > i + 1) {
                    throw new FormatException("Parameter value cannot contain a '\"' in " + str);
                }
                int iIndexOf = str.indexOf(34, i4 + 1);
                if (iIndexOf >= 0) {
                    parameter.value = str.substring(state.b + 1, iIndexOf);
                    state.b = iIndexOf + 1;
                    return parameter;
                }
                throw new FormatException("Expected closing '\"' in " + str);
            }
            state.b++;
        }
    }

    private static String b(a state) throws FormatException {
        String str = state.a;
        if (state.b < str.length() && str.charAt(state.b) == ':') {
            String strSubstring = str.substring(state.b + 1);
            state.b = str.length() - 1;
            return strSubstring;
        }
        throw new FormatException("Expected ':' before end of line in " + str);
    }

    private static String c(String text) {
        return text.replaceAll("\r\n", "\n").replaceAll(StringUtils.CR, "\n").replaceAll("\n ", "");
    }

    private static Component d(Component component, String text) throws FormatException {
        a aVar = new a();
        aVar.b = 0;
        Component componentE = component;
        for (String str : text.split("\n")) {
            try {
                componentE = e(str, aVar, componentE);
                if (component == null) {
                    component = componentE;
                }
            } catch (FormatException unused) {
            }
        }
        return component;
    }

    private static Component e(String line, a state, Component component) throws FormatException {
        state.a = line;
        int length = line.length();
        state.b = 0;
        char cCharAt = 0;
        while (true) {
            int i = state.b;
            if (i >= length || (cCharAt = line.charAt(i)) == ';' || cCharAt == ':') {
                break;
            }
            state.b++;
        }
        String strSubstring = line.substring(0, state.b);
        if (component == null && !Component.e.equals(strSubstring)) {
            throw new FormatException("Expected BEGIN");
        }
        if (Component.e.equals(strSubstring)) {
            Component component2 = new Component(b(state), component);
            if (component != null) {
                component.addChild(component2);
            }
            return component2;
        }
        if ("END".equals(strSubstring)) {
            String strB = b(state);
            if (component != null && strB.equals(component.getName())) {
                return component.getParent();
            }
            throw new FormatException("Unexpected END " + strB);
        }
        Property property = new Property(strSubstring);
        if (cCharAt == ';') {
            while (true) {
                Parameter parameterA = a(state);
                if (parameterA == null) {
                    break;
                }
                property.addParameter(parameterA);
            }
        }
        property.setValue(b(state));
        component.addProperty(property);
        return component;
    }

    public static Component parseCalendar(String text) throws FormatException {
        Component component = parseComponent(null, text);
        if (component == null || !Component.VCALENDAR.equals(component.getName())) {
            throw new FormatException("Expected VCALENDAR");
        }
        return component;
    }

    public static Component parseComponent(String text) throws FormatException {
        return parseComponent(null, text);
    }

    public static Component parseEvent(String text) throws FormatException {
        Component component = parseComponent(null, text);
        if (component == null || !Component.VEVENT.equals(component.getName())) {
            throw new FormatException("Expected VEVENT");
        }
        return component;
    }

    public static Component parseComponent(Component component, String text) throws FormatException {
        return d(component, c(text));
    }

    public static class Property {
        public static final String DTEND = "DTEND";
        public static final String DTSTART = "DTSTART";
        public static final String DURATION = "DURATION";
        public static final String EXDATE = "EXDATE";
        public static final String EXRULE = "EXRULE";
        public static final String RDATE = "RDATE";
        public static final String RRULE = "RRULE";
        private final String a;
        private LinkedHashMap<String, ArrayList<Parameter>> b = new LinkedHashMap<>();
        private String c;

        public Property(String name) {
            this.a = name;
        }

        public void addParameter(Parameter param) {
            ArrayList<Parameter> arrayList = this.b.get(param.name);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.b.put(param.name, arrayList);
            }
            arrayList.add(param);
        }

        public Parameter getFirstParameter(String name) {
            ArrayList<Parameter> arrayList = this.b.get(name);
            if (arrayList == null || arrayList.size() == 0) {
                return null;
            }
            return arrayList.get(0);
        }

        public String getName() {
            return this.a;
        }

        public Set<String> getParameterNames() {
            return this.b.keySet();
        }

        public List<Parameter> getParameters(String name) {
            return this.b.get(name);
        }

        public String getValue() {
            return this.c;
        }

        public void setValue(String value) {
            this.c = value;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            toString(sb);
            return sb.toString();
        }

        public Property(String name, String value) {
            this.a = name;
            this.c = value;
        }

        public void toString(StringBuilder sb) {
            sb.append(this.a);
            Iterator<String> it2 = getParameterNames().iterator();
            while (it2.hasNext()) {
                for (Parameter parameter : getParameters(it2.next())) {
                    sb.append(";");
                    parameter.toString(sb);
                }
            }
            sb.append(":");
            sb.append(this.c);
        }
    }

    public static class Component {
        public static final String VALARM = "VALARM";
        public static final String VCALENDAR = "VCALENDAR";
        public static final String VEVENT = "VEVENT";
        public static final String VFREEBUSY = "VFREEBUSY";
        public static final String VJOURNAL = "VJOURNAL";
        public static final String VTIMEZONE = "VTIMEZONE";
        public static final String VTODO = "VTODO";
        public static final String e = "BEGIN";
        public static final String f = "END";
        private static final String g = "\n";
        private final String a;
        private final Component b;
        private LinkedList<Component> c = null;
        private final LinkedHashMap<String, ArrayList<Property>> d = new LinkedHashMap<>();

        public Component(String name, Component parent) {
            this.a = name;
            this.b = parent;
        }

        public void addChild(Component child) {
            getOrCreateChildren().add(child);
        }

        public void addProperty(Property prop) {
            String name = prop.getName();
            ArrayList<Property> arrayList = this.d.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.d.put(name, arrayList);
            }
            arrayList.add(prop);
        }

        public List<Component> getComponents() {
            return this.c;
        }

        public Property getFirstProperty(String name) {
            ArrayList<Property> arrayList = this.d.get(name);
            if (arrayList == null || arrayList.size() == 0) {
                return null;
            }
            return arrayList.get(0);
        }

        public String getName() {
            return this.a;
        }

        public LinkedList<Component> getOrCreateChildren() {
            if (this.c == null) {
                this.c = new LinkedList<>();
            }
            return this.c;
        }

        public Component getParent() {
            return this.b;
        }

        public List<Property> getProperties(String name) {
            return this.d.get(name);
        }

        public Set<String> getPropertyNames() {
            return this.d.keySet();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            toString(sb);
            sb.append("\n");
            return sb.toString();
        }

        public void toString(StringBuilder sb) {
            sb.append(e);
            sb.append(":");
            sb.append(this.a);
            sb.append("\n");
            Iterator<String> it2 = getPropertyNames().iterator();
            while (it2.hasNext()) {
                Iterator<Property> it3 = getProperties(it2.next()).iterator();
                while (it3.hasNext()) {
                    it3.next().toString(sb);
                    sb.append("\n");
                }
            }
            LinkedList<Component> linkedList = this.c;
            if (linkedList != null) {
                Iterator<Component> it4 = linkedList.iterator();
                while (it4.hasNext()) {
                    it4.next().toString(sb);
                    sb.append("\n");
                }
            }
            sb.append("END");
            sb.append(":");
            sb.append(this.a);
        }
    }
}
