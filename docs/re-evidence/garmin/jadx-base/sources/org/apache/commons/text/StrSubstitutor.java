package org.apache.commons.text;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class StrSubstitutor {
    public static final char DEFAULT_ESCAPE = '$';
    public static final StrMatcher DEFAULT_PREFIX = StrMatcher.stringMatcher(StringSubstitutor.DEFAULT_VAR_START);
    public static final StrMatcher DEFAULT_SUFFIX = StrMatcher.stringMatcher(StringSubstitutor.DEFAULT_VAR_END);
    public static final StrMatcher DEFAULT_VALUE_DELIMITER = StrMatcher.stringMatcher(":-");
    private boolean disableSubstitutionInValues;
    private boolean enableSubstitutionInVariables;
    private char escapeChar;
    private StrMatcher prefixMatcher;
    private boolean preserveEscapes;
    private StrMatcher suffixMatcher;
    private StrMatcher valueDelimiterMatcher;
    private StrLookup<?> variableResolver;

    public StrSubstitutor(StrLookup<?> strLookup, String str, String str2, char c14) {
        this.preserveEscapes = false;
        setVariableResolver(strLookup);
        setVariablePrefix(str);
        setVariableSuffix(str2);
        setEscapeChar(c14);
        setValueDelimiterMatcher(DEFAULT_VALUE_DELIMITER);
    }

    private void checkCyclicSubstitution(String str, List<String> list) {
        if (list.contains(str)) {
            StrBuilder strBuilder = new StrBuilder(256);
            strBuilder.append("Infinite loop in property interpolation of ");
            strBuilder.append(list.remove(0));
            strBuilder.append(": ");
            strBuilder.appendWithSeparators(list, "->");
            throw new IllegalStateException(strBuilder.toString());
        }
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
        return new StrSubstitutor(StrLookup.systemPropertiesLookup()).replace(obj);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0115  */
    /* JADX WARN: Code duplicated, block: B:58:0x011a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r26v0, types: [org.apache.commons.text.StrSubstitutor] */
    private int substitute(StrBuilder strBuilder, int i14, int i15, List<String> list) {
        boolean z14;
        int i16;
        String strSubstring;
        String strResolveVariable;
        int length;
        int iSubstitute;
        StrMatcher variablePrefixMatcher = getVariablePrefixMatcher();
        StrMatcher variableSuffixMatcher = getVariableSuffixMatcher();
        char escapeChar = getEscapeChar();
        StrMatcher valueDelimiterMatcher = getValueDelimiterMatcher();
        boolean zIsEnableSubstitutionInVariables = isEnableSubstitutionInVariables();
        boolean zIsDisableSubstitutionInValues = isDisableSubstitutionInValues();
        boolean z15 = list == null;
        int i17 = i14;
        int i18 = i14 + i15;
        int i19 = 0;
        int i24 = 0;
        char[] cArr = strBuilder.buffer;
        ?? arrayList = list;
        while (i17 < i18) {
            int iIsMatch = variablePrefixMatcher.isMatch(cArr, i17, i14, i18);
            if (iIsMatch == 0) {
                i17++;
                z14 = zIsEnableSubstitutionInVariables;
            } else {
                if (i17 > i14) {
                    int i25 = i17 - 1;
                    z14 = zIsEnableSubstitutionInVariables;
                    if (cArr[i25] == escapeChar) {
                        if (this.preserveEscapes) {
                            i17++;
                            zIsEnableSubstitutionInVariables = z14;
                        } else {
                            strBuilder.deleteCharAt(i25);
                            i19--;
                            i18--;
                            cArr = strBuilder.buffer;
                            i24 = 1;
                        }
                    }
                } else {
                    z14 = zIsEnableSubstitutionInVariables;
                }
                int i26 = i17 + iIsMatch;
                int iIsMatch2 = i26;
                int i27 = 0;
                while (true) {
                    if (iIsMatch2 >= i18) {
                        variableSuffixMatcher = variableSuffixMatcher;
                        escapeChar = escapeChar;
                        zIsDisableSubstitutionInValues = zIsDisableSubstitutionInValues;
                        i17 = iIsMatch2;
                        arrayList = arrayList;
                        break;
                    }
                    if (!z14 || variablePrefixMatcher.isMatch(cArr, iIsMatch2, i14, i18) == 0) {
                        int iIsMatch3 = variableSuffixMatcher.isMatch(cArr, iIsMatch2, i14, i18);
                        if (iIsMatch3 == 0) {
                            iIsMatch2++;
                        } else {
                            if (i27 == 0) {
                                variableSuffixMatcher = variableSuffixMatcher;
                                escapeChar = escapeChar;
                                String str = new String(cArr, i26, (iIsMatch2 - i17) - iIsMatch);
                                if (z14) {
                                    StrBuilder strBuilder2 = new StrBuilder(str);
                                    substitute(strBuilder2, 0, strBuilder2.length());
                                    str = strBuilder2.toString();
                                }
                                int i28 = iIsMatch2 + iIsMatch3;
                                if (valueDelimiterMatcher != null) {
                                    char[] charArray = str.toCharArray();
                                    zIsDisableSubstitutionInValues = zIsDisableSubstitutionInValues;
                                    int i29 = 0;
                                    while (true) {
                                        if (i29 < charArray.length && (z14 || variablePrefixMatcher.isMatch(charArray, i29, i29, charArray.length) == 0)) {
                                            if (valueDelimiterMatcher.isMatch(charArray, i29) != 0) {
                                                int iIsMatch4 = valueDelimiterMatcher.isMatch(charArray, i29);
                                                i16 = 0;
                                                String strSubstring2 = str.substring(0, i29);
                                                strSubstring = str.substring(i29 + iIsMatch4);
                                                str = strSubstring2;
                                            } else {
                                                i29++;
                                            }
                                        }
                                        if (arrayList == 0) {
                                            arrayList = new ArrayList();
                                            arrayList.add(new String(cArr, i14, i15));
                                        }
                                        checkCyclicSubstitution(str, arrayList);
                                        arrayList.add(str);
                                        strResolveVariable = resolveVariable(str, strBuilder, i17, i28);
                                        if (strResolveVariable != null) {
                                            strSubstring = strResolveVariable;
                                        }
                                        if (strSubstring != null) {
                                            length = strSubstring.length();
                                            strBuilder.replace(i17, i28, strSubstring);
                                            if (zIsDisableSubstitutionInValues) {
                                                iSubstitute = i16;
                                            } else {
                                                iSubstitute = substitute(strBuilder, i17, length, arrayList);
                                            }
                                            int i30 = (iSubstitute + length) - (i28 - i17);
                                            i28 += i30;
                                            i18 += i30;
                                            i19 += i30;
                                            cArr = strBuilder.buffer;
                                            i24 = 1;
                                        }
                                        i17 = i28;
                                        arrayList.remove(arrayList.size() - 1);
                                        arrayList = arrayList;
                                        break;
                                    }
                                }
                                zIsDisableSubstitutionInValues = zIsDisableSubstitutionInValues;
                                i16 = 0;
                                strSubstring = null;
                                if (arrayList == 0) {
                                    arrayList = new ArrayList();
                                    arrayList.add(new String(cArr, i14, i15));
                                }
                                checkCyclicSubstitution(str, arrayList);
                                arrayList.add(str);
                                strResolveVariable = resolveVariable(str, strBuilder, i17, i28);
                                if (strResolveVariable != null) {
                                    strSubstring = strResolveVariable;
                                }
                                if (strSubstring != null) {
                                    length = strSubstring.length();
                                    strBuilder.replace(i17, i28, strSubstring);
                                    if (zIsDisableSubstitutionInValues) {
                                        iSubstitute = substitute(strBuilder, i17, length, arrayList);
                                    } else {
                                        iSubstitute = i16;
                                    }
                                    int i34 = (iSubstitute + length) - (i28 - i17);
                                    i28 += i34;
                                    i18 += i34;
                                    i19 += i34;
                                    cArr = strBuilder.buffer;
                                    i24 = 1;
                                }
                                i17 = i28;
                                arrayList.remove(arrayList.size() - 1);
                                arrayList = arrayList;
                                break;
                            }
                            i27--;
                            iIsMatch2 += iIsMatch3;
                            zIsDisableSubstitutionInValues = zIsDisableSubstitutionInValues;
                        }
                    } else {
                        i27++;
                        iIsMatch2 += variablePrefixMatcher.isMatch(cArr, iIsMatch2, i14, i18);
                    }
                }
                zIsEnableSubstitutionInVariables = z14;
                variableSuffixMatcher = variableSuffixMatcher;
                escapeChar = escapeChar;
                zIsDisableSubstitutionInValues = zIsDisableSubstitutionInValues;
            }
            arrayList = arrayList;
            zIsEnableSubstitutionInVariables = z14;
            variableSuffixMatcher = variableSuffixMatcher;
            escapeChar = escapeChar;
            zIsDisableSubstitutionInValues = zIsDisableSubstitutionInValues;
        }
        return z15 ? i24 : i19;
    }

    public char getEscapeChar() {
        return this.escapeChar;
    }

    public StrMatcher getValueDelimiterMatcher() {
        return this.valueDelimiterMatcher;
    }

    public StrMatcher getVariablePrefixMatcher() {
        return this.prefixMatcher;
    }

    public StrLookup<?> getVariableResolver() {
        return this.variableResolver;
    }

    public StrMatcher getVariableSuffixMatcher() {
        return this.suffixMatcher;
    }

    public boolean isDisableSubstitutionInValues() {
        return this.disableSubstitutionInValues;
    }

    public boolean isEnableSubstitutionInVariables() {
        return this.enableSubstitutionInVariables;
    }

    public boolean isPreserveEscapes() {
        return this.preserveEscapes;
    }

    public boolean replaceIn(StringBuffer stringBuffer, int i14, int i15) {
        if (stringBuffer == null) {
            return false;
        }
        StrBuilder strBuilderAppend = new StrBuilder(i15).append(stringBuffer, i14, i15);
        if (!substitute(strBuilderAppend, 0, i15)) {
            return false;
        }
        stringBuffer.replace(i14, i15 + i14, strBuilderAppend.toString());
        return true;
    }

    public String resolveVariable(String str, StrBuilder strBuilder, int i14, int i15) {
        StrLookup<?> variableResolver = getVariableResolver();
        if (variableResolver == null) {
            return null;
        }
        return variableResolver.lookup(str);
    }

    public void setDisableSubstitutionInValues(boolean z14) {
        this.disableSubstitutionInValues = z14;
    }

    public void setEnableSubstitutionInVariables(boolean z14) {
        this.enableSubstitutionInVariables = z14;
    }

    public void setEscapeChar(char c14) {
        this.escapeChar = c14;
    }

    public void setPreserveEscapes(boolean z14) {
        this.preserveEscapes = z14;
    }

    public StrSubstitutor setValueDelimiter(String str) {
        if (str != null && str.length() != 0) {
            return setValueDelimiterMatcher(StrMatcher.stringMatcher(str));
        }
        setValueDelimiterMatcher(null);
        return this;
    }

    public StrSubstitutor setValueDelimiterMatcher(StrMatcher strMatcher) {
        this.valueDelimiterMatcher = strMatcher;
        return this;
    }

    public StrSubstitutor setVariablePrefix(String str) {
        Validate.isTrue(str != null, "Variable prefix must not be null!", new Object[0]);
        return setVariablePrefixMatcher(StrMatcher.stringMatcher(str));
    }

    public StrSubstitutor setVariablePrefixMatcher(StrMatcher strMatcher) {
        Validate.isTrue(strMatcher != null, "Variable prefix matcher must not be null!", new Object[0]);
        this.prefixMatcher = strMatcher;
        return this;
    }

    public void setVariableResolver(StrLookup<?> strLookup) {
        this.variableResolver = strLookup;
    }

    public StrSubstitutor setVariableSuffix(String str) {
        Validate.isTrue(str != null, "Variable suffix must not be null!", new Object[0]);
        return setVariableSuffixMatcher(StrMatcher.stringMatcher(str));
    }

    public StrSubstitutor setVariableSuffixMatcher(StrMatcher strMatcher) {
        Validate.isTrue(strMatcher != null, "Variable suffix matcher must not be null!", new Object[0]);
        this.suffixMatcher = strMatcher;
        return this;
    }

    public StrSubstitutor setVariablePrefix(char c14) {
        return setVariablePrefixMatcher(StrMatcher.charMatcher(c14));
    }

    public StrSubstitutor setVariableSuffix(char c14) {
        return setVariableSuffixMatcher(StrMatcher.charMatcher(c14));
    }

    public StrSubstitutor setValueDelimiter(char c14) {
        return setValueDelimiterMatcher(StrMatcher.charMatcher(c14));
    }

    public <V> StrSubstitutor(Map<String, V> map) {
        this((StrLookup<?>) StrLookup.mapLookup(map), DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public <V> StrSubstitutor(Map<String, V> map, String str, String str2) {
        this((StrLookup<?>) StrLookup.mapLookup(map), str, str2, '$');
    }

    public <V> StrSubstitutor(Map<String, V> map, String str, String str2, char c14) {
        this((StrLookup<?>) StrLookup.mapLookup(map), str, str2, c14);
    }

    public <V> StrSubstitutor(Map<String, V> map, String str, String str2, char c14, String str3) {
        this((StrLookup<?>) StrLookup.mapLookup(map), str, str2, c14, str3);
    }

    public StrSubstitutor(StrLookup<?> strLookup) {
        this(strLookup, DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public StrSubstitutor() {
        this((StrLookup<?>) null, DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public StrSubstitutor(StrLookup<?> strLookup, String str, String str2, char c14, String str3) {
        this.preserveEscapes = false;
        setVariableResolver(strLookup);
        setVariablePrefix(str);
        setVariableSuffix(str2);
        setEscapeChar(c14);
        setValueDelimiter(str3);
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
        StrBuilder strBuilderAppend = new StrBuilder(i15).append(sb3, i14, i15);
        if (!substitute(strBuilderAppend, 0, i15)) {
            return false;
        }
        sb3.replace(i14, i15 + i14, strBuilderAppend.toString());
        return true;
    }

    public boolean replaceIn(StrBuilder strBuilder) {
        if (strBuilder == null) {
            return false;
        }
        return substitute(strBuilder, 0, strBuilder.length());
    }

    public boolean replaceIn(StrBuilder strBuilder, int i14, int i15) {
        if (strBuilder == null) {
            return false;
        }
        return substitute(strBuilder, i14, i15);
    }

    public StrSubstitutor(StrLookup<?> strLookup, StrMatcher strMatcher, StrMatcher strMatcher2, char c14) {
        this(strLookup, strMatcher, strMatcher2, c14, DEFAULT_VALUE_DELIMITER);
    }

    public StrSubstitutor(StrLookup<?> strLookup, StrMatcher strMatcher, StrMatcher strMatcher2, char c14, StrMatcher strMatcher3) {
        this.preserveEscapes = false;
        setVariableResolver(strLookup);
        setVariablePrefixMatcher(strMatcher);
        setVariableSuffixMatcher(strMatcher2);
        setEscapeChar(c14);
        setValueDelimiterMatcher(strMatcher3);
    }

    public static <V> String replace(Object obj, Map<String, V> map, String str, String str2) {
        return new StrSubstitutor(map, str, str2).replace(obj);
    }

    public static <V> String replace(Object obj, Map<String, V> map) {
        return new StrSubstitutor(map).replace(obj);
    }

    public String replace(String str) {
        if (str == null) {
            return null;
        }
        StrBuilder strBuilder = new StrBuilder(str);
        return !substitute(strBuilder, 0, str.length()) ? str : strBuilder.toString();
    }

    public String replace(String str, int i14, int i15) {
        if (str == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(i15).append(str, i14, i15);
        if (!substitute(strBuilderAppend, 0, i15)) {
            return str.substring(i14, i15 + i14);
        }
        return strBuilderAppend.toString();
    }

    public String replace(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(cArr.length).append(cArr);
        substitute(strBuilderAppend, 0, cArr.length);
        return strBuilderAppend.toString();
    }

    public String replace(char[] cArr, int i14, int i15) {
        if (cArr == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(i15).append(cArr, i14, i15);
        substitute(strBuilderAppend, 0, i15);
        return strBuilderAppend.toString();
    }

    public String replace(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(stringBuffer.length()).append(stringBuffer);
        substitute(strBuilderAppend, 0, strBuilderAppend.length());
        return strBuilderAppend.toString();
    }

    public String replace(StringBuffer stringBuffer, int i14, int i15) {
        if (stringBuffer == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(i15).append(stringBuffer, i14, i15);
        substitute(strBuilderAppend, 0, i15);
        return strBuilderAppend.toString();
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
        StrBuilder strBuilderAppend = new StrBuilder(i15).append(charSequence, i14, i15);
        substitute(strBuilderAppend, 0, i15);
        return strBuilderAppend.toString();
    }

    public String replace(StrBuilder strBuilder) {
        if (strBuilder == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(strBuilder.length()).append(strBuilder);
        substitute(strBuilderAppend, 0, strBuilderAppend.length());
        return strBuilderAppend.toString();
    }

    public String replace(StrBuilder strBuilder, int i14, int i15) {
        if (strBuilder == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(i15).append(strBuilder, i14, i15);
        substitute(strBuilderAppend, 0, i15);
        return strBuilderAppend.toString();
    }

    public String replace(Object obj) {
        if (obj == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder().append(obj);
        substitute(strBuilderAppend, 0, strBuilderAppend.length());
        return strBuilderAppend.toString();
    }

    public boolean substitute(StrBuilder strBuilder, int i14, int i15) {
        return substitute(strBuilder, i14, i15, null) > 0;
    }
}
