package jh0;

import a7.b;
import android.content.Context;
import bv.d;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.LineDataSet;
import dh0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k00.c;
import k00.h;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.t0;
import p13.w;
import pi0.e;
import xz.f;
import xz.g;
import zz.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000fB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ljh0/a;", "Lk00/h;", "", "Ldh0/i;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/DateTime;", "startDate", "endDate", "", "daily", "", "allowedContinuousDataSetNoValueEntriesCount", "<init>", "(Landroid/content/Context;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZI)V", "a", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends h<List<? extends i>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f98747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f98748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f98749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f98750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ih0.i f98751j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f98752k;

    static {
        new C1898a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, DateTime dateTime, DateTime dateTime2, boolean z14, int i14) {
        context.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        LocalDate localDate = dateTime.toLocalDate();
        localDate.getClass();
        LocalDate localDate2 = dateTime2.toLocalDate();
        localDate2.getClass();
        super(context, localDate, localDate2, z14);
        this.f98747f = i14;
        Integer numValueOf = Integer.valueOf(((d) KoinJavaComponent.get$default(d.class, null, null, 6, null)).u());
        Integer num = numValueOf.intValue() > 0 ? numValueOf : null;
        this.f98748g = num != null ? num.intValue() : 33;
        this.f98749h = R.color.gcm_chart_fitness_age_data_set;
        this.f98750i = b.getColor(context, R.color.gcm_chart_fitness_age_data_set);
        this.f98751j = new ih0.i(context);
        this.f98752k = new e(context);
    }

    public static ArrayList E(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Double d14 = ((i) it.next()).f59602b;
            Float fValueOf = d14 != null ? Float.valueOf((float) d14.doubleValue()) : null;
            if (fValueOf != null) {
                arrayList.add(fValueOf);
            }
        }
        return arrayList;
    }

    @Override // k00.h
    public final /* bridge */ /* synthetic */ Integer B(List<? extends i> list) {
        return 3;
    }

    @Override // k00.h
    public final float C(List<? extends i> list) {
        Float fQ0;
        Float fV0;
        List<? extends i> list2 = list;
        ArrayList arrayListE = E(list2);
        float fFloatValue = this.f98748g;
        float fCeil = (float) Math.ceil((arrayListE == null || (fV0 = h0.v0(arrayListE)) == null) ? fFloatValue : fV0.floatValue());
        ArrayList arrayListE2 = E(list2);
        if (arrayListE2 != null && (fQ0 = h0.q0(arrayListE2)) != null) {
            fFloatValue = fQ0.floatValue();
        }
        float fFloor = (float) Math.floor(fFloatValue);
        float f14 = 2;
        if ((fCeil + fFloor) % f14 != 0.0f) {
            fFloor++;
        }
        return fFloor + f14;
    }

    @Override // k00.h
    public final float D(List<? extends i> list) {
        Float fV0;
        ArrayList arrayListE = E(list);
        return ((float) Math.ceil((arrayListE == null || (fV0 = h0.v0(arrayListE)) == null) ? this.f98748g : fV0.floatValue())) - 2;
    }

    @Override // qz.c
    public final List u(Object obj) {
        String string = this.f101981a.getString(R.string.lbl_fitness_age);
        string.getClass();
        return w.c(new f(string, null, Integer.valueOf(this.f98750i), null, g.a.f192745a, null, null, 106, null));
    }

    @Override // k00.h
    public final LineDataSet x(String str, List list) {
        list.getClass();
        str.getClass();
        return gl1.d.r(list, str, this.f101984d, Integer.valueOf(this.f98750i));
    }

    @Override // k00.h
    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getF98747f() {
        return this.f98747f;
    }

    @Override // k00.h
    public final Map z(List<? extends i> list) {
        ArrayList arrayList;
        c cVar;
        List<? extends i> list2 = list;
        if (list2 != null) {
            ArrayList<i> arrayList2 = new ArrayList();
            for (Object obj : list2) {
                i iVar = (i) obj;
                if (iVar.f59601a != null && iVar.f59602b != null) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList();
            for (i iVar2 : arrayList2) {
                LocalDate localDateNow = iVar2.f59601a;
                if (localDateNow == null) {
                    localDateNow = LocalDate.now();
                }
                Double d14 = iVar2.f59602b;
                if (d14 != null) {
                    localDateNow.getClass();
                    String strD = this.f98752k.d(localDateNow, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                    ih0.i iVar3 = this.f98751j;
                    String strB = iVar3.b(d14);
                    l22.a aVar = iVar3.f93454a;
                    l lVar = new l(strD, strB, this.f101984d ? aVar.getString(R.string.lbl_fitness_age) : aVar.a(R.string.string_space_string_pattern, aVar.getString(R.string.lbl_fitness_age), aVar.getString(R.string.lbl_7d_avg_paranthesis)), null, null, Integer.valueOf(this.f98749h), null, null, 216, null);
                    DateTime dateTimeAtStartOfDay = localDateNow.toDateTimeAtStartOfDay();
                    dateTimeAtStartOfDay.getClass();
                    cVar = new c(dateTimeAtStartOfDay, (float) d14.doubleValue(), lVar);
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return null;
        }
        return t0.b(new p("FITNESS_AGE", arrayList));
    }

    /* JADX INFO: renamed from: jh0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Ljh0/a$a;", "", "<init>", "()V", "", "DATA_SET_LABEL", "Ljava/lang/String;", "", "DEFAULT_USER_AGE", "I", "CHART_MARGIN_DELTA_YEARS", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1898a {
        public /* synthetic */ C1898a(j jVar) {
            this();
        }

        private C1898a() {
        }
    }
}
