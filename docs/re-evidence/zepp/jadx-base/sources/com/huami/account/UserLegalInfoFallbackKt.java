package com.huami.account;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.bean.LegalInfoType;
import com.huami.account.service.model.Area;
import com.huami.account.service.proxy.KoinComponentAdapter;
import com.huami.account.ui.R;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.ui.legal.AgreementAreasActivity;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.r;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\u0016\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002\u001a\b\u0010\u000b\u001a\u00020\nH\u0002\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u001a\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u0002\u001a,\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007\u001a\u0016\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002\u001a\"\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00190\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\"\u001d\u0010\u001c\u001a\u00020\u00008F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0016\u0010\u001f\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e\"\u0016\u0010!\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001e\"\u0016\u0010#\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001e\"\u0016\u0010%\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001e\"\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001e\"$\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00000(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u001d\u0010.\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001b\u001a\u0004\b$\u0010-\"\u001d\u00100\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001b\u001a\u0004\b\"\u0010-\"\u001d\u00101\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b \u0010-\"/\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00190\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b/\u00102\"/\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00190\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u001b\u001a\u0004\b,\u00102\"/\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00190\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u001b\u001a\u0004\b)\u00102\"\u001d\u0010:\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001b\u001a\u0004\b&\u00109\"\u0017\u0010=\u001a\u00020\u000e*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"", "a", "Lcom/huami/account/bean/LegalInfoType;", "type", "flag", "", "setUseLocal", "isUseLocal", "Lorg/json/JSONObject;", "getAgreementLocalVersion", "Landroid/content/Context;", hl.k, "Lorg/json/JSONArray;", z.j, "", "areaValue", "getLocalAgreementTarget", "", "Lcom/huami/account/LocalAgreement;", "getLocalAgreementList", DbUtils.Const.Table.CONTEXT, "Lcom/huami/account/AgreementFallbackNavigator;", "navigator", "goAgreementPageWithFallback", "getAgreementTitle", "Lkotlin/Pair;", "b", "Lkotlin/Lazy;", "isFallbackResValid", "()Z", "Ljava/lang/String;", "JSON_KEY_TARGET", "c", "JSON_KEY_LANGUAGE", GoogleApiAvailabilityLight.a, "JSON_KEY_TITLE", "e", "JSON_KEY_SORT", "f", "ASSET_DIR_PATH", "", "g", "Ljava/util/Map;", "useLocalFlag", "h", "()Lorg/json/JSONArray;", "agreementUserJsonArray", "i", "agreementPrivacyJsonArray", "agreementExperienceJsonArray", "()Ljava/util/List;", "userLanguageList", "l", "privacyLanguageList", "m", "experienceLanguageList", GoogleApiAvailabilityLight.b, "()Lcom/huami/account/AgreementFallbackNavigator;", "defaultNavigator", "getPath", "(Lcom/huami/account/bean/LegalInfoType;)Ljava/lang/String;", "path", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class UserLegalInfoFallbackKt {

    @NotNull
    private static final String b = "target";

    @NotNull
    private static final String c = "language";

    @NotNull
    private static final String d = "title";

    @NotNull
    private static final String e = "sort";

    @NotNull
    private static final String f = "agreement";

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(f.a);

    @NotNull
    private static final Map<LegalInfoType, Boolean> g = new LinkedHashMap();

    @NotNull
    private static final Lazy h = LazyKt__LazyJVMKt.lazy(c.a);

    @NotNull
    private static final Lazy i = LazyKt__LazyJVMKt.lazy(b.a);

    @NotNull
    private static final Lazy j = LazyKt__LazyJVMKt.lazy(a.a);

    @NotNull
    private static final Lazy k = LazyKt__LazyJVMKt.lazy(h.a);

    @NotNull
    private static final Lazy l = LazyKt__LazyJVMKt.lazy(g.a);

    @NotNull
    private static final Lazy m = LazyKt__LazyJVMKt.lazy(e.a);

    @NotNull
    private static final Lazy n = LazyKt__LazyJVMKt.lazy(d.a);

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegalInfoType.values().length];
            iArr[LegalInfoType.AGREEMENT.ordinal()] = 1;
            iArr[LegalInfoType.PRIVACY.ordinal()] = 2;
            iArr[LegalInfoType.EXPERIENCE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONArray;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<JSONArray> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONArray invoke() {
            return UserLegalInfoFallbackKt.j(LegalInfoType.AGREEMENT);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONArray;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<JSONArray> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONArray invoke() {
            return UserLegalInfoFallbackKt.j(LegalInfoType.PRIVACY);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONArray;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<JSONArray> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONArray invoke() {
            return UserLegalInfoFallbackKt.j(LegalInfoType.AGREEMENT);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/account/AgreementFallbackNavigator;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<AgreementFallbackNavigator> {
        public static final d a = new d();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n"}, d2 = {"Lcom/huami/account/bean/LegalInfoType;", "<anonymous parameter 0>", "", "url", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function3<LegalInfoType, String, String, Unit> {
            public static final a a = new a();

            public a() {
                super(3);
            }

            public final void a(@NotNull LegalInfoType legalInfoType, @NotNull String str, @NotNull String str2) {
                WebHelper.launch(str);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LegalInfoType legalInfoType, String str, String str2) {
                a(legalInfoType, str, str2);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n"}, d2 = {"Lcom/huami/account/bean/LegalInfoType;", "<anonymous parameter 0>", "", "url", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function3<LegalInfoType, String, String, Unit> {
            public static final b a = new b();

            public b() {
                super(3);
            }

            public final void a(@NotNull LegalInfoType legalInfoType, @NotNull String str, @NotNull String str2) {
                WebHelper.launch(str);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LegalInfoType legalInfoType, String str, String str2) {
                a(legalInfoType, str, str2);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/account/bean/LegalInfoType;", "type", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<LegalInfoType, Unit> {
            public static final c a = new c();

            public c() {
                super(1);
            }

            public final void a(@NotNull LegalInfoType legalInfoType) {
                AgreementAreasActivity.INSTANCE.start(UserLegalInfoFallbackKt.k(), legalInfoType);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LegalInfoType legalInfoType) {
                a(legalInfoType);
                return Unit.INSTANCE;
            }
        }

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AgreementFallbackNavigator invoke() {
            return new AgreementFallbackNavigator(a.a, b.a, c.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n"}, d2 = {"", "Lkotlin/Pair;", "", "Lcom/huami/account/LocalAgreement;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<List<? extends Pair<? extends String, ? extends LocalAgreement>>> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends Pair<? extends String, ? extends LocalAgreement>> invoke() {
            return UserLegalInfoFallbackKt.b(LegalInfoType.EXPERIENCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Boolean> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return UserLegalInfoFallbackKt.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n"}, d2 = {"", "Lkotlin/Pair;", "", "Lcom/huami/account/LocalAgreement;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<List<? extends Pair<? extends String, ? extends LocalAgreement>>> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends Pair<? extends String, ? extends LocalAgreement>> invoke() {
            return UserLegalInfoFallbackKt.b(LegalInfoType.PRIVACY);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n"}, d2 = {"", "Lkotlin/Pair;", "", "Lcom/huami/account/LocalAgreement;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<List<? extends Pair<? extends String, ? extends LocalAgreement>>> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends Pair<? extends String, ? extends LocalAgreement>> invoke() {
            return UserLegalInfoFallbackKt.b(LegalInfoType.AGREEMENT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf((e().length() == 0 || d().length() == 0 || c().length() == 0) ? false : true));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Pair<String, LocalAgreement>> b(LegalInfoType legalInfoType) {
        JSONArray jSONArrayJ = j(legalInfoType);
        IntRange intRangeUntil = kotlin.ranges.e.until(0, jSONArrayJ.length());
        ArrayList<JSONObject> arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            arrayList.add(jSONArrayJ.getJSONObject(((IntIterator) it2).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (JSONObject jSONObject : arrayList) {
            arrayList2.add(TuplesKt.to(jSONObject.optString("language"), new LocalAgreement(jSONObject.optString("title"), jSONObject.optString("target"))));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList2);
    }

    private static final JSONArray c() {
        return (JSONArray) j.getValue();
    }

    private static final JSONArray d() {
        return (JSONArray) i.getValue();
    }

    private static final JSONArray e() {
        return (JSONArray) h.getValue();
    }

    private static final AgreementFallbackNavigator f() {
        return (AgreementFallbackNavigator) n.getValue();
    }

    private static final List<Pair<String, LocalAgreement>> g() {
        return (List) m.getValue();
    }

    @NotNull
    public static final JSONObject getAgreementLocalVersion(@NotNull LegalInfoType legalInfoType) throws JSONException {
        JSONArray jSONArrayE;
        int i2 = WhenMappings.$EnumSwitchMapping$0[legalInfoType.ordinal()];
        if (i2 == 1) {
            jSONArrayE = e();
        } else if (i2 == 2) {
            jSONArrayE = d();
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            jSONArrayE = c();
        }
        IntRange intRangeUntil = kotlin.ranges.e.until(0, jSONArrayE.length());
        ArrayList<JSONObject> arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            arrayList.add(jSONArrayE.getJSONObject(((IntIterator) it2).nextInt()));
        }
        for (JSONObject jSONObject : arrayList) {
            jSONObject.remove("target");
            jSONObject.remove("title");
            jSONObject.remove("sort");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("items", jSONArrayE);
        return jSONObject2;
    }

    @NotNull
    public static final String getAgreementTitle(@NotNull Context context, @NotNull LegalInfoType legalInfoType) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[legalInfoType.ordinal()];
        if (i2 == 1) {
            return context.getString(R.string.account_ui_user_agreement);
        }
        if (i2 == 2) {
            return context.getString(R.string.account_ui_user_privacy);
        }
        if (i2 == 3) {
            return context.getString(R.string.account_ui_user_plan);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final List<LocalAgreement> getLocalAgreementList(@NotNull LegalInfoType legalInfoType) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[legalInfoType.ordinal()];
        if (i2 == 1) {
            List<Pair<String, LocalAgreement>> listI = i();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listI, 10));
            Iterator<T> it2 = listI.iterator();
            while (it2.hasNext()) {
                arrayList.add((LocalAgreement) ((Pair) it2.next()).getSecond());
            }
            return CollectionsKt___CollectionsKt.toList(arrayList);
        }
        if (i2 == 2) {
            List<Pair<String, LocalAgreement>> listH = h();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listH, 10));
            Iterator<T> it3 = listH.iterator();
            while (it3.hasNext()) {
                arrayList2.add((LocalAgreement) ((Pair) it3.next()).getSecond());
            }
            return CollectionsKt___CollectionsKt.toList(arrayList2);
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        List<Pair<String, LocalAgreement>> listG = g();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listG, 10));
        Iterator<T> it4 = listG.iterator();
        while (it4.hasNext()) {
            arrayList3.add((LocalAgreement) ((Pair) it4.next()).getSecond());
        }
        return CollectionsKt___CollectionsKt.toList(arrayList3);
    }

    @Nullable
    public static final String getLocalAgreementTarget(@NotNull LegalInfoType legalInfoType, @Nullable String str) {
        if (str == null) {
            return null;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[legalInfoType.ordinal()];
        if (i2 == 1) {
            LocalAgreement localAgreement = (LocalAgreement) r.toMap(i()).get(str);
            if (localAgreement == null) {
                return null;
            }
            return localAgreement.getTarget();
        }
        if (i2 == 2) {
            LocalAgreement localAgreement2 = (LocalAgreement) r.toMap(h()).get(str);
            if (localAgreement2 == null) {
                return null;
            }
            return localAgreement2.getTarget();
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        LocalAgreement localAgreement3 = (LocalAgreement) r.toMap(g()).get(str);
        if (localAgreement3 == null) {
            return null;
        }
        return localAgreement3.getTarget();
    }

    @NotNull
    public static final String getPath(@NotNull LegalInfoType legalInfoType) {
        return "agreement/" + legalInfoType.getTypeName() + HMServerDef.RESPONSE_FORMAT;
    }

    @JvmOverloads
    public static final void goAgreementPageWithFallback(@NotNull Context context, @NotNull LegalInfoType legalInfoType, @Nullable String str) {
        goAgreementPageWithFallback$default(context, legalInfoType, str, null, 8, null);
    }

    @JvmOverloads
    public static final void goAgreementPageWithFallback(@NotNull Context context, @NotNull LegalInfoType legalInfoType, @Nullable String str, @NotNull AgreementFallbackNavigator agreementFallbackNavigator) {
        String agreementTitle = getAgreementTitle(context, legalInfoType);
        if (!isUseLocal(legalInfoType) || !isFallbackResValid()) {
            agreementFallbackNavigator.goUrl(legalInfoType, UserLegalInfoManager.getAgreementUrl(legalInfoType, str), agreementTitle);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Area areaBySave = SelectAreaHelper.getAreaBySave();
            str = areaBySave == null ? null : areaBySave.getValue();
        }
        String localAgreementTarget = getLocalAgreementTarget(legalInfoType, str);
        if (localAgreementTarget != null) {
            agreementFallbackNavigator.goInnerUrl(legalInfoType, localAgreementTarget, agreementTitle);
        } else {
            agreementFallbackNavigator.goLocalLanguageList(legalInfoType);
        }
    }

    public static /* synthetic */ void goAgreementPageWithFallback$default(Context context, LegalInfoType legalInfoType, String str, AgreementFallbackNavigator agreementFallbackNavigator, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            agreementFallbackNavigator = f();
        }
        goAgreementPageWithFallback(context, legalInfoType, str, agreementFallbackNavigator);
    }

    private static final List<Pair<String, LocalAgreement>> h() {
        return (List) l.getValue();
    }

    private static final List<Pair<String, LocalAgreement>> i() {
        return (List) k.getValue();
    }

    public static final boolean isFallbackResValid() {
        return ((Boolean) a.getValue()).booleanValue();
    }

    public static final boolean isUseLocal(@NotNull LegalInfoType legalInfoType) {
        Boolean bool;
        if (isFallbackResValid() && (bool = g.get(legalInfoType)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONArray j(LegalInfoType legalInfoType) {
        return new JSONArray(TextStreamsKt.readText(new InputStreamReader(k().getAssets().open(getPath(legalInfoType)), Charsets.UTF_8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.account.UserLegalInfoFallbackKt$requireContext$1] */
    public static final Context k() {
        return new KoinComponentAdapter() { // from class: com.huami.account.UserLegalInfoFallbackKt$requireContext$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final Lazy context;

            /* JADX WARN: Multi-variable type inference failed */
            {
                LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
                final Qualifier qualifier = null;
                final Object[] objArr = 0 == true ? 1 : 0;
                this.context = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<Context>() { // from class: com.huami.account.UserLegalInfoFallbackKt$requireContext$1$special$$inlined$inject$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Context invoke() {
                        KoinComponent koinComponent = this;
                        return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Context.class), qualifier, objArr);
                    }
                });
            }

            @NotNull
            public final Context getContext() {
                return (Context) this.context.getValue();
            }

            @Override // org.koin.core.component.KoinComponent
            @NotNull
            public Koin getKoin() {
                return KoinComponentAdapter.DefaultImpls.getKoin(this);
            }
        }.getContext();
    }

    public static final void setUseLocal(@NotNull LegalInfoType legalInfoType, boolean z) {
        if (isFallbackResValid()) {
            g.put(legalInfoType, Boolean.valueOf(z));
        }
    }
}
