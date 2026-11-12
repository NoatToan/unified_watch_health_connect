package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.proto.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class mam implements m1e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f25951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25952b;

    public mam(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f25952b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f25951a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f25951a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // defpackage.m1e
    public void a(a aVar) throws IOException {
        if (!this.f25951a.putString(this.f25952b, j7c.b(aVar.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // defpackage.m1e
    public void b(ea8 ea8Var) throws IOException {
        if (!this.f25951a.putString(this.f25952b, j7c.b(ea8Var.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
