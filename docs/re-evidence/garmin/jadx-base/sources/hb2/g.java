package hb2;

import android.content.Context;
import android.content.pm.PackageManager;
import com.garmin.android.connectiq.BuildConfig;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f82789a;

    public enum a {
        GARMIN_CONNECT_MOBILE("Garmin Connect Mobile", "com.garmin.android.apps.connectmobile"),
        GARMIN_GOLF("Garmin Golf", "com.garmin.android.apps.golf"),
        GARMIN_DIVE("Garmin Dive", "com.garmin.android.apps.dive"),
        GARMIN_VIRB("Garmin VIRB", "com.garmin.android.apps.virb"),
        GARMIN_CONNECT_IQ("Connect IQ", BuildConfig.ARTIFACT_GROUP_ID),
        GARMIN_DEZL("Garmin dēzl", "com.garmin.android.driveapp.dezl"),
        /* JADX INFO: Fake field, exist only in values array */
        GARMIN_DRIVE("Garmin Drive", "com.garmin.android.apps.gecko"),
        GARMIN_EXPLORE("Garmin Explore", "com.garmin.android.apps.explore"),
        GARMIN_MESSENGER("Garmin Messenger", "com.garmin.android.apps.messenger"),
        GARMIN_PILOT("Garmin Pilot", "com.digcy.pilot"),
        GARMIN_SHOTVIEW("Garmin ShotView", "com.garmin.android.apps.shotview"),
        AB_SYNAPSE_GARMIN("AB Synapse - Garmin", "com.ab.garmin.tactix"),
        AB_QUANTUM_GARMIN("AB Quantum", "com.appliedballisticsllc.appliedballistics"),
        /* JADX INFO: Fake field, exist only in values array */
        FACEBOOK("Facebook", "com.facebook.katana"),
        /* JADX INFO: Fake field, exist only in values array */
        TWITTER("Twitter", "com.twitter.android"),
        STRAVA("Strava", "com.strava");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82804a;

        a(String str, String str2) {
            this.f82804a = str2;
        }
    }

    public static synchronized String a(Context context) {
        if (f82789a == null) {
            File file = new File(context.getFilesDir(), "INSTALLATION");
            try {
                if (!file.exists()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(UUID.randomUUID().toString().getBytes());
                    fileOutputStream.close();
                }
                f82789a = c(file);
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
        return f82789a;
    }

    public static boolean b(Context context, a aVar) {
        try {
            context.getPackageManager().getApplicationInfo(aVar.f82804a, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
        byte[] bArr = new byte[(int) randomAccessFile.length()];
        randomAccessFile.readFully(bArr);
        randomAccessFile.close();
        return new String(bArr);
    }
}
