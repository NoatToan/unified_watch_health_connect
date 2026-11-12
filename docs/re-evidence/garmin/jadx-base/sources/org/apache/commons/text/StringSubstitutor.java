package org.apache.commons.text;

import am.j;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang3.Validate;
import org.apache.commons.text.lookup.StringLookup;
import org.apache.commons.text.lookup.StringLookupFactory;
import org.apache.commons.text.matcher.StringMatcher;
import org.apache.commons.text.matcher.StringMatcherFactory;

/* JADX INFO: loaded from: classes3.dex */
public class StringSubstitutor {
    public static final char DEFAULT_ESCAPE = '$';
    public static final StringMatcher DEFAULT_PREFIX;
    public static final StringMatcher DEFAULT_SUFFIX;
    public static final StringMatcher DEFAULT_VALUE_DELIMITER;
    public static final String DEFAULT_VAR_DEFAULT = ":-";
    public static final String DEFAULT_VAR_END = "}";
    public static final String DEFAULT_VAR_START = "${";
    private boolean disableSubstitutionInValues;
    private boolean enableSubstitutionInVariables;
    private boolean enableUndefinedVariableException;
    private char escapeChar;
    private StringMatcher prefixMatcher;
    private boolean preserveEscapes;
    private StringMatcher suffixMatcher;
    private StringMatcher valueDelimiterMatcher;
    private StringLookup variableResolver;

    public static final class Result {
        public final boolean altered;
        public final int lengthChange;

        private Result(boolean z14, int i14) {
            this.altered = z14;
            this.lengthChange = i14;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("Result [altered=");
            sb3.append(this.altered);
            sb3.append(", lengthChange=");
            return j.q(sb3, this.lengthChange, "]");
        }
    }

    static {
        StringMatcherFactory stringMatcherFactory = StringMatcherFactory.INSTANCE;
        DEFAULT_PREFIX = stringMatcherFactory.stringMatcher(DEFAULT_VAR_START);
        DEFAULT_SUFFIX = stringMatcherFactory.stringMatcher(DEFAULT_VAR_END);
        DEFAULT_VALUE_DELIMITER = stringMatcherFactory.stringMatcher(":-");
    }

    public StringSubstitutor(StringSubstitutor stringSubstitutor) {
        this.disableSubstitutionInValues = stringSubstitutor.isDisableSubstitutionInValues();
        this.enableSubstitutionInVariables = stringSubstitutor.isEnableSubstitutionInVariables();
        this.enableUndefinedVariableException = stringSubstitutor.isEnableUndefinedVariableException();
        this.escapeChar = stringSubstitutor.getEscapeChar();
        this.prefixMatcher = stringSubstitutor.getVariablePrefixMatcher();
        this.preserveEscapes = stringSubstitutor.isPreserveEscapes();
        this.suffixMatcher = stringSubstitutor.getVariableSuffixMatcher();
        this.valueDelimiterMatcher = stringSubstitutor.getValueDelimiterMatcher();
        this.variableResolver = stringSubstitutor.getStringLookup();
    }

    private void checkCyclicSubstitution(String str, List<String> list) {
        if (list.contains(str)) {
            TextStringBuilder textStringBuilder = new TextStringBuilder(256);
            textStringBuilder.append("Infinite loop in property interpolation of ");
            textStringBuilder.append(list.remove(0));
            textStringBuilder.append(": ");
            textStringBuilder.appendWithSeparators(list, "->");
            throw new IllegalStateException(textStringBuilder.toString());
        }
    }

    public static StringSubstitutor createInterpolator() {
        return new StringSubstitutor(StringLookupFactory.INSTANCE.interpolatorStringLookup());
    }

