package org.hamcrest;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.text.Typography;
import org.hamcrest.internal.ArrayIterator;
import org.hamcrest.internal.SelfDescribingValueIterator;

/* JADX INFO: loaded from: classes23.dex */
public abstract class BaseDescription implements Description {
    private Description a(String str, String str2, String str3, Iterator<? extends SelfDescribing> it2) {
        append(str);
        boolean z = false;
        while (it2.hasNext()) {
            if (z) {
                append(str2);
            }
            appendDescriptionOf(it2.next());
            z = true;
        }
        append(str3);
        return this;
    }

    private <T> Description b(String str, String str2, String str3, Iterator<T> it2) {
        return a(str, str2, str3, new SelfDescribingValueIterator(it2));
    }

    private String c(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
        }
    }

    private void d(char c) {
        if (c == '\t') {
            append("\\t");
            return;
        }
        if (c == '\n') {
            append("\\n");
            return;
        }
        if (c == '\r') {
            append("\\r");
        } else if (c != '\"') {
            append(c);
        } else {
            append("\\\"");
        }
    }

    private void e(String str) {
        append('\"');
        for (int i = 0; i < str.length(); i++) {
            d(str.charAt(i));
        }
        append('\"');
    }

    public abstract void append(char c);

    public void append(String str) {
        for (int i = 0; i < str.length(); i++) {
            append(str.charAt(i));
        }
    }

    @Override // org.hamcrest.Description
    public Description appendDescriptionOf(SelfDescribing selfDescribing) {
        selfDescribing.describeTo(this);
        return this;
    }

    @Override // org.hamcrest.Description
    public Description appendList(String str, String str2, String str3, Iterable<? extends SelfDescribing> iterable) {
        return a(str, str2, str3, iterable.iterator());
    }

    @Override // org.hamcrest.Description
    public Description appendText(String str) {
        append(str);
        return this;
    }

    @Override // org.hamcrest.Description
    public Description appendValue(Object obj) {
        if (obj == null) {
            append("null");
        } else if (obj instanceof String) {
            e((String) obj);
        } else if (obj instanceof Character) {
            append('\"');
            d(((Character) obj).charValue());
            append('\"');
        } else if (obj instanceof Short) {
            append(Typography.less);
            append(c(obj));
            append("s>");
        } else if (obj instanceof Long) {
            append(Typography.less);
            append(c(obj));
            append("L>");
        } else if (obj instanceof Float) {
            append(Typography.less);
            append(c(obj));
            append("F>");
        } else if (obj.getClass().isArray()) {
            b("[", ", ", "]", new ArrayIterator(obj));
        } else {
            append(Typography.less);
            append(c(obj));
            append(Typography.greater);
        }
        return this;
    }

    @Override // org.hamcrest.Description
    public <T> Description appendValueList(String str, String str2, String str3, T... tArr) {
        return appendValueList(str, str2, str3, Arrays.asList(tArr));
    }

    @Override // org.hamcrest.Description
    public <T> Description appendValueList(String str, String str2, String str3, Iterable<T> iterable) {
        return b(str, str2, str3, iterable.iterator());
    }
}
