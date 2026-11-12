package defpackage;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.huawei.hms.network.embedded.g4;
import com.huawei.operation.utils.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ym extends wr {
    static final int MAX_REFS_TO_LIST = 1000;
    private static final long serialVersionUID = 1;
    protected LinkedList<e> _path;
    protected transient Closeable _processor;

    public static class e implements Serializable {
        private static final long serialVersionUID = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected transient Object f53626a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f53627c;
        protected String d;
        protected String e;

        protected e() {
            this.f53627c = -1;
        }

        public e(Object obj, String str) {
            this.f53627c = -1;
            this.f53626a = obj;
            if (str == null) {
                throw new NullPointerException("Cannot pass null fieldName");
            }
            this.e = str;
        }

        public e(Object obj, int i) {
            this.f53626a = obj;
            this.f53627c = i;
        }

        public String c() {
            if (this.d == null) {
                StringBuilder sb = new StringBuilder();
                Object obj = this.f53626a;
                if (obj == null) {
                    sb.append("UNKNOWN");
                } else {
                    Class<?> componentType = obj instanceof Class ? (Class) obj : obj.getClass();
                    int i = 0;
                    while (componentType.isArray()) {
                        componentType = componentType.getComponentType();
                        i++;
                    }
                    sb.append(componentType.getName());
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        sb.append("[]");
                    }
                }
                sb.append('[');
                if (this.e != null) {
                    sb.append('\"');
                    sb.append(this.e);
                    sb.append('\"');
                } else {
                    int i2 = this.f53627c;
                    if (i2 >= 0) {
                        sb.append(i2);
                    } else {
                        sb.append('?');
                    }
                }
                sb.append(']');
                this.d = sb.toString();
            }
            return this.d;
        }

        public String toString() {
            return c();
        }

        Object writeReplace() {
            c();
            return this;
        }
    }

    @Deprecated
    public ym(String str) {
        super(str);
    }

    @Deprecated
    public ym(String str, Throwable th) {
        super(str, th);
    }

    @Deprecated
    public ym(String str, wq wqVar) {
        super(str, wqVar);
    }

    @Deprecated
    public ym(String str, wq wqVar, Throwable th) {
        super(str, wqVar, th);
    }

    public ym(Closeable closeable, String str) {
        super(str);
        this._processor = closeable;
        if (closeable instanceof JsonParser) {
            this._location = ((JsonParser) closeable).getTokenLocation();
        }
    }

    public ym(Closeable closeable, String str, Throwable th) {
        super(str, th);
        this._processor = closeable;
        if (th instanceof wr) {
            this._location = ((wr) th).getLocation();
        } else if (closeable instanceof JsonParser) {
            this._location = ((JsonParser) closeable).getTokenLocation();
        }
    }

    public ym(Closeable closeable, String str, wq wqVar) {
        super(str, wqVar);
        this._processor = closeable;
    }

    public static ym from(JsonParser jsonParser, String str) {
        return new ym(jsonParser, str);
    }

    public static ym from(JsonParser jsonParser, String str, Throwable th) {
        return new ym(jsonParser, str, th);
    }

    public static ym from(JsonGenerator jsonGenerator, String str) {
        return new ym(jsonGenerator, str, (Throwable) null);
    }

    public static ym from(JsonGenerator jsonGenerator, String str, Throwable th) {
        return new ym(jsonGenerator, str, th);
    }

    public static ym from(DeserializationContext deserializationContext, String str) {
        return new ym(deserializationContext.getParser(), str);
    }

    public static ym from(DeserializationContext deserializationContext, String str, Throwable th) {
        return new ym(deserializationContext.getParser(), str, th);
    }

    public static ym from(SerializerProvider serializerProvider, String str) {
        return new ym(serializerProvider.getGenerator(), str);
    }

    public static ym from(SerializerProvider serializerProvider, String str, Throwable th) {
        return new ym(serializerProvider.getGenerator(), str, th);
    }

    public static ym fromUnexpectedIOE(IOException iOException) {
        return new ym((Closeable) null, String.format("Unexpected IOException (of type %s): %s", iOException.getClass().getName(), ahw.a((Throwable) iOException)));
    }

    public static ym wrapWithPath(Throwable th, Object obj, String str) {
        return wrapWithPath(th, new e(obj, str));
    }

    public static ym wrapWithPath(Throwable th, Object obj, int i) {
        return wrapWithPath(th, new e(obj, i));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    public static ym wrapWithPath(Throwable th, e eVar) {
        Closeable closeable;
        ym ymVar;
        if (th instanceof ym) {
            ymVar = (ym) th;
        } else {
            String strA = ahw.a(th);
            if (strA == null || strA.isEmpty()) {
                strA = "(was " + th.getClass().getName() + Constants.RIGHT_BRACKET_ONLY;
            }
            if (th instanceof wr) {
                Object processor = ((wr) th).getProcessor();
                if (processor instanceof Closeable) {
                    closeable = (Closeable) processor;
                } else {
                    closeable = null;
                }
            } else {
                closeable = null;
            }
            ymVar = new ym(closeable, strA, th);
        }
        ymVar.prependPath(eVar);
        return ymVar;
    }

    public List<e> getPath() {
        LinkedList<e> linkedList = this._path;
        if (linkedList == null) {
            return Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(linkedList);
    }

    public String getPathReference() {
        return getPathReference(new StringBuilder()).toString();
    }

    public StringBuilder getPathReference(StringBuilder sb) {
        _appendPathDesc(sb);
        return sb;
    }

    public void prependPath(Object obj, String str) {
        prependPath(new e(obj, str));
    }

    public void prependPath(Object obj, int i) {
        prependPath(new e(obj, i));
    }

    public void prependPath(e eVar) {
        if (this._path == null) {
            this._path = new LinkedList<>();
        }
        if (this._path.size() < 1000) {
            this._path.addFirst(eVar);
        }
    }

    @Override // defpackage.wr, com.fasterxml.jackson.core.JacksonException
    @JsonIgnore
    public Object getProcessor() {
        return this._processor;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return _buildMessage();
    }

    @Override // defpackage.wr, java.lang.Throwable
    public String getMessage() {
        return _buildMessage();
    }

    protected String _buildMessage() {
        String message = super.getMessage();
        if (this._path == null) {
            return message;
        }
        StringBuilder sb = message == null ? new StringBuilder() : new StringBuilder(message);
        sb.append(" (through reference chain: ");
        StringBuilder pathReference = getPathReference(sb);
        pathReference.append(g4.l);
        return pathReference.toString();
    }

    @Override // defpackage.wr, java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    protected void _appendPathDesc(StringBuilder sb) {
        LinkedList<e> linkedList = this._path;
        if (linkedList == null) {
            return;
        }
        Iterator<e> it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append("->");
            }
        }
    }
}
