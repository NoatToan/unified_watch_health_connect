package com.nimbusds.jose.shaded.json;

import defpackage.mpd;
import defpackage.tpd;
import defpackage.vpd;
import defpackage.ypd;
import defpackage.yud;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class JSONArray extends ArrayList<Object> implements List<Object>, mpd, tpd {
    private static final long serialVersionUID = 9106884089231309568L;

    public static String toJSONString(List<? extends Object> list) {
        return toJSONString(list, ypd.f40395a);
    }

    public static void writeJSONString(Iterable<? extends Object> iterable, Appendable appendable, vpd vpdVar) throws IOException {
        if (iterable == null) {
            appendable.append(AbstractJsonLexerKt.NULL);
        } else {
            yud.g.a(iterable, appendable, vpdVar);
        }
    }

    public JSONArray appendElement(Object obj) {
        add(obj);
        return this;
    }

    public void merge(Object obj) {
        JSONObject.merge(this, obj);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return toJSONString();
    }

    public static String toJSONString(List<? extends Object> list, vpd vpdVar) {
        StringBuilder sb = new StringBuilder();
        try {
            writeJSONString(list, sb, vpdVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public String toString(vpd vpdVar) {
        return toJSONString(vpdVar);
    }

    public static void writeJSONString(List<? extends Object> list, Appendable appendable) throws IOException {
        writeJSONString(list, appendable, ypd.f40395a);
    }

    @Override // defpackage.lpd
    public String toJSONString() {
        return toJSONString(this, ypd.f40395a);
    }

    @Override // defpackage.spd
    public void writeJSONString(Appendable appendable) throws IOException {
        writeJSONString(this, appendable, ypd.f40395a);
    }

    @Override // defpackage.mpd
    public String toJSONString(vpd vpdVar) {
        return toJSONString(this, vpdVar);
    }

    @Override // defpackage.tpd
    public void writeJSONString(Appendable appendable, vpd vpdVar) throws IOException {
        writeJSONString(this, appendable, vpdVar);
    }
}