    public static String replace(Object obj, Properties properties) {
        if (properties == null) {
            return obj.toString();
        }
        HashMap map = new HashMap();
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            String str = (String) enumerationPropertyNames.nextElement();
            map.put(str, properties.getProperty(str));
        }
        return replace(obj, map);
    }

    public static String replaceSystemProperties(Object obj) {
        return new StringSubstitutor(StringLookupFactory.INSTANCE.systemPropertyStringLookup()).replace(obj);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:30:0x00be  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:0x011f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x012b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0132  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x008a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r26v0, types: [org.apache.commons.text.StringSubstitutor] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:35:0x00cc
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private org.apache.commons.text.StringSubstitutor.Result substitute(org.apache.commons.text.TextStringBuilder r27, int r28, int r29, java.util.List<java.lang.String> r30) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.text.StringSubstitutor.substitute(org.apache.commons.text.TextStringBuilder, int, int, java.util.List):org.apache.commons.text.StringSubstitutor$Result");
    }

    public char getEscapeChar() {
        return this.escapeChar;
    }

    public StringLookup getStringLookup() {
        return this.variableResolver;
    }

    public StringMatcher getValueDelimiterMatcher() {
        return this.valueDelimiterMatcher;
    }

    public StringMatcher getVariablePrefixMatcher() {
        return this.prefixMatcher;
    }

    public StringMatcher getVariableSuffixMatcher() {
        return this.suffixMatcher;
    }

    public boolean isDisableSubstitutionInValues() {
        return this.disableSubstitutionInValues;
    }

    public boolean isEnableSubstitutionInVariables() {
        return this.enableSubstitutionInVariables;
    }

    public boolean isEnableUndefinedVariableException() {
        return this.enableUndefinedVariableException;
    }

    public boolean isPreserveEscapes() {
        return this.preserveEscapes;
    }

    public boolean replaceIn(StringBuffer stringBuffer, int i14, int i15) {
        if (stringBuffer == null) {
            return false;
        }
        TextStringBuilder textStringBuilderAppend = new TextStringBuilder(i15).append(stringBuffer, i14, i15);
        if (!substitute(textStringBuilderAppend, 0, i15)) {
            return false;
        }
        stringBuffer.replace(i14, i15 + i14, textStringBuilderAppend.toString());
        return true;
    }

    public String resolveVariable(String str, TextStringBuilder textStringBuilder, int i14, int i15) {
        StringLookup stringLookup = getStringLookup();
        if (stringLookup == null) {
            return null;
        }
        return stringLookup.lookup(str);
    }

    public StringSubstitutor setDisableSubstitutionInValues(boolean z14) {
        this.disableSubstitutionInValues = z14;
        return this;
    }

    public StringSubstitutor setEnableSubstitutionInVariables(boolean z14) {
        this.enableSubstitutionInVariables = z14;
        return this;
    }

    public StringSubstitutor setEnableUndefinedVariableException(boolean z14) {
        this.enableUndefinedVariableException = z14;
        return this;
    }

    public StringSubstitutor setEscapeChar(char c14) {
        this.escapeChar = c14;
        return this;
    }

    public StringSubstitutor setPreserveEscapes(boolean z14) {
        this.preserveEscapes = z14;
        return this;
    }

    public StringSubstitutor setValueDelimiter(String str) {
        if (str != null && str.length() != 0) {
            return setValueDelimiterMatcher(StringMatcherFactory.INSTANCE.stringMatcher(str));
        }
        setValueDelimiterMatcher(null);
        return this;
    }

    public StringSubstitutor setValueDelimiterMatcher(StringMatcher stringMatcher) {
        this.valueDelimiterMatcher = stringMatcher;
        return this;
    }

    public StringSubstitutor setVariablePrefix(String str) {
        Validate.isTrue(str != null, "Variable prefix must not be null!", new Object[0]);
        return setVariablePrefixMatcher(StringMatcherFactory.INSTANCE.stringMatcher(str));
    }

    public StringSubstitutor setVariablePrefixMatcher(StringMatcher stringMatcher) {
        Validate.isTrue(stringMatcher != null, "Variable prefix matcher must not be null!", new Object[0]);
        this.prefixMatcher = stringMatcher;
        return this;
    }

    public StringSubstitutor setVariableResolver(StringLookup stringLookup) {
        this.variableResolver = stringLookup;
        return this;
    }

    public StringSubstitutor setVariableSuffix(String str) {
        Validate.isTrue(str != null, "Variable suffix must not be null!", new Object[0]);
        return setVariableSuffixMatcher(StringMatcherFactory.INSTANCE.stringMatcher(str));
    }

    public StringSubstitutor setVariableSuffixMatcher(StringMatcher stringMatcher) {
        Validate.isTrue(stringMatcher != null, "Variable suffix matcher must not be null!", new Object[0]);
        this.suffixMatcher = stringMatcher;
        return this;
    }

    public StringSubstitutor setVariablePrefix(char c14) {
        return setVariablePrefixMatcher(StringMatcherFactory.INSTANCE.charMatcher(c14));
    }

    public StringSubstitutor setVariableSuffix(char c14) {
        return setVariableSuffixMatcher(StringMatcherFactory.INSTANCE.charMatcher(c14));
    }

    public StringSubstitutor setValueDelimiter(char c14) {
        return setValueDelimiterMatcher(StringMatcherFactory.INSTANCE.charMatcher(c14));
    }

    public boolean replaceIn(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return false;
        }
        return replaceIn(stringBuffer, 0, stringBuffer.length());
    }

    public boolean replaceIn(StringBuilder sb3) {
        if (sb3 == null) {
            return false;
        }
        return replaceIn(sb3, 0, sb3.length());
    }

    public boolean replaceIn(StringBuilder sb3, int i14, int i15) {
        if (sb3 == null) {
            return false;
        }
        TextStringBuilder textStringBuilderAppend = new TextStringBuilder(i15).append(sb3, i14, i15);
        if (!substitute(textStringBuilderAppend, 0, i15)) {
            return false;
        }
        sb3.replace(i14, i15 + i14, textStringBuilderAppend.toString());
        return true;
    }

    public boolean replaceIn(TextStringBuilder textStringBuilder) {
        if (textStringBuilder == null) {
            return false;
        }
        return substitute(textStringBuilder, 0, textStringBuilder.length());
    }

    public boolean replaceIn(TextStringBuilder textStringBuilder, int i14, int i15) {
        if (textStringBuilder == null) {
            return false;
        }
        return substitute(textStringBuilder, i14, i15);
    }

    public static <V> String replace(Object obj, Map<String, V> map, String str, String str2) {
        return new StringSubstitutor(map, str, str2).replace(obj);
    }

    public static <V> String replace(Object obj, Map<String, V> map) {
        return new StringSubstitutor(map).replace(obj);
    }

    public String replace(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        TextStringBuilder textStringBuilderAppend = new TextStringBuilder(cArr.length).append(cArr);
        substitute(textStringBuilderAppend, 0, cArr.length);
        return textStringBuilderAppend.toString();
    }

    public String replace(char[] cArr, int i14, int i15) {
        if (cArr == null) {
            return null;
        }
        TextStringBuilder textStringBuilderAppend = new TextStringBuilder(i15).append(cArr, i14, i15);
        substitute(textStringBuilderAppend, 0, i15);
        return textStringBuilderAppend.toString();
    }

    public String replace(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return replace(charSequence, 0, charSequence.length());
    }

    public String replace(CharSequence charSequence, int i14, int i15) {
        if (charSequence == null) {
            return null;
        }
        TextStringBuilder textStringBuilderAppend = new TextStringBuilder(i15).append(charSequence.toString(), i14, i15);
        substitute(textStringBuilderAppend, 0, i15);
        return textStringBuilderAppend.toString();
    }

    public String replace(Object obj) {
        if (obj == null) {
            return null;
        }
        TextStringBuilder textStringBuilderAppend = new TextStringBuilder().append(obj);
        substitute(textStringBuilderAppend, 0, textStringBuilderAppend.length());
        return textStringBuilderAppend.toString();
    }

    public String replace(String str) {
        if (str == null) {
            return null;
        }
        TextStringBuilder textStringBuilder = new TextStringBuilder(str);
        return !substitute(textStringBuilder, 0, str.length()) ? str : textStringBuilder.toString();
    }

    public <V> StringSubstitutor(Map<String, V> map) {
        this(StringLookupFactory.INSTANCE.mapStringLookup(map), DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public <V> StringSubstitutor(Map<String, V> map, String str, String str2) {
        this(StringLookupFactory.INSTANCE.mapStringLookup(map), str, str2, '$');
    }

    public String replace(String str, int i14, int i15) {
        if (str == null) {
            return null;
        }
        TextStringBuilder textStringBuilderAppend = new TextStringBuilder(i15).append(str, i14, i15);
        if (!substitute(textStringBuilderAppend, 0, i15)) {
            return str.substring(i14, i15 + i14);
        }
        return textStringBuilderAppend.toString();
    }

    public <V> StringSubstitutor(Map<String, V> map, String str, String str2, char c14) {
        this(StringLookupFactory.INSTANCE.mapStringLookup(map), str, str2, c14);
    }

    public <V> StringSubstitutor(Map<String, V> map, String str, String str2, char c14, String str3) {
        this(StringLookupFactory.INSTANCE.mapStringLookup(map), str, str2, c14, str3);
    }

    public StringSubstitutor(StringLookup stringLookup) {
        this(stringLookup, DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public StringSubstitutor(StringLookup stringLookup, String str, String str2, char c14) {
        setVariableResolver(stringLookup);
        setVariablePrefix(str);
        setVariableSuffix(str2);
        setEscapeChar(c14);
        setValueDelimiterMatcher(DEFAULT_VALUE_DELIMITER);
    }

    public String replace(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        TextStringBuilder textStringBuilderAppend = new TextStringBuilder(stringBuffer.length()).append(stringBuffer);
        substitute(textStringBuilderAppend, 0, textStringBuilderAppend.length());
        return textStringBuilderAppend.toString();
    }

    public String replace(StringBuffer stringBuffer, int i14, int i15) {
        if (stringBuffer == null) {
            return null;
        }
        TextStringBuilder textStringBuilderAppend = new TextStringBuilder(i15).append(stringBuffer, i14, i15);
        substitute(textStringBuilderAppend, 0, i15);
        return textStringBuilderAppend.toString();
    }

    public StringSubstitutor(StringLookup stringLookup, String str, String str2, char c14, String str3) {
        setVariableResolver(stringLookup);
        setVariablePrefix(str);
        setVariableSuffix(str2);
        setEscapeChar(c14);
        setValueDelimiter(str3);
    }

    public String replace(TextStringBuilder textStringBuilder) {
        if (textStringBuilder == null) {
            return null;
        }
        TextStringBuilder textStringBuilderAppend = new TextStringBuilder(textStringBuilder.length()).append(textStringBuilder);
        substitute(textStringBuilderAppend, 0, textStringBuilderAppend.length());
        return textStringBuilderAppend.toString();
    }

    public String replace(TextStringBuilder textStringBuilder, int i14, int i15) {
        if (textStringBuilder == null) {
            return null;
        }
        TextStringBuilder textStringBuilderAppend = new TextStringBuilder(i15).append(textStringBuilder, i14, i15);
        substitute(textStringBuilderAppend, 0, i15);
        return textStringBuilderAppend.toString();
    }

    public StringSubstitutor(StringLookup stringLookup, StringMatcher stringMatcher, StringMatcher stringMatcher2, char c14) {
        this(stringLookup, stringMatcher, stringMatcher2, c14, DEFAULT_VALUE_DELIMITER);
    }

    public StringSubstitutor(StringLookup stringLookup, StringMatcher stringMatcher, StringMatcher stringMatcher2, char c14, StringMatcher stringMatcher3) {
        setVariableResolver(stringLookup);
        setVariablePrefixMatcher(stringMatcher);
        setVariableSuffixMatcher(stringMatcher2);
        setEscapeChar(c14);
        setValueDelimiterMatcher(stringMatcher3);
    }

    public StringSubstitutor() {
        this((StringLookup) null, DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public boolean substitute(TextStringBuilder textStringBuilder, int i14, int i15) {
        return substitute(textStringBuilder, i14, i15, null).altered;
    }
}
