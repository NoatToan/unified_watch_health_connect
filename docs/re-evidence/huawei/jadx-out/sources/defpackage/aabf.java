package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.HelloExtension;

/* JADX INFO: loaded from: classes20.dex */
public final class aabf {
    private final List<HelloExtension> e = new ArrayList();

    boolean d() {
        return this.e.isEmpty();
    }

    public int a() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return b() + 2;
    }

    public int b() {
        Iterator<HelloExtension> it = this.e.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().getLength();
        }
        return length;
    }

    public void b(HelloExtension helloExtension) {
        if (helloExtension != null) {
            if (d(helloExtension.getType()) == null) {
                this.e.add(helloExtension);
                return;
            }
            throw new IllegalArgumentException("Hello Extension of type " + helloExtension.getType() + " already added!");
        }
    }

    public <T extends HelloExtension> T d(HelloExtension.ExtensionType extensionType) {
        if (extensionType == null) {
            throw new NullPointerException("Extension type must not be null!");
        }
        Iterator<HelloExtension> it = this.e.iterator();
        T t = null;
        while (it.hasNext()) {
            T t2 = (T) it.next();
            if (extensionType.equals(t2.getType())) {
                return t2;
            }
            if (extensionType.equals(t2.getType().getReplacementType())) {
                t = t2;
            }
        }
        return t;
    }

    public List<HelloExtension> e() {
        return Collections.unmodifiableList(this.e);
    }

    public String d(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(zzp.d(i));
        sb.append("Extensions Length: ");
        sb.append(b());
        sb.append(" bytes");
        sb.append(zzp.c());
        Iterator<HelloExtension> it = this.e.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString(i + 1));
        }
        return sb.toString();
    }

    public String toString() {
        return d(0);
    }

    public void e(zzl zzlVar) {
        if (this.e.isEmpty()) {
            return;
        }
        zzlVar.d(b(), 16);
        Iterator<HelloExtension> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().writeTo(zzlVar);
        }
    }

    public void e(zzf zzfVar) throws aaay {
        if (zzfVar.d()) {
            try {
                zzf zzfVarD = zzfVar.d(zzfVar.a(16));
                while (zzfVarD.d()) {
                    HelloExtension from = HelloExtension.readFrom(zzfVarD);
                    if (from != null) {
                        if (d(from.getType()) == null) {
                            b(from);
                        } else {
                            throw new aaay("Hello message contains extension " + from.getType() + " more than once!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECODE_ERROR));
                        }
                    }
                }
            } catch (IllegalArgumentException e) {
                throw new aaay("Hello message contained malformed extensions, " + e.getMessage(), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECODE_ERROR));
            }
        }
    }
}
