package fo1;

import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationRepoViewModelDelegateImp$fetchComments$1", f = "ConversationRepoViewModelDelegateImp.kt", l = {38, 44}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.l<t13.d<? super v2<? extends List<? extends ConversationCommentDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f72508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f72509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f72511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ am.c2 f72512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f72513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f72514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f72515h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(l0 l0Var, am.c2 c2Var, String str, int i14, int i15, t13.d<? super e0> dVar) {
        super(1, dVar);
        this.f72511d = l0Var;
        this.f72512e = c2Var;
        this.f72513f = str;
        this.f72514g = i14;
        this.f72515h = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e0(this.f72511d, this.f72512e, this.f72513f, this.f72514g, this.f72515h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends List<? extends ConversationCommentDTO>>> dVar) {
        return ((e0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List<ConversationCommentDTO> list;
        Map map;
        String str;
        Integer num;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        String str2;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72510c;
        l0 l0Var = this.f72511d;
        if (i14 == 0) {
            o13.r.b(obj);
            f fVar = l0Var.f72618a;
            this.f72510c = 1;
            fVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(fVar, new m(fVar, this.f72512e, this.f72513f, this.f72514g, this.f72515h, null), this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = this.f72509b;
            obj2 = this.f72508a;
            o13.r.b(obj);
        }
        map = (Map) obj;
        for (ConversationCommentDTO conversationCommentDTO : list) {
            str = conversationCommentDTO.f44558m;
            if (str != null) {
                num = new Integer(Integer.parseInt(str));
            } else {
                num = null;
            }
            lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(num);
            if (lVar != null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (str2 = profileImageUrls.f46879h) == null) {
                str2 = conversationCommentDTO.f44552g;
            }
            String str3 = str2;
            conversationCommentDTO.f44552g = str3;
            conversationCommentDTO.f44561p = new b12.b(str3, null, null, null, null, 30, null);
        }
        return obj2;
        obj2 = (v2) obj;
        if (obj2 instanceof v2.a) {
            return obj2;
        }
        if (!(obj2 instanceof v2.b)) {
            lc.u0.r();
            return null;
        }
        v2.b bVar = (v2.b) obj2;
        List list2 = (List) bVar.f47386a;
        ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ConversationCommentDTO) it.next()).f44558m);
        }
        List<String> listB1 = p13.h0.b1(p13.h0.f1(arrayList));
        a22.i iVar = l0Var.f72619b;
        this.f72508a = bVar;
        this.f72509b = list2;
        this.f72510c = 2;
        a22.i.a aVar2 = a22.i.f537b;
        obj = iVar.a(listB1, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, this);
        if (obj != aVar) {
            list = list2;
            map = (Map) obj;
            while (r0.hasNext()) {
                str = conversationCommentDTO.f44558m;
                if (str != null) {
                    num = new Integer(Integer.parseInt(str));
                } else {
                    num = null;
                }
                lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(num);
                if (lVar != null) {
                    str2 = conversationCommentDTO.f44552g;
                } else {
                    str2 = conversationCommentDTO.f44552g;
                }
                String str4 = str2;
                conversationCommentDTO.f44552g = str4;
                conversationCommentDTO.f44561p = new b12.b(str4, null, null, null, null, 30, null);
            }
            return obj2;
        }
        return aVar;
    }
}
