package hy;

import android.view.View;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lhy/i;", "Le32/p;", "", "Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO;", "Landroid/view/View;", "view", "Lorg/joda/time/DateTime;", "date", "Le32/l;", "Lhy/g;", "navigator", "<init>", "(Landroid/view/View;Lorg/joda/time/DateTime;Le32/l;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements e32.p<List<? extends CalendarItemDTO>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f86336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f86337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f86338c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86339a;

        static {
            int[] iArr = new int[CalendarItemDTO.b.values().length];
            try {
                iArr[CalendarItemDTO.b.MOVE_IQ_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CalendarItemDTO.b.ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CalendarItemDTO.b.HEALTH_SNAPSHOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CalendarItemDTO.b.ECG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CalendarItemDTO.b.MENSTRUAL_CYCLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CalendarItemDTO.b.WORKOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CalendarItemDTO.b.FBT_ADAPTIVE_WORKOUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CalendarItemDTO.b.EVENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CalendarItemDTO.b.JET_LAG_TRIP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f86339a = iArr;
        }
    }

    public i(View view2, DateTime dateTime, e32.l<g> lVar) {
        view2.getClass();
        lVar.getClass();
        this.f86336a = view2;
        this.f86337b = dateTime;
        this.f86338c = new s(view2, new h(0, lVar, this));
    }

    @Override // e32.p
    public final void a() {
        j0 j0Var = j0.f134944a;
        s sVar = this.f86338c;
        sVar.getClass();
        j0Var.getClass();
        r rVar = sVar.f86360a;
        rVar.f86359f.clear();
        rVar.notifyDataSetChanged();
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(List<? extends CalendarItemDTO> list) {
        return false;
    }

    @Override // e32.p
    public final void c(List<? extends CalendarItemDTO> list) {
        List<? extends CalendarItemDTO> list2 = list;
        if (list2 == null) {
            list2 = j0.f134944a;
        }
        s sVar = this.f86338c;
        sVar.getClass();
        list2.getClass();
        r rVar = sVar.f86360a;
        ArrayList arrayList = rVar.f86359f;
        arrayList.clear();
        if (!list2.isEmpty()) {
            arrayList.addAll(list2);
        }
        rVar.notifyDataSetChanged();
    }
}
