package rs;

import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.library.mapsdkadapter.q;
import com.garmin.android.library.mapsdkadapter.s;
import e23.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lrs/h;", "", "Landroid/view/View;", "parentView", "Lkotlin/Function2;", "Lcom/garmin/android/library/mapsdkadapter/i$d;", "", "", "onDisplayUnavailableMessage", "", "isMapLiteMode", "mapProvider", "<init>", "(Landroid/view/View;Le23/p;ZLcom/garmin/android/library/mapsdkadapter/i$d;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f154317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GCMMapView f154318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f154319c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rs/h$a", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements com.garmin.android.library.mapsdkadapter.i.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<com.garmin.android.library.mapsdkadapter.i.d, Integer, Unit> f154321b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super com.garmin.android.library.mapsdkadapter.i.d, ? super Integer, Unit> pVar) {
            this.f154321b = pVar;
        }

        @Override // com.garmin.android.library.mapsdkadapter.i.l
        public final void O5(com.garmin.android.library.mapsdkadapter.i.d dVar) {
            dVar.getClass();
            h hVar = h.this;
            hVar.f154318b.c();
            hVar.f154318b.setOnClickListener(new pm0.h(14, this.f154321b, dVar));
            v22.e.j(hVar.f154319c);
        }

        @Override // com.garmin.android.library.mapsdkadapter.i.l
        public final void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
            h hVar = h.this;
            hVar.f154318b.setInteractionsEnabled(false);
            iVar.getUiSettings().setAllGesturesEnabled(false);
            if (iVar.getF50264r() == com.garmin.android.library.mapsdkadapter.i.d.BAIDU || iVar.getF50264r() == com.garmin.android.library.mapsdkadapter.i.d.MAPBOX) {
                v22.e.j(hVar.f154319c);
            }
            iVar.A(new r22.a(hVar, 11));
        }
    }

    public h(View view2, p<? super com.garmin.android.library.mapsdkadapter.i.d, ? super Integer, Unit> pVar, boolean z14, com.garmin.android.library.mapsdkadapter.i.d dVar) {
        view2.getClass();
        pVar.getClass();
        this.f154317a = view2;
        View viewFindViewById = view2.findViewById(R.id.map_preview);
        viewFindViewById.getClass();
        GCMMapView gCMMapView = (GCMMapView) viewFindViewById;
        this.f154318b = gCMMapView;
        View viewFindViewById2 = view2.findViewById(R.id.map_progress_bar_layout);
        viewFindViewById2.getClass();
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        this.f154319c = viewGroup;
        if (z14) {
            v22.e.q(viewGroup);
        }
        gCMMapView.setLiteMode(z14);
        gCMMapView.f(null, dVar, null, new a(pVar));
        gCMMapView.onCreate(null);
    }

    public static com.garmin.android.library.mapsdkadapter.e a(h hVar, List list, List list2, ie2.h hVar2, int i14) {
        Collection<s> collection;
        if ((i14 & 1) != 0) {
            list = null;
        }
        if ((i14 & 4) != 0) {
            hVar2 = null;
        }
        hVar.getClass();
        com.garmin.android.library.mapsdkadapter.e.a aVar = new com.garmin.android.library.mapsdkadapter.e.a();
        boolean z14 = false;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Iterator<T> it3 = ((q) it.next()).f50328a.f93153a.iterator();
                while (it3.hasNext()) {
                    aVar.b((com.garmin.android.library.mapsdkadapter.f) it3.next());
                    z14 = true;
                }
            }
        }
        if (list2 != null) {
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                aVar.b(((com.garmin.android.library.mapsdkadapter.p) it4.next()).f50327a.f50309a);
                z14 = true;
            }
        }
        if (hVar2 != null && (collection = hVar2.f93125a) != null) {
            Iterator<T> it5 = collection.iterator();
            while (it5.hasNext()) {
                aVar.b(((s) it5.next()).f50334a);
                z14 = true;
            }
        }
        if (z14) {
            return aVar.a();
        }
        return null;
    }
}
