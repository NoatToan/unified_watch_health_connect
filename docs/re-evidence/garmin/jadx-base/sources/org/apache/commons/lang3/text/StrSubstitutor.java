package org.apache.commons.lang3.text;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class StrSubstitutor {
    public static final char DEFAULT_ESCAPE = '$';
    public static final StrMatcher DEFAULT_PREFIX = StrMatcher.stringMatcher(StringSubstitutor.DEFAULT_VAR_START);
    public static final StrMatcher DEFAULT_SUFFIX = StrMatcher.stringMatcher(StringSubstitutor.DEFAULT_VAR_END);
    public static final StrMatcher DEFAULT_VALUE_DELIMITER = StrMatcher.stringMatcher(":-");
    private boolean enableSubstitutionInVariables;
    private char escapeChar;
    private StrMatcher prefixMatcher;
    private boolean preserveEscapes;
    private StrMatcher suffixMatcher;
    private StrMatcher valueDelimiterMatcher;
    private StrLookup<?> variableResolver;

    public StrSubstitutor(StrLookup<?> strLookup, String str, String str2, char c14) {
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

    /* JADX WARN: Code duplicated, block: B:49:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b  */
    /* JADX WARN: Code duplicated, block: B:55:0x010e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [org.apache.commons.lang3.text.StrSubstitutor] */
    private int substitute(StrBuilder strBuilder, int i14, int i15, List<String> list) {
        StrMatcher strMatcher;
        boolean z14;
        int i16;
        String strSubstring;
        String strResolveVariable;
        int iIsMatch;
        StrMatcher variablePrefixMatcher = getVariablePrefixMatcher();
        StrMatcher variableSuffixMatcher = getVariableSuffixMatcher();
        char escapeChar = getEscapeChar();
        StrMatcher valueDelimiterMatcher = getValueDelimiterMatcher();
        boolean zIsEnableSubstitutionInVariables = isEnableSubstitutionInVariables();
        boolean z15 = list == null;
        int i17 = i14;
        int i18 = i14 + i15;
        int i19 = 0;
        int i24 = 0;
        char[] cArr = strBuilder.buffer;
        ?? arrayList = list;
        while (i17 < i18) {
            int iIsMatch2 = variablePrefixMatcher.isMatch(cArr, i17, i14, i18);
            if (iIsMatch2 != 0) {
                if (i17 > i14) {
                    i16 = 1;
                    int i25 = i17 - 1;
                    if (cArr[i25] == escapeChar) {
                        if (this.preserveEscapes) {
                            i17++;
                        } else {
                            strBuilder.deleteCharAt(i25);
                            i19--;
                            i18--;
                            strMatcher = variablePrefixMatcher;
                            z14 = zIsEnableSubstitutionInVariables;
                            cArr = strBuilder.buffer;
                            i24 = 1;
                            arrayList = arrayList;
                        }
                    }
                } else {
                    i16 = 1;
                }
                int i26 = i17 + iIsMatch2;
                int i27 = i26;
                int i28 = 0;
                while (true) {
                    if (i27 >= i18) {
                        strMatcher = variablePrefixMatcher;
                        z14 = zIsEnableSubstitutionInVariables;
                        i17 = i27;
                        arrayList = arrayList;
                        break;
                    }
                    if (!zIsEnableSubstitutionInVariables || (iIsMatch = variablePrefixMatcher.isMatch(cArr, i27, i14, i18)) == 0) {
                        int iIsMatch3 = variableSuffixMatcher.isMatch(cArr, i27, i14, i18);
                        if (iIsMatch3 == 0) {
                            i27++;
                        } else {
                            if (i28 == 0) {
                                String str = new String(cArr, i26, (i27 - i17) - iIsMatch2);
                                if (zIsEnableSubstitutionInVariables) {
                                    StrBuilder strBuilder2 = new StrBuilder(str);
                                    substitute(strBuilder2, 0, strBuilder2.length());
                                    str = strBuilder2.toString();
                                }
                                int i29 = i27 + iIsMatch3;
                                if (valueDelimiterMatcher != null) {
                                    char[] charArray = str.toCharArray();
                                    z14 = zIsEnableSubstitutionInVariables;
                                    int i30 = 0;
                                    while (true) {
                                        if (i30 >= charArray.length || !(z14 || variablePrefixMatcher.isMatch(charArray, i30, i30, charArray.length) == 0)) {
                                            strMatcher = variablePrefixMatcher;
                                        } else {
                                            int iIsMatch4 = valueDelimiterMatcher.isMatch(charArray, i30);
                                            if (iIsMatch4 != 0) {
                                                strMatcher = variablePrefixMatcher;
                                                String strSubstring2 = str.substring(0, i30);
                                                strSubstring = str.substring(i30 + iIsMatch4);
                                                str = strSubstring2;
                                            } else {
                                                i30++;
                                                variablePrefixMatcher = variablePrefixMatcher;
                                            }
                                        }
                                        if (arrayList == 0) {
                                            arrayList = new ArrayList();
                                            arrayList.add(new String(cArr, i14, i15));
                                        }
                                        checkCyclicSubstitution(str, arrayList);
                                        arrayList.add(str);
                                        strResolveVariable = resolveVariable(str, strBuilder, i17, i29);
                                        if (strResolveVariable != null) {
                                            strSubstring = strResolveVariable;
                                        }
                                        if (strSubstring != null) {
                                            int length = strSubstring.length();
                                            strBuilder.replace(i17, i29, strSubstring);
                                            int iSubstitute = (substitute(strBuilder, i17, length, arrayList) + length) - (i29 - i17);
                                            i29 += iSubstitute;
                                            i18 += iSubstitute;
                                            i19 += iSubstitute;
                                            cArr = strBuilder.buffer;
                                            i24 = i16;
                                        }
                                        i17 = i29;
                                        arrayList.remove(arrayList.size() - 1);
                                        arrayList = arrayList;
                                        break;
                                    }
                                }
                                strMatcher = variablePrefixMatcher;
                                z14 = zIsEnableSubstitutionInVariables;
                                strSubstring = null;
                                if (arrayList == 0) {
                                    arrayList = new ArrayList();
                                    arrayList.add(new String(cArr, i14, i15));
                                }
                                checkCyclicSubstitution(str, arrayList);
                                arrayList.add(str);
                                strResolveVariable = resolveVariable(str, strBuilder, i17, i29);
                                if (strResolveVariable != null) {
                                    strSubstring = strResolveVariable;
                                }
                                if (strSubstring != null) {
                                    int length2 = strSubstring.length();
                                    strBuilder.replace(i17, i29, strSubstring);
                                    int iSubstitute2 = (substitute(strBuilder, i17, length2, arrayList) + length2) - (i29 - i17);
                                    i29 += iSubstitute2;
                                    i18 += iSubstitute2;
                                    i19 += iSubstitute2;
                                    cArr = strBuilder.buffer;
                                    i24 = i16;
                                }
                                i17 = i29;
                                arrayList.remove(arrayList.size() - 1);
                                arrayList = arrayList;
                                break;
                            }
                            i28--;
                            i27 += iIsMatch3;
                            variablePrefixMatcher = variablePrefixMatcher;
                        }
                    } else {
                        i28++;
                        i27 += iIsMatch;
                    }
                }
            } else {
                i17++;
                strMatcher = variablePrefixMatcher;
                z14 = zIsEnableSubstitutionInVariables;
                arrayList = arrayList;
            }
            variableSuffixMatcher = variableSuffixMatcher;
            escapeChar = escapeChar;
            zIsEnableSubstitutionInVariables = z14;
            variablePrefixMatcher = strMatcher;
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
        if (!StringUtils.isEmpty(str)) {
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
        if (str != null) {
            return setVariablePrefixMatcher(StrMatcher.stringMatcher(str));
        }
        h.s("Variable prefix must not be null.");
        return null;
    }

    public StrSubstitutor setVariablePrefixMatcher(StrMatcher strMatcher) {
        if (strMatcher != null) {
            this.prefixMatcher = strMatcher;
            return this;
        }
        h.s("Variable prefix matcher must not be null.");
        return null;
    }

    public void setVariableResolver(StrLookup<?> strLookup) {
        this.variableResolver = strLookup;
    }

    public StrSubstitutor setVariableSuffix(String str) {
        if (str != null) {
            return setVariableSuffixMatcher(StrMatcher.stringMatcher(str));
        }
        h.s("Variable suffix must not be null.");
        return null;
    }

    public StrSubstitutor setVariableSuffixMatcher(StrMatcher strMatcher) {
        if (strMatcher != null) {
            this.suffixMatcher = strMatcher;
            return this;
        }
        h.s("Variable suffix matcher must not be null.");
        return null;
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

    public StrSubstitutor(StrLookup<?> strLookup, StrMatcher strMatcher, StrMatcher strMatcher2, char c14) {
        this(strLookup, strMatcher, strMatcher2, c14, DEFAULT_VALUE_DELIMITER);
    }

    public StrSubstitutor(StrLookup<?> strLookup, StrMatcher strMatcher, StrMatcher strMatcher2, char c14, StrMatcher strMatcher3) {
        setVariableResolver(strLookup);
        setVariablePrefixMatcher(strMatcher);
        setVariableSuffixMatcher(strMatcher2);
        setEscapeChar(c14);
        setValueDelimiterMatcher(strMatcher3);
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
