package com.huami.bluetooth.profile.channel.module.member_card.impl;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\u000e\u0007\b\u0006\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\r\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "value", "<init>", "(I)V", "Companion", "AddMemberCard", "AddMemberCardResult", "DeleteMemberCard", "DeleteMemberCardResult", "DeviceRequestMemberCards", "IssuedMemberCards", "IssuedMemberCardsResult", "ModifyMemberCard", "ModifyMemberCardResult", "QueryMemberCards", "QueryMemberCardsResult", "QueryVersion", "QueryVersionResult", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$QueryVersion;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$QueryVersionResult;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$IssuedMemberCards;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$IssuedMemberCardsResult;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$QueryMemberCards;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$QueryMemberCardsResult;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$ModifyMemberCard;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$ModifyMemberCardResult;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$AddMemberCard;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$AddMemberCardResult;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$DeleteMemberCard;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$DeleteMemberCardResult;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$DeviceRequestMemberCards;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class MemberCardCommand extends Request.Command {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$AddMemberCard;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class AddMemberCard extends MemberCardCommand {

        @NotNull
        public static final AddMemberCard INSTANCE = new AddMemberCard();

        private AddMemberCard() {
            super(9, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$AddMemberCardResult;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class AddMemberCardResult extends MemberCardCommand {

        @NotNull
        public static final AddMemberCardResult INSTANCE = new AddMemberCardResult();

        private AddMemberCardResult() {
            super(10, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$Companion;", "", "", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "toCommand", "", "CMD_BYTES", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MemberCardCommand toCommand(@NotNull byte[] bArr) {
            Object next;
            byte[] bArr2;
            Iterator it2 = CollectionsKt__CollectionsKt.listOf((Object[]) new MemberCardCommand[]{QueryVersion.INSTANCE, QueryVersionResult.INSTANCE, IssuedMemberCards.INSTANCE, IssuedMemberCardsResult.INSTANCE, QueryMemberCards.INSTANCE, QueryMemberCardsResult.INSTANCE, ModifyMemberCard.INSTANCE, ModifyMemberCardResult.INSTANCE, AddMemberCard.INSTANCE, AddMemberCardResult.INSTANCE, DeleteMemberCard.INSTANCE, DeleteMemberCardResult.INSTANCE, DeviceRequestMemberCards.INSTANCE}).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                bArr2 = ((MemberCardCommand) next).getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
            } while (!(bArr.length >= bArr2.length && Arrays.equals(bArr2, Arrays.copyOf(bArr, bArr2.length))));
            MemberCardCommand memberCardCommand = (MemberCardCommand) next;
            if (memberCardCommand != null) {
                return memberCardCommand;
            }
            throw new RuntimeException("Unknown command!");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$DeleteMemberCard;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeleteMemberCard extends MemberCardCommand {

        @NotNull
        public static final DeleteMemberCard INSTANCE = new DeleteMemberCard();

        private DeleteMemberCard() {
            super(11, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$DeleteMemberCardResult;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeleteMemberCardResult extends MemberCardCommand {

        @NotNull
        public static final DeleteMemberCardResult INSTANCE = new DeleteMemberCardResult();

        private DeleteMemberCardResult() {
            super(12, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$DeviceRequestMemberCards;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeviceRequestMemberCards extends MemberCardCommand {

        @NotNull
        public static final DeviceRequestMemberCards INSTANCE = new DeviceRequestMemberCards();

        private DeviceRequestMemberCards() {
            super(13, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$IssuedMemberCards;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class IssuedMemberCards extends MemberCardCommand {

        @NotNull
        public static final IssuedMemberCards INSTANCE = new IssuedMemberCards();

        private IssuedMemberCards() {
            super(3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$IssuedMemberCardsResult;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class IssuedMemberCardsResult extends MemberCardCommand {

        @NotNull
        public static final IssuedMemberCardsResult INSTANCE = new IssuedMemberCardsResult();

        private IssuedMemberCardsResult() {
            super(4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$ModifyMemberCard;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ModifyMemberCard extends MemberCardCommand {

        @NotNull
        public static final ModifyMemberCard INSTANCE = new ModifyMemberCard();

        private ModifyMemberCard() {
            super(7, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$ModifyMemberCardResult;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ModifyMemberCardResult extends MemberCardCommand {

        @NotNull
        public static final ModifyMemberCardResult INSTANCE = new ModifyMemberCardResult();

        private ModifyMemberCardResult() {
            super(8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$QueryMemberCards;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryMemberCards extends MemberCardCommand {

        @NotNull
        public static final QueryMemberCards INSTANCE = new QueryMemberCards();

        private QueryMemberCards() {
            super(5, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$QueryMemberCardsResult;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryMemberCardsResult extends MemberCardCommand {

        @NotNull
        public static final QueryMemberCardsResult INSTANCE = new QueryMemberCardsResult();

        private QueryMemberCardsResult() {
            super(6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$QueryVersion;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersion extends MemberCardCommand {

        @NotNull
        public static final QueryVersion INSTANCE = new QueryVersion();

        private QueryVersion() {
            super(1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand$QueryVersionResult;", "Lcom/huami/bluetooth/profile/channel/module/member_card/impl/MemberCardCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersionResult extends MemberCardCommand {

        @NotNull
        public static final QueryVersionResult INSTANCE = new QueryVersionResult();

        private QueryVersionResult() {
            super(2, null);
        }
    }

    private MemberCardCommand(int i) {
        super(ByteUtilsKt.toByteArray(i, 1));
    }

    public /* synthetic */ MemberCardCommand(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
