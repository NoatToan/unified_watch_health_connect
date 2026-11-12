package com.huami.member_card.datasource;

import androidx.annotation.WorkerThread;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCard;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCardModule;
import com.huami.bluetooth.profile.channel.module.member_card.Version;
import com.huami.member_card.koin.DeviceQualifier;
import com.huami.member_card.koin.inject.HmDeviceFactory;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0007J\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0019\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0018R\u001d\u0010\u001d\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/member_card/datasource/DataSourceManage;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/bluetooth/profile/channel/module/member_card/Version;", "queryProtocolVersion", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", "memberCard", "", "addMemberCard", "deleteMemberCard", "", "oldNameID", "modifyMemberCard", "", "memberCards", "issuedMemberCards", "isFromProperties", "queryAllMemberCards", "Lcom/huami/member_card/koin/inject/HmDeviceFactory;", "a", "Lkotlin/Lazy;", "b", "()Lcom/huami/member_card/koin/inject/HmDeviceFactory;", "hmDeviceFactory", "Lcom/huami/member_card/datasource/BluetoothSourceRepo;", "()Lcom/huami/member_card/datasource/BluetoothSourceRepo;", "bluetoothSourceRepo", "Lcom/huami/member_card/datasource/UserPropertiesSourceRepo;", "c", "()Lcom/huami/member_card/datasource/UserPropertiesSourceRepo;", "userProperties", "<init>", "()V", "member_card_release"}, k = 1, mv = {1, 5, 1})
public final class DataSourceManage implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmDeviceFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy bluetoothSourceRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy userProperties;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/member_card/datasource/UserPropertiesSourceRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<UserPropertiesSourceRepo> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserPropertiesSourceRepo invoke() {
            return new UserPropertiesSourceRepo();
        }
    }

    public DataSourceManage() {
        final StringQualifier stringQualifierNamed = QualifierKt.named(DeviceQualifier.MEMBERSHIP_CARD_QUALIFIER);
        final Function0 function0 = null;
        this.hmDeviceFactory = LazyKt__LazyJVMKt.lazy(KoinPlatformTools.INSTANCE.defaultLazyMode(), (Function0) new Function0<HmDeviceFactory>() { // from class: com.huami.member_card.datasource.DataSourceManage$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.member_card.koin.inject.HmDeviceFactory, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HmDeviceFactory invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(HmDeviceFactory.class), stringQualifierNamed, function0);
            }
        });
        this.bluetoothSourceRepo = LazyKt__LazyJVMKt.lazy(new Function0<BluetoothSourceRepo>() { // from class: com.huami.member_card.datasource.DataSourceManage$bluetoothSourceRepo$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BluetoothSourceRepo invoke() {
                final DataSourceManage dataSourceManage = this.a;
                return new BluetoothSourceRepo(new Function0<MemberCardModule>() { // from class: com.huami.member_card.datasource.DataSourceManage$bluetoothSourceRepo$2.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public MemberCardModule invoke() {
                        HMBaseDevice device = dataSourceManage.b().getDevice();
                        if (device == null) {
                            return null;
                        }
                        return (MemberCardModule) device.getChannelModule(MemberCardModule.class);
                    }
                });
            }
        });
        this.userProperties = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private final BluetoothSourceRepo a() {
        return (BluetoothSourceRepo) this.bluetoothSourceRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HmDeviceFactory b() {
        return (HmDeviceFactory) this.hmDeviceFactory.getValue();
    }

    private final UserPropertiesSourceRepo c() {
        return (UserPropertiesSourceRepo) this.userProperties.getValue();
    }

    @WorkerThread
    public final boolean addMemberCard(@NotNull MemberCard memberCard) {
        boolean zAddMemberCard = a().addMemberCard(memberCard);
        c().addMemberCard(memberCard);
        return zAddMemberCard;
    }

    @WorkerThread
    public final boolean deleteMemberCard(@NotNull MemberCard memberCard) {
        boolean zDeleteMemberCard = a().deleteMemberCard(memberCard);
        c().deleteMemberCard(memberCard);
        return zDeleteMemberCard;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @WorkerThread
    public final boolean issuedMemberCards(@NotNull List<MemberCard> memberCards) {
        boolean zIssuedMemberCards = a().issuedMemberCards(memberCards);
        c().issuedMemberCards(memberCards);
        return zIssuedMemberCards;
    }

    @WorkerThread
    public final boolean modifyMemberCard(@NotNull String oldNameID, @NotNull MemberCard memberCard) {
        boolean zModifyMemberCard = a().modifyMemberCard(oldNameID, memberCard);
        c().modifyMemberCard(oldNameID, memberCard);
        return zModifyMemberCard;
    }

    @WorkerThread
    @Nullable
    public final List<MemberCard> queryAllMemberCards(boolean isFromProperties) {
        if (isFromProperties) {
            return c().queryAllMemberCards();
        }
        List<MemberCard> listQueryAllMemberCards = a().queryAllMemberCards();
        if (listQueryAllMemberCards == null) {
            return null;
        }
        c().issuedMemberCards(listQueryAllMemberCards);
        return listQueryAllMemberCards;
    }

    @WorkerThread
    @Nullable
    public final Version queryProtocolVersion() {
        return a().queryProtocolVersion();
    }
}
