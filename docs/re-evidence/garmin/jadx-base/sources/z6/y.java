package z6;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f202747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification.Builder f202748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f202749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f202750d = new Bundle();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f202751e;

    public static class a {
        private a() {
        }

        public static void a(Notification.Builder builder, boolean z14) {
            builder.setAllowSystemGeneratedContextualActions(z14);
        }

        public static void b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            builder.setBubbleMetadata(bubbleMetadata);
        }

        public static void c(Notification.Action.Builder builder, boolean z14) {
            builder.setContextual(z14);
        }

        public static void d(Notification.Builder builder, Object obj) {
            builder.setLocusId((LocusId) obj);
        }
    }

    public static class b {
        private b() {
        }

        public static void a(Notification.Action.Builder builder, boolean z14) {
            builder.setAuthenticationRequired(z14);
        }
    }

    public static final class c {
        private c() {
        }

        public static void a(Notification.Builder builder, String str) {
            builder.setShortCriticalText(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x03bd  */
    public y(q qVar) {
        Notification.BubbleMetadata bubbleMetadataB;
        Bundle[] bundleArr;
        k kVarG;
        int i14;
        this.f202749c = qVar;
        Context context = qVar.f202679a;
        ArrayList<k> arrayList = qVar.f202682d;
        this.f202747a = context;
        Notification.Builder builder = new Notification.Builder(context, qVar.G);
        this.f202748b = builder;
        Notification notification = qVar.N;
        Bundle[] bundleArr2 = null;
        int i15 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(qVar.f202683e).setContentText(qVar.f202684f).setContentInfo(qVar.f202689k).setContentIntent(qVar.f202686h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(qVar.f202687i, (notification.flags & 128) != 0).setNumber(qVar.f202690l).setProgress(qVar.f202697s, qVar.f202698t, qVar.f202699u);
        IconCompat iconCompat = qVar.f202688j;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        builder.setSubText(qVar.f202695q).setUsesChronometer(qVar.f202693o).setPriority(qVar.f202691m);
        w wVar = qVar.f202694p;
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            PendingIntent pendingIntent = rVar.f202708h;
            Integer num = rVar.f202712l;
            k kVarG2 = pendingIntent == null ? rVar.g(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, num, R.color.call_notification_decline_color, rVar.f202709i) : rVar.g(R.drawable.ic_call_decline, R.string.call_notification_decline_action, num, R.color.call_notification_decline_color, pendingIntent);
            PendingIntent pendingIntent2 = rVar.f202707g;
            if (pendingIntent2 == null) {
                kVarG = null;
            } else {
                boolean z14 = rVar.f202710j;
                kVarG = rVar.g(z14 ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer, z14 ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, rVar.f202711k, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(kVarG2);
            ArrayList<k> arrayList3 = rVar.f202741a.f202680b;
            if (arrayList3 != null) {
                i14 = 2;
                for (k kVar : arrayList3) {
                    if (kVar.f202645g) {
                        arrayList2.add(kVar);
                    } else if (!kVar.f202639a.getBoolean("key_action_priority")) {
                        arrayList2.add(kVar);
                        i14--;
                    }
                    if (kVarG != null && i14 == 1) {
                        arrayList2.add(kVarG);
                        i14--;
                    }
                }
            } else {
                i14 = 2;
            }
            if (kVarG != null && i14 >= 1) {
                arrayList2.add(kVarG);
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                a((k) it.next());
            }
        } else {
            Iterator<k> it3 = qVar.f202680b.iterator();
            while (it3.hasNext()) {
                a(it3.next());
            }
        }
        Bundle bundle = qVar.C;
        if (bundle != null) {
            this.f202750d.putAll(bundle);
        }
        this.f202748b.setShowWhen(qVar.f202692n);
        this.f202748b.setLocalOnly(qVar.f202703y);
        this.f202748b.setGroup(qVar.f202700v);
        this.f202748b.setSortKey(qVar.f202702x);
        this.f202748b.setGroupSummary(qVar.f202701w);
        this.f202751e = 0;
        this.f202748b.setCategory(qVar.B);
        this.f202748b.setColor(qVar.D);
        this.f202748b.setVisibility(qVar.E);
        this.f202748b.setPublicVersion(qVar.F);
        this.f202748b.setSound(notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList4 = qVar.Q;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator<String> it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                this.f202748b.addPerson(it4.next());
            }
        }
        if (arrayList.size() > 0) {
            Bundle bundle2 = qVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            int i16 = 0;
            while (i16 < arrayList.size()) {
                String string = Integer.toString(i16);
                k kVar2 = arrayList.get(i16);
                Bundle bundle5 = new Bundle();
                IconCompat iconCompatA = kVar2.a();
                Bundle bundle6 = kVar2.f202639a;
                bundle5.putInt("icon", iconCompatA != null ? iconCompatA.d() : i15);
                bundle5.putCharSequence("title", kVar2.f202647i);
                bundle5.putParcelable("actionIntent", kVar2.f202648j);
                Bundle bundle7 = bundle6 != null ? new Bundle(bundle6) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", kVar2.f202642d);
                bundle5.putBundle("extras", bundle7);
                f0[] f0VarArr = kVar2.f202641c;
                if (f0VarArr == null) {
                    bundleArr = bundleArr2;
                } else {
                    bundleArr = new Bundle[f0VarArr.length];
                    int i17 = 0;
                    while (i17 < f0VarArr.length) {
                        f0 f0Var = f0VarArr[i17];
                        int i18 = i17;
                        Bundle bundle8 = new Bundle();
                        f0[] f0VarArr2 = f0VarArr;
                        Bundle[] bundleArr3 = bundleArr;
                        bundle8.putString("resultKey", f0Var.f202621a);
                        bundle8.putCharSequence(Constants.ScionAnalytics.PARAM_LABEL, f0Var.f202622b);
                        bundle8.putCharSequenceArray("choices", f0Var.f202623c);
                        bundle8.putBoolean("allowFreeFormInput", f0Var.f202624d);
                        bundle8.putBundle("extras", f0Var.f202626f);
                        Set<String> set = f0Var.f202627g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList<String> arrayList5 = new ArrayList<>(set.size());
                            Iterator<String> it5 = set.iterator();
                            while (it5.hasNext()) {
                                arrayList5.add(it5.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList5);
                        }
                        bundleArr3[i18] = bundle8;
                        i17 = i18 + 1;
                        f0VarArr = f0VarArr2;
                        bundleArr = bundleArr3;
                    }
                }
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", kVar2.f202643e);
                bundle5.putInt("semanticAction", kVar2.f202644f);
                bundle4.putBundle(string, bundle5);
                i16++;
                arrayList = arrayList;
                bundleArr2 = null;
                i15 = 0;
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            qVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f202750d.putBundle("android.car.EXTENSIONS", bundle3);
        }
        Icon icon = qVar.P;
        if (icon != null) {
            this.f202748b.setSmallIcon(icon);
        }
        this.f202748b.setExtras(qVar.C);
        this.f202748b.setRemoteInputHistory(null);
        this.f202748b.setBadgeIconType(qVar.H);
        this.f202748b.setSettingsText(qVar.f202696r);
        this.f202748b.setShortcutId(qVar.I);
        this.f202748b.setTimeoutAfter(qVar.K);
        this.f202748b.setGroupAlertBehavior(0);
        if (qVar.A) {
            this.f202748b.setColorized(qVar.f202704z);
        }
        if (!TextUtils.isEmpty(qVar.G)) {
            this.f202748b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator<d0> it6 = qVar.f202681c.iterator();
        while (it6.hasNext()) {
            this.f202748b.addPerson(it6.next().c());
        }
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 29) {
            a.a(this.f202748b, qVar.L);
            Notification.Builder builder2 = this.f202748b;
            p pVar = qVar.M;
            if (pVar == null) {
                bubbleMetadataB = null;
            } else if (i19 >= 30) {
                bubbleMetadataB = p.b.b(pVar);
            } else if (i19 == 29) {
                bubbleMetadataB = p.a.b(pVar);
            } else {
                bubbleMetadataB = null;
            }
            a.b(builder2, bubbleMetadataB);
            a7.d dVar = qVar.J;
            if (dVar != null) {
                a.d(this.f202748b, dVar.f1715b);
            }
        }
        if (i19 >= 36) {
            c.a(this.f202748b, qVar.f202685g);
        }
        if (qVar.O) {
            if (this.f202749c.f202701w) {
                this.f202751e = 2;
            } else {
                this.f202751e = 1;
            }
            this.f202748b.setVibrate(null);
            this.f202748b.setSound(null);
            int i24 = notification.defaults & (-4);
            notification.defaults = i24;
            this.f202748b.setDefaults(i24);
            if (TextUtils.isEmpty(this.f202749c.f202700v)) {
                this.f202748b.setGroup("silent");
            }
            this.f202748b.setGroupAlertBehavior(this.f202751e);
        }
    }

    public final void a(k kVar) {
        IconCompat iconCompatA = kVar.a();
        int i14 = kVar.f202644f;
        boolean z14 = kVar.f202642d;
        Bundle bundle = kVar.f202639a;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatA != null ? iconCompatA.f(null) : null, kVar.f202647i, kVar.f202648j);
        f0[] f0VarArr = kVar.f202641c;
        if (f0VarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[f0VarArr.length];
            for (int i15 = 0; i15 < f0VarArr.length; i15++) {
                f0 f0Var = f0VarArr[i15];
                RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(f0Var.f202621a).setLabel(f0Var.f202622b).setChoices(f0Var.f202623c).setAllowFreeFormInput(f0Var.f202624d).addExtras(f0Var.f202626f);
                Set<String> set = f0Var.f202627g;
                if (set != null) {
                    Iterator<String> it = set.iterator();
                    while (it.hasNext()) {
                        builderAddExtras.setAllowDataType(it.next(), true);
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    f0.a.b(builderAddExtras, f0Var.f202625e);
                }
                remoteInputArr[i15] = builderAddExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z14);
        builder.setAllowGeneratedReplies(z14);
        bundle2.putInt("android.support.action.semanticAction", i14);
        builder.setSemanticAction(i14);
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 29) {
            a.c(builder, kVar.f202645g);
        }
        if (i16 >= 31) {
            b.a(builder, kVar.f202649k);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", kVar.f202643e);
        builder.addExtras(bundle2);
        this.f202748b.addAction(builder.build());
    }
}
