package com.google.mlkit.common.internal.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzh;
import com.google.android.gms.internal.mlkit_common.zzi;
import com.google.android.gms.internal.mlkit_common.zzu;
import com.google.common.primitives.UnsignedBytes;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class ModelUtils {
    private static final GmsLogger zza = new GmsLogger("ModelUtils", "");

    @KeepForSdk
    public static abstract class AutoMLManifest {
        @KeepForSdk
        public abstract String getLabelsFile();

        @KeepForSdk
        public abstract String getModelFile();

        @KeepForSdk
        public abstract String getModelType();
    }

    @KeepForSdk
    public static abstract class ModelLoggingInfo {
        public static ModelLoggingInfo zza(long j8, String str, boolean z14) {
            return new AutoValue_ModelUtils_ModelLoggingInfo(j8, zzu.zzb(str), z14);
        }

        @KeepForSdk
        public abstract String getHash();

        @KeepForSdk
        public abstract long getSize();

        @KeepForSdk
        public abstract boolean isManifestModel();
    }

    private ModelUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @KeepForSdk
    public static ModelLoggingInfo getModelLoggingInfo(Context context, LocalModel localModel) throws Throwable {
        long length;
        String string;
        Throwable th3;
        IOException e4;
        InputStream inputStreamZzb;
        String strZzc;
        String assetFilePath = localModel.getAssetFilePath();
        String absoluteFilePath = localModel.getAbsoluteFilePath();
        Uri uri = localModel.getUri();
        InputStream inputStream = null;
        if (assetFilePath != null) {
            if (localModel.isManifestFile() && (assetFilePath = zzb(context, assetFilePath, true)) == null) {
                return null;
            }
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(assetFilePath);
                try {
                    length = assetFileDescriptorOpenFd.getLength();
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th4) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            } catch (IOException e14) {
                zza.e("ModelUtils", "Failed to open model file", e14);
                return null;
            }
        } else if (absoluteFilePath != null) {
            if (localModel.isManifestFile() && (absoluteFilePath = zzb(context, absoluteFilePath, false)) == null) {
                return null;
            }
            length = new File(absoluteFilePath).length();
        } else {
            if (uri == null) {
                zza.e("ModelUtils", "Local model doesn't have any valid path.");
                return null;
            }
            try {
                AssetFileDescriptor assetFileDescriptorZza = zzi.zza(context, uri, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
                try {
                    length = assetFileDescriptorZza.getLength();
                    assetFileDescriptorZza.close();
                } catch (Throwable th6) {
                    if (assetFileDescriptorZza != null) {
                        try {
                            assetFileDescriptorZza.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                    }
                    throw th6;
                }
            } catch (IOException e15) {
                zza.e("ModelUtils", "Failed to open model file", e15);
                return null;
            }
        }
        SharedPrefManager sharedPrefManager = (SharedPrefManager) MlKitContext.getInstance().get(SharedPrefManager.class);
        if (assetFilePath != null) {
            string = assetFilePath;
        } else {
            string = absoluteFilePath != null ? absoluteFilePath : ((Uri) Preconditions.checkNotNull(uri)).toString();
        }
        String strZzb = sharedPrefManager.zzb(string, length);
        if (strZzb != null) {
            return ModelLoggingInfo.zza(length, strZzb, localModel.isManifestFile());
        }
        try {
            if (assetFilePath != null) {
                inputStreamZzb = context.getAssets().open(assetFilePath);
            } else if (absoluteFilePath != null) {
                inputStreamZzb = new FileInputStream(new File(absoluteFilePath));
            } else {
                Uri uri2 = (Uri) Preconditions.checkNotNull(uri);
                int i14 = zzi.zza;
                inputStreamZzb = zzi.zzb(context, uri2, zzh.zza);
            }
            if (inputStreamZzb != null) {
                try {
                    try {
                        strZzc = zzc(inputStreamZzb);
                    } catch (IOException e16) {
                        e4 = e16;
                        zza.e("ModelUtils", "Failed to open model file", e4);
                        if (inputStreamZzb != null) {
                            try {
                                inputStreamZzb.close();
                            } catch (IOException e17) {
                                zza.e("ModelUtils", "Failed to close model file", e17);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th8) {
                    th3 = th8;
                    inputStream = inputStreamZzb;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e18) {
                            zza.e("ModelUtils", "Failed to close model file", e18);
                        }
                    }
                    throw th3;
                }
            } else {
                strZzc = null;
            }
            if (strZzc != null) {
                sharedPrefManager.zzc(string, length, strZzc);
            }
            ModelLoggingInfo modelLoggingInfoZza = ModelLoggingInfo.zza(length, strZzc, localModel.isManifestFile());
            if (inputStreamZzb != null) {
                try {
                    inputStreamZzb.close();
                    return modelLoggingInfoZza;
                } catch (IOException e19) {
                    zza.e("ModelUtils", "Failed to close model file", e19);
                }
            }
            return modelLoggingInfoZza;
        } catch (IOException e24) {
            e4 = e24;
            inputStreamZzb = null;
        } catch (Throwable th9) {
            th3 = th9;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th3;
        }
    }

    @KeepForSdk
    public static String getSHA256(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                String strZzc = zzc(fileInputStream);
                fileInputStream.close();
                return strZzc;
            } catch (Throwable th3) {
                try {
                    fileInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e4) {
            zza.e("ModelUtils", "Failed to create FileInputStream for model: ".concat(e4.toString()));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (new java.io.File(r6).exists() == false) goto L10;
     */
    @KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AutoMLManifest parseManifestFile(String str, boolean z14, Context context) {
        byte[] bArr;
        String strValueOf = String.valueOf(str);
        GmsLogger gmsLogger = zza;
        gmsLogger.d("ModelUtils", "Manifest file path: ".concat(strValueOf));
        if (z14) {
            try {
                InputStream inputStreamOpen = context.getAssets().open(str);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } catch (IOException unused) {
                zza.e("ModelUtils", "Manifest file does not exist.");
                return null;
            }
        }
        try {
            if (str.isEmpty()) {
                bArr = new byte[0];
            } else {
                InputStream inputStreamOpen2 = z14 ? context.getAssets().open(str) : new FileInputStream(new File(str));
                try {
                    int iAvailable = inputStreamOpen2.available();
                    byte[] bArr2 = new byte[iAvailable];
                    inputStreamOpen2.read(bArr2, 0, iAvailable);
                    inputStreamOpen2.close();
                    bArr = bArr2;
                } catch (Throwable th3) {
                    if (inputStreamOpen2 != null) {
                        try {
                            inputStreamOpen2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            String str2 = new String(bArr, "UTF-8");
            gmsLogger.d("ModelUtils", "Json string from the manifest file: ".concat(str2));
            JSONObject jSONObject = new JSONObject(str2);
            return new AutoValue_ModelUtils_AutoMLManifest(jSONObject.getString("modelType"), jSONObject.getString("modelFile"), jSONObject.getString("labelsFile"));
        } catch (IOException e4) {
            e = e4;
            zza.e("ModelUtils", "Error parsing the manifest file.", e);
            return null;
        } catch (JSONException e14) {
            e = e14;
            zza.e("ModelUtils", "Error parsing the manifest file.", e);
            return null;
        }
    }

    public static boolean zza(File file, String str) {
        String sha256 = getSHA256(file);
        zza.d("ModelUtils", "Calculated hash value is: ".concat(String.valueOf(sha256)));
        return str.equals(sha256);
    }

    private static String zzb(Context context, String str, boolean z14) {
        AutoMLManifest manifestFile = parseManifestFile(str, z14, context);
        if (manifestFile != null) {
            return new File(new File(str).getParent(), manifestFile.getModelFile()).toString();
        }
        zza.e("ModelUtils", "Failed to parse manifest file.");
        return null;
    }

    private static String zzc(InputStream inputStream) {
        int i14;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            byte[] bArr = new byte[ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES];
            while (true) {
                int i15 = inputStream.read(bArr);
                if (i15 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i15);
            }
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb3 = new StringBuilder();
            for (byte b14 : bArrDigest) {
                String hexString = Integer.toHexString(b14 & UnsignedBytes.MAX_VALUE);
                if (hexString.length() == 1) {
                    sb3.append('0');
                }
                sb3.append(hexString);
            }
            return sb3.toString();
        } catch (IOException unused) {
            zza.e("ModelUtils", "Failed to read model file");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            zza.e("ModelUtils", "Do not have SHA-256 algorithm");
            return null;
        }
    }
}
