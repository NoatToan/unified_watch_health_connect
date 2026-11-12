package kd0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import com.garmin.android.library.backgroundtaskmanagement.BizOperationException;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/s;", "Lnw/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s implements nw.a {
    @Override // nw.a
    public final void a(Context context) {
        context.getClass();
        Bundle bundle = new Bundle();
        bundle.putSerializable("MORE_START_DESTINATION_EXTRA", ty0.b.J2);
        Intent intent = new Intent(context, (Class<?>) MoreActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @Override // nw.a
    public final void b() {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).b(e31.a.ENTERED_BPM_REMINDERS);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nw.a
    public final Object c(v13.c cVar) {
        r rVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f104320c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f104320c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object objC = rVar.f104318a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f104320c;
        try {
            if (i15 == 0) {
                o13.r.b(objC);
                o53.r<kw.e> rVarK = new gw.e(false, null).k();
                rVar.f104320c = 1;
                objC = ((o53.s) rVarK).C(rVar);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objC);
            }
            return (kw.e) objC;
        } catch (BizOperationException unused) {
            return null;
        }
    }
}
