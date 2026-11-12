package defpackage;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class rwl extends h00 implements Externalizable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rc4 f32974b;
    public boolean c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f32976b;

        static {
            int[] iArr = new int[d.values().length];
            f32976b = iArr;
            try {
                iArr[d.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32976b[d.f32982b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32976b[d.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32976b[d.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32976b[d.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32976b[d.g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32976b[d.h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32976b[d.i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[c.values().length];
            f32975a = iArr2;
            try {
                iArr2[c.ORIGIN_DESCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32975a[c.ORIGIN_LINE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32975a[c.ORIGIN_END_LINE_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32975a[c.ORIGIN_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32975a[c.ORIGIN_URL.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f32975a[c.ORIGIN_COMMENTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f32975a[c.ORIGIN_NULL_URL.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f32975a[c.ORIGIN_NULL_COMMENTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f32975a[c.END_MARKER.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f32975a[c.ROOT_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f32975a[c.ROOT_WAS_CONFIG.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f32975a[c.VALUE_DATA.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f32975a[c.VALUE_ORIGIN.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f32975a[c.UNKNOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f32977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteArrayOutputStream f32978b;
        public final DataOutput c;

        public b(c cVar) {
            this.f32977a = cVar;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f32978b = byteArrayOutputStream;
            this.c = new DataOutputStream(byteArrayOutputStream);
        }
    }

    public enum c {
        UNKNOWN,
        END_MARKER,
        ROOT_VALUE,
        ROOT_WAS_CONFIG,
        VALUE_DATA,
        VALUE_ORIGIN,
        ORIGIN_DESCRIPTION,
        ORIGIN_LINE_NUMBER,
        ORIGIN_END_LINE_NUMBER,
        ORIGIN_TYPE,
        ORIGIN_URL,
        ORIGIN_COMMENTS,
        ORIGIN_NULL_URL,
        ORIGIN_NULL_COMMENTS;

        public static c a(int i) {
            return i < values().length ? values()[i] : UNKNOWN;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f32982b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final d f;
        public static final d g;
        public static final d h;
        public static final d i;
        public static final /* synthetic */ d[] j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConfigValueType f32983a;

        static {
            d dVar = new d("NULL", 0, ConfigValueType.NULL);
            f32982b = dVar;
            d dVar2 = new d("BOOLEAN", 1, ConfigValueType.BOOLEAN);
            c = dVar2;
            ConfigValueType configValueType = ConfigValueType.NUMBER;
            d dVar3 = new d("INT", 2, configValueType);
            d = dVar3;
            d dVar4 = new d("LONG", 3, configValueType);
            e = dVar4;
            d dVar5 = new d("DOUBLE", 4, configValueType);
            f = dVar5;
            d dVar6 = new d("STRING", 5, ConfigValueType.STRING);
            g = dVar6;
            d dVar7 = new d("LIST", 6, ConfigValueType.LIST);
            h = dVar7;
            d dVar8 = new d("OBJECT", 7, ConfigValueType.OBJECT);
            i = dVar8;
            j = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8};
        }

        public d(String str, int i2, ConfigValueType configValueType) {
            super(str, i2);
            this.f32983a = configValueType;
        }

        public static d a(int i2) {
            if (i2 < values().length) {
                return values()[i2];
            }
            return null;
        }

        public static d b(rc4 rc4Var) {
            ConfigValueType configValueTypeValueType = rc4Var.valueType();
            if (configValueTypeValueType != ConfigValueType.NUMBER) {
                for (d dVar : values()) {
                    if (dVar.f32983a == configValueTypeValueType) {
                        return dVar;
                    }
                }
            } else {
                if (rc4Var instanceof cc4) {
                    return d;
                }
                if (rc4Var instanceof ec4) {
                    return e;
                }
                if (rc4Var instanceof sb4) {
                    return f;
                }
            }
            throw new ConfigException.BugOrBroken("don't know how to serialize " + rc4Var);
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) j.clone();
        }
    }

    public rwl() {
        super(null);
    }

    public static c h0(DataInput dataInput) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte != c.UNKNOWN.ordinal()) {
            return c.a(unsignedByte);
        }
        throw new IOException("field code " + unsignedByte + " is not supposed to be on the wire");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0007 A[SYNTHETIC] */
    public static ocm i0(DataInput dataInput, ocm ocmVar) throws IOException {
        Object utf;
        EnumMap enumMap = new EnumMap(c.class);
        while (true) {
            c cVarH0 = h0(dataInput);
            switch (a.f32975a[cVarH0.ordinal()]) {
                case 1:
                    dataInput.readInt();
                    utf = dataInput.readUTF();
                    if (utf != null) {
                        enumMap.put(cVarH0, utf);
                    }
                    break;
                case 2:
                    dataInput.readInt();
                    utf = Integer.valueOf(dataInput.readInt());
                    if (utf != null) {
                        enumMap.put(cVarH0, utf);
                    }
                    break;
                case 3:
                    dataInput.readInt();
                    utf = Integer.valueOf(dataInput.readInt());
                    if (utf != null) {
                        enumMap.put(cVarH0, utf);
                    }
                    break;
                case 4:
                    dataInput.readInt();
                    utf = Integer.valueOf(dataInput.readUnsignedByte());
                    if (utf != null) {
                        enumMap.put(cVarH0, utf);
                    }
                    break;
                case 5:
                    dataInput.readInt();
                    utf = dataInput.readUTF();
                    if (utf != null) {
                        enumMap.put(cVarH0, utf);
                    }
                    break;
                case 6:
                    dataInput.readInt();
                    int i = dataInput.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList.add(dataInput.readUTF());
                    }
                    utf = arrayList;
                    if (utf != null) {
                        enumMap.put(cVarH0, utf);
                    }
                    break;
                case 7:
                case 8:
                    dataInput.readInt();
                    utf = "";
                    if (utf != null) {
                        enumMap.put(cVarH0, utf);
                    }
                    break;
                case 9:
                    return ocm.h(ocmVar, enumMap);
                case 10:
                case 11:
                case 12:
                case 13:
                    throw new IOException("Not expecting this field here: " + cVarH0);
                case 14:
                    m0(dataInput);
                default:
                    utf = null;
                    if (utf != null) {
                        enumMap.put(cVarH0, utf);
                    }
                    break;
            }
        }
    }

    public static h00 j0(DataInput dataInput, ocm ocmVar) throws IOException {
        h00 h00VarK0 = null;
        ocm ocmVarI0 = null;
        while (true) {
            c cVarH0 = h0(dataInput);
            if (cVarH0 == c.END_MARKER) {
                if (h00VarK0 != null) {
                    return h00VarK0;
                }
                throw new IOException("No value data found in serialization of value");
            }
            if (cVarH0 == c.VALUE_DATA) {
                if (ocmVarI0 == null) {
                    throw new IOException("Origin must be stored before value data");
                }
                dataInput.readInt();
                h00VarK0 = k0(dataInput, ocmVarI0);
            } else if (cVarH0 == c.VALUE_ORIGIN) {
                dataInput.readInt();
                ocmVarI0 = i0(dataInput, ocmVar);
            } else {
                m0(dataInput);
            }
        }
    }

    public static h00 k0(DataInput dataInput, ocm ocmVar) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        d dVarA = d.a(unsignedByte);
        if (dVarA == null) {
            throw new IOException("Unknown serialized value type: " + unsignedByte);
        }
        int i = 0;
        switch (a.f32976b[dVarA.ordinal()]) {
            case 1:
                return new ob4(ocmVar, dataInput.readBoolean());
            case 2:
                return new gc4(ocmVar);
            case 3:
                return new cc4(ocmVar, dataInput.readInt(), dataInput.readUTF());
            case 4:
                return new ec4(ocmVar, dataInput.readLong(), dataInput.readUTF());
            case 5:
                return new sb4(ocmVar, dataInput.readDouble(), dataInput.readUTF());
            case 6:
                return new qc4(ocmVar, dataInput.readUTF());
            case 7:
                int i2 = dataInput.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (i < i2) {
                    arrayList.add(j0(dataInput, ocmVar));
                    i++;
                }
                return new mcm(ocmVar, arrayList);
            case 8:
                int i3 = dataInput.readInt();
                HashMap map = new HashMap(i3);
                while (i < i3) {
                    map.put(dataInput.readUTF(), j0(dataInput, ocmVar));
                    i++;
                }
                return new ncm(ocmVar, map);
            default:
                throw new IOException("Unhandled serialized value type: " + dVarA);
        }
    }

    public static ConfigException l0() {
        return new ConfigException.BugOrBroken(rwl.class.getName() + " should not exist outside of serialization");
    }

    public static void m0(DataInput dataInput) throws IOException {
        int i = dataInput.readInt();
        int iSkipBytes = dataInput.skipBytes(i);
        if (iSkipBytes < i) {
            dataInput.readFully(new byte[i - iSkipBytes]);
        }
    }

    public static void n0(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(c.END_MARKER.ordinal());
    }

    public static void o0(DataOutput dataOutput, b bVar) throws IOException {
        byte[] byteArray = bVar.f32978b.toByteArray();
        dataOutput.writeByte(bVar.f32977a.ordinal());
        dataOutput.writeInt(byteArray.length);
        dataOutput.write(byteArray);
    }

    public static void p0(DataOutput dataOutput, ocm ocmVar, ocm ocmVar2) throws IOException {
        for (Map.Entry<c, Object> entry : (ocmVar != null ? ocmVar.y(ocmVar2) : Collections.emptyMap()).entrySet()) {
            b bVar = new b(entry.getKey());
            q0(bVar.c, bVar.f32977a, entry.getValue());
            o0(dataOutput, bVar);
        }
        n0(dataOutput);
    }

    public static void q0(DataOutput dataOutput, c cVar, Object obj) throws IOException {
        switch (a.f32975a[cVar.ordinal()]) {
            case 1:
                dataOutput.writeUTF((String) obj);
                return;
            case 2:
                dataOutput.writeInt(((Integer) obj).intValue());
                return;
            case 3:
                dataOutput.writeInt(((Integer) obj).intValue());
                return;
            case 4:
                dataOutput.writeByte(((Integer) obj).intValue());
                return;
            case 5:
                dataOutput.writeUTF((String) obj);
                return;
            case 6:
                List list = (List) obj;
                dataOutput.writeInt(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dataOutput.writeUTF((String) it.next());
                }
                return;
            case 7:
            case 8:
                return;
            default:
                throw new IOException("Unhandled field from origin: " + cVar);
        }
    }

    public static void r0(DataOutput dataOutput, rc4 rc4Var, ocm ocmVar) throws IOException {
        b bVar = new b(c.VALUE_ORIGIN);
        p0(bVar.c, (ocm) rc4Var.g(), ocmVar);
        o0(dataOutput, bVar);
        b bVar2 = new b(c.VALUE_DATA);
        s0(bVar2.c, rc4Var);
        o0(dataOutput, bVar2);
        n0(dataOutput);
    }

    private Object readResolve() throws ObjectStreamException {
        return this.c ? ((ic4) this.f32974b).r() : this.f32974b;
    }

    public static void s0(DataOutput dataOutput, rc4 rc4Var) throws IOException {
        d dVarB = d.b(rc4Var);
        dataOutput.writeByte(dVarB.ordinal());
        switch (a.f32976b[dVarB.ordinal()]) {
            case 1:
                dataOutput.writeBoolean(((ob4) rc4Var).x().booleanValue());
                break;
            case 3:
                dataOutput.writeInt(((cc4) rc4Var).m0().intValue());
                dataOutput.writeUTF(((hc4) rc4Var).c0());
                break;
            case 4:
                dataOutput.writeLong(((ec4) rc4Var).x().longValue());
                dataOutput.writeUTF(((hc4) rc4Var).c0());
                break;
            case 5:
                dataOutput.writeDouble(((sb4) rc4Var).x().doubleValue());
                dataOutput.writeUTF(((hc4) rc4Var).c0());
                break;
            case 6:
                dataOutput.writeUTF(((qc4) rc4Var).x());
                break;
            case 7:
                dc4 dc4Var = (dc4) rc4Var;
                dataOutput.writeInt(dc4Var.size());
                Iterator<rc4> it = dc4Var.iterator();
                while (it.hasNext()) {
                    r0(dataOutput, it.next(), (ocm) dc4Var.g());
                }
                break;
            case 8:
                ic4 ic4Var = (ic4) rc4Var;
                dataOutput.writeInt(ic4Var.size());
                for (Map.Entry<String, rc4> entry : ic4Var.entrySet()) {
                    dataOutput.writeUTF(entry.getKey());
                    r0(dataOutput, entry.getValue(), (ocm) ic4Var.g());
                }
                break;
        }
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public rwl T(jc4 jc4Var) {
        throw l0();
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        while (true) {
            c cVarH0 = h0(objectInput);
            if (cVarH0 == c.END_MARKER) {
                return;
            }
            if (cVarH0 == c.ROOT_VALUE) {
                objectInput.readInt();
                this.f32974b = j0(objectInput, null);
            } else if (cVarH0 == c.ROOT_WAS_CONFIG) {
                objectInput.readInt();
                this.c = objectInput.readBoolean();
            } else {
                m0(objectInput);
            }
        }
    }

    @Override // defpackage.rc4
    public ConfigValueType valueType() {
        throw l0();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        if (((h00) this.f32974b).Z() != iqk.RESOLVED) {
            throw new NotSerializableException("tried to serialize a value with unresolved substitutions, need to Config#resolve() first, see API docs");
        }
        b bVar = new b(c.ROOT_VALUE);
        r0(bVar.c, this.f32974b, null);
        o0(objectOutput, bVar);
        b bVar2 = new b(c.ROOT_WAS_CONFIG);
        bVar2.c.writeBoolean(this.c);
        o0(objectOutput, bVar2);
        n0(objectOutput);
    }

    @Override // defpackage.rc4
    public Object x() {
        throw l0();
    }

    public rwl(rc4 rc4Var) {
        this();
        this.f32974b = rc4Var;
        this.c = false;
    }

    public rwl(nb4 nb4Var) {
        this(nb4Var.w());
        this.c = true;
    }
}
