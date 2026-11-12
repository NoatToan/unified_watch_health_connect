package com.huami.jac.repo.event;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.nfc.web.NfcDevice;
import com.huami.watch.notification.TransportUri;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010\u000b\u001a\u00020\n2=\u0010\t\u001a9\u0012/\u0012-\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/jac/repo/event/JacEvent;", "Lcom/huami/jac/repo/event/JacEventApi;", "Lkotlin/Function1;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Lkotlin/ParameterName;", "name", com.google.android.exoplayer2.text.ttml.b.r, TransportUri.ACTION_BLOCK, "", "a", "enter", "detailToFaq", "detailToDelete", "detailToAdd", "detailToQuery", "detailToCreate", "installVCardAndKeyCardSuccess", "error", "installVCardAndKeyCardFail", "installKeyCardSuccess", "installKeyCardFail", "deleteCardSuccess", "deleteCardFail", "Lcom/huami/nfc/web/NfcDevice;", "Lcom/huami/nfc/web/NfcDevice;", "nfcDevice", "<init>", "(Lcom/huami/nfc/web/NfcDevice;)V", "jac-repo_release"}, k = 1, mv = {1, 5, 1})
public final class JacEvent implements JacEventApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final NfcDevice nfcDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<HashMap<String, String>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull HashMap<String, String> map) {
            map.put("ErrorMsg", this.a);
            return JacEventId.Jac_DELETE_VCARD_AND_KEYCARD_FAIL;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<HashMap<String, String>, String> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull HashMap<String, String> map) {
            return JacEventId.Jac_DELETE_VCARD_AND_KEYCARD_SUCCESS;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<HashMap<String, String>, String> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull HashMap<String, String> map) {
            map.put(JacParamKey.Jac_DETAIL_OPERATION, "添加钥匙");
            return JacEventId.Jac_DETAIL_OUT;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<HashMap<String, String>, String> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull HashMap<String, String> map) {
            map.put(JacParamKey.Jac_DETAIL_OPERATION, "创建钥匙");
            return JacEventId.Jac_DETAIL_OUT;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<HashMap<String, String>, String> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull HashMap<String, String> map) {
            map.put(JacParamKey.Jac_DETAIL_OPERATION, "移除卡片");
            return JacEventId.Jac_DETAIL_OUT;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<HashMap<String, String>, String> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull HashMap<String, String> map) {
            map.put(JacParamKey.Jac_DETAIL_OPERATION, "使用帮助");
            return JacEventId.Jac_DETAIL_OUT;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<HashMap<String, String>, String> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull HashMap<String, String> map) {
            map.put(JacParamKey.Jac_DETAIL_OPERATION, "查询");
            return JacEventId.Jac_DETAIL_OUT;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<HashMap<String, String>, String> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull HashMap<String, String> map) {
            return JacEventId.Jac_CLICKNUM;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<HashMap<String, String>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull HashMap<String, String> map) {
            map.put("ErrorMsg", this.a);
            return "NFC_Jac_AddCard_Failure";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<HashMap<String, String>, String> {
        public static final j a = new j();

        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull HashMap<String, String> map) {
            return "NFC_Jac_AddCard_Success";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<HashMap<String, String>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull HashMap<String, String> map) {
            map.put("ErrorMsg", this.a);
            return "NFC_Jac_AddCard_Failure";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<HashMap<String, String>, String> {
        public static final l a = new l();

        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull HashMap<String, String> map) {
            return "NFC_Jac_AddCard_Success";
        }
    }

    public JacEvent(@NotNull NfcDevice nfcDevice) {
        this.nfcDevice = nfcDevice;
    }

    private final void a(Function1<? super HashMap<String, String>, String> block) {
        HashMap map = new HashMap();
        map.put("DeviceSource", this.nfcDevice.getDeviceModel().getModel());
        Analytics.recordEvent(new CountEventBuilder(block.invoke(map)).putExtras(map));
    }

    @Override // com.huami.jac.repo.event.JacEventApi
    public void deleteCardFail(@NotNull String error) {
        a(new a(error));
    }

    @Override // com.huami.jac.repo.event.JacEventApi
    public void deleteCardSuccess() {
        a(b.a);
    }

    @Override // com.huami.jac.repo.event.JacEventApi
    public void detailToAdd() {
        a(c.a);
    }

    @Override // com.huami.jac.repo.event.JacEventApi
    public void detailToCreate() {
        a(d.a);
    }

    @Override // com.huami.jac.repo.event.JacEventApi
    public void detailToDelete() {
        a(e.a);
    }

    @Override // com.huami.jac.repo.event.JacEventApi
    public void detailToFaq() {
        a(f.a);
    }

    @Override // com.huami.jac.repo.event.JacEventApi
    public void detailToQuery() {
        a(g.a);
    }

    @Override // com.huami.jac.repo.event.JacEventApi
    public void enter() {
        a(h.a);
    }

    @Override // com.huami.jac.repo.event.JacEventApi
    public void installKeyCardFail(@NotNull String error) {
        a(new i(error));
    }

    @Override // com.huami.jac.repo.event.JacEventApi
    public void installKeyCardSuccess() {
        a(j.a);
    }

    @Override // com.huami.jac.repo.event.JacEventApi
    public void installVCardAndKeyCardFail(@NotNull String error) {
        a(new k(error));
    }

    @Override // com.huami.jac.repo.event.JacEventApi
    public void installVCardAndKeyCardSuccess() {
        a(l.a);
    }
}
