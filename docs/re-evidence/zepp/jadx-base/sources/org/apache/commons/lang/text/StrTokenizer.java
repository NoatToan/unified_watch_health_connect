package org.apache.commons.lang.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes23.dex */
public class StrTokenizer implements ListIterator, Cloneable {
    private static final StrTokenizer j;
    private static final StrTokenizer k;
    private char[] a;
    private String[] b;
    private int c;
    private StrMatcher d;
    private StrMatcher e;
    private StrMatcher f;
    private StrMatcher g;
    private boolean h;
    private boolean i;

    static {
        StrTokenizer strTokenizer = new StrTokenizer();
        j = strTokenizer;
        strTokenizer.setDelimiterMatcher(StrMatcher.commaMatcher());
        strTokenizer.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        strTokenizer.setIgnoredMatcher(StrMatcher.noneMatcher());
        strTokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());
        strTokenizer.setEmptyTokenAsNull(false);
        strTokenizer.setIgnoreEmptyTokens(false);
        StrTokenizer strTokenizer2 = new StrTokenizer();
        k = strTokenizer2;
        strTokenizer2.setDelimiterMatcher(StrMatcher.tabMatcher());
        strTokenizer2.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        strTokenizer2.setIgnoredMatcher(StrMatcher.noneMatcher());
        strTokenizer2.setTrimmerMatcher(StrMatcher.trimMatcher());
        strTokenizer2.setEmptyTokenAsNull(false);
        strTokenizer2.setIgnoreEmptyTokens(false);
    }

    public StrTokenizer() {
        this.d = StrMatcher.splitMatcher();
        this.e = StrMatcher.noneMatcher();
        this.f = StrMatcher.noneMatcher();
        this.g = StrMatcher.noneMatcher();
        this.h = false;
        this.i = true;
        this.a = null;
    }

    private void a(List list, String str) {
        if (str == null || str.length() == 0) {
            if (isIgnoreEmptyTokens()) {
                return;
            }
            if (isEmptyTokenAsNull()) {
                str = null;
            }
        }
        list.add(str);
    }

    private void b() {
        if (this.b == null) {
            char[] cArr = this.a;
            if (cArr == null) {
                List list = tokenize(null, 0, 0);
                this.b = (String[]) list.toArray(new String[list.size()]);
            } else {
                List list2 = tokenize(cArr, 0, cArr.length);
                this.b = (String[]) list2.toArray(new String[list2.size()]);
            }
        }
    }

    private static StrTokenizer d() {
        return (StrTokenizer) j.clone();
    }

    private static StrTokenizer e() {
        return (StrTokenizer) k.clone();
    }

    private boolean f(char[] cArr, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i + i5;
            if (i6 >= i2 || cArr[i6] != cArr[i3 + i5]) {
                return false;
            }
        }
        return true;
    }

    private int g(char[] cArr, int i, int i2, StrBuilder strBuilder, List list) {
        while (i < i2) {
            int iMax = Math.max(getIgnoredMatcher().isMatch(cArr, i, i, i2), getTrimmerMatcher().isMatch(cArr, i, i, i2));
            if (iMax == 0 || getDelimiterMatcher().isMatch(cArr, i, i, i2) > 0 || getQuoteMatcher().isMatch(cArr, i, i, i2) > 0) {
                break;
            }
            i += iMax;
        }
        if (i >= i2) {
            a(list, "");
            return -1;
        }
        int iIsMatch = getDelimiterMatcher().isMatch(cArr, i, i, i2);
        if (iIsMatch > 0) {
            a(list, "");
            return i + iIsMatch;
        }
        int iIsMatch2 = getQuoteMatcher().isMatch(cArr, i, i, i2);
        return iIsMatch2 > 0 ? h(cArr, i + iIsMatch2, i2, strBuilder, list, i, iIsMatch2) : h(cArr, i, i2, strBuilder, list, 0, 0);
    }

    public static StrTokenizer getCSVInstance() {
        return d();
    }

    public static StrTokenizer getTSVInstance() {
        return e();
    }

    private int h(char[] cArr, int i, int i2, StrBuilder strBuilder, List list, int i3, int i4) {
        strBuilder.clear();
        boolean z = i4 > 0;
        int i5 = i;
        int size = 0;
        while (i5 < i2) {
            if (z) {
                int i6 = size;
                int i7 = i5;
                if (f(cArr, i5, i2, i3, i4)) {
                    int i8 = i7 + i4;
                    if (f(cArr, i8, i2, i3, i4)) {
                        strBuilder.append(cArr, i7, i4);
                        i5 = i7 + (i4 * 2);
                        size = strBuilder.size();
                    } else {
                        size = i6;
                        i5 = i8;
                        z = false;
                    }
                } else {
                    i5 = i7 + 1;
                    strBuilder.append(cArr[i7]);
                    size = strBuilder.size();
                }
            } else {
                int i9 = size;
                int i10 = i5;
                int iIsMatch = getDelimiterMatcher().isMatch(cArr, i10, i, i2);
                if (iIsMatch > 0) {
                    a(list, strBuilder.substring(0, i9));
                    return i10 + iIsMatch;
                }
                if (i4 <= 0 || !f(cArr, i10, i2, i3, i4)) {
                    int iIsMatch2 = getIgnoredMatcher().isMatch(cArr, i10, i, i2);
                    if (iIsMatch2 <= 0) {
                        iIsMatch2 = getTrimmerMatcher().isMatch(cArr, i10, i, i2);
                        if (iIsMatch2 > 0) {
                            strBuilder.append(cArr, i10, iIsMatch2);
                        } else {
                            i5 = i10 + 1;
                            strBuilder.append(cArr[i10]);
                            size = strBuilder.size();
                        }
                    }
                    i5 = i10 + iIsMatch2;
                    size = i9;
                } else {
                    i5 = i10 + i4;
                    size = i9;
                    z = true;
                }
            }
        }
        a(list, strBuilder.substring(0, size));
        return -1;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("add() is unsupported");
    }

    public Object c() throws CloneNotSupportedException {
        StrTokenizer strTokenizer = (StrTokenizer) super.clone();
        char[] cArr = strTokenizer.a;
        if (cArr != null) {
            strTokenizer.a = (char[]) cArr.clone();
        }
        strTokenizer.reset();
        return strTokenizer;
    }

    public Object clone() {
        try {
            return c();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String getContent() {
        char[] cArr = this.a;
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    public StrMatcher getDelimiterMatcher() {
        return this.d;
    }

    public StrMatcher getIgnoredMatcher() {
        return this.f;
    }

    public StrMatcher getQuoteMatcher() {
        return this.e;
    }

    public String[] getTokenArray() {
        b();
        return (String[]) this.b.clone();
    }

    public List getTokenList() {
        b();
        ArrayList arrayList = new ArrayList(this.b.length);
        int i = 0;
        while (true) {
            String[] strArr = this.b;
            if (i >= strArr.length) {
                return arrayList;
            }
            arrayList.add(strArr[i]);
            i++;
        }
    }

    public StrMatcher getTrimmerMatcher() {
        return this.g;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        b();
        return this.c < this.b.length;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        b();
        return this.c > 0;
    }

    public boolean isEmptyTokenAsNull() {
        return this.h;
    }

    public boolean isIgnoreEmptyTokens() {
        return this.i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String[] strArr = this.b;
        int i = this.c;
        this.c = i + 1;
        return strArr[i];
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.c;
    }

    public String nextToken() {
        if (!hasNext()) {
            return null;
        }
        String[] strArr = this.b;
        int i = this.c;
        this.c = i + 1;
        return strArr[i];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        String[] strArr = this.b;
        int i = this.c - 1;
        this.c = i;
        return strArr[i];
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.c - 1;
    }

    public String previousToken() {
        if (!hasPrevious()) {
            return null;
        }
        String[] strArr = this.b;
        int i = this.c - 1;
        this.c = i;
        return strArr[i];
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is unsupported");
    }

    public StrTokenizer reset() {
        this.c = 0;
        this.b = null;
        return this;
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    public StrTokenizer setDelimiterChar(char c) {
        return setDelimiterMatcher(StrMatcher.charMatcher(c));
    }

    public StrTokenizer setDelimiterMatcher(StrMatcher strMatcher) {
        if (strMatcher == null) {
            this.d = StrMatcher.noneMatcher();
        } else {
            this.d = strMatcher;
        }
        return this;
    }

    public StrTokenizer setDelimiterString(String str) {
        return setDelimiterMatcher(StrMatcher.stringMatcher(str));
    }

    public StrTokenizer setEmptyTokenAsNull(boolean z) {
        this.h = z;
        return this;
    }

    public StrTokenizer setIgnoreEmptyTokens(boolean z) {
        this.i = z;
        return this;
    }

    public StrTokenizer setIgnoredChar(char c) {
        return setIgnoredMatcher(StrMatcher.charMatcher(c));
    }

    public StrTokenizer setIgnoredMatcher(StrMatcher strMatcher) {
        if (strMatcher != null) {
            this.f = strMatcher;
        }
        return this;
    }

    public StrTokenizer setQuoteChar(char c) {
        return setQuoteMatcher(StrMatcher.charMatcher(c));
    }

    public StrTokenizer setQuoteMatcher(StrMatcher strMatcher) {
        if (strMatcher != null) {
            this.e = strMatcher;
        }
        return this;
    }

    public StrTokenizer setTrimmerMatcher(StrMatcher strMatcher) {
        if (strMatcher != null) {
            this.g = strMatcher;
        }
        return this;
    }

    public int size() {
        b();
        return this.b.length;
    }

    public String toString() {
        if (this.b == null) {
            return "StrTokenizer[not tokenized yet]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("StrTokenizer");
        stringBuffer.append(getTokenList());
        return stringBuffer.toString();
    }

    public List tokenize(char[] cArr, int i, int i2) {
        if (cArr == null || i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        StrBuilder strBuilder = new StrBuilder();
        ArrayList arrayList = new ArrayList();
        int iG = i;
        while (iG >= 0 && iG < i2) {
            iG = g(cArr, iG, i2, strBuilder, arrayList);
            if (iG >= i2) {
                a(arrayList, "");
            }
        }
        return arrayList;
    }

    public static StrTokenizer getCSVInstance(String str) {
        StrTokenizer strTokenizerD = d();
        strTokenizerD.reset(str);
        return strTokenizerD;
    }

    public static StrTokenizer getTSVInstance(String str) {
        StrTokenizer strTokenizerE = e();
        strTokenizerE.reset(str);
        return strTokenizerE;
    }

    public StrTokenizer reset(String str) {
        reset();
        if (str != null) {
            this.a = str.toCharArray();
        } else {
            this.a = null;
        }
        return this;
    }

    public static StrTokenizer getCSVInstance(char[] cArr) {
        StrTokenizer strTokenizerD = d();
        strTokenizerD.reset(cArr);
        return strTokenizerD;
    }

    public static StrTokenizer getTSVInstance(char[] cArr) {
        StrTokenizer strTokenizerE = e();
        strTokenizerE.reset(cArr);
        return strTokenizerE;
    }

    public StrTokenizer reset(char[] cArr) {
        reset();
        this.a = cArr;
        return this;
    }

    public StrTokenizer(String str) {
        this.d = StrMatcher.splitMatcher();
        this.e = StrMatcher.noneMatcher();
        this.f = StrMatcher.noneMatcher();
        this.g = StrMatcher.noneMatcher();
        this.h = false;
        this.i = true;
        if (str != null) {
            this.a = str.toCharArray();
        } else {
            this.a = null;
        }
    }

    public StrTokenizer(String str, char c) {
        this(str);
        setDelimiterChar(c);
    }

    public StrTokenizer(String str, String str2) {
        this(str);
        setDelimiterString(str2);
    }

    public StrTokenizer(String str, StrMatcher strMatcher) {
        this(str);
        setDelimiterMatcher(strMatcher);
    }

    public StrTokenizer(String str, char c, char c2) {
        this(str, c);
        setQuoteChar(c2);
    }

    public StrTokenizer(String str, StrMatcher strMatcher, StrMatcher strMatcher2) {
        this(str, strMatcher);
        setQuoteMatcher(strMatcher2);
    }

    public StrTokenizer(char[] cArr) {
        this.d = StrMatcher.splitMatcher();
        this.e = StrMatcher.noneMatcher();
        this.f = StrMatcher.noneMatcher();
        this.g = StrMatcher.noneMatcher();
        this.h = false;
        this.i = true;
        this.a = cArr;
    }

    public StrTokenizer(char[] cArr, char c) {
        this(cArr);
        setDelimiterChar(c);
    }

    public StrTokenizer(char[] cArr, String str) {
        this(cArr);
        setDelimiterString(str);
    }

    public StrTokenizer(char[] cArr, StrMatcher strMatcher) {
        this(cArr);
        setDelimiterMatcher(strMatcher);
    }

    public StrTokenizer(char[] cArr, char c, char c2) {
        this(cArr, c);
        setQuoteChar(c2);
    }

    public StrTokenizer(char[] cArr, StrMatcher strMatcher, StrMatcher strMatcher2) {
        this(cArr, strMatcher);
        setQuoteMatcher(strMatcher2);
    }
}
