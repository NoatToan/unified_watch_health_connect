package of2;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession$notifyActivityAlert$1", f = "LSVSession.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f131793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf2.c.a f131794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, sf2.c.a aVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f131793b = bVar;
        this.f131794c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f131793b, this.f131794c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131792a;
        if (i14 == 0) {
            o13.r.b(obj);
            b0 b0Var = (b0) this.f131793b.f131736o.getValue();
            sf2.c.a aVar2 = this.f131794c;
            ug2.d dVar = aVar2.f158892a;
            List<sf2.c.a.C3002a> list = aVar2.f158893b;
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            int i15 = 0;
            for (Object obj2 : list) {
                int i16 = i15 + 1;
                Integer num = null;
                if (i15 < 0) {
                    p13.x.q();
                    throw null;
                }
                sf2.c.a.C3002a c3002a = (sf2.c.a.C3002a) obj2;
                if (aVar2.f158892a == ug2.d.LAP && i15 == 0) {
                    num = new Integer(R.string.lap_value);
                }
                arrayList.add(new ug2.a(num, c3002a.f158894a, c3002a.f158896c, c3002a.f158897d));
                i15 = i16;
            }
            sf2.e.a aVar3 = new sf2.e.a(dVar, arrayList);
            this.f131792a = 1;
            if (b0Var.d(aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
