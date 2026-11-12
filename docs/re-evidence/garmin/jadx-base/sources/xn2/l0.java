package xn2;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.lang3.BooleanUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxn2/l0;", "Lxy2/o;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l0 implements xy2.o<String> {
    @Override // xy2.o
    /* JADX INFO: renamed from: getValue */
    public final String getF173457a() {
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        HashMap map = new HashMap(3);
        String[] stringArray = contextC.getResources().getStringArray(R.array.ssoStyleEnv);
        stringArray.getClass();
        for (String str : stringArray) {
            str.getClass();
            List listW = d53.w.W(str, new String[]{","});
            try {
                map.put(listW.get(0), listW.get(1));
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        zi2.a aVar = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).h().f77335a;
        String str2 = aVar.f204880a;
        String strB = re2.l0.b(contextC);
        String str3 = aVar.f204880a;
        boolean zQ = d53.u.q(contextC.getString(R.string.ssoShowPassword), BooleanUtils.TRUE, true);
        Object obj = map.get(aVar.name());
        f12.l.f68084a.getClass();
        String userName = f12.l.a.a().getUserName();
        StringBuilder sbI = p6.b.i("https://", str2, "/sso/embed?clientId=GarminConnectMobileAndroid&locale=", strB, "&gauthHost=");
        v.h.C(str3, "/sso&reauth=true&mobile=true&id=gauth-widget&embedWidget=true&createAccountShown=false&displayNameShown=false&showPassword=", "&cssUrl=", sbI, zQ);
        sbI.append(obj);
        sbI.append("&lockToEmailAddress=");
        sbI.append(userName);
        return sbI.toString();
    }
}
