package org.junit.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.internal.Classes;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes23.dex */
class JUnitCommandLineParseResult {
    private final List<String> a = new ArrayList();
    private final List<Class<?>> b = new ArrayList();
    private final List<Throwable> c = new ArrayList();

    public static class CommandLineParserError extends Exception {
        private static final long serialVersionUID = 1;

        public CommandLineParserError(String str) {
            super(str);
        }
    }

    private Request a(Request request) {
        try {
            Iterator<String> it2 = this.a.iterator();
            while (it2.hasNext()) {
                request = request.filterWith(a.e(request, it2.next()));
            }
            return request;
        } catch (FilterFactory.FilterNotCreatedException e) {
            return d(e);
        }
    }

    private String[] b(String[] strArr, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        while (i != i2) {
            arrayList.add(strArr[i]);
            i++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private Request d(Throwable th) {
        return Request.errorReport(JUnitCommandLineParseResult.class, th);
    }

    public static JUnitCommandLineParseResult g(String[] strArr) {
        JUnitCommandLineParseResult jUnitCommandLineParseResult = new JUnitCommandLineParseResult();
        jUnitCommandLineParseResult.h(strArr);
        return jUnitCommandLineParseResult;
    }

    private void h(String[] strArr) {
        j(i(strArr));
    }

    public Request c(Computer computer) {
        if (!this.c.isEmpty()) {
            return d(new InitializationError(this.c));
        }
        List<Class<?>> list = this.b;
        return a(Request.classes(computer, (Class[]) list.toArray(new Class[list.size()])));
    }

    public List<Class<?>> e() {
        return Collections.unmodifiableList(this.b);
    }

    public List<String> f() {
        return Collections.unmodifiableList(this.a);
    }

    public String[] i(String... strArr) {
        String strSubstring;
        int i = 0;
        while (i != strArr.length) {
            String str = strArr[i];
            if (str.equals("--")) {
                return b(strArr, i + 1, strArr.length);
            }
            if (!str.startsWith("--")) {
                return b(strArr, i, strArr.length);
            }
            if (str.startsWith("--filter=") || str.equals("--filter")) {
                if (str.equals("--filter")) {
                    i++;
                    if (i >= strArr.length) {
                        this.c.add(new CommandLineParserError(str + " value not specified"));
                        break;
                    }
                    strSubstring = strArr[i];
                } else {
                    strSubstring = str.substring(str.indexOf(61) + 1);
                }
                this.a.add(strSubstring);
            } else {
                this.c.add(new CommandLineParserError("JUnit knows nothing about the " + str + " option"));
            }
            i++;
        }
        return new String[0];
    }

    public void j(String[] strArr) {
        for (String str : strArr) {
            try {
                this.b.add(Classes.getClass(str));
            } catch (ClassNotFoundException e) {
                this.c.add(new IllegalArgumentException("Could not find class [" + str + "]", e));
            }
        }
    }
}
