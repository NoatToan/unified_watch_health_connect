package com.google.android.gms.iid;

import a7.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzn {
    private static void zzd(Context context, String str, zzo zzoVar) {
        try {
            File fileZzj = zzj(context, str);
            fileZzj.createNewFile();
            Properties properties = new Properties();
            properties.setProperty("pub", zzoVar.zzq());
            properties.setProperty("pri", zzoVar.zzr());
            properties.setProperty("cre", String.valueOf(zzoVar.zzcc));
            FileOutputStream fileOutputStream = new FileOutputStream(fileZzj);
            try {
                properties.store(fileOutputStream, (String) null);
                zzd((Throwable) null, fileOutputStream);
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    zzd(th3, fileOutputStream);
                    throw th4;
                }
            }
        } catch (IOException e4) {
            new StringBuilder(String.valueOf(e4).length() + 21);
        }
    }

    private final void zze(Context context, String str, zzo zzoVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (zzoVar.equals(zzd(sharedPreferences, str))) {
                return;
            }
        } catch (zzp unused) {
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(zzak.zzh(str, "|P|"), zzoVar.zzq());
        editorEdit.putString(zzak.zzh(str, "|K|"), zzoVar.zzr());
        editorEdit.putString(zzak.zzh(str, "cre"), String.valueOf(zzoVar.zzcc));
        editorEdit.commit();
    }

    private static KeyPair zzg(String str, String str2) throws zzp {
        try {
            byte[] bArrDecode = Base64.decode(str, 8);
            byte[] bArrDecode2 = Base64.decode(str2, 8);
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(bArrDecode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArrDecode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e4) {
                new StringBuilder(String.valueOf(e4).length() + 19);
                throw new zzp(e4);
            }
        } catch (IllegalArgumentException e14) {
            throw new zzp(e14);
        }
    }

    private final zzo zzh(Context context, String str) throws zzp {
        try {
            zzo zzoVarZzi = zzi(context, str);
            if (zzoVarZzi != null) {
                zze(context, str, zzoVarZzi);
                return zzoVarZzi;
            }
            e = null;
        } catch (zzp e4) {
            e = e4;
        }
        try {
            zzo zzoVarZzd = zzd(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
            if (zzoVarZzd != null) {
                zzd(context, str, zzoVarZzd);
                return zzoVarZzd;
            }
        } catch (zzp e14) {
            e = e14;
        }
        if (e == null) {
            return null;
        }
        throw e;
    }

    private final zzo zzi(Context context, String str) throws zzp {
        File fileZzj = zzj(context, str);
        if (!fileZzj.exists()) {
            return null;
        }
        try {
            return zzd(fileZzj);
        } catch (IOException e4) {
            if (Log.isLoggable("InstanceID", 3)) {
                new StringBuilder(String.valueOf(e4).length() + 40);
            }
            try {
                return zzd(fileZzj);
            } catch (IOException e14) {
                new StringBuilder(String.valueOf(e14).length() + 45);
                throw new zzp(e14);
            }
        }
    }

    private static File zzj(Context context, String str) {
        String string;
        if (TextUtils.isEmpty(str)) {
            string = "com.google.InstanceId.properties";
        } else {
            try {
                String strEncodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb3 = new StringBuilder(String.valueOf(strEncodeToString).length() + 33);
                sb3.append("com.google.InstanceId_");
                sb3.append(strEncodeToString);
                sb3.append(".properties");
                string = sb3.toString();
            } catch (UnsupportedEncodingException e4) {
                h.q(e4);
                return null;
            }
        }
        return new File(zzj(context), string);
    }

    public final zzo zzf(Context context, String str) {
        zzo zzoVar = new zzo(zzd.zzl(), System.currentTimeMillis());
        try {
            zzo zzoVarZzh = zzh(context, str);
            if (zzoVarZzh != null) {
                return zzoVarZzh;
            }
        } catch (zzp unused) {
        }
        zzd(context, str, zzoVar);
        zze(context, str, zzoVar);
        return zzoVar;
    }

    public static void zzg(Context context, String str) {
        File fileZzj = zzj(context, str);
        if (fileZzj.exists()) {
            fileZzj.delete();
        }
    }

    public static void zzi(Context context) {
        for (File file : zzj(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    private static File zzj(Context context) {
        File noBackupFilesDir = b.getNoBackupFilesDir(context);
        return (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) ? context.getFilesDir() : noBackupFilesDir;
    }

    public final zzo zze(Context context, String str) throws zzp {
        zzo zzoVarZzh = zzh(context, str);
        return zzoVarZzh != null ? zzoVarZzh : zzf(context, str);
    }

    private static long zze(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(zzak.zzh(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    private static zzo zzd(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String property = properties.getProperty("pub");
            String property2 = properties.getProperty("pri");
            if (property != null && property2 != null) {
                try {
                    zzo zzoVar = new zzo(zzg(property, property2), Long.parseLong(properties.getProperty("cre")));
                    zzd((Throwable) null, fileInputStream);
                    return zzoVar;
                } catch (NumberFormatException e4) {
                    throw new zzp(e4);
                }
            }
            zzd((Throwable) null, fileInputStream);
            return null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                zzd(th3, fileInputStream);
                throw th4;
            }
        }
    }

    private static zzo zzd(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(zzak.zzh(str, "|P|"), null);
        String string2 = sharedPreferences.getString(zzak.zzh(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new zzo(zzg(string, string2), zze(sharedPreferences, str));
    }

    private static /* synthetic */ void zzd(Throwable th3, FileOutputStream fileOutputStream) throws IOException {
        if (th3 == null) {
            fileOutputStream.close();
            return;
        }
        try {
            fileOutputStream.close();
        } catch (Throwable th4) {
            com.google.android.gms.internal.gcm.zzq.zzd(th3, th4);
        }
    }

    private static /* synthetic */ void zzd(Throwable th3, FileInputStream fileInputStream) throws IOException {
        if (th3 == null) {
            fileInputStream.close();
            return;
        }
        try {
            fileInputStream.close();
        } catch (Throwable th4) {
            com.google.android.gms.internal.gcm.zzq.zzd(th3, th4);
        }
    }
}
