package z6;

import android.app.Notification;
import android.app.Person;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.gncs.NotificationConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class u extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f202716e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f202717f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d0 f202718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f202719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f202720i;

    public static class a {
        private a() {
        }

        public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
            return messagingStyle.addMessage(message);
        }

        public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
            return messagingStyle.setConversationTitle(charSequence);
        }
    }

    public static class b {
        private b() {
        }

        public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
            return messagingStyle.addHistoricMessage(message);
        }
    }

    public static class c {
        private c() {
        }

        public static Notification.MessagingStyle a(Person person) {
            return new Notification.MessagingStyle(person);
        }

        public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z14) {
            return messagingStyle.setGroupConversation(z14);
        }
    }

    public u(d0 d0Var) {
        if (TextUtils.isEmpty(d0Var.f202600a)) {
            vb.h.s("User's name must not be empty.");
            throw null;
        }
        this.f202718g = d0Var;
    }

    @Override // z6.w
    public final void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f202718g.f202600a);
        d0 d0Var = this.f202718g;
        d0Var.getClass();
        Bundle bundle3 = new Bundle();
        bundle3.putCharSequence("name", d0Var.f202600a);
        IconCompat iconCompat = d0Var.f202601b;
        if (iconCompat != null) {
            bundle2 = new Bundle();
            switch (iconCompat.f6392a) {
                case -1:
                    bundle2.putParcelable("obj", (Parcelable) iconCompat.f6393b);
                    break;
                case 0:
                default:
                    vb.h.s("Invalid icon");
                    return;
                case 1:
                case 5:
                    bundle2.putParcelable("obj", (Bitmap) iconCompat.f6393b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle2.putString("obj", (String) iconCompat.f6393b);
                    break;
                case 3:
                    bundle2.putByteArray("obj", (byte[]) iconCompat.f6393b);
                    break;
            }
            bundle2.putInt(NotificationConstants.KEY_DATA_MIME_TYPE, iconCompat.f6392a);
            bundle2.putInt("int1", iconCompat.f6396e);
            bundle2.putInt("int2", iconCompat.f6397f);
            bundle2.putString("string1", iconCompat.f6401j);
            ColorStateList colorStateList = iconCompat.f6398g;
            if (colorStateList != null) {
                bundle2.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f6399h;
            if (mode != IconCompat.f6391k) {
                bundle2.putString("tint_mode", mode.name());
            }
        } else {
            bundle2 = null;
        }
        bundle3.putBundle("icon", bundle2);
        bundle3.putString("uri", d0Var.f202602c);
        bundle3.putString(Action.KEY_ATTRIBUTE, d0Var.f202603d);
        bundle3.putBoolean("isBot", d0Var.f202604e);
        bundle3.putBoolean("isImportant", d0Var.f202605f);
        bundle.putBundle("android.messagingStyleUser", bundle3);
        bundle.putCharSequence("android.hiddenConversationTitle", this.f202719h);
        if (this.f202719h != null && this.f202720i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f202719h);
        }
        ArrayList arrayList = this.f202716e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", d.a(arrayList));
        }
        ArrayList arrayList2 = this.f202717f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", d.a(arrayList2));
        }
        Boolean bool = this.f202720i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // z6.w
    public final void b(y yVar) {
        q qVar = this.f202741a;
        boolean zBooleanValue = false;
        if (qVar == null || qVar.f202679a.getApplicationInfo().targetSdkVersion >= 28 || this.f202720i != null) {
            Boolean bool = this.f202720i;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else if (this.f202719h != null) {
            zBooleanValue = true;
        }
        this.f202720i = Boolean.valueOf(zBooleanValue);
        Notification.MessagingStyle messagingStyleA = c.a(this.f202718g.c());
        Iterator it = this.f202716e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d dVar = (d) it.next();
            d0 d0Var = dVar.f202723c;
            Notification.MessagingStyle.Message messageB = d.b.b(dVar.f202721a, dVar.f202722b, d0Var != null ? d0Var.c() : null);
            String str = dVar.f202725e;
            if (str != null) {
                d.a.a(messageB, str, dVar.f202726f);
            }
            a.a(messagingStyleA, messageB);
        }
        for (d dVar2 : this.f202717f) {
            d0 d0Var2 = dVar2.f202723c;
            Notification.MessagingStyle.Message messageB2 = d.b.b(dVar2.f202721a, dVar2.f202722b, d0Var2 == null ? null : d0Var2.c());
            String str2 = dVar2.f202725e;
            if (str2 != null) {
                d.a.a(messageB2, str2, dVar2.f202726f);
            }
            b.a(messagingStyleA, messageB2);
        }
        this.f202720i.getClass();
        a.b(messagingStyleA, this.f202719h);
        c.b(messagingStyleA, this.f202720i.booleanValue());
        messagingStyleA.setBuilder(yVar.f202748b);
    }

    @Override // z6.w
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    @Override // z6.w
    public final String d() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // z6.w
    public final void e(Bundle bundle) {
        super.e(bundle);
        ArrayList arrayList = this.f202716e;
        arrayList.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f202718g = d0.b(bundle.getBundle("android.messagingStyleUser"));
        } else {
            d0.a aVar = new d0.a();
            aVar.f202606a = bundle.getString("android.selfDisplayName");
            this.f202718g = new d0(aVar);
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f202719h = charSequence;
        if (charSequence == null) {
            this.f202719h = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(d.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f202717f.addAll(d.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.f202720i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f202721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f202722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d0 f202723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f202724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f202725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Uri f202726f;

        public static class a {
            private a() {
            }

            public static Notification.MessagingStyle.Message a(Notification.MessagingStyle.Message message, String str, Uri uri) {
                return message.setData(str, uri);
            }
        }

        public static class b {
            private b() {
            }

            public static Parcelable a(Person person) {
                return person;
            }

            public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j8, Person person) {
                return new Notification.MessagingStyle.Message(charSequence, j8, person);
            }
        }

        public d(CharSequence charSequence, long j8, d0 d0Var) {
            this.f202724d = new Bundle();
            this.f202721a = charSequence;
            this.f202722b = j8;
            this.f202723c = d0Var;
        }

        public static Bundle[] a(ArrayList arrayList) {
            Bundle[] bundleArr = new Bundle[arrayList.size()];
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                d dVar = (d) arrayList.get(i14);
                d0 d0Var = dVar.f202723c;
                Bundle bundle = new Bundle();
                CharSequence charSequence = dVar.f202721a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", dVar.f202722b);
                if (d0Var != null) {
                    bundle.putCharSequence(NotificationConstants.KEY_MESSAGE_SENDER, d0Var.f202600a);
                    bundle.putParcelable(NotificationConstants.KEY_MESSAGE_SENDER_PERSON, b.a(d0Var.c()));
                }
                String str = dVar.f202725e;
                if (str != null) {
                    bundle.putString(NotificationConstants.KEY_DATA_MIME_TYPE, str);
                }
                Uri uri = dVar.f202726f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = dVar.f202724d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                bundleArr[i14] = bundle;
            }
            return bundleArr;
        }

        public static ArrayList b(Parcelable[] parcelableArr) {
            d0 d0Var;
            ArrayList arrayList = new ArrayList(parcelableArr.length);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable instanceof Bundle) {
                    Bundle bundle = (Bundle) parcelable;
                    d dVar = null;
                    try {
                        if (bundle.containsKey("text") && bundle.containsKey("time")) {
                            if (bundle.containsKey("person")) {
                                d0Var = d0.b(bundle.getBundle("person"));
                            } else if (bundle.containsKey(NotificationConstants.KEY_MESSAGE_SENDER_PERSON)) {
                                d0Var = d0.a((Person) bundle.getParcelable(NotificationConstants.KEY_MESSAGE_SENDER_PERSON));
                            } else if (bundle.containsKey(NotificationConstants.KEY_MESSAGE_SENDER)) {
                                d0.a aVar = new d0.a();
                                aVar.f202606a = bundle.getCharSequence(NotificationConstants.KEY_MESSAGE_SENDER);
                                d0Var = new d0(aVar);
                            } else {
                                d0Var = null;
                            }
                            d dVar2 = new d(bundle.getCharSequence("text"), bundle.getLong("time"), d0Var);
                            if (bundle.containsKey(NotificationConstants.KEY_DATA_MIME_TYPE) && bundle.containsKey("uri")) {
                                String string = bundle.getString(NotificationConstants.KEY_DATA_MIME_TYPE);
                                Uri uri = (Uri) bundle.getParcelable("uri");
                                dVar2.f202725e = string;
                                dVar2.f202726f = uri;
                            }
                            if (bundle.containsKey("extras")) {
                                dVar2.f202724d.putAll(bundle.getBundle("extras"));
                            }
                            dVar = dVar2;
                        }
                    } catch (ClassCastException unused) {
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                }
            }
            return arrayList;
        }

        @Deprecated
        public d(CharSequence charSequence, long j8, CharSequence charSequence2) {
            d0.a aVar = new d0.a();
            aVar.f202606a = charSequence2;
            this(charSequence, j8, new d0(aVar));
        }
    }

    @Deprecated
    public u(CharSequence charSequence) {
        d0.a aVar = new d0.a();
        aVar.f202606a = charSequence;
        this.f202718g = new d0(aVar);
    }

    public u() {
    }
}
