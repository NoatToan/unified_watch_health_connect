package org.apache.commons.text;

import c22.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.text.matcher.StringMatcher;
import org.apache.commons.text.matcher.StringMatcherFactory;

/* JADX INFO: loaded from: classes3.dex */
public class StringTokenizer implements ListIterator<String>, Cloneable {
    private static final StringTokenizer CSV_TOKENIZER_PROTOTYPE;
    private static final StringTokenizer TSV_TOKENIZER_PROTOTYPE;
    private char[] chars;
    private StringMatcher delimMatcher;
    private boolean emptyAsNull;
    private boolean ignoreEmptyTokens;
    private StringMatcher ignoredMatcher;
    private StringMatcher quoteMatcher;
    private int tokenPos;
    private String[] tokens;
    private StringMatcher trimmerMatcher;

    static {
        StringTokenizer stringTokenizer = new StringTokenizer();
        CSV_TOKENIZER_PROTOTYPE = stringTokenizer;
        StringMatcherFactory stringMatcherFactory = StringMatcherFactory.INSTANCE;
        stringTokenizer.setDelimiterMatcher(stringMatcherFactory.commaMatcher());
        stringTokenizer.setQuoteMatcher(stringMatcherFactory.doubleQuoteMatcher());
        stringTokenizer.setIgnoredMatcher(stringMatcherFactory.noneMatcher());
        stringTokenizer.setTrimmerMatcher(stringMatcherFactory.trimMatcher());
        stringTokenizer.setEmptyTokenAsNull(false);
        stringTokenizer.setIgnoreEmptyTokens(false);
        StringTokenizer stringTokenizer2 = new StringTokenizer();
        TSV_TOKENIZER_PROTOTYPE = stringTokenizer2;
        stringTokenizer2.setDelimiterMatcher(stringMatcherFactory.tabMatcher());
        stringTokenizer2.setQuoteMatcher(stringMatcherFactory.doubleQuoteMatcher());
        stringTokenizer2.setIgnoredMatcher(stringMatcherFactory.noneMatcher());
        stringTokenizer2.setTrimmerMatcher(stringMatcherFactory.trimMatcher());
        stringTokenizer2.setEmptyTokenAsNull(false);
        stringTokenizer2.setIgnoreEmptyTokens(false);
    }

