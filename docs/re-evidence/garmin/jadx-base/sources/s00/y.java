package s00;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import com.garmin.android.apps.connectmobile.social.service.LikeOnConversationService;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f155436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f155437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f155438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f155439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f155440f;

    public /* synthetic */ y(Context context, String str, String str2, String str3, String str4, int i14) {
        this.f155435a = i14;
        this.f155437c = context;
        this.f155436b = str;
        this.f155438d = str2;
        this.f155439e = str3;
        this.f155440f = str4;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f155435a;
        String str = this.f155436b;
        String str2 = this.f155438d;
        Bitmap bitmap = (Bitmap) obj;
        switch (i14) {
            case 0:
                int i15 = z.f155441a;
                if (str != null) {
                    po1.m.f139065a.getClass();
                    String str3 = this.f155438d;
                    int iHashCode = str3.hashCode();
                    Context context = this.f155437c;
                    Intent intent = new Intent(context, (Class<?>) LikeOnConversationService.class);
                    intent.putExtra("GCM_conversation_resource_type", "NEWS_POST");
                    intent.putExtra("GCM_conversation_resource_id", str3);
                    intent.putExtra("GCM_extra_connection_group_id", str);
                    intent.putExtra("extra.notification.id", iHashCode);
                    z6.k kVar = new z6.k(0, context.getString(R.string.lbl_like), PendingIntent.getService(context, iHashCode, intent, 201326592));
                    ConversationActivity.a aVar = ConversationActivity.f44530c;
                    long j8 = Long.parseLong(str);
                    aVar.getClass();
                    po1.l lVar = new po1.l(context, str3, ConversationActivity.a.g(context, j8, str3, null), bitmap, this.f155439e, this.f155440f, p13.w.c(kVar));
                    oi2.a.f132270a.getClass();
                    l73.c.b().e(lVar);
                    ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                } else {
                    String strN = fb1.c.n("handleGroupNewPost lose notification info groupId = ", str);
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.p(a2Var, "GroupPushNotificationHandler", strN);
                }
                break;
            case 1:
                int i16 = z.f155441a;
                if (str != null) {
                    ConversationActivity.a aVar3 = ConversationActivity.f44530c;
                    long j14 = Long.parseLong(str);
                    Context context2 = this.f155437c;
                    String str4 = this.f155438d;
                    po1.l lVar2 = new po1.l(context2, str4, ConversationActivity.a.e(aVar3, context2, j14, str4, null, 24), bitmap, this.f155439e, this.f155440f, null, 64, null);
                    oi2.a.f132270a.getClass();
                    l73.c.b().e(lVar2);
                    ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                } else {
                    String strN2 = fb1.c.n("handleLikeOnGroupActivity lose notification info groupId = ", str);
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.p(a2Var2, "GroupPushNotificationHandler", strN2);
                }
                break;
            case 2:
                int i17 = z.f155441a;
                jm0.b bVar = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null);
                Boolean bool = Boolean.FALSE;
                Context context3 = this.f155437c;
                String str5 = this.f155436b;
                po1.l lVar3 = new po1.l(context3, str5, bVar.x(context3, str5, str2, bool), bitmap, this.f155439e, this.f155440f, null, 64, null);
                oi2.a.f132270a.getClass();
                l73.c.b().e(lVar3);
                ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                break;
            case 3:
                int i18 = z.f155441a;
                jm0.b bVar2 = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null);
                Boolean bool2 = Boolean.FALSE;
                Context context4 = this.f155437c;
                String str6 = this.f155436b;
                po1.l lVar4 = new po1.l(context4, str6, bVar2.x(context4, str6, str2, bool2), bitmap, this.f155439e, this.f155440f, null, 64, null);
                oi2.a.f132270a.getClass();
                l73.c.b().e(lVar4);
                ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                break;
            case 4:
                int i19 = z.f155441a;
                if (str != null) {
                    ConversationActivity.a aVar5 = ConversationActivity.f44530c;
                    long j15 = Long.parseLong(str);
                    aVar5.getClass();
                    Context context5 = this.f155437c;
                    String str7 = this.f155438d;
                    po1.l lVar5 = new po1.l(context5, str7, ConversationActivity.a.g(context5, j15, str7, null), bitmap, this.f155439e, this.f155440f, null, 64, null);
                    oi2.a.f132270a.getClass();
                    l73.c.b().e(lVar5);
                    ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                } else {
                    String strN3 = fb1.c.n("handleLikeOnGroupPost lose notification info groupId = ", str);
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.p(a2Var3, "GroupPushNotificationHandler", strN3);
                }
                break;
            default:
                int i24 = z.f155441a;
                jm0.b bVar3 = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null);
                Boolean bool3 = Boolean.FALSE;
                Context context6 = this.f155437c;
                String str8 = this.f155436b;
                po1.l lVar6 = new po1.l(context6, str8, bVar3.x(context6, str8, str2, bool3), bitmap, this.f155439e, this.f155440f, null, 64, null);
                oi2.a.f132270a.getClass();
                l73.c.b().e(lVar6);
                ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ y(String str, z zVar, Context context, String str2, String str3, String str4, int i14) {
        this.f155435a = i14;
        this.f155436b = str;
        this.f155437c = context;
        this.f155438d = str2;
        this.f155439e = str3;
        this.f155440f = str4;
    }
}
