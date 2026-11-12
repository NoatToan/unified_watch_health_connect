package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import com.huami.network.hmnetwork.server.HMServerDef;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class PersistedInstallation {
    private static final String c = "PersistedInstallation";
    private static final String d = "Fid";
    private static final String e = "AuthToken";
    private static final String f = "RefreshToken";
    private static final String g = "TokenCreationEpochInSecs";
    private static final String h = "ExpiresInSecs";
    private static final String i = "Status";
    private static final String j = "FisError";
    private final File a;

    @NonNull
    private final FirebaseApp b;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(@NonNull FirebaseApp firebaseApp) {
        this.a = new File(firebaseApp.getApplicationContext().getFilesDir(), "PersistedInstallation." + firebaseApp.getPersistenceKey() + HMServerDef.RESPONSE_FORMAT);
        this.b = firebaseApp;
    }

    private JSONObject a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.a);
            while (true) {
                try {
                    int i2 = fileInputStream.read(bArr, 0, 16384);
                    if (i2 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public void clearForTesting() {
        this.a.delete();
    }

    @NonNull
    public PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(@NonNull PersistedInstallationEntry persistedInstallationEntry) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(d, persistedInstallationEntry.getFirebaseInstallationId());
            jSONObject.put("Status", persistedInstallationEntry.getRegistrationStatus().ordinal());
            jSONObject.put(e, persistedInstallationEntry.getAuthToken());
            jSONObject.put(f, persistedInstallationEntry.getRefreshToken());
            jSONObject.put(g, persistedInstallationEntry.getTokenCreationEpochInSecs());
            jSONObject.put(h, persistedInstallationEntry.getExpiresInSecs());
            jSONObject.put(j, persistedInstallationEntry.getFisError());
            File fileCreateTempFile = File.createTempFile(c, "tmp", this.b.getApplicationContext().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(this.a)) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return persistedInstallationEntry;
    }

    @NonNull
    public PersistedInstallationEntry readPersistedInstallationEntryValue() {
        JSONObject jSONObjectA = a();
        String strOptString = jSONObjectA.optString(d, null);
        int iOptInt = jSONObjectA.optInt("Status", RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectA.optString(e, null);
        String strOptString3 = jSONObjectA.optString(f, null);
        long jOptLong = jSONObjectA.optLong(g, 0L);
        long jOptLong2 = jSONObjectA.optLong(h, 0L);
        return PersistedInstallationEntry.builder().setFirebaseInstallationId(strOptString).setRegistrationStatus(RegistrationStatus.values()[iOptInt]).setAuthToken(strOptString2).setRefreshToken(strOptString3).setTokenCreationEpochInSecs(jOptLong).setExpiresInSecs(jOptLong2).setFisError(jSONObjectA.optString(j, null)).build();
    }
}
