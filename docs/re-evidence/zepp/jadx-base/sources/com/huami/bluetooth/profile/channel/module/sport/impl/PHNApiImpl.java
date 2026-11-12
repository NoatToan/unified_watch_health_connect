package com.huami.bluetooth.profile.channel.module.sport.impl;

import com.huami.bluetooth.profile.channel.module.base.IncreasePredict;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ModuleResultKt;
import com.huami.bluetooth.profile.channel.module.sport.PHNApi;
import com.huami.bluetooth.profile.channel.module.sport.PHNCommand;
import com.huami.bluetooth.profile.channel.module.sport.PHNErrorCode;
import com.huami.bluetooth.profile.channel.module.sport.PHNModelKt;
import com.huami.bluetooth.profile.channel.module.sport.PHNModule;
import com.huami.bluetooth.profile.channel.module.sport.PHNResultMessageDto;
import com.huami.bluetooth.profile.channel.module.sport.PHNSummaryResult;
import com.huami.bluetooth.profile.channel.module.sport.codec.CodeCodec;
import com.huami.bluetooth.profile.channel.module.sport.codec.PhnCodec;
import com.huami.bluetooth.profile.channel.module.sport.codec.PhnSummaryCodec;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016R\u0019\u0010\u0018\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/impl/PHNApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNApi;", "", "algorithmVersion", "phnJson", "", "", "restDay", "", "startTime", "", "startPHN", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNErrorCode;", "updateRestDay", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "pullPHN", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNSummaryResult;", "getSummaryResult", "stopPHN", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNModule;", "a", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNModule;", "getModule", "()Lcom/huami/bluetooth/profile/channel/module/sport/PHNModule;", "module", "b", "Ljava/lang/String;", "getAlgorithmVersion", "()Ljava/lang/String;", "Lkotlinx/serialization/json/Json;", "c", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/sport/PHNModule;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class PHNApiImpl implements PHNApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PHNModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String algorithmVersion;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Json json = JsonKt.Json$default(null, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<JsonBuilder, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull JsonBuilder jsonBuilder) {
            jsonBuilder.setIgnoreUnknownKeys(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            a(jsonBuilder);
            return Unit.INSTANCE;
        }
    }

    public PHNApiImpl(@NotNull PHNModule pHNModule, @NotNull String str) {
        this.module = pHNModule;
        this.algorithmVersion = str;
    }

    @Override // com.huami.bluetooth.profile.channel.module.sport.PHNApi
    @NotNull
    /* JADX INFO: renamed from: algorithmVersion, reason: from getter */
    public String getAlgorithmVersion() {
        return this.algorithmVersion;
    }

    @NotNull
    public final String getAlgorithmVersion() {
        return this.algorithmVersion;
    }

    @NotNull
    public final PHNModule getModule() {
        return this.module;
    }

    @Override // com.huami.bluetooth.profile.channel.module.sport.PHNApi
    @NotNull
    public PHNSummaryResult getSummaryResult() throws Exception {
        PHNSummaryResult pHNSummaryResult = (PHNSummaryResult) ModuleResultKt.peel(new PhnSummaryCodec().decode(this.module.sendRequest(new ModuleRequest(PHNCommand.GetWeekTrimpCommand.INSTANCE, IncreasePredict.INSTANCE, 0L, null, false, 28, null))));
        if (pHNSummaryResult != null) {
            return pHNSummaryResult;
        }
        throw new Exception("Read week trimp failed");
    }

    @Override // com.huami.bluetooth.profile.channel.module.sport.PHNApi
    @NotNull
    public ModuleResult<String> pullPHN() {
        return new PhnCodec().decode(this.module.sendRequest(new ModuleRequest(PHNCommand.PullPHNCommand.INSTANCE, IncreasePredict.INSTANCE, 0L, null, false, 28, null)));
    }

    @Override // com.huami.bluetooth.profile.channel.module.sport.PHNApi
    public boolean startPHN(@NotNull String phnJson, @NotNull List<Integer> restDay, long startTime) {
        Json json = this.json;
        PHNResultMessageDto pHNResultMessageDto = (PHNResultMessageDto) json.decodeFromString(SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(PHNResultMessageDto.class)), phnJson);
        Iterator<T> it2 = restDay.iterator();
        int iIntValue = 0;
        while (it2.hasNext()) {
            iIntValue |= 1 << ((Number) it2.next()).intValue();
        }
        PHNErrorCode pHNErrorCode = (PHNErrorCode) ModuleResultKt.peel(new CodeCodec().decode(this.module.sendRequest(new ModuleRequest(PHNCommand.StartPHNCommand.INSTANCE.withBytes(PHNModelKt.toPHNResultMessage(pHNResultMessageDto, (int) startTime, iIntValue).toByteArray()), IncreasePredict.INSTANCE, 0L, null, false, 28, null))));
        return pHNErrorCode != null && pHNErrorCode.getCode() == PHNErrorCode.SUCCESS.getCode();
    }

    @Override // com.huami.bluetooth.profile.channel.module.sport.PHNApi
    @NotNull
    public PHNErrorCode stopPHN() throws Exception {
        ModuleResult<PHNErrorCode> moduleResultDecode = new CodeCodec().decode(this.module.sendRequest(new ModuleRequest(PHNCommand.StopPHNCommand.INSTANCE, IncreasePredict.INSTANCE, 0L, null, false, 28, null)));
        PHNErrorCode pHNErrorCode = (PHNErrorCode) ModuleResultKt.peel(moduleResultDecode);
        if (pHNErrorCode != null) {
            return pHNErrorCode;
        }
        throw new Exception(String.valueOf(moduleResultDecode));
    }

    @Override // com.huami.bluetooth.profile.channel.module.sport.PHNApi
    @NotNull
    public PHNErrorCode updateRestDay(@NotNull List<Integer> restDay) throws Exception {
        Iterator<T> it2 = restDay.iterator();
        int iIntValue = 0;
        while (it2.hasNext()) {
            iIntValue |= 1 << ((Number) it2.next()).intValue();
        }
        ModuleResult<PHNErrorCode> moduleResultDecode = new CodeCodec().decode(this.module.sendRequest(new ModuleRequest(PHNCommand.UpdateRestDayCommand.INSTANCE.withByte(iIntValue), IncreasePredict.INSTANCE, 0L, null, false, 28, null)));
        PHNErrorCode pHNErrorCode = (PHNErrorCode) ModuleResultKt.peel(moduleResultDecode);
        if (pHNErrorCode != null) {
            return pHNErrorCode;
        }
        throw new Exception(String.valueOf(moduleResultDecode));
    }
}
