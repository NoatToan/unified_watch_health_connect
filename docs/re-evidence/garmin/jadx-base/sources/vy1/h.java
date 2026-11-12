package vy1;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.s;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.eventfilter.TIFindEventFilterActivity;
import f12.l;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvy1/h;", "Landroidx/core/view/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f180838a;

    public h(e eVar) {
        this.f180838a = eVar;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.menu_find_an_event, menu);
    }

    @Override // androidx.core.view.s
    public final void Z4(Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_filter);
        if (menuItemFindItem != null) {
            Context contextRequireContext = this.f180838a.requireContext();
            contextRequireContext.getClass();
            oc.b.G(menuItemFindItem, contextRequireContext, R.color.gcm_icon_primary);
        }
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_filter) {
            return false;
        }
        e eVar = this.f180838a;
        BubbleLayout bubbleLayout = eVar.B;
        if (bubbleLayout == null) {
            p005kotlin.jvm.internal.s.m("tooltipView");
            throw null;
        }
        if (bubbleLayout.getVisibility() == 0) {
            BubbleLayout bubbleLayout2 = eVar.B;
            if (bubbleLayout2 == null) {
                p005kotlin.jvm.internal.s.m("tooltipView");
                throw null;
            }
            bubbleLayout2.setVisibility(8);
            new jy1.a((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).f101852a.O2("keyShouldShowTooltip", false);
        }
        TIFindEventFilterActivity.a aVar = TIFindEventFilterActivity.f45949d;
        Context contextRequireContext = eVar.requireContext();
        contextRequireContext.getClass();
        xy1.a aVarD = eVar.C6().z5().d();
        my1.d dVar = aVarD != null ? aVarD.f192698e : null;
        dVar.getClass();
        Boolean bool = eVar.C6().f204393j;
        boolean z14 = eVar.C6().f204395l;
        boolean zG = p005kotlin.jvm.internal.s.g(eVar.C6().f204392i, Boolean.TRUE);
        aVar.getClass();
        Intent intent = new Intent(contextRequireContext, (Class<?>) TIFindEventFilterActivity.class);
        intent.putExtra("GCM_extra_events_filter_dto", dVar);
        intent.putExtra("GCM_extra_is_garmin_coach_flow", bool);
        intent.putExtra("extra_is_fbt_flow", z14);
        intent.putExtra("navigating_from_event_dashboard", zG);
        eVar.requireActivity().startActivityForResult(intent, 123);
        return true;
    }
}
