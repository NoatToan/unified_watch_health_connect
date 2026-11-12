package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.util.AsIsEscapeUtil;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class OptionTokenizer {
    private static final int EXPECTING_STATE = 0;
    private static final int QUOTED_COLLECTING_STATE = 2;
    private static final int RAW_COLLECTING_STATE = 1;
    final IEscapeUtil escapeUtil;
    final String pattern;
    final int patternLength;
    char quoteChar;
    int state;
    final TokenStream tokenStream;

    public OptionTokenizer(TokenStream tokenStream, IEscapeUtil iEscapeUtil) {
        this.state = 0;
        this.tokenStream = tokenStream;
        this.pattern = tokenStream.pattern;
        this.patternLength = tokenStream.patternLength;
        this.escapeUtil = iEscapeUtil;
    }

    public void emitOptionToken(List<Token> list, List<String> list2) {
        list.add(new Token(1006, list2));
        this.tokenStream.state = TokenStream.TokenizerState.LITERAL_STATE;
    }

    public void escape(String str, StringBuffer stringBuffer) {
        TokenStream tokenStream = this.tokenStream;
        int i14 = tokenStream.pointer;
        if (i14 < this.patternLength) {
            String str2 = this.pattern;
            tokenStream.pointer = i14 + 1;
            this.escapeUtil.escape(str, stringBuffer, str2.charAt(i14), this.tokenStream.pointer);
        }
    }

    public void tokenize(char c14, List<Token> list) throws ScanException {
        String strTrim;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (this.tokenStream.pointer < this.patternLength) {
            int i14 = this.state;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        char c15 = this.quoteChar;
                        if (c14 == c15) {
                            strTrim = stringBuffer.toString();
                            arrayList.add(strTrim);
                            stringBuffer.setLength(0);
                            this.state = 0;
                        } else if (c14 == '\\') {
                            escape(String.valueOf(c15), stringBuffer);
                        } else {
                            stringBuffer.append(c14);
                        }
                    }
                } else if (c14 != ',') {
                    if (c14 == '}') {
                        arrayList.add(stringBuffer.toString().trim());
                        emitOptionToken(list, arrayList);
                    }
                    stringBuffer.append(c14);
                } else {
                    strTrim = stringBuffer.toString().trim();
                    arrayList.add(strTrim);
                    stringBuffer.setLength(0);
                    this.state = 0;
                }
            } else if (c14 != '\t' && c14 != '\n' && c14 != '\r' && c14 != ' ') {
                if (c14 == '\"' || c14 == '\'') {
                    this.state = 2;
                    this.quoteChar = c14;
                } else if (c14 == ',') {
                    continue;
                } else if (c14 == '}') {
                    emitOptionToken(list, arrayList);
                    return;
                } else {
                    stringBuffer.append(c14);
                    this.state = 1;
                }
            }
            c14 = this.pattern.charAt(this.tokenStream.pointer);
            this.tokenStream.pointer++;
        }
        if (c14 != '}') {
            throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
        }
        int i15 = this.state;
        if (i15 == 0) {
            emitOptionToken(list, arrayList);
            return;
        }
        if (i15 != 1) {
            throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
        }
        arrayList.add(stringBuffer.toString().trim());
        emitOptionToken(list, arrayList);
    }

    public OptionTokenizer(TokenStream tokenStream) {
        this(tokenStream, new AsIsEscapeUtil());
    }
}
