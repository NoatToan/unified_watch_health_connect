package com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import c22.s3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import ei0.u0;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.x;
import rg0.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/g;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lid1/b$a;", "addItemDelegate", "Lei0/u0$b;", "connectionSelectedListener", "Lhl/a;", "screenAccessRole", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView;Lid1/b$a;Lei0/u0$b;Lhl/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f35080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final id1.b.a f35081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hl.a f35082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final id1.c f35083d;

    public g(Context context, RecyclerView recyclerView, id1.b.a aVar, u0.b bVar, hl.a aVar2) {
        context.getClass();
        recyclerView.getClass();
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        this.f35080a = context;
        this.f35081b = aVar;
        this.f35082c = aVar2;
        this.f35083d = new id1.c(context, x.k(new tg0.b(context, null, 2, null), new u0(context, bVar), new id1.b()), recyclerView, null, 8, null);
        recyclerView.setPadding(0, 0, 0, recyclerView.getResources().getDimensionPixelSize(R.dimen.spacing_normal));
        a(j0.f134944a);
    }

    public final void a(List<? extends f> list) {
        String string;
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (f fVar : list) {
            boolean zG = s.g(fVar, f.b.f35068a);
            Context context = this.f35080a;
            if (zG) {
                String string2 = context.getString(R.string.accounts_you_can_view);
                string2.getClass();
                arrayListL.add(new tg0.b.a(string2, new r82.e(18)));
            } else if (s.g(fVar, f.c.f35069a)) {
                String string3 = context.getString(R.string.people_who_add_you_authorized);
                string3.getClass();
                arrayListL.add(new tg0.b.a(string3, new r82.e(16)));
            } else if (fVar instanceof f.d) {
                f.d dVar = (f.d) fVar;
                boolean z14 = dVar.f35072c;
                String string4 = z14 ? context.getString(R.string.request_declined) : dVar.f35071b;
                string4.getClass();
                String string5 = z14 ? null : context.getString(R.string.lbl_accept);
                String string6 = z14 ? null : context.getString(R.string.lbl_decline);
                h0 h0Var = dVar.f35070a;
                arrayListL.add(new u0.a(h0Var.f152559a, null, h0Var.f152560b, string4, 0, false, null, false, string5, string6, u0.a.EnumC1362a.ReceivedInvite, h0Var.f152561c, 192, null));
            } else if (s.g(fVar, f.e.f35073a)) {
                if (s3.b()) {
                    string = context.getString(R.string.msg_authorized_viewers_have_data_access);
                } else {
                    hl.a aVar = this.f35082c;
                    if (aVar instanceof hl.a.b) {
                        string = context.getString(R.string.msg_authorized_viewers_have_data_access);
                    } else {
                        if (!(aVar instanceof hl.a.c)) {
                            lc.u0.r();
                            return;
                        }
                        string = context.getString(R.string.authorized_viewers_have_access);
                    }
                }
                string.getClass();
                arrayListL.add(new tg0.b.a(string, new r82.e(17)));
            } else if (fVar instanceof f.a) {
                f.a aVar2 = (f.a) fVar;
                h0 h0Var2 = aVar2.f35065a;
                arrayListL.add(new u0.a(h0Var2.f152559a, null, h0Var2.f152560b, aVar2.f35066b, 0, true, null, false, null, null, aVar2.f35067c, h0Var2.f152561c, 960, null));
            } else if (fVar instanceof f.h) {
                h0 h0Var3 = ((f.h) fVar).f35077a;
                long j8 = h0Var3.f152559a;
                String str = h0Var3.f152560b;
                String string7 = context.getString(R.string.connection_request_sent);
                string7.getClass();
                arrayListL.add(new u0.a(j8, null, str, string7, 0, true, null, false, null, null, u0.a.EnumC1362a.IssuedInvite, h0Var3.f152561c, 960, null));
            } else if (s.g(fVar, f.i.f35078a)) {
                String string8 = context.getString(R.string.add_authorized_viewer);
                string8.getClass();
                arrayListL.add(new id1.b.C1774b(string8, this.f35081b));
            } else if (s.g(fVar, f.j.f35079a)) {
                String string9 = context.getString(R.string.your_authorized_viewers);
                string9.getClass();
                arrayListL.add(new tg0.b.a(string9, new r82.e(18)));
            } else if (!(fVar instanceof f.C0601f)) {
                lc.u0.r();
                return;
            } else {
                f.C0601f c0601f = (f.C0601f) fVar;
                h0 h0Var4 = c0601f.f35074a;
                arrayListL.add(new u0.a(h0Var4.f152559a, null, h0Var4.f152560b, c0601f.f35075b, 0, true, null, false, null, null, c0601f.f35076c, h0Var4.f152561c, 960, null));
            }
        }
        this.f35083d.t(arrayListL);
    }

    public /* synthetic */ g(Context context, RecyclerView recyclerView, id1.b.a aVar, u0.b bVar, hl.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, recyclerView, aVar, bVar, (i14 & 16) != 0 ? hl.a.c.f84256b : aVar2);
    }
}
