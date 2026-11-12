package org.apache.commons.lang3.exception;

import defpackage.gf8;
import defpackage.mlo;
import defpackage.nf8;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultExceptionContext implements gf8, Serializable {
    private static final long serialVersionUID = 20110706;
    private final List<Pair<String, Object>> contextValues = new ArrayList();

    @Override // defpackage.gf8
    public List<Pair<String, Object>> getContextEntries() {
        return this.contextValues;
    }

    @Override // defpackage.gf8
    public Set<String> getContextLabels() {
        HashSet hashSet = new HashSet();
        Iterator<Pair<String, Object>> it = this.contextValues.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getKey());
        }
        return hashSet;
    }

    @Override // defpackage.gf8
    public List<Object> getContextValues(String str) {
        ArrayList arrayList = new ArrayList();
        for (Pair<String, Object> pair : this.contextValues) {
            if (mlo.a(str, pair.getKey())) {
                arrayList.add(pair.getValue());
            }
        }
        return arrayList;
    }

    @Override // defpackage.gf8
    public Object getFirstContextValue(String str) {
        for (Pair<String, Object> pair : this.contextValues) {
            if (mlo.a(str, pair.getKey())) {
                return pair.getValue();
            }
        }
        return null;
    }

    @Override // defpackage.gf8
    public String getFormattedExceptionMessage(String str) {
        String string;
        StringBuilder sb = new StringBuilder(256);
        if (str != null) {
            sb.append(str);
        }
        if (this.contextValues.size() > 0) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append("Exception Context:\n");
            int i = 0;
            for (Pair<String, Object> pair : this.contextValues) {
                sb.append("\t[");
                i++;
                sb.append(i);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(pair.getKey());
                sb.append("=");
                Object value = pair.getValue();
                if (value == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    try {
                        string = value.toString();
                    } catch (Exception e) {
                        string = "Exception thrown on toString(): " + nf8.a(e);
                    }
                    sb.append(string);
                }
                sb.append("]\n");
            }
            sb.append("---------------------------------");
        }
        return sb.toString();
    }

    @Override // defpackage.gf8
    public DefaultExceptionContext addContextValue(String str, Object obj) {
        this.contextValues.add(new ImmutablePair(str, obj));
        return this;
    }

    @Override // defpackage.gf8
    public DefaultExceptionContext setContextValue(String str, Object obj) {
        Iterator<Pair<String, Object>> it = this.contextValues.iterator();
        while (it.hasNext()) {
            if (mlo.a(str, it.next().getKey())) {
                it.remove();
            }
        }
        addContextValue(str, obj);
        return this;
    }
}
