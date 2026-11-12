package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;
import defpackage.aca;
import defpackage.wq;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public abstract class PropertyBindingException extends aca {
    private static final int MAX_DESC_LENGTH = 1000;
    protected transient String _propertiesAsString;
    protected final Collection<Object> _propertyIds;
    protected final String _propertyName;
    protected final Class<?> _referringClass;

    public PropertyBindingException(JsonParser jsonParser, String str, wq wqVar, Class<?> cls, String str2, Collection<Object> collection) {
        super(jsonParser, str, wqVar);
        this._referringClass = cls;
        this._propertyName = str2;
        this._propertyIds = collection;
    }

    @Deprecated
    protected PropertyBindingException(String str, wq wqVar, Class<?> cls, String str2, Collection<Object> collection) {
        this(null, str, wqVar, cls, str2, collection);
    }

    @Override // defpackage.wr
    public String getMessageSuffix() {
        String str = this._propertiesAsString;
        if (str != null || this._propertyIds == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(100);
        int size = this._propertyIds.size();
        if (size == 1) {
            sb.append(" (one known property: \"");
            sb.append(String.valueOf(this._propertyIds.iterator().next()));
            sb.append('\"');
        } else {
            sb.append(" (");
            sb.append(size);
            sb.append(" known properties: ");
            Iterator<Object> it = this._propertyIds.iterator();
            while (it.hasNext()) {
                sb.append('\"');
                sb.append(String.valueOf(it.next()));
                sb.append('\"');
                if (sb.length() > 1000) {
                    sb.append(" [truncated]");
                    break;
                }
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
        }
        sb.append("])");
        String string = sb.toString();
        this._propertiesAsString = string;
        return string;
    }

    public Class<?> getReferringClass() {
        return this._referringClass;
    }

    public String getPropertyName() {
        return this._propertyName;
    }

    public Collection<Object> getKnownPropertyIds() {
        Collection<Object> collection = this._propertyIds;
        if (collection == null) {
            return null;
        }
        return Collections.unmodifiableCollection(collection);
    }
}
