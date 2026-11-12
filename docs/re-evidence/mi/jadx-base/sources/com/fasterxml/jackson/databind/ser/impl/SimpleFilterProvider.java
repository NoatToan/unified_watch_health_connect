package com.fasterxml.jackson.databind.ser.impl;

import defpackage.jh2;
import defpackage.odi;
import defpackage.tm9;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleFilterProvider extends tm9 implements Serializable {
    private static final long serialVersionUID = 1;
    protected boolean _cfgFailOnUnknownId;
    protected odi _defaultFilter;
    protected final Map<String, odi> _filtersById;

    public SimpleFilterProvider() {
        this(new HashMap());
    }

    private static final Map<String, odi> _convert(Map<String, ?> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof odi) {
                map2.put(entry.getKey(), (odi) value);
            } else {
                if (!(value instanceof jh2)) {
                    throw new IllegalArgumentException("Unrecognized filter type (" + value.getClass().getName() + ")");
                }
                map2.put(entry.getKey(), _convert((jh2) value));
            }
        }
        return map2;
    }

    @Deprecated
    public SimpleFilterProvider addFilter(String str, jh2 jh2Var) {
        this._filtersById.put(str, _convert(jh2Var));
        return this;
    }

    @Override // defpackage.tm9
    @Deprecated
    public jh2 findFilter(Object obj) {
        throw new UnsupportedOperationException("Access to deprecated filters not supported");
    }

    @Override // defpackage.tm9
    public odi findPropertyFilter(Object obj, Object obj2) {
        odi odiVar = this._filtersById.get(obj);
        if (odiVar != null || (odiVar = this._defaultFilter) != null || !this._cfgFailOnUnknownId) {
            return odiVar;
        }
        throw new IllegalArgumentException("No filter configured with id '" + obj + "' (type " + obj.getClass().getName() + ")");
    }

    public odi getDefaultFilter() {
        return this._defaultFilter;
    }

    public odi removeFilter(String str) {
        return this._filtersById.remove(str);
    }

    @Deprecated
    public SimpleFilterProvider setDefaultFilter(jh2 jh2Var) {
        this._defaultFilter = SimpleBeanPropertyFilter.from(jh2Var);
        return this;
    }

    public SimpleFilterProvider setFailOnUnknownId(boolean z) {
        this._cfgFailOnUnknownId = z;
        return this;
    }

    public boolean willFailOnUnknownId() {
        return this._cfgFailOnUnknownId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleFilterProvider(Map<String, ?> map) {
        this._cfgFailOnUnknownId = true;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof odi)) {
                this._filtersById = _convert(map);
                return;
            }
        }
        this._filtersById = map;
    }

    public SimpleFilterProvider addFilter(String str, odi odiVar) {
        this._filtersById.put(str, odiVar);
        return this;
    }

    public SimpleFilterProvider setDefaultFilter(odi odiVar) {
        this._defaultFilter = odiVar;
        return this;
    }

    public SimpleFilterProvider addFilter(String str, SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
        this._filtersById.put(str, simpleBeanPropertyFilter);
        return this;
    }

    public SimpleFilterProvider setDefaultFilter(SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
        this._defaultFilter = simpleBeanPropertyFilter;
        return this;
    }

    private static final odi _convert(jh2 jh2Var) {
        return SimpleBeanPropertyFilter.from(jh2Var);
    }
}
