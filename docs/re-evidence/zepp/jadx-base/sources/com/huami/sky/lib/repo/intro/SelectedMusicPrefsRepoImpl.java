package com.huami.sky.lib.repo.intro;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.sky.lib.api.preference.MusicPreferenceApi;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.MusicPreferenceItem;
import com.huami.sky.lib.properties.SkyQuestionProperties;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J!\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R$\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R*\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/sky/lib/repo/intro/SelectedMusicPrefsRepoImpl;", "Lcom/huami/sky/lib/repo/intro/SelectedMusicPrefsRepo;", "", "Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "selectedItems", "", "b", "a", "saveSelectedMusicPrefs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "getSelectedMusicPrefs", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sky/lib/api/preference/MusicPreferenceApi;", "Lcom/huami/sky/lib/api/preference/MusicPreferenceApi;", "api", "Lcom/huami/account/service/AccountService;", "Lcom/huami/account/service/AccountService;", "userApi", "Lkotlinx/coroutines/flow/MutableStateFlow;", "c", "Lkotlinx/coroutines/flow/MutableStateFlow;", "musicPreferenceFlow", "", "", GoogleApiAvailabilityLight.a, "Ljava/util/Map;", "selectedMusicPreferenceMap", "<init>", "(Lcom/huami/sky/lib/api/preference/MusicPreferenceApi;Lcom/huami/account/service/AccountService;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class SelectedMusicPrefsRepoImpl implements SelectedMusicPrefsRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MusicPreferenceApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AccountService userApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private MutableStateFlow<List<MusicPreferenceItem>> musicPreferenceFlow = StateFlowKt.MutableStateFlow(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private Map<String, List<MusicPreferenceItem>> selectedMusicPreferenceMap = new LinkedHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<MusicPreferenceItem> a;

        /* JADX INFO: renamed from: com.huami.sky.lib.repo.intro.SelectedMusicPrefsRepoImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0554a extends Lambda implements Function1<MusicPreferenceItem, CharSequence> {
            public static final C0554a a = new C0554a();

            public C0554a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@NotNull MusicPreferenceItem musicPreferenceItem) {
                return musicPreferenceItem.getName();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<MusicPreferenceItem> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            List<MusicPreferenceItem> list = this.a;
            return "getSelectedMusicPrefs: " + (list == null ? null : CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, C0554a.a, 30, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getSelectedMusicPrefs error: " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<MusicPreferenceItem> a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<MusicPreferenceItem, CharSequence> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@NotNull MusicPreferenceItem musicPreferenceItem) {
                return musicPreferenceItem.getName();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<MusicPreferenceItem> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "saveSelectedMusicPrefs: " + CollectionsKt___CollectionsKt.joinToString$default(this.a, ",", null, null, 0, null, a.a, 30, null);
        }
    }

    public SelectedMusicPrefsRepoImpl(@NotNull MusicPreferenceApi musicPreferenceApi, @NotNull AccountService accountService) {
        this.api = musicPreferenceApi;
        this.userApi = accountService;
    }

    private final List<MusicPreferenceItem> a() {
        String strUserId = AccountServiceExtKt.userId(this.userApi);
        if (strUserId == null) {
            return null;
        }
        return this.selectedMusicPreferenceMap.get(strUserId);
    }

    private final void b(List<MusicPreferenceItem> selectedItems) {
        String strUserId = AccountServiceExtKt.userId(this.userApi);
        if (strUserId == null) {
            return;
        }
        this.selectedMusicPreferenceMap.put(strUserId, selectedItems);
    }

    @Override // com.huami.sky.lib.repo.intro.SelectedMusicPrefsRepo
    @Nullable
    public Object getSelectedMusicPrefs(@NotNull Continuation<? super Flow<? extends List<MusicPreferenceItem>>> continuation) {
        Object objM3845constructorimpl;
        Unit unit;
        List<MusicPreferenceItem> listA = a();
        HMLog.info("SelectedMusicPrefsRepoImpl", new a(listA));
        try {
            Result.Companion companion = Result.Companion;
            if (listA == null || listA.isEmpty()) {
                String selectMusicPreferenceInfo = SkyQuestionProperties.INSTANCE.getSkyMusicPreference().get();
                if (selectMusicPreferenceInfo == null) {
                    selectMusicPreferenceInfo = this.api.getSelectMusicPreferenceInfo();
                }
                if (selectMusicPreferenceInfo == null) {
                    unit = null;
                } else {
                    int[] musicStrToArr = IQuestionnaireRepoKt.parseMusicStrToArr(selectMusicPreferenceInfo);
                    List<MusicPreferenceItem> items = this.api.getMusicPreferenceInfo(WebConstant.QueryParam.TYPE_MUSIC_DETAIL).getMusicPreferences().getItems();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : items) {
                        if (Boxing.boxBoolean(musicStrToArr != null && ArraysKt___ArraysKt.contains(musicStrToArr, ((MusicPreferenceItem) obj).getId())).booleanValue()) {
                            arrayList.add(obj);
                        }
                    }
                    b(arrayList);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    b(CollectionsKt__CollectionsKt.emptyList());
                }
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info("SelectedMusicPrefsRepoImpl", new b(thM3848exceptionOrNullimpl));
        }
        MutableStateFlow<List<MusicPreferenceItem>> mutableStateFlow = this.musicPreferenceFlow;
        mutableStateFlow.setValue(a());
        return mutableStateFlow;
    }

    @Override // com.huami.sky.lib.repo.intro.SelectedMusicPrefsRepo
    @Nullable
    public Object saveSelectedMusicPrefs(@NotNull List<MusicPreferenceItem> list, @NotNull Continuation<? super Unit> continuation) {
        HMLog.info("SelectedMusicPrefsRepoImpl", new c(list));
        b(list);
        this.musicPreferenceFlow.setValue(list);
        return Unit.INSTANCE;
    }
}
