package z70;

import android.content.Context;
import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import o4.v0;
import org.joda.time.DateTime;
import org.joda.time.Days;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lz70/c;", "Lz70/y;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f202782a;

    static {
        new a(null);
    }

    public c(Context context) {
        context.getClass();
        this.f202782a = context;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    @Override // z70.y
    public final void a() {
        i53.c cVarE;
        File[] fileArrListFiles;
        zp0.e.f206587a.getClass();
        Context context = this.f202782a;
        File dir = context.getDir("promotionImages", 0);
        if (dir.exists() && dir.isDirectory() && (fileArrListFiles = dir.listFiles()) != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    arrayList.add(file);
                }
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((File) it.next()).getName());
            }
            cVarE = i53.a.e(arrayList2);
            if (cVarE == null) {
                cVarE = i53.a.e(p13.j0.f134944a);
            }
        } else {
            cVarE = i53.a.e(p13.j0.f134944a);
        }
        ArrayList<String> arrayList3 = new ArrayList();
        for (Object obj : cVarE) {
            String str = (String) obj;
            zp0.e.f206587a.getClass();
            str.getClass();
            File file2 = new File(context.getDir("promotionImages", 0), str);
            if (file2.exists() && Days.daysBetween(new DateTime(file2.lastModified()), DateTime.now()).getDays() >= 7) {
                arrayList3.add(obj);
            }
        }
        for (String str2 : arrayList3) {
            a2 a2Var = a2.PROMOTIONS;
            String strN = fb1.c.n("Deleting old image ", str2);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DefaultPromosImageStorage", strN);
            zp0.e.f206587a.getClass();
            str2.getClass();
            File file3 = new File(context.getDir("promotionImages", 0), str2);
            if (file3.exists()) {
                file3.delete();
            }
        }
    }

    @Override // z70.y
    public final Unit b(v0 v0Var, String str) throws Throwable {
        zp0.e eVar = zp0.e.f206587a;
        Bitmap bitmapA = o4.g.a(v0Var);
        String strValueOf = String.valueOf(str.hashCode());
        eVar.getClass();
        zp0.e.c(this.f202782a, bitmapA, "promotionImages", strValueOf);
        return Unit.INSTANCE;
    }

    @Override // z70.y
    public final o4.f c(String str) throws Throwable {
        str.getClass();
        zp0.e eVar = zp0.e.f206587a;
        String strValueOf = String.valueOf(str.hashCode());
        eVar.getClass();
        Bitmap bitmapB = zp0.e.b(this.f202782a, "promotionImages", strValueOf);
        if (bitmapB != null) {
            return new o4.f(bitmapB);
        }
        return null;
    }

    @Override // z70.y
    public final void deleteAll() {
        zp0.e.f206587a.getClass();
        zp0.e.a(this.f202782a, "promotionImages");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lz70/c$a;", "", "<init>", "()V", "", "DIRECTORY_NAME", "Ljava/lang/String;", "TAG", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
