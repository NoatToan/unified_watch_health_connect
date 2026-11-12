package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class wwg {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f38427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IconCompat f38428b;
        public final lkk[] c;
        public final lkk[] d;
        public boolean e;
        public boolean f;
        public final int g;
        public final boolean h;

        @Deprecated
        public int i;
        public CharSequence j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f38429k;
        public boolean l;

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.k(null, "", i) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f38429k;
        }

        public boolean b() {
            return this.e;
        }

        public Bundle c() {
            return this.f38427a;
        }

        public IconCompat d() {
            int i;
            if (this.f38428b == null && (i = this.i) != 0) {
                this.f38428b = IconCompat.k(null, "", i);
            }
            return this.f38428b;
        }

        public lkk[] e() {
            return this.c;
        }

        public int f() {
            return this.g;
        }

        public boolean g() {
            return this.f;
        }

        public CharSequence h() {
            return this.j;
        }

        public boolean i() {
            return this.l;
        }

        public boolean j() {
            return this.h;
        }

        /* JADX INFO: renamed from: wwg$a$a, reason: collision with other inner class name */
        public static final class C1141a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IconCompat f38430a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CharSequence f38431b;
            public final PendingIntent c;
            public boolean d;
            public final Bundle e;
            public ArrayList<lkk> f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;

            public C1141a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.k(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public a a() {
                b();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<lkk> arrayList3 = this.f;
                if (arrayList3 != null) {
                    for (lkk lkkVar : arrayList3) {
                        if (lkkVar.j()) {
                            arrayList.add(lkkVar);
                        } else {
                            arrayList2.add(lkkVar);
                        }
                    }
                }
                return new a(this.f38430a, this.f38431b, this.c, this.e, arrayList2.isEmpty() ? null : (lkk[]) arrayList2.toArray(new lkk[arrayList2.size()]), arrayList.isEmpty() ? null : (lkk[]) arrayList.toArray(new lkk[arrayList.size()]), this.d, this.g, this.h, this.i, this.j);
            }

            public final void b() {
                if (this.i && this.c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C1141a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C1141a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, lkk[] lkkVarArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.d = true;
                this.h = true;
                this.f38430a = iconCompat;
                this.f38431b = e.f(charSequence);
                this.c = pendingIntent;
                this.e = bundle;
                this.f = lkkVarArr == null ? null : new ArrayList<>(Arrays.asList(lkkVarArr));
                this.d = z;
                this.g = i;
                this.h = z2;
                this.i = z3;
                this.j = z4;
            }
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, lkk[] lkkVarArr, lkk[] lkkVarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f = true;
            this.f38428b = iconCompat;
            if (iconCompat != null && iconCompat.o() == 2) {
                this.i = iconCompat.m();
            }
            this.j = e.f(charSequence);
            this.f38429k = pendingIntent;
            this.f38427a = bundle == null ? new Bundle() : bundle;
            this.c = lkkVarArr;
            this.d = lkkVarArr2;
            this.e = z;
            this.g = i;
            this.f = z2;
            this.h = z3;
            this.l = z4;
        }
    }

    public static class b extends g {
        public IconCompat e;
        public IconCompat f;
        public boolean g;
        public CharSequence h;
        public boolean i;

        @RequiresApi(23)
        public static class a {
            @RequiresApi(23)
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: wwg$b$b, reason: collision with other inner class name */
        @RequiresApi(31)
        public static class C1142b {
            @RequiresApi(31)
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @RequiresApi(31)
            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @RequiresApi(31)
            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        @Override // wwg.g
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(vwg vwgVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(vwgVar.a()).setBigContentTitle(this.f38438b);
            IconCompat iconCompat = this.e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C1142b.a(bigContentTitle, this.e.v(vwgVar instanceof ywg ? ((ywg) vwgVar).f() : null));
                } else if (iconCompat.o() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.e.l());
                }
            }
            if (this.g) {
                if (this.f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f.v(vwgVar instanceof ywg ? ((ywg) vwgVar).f() : null));
                }
            }
            if (this.d) {
                bigContentTitle.setSummaryText(this.c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C1142b.c(bigContentTitle, this.i);
                C1142b.b(bigContentTitle, this.h);
            }
        }

        @Override // wwg.g
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.e = bitmap == null ? null : IconCompat.g(bitmap);
            return this;
        }
    }

    public static class c extends g {
        public CharSequence e;

        @Override // wwg.g
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // wwg.g
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(vwg vwgVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(vwgVar.a()).setBigContentTitle(this.f38438b).bigText(this.e);
            if (this.d) {
                bigTextStyleBigText.setSummaryText(this.c);
            }
        }

        @Override // wwg.g
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.e = e.f(charSequence);
            return this;
        }

        public c i(CharSequence charSequence) {
            this.f38438b = e.f(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static class f extends g {
        public int e;
        public wsh f;
        public PendingIntent g;
        public PendingIntent h;
        public PendingIntent i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Integer f38436k;
        public Integer l;
        public IconCompat m;
        public CharSequence n;

        @RequiresApi(21)
        public static class a {
            public static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            public static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        @RequiresApi(23)
        public static class b {
            public static Parcelable a(Icon icon) {
                return icon;
            }

            public static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            public static void c(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        @RequiresApi(28)
        public static class c {
            public static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            public static Parcelable b(Person person) {
                return person;
            }
        }

        @RequiresApi(31)
        public static class d {
            public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle d(Notification.CallStyle callStyle, int i) {
                return callStyle.setAnswerButtonColorHint(i);
            }

            public static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }

            public static Notification.CallStyle f(Notification.CallStyle callStyle, int i) {
                return callStyle.setDeclineButtonColorHint(i);
            }

            public static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z) {
                return callStyle.setIsVideo(z);
            }

            public static Notification.CallStyle h(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            public static Notification.CallStyle i(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        @Override // wwg.g
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.e);
            bundle.putBoolean("android.callIsVideo", this.j);
            wsh wshVar = this.f;
            if (wshVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.b(wshVar.h()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", wshVar.i());
                }
            }
            IconCompat iconCompat = this.m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.v(this.f38437a.f38432a)));
            }
            bundle.putCharSequence("android.verificationText", this.n);
            bundle.putParcelable("android.answerIntent", this.g);
            bundle.putParcelable("android.declineIntent", this.h);
            bundle.putParcelable("android.hangUpIntent", this.i);
            Integer num = this.f38436k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // wwg.g
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(vwg vwgVar) {
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequenceI = null;
            callStyleA = null;
            Notification.CallStyle callStyleA = null;
            charSequenceI = null;
            if (i < 31) {
                Notification.Builder builderA = vwgVar.a();
                wsh wshVar = this.f;
                builderA.setContentTitle(wshVar != null ? wshVar.c() : null);
                Bundle bundle = this.f38437a.D;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequenceI = this.f38437a.D.getCharSequence("android.text");
                }
                if (charSequenceI == null) {
                    charSequenceI = i();
                }
                builderA.setContentText(charSequenceI);
                wsh wshVar2 = this.f;
                if (wshVar2 != null) {
                    if (wshVar2.a() != null) {
                        b.c(builderA, this.f.a().v(this.f38437a.f38432a));
                    }
                    if (i >= 28) {
                        c.a(builderA, this.f.h());
                    } else {
                        a.a(builderA, this.f.d());
                    }
                }
                a.b(builderA, "call");
                return;
            }
            int i2 = this.e;
            if (i2 == 1) {
                callStyleA = d.a(this.f.h(), this.h, this.g);
            } else if (i2 == 2) {
                callStyleA = d.b(this.f.h(), this.i);
            } else if (i2 == 3) {
                callStyleA = d.c(this.f.h(), this.i, this.g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized call type in CallStyle: ");
                sb.append(String.valueOf(this.e));
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(vwgVar.a());
                Integer num = this.f38436k;
                if (num != null) {
                    d.d(callStyleA, num.intValue());
                }
                Integer num2 = this.l;
                if (num2 != null) {
                    d.f(callStyleA, num2.intValue());
                }
                d.i(callStyleA, this.n);
                IconCompat iconCompat = this.m;
                if (iconCompat != null) {
                    d.h(callStyleA, iconCompat.v(this.f38437a.f38432a));
                }
                d.g(callStyleA, this.j);
            }
        }

        @Override // wwg.g
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        @RequiresApi(20)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<a> h() {
            a aVarM = m();
            a aVarL = l();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(aVarM);
            ArrayList<a> arrayList2 = this.f38437a.f38433b;
            int i = 2;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.j()) {
                        arrayList.add(aVar);
                    } else if (!j(aVar) && i > 1) {
                        arrayList.add(aVar);
                        i--;
                    }
                    if (aVarL != null && i == 1) {
                        arrayList.add(aVarL);
                        i--;
                    }
                }
            }
            if (aVarL != null && i >= 1) {
                arrayList.add(aVarL);
            }
            return arrayList;
        }

        public final String i() {
            int i = this.e;
            if (i == 1) {
                return this.f38437a.f38432a.getResources().getString(izi.e);
            }
            if (i == 2) {
                return this.f38437a.f38432a.getResources().getString(izi.f);
            }
            if (i != 3) {
                return null;
            }
            return this.f38437a.f38432a.getResources().getString(izi.g);
        }

        public final boolean j(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        @RequiresApi(20)
        public final a k(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(ni4.c(this.f38437a.f38432a, i3));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f38437a.f38432a.getResources().getString(i2));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a aVarA = new a.C1141a(IconCompat.j(this.f38437a.f38432a, i), spannableStringBuilder, pendingIntent).a();
            aVarA.c().putBoolean("key_action_priority", true);
            return aVarA;
        }

        @RequiresApi(20)
        public final a l() {
            int i = oni.f29320b;
            int i2 = oni.f29319a;
            PendingIntent pendingIntent = this.g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z = this.j;
            return k(z ? i : i2, z ? izi.f22256b : izi.f22255a, this.f38436k, qji.f31569a, pendingIntent);
        }

        @RequiresApi(20)
        public final a m() {
            int i = oni.c;
            PendingIntent pendingIntent = this.h;
            return pendingIntent == null ? k(i, izi.d, this.l, qji.f31570b, this.i) : k(i, izi.c, this.l, qji.f31570b, pendingIntent);
        }
    }

    public static abstract class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public e f38437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f38438b;
        public CharSequence c;
        public boolean d = false;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void a(Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence = this.f38438b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public abstract void b(vwg vwgVar);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public abstract String c();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews d(vwg vwgVar) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews e(vwg vwgVar) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews f(vwg vwgVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f38437a != eVar) {
                this.f38437a = eVar;
                if (eVar != null) {
                    eVar.w(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static boolean b(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static Bitmap c(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(oli.f29277b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(oli.f29276a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    public static class e {
        public boolean A;
        public boolean B;
        public String C;
        public Bundle D;
        public int E;
        public int F;
        public Notification G;
        public RemoteViews H;
        public RemoteViews I;
        public RemoteViews J;
        public String K;
        public int L;
        public String M;
        public soe N;
        public long O;
        public int P;
        public int Q;
        public boolean R;
        public Notification S;
        public boolean T;
        public Object U;

        @Deprecated
        public ArrayList<String> V;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Context f38432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<a> f38433b;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<wsh> c;
        public ArrayList<a> d;
        public CharSequence e;
        public CharSequence f;
        public PendingIntent g;
        public PendingIntent h;
        public RemoteViews i;
        public IconCompat j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f38434k;
        public int l;
        public int m;
        public boolean n;
        public boolean o;
        public g p;
        public CharSequence q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public CharSequence f38435r;
        public CharSequence[] s;
        public int t;
        public int u;
        public boolean v;
        public String w;
        public boolean x;
        public String y;
        public boolean z;

        @RequiresApi(21)
        public static class a {
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
                return builder.setLegacyStreamType(i);
            }

            public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }

        public static CharSequence f(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public e A(int i) {
            this.F = i;
            return this;
        }

        public e B(long j) {
            this.S.when = j;
            return this;
        }

        public e a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f38433b.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f38433b.add(aVar);
            }
            return this;
        }

        public e c(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.D;
                if (bundle2 == null) {
                    this.D = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        public Notification d() {
            return new ywg(this).c();
        }

        public Bundle e() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e g(boolean z) {
            o(16, z);
            return this;
        }

        public e h(String str) {
            this.K = str;
            return this;
        }

        public e i(PendingIntent pendingIntent) {
            this.g = pendingIntent;
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f = f(charSequence);
            return this;
        }

        public e k(CharSequence charSequence) {
            this.e = f(charSequence);
            return this;
        }

        public e l(int i) {
            Notification notification = this.S;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e m(PendingIntent pendingIntent) {
            this.S.deleteIntent = pendingIntent;
            return this;
        }

        public e n(Bundle bundle) {
            this.D = bundle;
            return this;
        }

        public final void o(int i, boolean z) {
            if (z) {
                Notification notification = this.S;
                notification.flags = i | notification.flags;
            } else {
                Notification notification2 = this.S;
                notification2.flags = (~i) & notification2.flags;
            }
        }

        public e p(String str) {
            this.w = str;
            return this;
        }

        public e q(Bitmap bitmap) {
            this.j = bitmap == null ? null : IconCompat.g(wwg.c(this.f38432a, bitmap));
            return this;
        }

        public e r(boolean z) {
            this.z = z;
            return this;
        }

        public e s(boolean z) {
            o(2, z);
            return this;
        }

        public e t(int i) {
            this.m = i;
            return this;
        }

        public e u(int i) {
            this.S.icon = i;
            return this;
        }

        public e v(Uri uri) {
            Notification notification = this.S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderE = a.e(a.c(a.b(), 4), 5);
            this.S.audioAttributes = a.a(builderE);
            return this;
        }

        public e w(g gVar) {
            if (this.p != gVar) {
                this.p = gVar;
                if (gVar != null) {
                    gVar.g(this);
                }
            }
            return this;
        }

        public e x(CharSequence charSequence) {
            this.S.tickerText = f(charSequence);
            return this;
        }

        public e y(long j) {
            this.O = j;
            return this;
        }

        public e z(long[] jArr) {
            this.S.vibrate = jArr;
            return this;
        }

        public e(Context context, String str) {
            this.f38433b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.d = new ArrayList<>();
            this.n = true;
            this.z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.P = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.S = notification;
            this.f38432a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.m = 0;
            this.V = new ArrayList<>();
            this.R = true;
        }
    }
}
