package ku0;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.liveeventsharing.recipients.LiveEventRecipientsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l20.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;
import r22.c1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lku0/c;", "Lr22/c1;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends c1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ LiveEventRecipientsActivity f106543h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i14, Drawable drawable, LiveEventRecipientsActivity liveEventRecipientsActivity) {
        super(i14, drawable);
        this.f106543h = liveEventRecipientsActivity;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void o(int i14, RecyclerView.f0 f0Var) {
        Object next;
        l20.a aVar;
        ArrayList arrayList;
        l20.c cVar;
        Object next2;
        Object next3;
        f0Var.getClass();
        LiveEventRecipientsActivity liveEventRecipientsActivity = this.f106543h;
        d dVar = liveEventRecipientsActivity.f38513g;
        if (dVar == null) {
            s.m("adapter");
            throw null;
        }
        a aVar2 = (a) dVar.f106544c.get(f0Var.getBindingAdapterPosition() - 1);
        String str = aVar2.f106536a;
        Long lValueOf = Long.valueOf(aVar2.f106539d);
        if (str == null || str.length() == 0) {
            return;
        }
        Iterator it = liveEventRecipientsActivity.f38515i.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!str.equals(((l20.a) next).getContactId()));
        l20.a aVar3 = (l20.a) next;
        if (aVar3 != null) {
            aVar = aVar3;
        } else {
            r rVar = liveEventRecipientsActivity.f38510d;
            if (rVar == null) {
                s.m("userContactsDTO");
                throw null;
            }
            List<l20.a> listF = rVar.f();
            if (listF != null) {
                Iterator<T> it3 = listF.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!str.equals(((l20.a) next3).getContactId()));
                aVar3 = (l20.a) next3;
                aVar = aVar3;
            } else {
                aVar = null;
            }
        }
        List listB1 = h0.b1(liveEventRecipientsActivity.f38515i);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listB1) {
            if (!str.equals(((l20.a) obj).getContactId())) {
                arrayList2.add(obj);
            }
        }
        liveEventRecipientsActivity.f38515i = new ArrayList(arrayList2);
        if (aVar != null) {
            List<l20.c> listZ = aVar.z();
            if (listZ != null) {
                ArrayList arrayList3 = new ArrayList(y.r(listZ, 10));
                for (l20.c cVarB : listZ) {
                    if (s.g(cVarB.getContactInfoPk(), lValueOf)) {
                        cVarB = l20.c.b(cVarB, null, null, null, null, Boolean.FALSE, null, null, null, null, null, 0, 1048543);
                    }
                    arrayList3.add(cVarB);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            boolean z14 = false;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    if (s.g(((l20.c) it4.next()).getIsLiveEventSharingDefault(), Boolean.TRUE)) {
                        z14 = true;
                        break;
                    }
                }
            }
            if (arrayList != null) {
                Iterator it5 = arrayList.iterator();
                do {
                    if (!it5.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it5.next();
                } while (!s.g(((l20.c) next2).getContactInfoPk(), lValueOf));
                cVar = (l20.c) next2;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                d dVar2 = liveEventRecipientsActivity.f38513g;
                if (dVar2 == null) {
                    s.m("adapter");
                    throw null;
                }
                dVar2.A(cVar.getContactInfoPk(), aVar.getContactId());
            }
            liveEventRecipientsActivity.f38515i.add(l20.a.g(aVar, null, null, null, null, null, Boolean.valueOf(z14), null, arrayList, null, 8031));
            liveEventRecipientsActivity.ea();
            liveEventRecipientsActivity.fa();
            liveEventRecipientsActivity.da(true);
        }
    }

    @Override // r22.c1
    public final boolean p(RecyclerView.f0 f0Var) {
        f0Var.getClass();
        return f0Var.getItemViewType() == 1;
    }
}
