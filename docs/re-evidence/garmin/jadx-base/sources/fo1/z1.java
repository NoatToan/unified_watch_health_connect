package fo1;

import com.garmin.android.apps.connectmobile.social.conversationservice.model.VivoKidChallengeConversationCommentDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/VivoKidChallengeConversationCommentDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.VivoKidConversationViewModelDelegateImp$fetchVivoKidChallengeComments$1", f = "VivoKidConversationViewModelDelegateImp.kt", l = {33, 38}, m = "invokeSuspend", v = 2)
public final class z1 extends v13.i implements e23.l<t13.d<? super v2<? extends List<? extends VivoKidChallengeConversationCommentDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f72886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f72887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c2 f72889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ am.c2 f72890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f72891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f72892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f72893h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(c2 c2Var, am.c2 c2Var2, String str, int i14, int i15, t13.d<? super z1> dVar) {
        super(1, dVar);
        this.f72889d = c2Var;
        this.f72890e = c2Var2;
        this.f72891f = str;
        this.f72892g = i14;
        this.f72893h = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new z1(this.f72889d, this.f72890e, this.f72891f, this.f72892g, this.f72893h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends List<? extends VivoKidChallengeConversationCommentDTO>>> dVar) {
        return ((z1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ArrayList<VivoKidChallengeConversationCommentDTO> arrayList;
        Map map;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72888c;
        if (i14 == 0) {
            o13.r.b(obj);
            x1 x1Var = this.f72889d.f72493a;
            String strName = this.f72890e.name();
            this.f72888c = 1;
            x1Var.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(x1Var, new v1(x1Var, strName, this.f72891f, this.f72892g, this.f72893h, null), this);
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
            arrayList = this.f72887b;
            obj2 = this.f72886a;
            o13.r.b(obj);
        }
        map = (Map) obj;
        for (VivoKidChallengeConversationCommentDTO vivoKidChallengeConversationCommentDTO : arrayList) {
            String str2 = vivoKidChallengeConversationCommentDTO.f44558m;
            str2.getClass();
            lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l(Integer.parseInt(str2), map);
            if (lVar == null && (profileImageUrls = lVar.getProfileImageUrls()) != null && (str = profileImageUrls.f46879h) != null) {
                vivoKidChallengeConversationCommentDTO.f44552g = str;
            }
        }
        return obj2;
        obj2 = (v2) obj;
        if (obj2 instanceof v2.b) {
            v2.b bVar = (v2.b) obj2;
            Iterable iterable = (Iterable) bVar.f47386a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : iterable) {
                if (((VivoKidChallengeConversationCommentDTO) obj3).f44563r == -1) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((VivoKidChallengeConversationCommentDTO) it.next()).f44558m);
            }
            a22.i iVar = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
            this.f72886a = bVar;
            this.f72887b = arrayList2;
            this.f72888c = 2;
            a22.i.a aVar2 = a22.i.f537b;
            obj = iVar.a(arrayList3, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, this);
            if (obj != aVar) {
                arrayList = arrayList2;
                map = (Map) obj;
                while (r0.hasNext()) {
                    String str3 = vivoKidChallengeConversationCommentDTO.f44558m;
                    str3.getClass();
                    lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l(Integer.parseInt(str3), map);
                    if (lVar == null) {
                    }
                }
            }
            return aVar;
        }
        return obj2;
    }
}
