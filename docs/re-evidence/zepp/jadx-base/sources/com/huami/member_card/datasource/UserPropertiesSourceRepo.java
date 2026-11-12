package com.huami.member_card.datasource;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCard;
import com.huami.member_card.MemberCardProperties;
import com.huami.member_card.bean.MemberCardJson;
import com.huami.member_card.bean.MemberCardProperty;
import com.huami.member_card.bean.MemberCardPropertyKt;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.service.entity.remote.PushResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u001d\u0010\u0014\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/member_card/datasource/UserPropertiesSourceRepo;", "Lcom/huami/member_card/datasource/DataSourceRepo;", "", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", "c", "memberCards", "", GoogleApiAvailabilityLight.a, "memberCard", "addMemberCard", "deleteMemberCard", "", "oldNameID", "modifyMemberCard", "issuedMemberCards", "queryAllMemberCards", "Lcom/google/gson/Gson;", "a", "Lkotlin/Lazy;", "()Lcom/google/gson/Gson;", "gson", "b", "()Ljava/util/List;", "<init>", "()V", "Companion", "member_card_release"}, k = 1, mv = {1, 5, 1})
public final class UserPropertiesSourceRepo implements DataSourceRepo {

    @NotNull
    private static final String b = "UserPropertiesSourceRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/google/gson/Gson;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Gson> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Gson invoke() {
            return new Gson();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    private final Gson a() {
        return (Gson) this.gson.getValue();
    }

    private final List<MemberCard> b() {
        return c();
    }

    private final synchronized List<MemberCard> c() {
        List<MemberCard> listEmptyList;
        String str = MemberCardProperties.INSTANCE.getUserMemberProperties().get();
        if (str == null) {
            str = "";
        }
        try {
            List<MemberCardProperty> memberCards = ((MemberCardJson) a().fromJson(str, MemberCardJson.class)).getMemberCards();
            listEmptyList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(memberCards, 10));
            Iterator<T> it2 = memberCards.iterator();
            while (it2.hasNext()) {
                listEmptyList.add(MemberCardPropertyKt.toMemberCard((MemberCardProperty) it2.next()));
            }
        } catch (Exception e) {
            HMLog.info(b, new a(e));
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return listEmptyList;
    }

    @WorkerThread
    private final boolean d(List<MemberCard> memberCards) {
        try {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(memberCards, 10));
            Iterator<T> it2 = memberCards.iterator();
            while (it2.hasNext()) {
                arrayList.add(MemberCardPropertyKt.toMemberCardProperty((MemberCard) it2.next()));
            }
            String json = a().toJson(new MemberCardJson(arrayList));
            MemberCardProperties memberCardProperties = MemberCardProperties.INSTANCE;
            memberCardProperties.getUserMemberProperties().set(json);
            return memberCardProperties.getUserMemberProperties().push().getBlocking() instanceof PushResult.Success;
        } catch (Exception e) {
            HMLog.info(b, new c(e));
            return false;
        }
    }

    @Override // com.huami.member_card.datasource.DataSourceRepo
    public boolean addMemberCard(@NotNull MemberCard memberCard) {
        List<MemberCard> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) b());
        mutableList.add(0, memberCard);
        return d(mutableList);
    }

    @Override // com.huami.member_card.datasource.DataSourceRepo
    public boolean deleteMemberCard(@NotNull MemberCard memberCard) {
        Iterator<MemberCard> it2 = b().iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(it2.next().getNameID(), memberCard.getNameID())) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (!(numValueOf.intValue() != -1)) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return false;
        }
        int iIntValue = numValueOf.intValue();
        List<MemberCard> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) b());
        mutableList.remove(iIntValue);
        return Boolean.valueOf(d(mutableList)).booleanValue();
    }

    @Override // com.huami.member_card.datasource.DataSourceRepo
    public boolean issuedMemberCards(@NotNull List<MemberCard> memberCards) {
        return d(memberCards);
    }

    @Override // com.huami.member_card.datasource.DataSourceRepo
    public boolean modifyMemberCard(@NotNull String oldNameID, @NotNull MemberCard memberCard) {
        Iterator<MemberCard> it2 = b().iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(it2.next().getNameID(), oldNameID)) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (!(numValueOf.intValue() != -1)) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return false;
        }
        int iIntValue = numValueOf.intValue();
        List<MemberCard> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) b());
        mutableList.set(iIntValue, memberCard);
        return Boolean.valueOf(d(mutableList)).booleanValue();
    }

    @Override // com.huami.member_card.datasource.DataSourceRepo
    @NotNull
    public List<MemberCard> queryAllMemberCards() {
        return c();
    }
}
