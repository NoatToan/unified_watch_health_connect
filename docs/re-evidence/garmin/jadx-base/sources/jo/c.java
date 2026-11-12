package jo;

import a51.m;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import f72.fe;
import f72.t0;
import java.util.ArrayList;
import java.util.List;
import k72.k;
import lo.l3;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.w;
import p13.y;
import v62.g5;
import v62.i8;
import v62.l1;
import v62.s0;
import v62.s2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Ljo/c;", "", "Ljo/d;", "filterType", "<init>", "(Ljo/d;)V", "a", "c", "b", "Ljo/c$a;", "Ljo/c$c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f99697b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f99698a;

    private c(d dVar) {
        this.f99698a = dVar;
    }

    public abstract i53.f a(Context context);

    public String b(Context context) {
        context.getClass();
        String string = context.getString(this.f99698a.f99742a);
        string.getClass();
        return string;
    }

    public abstract String c(Context context);

    /* JADX INFO: renamed from: d */
    public abstract boolean getF99728d();

    public abstract c e();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljo/c$b;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f99726a;

            static {
                int[] iArr = new int[d.values().length];
                try {
                    iArr[d.ACTIVITIES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d.DATE_RANGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[d.DISTANCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[d.TIME.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[d.TOTAL_ASCENT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[d.EVENT_TYPE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[d.FAVORITE_ACTIVITIES.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[d.PERSONAL_RECORDS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f99726a = iArr;
            }
        }

        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Ljo/c$a;", "Ljo/c;", "Ljo/d;", "filterType", "<init>", "(Ljo/d;)V", "a", "b", "c", JWKParameterNames.RSA_EXPONENT, "f", "d", "Ljo/c$a$a;", "Ljo/c$a$b;", "Ljo/c$a$c;", "Ljo/c$a$d;", "Ljo/c$a$e;", "Ljo/c$a$f;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a extends c {
        private a(jo.d dVar) {
            super(dVar, null);
        }

        public /* synthetic */ a(jo.d dVar, j jVar) {
            this(dVar);
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljo/c$a$b;", "Ljo/c$a;", "Leo/d;", "startDate", "endDate", "<init>", "(Leo/d;Leo/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final eo.d f99703c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final eo.d f99704d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final boolean f99705e;

            public b(eo.d dVar, eo.d dVar2) {
                super(jo.d.DATE_RANGE, null);
                this.f99703c = dVar;
                this.f99704d = dVar2;
                this.f99705e = (dVar == null && dVar2 == null) ? false : true;
            }

            @Override // jo.c
            public final i53.f a(Context context) {
                context.getClass();
                String strA = io.a.a(context, this.f99703c, this.f99704d, false);
                if (strA == null) {
                    return i53.a.j(j0.f134944a);
                }
                String str = this.f99698a.f99743b;
                s62.a.f157643a.getClass();
                return i53.a.j(w.c(new jo.b(str, str, new l72.j0(strA, null, s0.a(t62.b.f162798a), false, true, 10, null))));
            }

            @Override // jo.c
            public final String c(Context context) {
                context.getClass();
                return io.a.a(context, this.f99703c, this.f99704d, true);
            }

            @Override // jo.c
            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getF99728d() {
                return this.f99705e;
            }

            @Override // jo.c
            public final c e() {
                return new b(null, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return s.g(this.f99703c, bVar.f99703c) && s.g(this.f99704d, bVar.f99704d);
            }

            public final int hashCode() {
                eo.d dVar = this.f99703c;
                int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
                eo.d dVar2 = this.f99704d;
                return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
            }

            public final String toString() {
                return "DateRange(startDate=" + this.f99703c + ", endDate=" + this.f99704d + ")";
            }

            public /* synthetic */ b(eo.d dVar, eo.d dVar2, int i14, j jVar) {
                this((i14 & 1) != 0 ? null : dVar, (i14 & 2) != 0 ? null : dVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
        }

        /* JADX INFO: renamed from: jo.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljo/c$a$a;", "Ljo/c$a;", "", "Lho/b;", "selectedActivityFilterType", "", "wheelchairMode", "<init>", "(Ljava/util/List;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1916a extends a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ int f99699f = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List<ho.b> f99700c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final boolean f99701d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final boolean f99702e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1916a(List<? extends ho.b> list, boolean z14) {
                super(jo.d.ACTIVITIES, null);
                list.getClass();
                this.f99700c = list;
                this.f99701d = z14;
                this.f99702e = !list.isEmpty();
            }

            public static C1916a f(C1916a c1916a, List list) {
                boolean z14 = c1916a.f99701d;
                list.getClass();
                return new C1916a(list, z14);
            }

            @Override // jo.c
            public final i53.f a(Context context) {
                context.getClass();
                List<ho.b> list = this.f99700c;
                ArrayList arrayList = new ArrayList(y.r(list, 10));
                for (ho.b bVar : list) {
                    arrayList.add(new jo.b(bVar.getF84581a().f4358a, this.f99698a.f99743b, new l72.j0(bVar.c(context), null, bVar.getF84581a().s(this.f99701d), false, true, 10, null)));
                }
                return i53.a.j(arrayList);
            }

            @Override // jo.c
            public final String c(Context context) {
                context.getClass();
                return h0.k0(this.f99700c, ", ", null, null, new m(context, 18), 30);
            }

            @Override // jo.c
            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getF99728d() {
                return this.f99702e;
            }

            @Override // jo.c
            public final c e() {
                return f(this, j0.f134944a);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1916a)) {
                    return false;
                }
                C1916a c1916a = (C1916a) obj;
                return s.g(this.f99700c, c1916a.f99700c) && this.f99701d == c1916a.f99701d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f99701d) + (this.f99700c.hashCode() * 31);
            }

            public final String toString() {
                return "Activities(selectedActivityFilterType=" + this.f99700c + ", wheelchairMode=" + this.f99701d + ")";
            }

            public C1916a(List list, boolean z14, int i14, j jVar) {
                this((i14 & 1) != 0 ? j0.f134944a : list, z14);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljo/c$a$d;", "Ljo/c$a;", "Leo/b;", "selectedEventType", "<init>", "(Leo/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ int f99712e = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final eo.b f99713c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final boolean f99714d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(eo.b bVar) {
                super(jo.d.EVENT_TYPE, null);
                bVar.getClass();
                this.f99713c = bVar;
                this.f99714d = !s.g(bVar, eo.b.a.f64758d);
            }

            @Override // jo.c
            public final i53.f a(Context context) {
                context.getClass();
                eo.b bVar = this.f99713c;
                String str = bVar.f64757b;
                if (str != null) {
                    String str2 = this.f99698a.f99743b;
                    String string = context.getString(bVar.f64756a);
                    string.getClass();
                    s62.a.f157643a.getClass();
                    i53.f fVarA = i53.a.a(new jo.b(str, str2, new l72.j0(string, null, t0.a(t62.c.f162799a), false, true, 10, null)));
                    if (fVarA != null) {
                        return fVarA;
                    }
                }
                return i53.a.j(j0.f134944a);
            }

            @Override // jo.c
            public final String c(Context context) {
                context.getClass();
                eo.b bVar = this.f99713c;
                if (bVar.f64757b != null) {
                    return context.getString(bVar.f64756a);
                }
                return null;
            }

            @Override // jo.c
            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getF99728d() {
                return this.f99714d;
            }

            @Override // jo.c
            public final c e() {
                return new d(eo.b.a.f64758d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && s.g(this.f99713c, ((d) obj).f99713c);
            }

            public final int hashCode() {
                return this.f99713c.hashCode();
            }

            public final String toString() {
                return "EventType(selectedEventType=" + this.f99713c + ")";
            }

            public /* synthetic */ d(eo.b bVar, int i14, j jVar) {
                this((i14 & 1) != 0 ? eo.b.a.f64758d : bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public d() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljo/c$a$e;", "Ljo/c$a;", "", "minTimeMinutes", "maxTimeMinutes", "Ljo/a;", "minError", "maxError", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljo/a;Ljo/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Integer f99715c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Integer f99716d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final jo.a f99717e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final jo.a f99718f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f99719g;

            public /* synthetic */ e(Integer num, Integer num2, jo.a aVar, jo.a aVar2, int i14, j jVar) {
                this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : aVar, (i14 & 8) != 0 ? null : aVar2);
            }

            public static e f(e eVar, Integer num, Integer num2, jo.a aVar, jo.a aVar2, int i14) {
                if ((i14 & 1) != 0) {
                    num = eVar.f99715c;
                }
                if ((i14 & 2) != 0) {
                    num2 = eVar.f99716d;
                }
                if ((i14 & 4) != 0) {
                    aVar = eVar.f99717e;
                }
                if ((i14 & 8) != 0) {
                    aVar2 = eVar.f99718f;
                }
                eVar.getClass();
                return new e(num, num2, aVar, aVar2);
            }

            @Override // jo.c
            public final i53.f a(Context context) {
                context.getClass();
                String strC = c(context);
                if (strC == null) {
                    return i53.a.j(j0.f134944a);
                }
                String str = this.f99698a.f99743b;
                s62.a.f157643a.getClass();
                return i53.a.j(w.c(new jo.b(str, str, new l72.j0(strC, null, l1.a(t62.b.f162798a), false, true, 10, null))));
            }

            @Override // jo.c
            public final String c(Context context) {
                context.getClass();
                Integer num = this.f99716d;
                Integer num2 = this.f99715c;
                if (num2 == null && num == null) {
                    return null;
                }
                if (s.g(num2, num)) {
                    return io.b.b(context, Integer.valueOf(num2 != null ? num2.intValue() : 0), eo.e.MINIMUM);
                }
                return context.getString(R.string.string_short_dash_line_string_pattern, io.b.b(context, Integer.valueOf(num2 != null ? num2.intValue() : 0), eo.e.MINIMUM), io.b.b(context, Integer.valueOf(num != null ? num.intValue() : DateTimeConstants.MINUTES_PER_DAY), eo.e.MAXIMUM));
            }

            @Override // jo.c
            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getF99728d() {
                return this.f99719g;
            }

            @Override // jo.c
            public final c e() {
                return new e(null, null, null, null, 12, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return s.g(this.f99715c, eVar.f99715c) && s.g(this.f99716d, eVar.f99716d) && s.g(this.f99717e, eVar.f99717e) && s.g(this.f99718f, eVar.f99718f);
            }

            public final int hashCode() {
                Integer num = this.f99715c;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.f99716d;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                jo.a aVar = this.f99717e;
                int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                jo.a aVar2 = this.f99718f;
                return iHashCode3 + (aVar2 != null ? aVar2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(this.f99715c, "Time(minTimeMinutes=", ", maxTimeMinutes=", ", minError=", this.f99716d);
                sbL.append(this.f99717e);
                sbL.append(", maxError=");
                sbL.append(this.f99718f);
                sbL.append(")");
                return sbL.toString();
            }

            public e() {
                this(null, null, null, null, 15, null);
            }

            public e(Integer num, Integer num2, jo.a aVar, jo.a aVar2) {
                super(jo.d.TIME, null);
                this.f99715c = num;
                this.f99716d = num2;
                this.f99717e = aVar;
                this.f99718f = aVar2;
                this.f99719g = (num == null && num2 == null) ? false : true;
            }
        }

        /* JADX INFO: renamed from: jo.c$a$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljo/c$a$c;", "Ljo/c$a;", "", "minDistance", "maxDistance", "", "isMetric", "Ljo/a;", "minError", "maxError", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;ZLjo/a;Ljo/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1917c extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Integer f99706c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Integer f99707d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final boolean f99708e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final jo.a f99709f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final jo.a f99710g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final boolean f99711h;

            public /* synthetic */ C1917c(Integer num, Integer num2, boolean z14, jo.a aVar, jo.a aVar2, int i14, j jVar) {
                this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, z14, (i14 & 8) != 0 ? null : aVar, (i14 & 16) != 0 ? null : aVar2);
            }

            public static C1917c f(C1917c c1917c, Integer num, Integer num2, jo.a aVar, jo.a aVar2, int i14) {
                if ((i14 & 1) != 0) {
                    num = c1917c.f99706c;
                }
                Integer num3 = num;
                if ((i14 & 2) != 0) {
                    num2 = c1917c.f99707d;
                }
                Integer num4 = num2;
                boolean z14 = c1917c.f99708e;
                if ((i14 & 8) != 0) {
                    aVar = c1917c.f99709f;
                }
                jo.a aVar3 = aVar;
                if ((i14 & 16) != 0) {
                    aVar2 = c1917c.f99710g;
                }
                c1917c.getClass();
                return new C1917c(num3, num4, z14, aVar3, aVar2);
            }

            @Override // jo.c
            public final i53.f a(Context context) {
                context.getClass();
                String strC = c(context);
                if (strC == null) {
                    return i53.a.j(j0.f134944a);
                }
                String str = this.f99698a.f99743b;
                s62.a.f157643a.getClass();
                return i53.a.j(w.c(new jo.b(str, str, new l72.j0(strC, null, s2.a(t62.b.f162798a), false, true, 10, null))));
            }

            @Override // jo.c
            public final String b(Context context) {
                context.getClass();
                String string = context.getString(R.string.string_string_bracket_pattern, context.getString(this.f99698a.f99742a), context.getString((this.f99708e ? l3.KILOMETER : l3.MILE).f113908b));
                string.getClass();
                return string;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x0041  */
            /* JADX WARN: Code duplicated, block: B:26:0x0046  */
            @Override // jo.c
            public final String c(Context context) {
                String string;
                context.getClass();
                Integer num = this.f99707d;
                Integer num2 = this.f99706c;
                if (num2 == null && num == null) {
                    return null;
                }
                if (s.g(num2, num)) {
                    return String.valueOf(num2);
                }
                boolean z14 = this.f99708e;
                l3 l3Var = z14 ? l3.KILOMETER : l3.MILE;
                b bVar = c.f99697b;
                if (num != null) {
                    int iIntValue = num.intValue();
                    bVar.getClass();
                    if (iIntValue > (z14 ? 150 : 100)) {
                        bVar.getClass();
                        string = context.getString(R.string.lbl_string_with_positive_sign_end, String.valueOf(z14 ? 150 : 100));
                    } else {
                        string = String.valueOf(num.intValue());
                    }
                } else {
                    bVar.getClass();
                    string = context.getString(R.string.lbl_string_with_positive_sign_end, String.valueOf(z14 ? 150 : 100));
                }
                string.getClass();
                String string2 = context.getString(R.string.string_short_dash_line_string_pattern, String.valueOf(num2 != null ? num2.intValue() : 0), string);
                string2.getClass();
                return context.getString(R.string.string_space_string_pattern, string2, context.getString(l3Var.f113908b));
            }

            @Override // jo.c
            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getF99728d() {
                return this.f99711h;
            }

            @Override // jo.c
            public final c e() {
                return new C1917c(null, null, this.f99708e, null, null, 24, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1917c)) {
                    return false;
                }
                C1917c c1917c = (C1917c) obj;
                return s.g(this.f99706c, c1917c.f99706c) && s.g(this.f99707d, c1917c.f99707d) && this.f99708e == c1917c.f99708e && s.g(this.f99709f, c1917c.f99709f) && s.g(this.f99710g, c1917c.f99710g);
            }

            public final int hashCode() {
                Integer num = this.f99706c;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.f99707d;
                int iG = q6.f.g((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f99708e);
                jo.a aVar = this.f99709f;
                int iHashCode2 = (iG + (aVar == null ? 0 : aVar.hashCode())) * 31;
                jo.a aVar2 = this.f99710g;
                return iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(this.f99706c, "Distance(minDistance=", ", maxDistance=", ", isMetric=", this.f99707d);
                sbL.append(this.f99708e);
                sbL.append(", minError=");
                sbL.append(this.f99709f);
                sbL.append(", maxError=");
                sbL.append(this.f99710g);
                sbL.append(")");
                return sbL.toString();
            }

            public C1917c(Integer num, Integer num2, boolean z14, jo.a aVar, jo.a aVar2) {
                super(jo.d.DISTANCE, null);
                this.f99706c = num;
                this.f99707d = num2;
                this.f99708e = z14;
                this.f99709f = aVar;
                this.f99710g = aVar2;
                this.f99711h = (num == null && num2 == null) ? false : true;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljo/c$a$f;", "Ljo/c$a;", "", "minAscent", "maxAscent", "", "isMetric", "Ljo/a;", "minError", "maxError", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;ZLjo/a;Ljo/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Integer f99720c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Integer f99721d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final boolean f99722e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final jo.a f99723f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final jo.a f99724g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final boolean f99725h;

            public /* synthetic */ f(Integer num, Integer num2, boolean z14, jo.a aVar, jo.a aVar2, int i14, j jVar) {
                this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, z14, (i14 & 8) != 0 ? null : aVar, (i14 & 16) != 0 ? null : aVar2);
            }

            public static f f(f fVar, Integer num, Integer num2, jo.a aVar, jo.a aVar2, int i14) {
                if ((i14 & 1) != 0) {
                    num = fVar.f99720c;
                }
                Integer num3 = num;
                if ((i14 & 2) != 0) {
                    num2 = fVar.f99721d;
                }
                Integer num4 = num2;
                boolean z14 = fVar.f99722e;
                if ((i14 & 8) != 0) {
                    aVar = fVar.f99723f;
                }
                jo.a aVar3 = aVar;
                if ((i14 & 16) != 0) {
                    aVar2 = fVar.f99724g;
                }
                fVar.getClass();
                return new f(num3, num4, z14, aVar3, aVar2);
            }

            @Override // jo.c
            public final i53.f a(Context context) {
                context.getClass();
                String strC = c(context);
                if (strC == null) {
                    return i53.a.j(j0.f134944a);
                }
                String str = this.f99698a.f99743b;
                s62.a.f157643a.getClass();
                t62.c.f162799a.getClass();
                return i53.a.j(w.c(new jo.b(str, str, new l72.j0(strC, null, k.a(fe.f69560a), false, true, 10, null))));
            }

            @Override // jo.c
            public final String b(Context context) {
                context.getClass();
                String string = context.getString(R.string.string_string_bracket_pattern, context.getString(this.f99698a.f99742a), context.getString((this.f99722e ? l3.METER : l3.FOOT).f113908b));
                string.getClass();
                return string;
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0044  */
            @Override // jo.c
            public final String c(Context context) {
                String string;
                context.getClass();
                Integer num = this.f99721d;
                Integer num2 = this.f99720c;
                if (num2 == null && num == null) {
                    return null;
                }
                if (s.g(num2, num)) {
                    return String.valueOf(num2);
                }
                boolean z14 = this.f99722e;
                l3 l3Var = z14 ? l3.METER : l3.FOOT;
                c.f99697b.getClass();
                int i14 = z14 ? 3000 : 10000;
                if (num != null) {
                    if (num.intValue() > (z14 ? 3000 : 10000)) {
                        string = context.getString(R.string.lbl_string_with_positive_sign_end, String.valueOf(i14));
                    } else {
                        string = String.valueOf(num.intValue());
                    }
                } else {
                    string = context.getString(R.string.lbl_string_with_positive_sign_end, String.valueOf(i14));
                }
                string.getClass();
                String string2 = context.getString(R.string.string_short_dash_line_string_pattern, String.valueOf(num2 != null ? num2.intValue() : 0), string);
                string2.getClass();
                return context.getString(R.string.string_space_string_pattern, string2, context.getString(l3Var.f113908b));
            }

            @Override // jo.c
            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getF99728d() {
                return this.f99725h;
            }

            @Override // jo.c
            public final c e() {
                return new f(null, null, this.f99722e, null, null, 24, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return s.g(this.f99720c, fVar.f99720c) && s.g(this.f99721d, fVar.f99721d) && this.f99722e == fVar.f99722e && s.g(this.f99723f, fVar.f99723f) && s.g(this.f99724g, fVar.f99724g);
            }

            public final int hashCode() {
                Integer num = this.f99720c;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.f99721d;
                int iG = q6.f.g((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f99722e);
                jo.a aVar = this.f99723f;
                int iHashCode2 = (iG + (aVar == null ? 0 : aVar.hashCode())) * 31;
                jo.a aVar2 = this.f99724g;
                return iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(this.f99720c, "TotalAscent(minAscent=", ", maxAscent=", ", isMetric=", this.f99721d);
                sbL.append(this.f99722e);
                sbL.append(", minError=");
                sbL.append(this.f99723f);
                sbL.append(", maxError=");
                sbL.append(this.f99724g);
                sbL.append(")");
                return sbL.toString();
            }

            public f(Integer num, Integer num2, boolean z14, jo.a aVar, jo.a aVar2) {
                super(jo.d.TOTAL_ASCENT, null);
                this.f99720c = num;
                this.f99721d = num2;
                this.f99722e = z14;
                this.f99723f = aVar;
                this.f99724g = aVar2;
                this.f99725h = (num == null && num2 == null) ? false : true;
            }
        }
    }

    public /* synthetic */ c(d dVar, j jVar) {
        this(dVar);
    }

    /* JADX INFO: renamed from: jo.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Ljo/c$c;", "Ljo/c;", "Ljo/d;", "filterType", "", "isSelected", "<init>", "(Ljo/d;Ljava/lang/Boolean;)V", "a", "b", "Ljo/c$c$a;", "Ljo/c$c$b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC1918c extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Boolean f99727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f99728d;

        private AbstractC1918c(d dVar, Boolean bool) {
            super(dVar, null);
            this.f99727c = bool;
            this.f99728d = s.g(bool, Boolean.TRUE);
        }

        @Override // jo.c
        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getF99728d() {
            return this.f99728d;
        }

        /* JADX INFO: renamed from: jo.c$c$a */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljo/c$c$a;", "Ljo/c$c;", "", "isFavorite", "<init>", "(Ljava/lang/Boolean;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends AbstractC1918c {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Boolean f99729e;

            public a(Boolean bool) {
                super(d.FAVORITE_ACTIVITIES, bool, null);
                this.f99729e = bool;
            }

            @Override // jo.c
            public final i53.f a(Context context) {
                context.getClass();
                if (!s.g(this.f99727c, Boolean.TRUE)) {
                    return i53.a.j(j0.f134944a);
                }
                d dVar = this.f99698a;
                String str = dVar.f99743b;
                String string = context.getString(dVar.f99742a);
                string.getClass();
                s62.a.f157643a.getClass();
                return i53.a.j(w.c(new jo.b(str, str, new l72.j0(string, null, i8.a(t62.b.f162798a), false, true, 10, null))));
            }

            @Override // jo.c
            public final String c(Context context) {
                context.getClass();
                if (s.g(this.f99727c, Boolean.TRUE)) {
                    return context.getString(this.f99698a.f99742a);
                }
                return null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // jo.c
            public final c e() {
                return new a(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && s.g(this.f99729e, ((a) obj).f99729e);
            }

            public final int hashCode() {
                Boolean bool = this.f99729e;
                if (bool == null) {
                    return 0;
                }
                return bool.hashCode();
            }

            public final String toString() {
                return "FavoriteActivities(isFavorite=" + this.f99729e + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public /* synthetic */ a(Boolean bool, int i14, j jVar) {
                this((i14 & 1) != 0 ? null : bool);
            }
        }

        /* JADX INFO: renamed from: jo.c$c$b */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljo/c$c$b;", "Ljo/c$c;", "", "isPersonalRecord", "<init>", "(Ljava/lang/Boolean;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends AbstractC1918c {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Boolean f99730e;

            public b(Boolean bool) {
                super(d.PERSONAL_RECORDS, bool, null);
                this.f99730e = bool;
            }

            @Override // jo.c
            public final i53.f a(Context context) {
                context.getClass();
                if (!s.g(this.f99727c, Boolean.TRUE)) {
                    return i53.a.j(j0.f134944a);
                }
                d dVar = this.f99698a;
                String str = dVar.f99743b;
                String string = context.getString(dVar.f99742a);
                string.getClass();
                s62.a.f157643a.getClass();
                return i53.a.j(w.c(new jo.b(str, str, new l72.j0(string, null, g5.a(t62.b.f162798a), false, true, 10, null))));
            }

            @Override // jo.c
            public final String c(Context context) {
                context.getClass();
                if (s.g(this.f99727c, Boolean.TRUE)) {
                    return context.getString(this.f99698a.f99742a);
                }
                return null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // jo.c
            public final c e() {
                return new b(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && s.g(this.f99730e, ((b) obj).f99730e);
            }

            public final int hashCode() {
                Boolean bool = this.f99730e;
                if (bool == null) {
                    return 0;
                }
                return bool.hashCode();
            }

            public final String toString() {
                return "PersonalRecords(isPersonalRecord=" + this.f99730e + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public /* synthetic */ b(Boolean bool, int i14, j jVar) {
                this((i14 & 1) != 0 ? null : bool);
            }
        }

        public /* synthetic */ AbstractC1918c(d dVar, Boolean bool, j jVar) {
            this(dVar, bool);
        }
    }
}
