package b4;

import androidx.lifecycle.y0;
import bd0.d0;
import bg2.h;
import bg2.m;
import bg2.o;
import c83.b0;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.devices.setup.BLEScanningActivity;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import m63.x;
import m63.y1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import pc0.i;
import r53.q2;
import yo.q;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15689a;

    public /* synthetic */ b(int i14) {
        this.f15689a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f15689a) {
            case 0:
                return a.f15688a;
            case 1:
                CourseDetailsActivity.a aVar = CourseDetailsActivity.f33024k;
                return Unit.INSTANCE;
            case 2:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
            case 3:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            case 4:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            case 5:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
            case 6:
                b82.e eVar = b82.e.f16533a;
                return Unit.INSTANCE;
            case 7:
                b82.e eVar2 = b82.e.f16533a;
                return Unit.INSTANCE;
            case 8:
                b82.e eVar3 = b82.e.f16533a;
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                int i14 = BLEScanningActivity.A;
                return null;
            case 12:
                return (ic0.b) KoinJavaComponent.get$default(ic0.b.class, null, null, 6, null);
            case 13:
                d0.a aVar2 = d0.f17553e;
                return (i) KoinJavaComponent.get$default(i.class, null, null, 6, null);
            case 14:
                be1.a.b bVar = be1.a.Companion;
                return new m63.e(new m63.e(j63.a.d(x.f117036a)));
            case 15:
                be1.a.b bVar2 = be1.a.Companion;
                return new m63.e(new m63.e(j63.a.d(x.f117036a)));
            case 16:
                h.Companion companion = h.INSTANCE;
                return new m63.e(bg2.d.a.f17859a);
            case 17:
                h.Companion companion2 = h.INSTANCE;
                return new m63.e(y1.f117048a);
            case 18:
                h.Companion companion3 = h.INSTANCE;
                return new m63.e(o.a.f17907a);
            case 19:
                m.f17898a.getClass();
                Object value = m.f17900c.getValue();
                value.getClass();
                return (bg2.a) ((b0) value).b(bg2.a.class);
            case 20:
                m mVar = m.f17898a;
                b0.b bVar3 = new b0.b();
                bVar3.b(m.f17899b);
                bVar3.a(e83.a.c());
                return bVar3.c();
            case 21:
                bl2.b.a aVar3 = bl2.b.f18599l;
                return Unit.INSTANCE;
            case 22:
                return (q) ez0.b.a(ez0.b.f67468a, ez0.c.GC, q.class, new c83.h.a[0], null, null, null, 120);
            case 23:
                return new y0();
            case 24:
                return new y0();
            case 25:
                return new y0();
            case 26:
                return new y0();
            case 27:
                return new y0();
            case 28:
                return q2.a(null);
            default:
                return new y0();
        }
    }
}
