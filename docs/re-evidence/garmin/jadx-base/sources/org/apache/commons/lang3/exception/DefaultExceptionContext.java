package org.apache.commons.lang3.exception;

import ch.qos.logback.core.CoreConstants;
import com.google.maps.android.BuildConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m9.a;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultExceptionContext implements ExceptionContext, Serializable {
    private static final long serialVersionUID = 20110706;
    private final List<Pair<String, Object>> contextValues = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setContextValue$0(String str, Pair pair) {
        return StringUtils.equals(str, (CharSequence) pair.getKey());
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public DefaultExceptionContext addContextValue(String str, Object obj) {
        this.contextValues.add(new ImmutablePair(str, obj));
        return this;
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public List<Pair<String, Object>> getContextEntries() {
        return this.contextValues;
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public Set<String> getContextLabels() {
        HashSet hashSet = new HashSet();
        Iterator<Pair<String, Object>> it = this.contextValues.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getKey());
        }
        return hashSet;
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public List<Object> getContextValues(String str) {
        ArrayList arrayList = new ArrayList();
        for (Pair<String, Object> pair : this.contextValues) {
            if (StringUtils.equals(str, pair.getKey())) {
                arrayList.add(pair.getValue());
            }
        }
        return arrayList;
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public Object getFirstContextValue(String str) {
        for (Pair<String, Object> pair : this.contextValues) {
            if (StringUtils.equals(str, pair.getKey())) {
                return pair.getValue();
            }
        }
        return null;
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public String getFormattedExceptionMessage(String str) {
        String string;
        StringBuilder sb3 = new StringBuilder(256);
        if (str != null) {
            sb3.append(str);
        }
        if (!this.contextValues.isEmpty()) {
            if (sb3.length() > 0) {
                sb3.append('\n');
            }
            sb3.append("Exception Context:\n");
            int i14 = 0;
            for (Pair<String, Object> pair : this.contextValues) {
                sb3.append("\t[");
                i14++;
                sb3.append(i14);
                sb3.append(CoreConstants.COLON_CHAR);
                sb3.append(pair.getKey());
                sb3.append("=");
                Object value = pair.getValue();
                if (value == null) {
                    sb3.append(BuildConfig.TRAVIS);
                } else {
                    try {
                        string = value.toString();
                    } catch (Exception e4) {
                        string = "Exception thrown on toString(): " + ExceptionUtils.getStackTrace(e4);
                    }
                    sb3.append(string);
                }
                sb3.append("]\n");
            }
            sb3.append("---------------------------------");
        }
        return sb3.toString();
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public DefaultExceptionContext setContextValue(String str, Object obj) {
        this.contextValues.removeIf(new a(str, 1));
        addContextValue(str, obj);
        return this;
    }
}
