package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.fbq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class UnresolvedForwardReference extends JsonMappingException {
    private static final long serialVersionUID = 1;
    private com.fasterxml.jackson.databind.deser.impl.a _roid;
    private List<fbq> _unresolvedIds;

    public UnresolvedForwardReference(JsonParser jsonParser, String str, JsonLocation jsonLocation, com.fasterxml.jackson.databind.deser.impl.a aVar) {
        super(jsonParser, str, jsonLocation);
        this._roid = aVar;
    }

    public void addUnresolvedId(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this._unresolvedIds.add(new fbq(obj, cls, jsonLocation));
    }

    @Override // com.fasterxml.jackson.databind.JsonMappingException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this._unresolvedIds == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(message);
        Iterator<fbq> it = this._unresolvedIds.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append('.');
        return sb.toString();
    }

    public com.fasterxml.jackson.databind.deser.impl.a getRoid() {
        return this._roid;
    }

    public Object getUnresolvedId() {
        return this._roid.c().key;
    }

    public List<fbq> getUnresolvedIds() {
        return this._unresolvedIds;
    }

    public UnresolvedForwardReference(JsonParser jsonParser, String str) {
        super(jsonParser, str);
        this._unresolvedIds = new ArrayList();
    }

    @Deprecated
    public UnresolvedForwardReference(String str, JsonLocation jsonLocation, com.fasterxml.jackson.databind.deser.impl.a aVar) {
        super(str, jsonLocation);
        this._roid = aVar;
    }

    @Deprecated
    public UnresolvedForwardReference(String str) {
        super(str);
        this._unresolvedIds = new ArrayList();
    }
}
