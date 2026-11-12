package ey2;

import android.net.Uri;
import com.garmin.subscriptions.ui.InAppPurchaseTwaActivity;
import e23.p;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r.g;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.subscriptions.ui.InAppPurchaseTwaActivity$handleReturnUri$1$1", f = "InAppPurchaseTwaActivity.kt", l = {391}, m = "invokeSuspend")
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f67449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f67451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InAppPurchaseTwaActivity f67452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f67453e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InAppPurchaseTwaActivity inAppPurchaseTwaActivity, Uri uri, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f67452d = inAppPurchaseTwaActivity;
        this.f67453e = uri;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f67452d, this.f67453e, dVar);
        bVar.f67451c = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        g gVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67450b;
        Uri uri = this.f67453e;
        InAppPurchaseTwaActivity inAppPurchaseTwaActivity = this.f67452d;
        if (i14 == 0) {
            r.b(obj);
            b0 b0Var = (b0) this.f67451c;
            g gVar2 = inAppPurchaseTwaActivity.f52750b;
            if (gVar2 == null) {
                Logger logger = inAppPurchaseTwaActivity.f52749a;
                String str = inAppPurchaseTwaActivity.f52760l;
                if (str == null) {
                    s.m("twaHostSchemeVal");
                    throw null;
                }
                logger.error("handleReturnUri: Session is null, cannot handle " + str + " URI");
                inAppPurchaseTwaActivity.O9();
                return Unit.INSTANCE;
            }
            c cVar = c.f67454a;
            this.f67451c = b0Var;
            this.f67449a = gVar2;
            this.f67450b = 1;
            obj = cVar.b(uri, this);
            if (obj == aVar) {
                return aVar;
            }
            gVar = gVar2;
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gVar = this.f67449a;
            r.b(obj);
        }
        Uri uri2 = (Uri) obj;
        if (uri2 != null) {
            androidx.browser.trusted.h hVarA = new androidx.browser.trusted.i(uri2).a(gVar);
            InAppPurchaseTwaActivity.a aVar2 = InAppPurchaseTwaActivity.f52748r;
            inAppPurchaseTwaActivity.P9(hVarA);
        } else {
            Logger logger2 = inAppPurchaseTwaActivity.f52749a;
            String str2 = inAppPurchaseTwaActivity.f52760l;
            if (str2 == null) {
                s.m("twaHostSchemeVal");
                throw null;
            }
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            StringBuilder sbI = p6.b.i("handleReturnUri: Failed to decode ", str2, " URL: ", scheme, "://");
            sbI.append(host);
            sbI.append(path);
            logger2.error(sbI.toString());
            inAppPurchaseTwaActivity.O9();
        }
        return Unit.INSTANCE;
    }
}
