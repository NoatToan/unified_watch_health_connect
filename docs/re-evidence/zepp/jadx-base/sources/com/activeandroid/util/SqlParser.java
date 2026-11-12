package com.activeandroid.util;

import io.netty.util.internal.StringUtil;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SqlParser {
    public static final int STATE_COMMENT = 2;
    public static final int STATE_COMMENT_BLOCK = 3;
    public static final int STATE_NONE = 0;
    public static final int STATE_STRING = 1;

    private static boolean isNewLine(char c) {
        return c == '\r' || c == '\n';
    }

    private static boolean isWhitespace(char c) {
        return c == '\r' || c == '\n' || c == '\t' || c == ' ';
    }

    public static List<String> parse(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Tokenizer tokenizer = new Tokenizer(bufferedInputStream);
            loop0: while (true) {
                char c = 0;
                while (true) {
                    if (!tokenizer.hasNext()) {
                        break loop0;
                    }
                    char next = (char) tokenizer.next();
                    if (c == 3) {
                        if (tokenizer.skip("*/")) {
                            break;
                        }
                    } else if (c == 2) {
                        if (isNewLine(next)) {
                            break;
                        }
                    } else if (c == 0 && tokenizer.skip("/*")) {
                        c = 3;
                    } else if (c == 0 && tokenizer.skip("--")) {
                        c = 2;
                    } else if (c == 0 && next == ';') {
                        arrayList.add(stringBuffer.toString().trim());
                        stringBuffer.setLength(0);
                    } else {
                        if (c == 0 && next == '\'') {
                            c = 1;
                        } else if (c == 1 && next == '\'') {
                            c = 0;
                        }
                        if (c == 0 || c == 1) {
                            if (c != 0 || !isWhitespace(next)) {
                                stringBuffer.append(next);
                            } else if (stringBuffer.length() > 0 && stringBuffer.charAt(stringBuffer.length() - 1) != ' ') {
                                stringBuffer.append(StringUtil.SPACE);
                            }
                        }
                    }
                }
            }
            IOUtils.closeQuietly(bufferedInputStream);
            if (stringBuffer.length() > 0) {
                arrayList.add(stringBuffer.toString().trim());
            }
            return arrayList;
        } catch (Throwable th) {
            IOUtils.closeQuietly(bufferedInputStream);
            throw th;
        }
    }
}
