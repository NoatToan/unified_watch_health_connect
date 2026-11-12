package org.junit.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class ArrayComparisonFailure extends AssertionError {
    private static final long serialVersionUID = 1;
    private final List<Integer> a = new ArrayList();
    private final String b;

    public ArrayComparisonFailure(String str, AssertionError assertionError, int i) {
        this.b = str;
        initCause(assertionError);
        addDimension(i);
    }

    public void addDimension(int i) {
        this.a.add(0, Integer.valueOf(i));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        String str = this.b;
        if (str != null) {
            sb.append(str);
        }
        sb.append("arrays first differed at element ");
        Iterator<Integer> it2 = this.a.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            sb.append("[");
            sb.append(iIntValue);
            sb.append("]");
        }
        sb.append("; ");
        sb.append(getCause().getMessage());
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }
}
