package s00;

import android.content.Context;
import android.graphics.Bitmap;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f155429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f155430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f155431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f155432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f155433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f155434g;

    public /* synthetic */ x(Context context, String str, String str2, String str3, String str4, String str5) {
        this.f155428a = 3;
        this.f155431d = context;
        this.f155429b = str;
        this.f155430c = str2;
        this.f155432e = str3;
        this.f155433f = str4;
        this.f155434g = str5;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f155428a;
        String str = this.f155432e;
        String str2 = this.f155430c;
        String str3 = this.f155429b;
        Bitmap bitmap = (Bitmap) obj;
        switch (i14) {
            case 0:
                int i15 = z.f155441a;
                if (str3 != null) {
                    ConversationActivity.a aVar = ConversationActivity.f44530c;
                    long j8 = Long.parseLong(str3);
                    aVar.getClass();
                    Context context = this.f155431d;
                    String str4 = this.f155430c;
                    po1.l lVar = new po1.l(context, str4, ConversationActivity.a.g(context, j8, str4, str), bitmap, this.f155433f, this.f155434g, null, 64, null);
                    oi2.a.f132270a.getClass();
                    l73.c.b().e(lVar);
                    ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                } else {
                    String strN = fb1.c.n("handleLikeOnGroupPostComment lose notification info groupId = ", str3);
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.p(a2Var, "GroupPushNotificationHandler", strN);
                }
                break;
            case 1:
                int i16 = z.f155441a;
                if (str3 == null || str3.length() <= 0 || str2 == null || str2.length() <= 0) {
                    String strJ = androidx.room.a0.j("handleCommentAfterOnGroupPost lose notification info groupId = ", str3, ", commentId = ", str2);
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.p(a2Var2, "GroupPushNotificationHandler", strJ);
                } else {
                    Context context2 = this.f155431d;
                    String str5 = this.f155432e;
                    z6.k kVarF = z.f(context2, str5, str2);
                    ConversationActivity.a aVar4 = ConversationActivity.f44530c;
                    long j14 = Long.parseLong(str3);
                    aVar4.getClass();
                    po1.k kVar = new po1.k(context2, str5, ConversationActivity.a.g(context2, j14, str5, str2), bitmap, this.f155433f, this.f155434g, p13.w.c(kVarF));
                    oi2.a.f132270a.getClass();
                    l73.c.b().e(kVar);
                    ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                }
                break;
            case 2:
                int i17 = z.f155441a;
                if (str3 != null) {
                    ConversationActivity.a aVar5 = ConversationActivity.f44530c;
                    long j15 = Long.parseLong(str3);
                    Context context3 = this.f155431d;
                    String str6 = this.f155430c;
                    po1.l lVar2 = new po1.l(context3, str6, ConversationActivity.a.e(aVar5, context3, j15, str6, this.f155432e, 16), bitmap, this.f155433f, this.f155434g, null, 64, null);
                    oi2.a.f132270a.getClass();
                    l73.c.b().e(lVar2);
                    ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                } else {
                    String strN2 = fb1.c.n("handleLikeOnGroupActivityComment lose notification info groupId = ", str3);
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.p(a2Var3, "GroupPushNotificationHandler", strN2);
                }
                break;
            case 3:
                int i18 = z.f155441a;
                jm0.b bVar = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null);
                Context context4 = this.f155431d;
                String str7 = this.f155429b;
                po1.l lVar3 = new po1.l(context4, str7, bVar.d(context4, str7, str2, str), bitmap, this.f155433f, this.f155434g, null, 64, null);
                oi2.a.f132270a.getClass();
                l73.c.b().e(lVar3);
                ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                break;
            case 4:
                int i19 = z.f155441a;
                String str8 = this.f155430c;
                if (str3 == null || str3.length() <= 0 || str8 == null || str8.length() <= 0) {
                    String strJ2 = androidx.room.a0.j("handleCommentAfterOnGroupActivity lose notification info groupId = ", str3, ", commentId = ", str8);
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.p(a2Var4, "GroupPushNotificationHandler", strJ2);
                } else {
                    Context context5 = this.f155431d;
                    String str9 = this.f155432e;
                    z6.k kVarF2 = z.f(context5, str9, str8);
                    po1.k kVar2 = new po1.k(context5, str9, ConversationActivity.a.e(ConversationActivity.f44530c, context5, Long.parseLong(str3), str9, str8, 16), bitmap, this.f155433f, this.f155434g, p13.w.c(kVarF2));
                    oi2.a.f132270a.getClass();
                    l73.c.b().e(kVar2);
                    ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                }
                break;
            case 5:
                int i24 = z.f155441a;
                String str10 = this.f155430c;
                if (str3 == null || str3.length() <= 0 || str10 == null || str10.length() <= 0) {
                    String strJ3 = androidx.room.a0.j("handleCommentOnGroupActivity lose notification info groupId = ", str3, ", commentId = ", str10);
                    i2.a aVar8 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar8.getClass();
                    i2.a.p(a2Var5, "GroupPushNotificationHandler", strJ3);
                } else {
                    Context context6 = this.f155431d;
                    String str11 = this.f155432e;
                    z6.k kVarF3 = z.f(context6, str11, str10);
                    po1.k kVar3 = new po1.k(context6, str11, ConversationActivity.a.e(ConversationActivity.f44530c, context6, Long.parseLong(str3), str11, str10, 16), bitmap, this.f155433f, this.f155434g, p13.w.c(kVarF3));
                    oi2.a.f132270a.getClass();
                    l73.c.b().e(kVar3);
                    ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                }
                break;
            default:
                int i25 = z.f155441a;
                if (str3 == null || str3.length() <= 0 || str2 == null || str2.length() <= 0) {
                    String strJ4 = androidx.room.a0.j("handleCommentOnGroupPost lose notification info groupId = ", str3, ", commentId = ", str2);
                    i2.a aVar9 = i2.f36769a;
                    a2 a2Var6 = a2.GENERAL;
                    aVar9.getClass();
                    i2.a.p(a2Var6, "GroupPushNotificationHandler", strJ4);
                } else {
                    Context context7 = this.f155431d;
                    String str12 = this.f155432e;
                    z6.k kVarF4 = z.f(context7, str12, str2);
                    ConversationActivity.a aVar10 = ConversationActivity.f44530c;
                    long j16 = Long.parseLong(str3);
                    aVar10.getClass();
                    po1.k kVar4 = new po1.k(context7, str12, ConversationActivity.a.g(context7, j16, str12, str2), bitmap, this.f155433f, this.f155434g, p13.w.c(kVarF4));
                    oi2.a.f132270a.getClass();
                    l73.c.b().e(kVar4);
                    ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ x(String str, String str2, z zVar, Context context, String str3, String str4, String str5, int i14) {
        this.f155428a = i14;
        this.f155429b = str;
        this.f155430c = str2;
        this.f155431d = context;
        this.f155432e = str3;
        this.f155433f = str4;
        this.f155434g = str5;
    }

    public /* synthetic */ x(String str, z zVar, Context context, String str2, String str3, String str4, String str5, int i14) {
        this.f155428a = i14;
        this.f155429b = str;
        this.f155431d = context;
        this.f155430c = str2;
        this.f155432e = str3;
        this.f155433f = str4;
        this.f155434g = str5;
    }
}
