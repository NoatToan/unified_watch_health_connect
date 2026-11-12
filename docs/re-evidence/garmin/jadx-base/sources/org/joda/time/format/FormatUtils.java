package org.joda.time.format;

import am.j;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import hb.a;
import java.io.IOException;
import java.io.Writer;
import o2.c;

/* JADX INFO: loaded from: classes3.dex */
public class FormatUtils {
    private static final double LOG_10 = Math.log(10.0d);

    private FormatUtils() {
    }

    public static void appendPaddedInteger(Appendable appendable, int i14, int i15) throws IOException {
        int iLog;
        if (i14 < 0) {
            appendable.append('-');
            if (i14 == Integer.MIN_VALUE) {
                while (i15 > 10) {
                    appendable.append('0');
                    i15--;
                }
                appendable.append("2147483648");
                return;
            }
            i14 = -i14;
        }
        if (i14 < 10) {
            while (i15 > 1) {
                appendable.append('0');
                i15--;
            }
            appendable.append((char) (i14 + 48));
            return;
        }
        if (i14 < 100) {
            while (i15 > 2) {
                appendable.append('0');
                i15--;
            }
            int i16 = ((i14 + 1) * 13421772) >> 27;
            appendable.append((char) (i16 + 48));
            appendable.append((char) (((i14 - (i16 << 3)) - (i16 << 1)) + 48));
            return;
        }
        if (i14 < 1000) {
            iLog = 3;
        } else {
            iLog = i14 < 10000 ? 4 : ((int) (Math.log(i14) / LOG_10)) + 1;
        }
        while (i15 > iLog) {
            appendable.append('0');
            i15--;
        }
        appendable.append(Integer.toString(i14));
    }

    public static void appendUnpaddedInteger(Appendable appendable, int i14) throws IOException {
        if (i14 < 0) {
            appendable.append('-');
            if (i14 == Integer.MIN_VALUE) {
                appendable.append("2147483648");
                return;
            }
            i14 = -i14;
        }
        if (i14 < 10) {
            appendable.append((char) (i14 + 48));
        } else {
            if (i14 >= 100) {
                appendable.append(Integer.toString(i14));
                return;
            }
            int i15 = ((i14 + 1) * 13421772) >> 27;
            appendable.append((char) (i15 + 48));
            appendable.append((char) (((i14 - (i15 << 3)) - (i15 << 1)) + 48));
        }
    }

    public static int calculateDigitCount(long j8) {
        int iLog;
        if (j8 < 0) {
            if (j8 == Long.MIN_VALUE) {
                return 20;
            }
            iLog = calculateDigitCount(-j8);
        } else {
            if (j8 < 10) {
                return 1;
            }
            if (j8 < 100) {
                return 2;
            }
            if (j8 < 1000) {
                return 3;
            }
            if (j8 < AbstractComponentTracker.LINGERING_TIMEOUT) {
                return 4;
            }
            iLog = (int) (Math.log(j8) / LOG_10);
        }
        return iLog + 1;
    }

    public static String createErrorMessage(String str, int i14) {
        String strConcat = str.length() <= i14 + 35 ? str : str.substring(0, i14 + 32).concat("...");
        if (i14 <= 0) {
            return c.c(CoreConstants.DOUBLE_QUOTE_CHAR, "Invalid format: \"", strConcat);
        }
        if (i14 >= str.length()) {
            return j.m("Invalid format: \"", strConcat, "\" is too short");
        }
        StringBuilder sbL = a.l("Invalid format: \"", strConcat, "\" is malformed at \"");
        sbL.append(strConcat.substring(i14));
        sbL.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        return sbL.toString();
    }

    public static int parseTwoDigits(CharSequence charSequence, int i14) {
        int iCharAt = charSequence.charAt(i14) - '0';
        return (charSequence.charAt(i14 + 1) + ((iCharAt << 3) + (iCharAt << 1))) - 48;
    }

