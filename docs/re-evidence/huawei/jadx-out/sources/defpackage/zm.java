package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes21.dex */
public class zm extends ym {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<zk> f54292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ReadableObjectId f54293c;

    public zm(JsonParser jsonParser, String str, wq wqVar, ReadableObjectId readableObjectId) {
        super(jsonParser, str, wqVar);
        this.f54293c = readableObjectId;
    }

    public zm(JsonParser jsonParser, String str) {
        super(jsonParser, str);
        this.f54292b = new ArrayList();
    }

    public ReadableObjectId e() {
        return this.f54293c;
    }

    public Object c() {
        return this.f54293c.c().f4068a;
    }

    public void d(Object obj, Class<?> cls, wq wqVar) {
        this.f54292b.add(new zk(obj, cls, wqVar));
    }

    @Override // defpackage.ym, defpackage.wr, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this.f54292b == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(message);
        Iterator<zk> it = this.f54292b.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        return sb.toString();
    }
}
