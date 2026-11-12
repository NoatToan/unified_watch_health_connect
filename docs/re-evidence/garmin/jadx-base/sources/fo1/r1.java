package fo1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$updateCommentWithTextEdit$1", f = "ConversationViewModel.kt", l = {330, 334}, m = "invokeSuspend", v = 2)
public final class r1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0 f72738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f72739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f72740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConversationCommentDTO f72741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f72742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0 f72743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f72744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f72745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ go1.w f72746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f72747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ConversationCommentDTO f72748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f72749l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(o0 o0Var, String str, String str2, go1.w wVar, int i14, ConversationCommentDTO conversationCommentDTO, Context context, t13.d<? super r1> dVar) {
        super(2, dVar);
        this.f72743f = o0Var;
        this.f72744g = str;
        this.f72745h = str2;
        this.f72746i = wVar;
        this.f72747j = i14;
        this.f72748k = conversationCommentDTO;
        this.f72749l = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r1(this.f72743f, this.f72744g, this.f72745h, this.f72746i, this.f72747j, this.f72748k, this.f72749l, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        Context context;
        Object objA;
        ConversationCommentDTO conversationCommentDTO;
        String str;
        String str2;
        Integer num;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72742e;
        go1.w wVar = this.f72746i;
        o0 o0Var = this.f72743f;
        if (i14 == 0) {
            o13.r.b(obj);
            ConversationCommentDTO conversationCommentDTO2 = new ConversationCommentDTO();
            conversationCommentDTO2.m(this.f72748k.C());
            conversationCommentDTO2.f44555j = String.valueOf(wVar.f78315e.f78322g);
            conversationCommentDTO2.f44562q.clear();
            conversationCommentDTO2.f44562q.addAll(wVar.f78315e.f78323h);
            f fVar = o0Var.f72674v;
            this.f72742e = 1;
            fVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(fVar, new c0(fVar, this.f72744g, this.f72745h, conversationCommentDTO2, null), this);
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
            conversationCommentDTO = this.f72741d;
            str = this.f72740c;
            Context context2 = this.f72739b;
            o0Var = this.f72738a;
            o13.r.b(obj);
            context = context2;
            objA = obj;
        }
        Map map = (Map) objA;
        str2 = conversationCommentDTO.f44558m;
        if (str2 != null) {
            num = new Integer(Integer.parseInt(str2));
        } else {
            num = null;
        }
        lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(num);
        if (lVar != null) {
            com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls = lVar.getProfileImageUrls();
            String str3 = profileImageUrls != null ? profileImageUrls.f46879h : null;
            conversationCommentDTO.f44552g = str3;
            conversationCommentDTO.f44561p = new b12.b(str3, null, null, null, null, 30, null);
        }
        int i15 = o0.H0;
        o0Var.K4(context, str, conversationCommentDTO);
        o0Var.A = true;
        return Unit.INSTANCE;
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            ConversationCommentDTO conversationCommentDTO3 = (ConversationCommentDTO) ((v2.b) v2Var).f47386a;
            a22.i iVar = o0Var.P;
            List<String> listC = p13.w.c(conversationCommentDTO3.f44558m);
            List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listC2 = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
            this.f72738a = o0Var;
            context = this.f72749l;
            this.f72739b = context;
            String str4 = this.f72745h;
            this.f72740c = str4;
            this.f72741d = conversationCommentDTO3;
            this.f72742e = 2;
            objA = iVar.a(listC, listC2, this);
            if (objA != aVar) {
                conversationCommentDTO = conversationCommentDTO3;
                str = str4;
                Map map2 = (Map) objA;
                str2 = conversationCommentDTO.f44558m;
                if (str2 != null) {
                    num = new Integer(Integer.parseInt(str2));
                } else {
                    num = null;
                }
                lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map2.get(num);
                if (lVar != null) {
                    com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2 = lVar.getProfileImageUrls();
                    String str5 = profileImageUrls2 != null ? profileImageUrls2.f46879h : null;
                    conversationCommentDTO.f44552g = str5;
                    conversationCommentDTO.f44561p = new b12.b(str5, null, null, null, null, 30, null);
                }
                int i16 = o0.H0;
                o0Var.K4(context, str, conversationCommentDTO);
                o0Var.A = true;
            }
            return aVar;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        go1.w.c cVar = wVar.f78315e;
        cVar.f78322g = null;
        cVar.f78323h.clear();
        o0Var.f72669o.j(new o13.p<>(wVar, new Integer(this.f72747j)));
        o0Var.f72666l.j(null);
        return Unit.INSTANCE;
    }
}