    public static void writePaddedInteger(Writer writer, int i14, int i15) throws IOException {
        int iLog;
        if (i14 < 0) {
            writer.write(45);
            if (i14 == Integer.MIN_VALUE) {
                while (i15 > 10) {
                    writer.write(48);
                    i15--;
                }
                writer.write("2147483648");
                return;
            }
            i14 = -i14;
        }
        if (i14 < 10) {
            while (i15 > 1) {
                writer.write(48);
                i15--;
            }
            writer.write(i14 + 48);
            return;
        }
        if (i14 < 100) {
            while (i15 > 2) {
                writer.write(48);
                i15--;
            }
            int i16 = ((i14 + 1) * 13421772) >> 27;
            writer.write(i16 + 48);
            writer.write(((i14 - (i16 << 3)) - (i16 << 1)) + 48);
            return;
        }
        if (i14 < 1000) {
            iLog = 3;
        } else {
            iLog = i14 < 10000 ? 4 : ((int) (Math.log(i14) / LOG_10)) + 1;
        }
        while (i15 > iLog) {
            writer.write(48);
            i15--;
        }
        writer.write(Integer.toString(i14));
    }

    public static void writeUnpaddedInteger(Writer writer, int i14) throws IOException {
        if (i14 < 0) {
            writer.write(45);
            if (i14 == Integer.MIN_VALUE) {
                writer.write("2147483648");
                return;
            }
            i14 = -i14;
        }
        if (i14 < 10) {
            writer.write(i14 + 48);
        } else {
            if (i14 >= 100) {
                writer.write(Integer.toString(i14));
                return;
            }
            int i15 = ((i14 + 1) * 13421772) >> 27;
            writer.write(i15 + 48);
            writer.write(((i14 - (i15 << 3)) - (i15 << 1)) + 48);
        }
    }

    public static void writeUnpaddedInteger(Writer writer, long j8) throws IOException {
        int i14 = (int) j8;
        if (i14 == j8) {
            writeUnpaddedInteger(writer, i14);
        } else {
            writer.write(Long.toString(j8));
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, int i14) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, i14);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, long j8) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, j8);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(Appendable appendable, long j8) throws IOException {
        int i14 = (int) j8;
        if (i14 == j8) {
            appendUnpaddedInteger(appendable, i14);
        } else {
            appendable.append(Long.toString(j8));
        }
    }

    public static void writePaddedInteger(Writer writer, long j8, int i14) throws IOException {
        int i15 = (int) j8;
        if (i15 == j8) {
            writePaddedInteger(writer, i15, i14);
            return;
        }
        if (i14 <= 19) {
            writer.write(Long.toString(j8));
            return;
        }
        if (j8 < 0) {
            writer.write(45);
            if (j8 == Long.MIN_VALUE) {
                while (i14 > 19) {
                    writer.write(48);
                    i14--;
                }
                writer.write("9223372036854775808");
                return;
            }
            j8 = -j8;
        }
        int iLog = ((int) (Math.log(j8) / LOG_10)) + 1;
        while (i14 > iLog) {
            writer.write(48);
            i14--;
        }
        writer.write(Long.toString(j8));
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, int i14, int i15) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, i14, i15);
        } catch (IOException unused) {
        }
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, long j8, int i14) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, j8, i14);
        } catch (IOException unused) {
        }
    }

    public static void appendPaddedInteger(Appendable appendable, long j8, int i14) throws IOException {
        int i15 = (int) j8;
        if (i15 == j8) {
            appendPaddedInteger(appendable, i15, i14);
            return;
        }
        if (i14 <= 19) {
            appendable.append(Long.toString(j8));
            return;
        }
        if (j8 < 0) {
            appendable.append('-');
            if (j8 == Long.MIN_VALUE) {
                while (i14 > 19) {
                    appendable.append('0');
                    i14--;
                }
                appendable.append("9223372036854775808");
                return;
            }
            j8 = -j8;
        }
        int iLog = ((int) (Math.log(j8) / LOG_10)) + 1;
        while (i14 > iLog) {
            appendable.append('0');
            i14--;
        }
        appendable.append(Long.toString(j8));
    }
}
