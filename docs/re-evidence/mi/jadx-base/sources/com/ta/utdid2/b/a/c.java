package com.ta.utdid2.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import com.ta.utdid2.a.a.g;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private SharedPreferences f13a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private b f15a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private d f16a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10693b;
    private String c;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private Context mContext;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences.Editor f10692a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private b.a f14a = null;

    /* JADX WARN: Code duplicated, block: B:59:0x0137  */
    public c(Context context, String str, String str2, boolean z, boolean z2) throws Throwable {
        long j;
        long j2;
        this.g = false;
        this.h = false;
        String externalStorageState = null;
        this.f13a = null;
        this.f15a = null;
        this.f16a = null;
        this.f = z;
        this.i = z2;
        this.f10693b = str2;
        this.c = str;
        this.mContext = context;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
            this.f13a = sharedPreferences;
            j = sharedPreferences.getLong(DeviceTagInterface.CUSTOM_TAG_TYPE, 0L);
        } else {
            j = 0;
        }
        try {
            externalStorageState = Environment.getExternalStorageState();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (g.m204a(externalStorageState)) {
            this.h = false;
            this.g = false;
        } else if (externalStorageState.equals("mounted")) {
            this.h = true;
            this.g = true;
        } else if (externalStorageState.equals("mounted_ro")) {
            this.g = true;
            this.h = false;
        } else {
            this.h = false;
            this.g = false;
        }
        if ((!this.g && !this.h) || context == null || g.m204a(str)) {
            j2 = 0;
        } else {
            d dVarA = a(str);
            this.f16a = dVarA;
            if (dVarA != null) {
                try {
                    b bVarA = dVarA.a(str2, 0);
                    this.f15a = bVarA;
                    j2 = bVarA.getLong(DeviceTagInterface.CUSTOM_TAG_TYPE, 0L);
                    try {
                        if (z2) {
                            j = this.f13a.getLong("t2", 0L);
                            j2 = this.f15a.getLong("t2", 0L);
                            if (j < j2 && j > 0) {
                                a(this.f13a, this.f15a);
                                this.f15a = this.f16a.a(str2, 0);
                            } else if (j > j2 && j2 > 0) {
                                a(this.f15a, this.f13a);
                                this.f13a = context.getSharedPreferences(str2, 0);
                            } else if (j == 0 && j2 > 0) {
                                a(this.f15a, this.f13a);
                                this.f13a = context.getSharedPreferences(str2, 0);
                            } else if ((j2 == 0 && j > 0) || j == j2) {
                                a(this.f13a, this.f15a);
                                this.f15a = this.f16a.a(str2, 0);
                            }
                        } else if (j > j2) {
                            a(this.f13a, this.f15a);
                            this.f15a = this.f16a.a(str2, 0);
                        } else if (j < j2) {
                            a(this.f15a, this.f13a);
                            this.f13a = context.getSharedPreferences(str2, 0);
                        } else if (j == j2) {
                            a(this.f13a, this.f15a);
                            this.f15a = this.f16a.a(str2, 0);
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    j2 = 0;
                }
            } else {
                j2 = 0;
            }
        }
        if (j != j2 || (j == 0 && j2 == 0)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z3 = this.i;
            if (!z3 || (z3 && j == 0 && j2 == 0)) {
                SharedPreferences sharedPreferences2 = this.f13a;
                if (sharedPreferences2 != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                    editorEdit.putLong("t2", jCurrentTimeMillis);
                    editorEdit.commit();
                }
                try {
                    b bVar = this.f15a;
                    if (bVar != null) {
                        b.a aVarA = bVar.a();
                        aVarA.a("t2", jCurrentTimeMillis);
                        aVarA.commit();
                    }
                } catch (Exception unused3) {
                }
            }
        }
    }

    private d a(String str) {
        File fileM205a = m205a(str);
        if (fileM205a == null) {
            return null;
        }
        d dVar = new d(fileM205a.getAbsolutePath());
        this.f16a = dVar;
        return dVar;
    }

    private void b() throws Throwable {
        b bVar;
        SharedPreferences sharedPreferences;
        if (this.f10692a == null && (sharedPreferences = this.f13a) != null) {
            this.f10692a = sharedPreferences.edit();
        }
        if (this.h && this.f14a == null && (bVar = this.f15a) != null) {
            this.f14a = bVar.a();
        }
        c();
    }

    private boolean c() throws Throwable {
        b bVar = this.f15a;
        if (bVar == null) {
            return false;
        }
        boolean zB = bVar.b();
        if (!zB) {
            commit();
        }
        return zB;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    public boolean commit() throws Throwable {
        boolean z;
        String externalStorageState;
        Context context;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.f10692a;
        if (editor == null) {
            z = true;
        } else {
            if (!this.i && this.f13a != null) {
                editor.putLong(DeviceTagInterface.CUSTOM_TAG_TYPE, jCurrentTimeMillis);
            }
            if (this.f10692a.commit()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (this.f13a != null && (context = this.mContext) != null) {
            this.f13a = context.getSharedPreferences(this.f10693b, 0);
        }
        try {
            externalStorageState = Environment.getExternalStorageState();
        } catch (Exception e) {
            e.printStackTrace();
            externalStorageState = null;
        }
        if (!g.m204a(externalStorageState)) {
            if (externalStorageState.equals("mounted")) {
                if (this.f15a == null) {
                    d dVarA = a(this.c);
                    if (dVarA != null) {
                        b bVarA = dVarA.a(this.f10693b, 0);
                        this.f15a = bVarA;
                        if (this.i) {
                            a(bVarA, this.f13a);
                        } else {
                            a(this.f13a, bVarA);
                        }
                        this.f14a = this.f15a.a();
                    }
                } else {
                    try {
                        b.a aVar = this.f14a;
                        if (aVar != null && !aVar.commit()) {
                            z = false;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            if (externalStorageState.equals("mounted") || (externalStorageState.equals("mounted_ro") && this.f15a != null)) {
                try {
                    d dVar = this.f16a;
                    if (dVar != null) {
                        this.f15a = dVar.a(this.f10693b, 0);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        return z;
    }

    public String getString(String str) throws Throwable {
        c();
        SharedPreferences sharedPreferences = this.f13a;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!g.m204a(string)) {
                return string;
            }
        }
        b bVar = this.f15a;
        return bVar != null ? bVar.getString(str, "") : "";
    }

    public void putString(String str, String str2) throws Throwable {
        if (g.m204a(str) || str.equals(DeviceTagInterface.CUSTOM_TAG_TYPE)) {
            return;
        }
        b();
        SharedPreferences.Editor editor = this.f10692a;
        if (editor != null) {
            editor.putString(str, str2);
        }
        b.a aVar = this.f14a;
        if (aVar != null) {
            aVar.a(str, str2);
        }
    }

    public void remove(String str) throws Throwable {
        if (g.m204a(str) || str.equals(DeviceTagInterface.CUSTOM_TAG_TYPE)) {
            return;
        }
        b();
        SharedPreferences.Editor editor = this.f10692a;
        if (editor != null) {
            editor.remove(str);
        }
        b.a aVar = this.f14a;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private File m205a(String str) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return null;
        }
        File file = new File(String.format("%s%s%s", externalStorageDirectory.getAbsolutePath(), File.separator, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private void a(SharedPreferences sharedPreferences, b bVar) {
        b.a aVarA;
        if (sharedPreferences == null || bVar == null || (aVarA = bVar.a()) == null) {
            return;
        }
        aVarA.b();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                aVarA.a(key, (String) value);
            } else if (value instanceof Integer) {
                aVarA.a(key, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                aVarA.a(key, ((Long) value).longValue());
            } else if (value instanceof Float) {
                aVarA.a(key, ((Float) value).floatValue());
            } else if (value instanceof Boolean) {
                aVarA.a(key, ((Boolean) value).booleanValue());
            }
        }
        try {
            aVarA.commit();
        } catch (Exception unused) {
        }
    }

    private void a(b bVar, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit;
        if (bVar == null || sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.clear();
        for (Map.Entry<String, ?> entry : bVar.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                editorEdit.putString(key, (String) value);
            } else if (value instanceof Integer) {
                editorEdit.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                editorEdit.putLong(key, ((Long) value).longValue());
            } else if (value instanceof Float) {
                editorEdit.putFloat(key, ((Float) value).floatValue());
            } else if (value instanceof Boolean) {
                editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
            }
        }
        editorEdit.commit();
    }
}
