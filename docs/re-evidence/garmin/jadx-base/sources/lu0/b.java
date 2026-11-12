package lu0;

import am.j;
import android.content.Context;
import bs2.nv;
import c22.j0;
import c22.l3;
import c22.m3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import f12.l;
import i3.e5;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import v.e0;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Llu0/b;", "", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f114954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f114955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f114958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f114959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f114960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f114961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f114962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f114963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f114964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f114965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f114966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final StringBuilder f114967n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final StringBuilder f114968o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final StringBuilder f114969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final StringBuilder f114970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f114971r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m3 f114972s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f114973t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f114974u;

    /* JADX INFO: renamed from: lu0.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C2185b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f114975a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.TRANSITION_STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.TRANSITION_ENDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.SAMPLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f114975a = iArr;
        }
    }

    static {
        new a(null);
    }

    public b(Context context) {
        context.getClass();
        this.f114954a = context;
        this.f114965l = -1;
        this.f114966m = -1;
        this.f114967n = new StringBuilder();
        this.f114968o = new StringBuilder();
        this.f114969p = new StringBuilder();
        this.f114970q = new StringBuilder();
        String string = context.getString(R.string.lbl_mile);
        string.getClass();
        this.f114971r = string;
        this.f114972s = m3.MILE;
        if (((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y()) {
            this.f114972s = m3.KILOMETER;
            String string2 = context.getString(R.string.lbl_km);
            string2.getClass();
            this.f114971r = string2;
            this.f114973t = true;
        }
    }

    public static String d(Integer num) {
        int iIntValue = num.intValue();
        int i14 = iIntValue / DateTimeConstants.SECONDS_PER_HOUR;
        int i15 = (iIntValue % DateTimeConstants.SECONDS_PER_HOUR) / 60;
        int i16 = iIntValue % 60;
        if (i14 > 0) {
            return String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16)}, 3));
        }
        if (i15 >= 10) {
            return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i15), Integer.valueOf(i16)}, 2));
        }
        return i15 > 0 ? String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i15), Integer.valueOf(i16)}, 2)) : String.format("00:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i16)}, 1));
    }

    public static /* synthetic */ void i(b bVar, boolean z14, boolean z15, Integer num, int i14) {
        boolean z16 = (i14 & 1) == 0;
        if ((i14 & 2) != 0) {
            z14 = false;
        }
        if ((i14 & 4) != 0) {
            z15 = false;
        }
        bVar.h(num, z16, z14, z15);
    }

    public final String a() {
        c cVar = this.f114974u;
        int i14 = cVar == null ? -1 : C2185b.f114975a[cVar.ordinal()];
        StringBuilder sb3 = this.f114967n;
        switch (i14) {
            case 1:
                return this.f114968o.toString();
            case 2:
                return this.f114969p.toString();
            case 3:
                int iLastIndexOf = sb3.lastIndexOf("\n");
                if (iLastIndexOf >= 0) {
                    sb3.delete(iLastIndexOf, sb3.toString().length());
                }
                return sb3.toString();
            case 4:
            case 5:
                return this.f114970q.toString();
            case 6:
                String str = this.f114955b;
                if (str != null && str.length() != 0) {
                    sb3.append(this.f114954a.getString(R.string.live_event_sharing_text_start_livetrack_dot, this.f114955b));
                    sb3.append('\n');
                }
                int iLastIndexOf2 = sb3.lastIndexOf("\n");
                if (iLastIndexOf2 >= 0) {
                    sb3.delete(iLastIndexOf2, sb3.toString().length());
                }
                return sb3.toString();
            default:
                return "";
        }
    }

    public final String b() {
        double d14 = ((double) this.f114957d) / 100.0d;
        l3.a aVar = l3.f23124b;
        DecimalFormat decimalFormat = l3.f23126d;
        aVar.getClass();
        return l3.a.O(this.f114954a, d14, this.f114972s, decimalFormat, true);
    }

    public final String c() {
        String strB = j0.b(Instant.ofEpochSecond(this.f114964k).toDateTime(DateTimeZone.getDefault()), "h:mm a", null);
        return strB == null ? "" : strB;
    }

    public final void e(c cVar) {
        String string;
        cVar.getClass();
        this.f114974u = cVar;
        int i14 = C2185b.f114975a[cVar.ordinal()];
        String string2 = "";
        StringBuilder sb3 = this.f114967n;
        StringBuilder sb4 = this.f114970q;
        Context context = this.f114954a;
        switch (i14) {
            case 1:
                int i15 = this.f114966m;
                short s8 = nv.SWIMMING.f20362a;
                StringBuilder sb5 = this.f114968o;
                if (i15 != s8) {
                    sb5.append(context.getString(R.string.live_event_sharing_text_start));
                } else {
                    a2 a2Var = a2.LIVE_EVENT_SHARING;
                    String strConcat = "Building Start message - multisport, parsed Time: ".concat(c());
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "TextMessage.Builder", strConcat);
                    sb5.append(context.getString(R.string.live_start_multisport_swimming, c()));
                }
                break;
            case 2:
                a2 a2Var2 = a2.LIVE_EVENT_SHARING;
                String strH = j.h(this.f114956c, "Building Stop message. totalTime: ");
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "TextMessage.Builder", strH);
                int i16 = this.f114956c;
                if (i16 > 0) {
                    this.f114969p.append(context.getString(R.string.live_event_sharing_text_end, d(Integer.valueOf(i16))));
                }
                break;
            case 3:
                if (this.f114957d <= 0) {
                    a2 a2Var3 = a2.LIVE_EVENT_SHARING;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var3, "TextMessage.Builder", "Not building a distance message (without cumulative time) totalDistance is not greater than 0");
                } else {
                    String strB = b();
                    a2 a2Var4 = a2.LIVE_EVENT_SHARING;
                    int i17 = this.f114957d;
                    int i18 = this.f114965l;
                    StringBuilder sbR = g.r(i17, "Building Distance message, totalDistance from device is: ", ", formattedDistance: ", strB, ", sportType: ");
                    sbR.append(i18);
                    String string3 = sbR.toString();
                    i2.f36769a.getClass();
                    i2.a.b(a2Var4, "TextMessage.Builder", string3);
                    sb3.append(context.getString(R.string.live_event_sharing_distance, strB));
                    sb3.append('\n');
                }
                break;
            case 4:
                sb4.setLength(0);
                int i19 = this.f114965l;
                if (i19 == nv.SWIMMING.f20362a) {
                    double d14 = (((double) this.f114959f) / 1000.0d) * 0.44704d;
                    jq.a aVar = new jq.a(new l22.a(context));
                    if (!Double.isNaN(d14)) {
                        l3.f23124b.getClass();
                        int iR = l3.a.r(d14, this.f114973t);
                        if (iR > jq.a.f99948b) {
                            string = aVar.f99951a.getString(R.string.no_duration_value);
                        } else {
                            int i24 = jq.a.f99949c;
                            int i25 = iR / i24;
                            int i26 = iR % i24;
                            x0 x0Var = x0.f105818a;
                            string = String.format(Locale.getDefault(), jq.a.f99950d, Arrays.copyOf(new Object[]{Integer.valueOf(i25), Integer.valueOf(i26)}, 2));
                        }
                        string2 = string;
                    }
                    double d15 = ((double) this.f114963j) / 100.0d;
                    sb4.append(context.getString(R.string.live_event_sharing_multisport_swim_finish, c(), String.valueOf(d15), d(Integer.valueOf(this.f114961h)), string2));
                    a2 a2Var5 = a2.LIVE_EVENT_SHARING;
                    int i27 = this.f114963j;
                    int i28 = this.f114959f;
                    int i29 = this.f114961h;
                    String strD = d(Integer.valueOf(i29));
                    StringBuilder sb6 = new StringBuilder("Swimming Sport Type. sessionDistance: ");
                    sb6.append(i27);
                    sb6.append(", meters: ");
                    sb6.append(d15);
                    androidx.core.view.j.m(i28, i29, ", averagePace: ", ", sessionTime: ", sb6);
                    String strO = j.o(", formatted sessionTime: ", strD, sb6);
                    i2.f36769a.getClass();
                    i2.a.b(a2Var5, "TextMessage.Builder", strO);
                } else if (i19 == nv.CYCLING.f20362a) {
                    sb4.append(context.getString(R.string.live_event_sharing_multisport_sport_finish, u0.j(context.getString(R.string.lbl_bike)), d(Integer.valueOf(this.f114961h)), d(Integer.valueOf(this.f114956c))));
                }
                break;
            case 5:
                sb4.setLength(0);
                sb4.append(context.getString(R.string.live_event_sharing_multisport_transition_msg, String.valueOf(this.f114962i), d(Integer.valueOf(this.f114961h))));
                int i30 = this.f114966m;
                if (i30 == nv.RUNNING.f20362a) {
                    string2 = context.getString(R.string.live_event_sharing_multisport_sport_leg_start, u0.j(context.getString(R.string.lbl_run)));
                } else if (i30 == nv.CYCLING.f20362a) {
                    string2 = context.getString(R.string.live_event_sharing_multisport_sport_leg_start, u0.j(context.getString(R.string.lbl_bike)));
                } else if (i30 == nv.SWIMMING.f20362a) {
                    string2 = context.getString(R.string.live_event_sharing_multisport_sport_leg_start, u0.j(context.getString(R.string.lbl_swim)));
                }
                string2.getClass();
                sb4.append(StringUtils.SPACE.concat(string2));
                break;
            case 6:
                sb3.append(context.getString(R.string.live_event_sharing_distance, b()));
                sb3.append('\n');
                break;
            default:
                a2 a2Var6 = a2.LIVE_EVENT_SHARING;
                i2.f36769a.getClass();
                i2.a.f(a2Var6, "TextMessage.Builder", "Oh oh, seems like you didn't set a message Type! Can't send a message without knowing the type ;)");
                break;
        }
    }

    public final void f() {
        StringBuilder sb3 = this.f114967n;
        sb3.setLength(0);
        if (this.f114957d > 0 || this.f114956c > 0) {
            String strB = b();
            String strD = d(Integer.valueOf(this.f114956c));
            a2 a2Var = a2.LIVE_EVENT_SHARING;
            String strH = e0.h(e5.j(this.f114957d, this.f114956c, "In showCumulativeTime() totalDistance from device: ", ", totalTime from Device:", "(in seconds), formattedDistance: "), strB, ", formattedTotalTime: ", strD);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "TextMessage.Builder", strH);
            sb3.append(this.f114954a.getString(R.string.live_event_sharing_distance_with_cumulative_time, strB, strD));
            sb3.append('\n');
        }
    }

    public final void g() {
        c cVar = this.f114974u;
        c cVar2 = c.SAMPLE;
        Context context = this.f114954a;
        StringBuilder sb3 = this.f114967n;
        if (cVar == cVar2) {
            if (this.f114966m != nv.CYCLING.f20362a) {
                sb3.append(context.getString(R.string.live_event_sharing_distance_estimated_finish, "28:15", "9:30 AM CST"));
                sb3.append('\n');
                return;
            } else {
                l3.f23124b.getClass();
                sb3.append(context.getString(R.string.live_event_sharing_distance_estimated_finish, d(Integer.valueOf(l3.a.y(4, 29, 15))), DateTime.now().withTime(13, 30, 0, 0).toString("h:mm a z")));
                sb3.append('\n');
                return;
            }
        }
        int i14 = this.f114960g;
        if (i14 <= 0) {
            a2 a2Var = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "TextMessage.Builder", "In  showEstimatedCompletionTime(), estimatedFinishTime from device is 0 so not showing it");
            Unit unit = Unit.INSTANCE;
            return;
        }
        String strD = d(Integer.valueOf(i14 + this.f114956c));
        String string = DateTime.now().plusSeconds(this.f114960g).toString("h:mm a z");
        a2 a2Var2 = a2.LIVE_EVENT_SHARING;
        String strH = e0.h(e5.j(this.f114960g, this.f114956c, "In  showEstimatedCompletionTime(), estimatedFinishTime from device: ", ", totalTime: ", ", timeLeft: "), strD, ", finishDateTime: ", string);
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "TextMessage.Builder", strH);
        sb3.append(context.getString(R.string.live_event_sharing_distance_estimated_finish, strD, string));
        sb3.append('\n');
    }

    public final void h(Integer num, boolean z14, boolean z15, boolean z16) {
        int i14;
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        StringBuilder sb3 = this.f114967n;
        Context context = this.f114954a;
        if (z14 && (i14 = this.f114958e) > 0) {
            String strD = d(Integer.valueOf(i14));
            String string = context.getString(R.string.lbl_lap);
            string.getClass();
            sb3.append(context.getString(R.string.live_event_sharing_distance_last_lap, string, strD));
            sb3.append('\n');
            return;
        }
        if (!z15 || this.f114958e <= 0) {
            if (z16) {
                l3.a aVar = l3.f23124b;
                long jIntValue = num != null ? num.intValue() : -1L;
                aVar.getClass();
                String strE1 = l3.a.e1(jIntValue);
                if (strE1 == null || strE1.length() == 0) {
                    return;
                }
                sb3.append(context.getString(R.string.live_event_sharing_distance_last_lap, strE1, l3.a.Q(context, l3.a.b(this.f114963j), l3.f23137o, true, zY)));
                sb3.append('\n');
                return;
            }
            return;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            l3.f23124b.getClass();
            float fB = l3.a.b(iIntValue);
            if (fB != 1000.0f && fB != 1609.34f) {
                sb3.append(context.getString(R.string.live_event_sharing_distance_last_lap, l3.a.Q(context, fB, l3.f23137o, true, zY), d(Integer.valueOf(this.f114958e))));
                sb3.append('\n');
            } else {
                String string2 = context.getString(R.string.live_event_sharing_distance_last_lap, this.f114971r, d(Integer.valueOf(this.f114958e)));
                string2.getClass();
                sb3.append(string2);
                sb3.append('\n');
            }
        }
    }

    public final void j() {
        double d14;
        Context context;
        String strN0;
        String str;
        String string;
        c cVar = this.f114974u;
        c cVar2 = c.SAMPLE;
        boolean z14 = this.f114973t;
        StringBuilder sb3 = this.f114967n;
        Context context2 = this.f114954a;
        if (cVar == cVar2) {
            if (this.f114966m != nv.CYCLING.f20362a) {
                String str2 = z14 ? "5:20" : "8:30";
                l3.f23124b.getClass();
                String string2 = context2.getString(l3.a.N1(z14));
                string2.getClass();
                sb3.append(context2.getString(R.string.live_event_sharing_distance_avg_pace, e5.g(str2, StringUtils.SPACE, string2)));
                sb3.append('\n');
                return;
            }
            if (z14) {
                str = l3.f23138p.format(25.5d);
                str.getClass();
                string = context2.getString(q3.KILOMETER_PER_HOUR.f23223e);
                string.getClass();
            } else {
                str = l3.f23138p.format(15.5d);
                str.getClass();
                string = context2.getString(q3.MILE_PER_HOUR.f23223e);
                string.getClass();
            }
            sb3.append(context2.getString(R.string.live_event_sharing_distance_avg_speed, e5.g(str, StringUtils.SPACE, string)));
            sb3.append('\n');
            return;
        }
        int i14 = this.f114959f;
        if (i14 > 0) {
            d14 = 0.44704d;
            if (this.f114966m == nv.RUNNING.f20362a) {
                double d15 = ((double) i14) / 1000.0d;
                String strV0 = l3.a.v0(l3.f23124b, context2, d15 * 0.44704d, z14, true, null, 48);
                a2 a2Var = a2.LIVE_EVENT_SHARING;
                int i15 = this.f114959f;
                StringBuilder sb4 = new StringBuilder("In  showPaceOrSpeed(), average pace from device: ");
                sb4.append(i15);
                sb4.append(", mph: ");
                sb4.append(d15);
                String strO = j.o(", formattedPace: ", strV0, sb4);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "TextMessage.Builder", strO);
                sb3.append(context2.getString(R.string.live_event_sharing_distance_avg_pace, strV0));
                sb3.append('\n');
                return;
            }
        } else {
            d14 = 0.44704d;
        }
        if (i14 <= 0 || this.f114966m != nv.CYCLING.f20362a) {
            a2 a2Var2 = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "TextMessage.Builder", "In  showPaceOrSpeed(), averagePace from device is 0 so not showing it");
            Unit unit = Unit.INSTANCE;
            return;
        }
        double d16 = ((double) i14) / 1000.0d;
        double d17 = d14 * d16;
        l3.a aVar = l3.f23124b;
        DecimalFormat decimalFormat = l3.f23138p;
        aVar.getClass();
        if (z14) {
            context = context2;
            strN0 = l3.a.N0(context, d17, q3.KILOMETER_PER_HOUR, decimalFormat, true, null);
        } else {
            context = context2;
            strN0 = l3.a.N0(context, d17, q3.MILE_PER_HOUR, decimalFormat, true, null);
        }
        a2 a2Var3 = a2.LIVE_EVENT_SHARING;
        int i16 = this.f114959f;
        StringBuilder sb5 = new StringBuilder("In  showPaceOrSpeed(), average pace from device: ");
        sb5.append(i16);
        sb5.append(", mph: ");
        sb5.append(d16);
        String strO2 = j.o(", formattedSpeed: ", strN0, sb5);
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "TextMessage.Builder", strO2);
        sb3.append(context.getString(R.string.live_event_sharing_distance_avg_speed, strN0));
        sb3.append('\n');
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Llu0/b$a;", "", "<init>", "()V", "", "ONE_THOUSAND", "D", "ONE_HUNDRED", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
