package org.apache.commons.lang.text;

import com.alipay.sdk.m.u.i;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes23.dex */
public class StrSubstitutor {
    public static final char DEFAULT_ESCAPE = '$';
    public static final StrMatcher DEFAULT_PREFIX = StrMatcher.stringMatcher("${");
    public static final StrMatcher DEFAULT_SUFFIX = StrMatcher.stringMatcher(i.d);
    private char a;
    private StrMatcher b;
    private StrMatcher c;
    private StrLookup d;
    private boolean e;

    public StrSubstitutor() {
        this((StrLookup) null, DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    private void a(String str, List list) {
        if (list.contains(str)) {
            StrBuilder strBuilder = new StrBuilder(256);
            strBuilder.append("Infinite loop in property interpolation of ");
            strBuilder.append(list.remove(0));
            strBuilder.append(": ");
            strBuilder.appendWithSeparators(list, "->");
            throw new IllegalStateException(strBuilder.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0074 A[SYNTHETIC] */
    private int b(StrBuilder strBuilder, int i, int i2, List list) {
        int i3;
        int i4;
        int i5;
        StrMatcher strMatcher;
        StrMatcher strMatcher2;
        int iIsMatch;
        String str;
        int i6;
        String strResolveVariable;
        int iIsMatch2;
        StrMatcher variablePrefixMatcher = getVariablePrefixMatcher();
        StrMatcher variableSuffixMatcher = getVariableSuffixMatcher();
        char escapeChar = getEscapeChar();
        boolean z = list == null;
        int i7 = i;
        int i8 = i + i2;
        int i9 = 0;
        int i10 = 0;
        char[] cArr = strBuilder.buffer;
        List arrayList = list;
        while (i7 < i8) {
            int iIsMatch3 = variablePrefixMatcher.isMatch(cArr, i7, i, i8);
            if (iIsMatch3 != 0) {
                if (i7 <= i) {
                    i3 = i7 + iIsMatch3;
                    i4 = i3;
                    i5 = 0;
                    while (true) {
                        if (i4 < i8) {
                            strMatcher = variablePrefixMatcher;
                            strMatcher2 = variableSuffixMatcher;
                            i7 = i4;
                            break;
                            break;
                        }
                        if (isEnableSubstitutionInVariables()) {
                        }
                        iIsMatch = variableSuffixMatcher.isMatch(cArr, i4, i, i8);
                        if (iIsMatch == 0) {
                            i4++;
                        } else {
                            if (i5 == 0) {
                                strMatcher = variablePrefixMatcher;
                                strMatcher2 = variableSuffixMatcher;
                                str = new String(cArr, i3, (i4 - i7) - iIsMatch3);
                                if (isEnableSubstitutionInVariables()) {
                                    StrBuilder strBuilder2 = new StrBuilder(str);
                                    substitute(strBuilder2, 0, strBuilder2.length());
                                    str = strBuilder2.toString();
                                }
                                i6 = i4 + iIsMatch;
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    arrayList.add(new String(cArr, i, i2));
                                }
                                a(str, arrayList);
                                arrayList.add(str);
                                strResolveVariable = resolveVariable(str, strBuilder, i7, i6);
                                if (strResolveVariable != null) {
                                    int length = strResolveVariable.length();
                                    strBuilder.replace(i7, i6, strResolveVariable);
                                    int iB = b(strBuilder, i7, length, arrayList) + (length - (i6 - i7));
                                    i8 += iB;
                                    i9 += iB;
                                    cArr = strBuilder.buffer;
                                    i7 = i6 + iB;
                                    i10 = 1;
                                } else {
                                    i7 = i6;
                                }
                                arrayList.remove(arrayList.size() - 1);
                                break;
                                break;
                            }
                            i5--;
                            i4 += iIsMatch;
                            variablePrefixMatcher = variablePrefixMatcher;
                            variableSuffixMatcher = variableSuffixMatcher;
                        }
                    }
                } else {
                    int i11 = i7 - 1;
                    if (cArr[i11] != escapeChar) {
                        i3 = i7 + iIsMatch3;
                        i4 = i3;
                        i5 = 0;
                        while (true) {
                            if (i4 < i8) {
                                strMatcher = variablePrefixMatcher;
                                strMatcher2 = variableSuffixMatcher;
                                i7 = i4;
                                break;
                            }
                            if (isEnableSubstitutionInVariables() || (iIsMatch2 = variablePrefixMatcher.isMatch(cArr, i4, i, i8)) == 0) {
                                iIsMatch = variableSuffixMatcher.isMatch(cArr, i4, i, i8);
                                if (iIsMatch == 0) {
                                    i4++;
                                } else {
                                    if (i5 == 0) {
                                        strMatcher = variablePrefixMatcher;
                                        strMatcher2 = variableSuffixMatcher;
                                        str = new String(cArr, i3, (i4 - i7) - iIsMatch3);
                                        if (isEnableSubstitutionInVariables()) {
                                            StrBuilder strBuilder3 = new StrBuilder(str);
                                            substitute(strBuilder3, 0, strBuilder3.length());
                                            str = strBuilder3.toString();
                                        }
                                        i6 = i4 + iIsMatch;
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            arrayList.add(new String(cArr, i, i2));
                                        }
                                        a(str, arrayList);
                                        arrayList.add(str);
                                        strResolveVariable = resolveVariable(str, strBuilder, i7, i6);
                                        if (strResolveVariable != null) {
                                            int length2 = strResolveVariable.length();
                                            strBuilder.replace(i7, i6, strResolveVariable);
                                            int iB2 = b(strBuilder, i7, length2, arrayList) + (length2 - (i6 - i7));
                                            i8 += iB2;
                                            i9 += iB2;
                                            cArr = strBuilder.buffer;
                                            i7 = i6 + iB2;
                                            i10 = 1;
                                        } else {
                                            i7 = i6;
                                        }
                                        arrayList.remove(arrayList.size() - 1);
                                        break;
                                    }
                                    i5--;
                                    i4 += iIsMatch;
                                    variablePrefixMatcher = variablePrefixMatcher;
                                    variableSuffixMatcher = variableSuffixMatcher;
                                }
                            } else {
                                i5++;
                                i4 += iIsMatch2;
                            }
                        }
                    } else {
                        strBuilder.deleteCharAt(i11);
                        i9--;
                        i8--;
                        strMatcher = variablePrefixMatcher;
                        strMatcher2 = variableSuffixMatcher;
                        cArr = strBuilder.buffer;
                        i10 = 1;
                    }
                }
            } else {
                i7++;
                strMatcher = variablePrefixMatcher;
                strMatcher2 = variableSuffixMatcher;
            }
            variablePrefixMatcher = strMatcher;
            variableSuffixMatcher = strMatcher2;
        }
        return z ? i10 : i9;
    }

    public static String replace(Object obj, Map map) {
        return new StrSubstitutor(map).replace(obj);
    }

    public static String replaceSystemProperties(Object obj) {
        return new StrSubstitutor(StrLookup.systemPropertiesLookup()).replace(obj);
    }

    public char getEscapeChar() {
        return this.a;
    }

    public StrMatcher getVariablePrefixMatcher() {
        return this.b;
    }

    public StrLookup getVariableResolver() {
        return this.d;
    }

    public StrMatcher getVariableSuffixMatcher() {
        return this.c;
    }

    public boolean isEnableSubstitutionInVariables() {
        return this.e;
    }

    public boolean replaceIn(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return false;
        }
        return replaceIn(stringBuffer, 0, stringBuffer.length());
    }

    public String resolveVariable(String str, StrBuilder strBuilder, int i, int i2) {
        StrLookup variableResolver = getVariableResolver();
        if (variableResolver == null) {
            return null;
        }
        return variableResolver.lookup(str);
    }

    public void setEnableSubstitutionInVariables(boolean z) {
        this.e = z;
    }

    public void setEscapeChar(char c) {
        this.a = c;
    }

    public StrSubstitutor setVariablePrefix(char c) {
        return setVariablePrefixMatcher(StrMatcher.charMatcher(c));
    }

    public StrSubstitutor setVariablePrefixMatcher(StrMatcher strMatcher) {
        if (strMatcher == null) {
            throw new IllegalArgumentException("Variable prefix matcher must not be null!");
        }
        this.b = strMatcher;
        return this;
    }

    public void setVariableResolver(StrLookup strLookup) {
        this.d = strLookup;
    }

    public StrSubstitutor setVariableSuffix(char c) {
        return setVariableSuffixMatcher(StrMatcher.charMatcher(c));
    }

    public StrSubstitutor setVariableSuffixMatcher(StrMatcher strMatcher) {
        if (strMatcher == null) {
            throw new IllegalArgumentException("Variable suffix matcher must not be null!");
        }
        this.c = strMatcher;
        return this;
    }

    public boolean substitute(StrBuilder strBuilder, int i, int i2) {
        return b(strBuilder, i, i2, null) > 0;
    }

    public StrSubstitutor(Map map) {
        this(StrLookup.mapLookup(map), DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public static String replace(Object obj, Map map, String str, String str2) {
        return new StrSubstitutor(map, str, str2).replace(obj);
    }

    public boolean replaceIn(StringBuffer stringBuffer, int i, int i2) {
        if (stringBuffer == null) {
            return false;
        }
        StrBuilder strBuilderAppend = new StrBuilder(i2).append(stringBuffer, i, i2);
        if (!substitute(strBuilderAppend, 0, i2)) {
            return false;
        }
        stringBuffer.replace(i, i2 + i, strBuilderAppend.toString());
        return true;
    }

    public StrSubstitutor setVariablePrefix(String str) {
        if (str != null) {
            return setVariablePrefixMatcher(StrMatcher.stringMatcher(str));
        }
        throw new IllegalArgumentException("Variable prefix must not be null!");
    }

    public StrSubstitutor setVariableSuffix(String str) {
        if (str != null) {
            return setVariableSuffixMatcher(StrMatcher.stringMatcher(str));
        }
        throw new IllegalArgumentException("Variable suffix must not be null!");
    }

    public StrSubstitutor(Map map, String str, String str2) {
        this(StrLookup.mapLookup(map), str, str2, '$');
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

    public StrSubstitutor(Map map, String str, String str2, char c) {
        this(StrLookup.mapLookup(map), str, str2, c);
    }

    public StrSubstitutor(StrLookup strLookup) {
        this(strLookup, DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public boolean replaceIn(StrBuilder strBuilder) {
        if (strBuilder == null) {
            return false;
        }
        return substitute(strBuilder, 0, strBuilder.length());
    }

    public StrSubstitutor(StrLookup strLookup, String str, String str2, char c) {
        setVariableResolver(strLookup);
        setVariablePrefix(str);
        setVariableSuffix(str2);
        setEscapeChar(c);
    }

    public boolean replaceIn(StrBuilder strBuilder, int i, int i2) {
        if (strBuilder == null) {
            return false;
        }
        return substitute(strBuilder, i, i2);
    }

    public StrSubstitutor(StrLookup strLookup, StrMatcher strMatcher, StrMatcher strMatcher2, char c) {
        setVariableResolver(strLookup);
        setVariablePrefixMatcher(strMatcher);
        setVariableSuffixMatcher(strMatcher2);
        setEscapeChar(c);
    }

    public String replace(String str) {
        if (str == null) {
            return null;
        }
        StrBuilder strBuilder = new StrBuilder(str);
        return !substitute(strBuilder, 0, str.length()) ? str : strBuilder.toString();
    }

    public String replace(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(i2).append(str, i, i2);
        if (!substitute(strBuilderAppend, 0, i2)) {
            return str.substring(i, i2 + i);
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

    public String replace(char[] cArr, int i, int i2) {
        if (cArr == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(i2).append(cArr, i, i2);
        substitute(strBuilderAppend, 0, i2);
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

    public String replace(StringBuffer stringBuffer, int i, int i2) {
        if (stringBuffer == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(i2).append(stringBuffer, i, i2);
        substitute(strBuilderAppend, 0, i2);
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

    public String replace(StrBuilder strBuilder, int i, int i2) {
        if (strBuilder == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(i2).append(strBuilder, i, i2);
        substitute(strBuilderAppend, 0, i2);
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
}
