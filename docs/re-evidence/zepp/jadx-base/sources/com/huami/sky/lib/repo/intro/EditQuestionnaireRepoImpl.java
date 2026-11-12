package com.huami.sky.lib.repo.intro;

import com.huami.sky.lib.api.preference.MusicPreferenceApi;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.MusicPreference;
import com.huami.sky.lib.entity.MusicPreferenceItem;
import com.huami.sky.lib.properties.SkyPropertiesKey;
import com.huami.sky.lib.properties.SkyQuestionProperties;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyManager;
import com.huami.userproperty.api.UserPropertyApi;
import com.huami.userproperty.service.entity.remote.PushResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\u000e2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tH\u0016R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/sky/lib/repo/intro/EditQuestionnaireRepoImpl;", "Lcom/huami/sky/lib/repo/intro/IQuestionnaireRepo;", "", "a", "b", "c", "Lcom/huami/sky/lib/entity/MusicPreference;", "getMusicPreferenceInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "", "Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "answers", "", "saveAndPostQuestionsToServer", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSelectedChanged", "Lcom/huami/sky/lib/api/preference/MusicPreferenceApi;", "Lcom/huami/sky/lib/api/preference/MusicPreferenceApi;", "api", "Lcom/huami/sky/lib/repo/intro/SelectedMusicPrefsRepo;", "Lcom/huami/sky/lib/repo/intro/SelectedMusicPrefsRepo;", "selectedMusicPrefsRepo", "", "", "Ljava/util/Set;", "firstEnterSelectedSet", "<init>", "(Lcom/huami/sky/lib/api/preference/MusicPreferenceApi;Lcom/huami/sky/lib/repo/intro/SelectedMusicPrefsRepo;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class EditQuestionnaireRepoImpl implements IQuestionnaireRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MusicPreferenceApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SelectedMusicPrefsRepo selectedMusicPrefsRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private Set<Integer> firstEnterSelectedSet = new LinkedHashSet();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.lib.repo.intro.EditQuestionnaireRepoImpl", f = "EditQuestionnaireRepoImpl.kt", i = {}, l = {53}, m = "getMusicPreferenceInfo", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return EditQuestionnaireRepoImpl.this.getMusicPreferenceInfo(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int[] a;
        public final /* synthetic */ int[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int[] iArr, int[] iArr2) {
            super(0);
            this.a = iArr;
            this.b = iArr2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            int[] iArr = this.a;
            return "selectedMusicArr: " + (iArr == null ? null : ArraysKt___ArraysKt.joinToString$default(iArr, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)) + " historyMusicPreferenceArr: " + ArraysKt___ArraysKt.joinToString$default(this.b, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.lib.repo.intro.EditQuestionnaireRepoImpl", f = "EditQuestionnaireRepoImpl.kt", i = {0}, l = {68}, m = "saveAndPostQuestionsToServer", n = {"res"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return EditQuestionnaireRepoImpl.this.saveAndPostQuestionsToServer(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ PushResult a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PushResult pushResult) {
            super(0);
            this.a = pushResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "skyMusicPreference push result: " + this.a;
        }
    }

    public EditQuestionnaireRepoImpl(@NotNull MusicPreferenceApi musicPreferenceApi, @NotNull SelectedMusicPrefsRepo selectedMusicPrefsRepo) {
        this.api = musicPreferenceApi;
        this.selectedMusicPrefsRepo = selectedMusicPrefsRepo;
    }

    private final int[] a() {
        int[] iArrB = b();
        return iArrB == null ? c() : iArrB;
    }

    private final int[] b() {
        String str = SkyQuestionProperties.INSTANCE.getSkyMusicPreference().get();
        if (str == null) {
            return null;
        }
        return IQuestionnaireRepoKt.parseMusicStrToArr(str);
    }

    private final int[] c() {
        String selectMusicPreferenceInfo = this.api.getSelectMusicPreferenceInfo();
        if (selectMusicPreferenceInfo == null) {
            return null;
        }
        return IQuestionnaireRepoKt.parseMusicStrToArr(selectMusicPreferenceInfo);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.sky.lib.repo.intro.IQuestionnaireRepo
    @Nullable
    public Object getMusicPreferenceInfo(@NotNull Continuation<? super MusicPreference> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MusicPreference musicPreference = (MusicPreference) aVar.a;
            ResultKt.throwOnFailure(obj);
            return musicPreference;
        }
        ResultKt.throwOnFailure(obj);
        MusicPreference musicPreferences = this.api.getMusicPreferenceInfo(WebConstant.QueryParam.TYPE_MUSIC_DETAIL).getMusicPreferences();
        int[] iArrA = a();
        if (iArrA != null) {
            for (MusicPreferenceItem musicPreferenceItem : musicPreferences.getItems()) {
                if (ArraysKt___ArraysKt.contains(iArrA, musicPreferenceItem.getId())) {
                    musicPreferenceItem.setSelected(true);
                    this.firstEnterSelectedSet.add(Boxing.boxInt(musicPreferenceItem.getId()));
                }
            }
        }
        List<MusicPreferenceItem> items = musicPreferences.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : items) {
            if (Boxing.boxBoolean(((MusicPreferenceItem) obj2).isSelected()).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        SelectedMusicPrefsRepo selectedMusicPrefsRepo = this.selectedMusicPrefsRepo;
        aVar.a = musicPreferences;
        aVar.d = 1;
        return selectedMusicPrefsRepo.saveSelectedMusicPrefs(arrayList, aVar) == coroutine_suspended ? coroutine_suspended : musicPreferences;
    }

    @Override // com.huami.sky.lib.repo.intro.IQuestionnaireRepo
    public boolean isSelectedChanged(@NotNull Map<String, ? extends List<MusicPreferenceItem>> answers) {
        List<MusicPreferenceItem> list = answers.get(WebConstant.QueryParam.TYPE_MUSIC);
        int[] iArrSortedArray = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((MusicPreferenceItem) it2.next()).getId()));
            }
            int[] intArray = CollectionsKt___CollectionsKt.toIntArray(arrayList);
            if (intArray != null) {
                iArrSortedArray = ArraysKt___ArraysKt.sortedArray(intArray);
            }
        }
        int[] iArrSortedArray2 = ArraysKt___ArraysKt.sortedArray(CollectionsKt___CollectionsKt.toIntArray(this.firstEnterSelectedSet));
        HMLog.info("EditRepo", new b(iArrSortedArray, iArrSortedArray2));
        return !Arrays.equals(iArrSortedArray, iArrSortedArray2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.sky.lib.repo.intro.IQuestionnaireRepo
    @Nullable
    public Object saveAndPostQuestionsToServer(@NotNull Map<String, ? extends List<MusicPreferenceItem>> map, @NotNull Continuation<? super Boolean> continuation) throws JSONException {
        c cVar;
        PushResult pushResultPush;
        PushResult pushResult;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.d = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            String strAnswerMapToJsonString = IQuestionnaireRepoKt.answerMapToJsonString(map);
            pushResultPush = UserPropertyApi.INSTANCE.push(SkyPropertiesKey.MUSIC_PREFERENCE_QUESTIONNAIRE, strAnswerMapToJsonString, UserPropertyManager.INSTANCE.getDefaultApi().invoke());
            HMLog.info("EditRepo", new d(pushResultPush));
            if (pushResultPush instanceof PushResult.Success) {
                SkyQuestionProperties.INSTANCE.getSkyMusicPreference().set(strAnswerMapToJsonString);
                List<MusicPreferenceItem> list = map.get(WebConstant.QueryParam.TYPE_MUSIC);
                if (list != null) {
                    SelectedMusicPrefsRepo selectedMusicPrefsRepo = this.selectedMusicPrefsRepo;
                    cVar.a = pushResultPush;
                    cVar.d = 1;
                    if (selectedMusicPrefsRepo.saveSelectedMusicPrefs(list, cVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pushResult = pushResultPush;
                }
            }
            return Boxing.boxBoolean(pushResultPush instanceof PushResult.Success);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pushResult = (PushResult) cVar.a;
        ResultKt.throwOnFailure(obj);
        pushResultPush = pushResult;
        return Boxing.boxBoolean(pushResultPush instanceof PushResult.Success);
    }
}
