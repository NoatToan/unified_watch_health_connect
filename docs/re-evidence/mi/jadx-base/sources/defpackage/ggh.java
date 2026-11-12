package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public class ggh implements egh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Hashtable f18958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Vector f18959b;

    public ggh(Hashtable hashtable, Vector vector) {
        this.f18958a = hashtable;
        this.f18959b = vector;
    }

    public void a(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Object object = objectInputStream.readObject();
        if (object instanceof Hashtable) {
            this.f18958a = (Hashtable) object;
            this.f18959b = (Vector) objectInputStream.readObject();
        } else {
            rd rdVar = new rd((byte[]) object);
            while (true) {
                fe feVar = (fe) rdVar.s();
                if (feVar == null) {
                    return;
                } else {
                    setBagAttribute(feVar, rdVar.s());
                }
            }
        }
    }

    public void b(ObjectOutputStream objectOutputStream) throws IOException {
        if (this.f18959b.size() == 0) {
            objectOutputStream.writeObject(new Hashtable());
            objectOutputStream.writeObject(new Vector());
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        oe oeVar = new oe(byteArrayOutputStream);
        Enumeration bagAttributeKeys = getBagAttributeKeys();
        while (bagAttributeKeys.hasMoreElements()) {
            fe feVar = (fe) bagAttributeKeys.nextElement();
            oeVar.j(feVar);
            oeVar.j((gd) this.f18958a.get(feVar));
        }
        objectOutputStream.writeObject(byteArrayOutputStream.toByteArray());
    }

    @Override // defpackage.egh
    public gd getBagAttribute(fe feVar) {
        return (gd) this.f18958a.get(feVar);
    }

    @Override // defpackage.egh
    public Enumeration getBagAttributeKeys() {
        return this.f18959b.elements();
    }

    @Override // defpackage.egh
    public void setBagAttribute(fe feVar, gd gdVar) {
        if (this.f18958a.containsKey(feVar)) {
            this.f18958a.put(feVar, gdVar);
        } else {
            this.f18958a.put(feVar, gdVar);
            this.f18959b.addElement(feVar);
        }
    }

    public ggh() {
        this(new Hashtable(), new Vector());
    }
}
