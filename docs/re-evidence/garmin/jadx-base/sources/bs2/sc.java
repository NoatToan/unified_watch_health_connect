package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.fit.FitRuntimeException;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes11.dex */
public abstract class sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<Object> f20480a = new ArrayList<>();

    public sc(sc scVar) {
        if (scVar != null) {
            Iterator<Object> it = scVar.f20480a.iterator();
            while (it.hasNext()) {
                this.f20480a.add(it.next());
            }
        }
    }

    public static Object k(Integer num, Object obj) {
        HashMap<Integer, Object> map = sd.f20501u;
        if (map.get(num) != null) {
            HashMap<Integer, Object> map2 = sd.f20502v;
            if (map2.get(num) != null) {
                try {
                    BigDecimal bigDecimal = new BigDecimal(map.get(num).toString());
                    BigDecimal bigDecimal2 = new BigDecimal(map2.get(num).toString());
                    BigDecimal bigDecimal3 = new BigDecimal(obj.toString());
                    if (bigDecimal3.compareTo(bigDecimal) >= 0 && bigDecimal3.compareTo(bigDecimal2) <= 0) {
                        return obj;
                    }
                    return sd.f20500t.get(num);
                } catch (NumberFormatException unused) {
                    return sd.f20500t.get(num);
                }
            }
        }
        return obj;
    }

    public final void a(Double d14) {
        int i14 = i();
        if (i14 != 0) {
            if (i14 == 1) {
                this.f20480a.add(Byte.valueOf((byte) Math.round(d14.doubleValue())));
                return;
            }
            if (i14 != 2) {
                if (i14 == 7) {
                    this.f20480a.add(d14.toString());
                    return;
                }
                if (i14 != 10 && i14 != 13) {
                    if (i14 == 136) {
                        this.f20480a.add(d14);
                        return;
                    }
                    if (i14 == 137) {
                        this.f20480a.add(d14);
                        return;
                    }
                    if (i14 != 139) {
                        if (i14 != 140) {
                            switch (i14) {
                            }
                            return;
                        }
                        this.f20480a.add(Long.valueOf(Math.round(d14.doubleValue())));
                        return;
                    }
                    this.f20480a.add(Integer.valueOf((int) Math.round(d14.doubleValue())));
                    return;
                }
            }
        }
        this.f20480a.add(Short.valueOf((short) Math.round(d14.doubleValue())));
    }

    public final void b(Object obj) {
        if (!(obj instanceof Number) || i() != 7) {
            this.f20480a.add(obj);
            return;
        }
        Object objJ = j(null);
        String string = (objJ == null || sd.f20500t.get(Integer.valueOf(i())).equals(objJ)) ? null : objJ.toString();
        Number number = (Number) obj;
        if (string == null) {
            string = "";
        }
        StringBuilder sbK = i3.e5.k(string);
        sbK.append(String.valueOf((char) number.intValue()));
        m(sbK.toString(), null);
    }

    public abstract String c();

    public final Long d(int i14) {
        Object objJ = j(h(i14));
        if (objJ == null) {
            return null;
        }
        return Long.valueOf(((Number) objJ).longValue());
    }

    public abstract double e();

    public abstract double f();

    public final int g() {
        int i14 = i();
        if (i14 != 0 && i14 != 1 && i14 != 2) {
            int length = 0;
            if (i14 == 7) {
                Iterator<Object> it = this.f20480a.iterator();
                while (it.hasNext()) {
                    try {
                        length = it.next().toString().getBytes("UTF-8").length + 1 + length;
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return length;
            }
            if (i14 != 10 && i14 != 13 && i14 != 136 && i14 != 137 && i14 != 139 && i14 != 140) {
                switch (i14) {
                    case 131:
                    case 132:
                    case 133:
                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                        break;
                    default:
                        switch (i14) {
                            case 142:
                            case 143:
                            case SyslogConstants.LOG_LOCAL2 /* 144 */:
                                break;
                            default:
                                return 0;
                        }
                        break;
                }
            }
        }
        return this.f20480a.size() * sd.f20499s[i() & 31];
    }

    public abstract pw h(int i14);

    public abstract int i();

    public final Object j(pw pwVar) {
        double dF;
        double dE;
        if (this.f20480a.size() <= 0) {
            return null;
        }
        if (pwVar == null) {
            dF = f();
            dE = e();
        } else {
            dF = pwVar.f20411b;
            dE = pwVar.f20412c;
        }
        int i14 = pwVar == null ? i() : pwVar.f20410a;
        Object obj = this.f20480a.get(0);
        if (obj instanceof Number) {
            HashMap<Integer, Object> map = sd.f20500t;
            if (map.get(Integer.valueOf(i14)).equals(obj)) {
                return map.get(Integer.valueOf(i14));
            }
            if (dF != 1.0d || dE != 0.0d) {
                return Double.valueOf((((Number) obj).doubleValue() / dF) - dE);
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a4 A[Catch: IOException -> 0x012d, FALL_THROUGH, TryCatch #0 {IOException -> 0x012d, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0044, B:24:0x007d, B:25:0x0080, B:27:0x0085, B:40:0x010d, B:43:0x0119, B:28:0x0091, B:29:0x009b, B:30:0x00a4, B:32:0x00b2, B:34:0x00c8, B:35:0x00db, B:36:0x00e4, B:37:0x00ed, B:38:0x00f9, B:39:0x0102, B:45:0x0128), top: B:48:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2 A[Catch: IOException -> 0x012d, LOOP:1: B:31:0x00b0->B:32:0x00b2, LOOP_END, TryCatch #0 {IOException -> 0x012d, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0044, B:24:0x007d, B:25:0x0080, B:27:0x0085, B:40:0x010d, B:43:0x0119, B:28:0x0091, B:29:0x009b, B:30:0x00a4, B:32:0x00b2, B:34:0x00c8, B:35:0x00db, B:36:0x00e4, B:37:0x00ed, B:38:0x00f9, B:39:0x0102, B:45:0x0128), top: B:48:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8 A[Catch: IOException -> 0x012d, TryCatch #0 {IOException -> 0x012d, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0044, B:24:0x007d, B:25:0x0080, B:27:0x0085, B:40:0x010d, B:43:0x0119, B:28:0x0091, B:29:0x009b, B:30:0x00a4, B:32:0x00b2, B:34:0x00c8, B:35:0x00db, B:36:0x00e4, B:37:0x00ed, B:38:0x00f9, B:39:0x0102, B:45:0x0128), top: B:48:0x0000 }] */
    public final void l(ByteArrayInputStream byteArrayInputStream, int i14) {
        Object objValueOf;
        Long lValueOf;
        int i15;
        try {
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            if (i() == 7) {
                byte[] bArr = new byte[i14];
                byteArrayInputStream.read(bArr, 0, i14);
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                CharsetDecoder charsetDecoderNewDecoder = Charset.forName("UTF-8").newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
                charsetDecoderNewDecoder.onMalformedInput(codingErrorAction);
                charsetDecoderNewDecoder.onUnmappableCharacter(codingErrorAction);
                Arrays.stream(charsetDecoderNewDecoder.decode(byteBufferWrap).toString().split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)).forEach(new a73.o(this, 1));
                return;
            }
            int i16 = i();
            int i17 = sd.f20499s[i16 & 31];
            Object obj = sd.f20500t.get(Integer.valueOf(i16));
            boolean z14 = true;
            while (i14 > 0) {
                if (i16 == 0) {
                    objValueOf = Short.valueOf((short) (dataInputStream.readByte() & UnsignedBytes.MAX_VALUE));
                } else if (i16 == 1) {
                    objValueOf = Byte.valueOf(dataInputStream.readByte());
                } else if (i16 == 2 || i16 == 10 || i16 == 13) {
                    objValueOf = Short.valueOf((short) (dataInputStream.readByte() & UnsignedBytes.MAX_VALUE));
                } else if (i16 == 136) {
                    objValueOf = Float.valueOf(dataInputStream.readFloat());
                } else if (i16 == 137) {
                    objValueOf = Double.valueOf(dataInputStream.readDouble());
                } else if (i16 == 139) {
                    objValueOf = Integer.valueOf(((dataInputStream.readByte() & UnsignedBytes.MAX_VALUE) << 8) | (dataInputStream.readByte() & UnsignedBytes.MAX_VALUE));
                } else {
                    if (i16 != 140) {
                        switch (i16) {
                            case 131:
                                objValueOf = Short.valueOf(dataInputStream.readShort());
                                break;
                            case 132:
                                objValueOf = Integer.valueOf(((dataInputStream.readByte() & UnsignedBytes.MAX_VALUE) << 8) | (dataInputStream.readByte() & UnsignedBytes.MAX_VALUE));
                                break;
                            case 133:
                                objValueOf = Integer.valueOf(dataInputStream.readInt());
                                break;
                            default:
                                switch (i16) {
                                    case 142:
                                        break;
                                    case 143:
                                    case SyslogConstants.LOG_LOCAL2 /* 144 */:
                                        byte[] bArr2 = new byte[i17];
                                        dataInputStream.read(bArr2, 0, i17);
                                        objValueOf = new BigInteger(1, bArr2);
                                        break;
                                    default:
                                        break;
                                }
                            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                lValueOf = Long.valueOf(dataInputStream.readByte() & UnsignedBytes.MAX_VALUE);
                                for (i15 = 1; i15 < i17; i15++) {
                                    lValueOf = Long.valueOf((lValueOf.longValue() << 8) | ((long) (dataInputStream.readByte() & UnsignedBytes.MAX_VALUE)));
                                }
                                objValueOf = lValueOf;
                                break;
                        }
                        return;
                    }
                    lValueOf = Long.valueOf(dataInputStream.readByte() & UnsignedBytes.MAX_VALUE);
                    while (i15 < i17) {
                        lValueOf = Long.valueOf((lValueOf.longValue() << 8) | ((long) (dataInputStream.readByte() & UnsignedBytes.MAX_VALUE)));
                    }
                    objValueOf = lValueOf;
                }
                this.f20480a.add(objValueOf);
                if (!objValueOf.equals(obj)) {
                    z14 = false;
                }
                i14 -= sd.f20499s[i() & 31];
            }
            if (z14) {
                this.f20480a.clear();
            }
        } catch (IOException unused) {
        }
    }

    public final void m(Object obj, pw pwVar) {
        double dF;
        double dE;
        while (this.f20480a.size() <= 0) {
            b(new Object());
        }
        if (pwVar == null) {
            dF = f();
            dE = e();
        } else {
            dF = pwVar.f20411b;
            dE = pwVar.f20412c;
        }
        if (obj == null) {
            this.f20480a.set(0, null);
            return;
        }
        if (!(obj instanceof Number) || (dF == 1.0d && dE == 0.0d)) {
            boolean z14 = obj instanceof String;
            if (!z14 || !obj.equals("")) {
                if (!z14) {
                    this.f20480a.set(0, k(Integer.valueOf(i()), obj));
                    return;
                } else {
                    if (((String) obj).getBytes(StandardCharsets.UTF_8).length > 254) {
                        throw new FitRuntimeException(String.format("Invalid string size. Byte count can not be greater than %d bytes.", 254));
                    }
                    this.f20480a.set(0, obj);
                    return;
                }
            }
            int i14 = i();
            if (i14 != 0 && i14 != 1 && i14 != 2) {
                if (i14 == 7) {
                    this.f20480a.set(0, k(Integer.valueOf(i()), obj));
                    return;
                }
                if (i14 != 10 && i14 != 13 && i14 != 136 && i14 != 137 && i14 != 139 && i14 != 140) {
                    switch (i14) {
                        case 131:
                        case 132:
                        case 133:
                        case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                            break;
                        default:
                            switch (i14) {
                                case 142:
                                case 143:
                                case SyslogConstants.LOG_LOCAL2 /* 144 */:
                                    break;
                                default:
                                    return;
                            }
                            break;
                    }
                }
            }
            this.f20480a.set(0, sd.f20500t.get(Integer.valueOf(i())));
            return;
        }
        double dDoubleValue = (((Number) obj).doubleValue() + dE) * dF;
        int i15 = i();
        if (i15 != 0) {
            if (i15 == 1) {
                this.f20480a.set(0, k(Integer.valueOf(i()), Long.valueOf(Math.round(dDoubleValue))));
                return;
            }
            if (i15 != 2) {
                if (i15 == 7) {
                    this.f20480a.set(0, Double.valueOf(dDoubleValue).toString());
                    return;
                }
                if (i15 != 10) {
                    if (i15 == 13) {
                        this.f20480a.set(0, Long.valueOf(Math.round(dDoubleValue)));
                        return;
                    }
                    if (i15 == 136) {
                        this.f20480a.set(0, k(Integer.valueOf(i()), Double.valueOf(dDoubleValue)));
                        return;
                    }
                    if (i15 == 137) {
                        this.f20480a.set(0, k(Integer.valueOf(i()), Double.valueOf(dDoubleValue)));
                        return;
                    }
                    if (i15 != 139) {
                        if (i15 != 140) {
                            switch (i15) {
                                case 131:
                                    break;
                                case 132:
                                case 133:
                                    break;
                                case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                    break;
                                default:
                                    switch (i15) {
                                        case 142:
                                            break;
                                        case 143:
                                        case SyslogConstants.LOG_LOCAL2 /* 144 */:
                                            long jRound = Math.round(dDoubleValue);
                                            int i16 = sd.f20499s[i() & 31];
                                            byte[] bArr = new byte[i16];
                                            for (int i17 = 0; i17 < i16; i17++) {
                                                bArr[i17] = (byte) (jRound >>> (i17 * 8));
                                            }
                                            this.f20480a.set(0, k(Integer.valueOf(i()), new BigInteger(1, bArr)));
                                            return;
                                        default:
                                            return;
                                    }
                                    break;
                            }
                        }
                        this.f20480a.set(0, k(Integer.valueOf(i()), Long.valueOf(Math.round(dDoubleValue))));
                        return;
                    }
                    this.f20480a.set(0, k(Integer.valueOf(i()), Long.valueOf(Math.round(dDoubleValue))));
                    return;
                }
            }
        }
        this.f20480a.set(0, k(Integer.valueOf(i()), Long.valueOf(Math.round(dDoubleValue))));
    }

    public final void n(OutputStream outputStream, xc xcVar) {
        int iA = xcVar.a() - g();
        Iterator<Object> it = this.f20480a.iterator();
        while (it.hasNext()) {
            o(it.next(), outputStream);
        }
        while (iA > 0) {
            o(null, outputStream);
            iA -= sd.f20499s[i() & 31];
        }
    }

    public final void o(Object obj, OutputStream outputStream) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            if (obj != null) {
                int i14 = i();
                if (i14 != 0 && i14 != 1 && i14 != 2) {
                    if (i14 == 7) {
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
                        outputStreamWriter.write(obj.toString());
                        outputStreamWriter.flush();
                        outputStream.write(0);
                        return;
                    }
                    if (i14 != 10 && i14 != 13) {
                        if (i14 == 136) {
                            dataOutputStream.writeFloat(((Number) obj).floatValue());
                            return;
                        }
                        if (i14 == 137) {
                            dataOutputStream.writeDouble(((Number) obj).doubleValue());
                            return;
                        }
                        if (i14 != 139) {
                            if (i14 != 140) {
                                switch (i14) {
                                    case 131:
                                    case 132:
                                        break;
                                    case 133:
                                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                        break;
                                    default:
                                        switch (i14) {
                                            case 142:
                                            case 143:
                                            case SyslogConstants.LOG_LOCAL2 /* 144 */:
                                                dataOutputStream.writeLong(((Number) obj).longValue());
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                }
                            }
                            dataOutputStream.writeInt((int) Math.round(((Number) obj).doubleValue()));
                            return;
                        }
                        dataOutputStream.writeShort((int) Math.round(((Number) obj).doubleValue()));
                        return;
                    }
                }
                if (obj instanceof String) {
                    System.err.printf("Field.write(): Field %s value should not be string value %s\n", c(), obj);
                }
                dataOutputStream.writeByte((int) Math.round(((Number) obj).doubleValue()));
            }
            int i15 = i();
            if (i15 == 0) {
                dataOutputStream.writeByte(sd.f20483c.shortValue());
                return;
            }
            if (i15 == 1) {
                dataOutputStream.writeByte(sd.f20484d.byteValue());
                return;
            }
            if (i15 == 2) {
                dataOutputStream.writeByte(sd.f20485e.shortValue());
                return;
            }
            if (i15 == 7) {
                dataOutputStream.writeByte(0);
                return;
            }
            if (i15 == 10) {
                dataOutputStream.writeByte(sd.f20492l.shortValue());
                return;
            }
            if (i15 == 13) {
                dataOutputStream.writeByte(sd.f20495o.shortValue());
                return;
            }
            if (i15 == 136) {
                dataOutputStream.writeFloat(sd.f20490j.floatValue());
                return;
            }
            if (i15 == 137) {
                dataOutputStream.writeDouble(sd.f20491k.doubleValue());
                return;
            }
            if (i15 == 139) {
                dataOutputStream.writeShort(sd.f20493m.intValue());
                return;
            }
            if (i15 == 140) {
                dataOutputStream.writeInt((int) sd.f20494n.longValue());
                return;
            }
            switch (i15) {
                case 131:
                    dataOutputStream.writeShort(sd.f20486f.shortValue());
                    break;
                case 132:
                    dataOutputStream.writeShort(sd.f20487g.intValue());
                    break;
                case 133:
                    dataOutputStream.writeInt(sd.f20488h.intValue());
                    break;
                case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                    dataOutputStream.writeInt((int) sd.f20489i.longValue());
                    break;
                default:
                    switch (i15) {
                        case 142:
                            dataOutputStream.writeLong(sd.f20496p.longValue());
                            break;
                        case 143:
                            dataOutputStream.writeLong(sd.f20497q.longValue());
                            break;
                        case SyslogConstants.LOG_LOCAL2 /* 144 */:
                            dataOutputStream.writeLong(sd.f20498r.longValue());
                            break;
                        default:
                            break;
                    }
                    break;
            }
        } catch (IOException unused) {
        }
    }

    public sc() {
    }
}
