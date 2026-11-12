package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.h0;
import com.garmin.android.apps.connectmobile.R;
import hx0.k;
import hx0.s0;
import i3.e5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lc.u0;
import o13.p;
import o53.f0;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\t\n\u000bB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/i;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/i$c;", "", "layoutDir", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "<init>", "(ILandroidx/recyclerview/widget/RecyclerView;)V", "b", "a", "c", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends RecyclerView.h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f38983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hx0.f f38984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f38985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LocalDate f38986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet<LocalDate> f38987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet<LocalDate> f38988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet<LocalDate> f38989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<b> f38990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f38991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap<LocalDate, s0> f38992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38993k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/i$a;", "", "<init>", "(Ljava/lang/String;I)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        NORMAL,
        EDIT_RANGE
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/i$b;", "Landroid/os/Parcelable;", "", "monthName", "", "Lorg/joda/time/LocalDate;", "days", "", "showHeader", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f38997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<LocalDate> f38998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f38999c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                String string = parcel.readString();
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new b(string, arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public b(String str, List<LocalDate> list, boolean z14) {
            str.getClass();
            list.getClass();
            this.f38997a = str;
            this.f38998b = list;
            this.f38999c = z14;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f38997a.equals(bVar.f38997a) && this.f38998b.equals(bVar.f38998b) && this.f38999c == bVar.f38999c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f38999c) + u0.b(this.f38997a.hashCode() * 31, 31, this.f38998b);
        }

        public final String toString() {
            return hb.a.k(l2.g("Week(monthName=", this.f38997a, ", days=", this.f38998b, ", showHeader="), this.f38999c, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f38997a);
            Iterator itE = kg.f.e(this.f38998b, parcel);
            while (itE.hasNext()) {
                parcel.writeSerializable((Serializable) itE.next());
            }
            parcel.writeInt(this.f38999c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/i$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "weekView", "<init>", "(Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/i;Landroid/view/View;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f39000d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f39001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f39002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f39003c;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39004a;

            static {
                int[] iArr = new int[RangeCalendarDay.b.values().length];
                try {
                    iArr[RangeCalendarDay.b.PastPeriod.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RangeCalendarDay.b.FuturePeriodStart.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RangeCalendarDay.b.CurrentPeriod.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RangeCalendarDay.b.Unchecked.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[RangeCalendarDay.b.FuturePeriod.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f39004a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar, View view2) {
            super(view2);
            view2.getClass();
            this.f39003c = iVar;
            View viewFindViewById = view2.findViewById(R.id.range_calendar_week_week_label);
            viewFindViewById.getClass();
            this.f39001a = (TextView) viewFindViewById;
            Map mapE = p13.u0.e(new p(0, view2.findViewById(R.id.range_calendar_week_day_0)), new p(1, view2.findViewById(R.id.range_calendar_week_day_1)), new p(2, view2.findViewById(R.id.range_calendar_week_day_2)), new p(3, view2.findViewById(R.id.range_calendar_week_day_3)), new p(4, view2.findViewById(R.id.range_calendar_week_day_4)), new p(5, view2.findViewById(R.id.range_calendar_week_day_5)), new p(6, view2.findViewById(R.id.range_calendar_week_day_6)));
            this.f39002b = mapE;
            for (RangeCalendarDay rangeCalendarDay : mapE.values()) {
                rangeCalendarDay.setOnClickListener(new k(3, this.f39003c, rangeCalendarDay));
            }
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39005a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.EDIT_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39005a = iArr;
        }
    }

    public i(int i14, RecyclerView recyclerView) {
        recyclerView.getClass();
        this.f38983a = recyclerView;
        this.f38985c = a.NORMAL;
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        this.f38986d = localDateNow;
        this.f38987e = new HashSet<>();
        this.f38988f = new HashSet<>();
        this.f38989g = new HashSet<>();
        this.f38990h = new ArrayList<>();
        this.f38991i = i14 == 1;
        this.f38992j = new HashMap<>();
    }

    public static boolean A(Set set) {
        if (!com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.g(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a)) {
            return false;
        }
        Set set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (((LocalDate) it.next()).compareTo((ReadablePartial) LocalDate.now()) <= 0) {
                return true;
            }
        }
        return false;
    }

    public static LocalDate B(LocalDate localDate, Set set) {
        while (set.contains(jg.b.G(localDate))) {
            localDate = jg.b.G(localDate);
        }
        return localDate;
    }

    public static final void r(i iVar, LocalDate localDate, boolean z14) {
        HashMap<LocalDate, s0> map = iVar.f38992j;
        s0 s0Var = map.get(localDate);
        if (s0Var == null || !s0Var.f86171h) {
            return;
        }
        s0 s0Var2 = map.get(localDate.minusDays(1));
        boolean z15 = s0Var2 != null && s0Var2.f86171h;
        LocalDate localDateMinusDays = localDate.minusDays(1);
        localDateMinusDays.getClass();
        boolean zA = iVar.x(localDateMinusDays).a();
        LocalDate localDatePlusDays = localDate;
        int i14 = 0;
        while (true) {
            s0 s0Var3 = map.get(localDate.plusDays(i14));
            if (s0Var3 == null || !s0Var3.f86171h) {
                break;
            }
            localDatePlusDays = localDate.plusDays(i14);
            localDatePlusDays.getClass();
            i14++;
        }
        h0 h0VarI = f0.I(localDate, localDatePlusDays);
        LocalDate localDate2 = h0VarI.f23061a;
        LocalDate localDatePlusDays2 = localDate2.plusDays(h0VarI.c());
        localDatePlusDays2.getClass();
        Iterator<LocalDate> it = f0.I(localDate2, localDatePlusDays2).iterator();
        boolean z16 = false;
        while (true) {
            h0.a aVar = (h0.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            LocalDate localDate3 = (LocalDate) aVar.next();
            HashSet<LocalDate> hashSet = iVar.f38988f;
            if (z14) {
                hashSet.remove(localDate3);
                if (localDate.isEqual(localDate3)) {
                    RangeCalendarDay.b bVarX = iVar.x(localDate3);
                    if (z15 && zA) {
                        z16 = true;
                    }
                    iVar.G(localDate3, bVarX);
                } else {
                    RangeCalendarDay.b bVarX2 = iVar.x(localDate3);
                    if (z16) {
                        iVar.G(localDate3, RangeCalendarDay.b.Uneditable);
                    } else {
                        iVar.G(localDate3, bVarX2);
                    }
                }
            } else {
                hashSet.add(localDate3);
                iVar.G(localDate3, iVar.x(localDate3));
            }
        }
        if (!z15 || zA) {
            return;
        }
        if (z14) {
            LocalDate localDateMinusDays2 = localDate.minusDays(1);
            localDateMinusDays2.getClass();
            iVar.H(localDateMinusDays2, true);
        } else {
            LocalDate localDateMinusDays3 = localDate.minusDays(1);
            localDateMinusDays3.getClass();
            iVar.H(localDateMinusDays3, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    public final void C(LocalDate localDate) {
        RecyclerView.f0 f0VarFindViewHolderForAdapterPosition = this.f38983a.findViewHolderForAdapterPosition(z(localDate));
        c cVar = f0VarFindViewHolderForAdapterPosition instanceof c ? (c) f0VarFindViewHolderForAdapterPosition : null;
        if (cVar != null) {
            int dayOfWeek = localDate.getDayOfWeek();
            vx.i.f180642a.getClass();
            int iA = (vx.i.a() + dayOfWeek) % 7;
            if (this.f38991i) {
                iA = 6 - iA;
            }
            F(localDate, (RangeCalendarDay) cVar.f39002b.get(Integer.valueOf(iA)));
        }
    }

    public final void D(h0 h0Var) {
        Iterator<LocalDate> it = h0Var.iterator();
        while (true) {
            h0.a aVar = (h0.a) it;
            if (!aVar.hasNext()) {
                return;
            } else {
                C((LocalDate) aVar.next());
            }
        }
    }

    public final void E(HashSet hashSet) {
        LocalDate localDateNow;
        if (!A(hashSet)) {
            localDateNow = LocalDate.now();
            localDateNow.getClass();
        } else if (hashSet.contains(LocalDate.now())) {
            LocalDate localDateNow2 = LocalDate.now();
            localDateNow2.getClass();
            localDateNow = jg.b.G(B(localDateNow2, hashSet));
        } else {
            LocalDate localDateNow3 = LocalDate.now();
            localDateNow3.getClass();
            if (hashSet.contains(jg.b.G(localDateNow3))) {
                LocalDate localDateNow4 = LocalDate.now();
                localDateNow4.getClass();
                localDateNow = jg.b.G(B(jg.b.G(localDateNow4), hashSet));
            } else {
                localDateNow = LocalDate.now();
                localDateNow.getClass();
            }
        }
        this.f38986d = localDateNow;
    }

    public final void F(LocalDate localDate, RangeCalendarDay rangeCalendarDay) {
        if (rangeCalendarDay != null) {
            if (u() && localDate != null && (rangeCalendarDay.getEditState() == null || !localDate.equals(rangeCalendarDay.getDate()))) {
                rangeCalendarDay.k(localDate, x(localDate));
                return;
            }
            if (u() && localDate != null) {
                rangeCalendarDay.m(x(localDate));
                return;
            }
            if (!u() && localDate != null) {
                HashMap<LocalDate, s0> map = this.f38992j;
                if (map.get(localDate) != null) {
                    s0 s0Var = map.get(localDate);
                    s0Var.getClass();
                    rangeCalendarDay.setWeekDay(s0Var);
                    return;
                }
            }
            rangeCalendarDay.i(localDate);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    public final void G(LocalDate localDate, RangeCalendarDay.b bVar) {
        RecyclerView.f0 f0VarFindViewHolderForAdapterPosition = this.f38983a.findViewHolderForAdapterPosition(z(localDate));
        c cVar = f0VarFindViewHolderForAdapterPosition instanceof c ? (c) f0VarFindViewHolderForAdapterPosition : null;
        if (cVar != null) {
            int dayOfWeek = localDate.getDayOfWeek();
            vx.i.f180642a.getClass();
            int iA = (vx.i.a() + dayOfWeek) % 7;
            if (this.f38991i) {
                iA = 6 - iA;
            }
            RangeCalendarDay rangeCalendarDay = (RangeCalendarDay) cVar.f39002b.get(Integer.valueOf(iA));
            if (rangeCalendarDay != null) {
                rangeCalendarDay.m(bVar);
            }
        }
    }

    public final void H(LocalDate localDate, boolean z14) {
        HashMap<LocalDate, s0> map;
        int i14 = !z14 ? 1 : 0;
        while (true) {
            LocalDate localDateMinusDays = localDate.minusDays(i14);
            map = this.f38992j;
            s0 s0Var = map.get(localDateMinusDays);
            if (s0Var == null || !s0Var.f86171h) {
                break;
            }
            RangeCalendarDay.b bVar = z14 ? RangeCalendarDay.b.Unchecked : RangeCalendarDay.b.Uneditable;
            LocalDate localDateMinusDays2 = localDate.minusDays(i14);
            localDateMinusDays2.getClass();
            G(localDateMinusDays2, bVar);
            i14++;
        }
        s0 s0Var2 = map.get(localDate);
        if (s0Var2 == null || !s0Var2.f86171h || z14) {
            return;
        }
        G(localDate, RangeCalendarDay.b.Unchecked);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f38990h.size();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        c cVar = (c) f0Var;
        cVar.getClass();
        b bVar = this.f38990h.get(i14);
        bVar.getClass();
        b bVar2 = bVar;
        boolean z14 = bVar2.f38999c;
        TextView textView = cVar.f39001a;
        int i15 = 0;
        if (z14) {
            textView.setText(bVar2.f38997a);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        Iterator<T> it = bVar2.f38998b.iterator();
        while (it.hasNext()) {
            cVar.f39003c.F((LocalDate) it.next(), (RangeCalendarDay) cVar.f39002b.get(Integer.valueOf(i15)));
            i15++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.range_calendar_week, viewGroup, false);
        viewE.getClass();
        return new c(this, viewE);
    }

    public final void t(h0 h0Var) {
        LocalDate localDateG = jg.b.G(h0Var.f23062b);
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        h0 h0VarI = f0.I(jg.b.G(localDateNow), (LocalDate) r13.b.d(this.f38986d, localDateG));
        Iterator<LocalDate> it = h0VarI.iterator();
        while (true) {
            h0.a aVar = (h0.a) it;
            if (!aVar.hasNext()) {
                this.f38986d = localDateG;
                D(h0VarI);
                return;
            }
            LocalDate localDate = (LocalDate) aVar.next();
            boolean zA = j23.g.a.a(h0Var, localDate);
            HashSet<LocalDate> hashSet = this.f38988f;
            if (zA) {
                hashSet.add(localDate);
            } else {
                hashSet.remove(localDate);
            }
        }
    }

    public final boolean u() {
        return this.f38985c == a.EDIT_RANGE;
    }

    public final RangeCalendarDay.b x(LocalDate localDate) {
        s0 s0Var;
        HashMap<LocalDate, s0> map = this.f38992j;
        s0 s0Var2 = map.get(localDate);
        if (s0Var2 != null && s0Var2.f86170g && (s0Var = map.get(localDate)) != null && !s0Var.f86171h) {
            return RangeCalendarDay.b.Uneditable;
        }
        HashSet<LocalDate> hashSet = this.f38988f;
        if (!hashSet.contains(localDate)) {
            return localDate.compareTo((ReadablePartial) this.f38986d) <= 0 ? RangeCalendarDay.b.Unchecked : RangeCalendarDay.b.Uneditable;
        }
        LocalDate localDateJ = localDate;
        while (hashSet.contains(jg.b.J(localDateJ))) {
            localDateJ = jg.b.J(localDateJ);
        }
        h0 h0VarI = f0.I(localDateJ, B(localDate, hashSet));
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        if (j23.g.a.a(h0VarI, localDateNow)) {
            return RangeCalendarDay.b.CurrentPeriod;
        }
        if (localDate.compareTo((ReadablePartial) LocalDate.now()) < 0) {
            return RangeCalendarDay.b.PastPeriod;
        }
        return s.g(h0VarI.f23061a, localDate) ? RangeCalendarDay.b.FuturePeriodStart : RangeCalendarDay.b.FuturePeriod;
    }

    public final int z(LocalDate localDate) {
        Iterator<b> it = this.f38990h.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (it.next().f38998b.contains(localDate)) {
                return i14;
            }
            i14++;
        }
        return -1;
    }
}
