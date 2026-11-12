package dm2;

import android.content.Context;
import com.google.maps.android.BuildConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class h extends com.garmin.android.library.backgroundtaskmanagement.b<i> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Logger f60468l;

    public h(com.garmin.android.library.backgroundtaskmanagement.b.a aVar, Context context, bm2.d dVar, String str, long j8, int i14, byte[] bArr, boolean z14, String str2, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z15, String str3) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.HIGH_PRIORITY, aVar);
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new i());
        Logger logger = LoggerFactory.getLogger("SaveDeviceOperation");
        this.f60468l = logger;
        StringBuilder sb3 = new StringBuilder("unitID:");
        sb3.append(dVar.getF172494b());
        sb3.append("\nproductNumber:");
        sb3.append(dVar.getF172495c());
        sb3.append("\nmacAddress:");
        sb3.append(dVar.f());
        sb3.append("\nproductDisplayName:");
        sb3.append(dVar.getF172496d());
        sb3.append("\nsoftwareVersion:");
        sb3.append(dVar.getF172497e());
        sb3.append("\nminAndroidVersionCode:");
        sb3.append(i14);
        sb3.append("\ndeviceConnectionType:");
        sb3.append(dVar.getConnectionType());
        sb3.append("\nisConnected:");
        sb3.append(z14);
        sb3.append("\n[commaDelimitedCategories:");
        String str4 = BuildConfig.TRAVIS;
        sb3.append(str2 != null ? str2 : BuildConfig.TRAVIS);
        sb3.append("]\ngarminDeviceXML:");
        sb3.append(bArr != null ? am.j.q(new StringBuilder(), bArr.length, " bytes") : BuildConfig.TRAVIS);
        sb3.append("\nGBLEEdiv:");
        sb3.append(bArr2 != null ? am.j.q(new StringBuilder(), bArr2.length, " bytes") : BuildConfig.TRAVIS);
        sb3.append("\nGBLERand:");
        sb3.append(bArr3 != null ? am.j.q(new StringBuilder(), bArr3.length, " bytes") : BuildConfig.TRAVIS);
        sb3.append("\nGBLELongTermKey:");
        sb3.append(bArr4 != null ? am.j.q(new StringBuilder(), bArr4.length, " bytes") : str4);
        sb3.append("\nisMultiLinkSupported:");
        sb3.append(dVar.isMultiLinkSupported());
        sb3.append("\ngarminDeviceXMLID: ");
        sb3.append(str3);
        logger.debug(sb3.toString());
        b(new j(this, dVar, str, j8, i14, bArr, z14, str2, bArr2, bArr3, bArr4, str3));
        b(new k(this, dVar.f(), false, bArr4, bArr2, bArr3));
        b(new e(this, false, dVar.getF172494b(), str2));
        b(new c(this, context.getApplicationContext(), false, str2));
    }
}
