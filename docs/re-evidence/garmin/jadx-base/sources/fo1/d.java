package fo1;

import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationActivity.b f72495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConversationActivity f72496c;

    public /* synthetic */ d(ConversationActivity.b bVar, ConversationActivity conversationActivity, int i14) {
        this.f72494a = i14;
        this.f72495b = bVar;
        this.f72496c = conversationActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f72494a;
        ConversationActivity conversationActivity = this.f72496c;
        ConversationActivity.b bVar = this.f72495b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ConversationActivity.a aVar = ConversationActivity.f44530c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(610262975, new d(bVar, conversationActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ConversationActivity.a aVar2 = ConversationActivity.f44530c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    u4.d dVar = bVar.f44533a;
                    String string = conversationActivity.getString(bVar.f44534b);
                    String string2 = conversationActivity.getString(bVar.f44535c);
                    string2.getClass();
                    b82.n.c(dVar, string, string2, null, null, mVar2, 0, 24);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
