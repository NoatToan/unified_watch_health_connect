package vn2;

import android.app.Activity;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.feature.garminpay.providers.felica.exception.AlreadyHasOneCardException;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ;\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u001d\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R$\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\n\"\u0004\b*\u0010+R$\u00102\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00108\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b,\u00107R\u001a\u0010;\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b9\u0010(\u001a\u0004\b:\u0010\nR\u001a\u0010@\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010=\u001a\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lvn2/i;", "Lxn2/g;", "Lvn2/x0;", "Lvn2/w0;", "", "deviceUnitId", "<init>", "(J)V", "", "getDeviceName", "()Ljava/lang/String;", "Lq03/b;", "f0", "()Lq03/b;", "B0", "Lpn2/t;", "userInfo", "sfAmount", "paymentToken", "Lkotlin/Function1;", "", "", "progressCallback", "p", "(Lpn2/t;Ljava/lang/String;Ljava/lang/String;Le23/l;)Lq03/b;", "y0", "Lq03/r;", "", "kotlin.jvm.PlatformType", "s0", "()Lq03/r;", "Ltn2/f0$a;", "functionality", JWKParameterNames.RSA_EXPONENT, "(Ltn2/f0$a;)Lq03/b;", IntegerTokenConverter.CONVERTER_KEY, "J", "getDeviceUnitId", "()J", "j", "Ljava/lang/String;", "M", "z", "(Ljava/lang/String;)V", JWKParameterNames.OCT_KEY_VALUE, "Lpn2/t;", "E", "()Lpn2/t;", "x0", "(Lpn2/t;)V", "userInfoDto", "l", "I", "g", "()I", "(I)V", "chargingAmount", "m", JWKParameterNames.RSA_MODULUS, "garminJpPhoneNumber", "Lsd2/f;", "Lsd2/f;", "S", "()Lsd2/f;", "deviceRecord", "Lrn2/i;", "o", "Lrn2/i;", "cardInfo", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends xn2.g<x0> implements w0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f178889p = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long deviceUnitId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String paymentToken;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private pn2.t userInfoDto;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int chargingAmount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String garminJpPhoneNumber;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final sd2.f deviceRecord;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private rn2.i cardInfo;

    public i(long j8) {
        super(j8);
        this.deviceUnitId = j8;
        this.chargingAmount = 1000;
        this.garminJpPhoneNumber = "0492679114";
        this.deviceRecord = R0().f165636e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] Y0() throws IOException {
        pn2.a.f138690a.getClass();
        pn2.a.e eVarC = pn2.a.c();
        eVarC.getClass();
        kj0.b.f104940a.getClass();
        Request requestBuild = new Request.Builder().url(tn.k.g(yr2.g.b(kj0.b.a()), eVarC.f138733a)).build();
        bz0.o.f22274a.getClass();
        Response responseExecute = bz0.o.j().newCall(requestBuild).execute();
        if (!responseExecute.isSuccessful()) {
            vb.h.B(responseExecute, "Http response error: ");
            return null;
        }
        try {
            GsonUtil.f47252a.getClass();
            Gson gson = GsonUtil.f47253b;
            ResponseBody responseBodyBody = responseExecute.body();
            JsonObject jsonObject = (JsonObject) gson.fromJson(responseBodyBody != null ? responseBodyBody.charStream() : null, JsonObject.class);
            responseExecute.close();
            JsonArray asJsonArray = jsonObject.getAsJsonArray("options");
            asJsonArray.getClass();
            ArrayList arrayList = new ArrayList(p13.y.r(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().getAsInt()));
            }
            return p13.h0.a1(arrayList);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(responseExecute, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z0(i iVar, rn2.i iVar2) {
        iVar2.getClass();
        iVar.cardInfo = iVar2;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a1(e23.l lVar, Object obj) {
        obj.getClass();
        return (Unit) lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.f b1(i iVar) {
        if (iVar.cardInfo == null) {
            return q03.b.g(new IllegalAccessException("Should have issueCard before set express transit card"));
        }
        tn2.w wVarP0 = iVar.P0();
        rn2.i iVar2 = iVar.cardInfo;
        iVar2.getClass();
        String strG = iVar2.getCid();
        String str = qs2.a.f147386o.f147399d;
        wVarP0.getClass();
        strG.getClass();
        str.getClass();
        com.airbnb.lottie.k kVar = new com.airbnb.lottie.k(wVarP0, strG, 1, str);
        int i14 = w03.b.f181178a;
        return new z03.d(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.f c1(tn2.y0.c cVar) throws AlreadyHasOneCardException {
        cVar.getClass();
        if (cVar.f165746a == null) {
            return z03.f.f200765a;
        }
        throw new AlreadyHasOneCardException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.f d1(e23.l lVar, Object obj) {
        obj.getClass();
        return (q03.f) lVar.invoke(obj);
    }

    @Override // vn2.w0
    public q03.b B0() {
        return R0().j();
    }

    @Override // vn2.w0
    /* JADX INFO: renamed from: E, reason: from getter */
    public pn2.t getUserInfoDto() {
        return this.userInfoDto;
    }

    @Override // vn2.w0
    /* JADX INFO: renamed from: M, reason: from getter */
    public String getPaymentToken() {
        return this.paymentToken;
    }

    @Override // vn2.w0
    /* JADX INFO: renamed from: S, reason: from getter */
    public sd2.f getDeviceRecord() {
        return this.deviceRecord;
    }

    @Override // vn2.w0
    public q03.b e(tn2.f0.a functionality) {
        functionality.getClass();
        return R0().g(functionality);
    }

    @Override // vn2.w0
    public q03.b f0() {
        e13.j jVarA = R0().f165644m.a(false);
        h hVar = new h(new vb1.d(22), 0);
        int i14 = w03.b.f181178a;
        return new e13.k(jVarA, hVar);
    }

    @Override // vn2.w0
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getChargingAmount() {
        return this.chargingAmount;
    }

    @Override // vn2.w0
    public String getDeviceName() {
        return R0().f165641j;
    }

    @Override // xn2.g, vn2.w0
    public long getDeviceUnitId() {
        return this.deviceUnitId;
    }

    @Override // vn2.w0
    @uy2.k(description = "GooglePay is ready")
    public /* bridge */ q03.b i(Activity activity) {
        return super.i(activity);
    }

    @Override // vn2.w0
    public void k(int i14) {
        this.chargingAmount = i14;
    }

    @Override // vn2.w0
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getGarminJpPhoneNumber() {
        return this.garminJpPhoneNumber;
    }

    @Override // vn2.w0
    public q03.b p(pn2.t userInfo, String sfAmount, String paymentToken, e23.l<? super Integer, Unit> progressCallback) {
        userInfo.getClass();
        sfAmount.getClass();
        paymentToken.getClass();
        progressCallback.getClass();
        tn2.r0 r0VarR0 = R0();
        Logger logger = tn2.r0.f165631n;
        e13.j jVarL = r0VarR0.l(userInfo, sfAmount, paymentToken, progressCallback, new tn2.m(29));
        h hVar = new h(new uo1.a(this, 23), 1);
        int i14 = w03.b.f181178a;
        return new z03.j(new e13.o(jVarL, hVar));
    }

    @Override // vn2.w0
    public q03.r<int[]> s0() {
        jr2.f fVar = new jr2.f(2);
        int i14 = w03.b.f181178a;
        return new e13.m(fVar);
    }

    @Override // vn2.w0
    public void x0(pn2.t tVar) {
        this.userInfoDto = tVar;
    }

    @Override // vn2.w0
    public q03.b y0() {
        a73.h hVar = new a73.h(this, 12);
        int i14 = w03.b.f181178a;
        return new z03.d(hVar);
    }

    @Override // vn2.w0
    public void z(String str) {
        this.paymentToken = str;
    }
}
