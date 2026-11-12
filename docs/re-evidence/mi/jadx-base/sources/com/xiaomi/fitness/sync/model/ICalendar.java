package com.xiaomi.fitness.sync.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class ICalendar {
    private static final String TAG = "Sync";

    public static class FormatException extends Exception {
        public FormatException() {
        }

        public FormatException(String str) {
            super(str);
        }

        public FormatException(String str, Throwable th) {
            super(str, th);
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

        public Parameter(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public void toString(StringBuilder sb) {
            sb.append(this.name);
            sb.append("=");
            sb.append(this.value);
        }
    }

    public static final class ParserState {
        public int index;
        public String line;

        private ParserState() {
        }
    }

    private ICalendar() {
    }

    private static Parameter extractParameter(ParserState parserState) throws FormatException {
        String str = parserState.line;
        int length = str.length();
        Parameter parameter = null;
        int i = -1;
        int i2 = -1;
        while (true) {
            int i3 = parserState.index;
            if (i3 >= length) {
                throw new FormatException("Expected ':' before end of line in " + str);
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt == ':') {
                if (parameter != null) {
                    if (i == -1) {
                        throw new FormatException("Expected '=' within parameter in " + str);
                    }
                    parameter.value = str.substring(i + 1, parserState.index);
                }
                return parameter;
            }
            if (cCharAt == ';') {
                if (parameter != null) {
                    if (i != -1) {
                        parameter.value = str.substring(i + 1, parserState.index);
                        return parameter;
                    }
                    throw new FormatException("Expected '=' within parameter in " + str);
                }
                parameter = new Parameter();
                i2 = parserState.index;
            } else if (cCharAt == '=') {
                i = parserState.index;
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
                int i4 = parserState.index;
                if (i4 > i + 1) {
                    throw new FormatException("Parameter value cannot contain a '\"' in " + str);
                }
                int iIndexOf = str.indexOf(34, i4 + 1);
                if (iIndexOf >= 0) {
                    parameter.value = str.substring(parserState.index + 1, iIndexOf);
                    parserState.index = iIndexOf + 1;
                    return parameter;
                }
                throw new FormatException("Expected closing '\"' in " + str);
            }
            parserState.index++;
        }
    }

    private static String extractValue(ParserState parserState) throws FormatException {
        String str = parserState.line;
        if (parserState.index < str.length() && str.charAt(parserState.index) == ':') {
            String strSubstring = str.substring(parserState.index + 1);
            parserState.index = str.length() - 1;
            return strSubstring;
        }
        throw new FormatException("Expected ':' before end of line in " + str);
    }

    private static String normalizeText(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll("\r", "\n").replaceAll("\n ", "");
    }

    public static Component parseCalendar(String str) throws FormatException {
        Component component = parseComponent(null, str);
        if (component == null || !Component.VCALENDAR.equals(component.getName())) {
            throw new FormatException("Expected VCALENDAR");
        }
        return component;
    }

    public static Component parseComponent(String str) throws FormatException {
        return parseComponent(null, str);
    }

    private static Component parseComponentImpl(Component component, String str) throws FormatException {
        ParserState parserState = new ParserState();
        parserState.index = 0;
        Component line = component;
        for (String str2 : str.split("\n")) {
            try {
                line = parseLine(str2, parserState, line);
                if (component == null) {
                    component = line;
                }
            } catch (FormatException unused) {
            }
        }
        return component;
    }

    public static Component parseEvent(String str) throws FormatException {
        Component component = parseComponent(null, str);
        if (component == null || !Component.VEVENT.equals(component.getName())) {
            throw new FormatException("Expected VEVENT");
        }
        return component;
    }

    private static Component parseLine(String str, ParserState parserState, Component component) throws FormatException {
        parserState.line = str;
        int length = str.length();
        parserState.index = 0;
        char cCharAt = 0;
        while (true) {
            int i = parserState.index;
            if (i >= length || (cCharAt = str.charAt(i)) == ';' || cCharAt == ':') {
                break;
            }
            parserState.index++;
        }
        String strSubstring = str.substring(0, parserState.index);
        if (component == null && !"BEGIN".equals(strSubstring)) {
            throw new FormatException("Expected BEGIN");
        }
        if ("BEGIN".equals(strSubstring)) {
            Component component2 = new Component(extractValue(parserState), component);
            if (component != null) {
                component.addChild(component2);
            }
            return component2;
        }
        if ("END".equals(strSubstring)) {
            String strExtractValue = extractValue(parserState);
            if (component != null && strExtractValue.equals(component.getName())) {
                return component.getParent();
            }
            throw new FormatException("Unexpected END " + strExtractValue);
        }
        Property property = new Property(strSubstring);
        if (cCharAt == ';') {
            while (true) {
                Parameter parameterExtractParameter = extractParameter(parserState);
                if (parameterExtractParameter == null) {
                    break;
                }
                property.addParameter(parameterExtractParameter);
            }
        }
        property.setValue(extractValue(parserState));
        component.addProperty(property);
        return component;
    }

    public static Component parseComponent(Component component, String str) throws FormatException {
        return parseComponentImpl(component, normalizeText(str));
    }

    public static class Property {
        public static final String DTEND = "DTEND";
        public static final String DTSTART = "DTSTART";
        public static final String DURATION = "DURATION";
        public static final String EXDATE = "EXDATE";
        public static final String EXRULE = "EXRULE";
        public static final String RDATE = "RDATE";
        public static final String RRULE = "RRULE";
        private final String mName;
        private LinkedHashMap<String, ArrayList<Parameter>> mParamsMap = new LinkedHashMap<>();
        private String mValue;

        public Property(String str) {
            this.mName = str;
        }

        public void addParameter(Parameter parameter) {
            ArrayList<Parameter> arrayList = this.mParamsMap.get(parameter.name);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.mParamsMap.put(parameter.name, arrayList);
            }
            arrayList.add(parameter);
        }

        public Parameter getFirstParameter(String str) {
            ArrayList<Parameter> arrayList = this.mParamsMap.get(str);
            if (arrayList == null || arrayList.size() == 0) {
                return null;
            }
            return arrayList.get(0);
        }

        public String getName() {
            return this.mName;
        }

        public Set<String> getParameterNames() {
            return this.mParamsMap.keySet();
        }

        public List<Parameter> getParameters(String str) {
            return this.mParamsMap.get(str);
        }

        public String getValue() {
            return this.mValue;
        }

        public void setValue(String str) {
            this.mValue = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            toString(sb);
            return sb.toString();
        }

        public Property(String str, String str2) {
            this.mName = str;
            this.mValue = str2;
        }

        public void toString(StringBuilder sb) {
            sb.append(this.mName);
            Iterator<String> it = getParameterNames().iterator();
            while (it.hasNext()) {
                for (Parameter parameter : getParameters(it.next())) {
                    sb.append(";");
                    parameter.toString(sb);
                }
            }
            sb.append(":");
            sb.append(this.mValue);
        }
    }

    public static class Component {
        static final String BEGIN = "BEGIN";
        static final String END = "END";
        private static final String NEWLINE = "\n";
        public static final String VALARM = "VALARM";
        public static final String VCALENDAR = "VCALENDAR";
        public static final String VEVENT = "VEVENT";
        public static final String VFREEBUSY = "VFREEBUSY";
        public static final String VJOURNAL = "VJOURNAL";
        public static final String VTIMEZONE = "VTIMEZONE";
        public static final String VTODO = "VTODO";
        private final String mName;
        private final Component mParent;
        private LinkedList<Component> mChildren = null;
        private final LinkedHashMap<String, ArrayList<Property>> mPropsMap = new LinkedHashMap<>();

        public Component(String str, Component component) {
            this.mName = str;
            this.mParent = component;
        }

        public void addChild(Component component) {
            getOrCreateChildren().add(component);
        }

        public void addProperty(Property property) {
            String name = property.getName();
            ArrayList<Property> arrayList = this.mPropsMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.mPropsMap.put(name, arrayList);
            }
            arrayList.add(property);
        }

        public List<Component> getComponents() {
            return this.mChildren;
        }

        public Property getFirstProperty(String str) {
            ArrayList<Property> arrayList = this.mPropsMap.get(str);
            if (arrayList == null || arrayList.size() == 0) {
                return null;
            }
            return arrayList.get(0);
        }

        public String getName() {
            return this.mName;
        }

        public LinkedList<Component> getOrCreateChildren() {
            if (this.mChildren == null) {
                this.mChildren = new LinkedList<>();
            }
            return this.mChildren;
        }

        public Component getParent() {
            return this.mParent;
        }

        public List<Property> getProperties(String str) {
            return this.mPropsMap.get(str);
        }

        public Set<String> getPropertyNames() {
            return this.mPropsMap.keySet();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            toString(sb);
            sb.append(NEWLINE);
            return sb.toString();
        }

        public void toString(StringBuilder sb) {
            sb.append(BEGIN);
            sb.append(":");
            sb.append(this.mName);
            sb.append(NEWLINE);
            Iterator<String> it = getPropertyNames().iterator();
            while (it.hasNext()) {
                Iterator<Property> it2 = getProperties(it.next()).iterator();
                while (it2.hasNext()) {
                    it2.next().toString(sb);
                    sb.append(NEWLINE);
                }
            }
            LinkedList<Component> linkedList = this.mChildren;
            if (linkedList != null) {
                Iterator<Component> it3 = linkedList.iterator();
                while (it3.hasNext()) {
                    it3.next().toString(sb);
                    sb.append(NEWLINE);
                }
            }
            sb.append(END);
            sb.append(":");
            sb.append(this.mName);
        }
    }
}
