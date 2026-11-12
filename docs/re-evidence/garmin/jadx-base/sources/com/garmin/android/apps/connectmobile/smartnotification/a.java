package com.garmin.android.apps.connectmobile.smartnotification;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f44303a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f44304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f44305c;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.smartnotification.a$a, reason: collision with other inner class name */
    public class C0836a extends un1.a<un1.e> {
        public C0836a(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(new Date(eVar.f172054b.getNotification().when));
        }
    }

    public class a0 extends un1.a<un1.e> {
        public a0(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return eVar.f172054b.getTag();
        }
    }

    public class b extends un1.a<un1.e> {
        public b(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return eVar.f172054b.getNotification().getGroup();
        }
    }

    public class b0 extends un1.a<un1.e> {
        public b0(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(new Date(eVar.f172054b.getPostTime()));
        }
    }

    public class c extends un1.a<un1.e> {
        public c(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return Boolean.toString((eVar.f172054b.getNotification().flags & 512) == 512);
        }
    }

    public class c0 extends un1.a<un1.e> {
        public c0(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return eVar.f172054b.getPackageName();
        }
    }

    public class d extends un1.a<un1.e> {
        public d(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            ArrayList<z6.k> arrayList = new z6.x(eVar.f172054b.getNotification()).f202745a;
            StringBuilder sb3 = new StringBuilder();
            Iterator<z6.k> it = arrayList.iterator();
            while (it.hasNext()) {
                sb3.append(it.next().f202647i);
                sb3.append('\n');
            }
            return sb3.toString();
        }
    }

    public class d0 extends un1.a<un1.e> {
        public d0(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            try {
                return GarminConnectMobileApp.f28688j.getPackageManager().getPackageInfo(eVar.f172054b.getPackageName(), 0).versionName;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public class e extends un1.a<un1.e> {
        public e(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return Boolean.toString(eVar.f172054b.isClearable());
        }
    }

    public class e0 extends un1.a<un1.e> {
        public e0(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            try {
                return Integer.toString(GarminConnectMobileApp.f28688j.getPackageManager().getPackageInfo(eVar.f172054b.getPackageName(), 0).versionCode);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public class f extends un1.a<un1.e> {
        public f(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return Boolean.toString(eVar.f172054b.isOngoing());
        }
    }

    public enum f0 {
        OPERATION("Operation"),
        TITLE("Title"),
        SUBTITLE("Subtitle"),
        MESSAGE("Message"),
        POSITIVE_ACTION("Positive Action"),
        NEGATIVE_ACTION("Negative Action");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f44313a;

        f0(String str) {
            this.f44313a = str;
        }
    }

    public class g extends un1.a<un1.e> {
        public g(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return Integer.toHexString(eVar.f172054b.getNotification().flags);
        }
    }

    public enum g0 {
        OPERATION("Operation"),
        CONTENT_VIEW("Content View"),
        BIG_CONTENT_VIEW("Big Content View"),
        ID("ID"),
        TAG("Tag"),
        POST_TIME("Post Time"),
        PACKAGE_NAME("Package Name"),
        VERSION("Version"),
        VERSION_CODE("Version Code"),
        WHEN("When"),
        GROUP_KEY("Group Key"),
        IS_SUMMARY("Is Summary?"),
        ACTIONS("Actions"),
        IS_CLEARABLE("Is Clearable?"),
        IS_ONGOING("Is Ongoing?"),
        FLAGS("Flags"),
        NUMBER("Event No."),
        PRIORITY("Priority"),
        TICKER_TEXT("Ticker Text"),
        EXTRA_SUB_TEXT("EXTRA_SUB_TEXT"),
        EXTRA_TEXT("EXTRA_TEXT"),
        EXTRA_BIG_TEXT("EXTRA_BIG_TEXT"),
        EXTRA_TEXT_LINES("EXTRA_TEXT_LINES"),
        EXTRA_TITLE("EXTRA_TITLE"),
        EXTRA_TITLE_BIG("EXTRA_TITLE_BIG");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f44337a;

        g0(String str) {
            this.f44337a = str;
        }
    }

    public class h extends un1.a<un1.e> {
        public h(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return Integer.toString(eVar.f172054b.getNotification().number);
        }
    }

    public class i extends un1.a<un1.e> {
        public i(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return Integer.toString(eVar.f172054b.getNotification().priority);
        }
    }

    public class j extends un1.a<un1.e> {
        public j(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            un1.e eVar2 = eVar;
            if (eVar2.f172054b.getNotification().tickerText == null) {
                return null;
            }
            return eVar2.f172054b.getNotification().tickerText.toString();
        }
    }

    public class k extends un1.a<un1.e> {
        public k(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return eVar.f172053a == 1 ? "Post" : "Remove";
        }
    }

    public class l extends un1.a<un1.e> {
        public l(String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return a.b(a.this, eVar, "android.subText");
        }
    }

    public class m extends un1.a<un1.e> {
        public m(String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return a.b(a.this, eVar, "android.text");
        }
    }

    public class n extends un1.a<un1.e> {
        public n(String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return a.b(a.this, eVar, "android.bigText");
        }
    }

    public class o extends un1.a<un1.e> {
        public o(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            CharSequence[] charSequenceArray;
            un1.e eVar2 = eVar;
            if (eVar2.f172054b.getNotification().extras.get("android.textLines") == null || (charSequenceArray = eVar2.f172054b.getNotification().extras.getCharSequenceArray("android.textLines")) == null) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            for (CharSequence charSequence : charSequenceArray) {
                if (sb3.length() > 0) {
                    sb3.append("\n");
                }
                sb3.append(charSequence);
            }
            return sb3.toString();
        }
    }

    public class p extends un1.a<un1.e> {
        public p(String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return a.b(a.this, eVar, "android.title");
        }
    }

    public class q extends un1.a<un1.e> {
        public q(String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return a.b(a.this, eVar, "android.title.big");
        }
    }

    public class r extends un1.a<un1.d> {
        public r(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.d dVar) {
            int i14 = dVar.f172051a;
            if (i14 == 1) {
                return "Post";
            }
            if (i14 == 2) {
                return "Update";
            }
            if (i14 == 3) {
                return "Remove";
            }
            vb.h.s("Unknown type of SmartNotificationMetadata");
            return null;
        }
    }

    public class s extends un1.a<un1.d> {
        public s(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.d dVar) {
            return dVar.f172052b.title;
        }
    }

    public class t extends un1.a<un1.d> {
        public t(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.d dVar) {
            return dVar.f172052b.subTitle;
        }
    }

    public class u extends un1.a<un1.d> {
        public u(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.d dVar) {
            return dVar.f172052b.message;
        }
    }

    public class v extends un1.a<un1.e> {
        public v(String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return a.a(a.this, new com.garmin.android.apps.connectmobile.smartnotification.b(this, eVar));
        }
    }

    public class w extends un1.a<un1.d> {
        public w(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.d dVar) {
            return dVar.f172052b.positiveAction;
        }
    }

    public class x extends un1.a<un1.d> {
        public x(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.d dVar) {
            return dVar.f172052b.negativeAction;
        }
    }

    public class y extends un1.a<un1.e> {
        public y(String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return a.a(a.this, new com.garmin.android.apps.connectmobile.smartnotification.c(this, eVar));
        }
    }

    public class z extends un1.a<un1.e> {
        public z(a aVar, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            return Integer.toString(eVar.f172054b.getId());
        }
    }

    public a() {
        ArrayList arrayList = new ArrayList();
        this.f44304b = arrayList;
        arrayList.add(new k(this, g0.OPERATION.f44337a));
        arrayList.add(new v(g0.CONTENT_VIEW.f44337a));
        arrayList.add(new y(g0.BIG_CONTENT_VIEW.f44337a));
        arrayList.add(new z(this, g0.ID.f44337a));
        arrayList.add(new a0(this, g0.TAG.f44337a));
        arrayList.add(new b0(this, g0.POST_TIME.f44337a));
        arrayList.add(new c0(this, g0.PACKAGE_NAME.f44337a));
        arrayList.add(new d0(this, g0.VERSION.f44337a));
        arrayList.add(new e0(this, g0.VERSION_CODE.f44337a));
        arrayList.add(new C0836a(this, g0.WHEN.f44337a));
        arrayList.add(new b(this, g0.GROUP_KEY.f44337a));
        arrayList.add(new c(this, g0.IS_SUMMARY.f44337a));
        arrayList.add(new d(this, g0.ACTIONS.f44337a));
        arrayList.add(new e(this, g0.IS_CLEARABLE.f44337a));
        arrayList.add(new f(this, g0.IS_ONGOING.f44337a));
        arrayList.add(new g(this, g0.FLAGS.f44337a));
        arrayList.add(new h(this, g0.NUMBER.f44337a));
        arrayList.add(new i(this, g0.PRIORITY.f44337a));
        arrayList.add(new j(this, g0.TICKER_TEXT.f44337a));
        arrayList.add(new l(g0.EXTRA_SUB_TEXT.f44337a));
        arrayList.add(new m(g0.EXTRA_TEXT.f44337a));
        arrayList.add(new n(g0.EXTRA_BIG_TEXT.f44337a));
        arrayList.add(new o(this, g0.EXTRA_TEXT_LINES.f44337a));
        arrayList.add(new p(g0.EXTRA_TITLE.f44337a));
        arrayList.add(new q(g0.EXTRA_TITLE_BIG.f44337a));
        ArrayList arrayList2 = new ArrayList();
        this.f44305c = arrayList2;
        arrayList2.add(new r(this, f0.OPERATION.f44313a));
        arrayList2.add(new s(this, f0.TITLE.f44313a));
        arrayList2.add(new t(this, f0.SUBTITLE.f44313a));
        arrayList2.add(new u(this, f0.MESSAGE.f44313a));
        arrayList2.add(new w(this, f0.POSITIVE_ACTION.f44313a));
        arrayList2.add(new x(this, f0.NEGATIVE_ACTION.f44313a));
    }

    public static String a(a aVar, Callable callable) {
        aVar.getClass();
        FutureTask futureTask = new FutureTask(callable);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            futureTask.run();
        } else {
            aVar.f44303a.post(futureTask);
        }
        try {
            return (String) futureTask.get();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(a aVar, un1.e eVar, String str) {
        aVar.getClass();
        if (eVar.f172054b.getNotification().extras.get(str) == null) {
            return null;
        }
        return eVar.f172054b.getNotification().extras.get(str).toString();
    }

    public static void c(StringBuilder sb3, ViewGroup viewGroup, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            sb3.append('-');
        }
        sb3.append(viewGroup.getClass().getName());
        sb3.append('\n');
        for (int i16 = 0; i16 < viewGroup.getChildCount(); i16++) {
            if (viewGroup.getChildAt(i16) instanceof ViewGroup) {
                c(sb3, (ViewGroup) viewGroup.getChildAt(i16), i14 + 1);
            } else {
                View childAt = viewGroup.getChildAt(i16);
                int i17 = i14 + 1;
                for (int i18 = 0; i18 < i17; i18++) {
                    sb3.append('-');
                }
                sb3.append(childAt.getClass().getName());
                if (childAt instanceof TextView) {
                    sb3.append(": ");
                    sb3.append(((TextView) childAt).getText());
                }
                sb3.append('\n');
            }
        }
    }

    public static ViewGroup d(Context context, RemoteViews remoteViews, int i14, LayoutInflater layoutInflater, boolean z14) {
        try {
            ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(i14, (ViewGroup) null);
            if (viewGroup != null) {
                remoteViews.reapply(context, viewGroup);
            }
            return viewGroup;
        } catch (Resources.NotFoundException | InflateException unused) {
            return null;
        } catch (Exception unused2) {
            if (z14) {
                System.gc();
                return d(context, remoteViews, i14, layoutInflater, false);
            }
            return null;
        } catch (OutOfMemoryError unused3) {
            if (z14) {
                System.gc();
                return d(context, remoteViews, i14, layoutInflater, false);
            }
            return null;
        }
    }

    public final ArrayList e(g0 g0Var, g0... g0VarArr) {
        ArrayList arrayList = new ArrayList(g0VarArr.length + 1);
        int iOrdinal = g0Var.ordinal();
        ArrayList arrayList2 = this.f44304b;
        arrayList.add((un1.a) arrayList2.get(iOrdinal));
        for (g0 g0Var2 : g0VarArr) {
            arrayList.add((un1.a) arrayList2.get(g0Var2.ordinal()));
        }
        return arrayList;
    }
}
