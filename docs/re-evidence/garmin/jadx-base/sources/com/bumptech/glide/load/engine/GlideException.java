package com.bumptech.glide.load.engine;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o2.c;
import ui.e;

/* JADX INFO: loaded from: classes7.dex */
public final class GlideException extends Exception {
    private static final StackTraceElement[] EMPTY_ELEMENTS = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private ui.a dataSource;
    private String detailMessage;
    private Exception exception;
    private e key;

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(EMPTY_ELEMENTS);
        this.causes = list;
    }

    private void addRootCauses(Throwable th3, List<Throwable> list) {
        if (th3 instanceof GlideException) {
            Iterator<Throwable> it = ((GlideException) th3).getCauses().iterator();
            while (it.hasNext()) {
                addRootCauses(it.next(), list);
            }
        } else if (th3 != null) {
            list.add(th3);
        }
    }

    private static void appendCauses(List<Throwable> list, Appendable appendable) {
        try {
            appendCausesWrapped(list, appendable);
        } catch (IOException e4) {
            c.p(e4);
        }
    }

    private static void appendCausesWrapped(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i14 = 0;
        while (i14 < size) {
            int i15 = i14 + 1;
            appendable.append("Cause (").append(String.valueOf(i15)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th3 = list.get(i14);
            if (th3 instanceof GlideException) {
                ((GlideException) th3).printStackTrace(appendable);
            } else {
                appendExceptionMessage(th3, appendable);
            }
            i14 = i15;
        }
    }

    private static void appendExceptionMessage(Throwable th3, Appendable appendable) {
        try {
            appendable.append(th3.getClass().toString()).append(": ").append(th3.getMessage()).append('\n');
        } catch (IOException unused) {
            c.p(th3);
        }
    }

    private void printStackTrace(Appendable appendable) {
        appendExceptionMessage(this, appendable);
        appendCauses(getCauses(), new a(appendable));
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb3 = new StringBuilder(71);
        sb3.append(this.detailMessage);
        sb3.append(this.dataClass != null ? ", " + this.dataClass : "");
        sb3.append(this.dataSource != null ? ", " + this.dataSource : "");
        sb3.append(this.key != null ? ", " + this.key : "");
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb3.toString();
        }
        if (rootCauses.size() == 1) {
            sb3.append("\nThere was 1 root cause:");
        } else {
            sb3.append("\nThere were ");
            sb3.append(rootCauses.size());
            sb3.append(" root causes:");
        }
        for (Throwable th3 : rootCauses) {
            sb3.append('\n');
            sb3.append(th3.getClass().getName());
            sb3.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb3.append(th3.getMessage());
            sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        sb3.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb3.toString();
    }

    public Exception getOrigin() {
        return this.exception;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        addRootCauses(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i14 = 0;
        while (i14 < size) {
            int i15 = i14 + 1;
            rootCauses.get(i14);
            i14 = i15;
        }
    }

    public void setLoggingDetails(e eVar, ui.a aVar, Class<?> cls) {
        this.key = eVar;
        this.dataSource = aVar;
        this.dataClass = cls;
    }

    public void setOrigin(Exception exc) {
        this.exception = exc;
    }

    public void setLoggingDetails(e eVar, ui.a aVar) {
        setLoggingDetails(eVar, aVar, null);
    }

    public GlideException(String str, Throwable th3) {
        this(str, (List<Throwable>) Collections.singletonList(th3));
    }

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStackTrace((Appendable) printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printStackTrace((Appendable) printWriter);
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public static final class a implements Appendable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Appendable f28565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f28566b = true;

        public a(Appendable appendable) {
            this.f28565a = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i14, int i15) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z14 = this.f28566b;
            Appendable appendable = this.f28565a;
            boolean z15 = false;
            if (z14) {
                this.f28566b = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i15 - 1) == '\n') {
                z15 = true;
            }
            this.f28566b = z15;
            appendable.append(charSequence, i14, i15);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c14) throws IOException {
            boolean z14 = this.f28566b;
            Appendable appendable = this.f28565a;
            if (z14) {
                this.f28566b = false;
                appendable.append("  ");
            }
            this.f28566b = c14 == '\n';
            appendable.append(c14);
            return this;
        }
    }
}
