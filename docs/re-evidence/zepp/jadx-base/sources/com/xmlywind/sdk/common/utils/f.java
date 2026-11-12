package com.xmlywind.sdk.common.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.xmlywind.logger.SigmobLog;
import java.util.Calendar;

/* JADX INFO: loaded from: classes22.dex */
public class f {
    private com.xmlywind.sdk.common.utils.a a;
    private final Context b;
    private a c;
    private boolean d;
    private boolean e;
    private c f;

    public interface a {
        void a(com.xmlywind.sdk.common.utils.a aVar, com.xmlywind.sdk.common.utils.a aVar2);
    }

    public class b extends AsyncTask<Void, Void, Void> {
        private b() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            f.this.c();
            f.this.d = false;
            return null;
        }
    }

    public interface c {
        void a();
    }

    public f(Context context, a aVar) {
        m.a.a(context);
        this.b = context;
        this.c = aVar;
        com.xmlywind.sdk.common.utils.a aVarA = a(context);
        this.a = aVarA;
        if (aVarA == null) {
            this.a = com.xmlywind.sdk.common.utils.a.a();
        }
        b();
    }

    private static com.xmlywind.sdk.common.utils.a a(Context context) {
        com.xmlywind.sdk.common.utils.a aVar;
        synchronized (f.class) {
            m.a.a(context);
            Calendar calendar = Calendar.getInstance();
            try {
                SharedPreferences sharedPreferencesA = p.a(context, "com.Sigmob.settings.identifier");
                String string = sharedPreferencesA.getString("privacy.identifier.ifa", "");
                String string2 = sharedPreferencesA.getString("privacy.identifier.Sigmob", "");
                aVar = (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) ? null : new com.xmlywind.sdk.common.utils.a(string, string2, sharedPreferencesA.getBoolean("privacy.limit.ad.tracking", false), sharedPreferencesA.getLong("privacy.identifier.time", calendar.getTimeInMillis()));
            } catch (Throwable unused) {
                SigmobLog.e("Cannot read identifier from shared preferences");
            }
        }
        return aVar;
    }

    private static void a(Context context, com.xmlywind.sdk.common.utils.a aVar) {
        synchronized (f.class) {
            m.a.a(context);
            m.a.a(aVar);
            SharedPreferences.Editor editorEdit = p.a(context, "com.Sigmob.settings.identifier").edit();
            editorEdit.putBoolean("privacy.limit.ad.tracking", aVar.d);
            editorEdit.putString("privacy.identifier.ifa", aVar.b);
            editorEdit.putString("privacy.identifier.Sigmob", aVar.c);
            editorEdit.putLong("privacy.identifier.time", aVar.a.getTimeInMillis());
            editorEdit.apply();
        }
    }

    private void a(com.xmlywind.sdk.common.utils.a aVar) {
        com.xmlywind.sdk.common.utils.a aVar2 = this.a;
        this.a = aVar;
        a(this.b, aVar);
        if (!this.a.equals(aVar2) || !this.e) {
            a(aVar2, this.a);
        }
        if (this.e) {
            return;
        }
        d();
    }

    private void a(com.xmlywind.sdk.common.utils.a aVar, com.xmlywind.sdk.common.utils.a aVar2) {
        m.a.a(aVar2);
        a aVar3 = this.c;
        if (aVar3 != null) {
            aVar3.a(aVar, aVar2);
        }
    }

    private void a(String str, String str2, boolean z, long j) {
        m.a.a(str);
        m.a.a(str2);
        a(new com.xmlywind.sdk.common.utils.a(str, str2, z, j));
    }

    private void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        new b().execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        l.b bVarA;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (e()) {
            try {
                bVarA = l.a(this.b);
            } catch (Throwable unused) {
                bVarA = null;
            }
            if (bVarA != null) {
                com.xmlywind.sdk.common.utils.a aVar = this.a;
                if (bVarA.a && aVar.c()) {
                    a(bVarA.b, com.xmlywind.sdk.common.utils.a.b(), bVarA.a, timeInMillis);
                } else {
                    a(bVarA.b, aVar.c, bVarA.a, aVar.a.getTimeInMillis());
                }
            }
        }
    }

    private void d() {
        c cVar = this.f;
        if (cVar != null) {
            cVar.a();
            this.f = null;
        }
        this.e = true;
    }

    private boolean e() {
        return true;
    }

    public com.xmlywind.sdk.common.utils.a a() {
        com.xmlywind.sdk.common.utils.a aVar = this.a;
        b();
        return aVar;
    }
}
