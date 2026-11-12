package com.huami.bluetooth.profile.channel.module.member_card.impl;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.base.BaseApiImpl;
import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCard;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCardApi;
import com.huami.bluetooth.profile.channel.module.member_card.Version;
import com.huami.bluetooth.profile.channel.module.member_card.impl.codec.MemberCardsCodec;
import com.huami.bluetooth.profile.channel.module.member_card.impl.codec.VersionCodec;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import com.tekartik.sqflite.Constant;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ByteSpreadBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J8\u0010\r\u001a\u00020\u0007\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\f\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0014J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0011H\u0016J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u00112\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u00112\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u001e\u0010\"\u001a\u00020\u00072\u0014\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00140 H\u0016R\u001c\u0010'\u001a\u00020\u001a8\u0014@\u0014X\u0094D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010-\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u00101\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b/\u00100R&\u00103\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00102¨\u00068"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/base/BaseApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCardApi;", Constant.h, "", "data", "", "i", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "codec", "h", "rawData", "parseCommand", "handleCommand", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lcom/huami/bluetooth/profile/channel/module/member_card/Version;", "queryVersion", "", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", HealthLabelAnalyticsKt.TAG_HOME_LABEL_COUNT, "", "issuedAllMemberCard", "queryAllMemberCard", "", "oldNameId", "memberCard", "modifyMemberCard", "addMemberCard", "deleteMemberCard", "Lkotlin/Function0;", "function", "requestMemberCard", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/codec/VersionCodec;", "e", "Lkotlin/Lazy;", "g", "()Lcom/huami/bluetooth/profile/channel/module/member_card/impl/codec/VersionCodec;", "versionCodec", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/codec/MemberCardsCodec;", "f", "()Lcom/huami/bluetooth/profile/channel/module/member_card/impl/codec/MemberCardsCodec;", "memberCardsCodec", "Lkotlin/jvm/functions/Function0;", "func", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "module", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/BaseModule;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class MemberCardApiImpl extends BaseApiImpl<MemberCardCommand> implements MemberCardApi {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy versionCodec;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy memberCardsCodec;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Function0<? extends List<MemberCard>> func;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/codec/MemberCardsCodec;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MemberCardsCodec> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MemberCardsCodec invoke() {
            return new MemberCardsCodec();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/codec/VersionCodec;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<VersionCodec> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VersionCodec invoke() {
            return new VersionCodec();
        }
    }

    public MemberCardApiImpl(@NotNull BaseModule baseModule) {
        super(baseModule);
        this.tag = "MemberCardApiImpl";
        this.versionCodec = LazyKt__LazyJVMKt.lazy(b.a);
        this.memberCardsCodec = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private final MemberCardsCodec f() {
        return (MemberCardsCodec) this.memberCardsCodec.getValue();
    }

    private final VersionCodec g() {
        return (VersionCodec) this.versionCodec.getValue();
    }

    private final <T> void h(MemberCardCommand cmd, byte[] data, Codec<? extends T, byte[]> codec) {
        int int$default = ByteUtilsKt.toInt$default(data, 1, 0, 2, null);
        if (int$default != 1) {
            BaseApiImpl.dispatchError$default(this, cmd, int$default, null, 4, null);
        } else {
            dispatchResponse(cmd, codec.decode(ArraysKt___ArraysJvmKt.copyOfRange(data, 1, data.length)));
        }
    }

    private final void i(MemberCardCommand cmd, byte[] data) {
        int int$default = ByteUtilsKt.toInt$default(data, 1, 0, 2, null);
        if (int$default != 1) {
            BaseApiImpl.dispatchError$default(this, cmd, int$default, null, 4, null);
        } else {
            dispatchResponse(cmd, Boolean.TRUE);
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.member_card.MemberCardApi
    @NotNull
    public Response<Boolean> addMemberCard(@NotNull MemberCard memberCard) {
        return BaseApiImpl.sendRequest$default(this, MemberCardCommand.AddMemberCard.INSTANCE, memberCard.getByteArray(), 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.member_card.MemberCardApi
    @NotNull
    public Response<Boolean> deleteMemberCard(@NotNull MemberCard memberCard) {
        MemberCardCommand.DeleteMemberCard deleteMemberCard = MemberCardCommand.DeleteMemberCard.INSTANCE;
        ByteSpreadBuilder byteSpreadBuilder = new ByteSpreadBuilder(2);
        String nameID = memberCard.getNameID();
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(nameID, "null cannot be cast to non-null type java.lang.String");
        byteSpreadBuilder.addSpread(nameID.getBytes(charset));
        byteSpreadBuilder.add((byte) 0);
        return BaseApiImpl.sendRequest$default(this, deleteMemberCard, byteSpreadBuilder.toArray(), 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.BaseApiImpl
    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // com.huami.bluetooth.profile.channel.module.member_card.MemberCardApi
    @NotNull
    public Response<Boolean> issuedAllMemberCard(@NotNull List<MemberCard> cards) {
        MemberCardCommand.IssuedMemberCards issuedMemberCards = MemberCardCommand.IssuedMemberCards.INSTANCE;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Byte.valueOf((byte) cards.size()));
        Iterator<T> it2 = cards.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(ArraysKt___ArraysKt.toList(((MemberCard) it2.next()).getByteArray()));
        }
        Unit unit = Unit.INSTANCE;
        return BaseApiImpl.sendRequest$default(this, issuedMemberCards, CollectionsKt___CollectionsKt.toByteArray(arrayList), 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.member_card.MemberCardApi
    @NotNull
    public Response<Boolean> modifyMemberCard(@NotNull String oldNameId, @NotNull MemberCard memberCard) {
        MemberCardCommand.ModifyMemberCard modifyMemberCard = MemberCardCommand.ModifyMemberCard.INSTANCE;
        ByteSpreadBuilder byteSpreadBuilder = new ByteSpreadBuilder(3);
        byteSpreadBuilder.addSpread(oldNameId.getBytes(Charsets.UTF_8));
        byteSpreadBuilder.add((byte) 0);
        byteSpreadBuilder.addSpread(memberCard.getByteArray());
        return BaseApiImpl.sendRequest$default(this, modifyMemberCard, byteSpreadBuilder.toArray(), 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.member_card.MemberCardApi
    @NotNull
    public Response<List<MemberCard>> queryAllMemberCard() {
        return BaseApiImpl.sendRequest$default(this, MemberCardCommand.QueryMemberCards.INSTANCE, null, 0L, 6, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.member_card.MemberCardApi
    @NotNull
    public Response<Version> queryVersion() {
        return BaseApiImpl.sendRequest$default(this, MemberCardCommand.QueryVersion.INSTANCE, null, 0L, 6, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.member_card.MemberCardApi
    public void requestMemberCard(@NotNull Function0<? extends List<MemberCard>> function) {
        this.func = function;
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.BaseApiImpl
    public void handleCommand(@NotNull MemberCardCommand cmd, @NotNull byte[] data) {
        List<MemberCard> listInvoke;
        if (Intrinsics.areEqual(cmd, MemberCardCommand.QueryVersionResult.INSTANCE)) {
            h(MemberCardCommand.QueryVersion.INSTANCE, data, g());
            return;
        }
        if (Intrinsics.areEqual(cmd, MemberCardCommand.QueryMemberCardsResult.INSTANCE)) {
            h(MemberCardCommand.QueryMemberCards.INSTANCE, data, f());
            return;
        }
        if (Intrinsics.areEqual(cmd, MemberCardCommand.AddMemberCardResult.INSTANCE)) {
            i(MemberCardCommand.AddMemberCard.INSTANCE, data);
            return;
        }
        if (Intrinsics.areEqual(cmd, MemberCardCommand.DeleteMemberCardResult.INSTANCE)) {
            i(MemberCardCommand.DeleteMemberCard.INSTANCE, data);
            return;
        }
        if (Intrinsics.areEqual(cmd, MemberCardCommand.IssuedMemberCardsResult.INSTANCE)) {
            i(MemberCardCommand.IssuedMemberCards.INSTANCE, data);
            return;
        }
        if (Intrinsics.areEqual(cmd, MemberCardCommand.ModifyMemberCardResult.INSTANCE)) {
            i(MemberCardCommand.ModifyMemberCard.INSTANCE, data);
            return;
        }
        if (!Intrinsics.areEqual(cmd, MemberCardCommand.DeviceRequestMemberCards.INSTANCE)) {
            throw new RuntimeException("Invalid device command！");
        }
        Function0<? extends List<MemberCard>> function0 = this.func;
        if (function0 == null || (listInvoke = function0.invoke()) == null) {
            return;
        }
        issuedAllMemberCard(listInvoke);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.BaseApiImpl
    @NotNull
    public MemberCardCommand parseCommand(@NotNull byte[] rawData) {
        return MemberCardCommand.INSTANCE.toCommand(rawData);
    }
}
