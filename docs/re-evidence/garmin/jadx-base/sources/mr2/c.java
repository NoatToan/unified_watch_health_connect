package mr2;

import android.content.Context;
import androidx.lifecycle.s0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.room.g0;
import c83.a0;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.feature.garminpay.providers.gpay.model.Product;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardRefundFailedException;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.Optional;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.l;
import e23.p;
import fo2.c0;
import fo2.n0;
import fo2.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o53.b0;
import o53.l1;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.l0;
import p13.w;
import p13.x;
import ps2.n;
import ps2.r;
import vr2.q;
import yr2.m;
import zn2.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u008d\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0001GB#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\u0010J\u0012\u0010&\u001a\u0004\u0018\u00010%H\u0096@¢\u0006\u0004\b&\u0010\rJ\u0010\u0010'\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b'\u0010\rJ\u000f\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010\u0010J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010*J%\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190.0-*\b\u0012\u0004\u0012\u00020,0+H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0002¢\u0006\u0004\b1\u0010\u0010J\u0018\u00103\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J/\u0010:\u001a\u0002052\u0006\u00109\u001a\u0002082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b:\u0010;J\u001c\u0010=\u001a\u00020<*\u0002082\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u000eH\u0003¢\u0006\u0004\b?\u0010\u0010J\u0019\u0010C\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010@H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000eH\u0002¢\u0006\u0004\bE\u0010\u0010J\u000f\u0010F\u001a\u00020\u000eH\u0002¢\u0006\u0004\bF\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0016\u0010M\u001a\u0004\u0018\u0001028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u0004\u0018\u00010N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010X\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010S\u001a\u0004\bW\u0010UR \u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0.0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R \u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190.0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R \u0010c\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010_\u001a\u0004\ba\u0010bR&\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0e0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0018\u0010n\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR \u0010s\u001a\b\u0012\u0004\u0012\u00020o0Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bp\u0010\\\u001a\u0004\bq\u0010rR(\u0010w\u001a\u0004\u0018\u00010\u00122\b\u0010t\u001a\u0004\u0018\u00010\u00128\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b(\u0010u\"\u0004\bv\u0010\u0015R\u0016\u0010z\u001a\u00020x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010yR \u0010|\u001a\b\u0012\u0004\u0012\u00020x0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010h\u001a\u0004\b{\u0010jR \u0010\u007f\u001a\b\u0012\u0004\u0012\u00020B0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b}\u0010h\u001a\u0004\b~\u0010jR+\u0010\u0084\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00010d8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010h\u001a\u0005\b\u0083\u0001\u0010jR\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0088\u0001\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010mR#\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0d8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010h\u001a\u0005\b\u008a\u0001\u0010jR\u0015\u0010\u008c\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010*¨\u0006\u008e\u0001"}, d2 = {"Lmr2/c;", "Landroidx/lifecycle/u1;", "Lps2/r;", "Lmr2/d;", "", "deviceUnitId", "", "deviceImageUrl", "deviceDisplayName", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "", "N", "(Lt13/d;)Ljava/lang/Object;", "", "onCleared", "()V", "h", "Lhs2/b;", "status", "k4", "(Lhs2/b;)V", "Lbr2/f;", "h4", "()Lbr2/f;", "Lvr2/q;", "userWalletItem", "watchName", "O3", "(Lvr2/q;Ljava/lang/Long;Ljava/lang/String;)V", "Lcr2/a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "V3", "(Lcr2/a;)V", "I", "Y", "B", "Lhs2/e$a;", "Y0", "m", "l", "l1", "()Z", "Landroidx/lifecycle/w0;", "Lmr2/b;", "Landroidx/lifecycle/z0;", "", "X4", "(Landroidx/lifecycle/w0;)Landroidx/lifecycle/z0;", "e5", "Lsd2/f;", "P4", "(JLt13/d;)Ljava/lang/Object;", "Lo53/l1;", "V4", "()Lo53/l1;", "Lwr2/q;", "removeCardOperation", "W4", "(Lwr2/q;JLvr2/q;Ljava/lang/String;)Lo53/l1;", "Lwr2/q$b;", "c5", "(Lwr2/q;JLt13/d;)Ljava/lang/Object;", "Z4", "Ljs2/d;", "walletPasscodeData", "Ljs2/e;", "T4", "(Ljs2/d;)Ljs2/e;", "a5", "d5", "a", "J", "getDeviceUnitId", "()J", "b", "Lsd2/f;", "deviceDatabaseRecord", "Lps2/n;", "c", "Lps2/n;", "deviceWallet", "d", "Ljava/lang/String;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "getDeviceName", "deviceName", "Landroidx/lifecycle/s0;", "Lfs2/a;", "f", "Landroidx/lifecycle/s0;", "walletItemList", "g", "Landroidx/lifecycle/w0;", "associatedWalletItems", "N4", "()Landroidx/lifecycle/w0;", "associatedCardsModel", "Landroidx/lifecycle/y0;", "Lns2/a;", "Lms2/e;", IntegerTokenConverter.CONVERTER_KEY, "Landroidx/lifecycle/y0;", "Q4", "()Landroidx/lifecycle/y0;", "operators", "j", "Lo53/l1;", "operatorsLoadingJob", "Lwr2/f;", JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.RSA_MODULUS, "()Landroidx/lifecycle/s0;", "cardOperationNotification", "value", "Lhs2/b;", "b5", "deviceWalletStatus", "Lbr2/d;", "Lbr2/d;", "deviceConnectionStatus", "O4", "deviceConnectionStatusLiveData", "o", "S4", "walletPasscodeState", "Lcom/google/common/base/Optional;", "Lhs2/c;", "p", "R4", "walletExpressCard", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Lcr2/a;", "cardDetailsActionListener", "removeCardJob", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "U4", "isLoading", "isPhoneBluetoothTurnedOn", "v", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 implements r, mr2.d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f120364w = 8;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Logger f120365x;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long deviceUnitId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sd2.f deviceDatabaseRecord;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n deviceWallet;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String deviceImageUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String deviceName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final s0<List<fs2.a>> walletItemList;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final w0<List<q>> associatedWalletItems;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final w0<mr2.b> associatedCardsModel;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final y0<ns2.a<ms2.e>> operators;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private l1 operatorsLoadingJob;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final s0<wr2.f> cardOperationNotification;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private hs2.b deviceWalletStatus;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private br2.d deviceConnectionStatus;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final y0<br2.d> deviceConnectionStatusLiveData;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final y0<js2.e> walletPasscodeState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final y0<Optional<hs2.c>> walletExpressCard;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private cr2.a cardDetailsActionListener;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private l1 removeCardJob;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final y0<Boolean> isLoading;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.devicesettings.viewmodels.DeviceDetailsViewModel$checkRefundFailure$2", f = "DeviceDetailsViewModel.kt", l = {314, 316, 319, 325}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public sn2.a f120385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u f120386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c0 f120387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f120388d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f120389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f120390f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f120391g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f120392h;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f120392h = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00be  */
        /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:69:0x0105 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:70:? A[LOOP:0: B:43:0x00ed->B:70:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v27, types: [java.lang.Object, java.util.Map] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws CardRefundFailedException {
            String strF;
            sn2.a aVar;
            int i14;
            String link;
            u uVar;
            int i15;
            int i16;
            fo2.p pVarK;
            String link2;
            int i17;
            int i18;
            fo2.p pVar;
            String link3;
            c0 c0Var;
            b0 b0Var = (b0) this.f120392h;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i19 = this.f120391g;
            int i24 = 0;
            if (i19 == 0) {
                o13.r.b(obj);
                u0 u0Var = u0.f205864a;
                u0Var.getClass();
                sn2.a aVar3 = (sn2.a) u0.f().c();
                if (aVar3 instanceof sn2.a.C3030a) {
                    sn2.b bVar = ((sn2.a.C3030a) aVar3).f160417a;
                    if (bVar != null && (strF = bVar.getExternalAccountId()) != null) {
                        this.f120392h = b0Var;
                        this.f120385a = aVar3;
                        this.f120388d = 0;
                        this.f120391g = 1;
                        obj = u0Var.m(strF, this);
                        if (obj != aVar2) {
                            aVar = aVar3;
                            i14 = 0;
                        }
                        return aVar2;
                    }
                    c.f120365x.error("externalAccountId should not be empty. Developer fix me " + bVar);
                } else {
                    c.f120365x.warn("Cannot get FitPay user account, abort checking refund failure");
                }
                return Unit.INSTANCE;
            }
            if (i19 == 1) {
                i14 = this.f120388d;
                aVar = this.f120385a;
                o13.r.b(obj);
            } else {
                if (i19 == 2) {
                    i16 = this.f120389e;
                    i15 = this.f120388d;
                    uVar = this.f120386b;
                    o13.r.b(obj);
                    if (((n0) ao2.b.b((a0) obj)).getWallet().getPendingNotifications() > 0) {
                        pVarK = uVar.getLinks().getRefunds();
                        if (pVarK == null && (link2 = pVarK.getLink()) != null) {
                            u0 u0Var2 = u0.f205864a;
                            this.f120392h = b0Var;
                            this.f120385a = null;
                            this.f120386b = null;
                            this.f120388d = i15;
                            this.f120389e = i16;
                            this.f120390f = 0;
                            this.f120391g = 3;
                            obj = u0Var2.k(link2, this);
                            if (obj != aVar2) {
                                i17 = i16;
                                i18 = i15;
                                for (c0 c0Var2 : (List) obj) {
                                    if (s.g(c0Var2.getState(), "ACTION_REQUIRED")) {
                                        pVar = (fo2.p) c0Var2.getLinks().f51142a.get("product");
                                        if (pVar != null) {
                                        }
                                        c.f120365x.warn("No product link, abort checking refund failure");
                                        return Unit.INSTANCE;
                                    }
                                }
                                n23.j.s("Collection contains no element matching the predicate.");
                                return null;
                            }
                            return aVar2;
                        }
                        c.f120365x.warn("No refunds link, abort checking refund failure");
                    }
                    return Unit.INSTANCE;
                }
                if (i19 == 3) {
                    i24 = this.f120390f;
                    i17 = this.f120389e;
                    i18 = this.f120388d;
                    o13.r.b(obj);
                    while (r12.hasNext()) {
                        if (s.g(c0Var2.getState(), "ACTION_REQUIRED")) {
                            pVar = (fo2.p) c0Var2.getLinks().f51142a.get("product");
                            if (pVar != null || (link3 = pVar.getLink()) == null) {
                                c.f120365x.warn("No product link, abort checking refund failure");
                                return Unit.INSTANCE;
                            }
                            u0 u0Var3 = u0.f205864a;
                            this.f120392h = null;
                            this.f120385a = null;
                            this.f120386b = null;
                            this.f120387c = c0Var2;
                            this.f120388d = i18;
                            this.f120389e = i17;
                            this.f120390f = i24;
                            this.f120391g = 4;
                            u0Var3.getClass();
                            obj = u0.g().e(link3, this);
                            if (obj != aVar2) {
                                c0Var = c0Var2;
                            }
                            return aVar2;
                        }
                    }
                    n23.j.s("Collection contains no element matching the predicate.");
                    return null;
                }
                if (i19 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0Var = this.f120387c;
                o13.r.b(obj);
            }
            throw new CardRefundFailedException(((Product) ao2.b.b((a0) obj)).getProductName(), c0Var.getUserId(), c0Var.getRefundId());
            u uVar2 = (u) obj;
            fo2.p pVarO = uVar2.getLinks().getUserStatistics();
            if (pVarO != null && (link = pVarO.getLink()) != null) {
                u0 u0Var4 = u0.f205864a;
                this.f120392h = b0Var;
                this.f120385a = aVar;
                this.f120386b = uVar2;
                this.f120388d = i14;
                this.f120389e = 0;
                this.f120391g = 2;
                u0Var4.getClass();
                Object objC0 = u0.g().c0(link, this);
                if (objC0 != aVar2) {
                    uVar = uVar2;
                    obj = objC0;
                    i15 = i14;
                    i16 = 0;
                    if (((n0) ao2.b.b((a0) obj)).getWallet().getPendingNotifications() > 0) {
                        pVarK = uVar.getLinks().getRefunds();
                        if (pVarK == null) {
                        }
                        c.f120365x.warn("No refunds link, abort checking refund failure");
                    }
                }
                return aVar2;
            }
            c.f120365x.warn("No user statistics link, abort checking refund failure");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: mr2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsd2/f;", "<anonymous>", "(Lo53/b0;)Lsd2/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.devicesettings.viewmodels.DeviceDetailsViewModel$getDeviceRecordForUnitId$2", f = "DeviceDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C2284c extends v13.i implements p<b0, t13.d<? super sd2.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f120393a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2284c(long j8, t13.d<? super C2284c> dVar) {
            super(2, dVar);
            this.f120393a = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2284c(this.f120393a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super sd2.f> dVar) {
            return ((C2284c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            rd2.f.a().f152045a.getClass();
            long j8 = this.f120393a;
            sd2.f fVarI = rd2.j.i(j8, null);
            if (fVarI != null) {
                return fVarI;
            }
            throw new IllegalStateException(j8 + " Device record not found");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.devicesettings.viewmodels.DeviceDetailsViewModel$launchOperatorsLoading$1", f = "DeviceDetailsViewModel.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y0 f120394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f120395b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lns2/a;", "Lms2/e;", "<anonymous>", "(Lo53/b0;)Lns2/a;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.ui.devicesettings.viewmodels.DeviceDetailsViewModel$launchOperatorsLoading$1$1", f = "DeviceDetailsViewModel.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super ns2.a<? extends ms2.e>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f120397a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f120398b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f120398b = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f120398b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super ns2.a<? extends ms2.e>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f120397a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    n nVar = this.f120398b.deviceWallet;
                    if (nVar == null) {
                        return null;
                    }
                    this.f120397a = 1;
                    obj = nVar.i(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return (ns2.a) obj;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            y0<ns2.a<ms2.e>> y0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f120395b;
            c cVar = c.this;
            if (i14 == 0) {
                o13.r.b(obj);
                y0<ns2.a<ms2.e>> y0VarG4 = cVar.g4();
                x53.c cVar2 = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(cVar, null);
                this.f120394a = y0VarG4;
                this.f120395b = 1;
                Object objE0 = ge1.b.e0(bVar, aVar2, this);
                if (objE0 == aVar) {
                    return aVar;
                }
                y0Var = y0VarG4;
                obj = objE0;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = this.f120394a;
                o13.r.b(obj);
            }
            ns2.a<ms2.e> aVarQ = (ns2.a) obj;
            if (aVarQ == null) {
                aVarQ = gg.b.q(false);
            }
            y0Var.m(aVarQ);
            cVar.operatorsLoadingJob = null;
            cVar.Z4();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.devicesettings.viewmodels.DeviceDetailsViewModel$launchRemoveCardOperation$1", f = "DeviceDetailsViewModel.kt", l = {238}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f120399a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f120401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f120402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f120403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ wr2.q f120404f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lwr2/q$b;", "<anonymous>", "(Lo53/b0;)Lwr2/q$b;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.ui.devicesettings.viewmodels.DeviceDetailsViewModel$launchRemoveCardOperation$1$removalStatus$1", f = "DeviceDetailsViewModel.kt", l = {238}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super wr2.q.b>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f120405a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f120406b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ wr2.q f120407c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f120408d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, wr2.q qVar, long j8, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f120406b = cVar;
                this.f120407c = qVar;
                this.f120408d = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f120406b, this.f120407c, this.f120408d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super wr2.q.b> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f120405a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f120405a = 1;
                    Object objC5 = this.f120406b.c5(this.f120407c, this.f120408d, this);
                    return objC5 == aVar ? aVar : objC5;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q qVar, long j8, String str, wr2.q qVar2, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f120401c = qVar;
            this.f120402d = j8;
            this.f120403e = str;
            this.f120404f = qVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new e(this.f120401c, this.f120402d, this.f120403e, this.f120404f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f120399a;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(c.this, this.f120404f, this.f120402d, null);
                this.f120399a = 1;
                obj = ge1.b.e0(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            wr2.q.b bVar2 = (wr2.q.b) obj;
            c cVar2 = c.this;
            cVar2.removeCardJob = null;
            cVar2.Z4();
            cr2.a aVar3 = cVar2.cardDetailsActionListener;
            if (aVar3 != null) {
                aVar3.Q5(bVar2, this.f120401c.f179654a, w.c(new Long(this.f120402d)), w.c(this.f120403e));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.devicesettings.viewmodels.DeviceDetailsViewModel$loadExpressCard$1", f = "DeviceDetailsViewModel.kt", l = {298}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f120409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n f120410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public y0 f120411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f120412d;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            n nVar;
            c cVar;
            Throwable th3;
            y0 y0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f120412d;
            if (i14 == 0) {
                o13.r.b(obj);
                c cVar2 = c.this;
                nVar = cVar2.deviceWallet;
                if (nVar != null) {
                    try {
                        y0<Optional<hs2.c>> y0VarY2 = cVar2.y2();
                        e13.b bVarA = nVar.a();
                        this.f120409a = cVar2;
                        this.f120410b = nVar;
                        this.f120411c = y0VarY2;
                        this.f120412d = 1;
                        Object objF = w2.a0.f(bVarA, this);
                        if (objF == aVar) {
                            return aVar;
                        }
                        cVar = cVar2;
                        obj = objF;
                        y0Var = y0VarY2;
                    } catch (Throwable th4) {
                        cVar = cVar2;
                        th3 = th4;
                        c.f120365x.warn(androidx.room.a0.f(cVar.getDeviceUnitId(), "Something went wrong when trying to fetch wallet express card with device id ", ", or device does not support rapid pass"), th3);
                        cVar.y2().j(nVar.f140514q);
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f120411c;
            nVar = this.f120410b;
            cVar = this.f120409a;
            try {
                o13.r.b(obj);
            } catch (Throwable th5) {
                th3 = th5;
                c.f120365x.warn(androidx.room.a0.f(cVar.getDeviceUnitId(), "Something went wrong when trying to fetch wallet express card with device id ", ", or device does not support rapid pass"), th3);
                cVar.y2().j(nVar.f140514q);
            }
            y0Var.j(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.devicesettings.viewmodels.DeviceDetailsViewModel$loadPasscodeStatus$1", f = "DeviceDetailsViewModel.kt", l = {276}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f120414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n f120415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f120416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public y0 f120417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f120418e;

        public g(t13.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new g(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            c cVar;
            n nVar;
            Throwable th3;
            c cVar2;
            y0<js2.e> y0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f120418e;
            if (i14 == 0) {
                o13.r.b(obj);
                cVar = c.this;
                n nVar2 = cVar.deviceWallet;
                if (nVar2 != null) {
                    try {
                        y0<js2.e> y0VarC1 = cVar.c1();
                        q03.r<js2.d> rVarB = nVar2.b();
                        this.f120414a = cVar;
                        this.f120415b = nVar2;
                        this.f120416c = cVar;
                        this.f120417d = y0VarC1;
                        this.f120418e = 1;
                        Object objF = w2.a0.f(rVarB, this);
                        if (objF == aVar) {
                            return aVar;
                        }
                        nVar = nVar2;
                        obj = objF;
                        y0Var = y0VarC1;
                        cVar2 = cVar;
                    } catch (Throwable th4) {
                        nVar = nVar2;
                        th3 = th4;
                        cVar2 = cVar;
                        c.f120365x.warn("Something went wrong when trying to fetch wallet state for device with id " + cVar2.getDeviceUnitId(), th3);
                        cVar2.c1().j(cVar2.T4(nVar.f140513p));
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f120417d;
            cVar = this.f120416c;
            nVar = this.f120415b;
            cVar2 = this.f120414a;
            try {
                o13.r.b(obj);
            } catch (Throwable th5) {
                th3 = th5;
                c.f120365x.warn("Something went wrong when trying to fetch wallet state for device with id " + cVar2.getDeviceUnitId(), th3);
                cVar2.c1().j(cVar2.T4(nVar.f140513p));
            }
            y0Var.j(cVar.T4((js2.d) obj));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.devicesettings.viewmodels.DeviceDetailsViewModel$refreshBalancesIfNecessary$1", f = "DeviceDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f120420a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.ui.devicesettings.viewmodels.DeviceDetailsViewModel$refreshBalancesIfNecessary$1$2", f = "DeviceDetailsViewModel.kt", l = {345}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f120422a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yq2.b f120423b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ fs2.a f120424c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(yq2.b bVar, fs2.a aVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f120423b = bVar;
                this.f120424c = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f120423b, this.f120424c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f120422a;
                fs2.a aVar2 = this.f120424c;
                try {
                    if (i14 == 0) {
                        o13.r.b(obj);
                        yq2.b bVar = this.f120423b;
                        this.f120422a = 1;
                        if (bVar.b(aVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                } catch (Throwable th3) {
                    c.f120365x.warn("Failed to refresh balance for " + aVar2, th3);
                }
                return Unit.INSTANCE;
            }
        }

        public h(t13.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            h hVar = c.this.new h(dVar);
            hVar.f120420a = obj;
            return hVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f120420a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            List list = (List) c.this.walletItemList.d();
            if (list == null) {
                return Unit.INSTANCE;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                is2.b bVar = ((fs2.a) next).f73427b;
                yq2.b bVarA = bVar != null ? m.a(bVar) : null;
                Object arrayList = linkedHashMap.get(bVarA);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(bVarA, arrayList);
                }
                ((List) arrayList).add(next);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                yq2.b bVar2 = (yq2.b) entry.getKey();
                List list2 = (List) entry.getValue();
                if (bVar2 == null) {
                    return Unit.INSTANCE;
                }
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    ge1.b.T(b0Var, null, null, new a(bVar2, (fs2.a) it3.next(), null), 3);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f120425a;

        public i(l lVar) {
            lVar.getClass();
            this.f120425a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f120425a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f120425a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements l<wr2.q.b, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t13.d<wr2.q.b> f120426a;

        /* JADX WARN: Multi-variable type inference failed */
        public j(t13.d<? super wr2.q.b> dVar) {
            this.f120426a = dVar;
        }

        @Override // e23.l
        public final Unit invoke(wr2.q.b bVar) {
            wr2.q.b bVar2 = bVar;
            bVar2.getClass();
            int i14 = o13.q.f128596b;
            this.f120426a.resumeWith(bVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.devicesettings.viewmodels.DeviceDetailsViewModel$updateDeviceConnectionStatus$1", f = "DeviceDetailsViewModel.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f120427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f120428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f120429c;

        public k(t13.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            k kVar = c.this.new k(dVar);
            kVar.f120429c = obj;
            return kVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            long j8;
            Object bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f120428b;
            c cVar = c.this;
            if (i14 == 0) {
                o13.r.b(obj);
                long deviceUnitId = cVar.getDeviceUnitId();
                try {
                    int i15 = o13.q.f128596b;
                    if (deviceUnitId <= 0) {
                        throw new IllegalStateException("Haven't load device");
                    }
                    this.f120429c = null;
                    this.f120427a = deviceUnitId;
                    this.f120428b = 1;
                    obj = cVar.P4(deviceUnitId, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    j8 = deviceUnitId;
                } catch (Throwable th3) {
                    th = th3;
                    j8 = deviceUnitId;
                    int i16 = o13.q.f128596b;
                    bVar = new o13.q.b(th);
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j8 = this.f120427a;
                try {
                    o13.r.b(obj);
                } catch (Throwable th4) {
                    th = th4;
                    int i17 = o13.q.f128596b;
                    bVar = new o13.q.b(th);
                }
            }
            bVar = (sd2.f) obj;
            int i18 = o13.q.f128596b;
            if (!(bVar instanceof o13.q.b)) {
                sd2.f fVar = (sd2.f) bVar;
                hs2.b bVar2 = cVar.deviceWalletStatus;
                if (bVar2 == null) {
                    bVar2 = hs2.b.DISCONNECTED;
                }
                br2.f.a aVar2 = br2.f.f19598j;
                long unitID = fVar.getUnitID();
                boolean zIsPaired = fVar.isPaired();
                aVar2.getClass();
                cVar.deviceConnectionStatus = br2.f.a.a(unitID, zIsPaired, bVar2);
                cVar.p4().j(cVar.deviceConnectionStatus);
            }
            Throwable thB = o13.q.b(bVar);
            if (thB != null) {
                c.f120365x.error("Failed to get device record for deviceUnitId " + j8, thB);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f120365x = gt2.b.f79005a.h("PAY#DeviceDetailsViewModel");
    }

    public c(long j8, String str, String str2) {
        hs2.a aVar;
        Optional<hs2.c> optional;
        String productDisplayName;
        this.deviceUnitId = j8;
        rd2.j jVar = rd2.f.a().f152045a;
        long deviceUnitId = getDeviceUnitId();
        jVar.getClass();
        sd2.f fVarI = rd2.j.i(deviceUnitId, null);
        this.deviceDatabaseRecord = fVarI;
        ps2.w wVar = ps2.w.f140538a;
        long deviceUnitId2 = getDeviceUnitId();
        wVar.getClass();
        n nVarI = ps2.w.i(deviceUnitId2);
        this.deviceWallet = nVarI;
        this.deviceImageUrl = str == null ? "" : str;
        if (fVarI != null && (productDisplayName = fVarI.getProductDisplayName()) != null) {
            str2 = productDisplayName;
        } else if (str2 == null) {
            str2 = (nVarI == null || (aVar = nVarI.f140498a) == null) ? null : aVar.getDisplayName();
            if (str2 == null) {
                str2 = "--";
            }
        }
        this.deviceName = str2;
        GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        bVar.getClass();
        g0 g0VarL = GarminPayCoreDatabase.b.a(contextC).e().l(getDeviceUnitId());
        this.walletItemList = g0VarL;
        w0<List<q>> w0Var = new w0<>();
        w0Var.n(g0VarL, new i(new androidx.lifecycle.k(w0Var, 8)));
        this.associatedWalletItems = w0Var;
        w0<mr2.b> w0Var2 = new w0<>();
        w0Var2.n(w0Var, X4(w0Var2));
        this.associatedCardsModel = w0Var2;
        this.operators = new y0<>();
        this.cardOperationNotification = wr2.e.f186838m;
        this.deviceWalletStatus = nVarI != null ? nVarI.h() : null;
        this.deviceConnectionStatus = br2.d.NOT_CONNECTED;
        this.deviceConnectionStatusLiveData = new y0<>();
        this.walletPasscodeState = new y0<>(T4(nVarI != null ? nVarI.f140513p : null));
        this.walletExpressCard = new y0<>((nVarI == null || (optional = nVarI.f140514q) == null) ? Optional.absent() : optional);
        this.isLoading = new y0<>();
        a5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M4(w0 w0Var, List list) {
        f120365x.trace("walletItemList.onChanged");
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fs2.a aVar = (fs2.a) it.next();
            is2.b bVar = aVar.f73427b;
            q qVarA = null;
            if (bVar != null) {
                try {
                    qVarA = m.a(bVar).a(aVar);
                } catch (Exception e4) {
                    f120365x.error("Failed to fetch wallet items from local DB", (Throwable) e4);
                }
            }
            if (qVarA != null) {
                arrayList.add(qVarA);
            }
        }
        w0Var.m(arrayList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P4(long j8, t13.d<? super sd2.f> dVar) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new C2284c(j8, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final js2.e T4(js2.d walletPasscodeData) {
        js2.e eVar;
        boolean z14 = false;
        boolean zG = walletPasscodeData != null ? s.g(walletPasscodeData.f100665f, Boolean.TRUE) : false;
        mr2.b bVarD = r4().d();
        if (bVarD != null && h0.L(bVarD.f120356a)) {
            z14 = true;
        }
        if (zG || z14) {
            return (walletPasscodeData == null || (eVar = walletPasscodeData.f100660a) == null) ? js2.e.PASSCODE_SET : eVar;
        }
        return js2.e.NO_PASSCODE_SET;
    }

    private final l1 V4() {
        return ge1.b.T(v1.a(this), null, null, new d(null), 3);
    }

    private final l1 W4(wr2.q removeCardOperation, long deviceUnitId, q userWalletItem, String watchName) {
        return ge1.b.T(v1.a(this), null, null, new e(userWalletItem, deviceUnitId, watchName, removeCardOperation, null), 3);
    }

    private final z0<List<q>> X4(w0<mr2.b> w0Var) {
        return new hc0.f(3, this, w0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(c cVar, w0 w0Var, List list) {
        Set<is2.b> setI;
        hs2.a aVar;
        list.getClass();
        f120365x.trace("associatedWalletItems.onChanged");
        n nVar = cVar.deviceWallet;
        if (nVar == null || (aVar = nVar.f140498a) == null || (setI = aVar.i()) == null) {
            setI = l0.f134950a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            q qVar = (q) obj;
            if (h0.R(setI, qVar.f179660g) && cVar.getDeviceUnitId() == qVar.f179658e.f73431f) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((q) obj2).f179659f == br2.g.PAY_ENABLED) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!h0.R(x.k(br2.g.PAY_ENABLED, br2.g.PAY_NOT_ENABLED), ((q) obj3).f179659f)) {
                arrayList3.add(obj3);
            }
        }
        w0Var.m(new mr2.b(arrayList2, arrayList3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z4() {
        isLoading().m(Boolean.valueOf((this.operatorsLoadingJob == null && this.removeCardJob == null) ? false : true));
    }

    private final void a5() {
        n nVar = this.deviceWallet;
        if (nVar != null) {
            nVar.m(this);
        }
    }

    private final void b5(hs2.b bVar) {
        this.deviceWalletStatus = bVar;
        e5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c5(wr2.q qVar, long j8, t13.d<? super wr2.q.b> dVar) {
        t13.i iVar = new t13.i(u13.f.b(dVar));
        j jVar = new j(iVar);
        qVar.getClass();
        if (qVar.a()) {
            qVar.b(j8, jVar);
        } else {
            jVar.invoke(wr2.q.b.REMOVE_PRECONDITIONS_FAILED);
        }
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    private final void d5() {
        n nVar = this.deviceWallet;
        if (nVar != null) {
            nVar.q(this);
        }
    }

    private final void e5() {
        gl.b.I(v1.a(this), null, new k(null), 3);
    }

    @Override // mr2.d
    public void B() {
        w9.a aVarA = v1.a(this);
        x53.c cVar = o53.s0.f129406a;
        gl.b.I(aVarA, x53.b.f189152a, new f(null), 2);
    }

    @Override // mr2.d
    public void I() {
        this.cardDetailsActionListener = null;
    }

    @Override // mr2.d
    public Object N(t13.d<? super Boolean> dVar) {
        return Boolean.valueOf(this.deviceWalletStatus == hs2.b.READY);
    }

    @Override // mr2.d
    /* JADX INFO: renamed from: N4, reason: merged with bridge method [inline-methods] */
    public w0<mr2.b> r4() {
        return this.associatedCardsModel;
    }

    @Override // mr2.d
    public void O3(q userWalletItem, Long deviceUnitId, String watchName) {
        userWalletItem.getClass();
        watchName.getClass();
        if (this.removeCardJob == null) {
            wr2.r rVar = wr2.r.f186883a;
            fs2.a aVar = userWalletItem.f179658e;
            rVar.getClass();
            op2.e eVarA = wr2.r.a(aVar);
            if (deviceUnitId != null && eVarA != null) {
                this.removeCardJob = W4(eVarA, deviceUnitId.longValue(), userWalletItem, watchName);
                Z4();
            }
        }
    }

    @Override // mr2.d
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public y0<br2.d> p4() {
        return this.deviceConnectionStatusLiveData;
    }

    @Override // mr2.d
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public y0<ns2.a<ms2.e>> g4() {
        return this.operators;
    }

    @Override // mr2.d
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public y0<Optional<hs2.c>> y2() {
        return this.walletExpressCard;
    }

    @Override // mr2.d
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public y0<js2.e> c1() {
        return this.walletPasscodeState;
    }

    @Override // mr2.d
    /* JADX INFO: renamed from: U4, reason: merged with bridge method [inline-methods] */
    public y0<Boolean> isLoading() {
        return this.isLoading;
    }

    @Override // mr2.d
    public void V3(cr2.a listener) {
        listener.getClass();
        this.cardDetailsActionListener = listener;
    }

    @Override // mr2.d
    public void Y() {
        w9.a aVarA = v1.a(this);
        x53.c cVar = o53.s0.f129406a;
        gl.b.I(aVarA, x53.b.f189152a, new g(null), 2);
    }

    @Override // mr2.d
    public Object Y0(t13.d<? super hs2.e.a> dVar) {
        ps2.w.f140538a.getClass();
        return ps2.w.f140543f.get(new Long(getDeviceUnitId()));
    }

    @Override // mr2.d
    public boolean f() {
        xr2.a.f192031a.getClass();
        return xr2.a.a();
    }

    @Override // mr2.d
    public String getDeviceName() {
        return this.deviceName;
    }

    @Override // mr2.d
    public long getDeviceUnitId() {
        return this.deviceUnitId;
    }

    @Override // mr2.d
    public void h() {
        if (this.operatorsLoadingJob != null) {
            return;
        }
        this.operatorsLoadingJob = V4();
        Z4();
    }

    @Override // mr2.d
    public br2.f h4() {
        n nVar = this.deviceWallet;
        if (nVar != null) {
            return new br2.f(nVar.f140511n, getDeviceName(), getDeviceImageUrl(), this.deviceConnectionStatus, String.valueOf(nVar.f140498a.getFirmwareVersion()), String.valueOf(nVar.f140498a.getFirmwareVersion()), false, false, 192, null);
        }
        return new br2.f(getDeviceUnitId(), getDeviceName(), getDeviceImageUrl(), this.deviceConnectionStatus, "", "", false, false, 192, null);
    }

    @Override // ps2.r
    public void k4(hs2.b status) {
        status.getClass();
        b5(status);
    }

    @Override // mr2.d
    public void l() {
        w9.a aVarA = v1.a(this);
        x53.c cVar = o53.s0.f129406a;
        gl.b.I(aVarA, x53.b.f189152a, new h(null), 2);
    }

    @Override // mr2.d
    public boolean l1() {
        hs2.a aVar;
        n nVar = this.deviceWallet;
        if (nVar == null || (aVar = nVar.f140498a) == null) {
            return false;
        }
        return aVar.getRequiresPasscode();
    }

    @Override // mr2.d
    public Object m(t13.d<? super Unit> dVar) throws Throwable {
        x53.c cVar = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new b(null), dVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Override // mr2.d
    public s0<wr2.f> n() {
        return this.cardOperationNotification;
    }

    @Override // androidx.lifecycle.u1
    public void onCleared() {
        d5();
    }

    @Override // mr2.d
    /* JADX INFO: renamed from: r, reason: from getter */
    public String getDeviceImageUrl() {
        return this.deviceImageUrl;
    }
}
