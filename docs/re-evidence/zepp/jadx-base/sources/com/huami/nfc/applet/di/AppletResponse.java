package com.huami.nfc.applet.di;

import androidx.exifinterface.media.ExifInterface;
import com.huami.nfc.applet.AppletApi;
import com.huami.nfc.applet.AppletState;
import com.huami.nfc.applet.BusCardExtensions;
import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.applet.CommonApplet;
import com.huami.nfc.applet.TrafficCardApplet;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.applet.api.SeAppletApi;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b+\u0010,J.\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0016J\u001e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0016J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00160\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010*\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b$\u0010)¨\u0006-"}, d2 = {"Lcom/huami/nfc/applet/di/AppletResponse;", "Lcom/huami/nfc/applet/api/SeAppletApi;", ExifInterface.GPS_DIRECTION_TRUE, "", "message", "Lkotlin/Function0;", "data", "Lcom/huami/nfc/base/PayResponse;", "b", "getCplc", "appCode", "", "getBalance", "", "activateCard", "aid", "setDefaultCard", "setDefaultCardBySearchSe", "setDefaultCardBySeResponse", "deactivateCard", "Lcom/huami/nfc/applet/AppletState;", "getAppletState", "", "aids", "getAppletsState", "aidList", "getDefaultCard", "getDefaultCardAid", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "Lcom/huami/nfc/applet/TransEntity;", "getTransRecord", "", "isInstalled", "getLingNanTongCityCode", "Lcom/huami/nfc/base/INfcChannel;", "a", "Lcom/huami/nfc/base/INfcChannel;", "channel", "Lcom/huami/nfc/applet/AppletApi;", "Lkotlin/Lazy;", "()Lcom/huami/nfc/applet/AppletApi;", "appletApi", "<init>", "(Lcom/huami/nfc/base/INfcChannel;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class AppletResponse implements SeAppletApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel channel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy appletApi = LazyKt__LazyJVMKt.lazy(new c());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Boolean getA() {
            return Boolean.valueOf(AppletResponse.this.a().activateCard(BusCardExtensions.fromAppCode(this.b).getAid(), true));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends Boolean>, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull PayResponse<Boolean> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends Boolean> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/applet/AppletApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<AppletApi> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AppletApi getA() {
            return new AppletApi(new TrafficCardApplet(AppletResponse.this.channel), new CommonApplet(AppletResponse.this.channel));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Boolean getA() {
            return Boolean.valueOf(AppletResponse.this.a().activateCard(this.b, false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PayResponse<? extends Boolean>, Unit> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public final void a(@NotNull PayResponse<Boolean> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends Boolean> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/applet/AppletState;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<AppletState> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AppletState getA() {
            return AppletResponse.this.a().getAppletState(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/nfc/applet/AppletState;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<List<AppletState>> {
        public final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<String> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<AppletState> getA() {
            return AppletResponse.this.a().getAppletsState(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Integer> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer getA() {
            return Integer.valueOf(AppletResponse.this.a().getBalance(BusCardExtensions.fromAppCode(this.b).getAid()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/applet/CardInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<CardInfo> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CardInfo getA() {
            return AppletResponse.this.a().getCardInfo(BusCardExtensions.fromAppCode(this.b).getAid());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return AppletResponse.this.a().getCplc();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/applet/AppletState;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<AppletState> {
        public final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List<String> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AppletState getA() {
            Object next;
            Iterator<T> it2 = AppletResponse.this.a().getAppletsState(this.b).iterator();
            while (it2.hasNext()) {
                next = it2.next();
                if (((AppletState) next).isActive()) {
                    return (AppletState) next;
                }
            }
            next = null;
            return (AppletState) next;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List<String> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            Object next;
            String aid;
            Iterator<T> it2 = AppletResponse.this.a().getAppletsState(this.b).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!((AppletState) next).isActive());
            AppletState appletState = (AppletState) next;
            return (appletState == null || (aid = appletState.getAid()) == null) ? "" : aid;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return AppletResponse.this.a().getLingNanTongCityCode();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/nfc/applet/TransEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<List<TransEntity>> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<TransEntity> getA() {
            return AppletResponse.this.a().getTransRecord(BusCardExtensions.fromAppCode(this.b).getAid());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(0);
            this.b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Boolean getA() {
            return Boolean.valueOf(AppletResponse.this.a().isInstalled(BusCardExtensions.fromAppCode(this.b).getAid()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(0);
            this.b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Boolean getA() {
            return Boolean.valueOf(AppletResponse.this.a().activateCard(this.b, true));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function1<PayResponse<? extends Boolean>, Unit> {
        public static final q a = new q();

        public q() {
            super(1);
        }

        public final void a(@NotNull PayResponse<Boolean> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends Boolean> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str) {
            super(0);
            this.b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Boolean getA() {
            return Boolean.valueOf(AppletResponse.this.a().activateCardByResponse(this.b, true));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function1<PayResponse<? extends Boolean>, Unit> {
        public static final s a = new s();

        public s() {
            super(1);
        }

        public final void a(@NotNull PayResponse<Boolean> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends Boolean> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str) {
            super(0);
            this.b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Boolean getA() {
            return Boolean.valueOf(AppletResponse.this.a().activateCardBySearchSe(this.b, true));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function1<PayResponse<? extends Boolean>, Unit> {
        public static final u a = new u();

        public u() {
            super(1);
        }

        public final void a(@NotNull PayResponse<Boolean> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends Boolean> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    public AppletResponse(@NotNull INfcChannel iNfcChannel) {
        this.channel = iNfcChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppletApi a() {
        return (AppletApi) this.appletApi.getValue();
    }

    private final <T> PayResponse<T> b(String message, Function0<? extends T> data) {
        return new PayResponse<>("0000", message, data.getA());
    }

    public static /* synthetic */ PayResponse c(AppletResponse appletResponse, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "applet api return success";
        }
        return appletResponse.b(str, function0);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> activateCard(@NotNull String appCode) {
        return PayResponseKt.map(c(this, null, new a(appCode), 1, null), b.a);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> deactivateCard(@NotNull String aid) {
        return PayResponseKt.map(c(this, null, new d(aid), 1, null), e.a);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<AppletState> getAppletState(@NotNull String aid) {
        return c(this, null, new f(aid), 1, null);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<List<AppletState>> getAppletsState(@NotNull List<String> aids) {
        return c(this, null, new g(aids), 1, null);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Integer> getBalance(@NotNull String appCode) {
        return c(this, null, new h(appCode), 1, null);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<CardInfo> getCardInfo(@NotNull String appCode) {
        return c(this, null, new i(appCode), 1, null);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<String> getCplc() {
        return c(this, null, new j(), 1, null);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<AppletState> getDefaultCard(@NotNull List<String> aidList) {
        return c(this, null, new k(aidList), 1, null);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<String> getDefaultCardAid(@NotNull List<String> aidList) {
        return c(this, null, new l(aidList), 1, null);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<String> getLingNanTongCityCode() {
        return c(this, null, new m(), 1, null);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<List<TransEntity>> getTransRecord(@NotNull String appCode) {
        return c(this, null, new n(appCode), 1, null);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Boolean> isInstalled(@NotNull String appCode) {
        return c(this, null, new o(appCode), 1, null);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> setDefaultCard(@NotNull String aid) {
        return PayResponseKt.map(c(this, null, new p(aid), 1, null), q.a);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> setDefaultCardBySeResponse(@NotNull String aid) {
        return PayResponseKt.map(c(this, null, new r(aid), 1, null), s.a);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> setDefaultCardBySearchSe(@NotNull String aid) {
        return PayResponseKt.map(c(this, null, new t(aid), 1, null), u.a);
    }
}
