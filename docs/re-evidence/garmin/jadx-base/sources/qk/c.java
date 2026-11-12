package qk;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends Formatter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f145074b = System.getProperty("line.separator");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SimpleDateFormat f145075c = new SimpleDateFormat("kk:mm:ss.SSS", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Level f145076a;

    public c(Level level) {
        this.f145076a = level;
    }

    @Override // java.util.logging.Formatter
    public final String format(LogRecord logRecord) {
        StringBuilder sb3 = new StringBuilder();
        if (this.f145076a == logRecord.getLevel()) {
            if (logRecord.getLevel() == Level.INFO) {
                sb3.append(f145075c.format(new Date(logRecord.getMillis())));
                sb3.append(",");
                sb3.append(logRecord.getLevel().getLocalizedName());
                sb3.append(",");
            }
            sb3.append(formatMessage(logRecord));
            sb3.append(f145074b);
            if (logRecord.getThrown() != null) {
                try {
                    StringWriter stringWriter = new StringWriter();
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    logRecord.getThrown().printStackTrace(printWriter);
                    printWriter.close();
                    sb3.append(stringWriter.toString());
                } catch (Exception unused) {
                }
            }
        }
        return sb3.toString();
    }
}
