package com.google.protobuf;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.a8p;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public final class TextFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f9577a = Logger.getLogger(TextFormat.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Parser f9578b = Parser.a().a();

    public static class InvalidEscapeSequenceException extends IOException {
        private static final long serialVersionUID = -8164033650142593304L;

        public InvalidEscapeSequenceException(String str) {
            super(str);
        }
    }

    public static class ParseException extends IOException {
        private static final long serialVersionUID = 3196188060225107702L;
        private final int column;
        private final int line;

        public ParseException(String str) {
            this(-1, -1, str);
        }

        public int getColumn() {
            return this.column;
        }

        public int getLine() {
            return this.line;
        }

        public ParseException(int i, int i2, String str) {
            super(Integer.toString(i) + ":" + i2 + ": " + str);
            this.line = i;
            this.column = i2;
        }
    }

    public static class Parser {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p1 f9579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9580b;
        public final boolean c;
        public final boolean d;
        public final SingularOverwritePolicy e;

        public enum SingularOverwritePolicy {
            ALLOW_SINGULAR_OVERWRITES,
            FORBID_SINGULAR_OVERWRITES
        }

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f9581a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f9582b = false;
            public boolean c = false;
            public SingularOverwritePolicy d = SingularOverwritePolicy.ALLOW_SINGULAR_OVERWRITES;
            public p1 e = p1.c();

            public Parser a() {
                return new Parser(this.e, this.f9581a, this.f9582b, this.c, this.d, null, null);
            }
        }

        public /* synthetic */ Parser(p1 p1Var, boolean z, boolean z2, boolean z3, SingularOverwritePolicy singularOverwritePolicy, m1 m1Var, a aVar) {
            this(p1Var, z, z2, z3, singularOverwritePolicy, m1Var);
        }

        public static a a() {
            return new a();
        }

        public Parser(p1 p1Var, boolean z, boolean z2, boolean z3, SingularOverwritePolicy singularOverwritePolicy, m1 m1Var) {
            this.f9579a = p1Var;
            this.f9580b = z;
            this.c = z2;
            this.d = z3;
            this.e = singularOverwritePolicy;
        }
    }

    public static class UnknownFieldParseException extends ParseException {
        private final String unknownField;

        public UnknownFieldParseException(String str) {
            this(-1, -1, "", str);
        }

        public String getUnknownField() {
            return this.unknownField;
        }

        public UnknownFieldParseException(int i, int i2, String str, String str2) {
            super(i, i2, str2);
            this.unknownField = str;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9584b;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            f9584b = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.SINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.SFIXED32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.INT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.SINT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.SFIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.DOUBLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.FIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.FIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.STRING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9584b[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[Descriptors.FieldDescriptor.JavaType.values().length];
            f9583a = iArr2;
            try {
                iArr2[Descriptors.FieldDescriptor.JavaType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9583a[Descriptors.FieldDescriptor.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9583a[Descriptors.FieldDescriptor.JavaType.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f9583a[Descriptors.FieldDescriptor.JavaType.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public static final class b {
        public static final b c = new b(true, p1.c());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f9585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p1 f9586b;

        public static class a implements Comparable<a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f9587a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public j0 f9588b;
            public final Descriptors.FieldDescriptor.JavaType c;

            public a(Object obj, Descriptors.FieldDescriptor fieldDescriptor) {
                if (obj instanceof j0) {
                    this.f9588b = (j0) obj;
                } else {
                    this.f9587a = obj;
                }
                this.c = b(fieldDescriptor);
            }

            public static Descriptors.FieldDescriptor.JavaType b(Descriptors.FieldDescriptor fieldDescriptor) {
                return fieldDescriptor.x().o().get(0).w();
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compareTo(a aVar) {
                if (d() == null || aVar.d() == null) {
                    TextFormat.f9577a.info("Invalid key for map field.");
                    return -1;
                }
                int i = a.f9583a[this.c.ordinal()];
                if (i == 1) {
                    return Boolean.compare(((Boolean) d()).booleanValue(), ((Boolean) aVar.d()).booleanValue());
                }
                if (i == 2) {
                    return Long.compare(((Long) d()).longValue(), ((Long) aVar.d()).longValue());
                }
                if (i == 3) {
                    return Integer.compare(((Integer) d()).intValue(), ((Integer) aVar.d()).intValue());
                }
                if (i != 4) {
                    return 0;
                }
                String str = (String) d();
                String str2 = (String) aVar.d();
                if (str == null && str2 == null) {
                    return 0;
                }
                if (str == null && str2 != null) {
                    return -1;
                }
                if (str == null || str2 != null) {
                    return str.compareTo(str2);
                }
                return 1;
            }

            public Object c() {
                j0 j0Var = this.f9588b;
                return j0Var != null ? j0Var : this.f9587a;
            }

            public Object d() {
                j0 j0Var = this.f9588b;
                if (j0Var != null) {
                    return j0Var.e();
                }
                return null;
            }
        }

        public b(boolean z, p1 p1Var) {
            this.f9585a = z;
            this.f9586b = p1Var;
        }

        public static void l(int i, int i2, List<?> list, c cVar) throws IOException {
            for (Object obj : list) {
                cVar.d(String.valueOf(i));
                cVar.d(": ");
                m(i2, obj, cVar);
                cVar.a();
            }
        }

        public static void m(int i, Object obj, c cVar) throws IOException {
            int iB = WireFormat.b(i);
            if (iB == 0) {
                cVar.d(TextFormat.r(((Long) obj).longValue()));
                return;
            }
            if (iB == 1) {
                cVar.d(String.format(null, "0x%016x", (Long) obj));
                return;
            }
            if (iB != 2) {
                if (iB == 3) {
                    n((r1) obj, cVar);
                    return;
                } else {
                    if (iB == 5) {
                        cVar.d(String.format(null, "0x%08x", (Integer) obj));
                        return;
                    }
                    throw new IllegalArgumentException("Bad tag: " + i);
                }
            }
            try {
                r1 r1VarJ = r1.j((ByteString) obj);
                cVar.d("{");
                cVar.a();
                cVar.b();
                n(r1VarJ, cVar);
                cVar.c();
                cVar.d("}");
            } catch (InvalidProtocolBufferException unused) {
                cVar.d("\"");
                cVar.d(TextFormat.d((ByteString) obj));
                cVar.d("\"");
            }
        }

        public static void n(r1 r1Var, c cVar) throws IOException {
            for (Map.Entry<Integer, r1.c> entry : r1Var.b().entrySet()) {
                int iIntValue = entry.getKey().intValue();
                r1.c value = entry.getValue();
                l(iIntValue, 0, value.s(), cVar);
                l(iIntValue, 5, value.l(), cVar);
                l(iIntValue, 1, value.m(), cVar);
                l(iIntValue, 2, value.p(), cVar);
                for (r1 r1Var2 : value.n()) {
                    cVar.d(entry.getKey().toString());
                    cVar.d(" {");
                    cVar.a();
                    cVar.b();
                    n(r1Var2, cVar);
                    cVar.c();
                    cVar.d("}");
                    cVar.a();
                }
            }
        }

        public final void b(s0 s0Var, c cVar) throws IOException {
            if (s0Var.getDescriptorForType().b().equals("google.protobuf.Any") && e(s0Var, cVar)) {
                return;
            }
            h(s0Var, cVar);
        }

        public void c(s0 s0Var, Appendable appendable) throws IOException {
            b(s0Var, TextFormat.i(appendable));
        }

        public void d(r1 r1Var, Appendable appendable) throws IOException {
            n(r1Var, TextFormat.i(appendable));
        }

        public final boolean e(s0 s0Var, c cVar) throws IOException {
            Descriptors.b descriptorForType = s0Var.getDescriptorForType();
            Descriptors.FieldDescriptor fieldDescriptorL = descriptorForType.l(1);
            Descriptors.FieldDescriptor fieldDescriptorL2 = descriptorForType.l(2);
            if (fieldDescriptorL != null && fieldDescriptorL.z() == Descriptors.FieldDescriptor.Type.STRING && fieldDescriptorL2 != null && fieldDescriptorL2.z() == Descriptors.FieldDescriptor.Type.BYTES) {
                String str = (String) s0Var.getField(fieldDescriptorL);
                if (str.isEmpty()) {
                    return false;
                }
                Object field = s0Var.getField(fieldDescriptorL2);
                try {
                    Descriptors.b bVarB = this.f9586b.b(str);
                    if (bVarB == null) {
                        return false;
                    }
                    p.b bVarI = p.e(bVarB).newBuilderForType();
                    bVarI.mergeFrom((ByteString) field);
                    cVar.d("[");
                    cVar.d(str);
                    cVar.d("] {");
                    cVar.a();
                    cVar.b();
                    b(bVarI, cVar);
                    cVar.c();
                    cVar.d("}");
                    cVar.a();
                    return true;
                } catch (InvalidProtocolBufferException unused) {
                }
            }
            return false;
        }

        public final void f(Descriptors.FieldDescriptor fieldDescriptor, Object obj, c cVar) throws IOException {
            if (!fieldDescriptor.C()) {
                if (!fieldDescriptor.isRepeated()) {
                    i(fieldDescriptor, obj, cVar);
                    return;
                }
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    i(fieldDescriptor, it.next(), cVar);
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                arrayList.add(new a(it2.next(), fieldDescriptor));
            }
            Collections.sort(arrayList);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                i(fieldDescriptor, ((a) it3.next()).c(), cVar);
            }
        }

        public final void g(Descriptors.FieldDescriptor fieldDescriptor, Object obj, c cVar) throws IOException {
            switch (a.f9584b[fieldDescriptor.z().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    cVar.d(((Integer) obj).toString());
                    break;
                case 4:
                case 5:
                case 6:
                    cVar.d(((Long) obj).toString());
                    break;
                case 7:
                    cVar.d(((Boolean) obj).toString());
                    break;
                case 8:
                    cVar.d(((Float) obj).toString());
                    break;
                case 9:
                    cVar.d(((Double) obj).toString());
                    break;
                case 10:
                case 11:
                    cVar.d(TextFormat.q(((Integer) obj).intValue()));
                    break;
                case 12:
                case 13:
                    cVar.d(TextFormat.r(((Long) obj).longValue()));
                    break;
                case 14:
                    cVar.d("\"");
                    cVar.d(this.f9585a ? a8p.e((String) obj) : TextFormat.f((String) obj).replace("\n", "\\n"));
                    cVar.d("\"");
                    break;
                case 15:
                    cVar.d("\"");
                    if (obj instanceof ByteString) {
                        cVar.d(TextFormat.d((ByteString) obj));
                    } else {
                        cVar.d(TextFormat.e((byte[]) obj));
                    }
                    cVar.d("\"");
                    break;
                case 16:
                    cVar.d(((Descriptors.e) obj).c());
                    break;
                case 17:
                case 18:
                    b((p0) obj, cVar);
                    break;
            }
        }

        public final void h(s0 s0Var, c cVar) throws IOException {
            for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : s0Var.getAllFields().entrySet()) {
                f(entry.getKey(), entry.getValue(), cVar);
            }
            n(s0Var.getUnknownFields(), cVar);
        }

        public final void i(Descriptors.FieldDescriptor fieldDescriptor, Object obj, c cVar) throws IOException {
            if (fieldDescriptor.B()) {
                cVar.d("[");
                if (fieldDescriptor.o().s().getMessageSetWireFormat() && fieldDescriptor.z() == Descriptors.FieldDescriptor.Type.MESSAGE && fieldDescriptor.D() && fieldDescriptor.s() == fieldDescriptor.x()) {
                    cVar.d(fieldDescriptor.x().b());
                } else {
                    cVar.d(fieldDescriptor.b());
                }
                cVar.d("]");
            } else if (fieldDescriptor.z() == Descriptors.FieldDescriptor.Type.GROUP) {
                cVar.d(fieldDescriptor.x().c());
            } else {
                cVar.d(fieldDescriptor.c());
            }
            Descriptors.FieldDescriptor.JavaType javaTypeW = fieldDescriptor.w();
            Descriptors.FieldDescriptor.JavaType javaType = Descriptors.FieldDescriptor.JavaType.MESSAGE;
            if (javaTypeW == javaType) {
                cVar.d(" {");
                cVar.a();
                cVar.b();
            } else {
                cVar.d(": ");
            }
            g(fieldDescriptor, obj, cVar);
            if (fieldDescriptor.w() == javaType) {
                cVar.c();
                cVar.d("}");
            }
            cVar.a();
        }

        public String j(s0 s0Var) {
            try {
                StringBuilder sb = new StringBuilder();
                c(s0Var, sb);
                return sb.toString();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public String k(r1 r1Var) {
            try {
                StringBuilder sb = new StringBuilder();
                d(r1Var, sb);
                return sb.toString();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Appendable f9589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StringBuilder f9590b;
        public final boolean c;
        public boolean d;

        public /* synthetic */ c(Appendable appendable, boolean z, a aVar) {
            this(appendable, z);
        }

        public void a() throws IOException {
            if (!this.c) {
                this.f9589a.append("\n");
            }
            this.d = true;
        }

        public void b() {
            this.f9590b.append("  ");
        }

        public void c() {
            int length = this.f9590b.length();
            if (length == 0) {
                throw new IllegalArgumentException(" Outdent() without matching Indent().");
            }
            this.f9590b.setLength(length - 2);
        }

        public void d(CharSequence charSequence) throws IOException {
            if (this.d) {
                this.d = false;
                this.f9589a.append(this.c ? " " : this.f9590b);
            }
            this.f9589a.append(charSequence);
        }

        public c(Appendable appendable, boolean z) {
            this.f9590b = new StringBuilder();
            this.d = false;
            this.f9589a = appendable;
            this.c = z;
        }
    }

    public static int c(byte b2) {
        if (48 > b2 || b2 > 57) {
            return (97 > b2 || b2 > 122) ? b2 - 55 : b2 - 87;
        }
        return b2 - 48;
    }

    public static String d(ByteString byteString) {
        return a8p.b(byteString);
    }

    public static String e(byte[] bArr) {
        return a8p.c(bArr);
    }

    public static String f(String str) {
        return a8p.d(str);
    }

    public static boolean g(byte b2) {
        return (48 <= b2 && b2 <= 57) || (97 <= b2 && b2 <= 102) || (65 <= b2 && b2 <= 70);
    }

    public static boolean h(byte b2) {
        return 48 <= b2 && b2 <= 55;
    }

    public static c i(Appendable appendable) {
        return new c(appendable, false, null);
    }

    public static int j(String str) throws NumberFormatException {
        return (int) l(str, true, false);
    }

    public static long k(String str) throws NumberFormatException {
        return l(str, true, true);
    }

    public static long l(String str, boolean z, boolean z2) throws NumberFormatException {
        int i;
        int i2 = 0;
        if (str.startsWith("-", 0)) {
            if (!z) {
                throw new NumberFormatException("Number must be positive: " + str);
            }
            i2 = 1;
        }
        int i3 = i2;
        if (str.startsWith("0x", i2)) {
            i2 += 2;
            i = 16;
        } else {
            i = str.startsWith("0", i2) ? 8 : 10;
        }
        String strSubstring = str.substring(i2);
        if (strSubstring.length() < 16) {
            long j = Long.parseLong(strSubstring, i);
            if (i3 != 0) {
                j = -j;
            }
            if (z2) {
                return j;
            }
            if (z) {
                if (j <= 2147483647L && j >= -2147483648L) {
                    return j;
                }
                throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
            }
            if (j < 4294967296L && j >= 0) {
                return j;
            }
            throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
        }
        BigInteger bigInteger = new BigInteger(strSubstring, i);
        if (i3 != 0) {
            bigInteger = bigInteger.negate();
        }
        if (z2) {
            if (z) {
                if (bigInteger.bitLength() > 63) {
                    throw new NumberFormatException("Number out of range for 64-bit signed integer: " + str);
                }
            } else if (bigInteger.bitLength() > 64) {
                throw new NumberFormatException("Number out of range for 64-bit unsigned integer: " + str);
            }
        } else if (z) {
            if (bigInteger.bitLength() > 31) {
                throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
            }
        } else if (bigInteger.bitLength() > 32) {
            throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
        }
        return bigInteger.longValue();
    }

    public static int m(String str) throws NumberFormatException {
        return (int) l(str, false, false);
    }

    public static long n(String str) throws NumberFormatException {
        return l(str, false, true);
    }

    public static b o() {
        return b.c;
    }

    public static ByteString p(CharSequence charSequence) throws InvalidEscapeSequenceException {
        int i;
        int i2;
        int length;
        int i3;
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8(charSequence.toString());
        int size = byteStringCopyFromUtf8.size();
        byte[] bArr = new byte[size];
        int i4 = 0;
        int i5 = 0;
        while (i4 < byteStringCopyFromUtf8.size()) {
            byte bByteAt = byteStringCopyFromUtf8.byteAt(i4);
            if (bByteAt == 92) {
                int i6 = i4 + 1;
                if (i6 >= byteStringCopyFromUtf8.size()) {
                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\' at end of string.");
                }
                byte bByteAt2 = byteStringCopyFromUtf8.byteAt(i6);
                if (h(bByteAt2)) {
                    int iC = c(bByteAt2);
                    int i7 = i4 + 2;
                    if (i7 < byteStringCopyFromUtf8.size() && h(byteStringCopyFromUtf8.byteAt(i7))) {
                        iC = (iC * 8) + c(byteStringCopyFromUtf8.byteAt(i7));
                        i6 = i7;
                    }
                    i4 = i6 + 1;
                    if (i4 >= byteStringCopyFromUtf8.size() || !h(byteStringCopyFromUtf8.byteAt(i4))) {
                        i4 = i6;
                    } else {
                        iC = (iC * 8) + c(byteStringCopyFromUtf8.byteAt(i4));
                    }
                    i3 = i5 + 1;
                    bArr[i5] = (byte) iC;
                } else {
                    if (bByteAt2 == 34) {
                        i = i5 + 1;
                        bArr[i5] = 34;
                    } else if (bByteAt2 != 39) {
                        if (bByteAt2 == 85) {
                            int i8 = i4 + 2;
                            i2 = i4 + 9;
                            if (i2 >= byteStringCopyFromUtf8.size()) {
                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                            }
                            int iC2 = 0;
                            int i9 = i8;
                            while (true) {
                                int i10 = i4 + 10;
                                if (i9 < i10) {
                                    byte bByteAt3 = byteStringCopyFromUtf8.byteAt(i9);
                                    if (!g(bByteAt3)) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                                    }
                                    iC2 = (iC2 << 4) | c(bByteAt3);
                                    i9++;
                                } else {
                                    if (!Character.isValidCodePoint(iC2)) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U" + byteStringCopyFromUtf8.substring(i8, i10).toStringUtf8() + "' is not a valid code point value");
                                    }
                                    Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iC2);
                                    if (unicodeBlockOf.equals(Character.UnicodeBlock.LOW_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES)) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U" + byteStringCopyFromUtf8.substring(i8, i10).toStringUtf8() + "' refers to a surrogate code unit");
                                    }
                                    byte[] bytes = new String(new int[]{iC2}, 0, 1).getBytes(StandardCharsets.UTF_8);
                                    System.arraycopy(bytes, 0, bArr, i5, bytes.length);
                                    length = bytes.length;
                                }
                            }
                        } else if (bByteAt2 == 92) {
                            i = i5 + 1;
                            bArr[i5] = 92;
                        } else if (bByteAt2 == 102) {
                            i = i5 + 1;
                            bArr[i5] = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                        } else if (bByteAt2 == 110) {
                            i = i5 + 1;
                            bArr[i5] = 10;
                        } else if (bByteAt2 == 114) {
                            i = i5 + 1;
                            bArr[i5] = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                        } else if (bByteAt2 == 120) {
                            int i11 = i4 + 2;
                            if (i11 >= byteStringCopyFromUtf8.size() || !g(byteStringCopyFromUtf8.byteAt(i11))) {
                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\x' with no digits");
                            }
                            int iC3 = c(byteStringCopyFromUtf8.byteAt(i11));
                            i4 += 3;
                            if (i4 >= byteStringCopyFromUtf8.size() || !g(byteStringCopyFromUtf8.byteAt(i4))) {
                                i4 = i11;
                            } else {
                                iC3 = (iC3 * 16) + c(byteStringCopyFromUtf8.byteAt(i4));
                            }
                            i3 = i5 + 1;
                            bArr[i5] = (byte) iC3;
                        } else if (bByteAt2 == 97) {
                            i = i5 + 1;
                            bArr[i5] = 7;
                        } else if (bByteAt2 != 98) {
                            switch (bByteAt2) {
                                case 116:
                                    i = i5 + 1;
                                    bArr[i5] = 9;
                                    break;
                                case 117:
                                    int i12 = i4 + 2;
                                    i2 = i4 + 5;
                                    if (i2 < byteStringCopyFromUtf8.size() && g(byteStringCopyFromUtf8.byteAt(i12))) {
                                        int i13 = i4 + 3;
                                        if (g(byteStringCopyFromUtf8.byteAt(i13))) {
                                            int i14 = i4 + 4;
                                            if (g(byteStringCopyFromUtf8.byteAt(i14)) && g(byteStringCopyFromUtf8.byteAt(i2))) {
                                                char c2 = (char) ((c(byteStringCopyFromUtf8.byteAt(i14)) << 4) | (c(byteStringCopyFromUtf8.byteAt(i12)) << 12) | (c(byteStringCopyFromUtf8.byteAt(i13)) << 8) | c(byteStringCopyFromUtf8.byteAt(i2)));
                                                if (Character.isSurrogate(c2)) {
                                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\u' refers to a surrogate");
                                                }
                                                byte[] bytes2 = Character.toString(c2).getBytes(StandardCharsets.UTF_8);
                                                System.arraycopy(bytes2, 0, bArr, i5, bytes2.length);
                                                length = bytes2.length;
                                                break;
                                            }
                                        }
                                    }
                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\u' with too few hex chars");
                                case 118:
                                    i = i5 + 1;
                                    bArr[i5] = 11;
                                    break;
                                default:
                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\" + ((char) bByteAt2) + '\'');
                            }
                        } else {
                            i = i5 + 1;
                            bArr[i5] = 8;
                        }
                        i5 += length;
                        i4 = i2;
                    } else {
                        i = i5 + 1;
                        bArr[i5] = HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT;
                    }
                    i5 = i;
                    i4 = i6;
                }
                i5 = i3;
            } else {
                bArr[i5] = bByteAt;
                i5++;
            }
            i4++;
        }
        return size == i5 ? ByteString.wrap(bArr) : ByteString.copyFrom(bArr, 0, i5);
    }

    public static String q(int i) {
        return i >= 0 ? Integer.toString(i) : Long.toString(((long) i) & 4294967295L);
    }

    public static String r(long j) {
        return j >= 0 ? Long.toString(j) : BigInteger.valueOf(j & Long.MAX_VALUE).setBit(63).toString();
    }
}
