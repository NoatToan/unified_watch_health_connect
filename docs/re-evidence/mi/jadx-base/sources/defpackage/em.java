package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.model.HMCardSwitchTime;
import com.xiaomi.hm.health.bt.profile.nfc.ApduResponse;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardConfig;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardIdent;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardStatus;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00102\u001a\u00020+¢\u0006\u0004\b3\u00104J0\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\bH\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020!0\b2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020!0\b2\u0006\u0010#\u001a\u00020\"H\u0016J\b\u0010\u0015\u001a\u00020!H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020!0\b2\u0006\u0010%\u001a\u00020$H\u0016J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001b0\b2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\rH\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020!0\b2\u0006\u0010%\u001a\u00020$H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010)\u001a\u00020\u0006H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010*\u001a\u00020&H\u0016R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00065"}, d2 = {"Lem;", "Ldm;", "F", "Lnl;", "request", "Loq;", "", "codec", "Lol;", PluginDeviceInfo.FMODEL, "byteArray", "", PluginDeviceInfo.FICONOFF, "", "count", "Ll9;", "errorCode", "Llm;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, PluginDeviceInfo.FICONOFFLINE, "Lcom/xiaomi/hm/health/bt/profile/nfc/ApduResponse;", PluginDeviceInfo.FDESC, "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardInfo;", PluginDeviceInfo.FBLUETOOTHPAIR, "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardConfig;", "cardConfig", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardStatus;", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardIdent;", "cardList", PluginDeviceInfo.FICONON, "Lcom/xiaomi/hm/health/bt/model/HMAidInfo;", "state", "", "Lcom/xiaomi/hm/health/bt/model/HMAccessInfo;", "info", "Lcom/xiaomi/hm/health/bt/model/HMCardSwitchTime;", "hmCardSwitchTime", "", "aid", "cardType", "data", "password", "Lnm;", "version", "Lnm;", PluginDeviceInfo.FLOCALIZATIONS, "()Lnm;", "Lcom/huami/bluetooth/profile/channel/module/a;", RnReportConst.ApiReport.PARAM_MODULE, "protocolVersion", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/a;Lnm;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class em implements dm {

    @NotNull
    public static final c e = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.huami.bluetooth.profile.channel.module.a f16790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f16791b;

    @NotNull
    public final NFCVersion c;

    @NotNull
    public final List<lm> d;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(Object obj) {
            super(1, obj, em.class, "onCommand", "onCommand([B)V", 0);
        }

        public final void a(@NotNull byte[] p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((em) this.receiver).d(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"em$b", "Lnq;", "", "byteArray", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements nq {
        @Override // defpackage.nq
        public boolean a(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            return r0.a(ArraysKt___ArraysKt.first(byteArray)) != 16;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lem$c;", "", "", "NFC_10S_TIMEOUT", "J", "NFC_30S_TIMEOUT", "NFC_60S_TIMEOUT", "", "RESPONSE_PREFIX", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public em(@NotNull com.huami.bluetooth.profile.channel.module.a module, @NotNull NFCVersion protocolVersion) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        this.f16790a = module;
        this.f16791b = "NFCApiImpl";
        module.registerDeviceRequestHandler(new g7(new a(this), new b()));
        this.c = protocolVersion;
        this.d = new ArrayList();
    }

    @Override // defpackage.dm
    @NotNull
    public ol<ApduResponse> b(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        return a(new nl(fm.a.d.withShort(byteArray.length).withBytes(byteArray), null, 60000L, null, false, 26, null), new defpackage.c());
    }

    @Override // defpackage.dm
    @NotNull
    public ol<ApduResponse> c(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        return a(new nl(fm.i.d.withShort(byteArray.length).withBytes(byteArray), null, 60000L, null, false, 26, null), new defpackage.c());
    }

    @Override // defpackage.dm
    @NotNull
    public ol<Integer> d() {
        return a(new nl(fm.d.d, null, 10000L, null, false, 26, null), new r4());
    }

    @Override // defpackage.dm
    @NotNull
    public ol<Integer> e() {
        return a(new nl(fm.j.d, null, 10000L, null, false, 26, null), new r4());
    }

    @Override // defpackage.dm
    @NotNull
    public ol<HMNFCCardInfo> f() {
        ol<HMNFCCardInfo> olVarA = a(new nl(fm.m.d, null, 30000L, null, false, 26, null), new i3());
        if (olVarA instanceof fu) {
            ((HMNFCCardInfo) ((fu) olVarA).a()).setVersion(getC().getVersion());
        }
        return olVarA;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public NFCVersion getC() {
        return this.c;
    }

    @Override // defpackage.dm
    public void a(@NotNull lm listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.d.add(listener);
    }

    public final <F> ol<F> a(nl request, oq<F, byte[]> codec) {
        return codec.a(this.f16790a.sendRequest(request));
    }

    @Override // defpackage.dm
    @NotNull
    public ol<HMNFCCardStatus> a(@NotNull HMNFCCardConfig cardConfig) {
        Intrinsics.checkNotNullParameter(cardConfig, "cardConfig");
        fm.c cVar = fm.c.d;
        byte[] bytes = cardConfig.getBytes();
        Intrinsics.checkNotNullExpressionValue(bytes, "cardConfig.bytes");
        return a(new nl(cVar.withBytes(bytes), null, 30000L, null, false, 26, null), new o3());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    public final void d(byte[] byteArray) {
        Object objM886constructorimpl;
        Unit unit;
        jq.a aVarDecode = new z4().decode(byteArray);
        try {
            Result.Companion companion = Result.Companion;
            int iA = r0.a(ArraysKt___ArraysKt.first(aVarDecode.getF34884a()));
            if (iA == fm.r.d.getF17906a()) {
                Integer numA = r0.a(aVarDecode.getF34884a());
                if (numA != null) {
                    a(numA.intValue());
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            } else if (iA == fm.b.d.getF17906a()) {
                Integer numA2 = r0.a(aVarDecode.getF34884a());
                if (numA2 != null) {
                    a(jm.a(numA2.intValue()));
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            } else {
                t5t.d("MenstruationDataParser", "无法识别的NFC命令:" + aVarDecode);
                unit = Unit.INSTANCE;
            }
            objM886constructorimpl = Result.m886constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d("MenstruationDataParser", "处理NFC命令异常:" + thM889exceptionOrNullimpl);
        }
    }

    @Override // defpackage.dm
    public boolean b() {
        return getC().getVersion() > 4;
    }

    @Override // defpackage.dm
    @NotNull
    public ol<Integer> c() {
        return a(new nl(fm.k.d.withByte(1), null, 60000L, null, false, 26, null), new ro());
    }

    @Override // defpackage.dm
    @NotNull
    public ol<Boolean> b(@NotNull HMCardSwitchTime hmCardSwitchTime) {
        Intrinsics.checkNotNullParameter(hmCardSwitchTime, "hmCardSwitchTime");
        byte[] aidBytes = tet.y(hmCardSwitchTime.getAid());
        byte[] repeatModeBytes = tet.r(hmCardSwitchTime.getRepeatMode(), 4);
        jq.a aVarWithByte = fm.q.d.withByte(aidBytes.length);
        Intrinsics.checkNotNullExpressionValue(aidBytes, "aidBytes");
        jq.a aVarWithByte2 = aVarWithByte.withBytes(aidBytes).withByte(hmCardSwitchTime.getCardType()).withByte(hmCardSwitchTime.getHour()).withByte(hmCardSwitchTime.getMinute());
        Intrinsics.checkNotNullExpressionValue(repeatModeBytes, "repeatModeBytes");
        return a(new nl(aVarWithByte2.withBytes(repeatModeBytes), null, 60000L, null, false, 26, null), new m3());
    }

    @Override // defpackage.dm
    @NotNull
    public ol<l9> a(@NotNull List<? extends HMNFCCardIdent> cardList) {
        Intrinsics.checkNotNullParameter(cardList, "cardList");
        return a(new nl(fm.n.d.withBytes(new j3().encode(cardList)), null, 10000L, null, false, 26, null), new js());
    }

    @Override // defpackage.dm
    @NotNull
    public ol<Boolean> a(@NotNull HMAidInfo state) {
        Intrinsics.checkNotNullParameter(state, "state");
        jq.a aVarWithByte = fm.g.d.withByte(state.getOp()).withByte(state.getType()).withByte(state.getAidLen());
        byte[] aid = state.getAid();
        Intrinsics.checkNotNullExpressionValue(aid, "state.aid");
        return a(new nl(aVarWithByte.withBytes(aid), null, 10000L, null, false, 26, null), new n3());
    }

    @Override // defpackage.dm
    @NotNull
    public ol<Boolean> a(@NotNull HMAccessInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        if (info.getName() != null) {
            String name = info.getName();
            Intrinsics.checkNotNullExpressionValue(name, "info.name");
            if (name.length() != 0) {
                String name2 = info.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "info.name");
                byte[] bytes = name2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                if (bytes.length > 255) {
                    return new Failure("名称过长", 0, 2, null);
                }
                jq.a aVarWithByte = fm.p.d.withByte(info.getCardType()).withByte(info.getAidLen());
                byte[] aid = info.getAid();
                Intrinsics.checkNotNullExpressionValue(aid, "info.aid");
                return a(new nl(aVarWithByte.withBytes(aid).withByte(bytes.length + 1).withBytes(bytes).withByte(0), null, 10000L, null, false, 26, null), new k3());
            }
        }
        return new Failure("名称参数错误", 0, 2, null);
    }

    @Override // defpackage.dm
    @NotNull
    public ol<List<HMCardSwitchTime>> a(@NotNull String aid, int cardType) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        byte[] aidBytes = tet.y(aid);
        jq.a aVarWithByte = fm.o.d.withByte(aidBytes.length);
        Intrinsics.checkNotNullExpressionValue(aidBytes, "aidBytes");
        return a(new nl(aVarWithByte.withBytes(aidBytes).withByte(cardType), null, 60000L, null, false, 26, null), new l3());
    }

    @Override // defpackage.dm
    @NotNull
    public ol<Boolean> a(@NotNull HMCardSwitchTime hmCardSwitchTime) {
        Intrinsics.checkNotNullParameter(hmCardSwitchTime, "hmCardSwitchTime");
        byte[] aidBytes = tet.y(hmCardSwitchTime.getAid());
        byte[] repeatModeBytes = tet.r(hmCardSwitchTime.getRepeatMode(), 4);
        jq.a aVarWithByte = fm.f.d.withByte(aidBytes.length);
        Intrinsics.checkNotNullExpressionValue(aidBytes, "aidBytes");
        jq.a aVarWithByte2 = aVarWithByte.withBytes(aidBytes).withByte(hmCardSwitchTime.getCardType()).withByte(hmCardSwitchTime.getHour()).withByte(hmCardSwitchTime.getMinute());
        Intrinsics.checkNotNullExpressionValue(repeatModeBytes, "repeatModeBytes");
        return a(new nl(aVarWithByte2.withBytes(repeatModeBytes), null, 60000L, null, false, 26, null), new m3());
    }

    @Override // defpackage.dm
    @NotNull
    public ol<ApduResponse> a(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return a(new nl(fm.h.d.withBytes(data), null, 60000L, null, false, 26, null), new jk());
    }

    @Override // defpackage.dm
    @NotNull
    public ol<Integer> a() {
        return a(new nl(fm.k.d.withByte(4), null, 60000L, null, false, 26, null), new ro());
    }

    @Override // defpackage.dm
    @NotNull
    public ol<Integer> a(@NotNull String password) {
        Intrinsics.checkNotNullParameter(password, "password");
        return ol.f29263a.a(-1);
    }

    public final void a(int count) {
        Iterator<T> it = this.d.iterator();
        while (it.hasNext()) {
            ((lm) it.next()).a(count);
        }
    }

    public final void a(l9 errorCode) {
        Iterator<T> it = this.d.iterator();
        while (it.hasNext()) {
            ((lm) it.next()).a(errorCode);
        }
    }
}