    public StringTokenizer(char[] cArr) {
        StringMatcherFactory stringMatcherFactory = StringMatcherFactory.INSTANCE;
        this.delimMatcher = stringMatcherFactory.splitMatcher();
        this.quoteMatcher = stringMatcherFactory.noneMatcher();
        this.ignoredMatcher = stringMatcherFactory.noneMatcher();
        this.trimmerMatcher = stringMatcherFactory.noneMatcher();
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

    private static StringTokenizer getCSVClone() {
        return (StringTokenizer) CSV_TOKENIZER_PROTOTYPE.clone();
    }

    public static StringTokenizer getCSVInstance(String str) {
        StringTokenizer cSVClone = getCSVClone();
        cSVClone.reset(str);
        return cSVClone;
    }

    private static StringTokenizer getTSVClone() {
        return (StringTokenizer) TSV_TOKENIZER_PROTOTYPE.clone();
    }

    public static StringTokenizer getTSVInstance(String str) {
        StringTokenizer tSVClone = getTSVClone();
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

    private int readNextToken(char[] cArr, int i14, int i15, TextStringBuilder textStringBuilder, List<String> list) {
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
            return readWithQuotes(cArr, i16, i15, textStringBuilder, list, 0, 0);
        }
        int i17 = i16;
        return readWithQuotes(cArr, i17 + iIsMatch2, i15, textStringBuilder, list, i17, iIsMatch2);
    }

    private int readWithQuotes(char[] cArr, int i14, int i15, TextStringBuilder textStringBuilder, List<String> list, int i16, int i17) {
        int i18;
        int i19 = i15;
        textStringBuilder.clear();
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
                        textStringBuilder.append(cArr, i25, i17);
                        i24 = (i17 * 2) + i25;
                        size = textStringBuilder.size();
                    } else {
                        z14 = false;
                    }
                } else {
                    i19 = i15;
                    i24 = i25 + 1;
                    textStringBuilder.append(cArr[i25]);
                    size = textStringBuilder.size();
                }
            } else {
                int i26 = i24;
                int iIsMatch = getDelimiterMatcher().isMatch(cArr, i26, i14, i19);
                if (iIsMatch > 0) {
                    addToken(list, textStringBuilder.substring(0, size));
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
                        textStringBuilder.append(cArr, i18, iIsMatch2);
                    } else {
                        textStringBuilder.append(cArr[i18]);
                        size = textStringBuilder.size();
                        i24 = i18 + 1;
                    }
                }
                i24 = i18 + iIsMatch2;
            }
        }
        addToken(list, textStringBuilder.substring(0, size));
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
        StringTokenizer stringTokenizer = (StringTokenizer) super.clone();
        char[] cArr = stringTokenizer.chars;
        if (cArr != null) {
            stringTokenizer.chars = (char[]) cArr.clone();
        }
        stringTokenizer.reset();
        return stringTokenizer;
    }

    public String getContent() {
        char[] cArr = this.chars;
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    public StringMatcher getDelimiterMatcher() {
        return this.delimMatcher;
    }

    public StringMatcher getIgnoredMatcher() {
        return this.ignoredMatcher;
    }

    public StringMatcher getQuoteMatcher() {
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

    public StringMatcher getTrimmerMatcher() {
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

    public StringTokenizer reset(char[] cArr) {
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

    public StringTokenizer setDelimiterChar(char c14) {
        return setDelimiterMatcher(StringMatcherFactory.INSTANCE.charMatcher(c14));
    }

    public StringTokenizer setDelimiterMatcher(StringMatcher stringMatcher) {
        if (stringMatcher == null) {
            this.delimMatcher = StringMatcherFactory.INSTANCE.noneMatcher();
            return this;
        }
        this.delimMatcher = stringMatcher;
        return this;
    }

    public StringTokenizer setDelimiterString(String str) {
        return setDelimiterMatcher(StringMatcherFactory.INSTANCE.stringMatcher(str));
    }

    public StringTokenizer setEmptyTokenAsNull(boolean z14) {
        this.emptyAsNull = z14;
        return this;
    }

    public StringTokenizer setIgnoreEmptyTokens(boolean z14) {
        this.ignoreEmptyTokens = z14;
        return this;
    }

    public StringTokenizer setIgnoredChar(char c14) {
        return setIgnoredMatcher(StringMatcherFactory.INSTANCE.charMatcher(c14));
    }

    public StringTokenizer setIgnoredMatcher(StringMatcher stringMatcher) {
        if (stringMatcher != null) {
            this.ignoredMatcher = stringMatcher;
        }
        return this;
    }

    public StringTokenizer setQuoteChar(char c14) {
        return setQuoteMatcher(StringMatcherFactory.INSTANCE.charMatcher(c14));
    }

    public StringTokenizer setQuoteMatcher(StringMatcher stringMatcher) {
        if (stringMatcher != null) {
            this.quoteMatcher = stringMatcher;
        }
        return this;
    }

    public StringTokenizer setTrimmerMatcher(StringMatcher stringMatcher) {
        if (stringMatcher != null) {
            this.trimmerMatcher = stringMatcher;
        }
        return this;
    }

    public int size() {
        checkTokenized();
        return this.tokens.length;
    }

    public String toString() {
        if (this.tokens == null) {
            return "StringTokenizer[not tokenized yet]";
        }
        return "StringTokenizer" + getTokenList();
    }

    public List<String> tokenize(char[] cArr, int i14, int i15) {
        if (cArr == null || i15 == 0) {
            return Collections.EMPTY_LIST;
        }
        TextStringBuilder textStringBuilder = new TextStringBuilder();
        ArrayList arrayList = new ArrayList();
        int nextToken = i14;
        while (nextToken >= 0 && nextToken < i15) {
            char[] cArr2 = cArr;
            int i16 = i15;
            nextToken = readNextToken(cArr2, nextToken, i16, textStringBuilder, arrayList);
            if (nextToken >= i16) {
                addToken(arrayList, "");
            }
            cArr = cArr2;
            i15 = i16;
        }
        return arrayList;
    }

    public static StringTokenizer getCSVInstance() {
        return getCSVClone();
    }

    public static StringTokenizer getTSVInstance() {
        return getTSVClone();
    }

    public static StringTokenizer getCSVInstance(char[] cArr) {
        StringTokenizer cSVClone = getCSVClone();
        cSVClone.reset(cArr);
        return cSVClone;
    }

    public static StringTokenizer getTSVInstance(char[] cArr) {
        StringTokenizer tSVClone = getTSVClone();
        tSVClone.reset(cArr);
        return tSVClone;
    }

    public StringTokenizer reset(String str) {
        reset();
        if (str != null) {
            this.chars = str.toCharArray();
            return this;
        }
        this.chars = null;
        return this;
    }

    public StringTokenizer reset() {
        this.tokenPos = 0;
        this.tokens = null;
        return this;
    }

    public StringTokenizer(String str) {
        StringMatcherFactory stringMatcherFactory = StringMatcherFactory.INSTANCE;
        this.delimMatcher = stringMatcherFactory.splitMatcher();
        this.quoteMatcher = stringMatcherFactory.noneMatcher();
        this.ignoredMatcher = stringMatcherFactory.noneMatcher();
        this.trimmerMatcher = stringMatcherFactory.noneMatcher();
        this.emptyAsNull = false;
        this.ignoreEmptyTokens = true;
        if (str != null) {
            this.chars = str.toCharArray();
        } else {
            this.chars = null;
        }
    }

    public StringTokenizer(String str, char c14) {
        this(str);
        setDelimiterChar(c14);
    }

    public StringTokenizer(String str, String str2) {
        this(str);
        setDelimiterString(str2);
    }

    public StringTokenizer(String str, StringMatcher stringMatcher) {
        this(str);
        setDelimiterMatcher(stringMatcher);
    }

    public StringTokenizer(String str, char c14, char c15) {
        this(str, c14);
        setQuoteChar(c15);
    }

    public StringTokenizer(String str, StringMatcher stringMatcher, StringMatcher stringMatcher2) {
        this(str, stringMatcher);
        setQuoteMatcher(stringMatcher2);
    }

    public StringTokenizer() {
        StringMatcherFactory stringMatcherFactory = StringMatcherFactory.INSTANCE;
        this.delimMatcher = stringMatcherFactory.splitMatcher();
        this.quoteMatcher = stringMatcherFactory.noneMatcher();
        this.ignoredMatcher = stringMatcherFactory.noneMatcher();
        this.trimmerMatcher = stringMatcherFactory.noneMatcher();
        this.emptyAsNull = false;
        this.ignoreEmptyTokens = true;
        this.chars = null;
    }

    public StringTokenizer(char[] cArr, char c14) {
        this(cArr);
        setDelimiterChar(c14);
    }

    public StringTokenizer(char[] cArr, String str) {
        this(cArr);
        setDelimiterString(str);
    }

    public StringTokenizer(char[] cArr, StringMatcher stringMatcher) {
        this(cArr);
        setDelimiterMatcher(stringMatcher);
    }

    public StringTokenizer(char[] cArr, char c14, char c15) {
        this(cArr, c14);
        setQuoteChar(c15);
    }

    public StringTokenizer(char[] cArr, StringMatcher stringMatcher, StringMatcher stringMatcher2) {
        this(cArr, stringMatcher);
        setQuoteMatcher(stringMatcher2);
    }
}
