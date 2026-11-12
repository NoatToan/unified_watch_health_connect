package org.apache.commons.text;

import c22.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class StrTokenizer implements ListIterator<String>, Cloneable {
    private static final StrTokenizer CSV_TOKENIZER_PROTOTYPE;
    private static final StrTokenizer TSV_TOKENIZER_PROTOTYPE;
    private char[] chars;
    private StrMatcher delimMatcher;
    private boolean emptyAsNull;
    private boolean ignoreEmptyTokens;
    private StrMatcher ignoredMatcher;
    private StrMatcher quoteMatcher;
    private int tokenPos;
    private String[] tokens;
    private StrMatcher trimmerMatcher;

    static {
        StrTokenizer strTokenizer = new StrTokenizer();
        CSV_TOKENIZER_PROTOTYPE = strTokenizer;
        strTokenizer.setDelimiterMatcher(StrMatcher.commaMatcher());
        strTokenizer.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        strTokenizer.setIgnoredMatcher(StrMatcher.noneMatcher());
        strTokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());
        strTokenizer.setEmptyTokenAsNull(false);
        strTokenizer.setIgnoreEmptyTokens(false);
        StrTokenizer strTokenizer2 = new StrTokenizer();
        TSV_TOKENIZER_PROTOTYPE = strTokenizer2;
        strTokenizer2.setDelimiterMatcher(StrMatcher.tabMatcher());
        strTokenizer2.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        strTokenizer2.setIgnoredMatcher(StrMatcher.noneMatcher());
        strTokenizer2.setTrimmerMatcher(StrMatcher.trimMatcher());
        strTokenizer2.setEmptyTokenAsNull(false);
        strTokenizer2.setIgnoreEmptyTokens(false);
    }

    public StrTokenizer(char[] cArr) {
        this.delimMatcher = StrMatcher.splitMatcher();
        this.quoteMatcher = StrMatcher.noneMatcher();
        this.ignoredMatcher = StrMatcher.noneMatcher();
        this.trimmerMatcher = StrMatcher.noneMatcher();
        this.emptyAsNull = false;
        this.ignoreEmptyTokens = true;
        if (cArr == null) {
            this.chars = null;
        } else {
            this.chars = (char[]) cArr.clone();
        }
    }

    private void addToken(List<String> list, String str) {
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

    private void checkTokenized() {
        if (this.tokens == null) {
            char[] cArr = this.chars;
            if (cArr == null) {
                List<String> list = tokenize(null, 0, 0);
                this.tokens = (String[]) list.toArray(new String[list.size()]);
            } else {
                List<String> list2 = tokenize(cArr, 0, cArr.length);
                this.tokens = (String[]) list2.toArray(new String[list2.size()]);
            }
        }
    }

    private static StrTokenizer getCSVClone() {
        return (StrTokenizer) CSV_TOKENIZER_PROTOTYPE.clone();
    }

    public static StrTokenizer getCSVInstance(String str) {
        StrTokenizer cSVClone = getCSVClone();
        cSVClone.reset(str);
        return cSVClone;
    }

    private static StrTokenizer getTSVClone() {
        return (StrTokenizer) TSV_TOKENIZER_PROTOTYPE.clone();
    }

    public static StrTokenizer getTSVInstance(String str) {
        StrTokenizer tSVClone = getTSVClone();
        tSVClone.reset(str);
        return tSVClone;
    }

    private boolean isQuote(char[] cArr, int i14, int i15, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i14 + i18;
            if (i19 >= i15 || cArr[i19] != cArr[i16 + i18]) {
                return false;
            }
        }
        return true;
    }

    private int readNextToken(char[] cArr, int i14, int i15, StrBuilder strBuilder, List<String> list) {
        int i16 = i14;
        while (i16 < i15) {
            int iMax = Math.max(getIgnoredMatcher().isMatch(cArr, i16, i16, i15), getTrimmerMatcher().isMatch(cArr, i16, i16, i15));
            if (iMax == 0 || getDelimiterMatcher().isMatch(cArr, i16, i16, i15) > 0 || getQuoteMatcher().isMatch(cArr, i16, i16, i15) > 0) {
                break;
            }
            i16 += iMax;
        }
        if (i16 >= i15) {
            addToken(list, "");
            return -1;
        }
        int iIsMatch = getDelimiterMatcher().isMatch(cArr, i16, i16, i15);
        if (iIsMatch > 0) {
            addToken(list, "");
            return i16 + iIsMatch;
        }
        int iIsMatch2 = getQuoteMatcher().isMatch(cArr, i16, i16, i15);
        if (iIsMatch2 <= 0) {
            return readWithQuotes(cArr, i16, i15, strBuilder, list, 0, 0);
        }
        int i17 = i16;
        return readWithQuotes(cArr, i17 + iIsMatch2, i15, strBuilder, list, i17, iIsMatch2);
    }

    private int readWithQuotes(char[] cArr, int i14, int i15, StrBuilder strBuilder, List<String> list, int i16, int i17) {
        int i18;
        int i19 = i15;
        strBuilder.clear();
        boolean z14 = i17 > 0;
        int i24 = i14;
        int size = 0;
        while (i24 < i19) {
            if (z14) {
                int i25 = i24;
                if (isQuote(cArr, i24, i19, i16, i17)) {
                    i24 = i25 + i17;
                    i19 = i15;
                    if (isQuote(cArr, i24, i19, i16, i17)) {
                        strBuilder.append(cArr, i25, i17);
                        i24 = (i17 * 2) + i25;
                        size = strBuilder.size();
                    } else {
                        z14 = false;
                    }
                } else {
                    i19 = i15;
                    i24 = i25 + 1;
                    strBuilder.append(cArr[i25]);
                    size = strBuilder.size();
                }
            } else {
                int i26 = i24;
                int iIsMatch = getDelimiterMatcher().isMatch(cArr, i26, i14, i19);
                if (iIsMatch > 0) {
                    addToken(list, strBuilder.substring(0, size));
                    return iIsMatch + i26;
                }
                if (i17 > 0) {
                    i18 = i26;
                    if (isQuote(cArr, i18, i19, i16, i17)) {
                        i24 = i18 + i17;
                        z14 = true;
                    }
                } else {
                    i18 = i26;
                }
                int iIsMatch2 = getIgnoredMatcher().isMatch(cArr, i18, i14, i19);
                if (iIsMatch2 <= 0) {
                    iIsMatch2 = getTrimmerMatcher().isMatch(cArr, i18, i14, i19);
                    if (iIsMatch2 > 0) {
                        strBuilder.append(cArr, i18, iIsMatch2);
                    } else {
                        strBuilder.append(cArr[i18]);
                        size = strBuilder.size();
                        i24 = i18 + 1;
                    }
                }
                i24 = i18 + iIsMatch2;
            }
        }
        addToken(list, strBuilder.substring(0, size));
        return -1;
    }

    @Override // java.util.ListIterator
    public void add(String str) {
        throw new UnsupportedOperationException("add() is unsupported");
    }

    public Object clone() {
        try {
            return cloneReset();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Object cloneReset() {
        StrTokenizer strTokenizer = (StrTokenizer) super.clone();
        char[] cArr = strTokenizer.chars;
        if (cArr != null) {
            strTokenizer.chars = (char[]) cArr.clone();
        }
        strTokenizer.reset();
        return strTokenizer;
    }

    public String getContent() {
        char[] cArr = this.chars;
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    public StrMatcher getDelimiterMatcher() {
        return this.delimMatcher;
    }

    public StrMatcher getIgnoredMatcher() {
        return this.ignoredMatcher;
    }

    public StrMatcher getQuoteMatcher() {
        return this.quoteMatcher;
    }

    public String[] getTokenArray() {
        checkTokenized();
        return (String[]) this.tokens.clone();
    }

    public List<String> getTokenList() {
        checkTokenized();
        ArrayList arrayList = new ArrayList(this.tokens.length);
        Collections.addAll(arrayList, this.tokens);
        return arrayList;
    }

    public StrMatcher getTrimmerMatcher() {
        return this.trimmerMatcher;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        checkTokenized();
        return this.tokenPos < this.tokens.length;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        checkTokenized();
        return this.tokenPos > 0;
    }

    public boolean isEmptyTokenAsNull() {
        return this.emptyAsNull;
    }

    public boolean isIgnoreEmptyTokens() {
        return this.ignoreEmptyTokens;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public String next() {
        if (!hasNext()) {
            t.g();
            return null;
        }
        String[] strArr = this.tokens;
        int i14 = this.tokenPos;
        this.tokenPos = i14 + 1;
        return strArr[i14];
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.tokenPos;
    }

    public String nextToken() {
        if (!hasNext()) {
            return null;
        }
        String[] strArr = this.tokens;
        int i14 = this.tokenPos;
        this.tokenPos = i14 + 1;
        return strArr[i14];
    }

    @Override // java.util.ListIterator
    public String previous() {
        if (!hasPrevious()) {
            t.g();
            return null;
        }
        String[] strArr = this.tokens;
        int i14 = this.tokenPos - 1;
        this.tokenPos = i14;
        return strArr[i14];
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.tokenPos - 1;
    }

    public String previousToken() {
        if (!hasPrevious()) {
            return null;
        }
        String[] strArr = this.tokens;
        int i14 = this.tokenPos - 1;
        this.tokenPos = i14;
        return strArr[i14];
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is unsupported");
    }

    public StrTokenizer reset(char[] cArr) {
        reset();
        if (cArr != null) {
            this.chars = (char[]) cArr.clone();
            return this;
        }
        this.chars = null;
        return this;
    }

    @Override // java.util.ListIterator
    public void set(String str) {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    public StrTokenizer setDelimiterChar(char c14) {
        return setDelimiterMatcher(StrMatcher.charMatcher(c14));
    }

    public StrTokenizer setDelimiterMatcher(StrMatcher strMatcher) {
        if (strMatcher == null) {
            this.delimMatcher = StrMatcher.noneMatcher();
            return this;
        }
        this.delimMatcher = strMatcher;
        return this;
    }

    public StrTokenizer setDelimiterString(String str) {
        return setDelimiterMatcher(StrMatcher.stringMatcher(str));
    }

    public StrTokenizer setEmptyTokenAsNull(boolean z14) {
        this.emptyAsNull = z14;
        return this;
    }

    public StrTokenizer setIgnoreEmptyTokens(boolean z14) {
        this.ignoreEmptyTokens = z14;
        return this;
    }

    public StrTokenizer setIgnoredChar(char c14) {
        return setIgnoredMatcher(StrMatcher.charMatcher(c14));
    }

    public StrTokenizer setIgnoredMatcher(StrMatcher strMatcher) {
        if (strMatcher != null) {
            this.ignoredMatcher = strMatcher;
        }
        return this;
    }

    public StrTokenizer setQuoteChar(char c14) {
        return setQuoteMatcher(StrMatcher.charMatcher(c14));
    }

    public StrTokenizer setQuoteMatcher(StrMatcher strMatcher) {
        if (strMatcher != null) {
            this.quoteMatcher = strMatcher;
        }
        return this;
    }

    public StrTokenizer setTrimmerMatcher(StrMatcher strMatcher) {
        if (strMatcher != null) {
            this.trimmerMatcher = strMatcher;
        }
        return this;
    }

    public int size() {
        checkTokenized();
        return this.tokens.length;
    }

    public String toString() {
        if (this.tokens == null) {
            return "StrTokenizer[not tokenized yet]";
        }
        return "StrTokenizer" + getTokenList();
    }

    public List<String> tokenize(char[] cArr, int i14, int i15) {
        if (cArr == null || i15 == 0) {
            return Collections.EMPTY_LIST;
        }
        StrBuilder strBuilder = new StrBuilder();
        ArrayList arrayList = new ArrayList();
        int nextToken = i14;
        while (nextToken >= 0 && nextToken < i15) {
            char[] cArr2 = cArr;
            int i16 = i15;
            nextToken = readNextToken(cArr2, nextToken, i16, strBuilder, arrayList);
            if (nextToken >= i16) {
                addToken(arrayList, "");
            }
            cArr = cArr2;
            i15 = i16;
        }
        return arrayList;
    }

    public static StrTokenizer getCSVInstance() {
        return getCSVClone();
    }

    public static StrTokenizer getTSVInstance() {
        return getTSVClone();
    }

    public static StrTokenizer getCSVInstance(char[] cArr) {
        StrTokenizer cSVClone = getCSVClone();
        cSVClone.reset(cArr);
        return cSVClone;
    }

    public static StrTokenizer getTSVInstance(char[] cArr) {
        StrTokenizer tSVClone = getTSVClone();
        tSVClone.reset(cArr);
        return tSVClone;
    }

    public StrTokenizer reset(String str) {
        reset();
        if (str != null) {
            this.chars = str.toCharArray();
            return this;
        }
        this.chars = null;
        return this;
    }

    public StrTokenizer reset() {
        this.tokenPos = 0;
        this.tokens = null;
        return this;
    }

    public StrTokenizer(String str) {
        this.delimMatcher = StrMatcher.splitMatcher();
        this.quoteMatcher = StrMatcher.noneMatcher();
        this.ignoredMatcher = StrMatcher.noneMatcher();
        this.trimmerMatcher = StrMatcher.noneMatcher();
        this.emptyAsNull = false;
        this.ignoreEmptyTokens = true;
        if (str != null) {
            this.chars = str.toCharArray();
        } else {
            this.chars = null;
        }
    }

    public StrTokenizer(String str, char c14) {
        this(str);
        setDelimiterChar(c14);
    }

    public StrTokenizer(String str, String str2) {
        this(str);
        setDelimiterString(str2);
    }

    public StrTokenizer(String str, StrMatcher strMatcher) {
        this(str);
        setDelimiterMatcher(strMatcher);
    }

    public StrTokenizer(String str, char c14, char c15) {
        this(str, c14);
        setQuoteChar(c15);
    }

    public StrTokenizer(String str, StrMatcher strMatcher, StrMatcher strMatcher2) {
        this(str, strMatcher);
        setQuoteMatcher(strMatcher2);
    }

    public StrTokenizer() {
        this.delimMatcher = StrMatcher.splitMatcher();
        this.quoteMatcher = StrMatcher.noneMatcher();
        this.ignoredMatcher = StrMatcher.noneMatcher();
        this.trimmerMatcher = StrMatcher.noneMatcher();
        this.emptyAsNull = false;
        this.ignoreEmptyTokens = true;
        this.chars = null;
    }

    public StrTokenizer(char[] cArr, char c14) {
        this(cArr);
        setDelimiterChar(c14);
    }

    public StrTokenizer(char[] cArr, String str) {
        this(cArr);
        setDelimiterString(str);
    }

    public StrTokenizer(char[] cArr, StrMatcher strMatcher) {
        this(cArr);
        setDelimiterMatcher(strMatcher);
    }

    public StrTokenizer(char[] cArr, char c14, char c15) {
        this(cArr, c14);
        setQuoteChar(c15);
    }

    public StrTokenizer(char[] cArr, StrMatcher strMatcher, StrMatcher strMatcher2) {
        this(cArr, strMatcher);
        setQuoteMatcher(strMatcher2);
    }
}
