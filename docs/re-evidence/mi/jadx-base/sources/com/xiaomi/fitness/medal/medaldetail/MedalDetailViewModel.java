package com.xiaomi.fitness.medal.medaldetail;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.medal.bean.MedalDetail;
import com.xiaomi.fitness.medal.bean.MedalDetailInfo;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.medaldetail.MedalDetailViewModel;
import com.xiaomi.fitness.medal.medallist.MedalModel;
import com.xiaomi.fitness.medal.request.MedalRequest;
import com.xiaomi.fitness.medal.request.MedalV2Request;
import com.xiaomi.fitness.net.response.ApiException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u0017J\u0016\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u001cJ\u001e\u0010#\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001cR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/medal/medaldetail/MedalDetailViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/medal/medallist/MedalModel;", "<init>", "()V", "mMedalRequest", "Lcom/xiaomi/fitness/medal/request/MedalRequest;", "getMMedalRequest", "()Lcom/xiaomi/fitness/medal/request/MedalRequest;", "setMMedalRequest", "(Lcom/xiaomi/fitness/medal/request/MedalRequest;)V", "mMedalV2Request", "Lcom/xiaomi/fitness/medal/request/MedalV2Request;", "getMMedalV2Request", "()Lcom/xiaomi/fitness/medal/request/MedalV2Request;", "setMMedalV2Request", "(Lcom/xiaomi/fitness/medal/request/MedalV2Request;)V", "medalDetailLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/medal/bean/MedalDetail;", "getMedalDetailLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getMedalDetail", "", "id", "", "getMedalDetailV2", "type", "", "wearMedalLiveData", "Lcom/xiaomi/fitness/medal/medaldetail/MedalDetailViewModel$WearMedal;", "getWearMedalLiveData", "getWearMedal", "unWearMedal", "medalType", "wearMedal", "icon", "Companion", "WearMedal", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MedalDetailViewModel extends BaseViewModel<MedalModel> {

    @NotNull
    public static final String TAG = "MedalDetailViewModel";
    public MedalRequest mMedalRequest;
    public MedalV2Request mMedalV2Request;

    @NotNull
    private final MutableLiveData<MedalDetail> medalDetailLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<WearMedal> wearMedalLiveData = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/medal/medaldetail/MedalDetailViewModel$WearMedal;", "", "id", "", "url", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/xiaomi/fitness/medal/medaldetail/MedalDetailViewModel$WearMedal;", "equals", "", "other", "hashCode", "", "toString", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WearMedal {

        @Nullable
        private final Long id;

        @Nullable
        private final String url;

        public WearMedal(@Nullable Long l, @Nullable String str) {
            this.id = l;
            this.url = str;
        }

        public static /* synthetic */ WearMedal copy$default(WearMedal wearMedal, Long l, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                l = wearMedal.id;
            }
            if ((i & 2) != 0) {
                str = wearMedal.url;
            }
            return wearMedal.copy(l, str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final WearMedal copy(@Nullable Long id, @Nullable String url) {
            return new WearMedal(id, url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WearMedal)) {
                return false;
            }
            WearMedal wearMedal = (WearMedal) other;
            return Intrinsics.areEqual(this.id, wearMedal.id) && Intrinsics.areEqual(this.url, wearMedal.url);
        }

        @Nullable
        public final Long getId() {
            return this.id;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            Long l = this.id;
            int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
            String str = this.url;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "WearMedal(id=" + this.id + ", url=" + this.url + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getMedalDetail$lambda$0(Ref.ObjectRef data, MedalDetailViewModel this$0, MedalDetail it) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        data.element = it;
        this$0.medalDetailLiveData.setValue(it);
        Logger.i("mMedalRequest it = " + it + ", data = " + data.element + ", detailList = " + this$0.medalDetailLiveData, new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalDetail$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("mMedalRequest it == " + it, new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getMedalDetailV2$lambda$2(Ref.ObjectRef data, MedalDetailViewModel this$0, MedalDetail it) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        data.element = it;
        this$0.medalDetailLiveData.setValue(it);
        Logger.i(this$0.getTAG(), "mMedalRequest it = " + it + ", data = " + data.element + ", detailList = " + this$0.medalDetailLiveData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalDetailV2$lambda$3(MedalDetailViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "mMedalRequest it == " + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWearMedal$lambda$4(MedalDetailViewModel this$0, long j, String url) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "url");
        this$0.wearMedalLiveData.postValue(new WearMedal(Long.valueOf(j), url));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWearMedal$lambda$5(MedalDetailViewModel this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.wearMedalLiveData.postValue(new WearMedal(null, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unWearMedal$lambda$6(long j, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unWearMedal$lambda$7(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wearMedal$lambda$8(long j, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wearMedal$lambda$9(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @NotNull
    public final MedalRequest getMMedalRequest() {
        MedalRequest medalRequest = this.mMedalRequest;
        if (medalRequest != null) {
            return medalRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mMedalRequest");
        return null;
    }

    @NotNull
    public final MedalV2Request getMMedalV2Request() {
        MedalV2Request medalV2Request = this.mMedalV2Request;
        if (medalV2Request != null) {
            return medalV2Request;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mMedalV2Request");
        return null;
    }

    public final void getMedalDetail(long id) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        getMMedalRequest().getUserDetailMedal(id, new Function1() { // from class: ncf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MedalDetailViewModel.getMedalDetail$lambda$0(objectRef, this, (MedalDetail) obj);
            }
        }, new Function1() { // from class: ocf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MedalDetailViewModel.getMedalDetail$lambda$1((ApiException) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<MedalDetail> getMedalDetailLiveData() {
        return this.medalDetailLiveData;
    }

    public final void getMedalDetailV2(long id, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        getMMedalV2Request().getUserDetailMedalV2(new MedalDetailInfo(id, type), new Function1() { // from class: lcf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MedalDetailViewModel.getMedalDetailV2$lambda$2(objectRef, this, (MedalDetail) obj);
            }
        }, new Function1() { // from class: mcf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MedalDetailViewModel.getMedalDetailV2$lambda$3(this.f26007a, (ApiException) obj);
            }
        });
    }

    public final void getWearMedal() {
        MedalManagerExtKt.getInstance(MedalManager.INSTANCE).getWearMedal(new Function2() { // from class: tcf
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MedalDetailViewModel.getWearMedal$lambda$4(this.f34564a, ((Long) obj).longValue(), (String) obj2);
            }
        }, new Function1() { // from class: ucf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MedalDetailViewModel.getWearMedal$lambda$5(this.f35618a, (String) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<WearMedal> getWearMedalLiveData() {
        return this.wearMedalLiveData;
    }

    public final void setMMedalRequest(@NotNull MedalRequest medalRequest) {
        Intrinsics.checkNotNullParameter(medalRequest, "<set-?>");
        this.mMedalRequest = medalRequest;
    }

    public final void setMMedalV2Request(@NotNull MedalV2Request medalV2Request) {
        Intrinsics.checkNotNullParameter(medalV2Request, "<set-?>");
        this.mMedalV2Request = medalV2Request;
    }

    public final void unWearMedal(long id, @NotNull String medalType) {
        Intrinsics.checkNotNullParameter(medalType, "medalType");
        MedalManagerExtKt.getInstance(MedalManager.INSTANCE).unWearMedal(id, medalType, new Function2() { // from class: pcf
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MedalDetailViewModel.unWearMedal$lambda$6(((Long) obj).longValue(), (String) obj2);
            }
        }, new Function1() { // from class: qcf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MedalDetailViewModel.unWearMedal$lambda$7((String) obj);
            }
        });
    }

    public final void wearMedal(long id, @NotNull String icon, @NotNull String medalType) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(medalType, "medalType");
        MedalManagerExtKt.getInstance(MedalManager.INSTANCE).wearMedal(id, icon, medalType, new Function2() { // from class: rcf
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MedalDetailViewModel.wearMedal$lambda$8(((Long) obj).longValue(), (String) obj2);
            }
        }, new Function1() { // from class: scf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MedalDetailViewModel.wearMedal$lambda$9((String) obj);
            }
        });
    }
}
