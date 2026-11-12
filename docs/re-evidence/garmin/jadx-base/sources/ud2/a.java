package ud2;

import androidx.lifecycle.i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.library.geolocationrestapi.CountrySettingActivity;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;
import tr2.o;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.geolocationrestapi.CountrySettingActivity$fetchCountryList$1", f = "CountrySettingActivity.kt", l = {137}, m = "invokeSuspend")
public final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CountrySettingActivity f170014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f170015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CountrySettingActivity f170016c;

    /* JADX INFO: renamed from: ud2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.geolocationrestapi.CountrySettingActivity$fetchCountryList$1$2", f = "CountrySettingActivity.kt", l = {}, m = "invokeSuspend")
    public static final class C3177a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountrySettingActivity f170017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f170018b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3177a(CountrySettingActivity countrySettingActivity, int i14, t13.d<? super C3177a> dVar) {
            super(2, dVar);
            this.f170017a = countrySettingActivity;
            this.f170018b = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C3177a(this.f170017a, this.f170018b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C3177a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            CountrySettingActivity countrySettingActivity = this.f170017a;
            com.garmin.android.library.geolocationrestapi.a aVar2 = countrySettingActivity.f50144c;
            if (aVar2 == null) {
                s.m("countrySettingAdapter");
                throw null;
            }
            List<String> list = countrySettingActivity.f50147f;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(CountrySettingActivity.O9(countrySettingActivity, (String) it.next()));
            }
            aVar2.f50149a = arrayList;
            int i14 = this.f170018b;
            aVar2.f50150b = i14;
            aVar2.notifyDataSetChanged();
            RecyclerView recyclerView = countrySettingActivity.f50143b;
            if (recyclerView == null) {
                s.m("recyclerView");
                throw null;
            }
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i14, 0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CountrySettingActivity countrySettingActivity, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f170016c = countrySettingActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f170016c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        CountrySettingActivity countrySettingActivity;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170015b;
        CountrySettingActivity countrySettingActivity2 = this.f170016c;
        try {
            if (i14 == 0) {
                r.b(obj);
                ve2.e eVar = countrySettingActivity2.f50145d;
                if (eVar == null) {
                    s.m("ssoEnvironment");
                    throw null;
                }
                this.f170014a = countrySettingActivity2;
                this.f170015b = 1;
                x53.c cVar = s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new c(eVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
                countrySettingActivity = countrySettingActivity2;
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                countrySettingActivity = this.f170014a;
                r.b(obj);
            }
            countrySettingActivity.f50147f = h0.N0((Iterable) obj, new a61.c(new o(countrySettingActivity2, 6), 26));
            int iG0 = h0.g0(countrySettingActivity2.f50146e, countrySettingActivity2.f50147f);
            i0 i0VarW = f0.w(countrySettingActivity2);
            x53.c cVar2 = s0.f129406a;
            ge1.b.T(i0VarW, u53.o.f168762a, null, new C3177a(countrySettingActivity2, iG0, null), 2);
        } catch (Throwable th3) {
            LoggerFactory.getLogger("GeoLocationService").warn("fetchCountryList", th3);
        }
        return Unit.INSTANCE;
    }
}
