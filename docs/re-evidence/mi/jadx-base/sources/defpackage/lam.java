package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.proto.a;
import com.google.crypto.tink.shaded.protobuf.l;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class lam implements l1e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f24835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24836b;

    public lam(Context context, String str, String str2) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f24836b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f24835a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.f24835a = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    @Override // defpackage.l1e
    public ea8 a() throws IOException {
        return ea8.H(b(), l.b());
    }

    public final byte[] b() throws IOException {
        try {
            String string = this.f24835a.getString(this.f24836b, null);
            if (string != null) {
                return j7c.a(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.f24836b));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.f24836b));
        }
    }

    @Override // defpackage.l1e
    public a read() throws IOException {
        return a.M(b(), l.b());
    }
}
