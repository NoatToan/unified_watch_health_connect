package z6;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public class r extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f202705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d0 f202706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f202707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PendingIntent f202708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PendingIntent f202709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f202710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f202711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f202712l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IconCompat f202713m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f202714n;

    public static class a {
        private a() {
        }

        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Parcelable b(Person person) {
            return person;
        }
    }

    public static class b {
        private b() {
        }

        public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
        }

        public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
            return Notification.CallStyle.forOngoingCall(person, pendingIntent);
        }

        public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
        }

        public static Notification.CallStyle d(Notification.CallStyle callStyle, int i14) {
            return callStyle.setAnswerButtonColorHint(i14);
        }

        public static Notification.CallStyle e(Notification.CallStyle callStyle, int i14) {
            return callStyle.setDeclineButtonColorHint(i14);
        }

        public static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z14) {
            return callStyle.setIsVideo(z14);
        }

        public static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
            return callStyle.setVerificationIcon(icon);
        }

        public static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
            return callStyle.setVerificationText(charSequence);
        }
    }

    private r(int i14, d0 d0Var, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
        if (d0Var == null || TextUtils.isEmpty(d0Var.f202600a)) {
            vb.h.s("person must have a non-empty a name");
            throw null;
        }
        this.f202705e = i14;
        this.f202706f = d0Var;
        this.f202707g = pendingIntent3;
        this.f202708h = pendingIntent2;
        this.f202709i = pendingIntent;
    }

    @Override // z6.w
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.f202705e);
        bundle.putBoolean("android.callIsVideo", this.f202710j);
        d0 d0Var = this.f202706f;
        if (d0Var != null) {
            bundle.putParcelable("android.callPerson", a.b(d0Var.c()));
        }
        IconCompat iconCompat = this.f202713m;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", iconCompat.f(this.f202741a.f202679a));
        }
        bundle.putCharSequence("android.verificationText", this.f202714n);
        bundle.putParcelable("android.answerIntent", this.f202707g);
        bundle.putParcelable("android.declineIntent", this.f202708h);
        bundle.putParcelable("android.hangUpIntent", this.f202709i);
        Integer num = this.f202711k;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f202712l;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    @Override // z6.w
    public final void b(y yVar) {
        Notification.Builder builder = yVar.f202748b;
        String string = null;
        callStyleA = null;
        Notification.CallStyle callStyleA = null;
        if (Build.VERSION.SDK_INT < 31) {
            d0 d0Var = this.f202706f;
            builder.setContentTitle(d0Var != null ? d0Var.f202600a : null);
            Bundle bundle = this.f202741a.C;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.f202741a.C.getCharSequence("android.text");
            if (charSequence == null) {
                int i14 = this.f202705e;
                if (i14 == 1) {
                    string = this.f202741a.f202679a.getResources().getString(R.string.call_notification_incoming_text);
                } else if (i14 == 2) {
                    string = this.f202741a.f202679a.getResources().getString(R.string.call_notification_ongoing_text);
                } else if (i14 == 3) {
                    string = this.f202741a.f202679a.getResources().getString(R.string.call_notification_screening_text);
                }
                charSequence = string;
            }
            builder.setContentText(charSequence);
            d0 d0Var2 = this.f202706f;
            if (d0Var2 != null) {
                IconCompat iconCompat = d0Var2.f202601b;
                if (iconCompat != null) {
                    builder.setLargeIcon(iconCompat.f(this.f202741a.f202679a));
                }
                a.a(builder, this.f202706f.c());
            }
            builder.setCategory("call");
            return;
        }
        int i15 = this.f202705e;
        if (i15 == 1) {
            callStyleA = b.a(this.f202706f.c(), this.f202708h, this.f202707g);
        } else if (i15 == 2) {
            callStyleA = b.b(this.f202706f.c(), this.f202709i);
        } else if (i15 == 3) {
            callStyleA = b.c(this.f202706f.c(), this.f202709i, this.f202707g);
        } else if (Log.isLoggable("NotifCompat", 3)) {
            String.valueOf(this.f202705e);
        }
        if (callStyleA != null) {
            callStyleA.setBuilder(builder);
            Integer num = this.f202711k;
            if (num != null) {
                b.d(callStyleA, num.intValue());
            }
            Integer num2 = this.f202712l;
            if (num2 != null) {
                b.e(callStyleA, num2.intValue());
            }
            b.h(callStyleA, this.f202714n);
            IconCompat iconCompat2 = this.f202713m;
            if (iconCompat2 != null) {
                b.g(callStyleA, iconCompat2.f(this.f202741a.f202679a));
            }
            b.f(callStyleA, this.f202710j);
        }
    }

    @Override // z6.w
    public final String d() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // z6.w
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f202705e = bundle.getInt("android.callType");
        this.f202710j = bundle.getBoolean("android.callIsVideo");
        if (bundle.containsKey("android.callPerson")) {
            this.f202706f = d0.a((Person) bundle.getParcelable("android.callPerson"));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.f202706f = d0.b(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            Icon icon = (Icon) bundle.getParcelable("android.verificationIcon");
            PorterDuff.Mode mode = IconCompat.f6391k;
            this.f202713m = IconCompat.a.a(icon);
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.f202713m = IconCompat.b(bundle.getBundle("android.verificationIconCompat"));
        }
        this.f202714n = bundle.getCharSequence("android.verificationText");
        this.f202707g = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.f202708h = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.f202709i = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.f202711k = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.f202712l = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }

    public final k g(int i14, int i15, Integer num, int i16, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(a7.b.getColor(this.f202741a.f202679a, i16));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f202741a.f202679a.getResources().getString(i15));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = this.f202741a.f202679a;
        PorterDuff.Mode mode = IconCompat.f6391k;
        context.getClass();
        k kVarA = new k.a(IconCompat.c(context.getResources(), context.getPackageName(), i14), spannableStringBuilder, pendingIntent).a();
        kVarA.f202639a.putBoolean("key_action_priority", true);
        return kVarA;
    }

    public r(q qVar) {
        f(qVar);
    }

    public r() {
    }
}
