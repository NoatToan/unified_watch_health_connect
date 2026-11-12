package js0;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.c1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ljs0/e;", "", "Landroid/view/View;", "view", "Ljs0/c;", "pastTripsListAdapter", "upcomingTripsListAdapter", "futureTripsListAdapter", "Lkotlin/Function0;", "", "onAddTripPressed", "Lkotlin/Function2;", "Ljs0/g;", "", "onSwipedItem", "<init>", "(Landroid/view/View;Ljs0/c;Ljs0/c;Ljs0/c;Le23/a;Le23/p;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f100621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f100622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f100623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<Unit> f100624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<g, Integer, Unit> f100625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f100626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f100627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RecyclerView f100628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f100629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RecyclerView f100630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f100631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView f100632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f100633m;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"js0/e$a", "Lr22/c1;", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends c1 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ e f100634h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ g f100635i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i14, e eVar, g gVar, Resources resources, int i15, int i16) {
            super(resources, i14, i15, -1, i16);
            this.f100634h = eVar;
            this.f100635i = gVar;
            resources.getClass();
        }

        @Override // androidx.recyclerview.widget.s.d
        public final void o(int i14, RecyclerView.f0 f0Var) {
            f0Var.getClass();
            this.f100634h.f100625e.invoke(this.f100635i, Integer.valueOf(f0Var.getBindingAdapterPosition()));
        }

        @Override // r22.c1
        public final boolean p(RecyclerView.f0 f0Var) {
            f0Var.getClass();
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(View view2, c cVar, c cVar2, c cVar3, e23.a<Unit> aVar, p<? super g, ? super Integer, Unit> pVar) {
        view2.getClass();
        aVar.getClass();
        pVar.getClass();
        this.f100621a = cVar;
        this.f100622b = cVar2;
        this.f100623c = cVar3;
        this.f100624d = aVar;
        this.f100625e = pVar;
        Context context = view2.getContext();
        context.getClass();
        this.f100626f = context;
        View viewFindViewById = view2.findViewById(R.id.add_trip_button);
        viewFindViewById.getClass();
        this.f100627g = viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.past_trips_list);
        viewFindViewById2.getClass();
        this.f100628h = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.upcoming_trips_header_lbl);
        viewFindViewById3.getClass();
        this.f100629i = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.upcoming_trips_list);
        viewFindViewById4.getClass();
        this.f100630j = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.future_trips_header_lbl);
        viewFindViewById5.getClass();
        this.f100631k = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.future_trips_list);
        viewFindViewById6.getClass();
        this.f100632l = (RecyclerView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.msg_trips_info);
        viewFindViewById7.getClass();
        this.f100633m = (TextView) viewFindViewById7;
    }

    public final s a(g gVar) {
        Context context = this.f100626f;
        return new s(new a(a7.b.getColor(context, R.color.gcm_surface_danger_action), this, gVar, context.getResources(), R.string.lbl_delete, R.dimen.andfont_body_1));
    }

    public final void b() {
        v22.e.j(this.f100628h);
        v22.e.j(this.f100629i);
        v22.e.j(this.f100630j);
        v22.e.j(this.f100631k);
        v22.e.j(this.f100632l);
        v22.e.j(this.f100633m);
    }
}
