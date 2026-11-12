package z6;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class v extends w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f202730h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IconCompat f202732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IconCompat f202733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public IconCompat f202734l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f202727e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f202728f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f202729g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f202731i = true;

    public static final class a {
        private a() {
        }

        public static void a(Notification.ProgressStyle progressStyle, int i14) {
            progressStyle.setProgress(i14);
        }

        public static void b(Notification.ProgressStyle progressStyle, Icon icon) {
            progressStyle.setProgressEndIcon(icon);
        }

        public static void c(Notification.ProgressStyle progressStyle, boolean z14) {
            progressStyle.setProgressIndeterminate(z14);
        }

        public static void d(Notification.ProgressStyle progressStyle, List<b> list) {
            for (b bVar : list) {
                progressStyle.addProgressPoint(new Notification.ProgressStyle.Point(bVar.f202735a).setColor(bVar.f202737c).setId(bVar.f202736b));
            }
        }

        public static void e(Notification.ProgressStyle progressStyle, List<c> list) {
            for (c cVar : list) {
                progressStyle.addProgressSegment(new Notification.ProgressStyle.Segment(cVar.f202738a).setColor(cVar.f202740c).setId(cVar.f202739b));
            }
        }

        public static void f(Notification.ProgressStyle progressStyle, Icon icon) {
            progressStyle.setProgressStartIcon(icon);
        }

        public static void g(Notification.ProgressStyle progressStyle, Icon icon) {
            progressStyle.setProgressTrackerIcon(icon);
        }

        public static void h(Notification.ProgressStyle progressStyle, boolean z14) {
            progressStyle.setStyledByProgress(z14);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f202735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f202736b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f202737c = 0;

        public b(int i14) {
            this.f202735a = i14;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f202738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f202739b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f202740c = 0;

        public c(int i14) {
            this.f202738a = i14;
        }
    }

    public static IconCompat g(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            PorterDuff.Mode mode = IconCompat.f6391k;
            return IconCompat.a.a((Icon) parcelable);
        }
        if (!(parcelable instanceof Bitmap)) {
            return null;
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f6393b = (Bitmap) parcelable;
        return iconCompat;
    }

    @Override // z6.w
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (Build.VERSION.SDK_INT < 36) {
            ArrayList arrayList = this.f202727e;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    c cVar = (c) arrayList.get(i14);
                    if (cVar.f202738a > 0) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("length", cVar.f202738a);
                        bundle2.putInt(TtmlNode.ATTR_ID, cVar.f202739b);
                        bundle2.putInt("colorInt", cVar.f202740c);
                        arrayList2.add(bundle2);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressSegments", arrayList2);
            ArrayList arrayList3 = this.f202728f;
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    b bVar = (b) arrayList3.get(i15);
                    if (bVar.f202735a >= 0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt(ModelSourceWrapper.POSITION, bVar.f202735a);
                        bundle3.putInt(TtmlNode.ATTR_ID, bVar.f202736b);
                        bundle3.putInt("colorInt", bVar.f202737c);
                        arrayList4.add(bundle3);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressPoints", arrayList4);
            bundle.putInt("android.progress", this.f202729g);
            bundle.putBoolean("android.progressIndeterminate", this.f202730h);
            bundle.putInt("android.progressMax", h());
            bundle.putBoolean("android.styledByProgress", this.f202731i);
            q qVar = this.f202741a;
            Context context = qVar != null ? qVar.f202679a : null;
            if (context == null) {
                return;
            }
            IconCompat iconCompat = this.f202732j;
            if (iconCompat != null) {
                bundle.putParcelable("android.progressTrackerIcon", iconCompat.f(context));
            } else {
                bundle.remove("android.progressTrackerIcon");
            }
            IconCompat iconCompat2 = this.f202733k;
            if (iconCompat2 != null) {
                bundle.putParcelable("android.progressStartIcon", iconCompat2.f(context));
            } else {
                bundle.remove("android.progressStartIcon");
            }
            IconCompat iconCompat3 = this.f202734l;
            if (iconCompat3 != null) {
                bundle.putParcelable("android.progressEndIcon", iconCompat3.f(context));
            } else {
                bundle.remove("android.progressEndIcon");
            }
        }
    }

    @Override // z6.w
    public final void b(y yVar) {
        Notification.Builder builder = yVar.f202748b;
        if (Build.VERSION.SDK_INT < 36) {
            int iH = h();
            builder.setProgress(iH, Math.min(this.f202729g, iH), this.f202730h);
            return;
        }
        Context context = yVar.f202747a;
        Notification.ProgressStyle progressStyleD = b.b.d();
        a.h(progressStyleD, this.f202731i);
        a.a(progressStyleD, this.f202729g);
        a.c(progressStyleD, this.f202730h);
        IconCompat iconCompat = this.f202733k;
        a.f(progressStyleD, iconCompat != null ? iconCompat.f(context) : null);
        IconCompat iconCompat2 = this.f202734l;
        a.b(progressStyleD, iconCompat2 != null ? iconCompat2.f(context) : null);
        IconCompat iconCompat3 = this.f202732j;
        a.g(progressStyleD, iconCompat3 != null ? iconCompat3.f(context) : null);
        a.d(progressStyleD, this.f202728f);
        a.e(progressStyleD, this.f202727e);
        builder.setStyle(progressStyleD);
    }

    @Override // z6.w
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.progressSegments");
        bundle.remove("android.progress");
        bundle.remove("android.styledByProgress");
        bundle.remove("android.progressTrackerIcon");
        bundle.remove("android.progressStartIcon");
        bundle.remove("android.progressEndIcon");
        bundle.remove("android.progressPoints");
        bundle.remove("android.progressIndeterminate");
    }

    @Override // z6.w
    public final String d() {
        return "androidx.core.app.NotificationCompat$ProgressStyle";
    }

    @Override // z6.w
    public final void e(Bundle bundle) {
        super.e(bundle);
        ArrayList arrayListC = Build.VERSION.SDK_INT >= 34 ? h7.b.a.c(bundle, Bundle.class, "android.progressSegments") : bundle.getParcelableArrayList("android.progressSegments");
        ArrayList arrayList = new ArrayList();
        if (arrayListC != null && !arrayListC.isEmpty()) {
            for (int i14 = 0; i14 < arrayListC.size(); i14++) {
                Bundle bundle2 = (Bundle) arrayListC.get(i14);
                int i15 = bundle2.getInt("length");
                if (i15 > 0) {
                    int i16 = bundle2.getInt(TtmlNode.ATTR_ID);
                    int i17 = bundle2.getInt("colorInt", 0);
                    c cVar = new c(i15);
                    cVar.f202739b = i16;
                    cVar.f202740c = i17;
                    arrayList.add(cVar);
                }
            }
        }
        this.f202727e = arrayList;
        this.f202729g = bundle.getInt("android.progress", 0);
        this.f202730h = bundle.getBoolean("android.progressIndeterminate", false);
        this.f202731i = bundle.getBoolean("android.styledByProgress", true);
        ArrayList arrayListC2 = Build.VERSION.SDK_INT >= 34 ? h7.b.a.c(bundle, Bundle.class, "android.progressPoints") : bundle.getParcelableArrayList("android.progressPoints");
        ArrayList arrayList2 = new ArrayList();
        if (arrayListC2 != null && !arrayListC2.isEmpty()) {
            for (int i18 = 0; i18 < arrayListC2.size(); i18++) {
                Bundle bundle3 = (Bundle) arrayListC2.get(i18);
                int i19 = bundle3.getInt(ModelSourceWrapper.POSITION);
                if (i19 >= 0) {
                    int i24 = bundle3.getInt(TtmlNode.ATTR_ID);
                    int i25 = bundle3.getInt("colorInt", 0);
                    b bVar = new b(i19);
                    bVar.f202736b = i24;
                    bVar.f202737c = i25;
                    arrayList2.add(bVar);
                }
            }
        }
        this.f202728f = arrayList2;
        this.f202732j = g((Parcelable) h7.b.a(bundle, Icon.class, "android.progressTrackerIcon"));
        this.f202733k = g((Parcelable) h7.b.a(bundle, Icon.class, "android.progressStartIcon"));
        this.f202734l = g((Parcelable) h7.b.a(bundle, Icon.class, "android.progressEndIcon"));
    }

    public final int h() {
        ArrayList arrayList = this.f202727e;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i14 = 0;
            int iAddExact = 0;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                int i16 = ((c) arrayList.get(i15)).f202738a;
                if (i16 > 0) {
                    try {
                        iAddExact = Math.addExact(iAddExact, i16);
                        i14++;
                    } catch (ArithmeticException unused) {
                        return 100;
                    }
                }
            }
            if (i14 != 0) {
                return iAddExact;
            }
        }
        return 100;
    }
}
