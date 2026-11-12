package defpackage;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes21.dex */
public class abt extends FromStringDeserializer<UUID> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int[] f229a;
    private static final long serialVersionUID = 1;

    static {
        int[] iArr = new int[127];
        f229a = iArr;
        Arrays.fill(iArr, -1);
        for (int i = 0; i < 10; i++) {
            f229a[i + 48] = i;
        }
        for (int i2 = 0; i2 < 6; i2++) {
            int[] iArr2 = f229a;
            int i3 = i2 + 10;
            iArr2[i2 + 97] = i3;
            iArr2[i2 + 65] = i3;
        }
    }

    public abt() {
        super(UUID.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) {
        return new UUID(0L, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public UUID _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
        if (str.length() != 36) {
            if (str.length() == 24) {
                return c(wm.d().b(str), deserializationContext);
            }
            return d(str, deserializationContext);
        }
        if (str.charAt(8) != '-' || str.charAt(13) != '-' || str.charAt(18) != '-' || str.charAt(23) != '-') {
            d(str, deserializationContext);
        }
        return new UUID((a(str, 0, deserializationContext) << 32) + ((d(str, 9, deserializationContext) << 16) | ((long) d(str, 14, deserializationContext))), ((((long) a(str, 28, deserializationContext)) << 32) >>> 32) | (((long) (d(str, 24, deserializationContext) | (d(str, 19, deserializationContext) << 16))) << 32));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) throws IOException {
        if (obj instanceof byte[]) {
            return c((byte[]) obj, deserializationContext);
        }
        return (UUID) super._deserializeEmbedded(obj, deserializationContext);
    }

    private UUID d(String str, DeserializationContext deserializationContext) throws IOException {
        return (UUID) deserializationContext.handleWeirdStringValue(handledType(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
    }

    int a(String str, int i, DeserializationContext deserializationContext) throws ym {
        return (b(str, i, deserializationContext) << 24) + (b(str, i + 2, deserializationContext) << 16) + (b(str, i + 4, deserializationContext) << 8) + b(str, i + 6, deserializationContext);
    }

    int d(String str, int i, DeserializationContext deserializationContext) throws ym {
        return (b(str, i, deserializationContext) << 8) + b(str, i + 2, deserializationContext);
    }

    int b(String str, int i, DeserializationContext deserializationContext) throws ym {
        char cCharAt = str.charAt(i);
        int i2 = i + 1;
        char cCharAt2 = str.charAt(i2);
        if (cCharAt <= 127 && cCharAt2 <= 127) {
            int[] iArr = f229a;
            int i3 = iArr[cCharAt2] | (iArr[cCharAt] << 4);
            if (i3 >= 0) {
                return i3;
            }
        }
        if (cCharAt > 127 || f229a[cCharAt] < 0) {
            return a(str, i, deserializationContext, cCharAt);
        }
        return a(str, i2, deserializationContext, cCharAt2);
    }

    int a(String str, int i, DeserializationContext deserializationContext, char c2) throws ym {
        throw deserializationContext.weirdStringException(str, handledType(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(c2), Integer.toHexString(c2)));
    }

    private UUID c(byte[] bArr, DeserializationContext deserializationContext) throws ym {
        if (bArr.length != 16) {
            throw abs.b(deserializationContext.getParser(), "Can only construct UUIDs from byte[16]; got " + bArr.length + " bytes", bArr, handledType());
        }
        return new UUID(a(bArr, 0), a(bArr, 8));
    }

    private static long a(byte[] bArr, int i) {
        return ((((long) c(bArr, i + 4)) << 32) >>> 32) | (((long) c(bArr, i)) << 32);
    }

    private static int c(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (bArr[i] << Ascii.CAN) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
