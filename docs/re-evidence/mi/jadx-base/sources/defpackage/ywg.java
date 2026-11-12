package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ywg implements vwg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification.Builder f40643b;
    public final wwg.e c;
    public RemoteViews d;
    public RemoteViews e;
    public final List<Bundle> f = new ArrayList();
    public final Bundle g = new Bundle();
    public int h;
    public RemoteViews i;

    @RequiresApi(20)
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    @RequiresApi(21)
    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    @RequiresApi(23)
    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    @RequiresApi(24)
    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    @RequiresApi(26)
    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        public static Notification.Builder d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    @RequiresApi(28)
    public static class f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    @RequiresApi(29)
    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    @RequiresApi(31)
    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    public ywg(wwg.e eVar) {
        int i;
        this.c = eVar;
        Context context = eVar.f38432a;
        this.f40642a = context;
        Notification.Builder builderA = e.a(context, eVar.K);
        this.f40643b = builderA;
        Notification notification = eVar.S;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.e).setContentText(eVar.f).setContentInfo(eVar.f38434k).setContentIntent(eVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.h, (notification.flags & 128) != 0).setNumber(eVar.l).setProgress(eVar.t, eVar.u, eVar.v);
        IconCompat iconCompat = eVar.j;
        c.b(builderA, iconCompat == null ? null : iconCompat.v(context));
        builderA.setSubText(eVar.q).setUsesChronometer(eVar.o).setPriority(eVar.m);
        wwg.g gVar = eVar.p;
        if (gVar instanceof wwg.f) {
            Iterator<wwg.a> it = ((wwg.f) gVar).h().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        } else {
            Iterator<wwg.a> it2 = eVar.f38433b.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
        }
        Bundle bundle = eVar.D;
        if (bundle != null) {
            this.g.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.d = eVar.H;
        this.e = eVar.I;
        this.f40643b.setShowWhen(eVar.n);
        a.i(this.f40643b, eVar.z);
        a.g(this.f40643b, eVar.w);
        a.j(this.f40643b, eVar.y);
        a.h(this.f40643b, eVar.x);
        this.h = eVar.P;
        b.b(this.f40643b, eVar.C);
        b.c(this.f40643b, eVar.E);
        b.f(this.f40643b, eVar.F);
        b.d(this.f40643b, eVar.G);
        b.e(this.f40643b, notification.sound, notification.audioAttributes);
        List listE = i2 < 28 ? e(g(eVar.c), eVar.V) : eVar.V;
        if (listE != null && !listE.isEmpty()) {
            Iterator it3 = listE.iterator();
            while (it3.hasNext()) {
                b.a(this.f40643b, (String) it3.next());
            }
        }
        this.i = eVar.J;
        if (eVar.d.size() > 0) {
            Bundle bundle2 = eVar.e().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < eVar.d.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), zwg.a(eVar.d.get(i3)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.e().putBundle("android.car.EXTENSIONS", bundle2);
            this.g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        Object obj = eVar.U;
        if (obj != null) {
            c.c(this.f40643b, obj);
        }
        this.f40643b.setExtras(eVar.D);
        d.e(this.f40643b, eVar.s);
        RemoteViews remoteViews = eVar.H;
        if (remoteViews != null) {
            d.c(this.f40643b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.I;
        if (remoteViews2 != null) {
            d.b(this.f40643b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.J;
        if (remoteViews3 != null) {
            d.d(this.f40643b, remoteViews3);
        }
        e.b(this.f40643b, eVar.L);
        e.e(this.f40643b, eVar.f38435r);
        e.f(this.f40643b, eVar.M);
        e.g(this.f40643b, eVar.O);
        e.d(this.f40643b, eVar.P);
        if (eVar.B) {
            e.c(this.f40643b, eVar.A);
        }
        if (!TextUtils.isEmpty(eVar.K)) {
            this.f40643b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i4 >= 28) {
            Iterator<wsh> it4 = eVar.c.iterator();
            while (it4.hasNext()) {
                f.a(this.f40643b, it4.next().h());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            g.a(this.f40643b, eVar.R);
            g.b(this.f40643b, wwg.d.a(null));
            soe soeVar = eVar.N;
            if (soeVar != null) {
                g.d(this.f40643b, soeVar.c());
            }
        }
        if (i5 >= 31 && (i = eVar.Q) != 0) {
            h.b(this.f40643b, i);
        }
        if (eVar.T) {
            if (this.c.x) {
                this.h = 2;
            } else {
                this.h = 1;
            }
            this.f40643b.setVibrate(null);
            this.f40643b.setSound(null);
            int i6 = notification.defaults & (-4);
            notification.defaults = i6;
            this.f40643b.setDefaults(i6);
            if (TextUtils.isEmpty(this.c.w)) {
                a.g(this.f40643b, "silent");
            }
            e.d(this.f40643b, this.h);
        }
    }

    public static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArraySet arraySet = new ArraySet(list.size() + list2.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new ArrayList(arraySet);
    }

    public static List<String> g(List<wsh> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<wsh> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    @Override // defpackage.vwg
    public Notification.Builder a() {
        return this.f40643b;
    }

    public final void b(wwg.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.u() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : lkk.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i = Build.VERSION.SDK_INT;
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i >= 28) {
            f.b(builderA, aVar.f());
        }
        if (i >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i >= 31) {
            h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f40643b, a.d(builderA));
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        wwg.g gVar = this.c.p;
        if (gVar != null) {
            gVar.b(this);
        }
        RemoteViews remoteViewsE = gVar != null ? gVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.c.H;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (gVar != null && (remoteViewsD = gVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (gVar != null && (remoteViewsF = this.c.p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (gVar != null && (bundleA = wwg.a(notificationD)) != null) {
            gVar.a(bundleA);
        }
        return notificationD;
    }

    public Notification d() {
        return this.f40643b.build();
    }

    public Context f() {
        return this.f40642a;
    }
}
