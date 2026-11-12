package com.garmin.feature.garminpay.providers.rabbit.ui;

import android.content.Intent;
import com.garmin.garminpay.wallet.exception.ExpressCardSettingException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import sd2.f;
import sd2.j;
import uy2.f0;
import uy2.g0;
import uy2.j0;
import uy2.k;
import uy2.k0;
import uy2.l0;
import uy2.o0;
import uy2.r;
import uy2.v;
import xy2.o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u001a\u001b\u001c\u001d\u001e\u001f J\u0010\u0010\u0004\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u0005J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0015\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006!À\u0006\u0003"}, d2 = {"Lcom/garmin/feature/garminpay/providers/rabbit/ui/IRabbitCardDetailModel;", "Lsy2/c;", "Lqq2/a;", "Loq2/a;", "Z", "(Lt13/d;)Ljava/lang/Object;", "Landroid/content/Intent;", "intent", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "u", "(Landroid/content/Intent;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "q0", "enabled", "", "w", "(ZLt13/d;)Ljava/lang/Object;", "i0", "n0", "()Ljava/lang/String;", "cardNumber", "Lsd2/f;", "getDevice", "()Lsd2/f;", "device", "c", JWKParameterNames.RSA_EXPONENT, "d", "a", "b", "OperateRabbitCardException", "DeviceNotSupportException", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface IRabbitCardDetailModel extends sy2.c<qq2.a> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/rabbit/ui/IRabbitCardDetailModel$DeviceNotSupportException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DeviceNotSupportException extends Exception {
        public static final int $stable = 8;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/rabbit/ui/IRabbitCardDetailModel$a;", "Lxy2/o;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements o<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f51744a;

        public a() {
            uy2.e eVar = uy2.e.f173458a;
            ExpressCardSettingException expressCardSettingException = new ExpressCardSettingException(ExpressCardSettingException.a.DEVICE_IS_BUSY, "Device is busy");
            eVar.getClass();
            this.f51744a = new uy2.d(expressCardSettingException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final Throwable getF173457a() {
            return (Throwable) this.f51744a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/rabbit/ui/IRabbitCardDetailModel$b;", "Lxy2/o;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements o<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f51745a;

        public b() {
            uy2.e eVar = uy2.e.f173458a;
            ExpressCardSettingException expressCardSettingException = new ExpressCardSettingException(ExpressCardSettingException.a.DEVICE_NOT_CONNECTED, "Device is not connected");
            eVar.getClass();
            this.f51745a = new uy2.d(expressCardSettingException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final Throwable getF173457a() {
            return (Throwable) this.f51745a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/rabbit/ui/IRabbitCardDetailModel$c;", "Lxy2/o;", "Lsd2/f;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements o<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f51746a;

        public c() {
            uy2.e eVar = uy2.e.f173458a;
            j jVar = new j();
            jVar.f158685b1 = "Venu 2";
            jVar.L0 = "https://s3.amazonaws.com/garmin-connect-prod/profile_images/35b79dac-054f-40f2-ac44-70f7b2fcb0eb-71.png";
            Unit unit = Unit.INSTANCE;
            eVar.getClass();
            this.f51746a = new uy2.d(jVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final f getF173457a() {
            return (f) this.f51746a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/rabbit/ui/IRabbitCardDetailModel$d;", "Lxy2/o;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements o<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f51747a;

        public d() {
            uy2.e eVar = uy2.e.f173458a;
            ExpressCardSettingException expressCardSettingException = new ExpressCardSettingException(ExpressCardSettingException.a.GENERAL_ERROR, "General error");
            eVar.getClass();
            this.f51747a = new uy2.d(expressCardSettingException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final Throwable getF173457a() {
            return (Throwable) this.f51747a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/rabbit/ui/IRabbitCardDetailModel$e;", "Lxy2/o;", "Loq2/a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements o<oq2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f51748a;

        public e() {
            uy2.e eVar = uy2.e.f173458a;
            oq2.a aVar = new oq2.a("com.garmin.android.apps.golf", "com.garmin.android.apps.golf.PLAY_SCREEN", "https://play.google.com/store/apps/details?id=com.garmin.android.apps.golf");
            eVar.getClass();
            this.f51748a = new uy2.d(aVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final oq2.a getF173457a() {
            return (oq2.a) this.f51748a.f173457a;
        }
    }

    @r(providerClass = e.class)
    Object Z(t13.d<? super oq2.a> dVar);

    @Override // sy2.c
    @k
    /* synthetic */ void a(qq2.a aVar);

    /* synthetic */ Object b();

    @r(providerClass = c.class)
    f getDevice();

    @o0(description = "Fails to set express transit", providerClass = d.class)
    @j0(description = "Fails to set card enabled", exceptionClass = Exception.class)
    @k(description = "Happy path")
    @k0(description = "Device busy, cannot set express transit", providerClass = a.class)
    @l0(description = "Device disconnected, cannot set express transit", providerClass = b.class)
    Object i0(t13.d<? super Unit> dVar);

    @f0("123456789012")
    String n0();

    @g0(description = "Card is disabled on device")
    @v(description = "Card is enabled on device")
    Object q0(t13.d<? super Boolean> dVar);

    @g0(description = "App is installed")
    @v(description = "App is not installed")
    Object u(Intent intent, String str, t13.d<? super Boolean> dVar);

    @o0(description = "Fails to set express transit", providerClass = d.class)
    @j0(description = "Fails to set card enabled", exceptionClass = Exception.class)
    @k(description = "Happy path")
    @k0(description = "Device busy, cannot set express transit", providerClass = a.class)
    @l0(description = "Device disconnected, cannot set express transit", providerClass = b.class)
    Object w(boolean z14, t13.d<? super Unit> dVar);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/feature/garminpay/providers/rabbit/ui/IRabbitCardDetailModel$OperateRabbitCardException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "message", "", "(Ljava/lang/String;)V", "throwable", "", "(Ljava/lang/Throwable;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OperateRabbitCardException extends Exception {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OperateRabbitCardException(String str) {
            super(str);
            str.getClass();
        }

        public OperateRabbitCardException() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OperateRabbitCardException(Throwable th3) {
            super(th3);
            th3.getClass();
        }
    }
}
