package sa2;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.core.content.FileProvider;
import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.File;
import java.io.FileNotFoundException;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lsa2/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "reportName", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "a", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wa2.b f158317f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f158318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PdfRenderer f158320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PdfRenderer.Page f158321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ua2.c f158322e;

    static {
        new C2990a(null);
        f158317f = new wa2.b("PDFRenderer", null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, String str) {
        context.getClass();
        str.getClass();
        this.f158318a = context;
        this.f158319b = str;
        this.f158322e = (ua2.c) context;
    }

    public final void a(int i14) {
        PdfRenderer pdfRenderer = this.f158320c;
        if (pdfRenderer == null || this.f158321d == null || i14 < 0 || i14 >= pdfRenderer.getPageCount()) {
            return;
        }
        PdfRenderer.Page page = this.f158321d;
        if (page != null) {
            page.close();
        }
        PdfRenderer pdfRenderer2 = this.f158320c;
        this.f158321d = pdfRenderer2 != null ? pdfRenderer2.openPage(i14) : null;
        PdfRenderer pdfRenderer3 = this.f158320c;
        int pageCount = pdfRenderer3 != null ? pdfRenderer3.getPageCount() : -1;
        boolean z14 = i14 != 0;
        int i15 = i14 + 1;
        boolean z15 = i15 < pageCount;
        String str = this.f158319b + StringUtils.SPACE + i15 + "/" + pageCount;
        PdfRenderer.Page page2 = this.f158321d;
        int width = page2 != null ? page2.getWidth() : 0;
        PdfRenderer.Page page3 = this.f158321d;
        int height = page3 != null ? page3.getHeight() : 0;
        Context context = this.f158318a;
        float f14 = width;
        float f15 = height;
        float fMin = Math.min(context.getResources().getDisplayMetrics().widthPixels / f14, context.getResources().getDisplayMetrics().heightPixels / f15);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (f14 * fMin), (int) (f15 * fMin), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        new Canvas(bitmapCreateBitmap).drawColor(-1);
        PdfRenderer.Page page4 = this.f158321d;
        if (page4 != null) {
            page4.render(bitmapCreateBitmap, null, null, 1);
        }
        ua2.c cVar = this.f158322e;
        cVar.E1(bitmapCreateBitmap, str);
        cVar.u6(z14, z15);
    }

    public final void b() throws FileNotFoundException {
        wa2.b bVar = f158317f;
        bVar.getClass();
        Context context = this.f158318a;
        File file = new File(new ContextWrapper(context).getDir("Garmin_Reports", 0), this.f158319b);
        Uri uriD = null;
        if (file.exists()) {
            try {
                uriD = FileProvider.d(context, "com.garmin.android.exportablereports.provider", file);
            } catch (IllegalArgumentException unused) {
                bVar.a("Could not file report ID in the directory");
            }
        } else {
            bVar.a("Report file does not exists.");
        }
        if (uriD == null) {
            this.f158322e.Z4();
            return;
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uriD, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
        if (parcelFileDescriptorOpenFileDescriptor != null) {
            PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
            this.f158320c = pdfRenderer;
            this.f158321d = pdfRenderer.openPage(0);
        }
        a(0);
    }

    /* JADX INFO: renamed from: sa2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsa2/a$a;", "", "<init>", "()V", "Lwa2/b;", "logger", "Lwa2/b;", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2990a {
        public /* synthetic */ C2990a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2990a() {
        }
    }
}
