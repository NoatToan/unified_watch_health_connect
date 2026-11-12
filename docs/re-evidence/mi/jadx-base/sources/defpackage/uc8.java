package defpackage;

import io.sentry.q;
import io.sentry.r;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class uc8 implements jsc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f35614b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final eyc f35615a;

    public uc8(@NotNull eyc eycVar) {
        this.f35615a = eycVar;
    }

    @Override // defpackage.jsc
    @Nullable
    public jul a(@NotNull InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                int i3 = inputStream.read(bArr);
                if (i3 <= 0) {
                    break;
                }
                for (int i4 = 0; i2 == -1 && i4 < i3; i4++) {
                    if (bArr[i4] == 10) {
                        i2 = i + i4;
                        break;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, i3);
                i += i3;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i2 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        q qVarB = b(byteArray, 0, i2);
        if (qVarB == null) {
            throw new IllegalArgumentException("Envelope header is null.");
        }
        int i5 = i2 + 1;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i6 = i5;
            while (true) {
                if (i6 >= byteArray.length) {
                    i6 = -1;
                    break;
                }
                if (byteArray[i6] == 10) {
                    break;
                }
                i6++;
            }
            if (i6 == -1) {
                throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
            }
            r rVarC = c(byteArray, i5, i6 - i5);
            if (rVarC == null || rVarC.a() <= 0) {
                throw new IllegalArgumentException("Item header at index '" + arrayList.size() + "' is null or empty.");
            }
            int iA = rVarC.a() + i6;
            int i7 = iA + 1;
            if (i7 > byteArray.length) {
                throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i7 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
            }
            arrayList.add(new fvl(rVarC, Arrays.copyOfRange(byteArray, i6 + 1, i7)));
            if (i7 == byteArray.length) {
                break;
            }
            i5 = iA + 2;
            if (i5 == byteArray.length) {
                if (byteArray[i7] == 10) {
                    break;
                }
                throw new IllegalArgumentException("Envelope has invalid data following an item.");
            }
        }
        jul julVar = new jul(qVarB, arrayList);
        byteArrayOutputStream.close();
        return julVar;
    }

    @Nullable
    public final q b(@NotNull byte[] bArr, int i, int i2) {
        StringReader stringReader = new StringReader(new String(bArr, i, i2, f35614b));
        try {
            q qVar = (q) this.f35615a.b(stringReader, q.class);
            stringReader.close();
            return qVar;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Nullable
    public final r c(@NotNull byte[] bArr, int i, int i2) {
        StringReader stringReader = new StringReader(new String(bArr, i, i2, f35614b));
        try {
            r rVar = (r) this.f35615a.b(stringReader, r.class);
            stringReader.close();
            return rVar;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
