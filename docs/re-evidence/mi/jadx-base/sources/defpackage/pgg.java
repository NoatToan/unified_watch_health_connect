package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pgg implements qpe, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    @Override // defpackage.qpe
    public String getName() {
        return this.name;
    }

    public Object readResolve() throws ObjectStreamException {
        return aqe.g(getName());
    }
}
