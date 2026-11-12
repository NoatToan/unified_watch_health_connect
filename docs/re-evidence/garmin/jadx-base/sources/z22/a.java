package z22;

import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lz22/a;", "Landroid/app/TimePickerDialog$OnTimeSetListener;", "Landroid/content/Context;", "mContext", "", "mIsStartTime", "Lz22/a$b;", "mCallback", "<init>", "(Landroid/content/Context;ZLz22/a$b;)V", "b", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements TimePickerDialog.OnTimeSetListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3763a f202016d = new C3763a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f202017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f202018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f202019c;

    public interface b {
        void b(String str);
    }

    public a(Context context, boolean z14, b bVar) {
        long jD;
        context.getClass();
        bVar.getClass();
        this.f202017a = context;
        this.f202018b = z14;
        this.f202019c = bVar;
        boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
        int i14 = z14 ? 22 : 6;
        if (z14) {
            l.f68084a.getClass();
            jD = l.a.a().h();
        } else {
            l.f68084a.getClass();
            jD = l.a.a().d();
        }
        l3.f23124b.getClass();
        int[] iArrF = l3.a.f(jD);
        int i15 = 0;
        if (iArrF != null) {
            i14 = iArrF[0];
            i15 = iArrF[1];
        }
        TimePickerDialog timePickerDialog = new TimePickerDialog(context, R.style.GCMTimePicker, this, i14, i15, zIs24HourFormat);
        timePickerDialog.setTitle(z14 ? R.string.sleep_lbl_start_time : R.string.sleep_lbl_wake_time);
        timePickerDialog.show();
        og.a.W(timePickerDialog, context);
        og.a.w(timePickerDialog, context);
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i14, int i15) {
        timePicker.getClass();
        l3.f23124b.getClass();
        long jZ = l3.a.z(i14, i15);
        boolean z14 = this.f202018b;
        Context context = this.f202017a;
        C3763a c3763a = f202016d;
        b bVar = this.f202019c;
        if (z14) {
            l.f68084a.getClass();
            if (jZ == l.a.a().d()) {
                bVar.b(null);
                return;
            }
            l.a.a().U3(jZ);
            c3763a.getClass();
            bVar.b(C3763a.a(context, true));
            return;
        }
        l.f68084a.getClass();
        if (jZ == l.a.a().h()) {
            bVar.b(null);
            return;
        }
        l.a.a().H3(jZ);
        c3763a.getClass();
        bVar.b(C3763a.a(context, false));
    }

    /* JADX INFO: renamed from: z22.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lz22/a$a;", "", "<init>", "()V", "", "SLEEP_START_TIME", "I", "SLEEP_WAKE_TIME", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3763a {
        public /* synthetic */ C3763a(j jVar) {
            this();
        }

        public static String a(Context context, boolean z14) {
            long jD;
            DateTimeFormatter dateTimeFormatterForPattern;
            if (z14) {
                l.f68084a.getClass();
                jD = l.a.a().h();
            } else {
                l.f68084a.getClass();
                jD = l.a.a().d();
            }
            if (z14 && jD == -1) {
                jD = 79200;
            } else if (!z14 && jD == -1) {
                jD = 21600;
            }
            if (DateFormat.is24HourFormat(context)) {
                dateTimeFormatterForPattern = DateTimeFormat.forPattern("HH:mm");
                dateTimeFormatterForPattern.getClass();
            } else {
                dateTimeFormatterForPattern = DateTimeFormat.forPattern("hh:mm a");
                dateTimeFormatterForPattern.getClass();
            }
            DateTimeFormatter dateTimeFormatterWithZone = dateTimeFormatterForPattern.withZone(DateTimeZone.UTC);
            dateTimeFormatterWithZone.getClass();
            String strPrint = dateTimeFormatterWithZone.print(new DateTime(jD * ((long) 1000)));
            strPrint.getClass();
            return strPrint;
        }

        private C3763a() {
        }
    }
}
