package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public class hgh implements fgh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Hashtable f20049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Vector f20050b;

    public hgh() {
        this(new Hashtable(), new Vector());
    }

    public void a(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Object object = objectInputStream.readObject();
        if (object instanceof Hashtable) {
            this.f20049a = (Hashtable) object;
            this.f20050b = (Vector) objectInputStream.readObject();
        } else {
            ud udVar = new ud((byte[]) object);
            while (true) {
                ee eeVar = (ee) udVar.s();
                if (eeVar == null) {
                    return;
                } else {
                    setBagAttribute(eeVar, udVar.s());
                }
            }
        }
    }

    public void b(ObjectOutputStream objectOutputStream) throws IOException {
        if (this.f20050b.size() == 0) {
            objectOutputStream.writeObject(new Hashtable());
            objectOutputStream.writeObject(new Vector());
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ke keVar = new ke(byteArrayOutputStream);
        Enumeration bagAttributeKeys = getBagAttributeKeys();
        while (bagAttributeKeys.hasMoreElements()) {
            ee eeVar = (ee) bagAttributeKeys.nextElement();
            keVar.j(eeVar);
            keVar.j((hd) this.f20049a.get(eeVar));
        }
        objectOutputStream.writeObject(byteArrayOutputStream.toByteArray());
    }

    @Override // defpackage.fgh
    public hd getBagAttribute(ee eeVar) {
        return (hd) this.f20049a.get(eeVar);
    }

    @Override // defpackage.fgh
    public Enumeration getBagAttributeKeys() {
        return this.f20050b.elements();
    }

    @Override // defpackage.fgh
    public void setBagAttribute(ee eeVar, hd hdVar) {
        if (this.f20049a.containsKey(eeVar)) {
            this.f20049a.put(eeVar, hdVar);
        } else {
            this.f20049a.put(eeVar, hdVar);
            this.f20050b.addElement(eeVar);
        }
    }

    public hgh(Hashtable hashtable, Vector vector) {
        this.f20049a = hashtable;
        this.f20050b = vector;
    }
}
