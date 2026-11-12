package com.garmin.android.apps.connectmobile.newsfeed;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.imagemultipicker.ImageTooLargeException;
import e23.p;
import g22.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v13.i;
import vb.h;
import wg0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/e;", "result", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel$uploadPhotos$2", f = "NewsFeedViewModel.kt", l = {331, 333, 356}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.e>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f39522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f39525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ NewsFeedViewModel f39526e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NewsFeedViewModel newsFeedViewModel, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f39526e = newsFeedViewModel;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f39526e, dVar);
        eVar.f39525d = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.e> list, t13.d<? super Unit> dVar) {
        return ((e) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b A[LOOP:0: B:56:0x0105->B:58:0x010b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0124  */
    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:64:0x0130  */
    /* JADX WARN: Code duplicated, block: B:66:0x013e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0141  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0159, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L71;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        int i14;
        ArrayList arrayList2;
        wg0.a aVar;
        ArrayList arrayList3;
        Iterator it;
        wg0.a aVar2;
        wg0.a aVarB;
        l lVar;
        l lVarB;
        l lVar2;
        List<wg0.c> list;
        List list2 = (List) this.f39525d;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f39524c;
        NewsFeedViewModel newsFeedViewModel = this.f39526e;
        if (i15 != 0) {
            if (i15 == 1 || i15 == 2) {
                i14 = this.f39523b;
                arrayList2 = this.f39522a;
                r.b(obj);
            } else {
                if (i15 != 3) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        ArrayList arrayListX = v.h.x(obj);
        for (Object obj2 : list2) {
            if (obj2 instanceof com.garmin.android.apps.connectmobile.activities.newmodel.e.a) {
                arrayListX.add(obj2);
            }
        }
        arrayList = new ArrayList();
        for (Object obj3 : arrayListX) {
            if (n.d(((com.garmin.android.apps.connectmobile.activities.newmodel.e.a) obj3).f29418a.getUrl())) {
                arrayList.add(obj3);
            }
        }
        if (list2.isEmpty()) {
            i14 = 0;
            break;
        }
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                i14 = 0;
                break;
            }
            com.garmin.android.apps.connectmobile.activities.newmodel.e eVar = (com.garmin.android.apps.connectmobile.activities.newmodel.e) it3.next();
            if ((eVar instanceof com.garmin.android.apps.connectmobile.activities.newmodel.e.b) && (((com.garmin.android.apps.connectmobile.activities.newmodel.e.b) eVar).f29419a instanceof ImageTooLargeException)) {
                i14 = 1;
                break;
            }
        }
        if (i14 != 0) {
            p2 p2Var = newsFeedViewModel.f39462h;
            g3 g3VarA = g3.a.a(g3.f35298f, null, new NewsFeedViewModel.PostUpdatingError.ImageTooLarge(), null, null, 13);
            this.f39525d = null;
            this.f39522a = arrayList;
            this.f39523b = i14;
            this.f39524c = 1;
            p2Var.k(null, g3VarA);
        } else if (arrayList.isEmpty()) {
            p2 p2Var2 = newsFeedViewModel.f39462h;
            g3 g3VarA2 = g3.a.a(g3.f35298f, null, new NewsFeedViewModel.PostUpdatingError.Generic(), null, null, 13);
            this.f39525d = null;
            this.f39522a = arrayList;
            this.f39523b = i14;
            this.f39524c = 2;
            p2Var2.k(null, g3VarA2);
        } else {
            if (!arrayList.isEmpty()) {
                aVar = newsFeedViewModel.f39456b;
                if (aVar != null || (lVar2 = aVar.f185059r) == null || (list = lVar2.f185103b) == null) {
                    arrayList3 = new ArrayList();
                } else {
                    arrayList3 = new ArrayList(list);
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new wg0.c(arrayList3.size(), ((com.garmin.android.apps.connectmobile.activities.newmodel.e.a) it.next()).f29418a));
                }
                aVar2 = newsFeedViewModel.f39456b;
                if (aVar2 != null) {
                    lVar = aVar2.f185059r;
                    if (lVar != null) {
                        lVarB = l.b(lVar, null, arrayList3, 29);
                    } else {
                        lVarB = null;
                    }
                    aVarB = wg0.a.b(aVar2, null, lVarB, null, null, null, 536739839);
                } else {
                    aVarB = null;
                }
                if (aVarB != null) {
                    newsFeedViewModel.z4(aVarB);
                }
            }
            p2 p2Var3 = newsFeedViewModel.f39462h;
            g3 g3VarE = g3.a.e(g3.f35298f);
            this.f39525d = null;
            this.f39522a = null;
            this.f39523b = i14;
            this.f39524c = 3;
            p2Var3.k(null, g3VarE);
        }
        return aVar3;
        arrayList = arrayList2;
        if (!arrayList.isEmpty()) {
            aVar = newsFeedViewModel.f39456b;
            if (aVar != null) {
                arrayList3 = new ArrayList();
            } else {
                arrayList3 = new ArrayList();
            }
            it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(new wg0.c(arrayList3.size(), ((com.garmin.android.apps.connectmobile.activities.newmodel.e.a) it.next()).f29418a));
            }
            aVar2 = newsFeedViewModel.f39456b;
            if (aVar2 != null) {
                lVar = aVar2.f185059r;
                if (lVar != null) {
                    lVarB = l.b(lVar, null, arrayList3, 29);
                } else {
                    lVarB = null;
                }
                aVarB = wg0.a.b(aVar2, null, lVarB, null, null, null, 536739839);
            } else {
                aVarB = null;
            }
            if (aVarB != null) {
                newsFeedViewModel.z4(aVarB);
            }
        }
        p2 p2Var4 = newsFeedViewModel.f39462h;
        g3 g3VarE2 = g3.a.e(g3.f35298f);
        this.f39525d = null;
        this.f39522a = null;
        this.f39523b = i14;
        this.f39524c = 3;
        p2Var4.k(null, g3VarE2);
    }
}
