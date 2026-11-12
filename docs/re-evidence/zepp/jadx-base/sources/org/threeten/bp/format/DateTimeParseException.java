package org.threeten.bp.format;

import org.threeten.bp.DateTimeException;

/* JADX INFO: loaded from: classes23.dex */
public class DateTimeParseException extends DateTimeException {
    private static final long serialVersionUID = 4304633501674722597L;
    private final String a;
    private final int b;

    public DateTimeParseException(String str, CharSequence charSequence, int i) {
        super(str);
        this.a = charSequence.toString();
        this.b = i;
    }

    public int getErrorIndex() {
        return this.b;
    }

    public String getParsedString() {
        return this.a;
    }

    public DateTimeParseException(String str, CharSequence charSequence, int i, Throwable th) {
        super(str, th);
        this.a = charSequence.toString();
        this.b = i;
    }
}
