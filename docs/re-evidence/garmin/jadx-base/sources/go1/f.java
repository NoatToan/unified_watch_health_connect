package go1;

import android.content.Context;
import c22.b3;
import com.garmin.android.apps.connectmobile.tag.TaggableEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f78235b;

    public /* synthetic */ f(k kVar, int i14) {
        this.f78234a = i14;
        this.f78235b = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f78234a;
        int i15 = 2;
        k kVar = this.f78235b;
        switch (i14) {
            case 0:
                List list = (List) obj;
                int i16 = k.C;
                c0 c0VarY6 = kVar.y6();
                list.getClass();
                c0VarY6.getClass();
                ArrayList arrayList = c0VarY6.f78226h;
                arrayList.clear();
                arrayList.addAll(list);
                c0VarY6.notifyDataSetChanged();
                kVar.A6().post(new h(kVar, i15));
                kVar.F6();
                g22.e.f(kVar);
                return Unit.INSTANCE;
            case 1:
                o13.p pVar = (o13.p) obj;
                int i17 = k.C;
                List list2 = (List) pVar.f128594a;
                if (((Boolean) pVar.f128595b).booleanValue()) {
                    c0 c0VarY7 = kVar.y6();
                    c0VarY7.getClass();
                    list2.getClass();
                    c0VarY7.f78226h.addAll(2, list2);
                    c0VarY7.notifyItemRangeInserted(2, list2.size());
                } else {
                    c0 c0VarY8 = kVar.y6();
                    ArrayList arrayList2 = c0VarY8.f78226h;
                    if (1 < arrayList2.size()) {
                        arrayList2.remove(1);
                        c0VarY8.notifyItemRemoved(1);
                    }
                    c0 c0VarY9 = kVar.y6();
                    c0VarY9.getClass();
                    list2.getClass();
                    c0VarY9.f78226h.addAll(1, list2);
                    c0VarY9.notifyItemRangeInserted(1, list2.size());
                }
                kVar.F6();
                g22.e.f(kVar);
                return Unit.INSTANCE;
            case 2:
                o13.p pVar2 = (o13.p) obj;
                int i18 = k.C;
                kVar.y6().r((w) pVar2.f128594a, ((Number) pVar2.f128595b).intValue());
                return Unit.INSTANCE;
            case 3:
                Integer num = (Integer) obj;
                int i19 = k.C;
                c0 c0VarY10 = kVar.y6();
                num.getClass();
                int iIntValue = num.intValue();
                ArrayList arrayList3 = c0VarY10.f78226h;
                if (iIntValue < arrayList3.size()) {
                    arrayList3.remove(iIntValue);
                    c0VarY10.notifyItemRemoved(iIntValue);
                }
                kVar.F6();
                g22.e.f(kVar);
                return Unit.INSTANCE;
            case 4:
                w wVar = (w) obj;
                int i24 = k.C;
                c0 c0VarY11 = kVar.y6();
                wVar.getClass();
                c0VarY11.getClass();
                ArrayList arrayList4 = c0VarY11.f78226h;
                arrayList4.add(wVar);
                c0VarY11.notifyItemInserted(arrayList4.size());
                kVar.A6().post(new h(kVar, 0));
                return Unit.INSTANCE;
            case 5:
                lj0.b bVar = (lj0.b) obj;
                int i25 = k.C;
                kVar.F6();
                g22.e.f(kVar);
                int i26 = do1.f.f60592a;
                if (bVar != null && zy0.g.a(Integer.valueOf(bVar.f112958b))) {
                    Context context = kVar.getContext();
                    if (context == null) {
                        return Unit.INSTANCE;
                    }
                    b3.c(context);
                } else if (bVar == null || !zy0.g.b(Integer.valueOf(bVar.f112958b))) {
                    if (bVar == null) {
                        bVar = lj0.b.f112956j;
                    }
                    bVar.getClass();
                    g22.e.b(kVar, bVar);
                }
                return Unit.INSTANCE;
            default:
                ds1.a aVar = (ds1.a) obj;
                int i27 = k.C;
                aVar.getClass();
                if (kVar.f78266p) {
                    c0 c0VarY12 = kVar.y6();
                    int i28 = kVar.f78267q;
                    c0VarY12.getClass();
                    c0VarY12.notifyItemChanged(i28, new s(aVar));
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "TagSuggestionClickedInEditMode");
                } else {
                    PostCommentView postCommentView = kVar.f78259i;
                    if (postCommentView == null) {
                        p005kotlin.jvm.internal.s.m("postCommentView");
                        throw null;
                    }
                    TaggableEditText taggableEditText = postCommentView.f47848c;
                    if (taggableEditText != null) {
                        taggableEditText.a(aVar);
                    }
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "TagSuggestionClickedInNewsFeedComment");
                }
                return Unit.INSTANCE;
        }
    }
}
