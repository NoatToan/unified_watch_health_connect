package fo1;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lmo1/f;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$fetchLikeList$1", f = "ConversationViewModel.kt", l = {519, 529}, m = "invokeSuspend", v = 2)
public final class i1 extends v13.i implements e23.l<t13.d<? super v2<? extends List<? extends mo1.f>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f72582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f72583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f72585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f72586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f72587f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(o0 o0Var, Integer num, Integer num2, t13.d<? super i1> dVar) {
        super(1, dVar);
        this.f72585d = o0Var;
        this.f72586e = num;
        this.f72587f = num2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i1(this.f72585d, this.f72586e, this.f72587f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends List<? extends mo1.f>>> dVar) {
        return ((i1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        Object obj2;
        Object objA;
        List<mo1.f> list;
        Map map;
        String userProfilePk;
        Integer num;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72584c;
        o0 o0Var = this.f72585d;
        if (i14 == 0) {
            o13.r.b(obj);
            am.c2 c2Var = o0Var.f72656c;
            if (c2Var == null) {
                return new v2.a(new Exception("resourceType is null"), null, null, 6, null);
            }
            String str = o0Var.f72657d;
            if (str == null) {
                return new v2.a(new Exception("resourceId is null"), null, null, 6, null);
            }
            f fVar = o0Var.f72674v;
            this.f72584c = 1;
            fVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(fVar, new q(fVar, c2Var, str, this.f72586e, this.f72587f, true, null), this);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objJ = obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = this.f72583b;
            obj2 = this.f72582a;
            o13.r.b(obj);
            objA = obj;
        }
        map = (Map) objA;
        for (mo1.f fVar2 : list) {
            userProfilePk = fVar2.getUserProfilePk();
            if (userProfilePk != null) {
                num = new Integer(Integer.parseInt(userProfilePk));
            } else {
                num = null;
            }
            lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(num);
            if ((lVar != null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (profileImageUrl = profileImageUrls.f46879h) == null) && (profileImageUrl = fVar2.getProfileImageUrl()) == null) {
            }
            String str2 = profileImageUrl;
            fVar2.i(str2);
            fVar2.j(new b12.b(str2, null, null, null, null, 30, null));
        }
        return obj2;
        obj2 = (v2) objJ;
        if (obj2 instanceof v2.b) {
            v2.b bVar = (v2.b) obj2;
            List list2 = (List) bVar.f47386a;
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String userProfilePk2 = ((mo1.f) it.next()).getUserProfilePk();
                if (userProfilePk2 != null) {
                    arrayList.add(userProfilePk2);
                }
            }
            List<String> listB1 = p13.h0.b1(p13.h0.f1(arrayList));
            a22.i iVar = o0Var.P;
            this.f72582a = bVar;
            this.f72583b = list2;
            this.f72584c = 2;
            a22.i.a aVar2 = a22.i.f537b;
            objA = iVar.a(listB1, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, this);
            if (objA != aVar) {
                list = list2;
                map = (Map) objA;
                while (r1.hasNext()) {
                    userProfilePk = fVar2.getUserProfilePk();
                    if (userProfilePk != null) {
                        num = new Integer(Integer.parseInt(userProfilePk));
                    } else {
                        num = null;
                    }
                    lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(num);
                    String profileImageUrl = lVar != null ? "" : "";
                    String str3 = profileImageUrl;
                    fVar2.i(str3);
                    fVar2.j(new b12.b(str3, null, null, null, null, 30, null));
                }
            }
            return aVar;
        }
        return obj2;
    }
}
