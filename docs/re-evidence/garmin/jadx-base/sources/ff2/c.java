package ff2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.io.FileInputStream;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lff2/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f71140c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f71141d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f71142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f71143b;

    private c(Context context) {
        this.f71142a = context;
        String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        str = str == null ? "" : str;
        f71140c.getClass();
        f71141d = str;
        this.f71143b = new i(context);
    }

    public final void a(e23.l lVar, boolean z14) {
        i iVar = this.f71143b;
        iVar.getClass();
        iVar.b().debug("getActiveCampaign: ");
        ad0.f fVar = new ad0.f(iVar, lVar, z14, 5);
        iVar.b().debug("retrieveActiveCampaignsFromCache: ");
        ge1.b.T(iVar, null, null, new j(iVar, fVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x003f: MOVE (r3 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:8:0x003f */
    public final Bitmap b(long j8, kf2.c cVar) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        cVar.getClass();
        hf2.a.f83640a.getClass();
        Context context = this.f71142a;
        context.getClass();
        FileInputStream fileInputStream3 = null;
        try {
            try {
                File fileC = hf2.a.C1650a.c(context, hf2.a.C1650a.b(j8, cVar));
                fileInputStream = new FileInputStream(fileC);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
                    hf2.a.C1650a.e().debug("Success on parsing: " + fileC.getPath());
                    fileInputStream.close();
                    return bitmapDecodeStream;
                } catch (Exception e4) {
                    e = e4;
                    hf2.a.C1650a.e().error("Error loading image: " + e);
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream3 = fileInputStream2;
                if (fileInputStream3 != null) {
                    fileInputStream3.close();
                }
                throw th;
            }
        } catch (Exception e14) {
            e = e14;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            if (fileInputStream3 != null) {
                fileInputStream3.close();
            }
            throw th;
        }
    }

    public final void c(kf2.a aVar, long j8) {
        aVar.getClass();
        this.f71143b.e(aVar, j8);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lff2/c$a;", "Ldf2/d;", "Lff2/c;", "Landroid/content/Context;", "<init>", "()V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends df2.d<c, Context> {

        /* JADX INFO: renamed from: ff2.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class C1453a extends q implements e23.l<Context, c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1453a f71144a = new C1453a();

            public C1453a() {
                super(1, c.class, "<init>", "<init>(Landroid/content/Context;)V", 0);
            }

            @Override // e23.l
            public final c invoke(Context context) {
                Context context2 = context;
                context2.getClass();
                return new c(context2, null);
            }
        }

        private a() {
            super(C1453a.f71144a);
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public /* synthetic */ c(Context context, p005kotlin.jvm.internal.j jVar) {
        this(context);
    }
}
