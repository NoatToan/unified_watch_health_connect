package com.huawei.watchface;

import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import com.google.gson.stream.JsonWriter;
import com.huawei.secure.android.common.util.SafeString;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes45.dex */
public class b5 extends JsonWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XmlSerializer f30093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30095c;
    public Stack d;
    public Stack e;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f30097b = new ArrayList(20);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f30098c = new ArrayList(10);
        public List d = new ArrayList(20);
        public String e;

        public a(String str) {
            this.f30096a = str;
        }

        public void a(String str, String str2) {
            this.f30097b.add(new Pair(str, str2));
        }

        public void b(String str, String str2) {
            this.d.add(new Pair(str, str2));
        }

        public void a(a aVar) {
            this.f30098c.add(aVar);
        }

        public void a(String str) {
            this.e = str;
        }

        public void a(XmlSerializer xmlSerializer, String str) throws IOException {
            xmlSerializer.text(System.lineSeparator());
            xmlSerializer.text(str);
            xmlSerializer.startTag(null, this.f30096a);
            for (Pair pair : this.f30097b) {
                b5.this.f30093a.attribute(null, (String) pair.first, (String) pair.second);
            }
            for (Pair pair2 : this.d) {
                xmlSerializer.text(System.lineSeparator());
                xmlSerializer.text(str + "    ");
                xmlSerializer.startTag(null, (String) pair2.first);
                xmlSerializer.text((String) pair2.second);
                xmlSerializer.endTag(null, (String) pair2.first);
            }
            Iterator it = this.f30098c.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(xmlSerializer, str + "    ");
            }
            xmlSerializer.text(System.lineSeparator());
            xmlSerializer.text(str);
            xmlSerializer.endTag(null, this.f30096a);
        }
    }

    public b5(String str, Writer writer) throws IOException {
        super(writer);
        this.d = new Stack();
        this.e = new Stack();
        this.d.push(1);
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        this.f30093a = xmlSerializerNewSerializer;
        xmlSerializerNewSerializer.setOutput(writer);
        this.f30094b = str;
    }

    public final void a(String str) {
        if (((Integer) this.d.peek()).intValue() != 2 || TextUtils.isEmpty(this.f30095c) || this.e.isEmpty()) {
            return;
        }
        a aVar = (a) this.e.peek();
        String str2 = this.f30095c;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        if (str2.startsWith("@")) {
            aVar.a(SafeString.substring(str2, 1, str2.length()), str);
        } else {
            aVar.b(str2, str);
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() {
        this.d.push(3);
        if (!this.e.isEmpty()) {
            ((a) this.e.peek()).a(this.f30095c);
        }
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
        int iIntValue = ((Integer) this.d.peek()).intValue();
        if (iIntValue == 1) {
            this.f30093a.startDocument("utf-8", Boolean.TRUE);
            this.d.pop();
            this.d.push(2);
            this.e.push(new a(this.f30094b));
        }
        if (iIntValue == 2) {
            if (!this.e.isEmpty()) {
                a aVar = (a) this.e.peek();
                a aVar2 = new a(this.f30095c);
                aVar.a(aVar2);
                this.e.push(aVar2);
            }
            this.d.push(2);
        }
        if (iIntValue == 3) {
            if (!this.e.isEmpty()) {
                a aVar3 = (a) this.e.peek();
                a aVar4 = new a(aVar3.e);
                aVar3.a(aVar4);
                this.e.push(aVar4);
            }
            this.d.push(2);
        }
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() {
        this.d.pop();
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
        a aVar = null;
        if (((Integer) this.d.peek()).intValue() == 2) {
            if (!this.e.isEmpty()) {
                a aVar2 = (a) this.e.peek();
                this.e.pop();
                aVar = aVar2;
            }
            this.d.pop();
        }
        if (this.d.isEmpty() && this.e.isEmpty()) {
            if (aVar != null) {
                aVar.a(this.f30093a, "");
            }
            this.f30093a.endDocument();
            this.f30093a.text(System.lineSeparator());
            this.f30093a.flush();
        }
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter jsonValue(String str) throws IOException {
        this.f30093a.text(str);
        this.f30093a.flush();
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) {
        if (str == null) {
            throw new NullPointerException("mName == null");
        }
        this.f30095c = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() {
        a(null);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) {
        if (str == null) {
            return nullValue();
        }
        a(str);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z) {
        a(z ? "true" : "false");
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) {
        if (bool == null) {
            return nullValue();
        }
        a(bool.booleanValue() ? "true" : "false");
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            a(Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j) {
        a(Long.toString(j));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) {
        if (number == null) {
            return nullValue();
        }
        String strValueOf = String.valueOf(number);
        if (!strValueOf.equals("-Infinity") && !strValueOf.equals("Infinity") && !strValueOf.equals("NaN")) {
            a(strValueOf);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite");
    }
}
