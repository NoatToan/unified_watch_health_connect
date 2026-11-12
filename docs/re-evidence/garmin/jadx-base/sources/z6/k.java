package z6;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f202639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f202640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0[] f202641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f202642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f202643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f202644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f202645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public final int f202646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f202647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PendingIntent f202648j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f202649k;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, f0[] f0VarArr, f0[] f0VarArr2, boolean z14, int i14, boolean z15, boolean z16, boolean z17) {
        this.f202643e = true;
        this.f202640b = iconCompat;
        if (iconCompat != null) {
            int i15 = iconCompat.f6392a;
            if ((i15 == -1 ? ((Icon) iconCompat.f6393b).getType() : i15) == 2) {
                this.f202646h = iconCompat.d();
            }
        }
        this.f202647i = q.e(charSequence);
        this.f202648j = pendingIntent;
        this.f202639a = bundle == null ? new Bundle() : bundle;
        this.f202641c = f0VarArr;
        this.f202642d = z14;
        this.f202644f = i14;
        this.f202643e = z15;
        this.f202645g = z16;
        this.f202649k = z17;
    }

    public final IconCompat a() {
        int i14;
        if (this.f202640b == null && (i14 = this.f202646h) != 0) {
            this.f202640b = IconCompat.c(null, "", i14);
        }
        return this.f202640b;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IconCompat f202650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f202651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PendingIntent f202652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f202653d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f202654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ArrayList<f0> f202655f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f202656g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f202657h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f202658i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f202659j;

        /* JADX INFO: renamed from: z6.k$a$a, reason: collision with other inner class name */
        public static class C3781a {
            private C3781a() {
            }

            public static boolean a(Notification.Action action) {
                return action.getAllowGeneratedReplies();
            }
        }

        public static class b {
            private b() {
            }

            public static int a(Notification.Action action) {
                return action.getSemanticAction();
            }
        }

        public static class c {
            private c() {
            }

            public static boolean a(Notification.Action action) {
                return action.isContextual();
            }
        }

        public static class d {
            private d() {
            }

            public static boolean a(Notification.Action action) {
                return action.isAuthenticationRequired();
            }
        }

        private a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, f0[] f0VarArr, boolean z14, int i14, boolean z15, boolean z16, boolean z17) {
            this.f202653d = true;
            this.f202657h = true;
            this.f202650a = iconCompat;
            this.f202651b = q.e(charSequence);
            this.f202652c = pendingIntent;
            this.f202654e = bundle;
            this.f202655f = f0VarArr == null ? null : new ArrayList<>(Arrays.asList(f0VarArr));
            this.f202653d = z14;
            this.f202656g = i14;
            this.f202657h = z15;
            this.f202658i = z16;
            this.f202659j = z17;
        }

        public final k a() {
            CharSequence[] charSequenceArr;
            Set<String> set;
            if (this.f202658i && this.f202652c == null) {
                j20.x.l("Contextual Actions must contain a valid PendingIntent");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<f0> arrayList3 = this.f202655f;
            if (arrayList3 != null) {
                for (f0 f0Var : arrayList3) {
                    if (f0Var.f202624d || (!((charSequenceArr = f0Var.f202623c) == null || charSequenceArr.length == 0) || (set = f0Var.f202627g) == null || set.isEmpty())) {
                        arrayList2.add(f0Var);
                    } else {
                        arrayList.add(f0Var);
                    }
                }
            }
            return new k(this.f202650a, this.f202651b, this.f202652c, this.f202654e, arrayList2.isEmpty() ? null : (f0[]) arrayList2.toArray(new f0[arrayList2.size()]), arrayList.isEmpty() ? null : (f0[]) arrayList.toArray(new f0[arrayList.size()]), this.f202653d, this.f202656g, this.f202657h, this.f202658i, this.f202659j);
        }

        public a(int i14, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i14 != 0 ? IconCompat.c(null, "", i14) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
        }

        public a(k kVar) {
            this(kVar.a(), kVar.f202647i, kVar.f202648j, new Bundle(kVar.f202639a), kVar.f202641c, kVar.f202642d, kVar.f202644f, kVar.f202643e, kVar.f202645g, kVar.f202649k);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
        }
    }

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle(), (f0[]) null, (f0[]) null, true, 0, true, false, false);
    }

    public k(int i14, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, f0[] f0VarArr, f0[] f0VarArr2, boolean z14, int i15, boolean z15, boolean z16, boolean z17) {
        this(i14 != 0 ? IconCompat.c(null, "", i14) : null, charSequence, pendingIntent, bundle, f0VarArr, f0VarArr2, z14, i15, z15, z16, z17);
    }

    public k(int i14, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i14 != 0 ? IconCompat.c(null, "", i14) : null, charSequence, pendingIntent);
    }
}
