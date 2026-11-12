package vn2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.apache.commons.lang3.BooleanUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lvn2/q0;", "Lxn2/g;", "Lvn2/j1;", "Lvn2/i1;", "", "cid", "", "deviceUnitId", "<init>", "(Ljava/lang/String;J)V", "lastName", "firstName", "Lorg/joda/time/DateTime;", "birthDay", "Lpn2/u;", "gender", "userPhoneNumber", "Lq03/b;", "x", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lpn2/u;Ljava/lang/String;)Lq03/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lq03/r;", "K", "(Landroid/content/Context;)Lq03/r;", "Ltn2/f0$a;", "functionality", JWKParameterNames.RSA_EXPONENT, "(Ltn2/f0$a;)Lq03/b;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "V", "()Ljava/lang/String;", "j", "J", "getDeviceUnitId", "()J", "Lpn2/t;", JWKParameterNames.OCT_KEY_VALUE, "Lpn2/t;", "o", "()Lpn2/t;", "I0", "(Lpn2/t;)V", "currentUserInfo", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 extends xn2.g<j1> implements i1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f178932l = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String cid;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long deviceUnitId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public pn2.t currentUserInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(String str, long j8) {
        super(j8);
        str.getClass();
        this.cid = str;
        this.deviceUnitId = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String V0(Context context, rn2.v vVar) throws UnsupportedEncodingException {
        vVar.getClass();
        HashMap map = new HashMap(3);
        String[] stringArray = context.getResources().getStringArray(R.array.ssoStyleEnv);
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
        String strB = re2.l0.b(context);
        String str3 = aVar.f204880a;
        boolean zQ = d53.u.q(context.getString(R.string.ssoShowPassword), BooleanUtils.TRUE, true);
        Object obj = map.get(aVar.name());
        String strEncode = URLEncoder.encode(vVar.getEmailAddress(), "UTF-8");
        StringBuilder sbI = p6.b.i("https://", str2, "/sso/embed?clientId=GarminConnectMobileAndroid&locale=", strB, "&gauthHost=");
        v.h.C(str3, "/sso&reauth=true&mobile=true&id=gauth-widget&embedWidget=true&createAccountShown=false&displayNameShown=false&showPassword=", "&cssUrl=", sbI, zQ);
        sbI.append(obj);
        sbI.append("&lockToEmailAddress=");
        sbI.append(strEncode);
        return sbI.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String W0(e23.l lVar, Object obj) {
        obj.getClass();
        return (String) lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.f X0(String str, String str2, DateTime dateTime, pn2.u uVar, String str3, q0 q0Var) {
        String strPrint = DateTimeFormat.forPattern("yyyyMMdd").print(dateTime);
        strPrint.getClass();
        return q0Var.R0().q(q0Var.cid, new pn2.t(str, str2, strPrint, uVar.f138811a, str3));
    }

    @Override // vn2.i1
    public void I0(pn2.t tVar) {
        tVar.getClass();
        this.currentUserInfo = tVar;
    }

    @Override // vn2.i1
    public q03.r<String> K(Context context) {
        context.getClass();
        q03.r<c83.a0<rn2.v>> rVarO = R0().f165633b.o();
        tn2.k0 k0Var = new tn2.k0(new tn2.m(24), 6);
        rVarO.getClass();
        int i14 = w03.b.f181178a;
        return new e13.o(new e13.o(rVarO, k0Var), new y(new ot.c(context, 16), 28));
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    @Override // vn2.i1
    public q03.b e(tn2.f0.a functionality) {
        functionality.getClass();
        return R0().g(functionality);
    }

    @Override // xn2.g, vn2.w0
    public long getDeviceUnitId() {
        return this.deviceUnitId;
    }

    @Override // vn2.i1
    public pn2.t o() {
        pn2.t tVar = this.currentUserInfo;
        if (tVar != null) {
            return tVar;
        }
        p005kotlin.jvm.internal.s.m("currentUserInfo");
        throw null;
    }

    @Override // vn2.i1
    public q03.b x(final String lastName, final String firstName, final DateTime birthDay, final pn2.u gender, final String userPhoneNumber) {
        lastName.getClass();
        firstName.getClass();
        birthDay.getClass();
        gender.getClass();
        userPhoneNumber.getClass();
        Callable callable = new Callable() { // from class: vn2.p0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q0.X0(lastName, firstName, birthDay, gender, userPhoneNumber, this);
            }
        };
        int i14 = w03.b.f181178a;
        return new z03.d(callable);
    }
}
