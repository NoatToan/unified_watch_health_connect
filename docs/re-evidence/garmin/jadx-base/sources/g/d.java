package g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\tB\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lg/d;", "Lg/a;", "Lf/j;", "", "Landroid/net/Uri;", "", "maxItems", "<init>", "(I)V", "a", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class d extends g.a<f.j, List<Uri>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f74068b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f74069a;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        if ((i15 & 1) != 0) {
            f74068b.getClass();
            i14 = a.a();
        }
        this(i14);
    }

    @Override // g.a
    public final Intent a(Context context, f.j jVar) {
        f.j jVar2 = jVar;
        context.getClass();
        jVar2.getClass();
        e.f74070a.getClass();
        boolean zC = e.a.c();
        int i14 = this.f74069a;
        if (zC) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(e.a.b(jVar2.f67617a));
            int iMin = Math.min(i14, jVar2.f67618b);
            if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
                vb.h.s("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
                return null;
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", jVar2.f67619c.a());
            intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
            return intent;
        }
        if (e.a.a(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(e.a.b(jVar2.f67617a));
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoA = e.a.a(context);
        if (resolveInfoA == null) {
            vb.h.z("Required value was null.");
            return null;
        }
        ActivityInfo activityInfo = resolveInfoA.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(e.a.b(jVar2.f67617a));
        int iMin2 = Math.min(i14, jVar2.f67618b);
        if (iMin2 <= 1) {
            vb.h.s("Max items must be greater than 1");
            return null;
        }
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", iMin2);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", jVar2.f67619c.a());
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", false);
        return intent3;
    }

    @Override // g.a
    public final g.a.C1502a<List<Uri>> b(Context context, f.j jVar) {
        context.getClass();
        jVar.getClass();
        return null;
    }

    @Override // g.a
    public final List<Uri> c(int i14, Intent intent) {
        if (i14 != -1) {
            intent = null;
        }
        if (intent != null) {
            c.f74067a.getClass();
            List<Uri> listA = c.a.a(intent);
            if (listA != null) {
                return listA;
            }
        }
        return j0.f134944a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg/d$a;", "", "<init>", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @SuppressLint({"NewApi"})
        public static int a() {
            e.f74070a.getClass();
            if (e.a.c()) {
                return MediaStore.getPickImagesMaxLimit();
            }
            return Integer.MAX_VALUE;
        }

        private a() {
        }
    }

    public d(int i14) {
        this.f74069a = i14;
        if (i14 > 1) {
            return;
        }
        vb.h.s("Max items must be higher than 1");
        throw null;
    }

    public d() {
        this(0, 1, null);
    }
}
