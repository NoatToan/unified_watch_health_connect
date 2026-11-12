package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseMessage;
import com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.FitDesign;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

/* JADX INFO: loaded from: classes20.dex */
public class xas extends BaseMessage {
    public xas() {
        this.mHead.f29168b = (short) 0;
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseData
    public DataOutputStream write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(0);
        for (FitDesign.d dVar : this.mFieldDefinitions) {
            if (dVar.f29167c == null) {
                LogUtil.j("FitFile_DataMessage", "fieldDefinition value is null fieldDefinition id ", Short.valueOf(dVar.d));
                c(dataOutputStream, dVar);
            } else {
                d(dataOutputStream, dVar);
            }
        }
        return dataOutputStream;
    }

    /* JADX INFO: renamed from: xas$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f52666b;

        static {
            int[] iArr = new int[FitDesign.FieldType.values().length];
            f52666b = iArr;
            try {
                iArr[FitDesign.FieldType.ENUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52666b[FitDesign.FieldType.UINT8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52666b[FitDesign.FieldType.SINT8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52666b[FitDesign.FieldType.BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52666b[FitDesign.FieldType.SINT16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52666b[FitDesign.FieldType.UINT16.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52666b[FitDesign.FieldType.SINT32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f52666b[FitDesign.FieldType.UINT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f52666b[FitDesign.FieldType.SINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f52666b[FitDesign.FieldType.UINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f52666b[FitDesign.FieldType.FLOAT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f52666b[FitDesign.FieldType.FLOAT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f52666b[FitDesign.FieldType.STRING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private void d(DataOutputStream dataOutputStream, FitDesign.d dVar) throws IOException {
        switch (AnonymousClass4.f52666b[dVar.e.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                dataOutputStream.writeByte((int) Math.round(((Number) dVar.f29167c).doubleValue()));
                return;
            case 5:
            case 6:
                dataOutputStream.writeShort((int) Math.round(((Number) dVar.f29167c).doubleValue()));
                return;
            case 7:
            case 8:
                dataOutputStream.writeInt((int) Math.round(((Number) dVar.f29167c).doubleValue()));
                return;
            case 9:
            case 10:
                dataOutputStream.writeLong(((Number) dVar.f29167c).longValue());
                return;
            case 11:
                dataOutputStream.writeFloat(((Number) dVar.f29167c).floatValue());
                break;
            case 12:
                break;
            case 13:
                if (dVar.f29167c instanceof String) {
                    dataOutputStream.write(a((String) dVar.f29167c));
                    return;
                } else {
                    LogUtil.j("FitFile_DataMessage", "fieldDefinition value type is not String");
                    return;
                }
            default:
                return;
        }
        dataOutputStream.writeDouble(((Number) dVar.f29167c).doubleValue());
    }

    private void c(DataOutputStream dataOutputStream, FitDesign.d dVar) throws IOException {
        switch (AnonymousClass4.f52666b[dVar.e.ordinal()]) {
            case 1:
                dataOutputStream.writeByte(xaw.f52668a.shortValue());
            case 2:
                dataOutputStream.writeByte(xaw.o.shortValue());
            case 3:
                dataOutputStream.writeByte(xaw.h.byteValue());
            case 4:
                dataOutputStream.writeByte(xaw.d.shortValue());
                break;
            case 5:
                dataOutputStream.writeShort(xaw.f52669b.shortValue());
            case 6:
                dataOutputStream.writeShort(xaw.i.intValue());
                break;
            case 7:
                dataOutputStream.writeInt(xaw.f.intValue());
            case 8:
                dataOutputStream.writeInt((int) xaw.j.longValue());
                break;
            case 9:
                dataOutputStream.writeLong(xaw.g.longValue());
            case 10:
                dataOutputStream.writeLong(xaw.k.longValue());
                break;
            case 11:
                dataOutputStream.writeFloat(xaw.e.floatValue());
            case 12:
                dataOutputStream.writeDouble(xaw.f52670c.doubleValue());
                break;
            case 13:
                dataOutputStream.writeByte(0);
                break;
        }
    }

    public void b(short s, int i, FitDesign.FieldType fieldType) {
        a(s, i, fieldType, 1.0d, 0.0d);
    }

    public void a(short s, int i, FitDesign.FieldType fieldType, double d, double d2) {
        this.mFieldDefinitions.add(new FitDesign.d(s, fieldType, Integer.valueOf(i), d, d2));
    }

    public void e(short s, float f, FitDesign.FieldType fieldType, double d, double d2) {
        this.mFieldDefinitions.add(new FitDesign.d(s, fieldType, Float.valueOf(f), d, d2));
    }

    public void b(short s, long j, FitDesign.FieldType fieldType) {
        b(s, j, fieldType, 1.0d, 0.0d);
    }

    public void b(short s, long j, FitDesign.FieldType fieldType, double d, double d2) {
        this.mFieldDefinitions.add(new FitDesign.d(s, fieldType, Long.valueOf(j), d, d2));
    }

    public void d(short s, String str, FitDesign.FieldType fieldType, double d, double d2) {
        this.mFieldDefinitions.add(new FitDesign.d(s, fieldType, str, d, d2));
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseMessage, com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseData
    public int getSize() {
        int size = this.mHead.getSize();
        Iterator<FitDesign.d> it = this.mFieldDefinitions.iterator();
        while (it.hasNext()) {
            size += it.next().getSize();
        }
        return size;
    }

    private byte[] a(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length == 32) {
            return bytes;
        }
        byte[] bArr = new byte[32];
        if (bytes.length > 32) {
            System.arraycopy(bytes, 0, bArr, 0, 32);
            return bArr;
        }
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        for (int length = bytes.length; length < 32; length++) {
            bArr[length] = 0;
        }
        return bArr;
    }
}
