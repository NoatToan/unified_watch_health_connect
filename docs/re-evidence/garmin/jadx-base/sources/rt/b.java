package rt;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.lifecycle.t1;
import androidx.lifecycle.w0;
import bu.f;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import d53.w;
import f12.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import rk0.n;
import tt.i;
import tt.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lrt/b;", "Lrt/a;", "Lf12/l;", "gcmUserSettings", "Lf12/b;", "gcmUserAccount", "<init>", "(Lf12/l;Lf12/b;)V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements rt.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f154490d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f154491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.b f154492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gson f154493c;

    static {
        new a(null);
    }

    public b(l lVar, f12.b bVar) {
        lVar.getClass();
        bVar.getClass();
        this.f154491a = lVar;
        this.f154492b = bVar;
        this.f154493c = new Gson();
    }

    @Override // rt.a
    public final void a(boolean z14) {
        this.f154491a.O2("KEY_ANNUAL_REPORT_CHAPTER_GENERATED_EVENT_SENT", z14);
    }

    @Override // rt.a
    public final void b(Context context, Bitmap bitmap, String str, String str2) throws IOException {
        OutputStream outputStreamOpenOutputStream;
        context.getClass();
        if (bitmap == null || str2 == null || w.J(str2)) {
            return;
        }
        File file = new File(context.getCacheDir(), "images/".concat(str));
        file.mkdirs();
        String strConcat = str2.concat(".png");
        try {
            outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(Uri.fromFile(new File(file, strConcat)));
        } catch (FileNotFoundException e4) {
            String str3 = "saveImage: Failed to open file=[" + strConcat + "]; Exception=[" + e4 + "].";
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "AnnualReportFeaturePreference", str3);
            outputStreamOpenOutputStream = null;
        }
        if (outputStreamOpenOutputStream != null) {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
            outputStreamOpenOutputStream.flush();
            outputStreamOpenOutputStream.close();
        }
    }

    @Override // rt.a
    public final j c() {
        String strA0 = this.f154491a.a0("KEY_ANNUAL_REPORT_PROCESSING_STATE");
        j.f166303a.getClass();
        return j.a.a(strA0);
    }

    @Override // rt.a
    public final void d(i iVar) {
        iVar.getClass();
        String string = LocalDate.now().toString();
        string.getClass();
        String strM = am.j.m("saveAnnualReportDTO: Cache local date: [", string, "]");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportFeaturePreference", strM);
        l lVar = this.f154491a;
        lVar.S("KEY_ANNUAL_REPORT_CACHE_LOCAL_DATE", string);
        String json = this.f154493c.toJson(iVar);
        i2.a.b(a2Var, "AnnualReportFeaturePreference", "saveAnnualReportDTO: Cache annual report dto json: [" + json + "]");
        json.getClass();
        lVar.S("KEY_ANNUAL_REPORT_CACHE", json);
    }

    @Override // rt.a
    public final w0 e() {
        return t1.a(this.f154491a.L4(), new n(21));
    }

    @Override // rt.a
    public final i f() {
        String fullName;
        f12.b bVar = this.f154492b;
        l lVar = this.f154491a;
        String strA4 = lVar.A4("KEY_ANNUAL_REPORT_CACHE", null);
        String strM = am.j.m("getAnnualReportDTO: Cached annual report dto json: [", strA4, "]");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportFeaturePreference", strM);
        if (strA4 != null) {
            try {
                i iVar = (i) this.f154493c.fromJson(strA4, i.class);
                if (g22.n.d(bVar.getUserFullName())) {
                    fullName = bVar.getUserFullName();
                } else {
                    tt.n coverPage = iVar.getCoverPage();
                    fullName = coverPage != null ? coverPage.getFullName() : null;
                }
                String strZ4 = lVar.z4("PROFILE");
                if (strZ4 == null) {
                    tt.n coverPage2 = iVar.getCoverPage();
                    strZ4 = coverPage2 != null ? coverPage2.getProfileImg() : null;
                }
                tt.n nVar = new tt.n(fullName, strZ4);
                iVar.getClass();
                return i.a(iVar, nVar);
            } catch (JsonSyntaxException e4) {
                String str = "getAnnualReportDTO: Unable to deserialize json=[" + strA4 + "]; Exception=[" + e4 + "]";
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var2, "AnnualReportFeaturePreference", str);
            }
        }
        return null;
    }

    @Override // rt.a
    public final Uri g(Context context, String str, String str2) throws IOException {
        context.getClass();
        str2.getClass();
        File file = new File(context.getCacheDir(), "images/".concat(str));
        file.mkdirs();
        String strConcat = str2.concat(".png");
        Uri uriFromFile = Uri.fromFile(new File(file, strConcat));
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriFromFile);
            if (inputStreamOpenInputStream == null) {
                return uriFromFile;
            }
            inputStreamOpenInputStream.close();
            return uriFromFile;
        } catch (FileNotFoundException e4) {
            String str3 = "getImage: Failed to open file=[" + strConcat + "]; Exception=[" + e4 + "].";
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "AnnualReportFeaturePreference", str3);
            return null;
        }
    }

    @Override // rt.a
    public final boolean h() {
        return this.f154491a.W2("KEY_ANNUAL_REPORT_CHAPTER_GENERATED_EVENT_SENT", false);
    }

    @Override // rt.a
    public final void i() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportFeaturePreference", "clearAnnualReportDTO");
        this.f154491a.E4("KEY_ANNUAL_REPORT_CACHE");
    }

    @Override // rt.a
    public final void j(j jVar) {
        jVar.getClass();
        this.f154491a.S("KEY_ANNUAL_REPORT_PROCESSING_STATE", jVar.name());
    }

    @Override // rt.a
    public final boolean k(Context context) {
        boolean zIsAfter;
        String strA4 = this.f154491a.A4("KEY_ANNUAL_REPORT_CACHE_LOCAL_DATE", null);
        String strM = am.j.m("isAnnualReportCacheExpired: Cached local date: [", strA4, "]");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportFeaturePreference", strM);
        if (strA4 != null) {
            LocalDate localDate = LocalDate.parse(strA4);
            LocalDate localDateNow = LocalDate.now();
            i2.a.b(a2Var, "AnnualReportFeaturePreference", "isAnnualReportCacheExpired: Current local date: [" + localDateNow + "]");
            zIsAfter = localDateNow.isAfter(localDate);
            i2.a.b(a2Var, "AnnualReportFeaturePreference", "isAnnualReportCacheExpired: Cached expired: [" + zIsAfter + "]");
        } else {
            zIsAfter = true;
        }
        if (zIsAfter) {
            f.f21180a.getClass();
            f.k(context);
        }
        return zIsAfter;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lrt/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_ANNUAL_REPORT_CACHE", "KEY_ANNUAL_REPORT_CACHE_LOCAL_DATE", "KEY_HAS_CLOSED_LOADING_SCREEN", "KEY_ANNUAL_REPORT_PROCESSING_STATE", "KEY_ANNUAL_REPORT_CHAPTER_GENERATED_EVENT_SENT", "IMAGE_FILE_EXTENSION", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
