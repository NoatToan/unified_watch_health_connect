package z6;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class q {
    public boolean A;
    public String B;
    public Bundle C;
    public int D;
    public int E;
    public final Notification F;
    public String G;
    public int H;
    public final String I;
    public final a7.d J;
    public final long K;
    public final boolean L;
    public final p M;
    public final Notification N;
    public boolean O;
    public final Icon P;

    @Deprecated
    public final ArrayList<String> Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f202679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<k> f202680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<d0> f202681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<k> f202682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f202683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f202684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f202685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PendingIntent f202686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PendingIntent f202687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IconCompat f202688j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f202689k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f202690l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f202691m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f202692n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f202693o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public w f202694p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f202695q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CharSequence f202696r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f202697s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f202698t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f202699u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f202700v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f202701w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f202702x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f202703y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f202704z;

    /* JADX WARN: Code duplicated, block: B:145:0x0299  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:4:0x0016  */
    /* JADX WARN: Code duplicated, block: B:97:0x0189  */
    /* JADX WARN: Multi-variable type inference failed */
    public q(Context context, Notification notification) {
        w uVar;
        Bundle bundle;
        a7.d dVar;
        p pVarA;
        Bundle bundle2;
        String str;
        String str2;
        String str3;
        q qVar;
        Bundle bundle3;
        Bundle[] bundleArr;
        Bundle[] bundleArr2;
        k.a aVar;
        Notification.BubbleMetadata bubbleMetadataB;
        this(context, notification.getChannelId());
        Bundle bundle4 = notification.extras;
        if (bundle4 != null) {
            String string = bundle4.getString("androidx.core.app.extra.COMPAT_TEMPLATE");
            if (string != null) {
                switch (string) {
                    case "androidx.core.app.NotificationCompat$ProgressStyle":
                        uVar = new v();
                        break;
                    case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                        uVar = new s();
                        break;
                    case "androidx.core.app.NotificationCompat$BigPictureStyle":
                        uVar = new n();
                        break;
                    case "androidx.core.app.NotificationCompat$CallStyle":
                        uVar = new r();
                        break;
                    case "androidx.core.app.NotificationCompat$InboxStyle":
                        uVar = new t();
                        break;
                    case "androidx.core.app.NotificationCompat$BigTextStyle":
                        uVar = new o();
                        break;
                    case "androidx.core.app.NotificationCompat$MessagingStyle":
                        uVar = new u();
                        break;
                    default:
                        uVar = null;
                        break;
                }
            } else {
                uVar = null;
            }
            if (uVar == null) {
                if (bundle4.containsKey("android.selfDisplayName") || bundle4.containsKey("android.messagingStyleUser")) {
                    uVar = new u();
                } else if (bundle4.containsKey("android.picture") || bundle4.containsKey("android.pictureIcon")) {
                    uVar = new n();
                } else if (bundle4.containsKey("android.bigText")) {
                    uVar = new o();
                } else if (bundle4.containsKey("android.textLines")) {
                    uVar = new t();
                } else if (bundle4.containsKey("android.callType")) {
                    uVar = new r();
                } else if (bundle4.containsKey("android.progressSegments") || bundle4.containsKey("android.progressPoints")) {
                    uVar = new v();
                } else {
                    String string2 = bundle4.getString("android.template");
                    if (string2 == null) {
                        uVar = null;
                    } else if (string2.equals(Notification.BigPictureStyle.class.getName())) {
                        uVar = new n();
                    } else if (string2.equals(Notification.BigTextStyle.class.getName())) {
                        uVar = new o();
                    } else if (string2.equals(Notification.InboxStyle.class.getName())) {
                        uVar = new t();
                    } else if (Build.VERSION.SDK_INT >= 36 && string2.equals(b.b.z().getName())) {
                        uVar = new v();
                    } else if (string2.equals(Notification.MessagingStyle.class.getName())) {
                        uVar = new u();
                    } else if (string2.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                        uVar = new s();
                    } else {
                        uVar = null;
                    }
                }
            }
            if (uVar == null) {
                uVar = null;
            } else {
                try {
                    uVar.e(bundle4);
                } catch (ClassCastException unused) {
                    uVar = null;
                }
            }
        } else {
            uVar = null;
        }
        this.f202683e = e(notification.extras.getCharSequence("android.title"));
        this.f202684f = e(notification.extras.getCharSequence("android.text"));
        this.f202689k = e(notification.extras.getCharSequence("android.infoText"));
        this.f202695q = e(notification.extras.getCharSequence("android.subText"));
        this.f202696r = e(notification.getSettingsText());
        l(uVar);
        this.f202700v = notification.getGroup();
        this.f202701w = (notification.flags & 512) != 0;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            LocusId locusIdD = l.d(notification);
            if (locusIdD == null) {
                bundle = null;
                dVar = null;
            } else {
                bundle = null;
                String strB = a7.d.a.b(locusIdD);
                if (TextUtils.isEmpty(strB)) {
                    vb.h.s("id cannot be empty");
                    throw null;
                }
                dVar = new a7.d(strB);
            }
        } else {
            bundle = null;
            dVar = null;
        }
        this.J = dVar;
        this.N.when = notification.when;
        this.f202692n = notification.extras.getBoolean("android.showWhen");
        this.f202693o = notification.extras.getBoolean("android.showChronometer");
        i(16, (notification.flags & 16) != 0);
        i(8, (notification.flags & 8) != 0);
        i(2, (notification.flags & 2) != 0);
        this.f202703y = (notification.flags & 256) != 0;
        j(notification.largeIcon);
        this.H = notification.getBadgeIconType();
        this.B = notification.category;
        if (i14 < 29 || (bubbleMetadataB = l.b(notification)) == null) {
            pVarA = bundle;
        } else if (i14 >= 30) {
            pVarA = p.b.a(bubbleMetadataB);
        } else if (i14 == 29) {
            pVarA = p.a.a(bubbleMetadataB);
        } else {
            pVarA = bundle;
        }
        this.M = pVarA;
        this.f202690l = notification.number;
        m(notification.tickerText);
        this.f202686h = notification.contentIntent;
        this.N.deleteIntent = notification.deleteIntent;
        PendingIntent pendingIntent = notification.fullScreenIntent;
        boolean z14 = (notification.flags & 128) != 0;
        this.f202687i = pendingIntent;
        i(128, z14);
        Uri uri = notification.sound;
        int i15 = notification.audioStreamType;
        Notification notification2 = this.N;
        notification2.sound = uri;
        notification2.audioStreamType = i15;
        notification2.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i15).build();
        this.O = "silent".equals(notification.getGroup()) || ((notification.flags & 512) == 0 ? notification.getGroupAlertBehavior() == 1 : notification.getGroupAlertBehavior() == 2);
        long[] jArr = notification.vibrate;
        Notification notification3 = this.N;
        notification3.vibrate = jArr;
        int i16 = notification.ledARGB;
        int i17 = notification.ledOnMS;
        int i18 = notification.ledOffMS;
        notification3.ledARGB = i16;
        notification3.ledOnMS = i17;
        notification3.ledOffMS = i18;
        notification3.flags = ((i17 == 0 || i18 == 0) ? 0 : 1) | (notification3.flags & (-2));
        h(notification.defaults);
        this.f202691m = notification.priority;
        this.D = notification.color;
        this.E = notification.visibility;
        this.F = notification.publicVersion;
        this.f202702x = notification.getSortKey();
        this.K = notification.getTimeoutAfter();
        this.I = notification.getShortcutId();
        int i19 = bundle4.getInt("android.progressMax");
        int i24 = bundle4.getInt("android.progress");
        boolean z15 = bundle4.getBoolean("android.progressIndeterminate");
        this.f202697s = i19;
        this.f202698t = i24;
        this.f202699u = z15;
        this.L = i14 >= 29 ? l.a(notification) : false;
        int i25 = notification.icon;
        int i26 = notification.iconLevel;
        Notification notification4 = this.N;
        notification4.icon = i25;
        notification4.iconLevel = i26;
        w wVar = uVar;
        if (notification.extras == null) {
            str2 = "android.car.EXTENSIONS";
            str = "android.people";
            str3 = "invisible_actions";
            bundle2 = bundle;
        } else {
            bundle2 = new Bundle(notification.extras);
            bundle2.remove("android.title");
            bundle2.remove("android.text");
            bundle2.remove("android.infoText");
            bundle2.remove("android.subText");
            if (i14 >= 36) {
                bundle2.remove("android.shortCriticalText");
            }
            bundle2.remove("android.intent.extra.CHANNEL_ID");
            bundle2.remove("android.intent.extra.CHANNEL_GROUP_ID");
            bundle2.remove("android.showWhen");
            bundle2.remove("android.progress");
            bundle2.remove("android.progressMax");
            bundle2.remove("android.progressIndeterminate");
            bundle2.remove("android.chronometerCountDown");
            bundle2.remove("android.colorized");
            bundle2.remove("android.people.list");
            str = "android.people";
            bundle2.remove(str);
            bundle2.remove("android.support.sortKey");
            bundle2.remove("android.support.groupKey");
            bundle2.remove("android.support.isGroupSummary");
            bundle2.remove("android.support.localOnly");
            bundle2.remove("android.support.actionExtras");
            str2 = "android.car.EXTENSIONS";
            Bundle bundle5 = bundle2.getBundle(str2);
            if (bundle5 != null) {
                Bundle bundle6 = new Bundle(bundle5);
                str3 = "invisible_actions";
                bundle6.remove(str3);
                bundle2.putBundle(str2, bundle6);
            } else {
                str3 = "invisible_actions";
            }
            if (wVar != null) {
                wVar.c(bundle2);
            }
        }
        if (bundle2 != null) {
            qVar = this;
            Bundle bundle7 = qVar.C;
            if (bundle7 == null) {
                qVar.C = new Bundle(bundle2);
            } else {
                bundle7.putAll(bundle2);
            }
        } else {
            qVar = this;
        }
        qVar.P = notification.getSmallIcon();
        Icon largeIcon = notification.getLargeIcon();
        if (largeIcon != null) {
            PorterDuff.Mode mode = IconCompat.f6391k;
            qVar.f202688j = IconCompat.a.a(largeIcon);
        }
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null && actionArr.length != 0) {
            int length = actionArr.length;
            int i27 = 0;
            while (i27 < length) {
                Notification.Action action = actionArr[i27];
                if (action.getIcon() != null) {
                    Icon icon = action.getIcon();
                    PorterDuff.Mode mode2 = IconCompat.f6391k;
                    aVar = new k.a((icon.getType() == 2 && icon.getResId() == 0) ? bundle : IconCompat.a.a(icon), action.title, action.actionIntent);
                } else {
                    aVar = new k.a(action.icon, action.title, action.actionIntent);
                }
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null && remoteInputs.length != 0) {
                    int length2 = remoteInputs.length;
                    int i28 = 0;
                    while (i28 < length2) {
                        RemoteInput remoteInput = remoteInputs[i28];
                        RemoteInput[] remoteInputArr = remoteInputs;
                        int i29 = length;
                        f0.b bVar = new f0.b(remoteInput.getResultKey());
                        bVar.f202631d = remoteInput.getLabel();
                        bVar.f202632e = remoteInput.getChoices();
                        bVar.f202633f = remoteInput.getAllowFreeFormInput();
                        Bundle extras = remoteInput.getExtras();
                        if (extras != null) {
                            bVar.f202630c.putAll(extras);
                        }
                        Set<String> allowedDataTypes = remoteInput.getAllowedDataTypes();
                        HashSet hashSet = bVar.f202629b;
                        if (allowedDataTypes != null) {
                            for (Iterator<String> it = allowedDataTypes.iterator(); it.hasNext(); it = it) {
                                hashSet.add(it.next());
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            bVar.f202634g = f0.a.a(remoteInput);
                        }
                        f0 f0Var = new f0(bVar.f202628a, bVar.f202631d, bVar.f202632e, bVar.f202633f, bVar.f202634g, bVar.f202630c, hashSet);
                        if (aVar.f202655f == null) {
                            aVar.f202655f = new ArrayList<>();
                        }
                        aVar.f202655f.add(f0Var);
                        i28++;
                        remoteInputs = remoteInputArr;
                        length = i29;
                        i27 = i27;
                    }
                }
                int i30 = length;
                int i34 = i27;
                aVar.f202653d = k.a.C3781a.a(action);
                aVar.f202656g = k.a.b.a(action);
                int i35 = Build.VERSION.SDK_INT;
                if (i35 >= 29) {
                    aVar.f202658i = k.a.c.a(action);
                }
                if (i35 >= 31) {
                    aVar.f202659j = k.a.d.a(action);
                }
                Bundle extras2 = action.getExtras();
                if (extras2 != null) {
                    aVar.f202654e.putAll(extras2);
                }
                qVar.b(aVar.a());
                i27 = i34 + 1;
                actionArr = actionArr;
                length = i30;
            }
        }
        ArrayList<k> arrayList = new ArrayList();
        Bundle bundle8 = notification.extras.getBundle(str2);
        if (bundle8 != null && (bundle3 = bundle8.getBundle(str3)) != null) {
            for (int i36 = 0; i36 < bundle3.size(); i36++) {
                Bundle bundle9 = bundle3.getBundle(Integer.toString(i36));
                Bundle bundle10 = bundle9.getBundle("extras");
                boolean z16 = bundle10 != null ? bundle10.getBoolean("android.support.allowGeneratedReplies", false) : false;
                int i37 = bundle9.getInt("icon");
                CharSequence charSequence = bundle9.getCharSequence("title");
                PendingIntent pendingIntent2 = (PendingIntent) bundle9.getParcelable("actionIntent");
                Bundle bundle11 = bundle9.getBundle("extras");
                Parcelable[] parcelableArray = bundle9.getParcelableArray("remoteInputs");
                if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
                    bundleArr = (Bundle[]) parcelableArray;
                } else {
                    bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
                    bundle9.putParcelableArray("remoteInputs", bundleArr);
                }
                f0[] f0VarArrA = z.a(bundleArr);
                Parcelable[] parcelableArray2 = bundle9.getParcelableArray("dataOnlyRemoteInputs");
                if ((parcelableArray2 instanceof Bundle[]) || parcelableArray2 == null) {
                    bundleArr2 = (Bundle[]) parcelableArray2;
                } else {
                    bundleArr2 = (Bundle[]) Arrays.copyOf(parcelableArray2, parcelableArray2.length, Bundle[].class);
                    bundle9.putParcelableArray("dataOnlyRemoteInputs", bundleArr2);
                }
                arrayList.add(new k(i37, charSequence, pendingIntent2, bundle11, f0VarArrA, z.a(bundleArr2), z16, bundle9.getInt("semanticAction"), bundle9.getBoolean("showsUserInterface"), false, false));
            }
        }
        if (!arrayList.isEmpty()) {
            for (k kVar : arrayList) {
                if (kVar != null) {
                    qVar.f202682d.add(kVar);
                }
            }
        }
        String[] stringArray = notification.extras.getStringArray(str);
        if (stringArray != null && stringArray.length != 0) {
            for (String str4 : stringArray) {
                if (str4 != null && !str4.isEmpty()) {
                    qVar.Q.add(str4);
                }
            }
        }
        ArrayList parcelableArrayList = notification.extras.getParcelableArrayList("android.people.list");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            Iterator it3 = parcelableArrayList.iterator();
            while (it3.hasNext()) {
                qVar.f202681c.add(d0.a((Person) it3.next()));
            }
        }
        if (bundle4.containsKey("android.chronometerCountDown")) {
            qVar.d().putBoolean("android.chronometerCountDown", bundle4.getBoolean("android.chronometerCountDown"));
        }
        if (bundle4.containsKey("android.colorized")) {
            qVar.f202704z = bundle4.getBoolean("android.colorized");
            qVar.A = true;
        }
        int i38 = Build.VERSION.SDK_INT;
        if (i38 < 36 || !bundle4.containsKey("android.shortCriticalText")) {
            return;
        }
        String string3 = bundle4.getString("android.shortCriticalText");
        qVar.f202685g = string3;
        if (i38 < 36) {
            qVar.d().putString("android.shortCriticalText", string3);
        }
    }

    public static CharSequence e(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i14, CharSequence charSequence, PendingIntent pendingIntent) {
        this.f202680b.add(new k(i14, charSequence, pendingIntent));
    }

    public final void b(k kVar) {
        if (kVar != null) {
            this.f202680b.add(kVar);
        }
    }

    public final Notification c() {
        Bundle bundle;
        y yVar = new y(this);
        q qVar = yVar.f202749c;
        w wVar = qVar.f202694p;
        if (wVar != null) {
            wVar.b(yVar);
        }
        Notification notificationBuild = yVar.f202748b.build();
        if (wVar != null) {
            qVar.f202694p.getClass();
        }
        if (wVar != null && (bundle = notificationBuild.extras) != null) {
            wVar.a(bundle);
        }
        return notificationBuild;
    }

    public final Bundle d() {
        if (this.C == null) {
            this.C = new Bundle();
        }
        return this.C;
    }

    public final void f(CharSequence charSequence) {
        this.f202684f = e(charSequence);
    }

    public final void g(CharSequence charSequence) {
        this.f202683e = e(charSequence);
    }

    public final void h(int i14) {
        Notification notification = this.N;
        notification.defaults = i14;
        if ((i14 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void i(int i14, boolean z14) {
        Notification notification = this.N;
        if (z14) {
            notification.flags = i14 | notification.flags;
        } else {
            notification.flags = (~i14) & notification.flags;
        }
    }

    public final void j(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f6393b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f202688j = iconCompat;
    }

    public final void k(Uri uri) {
        Notification notification = this.N;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    public final void l(w wVar) {
        if (this.f202694p != wVar) {
            this.f202694p = wVar;
            if (wVar != null) {
                wVar.f(this);
            }
        }
    }

    public final void m(CharSequence charSequence) {
        this.N.tickerText = e(charSequence);
    }

    @Deprecated
    public q(Context context) {
        this(context, (String) null);
    }

    public q(Context context, String str) {
        this.f202680b = new ArrayList<>();
        this.f202681c = new ArrayList<>();
        this.f202682d = new ArrayList<>();
        this.f202692n = true;
        this.f202703y = false;
        this.D = 0;
        this.E = 0;
        this.H = 0;
        Notification notification = new Notification();
        this.N = notification;
        this.f202679a = context;
        this.G = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f202691m = 0;
        this.Q = new ArrayList<>();
        this.L = true;
    }
}
